package com.sankuai.waimai.store.im.poi.model;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.i;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class ImOrderData implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("show_modify_address")
    public boolean isShowModifyAddress;
    @SerializedName("show_remind")
    public boolean isShowRemind;
    @SerializedName("data")
    public ImOrderInfo orderInfo;
    @SerializedName("type")
    public int type;

    public ImOrderData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ef14e38348be4770a91c46e3fca61be", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ef14e38348be4770a91c46e3fca61be");
        } else {
            this.orderInfo = new ImOrderInfo();
        }
    }

    public ImOrderData(ImOrderInfo imOrderInfo, boolean z, int i) {
        Object[] objArr = {imOrderInfo, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "437da35f2ba7cea78abd8a43586aedfd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "437da35f2ba7cea78abd8a43586aedfd");
            return;
        }
        this.orderInfo = imOrderInfo;
        this.isShowRemind = z;
        this.type = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @android.support.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.sankuai.waimai.store.im.poi.model.ImOrderData convert(com.sankuai.xm.im.message.bean.GeneralMessage r11) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r1 = 0
            r8[r1] = r11
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.waimai.store.im.poi.model.ImOrderData.changeQuickRedirect
            java.lang.String r10 = "3cd0d19caeaf58b168e4a30db884fb1b"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r11 = com.meituan.robust.PatchProxy.accessDispatch(r8, r2, r9, r0, r10)
            com.sankuai.waimai.store.im.poi.model.ImOrderData r11 = (com.sankuai.waimai.store.im.poi.model.ImOrderData) r11
            return r11
        L1e:
            if (r11 != 0) goto L26
            com.sankuai.waimai.store.im.poi.model.ImOrderData r11 = new com.sankuai.waimai.store.im.poi.model.ImOrderData
            r11.<init>()
            return r11
        L26:
            byte[] r11 = r11.getData()
            if (r11 == 0) goto L40
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Exception -> L3c
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Exception -> L3c
            r0.<init>(r11, r1)     // Catch: java.lang.Exception -> L3c
            java.lang.Class<com.sankuai.waimai.store.im.poi.model.ImOrderData> r11 = com.sankuai.waimai.store.im.poi.model.ImOrderData.class
            java.lang.Object r11 = com.sankuai.waimai.store.util.i.a(r0, r11)     // Catch: java.lang.Exception -> L3c
            com.sankuai.waimai.store.im.poi.model.ImOrderData r11 = (com.sankuai.waimai.store.im.poi.model.ImOrderData) r11     // Catch: java.lang.Exception -> L3c
            goto L41
        L3c:
            r11 = move-exception
            com.sankuai.waimai.foundation.utils.log.a.a(r11)
        L40:
            r11 = r2
        L41:
            if (r11 != 0) goto L48
            com.sankuai.waimai.store.im.poi.model.ImOrderData r11 = new com.sankuai.waimai.store.im.poi.model.ImOrderData
            r11.<init>()
        L48:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.im.poi.model.ImOrderData.convert(com.sankuai.xm.im.message.bean.GeneralMessage):com.sankuai.waimai.store.im.poi.model.ImOrderData");
    }

    public byte[] toData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5c5b6440712daec1f5717a2a67a3d24f", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5c5b6440712daec1f5717a2a67a3d24f");
        }
        if (this.orderInfo != null) {
            ImOrderData imOrderData = new ImOrderData();
            imOrderData.orderInfo = this.orderInfo;
            imOrderData.isShowRemind = this.isShowRemind;
            imOrderData.type = this.type;
            imOrderData.isShowModifyAddress = this.isShowModifyAddress;
            String a = i.a(imOrderData);
            try {
                JSONObject jSONObject = new JSONObject(a);
                ((JSONObject) jSONObject.get("data")).put("order_view_id", String.valueOf(this.orderInfo.orderViewID));
                a = jSONObject.toString();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (!TextUtils.isEmpty(a)) {
                try {
                    return a.getBytes(StandardCharsets.UTF_8);
                } catch (Exception e2) {
                    com.sankuai.waimai.foundation.utils.log.a.a(e2);
                }
            }
        }
        return new byte[0];
    }
}
