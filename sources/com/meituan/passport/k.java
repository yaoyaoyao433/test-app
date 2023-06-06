package com.meituan.passport;

import android.support.annotation.RestrictTo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class k {
    public static ChangeQuickRedirect a;
    private static k b;
    private Gson c;
    private final GsonBuilder d;

    public k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5515ce8faef90f214ae1ea3aab8cf69", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5515ce8faef90f214ae1ea3aab8cf69");
        } else {
            this.d = new GsonBuilder();
        }
    }

    public static synchronized k a() {
        synchronized (k.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "428a84b9dbefda277238b62dc1c5713f", RobustBitConfig.DEFAULT_VALUE)) {
                return (k) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "428a84b9dbefda277238b62dc1c5713f");
            }
            if (b == null) {
                b = new k();
            }
            return b;
        }
    }

    public final Gson b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c047484757c83aa40b5f71005b29b9cc", RobustBitConfig.DEFAULT_VALUE)) {
            return (Gson) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c047484757c83aa40b5f71005b29b9cc");
        }
        if (this.c == null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b828da2a682d6e0798609b93ca934fcb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b828da2a682d6e0798609b93ca934fcb");
            } else {
                this.c = this.d.create();
            }
        }
        return this.c;
    }
}
