package com.sankuai.waimai.business.order.api.store;

import android.app.Activity;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface IOrderBusinessService extends a, b, c, d, e {
    public static final String COMPONENT_DETAIL_STOCK_OUT_STATUS = "flashbuy-order-detail-stockout-layer";
    public static final String COMPONENT_SUBMIT_STOCK_OUT_INIT = "flashbuy-order-submit-stockout-layer";
    public static final String COMPONENT_SUBMIT_STOCK_OUT_SELECTED = "flashbuy-order-selected-stockout-layer";
    public static final String ENTRY_FLOAT_STOCK_OUT = "flashbuy-order-stockout-layer";
    public static final String KEY_STORE_BUSINESS = "sc_business_proxy";

    boolean backIntercept(Activity activity);
}
