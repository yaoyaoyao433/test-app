package com.meituan.android.neohybrid.v2.core;

import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.neohybrid.neo.nsr.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class s extends n implements c.b {
    public static ChangeQuickRedirect n;
    private boolean o;
    private boolean p;

    @Override // com.meituan.android.neohybrid.neo.nsr.c.b
    public final void c(String str) {
    }

    @Override // com.meituan.android.neohybrid.neo.nsr.c.b
    public final void e(String str) {
    }

    public s(a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cf8a9b4c8925463473c42d2a81f15aa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cf8a9b4c8925463473c42d2a81f15aa");
            return;
        }
        c.b[] bVarArr = {this};
        Object[] objArr2 = {bVarArr};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "7721aadc97bc4a058116f9746d023149", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "7721aadc97bc4a058116f9746d023149");
            return;
        }
        for (int i = 0; i <= 0; i++) {
            c.b bVar = bVarArr[0];
            if (bVar != null) {
                aVar.h.add(bVar);
            }
        }
    }

    @Override // com.meituan.android.neohybrid.v2.core.n
    public final void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "362210b7df9c23239cbda50e955ae6fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "362210b7df9c23239cbda50e955ae6fb");
        } else if (this.p || context == null) {
        } else {
            if (this.e == null) {
                this.e = new MutableContextWrapper(context.getApplicationContext());
            }
            if (context instanceof Activity) {
                ((MutableContextWrapper) this.e).setBaseContext(context);
                com.meituan.android.neohybrid.framework.webcompat.b bVar = this.d;
                if (bVar != null) {
                    bVar.a((Activity) context);
                }
                this.p = true;
            }
        }
    }

    @Override // com.meituan.android.neohybrid.v2.core.n
    public final void d(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a27d41542f68270ff8d1b02dba18e004", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a27d41542f68270ff8d1b02dba18e004");
            return;
        }
        super.d(bundle);
        com.meituan.android.neohybrid.v2.neo.tunnel.a.a().a(this.b, "neo_nsr", "1");
        a aVar = this.b;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "66c8146df651eb8efad3450f09f05f0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "66c8146df651eb8efad3450f09f05f0a");
            return;
        }
        for (c.a aVar2 : aVar.i) {
            aVar2.onBusinessProcess();
        }
        aVar.i.clear();
    }

    @Override // com.meituan.android.neohybrid.v2.core.n
    public final View a(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b95af251f3489ebc72d77c20ff22b193", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b95af251f3489ebc72d77c20ff22b193");
        }
        if (this.g == null) {
            return super.a(layoutInflater, viewGroup);
        }
        return this.f;
    }

    @Override // com.meituan.android.neohybrid.v2.core.n
    public final void a(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7e3cf771116568c0df266d124ea117c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7e3cf771116568c0df266d124ea117c");
        } else {
            n();
        }
    }

    @Override // com.meituan.android.neohybrid.v2.core.n
    public final void n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b24424fb98e0e512d9e9293193798c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b24424fb98e0e512d9e9293193798c6");
        } else if (this.o) {
        } else {
            this.o = true;
            super.n();
        }
    }

    @Override // com.meituan.android.neohybrid.v2.core.n
    public final Activity i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da015e7ec93b22d004ca2bf219ba677b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da015e7ec93b22d004ca2bf219ba677b");
        }
        Context context = this.e;
        if (context instanceof MutableContextWrapper) {
            context = ((MutableContextWrapper) this.e).getBaseContext();
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        return null;
    }

    @Override // com.meituan.android.neohybrid.neo.nsr.c.b
    public final void d(String str) {
        this.c = null;
    }

    @Override // com.meituan.android.neohybrid.neo.nsr.c.b
    public final void b(String str, int i, String str2) {
        Object[] objArr = {str, Integer.valueOf(i), str2};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "986a456e73fcc89026900966a230b697", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "986a456e73fcc89026900966a230b697");
        } else {
            this.b.a(i, str2);
        }
    }
}
