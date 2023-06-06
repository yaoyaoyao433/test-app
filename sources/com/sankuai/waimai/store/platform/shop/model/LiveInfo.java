package com.sankuai.waimai.store.platform.shop.model;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.i;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class LiveInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -2791698242187278439L;
    @SerializedName("is_live")
    private boolean isLive;
    @SerializedName("live_frame")
    private LiveFrame mLiveFrame;

    public boolean isLive() {
        return this.isLive;
    }

    public LiveFrame getLiveFrame() {
        return this.mLiveFrame;
    }

    public static LiveInfo fromJson(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9d0c62978de979d04861df004d8631b5", RobustBitConfig.DEFAULT_VALUE)) {
            return (LiveInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9d0c62978de979d04861df004d8631b5");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (LiveInfo) i.a(str, LiveInfo.class);
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class LiveFrame implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect = null;
        private static final long serialVersionUID = 200750353886431914L;
        @SerializedName("live_id")
        private String liveId;
        @SerializedName("pull_stream_url")
        private String pullStreamUrl;
        @SerializedName(NetLogConstants.Details.SCHEME)
        private String scheme;
        @SerializedName("type")
        private int type;

        public String getScheme() {
            return this.scheme;
        }

        public String getLiveId() {
            return this.liveId;
        }

        public String getPullStreamUrl() {
            return this.pullStreamUrl;
        }

        public int getType() {
            return this.type;
        }
    }
}
