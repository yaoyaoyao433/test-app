package com.meituan.android.neohybrid.core;

import android.view.View;
import com.dianping.titans.ui.ComplexButton;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class p implements ComplexButton.PerformClickListener {
    public static ChangeQuickRedirect a;
    private final n b;

    private p(n nVar) {
        this.b = nVar;
    }

    public static ComplexButton.PerformClickListener a(n nVar) {
        Object[] objArr = {nVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3daac428c2d8aa17f7b1e6edc76ef468", RobustBitConfig.DEFAULT_VALUE) ? (ComplexButton.PerformClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3daac428c2d8aa17f7b1e6edc76ef468") : new p(nVar);
    }

    @Override // com.dianping.titans.ui.ComplexButton.PerformClickListener
    public final void onPerformClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8c83b2327c2f4af33582f364853b91f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8c83b2327c2f4af33582f364853b91f");
            return;
        }
        n nVar = this.b;
        Object[] objArr2 = {nVar, view};
        ChangeQuickRedirect changeQuickRedirect2 = n.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "276a3eddc791c241047b8a6cff5bc2f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "276a3eddc791c241047b8a6cff5bc2f0");
        } else if (nVar.i != null) {
            nVar.a(view);
        }
    }
}
