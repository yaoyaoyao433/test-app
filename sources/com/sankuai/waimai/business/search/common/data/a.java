package com.sankuai.waimai.business.search.common.data;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.search.common.util.m;
import com.sankuai.waimai.business.search.datatype.ForbiddenInfo;
import com.sankuai.waimai.business.search.datatype.RecommendPoiListTitle;
import com.sankuai.waimai.business.search.model.GlobalPageResponse;
import com.sankuai.waimai.business.search.model.OasisModule;
import com.sankuai.waimai.business.search.model.f;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static com.sankuai.waimai.business.search.model.c b = new com.sankuai.waimai.business.search.model.c(new f());

    public static ForbiddenInfo a(GlobalPageResponse globalPageResponse) {
        Object[] objArr = {globalPageResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "702ea7acc2f686a438e2c7824438d9ed", RobustBitConfig.DEFAULT_VALUE)) {
            return (ForbiddenInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "702ea7acc2f686a438e2c7824438d9ed");
        }
        if (globalPageResponse == null || com.sankuai.waimai.foundation.utils.d.a(globalPageResponse.moduleList)) {
            return null;
        }
        for (OasisModule oasisModule : globalPageResponse.moduleList) {
            if (oasisModule != null && "wm_search_forbidden".equals(oasisModule.nativeTemplateId) && !TextUtils.isEmpty(oasisModule.stringData)) {
                Serializable a2 = b.a(oasisModule.nativeTemplateId, oasisModule.stringData);
                if (a2 instanceof ForbiddenInfo) {
                    return (ForbiddenInfo) a2;
                }
            }
        }
        return null;
    }

    @Nullable
    public static Serializable a(OasisModule oasisModule) {
        Serializable serializable;
        Object[] objArr = {oasisModule};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7e79c9e00e1b54fbeb36616f7e6e1e60", RobustBitConfig.DEFAULT_VALUE)) {
            return (Serializable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7e79c9e00e1b54fbeb36616f7e6e1e60");
        }
        Object[] objArr2 = {oasisModule};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c6bbb569cd9e2ac9e2b0e56aa90e5ee7", RobustBitConfig.DEFAULT_VALUE)) {
            serializable = (Serializable) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c6bbb569cd9e2ac9e2b0e56aa90e5ee7");
        } else if (oasisModule == null || TextUtils.isEmpty(oasisModule.nativeTemplateId) || TextUtils.isEmpty(oasisModule.stringData)) {
            m.a("NewVersionApiDataHelper", "purelyGetNativeModule, module is null");
            serializable = null;
        } else {
            serializable = b.a(oasisModule.nativeTemplateId, oasisModule.stringData);
        }
        if (serializable == null) {
            return null;
        }
        if (serializable instanceof RecommendPoiListTitle) {
            com.sankuai.waimai.business.search.datatype.b bVar = new com.sankuai.waimai.business.search.datatype.b();
            RecommendPoiListTitle recommendPoiListTitle = (RecommendPoiListTitle) serializable;
            bVar.a = recommendPoiListTitle.recommendContext;
            bVar.b = recommendPoiListTitle.recommendSubContext;
            return bVar;
        }
        return serializable;
    }

    @Nullable
    public static Serializable b(OasisModule oasisModule) {
        Object[] objArr = {oasisModule};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ff03cc3ce1a493e433e7a65bb44748d0", RobustBitConfig.DEFAULT_VALUE)) {
            return (Serializable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ff03cc3ce1a493e433e7a65bb44748d0");
        }
        if (oasisModule == null || TextUtils.isEmpty(oasisModule.machTemplateId) || TextUtils.isEmpty(oasisModule.stringData)) {
            m.a("NewVersionApiDataHelper", "getNativeModelByMachTemplateId, module is null");
            return null;
        }
        return b.a(oasisModule.machTemplateId, oasisModule.stringData);
    }

    @Nullable
    public static Serializable c(OasisModule oasisModule) {
        Object[] objArr = {oasisModule};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c5f4b9dc848900a2b44bcb396ff14764", RobustBitConfig.DEFAULT_VALUE)) {
            return (Serializable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c5f4b9dc848900a2b44bcb396ff14764");
        }
        if (oasisModule == null || TextUtils.isEmpty(oasisModule.moduleId) || TextUtils.isEmpty(oasisModule.stringData)) {
            m.a("NewVersionApiDataHelper", "getNativeModelByMachTemplateId, module is null");
            return null;
        }
        return b.a(oasisModule.moduleId, oasisModule.stringData);
    }
}
