package com.meituan.passport.retrieve;

import android.view.View;
import com.meituan.passport.retrieve.RetrievePassportActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final RetrievePassportActivity.AnonymousClass1 b;

    private b(RetrievePassportActivity.AnonymousClass1 anonymousClass1) {
        this.b = anonymousClass1;
    }

    public static View.OnClickListener a(RetrievePassportActivity.AnonymousClass1 anonymousClass1) {
        Object[] objArr = {anonymousClass1};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a67905d87990c0dce6eae0aec8195d56", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a67905d87990c0dce6eae0aec8195d56") : new b(anonymousClass1);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34b3bb985a4439f95526252adae221b2", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34b3bb985a4439f95526252adae221b2");
            return;
        }
        RetrievePassportActivity.AnonymousClass1 anonymousClass1 = this.b;
        Object[] objArr2 = {anonymousClass1, view};
        ChangeQuickRedirect changeQuickRedirect2 = RetrievePassportActivity.AnonymousClass1.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "0c943951bafe416b83f7c2949d9ad369", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "0c943951bafe416b83f7c2949d9ad369");
        } else {
            RetrievePassportActivity.this.onBackPressed();
        }
    }
}
