package com.meituan.android.paybase.widgets.agreement;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final AgreementView b;
    private final AgreementBean c;

    private a(AgreementView agreementView, AgreementBean agreementBean) {
        this.b = agreementView;
        this.c = agreementBean;
    }

    public static View.OnClickListener a(AgreementView agreementView, AgreementBean agreementBean) {
        Object[] objArr = {agreementView, agreementBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2f5758b1d32eba3145d0337a181ba4f6", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2f5758b1d32eba3145d0337a181ba4f6") : new a(agreementView, agreementBean);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdcc2f86962ed453331f380fcb7d80fe", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdcc2f86962ed453331f380fcb7d80fe");
        } else {
            AgreementView.a(this.b, this.c, view);
        }
    }
}
