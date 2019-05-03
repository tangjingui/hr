package cn.Regist_Module.Buyer_Regist;

import cn.vo.Buyer;

public interface BuyerRegist {
	boolean buyerRegist(Buyer buyer)throws Exception;
	void addBuyer(Buyer buyer)throws Exception;
	boolean cheakbuyer(Buyer buyer)throws Exception;
}
