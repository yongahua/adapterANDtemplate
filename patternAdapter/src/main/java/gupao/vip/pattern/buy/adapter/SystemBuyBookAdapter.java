package gupao.vip.pattern.buy.adapter;

import gupao.vip.pattern.ResultMsg;
import javafx.scene.media.SubtitleTrack;

public class SystemBuyBookAdapter implements BuyBookAdapter{
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof  SystemBuyBookAdapter;
    }

    @Override
    public ResultMsg buyBooks(String bookId, Object adapter) {
        System.out.println("系统购买");
        return null;
    }
}
