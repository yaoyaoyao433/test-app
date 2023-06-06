package com.sankuai.waimai.store.order.detail.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.a;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import java.io.Serializable;
import java.util.Collection;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class OrderDetailRecommendResponse extends PoiVerticalityDataResponse implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -8461301971692921821L;
    @SerializedName("extend_info")
    public ExtendInfo extendInfo;
    @SerializedName("title_icon")
    public String titleIcon;
    @SerializedName("title_text")
    public String titleText;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class ExtendInfo implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("rank_trace_id")
        public String rankTraceId;
    }

    public boolean isValid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d2d1c0a0b7b78d93afbe822d336d6fb3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d2d1c0a0b7b78d93afbe822d336d6fb3")).booleanValue() : a.a((Collection<?>) this.poiCardInfos);
    }
}
