package com.sankuai.waimai.router.activity;

import android.content.Intent;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.router.components.i;
import com.sankuai.waimai.router.core.g;
import com.sankuai.waimai.router.core.h;
import com.sankuai.waimai.router.core.j;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a extends h {
    public static ChangeQuickRedirect b;

    public void a(@NonNull j jVar, int i) {
    }

    public boolean a() {
        return true;
    }

    @Override // com.sankuai.waimai.router.core.h
    public boolean a(@NonNull j jVar) {
        return true;
    }

    @NonNull
    public abstract Intent b(@NonNull j jVar);

    @Override // com.sankuai.waimai.router.core.h
    public String toString() {
        return "ActivityHandler";
    }

    @Override // com.sankuai.waimai.router.core.h
    public void a(@NonNull j jVar, @NonNull g gVar) {
        Object[] objArr = {jVar, gVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "406a2fb50ea9bfc26ddf65740d1883da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "406a2fb50ea9bfc26ddf65740d1883da");
            return;
        }
        Intent b2 = b(jVar);
        if (b2 == null || b2.getComponent() == null) {
            com.sankuai.waimai.router.core.d.d("AbsActivityHandler.createIntent()应返回的带有ClassName的显式跳转Intent", new Object[0]);
            gVar.a(500);
            return;
        }
        b2.setData(jVar.d);
        i.a(b2, jVar);
        jVar.b("com.sankuai.waimai.router.activity.limit_package", (String) Boolean.valueOf(a()));
        int a = com.sankuai.waimai.router.components.h.a(jVar, b2);
        a(jVar, a);
        gVar.a(a);
    }
}
