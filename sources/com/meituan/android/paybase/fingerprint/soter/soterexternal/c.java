package com.meituan.android.paybase.fingerprint.soter.soterexternal;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public int b;
    public String c;

    public c(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afa89fca17d9b1da46e8a2ed79d8995d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afa89fca17d9b1da46e8a2ed79d8995d");
            return;
        }
        this.b = i;
        this.c = str;
    }
}
