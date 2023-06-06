package com.sankuai.waimai.bussiness.order.detailnew.network.response;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.rocks.OrderRocksServerModel;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class GroupChatEntrance implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("bubble")
    public String bubble;
    @SerializedName("group_id")
    public long chatId;
    @SerializedName("desc")
    public String desc;
    @SerializedName("has_rider")
    public boolean hasRider;
    @SerializedName(RemoteMessageConst.Notification.ICON)
    public String icon;
    @SerializedName("title")
    public String title;

    public boolean showGroupChatEntrance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2483a59d7d6c0f4df824257e0924a4f4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2483a59d7d6c0f4df824257e0924a4f4")).booleanValue() : !TextUtils.isEmpty(this.title);
    }

    public static GroupChatEntrance convert(OrderRocksServerModel orderRocksServerModel) {
        Object[] objArr = {orderRocksServerModel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "49828c0a54e6b2555bf8db16b50edea1", RobustBitConfig.DEFAULT_VALUE)) {
            return (GroupChatEntrance) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "49828c0a54e6b2555bf8db16b50edea1");
        }
        Object obj = orderRocksServerModel.a("wm_order_status_im_info_food_info", "wm_order_status_im_info_delivery_info", "wm_order_status_operatearea_buttonlist").get("group_chat_info");
        if (obj != null) {
            return (GroupChatEntrance) com.sankuai.waimai.bussiness.order.detailnew.util.d.a().fromJson(com.sankuai.waimai.bussiness.order.detailnew.util.d.a().toJson(obj), (Class<Object>) GroupChatEntrance.class);
        }
        return new GroupChatEntrance();
    }
}
