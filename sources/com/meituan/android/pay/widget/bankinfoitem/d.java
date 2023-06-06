package com.meituan.android.pay.widget.bankinfoitem;

import android.view.View;
import com.meituan.android.pay.model.bean.BankFactor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final c b;
    private final BankFactor c;

    private d(c cVar, BankFactor bankFactor) {
        this.b = cVar;
        this.c = bankFactor;
    }

    public static View.OnClickListener a(c cVar, BankFactor bankFactor) {
        Object[] objArr = {cVar, bankFactor};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "37a87a97685316b12b5e849a98082b69", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "37a87a97685316b12b5e849a98082b69") : new d(cVar, bankFactor);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30b2b48b1c20c4ccfc10a1a6fb85e1a0", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30b2b48b1c20c4ccfc10a1a6fb85e1a0");
        } else {
            c.a(this.b, this.c, view);
        }
    }
}
