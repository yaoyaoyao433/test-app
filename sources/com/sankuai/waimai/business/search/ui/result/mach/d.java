package com.sankuai.waimai.business.search.ui.result.mach;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.mads.b;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.search.common.mach.provider.IMachProvider;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class d implements com.sankuai.waimai.mach.d {
    public static ChangeQuickRedirect a;
    public String b;
    public com.sankuai.waimai.mach.recycler.c c;
    private IMachProvider d;

    public void a(String str, Map<String, Object> map, com.sankuai.waimai.mach.node.a aVar, Object obj) {
    }

    public d() {
    }

    public d(IMachProvider iMachProvider) {
        Object[] objArr = {iMachProvider};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57058833605fb4a9d11828749b21cccc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57058833605fb4a9d11828749b21cccc");
        } else {
            this.d = iMachProvider;
        }
    }

    private void a(Context context, int i, String str, Map<String, Object> map, String str2) {
        Object[] objArr = {context, Integer.valueOf(i), str, map, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ffdca7f7cb65c603ac0ee037808250b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ffdca7f7cb65c603ac0ee037808250b");
        } else {
            com.sankuai.waimai.business.search.common.util.h.a(context, i, "c_nfqbfvw", str, this.b, map, str2);
        }
    }

    private Map<String, Object> a(JSONObject jSONObject, Object obj, Map<String, Object> map, int i, int i2) {
        Object[] objArr = {jSONObject, obj, map, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb129bf43dd02f587a7539c1c848d035", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb129bf43dd02f587a7539c1c848d035");
        }
        new HashMap();
        Map<String, Object> a2 = com.sankuai.waimai.mach.utils.b.a(jSONObject.toString());
        String str = "";
        String str2 = "";
        if (map.size() > 0) {
            Object obj2 = map.get("custom-lx-key");
            Object obj3 = map.get("custom-lx-value");
            if ((obj2 instanceof String) && obj3 != null) {
                a2.put((String) obj2, obj3);
            }
            str2 = (String) map.get("custom-index-key");
            str = (String) map.get("main-custom-index-key");
        }
        if (i == 2) {
            if (TextUtils.isEmpty(str2)) {
                a2.put("index", Integer.valueOf(i2));
            } else {
                a2.put(str2, Integer.valueOf(i2));
            }
            if (!TextUtils.isEmpty(str)) {
                a2.put(str, Integer.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : 0));
            }
        } else {
            a2.put("index", Integer.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : 0));
        }
        return a2;
    }

    @Override // com.sankuai.waimai.mach.d
    public final void a(String str, String str2, int i, Map<String, Object> map, com.sankuai.waimai.mach.node.a aVar) {
        String str3;
        Object[] objArr = {str, str2, Integer.valueOf(i), map, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2fa37dd6a941dc401b87905d22dff7ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2fa37dd6a941dc401b87905d22dff7ef");
        } else if (map != null) {
            String str4 = "mach_template_exception_id";
            if (aVar != null && aVar.f != null && !TextUtils.isEmpty(aVar.f.getTemplateId())) {
                str4 = aVar.f.getTemplateId();
            }
            String str5 = str4;
            JSONObject jSONObject = new JSONObject(map);
            String optString = jSONObject.optString("bid");
            JSONObject optJSONObject = jSONObject.optJSONObject("val_lab");
            Object a2 = this.c.a("mach_extra_key_biz_data");
            Object a3 = this.c.a("mach_extra_key_index");
            int optInt = jSONObject.optInt("type", 1);
            int indexOf = optInt == 2 ? aVar.e.b().indexOf(aVar) : -1;
            String str6 = null;
            if (aVar == null || aVar.f == null || aVar.f.getMachBundle() == null) {
                str3 = null;
            } else {
                com.sankuai.waimai.mach.manager.cache.e machBundle = aVar.f.getMachBundle();
                str3 = machBundle.j;
                str6 = machBundle.a();
            }
            if ("lx".equals(str2)) {
                Map<String, Object> attrs = aVar.g.getAttrs();
                if (TextUtils.isEmpty(optString) || optJSONObject == null) {
                    return;
                }
                if (i == 1) {
                    String str7 = str6;
                    Map<String, Object> a4 = a(optJSONObject, a3, attrs, optInt, indexOf);
                    if (this.d != null && aVar.f != null && this.d.valLab(aVar.f.getTemplateId(), i, this.c) != null) {
                        a4.putAll(this.d.valLab(aVar.f.getTemplateId(), i, this.c));
                    }
                    com.sankuai.waimai.ad.monitor.b.a(a4, str3, str7);
                    com.sankuai.waimai.ad.monitor.b.a(optString, "LX", com.sankuai.waimai.report.a.a(a4), str3, str7);
                    a(optString, a4, aVar, a3);
                    a(aVar.b, i, optString, a4, str5);
                    return;
                }
                String str8 = str6;
                if (i == 2 && ah.b(aVar.g()) && a2 != null) {
                    if (optInt == 1) {
                        if (com.sankuai.waimai.search.common.mach.b.a(optString + a2)) {
                            return;
                        }
                        com.sankuai.waimai.search.common.mach.b.b(optString + a2);
                        Map<String, Object> a5 = a(optJSONObject, a3, attrs, optInt, indexOf);
                        if (this.d != null && aVar.f != null && this.d.valLab(aVar.f.getTemplateId(), i, this.c) != null) {
                            a5.putAll(this.d.valLab(aVar.f.getTemplateId(), i, this.c));
                        }
                        com.sankuai.waimai.ad.monitor.b.a(a5, str3, str8);
                        com.sankuai.waimai.ad.monitor.b.a(optString, "LX", com.sankuai.waimai.report.a.a(a5), str3, str8);
                        a(aVar.b, i, optString, a5, str5);
                        return;
                    }
                    if (com.sankuai.waimai.search.common.mach.b.a(optString + a2.toString() + indexOf)) {
                        return;
                    }
                    com.sankuai.waimai.search.common.mach.b.b(optString + a2.toString() + indexOf);
                    Map<String, Object> a6 = a(optJSONObject, a3, attrs, optInt, indexOf);
                    if (this.d != null && aVar.f != null && this.d.valLab(aVar.f.getTemplateId(), i, this.c) != null) {
                        a6.putAll(this.d.valLab(aVar.f.getTemplateId(), i, this.c));
                    }
                    com.sankuai.waimai.ad.monitor.b.a(a6, str3, str8);
                    com.sankuai.waimai.ad.monitor.b.a(optString, "LX", com.sankuai.waimai.report.a.a(a6), str3, str8);
                    a(aVar.b, i, optString, a6, str5);
                    return;
                }
                return;
            }
            String str9 = str6;
            if ("sh".equals(str2)) {
                String optString2 = jSONObject.optString("charge_info");
                if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
                    return;
                }
                int optInt2 = jSONObject.optInt("ad_type");
                if (optJSONObject != null) {
                    Map<String, Object> a7 = com.sankuai.waimai.mach.utils.b.a(optJSONObject.toString());
                    HashMap hashMap = new HashMap();
                    if (a7 != null && a7.size() > 0) {
                        for (String str10 : a7.keySet()) {
                            hashMap.put(str10, String.valueOf(a7.get(str10)));
                        }
                    }
                    optString2 = com.sankuai.mads.e.a(optString2, hashMap);
                }
                String a8 = com.sankuai.waimai.ad.monitor.b.a(optString2, str3, str9);
                String a9 = com.sankuai.mads.e.a(optString, 0);
                if (i == 2) {
                    if (!ah.b(aVar.g()) || a2 == null) {
                        return;
                    }
                    if (optInt == 1) {
                        if (com.sankuai.waimai.search.common.mach.b.c(a2)) {
                            return;
                        }
                        com.sankuai.waimai.search.common.mach.b.d(a2);
                        com.sankuai.waimai.ad.mads.a.a(optInt2, new b.a(optString, a8, 3).a(a9));
                        com.sankuai.waimai.ad.monitor.b.a(optString, "SH", optInt2, str3, str9);
                        return;
                    }
                    if (com.sankuai.waimai.search.common.mach.b.c(a2.toString() + indexOf)) {
                        return;
                    }
                    com.sankuai.waimai.search.common.mach.b.d(a2.toString() + indexOf);
                    com.sankuai.waimai.ad.mads.a.a(optInt2, new b.a(optString, a8, 3).a(a9));
                    com.sankuai.waimai.ad.monitor.b.a(optString, "SH", optInt2, str3, str9);
                    return;
                }
                com.sankuai.waimai.ad.mads.a.a(optInt2, new b.a(optString, a8, 2).a(a9));
                com.sankuai.waimai.ad.monitor.b.a(optString, "SH", optInt2, str3, str9);
            }
        }
    }
}
