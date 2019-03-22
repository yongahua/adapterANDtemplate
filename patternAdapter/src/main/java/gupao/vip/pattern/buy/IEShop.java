package gupao.vip.pattern.buy;

import gupao.vip.pattern.ResultMsg;

public interface IEShop {
    /**
     * 京东购买
     * @param bookId
     * @param userId
     * @return
     */
    ResultMsg JDBuy(String bookId,String userId);

    /**
     * 淘宝购买
     * @param bookId
     * @param userId
     * @return
     */
    ResultMsg TaobaoBuy(String bookId,String userId);

    /**
     * 当当购买
     * @param bookId
     * @param userId
     * @return
     */
    ResultMsg DangdangBuy(String bookId,String userId);

    /**
     * 美团购买
     * @param bookId
     * @param userId
     * @return
     */
    ResultMsg MeituanBuy(String bookId,String userId);

    /**
     * 拼多多购买
     * @param bookId
     * @param userId
     * @return
     */
    ResultMsg PinduoduoBuy(String bookId,String userId);

    /**
     * 系统购买
     * @param bookId
     * @param userId
     * @return
     */
    ResultMsg SystemBuy(String bookId,String userId);
}
