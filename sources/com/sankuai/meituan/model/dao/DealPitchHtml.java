package com.sankuai.meituan.model.dao;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class DealPitchHtml {
    public static ChangeQuickRedirect changeQuickRedirect;
    byte[] data;
    Long did;
    Long lastModified;

    public DealPitchHtml() {
    }

    public DealPitchHtml(Long l, byte[] bArr, Long l2) {
        Object[] objArr = {l, bArr, l2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "58c5aee2c0fdaa434ea6877a3546e4e8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "58c5aee2c0fdaa434ea6877a3546e4e8");
            return;
        }
        this.did = l;
        this.data = bArr;
        this.lastModified = l2;
    }
}
