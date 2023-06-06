package com.meituan.android.cashier.dialog;

import android.content.Context;
import android.graphics.Typeface;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.meituan.android.cashier.model.bean.CashierPopWindowBean;
import com.meituan.android.cashier.model.bean.PopDetailInfo;
import com.meituan.android.pay.common.payment.bean.MTPayment;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.dialog.BaseDialog;
import com.meituan.android.paybase.utils.ae;
import com.meituan.android.paybase.utils.ag;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CardPayFunctionGuideDialog extends BaseDialog {
    public static ChangeQuickRedirect a;
    private HashMap<String, Object> b;
    private r e;
    private PopDetailInfo f;
    private CashierPopWindowBean g;

    public CardPayFunctionGuideDialog(Context context, CashierPopWindowBean cashierPopWindowBean, r rVar) {
        super(context, R.style.cashier__card_pay_guide_transparent_dialog);
        String payType;
        Object[] objArr = {context, cashierPopWindowBean, rVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45e19316b0302c759e2ce45433ab44fb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45e19316b0302c759e2ce45433ab44fb");
            return;
        }
        if (cashierPopWindowBean != null) {
            this.g = cashierPopWindowBean;
            this.f = cashierPopWindowBean.getPopDetailInfo();
        }
        this.e = rVar;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a8a2018539187e5ae3fae896f8bdda46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a8a2018539187e5ae3fae896f8bdda46");
            return;
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "bcb03dc08a0a6ed93f3f3a34e7231204", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "bcb03dc08a0a6ed93f3f3a34e7231204");
        } else {
            this.b = com.meituan.android.cashier.common.q.a();
            if (this.f != null && !TextUtils.isEmpty(this.f.getPopScene())) {
                this.b.put("pop_scene", this.f.getPopScene());
            }
            this.b.put("style_type", "0");
            this.b.put("ad_id", "-999");
            HashMap<String, Object> hashMap = this.b;
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "657a1cb146a8c9feda501e171b934cf1", RobustBitConfig.DEFAULT_VALUE)) {
                payType = (String) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "657a1cb146a8c9feda501e171b934cf1");
            } else {
                payType = (this.g == null || this.g.getPopDetailInfo() == null || this.g.getPopDetailInfo().getGuidePayTypeInfo() == null) ? "" : this.g.getPopDetailInfo().getGuidePayTypeInfo().getPayType();
            }
            hashMap.put("pay_type", payType);
        }
        requestWindowFeature(1);
        setCanceledOnTouchOutside(false);
        setContentView(R.layout.cashier__card_pay_function_guide_dialog);
        findViewById(R.id.card_pay_guide_dialog_close).setOnClickListener(d.a(this));
        if (this.f != null) {
            ((TextView) findViewById(R.id.card_pay_guide_dialog_title)).setText(this.f.getTitle());
            TextView textView = (TextView) findViewById(R.id.card_pay_guide_dialog_money);
            Typeface a2 = com.meituan.android.paybase.utils.m.a(getContext());
            if (a2 != null) {
                ((TextView) findViewById(R.id.card_pay_guide_dialog_money_symbol)).setTypeface(a2);
                textView.setTypeface(a2);
            }
            textView.setText(ag.a(this.f.getPromotionMoney()));
            ((TextView) findViewById(R.id.card_pay_guide_dialog_subtitle)).setText(this.f.getSubtitle());
            ((TextView) findViewById(R.id.card_pay_guide_dialog_button)).setText(this.f.getGuideButton());
            findViewById(R.id.card_pay_guide_dialog_button).setOnClickListener(e.a(this));
        }
        this.b.put("open_source", "Beforepay_popwindow");
        if (this.f != null) {
            com.meituan.android.cashier.utils.b.a(this.b, this.f.getGuidePayTypeInfo());
        }
        com.meituan.android.cashier.common.q.a("c_PJmoK", com.meituan.android.cashier.base.utils.a.a(this.g) ? "b_pay_emgbc2xg_mv" : "b_pay_fabizu1a_mv", com.meituan.android.cashier.base.utils.a.a(this.g) ? "引导绑多卡弹窗" : "收银台首页-拉新优惠弹窗", this.b, ae.a.VIEW, b());
    }

    public static /* synthetic */ void b(CardPayFunctionGuideDialog cardPayFunctionGuideDialog, View view) {
        Object[] objArr = {cardPayFunctionGuideDialog, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4ec3e960bc038115f303aada4a3a2ccf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4ec3e960bc038115f303aada4a3a2ccf");
            return;
        }
        cardPayFunctionGuideDialog.a("cancel");
        cardPayFunctionGuideDialog.dismiss();
        com.meituan.android.cashier.common.q.a("c_PJmoK", com.meituan.android.cashier.base.utils.a.a(cardPayFunctionGuideDialog.g) ? "b_pay_nvb88kbl_mc" : "b_pay_sod9pe8x_mc", com.meituan.android.cashier.base.utils.a.a(cardPayFunctionGuideDialog.g) ? "引导绑多卡弹窗-关闭按钮" : "收银台首页-拉新优惠弹窗-关闭", cardPayFunctionGuideDialog.b, ae.a.CLICK, cardPayFunctionGuideDialog.b());
    }

    public static /* synthetic */ void a(CardPayFunctionGuideDialog cardPayFunctionGuideDialog, View view) {
        Object[] objArr = {cardPayFunctionGuideDialog, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9ca6ebe952950d11c559c26f6b342409", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9ca6ebe952950d11c559c26f6b342409");
            return;
        }
        cardPayFunctionGuideDialog.a("ensure");
        cardPayFunctionGuideDialog.dismiss();
        com.meituan.android.pay.desk.pack.u.a().f = "Beforepay_popwindow";
        if (cardPayFunctionGuideDialog.e != null) {
            cardPayFunctionGuideDialog.e.a(cardPayFunctionGuideDialog.f.getGuidePayTypeInfo());
        }
        cardPayFunctionGuideDialog.b.put("open_source", "Beforepay_popwindow");
        if (cardPayFunctionGuideDialog.f != null) {
            com.meituan.android.cashier.utils.b.a(cardPayFunctionGuideDialog.b, cardPayFunctionGuideDialog.f.getGuidePayTypeInfo());
        }
        com.meituan.android.cashier.common.q.a("c_PJmoK", com.meituan.android.cashier.base.utils.a.a(cardPayFunctionGuideDialog.g) ? "b_pay_pupgzmqd_mc" : "b_pay_inig81vs_mc", com.meituan.android.cashier.base.utils.a.a(cardPayFunctionGuideDialog.g) ? "引导绑多卡弹窗-主按钮" : "收银台首页-拉新优惠弹窗-绑卡", cardPayFunctionGuideDialog.b, ae.a.CLICK, cardPayFunctionGuideDialog.b());
        MTPayment guidePayTypeInfo = cardPayFunctionGuideDialog.f.getGuidePayTypeInfo();
        Object[] objArr2 = {guidePayTypeInfo};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, cardPayFunctionGuideDialog, changeQuickRedirect2, false, "7eb43233380c1097b9d7468d1206ece2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cardPayFunctionGuideDialog, changeQuickRedirect2, false, "7eb43233380c1097b9d7468d1206ece2");
        } else if (guidePayTypeInfo == null || TextUtils.isEmpty(guidePayTypeInfo.getPayType())) {
        } else {
            HashMap<String, Object> hashMap = new a.c().a("pay_type", guidePayTypeInfo.getPayType()).b;
            com.meituan.android.cashier.common.q.b("b_pay_standard_cashier_mt_pay_confirm_sc", hashMap, cardPayFunctionGuideDialog.b());
            com.meituan.android.cashier.common.q.a("standard_cashier_mt_pay_confirm", hashMap, (List<Float>) null, cardPayFunctionGuideDialog.b());
        }
    }

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16a8131bd1dabcdb989b2dae330374b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16a8131bd1dabcdb989b2dae330374b0");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("style", PopDetailInfo.FUNCTION_STYLE);
        if (this.g != null && this.g.getPopDetailInfo() != null && this.g.getPopDetailInfo().getGuidePayTypeInfo() != null) {
            hashMap.put("pay_type", this.g.getPopDetailInfo().getGuidePayTypeInfo().getPayType());
        }
        hashMap.put("click", str);
        com.meituan.android.cashier.common.q.a("paybiz_bind_card_guide_dialog_click", hashMap, (List<Float>) null, b());
    }
}
