package CglibProxy;

public class TestBookFacadeCglibProxy {
    public static void main(String[] args) {
        TargetInterceptor interceptor = new TargetInterceptor();
        BookFacade bookFacadeProxy = (BookFacade)interceptor.getInstance(new BookFacade());
        bookFacadeProxy.addBook();
    }
}
