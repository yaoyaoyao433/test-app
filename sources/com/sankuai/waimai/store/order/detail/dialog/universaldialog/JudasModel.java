package com.sankuai.waimai.store.order.detail.dialog.universaldialog;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class JudasModel {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("click")
    public Info click;
    @SerializedName(Constants.EventType.VIEW)
    public Info view;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class Info {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("bid")
        public String bid;
        @SerializedName("cid")
        public String cid;
        @SerializedName("params")
        public Map<String, Object> params;
    }
}
