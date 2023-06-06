package com.sankuai.waimai.bussiness.order.detailnew.pgablock.abnormal;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.AttentionInfo;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class OrderAbnormalInfo implements Serializable {
    private static final int SECOND_DIALOG_TYPE = 5;
    public static ChangeQuickRedirect changeQuickRedirect;
    public AttentionInfo attentionInfo;
    public String bookingPhone;
    public transient com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.b logicInfo;
    public transient com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.c orderCancelInfo;
    @SerializedName("prompt_info")
    public PromptInfo promptInfo;
    public String recipientPhone;
    public String volleyTag;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class PromptInfo implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("attention_infos")
        public List<AttentionInfo> attentionInfos;
        @SerializedName("bg_color")
        public String bgColor;
        @SerializedName("text_color")
        public String textColor;
        @SerializedName("weather_pic")
        public String weatherPic;
    }

    public OrderAbnormalInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "24151d749263d42f32ad2ff7925e130b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "24151d749263d42f32ad2ff7925e130b");
        } else {
            this.logicInfo = new com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.b();
        }
    }

    public String getCallPhone() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a442027926298680887997ef87be24ab", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a442027926298680887997ef87be24ab") : TextUtils.isEmpty(this.bookingPhone) ? this.recipientPhone : this.bookingPhone;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007d, code lost:
        r0.attentionInfo = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.sankuai.waimai.bussiness.order.detailnew.pgablock.abnormal.OrderAbnormalInfo convert(com.sankuai.waimai.bussiness.order.rocks.OrderRocksServerModel r11) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r1 = 0
            r8[r1] = r11
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.waimai.bussiness.order.detailnew.pgablock.abnormal.OrderAbnormalInfo.changeQuickRedirect
            java.lang.String r10 = "6cb7ffc5e0e1738c9df7c07b87d8674a"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1f
            r11 = 0
            java.lang.Object r11 = com.meituan.robust.PatchProxy.accessDispatch(r8, r11, r9, r0, r10)
            com.sankuai.waimai.bussiness.order.detailnew.pgablock.abnormal.OrderAbnormalInfo r11 = (com.sankuai.waimai.bussiness.order.detailnew.pgablock.abnormal.OrderAbnormalInfo) r11
            return r11
        L1f:
            com.sankuai.waimai.bussiness.order.detailnew.pgablock.abnormal.OrderAbnormalInfo r0 = new com.sankuai.waimai.bussiness.order.detailnew.pgablock.abnormal.OrderAbnormalInfo
            r0.<init>()
            java.lang.String r1 = "wm_order_status_abnormal_remind"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            java.util.Map r1 = r11.b(r1)
            java.lang.String r2 = "prompt_info"
            java.lang.Object r1 = r1.get(r2)
            if (r1 == 0) goto L84
            com.google.gson.Gson r2 = com.sankuai.waimai.bussiness.order.detailnew.util.d.a()     // Catch: java.lang.Exception -> L80
            java.lang.String r1 = r2.toJson(r1)     // Catch: java.lang.Exception -> L80
            com.google.gson.Gson r2 = com.sankuai.waimai.bussiness.order.detailnew.util.d.a()     // Catch: java.lang.Exception -> L80
            java.lang.Class<com.sankuai.waimai.bussiness.order.detailnew.pgablock.abnormal.OrderAbnormalInfo$PromptInfo> r3 = com.sankuai.waimai.bussiness.order.detailnew.pgablock.abnormal.OrderAbnormalInfo.PromptInfo.class
            java.lang.Object r1 = r2.fromJson(r1, r3)     // Catch: java.lang.Exception -> L80
            com.sankuai.waimai.bussiness.order.detailnew.pgablock.abnormal.OrderAbnormalInfo$PromptInfo r1 = (com.sankuai.waimai.bussiness.order.detailnew.pgablock.abnormal.OrderAbnormalInfo.PromptInfo) r1     // Catch: java.lang.Exception -> L80
            r0.promptInfo = r1     // Catch: java.lang.Exception -> L80
            com.sankuai.waimai.bussiness.order.detailnew.pgablock.abnormal.OrderAbnormalInfo$PromptInfo r1 = r0.promptInfo     // Catch: java.lang.Exception -> L80
            if (r1 == 0) goto L84
            com.sankuai.waimai.bussiness.order.detailnew.pgablock.abnormal.OrderAbnormalInfo$PromptInfo r1 = r0.promptInfo     // Catch: java.lang.Exception -> L80
            java.util.List<com.sankuai.waimai.bussiness.order.detailnew.network.response.AttentionInfo> r1 = r1.attentionInfos     // Catch: java.lang.Exception -> L80
            if (r1 == 0) goto L84
            com.sankuai.waimai.bussiness.order.detailnew.pgablock.abnormal.OrderAbnormalInfo$PromptInfo r1 = r0.promptInfo     // Catch: java.lang.Exception -> L80
            java.util.List<com.sankuai.waimai.bussiness.order.detailnew.network.response.AttentionInfo> r1 = r1.attentionInfos     // Catch: java.lang.Exception -> L80
            int r1 = r1.size()     // Catch: java.lang.Exception -> L80
            if (r1 <= 0) goto L84
            com.sankuai.waimai.bussiness.order.detailnew.pgablock.abnormal.OrderAbnormalInfo$PromptInfo r1 = r0.promptInfo     // Catch: java.lang.Exception -> L80
            java.util.List<com.sankuai.waimai.bussiness.order.detailnew.network.response.AttentionInfo> r1 = r1.attentionInfos     // Catch: java.lang.Exception -> L80
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L80
        L6a:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Exception -> L80
            if (r2 == 0) goto L84
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Exception -> L80
            com.sankuai.waimai.bussiness.order.detailnew.network.response.AttentionInfo r2 = (com.sankuai.waimai.bussiness.order.detailnew.network.response.AttentionInfo) r2     // Catch: java.lang.Exception -> L80
            if (r2 == 0) goto L6a
            int r3 = r2.type     // Catch: java.lang.Exception -> L80
            r4 = 5
            if (r3 != r4) goto L6a
            r0.attentionInfo = r2     // Catch: java.lang.Exception -> L80
            goto L84
        L80:
            r1 = move-exception
            r1.printStackTrace()
        L84:
            java.util.Map<java.lang.String, java.lang.Object> r1 = r11.g
            java.lang.String r2 = "booking_phone"
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.bookingPhone = r1
            java.util.Map<java.lang.String, java.lang.Object> r1 = r11.g
            java.lang.String r2 = "recipient_phone"
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.recipientPhone = r1
            com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.b r1 = r11.c
            r0.logicInfo = r1
            com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.c r1 = com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.c.a(r11)
            r0.orderCancelInfo = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Class r11 = r11.getClass()
            java.lang.String r11 = r11.getSimpleName()
            r1.append(r11)
            long r2 = java.lang.System.currentTimeMillis()
            r1.append(r2)
            java.lang.String r11 = r1.toString()
            r0.volleyTag = r11
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.bussiness.order.detailnew.pgablock.abnormal.OrderAbnormalInfo.convert(com.sankuai.waimai.bussiness.order.rocks.OrderRocksServerModel):com.sankuai.waimai.bussiness.order.detailnew.pgablock.abnormal.OrderAbnormalInfo");
    }
}
