package com.sankuai.waimai.business.knb.recommend.subscriber;

import android.os.Handler;
import android.text.TextUtils;
import com.dianping.titans.utils.StorageUtil;
import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.persona.b;
import com.sankuai.waimai.alita.persona.c;
import com.sankuai.waimai.alita.persona.e;
import com.sankuai.waimai.business.knb.recommend.RecommendApi;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.utils.d;
import com.sankuai.waimai.platform.utils.listid.ListIDHelper;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements e {
    public static ChangeQuickRedirect a;
    public final Handler b;
    public final int c;
    public final long d;
    public final String e;
    private final com.sankuai.waimai.platform.net.service.a f;
    private final InterfaceC0750a g;
    private final int h;
    private final String i;
    private final HashMap<String, Object> j;
    private int k;
    private int l;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.knb.recommend.subscriber.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0750a {
        void a();
    }

    @Override // com.sankuai.waimai.alita.persona.e
    public final void a() {
    }

    public a(com.sankuai.waimai.platform.net.service.a aVar, String str, JSONObject jSONObject, InterfaceC0750a interfaceC0750a) {
        JSONObject optJSONObject;
        Object[] objArr = {aVar, str, jSONObject, interfaceC0750a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eccee655f0d928b4bab0ee8ae63a0de8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eccee655f0d928b4bab0ee8ae63a0de8");
            return;
        }
        this.j = new HashMap<>();
        this.f = aVar;
        this.e = str;
        this.g = interfaceC0750a;
        this.b = new Handler();
        this.i = jSONObject.optString("apiUrl", "");
        this.h = jSONObject.optInt("maxRecommendTimes", 3);
        this.c = jSONObject.optInt("defaultTime", 25);
        this.d = jSONObject.optLong("sparkPoiId", -1L);
        if (TextUtils.isEmpty(this.i) || (optJSONObject = jSONObject.optJSONObject("requestParams")) == null) {
            return;
        }
        Iterator<String> keys = optJSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = optJSONObject.opt(next);
            if (opt != null) {
                this.j.put(next, opt);
            }
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb2745e9271def4026ecb0bec80acfec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb2745e9271def4026ecb0bec80acfec");
            return;
        }
        b a2 = c.a().a("waimai");
        if (a2 != null) {
            a2.b("persona_poi_interest", this);
        }
        this.b.removeCallbacksAndMessages(null);
        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(this.e);
    }

    @Override // com.sankuai.waimai.alita.persona.e
    public final void a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        String str;
        int i;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bd823682643dafa1f8c9b1acf8d5439", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bd823682643dafa1f8c9b1acf8d5439");
            return;
        }
        if (jSONObject != null) {
            i = jSONObject.optInt("richness_degree", 0);
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            jSONObject2 = optJSONObject != null ? optJSONObject.optJSONObject("current_action") : null;
            str = jSONObject2 == null ? null : jSONObject2.optString("poi_id");
        } else {
            jSONObject2 = null;
            str = null;
            i = 0;
        }
        if (com.sankuai.waimai.foundation.core.a.b() && d.b(com.meituan.android.singleton.b.a, "test_personal_ai_recommend", false)) {
            String optString = jSONObject2 != null ? jSONObject2.optString("duration") : null;
            ae.a(com.meituan.android.singleton.b.a.getApplicationContext(), "为你优选商家推荐  richness_degree=" + i + "  duration=" + optString);
        }
        if (TextUtils.isEmpty(str) || !str.equals(String.valueOf(this.d))) {
            return;
        }
        if (this.l == 0) {
            this.l++;
            this.k = i;
            c();
        } else if (this.l < this.h) {
            if (i <= 0 || i <= this.k) {
                return;
            }
            this.l++;
            c();
            this.k = i;
        } else {
            b();
            this.g.a();
        }
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37b61c21480dfb0298acbb9aeec46b15", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37b61c21480dfb0298acbb9aeec46b15");
        } else if (TextUtils.isEmpty(this.i)) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("isInterested", Boolean.valueOf(this.k > 0));
            StorageUtil.putSharedValue(com.meituan.android.singleton.b.a, this.e, jsonObject.toString(), 0);
        } else {
            this.j.put("rank_list_id", ListIDHelper.a.a.a());
            com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((RecommendApi) this.f.b().a(RecommendApi.class)).poiRecommend(this.i, this.j), new b.AbstractC1042b<RecommendApi.a>() { // from class: com.sankuai.waimai.business.knb.recommend.subscriber.a.2
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final void onError(Throwable th) {
                }

                @Override // rx.e
                public final /* synthetic */ void onNext(Object obj) {
                    RecommendApi.a aVar = (RecommendApi.a) obj;
                    Object[] objArr2 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3339268de483bc5c7c61fad559fc2208", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3339268de483bc5c7c61fad559fc2208");
                    } else if (aVar == null || aVar.a == null) {
                    } else {
                        JsonObject jsonObject2 = aVar.a;
                        jsonObject2.addProperty("isInterested", Boolean.TRUE);
                        StorageUtil.putSharedValue(com.meituan.android.singleton.b.a, a.this.e, jsonObject2.toString(), 0);
                    }
                }
            }, this.e, false);
        }
    }
}
