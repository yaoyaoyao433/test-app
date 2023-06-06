package com.meituan.android.cashier.dialogfragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.meituan.android.cashier.common.q;
import com.meituan.android.cashier.dialog.CardPayFunctionGuideDialog;
import com.meituan.android.cashier.dialog.r;
import com.meituan.android.cashier.model.bean.CashierPopWindowBean;
import com.meituan.android.cashier.model.bean.PopDetailInfo;
import com.meituan.android.paybase.common.fragment.MTPayBaseDialogFragment;
import com.meituan.android.paybase.dialog.BaseDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CardPayFunctionGuideDialogFragment extends MTPayBaseDialogFragment {
    public static ChangeQuickRedirect a;
    private r b;
    private CashierPopWindowBean c;

    @Override // com.meituan.android.paybase.fragment.BaseDialogFragment
    public final String a() {
        return "CardPayFunctionGuideDialogFragment";
    }

    public static CardPayFunctionGuideDialogFragment a(CashierPopWindowBean cashierPopWindowBean) {
        Object[] objArr = {cashierPopWindowBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7624960e8a851c5b709033c1a409b03f", RobustBitConfig.DEFAULT_VALUE)) {
            return (CardPayFunctionGuideDialogFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7624960e8a851c5b709033c1a409b03f");
        }
        CardPayFunctionGuideDialogFragment cardPayFunctionGuideDialogFragment = new CardPayFunctionGuideDialogFragment();
        Bundle bundle = new Bundle();
        if (cashierPopWindowBean != null) {
            bundle.putSerializable("bind_card_pop_window_bean", cashierPopWindowBean);
        }
        cardPayFunctionGuideDialogFragment.setArguments(bundle);
        return cardPayFunctionGuideDialogFragment;
    }

    @Override // com.meituan.android.paybase.fragment.BaseDialogFragment
    public final BaseDialog a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6115b2f2e795a07b0c06380a8fbee9bf", RobustBitConfig.DEFAULT_VALUE)) {
            return (BaseDialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6115b2f2e795a07b0c06380a8fbee9bf");
        }
        setCancelable(false);
        return new CardPayFunctionGuideDialog(getContext(), this.c, this.b);
    }

    @Override // android.support.v4.app.Fragment
    public void onAttach(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa91e99774a9d4c96bfed7ff22c59ede", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa91e99774a9d4c96bfed7ff22c59ede");
            return;
        }
        super.onAttach(activity);
        if (getParentFragment() instanceof r) {
            this.b = (r) getParentFragment();
        }
    }

    @Override // com.meituan.android.paybase.common.fragment.MTPayBaseDialogFragment, com.meituan.android.paybase.fragment.BaseDialogFragment, android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "771d235fc08fd72a637ef372d0701928", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "771d235fc08fd72a637ef372d0701928");
            return;
        }
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.c = (CashierPopWindowBean) com.sankuai.waimai.platform.utils.f.a(getArguments(), "bind_card_pop_window_bean");
        }
        if (bundle == null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ec60afe79f4a9857478db9b3a72a047a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ec60afe79f4a9857478db9b3a72a047a");
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("style", PopDetailInfo.FUNCTION_STYLE);
            if (this.c != null && this.c.getPopDetailInfo() != null && this.c.getPopDetailInfo().getGuidePayTypeInfo() != null) {
                hashMap.put("pay_type", this.c.getPopDetailInfo().getGuidePayTypeInfo().getPayType());
            }
            q.a("paybiz_bind_card_guide_dialog_show", hashMap, (List<Float>) null, e());
        }
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "502aad6321c9e36e737d5d8e0ca91cc9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "502aad6321c9e36e737d5d8e0ca91cc9");
            return;
        }
        super.onDetach();
        this.b = null;
    }
}
