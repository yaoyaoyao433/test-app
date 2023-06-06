package com.sankuai.waimai.router.common;

import android.content.Intent;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class g extends com.sankuai.waimai.router.core.h {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.router.core.h
    public final String toString() {
        return "StartUriHandler";
    }

    @Override // com.sankuai.waimai.router.core.h
    public final boolean a(@NonNull com.sankuai.waimai.router.core.j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8611861a23551d5600f42d3029a7273", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8611861a23551d5600f42d3029a7273")).booleanValue() : jVar.b("com.sankuai.waimai.router.common.try_start_uri", true);
    }

    @Override // com.sankuai.waimai.router.core.h
    public final void a(@NonNull com.sankuai.waimai.router.core.j jVar, @NonNull com.sankuai.waimai.router.core.g gVar) {
        Object[] objArr = {jVar, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb2171583d9cf9fd1dc0d026998fc84e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb2171583d9cf9fd1dc0d026998fc84e");
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(jVar.d);
        com.sankuai.waimai.router.components.i.a(intent, jVar);
        jVar.b("com.sankuai.waimai.router.activity.limit_package", (String) Boolean.FALSE);
        int a2 = com.sankuai.waimai.router.components.h.a(jVar, intent);
        Object[] objArr2 = {gVar, Integer.valueOf(a2)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f0bbf496f636027e1cdb11488bb3a48a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f0bbf496f636027e1cdb11488bb3a48a");
        } else if (a2 == 200) {
            gVar.a(a2);
        } else {
            gVar.a();
        }
    }
}
