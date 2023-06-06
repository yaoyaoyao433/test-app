package com.meituan.msi.api.extension.medicine.shopcart;

import com.meituan.msi.annotations.MsiParamChecker;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class PurchaseNowForSkuParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    @MsiParamChecker(required = true)
    public JsonInfo jsonInfo;

    /* compiled from: ProGuard */
    @MsiSupport
    /* loaded from: classes3.dex */
    public static class JsonInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String cart_recommend_couponInfo;
        public int count;
        public String drug_extra;
        public String goods_attr;
        public String goods_sku;
        public String goods_spu;
        public String poi_id;
        public String poi_id_str;
    }
}
