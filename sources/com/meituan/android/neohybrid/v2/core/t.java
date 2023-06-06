package com.meituan.android.neohybrid.v2.core;

import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class t extends n {
    public static ChangeQuickRedirect n;
    private boolean o;
    private boolean p;

    public t(a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee33e8dc65fa31834ba853660d8a88f2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee33e8dc65fa31834ba853660d8a88f2");
        }
    }

    @Override // com.meituan.android.neohybrid.v2.core.n
    public final void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e071dd6250499f0a1da914fd4490a1d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e071dd6250499f0a1da914fd4490a1d0");
        } else if (this.p || context == null) {
        } else {
            if (!(context instanceof Activity)) {
                Object[] objArr2 = {context};
                ChangeQuickRedirect changeQuickRedirect2 = n;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0e234d279222397335c2303ded1aedfa", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0e234d279222397335c2303ded1aedfa");
                    return;
                } else if (this.e == null) {
                    this.e = new MutableContextWrapper(context.getApplicationContext());
                    return;
                } else {
                    return;
                }
            }
            Object[] objArr3 = {context};
            ChangeQuickRedirect changeQuickRedirect3 = n;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "636e32f3effb05c171df82c960b2c4fa", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "636e32f3effb05c171df82c960b2c4fa");
                return;
            }
            ((MutableContextWrapper) this.e).setBaseContext(context);
            com.meituan.android.neohybrid.framework.webcompat.b bVar = this.d;
            if (bVar != null) {
                bVar.a((Activity) context);
            }
            this.c = null;
            this.p = true;
        }
    }

    @Override // com.meituan.android.neohybrid.v2.core.n
    public final View a(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee24351d9a8c93cd88f718eff9d0b4be", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee24351d9a8c93cd88f718eff9d0b4be");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b64a4c974b48922afeefdde5a05dd423", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b64a4c974b48922afeefdde5a05dd423");
        } else {
            n();
        }
    }

    @Override // com.meituan.android.neohybrid.v2.core.n
    public final void n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "607648ccf87baf5bba7435cb9bbd8424", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "607648ccf87baf5bba7435cb9bbd8424");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3111f7f0216164cc9b3d028f590e6776", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3111f7f0216164cc9b3d028f590e6776");
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
