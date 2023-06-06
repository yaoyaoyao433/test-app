package com.sankuai.eh.plugins.runtime;

import com.google.gson.JsonElement;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {
    public static ChangeQuickRedirect a;
    private final a b;
    private final String c;
    private final JsonElement d;

    private c(a aVar, String str, JsonElement jsonElement) {
        this.b = aVar;
        this.c = str;
        this.d = jsonElement;
    }

    public static Runnable a(a aVar, String str, JsonElement jsonElement) {
        Object[] objArr = {aVar, str, jsonElement};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b20be01c07909e2c6555b54059462edc", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b20be01c07909e2c6555b54059462edc") : new c(aVar, str, jsonElement);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68e195534063c6ab78ba67b8f5c0c8d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68e195534063c6ab78ba67b8f5c0c8d5");
        } else {
            a.a(this.b, this.c, this.d);
        }
    }
}
