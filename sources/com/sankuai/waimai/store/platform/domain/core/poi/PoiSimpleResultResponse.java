package com.sankuai.waimai.store.platform.domain.core.poi;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class PoiSimpleResultResponse implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("poi_simple_list")
    public List<PoiSimpleListResultEntity> poiSimpleList;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class PoiSimpleListResultEntity implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("biz_type")
        public int bizType;
        @SerializedName("poi_id")
        public long poiId;

        public int getLocalBizType() {
            return this.bizType - 1;
        }
    }
}
