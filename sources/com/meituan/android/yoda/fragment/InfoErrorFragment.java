package com.meituan.android.yoda.fragment;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.android.yoda.retrofit.Error;
import com.meituan.android.yoda.widget.view.BaseButton;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class InfoErrorFragment extends BaseFragment {
    public static ChangeQuickRedirect o = null;
    private static String q = null;
    private static int r = -1;
    private TextView p;

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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db4cd8ed877b15bce8a14851c670c9e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db4cd8ed877b15bce8a14851c670c9e1");
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfd7e901cac434e06e9330d59fca50a6", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfd7e901cac434e06e9330d59fca50a6") : layoutInflater.inflate(R.layout.yoda_fragment_infoerror, viewGroup, false);
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment, android.support.v4.app.Fragment
    public final void onViewCreated(View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4e7d1692081ad6a157d55e43a2d0da4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4e7d1692081ad6a157d55e43a2d0da4");
            return;
        }
        super.onViewCreated(view, bundle);
        Object[] objArr2 = {view};
        ChangeQuickRedirect changeQuickRedirect2 = o;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d2a6bd24acbee7033f8bb8c252cc9b59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d2a6bd24acbee7033f8bb8c252cc9b59");
            return;
        }
        this.p = (TextView) view.findViewById(R.id.yoda_error_textView1);
        this.p.setText(q);
        a(view, R.id.yoda_error_choose_other_type, "b_eidl1in8", (com.meituan.android.yoda.interfaces.e) null);
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final View a(@NonNull View view, @IdRes int i, String str, com.meituan.android.yoda.interfaces.e eVar) {
        Object[] objArr = {view, Integer.valueOf(i), str, eVar};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "702e7302ca3028fd63c1970199c40c7e", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "702e7302ca3028fd63c1970199c40c7e");
        }
        if (this.f == null || this.f.f.a() <= 1) {
            return null;
        }
        BaseButton baseButton = (BaseButton) view.findViewById(i);
        baseButton.e(this.e).a(this.l).d(this.d).c(str);
        a(baseButton, str);
        baseButton.a();
        if (!com.meituan.android.yoda.config.ui.d.a().a()) {
            baseButton.setTextColor(com.meituan.android.yoda.config.ui.d.a().j());
        }
        baseButton.setOnClickListener(f.a(this, eVar));
        return baseButton;
    }

    public static /* synthetic */ void a(InfoErrorFragment infoErrorFragment, com.meituan.android.yoda.interfaces.e eVar, View view) {
        Object[] objArr = {infoErrorFragment, eVar, view};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "98112d05d46103b5806f3ce932a1cb46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "98112d05d46103b5806f3ce932a1cb46");
            return;
        }
        if (eVar != null) {
            eVar.a();
        }
        if (infoErrorFragment.i != null) {
            infoErrorFragment.i.b(infoErrorFragment.d, r, null);
        }
    }

    public static void i(String str) {
        q = str;
    }

    public static void b(int i) {
        r = i;
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd8c45e25142a52b6e3c78df33f2ca24", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd8c45e25142a52b6e3c78df33f2ca24");
        } else {
            this.p.setText(q);
        }
    }

    @Override // com.meituan.android.yoda.fragment.BaseFragment
    public final String e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c5be6460021e42838d6e6931beda0e0", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c5be6460021e42838d6e6931beda0e0") : getClass().getName();
    }
}
