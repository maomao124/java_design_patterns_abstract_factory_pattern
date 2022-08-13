package mao;

/**
 * Project name(项目名称)：java设计模式_抽象工厂模式
 * Package(包名): mao
 * Class(类名): ItalyDessertFactory
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/13
 * Time(创建时间)： 21:09
 * Version(版本): 1.0
 * Description(描述)： 具体工厂,意大利风味甜点工厂
 */

public class ItalyDessertFactory implements DessertFactory
{

    @Override
    public Coffee createCoffee()
    {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert()
    {
        return new Tiramisu();
    }
}
