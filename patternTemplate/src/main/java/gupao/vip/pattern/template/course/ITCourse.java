package gupao.vip.pattern.template.course;

public class ITCourse extends GoToWorkCourse{
    @Override
    protected boolean needMeeting() {
        return true;
    }

    @Override
    protected void work() {
        System.out.println("不停的敲代码");
    }

    @Override
    protected boolean needComeUp() {
        return true;
    }

    @Override
    protected void comeUp() {
        System.out.println("13楼");
    }

    @Override
    protected String vehicle() {
        return "11路公交";
    }
}
