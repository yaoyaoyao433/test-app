package com.sankuai.waimai.business.page.kingkong.future.mach;

import android.text.TextUtils;
import com.meituan.android.common.aidata.raptoruploader.RaptorUploaderImpl;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.kingkong.future.ai.b;
import com.sankuai.waimai.business.page.kingkong.future.network.e;
import com.sankuai.waimai.platform.capacity.log.i;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.sankuai.waimai.platform.dynamic.b {
    public static ChangeQuickRedirect a;
    private com.sankuai.waimai.business.page.kingkong.future.ai.a b;
    private com.sankuai.waimai.business.page.kingkong.a d;
    private com.sankuai.waimai.business.page.common.net.request.a e;

    public a(String str, String str2, com.sankuai.waimai.business.page.kingkong.future.ai.a aVar, com.sankuai.waimai.business.page.kingkong.a aVar2) {
        super(str, str2);
        Object[] objArr = {str, str2, aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f02ca8abfb7594992a19983ec906be4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f02ca8abfb7594992a19983ec906be4");
            return;
        }
        this.b = aVar;
        this.d = aVar2;
        e eVar = aVar2.u.a().b;
        if (eVar != null) {
            this.e = eVar.b(1);
        }
    }

    @Override // com.sankuai.waimai.platform.dynamic.b, com.sankuai.waimai.mach.d
    public final void a(String str, String str2, int i, Map<String, Object> map, com.sankuai.waimai.mach.node.a aVar) {
        Map<String, Object> map2;
        JSONObject jSONObject;
        boolean z;
        Map<String, Object> a2;
        int i2;
        int i3;
        boolean z2;
        Object[] objArr = {str, str2, Integer.valueOf(i), map, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "530886d6617089dec61d8350f44d13d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "530886d6617089dec61d8350f44d13d6");
            return;
        }
        if (aVar != null) {
            try {
                Object b = aVar.b("rocks_adapter_position");
                int intValue = b instanceof Integer ? ((Integer) b).intValue() : 0;
                JSONObject jSONObject2 = new JSONObject(map);
                String optString = jSONObject2.optString("bid");
                JSONObject optJSONObject = jSONObject2.optJSONObject("lab");
                com.sankuai.waimai.business.page.home.list.future.d.a(optJSONObject);
                int optInt = optJSONObject.optInt("index");
                com.sankuai.waimai.foundation.utils.log.a.b("FKKMachLogReporter", "exposeIndex: " + optInt + "bid: " + optString + " lab: " + optJSONObject, new Object[0]);
                if (this.b != null) {
                    this.b.c.b(intValue - 1);
                    this.b.c.a(optInt);
                }
                if ("lx".equals(str2)) {
                    Object[] objArr2 = {optString, optJSONObject, Integer.valueOf(optInt), aVar, Integer.valueOf(intValue)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "557d6c433a3fd9f66e2851bb0b14ec55", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "557d6c433a3fd9f66e2851bb0b14ec55");
                        jSONObject = jSONObject2;
                    } else {
                        b.C0799b c0799b = com.sankuai.waimai.business.page.kingkong.future.ai.b.a().c;
                        if (c0799b == null) {
                            i3 = 1;
                            i2 = 2;
                        } else {
                            i2 = c0799b.k;
                            i3 = 1;
                        }
                        Object[] objArr3 = new Object[i3];
                        objArr3[0] = optString;
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        jSONObject = jSONObject2;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5389e59dd0630329bc88da91e979b4ed", RobustBitConfig.DEFAULT_VALUE)) {
                            z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5389e59dd0630329bc88da91e979b4ed")).booleanValue();
                        } else {
                            if (!TextUtils.equals(optString, "b_waimai_h5hr6c3w_mv") && !TextUtils.equals(optString, "b_waimai_789f8syo_mv") && !TextUtils.equals(optString, "b_waimai_ldnhpkf1_mv") && !TextUtils.equals(optString, "b_waimai_h5hr6c3w_mc") && !TextUtils.equals(optString, "b_waimai_789f8syo_mc") && !TextUtils.equals(optString, "b_waimai_6k7luli0_mc") && !TextUtils.equals(optString, "b_waimai_ldnhpkf1_mc") && !TextUtils.equals(optString, "b_waimai_tv2ojxum_mc")) {
                                z2 = false;
                            }
                            z2 = true;
                        }
                        if (z2) {
                            optJSONObject.put("request_type", i2);
                            optJSONObject.put("seqNumber", this.e != null ? this.e.r : 0);
                            int i4 = c0799b != null ? c0799b.j : 0;
                            if (i4 != 0) {
                                optJSONObject.put("intent_type", i4);
                            }
                        }
                        optJSONObject.put("filter", this.e == null ? "" : this.e.k);
                        optJSONObject.put("current_screen", com.sankuai.waimai.business.page.home.list.a.a().a(com.sankuai.waimai.business.page.home.list.a.d.intValue(), aVar.g()));
                        optJSONObject.put("first_load_uuid", com.sankuai.waimai.business.page.home.list.a.a().h);
                        optJSONObject.put(RaptorUploaderImpl.LOAD_TYPE, com.sankuai.waimai.business.page.home.helper.d.a().b);
                        optJSONObject.put("api_pos", "P0_" + optInt);
                        JSONObject jSONObject3 = new JSONObject();
                        JSONObject optJSONObject2 = optJSONObject.optJSONObject("extra");
                        if (optJSONObject2 != null) {
                            optJSONObject2.putOpt(DeviceInfo.USER_ID, String.valueOf(com.sankuai.waimai.platform.domain.manager.user.a.i().d()));
                        }
                        jSONObject3.putOpt("extra", optJSONObject2);
                        int optInt2 = optJSONObject.optInt("ad_type");
                        if (optInt2 != 0) {
                            jSONObject3.put("adType", optInt2);
                            jSONObject3.put("adChargeInfo", com.sankuai.waimai.business.page.common.util.c.a(optJSONObject.optString("charge_info")));
                        }
                        optJSONObject.remove("ad_type");
                        optJSONObject.remove("charge_info");
                    }
                } else {
                    jSONObject = jSONObject2;
                    if ("sh".equals(str2)) {
                        Object[] objArr4 = {optJSONObject, Integer.valueOf(optInt)};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "667233d7c275bb3a5d7205c9b5377d22", RobustBitConfig.DEFAULT_VALUE)) {
                            z = ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "667233d7c275bb3a5d7205c9b5377d22")).booleanValue();
                        } else {
                            z = false;
                            int optInt3 = optJSONObject.optInt("ad_type");
                            String optString2 = optJSONObject.optString("charge_info");
                            if (optInt3 != 0 && !TextUtils.isEmpty(optString2)) {
                                JSONObject jSONObject4 = new JSONObject();
                                jSONObject4.put("adType", optInt3);
                                jSONObject4.put("adChargeInfo", optString2 + "&templateId=" + optJSONObject.optString("templateId"));
                                optJSONObject.put("ad", jSONObject4);
                                z = true;
                            }
                        }
                        if (!z) {
                            return;
                        }
                    }
                }
                a2 = com.sankuai.waimai.business.page.common.util.c.a(jSONObject);
            } catch (Exception e) {
                i.d(new com.sankuai.waimai.platform.mach.statistics.c().a("future_kingkong_mach_expose").b("mach_lx_expose_failed").c(e.getMessage()).b());
                map2 = map;
            }
        } else {
            a2 = map;
        }
        map2 = a2;
        super.a(str, str2, i, map2, aVar);
    }
}
