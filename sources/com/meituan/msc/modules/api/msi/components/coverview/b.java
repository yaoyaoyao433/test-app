package com.meituan.msc.modules.api.msi.components.coverview;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static void a(View view) {
        a coverUpdateObserver;
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "59dcfc6f7970b36a9c344fce55e4adef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "59dcfc6f7970b36a9c344fce55e4adef");
        } else if (!(view instanceof c) || (coverUpdateObserver = ((c) view).getCoverUpdateObserver()) == null) {
        } else {
            coverUpdateObserver.a();
        }
    }
}
