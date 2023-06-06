package com.meituan.android.common.locate.util;

import android.content.Context;
import com.meituan.android.cipstorage.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public class a {
    public static String a = "map_locate_";
    private static a b;
    public static ChangeQuickRedirect changeQuickRedirect;
    private com.meituan.android.cipstorage.q c;
    private x d;

    public a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f498b51b1ef4c5bf6c55b2c322f3a28c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f498b51b1ef4c5bf6c55b2c322f3a28c");
            return;
        }
        this.c = com.meituan.android.cipstorage.q.a(context, a + com.meituan.android.common.locate.provider.s.a(context).c(), 1);
        this.d = x.a(this.c);
    }

    public static synchronized a a(Context context) {
        synchronized (a.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a7d297a3a0f474b8cb58fcd609ed266b", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a7d297a3a0f474b8cb58fcd609ed266b");
            }
            if (b == null) {
                b = new a(context);
            }
            return b;
        }
    }

    public x a() {
        return this.d;
    }
}
