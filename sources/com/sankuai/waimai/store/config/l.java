package com.sankuai.waimai.store.config;

import android.text.TextUtils;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class l extends com.sankuai.waimai.store.config.a<Map<String, JsonObject>> {
    public static ChangeQuickRedirect b;
    public Map<String, JsonObject> c;

    @Override // com.sankuai.waimai.store.config.a
    public final String c() {
        return "supermarket_mrn_redirect_map";
    }

    @Override // com.sankuai.waimai.store.config.a
    public final String d() {
        return "sm_redirect_map";
    }

    @Override // com.sankuai.waimai.store.config.a
    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    @Override // com.sankuai.waimai.store.config.a
    public final /* bridge */ /* synthetic */ void a(Map<String, JsonObject> map) {
        this.c = map;
    }

    @Override // com.sankuai.waimai.store.config.a
    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    public l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02787ac9c1d753d53f5beba3f5b2dd33", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02787ac9c1d753d53f5beba3f5b2dd33");
        } else {
            this.c = new HashMap();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static final class a {
        private static final l a = new l();
    }

    public static l e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a47276dd1557465c41cb98130740bc19", RobustBitConfig.DEFAULT_VALUE) ? (l) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a47276dd1557465c41cb98130740bc19") : a.a;
    }

    public final String a(String str, String str2) {
        JsonObject jsonObject;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f675b2be81b1206c303deaee10dcd4b7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f675b2be81b1206c303deaee10dcd4b7");
        }
        try {
            return (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (jsonObject = this.c.get(str2)) == null || jsonObject.get(str) == null) ? "" : jsonObject.get(str).getAsString();
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
            return "";
        }
    }

    public final boolean b(String str, String str2) {
        JsonObject jsonObject;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2951dae0e9d14ee6533871f15c98797a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2951dae0e9d14ee6533871f15c98797a")).booleanValue();
        }
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && (jsonObject = this.c.get(str2)) != null && jsonObject.get(str) != null) {
                return jsonObject.get(str).getAsBoolean();
            }
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.sankuai.waimai.store.config.a
    /* renamed from: b */
    public Map<String, JsonObject> a(String str) {
        JsonObject asJsonObject;
        JsonObject jsonObject;
        char c = 1;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0582a9333aeded0f2f9463b1fb7af7c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0582a9333aeded0f2f9463b1fb7af7c");
        }
        HashMap hashMap = new HashMap();
        try {
            if (!TextUtils.isEmpty(str) && (asJsonObject = new JsonParser().parse(str).getAsJsonObject()) != null) {
                for (Map.Entry<String, JsonElement> entry : asJsonObject.entrySet()) {
                    Object[] objArr2 = new Object[2];
                    objArr2[0] = hashMap;
                    objArr2[c] = entry;
                    ChangeQuickRedirect changeQuickRedirect2 = b;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "211bd802177c4f034516b1bbcca9df56", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "211bd802177c4f034516b1bbcca9df56");
                    } else if (entry != null && entry.getValue() != null && (entry.getValue() instanceof JsonObject) && (jsonObject = (JsonObject) entry.getValue()) != null && !jsonObject.isJsonNull() && jsonObject.get("src_url") != null) {
                        String asString = jsonObject.get("src_url").getAsString();
                        if (!TextUtils.isEmpty(asString)) {
                            hashMap.put(asString, jsonObject);
                        }
                    }
                    c = 1;
                }
            }
        } catch (Exception unused) {
            com.sankuai.waimai.store.base.log.a.a(str, false);
        }
        return hashMap;
    }
}
