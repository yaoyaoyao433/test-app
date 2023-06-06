package com.sankuai.waimai.platform.net.service;

import com.google.gson.JsonElement;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public final JsonElement b;
    public final String c;
    public final byte[] d;

    public c(JsonElement jsonElement, String str, byte[] bArr) {
        Object[] objArr = {jsonElement, str, bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e72dd399ec746352e662ed6be1f0257d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e72dd399ec746352e662ed6be1f0257d");
            return;
        }
        this.b = jsonElement;
        this.c = str;
        this.d = bArr;
    }
}
