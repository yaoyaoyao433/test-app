package com.sankuai.waimai.business.search.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class PromotionWordsResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("promotionInfos")
    public List<a> promotionInfos;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
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
        @SerializedName("activityId")
        public String f;
        @SerializedName("activityType")
        public String g;
        @SerializedName("entryItemId")
        public String h;
        @SerializedName("configPic")
        public String i;
    }
}
