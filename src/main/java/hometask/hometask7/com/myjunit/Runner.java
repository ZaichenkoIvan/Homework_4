package hometask.hometask7.com.myjunit;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public final class Runner {
    private Runner() {
    }

    public static void run() throws InvocationTargetException,
            IllegalAccessException {
        TestClass testClass = new TestClass();
        Class<?> clazz = testClass.getClass();
        Method[] methods = clazz.getMethods();
        int counter = 0;

        List<Method> beforeClassMethods = getMethodByAnnotation(methods, BeforeClass.class);
        List<Method> afterClassMethods = getMethodByAnnotation(methods, AfterClass.class);
        List<Method> testMethods = getMethodByAnnotation(methods, Test.class);

        invokeMethods(beforeClassMethods, null);
        invokeMethods(testMethods,testClass);
        invokeMethods(afterClassMethods, null);
//
//        for (Method method : methods) {
//            if (method.isAnnotationPresent(Test.class)) {
//                method.invoke(testClass);
//                counter++;
//            }
//        }
//        System.out.println(counter);
    }

    private static void invokeMethods(List<Method> beforeClassMethods, Object object) throws InvocationTargetException, IllegalAccessException {
        for (Method method : beforeClassMethods) {
            method.invoke(object);
        }
    }


    private static List<Method> getMethodByAnnotation(Method[] methods, Class<? extends Annotation> clazz) {
        List<Method> resultMethods = new ArrayList<>();
        for (Method method : methods) {
            if (method.isAnnotationPresent(clazz)) {
                resultMethods.add(method);
            }
        }
        return resultMethods;
    }

}

class Main {
    public static void main(String[] args) throws Exception {
        Runner.run();
    }
}
