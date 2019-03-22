package gupao.vip.pattern.buy;

import gupao.vip.pattern.ResultMsg;

public class BuyBooksService {

    public ResultMsg buyBooks(String bookId, String userId){
        System.out.println("用户"+userId+"，购买书籍"+bookId);
        return null;
    }
}
