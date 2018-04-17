package com.zyg.guns.modular.pay.weixinpay.service;


import com.zyg.guns.modular.pay.common.model.Product;

public interface IWeixinPayService {
	/**
	 * 微信支付下单(模式二)
	 * 扫码支付 还有模式一 适合固定商品ID 有兴趣的同学可以自行研究
	 * @param product
	 * @return  String
	 * @Date	2017年7月31日
	 * 更新日志
	 *
	 */
	String weixinPay2(Product product);
	/**
	 * 微信支付下单(模式一)
	 * @param product  void
	 * @Date	2017年9月5日
	 * 更新日志
	 *
	 */
	void weixinPay1(Product product);
    /**
     * 微信支付退款
     * @param product
     * @return  String
     * @Date	2017年7月31日
     * 更新日志
     *
     */
	String weixinRefund(Product product);
	/**
	 * 关闭订单
	 * @param product
	 * @return  String
	 * @Date	2017年7月31日
	 * 更新日志
	 *
	 */
	String weixinCloseorder(Product product);
	/**
	 * 下载微信账单
	 * @Date	2017年7月31日
	 * 更新日志
	 *
	 */
	void saveBill();
    /**
     * 微信公众号支付返回一个url地址
     * @param product
     * @return  String
     * @Date	2017年7月31日
     * 更新日志
     *
     */
	String weixinPayMobile(Product product);
	/**
	 * H5支付 唤醒 微信APP 进行支付
	 * 申请入口：登录商户平台-->产品中心-->我的产品-->支付产品-->H5支付
	 * @param product
	 * @return  String
	 * @Date	2017年8月9日
	 * 更新日志
	 *
	 */
	String weixinPayH5(Product product);
}
