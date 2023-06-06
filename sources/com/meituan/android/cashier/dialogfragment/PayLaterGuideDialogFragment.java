package com.meituan.android.cashier.dialogfragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.cashier.NativeStandardCashierAdapter;
import com.meituan.android.cashier.activity.MTCashierActivity;
import com.meituan.android.cashier.common.ICashier;
import com.meituan.android.cashier.common.q;
import com.meituan.android.cashier.dialog.PayLaterGuideDialog;
import com.meituan.android.cashier.model.bean.Cashier;
import com.meituan.android.cashier.model.bean.PayLaterPopDetailInfoBean;
import com.meituan.android.cashier.model.bean.PayLaterSubmitBean;
import com.meituan.android.cashier.model.params.PayParams;
import com.meituan.android.cashier.retrofit.CashierRequestService;
import com.meituan.android.pay.common.payment.bean.MTPayment;
import com.meituan.android.pay.desk.pack.u;
import com.meituan.android.paybase.common.fragment.MTPayBaseDialogFragment;
import com.meituan.android.paybase.dialog.BaseDialog;
import com.meituan.android.paybase.dialog.e;
import com.meituan.android.paybase.utils.MTPayNeedToPersist;
import com.meituan.android.paybase.utils.n;
import com.meituan.android.paycommon.lib.utils.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class PayLaterGuideDialogFragment extends MTPayBaseDialogFragment implements com.meituan.android.paybase.retrofit.b {
    public static ChangeQuickRedirect a;
    @MTPayNeedToPersist
    private PayLaterPopDetailInfoBean b;
    @MTPayNeedToPersist
    private String c;
    @MTPayNeedToPersist
    private String d;
    @MTPayNeedToPersist
    private String e;
    @MTPayNeedToPersist
    private Cashier f;
    @MTPayNeedToPersist
    private boolean g;
    private com.meituan.android.cashier.exception.c k;
    private PayLaterGuideDialog.a l;

    @Override // com.meituan.android.paybase.fragment.BaseDialogFragment
    public final String a() {
        return "PayLaterGuideDialogFragment";
    }

    @Override // com.meituan.android.paybase.common.fragment.MTPayBaseDialogFragment
    public final String b() {
        return "c_pay_ejiowkr5";
    }

    public PayLaterGuideDialogFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d04325c5df9c1834a11e6a1792056e74", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d04325c5df9c1834a11e6a1792056e74");
        } else {
            this.g = true;
        }
    }

    public static /* synthetic */ void a(PayLaterGuideDialogFragment payLaterGuideDialogFragment) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, payLaterGuideDialogFragment, changeQuickRedirect, false, "120e88368fca3401895cb8e686b3e125", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, payLaterGuideDialogFragment, changeQuickRedirect, false, "120e88368fca3401895cb8e686b3e125");
            return;
        }
        PayParams f = payLaterGuideDialogFragment.f();
        Object[] objArr2 = {f};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, payLaterGuideDialogFragment, changeQuickRedirect2, false, "329bee46381ef61fc87b50ad201d86ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, payLaterGuideDialogFragment, changeQuickRedirect2, false, "329bee46381ef61fc87b50ad201d86ee");
            return;
        }
        HashMap<String, String> a2 = com.meituan.android.cashier.retrofit.a.a(f);
        m.a((MTCashierActivity) payLaterGuideDialogFragment.getActivity(), a2);
        ((CashierRequestService) com.meituan.android.paycommon.lib.retrofit.b.a().a(CashierRequestService.class, payLaterGuideDialogFragment, 3)).goHelloPay(a2);
    }

    public static /* synthetic */ void d(PayLaterGuideDialogFragment payLaterGuideDialogFragment) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, payLaterGuideDialogFragment, changeQuickRedirect, false, "e2d9456bc7abc5caf7de5934aa603b2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, payLaterGuideDialogFragment, changeQuickRedirect, false, "e2d9456bc7abc5caf7de5934aa603b2e");
            return;
        }
        NativeStandardCashierAdapter h = payLaterGuideDialogFragment.h();
        if (h == null) {
            com.meituan.android.paybase.common.analyse.cat.a.a(payLaterGuideDialogFragment.a("onClickPayLaterGuideCancel"), "standardCashier == null");
            return;
        }
        payLaterGuideDialogFragment.dismissAllowingStateLoss();
        h.e();
    }

    @Override // com.meituan.android.paybase.fragment.BaseDialogFragment
    public final BaseDialog a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da6689f3bcb74d0d2f75b00ec71ad164", RobustBitConfig.DEFAULT_VALUE)) {
            return (BaseDialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da6689f3bcb74d0d2f75b00ec71ad164");
        }
        g();
        return new PayLaterGuideDialog(getContext(), this.b, this.l);
    }

    @Override // android.support.v4.app.Fragment
    public void onViewStateRestored(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46d8cc84c91b1d0439252d65034155ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46d8cc84c91b1d0439252d65034155ce");
            return;
        }
        super.onViewStateRestored(bundle);
        g();
        if (getDialog() instanceof PayLaterGuideDialog) {
            ((PayLaterGuideDialog) getDialog()).b = this.l;
        }
    }

    public static PayLaterGuideDialogFragment a(String str, String str2, String str3, @NonNull PayLaterPopDetailInfoBean payLaterPopDetailInfoBean, Cashier cashier) {
        Object[] objArr = {str, str2, str3, payLaterPopDetailInfoBean, cashier};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "358f803e0c0cf5ccb35f5fe161640219", RobustBitConfig.DEFAULT_VALUE)) {
            return (PayLaterGuideDialogFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "358f803e0c0cf5ccb35f5fe161640219");
        }
        PayLaterGuideDialogFragment payLaterGuideDialogFragment = new PayLaterGuideDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("PayLaterPopDetailInfoBean", payLaterPopDetailInfoBean);
        bundle.putString("payToken", str3);
        bundle.putString("tradeNo", str2);
        bundle.putSerializable("cashier", cashier);
        bundle.putString("guide_plans", str);
        payLaterGuideDialogFragment.setArguments(bundle);
        return payLaterGuideDialogFragment;
    }

    @Override // com.meituan.android.paybase.common.fragment.MTPayBaseDialogFragment, com.meituan.android.paybase.fragment.BaseDialogFragment, android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e32e9a487dc74a8b95ccb00b0a26e5e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e32e9a487dc74a8b95ccb00b0a26e5e2");
            return;
        }
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.b = (PayLaterPopDetailInfoBean) com.sankuai.waimai.platform.utils.f.a(getArguments(), "PayLaterPopDetailInfoBean");
            this.f = (Cashier) com.sankuai.waimai.platform.utils.f.a(getArguments(), "cashier");
            this.c = getArguments().getString("payToken");
            this.d = getArguments().getString("tradeNo");
            this.e = getArguments().getString("guide_plans");
        }
        com.meituan.android.cashier.base.utils.d.a(this.b);
        if (h() != null && this.g) {
            this.g = false;
            NativeStandardCashierAdapter h = h();
            Object[] objArr2 = {"paylater_cashier"};
            ChangeQuickRedirect changeQuickRedirect2 = NativeStandardCashierAdapter.a;
            if (PatchProxy.isSupport(objArr2, h, changeQuickRedirect2, false, "a33e9e205c0f941f63727e49f2168b0c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, h, changeQuickRedirect2, false, "a33e9e205c0f941f63727e49f2168b0c");
            } else {
                h.f.d("paylater_cashier");
            }
            q.a("native_standcashier_start_succ", (Map<String, Object>) null, (List<Float>) null, e());
            com.meituan.android.cashier.util.c.a(getActivity() instanceof MTCashierActivity ? ((MTCashierActivity) getActivity()).k() : "unknown", e());
        }
        if (bundle == null) {
            com.meituan.android.cashier.base.utils.d.a(this.f, e());
        }
        setCancelable(false);
    }

    @Override // com.meituan.android.paybase.common.fragment.MTPayBaseDialogFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c62e26f907b69f94f6e5e78bacfc591b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c62e26f907b69f94f6e5e78bacfc591b");
            return;
        }
        com.meituan.android.cashier.base.utils.d.a(this.b);
        super.onResume();
    }

    @Override // android.support.v4.app.Fragment
    public void onAttach(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0cb302a21b4722fc1b3db7e47a974b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0cb302a21b4722fc1b3db7e47a974b4");
            return;
        }
        super.onAttach(activity);
        g();
    }

    private PayParams f() {
        String guideRequestNo;
        String str;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b397934fa62047db9e1ad9d9b00d3a7", RobustBitConfig.DEFAULT_VALUE)) {
            return (PayParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b397934fa62047db9e1ad9d9b00d3a7");
        }
        PayParams payParams = null;
        if (this.b.getPayLaterSubmitBean().openCreditPay() || this.b.getPayLaterSubmitBean().bindNewCard()) {
            payParams = com.meituan.android.cashier.retrofit.a.a(this.f, this.d, this.c);
        } else {
            MTPayment c = com.meituan.android.cashier.retrofit.a.c(this.f);
            if (c == null) {
                com.meituan.android.paybase.common.analyse.cat.a.a(a("onClickPayLaterGuideOpen"), "mtPayment == null");
            } else {
                if (h() == null) {
                    com.meituan.android.paybase.common.analyse.cat.a.a(a("onClickPayLaterGuideOpen"), "standardCashier == null");
                } else {
                    h().c = c.getPayType();
                }
                Cashier cashier = this.f;
                String str2 = this.d;
                String str3 = this.c;
                Object[] objArr2 = {cashier, str2, str3, c};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "94d49762b065e5f18ff2f3117777050a", RobustBitConfig.DEFAULT_VALUE)) {
                    payParams = (PayParams) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "94d49762b065e5f18ff2f3117777050a");
                } else {
                    payParams = com.meituan.android.cashier.retrofit.a.a(cashier, str2, str3);
                    if (c != null && com.meituan.android.cashier.retrofit.a.a(com.meituan.android.cashier.retrofit.a.a(cashier), c)) {
                        payParams.walletPayParams = u.a().a(getActivity(), com.meituan.android.cashier.retrofit.a.a(cashier), c, "cashier_params");
                    }
                }
            }
        }
        PayParams payParams2 = payParams;
        if (payParams2 != null) {
            String str4 = this.e;
            Object[] objArr3 = {payParams2, str4};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "acfee8894a33f431de9cbb4347442cad", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "acfee8894a33f431de9cbb4347442cad");
            } else {
                com.meituan.android.cashier.retrofit.a.b(payParams2, str4);
            }
            PayLaterSubmitBean payLaterSubmitBean = this.b.getPayLaterSubmitBean();
            String ext = this.b.getExt();
            if (!TextUtils.isEmpty(ext)) {
                payLaterSubmitBean.setExt(ext);
            }
            String utmSource = this.b.getUtmSource();
            if (!TextUtils.isEmpty(utmSource)) {
                payLaterSubmitBean.setPromotionInfo("{\"utmSource\":\"" + utmSource + "\"}");
            }
            payParams2.openWithholdInfoBefore = n.a().toJson(payLaterSubmitBean);
            if (payParams2.walletPayParams == null) {
                payParams2.walletPayParams = new HashMap();
            }
            Map<String, String> map = payParams2.walletPayParams;
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "86373be2869aaea124c0499dd7a7de3f", RobustBitConfig.DEFAULT_VALUE)) {
                guideRequestNo = (String) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "86373be2869aaea124c0499dd7a7de3f");
            } else {
                guideRequestNo = this.b == null ? "" : this.b.getGuideRequestNo();
            }
            String str5 = guideRequestNo;
            Object[] objArr5 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect5 = a;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "548db3929fded9e5ba21ccb589dd96ca", RobustBitConfig.DEFAULT_VALUE)) {
                str = (String) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "548db3929fded9e5ba21ccb589dd96ca");
            } else {
                NativeStandardCashierAdapter h = h();
                str = h == null ? "" : h.k;
            }
            com.meituan.android.cashier.retrofit.a.a(map, str5, str);
        }
        return payParams2;
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c21783c981c01e9c25da5c5ffb10906a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c21783c981c01e9c25da5c5ffb10906a");
        } else if (this.l != null) {
        } else {
            this.l = new PayLaterGuideDialog.a() { // from class: com.meituan.android.cashier.dialogfragment.PayLaterGuideDialogFragment.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cashier.dialog.PayLaterGuideDialog.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "44e536b16208f9f20e0cdc966d260f0a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "44e536b16208f9f20e0cdc966d260f0a");
                        return;
                    }
                    PayLaterGuideDialogFragment.a(PayLaterGuideDialogFragment.this);
                    com.meituan.android.cashier.base.utils.d.b(PayLaterGuideDialogFragment.this.f, PayLaterGuideDialogFragment.this.e());
                }

                @Override // com.meituan.android.cashier.dialog.PayLaterGuideDialog.a
                public final void b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "08dbd9bf2d67e22b2626a7120d1293a7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "08dbd9bf2d67e22b2626a7120d1293a7");
                        return;
                    }
                    PayLaterGuideDialogFragment.d(PayLaterGuideDialogFragment.this);
                    com.meituan.android.cashier.base.utils.d.c(PayLaterGuideDialogFragment.this.f, PayLaterGuideDialogFragment.this.e());
                }
            };
        }
    }

    private String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45a3890b0f9205614222d3f33c234a3d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45a3890b0f9205614222d3f33c234a3d");
        }
        return "PayLaterGuideDialogFragment_" + str;
    }

    private NativeStandardCashierAdapter h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60e636dbea771245ef44e5c7e11696fb", RobustBitConfig.DEFAULT_VALUE)) {
            return (NativeStandardCashierAdapter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60e636dbea771245ef44e5c7e11696fb");
        }
        if (getActivity() instanceof MTCashierActivity) {
            ICashier iCashier = ((MTCashierActivity) getActivity()).e;
            if (iCashier instanceof NativeStandardCashierAdapter) {
                return (NativeStandardCashierAdapter) iCashier;
            }
            return null;
        }
        return null;
    }

    private com.meituan.android.paybase.retrofit.b i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6d84252ffb7cc675eef7bffa3db76f2", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.paybase.retrofit.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6d84252ffb7cc675eef7bffa3db76f2");
        }
        if (getActivity() instanceof MTCashierActivity) {
            return (MTCashierActivity) getActivity();
        }
        return null;
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onDetach() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1b6c7c300b35f8b8066461605457f0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1b6c7c300b35f8b8066461605457f0d");
            return;
        }
        super.onDetach();
        this.l = null;
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestSucc(int i, Object obj) {
        Object[] objArr = {Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4292ac586069c92a2d322eebb6cece9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4292ac586069c92a2d322eebb6cece9c");
        } else if (i() != null) {
            i().onRequestSucc(i, obj);
            if (i == 3) {
                dismissAllowingStateLoss();
            }
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestException(int i, Exception exc) {
        Object[] objArr = {Integer.valueOf(i), exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93830dfb3621b93e1f534e9aa1d299a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93830dfb3621b93e1f534e9aa1d299a5");
        } else if (getActivity() == null || getActivity().isFinishing()) {
        } else {
            if (this.k == null) {
                this.k = new com.meituan.android.cashier.exception.c((MTCashierActivity) getActivity()) { // from class: com.meituan.android.cashier.dialogfragment.PayLaterGuideDialogFragment.2
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.paycommon.lib.exception.a
                    public final void a(String str) {
                        Object[] objArr2 = {str};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "237fdc2eab619159023f5964464f0166", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "237fdc2eab619159023f5964464f0166");
                        } else {
                            com.meituan.android.paybase.dialog.e.a(PayLaterGuideDialogFragment.this.getDialog(), str, "", e.a.TOAST_TYPE_COMMON, false);
                        }
                    }

                    @Override // com.meituan.android.paycommon.lib.exception.a
                    public final void a(String str, String str2) {
                        Object[] objArr2 = {str, str2};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "78b77f6f6203e6d9e772ab7115781aa5", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "78b77f6f6203e6d9e772ab7115781aa5");
                        } else {
                            com.meituan.android.paybase.dialog.e.a(PayLaterGuideDialogFragment.this.getDialog(), str, str2, e.a.TOAST_TYPE_EXCEPTION, false);
                        }
                    }
                };
            }
            this.k.a(exc);
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestFinal(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efd5ef8f8d29b8c620eee874e6af69b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efd5ef8f8d29b8c620eee874e6af69b0");
        } else if (i() != null) {
            a(getActivity().getSupportFragmentManager());
            i().onRequestFinal(i);
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public void onRequestStart(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb59f8a69a14ed3e8ba27a09ab513f07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb59f8a69a14ed3e8ba27a09ab513f07");
        } else if (i() != null) {
            d();
            i().onRequestStart(i);
        }
    }

    @Override // com.meituan.android.paybase.common.fragment.MTPayBaseDialogFragment
    public final HashMap<String, Object> c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15f4cd5136e0ef30a8a8bc4fb7844c7a", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15f4cd5136e0ef30a8a8bc4fb7844c7a");
        }
        HashMap<String, Object> c = super.c();
        com.meituan.android.cashier.base.utils.d.a(c);
        c.put("tradeNo", this.d);
        c.put("nb_version", com.meituan.android.paybase.config.a.d().q());
        return c;
    }
}
