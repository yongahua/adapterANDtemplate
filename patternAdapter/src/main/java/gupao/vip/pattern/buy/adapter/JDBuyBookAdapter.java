package gupao.vip.pattern.buy.adapter;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import gupao.vip.pattern.ResultMsg;

public class JDBuyBookAdapter implements BuyBookAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof JDBuyBookAdapter;
    }

    @Override
    public ResultMsg buyBooks(String bookId, Object adapter) {
        System.out.println("京东购买");
        return null;
    }

}
