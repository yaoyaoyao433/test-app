package com.meituan.android.cashier.dialogfragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.cashier.dialog.CommonGuideDialog;
import com.meituan.android.cashier.dialog.q;
import com.meituan.android.cashier.model.bean.CashierPopWindowBean;
import com.meituan.android.cashier.model.bean.PopDetailInfo;
import com.meituan.android.pay.common.payment.bean.MTPayment;
import com.meituan.android.paybase.common.fragment.MTPayBaseDialogFragment;
import com.meituan.android.paybase.dialog.BaseDialog;
import com.meituan.android.paycommon.lib.fragment.HalfPageFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CommonGuideFragment extends MTPayBaseDialogFragment {
    public static ChangeQuickRedirect a;
    private CommonGuideDialog b;
    private q c;
    private CashierPopWindowBean d;

    @Override // com.meituan.android.paybase.fragment.BaseDialogFragment
    public final String a() {
        return "CommonGuideFragment";
    }

    public static CommonGuideFragment a(CashierPopWindowBean cashierPopWindowBean) {
        Object[] objArr = {cashierPopWindowBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1ce9b420eede4e2c669c37029a3eede5", RobustBitConfig.DEFAULT_VALUE)) {
            return (CommonGuideFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1ce9b420eede4e2c669c37029a3eede5");
        }
        CommonGuideFragment commonGuideFragment = new CommonGuideFragment();
        Bundle bundle = new Bundle();
        if (cashierPopWindowBean != null) {
            bundle.putSerializable("common_pop_window_bean", cashierPopWindowBean);
        }
        commonGuideFragment.setArguments(bundle);
        return commonGuideFragment;
    }

    @Override // com.meituan.android.paybase.fragment.BaseDialogFragment
    public final BaseDialog a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c4d090fb2ad39f44f841fb35dc71626", RobustBitConfig.DEFAULT_VALUE)) {
            return (BaseDialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c4d090fb2ad39f44f841fb35dc71626");
        }
        setCancelable(false);
        f();
        return this.b;
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65ace34fbe0c92960e50ef7070afeb83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65ace34fbe0c92960e50ef7070afeb83");
        } else if (this.b == null) {
            this.b = new CommonGuideDialog(getContext(), this.d, this.c);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onAttach(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d486796b08584694ed85314a9b9e661", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d486796b08584694ed85314a9b9e661");
            return;
        }
        super.onAttach(activity);
        if (getParentFragment() instanceof q) {
            this.c = (q) getParentFragment();
        }
    }

    @Override // com.meituan.android.paybase.common.fragment.MTPayBaseDialogFragment, com.meituan.android.paybase.fragment.BaseDialogFragment, android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef9f692cf9450095f5c42abfd3daea21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef9f692cf9450095f5c42abfd3daea21");
            return;
        }
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.d = (CashierPopWindowBean) com.sankuai.waimai.platform.utils.f.a(getArguments(), "common_pop_window_bean");
        }
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b17f2ed765f652d3cd317194ab26110a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b17f2ed765f652d3cd317194ab26110a");
            return;
        }
        super.onDetach();
        this.c = null;
    }

    public static boolean a(PopDetailInfo popDetailInfo) {
        boolean z;
        Object[] objArr = {popDetailInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4cdf3f8486e28607d610fedf8261e6a6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4cdf3f8486e28607d610fedf8261e6a6")).booleanValue();
        }
        if (popDetailInfo == null) {
            return false;
        }
        Object[] objArr2 = {popDetailInfo};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "5469c83be4d87bc21071ad82af99ef7d", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "5469c83be4d87bc21071ad82af99ef7d")).booleanValue();
        } else {
            MTPayment guidePayTypeInfo = popDetailInfo.getGuidePayTypeInfo();
            z = guidePayTypeInfo != null && (guidePayTypeInfo.getStatus() == 0 || guidePayTypeInfo.getStatus() == 2);
        }
        return z && !TextUtils.isEmpty(popDetailInfo.getMarketingMainTitle());
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8c17e0e34f2ca5bed7cd45ff944c2c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8c17e0e34f2ca5bed7cd45ff944c2c6");
            return;
        }
        com.meituan.android.privacy.aop.a.e();
        super.onActivityResult(i, i2, intent);
        f();
        final CommonGuideDialog commonGuideDialog = this.b;
        Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect2 = CommonGuideDialog.a;
        if (PatchProxy.isSupport(objArr2, commonGuideDialog, changeQuickRedirect2, false, "54c97c321dd886954c6ac40edc4bf878", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, commonGuideDialog, changeQuickRedirect2, false, "54c97c321dd886954c6ac40edc4bf878");
        } else if (i == 400) {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = CommonGuideDialog.a;
            if (PatchProxy.isSupport(objArr3, commonGuideDialog, changeQuickRedirect3, false, "318acc24f6defe2c4cfed37f11a12cff", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, commonGuideDialog, changeQuickRedirect3, false, "318acc24f6defe2c4cfed37f11a12cff");
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put(KnbConstants.PARAMS_SCENE, "1");
                hashMap.put("url", commonGuideDialog.a());
                com.meituan.android.cashier.common.q.b("b_pay_credit_open_back_to_cashier_sc", hashMap, commonGuideDialog.b());
            }
            HalfPageFragment.a(i2, intent, new HalfPageFragment.b() { // from class: com.meituan.android.cashier.dialog.CommonGuideDialog.3
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.paycommon.lib.fragment.HalfPageFragment.b
                public final void a(int i3, String str) {
                    Object[] objArr4 = {Integer.valueOf(i3), str};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "45721c7d1a4b93423561e820ca480809", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "45721c7d1a4b93423561e820ca480809");
                        return;
                    }
                    com.meituan.android.paybase.dialog.e.a(commonGuideDialog.getOwnerActivity(), (Object) "系统繁忙，请稍后重试");
                    commonGuideDialog.dismiss();
                }

                @Override // com.meituan.android.paycommon.lib.fragment.HalfPageFragment.b
                public final void a(@Nullable String str) {
                    Object[] objArr4 = {str};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "dcbe6ce23cd985de79dc9397daae0f29", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "dcbe6ce23cd985de79dc9397daae0f29");
                    } else if (TextUtils.isEmpty(str)) {
                        commonGuideDialog.c();
                    } else {
                        try {
                            CommonGuideDialog.a(commonGuideDialog, new JSONObject(str).optInt("fd_maidan_opened_status"));
                        } catch (JSONException unused) {
                            commonGuideDialog.c();
                        }
                    }
                }
            });
        }
        com.meituan.android.privacy.aop.a.f();
    }
}
