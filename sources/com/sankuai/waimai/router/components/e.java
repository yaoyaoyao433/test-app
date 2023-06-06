package com.sankuai.waimai.router.components;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e implements c {
    public static ChangeQuickRedirect a;
    public static final c b = new e();

    @Override // com.sankuai.waimai.router.components.c
    public final <T extends com.sankuai.waimai.router.core.h> void a(T t, Class<? extends b<T>> cls) {
        Object[] objArr = {t, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "577e194d1dcd2891144302a2196702d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "577e194d1dcd2891144302a2196702d3");
            return;
        }
        for (b bVar : com.sankuai.waimai.router.a.a(cls)) {
            bVar.init(t);
        }
    }
}
