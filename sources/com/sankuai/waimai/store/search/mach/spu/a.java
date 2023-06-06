package com.sankuai.waimai.store.search.mach.spu;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.mads.b;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.mach.d;
import com.sankuai.waimai.mach.manager.cache.e;
import com.sankuai.waimai.mach.recycler.c;
import com.sankuai.waimai.store.config.i;
import com.sankuai.waimai.store.search.ui.result.mach.h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements d {
    public static ChangeQuickRedirect a;
    public c b;
    public boolean c;
    private final int d;
    private final String e;
    private final String f;

    public a(int i, String str, String str2) {
        Object[] objArr = {Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51dffbf8c2df6e754da305187de12fbb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51dffbf8c2df6e754da305187de12fbb");
            return;
        }
        this.c = false;
        this.d = i;
        this.e = str;
        this.f = str2;
        this.c = i.h().a("store_search_crash/not_use_in_screen", false);
    }

    @Override // com.sankuai.waimai.mach.d
    public final void a(String str, String str2, int i, Map<String, Object> map, com.sankuai.waimai.mach.node.a aVar) {
        String str3;
        String str4;
        JSONObject jSONObject;
        boolean z;
        String str5;
        Map<String, Object> map2;
        HashMap hashMap;
        Map<String, Object> map3;
        Object[] objArr = {str, str2, Integer.valueOf(i), map, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b12e9742916c0f07561c322603aa33f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b12e9742916c0f07561c322603aa33f9");
        } else if (map == null) {
        } else {
            JSONObject jSONObject2 = new JSONObject(map);
            String optString = jSONObject2.optString("bid");
            String optString2 = jSONObject2.optString("cache_sub_index");
            JSONObject optJSONObject = jSONObject2.optJSONObject("val_lab");
            JSONObject optJSONObject2 = jSONObject2.optJSONObject("sg_tag_lab");
            if (TextUtils.isEmpty(optString) || optJSONObject == null) {
                return;
            }
            Object a2 = this.b.a("mach_extra_key_biz_data");
            Object a3 = this.b.a("mach_extra_key_index");
            if (aVar == null || aVar.f == null || aVar.f.getMachBundle() == null) {
                str3 = null;
                str4 = null;
            } else {
                e machBundle = aVar.f.getMachBundle();
                String str6 = machBundle.j;
                str3 = machBundle.a();
                str4 = str6;
            }
            if ("lx".equals(str2)) {
                HashMap hashMap2 = new HashMap();
                com.sankuai.waimai.store.search.isomorphism.b.a(hashMap2, this.b);
                Map<String, Object> a4 = com.sankuai.waimai.mach.utils.b.a(optJSONObject.toString());
                hashMap2.putAll(a4);
                boolean z2 = a3 instanceof Number;
                hashMap2.put("index", Integer.valueOf(z2 ? ((Number) a3).intValue() : 0));
                com.sankuai.waimai.ad.monitor.b.a(hashMap2, str4, str3);
                if (i == 1) {
                    Object[] objArr2 = {optJSONObject2, a3};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    map2 = a4;
                    String str7 = str3;
                    jSONObject = optJSONObject;
                    str5 = str4;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "11c1ccd1c71079f40ecc7ca5abc64afb", RobustBitConfig.DEFAULT_VALUE)) {
                        z = false;
                        map3 = (Map) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "11c1ccd1c71079f40ecc7ca5abc64afb");
                    } else {
                        z = false;
                        if (optJSONObject2 == null) {
                            map3 = null;
                        } else {
                            Map<String, Object> a5 = com.sankuai.waimai.mach.utils.b.a(optJSONObject2.toString());
                            a5.put("index", Integer.valueOf(z2 ? ((Number) a3).intValue() : 0));
                            HashMap hashMap3 = new HashMap();
                            hashMap3.put(this.e, a5);
                            map3 = hashMap3;
                        }
                    }
                    hashMap = hashMap2;
                    com.sankuai.waimai.store.manager.judas.b.a(this.e, this.f, optString).c(map3).b(hashMap).a();
                    str3 = str7;
                    com.sankuai.waimai.ad.monitor.b.a(optString, "LX", com.sankuai.waimai.report.a.a(map2), str5, str3);
                } else {
                    map2 = a4;
                    hashMap = hashMap2;
                    jSONObject = optJSONObject;
                    z = false;
                    str5 = str4;
                }
                if (i == 2) {
                    boolean z3 = this.d == 1 || this.c || ah.b(aVar != null ? aVar.g() : null);
                    if (a2 == null || !z3) {
                        return;
                    }
                    String str8 = optString + a2.hashCode() + optString2 + "lx_expose";
                    boolean z4 = this.d == 1 && a(str8);
                    boolean z5 = this.d == 2 && com.sankuai.waimai.store.search.isomorphism.b.a(str8);
                    if (z4 || z5) {
                        com.sankuai.waimai.store.manager.judas.b.b(this.e, this.f, optString).b(hashMap).a();
                        com.sankuai.waimai.ad.monitor.b.a(optString, "LX", com.sankuai.waimai.report.a.a(map2), str5, str3);
                    }
                }
            } else {
                jSONObject = optJSONObject;
                z = false;
                str5 = str4;
            }
            if ("sh".equals(str2)) {
                JSONObject jSONObject3 = jSONObject;
                String optString3 = jSONObject3.optString("charge_info");
                if (t.a(optString3)) {
                    return;
                }
                int optInt = jSONObject3.optInt("ad_type");
                String a6 = com.sankuai.waimai.ad.monitor.b.a(optString3, str5, str3);
                if (i == 2) {
                    boolean z6 = this.d == 1 || this.c || ah.b(aVar != null ? aVar.g() : null);
                    if (a2 == null || !z6) {
                        return;
                    }
                    String str9 = optString + a2.hashCode() + optString2 + "sh_expose";
                    boolean z7 = this.d == 1 && a(str9);
                    if (this.d == 2 && com.sankuai.waimai.store.search.isomorphism.b.b(str9)) {
                        z = true;
                    }
                    if (z7 || z) {
                        com.sankuai.waimai.ad.mads.a.a(optInt, new b.a(optString, a6, 3));
                        com.sankuai.waimai.ad.monitor.b.a(optString, "SH", optInt, str5, str3);
                    }
                }
                if (i == 1) {
                    HashMap hashMap4 = new HashMap();
                    hashMap4.put("click_block", String.valueOf(jSONObject3.optInt("click_block")));
                    com.sankuai.waimai.ad.mads.a.a(optInt, new b.a(optString, com.sankuai.mads.e.a(a6, hashMap4), 2));
                    com.sankuai.waimai.ad.monitor.b.a(optString, "SH", optInt, str5, str3);
                }
            }
        }
    }

    private boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09e6b6db2df0606dd01f76e9ee4470ce", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09e6b6db2df0606dd01f76e9ee4470ce")).booleanValue();
        }
        if (h.a(str)) {
            return false;
        }
        h.b(str);
        return true;
    }
}
