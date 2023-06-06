package com.sankuai.xm.file.transfer.download.im;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class c extends d {
    public static ChangeQuickRedirect l;

    public c(String str, long j, String str2, String str3, String str4, String str5) {
        super(str, j, str2, str3, str4, str5);
        Object[] objArr = {str, new Long(j), str2, str3, str4, str5};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73641e01465982fd7620ea56efa16ed9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73641e01465982fd7620ea56efa16ed9");
        }
    }

    @Override // com.sankuai.xm.file.transfer.download.im.d, com.sankuai.xm.file.transfer.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ec18ad7a5c9a7456034242e4e2c6d58", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ec18ad7a5c9a7456034242e4e2c6d58");
            return;
        }
        super.c();
        this.d.setTaskType(2);
    }
}
