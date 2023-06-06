package com.meituan.android.pay.desk.payment.fragment;

import android.view.View;
import com.meituan.android.pay.common.promotion.bean.LabelIcon;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class h implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final f b;
    private final LabelIcon c;

    private h(f fVar, LabelIcon labelIcon) {
        this.b = fVar;
        this.c = labelIcon;
    }

    public static View.OnClickListener a(f fVar, LabelIcon labelIcon) {
        Object[] objArr = {fVar, labelIcon};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e1bdf2b090f995c77f9faeb0a919f5a4", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e1bdf2b090f995c77f9faeb0a919f5a4") : new h(fVar, labelIcon);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2dc47c6903424182368811293602c1a0", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2dc47c6903424182368811293602c1a0");
        } else {
            f.a(this.b, this.c, view);
        }
    }
}
