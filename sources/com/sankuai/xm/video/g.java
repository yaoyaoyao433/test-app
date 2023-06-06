package com.sankuai.xm.video;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class g implements a {
    public static ChangeQuickRedirect a;
    private String b;

    public g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b5c19ff24357f4b3849d8cb91b0c25b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b5c19ff24357f4b3849d8cb91b0c25b");
        } else {
            this.b = "https://mv.meituan.com/1/mv/upload.json";
        }
    }
}
