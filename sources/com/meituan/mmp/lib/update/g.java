package com.meituan.mmp.lib.update;

import android.support.annotation.RestrictTo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class g {
    public static ChangeQuickRedirect a;
    private static g b;
    private Gson c;
    private final GsonBuilder d;

    public g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a10318d04c1c01b9641240d0e7b1b31d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a10318d04c1c01b9641240d0e7b1b31d");
            return;
        }
        this.d = new GsonBuilder();
        this.d.registerTypeAdapter(MMPAppProp.class, new MMPAppPropDeserializer());
    }

    public static synchronized g a() {
        synchronized (g.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0625a64904f9771c767dd24aa16335dc", RobustBitConfig.DEFAULT_VALUE)) {
                return (g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0625a64904f9771c767dd24aa16335dc");
            }
            if (b == null) {
                b = new g();
            }
            return b;
        }
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4da686ae0949aeaaa1bf1a7c4e3e9517", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4da686ae0949aeaaa1bf1a7c4e3e9517");
        } else {
            this.c = this.d.create();
        }
    }

    public final Gson b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec3495cd63181e13b01608e463f81494", RobustBitConfig.DEFAULT_VALUE)) {
            return (Gson) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec3495cd63181e13b01608e463f81494");
        }
        if (this.c == null) {
            c();
        }
        return this.c;
    }
}
