//package hometask.hometask4;
//
//import java.util.HashMap;
//
//import java.lang.reflect.Constructor;
//import java.lang.reflect.InvocationTargetException;
//import java.util.*;
//
//public final class ApplicationContext {
////    public static final UserRepository USER_REPOSITORY = new UserRepositoryImpl();
////    public static final UserService USER_SERVICE = new UserServiceImpl(USER_REPOSITORY);
//
//    public final Map<String, Object> stringObjectMap = new HashMap<>();
//
//    public void run() throws IllegalAccessException, InvocationTargetException, InstantiationException {
//        //https://dzone.com/articles/get-all-classes-within-package
//        //scan packages
//        List<Class> classes = Arrays.asList(User.class, UserService.class,
//                UserServiceImpl.class, UserRepository.class, UserRepositoryImpl.class);
//
//        List<Class> components = new ArrayList<>();
//
//        for (int i = 0; i < classes.size(); i++) {
//            Class clazz = classes.get(i);
//            if (clazz.isAnnotationPresent(Component.class)) {
//                components.add(clazz);
//            }
//        }
//        //analise
//        stringObjectMap.put("userRepositoryImpl", new UserRepositoryImpl());
//
//        Class<UserServiceImpl> userServiceClass = UserServiceImpl.class;
//        Constructor<?>[] constructors = userServiceClass.getDeclaredConstructors();
//        // if @Inject
//        Constructor<?> constructor = constructors[0];
//
//        //UserServiceImpl(UserRepository userRepository)
//        Class<?>[] parameterTypes = constructor.getParameterTypes();
//        //foreach item in stringObjectMap -> item.getValue() instanceof parameterTypes[i]
//
//        // constructor.newInstance() from stringObjectMap
//        Object userRepositoryImpl = constructor.newInstance(stringObjectMap.get("userRepositoryImpl"));
//
//        stringObjectMap.put("userServiceImpl", userRepositoryImpl);
//
//    }
//
//
//}