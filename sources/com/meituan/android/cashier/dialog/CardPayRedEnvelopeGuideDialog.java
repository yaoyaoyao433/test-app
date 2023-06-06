package com.meituan.android.cashier.dialog;

import android.content.Context;
import android.graphics.Typeface;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
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
public class CardPayRedEnvelopeGuideDialog extends BaseDialog {
    public static ChangeQuickRedirect a;
    private r b;
    private PopDetailInfo e;
    private CashierPopWindowBean f;
    private HashMap<String, Object> g;

    public CardPayRedEnvelopeGuideDialog(Context context, CashierPopWindowBean cashierPopWindowBean, r rVar) {
        super(context, R.style.cashier__card_pay_guide_transparent_dialog);
        String payType;
        Object[] objArr = {context, cashierPopWindowBean, rVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac6bff5d0298c73d0741bf51fdf6a33b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac6bff5d0298c73d0741bf51fdf6a33b");
            return;
        }
        if (cashierPopWindowBean != null) {
            this.f = cashierPopWindowBean;
            this.e = cashierPopWindowBean.getPopDetailInfo();
        }
        this.b = rVar;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "085b03ce1a55c98c5d7abfe77044cce0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "085b03ce1a55c98c5d7abfe77044cce0");
            return;
        }
        requestWindowFeature(1);
        setCanceledOnTouchOutside(false);
        this.g = com.meituan.android.cashier.common.q.a();
        if (this.e != null && this.e.getPopScene() != null) {
            this.g = new HashMap<>(com.meituan.android.cashier.common.q.a());
            this.g.put("pop_scene", this.e.getPopScene());
        }
        setContentView(R.layout.cashier__card_pay_red_envelope_guide_dialog);
        findViewById(R.id.card_pay_guide_dialog_close).setOnClickListener(f.a(this));
        if (this.e != null) {
            com.meituan.android.paycommon.lib.utils.w.a(this.e.getBackgroundImage(), (ImageView) findViewById(R.id.card_pay_guide_dialog_bg), R.color.cashier__card_pay_guide_dialog_default_bg, R.color.cashier__card_pay_guide_dialog_default_bg);
            ((TextView) findViewById(R.id.card_pay_guide_dialog_title)).setText(this.e.getTitle());
            TextView textView = (TextView) findViewById(R.id.card_pay_guide_dialog_money);
            Typeface a2 = com.meituan.android.paybase.utils.m.a(getContext());
            if (a2 != null) {
                ((TextView) findViewById(R.id.card_pay_guide_dialog_money_symbol)).setTypeface(a2);
                textView.setTypeface(a2);
            }
            textView.setText(ag.a(this.e.getPromotionMoney()));
            ((TextView) findViewById(R.id.card_pay_guide_dialog_subtitle)).setText(this.e.getSubtitle());
            TextView textView2 = (TextView) findViewById(R.id.card_pay_guide_dialog_button);
            textView2.setText(this.e.getGuideButton());
            textView2.setOnClickListener(g.a(this));
        }
        this.g.put("open_source", "Beforepay_popwindow");
        this.g.put("style_type", 0);
        HashMap<String, Object> hashMap = this.g;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6e6e184f970ff03609e66bb554965a03", RobustBitConfig.DEFAULT_VALUE)) {
            payType = (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6e6e184f970ff03609e66bb554965a03");
        } else {
            payType = (this.f == null || this.f.getPopDetailInfo() == null || this.f.getPopDetailInfo().getGuidePayTypeInfo() == null) ? "" : this.f.getPopDetailInfo().getGuidePayTypeInfo().getPayType();
        }
        hashMap.put("pay_type", payType);
        if (this.e != null) {
            com.meituan.android.cashier.utils.b.a(this.g, this.e.getGuidePayTypeInfo());
        }
        com.meituan.android.cashier.common.q.a("c_PJmoK", com.meituan.android.cashier.base.utils.a.a(this.f) ? "b_pay_emgbc2xg_mv" : "b_pay_fabizu1a_mv", com.meituan.android.cashier.base.utils.a.a(this.f) ? "引导绑多卡弹窗" : "收银台首页-拉新优惠弹窗", this.g, ae.a.VIEW, b());
    }

    public static /* synthetic */ void b(CardPayRedEnvelopeGuideDialog cardPayRedEnvelopeGuideDialog, View view) {
        Object[] objArr = {cardPayRedEnvelopeGuideDialog, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b22d56a3354b5c44cb88c082e7fe149f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b22d56a3354b5c44cb88c082e7fe149f");
            return;
        }
        cardPayRedEnvelopeGuideDialog.a("cancel");
        cardPayRedEnvelopeGuideDialog.dismiss();
        com.meituan.android.cashier.common.q.a("c_PJmoK", com.meituan.android.cashier.base.utils.a.a(cardPayRedEnvelopeGuideDialog.f) ? "b_pay_nvb88kbl_mc" : "b_pay_sod9pe8x_mc", com.meituan.android.cashier.base.utils.a.a(cardPayRedEnvelopeGuideDialog.f) ? "引导绑多卡弹窗-关闭按钮" : "收银台首页-拉新优惠弹窗-关闭", cardPayRedEnvelopeGuideDialog.g, ae.a.CLICK, cardPayRedEnvelopeGuideDialog.b());
    }

    public static /* synthetic */ void a(CardPayRedEnvelopeGuideDialog cardPayRedEnvelopeGuideDialog, View view) {
        Object[] objArr = {cardPayRedEnvelopeGuideDialog, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "07faea2ff8970f53de083e5a90ebe578", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "07faea2ff8970f53de083e5a90ebe578");
            return;
        }
        cardPayRedEnvelopeGuideDialog.a("ensure");
        cardPayRedEnvelopeGuideDialog.dismiss();
        com.meituan.android.pay.desk.pack.u.a().f = "Beforepay_popwindow";
        if (cardPayRedEnvelopeGuideDialog.b != null) {
            cardPayRedEnvelopeGuideDialog.b.a(cardPayRedEnvelopeGuideDialog.e.getGuidePayTypeInfo());
        }
        cardPayRedEnvelopeGuideDialog.g.put("open_source", "Beforepay_popwindow");
        if (cardPayRedEnvelopeGuideDialog.e != null) {
            com.meituan.android.cashier.utils.b.a(cardPayRedEnvelopeGuideDialog.g, cardPayRedEnvelopeGuideDialog.e.getGuidePayTypeInfo());
        }
        com.meituan.android.cashier.common.q.a("c_PJmoK", com.meituan.android.cashier.base.utils.a.a(cardPayRedEnvelopeGuideDialog.f) ? "b_pay_pupgzmqd_mc" : "b_pay_inig81vs_mc", com.meituan.android.cashier.base.utils.a.a(cardPayRedEnvelopeGuideDialog.f) ? "引导绑多卡弹窗-主按钮" : "收银台首页-拉新优惠弹窗-绑卡", cardPayRedEnvelopeGuideDialog.g, ae.a.CLICK, cardPayRedEnvelopeGuideDialog.b());
        MTPayment guidePayTypeInfo = cardPayRedEnvelopeGuideDialog.e.getGuidePayTypeInfo();
        Object[] objArr2 = {guidePayTypeInfo};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, cardPayRedEnvelopeGuideDialog, changeQuickRedirect2, false, "c6ac2b5c569d91471be0c53516179490", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cardPayRedEnvelopeGuideDialog, changeQuickRedirect2, false, "c6ac2b5c569d91471be0c53516179490");
        } else if (guidePayTypeInfo == null || TextUtils.isEmpty(guidePayTypeInfo.getPayType())) {
        } else {
            HashMap<String, Object> hashMap = new a.c().a("pay_type", guidePayTypeInfo.getPayType()).b;
            com.meituan.android.cashier.common.q.b("b_pay_standard_cashier_mt_pay_confirm_sc", hashMap, cardPayRedEnvelopeGuideDialog.b());
            com.meituan.android.cashier.common.q.a("standard_cashier_mt_pay_confirm", hashMap, (List<Float>) null, cardPayRedEnvelopeGuideDialog.b());
        }
    }

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "add1afbc9a174c01fa05f9de156d3622", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "add1afbc9a174c01fa05f9de156d3622");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("style", PopDetailInfo.RED_ENVELOPE_STYLE);
        if (this.f != null && this.f.getPopDetailInfo() != null && this.f.getPopDetailInfo().getGuidePayTypeInfo() != null) {
            hashMap.put("pay_type", this.f.getPopDetailInfo().getGuidePayTypeInfo().getPayType());
        }
        hashMap.put("click", str);
        com.meituan.android.cashier.common.q.a("paybiz_bind_card_guide_dialog_click", hashMap, (List<Float>) null, b());
    }
}
