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
import com.sankuai.waimai.store.repository.model.BaseTileNew;
import com.sankuai.waimai.store.util.i;
import java.lang.reflect.Type;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class BaseTileNewDeserializer implements JsonDeserializer<BaseTileNew<BaseModuleDesc, Object>> {
    public static ChangeQuickRedirect a;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.gson.JsonDeserializer
    /* renamed from: a */
    public BaseTileNew<BaseModuleDesc, Object> deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        Object[] objArr = {jsonElement, type, jsonDeserializationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ffe61794290c7a901ee6e57af03c85e", RobustBitConfig.DEFAULT_VALUE)) {
            return (BaseTileNew) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ffe61794290c7a901ee6e57af03c85e");
        }
        if (jsonElement.isJsonObject()) {
            try {
                BaseTileNew<BaseModuleDesc, Object> baseTileNew = (BaseTileNew) i.a().fromJson(jsonElement, type);
                Object[] objArr2 = {baseTileNew};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3b8c168239cac56b29c2d301f11917ee", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3b8c168239cac56b29c2d301f11917ee");
                } else if (baseTileNew != null && baseTileNew.data != null) {
                    baseTileNew.data.moduleId = baseTileNew.sType.replaceAll("sm_type_home_", "");
                    baseTileNew.data.nativeId = baseTileNew.sType.replaceAll("sm_type_home_", "");
                    if (baseTileNew.propsData != null) {
                        baseTileNew.data.moduleTitle = "";
                    }
                    if (TextUtils.isEmpty(baseTileNew.data.templateId) && !TextUtils.isEmpty(baseTileNew.sourceId)) {
                        baseTileNew.data.templateId = baseTileNew.sourceId;
                    }
                    if (baseTileNew.layoutInfo != null) {
                        baseTileNew.data.layoutInfo = new BaseModuleDesc.a();
                        baseTileNew.data.layoutInfo.a = baseTileNew.layoutInfo.top;
                        baseTileNew.data.layoutInfo.b = baseTileNew.layoutInfo.bottom;
                        baseTileNew.data.layoutInfo.c = baseTileNew.layoutInfo.left;
                        baseTileNew.data.layoutInfo.d = baseTileNew.layoutInfo.right;
                        baseTileNew.data.layoutInfo.e = baseTileNew.layoutInfo.borderTopLeftRadius;
                        baseTileNew.data.layoutInfo.f = baseTileNew.layoutInfo.borderTopRightRadius;
                        baseTileNew.data.layoutInfo.g = baseTileNew.layoutInfo.borderBottomLeftRadius;
                        baseTileNew.data.layoutInfo.h = baseTileNew.layoutInfo.borderBottomRightRadius;
                        baseTileNew.data.layoutInfo.i = baseTileNew.layoutInfo.paddingTop;
                        baseTileNew.data.layoutInfo.j = baseTileNew.layoutInfo.paddingBottom;
                        baseTileNew.data.layoutInfo.k = baseTileNew.layoutInfo.paddingLeft;
                        baseTileNew.data.layoutInfo.l = baseTileNew.layoutInfo.paddingRight;
                    }
                    BaseModuleDescDeserializer.a aVar = BaseModuleDescDeserializer.b.get(baseTileNew.data.nativeId);
                    if (aVar != null) {
                        Map<String, Object> map = baseTileNew.data.jsonData;
                        if (TextUtils.isEmpty(aVar.a)) {
                            baseTileNew.data.bizJsonData = i.a(i.a(map), aVar.b);
                        } else {
                            baseTileNew.data.bizJsonData = i.a(i.a(map.get(aVar.a)), aVar.b);
                        }
                    }
                }
                Object[] objArr3 = {baseTileNew, jsonElement};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3dfe5e0898b49c5005cee897288756d4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3dfe5e0898b49c5005cee897288756d4");
                } else if (baseTileNew != null && jsonElement != null) {
                    baseTileNew.jsonStr = jsonElement.toString();
                }
                return baseTileNew;
            } catch (Exception e) {
                a.a(e);
                return null;
            }
        }
        return null;
    }
}
