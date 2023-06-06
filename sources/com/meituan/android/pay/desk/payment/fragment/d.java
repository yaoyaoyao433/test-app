package com.meituan.android.pay.desk.payment.fragment;

import android.widget.CompoundButton;
import com.meituan.android.pay.common.promotion.bean.LabelSwitch;
import com.meituan.android.pay.common.promotion.bean.PayLabel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements CompoundButton.OnCheckedChangeListener {
    public static ChangeQuickRedirect a;
    private final a b;
    private final LabelSwitch c;
    private final PayLabel d;

    private d(a aVar, LabelSwitch labelSwitch, PayLabel payLabel) {
        this.b = aVar;
        this.c = labelSwitch;
        this.d = payLabel;
    }

    public static CompoundButton.OnCheckedChangeListener a(a aVar, LabelSwitch labelSwitch, PayLabel payLabel) {
        Object[] objArr = {aVar, labelSwitch, payLabel};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "276a895e6d600a17dd677d360d1c1a65", RobustBitConfig.DEFAULT_VALUE) ? (CompoundButton.OnCheckedChangeListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "276a895e6d600a17dd677d360d1c1a65") : new d(aVar, labelSwitch, payLabel);
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Object[] objArr = {compoundButton, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "512b008165bfe38d075fbe6e6c125058", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "512b008165bfe38d075fbe6e6c125058");
        } else {
            a.a(this.b, this.c, this.d, compoundButton, z);
        }
    }
}
