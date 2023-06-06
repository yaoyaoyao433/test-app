package com.sankuai.xm.file.transfer.download.im;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b extends d {
    public static ChangeQuickRedirect l;

    public b(String str, long j, String str2, String str3, String str4, String str5) {
        super(str, j, str2, str3, str4, str5);
        Object[] objArr = {str, new Long(j), str2, str3, str4, str5};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d94ab8e67460ec622ccb76edcf74d53", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d94ab8e67460ec622ccb76edcf74d53");
        }
    }

    @Override // com.sankuai.xm.file.transfer.download.im.d, com.sankuai.xm.file.transfer.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2939c1a2a7b444c2b23cffa3c8df1a59", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2939c1a2a7b444c2b23cffa3c8df1a59");
            return;
        }
        super.c();
        this.d.setTaskType(3);
    }
}
