package com.meituan.android.identifycardrecognizer;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class j implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final PhotoSelectorActivity b;

    public j(PhotoSelectorActivity photoSelectorActivity) {
        this.b = photoSelectorActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83abc5721b5b2f496273862ad8330ad2", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83abc5721b5b2f496273862ad8330ad2");
        } else {
            PhotoSelectorActivity.a(this.b, view);
        }
    }
}
