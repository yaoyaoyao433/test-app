package com.sankuai.waimai.store.platform.domain.core.goods;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public final class MrnExtension implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("data")
    private Data data;

    public final String getKeyword() {
        return this.data != null ? this.data.keyword : "";
    }

    public final String getSearchLogId() {
        return this.data != null ? this.data.poiSearchLogId : "";
    }

    public final String getSearchGlobalId() {
        return this.data != null ? this.data.poiSearchGlobalId : "";
    }

    public final String getStid() {
        return this.data != null ? this.data.stid : "";
    }

    public final int getIndex() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df7a3a7b4542e6a523e8ac45b7a811f5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df7a3a7b4542e6a523e8ac45b7a811f5")).intValue();
        }
        try {
            return Integer.parseInt(this.data.index);
        } catch (Exception unused) {
            return 0;
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    class Data implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("index")
        public String index;
        @SerializedName("keyword")
        public String keyword;
        @SerializedName("poisearch_global_id")
        public String poiSearchGlobalId;
        @SerializedName("poisearch_log_id")
        public String poiSearchLogId;
        @SerializedName("stid")
        public String stid;

        public Data() {
        }
    }
}
