package com.meituan.msi.lib.map.utils;

import android.util.SparseIntArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class h {
    public static ChangeQuickRedirect a;
    private static final h c = new h();
    public final SparseIntArray b;

    public h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f494df73dfd4232a01119258601ad927", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f494df73dfd4232a01119258601ad927");
        } else {
            this.b = new SparseIntArray();
        }
    }

    public static h a() {
        return c;
    }
}
