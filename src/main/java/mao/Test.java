package mao;

/**
 * Project name(项目名称)：java设计模式_抽象工厂模式
 * Package(包名): mao
 * Class(类名): Test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/13
 * Time(创建时间)： 21:10
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test
{
    public static void main(String[] args)
    {
        DessertFactory dessertFactory = new AmericanDessertFactory();
        Dessert dessert = dessertFactory.createDessert();
        dessert.show();
        Coffee coffee = dessertFactory.createCoffee();
        System.out.println(coffee.getName());

        dessertFactory = new ItalyDessertFactory();
        Dessert dessert1 = dessertFactory.createDessert();
        dessert1.show();
        Coffee coffee1 = dessertFactory.createCoffee();
        System.out.println(coffee1.getName());
    }
}
