package com.sankuai.waimai.store.drug.home.new_home;

import android.arch.lifecycle.q;
import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.mads.b;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.drug.home.DrugHomePoiIdManager;
import com.sankuai.waimai.store.drug.home.new_home.realtime.NewDrugHomeRealtimeViewModel;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class k implements com.sankuai.waimai.mach.d {
    public static ChangeQuickRedirect a;
    private SCBaseActivity b;
    private String c;
    private NewDrugHomeRealtimeViewModel d;

    public k(SCBaseActivity sCBaseActivity, String str) {
        Object[] objArr = {sCBaseActivity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6bbbe6f608ebd08a73efa92d10fc21c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6bbbe6f608ebd08a73efa92d10fc21c");
            return;
        }
        this.b = sCBaseActivity;
        this.c = str;
    }

    @Override // com.sankuai.waimai.mach.d
    public final void a(String str, String str2, int i, Map<String, Object> map, com.sankuai.waimai.mach.node.a aVar) {
        String str3;
        String jSONObject;
        Object[] objArr = {str, str2, Integer.valueOf(i), map, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "608ba1024838bbd2c2e7eac9064e418a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "608ba1024838bbd2c2e7eac9064e418a");
            return;
        }
        JSONObject jSONObject2 = new JSONObject(map);
        String optString = jSONObject2.optString("bid");
        boolean optBoolean = jSONObject2.optBoolean("sh");
        JSONObject optJSONObject = jSONObject2.optJSONObject("lab");
        String a2 = TextUtils.isEmpty(this.c) ? com.sankuai.waimai.store.manager.judas.b.a((Context) this.b) : this.c;
        String a3 = com.sankuai.waimai.store.manager.judas.b.a((Object) this.b);
        Map<String, Object> a4 = com.sankuai.waimai.store.util.n.a(optJSONObject);
        String str4 = a4.get("charge_info") instanceof String ? (String) a4.get("charge_info") : "";
        Object obj = a4.get("poi_id");
        Object[] objArr2 = {Integer.valueOf(i), optString, obj};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "87f47884df96afa0b0cf67d4e6312e2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "87f47884df96afa0b0cf67d4e6312e2a");
        } else if (!com.sankuai.waimai.store.util.b.a(this.b) && 1 == i && ("b_waimai_noh3p41v_mc".equals(optString) || "b_waimai_pibb6kim_mc".equals(optString))) {
            long a5 = com.sankuai.waimai.store.drug.home.realtime.b.a(obj);
            if (a5 <= 0) {
                a5 = DrugHomePoiIdManager.a(this.b, obj);
            }
            if (a5 > 0) {
                a();
                NewDrugHomeRealtimeViewModel newDrugHomeRealtimeViewModel = this.d;
                Object[] objArr3 = {new Long(a5)};
                ChangeQuickRedirect changeQuickRedirect3 = NewDrugHomeRealtimeViewModel.a;
                if (PatchProxy.isSupport(objArr3, newDrugHomeRealtimeViewModel, changeQuickRedirect3, false, "73393dec272905564869a06401179552", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, newDrugHomeRealtimeViewModel, changeQuickRedirect3, false, "73393dec272905564869a06401179552");
                } else {
                    newDrugHomeRealtimeViewModel.b = a5;
                }
            }
        }
        int intValue = a4.get("ad_type") instanceof Number ? ((Number) a4.get("ad_type")).intValue() : -1;
        String str5 = null;
        if (aVar == null || aVar.f == null || aVar.f.getMachBundle() == null) {
            str3 = null;
        } else {
            com.sankuai.waimai.mach.manager.cache.e machBundle = aVar.f.getMachBundle();
            String str6 = machBundle.j;
            str3 = machBundle.a();
            str5 = str6;
        }
        if ("lx".equals(str2)) {
            if (optBoolean) {
                if (intValue > 0) {
                    try {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("adType", intValue);
                        jSONObject3.put("adChargeInfo", com.sankuai.waimai.store.util.n.a(str4));
                        jSONObject = jSONObject3.toString();
                    } catch (JSONException e) {
                        com.sankuai.shangou.stone.util.log.a.a(e);
                    }
                    a4.remove("ad_type");
                    a4.remove("charge_info");
                    a4.put("ad", jSONObject);
                }
                jSONObject = "";
                a4.remove("ad_type");
                a4.remove("charge_info");
                a4.put("ad", jSONObject);
            }
            com.sankuai.waimai.ad.monitor.b.a(a4, str5, str3);
            com.sankuai.waimai.ad.monitor.b.a(optString, "LX", com.sankuai.waimai.report.a.a(a4), str5, str3);
            if (i == 2) {
                com.sankuai.waimai.store.manager.judas.b.b(a2, a3, optString).a(a4).a();
            } else if (i == 1) {
                Object[] objArr4 = {optString};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "bdb49fe72aeb2461b126e02ed3ad9236", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "bdb49fe72aeb2461b126e02ed3ad9236");
                } else if (!com.sankuai.waimai.store.util.b.a(this.b)) {
                    a();
                    this.d.k = optString;
                }
                com.sankuai.waimai.store.manager.judas.b.a(a2, a3, optString).a(a4).a();
            }
        } else if (!"sh".equals(str2) || t.a(optString)) {
        } else {
            String a6 = com.sankuai.waimai.ad.monitor.b.a(str4, str5, str3);
            com.sankuai.waimai.ad.monitor.b.a(optString, "SH", intValue, str5, str3);
            if (i == 2) {
                com.sankuai.waimai.ad.mads.a.a(intValue, new b.a(optString, a6, 3));
            } else if (i == 1) {
                com.sankuai.waimai.ad.mads.a.a(intValue, new b.a(optString, a6, 2));
            }
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "adde6794b31d24da5fde0a67c180f0ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "adde6794b31d24da5fde0a67c180f0ac");
        } else if (this.d == null) {
            this.d = (NewDrugHomeRealtimeViewModel) q.a((FragmentActivity) this.b).a(NewDrugHomeRealtimeViewModel.class);
        }
    }
}
