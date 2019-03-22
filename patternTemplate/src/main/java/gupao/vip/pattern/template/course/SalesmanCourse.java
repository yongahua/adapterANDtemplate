package gupao.vip.pattern.template.course;

/**
 * 销售
 */
public class SalesmanCourse extends GoToWorkCourse {
    @Override
    protected boolean needMeeting() {
        return false;
    }

    @Override
    protected void meeting() {
        System.out.println("喝酒、应酬");
    }

    @Override
    protected void work() {
        System.out.println("不停的跑业务");
    }

    @Override
    protected boolean needComeUp() {
        return true;
    }

    @Override
    protected void comeUp() {
        System.out.println("18楼");
    }

    @Override
    protected String vehicle() {
        return "BYD";
    }

    @Override
    protected boolean needToilet() {
        return true;
    }
}
