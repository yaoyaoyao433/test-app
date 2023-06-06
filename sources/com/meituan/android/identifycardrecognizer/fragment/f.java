package com.meituan.android.identifycardrecognizer.fragment;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class f implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final OcrFragment b;

    public f(OcrFragment ocrFragment) {
        this.b = ocrFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a310b11cad7880a448ef288056f0dfe", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a310b11cad7880a448ef288056f0dfe");
        } else {
            OcrFragment.a(this.b, view);
        }
    }
}
