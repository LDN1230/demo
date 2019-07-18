package StaticProxy;
/*
委托类
接口Count的实现类
 */
public class CountImpl implements Count {
    @Override
    public void queryCount() {
        System.out.println("查看账户方法...");
    }

    @Override
    public void updateCount() {
        System.out.println("修改账户方法...");
    }
}
