package mao;

/**
 * Project name(项目名称)：java设计模式_抽象工厂模式
 * Package(包名): mao
 * Class(类名): Coffee
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/12
 * Time(创建时间)： 23:12
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Coffee
{
    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName()
    {
        return "咖啡";
    }

    /**
     * Add milk.
     */
    public void addMilk()
    {
        System.out.println("添加牛奶");
    }

    /**
     * Add sugar.
     */
    public void addSugar()
    {
        System.out.println("添加糖");
    }
}
