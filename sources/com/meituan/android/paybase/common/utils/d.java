package com.meituan.android.paybase.common.utils;

import com.meituan.android.paybase.config.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static int a(b.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ee845c7a84fbc3bb7ccfa555a613b855", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ee845c7a84fbc3bb7ccfa555a613b855")).intValue();
        }
        if (com.meituan.android.paybase.config.a.d() == null || com.meituan.android.paybase.config.a.d().w() == null) {
            return -1;
        }
        Map<b.a, Integer> w = com.meituan.android.paybase.config.a.d().w();
        if (w.containsKey(aVar)) {
            return w.get(aVar).intValue();
        }
        return -1;
    }
}
