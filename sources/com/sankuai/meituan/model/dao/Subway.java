package com.sankuai.meituan.model.dao;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class Subway {
    public static ChangeQuickRedirect changeQuickRedirect;
    Long cityId;
    byte[] data;
    Long lastModified;

    public Subway() {
    }

    public Subway(Long l, byte[] bArr, Long l2) {
        Object[] objArr = {l, bArr, l2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1061f3f01d8f411241d6f159f3d9720e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1061f3f01d8f411241d6f159f3d9720e");
            return;
        }
        this.cityId = l;
        this.data = bArr;
        this.lastModified = l2;
    }
}
