package com.meituan.android.pay.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.paybase.common.fragment.PayBaseFragment;
import com.meituan.android.paycommon.lib.fragment.HalfPageFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class VerifyFingerprintFragment extends PayBaseFragment implements com.meituan.android.neohybrid.core.listener.b {
    public static ChangeQuickRedirect a;
    private String b;
    private int c;
    private String d;
    private com.meituan.android.pay.process.ntv.pay.n e;

    @Override // com.meituan.android.neohybrid.core.listener.b
    public final boolean D_() {
        return false;
    }

    public static VerifyFingerprintFragment a(int i, String str, String str2) {
        Object[] objArr = {Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "01571515373401b4a9d3e21688edb09a", RobustBitConfig.DEFAULT_VALUE)) {
            return (VerifyFingerprintFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "01571515373401b4a9d3e21688edb09a");
        }
        VerifyFingerprintFragment verifyFingerprintFragment = new VerifyFingerprintFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("fingerType", i);
        bundle.putString("challenge", str);
        bundle.putString(KnbConstants.PARAMS_SCENE, str2);
        verifyFingerprintFragment.setArguments(bundle);
        return verifyFingerprintFragment;
    }

    @Override // com.meituan.android.paybase.common.fragment.PayBaseFragment, com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "801622ad756170ac3195705f61b4ac95", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "801622ad756170ac3195705f61b4ac95");
            return;
        }
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.b = getArguments().getString("challenge");
            this.c = getArguments().getInt("fingerType");
            this.d = getArguments().getString(KnbConstants.PARAMS_SCENE);
        }
    }

    @Override // com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df16fceaf9874ae815401e4f8b52a9e1", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df16fceaf9874ae815401e4f8b52a9e1") : layoutInflater.inflate(R.layout.mpay__fingerprint_verify, viewGroup, false);
    }

    @Override // com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89844b32656b77543b02cb6e7b85be45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89844b32656b77543b02cb6e7b85be45");
            return;
        }
        super.onViewCreated(view, bundle);
        this.e = com.meituan.android.pay.process.ntv.pay.n.a();
        this.e.d = this.b;
        this.e.b = this.c;
        this.e.c = this.d;
        this.e.b();
    }

    @Override // com.meituan.android.paybase.common.fragment.PayBaseFragment, com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6dedbb54e8deebca0147bc51c55521f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6dedbb54e8deebca0147bc51c55521f5");
            return;
        }
        this.e = com.meituan.android.pay.process.ntv.pay.n.a();
        this.e.b();
        super.onResume();
    }

    @Override // com.meituan.android.paybase.common.fragment.PayBaseFragment, android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f63896b427ece2929331dd1fe9ca897c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f63896b427ece2929331dd1fe9ca897c");
            return;
        }
        this.e.c();
        super.onPause();
    }

    @Override // com.meituan.android.paybase.fragment.BaseFragment
    public final boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be488bd798f090116961891a5921fe75", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be488bd798f090116961891a5921fe75")).booleanValue();
        }
        this.e.c();
        if (com.meituan.android.pay.desk.component.data.a.a((Activity) null)) {
            com.meituan.android.pay.utils.k.a().c.callBackFingerprintData(2, false, null);
            return true;
        }
        List<Fragment> fragments = getActivity().getSupportFragmentManager().getFragments();
        if (!com.meituan.android.paybase.utils.i.a((Collection) fragments)) {
            for (Fragment fragment : fragments) {
                if (fragment instanceof HalfPageFragment) {
                    ((HalfPageFragment) fragment).h();
                }
            }
        }
        return super.h();
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10d2d58fdd93f8f823a76acccde2700e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10d2d58fdd93f8f823a76acccde2700e");
            return;
        }
        if (com.meituan.android.pay.desk.component.data.a.a((Activity) null)) {
            com.meituan.android.pay.desk.component.data.a.b = false;
            com.meituan.android.pay.analyse.a.a();
        }
        super.onDestroy();
    }
}
