package com.sankuai.waimai.store.drug.home.logreport;

import android.arch.lifecycle.q;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.mads.b;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.ad.monitor.b;
import com.sankuai.waimai.mach.d;
import com.sankuai.waimai.mach.manager.cache.e;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.drug.home.new_home.realtime.NewDrugHomeRealtimeViewModel;
import com.sankuai.waimai.store.drug.home.new_home.realtime.ShoppingGuideRealtimeViewModel;
import com.sankuai.waimai.store.util.n;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements d {
    public static ChangeQuickRedirect a;
    private SCBaseActivity b;
    private String c;
    private final String d;
    private ShoppingGuideRealtimeViewModel e;
    private NewDrugHomeRealtimeViewModel f;

    public a(SCBaseActivity sCBaseActivity, String str, @NonNull String str2) {
        Object[] objArr = {sCBaseActivity, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e38c8d550d4104b23ec6c537a663ab09", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e38c8d550d4104b23ec6c537a663ab09");
            return;
        }
        this.b = sCBaseActivity;
        this.c = str;
        this.d = str2;
    }

    @Override // com.sankuai.waimai.mach.d
    public final void a(String str, String str2, int i, Map<String, Object> map, com.sankuai.waimai.mach.node.a aVar) {
        String str3;
        Object[] objArr = {str, str2, Integer.valueOf(i), map, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb0aafd6e0d8d2806d467d88ef069e73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb0aafd6e0d8d2806d467d88ef069e73");
        } else if (map == null) {
        } else {
            try {
                JSONObject jSONObject = new JSONObject(map);
                com.sankuai.shangou.stone.util.log.a.b("MachNormalLogReporter,%s", "source = " + str2 + ",mode = " + i + ",map= " + jSONObject.toString());
                String str4 = null;
                String optString = jSONObject.optString("bid", null);
                boolean optBoolean = jSONObject.optBoolean("sh", false);
                JSONObject optJSONObject = jSONObject.optJSONObject("lab");
                Map<String, Object> a2 = n.a(optJSONObject);
                String str5 = a2.get("charge_info") instanceof String ? (String) a2.get("charge_info") : "";
                int intValue = a2.get("ad_type") instanceof Number ? ((Number) a2.get("ad_type")).intValue() : -1;
                if (aVar == null || aVar.f == null || aVar.f.getMachBundle() == null) {
                    str3 = null;
                } else {
                    e machBundle = aVar.f.getMachBundle();
                    String str6 = machBundle.j;
                    str3 = machBundle.a();
                    str4 = str6;
                }
                if ("lx".equals(str2) && optJSONObject != null && !TextUtils.isEmpty(optString)) {
                    if (optBoolean) {
                        String str7 = "";
                        if (intValue > 0) {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("adType", intValue);
                            jSONObject2.put("adChargeInfo", n.a(str5));
                            str7 = jSONObject2.toString();
                        }
                        a2.remove("ad_type");
                        a2.remove("charge_info");
                        a2.put("ad", str7);
                    }
                    b.a(a2, str4, str3);
                    b.a(optString, "LX", intValue, str4, str3);
                    switch (i) {
                        case 1:
                            com.sankuai.shangou.stone.util.log.a.a("MachNormalLogReporter,%s", "DLReport JUDAS REPORT_MODE_CLICK " + optString);
                            Object[] objArr2 = {optString};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6cd857de98551671eb5c7925ec5757a7", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6cd857de98551671eb5c7925ec5757a7");
                            } else if (!com.sankuai.waimai.store.util.b.a(this.b)) {
                                if (this.e == null) {
                                    this.e = (ShoppingGuideRealtimeViewModel) q.a((FragmentActivity) this.b).a(ShoppingGuideRealtimeViewModel.class);
                                }
                                this.e.d = optString;
                                if (this.f == null) {
                                    this.f = (NewDrugHomeRealtimeViewModel) q.a((FragmentActivity) this.b).a(NewDrugHomeRealtimeViewModel.class);
                                }
                                this.f.k = optString;
                            }
                            com.sankuai.waimai.store.manager.judas.b.a(this.c, this.d, optString).a(a2).a();
                            return;
                        case 2:
                            com.sankuai.shangou.stone.util.log.a.a("MachNormalLogReporter,%s", "DLReport JUDAS REPORT_MODE_SEE " + optString);
                            com.sankuai.waimai.store.manager.judas.b.b(this.c, this.d, optString).a(a2).a();
                            return;
                        default:
                            return;
                    }
                } else if (!"sh".equals(str2) || t.a(optString)) {
                } else {
                    String a3 = b.a(str5, str4, str3);
                    b.a(optString, "SH", intValue, str4, str3);
                    switch (i) {
                        case 1:
                            com.sankuai.waimai.ad.mads.a.a(intValue, new b.a(optString, a3, 2));
                            return;
                        case 2:
                            com.sankuai.waimai.ad.mads.a.a(intValue, new b.a(optString, a3, 3));
                            return;
                        default:
                            return;
                    }
                }
            } catch (Exception e) {
                com.sankuai.shangou.stone.util.log.a.a(e);
            }
        }
    }
}
