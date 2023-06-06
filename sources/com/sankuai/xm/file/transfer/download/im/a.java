package com.sankuai.xm.file.transfer.download.im;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a extends d {
    public static ChangeQuickRedirect l;

    public a(String str, long j, String str2, String str3, String str4, String str5) {
        super(str, j, str2, str3, str4, str5);
        Object[] objArr = {str, new Long(j), str2, str3, str4, str5};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45fb966741d07a4e30f38370bcaa196e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45fb966741d07a4e30f38370bcaa196e");
        }
    }

    @Override // com.sankuai.xm.file.transfer.download.im.d, com.sankuai.xm.file.transfer.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ee38ec248e9fbab1483b7bb556eace0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ee38ec248e9fbab1483b7bb556eace0");
            return;
        }
        super.c();
        this.d.setTaskType(4);
    }
}
