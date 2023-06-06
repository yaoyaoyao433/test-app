package com.sankuai.meituan.mapfoundation.base;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public static Context b;

    public static void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4843baec5bfd1501ea2279f80aaa7307", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4843baec5bfd1501ea2279f80aaa7307");
        } else if (b == null) {
            if (context != null && context.getApplicationContext() != null) {
                b = context.getApplicationContext();
            } else {
                b = context;
            }
        }
    }

    public static void a(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6f1c199fd9defa59f4206b93a5a6870b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6f1c199fd9defa59f4206b93a5a6870b");
            return;
        }
        a(context);
        com.sankuai.meituan.mapfoundation.datacollector.a.a(i);
    }
}
