package com.sankuai.waimai.store.search.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class PromotionWordsResponse implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -7846540100148205177L;
    @SerializedName("code")
    public int code;
    @SerializedName("msg")
    public String msg;
    @SerializedName("promotionInfos")
    public List<a> promotionInfos;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        @SerializedName("hitPromotion")
        public boolean a;
        @SerializedName("promotionUrl")
        public String b;
        @SerializedName("promotionType")
        public int c;
        @SerializedName("promotionWord")
        public String d;
        @SerializedName("sugShowInfo")
        public String e;
    }
}
