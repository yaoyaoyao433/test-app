package com.sankuai.waimai.store.repository.deserializer;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.log.a;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import com.sankuai.waimai.store.util.i;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class BaseTileDeserializer4 implements JsonDeserializer<PoiVerticalityDataResponse.PageConfig> {
    public static ChangeQuickRedirect a;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.gson.JsonDeserializer
    /* renamed from: a */
    public PoiVerticalityDataResponse.PageConfig deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        Object[] objArr = {jsonElement, type, jsonDeserializationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33616e31c5c3c7054eecc99b450a65a7", RobustBitConfig.DEFAULT_VALUE)) {
            return (PoiVerticalityDataResponse.PageConfig) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33616e31c5c3c7054eecc99b450a65a7");
        }
        if (jsonElement.isJsonObject()) {
            try {
                PoiVerticalityDataResponse.PageConfig pageConfig = (PoiVerticalityDataResponse.PageConfig) i.a().fromJson(jsonElement, type);
                Object[] objArr2 = {pageConfig, jsonElement};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4b5bb906971aca8bbd3eeb15f48c4cb3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4b5bb906971aca8bbd3eeb15f48c4cb3");
                } else if (pageConfig != null && jsonElement != null) {
                    pageConfig.jsonStr = jsonElement.toString();
                }
                return pageConfig;
            } catch (Exception e) {
                a.a(e);
                return null;
            }
        }
        return null;
    }
}
