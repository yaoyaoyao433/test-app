package com.meituan.passport.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import com.meituan.passport.k;
import com.meituan.passport.pojo.CustomServiceUrl;
import com.meituan.passport.utils.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.converter.gson.a;
import com.sankuai.meituan.retrofit2.i;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class CustomServiceApiFactory extends AbsApiFactory<CustomServiceApi> {
    private static final String CUSTOM_PROD_URL = "https://kf.dianping.com/";
    private static final String CUSTOM_TEST_URL = "https://kf.51ping.com/";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static CustomServiceApiFactory instance;

    @Override // com.meituan.passport.api.AbsApiFactory
    public String getBaseUrl(int i) {
        return i != 3 ? CUSTOM_PROD_URL : CUSTOM_TEST_URL;
    }

    public static CustomServiceApiFactory getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bc1d1020d52bbc958358c4d5a9892026", RobustBitConfig.DEFAULT_VALUE)) {
            return (CustomServiceApiFactory) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bc1d1020d52bbc958358c4d5a9892026");
        }
        if (instance == null) {
            instance = new CustomServiceApiFactory();
        }
        return instance;
    }

    @Override // com.meituan.passport.api.AbsApiFactory
    public Class<CustomServiceApi> getApiClass() {
        return CustomServiceApi.class;
    }

    @Override // com.meituan.passport.api.AbsApiFactory
    public i.a converter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f051116a71042a3d36530660890e3687", RobustBitConfig.DEFAULT_VALUE) ? (i.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f051116a71042a3d36530660890e3687") : a.a(getGson());
    }

    public static Gson getGson() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "50f58dcb15d733f650a9155810b72d51", RobustBitConfig.DEFAULT_VALUE)) {
            return (Gson) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "50f58dcb15d733f650a9155810b72d51");
        }
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(CustomServiceUrl.class, new CustomServiceUrlDeserializer());
        return gsonBuilder.create();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class CustomServiceUrlDeserializer implements JsonDeserializer<CustomServiceUrl> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public CustomServiceUrlDeserializer() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.JsonDeserializer
        public CustomServiceUrl deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            Object[] objArr = {jsonElement, type, jsonDeserializationContext};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "609a50cf207532af5f8da4afe51423f2", RobustBitConfig.DEFAULT_VALUE)) {
                return (CustomServiceUrl) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "609a50cf207532af5f8da4afe51423f2");
            }
            try {
                return (CustomServiceUrl) k.a().b().fromJson(jsonElement, new TypeToken<CustomServiceUrl>() { // from class: com.meituan.passport.api.CustomServiceApiFactory.CustomServiceUrlDeserializer.1
                    public static ChangeQuickRedirect changeQuickRedirect;
                }.getType());
            } catch (Exception e) {
                m.a(e);
                return null;
            }
        }
    }
}
