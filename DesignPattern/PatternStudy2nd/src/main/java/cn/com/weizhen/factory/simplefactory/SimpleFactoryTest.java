package cn.com.weizhen.factory.simplefactory;

import cn.com.weizhen.factory.EnglishCourse;
import cn.com.weizhen.factory.ICourse;

/**
 * 小作坊式的工厂模型
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        //s多行
//        CourseFactory factory1 = new CourseFactory();  //一般做成单例模式
//        ICourse course1 = factory1.create1("EnglishCourse");
//        course1.teach();
//
//        CourseFactory factory2 = new CourseFactory();
//        //利用类名字符串.反射获取对象
//        ICourse course2 = factory2.create2("cn.com.weizhen.factory.ChineseCourse");
//        course2.teach();

        CourseFactory factory = new CourseFactory();
        //利用Class<? extends ICourse>,
        ICourse course3 = factory.create(EnglishCourse.class);
        course3.teach();

    }
}
