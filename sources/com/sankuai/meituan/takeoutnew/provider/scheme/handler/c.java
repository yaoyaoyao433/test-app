package com.sankuai.meituan.takeoutnew.provider.scheme.handler;

import android.content.Intent;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.homepage.MainActivity;
import com.sankuai.waimai.router.core.g;
import com.sankuai.waimai.router.core.h;
import com.sankuai.waimai.router.core.j;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends h {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.router.core.h
    public final boolean a(@NonNull j jVar) {
        return true;
    }

    @Override // com.sankuai.waimai.router.core.h
    public final void a(@NonNull j jVar, @NonNull g gVar) {
        Object[] objArr = {jVar, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "775f4d8e0219d5e5d910646c5691584b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "775f4d8e0219d5e5d910646c5691584b");
            return;
        }
        Object[] objArr2 = {jVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        gVar.a(PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dc3d22ec8b1a9adc12d65f70636116af", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dc3d22ec8b1a9adc12d65f70636116af")).intValue() : com.sankuai.waimai.router.components.h.a(jVar, new Intent(jVar.c, MainActivity.class)));
    }
}
