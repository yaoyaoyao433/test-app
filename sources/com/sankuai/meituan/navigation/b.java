package com.sankuai.meituan.navigation;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.meituan.navigation.common.g;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public c b;

    public b(@NonNull Context context, @NonNull g gVar) {
        Object[] objArr = {context, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "891d3c66e1c016f87b9d820348abc6d5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "891d3c66e1c016f87b9d820348abc6d5");
        } else {
            this.b = new c(context, gVar);
        }
    }
}
