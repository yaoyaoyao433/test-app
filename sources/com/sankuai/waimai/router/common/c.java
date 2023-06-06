package com.sankuai.waimai.router.common;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c implements com.sankuai.waimai.router.core.i {
    public static ChangeQuickRedirect a;
    public static final c b = new c();

    @Override // com.sankuai.waimai.router.core.i
    public final void a(@NonNull com.sankuai.waimai.router.core.j jVar, @NonNull com.sankuai.waimai.router.core.g gVar) {
        Object[] objArr = {jVar, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c0d4f09965715f9148e9909aaa892b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c0d4f09965715f9148e9909aaa892b6");
        } else if (com.sankuai.waimai.router.components.i.a(jVar, false)) {
            gVar.a();
        } else {
            gVar.a(403);
        }
    }
}
