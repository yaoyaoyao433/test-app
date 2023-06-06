package com.meituan.msc.mmpviews.swiper;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.msc.mmpviews.view.MPViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b extends MPViewGroup {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.msc.mmpviews.shell.d, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public b(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc3e7f5c5a5d272465dc89d44bfc09bf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc3e7f5c5a5d272465dc89d44bfc09bf");
        }
    }
}
