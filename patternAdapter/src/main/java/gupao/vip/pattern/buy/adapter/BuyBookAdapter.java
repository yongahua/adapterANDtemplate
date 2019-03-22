package gupao.vip.pattern.buy.adapter;

import gupao.vip.pattern.ResultMsg;

public interface BuyBookAdapter {
    boolean support(Object adapter);

    ResultMsg buyBooks(String bookId, Object adapter);
}
