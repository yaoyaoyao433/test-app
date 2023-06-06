package com.meituan.android.privacy.proxy;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class g implements com.meituan.android.privacy.interfaces.n {
    public static ChangeQuickRedirect a;
    private com.meituan.android.privacy.interfaces.o b;
    private final String c;

    public g(@NonNull Context context, @NonNull String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "490aa6a8a39e4bf1487b428aced62bec", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "490aa6a8a39e4bf1487b428aced62bec");
            return;
        }
        this.c = str;
        if (context != null) {
            this.b = new h(context);
        }
    }
}
