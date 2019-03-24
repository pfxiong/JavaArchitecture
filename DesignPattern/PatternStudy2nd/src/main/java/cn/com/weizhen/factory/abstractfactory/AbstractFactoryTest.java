package cn.com.weizhen.factory.abstractfactory;

/**
 * 将一系列的产品族统一到一起创建
 */
public class AbstractFactoryTest  {

    public static void main(String[] args) {
        ICourseFactory factory = new EnglishCourseFactory();
        factory.createCourse();
        factory.createNote();
        factory.createVideo();
    }

}
