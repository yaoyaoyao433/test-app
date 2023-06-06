package com.meituan.android.pay.desk.pack;

import android.widget.CompoundButton;
import com.meituan.android.pay.desk.payment.view.BaseDeductSwitchView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class m implements CompoundButton.OnCheckedChangeListener {
    public static ChangeQuickRedirect a;
    private final e b;
    private final BaseDeductSwitchView c;

    private m(e eVar, BaseDeductSwitchView baseDeductSwitchView) {
        this.b = eVar;
        this.c = baseDeductSwitchView;
    }

    public static CompoundButton.OnCheckedChangeListener a(e eVar, BaseDeductSwitchView baseDeductSwitchView) {
        Object[] objArr = {eVar, baseDeductSwitchView};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cb2f2717f9892a71b4b7a215cee4b061", RobustBitConfig.DEFAULT_VALUE) ? (CompoundButton.OnCheckedChangeListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cb2f2717f9892a71b4b7a215cee4b061") : new m(eVar, baseDeductSwitchView);
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Object[] objArr = {compoundButton, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "465fe6bddba380608d29c6832414033f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "465fe6bddba380608d29c6832414033f");
            return;
        }
        e eVar = this.b;
        BaseDeductSwitchView baseDeductSwitchView = this.c;
        Object[] objArr2 = {eVar, baseDeductSwitchView, compoundButton, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "24a52678f63e85d3032107fae5273e94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "24a52678f63e85d3032107fae5273e94");
        } else if (eVar.c != null) {
            eVar.c.b(baseDeductSwitchView, compoundButton, z);
        }
    }
}
