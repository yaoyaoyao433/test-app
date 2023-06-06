package com.sankuai.waimai.store.mach.logger;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.d;
import com.sankuai.waimai.store.manager.judas.b;
import com.sankuai.waimai.store.util.i;
import com.sankuai.waimai.store.util.monitor.c;
import com.sankuai.waimai.store.util.monitor.monitor.JudasMonitor;
import com.sankuai.waimai.store.util.n;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements d {
    public static ChangeQuickRedirect a;
    private Context b;
    private String c;

    public a(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8b3544b2c9ebc171928b546e0a1a6b3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8b3544b2c9ebc171928b546e0a1a6b3");
        }
    }

    public a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db71d210fdb8ef63810aa61e9647faf0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db71d210fdb8ef63810aa61e9647faf0");
            return;
        }
        this.b = context;
        this.c = str;
    }

    @Override // com.sankuai.waimai.mach.d
    public final void a(String str, String str2, int i, Map<String, Object> map, com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {str, str2, Integer.valueOf(i), map, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7a0048f221c43d36817ca5024b37f02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7a0048f221c43d36817ca5024b37f02");
            return;
        }
        JSONObject jSONObject = new JSONObject(map);
        String optString = jSONObject.optString("bid");
        JSONObject optJSONObject = jSONObject.optJSONObject("lab");
        String a2 = TextUtils.isEmpty(this.c) ? b.a(this.b) : this.c;
        String a3 = b.a((Object) this.b);
        Object[] objArr2 = {aVar, a2, optString, a3, map};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "57685d7a35792ba9972de8d990e67aad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "57685d7a35792ba9972de8d990e67aad");
        } else {
            try {
                if (TextUtils.isEmpty(optString)) {
                    c.a(JudasMonitor.BidEmptyException, i.a(a(aVar, a2, optString, a3, map)), "");
                } else if (TextUtils.isEmpty(a2)) {
                    c.a(JudasMonitor.CidEmptyException, i.a(a(aVar, a2, optString, a3, map)), "");
                }
            } catch (Exception e) {
                com.sankuai.waimai.store.base.log.a.a(e);
            }
        }
        if (i == 2) {
            b.b(a2, a3, optString).a(n.a(optJSONObject)).a();
        } else if (i == 1) {
            JSONObject optJSONObject2 = jSONObject.optJSONObject("tag_lab");
            if (optJSONObject2 != null) {
                b.a(a2, n.a(optJSONObject2));
            }
            b.a(a2, a3, optString).a(n.a(optJSONObject)).a();
        }
    }

    private Map<String, Object> a(com.sankuai.waimai.mach.node.a aVar, String str, String str2, String str3, Map<String, Object> map) {
        Object[] objArr = {aVar, str, str2, str3, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff7bc38d5d9757e9b1d33120f2d6106a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff7bc38d5d9757e9b1d33120f2d6106a");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("cid", str);
        hashMap.put("bid", str2);
        hashMap.put("page_info_key", str3);
        hashMap.put("template_id", a(aVar));
        hashMap.put("bundle_version", b(aVar));
        hashMap.put("lab", map);
        return hashMap;
    }

    private String a(com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5742da1050c19383d1dfb0726914cd01", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5742da1050c19383d1dfb0726914cd01");
        }
        try {
            return aVar.f.getTemplateId();
        } catch (Exception unused) {
            return "";
        }
    }

    private String b(com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b7cc89edc0bece9dabc170f969f3740", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b7cc89edc0bece9dabc170f969f3740");
        }
        try {
            return aVar.f.getMachBundle().a();
        } catch (Exception unused) {
            return "";
        }
    }
}
