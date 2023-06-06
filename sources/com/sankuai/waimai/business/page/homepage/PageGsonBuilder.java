package com.sankuai.waimai.business.page.homepage;

import com.google.gson.GsonBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.upload.LocationUploadResponse;
import com.sankuai.waimai.business.page.homepage.model.LastOrderStatus;
import com.sankuai.waimai.platform.capacity.network.gsonbuilder.AbstractGsonBuilder;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PageGsonBuilder extends AbstractGsonBuilder {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.platform.capacity.network.gsonbuilder.AbstractGsonBuilder
    public void registerWmApiProviderTypeAdapter(GsonBuilder gsonBuilder) {
        Object[] objArr = {gsonBuilder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "400502b2d4c17a55f5359b35b2b80828", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "400502b2d4c17a55f5359b35b2b80828");
            return;
        }
        super.registerWmApiProviderTypeAdapter(gsonBuilder);
        gsonBuilder.registerTypeAdapter(LastOrderStatus.class, new LastOrderStatus.Deserializer()).registerTypeAdapter(LocationUploadResponse.class, new LocationUploadResponse.LocationUploadDeserializer());
    }
}
