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
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBWebCompat;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class v extends n {
    public static ChangeQuickRedirect o;
    private boolean p;
    private boolean q;

    public v(a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b061a685e636b394975d0a47d5c3ea7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b061a685e636b394975d0a47d5c3ea7");
        }
    }

    @Override // com.meituan.android.neohybrid.core.n
    public final void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ef7469474b3918be627f9ee1f6f8254", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ef7469474b3918be627f9ee1f6f8254");
        } else if (this.q || context == null) {
        } else {
            if (!(context instanceof Activity)) {
                Object[] objArr2 = {context};
                ChangeQuickRedirect changeQuickRedirect2 = o;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "89f1435f3e11ec9993b80fcae7b3a644", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "89f1435f3e11ec9993b80fcae7b3a644");
                    return;
                } else if (this.e == null) {
                    this.e = new MutableContextWrapper(context.getApplicationContext());
                    return;
                } else {
                    return;
                }
            }
            Object[] objArr3 = {context};
            ChangeQuickRedirect changeQuickRedirect3 = o;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "50316ecfb98ecc44dcd0a69b5a324ccc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "50316ecfb98ecc44dcd0a69b5a324ccc");
                return;
            }
            ((MutableContextWrapper) this.e).setBaseContext(context);
            KNBWebCompat kNBWebCompat = this.d;
            if (kNBWebCompat != null) {
                kNBWebCompat.setActivity((Activity) context);
            }
            this.c = null;
            this.q = true;
        }
    }

    @Override // com.meituan.android.neohybrid.core.n
    public final View a(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "183c7c986f2e07bbb249908b20f403c7", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "183c7c986f2e07bbb249908b20f403c7");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3050fa2476ecc2780af1405b1ec9ac1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3050fa2476ecc2780af1405b1ec9ac1d");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "754a83f9d7b22fc36c76136452d2e7ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "754a83f9d7b22fc36c76136452d2e7ad");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "969baf6ee86e3f82823ad9c497c94a62", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "969baf6ee86e3f82823ad9c497c94a62");
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
}
