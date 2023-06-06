package com.sankuai.waimai.platform.cache;

import com.google.gson.JsonElement;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.meituan.retrofit2.ap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a extends ap {
    public static ChangeQuickRedirect a;
    public final JsonElement b;
    public final byte[] c;
    private final String d;

    public a(JsonElement jsonElement, String str, byte[] bArr) {
        Object[] objArr = {jsonElement, str, bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e657717e5fa61d1fba9e4c2665b1cb6e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e657717e5fa61d1fba9e4c2665b1cb6e");
            return;
        }
        this.b = jsonElement;
        this.d = str;
        this.c = bArr;
    }
}
