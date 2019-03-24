package cn.com.weizhen.factory.abstractfactory;

public class EnglishNote implements INote{
    @Override
    public void createNote() {
        System.out.println("创建英文笔记");
    }
}
