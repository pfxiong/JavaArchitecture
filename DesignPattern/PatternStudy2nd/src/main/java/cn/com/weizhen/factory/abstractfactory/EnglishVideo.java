package cn.com.weizhen.factory.abstractfactory;

public class EnglishVideo implements IVideo{

    @Override
    public void createVideo() {
        System.out.println("创建英文视频");
    }
}
