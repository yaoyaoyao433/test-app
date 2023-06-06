package com.meituan.android.yoda.network;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Runnable {
    public static ChangeQuickRedirect a;
    private final b b;
    private final String c;
    private final int d;
    private final String e;
    private final String f;
    private final String g;
    private final boolean h;
    private final HashMap i;
    private final com.meituan.android.yoda.interfaces.h j;

    private f(b bVar, String str, int i, String str2, String str3, String str4, boolean z, HashMap hashMap, com.meituan.android.yoda.interfaces.h hVar) {
        this.b = bVar;
        this.c = str;
        this.d = i;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = z;
        this.i = hashMap;
        this.j = hVar;
    }

    public static Runnable a(b bVar, String str, int i, String str2, String str3, String str4, boolean z, HashMap hashMap, com.meituan.android.yoda.interfaces.h hVar) {
        Object[] objArr = {bVar, str, Integer.valueOf(i), str2, str3, str4, Byte.valueOf(z ? (byte) 1 : (byte) 0), hashMap, hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4e47c7546885d9a8fd5f9562ef3774bf", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4e47c7546885d9a8fd5f9562ef3774bf") : new f(bVar, str, i, str2, str3, str4, z, hashMap, hVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9dccec7ed92e976bdb0eb166ac706416", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9dccec7ed92e976bdb0eb166ac706416");
        } else {
            b.a(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
        }
    }
}
