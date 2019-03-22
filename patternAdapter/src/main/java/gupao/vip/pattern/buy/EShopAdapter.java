package gupao.vip.pattern.buy;

import gupao.vip.pattern.ResultMsg;
import gupao.vip.pattern.User;
import gupao.vip.pattern.buy.adapter.*;

public class EShopAdapter extends BuyBooksService implements IEShop{
    @Override
    public ResultMsg JDBuy(String bookId, String userId) {
        return buyBooks(bookId,userId, JDBuyBookAdapter.class);
    }

    @Override
    public ResultMsg TaobaoBuy(String bookId, String userId) {
        return buyBooks(bookId,userId, TaobaoBuyBookAdapter.class);
    }

    @Override
    public ResultMsg DangdangBuy(String bookId, String userId) {
        return buyBooks(bookId,userId, DangdangBuyBookAdapter.class);
    }

    @Override
    public ResultMsg MeituanBuy(String bookId, String userId) {
        return buyBooks(bookId,userId, MeituanBuyBookAdapter.class);
    }

    @Override
    public ResultMsg PinduoduoBuy(String bookId, String userId) {
        return buyBooks(bookId,userId,PinduoduoBuyBookAdapter.class);
    }

    @Override
    public ResultMsg SystemBuy(String bookId, String userId) {
        return super.buyBooks(bookId,userId);
    }

    private ResultMsg buyBooks(String bookId,String userId, Class<? extends BuyBookAdapter> clazz){
        try{
            BuyBookAdapter adapter = clazz.newInstance();
            //省略userId相关操作
            User user = new User();
            user.setId(userId);

            if(adapter.support(adapter)){
                return adapter.buyBooks(bookId,adapter);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
