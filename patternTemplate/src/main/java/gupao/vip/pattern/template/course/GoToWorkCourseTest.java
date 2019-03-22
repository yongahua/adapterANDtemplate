package gupao.vip.pattern.template.course;

public class GoToWorkCourseTest {
    public static void main(String[] args) {
        System.out.println("------程序猿上班-------");
        GoToWorkCourse ITCourse = new ITCourse();
        ITCourse.createCourse();

        System.out.println("------销售上班-------");
        GoToWorkCourse salesmanCourse = new SalesmanCourse();
        salesmanCourse.createCourse();
    }
}
