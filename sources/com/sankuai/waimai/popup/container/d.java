package com.sankuai.waimai.popup.container;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.mach.monitor.c;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class d extends f {
    public static ChangeQuickRedirect b;
    private String a;
    private String d;
    private boolean e;

    public d(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e1f959a6440d465721412b5ab7ce299", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e1f959a6440d465721412b5ab7ce299");
            return;
        }
        this.a = str;
        this.d = str2;
    }

    @Override // com.sankuai.waimai.popup.container.f
    public void a(String str, String str2, int i, Map<String, Object> map, JSONObject jSONObject, String str3, JSONObject jSONObject2, com.sankuai.waimai.mach.node.a<?> aVar) {
        Object[] objArr = {str, str2, Integer.valueOf(i), map, jSONObject, str3, jSONObject2, aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3b73d6793f2f0ed1610deb128abc275", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3b73d6793f2f0ed1610deb128abc275");
        } else if (i != 2) {
            if (i == 1) {
                JudasManualManager.a(str3, this.a, this.d).a(a(jSONObject2)).a();
            }
        } else {
            JudasManualManager.b(str3, this.a, this.d).a(a(jSONObject2)).a();
            if (this.e) {
                return;
            }
            this.e = true;
            String templateId = aVar.f.getTemplateId();
            if (TextUtils.isEmpty(templateId)) {
                return;
            }
            c.a aVar2 = new c.a();
            aVar2.c = "ad_type_3";
            aVar2.d = templateId;
            aVar2.b = "首页_0";
            com.sankuai.waimai.platform.mach.monitor.b.a().b(aVar2.a(), map);
        }
    }

    private static Map<String, Object> a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "314e9102f8d1c57c66e2d61093204695", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "314e9102f8d1c57c66e2d61093204695");
        }
        if (jSONObject == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if (opt != null && !aa.a(opt.toString())) {
                hashMap.put(next, opt.toString());
            }
        }
        return hashMap;
    }
}
