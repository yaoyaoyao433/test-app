package com.meituan.android.mrn.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.LongSerializationPolicy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class m {
    public static ChangeQuickRedirect a;
    private static m b;
    private Gson c;
    private final GsonBuilder d;

    public m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77961f1cbe534652fd42bef66cda9458", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77961f1cbe534652fd42bef66cda9458");
        } else {
            this.d = new GsonBuilder();
        }
    }

    public static synchronized m a() {
        synchronized (m.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "500a7db21f531f95a34896232fb3ad83", RobustBitConfig.DEFAULT_VALUE)) {
                return (m) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "500a7db21f531f95a34896232fb3ad83");
            }
            if (b == null) {
                b = new m();
            }
            return b;
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d74963c14f6296c54a5045a67663716", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d74963c14f6296c54a5045a67663716");
        } else {
            this.c = this.d.setLongSerializationPolicy(LongSerializationPolicy.STRING).create();
        }
    }

    public final Gson c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b23a3bec415d3326273b074b7d5327b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Gson) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b23a3bec415d3326273b074b7d5327b");
        }
        if (this.c == null) {
            b();
        }
        return this.c;
    }
}
