package com.meituan.android.cashier.dialog;

import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.android.cashier.model.bean.CashierPopWindowBean;
import com.meituan.android.cashier.model.bean.PopDetailInfo;
import com.meituan.android.pay.common.payment.bean.MTPayment;
import com.meituan.android.pay.common.promotion.bean.Icon;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.dialog.BaseDialog;
import com.meituan.android.paybase.utils.ae;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class PromotionSignedGuideDialog extends BaseDialog {
    public static ChangeQuickRedirect a;
    private HashMap<String, Object> b;
    private s e;
    private PopDetailInfo f;
    private String g;
    private String h;

    public static /* synthetic */ void a(PromotionSignedGuideDialog promotionSignedGuideDialog, MTPayment mTPayment) {
        Object[] objArr = {mTPayment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, promotionSignedGuideDialog, changeQuickRedirect, false, "ca6108aaefd996292db6bfd5015fb6fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, promotionSignedGuideDialog, changeQuickRedirect, false, "ca6108aaefd996292db6bfd5015fb6fe");
        } else if (mTPayment == null || TextUtils.isEmpty(mTPayment.getPayType())) {
        } else {
            HashMap<String, Object> hashMap = new a.c().a("pay_type", mTPayment.getPayType()).b;
            com.meituan.android.cashier.common.q.b("b_pay_standard_cashier_mt_pay_confirm_sc", hashMap, promotionSignedGuideDialog.b());
            com.meituan.android.cashier.common.q.a("standard_cashier_mt_pay_confirm", hashMap, (List<Float>) null, promotionSignedGuideDialog.b());
        }
    }

    public PromotionSignedGuideDialog(Context context, CashierPopWindowBean cashierPopWindowBean, s sVar, String str, String str2) {
        super(context, R.style.cashier__card_pay_guide_transparent_dialog);
        String str3;
        String nameExt;
        Icon icon;
        Object[] objArr = {context, cashierPopWindowBean, sVar, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2084b4c48a00f9f89d321f2e8bd06fc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2084b4c48a00f9f89d321f2e8bd06fc");
            return;
        }
        if (cashierPopWindowBean != null) {
            this.f = cashierPopWindowBean.getPopDetailInfo();
        }
        this.e = sVar;
        this.g = str;
        this.h = str2;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "54214167208d565b511fb6138a052f79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "54214167208d565b511fb6138a052f79");
            return;
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1446dfb981f6eb86456340ac4287078f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1446dfb981f6eb86456340ac4287078f");
        } else {
            this.b = com.meituan.android.cashier.common.q.a();
            if (this.f != null && !TextUtils.isEmpty(this.f.getPopScene())) {
                this.b.put("pop_scene", this.f.getPopScene());
            }
            this.b.put("style_type", "0");
            this.b.put("ad_id", "-999");
            if (this.f != null && this.f.getGuidePayTypeInfo() != null && !TextUtils.isEmpty(this.f.getGuidePayTypeInfo().getPayType())) {
                this.b.put("pay_type", this.f.getGuidePayTypeInfo().getPayType());
            }
        }
        requestWindowFeature(1);
        setCanceledOnTouchOutside(false);
        setContentView(R.layout.cashier_promotion_signed_guide_dialog);
        findViewById(R.id.promotion_signed_dialog_close).setOnClickListener(x.a(this));
        if (this.f != null) {
            ((TextView) findViewById(R.id.promotion_signed_dialog_title)).setText(this.f.getTitle());
            ((TextView) findViewById(R.id.promotion_signed_dialog_main_preferential)).setText(this.g);
            TextView textView = (TextView) findViewById(R.id.promotion_signed_dialog_sub_preferential);
            textView.setText(this.h);
            if (TextUtils.isEmpty(this.h)) {
                textView.setVisibility(8);
            }
            ImageView imageView = (ImageView) findViewById(R.id.promotion_dialog_pay_icon);
            MTPayment guidePayTypeInfo = this.f.getGuidePayTypeInfo();
            if (guidePayTypeInfo != null && (icon = guidePayTypeInfo.getIcon()) != null && !TextUtils.isEmpty(icon.getEnable())) {
                com.meituan.android.paycommon.lib.utils.w.a(icon.getEnable(), imageView, R.drawable.mpay__payment_default_pic, R.drawable.mpay__payment_default_pic);
            }
            TextView textView2 = (TextView) findViewById(R.id.promotion_dialog_payment_name);
            StringBuilder sb = new StringBuilder();
            Object[] objArr4 = {guidePayTypeInfo};
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "94fb374996a9c3f4b604c9e2f6163c66", RobustBitConfig.DEFAULT_VALUE)) {
                str3 = (String) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "94fb374996a9c3f4b604c9e2f6163c66");
            } else if (guidePayTypeInfo == null) {
                str3 = "";
            } else {
                String str4 = "";
                String name = TextUtils.isEmpty(guidePayTypeInfo.getName()) ? "" : guidePayTypeInfo.getName();
                if (com.meituan.android.pay.common.payment.utils.c.f(guidePayTypeInfo.getPayType())) {
                    Object[] objArr5 = {guidePayTypeInfo};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "ca53eea36a2c23cf35eb30319fd6067b", RobustBitConfig.DEFAULT_VALUE)) {
                        nameExt = (String) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "ca53eea36a2c23cf35eb30319fd6067b");
                    } else {
                        nameExt = (guidePayTypeInfo == null || guidePayTypeInfo.getCardInfo() == null) ? "" : guidePayTypeInfo.getCardInfo().getNameExt();
                    }
                    str4 = nameExt;
                } else if (!TextUtils.isEmpty(guidePayTypeInfo.getNameSuffix())) {
                    str4 = guidePayTypeInfo.getNameSuffix();
                }
                str3 = name + str4;
            }
            sb.append(str3);
            sb.append(" 支付");
            textView2.setText(sb.toString());
            Button button = (Button) findViewById(R.id.promotion_signed_dialog_bottom_button);
            button.setText(this.f.getGuideButton());
            button.setOnClickListener(new com.meituan.android.paycommon.lib.widgets.g() { // from class: com.meituan.android.cashier.dialog.PromotionSignedGuideDialog.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.paycommon.lib.widgets.g
                public final void a(View view) {
                    Object[] objArr6 = {view};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "3fe6321a36699fcf0a32e0bfaa8ec303", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "3fe6321a36699fcf0a32e0bfaa8ec303");
                        return;
                    }
                    PromotionSignedGuideDialog.this.dismiss();
                    com.meituan.android.pay.desk.pack.u.a().f = "promotion_signed_guide_popwindow";
                    if (PromotionSignedGuideDialog.this.e != null) {
                        PromotionSignedGuideDialog.this.e.b(PromotionSignedGuideDialog.this.f.getGuidePayTypeInfo());
                    }
                    PromotionSignedGuideDialog.this.b.put("open_source", "promotion_signed_guide_popwindow");
                    if (PromotionSignedGuideDialog.this.f != null) {
                        com.meituan.android.cashier.utils.b.a(PromotionSignedGuideDialog.this.b, PromotionSignedGuideDialog.this.f.getGuidePayTypeInfo());
                    }
                    com.meituan.android.cashier.common.q.a("c_PJmoK", "b_pay_ma3yhfn3_mc", "引导使用已有支付方式弹窗-主按钮", PromotionSignedGuideDialog.this.b, ae.a.CLICK, PromotionSignedGuideDialog.this.b());
                    if (PromotionSignedGuideDialog.this.f != null) {
                        PromotionSignedGuideDialog.a(PromotionSignedGuideDialog.this, PromotionSignedGuideDialog.this.f.getGuidePayTypeInfo());
                    }
                }
            }.a(1000L));
        }
        this.b.put("open_source", "promotion_signed_guide_popwindow");
        if (this.f != null) {
            com.meituan.android.cashier.utils.b.a(this.b, this.f.getGuidePayTypeInfo());
        }
        com.meituan.android.cashier.common.q.a("c_PJmoK", "b_pay_ue0rpr3c_mv", "引导使用已有支付方式弹窗", this.b, ae.a.VIEW, b());
    }

    public static /* synthetic */ void a(PromotionSignedGuideDialog promotionSignedGuideDialog, View view) {
        Object[] objArr = {promotionSignedGuideDialog, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "291a8f7a2247c76218056b083cde8fdf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "291a8f7a2247c76218056b083cde8fdf");
            return;
        }
        promotionSignedGuideDialog.dismiss();
        com.meituan.android.cashier.common.q.a("c_PJmoK", "b_pay_ofkpwvjx_mc", "引导使用已有支付方式弹窗-主按钮-关闭按钮", promotionSignedGuideDialog.b, ae.a.CLICK, promotionSignedGuideDialog.b());
    }
}
