package com.meituan.msc.modules.apploader.events;

import com.meituan.android.mercury.msc.adaptor.core.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a extends RuntimeException {
    public static ChangeQuickRedirect a;
    public int b;

    public a(int i, String str, Throwable th) {
        super(str, th);
        Object[] objArr = {Integer.valueOf(i), str, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61ff91fdc70a0403b05b9eb5087b8fca", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61ff91fdc70a0403b05b9eb5087b8fca");
        } else {
            this.b = i;
        }
    }

    public a(int i, String str) {
        super(str);
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a05767f0a47ece907e9d97d250f19997", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a05767f0a47ece907e9d97d250f19997");
        } else {
            this.b = i;
        }
    }

    public a(Throwable th) {
        super(th);
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "650205502a6dfa426b6cb6ffea25f30f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "650205502a6dfa426b6cb6ffea25f30f");
        } else if (th instanceof e) {
            this.b = ((e) th).a();
        }
    }
}
