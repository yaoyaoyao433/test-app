package com.meituan.android.pay.desk.payment.view;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import com.meituan.android.pay.common.payment.bean.DeductSwitchDiscount;
import com.meituan.android.paybase.common.activity.PayBaseActivity;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.utils.ae;
import com.meituan.android.paycommon.lib.utils.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class BalanceCombineDeductSwitchView extends BaseDeductSwitchView {
    public static ChangeQuickRedirect a;
    private boolean h;

    public BalanceCombineDeductSwitchView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb8ea131120e8f777198ae0be8f4ac14", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb8ea131120e8f777198ae0be8f4ac14");
        } else {
            this.h = false;
        }
    }

    public BalanceCombineDeductSwitchView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19c9466271714b42a0a3efd02ce51148", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19c9466271714b42a0a3efd02ce51148");
        } else {
            this.h = false;
        }
    }

    @Override // com.meituan.android.pay.desk.payment.view.BaseDeductSwitchView, com.meituan.android.pay.desk.payment.a
    public final void a(DeductSwitchDiscount deductSwitchDiscount) {
        Object[] objArr = {deductSwitchDiscount};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "446b26f033e94678a548acf394bdf498", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "446b26f033e94678a548acf394bdf498");
            return;
        }
        super.a(deductSwitchDiscount);
        Object[] objArr2 = {deductSwitchDiscount};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e25b53ed25fb87365c2f6bc9807e4dcc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e25b53ed25fb87365c2f6bc9807e4dcc");
        } else if (this.g != null) {
            int isChecked = deductSwitchDiscount != null ? this.c.isChecked() : -1;
            if (this.h) {
                return;
            }
            this.h = true;
            com.meituan.android.paybase.common.analyse.a.a("c_PJmoK", "b_pay_mwje8k04_mv", "余额组合支付_mv", new a.c().a("nb_version", com.meituan.android.paybase.config.a.d().q()).a("tradeNo", com.meituan.android.paybase.common.analyse.a.b).a("status", Integer.valueOf(isChecked)).b, a.EnumC0329a.VIEW, -1);
        }
    }

    @Override // com.meituan.android.pay.desk.payment.view.BaseDeductSwitchView
    public void setOnCheckedListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        Object[] objArr = {onCheckedChangeListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "474702e47557085e7c480acff784b464", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "474702e47557085e7c480acff784b464");
        } else {
            this.c.setOnCheckedChangeListener(a.a(this, onCheckedChangeListener));
        }
    }

    public static /* synthetic */ void a(BalanceCombineDeductSwitchView balanceCombineDeductSwitchView, CompoundButton.OnCheckedChangeListener onCheckedChangeListener, CompoundButton compoundButton, boolean z) {
        Object[] objArr = {balanceCombineDeductSwitchView, onCheckedChangeListener, compoundButton, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cadd4addeac862c2807b74ed2ed928d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cadd4addeac862c2807b74ed2ed928d0");
            return;
        }
        balanceCombineDeductSwitchView.f.setVisibility(z ? 0 : 8);
        onCheckedChangeListener.onCheckedChanged(compoundButton, z);
        if (compoundButton.isPressed()) {
            com.meituan.android.pay.common.analyse.b.a("c_PJmoK", "b_pay_mwje8k04_mc", "余额组合支付_mc", new a.c().a("nb_version", com.meituan.android.paybase.config.a.d().q()).a("tradeNo", com.meituan.android.paybase.common.analyse.a.b).a("type", z ? "开启" : "关闭").b, ae.a.CLICK, -1, balanceCombineDeductSwitchView.getUniqueId());
        }
    }

    private String getUniqueId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6a2437eb8ab6a5132ed3bc54475131e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6a2437eb8ab6a5132ed3bc54475131e");
        }
        Activity a2 = u.a(this);
        if (a2 instanceof PayBaseActivity) {
            PayBaseActivity payBaseActivity = (PayBaseActivity) a2;
            return !TextUtils.isEmpty(payBaseActivity.p()) ? payBaseActivity.p() : "";
        }
        return "";
    }
}
