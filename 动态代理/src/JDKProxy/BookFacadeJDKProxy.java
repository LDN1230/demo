package JDKProxy;

import javafx.beans.binding.ObjectExpression;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
JDK代理类
 */
public class BookFacadeJDKProxy implements InvocationHandler {

    private Object target;

    //绑定委托对象并返回一个代理类
    Object bind(Object target){
        this.target = target;//委托对象
        //返回代理类，需要委托类的类，接口作为参数，用到反射机制
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result=null;
        System.out.println("事物开始");
        //执行方法
        result=method.invoke(target, args);
        System.out.println("事物结束");
        return result;
    }
}
