package com.sankuai.waimai.store.repository.deserializer;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.repository.model.ConfigInfo;
import com.sankuai.waimai.store.repository.model.LastPoiModule;
import com.sankuai.waimai.store.repository.model.MerchantPoiList;
import com.sankuai.waimai.store.repository.model.NearByModule;
import com.sankuai.waimai.store.repository.model.PoiDrugSpuScrollKingKong;
import com.sankuai.waimai.store.repository.model.PoiUserSpuScrollKingKong;
import com.sankuai.waimai.store.repository.model.Porcelain;
import com.sankuai.waimai.store.repository.model.PrimaryFilterCondList;
import com.sankuai.waimai.store.repository.model.RecommendSearchResponse;
import com.sankuai.waimai.store.repository.model.VerticalityAcrossBanner;
import com.sankuai.waimai.store.repository.model.VerticalityBanner;
import com.sankuai.waimai.store.util.i;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class BaseModuleDescDeserializer implements JsonDeserializer<BaseModuleDesc> {
    public static ChangeQuickRedirect a;
    public static Map<String, a> b;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class PharmcistEntrance implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("desc")
        public String desc;
        @SerializedName(RemoteMessageConst.Notification.ICON)
        public String icon;
        @SerializedName("jump_scheme")
        public String jumpScheme;
        @SerializedName("jump_text")
        public String jumpText;
        @SerializedName("status")
        public int status;
        @SerializedName("stid")
        public String stid;
        @SerializedName("title")
        public String title;
    }

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put(ConfigInfo.MODULE_BANNER, new a("banner_list", new TypeToken<ArrayList<VerticalityBanner>>() { // from class: com.sankuai.waimai.store.repository.deserializer.BaseModuleDescDeserializer.1
        }.getType()));
        b.put("porcelain", new a("blocks", new TypeToken<ArrayList<Porcelain>>() { // from class: com.sankuai.waimai.store.repository.deserializer.BaseModuleDescDeserializer.6
        }.getType()));
        b.put(ConfigInfo.MODULE_ACROSS_BANNER, new a("across_banner_list", new TypeToken<ArrayList<VerticalityAcrossBanner>>() { // from class: com.sankuai.waimai.store.repository.deserializer.BaseModuleDescDeserializer.7
        }.getType()));
        b.put(ConfigInfo.MODULE_KING_KONG, new a("primary_filter_condlist", new TypeToken<ArrayList<PrimaryFilterCondList>>() { // from class: com.sankuai.waimai.store.repository.deserializer.BaseModuleDescDeserializer.8
        }.getType()));
        b.put("drug_king_kong", new a("", new TypeToken<PoiDrugSpuScrollKingKong>() { // from class: com.sankuai.waimai.store.repository.deserializer.BaseModuleDescDeserializer.9
        }.getType()));
        b.put("kingkong_v2", new a("", new TypeToken<PoiUserSpuScrollKingKong>() { // from class: com.sankuai.waimai.store.repository.deserializer.BaseModuleDescDeserializer.10
        }.getType()));
        b.put("channel_kingkong", new a("", new TypeToken<PoiUserSpuScrollKingKong>() { // from class: com.sankuai.waimai.store.repository.deserializer.BaseModuleDescDeserializer.11
        }.getType()));
        b.put(ConfigInfo.MODULE_OFTEN_BUY, new a("", new TypeToken<LastPoiModule>() { // from class: com.sankuai.waimai.store.repository.deserializer.BaseModuleDescDeserializer.12
        }.getType()));
        b.put("home_nearby_poilist", new a("", new TypeToken<NearByModule>() { // from class: com.sankuai.waimai.store.repository.deserializer.BaseModuleDescDeserializer.13
        }.getType()));
        b.put("drug_im", new a("pharmcist_entrance", new TypeToken<PharmcistEntrance>() { // from class: com.sankuai.waimai.store.repository.deserializer.BaseModuleDescDeserializer.2
        }.getType()));
        b.put("nearby_businesses", new a("", new TypeToken<MerchantPoiList>() { // from class: com.sankuai.waimai.store.repository.deserializer.BaseModuleDescDeserializer.3
        }.getType()));
        b.put("search_tips", new a("", new TypeToken<RecommendSearchResponse>() { // from class: com.sankuai.waimai.store.repository.deserializer.BaseModuleDescDeserializer.4
        }.getType()));
        b.put("native_flower_location", new a("", new TypeToken<String>() { // from class: com.sankuai.waimai.store.repository.deserializer.BaseModuleDescDeserializer.5
        }.getType()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.gson.JsonDeserializer
    /* renamed from: a */
    public BaseModuleDesc deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        a aVar;
        Object[] objArr = {jsonElement, type, jsonDeserializationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2708348225e764093801ccb994aec59e", RobustBitConfig.DEFAULT_VALUE)) {
            return (BaseModuleDesc) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2708348225e764093801ccb994aec59e");
        }
        if (jsonElement.isJsonObject()) {
            try {
                BaseModuleDesc baseModuleDesc = (BaseModuleDesc) i.a().fromJson(jsonElement, type);
                Object[] objArr2 = {baseModuleDesc};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3cf0c28ae42d6853fec46adf18af7fda", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3cf0c28ae42d6853fec46adf18af7fda");
                } else if (baseModuleDesc != null && (aVar = b.get(baseModuleDesc.nativeId)) != null) {
                    Map<String, Object> map = baseModuleDesc.jsonData;
                    if (TextUtils.isEmpty(aVar.a)) {
                        baseModuleDesc.bizJsonData = i.a(i.a(map), aVar.b);
                    } else {
                        baseModuleDesc.bizJsonData = i.a(i.a(map.get(aVar.a)), aVar.b);
                    }
                }
                return baseModuleDesc;
            } catch (Exception e) {
                com.sankuai.waimai.store.base.log.a.a(e);
                return null;
            }
        }
        return null;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public String a;
        public Type b;

        public a(String str, Type type) {
            this.a = str;
            this.b = type;
        }
    }
}
