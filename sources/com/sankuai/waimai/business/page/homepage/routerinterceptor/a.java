package com.sankuai.waimai.business.page.homepage.routerinterceptor;

import android.content.Intent;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.kingkong.KingKongActivity;
import com.sankuai.waimai.router.core.g;
import com.sankuai.waimai.router.core.i;
import com.sankuai.waimai.router.core.j;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements i {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.router.core.i
    public final void a(@NonNull j jVar, @NonNull g gVar) {
        Object[] objArr = {jVar, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "411b27855cd44a5cc293c4e23c3cc1d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "411b27855cd44a5cc293c4e23c3cc1d0");
        } else if (!com.sankuai.waimai.platform.privacy.a.a().b()) {
            gVar.a();
        } else {
            jVar.c.startActivity(new Intent(jVar.c, KingKongActivity.class));
        }
    }
}
