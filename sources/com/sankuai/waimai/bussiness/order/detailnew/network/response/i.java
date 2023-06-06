package com.sankuai.waimai.bussiness.order.detailnew.network.response;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.sankuai.waimai.business.order.api.model.ButtonItem;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class i implements Serializable {
    @SerializedName("popup_info")
    public a a;
    @SerializedName("popup_type")
    public int b;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class a implements Serializable {
        @SerializedName("title")
        public String a;
        @SerializedName(RemoteMessageConst.Notification.ICON)
        public String b;
        @SerializedName("content")
        public String c;
        @SerializedName("button_list")
        public List<ButtonItem> d;
    }
}
