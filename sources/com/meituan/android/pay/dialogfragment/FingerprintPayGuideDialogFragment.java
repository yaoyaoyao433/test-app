package com.meituan.android.pay.dialogfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import com.meituan.android.pay.model.bean.BankInfo;
import com.meituan.android.paybase.common.fragment.MTPayBaseDialogFragment;
import com.meituan.android.paybase.dialog.BaseDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class FingerprintPayGuideDialogFragment extends MTPayBaseDialogFragment {
    public static ChangeQuickRedirect a;
    private BankInfo b;
    private HashMap<String, String> c;

    @Override // com.meituan.android.paybase.fragment.BaseDialogFragment
    public final String a() {
        return "FingerprintPayGuideDialogFragment";
    }

    public static FingerprintPayGuideDialogFragment a(BankInfo bankInfo, HashMap<String, String> hashMap) {
        Object[] objArr = {bankInfo, hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ffda04f6ae9a10c6f2f8696250852835", RobustBitConfig.DEFAULT_VALUE)) {
            return (FingerprintPayGuideDialogFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ffda04f6ae9a10c6f2f8696250852835");
        }
        FingerprintPayGuideDialogFragment fingerprintPayGuideDialogFragment = new FingerprintPayGuideDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("bankInfo", bankInfo);
        bundle.putSerializable("extraData", hashMap);
        fingerprintPayGuideDialogFragment.setArguments(bundle);
        return fingerprintPayGuideDialogFragment;
    }

    @Override // com.meituan.android.paybase.common.fragment.MTPayBaseDialogFragment, com.meituan.android.paybase.fragment.BaseDialogFragment, android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fe9c5a5fb6911f3b4cd863e7785f49a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fe9c5a5fb6911f3b4cd863e7785f49a");
            return;
        }
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.b = (BankInfo) com.sankuai.waimai.platform.utils.f.a(getArguments(), "bankInfo");
            this.c = (HashMap) com.sankuai.waimai.platform.utils.f.a(getArguments(), "extraData");
        }
    }

    @Override // com.meituan.android.paybase.fragment.BaseDialogFragment
    public final BaseDialog a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2017c4168d97625eb2c13c231722f994", RobustBitConfig.DEFAULT_VALUE) ? (BaseDialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2017c4168d97625eb2c13c231722f994") : new FingerprintPayGuideDialog(getActivity(), this.b, this.c);
    }
}
