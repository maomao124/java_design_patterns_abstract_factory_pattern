package mao;

/**
 * Project name(项目名称)：java设计模式_抽象工厂模式
 * Package(包名): mao
 * Class(类名): LatteCoffee
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/12
 * Time(创建时间)： 23:13
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class LatteCoffee extends Coffee
{
    @Override
    public String getName()
    {
        return "拿铁咖啡";
    }

    @Override
    public void addMilk()
    {
        System.out.println("拿铁咖啡添加牛奶");
    }

    @Override
    public void addSugar()
    {
        System.out.println("拿铁咖啡添加糖");
    }
}
