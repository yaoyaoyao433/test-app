package com.sankuai.meituan.mapfoundation.storage;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public final long b;
    public final String[] c;
    public final String[] d;
    public final String[] e;
    public final boolean f;
    public final boolean g;

    public c(long j, String[] strArr, String[] strArr2, boolean z, String[] strArr3, boolean z2) {
        Object[] objArr = {new Long(j), strArr, strArr2, Byte.valueOf(z ? (byte) 1 : (byte) 0), strArr3, Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12ae84411147aa5a07fc2749f4650d78", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12ae84411147aa5a07fc2749f4650d78");
            return;
        }
        this.b = j;
        this.c = strArr;
        this.d = strArr2;
        this.f = z;
        this.e = strArr3;
        this.g = z2;
    }
}
