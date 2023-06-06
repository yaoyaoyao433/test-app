package com.sankuai.eh.component.web.bridge.local;

import android.text.TextUtils;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.meituan.android.common.aidata.raptoruploader.RaptorConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.tools.d;
import com.sankuai.eh.component.web.plugins.f;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c extends a {
    public static ChangeQuickRedirect d;

    @Override // com.sankuai.eh.component.web.bridge.local.a
    public final void b() {
        JsonObject jsonObject;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20dbbb87cfd7637250e3bed4ed8e2dff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20dbbb87cfd7637250e3bed4ed8e2dff");
        } else if (this.b != null) {
            com.sankuai.eh.component.web.plugins.e b = this.b.b("js_module");
            if (b instanceof f) {
                f fVar = (f) b;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a.a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c11e1717363f541c1292cf1e2b3b5cbf", RobustBitConfig.DEFAULT_VALUE)) {
                    jsonObject = (JsonObject) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c11e1717363f541c1292cf1e2b3b5cbf");
                } else {
                    jsonObject = this.c == null ? new JsonObject() : this.c;
                }
                String jsonObject2 = jsonObject.toString();
                Object[] objArr3 = {jsonObject2};
                ChangeQuickRedirect changeQuickRedirect3 = f.a;
                if (PatchProxy.isSupport(objArr3, fVar, changeQuickRedirect3, false, "74e42d942fe1b289201da4a1780cebb2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, fVar, changeQuickRedirect3, false, "74e42d942fe1b289201da4a1780cebb2");
                    return;
                }
                fVar.f++;
                com.sankuai.eh.plugins.runtime.a aVar = fVar.b;
                Object[] objArr4 = {jsonObject2};
                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.eh.plugins.runtime.a.a;
                if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "bb41dbb5546dd5a5de36c3b7e251d99a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "bb41dbb5546dd5a5de36c3b7e251d99a");
                } else if (TextUtils.isEmpty(jsonObject2)) {
                } else {
                    JsonElement a = com.sankuai.eh.component.service.utils.b.a(jsonObject2);
                    JsonElement c = com.sankuai.eh.component.service.utils.b.c(a, "info");
                    aVar.c.add(com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(c, "actionId"), ""));
                    JsonElement jsonElement = aVar.b.get(com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(c, "actionId"), StringUtil.NULL));
                    if (jsonElement != null) {
                        Object[] objArr5 = {a, jsonElement};
                        ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.eh.plugins.runtime.a.a;
                        if (PatchProxy.isSupport(objArr5, aVar, changeQuickRedirect5, false, "9a119229c173da1213edddc7b7f43084", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, aVar, changeQuickRedirect5, false, "9a119229c173da1213edddc7b7f43084");
                            return;
                        }
                        JsonElement c2 = com.sankuai.eh.component.service.utils.b.c(a, "result");
                        if ("success".equals(com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(c2, "status"), "error"))) {
                            aVar.a(jsonElement, new d.b().a("status", "success").a("msg", com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(c2, "msg"), "no extra msg")).b);
                            return;
                        }
                        aVar.a(jsonElement, new d.b().a("status", "fail").a("msg", com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(c2, "msg"), "no extra msg")).b);
                        com.dianping.codelog.b.b(com.sankuai.eh.plugins.runtime.a.class, aVar.a(jsonElement), com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(c2, "msg"), "js callback error"));
                        aVar.b(jsonElement, com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(c2, "msg"), RaptorConstants.ERROR_UNKNOWN_VALUE));
                    }
                }
            }
        }
    }
}
