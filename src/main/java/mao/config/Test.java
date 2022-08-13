package mao.config;

import mao.Coffee;

/**
 * Project name(项目名称)：java设计模式_抽象工厂模式
 * Package(包名): mao.config
 * Class(类名): Test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/13
 * Time(创建时间)： 21:31
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test
{
    public static void main(String[] args)
    {
        Coffee american = CoffeeFactory.createCoffee("american");
        System.out.println(american.getName());
        System.out.println(american);
        Coffee latte = CoffeeFactory.createCoffee("latte");
        System.out.println(latte.getName());
        System.out.println(latte);
    }
}
