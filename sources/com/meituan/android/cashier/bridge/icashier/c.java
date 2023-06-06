package com.meituan.android.cashier.bridge.icashier;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.constraint.R;
import android.support.v7.app.AppCompatActivity;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.cashier.bridge.HybridBusinessJsHandler;
import com.meituan.android.cashier.bridge.icashier.a;
import com.meituan.android.cashier.common.q;
import com.meituan.android.cashier.model.params.PayParams;
import com.meituan.android.pay.common.payment.bean.MTPayment;
import com.meituan.android.pay.common.payment.bean.Payment;
import com.meituan.android.pay.common.payment.utils.d;
import com.meituan.android.pay.common.selectdialog.view.SelectBankDialog;
import com.meituan.android.pay.common.selectdialog.view.SelectBankDialogFragment;
import com.meituan.android.pay.desk.pack.u;
import com.meituan.android.pay.desk.payment.bean.standarddesk.WalletPayment;
import com.meituan.android.pay.utils.g;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.utils.i;
import com.meituan.android.paycommon.lib.fragment.HalfPageFragment;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c implements SelectBankDialog.b {
    public static ChangeQuickRedirect a;
    private ICashierJSHandler b;
    private MTPayment c;
    private com.meituan.android.pay.common.payment.data.a d;
    private WalletPayment e;
    private String f;
    private int g;

    public c(ICashierJSHandler iCashierJSHandler) {
        Object[] objArr = {iCashierJSHandler};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d374214d95f7f11e388c4376f788e21e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d374214d95f7f11e388c4376f788e21e");
            return;
        }
        this.g = 0;
        this.b = iCashierJSHandler;
    }

    @Override // com.meituan.android.pay.common.selectdialog.view.SelectBankDialog.b
    public final void a(com.meituan.android.pay.common.payment.data.a aVar) {
        MTPayment mTPayment;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cabad3f7a919e492953380e765444658", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cabad3f7a919e492953380e765444658");
        } else if (aVar == null || d.a(aVar)) {
            ICashierJSHandler.jsCallbackError(this.b, ICashierJSHandler.JS_CALLBACK_ILLEGAL_STATE, com.meituan.android.neohybrid.neo.report.a.c(Constants.SPEED_METER_STEP, "onSelected").b("reason", "selectedPayment illegal"));
        } else {
            HybridBusinessJsHandler.logMC(this.b, "b_pay_hybrid_cashier_pay_click_mc", "c_pay_7c9fc4b4", com.meituan.android.neohybrid.neo.report.a.c("from_select_bankcard", 1).a("pay_type", aVar.getPayType()).b);
            ICashierJSHandler.logSC(this.b, "b_pay_4jv3tp2s_sc", new a.c().a("pay_type", aVar.getPayType()).a("status", Integer.valueOf(aVar.getStatus())).b);
            this.g = 0;
            this.d = aVar;
            if (aVar instanceof Payment) {
                mTPayment = this.c;
            } else if (aVar instanceof MTPayment) {
                mTPayment = (MTPayment) aVar;
                if (Math.abs(com.meituan.android.paybase.utils.d.b(Float.valueOf(com.meituan.android.pay.desk.payment.discount.a.a(this.e, mTPayment).floatValue()), Float.valueOf(com.meituan.android.pay.desk.payment.discount.a.a(this.e, this.c).floatValue())).floatValue()) > 1.0E-4d) {
                    this.g = 1;
                }
            } else {
                ICashierJSHandler.jsCallbackError(this.b, ICashierJSHandler.JS_CALLBACK_ILLEGAL_STATE, com.meituan.android.neohybrid.neo.report.a.c(Constants.SPEED_METER_STEP, "onSelected").b("reason", "selectedPayment type error"));
                return;
            }
            MTPayment mTPayment2 = mTPayment;
            if (this.b != null) {
                Activity activity = null;
                if (this.b.jsHost() != null && this.b.jsHost().getActivity() != null) {
                    activity = this.b.jsHost().getActivity();
                }
                Activity activity2 = activity;
                u.a().f = "standardPayCashierSwitchCard";
                Object[] objArr2 = {aVar, "standardPayCashierSwitchCard"};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ad9c9401623699d7171082a210d040d2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ad9c9401623699d7171082a210d040d2");
                } else {
                    String payType = aVar != null ? aVar.getPayType() : "-999";
                    Context a2 = com.meituan.android.paybase.config.a.d().a();
                    HashMap<String, Object> hashMap = new a.c().a("nb_version", com.meituan.android.paybase.config.a.d().q()).a("pay_type", payType).a("tradeNo", this.b.getTradeNo()).a("merchant_no", this.b.getMerchantNo()).a("open_source", "standardPayCashierSwitchCard").a("sub_type", "0").b;
                    Object[] objArr3 = {hashMap, aVar};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "140588a222876666c9f5906a14a9d0d0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "140588a222876666c9f5906a14a9d0d0");
                    } else {
                        if (aVar instanceof MTPayment) {
                            MTPayment mTPayment3 = (MTPayment) aVar;
                            if (g.a(mTPayment3)) {
                                hashMap.put("credit_style", g.c(mTPayment3) ? "1" : "0");
                                hashMap.put("mtcreditpay_status", g.b(mTPayment3) ? "1" : "0");
                            }
                        }
                        hashMap.put("credit_style", "-999");
                        hashMap.put("mtcreditpay_status", "-999");
                    }
                    q.b("c_PJmoK", "b_xgald577", a2.getString(R.string.cashier__mge_act_click_pay), hashMap, d());
                }
                if (g.d(mTPayment2) && activity2 != null) {
                    this.f = g.a(activity2, mTPayment2.getCreditPayOpenInfo().getUrl(), "standardPayCashierSwitchCard", "");
                    HalfPageFragment.a aVar2 = new HalfPageFragment.a("credit_half_page", this.f, mTPayment2.getCreditPayOpenInfo().getData(), 4);
                    aVar2.j = HalfPageFragment.a(this.b);
                    HalfPageFragment.a(activity2, aVar2);
                    q.b("b_pay_credit_open_leave_cashier_sc", new a.c().a("url", this.f).a(KnbConstants.PARAMS_SCENE, 3).b, d());
                    return;
                }
                a();
            }
        }
    }

    private String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6467a664f55d1508b08e3a400fff1db", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6467a664f55d1508b08e3a400fff1db") : this.b == null ? "" : this.b.getUniqueId();
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0fe19cd428d7ad20f00d547a6081884", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0fe19cd428d7ad20f00d547a6081884");
            return;
        }
        PayParams a2 = a.a(this.b.getActivity(), this.e, this.d instanceof MTPayment ? (MTPayment) this.d : this.c, this.d instanceof Payment ? this.d : null, a.C0187a.a(this.b.getTradeNo(), this.b.getPayToken(), "wallet", this.g, 1));
        a.a(a2, this.b.getExtraData());
        b.a(this.b, a2);
    }

    @Override // com.meituan.android.pay.common.selectdialog.view.SelectBankDialog.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73bd55289896bca6d34b443e5970a05e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73bd55289896bca6d34b443e5970a05e");
            return;
        }
        ICashierJSHandler.logSC(this.b, "b_pay_epykl897_sc", null);
        ICashierJSHandler.jsCallbackNotPaySucc(this.b, ICashierJSHandler.VALUE_STATUS_SELECT_BANK_CLOSE, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(WalletPayment walletPayment, MTPayment mTPayment, com.meituan.android.pay.common.selectdialog.b bVar, int i, int i2) {
        Object[] objArr = {walletPayment, mTPayment, bVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "455f3c391344ce47b1dda737caa1c423", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "455f3c391344ce47b1dda737caa1c423");
        } else if (bVar == null || i < 0) {
            ICashierJSHandler.jsCallbackError(this.b, ICashierJSHandler.JS_CALLBACK_PARAMS_CHECK_ERROR, com.meituan.android.neohybrid.neo.report.a.c(Constants.SPEED_METER_STEP, "showSelectListPageFragment").b("reason", "listPage is null or selectedIndex < 0"));
        } else if (i.a((Collection) bVar.getMtPaymentList()) || i >= bVar.getMtPaymentList().size()) {
            ICashierJSHandler.jsCallbackError(this.b, ICashierJSHandler.JS_CALLBACK_PARAMS_CHECK_ERROR, com.meituan.android.neohybrid.neo.report.a.c(Constants.SPEED_METER_STEP, "showSelectListPageFragment").b("reason", "MtPaymentList is empty or selectedIndex is error"));
        } else {
            this.e = walletPayment;
            this.c = mTPayment;
            SelectBankDialogFragment selectBankDialogFragment = new SelectBankDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("banklistpage", bVar);
            bundle.putSerializable("selected_payment_index", Integer.valueOf(i));
            bundle.putInt("selected_dialog_mode", i2);
            bundle.putSerializable("dialogtype", SelectBankDialog.c.CLOSE);
            selectBankDialogFragment.setArguments(bundle);
            selectBankDialogFragment.b = this;
            com.meituan.android.pay.common.selectdialog.utils.a.a("zhifu_page");
            if (this.b != null && this.b.jsHost() != null) {
                Activity activity = this.b.jsHost().getActivity();
                if (activity instanceof AppCompatActivity) {
                    selectBankDialogFragment.a(((AppCompatActivity) activity).getSupportFragmentManager());
                    return;
                }
            }
            ICashierJSHandler.jsCallbackError(this.b, ICashierJSHandler.JS_CALLBACK_ILLEGAL_STATE, com.meituan.android.neohybrid.neo.report.a.c(Constants.SPEED_METER_STEP, "showSelectListPageFragment").b("reason", "jsHost or activity is null"));
        }
    }

    public final String c() {
        return this.f != null ? this.f : "";
    }
}
