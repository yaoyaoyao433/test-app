package com.sankuai.waimai.store.mach.page.event;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.recycler.h;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends com.sankuai.waimai.mach.recycler.c implements e {
    public static ChangeQuickRedirect x;

    public d(String str, h hVar, Mach.a aVar, String str2, String str3) {
        super(str, hVar, aVar, str2, str3);
        Object[] objArr = {str, hVar, aVar, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a38dc0c7062cb8acf08041a577ee140", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a38dc0c7062cb8acf08041a577ee140");
        }
    }

    @Override // com.sankuai.waimai.store.mach.page.event.e
    public final void a(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = x;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e26fb2a9b4beefb4c8ddee4d814b0bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e26fb2a9b4beefb4c8ddee4d814b0bc");
        } else if (l() != null) {
            l().sendJsEvent(str, map);
        }
    }
}
