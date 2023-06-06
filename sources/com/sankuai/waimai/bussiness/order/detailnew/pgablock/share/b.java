package com.sankuai.waimai.bussiness.order.detailnew.pgablock.share;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public String b;
    public long c;
    public String d;
    public a e;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a implements Serializable {
        @SerializedName("channels")
        public List<Integer> a;
        @SerializedName("share_wx_title")
        public String b;
        @SerializedName("wx_poster_qrcode_link")
        public String c;
        @SerializedName("wx_poster_slogan")
        public String d;
        @SerializedName("wx_poster_background_image")
        public String e;
        @SerializedName("mini_program_id")
        public String f;
        @SerializedName("share_wx_card_image")
        public String g;
        @SerializedName("share_wx_card_link")
        public String h;
        @SerializedName("share_wx_url")
        public String i;
        @SerializedName("share_wx_content")
        public String j;
    }
}
