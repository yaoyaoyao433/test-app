package com.sankuai.waimai.business.page.home.list.future.model;

import com.google.gson.annotations.SerializedName;
import com.sankuai.xm.im.message.bean.Message;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d implements Serializable {
    @SerializedName("id")
    public int a;
    @SerializedName("groupId")
    public int b;
    @SerializedName("expKey")
    public String c;
    @SerializedName("groupKey")
    public String d;
    @SerializedName(Message.GROUP_NAME)
    public String e;
    @SerializedName("param")
    public a f;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a implements Serializable {
        @SerializedName("start_index")
        public String a;
        @SerializedName("is_fold")
        public String b;
        @SerializedName("is_product_feeds_list")
        public String c;
    }
}
