package gupao.vip.pattern.template.course;

import java.sql.Time;

public abstract class GoToWorkCourse {

    protected final void createCourse() {
        //起床
        this.getUp();
        //洗漱
        this.wash();
        //梳妆打扮
        if(this.needToilet()){
            this.Toilet();
        }
        //上班的路上（交通工具）
        System.out.println(this.vehicle());
        //上楼
        if(this.needComeUp()){
            this.comeUp();
        }
        //打卡
        this.punchCard();
        //工作
        this.work();
        //打卡下班；
        this.getOffWork();
        //下楼
        if(this.needComeUp()){
            this.comeUp();
        }
        //回家()
        if(this.needMeeting()){//回家
            System.out.println(this.vehicle());
            this.home();
        }else{//聚会
            System.out.println(this.vehicle());
            this.meeting();
            this.vehicle();
            System.out.println(this.vehicle());
            this.home();
        }

    }

    protected boolean needMeeting(){
        return false;
    };

    final void home(){
        System.out.println("到家了");
    };


    protected void meeting(){
        System.out.println("出去聚会");
    };

    protected void work(){
        System.out.println("开始工作");
    };

    final void punchCard(){
        System.out.println("打卡，开始上班");
    };

    protected  boolean needComeUp(){
        return false;
    };


    protected void comeUp(){
        System.out.println("开始爬楼");
    };

    protected String vehicle(){
        return null;
    }


    protected boolean needToilet(){
        return false;
    }

    final void Toilet(){
        System.out.println("梳妆打扮");
    }

    final void wash(){
        System.out.println("洗漱");
    }

    final void getUp() {
        System.out.println("起床");
    }

    final void getOffWork() {
        System.out.println("打卡下班");
    }
}
