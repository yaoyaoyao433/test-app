package com.meituan.android.pay.desk.component.view;

import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.android.pay.desk.component.bean.standardcomponent.BalanceCombinePayment;
import com.meituan.android.pay.desk.component.bean.standardcomponent.CashDesk;
import com.meituan.android.pay.desk.component.data.DeskData;
import com.meituan.android.paybase.utils.MTPaySuppressFBWarnings;
import com.meituan.android.paycommon.lib.widgets.PayLabelContainer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b implements com.meituan.android.pay.desk.component.a {
    public static ChangeQuickRedirect a;
    @MTPaySuppressFBWarnings({"URF_UNREAD_FIELD"})
    public CompoundButton.OnCheckedChangeListener b;
    private LinearLayout c;
    private com.meituan.android.pay.common.payment.data.c d;

    public b(LinearLayout linearLayout, com.meituan.android.pay.common.payment.data.c cVar) {
        Object[] objArr = {linearLayout, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb362168629cdb07a26d6f1359ed3726", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb362168629cdb07a26d6f1359ed3726");
            return;
        }
        this.c = linearLayout;
        this.d = cVar;
    }

    @Override // com.meituan.android.pay.desk.component.a
    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4a59952623c6208d391f94410f3b3ed", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4a59952623c6208d391f94410f3b3ed")).booleanValue();
        }
        List<BalanceCombinePayment> c = com.meituan.android.pay.desk.component.data.a.c(this.d);
        return !com.meituan.android.paybase.utils.i.a((Collection) c) && c.size() == 2;
    }

    @Override // com.meituan.android.pay.desk.component.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "089e0776bf7f98c810e0e63f2a981048", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "089e0776bf7f98c810e0e63f2a981048");
        } else {
            m.a(this.c, Integer.valueOf((int) R.id.mpay__desk_balance_combine_view), (int) R.layout.mpay__balance_combine_pay_hint);
        }
    }

    @Override // com.meituan.android.pay.desk.component.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43b38af254cd110696da37bbae668c0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43b38af254cd110696da37bbae668c0e");
        } else if (this.c != null && this.c.getContext() != null) {
            LinearLayout linearLayout = (LinearLayout) this.c.findViewById(R.id.balance_combine_pay_hint);
            List<BalanceCombinePayment> c = com.meituan.android.pay.desk.component.data.a.c(this.d);
            if (a()) {
                for (BalanceCombinePayment balanceCombinePayment : c) {
                    View inflate = LayoutInflater.from(this.c.getContext()).inflate(R.layout.paycommon__balance_combine_detail, (ViewGroup) this.c, false);
                    if (balanceCombinePayment != null) {
                        ((TextView) inflate.findViewById(R.id.paycommon__combine_pay_name)).setText(balanceCombinePayment.getName());
                        ((TextView) inflate.findViewById(R.id.paycommon__combine_pay_amount)).setTag(balanceCombinePayment.getPayType());
                        linearLayout.addView(inflate);
                        if (!com.meituan.android.pay.common.payment.utils.c.a(balanceCombinePayment.getPayType())) {
                            new DeskData.a().a(this.d).a(balanceCombinePayment);
                            PayLabelContainer payLabelContainer = (PayLabelContainer) inflate.findViewById(R.id.paycommon__bankcard_label_container);
                            if (!com.meituan.android.paybase.utils.i.a((Collection) balanceCombinePayment.getLabels())) {
                                payLabelContainer.removeAllViews();
                                payLabelContainer.setVisibility(0);
                                payLabelContainer.a(balanceCombinePayment.getLabels());
                            } else {
                                payLabelContainer.setVisibility(8);
                            }
                        }
                    }
                }
                a(this.c, this.d);
            }
        }
    }

    @Override // com.meituan.android.pay.desk.component.a
    public final void d() {
        LinearLayout linearLayout;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43604e3809239a9ce583073df204ebcc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43604e3809239a9ce583073df204ebcc");
        } else if (this.c == null || (linearLayout = (LinearLayout) this.c.findViewById(R.id.balance_combine_pay_hint)) == null) {
        } else {
            linearLayout.setVisibility(8);
        }
    }

    public static void a(LinearLayout linearLayout, com.meituan.android.pay.common.payment.data.c cVar) {
        Object[] objArr = {linearLayout, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        BalanceCombinePayment balanceCombinePayment = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "813e1304c4dfe0730f7578c76379ccbf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "813e1304c4dfe0730f7578c76379ccbf");
        } else if (linearLayout != null && linearLayout.getContext() != null && (cVar instanceof CashDesk)) {
            CashDesk cashDesk = (CashDesk) cVar;
            float price = cashDesk.getPrice();
            List<BalanceCombinePayment> balanceCombineDetailList = cashDesk.getBalanceCombineDetailList();
            if (com.meituan.android.paybase.utils.i.a((Collection) balanceCombineDetailList) || balanceCombineDetailList.size() != 2) {
                return;
            }
            float f = 0.0f;
            TextView textView = null;
            TextView textView2 = null;
            for (BalanceCombinePayment balanceCombinePayment2 : balanceCombineDetailList) {
                if (com.meituan.android.pay.common.payment.utils.c.a(balanceCombinePayment2.getPayType())) {
                    textView = (TextView) linearLayout.findViewWithTag(balanceCombinePayment2.getPayType());
                    f = balanceCombinePayment2.getBalance();
                } else {
                    textView2 = (TextView) linearLayout.findViewWithTag(balanceCombinePayment2.getPayType());
                    balanceCombinePayment = balanceCombinePayment2;
                }
            }
            BigDecimal a2 = com.meituan.android.pay.desk.component.discount.a.a(f, cashDesk, balanceCombinePayment);
            if (textView != null) {
                textView.setText(String.format(linearLayout.getContext().getString(R.string.mpay__balance_combine_name_ext), a2));
            }
            if (textView2 != null) {
                textView2.setText(String.format(linearLayout.getContext().getString(R.string.mpay__balance_combine_name_ext), com.meituan.android.paybase.utils.d.b(Float.valueOf(com.meituan.android.pay.desk.component.discount.a.a(cashDesk, price, balanceCombinePayment)), a2)));
            }
        }
    }
}
