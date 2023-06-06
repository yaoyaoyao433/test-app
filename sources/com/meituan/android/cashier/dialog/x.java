package com.meituan.android.cashier.dialog;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class x implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final PromotionSignedGuideDialog b;

    private x(PromotionSignedGuideDialog promotionSignedGuideDialog) {
        this.b = promotionSignedGuideDialog;
    }

    public static View.OnClickListener a(PromotionSignedGuideDialog promotionSignedGuideDialog) {
        Object[] objArr = {promotionSignedGuideDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eb09266cb338bebca7c134cc2debe70a", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eb09266cb338bebca7c134cc2debe70a") : new x(promotionSignedGuideDialog);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfcf0ead60e300c02e3fc6c494156848", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfcf0ead60e300c02e3fc6c494156848");
        } else {
            PromotionSignedGuideDialog.a(this.b, view);
        }
    }
}
