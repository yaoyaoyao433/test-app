package com.meituan.android.yoda.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.yoda.retrofit.Error;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class CustomerServicesFragment extends BaseFragment {
    public static ChangeQuickRedirect o;

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final void a(boolean z) {
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final void b(String str) {
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final void b(String str, Error error) {
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final void b(String str, String str2) {
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final void c(String str, int i, @Nullable Bundle bundle) {
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final void d(String str, int i, @Nullable Bundle bundle) {
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final void f() {
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final int g() {
        return 0;
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment, android.support.v4.app.Fragment
    public final void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f9a2e851ae8c83e2b1680abe18d763d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f9a2e851ae8c83e2b1680abe18d763d");
            return;
        }
        super.onCreate(bundle);
        if (getParentFragment() == null) {
            setRetainInstance(true);
        }
    }

    @Override // android.support.v4.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = o;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7552f46e97d7651159c7d71cc38981d", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7552f46e97d7651159c7d71cc38981d") : layoutInflater.inflate(R.layout.yoda_fragment_customerservices, viewGroup, false);
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final String e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fc0f55413bb0536f6ce9ed7e977e824", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fc0f55413bb0536f6ce9ed7e977e824") : getClass().getName();
    }
}
