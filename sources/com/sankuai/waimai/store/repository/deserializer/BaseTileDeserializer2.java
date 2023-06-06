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
import com.sankuai.waimai.store.repository.model.SimpleTile;
import com.sankuai.waimai.store.util.i;
import java.lang.reflect.Type;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class BaseTileDeserializer2 implements JsonDeserializer<SimpleTile<BaseModuleDesc>> {
    public static ChangeQuickRedirect a;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.gson.JsonDeserializer
    /* renamed from: a */
    public SimpleTile<BaseModuleDesc> deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        Object[] objArr = {jsonElement, type, jsonDeserializationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0123640a4cdf4da0e435c1df04c247f", RobustBitConfig.DEFAULT_VALUE)) {
            return (SimpleTile) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0123640a4cdf4da0e435c1df04c247f");
        }
        if (jsonElement.isJsonObject()) {
            try {
                SimpleTile<BaseModuleDesc> simpleTile = (SimpleTile) i.a().fromJson(jsonElement, type);
                Object[] objArr2 = {simpleTile};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "38d802e2060c1e1caa3bdd83c020b2a3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "38d802e2060c1e1caa3bdd83c020b2a3");
                } else if (simpleTile != null && simpleTile.data != null) {
                    simpleTile.data.moduleId = simpleTile.sType.replaceAll("sm_type_home_", "");
                    simpleTile.data.nativeId = simpleTile.sType.replaceAll("sm_type_home_", "");
                    if (TextUtils.isEmpty(simpleTile.data.templateId) && !TextUtils.isEmpty(simpleTile.sourceId)) {
                        simpleTile.data.templateId = simpleTile.sourceId;
                    }
                    if (simpleTile.layoutInfo != null) {
                        simpleTile.data.layoutInfo = new BaseModuleDesc.a();
                        simpleTile.data.layoutInfo.a = simpleTile.layoutInfo.top;
                        simpleTile.data.layoutInfo.b = simpleTile.layoutInfo.bottom;
                        simpleTile.data.layoutInfo.c = simpleTile.layoutInfo.left;
                        simpleTile.data.layoutInfo.d = simpleTile.layoutInfo.right;
                        simpleTile.data.layoutInfo.e = simpleTile.layoutInfo.borderTopLeftRadius;
                        simpleTile.data.layoutInfo.f = simpleTile.layoutInfo.borderTopRightRadius;
                        simpleTile.data.layoutInfo.g = simpleTile.layoutInfo.borderBottomLeftRadius;
                        simpleTile.data.layoutInfo.h = simpleTile.layoutInfo.borderBottomRightRadius;
                        simpleTile.data.layoutInfo.i = simpleTile.layoutInfo.paddingTop;
                        simpleTile.data.layoutInfo.j = simpleTile.layoutInfo.paddingBottom;
                        simpleTile.data.layoutInfo.k = simpleTile.layoutInfo.paddingLeft;
                        simpleTile.data.layoutInfo.l = simpleTile.layoutInfo.paddingRight;
                    }
                    BaseModuleDescDeserializer.a aVar = BaseModuleDescDeserializer.b.get(simpleTile.data.nativeId);
                    if (aVar != null) {
                        Map<String, Object> map = simpleTile.data.jsonData;
                        if (TextUtils.isEmpty(aVar.a)) {
                            simpleTile.data.bizJsonData = i.a(i.a(map), aVar.b);
                        } else {
                            simpleTile.data.bizJsonData = i.a(i.a(map.get(aVar.a)), aVar.b);
                        }
                    }
                }
                return simpleTile;
            } catch (Exception e) {
                a.a(e);
                return null;
            }
        }
        return null;
    }
}
