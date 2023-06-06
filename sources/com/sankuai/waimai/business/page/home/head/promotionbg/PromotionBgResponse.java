package com.sankuai.waimai.business.page.home.head.promotionbg;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class PromotionBgResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("area_bottom")
    public a areaBg;
    @SerializedName("banner_bottom")
    public b bannerBg;
    @SerializedName("scene_type")
    public int sceneType = 1;
    @SerializedName("search_btn_color")
    public String searchBtnColor;
    @SerializedName("block_area_title")
    public c titleBg;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        @SerializedName("pic_url")
        public String a;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class b {
        @SerializedName("pic_url")
        public String a;
        @SerializedName("video_url")
        public String b;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class c {
        @SerializedName("pic_url")
        public String a;
    }
}
