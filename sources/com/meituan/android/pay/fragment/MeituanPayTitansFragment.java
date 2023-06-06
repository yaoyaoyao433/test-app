package com.meituan.android.pay.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.webview.PayBaseWebViewWithTitansFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MeituanPayTitansFragment extends PayBaseWebViewWithTitansFragment {
    public static ChangeQuickRedirect a;
    public View b;
    private boolean f;

    public MeituanPayTitansFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0b91d31a2f1c62cc5d7783d6e153942", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0b91d31a2f1c62cc5d7783d6e153942");
        } else {
            this.f = false;
        }
    }

    @Override // com.meituan.android.paybase.webview.PayBaseWebViewWithTitansFragment, com.meituan.android.paybase.common.fragment.PayBaseFragment, com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8813b34be4c3a7af209c74ce48345950", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8813b34be4c3a7af209c74ce48345950");
        } else {
            super.onCreate(bundle);
        }
    }

    @Override // com.meituan.android.paybase.webview.PayBaseWebViewWithTitansFragment, com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "137a458b4db38f38d6e707a7c310450e", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "137a458b4db38f38d6e707a7c310450e");
        }
        this.b = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.b.setBackgroundResource(R.color.white);
        if (bundle != null) {
            this.b.setVisibility(0);
            com.meituan.android.paybase.common.analyse.a.a("b_pay_5y5irc49_mc", new a.c().a("hybrid", "fragment被销毁后恢复").b);
        } else {
            this.b.setVisibility(8);
        }
        if (this.e != null && this.e.getTitleBarHost() != null) {
            this.e.getTitleBarHost().showProgressBar(false);
        }
        return this.b;
    }

    @Override // com.meituan.android.paybase.webview.PayBaseWebViewWithTitansFragment, com.sankuai.meituan.android.knb.listener.OnWebClientListener
    public void onPageFinished(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d2e64ec82c8beb7b254dd5f39602beb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d2e64ec82c8beb7b254dd5f39602beb");
            return;
        }
        super.onPageFinished(str);
        if (this.f) {
            return;
        }
        com.meituan.android.paybase.common.analyse.a.a("b_pay_ry7q1y3p_mc", new a.c().a("url", str).b);
        com.meituan.android.paybase.metrics.a.c("tti_contract_pay_hybrid_view", "url_load_success");
        this.f = true;
    }

    @Override // com.meituan.android.paybase.webview.PayBaseWebViewWithTitansFragment, com.sankuai.meituan.android.knb.listener.OnWebClientListener
    public boolean shouldOverrideUrlLoading(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61d5c3a3e0bb515fd8257d965f5f0a96", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61d5c3a3e0bb515fd8257d965f5f0a96")).booleanValue() : super.shouldOverrideUrlLoading(str);
    }

    @Override // com.meituan.android.paybase.webview.PayBaseWebViewWithTitansFragment, com.meituan.android.paybase.common.fragment.PayBaseFragment, android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ac9b91350c2c9f423796044b42ab523", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ac9b91350c2c9f423796044b42ab523");
            return;
        }
        super.onPause();
        com.meituan.android.paybase.utils.ab.a((Activity) getActivity());
    }

    @Override // com.meituan.android.paybase.webview.PayBaseWebViewWithTitansFragment, com.sankuai.meituan.android.knb.listener.OnWebClientListener
    public void onReceivedError(int i, String str, String str2) {
        Object[] objArr = {Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7e69052dbcd30f47e1345e757059bae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7e69052dbcd30f47e1345e757059bae");
        } else {
            super.onReceivedError(i, str, str2);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroyView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31e5b1c88bca0c20e2c4157eeb40826a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31e5b1c88bca0c20e2c4157eeb40826a");
        } else {
            super.onDestroyView();
        }
    }

    @Override // com.meituan.android.paybase.webview.PayBaseWebViewWithTitansFragment, com.meituan.android.paybase.fragment.BaseFragment
    public final boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ffa070d7dba20117038767034125f8b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ffa070d7dba20117038767034125f8b")).booleanValue() : super.h();
    }

    public static MeituanPayTitansFragment a(@NonNull FragmentActivity fragmentActivity, int i, String str) {
        MeituanPayTitansFragment meituanPayTitansFragment;
        Object[] objArr = {fragmentActivity, Integer.valueOf((int) R.id.content), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1242c9a78ab6e623996a6804d5b08344", RobustBitConfig.DEFAULT_VALUE)) {
            return (MeituanPayTitansFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1242c9a78ab6e623996a6804d5b08344");
        }
        FragmentTransaction beginTransaction = fragmentActivity.getSupportFragmentManager().beginTransaction();
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "190f0243b8d0ee0dff915784bd62ff56", RobustBitConfig.DEFAULT_VALUE)) {
            meituanPayTitansFragment = (MeituanPayTitansFragment) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "190f0243b8d0ee0dff915784bd62ff56");
        } else {
            MeituanPayTitansFragment meituanPayTitansFragment2 = new MeituanPayTitansFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("url", str);
            meituanPayTitansFragment2.setArguments(bundle);
            meituanPayTitansFragment = meituanPayTitansFragment2;
        }
        beginTransaction.add(R.id.content, meituanPayTitansFragment);
        beginTransaction.addToBackStack(null);
        beginTransaction.commitAllowingStateLoss();
        return meituanPayTitansFragment;
    }

    @Override // com.meituan.android.paybase.webview.PayBaseWebViewWithTitansFragment, com.meituan.android.paybase.common.fragment.PayBaseFragment
    public final HashMap<String, Object> e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7adbd79b6f6fb8ad6fe579e74f80433e", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7adbd79b6f6fb8ad6fe579e74f80433e");
        }
        HashMap<String, Object> e = super.e();
        e.put("nb_container", "hybrid");
        return e;
    }
}
