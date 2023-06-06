package com.meituan.android.paybase.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.paybase.metrics.a;
import com.meituan.android.paybase.utils.MTPayBaseClass;
import com.meituan.android.paybase.utils.aa;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@MTPayBaseClass
/* loaded from: classes2.dex */
public class BaseFragment extends Fragment {
    public static ChangeQuickRedirect y;

    public boolean h() {
        return false;
    }

    @Override // android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37fd4a60f277a1d793773aea3a68b764", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37fd4a60f277a1d793773aea3a68b764");
            return;
        }
        a.a(getClass().getName(), "onCreate");
        super.onCreate(bundle);
        if (bundle != null) {
            aa.b(this, getClass(), bundle);
        }
    }

    @Override // android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6a9583c280755cd3a792970cfa4a0ed", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6a9583c280755cd3a792970cfa4a0ed");
        }
        a.c(getClass().getName(), "onCreateView");
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18edfa70ed849bb916f55abf34a94c6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18edfa70ed849bb916f55abf34a94c6b");
            return;
        }
        a.c(getClass().getName(), "onViewCreated");
        super.onViewCreated(view, bundle);
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc364593feed71a7a471ce3a592edb97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc364593feed71a7a471ce3a592edb97");
            return;
        }
        a.c(getClass().getName(), "onActivityCreated");
        super.onActivityCreated(bundle);
    }

    @Override // android.support.v4.app.Fragment
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73104fc01001496d20258781ee0f74c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73104fc01001496d20258781ee0f74c6");
            return;
        }
        a.c(getClass().getName(), "onStart");
        super.onStart();
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7137f8d7f046b9a2ea10e32cb3b0b312", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7137f8d7f046b9a2ea10e32cb3b0b312");
            return;
        }
        a.c(getClass().getName(), "onResume");
        a.b(getClass().getName());
        super.onResume();
    }

    @Override // android.support.v4.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad4b30d502d7084cb7243cef0916ea78", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad4b30d502d7084cb7243cef0916ea78");
            return;
        }
        aa.a(this, getClass(), bundle);
        super.onSaveInstanceState(bundle);
    }
}
