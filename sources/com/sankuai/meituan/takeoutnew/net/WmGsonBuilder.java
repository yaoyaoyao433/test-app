package com.sankuai.meituan.takeoutnew.net;

import com.google.gson.GsonBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.net.response.LoadInfoResponse;
import com.sankuai.meituan.takeoutnew.net.response.StartPictureResponse;
import com.sankuai.waimai.platform.capacity.abtest.ABTestExpStrategyResponse;
import com.sankuai.waimai.platform.capacity.network.gsonbuilder.AbstractGsonBuilder;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WmGsonBuilder extends AbstractGsonBuilder {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.platform.capacity.network.gsonbuilder.AbstractGsonBuilder
    public void registerWmApiProviderTypeAdapter(GsonBuilder gsonBuilder) {
        Object[] objArr = {gsonBuilder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e22c197ad33a98e0121ebefb36ff7cc3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e22c197ad33a98e0121ebefb36ff7cc3");
        } else {
            gsonBuilder.registerTypeAdapter(ABTestExpStrategyResponse.class, new ABTestExpStrategyResponse.Deserializer()).registerTypeAdapter(LoadInfoResponse.class, new LoadInfoResponse.Deserializer()).registerTypeAdapter(StartPictureResponse.class, new StartPictureResponse.Deserializer());
        }
    }
}
