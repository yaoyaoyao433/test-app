package com.meituan.android.cashier.dialogfragment;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.meituan.android.cashier.dialog.PromotionSignedGuideDialog;
import com.meituan.android.cashier.dialog.s;
import com.meituan.android.cashier.model.bean.CashierPopWindowBean;
import com.meituan.android.cashier.model.bean.PopDetailInfo;
import com.meituan.android.pay.common.payment.bean.MTPayment;
import com.meituan.android.pay.common.promotion.bean.CombineLabel;
import com.meituan.android.paybase.common.fragment.MTPayBaseDialogFragment;
import com.meituan.android.paybase.dialog.BaseDialog;
import com.meituan.android.paybase.utils.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class PromotionSignedGuideFragment extends MTPayBaseDialogFragment {
    public static ChangeQuickRedirect a;
    private s b;
    private CashierPopWindowBean c;
    private String d;
    private String e;
    private List<CombineLabel> f;

    @Override // com.meituan.android.paybase.fragment.BaseDialogFragment
    public final String a() {
        return "PromotionSignedGuideFragment";
    }

    public PromotionSignedGuideFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29b841e63502b75a254ec83c8885543d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29b841e63502b75a254ec83c8885543d");
        } else {
            this.f = new LinkedList();
        }
    }

    public static PromotionSignedGuideFragment a(CashierPopWindowBean cashierPopWindowBean) {
        Object[] objArr = {cashierPopWindowBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9670eb82bf17b5f787257afb9a6726a0", RobustBitConfig.DEFAULT_VALUE)) {
            return (PromotionSignedGuideFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9670eb82bf17b5f787257afb9a6726a0");
        }
        PromotionSignedGuideFragment promotionSignedGuideFragment = new PromotionSignedGuideFragment();
        Bundle bundle = new Bundle();
        if (cashierPopWindowBean != null) {
            bundle.putSerializable("promotion_signed_pop_window_bean", cashierPopWindowBean);
        }
        promotionSignedGuideFragment.setArguments(bundle);
        return promotionSignedGuideFragment;
    }

    @Override // com.meituan.android.paybase.fragment.BaseDialogFragment
    public final BaseDialog a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc39354f6ea78a6e5272a443ebc593bf", RobustBitConfig.DEFAULT_VALUE)) {
            return (BaseDialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc39354f6ea78a6e5272a443ebc593bf");
        }
        setCancelable(false);
        return new PromotionSignedGuideDialog(getContext(), this.c, this.b, this.d, this.e);
    }

    @Override // android.support.v4.app.Fragment
    public void onAttach(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee1851d32b3a1fa9ff764b8826048c3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee1851d32b3a1fa9ff764b8826048c3d");
            return;
        }
        super.onAttach(activity);
        if (getParentFragment() instanceof s) {
            this.b = (s) getParentFragment();
        }
    }

    @Override // com.meituan.android.paybase.common.fragment.MTPayBaseDialogFragment, com.meituan.android.paybase.fragment.BaseDialogFragment, android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0075ab7b41d5b7333dccdd3a1ffe5552", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0075ab7b41d5b7333dccdd3a1ffe5552");
            return;
        }
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.c = (CashierPopWindowBean) com.sankuai.waimai.platform.utils.f.a(getArguments(), "promotion_signed_pop_window_bean");
        }
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6d769cf395e621fea748aa22d9f3b9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6d769cf395e621fea748aa22d9f3b9a");
            return;
        }
        super.onDetach();
        this.b = null;
        if (i.a((Collection) this.f)) {
            return;
        }
        this.f.clear();
    }

    public final boolean a(PopDetailInfo popDetailInfo) {
        Object[] objArr = {popDetailInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5246b0e5ccae6f17caa61804db758f6b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5246b0e5ccae6f17caa61804db758f6b")).booleanValue();
        }
        b(popDetailInfo);
        f();
        return c(popDetailInfo) && !TextUtils.isEmpty(this.d);
    }

    private void b(PopDetailInfo popDetailInfo) {
        MTPayment guidePayTypeInfo;
        Object[] objArr = {popDetailInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a28b35dbb21bed298a8bf4c27bbf6917", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a28b35dbb21bed298a8bf4c27bbf6917");
            return;
        }
        LinkedList linkedList = new LinkedList();
        if (popDetailInfo == null || (guidePayTypeInfo = popDetailInfo.getGuidePayTypeInfo()) == null) {
            return;
        }
        List<CombineLabel> labels = guidePayTypeInfo.getLabels();
        if (i.a((Collection) labels)) {
            return;
        }
        for (CombineLabel combineLabel : labels) {
            if (combineLabel != null) {
                if (!i.a((Collection) combineLabel.getChildrenLabel())) {
                    if (combineLabel.getDiscount() > 0.0f && !TextUtils.isEmpty(combineLabel.getContent())) {
                        this.f.add(combineLabel);
                    }
                } else if (!TextUtils.isEmpty(combineLabel.getContent())) {
                    linkedList.add(combineLabel);
                }
            }
        }
        this.f.addAll(linkedList);
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "789fb823354c75fcba50e4f2edafdd67", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "789fb823354c75fcba50e4f2edafdd67");
        } else if (i.a((Collection) this.f)) {
        } else {
            this.d = this.f.get(0).getContent();
            if (this.f.size() >= 2) {
                this.e = this.f.get(1).getContent();
            }
        }
    }

    private boolean c(PopDetailInfo popDetailInfo) {
        MTPayment guidePayTypeInfo;
        Object[] objArr = {popDetailInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9769c122c6f97a2efd01cf167c1e3d58", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9769c122c6f97a2efd01cf167c1e3d58")).booleanValue();
        }
        if (popDetailInfo == null || (guidePayTypeInfo = popDetailInfo.getGuidePayTypeInfo()) == null) {
            return false;
        }
        return guidePayTypeInfo.getStatus() == 0 || guidePayTypeInfo.getStatus() == 2;
    }
}
