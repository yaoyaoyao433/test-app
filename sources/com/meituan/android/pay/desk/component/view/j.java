package com.meituan.android.pay.desk.component.view;

import android.app.Activity;
import android.support.constraint.R;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.android.pay.common.payment.bean.RepayHelp;
import com.meituan.android.pay.common.promotion.bean.Agreement;
import com.meituan.android.pay.desk.component.bean.standardcomponent.CashDesk;
import com.meituan.android.pay.desk.component.data.DeskData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class j implements com.meituan.android.pay.desk.component.a {
    public static ChangeQuickRedirect a;
    LinearLayout b;
    Activity c;
    private DeskData d;

    public j(Activity activity, LinearLayout linearLayout, DeskData deskData) {
        Object[] objArr = {activity, linearLayout, deskData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93a04dbfd883f9f1383abb727abc5365", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93a04dbfd883f9f1383abb727abc5365");
            return;
        }
        this.b = linearLayout;
        this.d = deskData;
        this.c = activity;
    }

    @Override // com.meituan.android.pay.desk.component.a
    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c84f7205cf04a11aede0a1f0263fa0d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c84f7205cf04a11aede0a1f0263fa0d")).booleanValue();
        }
        if (this.d == null) {
            return false;
        }
        com.meituan.android.pay.common.payment.data.c desk = this.d.getDesk();
        return (desk instanceof CashDesk) && ((CashDesk) desk).getAgreement() != null;
    }

    @Override // com.meituan.android.pay.desk.component.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36311c18f59686ea006a71e0bf5535e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36311c18f59686ea006a71e0bf5535e7");
        } else {
            m.a(this.b, Integer.valueOf((int) R.id.mpay__desk_contract_view), (int) R.layout.paycommon__credit_pay_contract);
        }
    }

    @Override // com.meituan.android.pay.desk.component.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5243228263dae6a9fb115ead6f62253", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5243228263dae6a9fb115ead6f62253");
            return;
        }
        com.meituan.android.pay.common.payment.data.c desk = this.d.getDesk();
        if (this.b == null || this.b.getContext() == null || desk == null || !(desk instanceof CashDesk)) {
            return;
        }
        CashDesk cashDesk = (CashDesk) desk;
        Agreement agreement = cashDesk.getAgreement();
        RepayHelp repayHelp = cashDesk.getRepayHelp();
        if (agreement == null || repayHelp == null) {
            return;
        }
        TextView textView = (TextView) this.b.findViewById(R.id.meituanpay__protocol);
        TextView textView2 = (TextView) this.b.findViewById(R.id.meituanpay__prompt);
        ((TextView) this.b.findViewById(R.id.meituanpay__protocol_prefix)).setText(agreement.getAgreementPrefix());
        textView.setText(agreement.getName());
        String url = agreement.getUrl();
        if (!TextUtils.isEmpty(url)) {
            textView.setOnClickListener(k.a(this, url));
        } else {
            com.meituan.android.paybase.common.analyse.cat.a.a("urlIsNull", com.meituan.android.pay.common.payment.utils.b.b(this.c, "pay_type") + "协议链接为空");
        }
        textView2.setText(repayHelp.getPrompt());
        if (repayHelp.getHelpAlert() == null || !(this.b.getContext() instanceof Activity)) {
            return;
        }
        textView2.setOnClickListener(l.a(this, repayHelp));
    }

    @Override // com.meituan.android.pay.desk.component.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79215182cff6859f64bd1bd606720108", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79215182cff6859f64bd1bd606720108");
        } else {
            m.a(this.b, Integer.valueOf((int) R.id.mpay__desk_contract_view));
        }
    }
}
