package com.sankuai.waimai.store.poilist.mach;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.common.aidata.entity.DataConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.mads.b;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.util.n;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class g implements com.sankuai.waimai.mach.d {
    public static ChangeQuickRedirect a;
    private final Context b;
    private final String c;
    private final Set d;

    private boolean a(String str, @NonNull String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c752bb889e1c968f2c01aef42d99c69", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c752bb889e1c968f2c01aef42d99c69")).booleanValue();
        }
        if (!t.a(str) && this.d != null) {
            Set set = this.d;
            if (set.contains(str + str2)) {
                return true;
            }
        }
        return false;
    }

    private boolean b(String str, @NonNull String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f57c46aa000d027aa277fa29a22001d5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f57c46aa000d027aa277fa29a22001d5")).booleanValue();
        }
        if (!t.a(str) && this.d != null) {
            Set set = this.d;
            if (set.add(str + str2)) {
                return true;
            }
        }
        return false;
    }

    public g(Context context, String str, Set set) {
        Object[] objArr = {context, str, set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27b215e56b51a13739467b4af6d56be2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27b215e56b51a13739467b4af6d56be2");
            return;
        }
        this.b = context;
        this.c = str;
        this.d = set;
    }

    @Override // com.sankuai.waimai.mach.d
    public final void a(String str, String str2, int i, Map<String, Object> map, com.sankuai.waimai.mach.node.a aVar) {
        int intValue;
        Map<String, Object> map2;
        String str3;
        String jSONObject;
        Object[] objArr = {str, str2, Integer.valueOf(i), map, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9aaa61a5ed86d0029525fc3d3367b6cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9aaa61a5ed86d0029525fc3d3367b6cc");
            return;
        }
        JSONObject jSONObject2 = new JSONObject(map);
        String optString = jSONObject2.optString("bid");
        boolean optBoolean = jSONObject2.optBoolean("sh");
        JSONObject optJSONObject = jSONObject2.optJSONObject("lab");
        String a2 = TextUtils.isEmpty(this.c) ? com.sankuai.waimai.store.manager.judas.b.a(this.b) : this.c;
        String a3 = com.sankuai.waimai.store.manager.judas.b.a((Object) this.b);
        Map<String, Object> a4 = n.a(optJSONObject);
        String str4 = a4.get("charge_info") instanceof String ? (String) a4.get("charge_info") : "";
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "210c7e20fba0d2b76ccc1c12929464d9", RobustBitConfig.DEFAULT_VALUE)) {
            intValue = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "210c7e20fba0d2b76ccc1c12929464d9")).intValue();
        } else {
            intValue = (aVar == null || !(aVar.b("index") instanceof Integer)) ? -1 : ((Integer) aVar.b("index")).intValue();
        }
        if (intValue >= 0) {
            map2 = a4;
            map2.put(DataConstants.INDEX, Integer.valueOf(intValue));
        } else {
            map2 = a4;
        }
        String str5 = "";
        if (aVar.h() != null && aVar.h().containsKey("expose-key")) {
            str5 = String.valueOf(aVar.h().get("expose-key"));
        }
        int intValue2 = map2.get("ad_type") instanceof Number ? ((Number) map2.get("ad_type")).intValue() : -1;
        String str6 = null;
        if (aVar == null || aVar.f == null || aVar.f.getMachBundle() == null) {
            str3 = null;
        } else {
            com.sankuai.waimai.mach.manager.cache.e machBundle = aVar.f.getMachBundle();
            String str7 = machBundle.j;
            str3 = machBundle.a();
            str6 = str7;
        }
        if ("lx".equals(str2)) {
            if (optBoolean) {
                if (intValue2 > 0) {
                    try {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("adType", intValue2);
                        jSONObject3.put("adChargeInfo", n.a(str4));
                        jSONObject = jSONObject3.toString();
                    } catch (JSONException e) {
                        com.sankuai.shangou.stone.util.log.a.a(e);
                    }
                    map2.remove("ad_type");
                    map2.remove("charge_info");
                    map2.put("ad", jSONObject);
                }
                jSONObject = "";
                map2.remove("ad_type");
                map2.remove("charge_info");
                map2.put("ad", jSONObject);
            }
            com.sankuai.waimai.ad.monitor.b.a(map2, str6, str3);
            if (i == 2) {
                if (a(str5, str2)) {
                    return;
                }
                b(str5, str2);
                com.sankuai.waimai.store.manager.judas.b.b(a2, a3, optString).a(map2).a();
                com.sankuai.waimai.ad.monitor.b.a(optString, "LX", intValue2, str6, str3);
            } else if (i == 1) {
                JSONObject optJSONObject2 = jSONObject2.optJSONObject("tag_lab");
                if (optJSONObject2 != null) {
                    com.sankuai.waimai.store.manager.judas.b.a(a2, n.a(optJSONObject2));
                }
                com.sankuai.waimai.store.manager.judas.b.a(a2, a3, optString).a(map2).a();
                com.sankuai.waimai.ad.monitor.b.a(optString, "LX", intValue2, str6, str3);
            }
        } else if (!"sh".equals(str2) || t.a(optString)) {
        } else {
            if (i != 2) {
                if (i == 1) {
                    String a5 = com.sankuai.waimai.ad.monitor.b.a(str4, str6, str3);
                    com.sankuai.waimai.ad.monitor.b.a(optString, "SH", intValue2, str6, str3);
                    com.sankuai.waimai.ad.mads.a.a(intValue2, new b.a(optString, a5, 2));
                }
            } else if (a(str5, str2)) {
            } else {
                b(str5, str2);
                String a6 = com.sankuai.waimai.ad.monitor.b.a(str4, str6, str3);
                com.sankuai.waimai.ad.monitor.b.a(optString, "SH", intValue2, str6, str3);
                com.sankuai.waimai.ad.mads.a.a(intValue2, new b.a(optString, a6, 3));
            }
        }
    }
}
