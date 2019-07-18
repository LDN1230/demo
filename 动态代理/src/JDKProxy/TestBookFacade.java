package JDKProxy;
/*
测试BookFacade
 */
public class TestBookFacade {
    public static void main(String[] args) {
        BookFacadeJDKProxy proxy = new BookFacadeJDKProxy();
        BookFacade bookFacadeProxy = (BookFacade) proxy.bind(new BookFacadeImpl());
        bookFacadeProxy.addBook();
    }
}
