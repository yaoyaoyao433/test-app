package com.sankuai.waimai.business.order.api.model;

import android.annotation.SuppressLint;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.android.ptcommonim.model.PTFloatInfo;
import com.sankuai.waimai.business.order.api.again.AgainManager;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@SuppressLint({"SerializableCheck"})
/* loaded from: classes4.dex */
public class c extends BaseResponse {
    public String a;
    public long b;
    public String c;
    @SerializedName("question_info")
    public e d;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a implements Serializable {
        @SerializedName("image")
        public String a;
        @SerializedName("description")
        public String b;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class b implements Serializable {
        @SerializedName("id")
        public long a;
        @SerializedName("title")
        public String b;
        @SerializedName("state")
        public int c;
        @SerializedName("type")
        public int d;
        @SerializedName("has_answer_code")
        public String e;
        @SerializedName("options")
        public List<C0753c> f;
        @SerializedName(PTFloatInfo.TYPE_PRODUCT)
        public a g;
        @SerializedName("extensions_info")
        public String h;
        @SerializedName("question_title_part")
        public List<d> i;
        @SerializedName("next_question_id")
        public long j;
        public long k;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.order.api.model.c$c  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0753c implements Serializable {
        @SerializedName("code")
        public String a;
        @SerializedName("title")
        public String b;
        @SerializedName("tip")
        public String c;
        @SerializedName(DMKeys.KEY_SELECTED)
        public int d;
        @SerializedName(RemoteMessageConst.Notification.ICON)
        public String e;
        @SerializedName("next_question_id")
        public long f;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class d implements Serializable {
        @SerializedName("content")
        public String a;
        @SerializedName("highlight")
        public boolean b;
        @SerializedName("first_index")
        public int c;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class e implements Serializable {
        @SerializedName("questions")
        public List<b> a;
        @SerializedName("title")
        public String b;
        @SerializedName("type")
        public String c;
        @SerializedName("poi_pic_url")
        public String d;
        @SerializedName(AgainManager.EXTRA_POI_NAME)
        public String e;
        @SerializedName("count")
        public int f;
    }
}
