package com.sankuai.waimai.store;

import android.content.Context;
import android.os.Bundle;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.SGCommonRNFragment;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WhiteLoadingRNFragment extends SGCommonRNFragment {
    public static ChangeQuickRedirect a;
    public Runnable b;
    private String k;

    public static WhiteLoadingRNFragment a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "54aba86473f4e19f99716c1a06f4063e", RobustBitConfig.DEFAULT_VALUE)) {
            return (WhiteLoadingRNFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "54aba86473f4e19f99716c1a06f4063e");
        }
        Bundle bundle = new Bundle();
        WhiteLoadingRNFragment whiteLoadingRNFragment = new WhiteLoadingRNFragment();
        bundle.putString("mrn_biz", str);
        bundle.putString("mrn_entry", str2);
        bundle.putString("mrn_component", str3);
        whiteLoadingRNFragment.setArguments(bundle);
        return whiteLoadingRNFragment;
    }

    @Override // com.sankuai.waimai.store.base.SGCommonRNFragment, com.meituan.android.mrn.container.MRNBaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "319e02f12b8237261e1926623405cad7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "319e02f12b8237261e1926623405cad7");
            return;
        }
        super.onCreate(bundle);
        this.k = a("is_opacity_load", "0");
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, com.meituan.android.mrn.container.b
    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "653d06178a02b97728719e6674819b90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "653d06178a02b97728719e6674819b90");
            return;
        }
        super.i();
        if (getView() != null) {
            getView().setBackgroundColor(s() ? 0 : -1);
        }
    }

    @Override // com.sankuai.waimai.store.base.SGCommonRNFragment, com.meituan.android.mrn.container.MRNBaseFragment
    public final View a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21714df3e5adf2ccd65043a2d768d171", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21714df3e5adf2ccd65043a2d768d171");
        }
        if (s()) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.wm_st_common_view_progress_round, (ViewGroup) null);
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            linearLayout.setGravity(17);
            linearLayout.setBackgroundColor(0);
            linearLayout.addView(inflate);
            return linearLayout;
        }
        return super.a(context);
    }

    private boolean s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf72956c13b53d5964cd18480be03de9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf72956c13b53d5964cd18480be03de9")).booleanValue() : TextUtils.equals(this.k, "1");
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, com.meituan.android.mrn.container.b
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "819080940134826b86db74f696b731df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "819080940134826b86db74f696b731df");
        } else if (s() && this.b != null) {
            this.b.run();
        } else {
            super.e();
            if (getView() != null) {
                getView().setBackgroundColor(0);
            }
        }
    }

    @Override // com.meituan.android.mrn.container.MRNBaseFragment, com.meituan.android.mrn.container.b
    public final void f() {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a996ef37c16bcae3b351e791cfd7874", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a996ef37c16bcae3b351e791cfd7874");
            return;
        }
        super.f();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b2b0dddfa2d21743661bef3dfbc16c3d", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b2b0dddfa2d21743661bef3dfbc16c3d")).booleanValue();
        } else {
            String a2 = a("is_transparent_root", "1");
            z = TextUtils.isEmpty(a2) || TextUtils.equals(a2, "1");
        }
        if (!z || getView() == null) {
            return;
        }
        getView().setBackgroundColor(0);
    }
}
