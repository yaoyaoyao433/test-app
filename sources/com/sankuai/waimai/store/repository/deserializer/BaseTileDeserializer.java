package com.sankuai.waimai.store.repository.deserializer;

import android.text.TextUtils;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.log.a;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.repository.deserializer.BaseModuleDescDeserializer;
import com.sankuai.waimai.store.repository.model.BaseTile;
import com.sankuai.waimai.store.repository.model.PoiChannelBackgroundConfig;
import com.sankuai.waimai.store.util.i;
import java.lang.reflect.Type;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class BaseTileDeserializer implements JsonDeserializer<BaseTile<BaseModuleDesc, PoiChannelBackgroundConfig>> {
    public static ChangeQuickRedirect a;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.gson.JsonDeserializer
    /* renamed from: a */
    public BaseTile<BaseModuleDesc, PoiChannelBackgroundConfig> deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        Object[] objArr = {jsonElement, type, jsonDeserializationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50a25cf0fea3c8eb6dc946c314ef94ca", RobustBitConfig.DEFAULT_VALUE)) {
            return (BaseTile) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50a25cf0fea3c8eb6dc946c314ef94ca");
        }
        if (jsonElement.isJsonObject()) {
            try {
                BaseTile<BaseModuleDesc, PoiChannelBackgroundConfig> baseTile = (BaseTile) i.a().fromJson(jsonElement, type);
                Object[] objArr2 = {baseTile};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "698b22099b66d5a88fe9d98cba49edf5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "698b22099b66d5a88fe9d98cba49edf5");
                } else if (baseTile != null && baseTile.data != null) {
                    baseTile.data.moduleId = baseTile.sType.replaceAll("sm_type_home_", "");
                    baseTile.data.nativeId = baseTile.sType.replaceAll("sm_type_home_", "");
                    if (baseTile.propsData != null) {
                        baseTile.data.moduleTitle = baseTile.propsData.moduleTitle;
                    }
                    if (TextUtils.isEmpty(baseTile.data.templateId) && !TextUtils.isEmpty(baseTile.sourceId)) {
                        baseTile.data.templateId = baseTile.sourceId;
                    }
                    if (baseTile.layoutInfo != null) {
                        baseTile.data.layoutInfo = new BaseModuleDesc.a();
                        baseTile.data.layoutInfo.a = baseTile.layoutInfo.top;
                        baseTile.data.layoutInfo.b = baseTile.layoutInfo.bottom;
                        baseTile.data.layoutInfo.c = baseTile.layoutInfo.left;
                        baseTile.data.layoutInfo.d = baseTile.layoutInfo.right;
                        baseTile.data.layoutInfo.e = baseTile.layoutInfo.borderTopLeftRadius;
                        baseTile.data.layoutInfo.f = baseTile.layoutInfo.borderTopRightRadius;
                        baseTile.data.layoutInfo.g = baseTile.layoutInfo.borderBottomLeftRadius;
                        baseTile.data.layoutInfo.h = baseTile.layoutInfo.borderBottomRightRadius;
                        baseTile.data.layoutInfo.i = baseTile.layoutInfo.paddingTop;
                        baseTile.data.layoutInfo.j = baseTile.layoutInfo.paddingBottom;
                        baseTile.data.layoutInfo.k = baseTile.layoutInfo.paddingLeft;
                        baseTile.data.layoutInfo.l = baseTile.layoutInfo.paddingRight;
                    }
                    BaseModuleDescDeserializer.a aVar = BaseModuleDescDeserializer.b.get(baseTile.data.nativeId);
                    if (aVar != null) {
                        Map<String, Object> map = baseTile.data.jsonData;
                        if (TextUtils.isEmpty(aVar.a)) {
                            baseTile.data.bizJsonData = i.a(i.a(map), aVar.b);
                        } else {
                            baseTile.data.bizJsonData = i.a(i.a(map.get(aVar.a)), aVar.b);
                        }
                    }
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
