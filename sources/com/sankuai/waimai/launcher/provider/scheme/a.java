package com.sankuai.waimai.launcher.provider.scheme;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.platform.capacity.log.a;
import com.sankuai.waimai.platform.capacity.log.i;
import com.sankuai.waimai.platform.utils.lifecycle.c;
import com.sankuai.waimai.router.components.g;
import com.sankuai.waimai.router.core.j;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends g {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.router.components.g, com.sankuai.waimai.router.core.e
    public final void a(@NonNull j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5bbe96e72f50e1e2c9a3d69782d8b23a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5bbe96e72f50e1e2c9a3d69782d8b23a");
            return;
        }
        super.a(jVar);
        com.sankuai.waimai.platform.utils.lifecycle.c a2 = com.sankuai.waimai.platform.utils.lifecycle.c.a();
        String path = jVar.d.getPath();
        Object[] objArr2 = {path};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.platform.utils.lifecycle.c.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "16a42e20be53faa9bddd9c2f27293c07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "16a42e20be53faa9bddd9c2f27293c07");
            return;
        }
        c.b bVar = a2.c.get(path);
        if (bVar != null) {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = c.b.a;
            if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "4e07f2dfe6dd855ade61e4bf80d78c20", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "4e07f2dfe6dd855ade61e4bf80d78c20");
            } else {
                bVar.c.recordStep("start");
            }
        }
    }

    @Override // com.sankuai.waimai.router.components.g, com.sankuai.waimai.router.core.e
    public final void a(@NonNull j jVar, int i) {
        Object[] objArr = {jVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fa151479c7a8f57b6f1d5f53ca5094a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fa151479c7a8f57b6f1d5f53ca5094a");
            return;
        }
        if (i != -1) {
            a.AbstractC1040a a2 = new com.sankuai.waimai.launcher.log.a().a("start_uri_error");
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = j.b;
            i.d(a2.b(String.valueOf(PatchProxy.isSupport(objArr2, jVar, changeQuickRedirect2, false, "dbcb38614e899025c80de075259df12f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, jVar, changeQuickRedirect2, false, "dbcb38614e899025c80de075259df12f")).intValue() : jVar.b("com.sankuai.waimai.router.core.result", 500))).c(jVar.d.getEncodedPath()).d(jVar.d.toString()).b());
        }
        Context context = jVar.c;
        if (!com.sankuai.waimai.platform.b.d(context)) {
            com.sankuai.waimai.foundation.router.a.a(context, com.sankuai.waimai.foundation.router.interfaces.c.a);
            return;
        }
        switch (i) {
            case -2:
            case -1:
                return;
            default:
                Object[] objArr3 = {jVar, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "30de38810d0528ffb6051c7b486d509a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "30de38810d0528ffb6051c7b486d509a");
                    return;
                }
                String b = jVar.b("com.sankuai.waimai.router.core.error.msg", (String) null);
                if (TextUtils.isEmpty(b)) {
                    if (i == 404) {
                        b = com.meituan.android.singleton.b.a.getString(R.string.wm_main_unsupported_jump_url);
                    } else {
                        b = com.meituan.android.singleton.b.a.getString(R.string.wm_main_jump_failed);
                    }
                }
                if (com.sankuai.meituan.takeoutnew.a.f) {
                    b = (b + CommonConstant.Symbol.BRACKET_LEFT + i + CommonConstant.Symbol.BRACKET_RIGHT) + "\n" + jVar.d.toString();
                }
                ae.a(jVar.c, b);
                return;
        }
    }
}
