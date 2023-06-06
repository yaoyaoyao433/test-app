package com.sankuai.waimai.alita.bundle.cache;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.sankuai.waimai.alita.bundle.exception.a {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.alita.bundle.exception.a
    public final String a(int i) {
        return null;
    }

    public b(int i) {
        super(i);
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8bceab8790e260ec62917bc5904459a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8bceab8790e260ec62917bc5904459a");
        }
    }
}
