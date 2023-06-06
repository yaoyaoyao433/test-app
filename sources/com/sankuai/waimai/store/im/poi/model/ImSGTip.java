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
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class ImSGTip implements Serializable {
    public static final int SG_TIP_TYPE_BAD_COMMENT_TIP = 2;
    public static final int SG_TIP_TYPE_COUPON = 1;
    public static final int SG_TIP_TYPE_POI_STATUS = 0;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("tip_content")
    public String tipContent;
    @SerializedName("tip_type")
    public int tipType;
    @SerializedName("type")
    public int type;

    public ImSGTip() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e2b8adf8624f159ca27ced5af704ed2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e2b8adf8624f159ca27ced5af704ed2");
        } else {
            this.tipType = 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @android.support.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.sankuai.waimai.store.im.poi.model.ImSGTip convert(com.sankuai.xm.im.message.bean.GeneralMessage r11) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r1 = 0
            r8[r1] = r11
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.waimai.store.im.poi.model.ImSGTip.changeQuickRedirect
            java.lang.String r10 = "3d37c6249667fc71a9dbd518d4246a41"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r11 = com.meituan.robust.PatchProxy.accessDispatch(r8, r2, r9, r0, r10)
            com.sankuai.waimai.store.im.poi.model.ImSGTip r11 = (com.sankuai.waimai.store.im.poi.model.ImSGTip) r11
            return r11
        L1e:
            if (r11 != 0) goto L26
            com.sankuai.waimai.store.im.poi.model.ImSGTip r11 = new com.sankuai.waimai.store.im.poi.model.ImSGTip
            r11.<init>()
            return r11
        L26:
            byte[] r11 = r11.getData()
            if (r11 == 0) goto L40
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Exception -> L3c
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Exception -> L3c
            r0.<init>(r11, r1)     // Catch: java.lang.Exception -> L3c
            java.lang.Class<com.sankuai.waimai.store.im.poi.model.ImSGTip> r11 = com.sankuai.waimai.store.im.poi.model.ImSGTip.class
            java.lang.Object r11 = com.sankuai.waimai.store.util.i.a(r0, r11)     // Catch: java.lang.Exception -> L3c
            com.sankuai.waimai.store.im.poi.model.ImSGTip r11 = (com.sankuai.waimai.store.im.poi.model.ImSGTip) r11     // Catch: java.lang.Exception -> L3c
            goto L41
        L3c:
            r11 = move-exception
            com.sankuai.shangou.stone.util.log.a.a(r11)
        L40:
            r11 = r2
        L41:
            if (r11 != 0) goto L48
            com.sankuai.waimai.store.im.poi.model.ImSGTip r11 = new com.sankuai.waimai.store.im.poi.model.ImSGTip
            r11.<init>()
        L48:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.im.poi.model.ImSGTip.convert(com.sankuai.xm.im.message.bean.GeneralMessage):com.sankuai.waimai.store.im.poi.model.ImSGTip");
    }

    public byte[] toData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "13d8bd4b18c8c04850628885e94c7bc7", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "13d8bd4b18c8c04850628885e94c7bc7");
        }
        if (this.tipContent != null) {
            ImSGTip imSGTip = new ImSGTip();
            imSGTip.tipContent = this.tipContent;
            imSGTip.tipType = this.tipType;
            imSGTip.type = this.type;
            String a = i.a(imSGTip);
            if (!TextUtils.isEmpty(a)) {
                try {
                    return a.getBytes(StandardCharsets.UTF_8);
                } catch (Exception e) {
                    com.sankuai.shangou.stone.util.log.a.a(e);
                }
            }
        }
        return new byte[0];
    }
}
