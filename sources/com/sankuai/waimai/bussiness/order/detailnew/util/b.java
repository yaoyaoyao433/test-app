package com.sankuai.waimai.bussiness.order.detailnew.util;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "873623924ec984702de74f4cc3abc05f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "873623924ec984702de74f4cc3abc05f");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            try {
                com.meituan.android.clipboard.a.a(str.trim(), "waimai_orderdetail", str2);
            } catch (Exception unused) {
            }
        }
    }
}
