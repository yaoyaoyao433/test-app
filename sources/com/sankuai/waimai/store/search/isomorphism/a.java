package com.sankuai.waimai.store.search.isomorphism;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.mach.d;
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
    c b;
    public boolean c;
    private final int d;
    private final String e;
    private final String f;

    public a(int i, String str, String str2) {
        Object[] objArr = {2, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa121cc2613ba50d655927142b5798ad", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa121cc2613ba50d655927142b5798ad");
            return;
        }
        this.c = false;
        this.d = 2;
        this.e = str;
        this.f = str2;
        this.c = i.h().a("store_search_crash/not_use_in_screen", false);
    }

    @Override // com.sankuai.waimai.mach.d
    public final void a(String str, String str2, int i, Map<String, Object> map, com.sankuai.waimai.mach.node.a aVar) {
        Map<String, Object> a2;
        boolean z;
        boolean z2;
        Object[] objArr = {str, str2, Integer.valueOf(i), map, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d169b69d4ca8f43cc3d9cc53239f72f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d169b69d4ca8f43cc3d9cc53239f72f1");
        } else if (map == null) {
        } else {
            JSONObject jSONObject = new JSONObject(map);
            String optString = jSONObject.optString("bid");
            String optString2 = jSONObject.optString("cache_sub_index");
            JSONObject optJSONObject = jSONObject.optJSONObject("val_lab");
            Map<String, Object> attrs = aVar.g.getAttrs();
            if (TextUtils.isEmpty(optString) || optJSONObject == null) {
                return;
            }
            Object a3 = this.b.a("mach_extra_key_biz_data");
            Object a4 = this.b.a("mach_extra_key_index");
            if (TextUtils.equals("lx", str2)) {
                HashMap hashMap = new HashMap();
                b.a(hashMap, this.b);
                Object[] objArr2 = {optJSONObject, a4, attrs};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c4813acd85b92b3a80d150122099a635", RobustBitConfig.DEFAULT_VALUE)) {
                    a2 = (Map) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c4813acd85b92b3a80d150122099a635");
                } else {
                    a2 = com.sankuai.waimai.mach.utils.b.a(optJSONObject.toString());
                    if (attrs.size() > 0) {
                        Object obj = attrs.get("custom-lx-key");
                        Object obj2 = attrs.get("custom-lx-value");
                        if ((obj instanceof String) && obj2 != null) {
                            a2.put((String) obj, obj2);
                        }
                    }
                    a2.put("index", Integer.valueOf(a4 instanceof Integer ? ((Integer) a4).intValue() : 0));
                }
                hashMap.putAll(a2);
                if (i == 1) {
                    com.sankuai.waimai.store.manager.judas.b.a(this.e, this.f, optString).b(hashMap).a();
                }
                if (i != 2 || a3 == null) {
                    return;
                }
                if (this.d == 1 || this.c || ah.b(aVar.g())) {
                    String str3 = optString + a3.hashCode() + optString2 + "lx_expose";
                    boolean z3 = true;
                    if (this.d == 1) {
                        Object[] objArr3 = {str3};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "41f16be98e8473cdb952235af4c8697a", RobustBitConfig.DEFAULT_VALUE)) {
                            z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "41f16be98e8473cdb952235af4c8697a")).booleanValue();
                        } else if (h.a(str3)) {
                            z2 = false;
                        } else {
                            h.b(str3);
                            z2 = true;
                        }
                        if (z2) {
                            z = true;
                            z3 = (this.d == 2 || !b.a(str3)) ? false : false;
                            if (!z || z3) {
                                com.sankuai.waimai.store.manager.judas.b.b(this.e, this.f, optString).b(hashMap).a();
                            }
                            return;
                        }
                    }
                    z = false;
                    if (this.d == 2) {
                    }
                    if (z) {
                    }
                    com.sankuai.waimai.store.manager.judas.b.b(this.e, this.f, optString).b(hashMap).a();
                }
            }
        }
    }
}
