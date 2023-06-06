package com.sankuai.waimai.router.common;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends com.sankuai.waimai.router.core.h {
    public static ChangeQuickRedirect a;
    public static final d b = new d();

    @Override // com.sankuai.waimai.router.core.h
    public final boolean a(@NonNull com.sankuai.waimai.router.core.j jVar) {
        return true;
    }

    @Override // com.sankuai.waimai.router.core.h
    public final String toString() {
        return "NotFoundHandler";
    }

    @Override // com.sankuai.waimai.router.core.h
    public final void a(@NonNull com.sankuai.waimai.router.core.j jVar, @NonNull com.sankuai.waimai.router.core.g gVar) {
        Object[] objArr = {jVar, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59c6b50ea0ad1817cc2a7b51c86ee6f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59c6b50ea0ad1817cc2a7b51c86ee6f2");
        } else {
            gVar.a(404);
        }
    }
}
