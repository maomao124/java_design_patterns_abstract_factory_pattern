package mao.config;

import mao.Coffee;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Project name(项目名称)：java设计模式_抽象工厂模式
 * Package(包名): mao.config
 * Class(类名): CoffeeFactory
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/13
 * Time(创建时间)： 21:24
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class CoffeeFactory
{
    private static final Map<String, Coffee> map = new HashMap<>();

    static
    {
        Properties properties = new Properties();
        InputStream inputStream = CoffeeFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        try
        {
            properties.load(inputStream);
            Set<Object> keys = properties.keySet();
            for (Object key : keys)
            {
                String property = properties.getProperty((String) key);
                Class<?> clazz = Class.forName(property);
                Object o = clazz.newInstance();
                map.put((String) key, (Coffee) o);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static Coffee createCoffee(String name)
    {

        return map.get(name);
    }
}
