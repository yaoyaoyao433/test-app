package com.meituan.android.neohybrid.core;

import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.meituan.android.neohybrid.core.horn.bean.NeoHornConfig;
import com.meituan.android.neohybrid.neo.nsr.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBWebCompat;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class u extends n implements c.b {
    public static ChangeQuickRedirect o;
    private boolean p;
    private boolean q;

    @Override // com.meituan.android.neohybrid.neo.nsr.c.b
    public final void c(String str) {
    }

    @Override // com.meituan.android.neohybrid.neo.nsr.c.b
    public final void e(String str) {
    }

    public u(a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0de24dc96a202081d98e6b7599a0bc2c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0de24dc96a202081d98e6b7599a0bc2c");
        } else {
            aVar.a(this);
        }
    }

    @Override // com.meituan.android.neohybrid.core.n
    public final void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8bda2bc2e678e2e2e820e8cd197b101", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8bda2bc2e678e2e2e820e8cd197b101");
        } else if (this.q || context == null) {
        } else {
            if (this.e == null) {
                this.e = new MutableContextWrapper(context.getApplicationContext());
            }
            if (context instanceof Activity) {
                ((MutableContextWrapper) this.e).setBaseContext(context);
                KNBWebCompat kNBWebCompat = this.d;
                if (kNBWebCompat != null) {
                    kNBWebCompat.setActivity((Activity) context);
                }
                this.q = true;
            }
        }
    }

    @Override // com.meituan.android.neohybrid.core.n
    public final void d(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27983866152b139568b2ef891fed318c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27983866152b139568b2ef891fed318c");
            return;
        }
        super.d(bundle);
        com.meituan.android.neohybrid.neo.tunnel.a.a().a(this.b, "neo_nsr", "1");
        a aVar = this.b;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "f9194bf29494c46b590661ef35ad32bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "f9194bf29494c46b590661ef35ad32bb");
            return;
        }
        for (c.a aVar2 : aVar.j) {
            aVar2.onBusinessProcess();
        }
        aVar.j.clear();
    }

    @Override // com.meituan.android.neohybrid.core.n
    public final View a(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d45118a31f33631762caed2a108e5e79", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d45118a31f33631762caed2a108e5e79");
        }
        if (this.g == null) {
            return super.a(layoutInflater, viewGroup);
        }
        return this.f;
    }

    @Override // com.meituan.android.neohybrid.core.n
    public final void a(@Nullable Bundle bundle) {
        WebView j;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "584339eac65bcef3df0143f7644f99bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "584339eac65bcef3df0143f7644f99bc");
            return;
        }
        n();
        if (((NeoHornConfig) com.meituan.android.neohybrid.core.horn.a.a().a(NeoHornConfig.class)).isDisableOverScroll() || (j = j()) == null || j.getOverScrollMode() == 2) {
            return;
        }
        j.setOverScrollMode(2);
    }

    @Override // com.meituan.android.neohybrid.core.n
    public final void n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c568b648c071624d2a90ef3f824e2af8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c568b648c071624d2a90ef3f824e2af8");
        } else if (this.p) {
        } else {
            this.p = true;
            super.n();
        }
    }

    @Override // com.meituan.android.neohybrid.core.n
    public final Activity i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7c4162b9f27cbe302081fea01d624d7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7c4162b9f27cbe302081fea01d624d7");
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
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8182c72380004ac6727134b28f702782", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8182c72380004ac6727134b28f702782");
        } else {
            this.b.a(i, str2);
        }
    }
}
