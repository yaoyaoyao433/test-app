package com.meituan.android.legwork.utils;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class m {
    public static ChangeQuickRedirect a;
    public long b;
    public long c;
    public boolean d;
    private WeakReference<Activity> e;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a {
        public static final m a = new m();
    }

    public m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c0a0616af7838d00e136216671436ce", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c0a0616af7838d00e136216671436ce");
            return;
        }
        this.b = 0L;
        this.c = 1L;
        this.d = false;
    }

    public final Activity a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e81cf74e76b442554cb1af7d0fcaf38a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e81cf74e76b442554cb1af7d0fcaf38a");
        }
        if (com.meituan.android.legwork.a.d != null && com.meituan.android.legwork.a.d.get() != null) {
            return com.meituan.android.legwork.a.d.get();
        }
        if (this.e != null) {
            return this.e.get();
        }
        return null;
    }

    public final void a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "641ca2ecad7f6a06d64188438e0a4397", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "641ca2ecad7f6a06d64188438e0a4397");
        } else {
            this.e = new WeakReference<>(activity);
        }
    }

    public final boolean b() {
        return this.b == 1;
    }
}
