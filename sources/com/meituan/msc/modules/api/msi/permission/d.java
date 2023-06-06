package com.meituan.msc.modules.api.msi.permission;

import android.app.Activity;
import android.support.annotation.NonNull;
import com.meituan.msc.modules.engine.h;
import com.meituan.msc.modules.manager.ModuleName;
import com.meituan.msc.modules.manager.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
@ModuleName(name = "PermissionModule")
/* loaded from: classes3.dex */
public final class d extends k {
    public static ChangeQuickRedirect a = null;
    static a f = null;
    private static int g = 3;
    public b b;
    public c c;
    int d;
    int e;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        boolean a(@NonNull Activity activity, @NonNull String[] strArr, String str);
    }

    public d(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3390111919602f3d31d320051382f96", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3390111919602f3d31d320051382f96");
            return;
        }
        this.b = new b();
        this.d = g;
        this.c = new c(hVar, this);
    }

    public static void a(int i) {
        g = i;
    }
}
