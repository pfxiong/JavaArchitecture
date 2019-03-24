package cn.com.weizhen.factory.factorymethod;

import cn.com.weizhen.factory.ChineseCourse;
import cn.com.weizhen.factory.ICourse;

public class ChineseCourseFactory implements ICourseFactory {

    @Override
    public ICourse create() {
        return new ChineseCourse();
    }

}
