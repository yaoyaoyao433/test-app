package com.meituan.android.cashier.widget;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.Html;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.cashier.common.q;
import com.meituan.android.cashier.common.r;
import com.meituan.android.cashier.model.bean.Cashier;
import com.meituan.android.pay.common.payment.bean.FinanceServiceBean;
import com.meituan.android.pay.common.payment.bean.FloatingLayer;
import com.meituan.android.pay.common.payment.bean.MTPayment;
import com.meituan.android.pay.common.promotion.bean.LabelAbTest;
import com.meituan.android.pay.common.selectdialog.bean.WalletPaymentListPage;
import com.meituan.android.pay.desk.pack.u;
import com.meituan.android.pay.desk.payment.bean.standarddesk.WalletPayment;
import com.meituan.android.pay.model.bean.RetainDisplayCloseInfoBean;
import com.meituan.android.paybase.common.activity.PayBaseActivity;
import com.meituan.android.paybase.utils.ae;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CashierMarketingGuideFloatView extends LinearLayout {
    public static ChangeQuickRedirect a;
    public a b;
    public Cashier c;
    private MTPayment d;
    private FloatingLayer e;
    private float f;
    private String g;
    private com.meituan.android.pay.common.payment.data.d h;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void a(MTPayment mTPayment);

        void a(boolean z);
    }

    public CashierMarketingGuideFloatView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "402ed0ec1c84deae57f3150ae5f4732e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "402ed0ec1c84deae57f3150ae5f4732e");
        }
    }

    public CashierMarketingGuideFloatView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "778f1eb20cad16ca4e6e3b15d60a5b20", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "778f1eb20cad16ca4e6e3b15d60a5b20");
        }
    }

    public CashierMarketingGuideFloatView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a516872f830d38715ae1d3f40400a542", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a516872f830d38715ae1d3f40400a542");
        }
    }

    public final void a(com.meituan.android.pay.common.payment.data.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69eb3b33a1517c50d13854a524496703", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69eb3b33a1517c50d13854a524496703");
            return;
        }
        this.h = dVar;
        b(this.c, dVar);
    }

    private boolean a(Cashier cashier, com.meituan.android.pay.common.payment.data.d dVar) {
        WalletPaymentListPage walletPaymentListPage;
        LabelAbTest labelAbTest;
        Object[] objArr = {cashier, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36cced1c61f0f5d297ca064a6bf25bba", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36cced1c61f0f5d297ca064a6bf25bba")).booleanValue();
        }
        if (cashier == null || dVar == null) {
            return false;
        }
        WalletPayment a2 = com.meituan.android.cashier.retrofit.a.a(cashier);
        if (com.meituan.android.cashier.retrofit.a.a(a2, dVar) || a2 == null || (walletPaymentListPage = a2.getWalletPaymentListPage()) == null || (labelAbTest = walletPaymentListPage.getLabelAbTest()) == null || !labelAbTest.isShowFloat() || !com.meituan.android.paybase.utils.i.a((Collection) dVar.getBottomLabels())) {
            return false;
        }
        Object[] objArr2 = {cashier};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7b16a57ccc37b1f0b9097d876e97a92a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7b16a57ccc37b1f0b9097d876e97a92a")).booleanValue();
        }
        if (b(cashier) != null) {
            return this.e != null || com.meituan.android.paybase.utils.d.c((Number) Float.valueOf(this.f), (Number) 0) > 0;
        }
        return false;
    }

    private void b(Cashier cashier, com.meituan.android.pay.common.payment.data.d dVar) {
        Object[] objArr = {cashier, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "275b92b221286c72282c03828333b3fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "275b92b221286c72282c03828333b3fe");
        } else if (a(cashier, dVar)) {
            if (b(cashier) != null && ((TextView) findViewById(R.id.cashier_discount_text)) == null) {
                setOnClickListener(e.a(this, cashier));
                if (this.e != null) {
                    this.g = this.e.getFirstContent();
                    if (this.e.getFloatTemplate() == 2) {
                        inflate(getContext(), R.layout.cashier__marketing_float_view_with_btn, this);
                        TextView textView = (TextView) findViewById(R.id.cashier_discount_text);
                        if (!TextUtils.isEmpty(this.e.getFirstContent())) {
                            textView.setText(Html.fromHtml(this.e.getFirstContent()));
                        }
                        TextView textView2 = (TextView) findViewById(R.id.cashier_discount_text_btn);
                        textView2.setText(this.e.getSecondContent());
                        textView2.setVisibility(0);
                    } else {
                        inflate(getContext(), R.layout.cashier__marketing_float_view, this);
                        TextView textView3 = (TextView) findViewById(R.id.cashier_discount_text);
                        if (!TextUtils.isEmpty(this.e.getFirstContent())) {
                            textView3.setText(Html.fromHtml(this.e.getFirstContent()));
                        }
                    }
                } else if (this.f > 0.0f) {
                    inflate(getContext(), R.layout.cashier__marketing_float_view, this);
                    this.g = String.format(getContext().getString(R.string.cashier__discount_button_text), r.a(this.f));
                    ((TextView) findViewById(R.id.cashier_discount_text)).setText(this.g);
                }
            }
            a(cashier);
        } else {
            a();
        }
    }

    public static /* synthetic */ void a(CashierMarketingGuideFloatView cashierMarketingGuideFloatView, Cashier cashier, View view) {
        Object[] objArr = {cashierMarketingGuideFloatView, cashier, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "92751f53f309e1747149828f825b6976", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "92751f53f309e1747149828f825b6976");
            return;
        }
        Object[] objArr2 = {cashier};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, cashierMarketingGuideFloatView, changeQuickRedirect2, false, "335cd01f06821abaa548f2091313a376", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cashierMarketingGuideFloatView, changeQuickRedirect2, false, "335cd01f06821abaa548f2091313a376");
            return;
        }
        MTPayment b = cashierMarketingGuideFloatView.b(cashier);
        if (b != null) {
            u.a().f = "standardPayCashierMarketing";
            q.a("c_PJmoK", "b_pay_r1j06raz_mc", "点击再减x元按钮", cashierMarketingGuideFloatView.getValLabMap(), ae.a.CLICK, cashierMarketingGuideFloatView.getUniqueId());
            if (cashierMarketingGuideFloatView.b != null) {
                cashierMarketingGuideFloatView.b.a(b);
            }
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "527731165409c9bdbc969c2987ab07f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "527731165409c9bdbc969c2987ab07f0");
        } else if (this.b != null) {
            this.b.a(false);
        }
    }

    private void a(Cashier cashier) {
        MTPayment b;
        Object[] objArr = {cashier};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca2778e78f2bb1de0d0c40ddeebc7de2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca2778e78f2bb1de0d0c40ddeebc7de2");
            return;
        }
        if (this.b != null) {
            this.b.a(true);
        }
        q.a("c_PJmoK", "b_pay_r1j06raz_mv", "再减x元按钮曝光", getValLabMap(), ae.a.VIEW, getUniqueId());
        HashMap hashMap = new HashMap();
        if (cashier != null && (b = b(cashier)) != null) {
            hashMap.put("pay_type", b.getPayType());
        }
        hashMap.put(KnbConstants.PARAMS_SCENE, RetainDisplayCloseInfoBean.TYPE_STANDARDCASHIER);
        q.a("paybiz_payment_marketing_float_show", hashMap, (List<Float>) null, getUniqueId());
    }

    private Map<String, Object> getValLabMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "465b30cc9d9b1817ac463274c45d4621", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "465b30cc9d9b1817ac463274c45d4621");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("pay_type", this.d != null ? this.d.getPayType() : "");
        hashMap.put("activity_id", this.e != null ? this.e.getFloatId() : "");
        hashMap.put("title", this.g != null ? this.g : "");
        hashMap.put("open_source", "standardPayCashierMarketing");
        if (this.h != null) {
            hashMap.put("currentSelected_pay_type", this.h.getPayType());
        }
        com.meituan.android.cashier.utils.b.a(hashMap, this.d);
        return hashMap;
    }

    private MTPayment b(Cashier cashier) {
        Object[] objArr = {cashier};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b88034637735a19a82f56d34a2337e4f", RobustBitConfig.DEFAULT_VALUE)) {
            return (MTPayment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b88034637735a19a82f56d34a2337e4f");
        }
        if (this.d != null) {
            return this.d;
        }
        WalletPayment a2 = com.meituan.android.cashier.retrofit.a.a(cashier);
        if (cashier == null || a2 == null) {
            return null;
        }
        List<FinanceServiceBean> financeDataList = cashier.getFinanceDataList();
        Object[] b = com.meituan.android.pay.desk.payment.discount.a.b(a2, financeDataList);
        if (b[0] instanceof com.meituan.android.pay.common.payment.data.d) {
            this.d = (MTPayment) b[0];
            this.e = (FloatingLayer) b[1];
        } else {
            Object[] a3 = com.meituan.android.pay.desk.payment.discount.a.a(a2, financeDataList);
            if (a3[0] instanceof com.meituan.android.pay.common.payment.data.d) {
                this.d = (MTPayment) a3[0];
                this.f = ((Float) a3[1]).floatValue();
            }
        }
        return this.d;
    }

    private String getUniqueId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ce4b20f302006149a88b1ca1d25bb2c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ce4b20f302006149a88b1ca1d25bb2c");
        }
        Activity a2 = com.meituan.android.paycommon.lib.utils.u.a(this);
        if (a2 instanceof PayBaseActivity) {
            PayBaseActivity payBaseActivity = (PayBaseActivity) a2;
            return !TextUtils.isEmpty(payBaseActivity.p()) ? payBaseActivity.p() : "";
        }
        return "";
    }
}
