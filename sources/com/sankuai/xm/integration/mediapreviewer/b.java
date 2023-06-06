package com.sankuai.xm.integration.mediapreviewer;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public final c b;
    public Context c;

    public b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9749c4b77f907ad86c5ea9ccc7a772a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9749c4b77f907ad86c5ea9ccc7a772a");
            return;
        }
        this.b = new c();
        this.c = context;
    }
}
