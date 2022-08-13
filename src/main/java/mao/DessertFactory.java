package mao;

/**
 * Project name(项目名称)：java设计模式_抽象工厂模式
 * Package(包名): mao
 * Interface(接口名): DessertFactory
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/13
 * Time(创建时间)： 21:08
 * Version(版本): 1.0
 * Description(描述)： 抽象工厂
 */

public interface DessertFactory
{
    Coffee createCoffee();

    Dessert createDessert();
}
