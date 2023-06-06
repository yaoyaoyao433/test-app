package com.sankuai.waimai.store.search.ui.result;

import android.content.Context;
import android.support.v4.util.SparseArrayCompat;
import com.sankuai.waimai.mach.ITagProcessor;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface ISearchTemplateProvider {
    public static final String ROUTER_SERVICE_KEY_DRUG_SEARCH = "DrugSearchTemplateProvider";
    public static final String ROUTER_SERVICE_KEY_STORE_SEARCH = "StoreSearchTemplateProvider";

    Map<String, Class<?>> provideDeserializeModels();

    com.sankuai.waimai.store.search.adapterdelegates.b provideMachAdapterDelegate(Context context, b bVar);

    Map<String, com.sankuai.waimai.store.search.ui.result.mach.prerender.a> provideMachPreRenderActions();

    SparseArrayCompat<com.sankuai.waimai.store.search.adapterdelegates.b> provideNativeTemplates(Context context, String str, b bVar);

    Set<String> provideWaterfallTemplateId();

    SparseArrayCompat<ITagProcessor> providerMachComponentProcessor();

    com.sankuai.waimai.mach.render.b providerMachRenderEngine();
}
