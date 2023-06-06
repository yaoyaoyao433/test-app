package com.meituan.android.mrn.component.list.turbo;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class f {
    public static ChangeQuickRedirect a;
    final String b;
    int c;
    boolean d;

    public f(@NonNull String str) {
        boolean z = true;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54e9db7a409f7a0a8edf204e2ffd2502", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54e9db7a409f7a0a8edf204e2ffd2502");
            return;
        }
        this.b = str;
        try {
            this.c = Integer.parseInt(str);
            if (this.c <= 0) {
                z = false;
            }
            this.d = z;
        } catch (Exception unused) {
            this.d = false;
        }
    }
}
