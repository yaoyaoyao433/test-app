package com.sankuai.waimai.business.search.global.filterbar;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class k {
    public static ChangeQuickRedirect a;
    public SearchLoadConfig b;
    public Context c;

    public k(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab71bc3d42347049a3affee9e3ccb21a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab71bc3d42347049a3affee9e3ccb21a");
            return;
        }
        this.c = context;
        this.b = new SearchLoadConfig();
    }
}
