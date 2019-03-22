package gupao.vip.pattern.buy.adapter;

import gupao.vip.pattern.ResultMsg;

public class DangdangBuyBookAdapter implements BuyBookAdapter{

    @Override
    public boolean support(Object adapter) {
        return adapter instanceof DangdangBuyBookAdapter;
    }

    @Override
    public ResultMsg buyBooks(String bookId, Object adapter) {
        System.out.println("当当购买");
        return null;
    }
}
