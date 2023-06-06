package com.meituan.android.uptodate.util;

import android.content.Context;
import com.meituan.android.cipstorage.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class f {
    public static ChangeQuickRedirect a;
    private static f b;
    private Context c;
    private q d;

    private f(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc5767e18382eb77d9323f8ee35e602e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc5767e18382eb77d9323f8ee35e602e");
        } else {
            this.c = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        }
    }

    public static f a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b1400043d570972301163213492e8cee", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b1400043d570972301163213492e8cee");
        }
        if (b == null) {
            synchronized (f.class) {
                if (b == null) {
                    b = new f(context);
                }
            }
        }
        return b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6013081c34c9d246e8a10ec3aafef7f", RobustBitConfig.DEFAULT_VALUE)) {
            return (q) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6013081c34c9d246e8a10ec3aafef7f");
        }
        if (this.d == null) {
            this.d = q.a(this.c, "ddUpdate", 0);
        }
        return this.d;
    }
}
