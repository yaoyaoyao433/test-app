package com.sankuai.waimai.contextual.computing.storage.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public int b;
    public int c;
    public int d;
    public int e;

    public b(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33bc51b145e2fbdd853572cfb400971d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33bc51b145e2fbdd853572cfb400971d");
            return;
        }
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }
}
