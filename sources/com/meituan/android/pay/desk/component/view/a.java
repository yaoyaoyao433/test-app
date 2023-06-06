package com.meituan.android.pay.desk.component.view;

import android.support.constraint.R;
import android.text.TextUtils;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.android.pay.desk.component.bean.precomponent.AdjustCreditGuide;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a implements com.meituan.android.pay.desk.component.a {
    public static ChangeQuickRedirect a;
    private LinearLayout b;
    private com.meituan.android.pay.common.payment.data.c c;

    public a(LinearLayout linearLayout, com.meituan.android.pay.common.payment.data.c cVar) {
        Object[] objArr = {linearLayout, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "528d1d12e9af86608419a7b7f7a87c99", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "528d1d12e9af86608419a7b7f7a87c99");
            return;
        }
        this.b = linearLayout;
        this.c = cVar;
    }

    @Override // com.meituan.android.pay.desk.component.a
    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a0aaa7ac414ade18e0a2e6ff20f8fff", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a0aaa7ac414ade18e0a2e6ff20f8fff")).booleanValue() : com.meituan.android.pay.desk.component.data.a.a(this.c) != null;
    }

    @Override // com.meituan.android.pay.desk.component.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5e2f8f5511d43a56fdeae4c129894fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5e2f8f5511d43a56fdeae4c129894fc");
        } else {
            m.a(this.b, Integer.valueOf((int) R.id.mpay__desk_adjust_no_password_guide_view), (int) R.layout.mpay__adjust_no_password_guide);
        }
    }

    @Override // com.meituan.android.pay.desk.component.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6355f5197a1806b93762ba7c9c349676", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6355f5197a1806b93762ba7c9c349676");
            return;
        }
        AdjustCreditGuide a2 = com.meituan.android.pay.desk.component.data.a.a(this.c);
        if (a2 == null || this.b == null || this.b.getContext() == null) {
            return;
        }
        com.meituan.android.paybase.common.analyse.a.c("b_CVxD6", "POP_AMOUNT_PASS", null);
        if (!TextUtils.isEmpty(a2.getGuideTip())) {
            ((TextView) this.b.findViewById(R.id.adjust_credit_tip)).setText(a2.getGuideTip());
        }
        StringBuffer stringBuffer = new StringBuffer(String.valueOf(a2.getCreditNew()));
        stringBuffer.append(this.b.getContext().getString(R.string.mpay__yuan));
        ((TextView) this.b.findViewById(R.id.adjust_credit_new)).setText(stringBuffer);
        ((CheckBox) this.b.findViewById(R.id.adjust_credit_checkbox)).setChecked(a2.isNeedAdjust());
    }

    @Override // com.meituan.android.pay.desk.component.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd5705d4f0d260741a3efe496c7dda02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd5705d4f0d260741a3efe496c7dda02");
        } else {
            m.a(this.b, Integer.valueOf((int) R.id.mpay__desk_adjust_no_password_guide_view));
        }
    }
}
