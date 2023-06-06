package com.sankuai.waimai.store.drug.mrn;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final DrugCommonMRNFragment b;

    private a(DrugCommonMRNFragment drugCommonMRNFragment) {
        this.b = drugCommonMRNFragment;
    }

    public static View.OnClickListener a(DrugCommonMRNFragment drugCommonMRNFragment) {
        Object[] objArr = {drugCommonMRNFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b47feab838d074d7cf3206cfcadd7562", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b47feab838d074d7cf3206cfcadd7562") : new a(drugCommonMRNFragment);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb5e50cf959070326ee9864d55f64002", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb5e50cf959070326ee9864d55f64002");
        } else {
            DrugCommonMRNFragment.a(this.b, view);
        }
    }
}
