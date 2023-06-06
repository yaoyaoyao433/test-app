package com.sankuai.waimai.business.order.api.pay;

import android.content.Context;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import java.util.Map;
import rx.j;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface IPaymentManager {
    public static final String KEY = "IPaymentManager";
    public static final int NEXT_ACTION_GOTO_PAY = 0;
    public static final int NEXT_ACTION_PAY_EXTEND = 4;
    public static final int NEXT_ACTION_PAY_FINISH = 3;
    public static final int NEXT_ACTION_RETRY = 1;
    public static final int NEXT_ACTION_VERIFY = 2;
    public static final String NO_ACTION = "取消";

    void startOrderPay(Context context, Map<String, String> map, j<BaseResponse<com.sankuai.waimai.business.order.api.model.d>> jVar);
}
