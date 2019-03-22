package gupao.vip.pattern.buy;

public class EShopTest {
    public static void main(String[] args) {
        IEShop eshop = new EShopAdapter();

        //省略获取userId和bookId的步骤，直接赋值
        String bookId = "e035";
        String userId = "asd18fas7966zc8";
        eshop.JDBuy(bookId,userId);
    }
}
