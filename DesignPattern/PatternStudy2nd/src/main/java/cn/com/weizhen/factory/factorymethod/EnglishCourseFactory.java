package cn.com.weizhen.factory.factorymethod;

import cn.com.weizhen.factory.EnglishCourse;
import cn.com.weizhen.factory.ICourse;

public class EnglishCourseFactory implements ICourseFactory {

    @Override
    public ICourse create() {
        return new EnglishCourse();
    }

}
