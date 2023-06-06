package com.sankuai.waimai.store.im.poi.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.again.AgainManager;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class ImOrderInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("addr_modify_allowed")
    public Object addrModifyAllowed;
    @SerializedName("delivery_time")
    public long deliveryTime;
    @SerializedName("food_desc")
    public String foodDesc;
    @SerializedName("order_time")
    public long orderTime;
    @SerializedName("order_view_id")
    public long orderViewID;
    @SerializedName("poi_logo")
    public String poiLogo;
    @SerializedName(AgainManager.EXTRA_POI_NAME)
    public String poiName;
    @SerializedName("status")
    public int status;
    @SerializedName("status_desc")
    public String statusDesc;
    @SerializedName("total")
    public double total;
    @SerializedName("total_desc")
    public String totalDesc;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @android.support.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.sankuai.waimai.store.im.poi.model.ImOrderInfo convert(com.sankuai.xm.im.message.bean.GeneralMessage r11) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r1 = 0
            r8[r1] = r11
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.waimai.store.im.poi.model.ImOrderInfo.changeQuickRedirect
            java.lang.String r10 = "22cb9509086e8ff930bf592615cd5cfe"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r11 = com.meituan.robust.PatchProxy.accessDispatch(r8, r2, r9, r0, r10)
            com.sankuai.waimai.store.im.poi.model.ImOrderInfo r11 = (com.sankuai.waimai.store.im.poi.model.ImOrderInfo) r11
            return r11
        L1e:
            if (r11 != 0) goto L26
            com.sankuai.waimai.store.im.poi.model.ImOrderInfo r11 = new com.sankuai.waimai.store.im.poi.model.ImOrderInfo
            r11.<init>()
            return r11
        L26:
            byte[] r11 = r11.getData()
            if (r11 == 0) goto L40
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Exception -> L3c
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Exception -> L3c
            r0.<init>(r11, r1)     // Catch: java.lang.Exception -> L3c
            java.lang.Class<com.sankuai.waimai.store.im.poi.model.ImOrderInfo> r11 = com.sankuai.waimai.store.im.poi.model.ImOrderInfo.class
            java.lang.Object r11 = com.sankuai.waimai.store.util.i.a(r0, r11)     // Catch: java.lang.Exception -> L3c
            com.sankuai.waimai.store.im.poi.model.ImOrderInfo r11 = (com.sankuai.waimai.store.im.poi.model.ImOrderInfo) r11     // Catch: java.lang.Exception -> L3c
            goto L41
        L3c:
            r11 = move-exception
            com.sankuai.waimai.foundation.utils.log.a.a(r11)
        L40:
            r11 = r2
        L41:
            if (r11 != 0) goto L48
            com.sankuai.waimai.store.im.poi.model.ImOrderInfo r11 = new com.sankuai.waimai.store.im.poi.model.ImOrderInfo
            r11.<init>()
        L48:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.im.poi.model.ImOrderInfo.convert(com.sankuai.xm.im.message.bean.GeneralMessage):com.sankuai.waimai.store.im.poi.model.ImOrderInfo");
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2e2e961de6d411640531e34283010e4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2e2e961de6d411640531e34283010e4");
        }
        return "ImOrderInfo{poiName='" + this.poiName + "', poiLogo='" + this.poiLogo + "', orderViewID=" + this.orderViewID + ", orderTime=" + this.orderTime + ", deliveryTime=" + this.deliveryTime + ", total=" + this.total + ", status=" + this.status + ", foodDesc='" + this.foodDesc + "', statusDesc='" + this.statusDesc + "', totalDesc='" + this.totalDesc + "', addrModifyAllowed=" + this.addrModifyAllowed + '}';
    }
}
