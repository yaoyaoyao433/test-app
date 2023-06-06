package com.sankuai.waimai.store.drug.search.mach.component.nestscroller;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e extends com.sankuai.waimai.mach.render.b {
    public static ChangeQuickRedirect c;

    @Override // com.sankuai.waimai.mach.render.b, com.sankuai.waimai.mach.render.a
    public final List<Class<? extends com.sankuai.waimai.mach.component.base.a>> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4a61165f92902c51673903c59e4fcb3", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4a61165f92902c51673903c59e4fcb3");
        }
        List<Class<? extends com.sankuai.waimai.mach.component.base.a>> a = super.a();
        a.add(c.class);
        return a;
    }
}
