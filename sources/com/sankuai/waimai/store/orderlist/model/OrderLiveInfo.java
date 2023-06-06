package com.sankuai.waimai.store.orderlist.model;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.model.LiveInfo;
import com.sankuai.waimai.store.platform.shop.model.LiveBaseInfo;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class OrderLiveInfo extends LiveBaseInfo {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -8853977699922504584L;

    public static OrderLiveInfo convert(LiveInfo liveInfo) {
        Object[] objArr = {liveInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "92cd2b0c6e9dc624e6c6b76eafdc3a12", RobustBitConfig.DEFAULT_VALUE)) {
            return (OrderLiveInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "92cd2b0c6e9dc624e6c6b76eafdc3a12");
        }
        if (liveInfo != null) {
            OrderLiveInfo orderLiveInfo = new OrderLiveInfo();
            orderLiveInfo.isLive = true;
            orderLiveInfo.liveId = liveInfo.liveId;
            orderLiveInfo.iconUrl = liveInfo.icon;
            orderLiveInfo.iconDesc = liveInfo.title;
            return orderLiveInfo;
        }
        return null;
    }
}
