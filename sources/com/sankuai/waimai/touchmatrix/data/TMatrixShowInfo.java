package com.sankuai.waimai.touchmatrix.data;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.touchmatrix.data.AlertInfo;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class TMatrixShowInfo {
    public static final int CONDITION_TYPE_BLACK = 2;
    public static final int CONDITION_TYPE_WHITE = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("biz")
    public String bizId;
    @SerializedName("business_container")
    public String businessContainer;
    @SerializedName("business_data")
    public AlertInfo businessData;
    @SerializedName("condition")
    public a condition;
    @SerializedName("style")
    public AlertInfo.Style style;
    @SerializedName("touch_mode")
    public int touchMode;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        @SerializedName("contain_type")
        public int a;
        @SerializedName("page_list")
        public List<b> b;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b {
        @SerializedName("page_id")
        public String a;
        @SerializedName("poi_id")
        public String b;
        @SerializedName("category_code")
        public String c;
    }
}
