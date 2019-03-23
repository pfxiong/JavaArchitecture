package cn.com.weizhen.factory;

public class ChineseCourse implements ICourse {

    @Override
    public void teach() {
        System.out.println("讲授中文课");
    }
}
