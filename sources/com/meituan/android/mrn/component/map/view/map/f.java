package com.meituan.android.mrn.component.map.view.map;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* loaded from: classes2.dex */
public final class f extends com.facebook.react.views.view.f {
    public static ChangeQuickRedirect a;

    public f(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8c78709e771f626bb8ee1772599f65e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8c78709e771f626bb8ee1772599f65e");
            return;
        }
        setWillNotDraw(true);
        setVisibility(0);
        setAlpha(0.0f);
        setRemoveClippedSubviews(false);
        setOverflow("hidden");
    }

    @Override // com.facebook.react.views.view.f, android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }
}
