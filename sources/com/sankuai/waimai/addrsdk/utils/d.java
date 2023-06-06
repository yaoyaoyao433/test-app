package com.sankuai.waimai.addrsdk.utils;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "60bc269da3ccce7b09a0f7ee791344ae", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "60bc269da3ccce7b09a0f7ee791344ae");
        }
        String a2 = new f(b.a, "waimai_addrsdk").a("key_host");
        return !TextUtils.isEmpty(a2) ? a2 : "addressapi.meituan.com";
    }

    public static String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4166d3a91506617c262ca345ca366595", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4166d3a91506617c262ca345ca366595");
        }
        String a2 = new f(b.a, "waimai_addrsdk").a("key_delivery_host");
        return !TextUtils.isEmpty(a2) ? a2 : "https://deliverycommonapi.peisong.meituan.com";
    }
}
