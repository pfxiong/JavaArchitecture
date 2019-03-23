package cn.com.weizhen.factory.simplefactory;

import cn.com.weizhen.factory.ChineseCourse;
import cn.com.weizhen.factory.EnglishCourse;
import cn.com.weizhen.factory.ICourse;

/*
1.直接new出对象
2.利用Class.forName 反射创建对象
*/
public class CourseFactory {

    public ICourse create1(String name){
        if("ChineseCourse".equals(name)){
            return new ChineseCourse();
        }else if("EnglishCourse".equals(name)){
            return new EnglishCourse();  //new出对象
        }else {
            return null;
        }
    }

    public ICourse create2(String className){
        try {
            if (null != className && !"".equals(className)) {
                return (ICourse) Class.forName(className).newInstance(); //利用反射得到对象
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public ICourse create3(Class<? extends ICourse> clazz){
        try {
            if (null != clazz) {
                return clazz.newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

}
