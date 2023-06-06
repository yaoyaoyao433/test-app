package com.sankuai.waimai.machpro.component.viewpager;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.machpro.component.view.b;
import com.sankuai.waimai.machpro.instance.MPContext;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class a extends b {
    public static ChangeQuickRedirect a;
    private static a b;

    public static a b() {
        a aVar = b;
        b = null;
        return aVar;
    }

    public a(MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09a6b3261339a932a7e4b2a5083ac4c8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09a6b3261339a932a7e4b2a5083ac4c8");
        } else {
            b = this;
        }
    }
}
