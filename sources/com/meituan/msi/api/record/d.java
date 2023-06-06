package com.meituan.msi.api.record;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d implements b {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.msi.api.record.b
    public final void a() {
    }

    @Override // com.meituan.msi.api.record.b
    public final byte[] a(byte[] bArr) throws Exception {
        return bArr;
    }

    public d(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef149d18c509290e96cfa50f02c51651", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef149d18c509290e96cfa50f02c51651");
        }
    }
}
