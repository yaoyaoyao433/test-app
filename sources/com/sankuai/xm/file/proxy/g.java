package com.sankuai.xm.file.proxy;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class g<T> {
    public static ChangeQuickRedirect a;
    public T b;

    public g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59c928ff458dad4f4c935c39a2f70161", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59c928ff458dad4f4c935c39a2f70161");
        } else {
            this.b = null;
        }
    }
}
