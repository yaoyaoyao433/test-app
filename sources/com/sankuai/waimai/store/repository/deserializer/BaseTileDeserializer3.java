package com.sankuai.waimai.store.repository.deserializer;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.log.a;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.repository.model.BaseTile;
import com.sankuai.waimai.store.repository.model.NavigationTileConfig;
import com.sankuai.waimai.store.util.i;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class BaseTileDeserializer3 implements JsonDeserializer<BaseTile<BaseModuleDesc, NavigationTileConfig>> {
    public static ChangeQuickRedirect a;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.gson.JsonDeserializer
    /* renamed from: a */
    public BaseTile<BaseModuleDesc, NavigationTileConfig> deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        Object[] objArr = {jsonElement, type, jsonDeserializationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2fcaed579617b1542395f64f04a78148", RobustBitConfig.DEFAULT_VALUE)) {
            return (BaseTile) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2fcaed579617b1542395f64f04a78148");
        }
        if (jsonElement.isJsonObject()) {
            try {
                BaseTile<BaseModuleDesc, NavigationTileConfig> baseTile = (BaseTile) i.a().fromJson(jsonElement, type);
                Object[] objArr2 = {baseTile, jsonElement};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "06c66444e8a7279f11d1706af0a17f3b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "06c66444e8a7279f11d1706af0a17f3b");
                } else if (baseTile != null && jsonElement != null) {
                    baseTile.jsonStr = jsonElement.toString();
                }
                return baseTile;
            } catch (Exception e) {
                a.a(e);
                return null;
            }
        }
        return null;
    }
}
