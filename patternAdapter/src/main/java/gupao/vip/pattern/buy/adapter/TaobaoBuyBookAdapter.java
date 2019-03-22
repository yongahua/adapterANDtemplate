package gupao.vip.pattern.buy.adapter;

import gupao.vip.pattern.ResultMsg;

public class TaobaoBuyBookAdapter implements BuyBookAdapter{
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof TaobaoBuyBookAdapter;
    }

    @Override
    public ResultMsg buyBooks(String bookId, Object adapter) {
        System.out.println("淘宝购买");
        return null;
    }
}
