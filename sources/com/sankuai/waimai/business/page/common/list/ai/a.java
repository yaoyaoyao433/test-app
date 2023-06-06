package com.sankuai.waimai.business.page.common.list.ai;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.event.AlitaRealTimeEventCenter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    String b;
    public int c;
    private Map<String, Object> d;
    private com.sankuai.waimai.business.page.common.list.ai.common.a e;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.page.common.list.ai.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0759a {
        void a();
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5eeb3b6ad1fbfa58912e67a8586e9c5c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5eeb3b6ad1fbfa58912e67a8586e9c5c");
            return;
        }
        this.d = new HashMap();
        this.e = new com.sankuai.waimai.business.page.common.list.ai.common.d("mix_dynamicPaging_exp");
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class b {
        private static final a a = new a();
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "043683c4aa74ff8cca0c2a4a976113c3", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "043683c4aa74ff8cca0c2a4a976113c3") : b.a;
    }

    public final void a(final InterfaceC0759a interfaceC0759a) {
        List<com.sankuai.waimai.alita.core.feature.d> arrayList;
        Object[] objArr = {interfaceC0759a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "992d72d2624e7de44845b955698dbab2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "992d72d2624e7de44845b955698dbab2");
            return;
        }
        this.b = "";
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bb2e11a7b97f4007f34ef26ea1c23678", RobustBitConfig.DEFAULT_VALUE)) {
            arrayList = (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bb2e11a7b97f4007f34ef26ea1c23678");
        } else {
            arrayList = new ArrayList<>();
            com.sankuai.waimai.alita.core.feature.d dVar = new com.sankuai.waimai.alita.core.feature.d();
            dVar.b = "waimai";
            dVar.c = "lx_rank_normal_features";
            dVar.d = "rank_feature_params";
            arrayList.add(dVar);
        }
        com.sankuai.waimai.alita.core.feature.c.a().a(com.sankuai.android.jarvis.c.a(), arrayList, new com.sankuai.waimai.alita.core.feature.f() { // from class: com.sankuai.waimai.business.page.common.list.ai.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.alita.core.feature.f
            public final void a(@Nullable JSONObject jSONObject) {
                Object[] objArr3 = {jSONObject};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "79febb3086ab5da52139285cffb4b971", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "79febb3086ab5da52139285cffb4b971");
                    return;
                }
                a.this.b = jSONObject == null ? "" : jSONObject.toString();
                interfaceC0759a.a();
            }

            @Override // com.sankuai.waimai.alita.core.feature.f
            public final void a(@Nullable Exception exc) {
                Object[] objArr3 = {exc};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "98ce1553422f2a95296558cb5877bdf0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "98ce1553422f2a95296558cb5877bdf0");
                } else {
                    interfaceC0759a.a();
                }
            }
        });
    }

    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9883767bf6378ea7fb4e007c137ab9b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9883767bf6378ea7fb4e007c137ab9b") : a(this.b);
    }

    public final String a(String str) {
        JSONObject jSONObject;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e50e4160fd04f0bd0ff50dd54584673", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e50e4160fd04f0bd0ff50dd54584673");
        }
        try {
            if (TextUtils.isEmpty(str)) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = new JSONObject(str);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("scene_name", this.e.c);
            jSONObject2.put("exp_group_name", this.e.b);
            jSONObject2.put("exp_name", this.e.d);
            jSONObject.put("exp_info", jSONObject2);
            return jSONObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return str;
        }
    }

    public final void a(int i, String str, String str2) {
        Object[] objArr = {Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9d52f85ee553a037a682acbabd3e591", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9d52f85ee553a037a682acbabd3e591");
            return;
        }
        this.d.clear();
        if (i == 0) {
            this.d.put("reactive_features", str);
            AlitaRealTimeEventCenter.getInstance().writeLXCustomEvent("waimai_rank_edge_rec", null, "bid_reactive", this.d, "cid_reactive", "waimai", true);
        } else if (i == 1) {
            this.d.put("edge_intel_features", str);
            if (!TextUtils.isEmpty(str2)) {
                this.d.put("rerank_extra", str2);
            }
            AlitaRealTimeEventCenter.getInstance().writeLXCustomEvent("waimai_rank_edge_rec", null, "bid_rank", this.d, "cid_rank", "waimai", true);
        }
    }

    public final void a(Map<String, Object> map, String str) {
        int i;
        Object[] objArr = {map, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce97d2c13171e70eaf510ae0e268dd68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce97d2c13171e70eaf510ae0e268dd68");
            return;
        }
        a().a(1, map != null ? (String) map.get("featureMarkInfo") : null, str);
        if (com.sankuai.waimai.business.page.home.helper.b.a().b()) {
            if ("hit_tabs".equals(str)) {
                i = 6;
            } else {
                i = "hit_mainlist".equals(str) ? 7 : -1;
            }
            if (i > 0) {
                com.sankuai.waimai.business.page.home.helper.b.a().a(i);
            }
        }
        if (map == null) {
            return;
        }
        String str2 = (String) map.get("featureMarkInfo");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            JSONObject optJSONObject = new JSONObject(str2).optJSONObject("alitaExp");
            if (optJSONObject == null || optJSONObject.optString("offset") == null) {
                return;
            }
            this.c = Integer.parseInt(optJSONObject.optString("offset"));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
