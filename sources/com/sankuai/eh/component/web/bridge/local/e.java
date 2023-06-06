package com.sankuai.eh.component.web.bridge.local;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.utils.b;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class e extends a {
    public static ChangeQuickRedirect d;

    @Override // com.sankuai.eh.component.web.bridge.local.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f34c6605f55d57c2579eed6088a4153", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f34c6605f55d57c2579eed6088a4153");
            return;
        }
        b.a aVar = new b.a();
        Object[] objArr2 = {"params"};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        JsonObject jsonObject = aVar.a("data", PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a3c76256c10e0aa4b4889ce876c63460", RobustBitConfig.DEFAULT_VALUE) ? (JsonElement) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a3c76256c10e0aa4b4889ce876c63460") : com.sankuai.eh.component.service.utils.b.c(this.c, "params")).b;
        Object[] objArr3 = {jsonObject};
        ChangeQuickRedirect changeQuickRedirect3 = d;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fac8170aca0d512f06df66720a00c919", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fac8170aca0d512f06df66720a00c919");
        } else {
            try {
                Map map = (Map) com.sankuai.eh.component.service.utils.b.a(jsonObject.get("data").getAsString(), new TypeToken<Map<String, Object>>() { // from class: com.sankuai.eh.component.web.bridge.local.e.1
                }.getType());
                map.put("name", "ehc.module.custom");
                com.sankuai.eh.component.service.tools.d.a("report", map);
            } catch (Exception e) {
                com.sankuai.eh.component.service.tools.d.a(e);
            }
        }
        a(jsonObject);
    }
}
