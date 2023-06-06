package com.meituan.msc.modules.api.msi.api;

import android.content.SharedPreferences;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.meituan.msc.modules.api.msi.MSCApi;
import com.meituan.msc.modules.api.msi.api.InitialCacheApi;
import com.meituan.msc.modules.engine.h;
import com.meituan.msc.modules.page.render.webview.k;
import com.meituan.msc.modules.update.a;
import com.meituan.msi.annotations.MsiApiEnv;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.msi.bean.ContainerInfo;
import com.meituan.msi.bean.MsiContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@MsiApiEnv(name = ContainerInfo.ENV_MSC)
/* loaded from: classes3.dex */
public class InitialCacheApi extends MSCApi {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    @MsiSupport
    /* loaded from: classes3.dex */
    public static class InitialCacheParams {
        public static ChangeQuickRedirect changeQuickRedirect;
        public JsonElement cache;
        public String cacheTemplate;
        public String pageName;
    }

    @MsiApiMethod(name = "setInitialRenderingCache", request = InitialCacheParams.class)
    public void setInitialRenderingCache(final InitialCacheParams initialCacheParams, MsiContext msiContext) {
        Object[] objArr = {initialCacheParams, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e7a211d0fa8367d286e28fc484be933", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e7a211d0fa8367d286e28fc484be933");
        } else if (this.c.r.j(initialCacheParams.pageName) != a.EnumC0474a.DYNAMIC) {
            msiContext.onError("current renderingCacheState is not dynamic");
        } else {
            final h hVar = this.c;
            Object[] objArr2 = {initialCacheParams, hVar};
            ChangeQuickRedirect changeQuickRedirect2 = k.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "65c8039192985e09d8e3679a027bf5a8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "65c8039192985e09d8e3679a027bf5a8");
            } else {
                com.meituan.msc.common.executor.a.b.submit(new Runnable() { // from class: com.meituan.msc.modules.page.render.webview.k.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a0df4f1d52b2b6a21708519a2cd4dfd8", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a0df4f1d52b2b6a21708519a2cd4dfd8");
                            return;
                        }
                        InitialCacheApi.InitialCacheParams initialCacheParams2 = initialCacheParams;
                        com.meituan.msc.modules.update.f fVar = hVar.r;
                        boolean z = true;
                        Object[] objArr4 = {initialCacheParams2, fVar};
                        ChangeQuickRedirect changeQuickRedirect4 = k.a;
                        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "9551192a33de353fd39427bb17708682", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "9551192a33de353fd39427bb17708682");
                            return;
                        }
                        String str = initialCacheParams2.pageName;
                        JsonElement jsonElement = initialCacheParams2.cache;
                        Object[] objArr5 = {jsonElement, fVar, str};
                        ChangeQuickRedirect changeQuickRedirect5 = k.a;
                        if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "9c86c2b4f67511fd8232256374db21bc", RobustBitConfig.DEFAULT_VALUE)) {
                            z = ((Boolean) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "9c86c2b4f67511fd8232256374db21bc")).booleanValue();
                        } else {
                            String b = k.b(fVar, str);
                            SharedPreferences a2 = k.a(fVar.j());
                            if (jsonElement == null || jsonElement.isJsonNull()) {
                                com.meituan.msc.modules.reporter.g.b("RenderingCacheModule", "received null dynamic cache, clear cache");
                                a2.edit().remove(b).apply();
                            } else {
                                JsonObject jsonObject = (JsonObject) com.meituan.msc.common.utils.h.b.fromJson(k.a(a2, b, ""), (Class<Object>) JsonObject.class);
                                if (jsonObject == null || jsonObject.size() == 0) {
                                    com.meituan.msc.modules.reporter.g.b("RenderingCacheModule", "static cache is null, can not add dynamic cache");
                                } else {
                                    jsonObject.add("cache", jsonElement);
                                    k.b(fVar, str, jsonObject.toString());
                                    z = false;
                                }
                            }
                        }
                        if (z) {
                            return;
                        }
                        String str2 = initialCacheParams2.cacheTemplate;
                        k.a(fVar, str, str2 != null ? str2.toString() : null);
                        k.a(fVar);
                    }
                });
            }
            msiContext.onSuccess(null);
        }
    }
}
