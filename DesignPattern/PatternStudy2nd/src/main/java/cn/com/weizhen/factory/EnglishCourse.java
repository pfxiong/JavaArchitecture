package cn.com.weizhen.factory;

public class EnglishCourse implements ICourse {
    @Override
    public void teach() {
        System.out.println("讲授英文课");
    }
}
