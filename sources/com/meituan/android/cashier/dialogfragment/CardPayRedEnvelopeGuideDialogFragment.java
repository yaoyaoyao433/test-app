package com.meituan.android.cashier.dialogfragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.meituan.android.cashier.common.q;
import com.meituan.android.cashier.dialog.CardPayRedEnvelopeGuideDialog;
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
public class CardPayRedEnvelopeGuideDialogFragment extends MTPayBaseDialogFragment {
    public static ChangeQuickRedirect a;
    private r b;
    private CashierPopWindowBean c;

    @Override // com.meituan.android.paybase.fragment.BaseDialogFragment
    public final String a() {
        return "CardPayRedEnvelopeGuideDialogFragment";
    }

    public static CardPayRedEnvelopeGuideDialogFragment a(CashierPopWindowBean cashierPopWindowBean) {
        Object[] objArr = {cashierPopWindowBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fcd68837496ff469ffb0bc20b28ed543", RobustBitConfig.DEFAULT_VALUE)) {
            return (CardPayRedEnvelopeGuideDialogFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fcd68837496ff469ffb0bc20b28ed543");
        }
        CardPayRedEnvelopeGuideDialogFragment cardPayRedEnvelopeGuideDialogFragment = new CardPayRedEnvelopeGuideDialogFragment();
        Bundle bundle = new Bundle();
        if (cashierPopWindowBean != null) {
            bundle.putSerializable("bind_card_pop_window_bean", cashierPopWindowBean);
        }
        cardPayRedEnvelopeGuideDialogFragment.setArguments(bundle);
        return cardPayRedEnvelopeGuideDialogFragment;
    }

    @Override // com.meituan.android.paybase.fragment.BaseDialogFragment
    public final BaseDialog a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75a95f68912bf2108346d7ddb0f39e05", RobustBitConfig.DEFAULT_VALUE)) {
            return (BaseDialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75a95f68912bf2108346d7ddb0f39e05");
        }
        setCancelable(false);
        return new CardPayRedEnvelopeGuideDialog(getContext(), this.c, this.b);
    }

    @Override // android.support.v4.app.Fragment
    public void onAttach(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50ab953d1c6a08cb4db0ecdce39b366b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50ab953d1c6a08cb4db0ecdce39b366b");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1db3c721c5835c6f58b6f2719eb11a0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1db3c721c5835c6f58b6f2719eb11a0d");
            return;
        }
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.c = (CashierPopWindowBean) com.sankuai.waimai.platform.utils.f.a(getArguments(), "bind_card_pop_window_bean");
        }
        if (bundle == null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7acfa644c1859ac93492aed4e0e51730", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7acfa644c1859ac93492aed4e0e51730");
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("style", PopDetailInfo.RED_ENVELOPE_STYLE);
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c84747057154b21b7bf79f3e26d153b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c84747057154b21b7bf79f3e26d153b");
            return;
        }
        super.onDetach();
        this.b = null;
    }
}
