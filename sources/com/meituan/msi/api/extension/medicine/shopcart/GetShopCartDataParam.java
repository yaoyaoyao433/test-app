package com.meituan.msi.api.extension.medicine.shopcart;

import com.meituan.msi.annotations.MsiParamChecker;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class GetShopCartDataParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    @MsiParamChecker(required = true)
    public JsonInfo jsonInfo;

    /* compiled from: ProGuard */
    @MsiSupport
    /* loaded from: classes3.dex */
    public static class JsonInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String poi_id;
        public String poi_id_str;
    }
}
