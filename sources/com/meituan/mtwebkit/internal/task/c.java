package com.meituan.mtwebkit.internal.task;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c extends Exception {
    public static ChangeQuickRedirect a;
    public a<?> b;

    public c(a<?> aVar, Throwable th) {
        super(th.getMessage(), th);
        Object[] objArr = {aVar, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb976d81bf0a3f637edd2b636691a994", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb976d81bf0a3f637edd2b636691a994");
        } else {
            this.b = aVar;
        }
    }

    public c(a<?> aVar, String str) {
        super(str);
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b598bbdc1f9b96a0645d10e7bf279993", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b598bbdc1f9b96a0645d10e7bf279993");
        } else {
            this.b = aVar;
        }
    }
}
