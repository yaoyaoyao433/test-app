package com.meituan.android.ptcommonim.video.record;

import android.app.Activity;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final PTIMRecordFragment b;
    private final Activity c;

    private a(PTIMRecordFragment pTIMRecordFragment, Activity activity) {
        this.b = pTIMRecordFragment;
        this.c = activity;
    }

    public static View.OnClickListener a(PTIMRecordFragment pTIMRecordFragment, Activity activity) {
        Object[] objArr = {pTIMRecordFragment, activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b8a6f7bc79b8633ac807c427f8f931be", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b8a6f7bc79b8633ac807c427f8f931be") : new a(pTIMRecordFragment, activity);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5861a24c16bd3c8ae90612d62e9c391c", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5861a24c16bd3c8ae90612d62e9c391c");
        } else {
            PTIMRecordFragment.a(this.b, this.c, view);
        }
    }
}
