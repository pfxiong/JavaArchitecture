package cn.com.weizhen.factory.factorymethod;

import cn.com.weizhen.factory.ICourse;

/*
1.遵循了单一职责原则，各个产品有相应的产品工厂
2.符合开闭原则
 */
public class FactoryMethodTest {

    public static void main(String[] args) {
        ICourseFactory courseFactory = new EnglishCourseFactory();
        ICourse course = courseFactory.create();
        course.teach();
    }

}
