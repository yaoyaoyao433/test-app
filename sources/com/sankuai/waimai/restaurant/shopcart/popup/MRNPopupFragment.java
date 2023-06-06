package com.sankuai.waimai.restaurant.shopcart.popup;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.i;
import com.meituan.android.mrn.container.MRNBaseFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MRNPopupFragment extends MRNBaseFragment {
    public static ChangeQuickRedirect a;
    public a b;
    public b c;
    private View g;
    private View h;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        List<i> a();
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, com.meituan.android.mrn.container.b
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0aa99b5365a909f20fd730981d144324", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0aa99b5365a909f20fd730981d144324");
        }
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, com.meituan.android.mrn.container.b
    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbb88b26fcc3078e7cb7f06969fa78ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbb88b26fcc3078e7cb7f06969fa78ae");
        }
    }

    public static MRNPopupFragment a(String str, String str2, String str3, Bundle... bundleArr) {
        Object[] objArr = {str, str2, str3, bundleArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "10fed1162f1ba4cb731edb3cd19c5a00", RobustBitConfig.DEFAULT_VALUE)) {
            return (MRNPopupFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "10fed1162f1ba4cb731edb3cd19c5a00");
        }
        Bundle bundle = new Bundle();
        MRNPopupFragment mRNPopupFragment = new MRNPopupFragment();
        bundle.putString("mrn_biz", str);
        bundle.putString("mrn_entry", str2);
        bundle.putString("mrn_component", str3);
        for (int i = 0; i <= 0; i++) {
            Bundle bundle2 = bundleArr[0];
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
        }
        mRNPopupFragment.setArguments(bundle);
        return mRNPopupFragment;
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9146ae867d6a8d9331907a6ca1d17662", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9146ae867d6a8d9331907a6ca1d17662");
        }
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (this.g != null) {
            this.g.setVisibility(8);
        }
        return onCreateView;
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment
    public final View a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a899cdbc6f349bf69475417faf5914ee", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a899cdbc6f349bf69475417faf5914ee");
        }
        this.g = LayoutInflater.from(context).inflate(R.layout.wm_common_mrn_popup_loading_error_blank_view, (ViewGroup) null);
        return this.g;
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment
    public final View c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d8e0220c0ff6d9748f07a44e8185c29", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d8e0220c0ff6d9748f07a44e8185c29");
        }
        this.h = LayoutInflater.from(context).inflate(R.layout.wm_common_mrn_popup_loading_error_blank_view, (ViewGroup) null);
        return this.h;
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment
    public final Uri m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c38cccc7bbbf538d69f7026476366332", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c38cccc7bbbf538d69f7026476366332");
        }
        Uri.Builder builder = new Uri.Builder();
        if (getArguments() != null) {
            builder.appendQueryParameter("mrn_biz", getArguments().getString("mrn_biz"));
            builder.appendQueryParameter("mrn_entry", getArguments().getString("mrn_entry"));
            builder.appendQueryParameter("mrn_component", getArguments().getString("mrn_component"));
        }
        return builder.build();
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, com.meituan.android.mrn.container.b
    public final List<i> d() {
        List<i> a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "edaab7cc782b7466d3fbd51e5e72c61e", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "edaab7cc782b7466d3fbd51e5e72c61e");
        }
        List<i> d = super.d();
        ArrayList arrayList = new ArrayList();
        if (this.c != null && (a2 = this.c.a()) != null) {
            arrayList.addAll(a2);
        }
        if (d != null) {
            arrayList.addAll(d);
        }
        return arrayList;
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, com.meituan.android.mrn.container.b
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "816bc94838246ceefcd3e66a9ade92c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "816bc94838246ceefcd3e66a9ade92c7");
            return;
        }
        super.f();
        if (this.b != null) {
            this.b.a();
        }
    }
}
