package com.meituan.android.paybase.fingerprint.util;

import android.content.Context;
import android.os.Build;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.util.aop.f;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;

    private static int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9693544bd6853162098a7de2f7986cb3", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9693544bd6853162098a7de2f7986cb3")).intValue() : com.meituan.android.paybase.fingerprint.soter.sotercore.external.a.a() ? 1 : 0;
    }

    private static int b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5355ab480b6d7098af160f476b6826b5", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5355ab480b6d7098af160f476b6826b5")).intValue() : (Build.VERSION.SDK_INT < 23 || context == null || f.a(context, "android.permission.USE_FINGERPRINT") != 0 || !c.b()) ? 0 : 1;
    }

    public static int a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3e442d620856a80d8c89689fa5021d80", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3e442d620856a80d8c89689fa5021d80")).intValue();
        }
        int b = b(context) | (a() << 1);
        com.meituan.android.paybase.common.analyse.a.a("b_pay_xqiyo4de_mv", new a.c().a("type", String.valueOf(b)).b);
        return b;
    }
}
