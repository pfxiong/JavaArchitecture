package cn.com.weizhen.factory.abstractfactory;

import cn.com.weizhen.factory.ICourse;

/*
扩展性强，但违背开闭原则
 */
public interface ICourseFactory {

    ICourse createCourse();

    IVideo createVideo();

    INote createNote();
}
