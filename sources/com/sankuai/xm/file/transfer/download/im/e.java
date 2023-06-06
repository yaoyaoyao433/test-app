package com.sankuai.xm.file.transfer.download.im;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class e extends d {
    public static ChangeQuickRedirect l;

    public e(String str, long j, String str2, String str3, String str4, String str5) {
        super(str, j, str2, str3, str4, str5);
        Object[] objArr = {str, new Long(j), str2, str3, str4, str5};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e280c0c8e5b371fa6eb034eefdd37e9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e280c0c8e5b371fa6eb034eefdd37e9");
        }
    }

    @Override // com.sankuai.xm.file.transfer.download.im.d, com.sankuai.xm.file.transfer.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44b47bfc4a2afeb717687f32507c1424", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44b47bfc4a2afeb717687f32507c1424");
            return;
        }
        super.c();
        this.d.setTaskType(5);
    }
}
