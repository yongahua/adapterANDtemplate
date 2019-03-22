package gupao.vip.pattern.buy.adapter;

import gupao.vip.pattern.ResultMsg;

public class PinduoduoBuyBookAdapter implements BuyBookAdapter{
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof  PinduoduoBuyBookAdapter;
    }

    @Override
    public ResultMsg buyBooks(String bookId, Object adapter) {
        System.out.println("拼多多购买");
        return null;
    }
}
