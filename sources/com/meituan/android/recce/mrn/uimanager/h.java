package com.meituan.android.recce.mrn.uimanager;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements View.OnLongClickListener {
    public static ChangeQuickRedirect a;
    private final f b;

    private h(f fVar) {
        this.b = fVar;
    }

    public static View.OnLongClickListener a(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c5854fdd0d949e61f3a22eeafa18f696", RobustBitConfig.DEFAULT_VALUE) ? (View.OnLongClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c5854fdd0d949e61f3a22eeafa18f696") : new h(fVar);
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5787fbd6cfa7604f31f011fd1defc120", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5787fbd6cfa7604f31f011fd1defc120")).booleanValue() : f.lambda$visitLongClick$1(this.b, view);
    }
}
