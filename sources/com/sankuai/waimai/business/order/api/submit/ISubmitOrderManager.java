package com.sankuai.waimai.business.order.api.submit;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.sankuai.waimai.business.order.api.submit.model.CrossOrderPoiParam;
import com.sankuai.waimai.foundation.core.service.user.a;
import com.sankuai.waimai.globalcart.model.GlobalCart;
import com.sankuai.waimai.platform.domain.core.multiperson.MultiPersonCart;
import com.sankuai.waimai.platform.domain.core.order.WmOrderedFood;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface ISubmitOrderManager {
    boolean checkAccount(Context context, long j, String str, a.EnumC0947a enumC0947a);

    void clearOrder();

    void commonCrossOrderPreOrder(Activity activity, List<CrossOrderPoiParam> list, String str, com.sankuai.waimai.business.order.api.submit.listener.a aVar, String str2, int i, a.EnumC0947a enumC0947a, String str3);

    String getToken();

    @Deprecated
    void h5CommonOrderPreOrder(Activity activity, long j, int i, List<WmOrderedFood> list, String str, String str2, int i2);

    @Deprecated
    void h5CommonOrderPreOrder(Activity activity, long j, int i, List<WmOrderedFood> list, String str, String str2, int i2, com.sankuai.waimai.business.order.api.submit.listener.b bVar);

    void h5CommonOrderPreOrder(Activity activity, long j, String str, int i, List<WmOrderedFood> list, String str2, String str3, int i2);

    void h5CommonOrderPreOrder(Activity activity, long j, String str, int i, List<WmOrderedFood> list, String str2, String str3, int i2, com.sankuai.waimai.business.order.api.submit.listener.b bVar);

    void multiPersonPreOrder(Activity activity, MultiPersonCart multiPersonCart, String str);

    void postOrderDirectly(Activity activity, long j, String str, List<WmOrderedFood> list, String str2, int i, int i2);

    @Deprecated
    void postOrderDirectly(Activity activity, long j, List<WmOrderedFood> list, String str, int i, int i2);

    @Deprecated
    void preOrder(Activity activity, String str);

    void preOrder(d dVar);

    void registerOrderStatusObserver(a aVar);

    void rxInquiryPreOrder(com.sankuai.waimai.foundation.core.service.order.d dVar, String str);

    void setCaution(String str);

    void setCautionMap(HashMap<Long, String> hashMap);

    void setInvoice(HashMap<Long, String> hashMap);

    void setInvoiceTitle(String str);

    void setInvoiceType(int i);

    void setSourceType(int i);

    void setTaxPayerId(String str);

    void setToken(String str);

    void shopCartCrossOrder(Activity activity, com.sankuai.waimai.platform.domain.manager.order.a aVar, String str, int i, a.EnumC0947a enumC0947a, List<GlobalCart> list);

    void shopCartPreOrder(Activity activity, com.sankuai.waimai.platform.domain.manager.order.a aVar, a.EnumC0947a enumC0947a, String str, int i, com.sankuai.waimai.platform.domain.core.response.a aVar2, GlobalCart globalCart);

    void unregisterOrderStatusObserver(a aVar);

    void updateOrderStatus();

    void updateOrderStatus(String str, Uri uri);
}
