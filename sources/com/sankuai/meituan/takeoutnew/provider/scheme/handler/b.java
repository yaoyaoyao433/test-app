package com.sankuai.meituan.takeoutnew.provider.scheme.handler;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.router.core.g;
import com.sankuai.waimai.router.core.h;
import com.sankuai.waimai.router.core.j;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends h {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.router.core.h
    public final boolean a(@Nullable j jVar) {
        return true;
    }

    @Override // com.sankuai.waimai.router.core.h
    public final String toString() {
        return "LoginHandler";
    }

    @Override // com.sankuai.waimai.router.core.h
    public final void a(@NonNull j jVar, @NonNull g gVar) {
        Object[] objArr = {jVar, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e7d49188df7e41ca4648a9133e8621c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e7d49188df7e41ca4648a9133e8621c");
            return;
        }
        com.sankuai.waimai.platform.domain.manager.user.a.a(jVar.c);
        gVar.a(200);
    }
}
