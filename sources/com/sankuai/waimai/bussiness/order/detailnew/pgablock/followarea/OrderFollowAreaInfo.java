package com.sankuai.waimai.bussiness.order.detailnew.pgablock.followarea;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.detail.model.RiderInfo;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.e;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.h;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.n;
import com.sankuai.waimai.bussiness.order.detailnew.util.c;
import com.sankuai.waimai.bussiness.order.detailnew.util.d;
import com.sankuai.waimai.bussiness.order.detailnew.util.k;
import com.sankuai.waimai.bussiness.order.rocks.OrderRocksServerModel;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class OrderFollowAreaInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String couponShareInfo;
    @SerializedName("feed_info")
    public e feedInfo;
    @SerializedName("navigate_bar")
    public List<h> navigateBarInfoList;
    @SerializedName("order_common_info")
    public com.sankuai.waimai.business.order.api.detail.model.a orderCommonInfo;
    @SerializedName("id")
    public String orderId;
    public int orderStatus;
    @SerializedName("order_status_desc")
    public n orderStatusDesc;
    public long poiId;
    public String poiIdStr;
    @SerializedName("rider_info")
    public RiderInfo riderInfo;
    public boolean shouldPopupHongbao;
    public int showMapFlag;
    @SerializedName("is_show_red_packet")
    public int showRedPacket;
    public int statusCode;
    public int statusTime;

    public OrderFollowAreaInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e6435e4a50f2daab652379f04e931a92", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e6435e4a50f2daab652379f04e931a92");
        } else {
            this.poiIdStr = "";
        }
    }

    public h getNavigateBarInfo(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f0bccc648d8d778ad025900320256b05", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f0bccc648d8d778ad025900320256b05");
        }
        if (this.navigateBarInfoList == null || this.navigateBarInfoList.size() <= 0) {
            return null;
        }
        for (h hVar : this.navigateBarInfoList) {
            if (hVar.a == i) {
                return hVar;
            }
        }
        return null;
    }

    public boolean showMap() {
        return this.showMapFlag == 1;
    }

    public boolean canShareEnvelope() {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7e33ce2cef516e5cdb7dcec373a6d9bd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7e33ce2cef516e5cdb7dcec373a6d9bd")).booleanValue();
        }
        if (c.a(this.couponShareInfo)) {
            z = c.b(this.couponShareInfo);
        } else {
            z = getNavigateBarInfo(3) != null;
        }
        return k.a(this) ? k.c(this) != null : z;
    }

    public static OrderFollowAreaInfo convert(OrderRocksServerModel orderRocksServerModel, boolean z) {
        Object[] objArr = {orderRocksServerModel, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "48231f0fa747978a4311ff7bab61f1b4", RobustBitConfig.DEFAULT_VALUE)) {
            return (OrderFollowAreaInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "48231f0fa747978a4311ff7bab61f1b4");
        }
        Map<String, Object> c = orderRocksServerModel.c("wm_order_status_tips_info", "wm_order_status_redpacket_entrance", "wm_order_status_feed_info");
        OrderFollowAreaInfo orderFollowAreaInfo = new OrderFollowAreaInfo();
        if (c == null || c.isEmpty()) {
            return orderFollowAreaInfo;
        }
        orderFollowAreaInfo.shouldPopupHongbao = z;
        orderFollowAreaInfo.couponShareInfo = String.valueOf(c.get("data"));
        Object obj = c.get("navigate_bar");
        if (obj != null) {
            orderFollowAreaInfo.navigateBarInfoList = (List) d.a().fromJson(d.a().toJson(obj), new TypeToken<List<h>>() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.followarea.OrderFollowAreaInfo.1
            }.getType());
        }
        orderFollowAreaInfo.orderId = orderRocksServerModel.c.b;
        orderFollowAreaInfo.poiId = orderRocksServerModel.c.c;
        orderFollowAreaInfo.poiIdStr = orderRocksServerModel.c.d;
        orderFollowAreaInfo.orderCommonInfo = orderRocksServerModel.c.l;
        if (orderFollowAreaInfo.orderCommonInfo != null) {
            orderFollowAreaInfo.orderStatus = orderFollowAreaInfo.orderCommonInfo.e;
            orderFollowAreaInfo.statusCode = orderFollowAreaInfo.orderCommonInfo.x;
            orderFollowAreaInfo.statusTime = orderFollowAreaInfo.orderCommonInfo.y;
            orderFollowAreaInfo.showMapFlag = orderFollowAreaInfo.orderCommonInfo.c;
            if (orderFollowAreaInfo.orderCommonInfo.b == 1) {
                orderFollowAreaInfo.shouldPopupHongbao = false;
            }
        }
        orderFollowAreaInfo.orderStatusDesc = orderRocksServerModel.c.m;
        orderFollowAreaInfo.riderInfo = orderRocksServerModel.c.k;
        orderFollowAreaInfo.showRedPacket = orderFollowAreaInfo.canShareEnvelope() ? 1 : 0;
        if (c.get("feed_info") != null) {
            orderFollowAreaInfo.feedInfo = (e) d.a().fromJson(d.a().toJson(c.get("feed_info")), (Class<Object>) e.class);
        }
        return orderFollowAreaInfo;
    }
}
