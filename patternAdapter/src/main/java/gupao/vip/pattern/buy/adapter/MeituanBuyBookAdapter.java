package gupao.vip.pattern.buy.adapter;

import gupao.vip.pattern.ResultMsg;

public class MeituanBuyBookAdapter implements BuyBookAdapter{
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof BuyBookAdapter;
    }

    @Override
    public ResultMsg buyBooks(String bookId, Object adapter) {
        System.out.println("美团购买");
        return null;
    }
}
