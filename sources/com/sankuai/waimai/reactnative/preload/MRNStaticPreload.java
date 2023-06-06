package com.sankuai.waimai.reactnative.preload;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.huawei.hms.actions.SearchIntents;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.http.FieldMap;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.GET;
import com.sankuai.meituan.retrofit2.http.HeaderMap;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.meituan.retrofit2.http.QueryMap;
import com.sankuai.meituan.retrofit2.http.Url;
import com.sankuai.meituan.retrofit2.t;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.foundation.utils.k;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.preload.PreloadRunnable;
import com.tencent.smtt.sdk.TbsVideoCacheTask;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import rx.d;
import rx.functions.g;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class MRNStaticPreload implements PreloadRunnable<String> {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface CustomPreloadService {
        @GET
        d<Response<JsonElement>> get(@Url String str, @HeaderMap Map<String, String> map, @QueryMap Map<String, String> map2);

        @POST
        @FormUrlEncoded
        d<Response<JsonElement>> post(@Url String str, @HeaderMap Map<String, String> map, @QueryMap Map<String, String> map2, @FieldMap Map<String, String> map3);
    }

    public static /* synthetic */ void a(MRNStaticPreload mRNStaticPreload, final String str, boolean z, final com.sankuai.waimai.platform.preload.d dVar) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, mRNStaticPreload, changeQuickRedirect, false, "b1f752adf3b9092b8363ef92a7d720c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, mRNStaticPreload, changeQuickRedirect, false, "b1f752adf3b9092b8363ef92a7d720c3");
        } else if (z) {
            ad.c(new Runnable() { // from class: com.sankuai.waimai.reactnative.preload.MRNStaticPreload.7
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "36f0caa48b4103fb5c7670d586d8834e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "36f0caa48b4103fb5c7670d586d8834e");
                        return;
                    }
                    com.sankuai.waimai.foundation.utils.log.a.c("MRNPreloadManager", "update result for %s", str);
                    dVar.b(str);
                }
            });
        } else {
            com.sankuai.waimai.foundation.utils.log.a.c("MRNPreloadManager", "finish result for %s", str);
            dVar.a(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        @SerializedName("name")
        public String b;
        @SerializedName(NetLogConstants.Details.PROTOCOL)
        public String c;
        @SerializedName("host")
        public String d;
        @SerializedName("path")
        public String e;
        @SerializedName("method")
        public String f;
        @SerializedName(TbsVideoCacheTask.KEY_VIDEO_CACHE_PARAM_HEADER)
        public Map<String, String> g;
        @SerializedName(SearchIntents.EXTRA_QUERY)
        public Map<String, String> h;
        @SerializedName("data")
        public Map<String, String> i;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "121dacd996f7d65225af9d93e069bf1f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "121dacd996f7d65225af9d93e069bf1f");
            } else {
                this.c = "https";
            }
        }

        public final String a() {
            return this.b != null ? this.b : this.e;
        }
    }

    @Override // com.sankuai.waimai.platform.preload.PreloadRunnable
    public final void run(Bundle bundle, Uri uri, final com.sankuai.waimai.platform.preload.d<String> dVar) {
        List<a> list;
        final a aVar;
        d<Response<JsonElement>> dVar2;
        boolean z;
        int i = 1;
        Object[] objArr = {bundle, uri, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15b4f87bd2cd784d86fb0d858eacebac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15b4f87bd2cd784d86fb0d858eacebac");
            return;
        }
        String queryParameter = uri.getQueryParameter("preloadParams");
        if (TextUtils.isEmpty(queryParameter)) {
            dVar.cancel();
            return;
        }
        try {
            list = (List) k.a().fromJson(queryParameter, new TypeToken<List<a>>() { // from class: com.sankuai.waimai.reactnative.preload.MRNStaticPreload.1
            }.getType());
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.b(e);
            list = null;
        }
        if (list == null) {
            dVar.cancel();
            return;
        }
        final ArrayList arrayList = new ArrayList(list.size());
        for (a aVar2 : list) {
            Object[] objArr2 = new Object[i];
            objArr2[0] = aVar2;
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c53de933bcba74fda08a2cc8f7c761be", RobustBitConfig.DEFAULT_VALUE)) {
                dVar2 = (d) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c53de933bcba74fda08a2cc8f7c761be");
                aVar = aVar2;
            } else {
                if (aVar2 != null) {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a.a;
                    aVar = aVar2;
                    if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "08165d352c9edcc9351f4c70a4d341c9", RobustBitConfig.DEFAULT_VALUE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "08165d352c9edcc9351f4c70a4d341c9")).booleanValue();
                    } else {
                        z = (!TextUtils.isEmpty(aVar.d) && !TextUtils.isEmpty(aVar.e) && !TextUtils.isEmpty(aVar.f) && !TextUtils.isEmpty(aVar.c)) && (aVar.d.endsWith("meituan.com") || aVar.d.endsWith("sankuai.com"));
                    }
                    if (z) {
                        t.a c = new t.a().a(aVar.c).b(aVar.d).c(aVar.e);
                        if ("GET".equalsIgnoreCase(aVar.f)) {
                            dVar2 = ((CustomPreloadService) b.a((Class<Object>) CustomPreloadService.class)).get(c.b().toString(), aVar.g, aVar.h);
                        } else if ("POST".equalsIgnoreCase(aVar.f)) {
                            dVar2 = ((CustomPreloadService) b.a((Class<Object>) CustomPreloadService.class)).post(c.b().toString(), aVar.g, aVar.h, aVar.i);
                        } else {
                            com.sankuai.waimai.foundation.utils.log.a.b(new IllegalStateException("illegal request method for MRNStaticPreload: " + aVar.f));
                        }
                    }
                } else {
                    aVar = aVar2;
                }
                dVar2 = null;
            }
            if (dVar2 != null) {
                arrayList.add(dVar2.b(rx.schedulers.a.e()).d(new g<Response<JsonElement>, JsonObject>() { // from class: com.sankuai.waimai.reactnative.preload.MRNStaticPreload.3
                    public static ChangeQuickRedirect a;

                    @Override // rx.functions.g
                    public final /* synthetic */ JsonObject call(Response<JsonElement> response) {
                        Response<JsonElement> response2 = response;
                        Object[] objArr4 = {response2};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "6fdcc1d7437d66bcfb0973308e6a0f09", RobustBitConfig.DEFAULT_VALUE)) {
                            return (JsonObject) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "6fdcc1d7437d66bcfb0973308e6a0f09");
                        }
                        JsonObject jsonObject = new JsonObject();
                        jsonObject.add(aVar.a(), response2.e());
                        com.sankuai.waimai.foundation.utils.log.a.c("MRNPreloadManager", "api success for %s", aVar.a());
                        MRNStaticPreload.a(MRNStaticPreload.this, jsonObject.toString(), arrayList.size() > 1, dVar);
                        return jsonObject;
                    }
                }).f(new g<Throwable, JsonObject>() { // from class: com.sankuai.waimai.reactnative.preload.MRNStaticPreload.2
                    public static ChangeQuickRedirect a;

                    @Override // rx.functions.g
                    public final /* synthetic */ JsonObject call(Throwable th) {
                        Object[] objArr4 = {th};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a52b0639731155d112f0ec3893c3ecf9", RobustBitConfig.DEFAULT_VALUE)) {
                            return (JsonObject) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a52b0639731155d112f0ec3893c3ecf9");
                        }
                        JsonObject jsonObject = new JsonObject();
                        jsonObject.add(aVar.a(), null);
                        com.sankuai.waimai.foundation.utils.log.a.c("MRNPreloadManager", "api failed for %s", aVar.a());
                        MRNStaticPreload.a(MRNStaticPreload.this, jsonObject.toString(), arrayList.size() > 1, dVar);
                        return jsonObject;
                    }
                }));
            }
            i = 1;
        }
        if (arrayList.isEmpty()) {
            dVar.cancel();
            return;
        }
        rx.functions.b<JsonObject> bVar = new rx.functions.b<JsonObject>() { // from class: com.sankuai.waimai.reactnative.preload.MRNStaticPreload.4
            public static ChangeQuickRedirect a;

            @Override // rx.functions.b
            public final /* synthetic */ void call(JsonObject jsonObject) {
                final JsonObject jsonObject2 = jsonObject;
                Object[] objArr4 = {jsonObject2};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "b081b7408e5566d494177c5ef3e7c570", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "b081b7408e5566d494177c5ef3e7c570");
                } else {
                    ad.c(new Runnable() { // from class: com.sankuai.waimai.reactnative.preload.MRNStaticPreload.4.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr5 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "af279ebd35c565c39937277ca4adcb68", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "af279ebd35c565c39937277ca4adcb68");
                                return;
                            }
                            com.sankuai.waimai.foundation.utils.log.a.c("MRNPreloadManager", "finish all result", new Object[0]);
                            dVar.a(jsonObject2.toString());
                        }
                    });
                }
            }
        };
        rx.functions.b<Throwable> bVar2 = new rx.functions.b<Throwable>() { // from class: com.sankuai.waimai.reactnative.preload.MRNStaticPreload.5
            public static ChangeQuickRedirect a;

            @Override // rx.functions.b
            public final /* synthetic */ void call(Throwable th) {
                Throwable th2 = th;
                Object[] objArr4 = {th2};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "6c545f51c5e02d56328aa549178b2c0c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "6c545f51c5e02d56328aa549178b2c0c");
                    return;
                }
                if (!(th2 instanceof IOException)) {
                    com.sankuai.waimai.foundation.utils.log.a.b(th2);
                }
                dVar.a(new JsonObject().toString());
            }
        };
        if (arrayList.size() > 1) {
            d.a((Iterable<? extends d<?>>) arrayList, new rx.functions.k<JsonObject>() { // from class: com.sankuai.waimai.reactnative.preload.MRNStaticPreload.6
                public static ChangeQuickRedirect a;

                @Override // rx.functions.k
                public final /* synthetic */ JsonObject call(Object[] objArr4) {
                    Object[] objArr5 = {objArr4};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect4, false, "467dd695f83a3b5c71eb899de27e1fc1", RobustBitConfig.DEFAULT_VALUE)) {
                        return (JsonObject) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect4, false, "467dd695f83a3b5c71eb899de27e1fc1");
                    }
                    JsonObject jsonObject = new JsonObject();
                    for (Object obj : objArr4) {
                        if (obj instanceof JsonObject) {
                            JsonObject jsonObject2 = (JsonObject) obj;
                            for (String str : jsonObject2.keySet()) {
                                jsonObject.add(str, jsonObject2.get(str));
                            }
                        }
                    }
                    com.sankuai.waimai.foundation.utils.log.a.c("MRNPreloadManager", "merged result", new Object[0]);
                    return jsonObject;
                }
            }).a(bVar, bVar2);
        } else {
            ((d) arrayList.get(0)).a(bVar, bVar2);
        }
    }
}
