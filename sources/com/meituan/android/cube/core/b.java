package com.meituan.android.cube.core;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class b {
    public static ChangeQuickRedirect a;
    @Nullable
    public Bundle b;
    @Nullable
    public String c;
    j d;
    e e;
    @NonNull
    private final Context f;

    public b(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93e10f41111d0f059d5689d70850cd81", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93e10f41111d0f059d5689d70850cd81");
            return;
        }
        this.f = context;
        this.d = new j();
        this.e = new e();
    }

    @NonNull
    public Context a() {
        return this.f;
    }

    public FragmentActivity b() {
        if (this.f instanceof FragmentActivity) {
            return (FragmentActivity) this.f;
        }
        return null;
    }

    public final <T> T a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80461ac987659eaf2c8d8421e2147a59", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80461ac987659eaf2c8d8421e2147a59");
        }
        j jVar = this.d;
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = j.a;
        return PatchProxy.isSupport(objArr2, jVar, changeQuickRedirect2, false, "9a6c35db88944f61885f2b38744fe89f", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr2, jVar, changeQuickRedirect2, false, "9a6c35db88944f61885f2b38744fe89f") : (T) jVar.b.get(str);
    }

    public final void a(@NonNull Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f521a4a2d52543ba0ce67d9d458de16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f521a4a2d52543ba0ce67d9d458de16");
            return;
        }
        e eVar = this.e;
        Object[] objArr2 = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "d02643cb2626c0989b9598153a761320", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "d02643cb2626c0989b9598153a761320");
        } else if (obj instanceof com.meituan.android.cube.core.eventhandler.event.a) {
            eVar.b.add((com.meituan.android.cube.core.eventhandler.event.a) obj);
        }
    }
}
