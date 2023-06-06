package com.meituan.android.paybase.common.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import com.meituan.android.paybase.common.activity.PayBaseActivity;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.common.analyse.b;
import com.meituan.android.paybase.fragment.BaseFragment;
import com.meituan.android.paybase.utils.MTPaySuppressFBWarnings;
import com.meituan.android.paybase.utils.ak;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class PayBaseFragment extends BaseFragment {
    public static ChangeQuickRedirect w;
    @MTPaySuppressFBWarnings({"URF_UNREAD_PUBLIC_OR_PROTECTED_FIELD"})
    protected String x;

    public boolean E_() {
        return false;
    }

    @Override // com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "459cde2ecdb031c896e4886c43ecd046", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "459cde2ecdb031c896e4886c43ecd046");
            return;
        }
        super.onCreate(bundle);
        this.x = a.a(this);
        a.b(this.x, d());
    }

    @Override // com.meituan.android.paybase.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18589b2b140cce5ae1ecdc51a818fe1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18589b2b140cce5ae1ecdc51a818fe1c");
            return;
        }
        super.onResume();
        if (E_()) {
            return;
        }
        String d = d();
        a.a(this.x, d);
        a.a(this.x, d, e());
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4af1db5b7af6be33d8677ff63f258549", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4af1db5b7af6be33d8677ff63f258549");
            return;
        }
        super.onPause();
        if (E_()) {
            return;
        }
        a.b(this.x, d(), e());
    }

    public void showProgress() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65cf9cc63ae74b3756a7c056db5ef78b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65cf9cc63ae74b3756a7c056db5ef78b");
        } else if (isAdded()) {
            ((PayBaseActivity) getActivity()).showProgress();
        }
    }

    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3cb1e05c4869819c5ef99e79d256ba5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3cb1e05c4869819c5ef99e79d256ba5");
        } else if (isAdded()) {
            ((PayBaseActivity) getActivity()).b(z);
        }
    }

    public void hideProgress() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a0035a13b47c9c7e63ce34917d1c180", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a0035a13b47c9c7e63ce34917d1c180");
        } else if (isAdded()) {
            ((PayBaseActivity) getActivity()).hideProgress();
        }
    }

    public String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2780629011160d35453b4d61d64e7653", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2780629011160d35453b4d61d64e7653");
        }
        String str = CommonConstant.Symbol.UNDERLINE + getClass().getSimpleName();
        if (getParentFragment() instanceof PayBaseFragment) {
            return ((PayBaseFragment) getParentFragment()).d() + str;
        } else if (getParentFragment() instanceof MTPayBaseDialogFragment) {
            return ((MTPayBaseDialogFragment) getParentFragment()).b() + str;
        } else if (getActivity() instanceof PayBaseActivity) {
            return ((PayBaseActivity) getActivity()).e() + str;
        } else {
            return str;
        }
    }

    public HashMap<String, Object> e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "210acf2a2f9b0731f56ff8422ee60d7e", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "210acf2a2f9b0731f56ff8422ee60d7e");
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        b.a(hashMap);
        return hashMap;
    }

    public final String r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = w;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e19650cd494406f1df7b2fbe5abd3fe", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e19650cd494406f1df7b2fbe5abd3fe") : ak.a(getActivity());
    }
}
