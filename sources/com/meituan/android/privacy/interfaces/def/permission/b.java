package com.meituan.android.privacy.interfaces.def.permission;

import android.app.Activity;
import android.support.annotation.GuardedBy;
import android.support.annotation.NonNull;
import android.support.annotation.UiThread;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private final WeakReference<Activity> b;
    private final d c;
    @GuardedBy("this")
    private final LinkedList<l> d;
    @GuardedBy("this")
    private l e;

    public b(@NonNull d dVar, @NonNull Activity activity) {
        Object[] objArr = {dVar, activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8279c58294ef5077050d063c3ef948a8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8279c58294ef5077050d063c3ef948a8");
            return;
        }
        this.d = new LinkedList<>();
        this.e = null;
        this.c = dVar;
        this.b = new WeakReference<>(activity);
    }

    @UiThread
    public final synchronized void a(@NonNull l lVar) {
        Object[] objArr = {lVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d12dbf3a3611384ade79a8aaccd6f6fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d12dbf3a3611384ade79a8aaccd6f6fd");
        } else if (this.b.get() == null) {
        } else {
            this.d.add(lVar);
            b();
        }
    }

    private synchronized void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a69d751f5a9ee471f4c693b5bcf71c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a69d751f5a9ee471f4c693b5bcf71c7");
            return;
        }
        if (PermissionGuard.a.a.topActivityIsCurrent(this.b.get())) {
            a();
        }
    }

    @UiThread
    public final synchronized void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e50906cede4c155354305876aad149b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e50906cede4c155354305876aad149b");
        } else if (this.e != null) {
        } else {
            l poll = this.d.poll();
            Activity activity = this.b.get();
            if (poll != null && activity != null) {
                this.e = poll;
                this.c.a(this, activity, poll);
            }
        }
    }

    @UiThread
    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d9310fe8189c30369c88ec9765fc0cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d9310fe8189c30369c88ec9765fc0cd");
            return;
        }
        if (this.e != null) {
            this.c.a(this.e.b, this.e.a, this.e.d, i, i2);
            this.e = null;
        }
        b();
    }
}
