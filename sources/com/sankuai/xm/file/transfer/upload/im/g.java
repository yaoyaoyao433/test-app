package com.sankuai.xm.file.transfer.upload.im;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class g extends f {
    public static ChangeQuickRedirect w;

    public g(int i, long j, String str, int i2, int i3) {
        super(i, j, str, i2, i3);
        Object[] objArr = {Integer.valueOf(i), new Long(j), str, Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = w;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4321e9e5853192399da74205842154a3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4321e9e5853192399da74205842154a3");
        }
    }

    @Override // com.sankuai.xm.file.transfer.upload.im.f, com.sankuai.xm.file.transfer.upload.f
    public final String j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = w;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b05e198a066a392e6e6585641a9df52", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b05e198a066a392e6e6585641a9df52") : com.sankuai.xm.file.proxy.c.b("/7/im/text/create.json");
    }
}
