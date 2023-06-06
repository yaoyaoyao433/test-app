package com.sankuai.eh.plugins.runtime;

import com.google.gson.JsonElement;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {
    public static ChangeQuickRedirect a;
    private final a b;
    private final JsonElement c;
    private final String d;

    private b(a aVar, JsonElement jsonElement, String str) {
        this.b = aVar;
        this.c = jsonElement;
        this.d = str;
    }

    public static Runnable a(a aVar, JsonElement jsonElement, String str) {
        Object[] objArr = {aVar, jsonElement, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "03b6cfda282e99a596034aebcc1e8a1d", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "03b6cfda282e99a596034aebcc1e8a1d") : new b(aVar, jsonElement, str);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aaca52654ed997ae6637726cf50e376b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aaca52654ed997ae6637726cf50e376b");
        } else {
            a.a(this.b, this.c, this.d);
        }
    }
}
