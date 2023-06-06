package com.dianping.imagemanager.base;

import android.app.Application;
import android.content.Context;
import com.dianping.imagemanager.utils.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public static final long b = System.currentTimeMillis();
    public static boolean c = false;
    public boolean d;
    public Context e;
    public o f;
    public d g;
    public c h;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        public static final b a = new b();
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6bb5f9f9edd248dd03d6afa51e41587", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6bb5f9f9edd248dd03d6afa51e41587");
        } else {
            this.d = false;
        }
    }

    public static b a() {
        return a.a;
    }

    public final void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ed5f9fa0f099a378c703d4f26dff6d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ed5f9fa0f099a378c703d4f26dff6d2");
        } else if (this.e != null || context == null) {
        } else {
            if (context instanceof Application) {
                this.e = context;
            } else {
                this.e = context.getApplicationContext();
            }
            this.f = new o(this.e);
            this.d = true;
        }
    }
}
