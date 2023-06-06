package com.sankuai.waimai.business.page.home.homecache;

import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.utils.j;
import com.sankuai.waimai.business.page.home.utils.m;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.location.v2.g;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.rocks.model.RocksServerModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;
    public BaseResponse<String> b;
    public BaseResponse<com.sankuai.waimai.business.page.home.model.f> c;
    public c d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class a {
        private static final d a = new d();
    }

    public static d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a67f828638576d472648a0a06884f6cb", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a67f828638576d472648a0a06884f6cb") : a.a;
    }

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db068ccc478dca08dde90cd4f4c52e33", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db068ccc478dca08dde90cd4f4c52e33");
        } else {
            b.a().a(com.sankuai.waimai.business.page.common.abtest.a.g());
        }
    }

    public final void a(final BaseResponse<String> baseResponse) {
        Object[] objArr = {baseResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "185caf66f49f9ac725d2e1a3dcb62075", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "185caf66f49f9ac725d2e1a3dcb62075");
        } else if (b.a().c()) {
            d().a(new Runnable() { // from class: com.sankuai.waimai.business.page.home.homecache.d.1
                public static ChangeQuickRedirect a;

                /* JADX WARN: Type inference failed for: r0v6, types: [D, java.lang.String] */
                @Override // java.lang.Runnable
                public final void run() {
                    Iterator<String> keys;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3e0fa2be79c2dc0b565336170f09cce4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3e0fa2be79c2dc0b565336170f09cce4");
                        return;
                    }
                    try {
                        if (baseResponse == null || TextUtils.isEmpty((CharSequence) baseResponse.data)) {
                            return;
                        }
                        JSONObject jSONObject = new JSONObject((String) baseResponse.data);
                        JSONArray jSONArray = jSONObject.getJSONArray("module_list");
                        if (jSONArray != null && jSONArray.length() > 0) {
                            JSONArray jSONArray2 = new JSONArray();
                            for (int i = 0; i < jSONArray.length(); i++) {
                                Object obj = jSONArray.get(i);
                                if (obj instanceof JSONObject) {
                                    if (b.a().a(((JSONObject) obj).optString("module_id"))) {
                                        ((JSONObject) obj).put("isCache", true);
                                        jSONArray2.put(obj);
                                    }
                                }
                            }
                            jSONObject.put("module_list", jSONArray2);
                        }
                        BaseResponse baseResponse2 = new BaseResponse(baseResponse.code, baseResponse.msg);
                        JSONObject jSONObject2 = jSONObject.getJSONObject("home_rcmd_style");
                        if (jSONObject2 != null && (keys = jSONObject2.keys()) != null) {
                            while (keys.hasNext()) {
                                if (!b.a().b(keys.next())) {
                                    keys.remove();
                                }
                            }
                        }
                        baseResponse2.data = jSONObject.toString();
                        WMLocation p = g.a().p();
                        if (p != null && p.getLongitude() > 0.0d && p.getLatitude() > 0.0d) {
                            f.a("rcmd_data_cache_key", com.sankuai.waimai.foundation.location.v2.d.a().toJson(new e(baseResponse2, 0, com.sankuai.waimai.platform.b.A().i(), System.currentTimeMillis(), Double.valueOf(p.getLatitude()), p.getLongitude())));
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    public final BaseResponse<String> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59af6e179b68bf8662f8a787bd5b6985", RobustBitConfig.DEFAULT_VALUE)) {
            return (BaseResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59af6e179b68bf8662f8a787bd5b6985");
        }
        if (this.b != null) {
            return this.b;
        }
        m.a().a("GetRcmdCache+");
        j.a("GetRcmdCache+");
        String a2 = f.a("rcmd_data_cache_key");
        if (!TextUtils.isEmpty(a2)) {
            f.b("rcmd_data_cache_key");
            try {
                e eVar = (e) com.sankuai.waimai.foundation.location.v2.d.a().fromJson(a2, new TypeToken<e<BaseResponse<String>>>() { // from class: com.sankuai.waimai.business.page.home.homecache.d.2
                }.getType());
                if (eVar != null && eVar.a()) {
                    this.b = (BaseResponse) eVar.b;
                    m.a().a("GetRcmdCache-");
                    j.a("GetRcmdCache-");
                    return this.b;
                }
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public final void b(final BaseResponse<com.sankuai.waimai.business.page.home.model.f> baseResponse) {
        Object[] objArr = {baseResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58a5f5bfddd83734b4a4982539e07bf8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58a5f5bfddd83734b4a4982539e07bf8");
            return;
        }
        try {
            if (b.a().d() && baseResponse != null && baseResponse.isSuccess() && !com.sankuai.waimai.foundation.utils.d.a(baseResponse.data.moduleList) && !baseResponse.data.isCache) {
                d().a(new Runnable() { // from class: com.sankuai.waimai.business.page.home.homecache.d.3
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Set<Map.Entry<String, Object>> entrySet;
                        Iterator<Map.Entry<String, Object>> it;
                        int i;
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5dc4eda4d1b7f1787ef3084f5a87cf03", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5dc4eda4d1b7f1787ef3084f5a87cf03");
                            return;
                        }
                        try {
                            BaseResponse baseResponse2 = (BaseResponse) com.sankuai.waimai.foundation.location.v2.d.a().fromJson(com.sankuai.waimai.foundation.location.v2.d.a().toJson(baseResponse), new TypeToken<BaseResponse<com.sankuai.waimai.business.page.home.model.f>>() { // from class: com.sankuai.waimai.business.page.home.homecache.d.3.1
                            }.getType());
                            ((com.sankuai.waimai.business.page.home.model.f) baseResponse2.data).moduleList = new ArrayList();
                            ((com.sankuai.waimai.business.page.home.model.f) baseResponse2.data).isCache = true;
                            for (int i2 = 0; i2 < ((com.sankuai.waimai.business.page.home.model.f) baseResponse.data).moduleList.size(); i2++) {
                                int size = ((com.sankuai.waimai.business.page.home.model.f) baseResponse2.data).moduleList.size();
                                b a2 = b.a();
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = b.a;
                                if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "631d9871c14a11575f3c788b07952f0e", RobustBitConfig.DEFAULT_VALUE)) {
                                    i = ((Integer) PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "631d9871c14a11575f3c788b07952f0e")).intValue();
                                } else if (a2.c != -1) {
                                    i = a2.c;
                                } else if (!a2.d()) {
                                    a2.c = 0;
                                    i = 0;
                                } else {
                                    a2.c = a2.b.b.d;
                                    i = a2.c;
                                }
                                if (size >= i) {
                                    break;
                                }
                                RocksServerModel rocksServerModel = ((com.sankuai.waimai.business.page.home.model.f) baseResponse.data).moduleList.get(i2);
                                if (rocksServerModel != null && TextUtils.equals("waimai_mach_usercenter_homepage_future_poi_style_1", rocksServerModel.templateId)) {
                                    ((com.sankuai.waimai.business.page.home.model.f) baseResponse2.data).moduleList.add(rocksServerModel);
                                }
                            }
                            if (com.sankuai.waimai.foundation.utils.d.a(((com.sankuai.waimai.business.page.home.model.f) baseResponse2.data).moduleList)) {
                                return;
                            }
                            Map<String, Object> map = ((com.sankuai.waimai.business.page.home.model.f) baseResponse2.data).jsonData;
                            if (map != null && (entrySet = map.entrySet()) != null && (it = entrySet.iterator()) != null) {
                                while (it.hasNext()) {
                                    Map.Entry<String, Object> next = it.next();
                                    if (next != null) {
                                        if (TextUtils.equals(next.getKey(), "page")) {
                                            Object obj = map.get("page");
                                            if (obj instanceof Map) {
                                                Object obj2 = ((Map) obj).get("has_next_page");
                                                if ((obj2 instanceof Boolean) && ((Boolean) obj2).booleanValue()) {
                                                    ((Map) obj).put("has_next_page", Boolean.FALSE);
                                                }
                                            }
                                        } else {
                                            it.remove();
                                        }
                                    }
                                }
                            }
                            WMLocation p = g.a().p();
                            if (p != null && p.getLongitude() > 0.0d && p.getLatitude() > 0.0d) {
                                f.a("feeds_tabs_data_cache_key", com.sankuai.waimai.foundation.location.v2.d.a().toJson(new e(baseResponse2, 1, com.sankuai.waimai.platform.b.A().i(), System.currentTimeMillis(), Double.valueOf(p.getLatitude()), p.getLongitude())));
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final BaseResponse<com.sankuai.waimai.business.page.home.model.f> c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3c9d33f470e20dbb2c0e715274c429a", RobustBitConfig.DEFAULT_VALUE)) {
            return (BaseResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3c9d33f470e20dbb2c0e715274c429a");
        }
        if (this.c != null) {
            return this.c;
        }
        m.a().a("GetFeedCache+");
        j.a("GetFeedCache+");
        try {
            String a2 = f.a("feeds_tabs_data_cache_key");
            if (TextUtils.isEmpty(a2)) {
                return null;
            }
            f.b("feeds_tabs_data_cache_key");
            e eVar = (e) com.sankuai.waimai.foundation.location.v2.d.a().fromJson(a2, new TypeToken<e<BaseResponse<com.sankuai.waimai.business.page.home.model.f>>>() { // from class: com.sankuai.waimai.business.page.home.homecache.d.4
            }.getType());
            if (eVar == null || !eVar.a()) {
                return null;
            }
            this.c = (BaseResponse) eVar.b;
            m.a().a("GetFeedCache-");
            j.a("GetFeedCache-");
            return this.c;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private c d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d831e3539721d88c75f6e438092fc08", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d831e3539721d88c75f6e438092fc08");
        }
        if (this.d == null) {
            this.d = new c();
        }
        return this.d;
    }
}
