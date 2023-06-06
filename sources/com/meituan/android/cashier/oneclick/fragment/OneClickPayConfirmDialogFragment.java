package com.meituan.android.cashier.oneclick.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import com.meituan.android.cashier.oneclick.dialog.OneClickPayConfirmDialog;
import com.meituan.android.cashier.oneclick.model.bean.OpenOneClickPay;
import com.meituan.android.paybase.common.fragment.MTPayBaseDialogFragment;
import com.meituan.android.paybase.dialog.BaseDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.f;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class OneClickPayConfirmDialogFragment extends MTPayBaseDialogFragment {
    public static ChangeQuickRedirect a;
    OneClickPayConfirmDialog.b b;
    private String c;
    private OpenOneClickPay d;

    @Override // com.meituan.android.paybase.fragment.BaseDialogFragment
    public final String a() {
        return "OneClickPayConfirmDialogFragment";
    }

    @Override // com.meituan.android.paybase.common.fragment.MTPayBaseDialogFragment
    public final String b() {
        return "c_pay_ohbr8ry1";
    }

    @Override // com.meituan.android.paybase.fragment.BaseDialogFragment
    public final BaseDialog a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31fb64488617667df067a2d59caf99f6", RobustBitConfig.DEFAULT_VALUE)) {
            return (BaseDialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31fb64488617667df067a2d59caf99f6");
        }
        setCancelable(false);
        return new OneClickPayConfirmDialog(getActivity(), this.d, this.b);
    }

    public static OneClickPayConfirmDialogFragment a(OpenOneClickPay openOneClickPay, String str) {
        Object[] objArr = {openOneClickPay, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e8a9365a67e6d150fcef509648034ff0", RobustBitConfig.DEFAULT_VALUE)) {
            return (OneClickPayConfirmDialogFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e8a9365a67e6d150fcef509648034ff0");
        }
        OneClickPayConfirmDialogFragment oneClickPayConfirmDialogFragment = new OneClickPayConfirmDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("openInfo", openOneClickPay);
        bundle.putSerializable("tradeNo", str);
        oneClickPayConfirmDialogFragment.setArguments(bundle);
        return oneClickPayConfirmDialogFragment;
    }

    @Override // com.meituan.android.paybase.common.fragment.MTPayBaseDialogFragment, com.meituan.android.paybase.fragment.BaseDialogFragment, android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2fe284c7e7ae0ef3e0a878d0737054d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2fe284c7e7ae0ef3e0a878d0737054d9");
            return;
        }
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.c = getArguments().getString("tradeNo");
            this.d = (OpenOneClickPay) f.a(getArguments(), "openInfo");
        }
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f5fb00398a5e9af1c33e2a077870d20", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f5fb00398a5e9af1c33e2a077870d20");
            return;
        }
        this.b = null;
        super.onDetach();
    }

    @Override // com.meituan.android.paybase.common.fragment.MTPayBaseDialogFragment
    public final HashMap<String, Object> c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "321782cd3ff18d06871b1dd355361f64", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "321782cd3ff18d06871b1dd355361f64");
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("tradeNo", this.c);
        return hashMap;
    }
}
