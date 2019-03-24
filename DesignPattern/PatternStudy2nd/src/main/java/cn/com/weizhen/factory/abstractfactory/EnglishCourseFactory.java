package cn.com.weizhen.factory.abstractfactory;

import cn.com.weizhen.factory.EnglishCourse;
import cn.com.weizhen.factory.ICourse;

public class EnglishCourseFactory implements ICourseFactory {

    @Override
    public ICourse createCourse() {
        return new EnglishCourse();
    }

    @Override
    public IVideo createVideo() {
        return new EnglishVideo();
    }

    @Override
    public INote createNote() {
        return new EnglishNote();
    }
}
