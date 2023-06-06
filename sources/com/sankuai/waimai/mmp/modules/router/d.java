package com.sankuai.waimai.mmp.modules.router;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.meituan.msc.modules.container.t;
import com.meituan.msc.modules.manager.p;
import com.meituan.msc.modules.router.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends t {
    public static ChangeQuickRedirect c;
    public t d;

    public d(Context context) {
        super(context);
        com.meituan.msc.modules.router.d dVar;
        boolean z = true;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "181debbb9bd9d12cff247cbe37ed2935", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "181debbb9bd9d12cff247cbe37ed2935");
            return;
        }
        d.a aVar = new d.a(context);
        aVar.d = true;
        Object[] objArr2 = {"meituanwaimai://waimai.meituan.com/mmp"};
        ChangeQuickRedirect changeQuickRedirect2 = d.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "7555feae9eea76d44983303cb8f92329", RobustBitConfig.DEFAULT_VALUE)) {
            aVar = (d.a) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "7555feae9eea76d44983303cb8f92329");
        } else if (!TextUtils.isEmpty("meituanwaimai://waimai.meituan.com/mmp")) {
            aVar.e = Uri.parse("meituanwaimai://waimai.meituan.com/mmp");
        }
        Object[] objArr3 = {"meituanwaimai://waimai.meituan.com/msc"};
        ChangeQuickRedirect changeQuickRedirect3 = d.a.a;
        if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "9e9dd1a0e06071850d86cba3fb67bb7c", RobustBitConfig.DEFAULT_VALUE)) {
            aVar = (d.a) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "9e9dd1a0e06071850d86cba3fb67bb7c");
        } else if (!TextUtils.isEmpty("meituanwaimai://waimai.meituan.com/msc")) {
            aVar.f = Uri.parse("meituanwaimai://waimai.meituan.com/msc");
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = d.a.a;
        if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "e2ab922d17e2473950b023daab07f8e1", RobustBitConfig.DEFAULT_VALUE)) {
            dVar = (com.meituan.msc.modules.router.d) PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "e2ab922d17e2473950b023daab07f8e1");
        } else {
            com.meituan.msc.modules.router.d dVar2 = new com.meituan.msc.modules.router.d(aVar.b);
            com.meituan.msc.modules.router.d.e = aVar.f;
            com.meituan.msc.modules.router.f fVar = new com.meituan.msc.modules.router.f(aVar.b);
            if (aVar.d) {
                if (aVar.e == null) {
                    throw new p("MSCInstrumentation enableMMPRouter must setMMPRouterSchema");
                }
                com.meituan.msc.modules.router.c cVar = new com.meituan.msc.modules.router.c(aVar.b, aVar.e);
                Object[] objArr5 = {cVar};
                ChangeQuickRedirect changeQuickRedirect5 = com.meituan.msc.modules.router.f.c;
                if (PatchProxy.isSupport(objArr5, fVar, changeQuickRedirect5, false, "2982357a889e0ab3884d8f3cb45aa410", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, fVar, changeQuickRedirect5, false, "2982357a889e0ab3884d8f3cb45aa410");
                } else {
                    fVar.d.add(cVar);
                }
            }
            Object[] objArr6 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect6 = com.meituan.msc.modules.router.f.c;
            if (PatchProxy.isSupport(objArr6, fVar, changeQuickRedirect6, false, "2f5a22fc14b55c7de2d1d0b589ab93ff", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr6, fVar, changeQuickRedirect6, false, "2f5a22fc14b55c7de2d1d0b589ab93ff")).booleanValue();
            } else if (fVar.d.size() <= 0) {
                z = false;
            }
            if (z) {
                dVar2.a(fVar);
            }
            dVar2.a(new com.meituan.msc.modules.router.e(aVar.b, aVar.f));
            if (aVar.c) {
                dVar2.a(new com.meituan.msc.modules.container.fusion.d(aVar.b));
            }
            dVar = dVar2;
        }
        this.d = dVar;
    }

    @Override // com.meituan.msc.modules.container.t
    public final boolean a(Context context, Intent intent, boolean z) {
        Object[] objArr = {context, intent, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bba56f3dcd7f45dba9312d53ad641dc5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bba56f3dcd7f45dba9312d53ad641dc5")).booleanValue() : this.d.a(context, intent, z);
    }
}
