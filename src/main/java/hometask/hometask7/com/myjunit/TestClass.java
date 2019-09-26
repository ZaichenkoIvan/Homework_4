package hometask.hometask7.com.myjunit;

public class TestClass {
    @BeforeClass
    public static  void staticInit(){
        System.out.println("Static");
    }

    @Test
    public void shouldReturnResult1(){
        System.out.println("Result1");
    }

    @Test
    public void shouldReturnResult2(){
        System.out.println("Result2");
    }
}
