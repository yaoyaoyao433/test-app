package com.sankuai.xm.file.transfer.upload.im;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class d extends c {
    public static ChangeQuickRedirect y;

    public d(int i, long j, String str, int i2, int i3) {
        super(i, j, str, i2, i3);
        Object[] objArr = {Integer.valueOf(i), new Long(j), str, Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07e02aa2c46bb4490c706dd84e141da9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07e02aa2c46bb4490c706dd84e141da9");
        }
    }

    @Override // com.sankuai.xm.file.transfer.upload.im.c, com.sankuai.xm.file.transfer.upload.e
    public final String o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = y;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90095f79c1cade6732b596b6170bf296", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90095f79c1cade6732b596b6170bf296") : com.sankuai.xm.file.proxy.c.b("/7/im/multi/file/create.json");
    }
}
