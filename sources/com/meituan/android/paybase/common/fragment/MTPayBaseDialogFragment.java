package com.meituan.android.paybase.common.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import com.meituan.android.paybase.common.activity.PayBaseActivity;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.common.analyse.b;
import com.meituan.android.paybase.fragment.BaseDialogFragment;
import com.meituan.android.paybase.utils.MTPaySuppressFBWarnings;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class MTPayBaseDialogFragment extends BaseDialogFragment {
    public static ChangeQuickRedirect h;
    @MTPaySuppressFBWarnings({"URF_UNREAD_PUBLIC_OR_PROTECTED_FIELD"})
    protected String i;

    @Override // com.meituan.android.paybase.fragment.BaseDialogFragment, android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e17b6c755753fc772ba3540f3f64b3ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e17b6c755753fc772ba3540f3f64b3ed");
            return;
        }
        super.onCreate(bundle);
        this.i = a.a(this);
        a.b(this.i, b());
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5bc9795c3cd17c19cffb4ec787a70e86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5bc9795c3cd17c19cffb4ec787a70e86");
            return;
        }
        super.onResume();
        String b = b();
        a.a(this.i, b);
        a.a(this.i, b, c());
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30c04da89eb35301ae1e410d75250500", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30c04da89eb35301ae1e410d75250500");
            return;
        }
        super.onPause();
        a.b(this.i, b(), c());
    }

    public String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59b46bf54ca321d6545257eb08be4fb8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59b46bf54ca321d6545257eb08be4fb8");
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

    public HashMap<String, Object> c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61bc1098210fed6e974cdefb6e4d2c58", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61bc1098210fed6e974cdefb6e4d2c58");
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        b.a(hashMap);
        return hashMap;
    }
}
