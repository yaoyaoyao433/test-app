package com.sankuai.meituan.mapsdk.api;

import android.content.Context;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import com.meituan.mtmap.rendersdk.HttpCallback;
import com.meituan.mtmap.rendersdk.InnerInitializer;
import com.meituan.mtmap.rendersdk.NativeMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapfoundation.storage.StorageCleaner;
import com.sankuai.meituan.mapsdk.api.module.http.a;
import com.sankuai.meituan.mapsdk.api.module.http.b;
import com.sankuai.meituan.mapsdk.core.utils.c;
import com.sankuai.meituan.mapsdk.mapcore.net.e;
import com.sankuai.meituan.mapsdk.mapcore.report.f;
import java.lang.ref.SoftReference;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class MapInitializer {
    private static final String LIB_NAME = "mtmap";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static boolean isRegistered;
    public static boolean loaded;
    private static MapInitializer mapInitializer;
    private static c mapRenderLog;
    private static volatile SoftReference<a> onRenderResponseSoftReference;
    private static volatile boolean realInitFlag;

    static {
        load();
        realInitFlag = false;
        isRegistered = false;
    }

    public static synchronized void initMapSDK(@NonNull Context context) {
        synchronized (MapInitializer.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "71ed7b3e444412f16feea36349d835cf", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "71ed7b3e444412f16feea36349d835cf");
                return;
            }
            if (mapInitializer == null) {
                mapInitializer = new MapInitializer();
                InnerInitializer.initInnerSDK(context);
                e.a(context);
                InnerInitializer.setHttpRequestInject(new HttpCallback.HttpRequestInject() { // from class: com.sankuai.meituan.mapsdk.api.MapInitializer.1
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.mtmap.rendersdk.HttpCallback.HttpRequestInject
                    public final HttpCallback.HttpRequest getHttpRequest() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "211286377bbf7a738f4bff864fa643fe", RobustBitConfig.DEFAULT_VALUE) ? (HttpCallback.HttpRequest) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "211286377bbf7a738f4bff864fa643fe") : new b();
                    }
                });
            }
            if (!loaded) {
                load();
            }
            InnerInitializer.setSoLoaded(loaded);
            if (loaded && !realInitFlag) {
                realInitMapSDK();
            }
            registerMapStorageListener();
        }
    }

    public static synchronized void realInitMapSDK() {
        synchronized (MapInitializer.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6f6e8f42eacd4227e990beaa85e77c3c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6f6e8f42eacd4227e990beaa85e77c3c");
                return;
            }
            if (loaded && mapInitializer != null) {
                realInitFlag = true;
                HttpCallback.setOnHttpResponse(new HttpCallback.OnHttpResponse() { // from class: com.sankuai.meituan.mapsdk.api.MapInitializer.2
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.mtmap.rendersdk.HttpCallback.OnHttpResponse
                    public final void onTileResponse(boolean z) {
                        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6f4c72123733bb84aa533fe5088c5d61", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6f4c72123733bb84aa533fe5088c5d61");
                        } else if (MapInitializer.onRenderResponseSoftReference != null) {
                            MapInitializer.onRenderResponseSoftReference.get();
                        }
                    }
                });
                mapRenderLog = new c();
            }
        }
    }

    public static synchronized void load() {
        synchronized (MapInitializer.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            boolean z = true;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5946b26c834ea7a31e921527b44ce39a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5946b26c834ea7a31e921527b44ce39a");
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
            } catch (UnsatisfiedLinkError e) {
                loaded = false;
                com.sankuai.meituan.mapsdk.mapcore.utils.c.f("Failed to load native shared library." + e.getLocalizedMessage());
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                hashMap.put("status", "0");
                hashMap2.put("MTMapEngineLoadStatus", Float.valueOf(0.0f));
                f.a(hashMap, hashMap2);
            }
            if (!loaded) {
                if (!com.sankuai.meituan.mapfoundation.soloader.a.a(LIB_NAME) || !NativeMap.isSoLoaded()) {
                    z = false;
                }
                loaded = z;
                InnerInitializer.setSoLoaded(z);
                if (loaded) {
                    realInitMapSDK();
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    HashMap hashMap3 = new HashMap();
                    HashMap hashMap4 = new HashMap();
                    hashMap3.put("status", "1");
                    hashMap4.put("MTMapEngineLoadTime", Float.valueOf((float) elapsedRealtime2));
                    hashMap4.put("MTMapEngineLoadStatus", Float.valueOf(1.0f));
                    f.a(hashMap3, hashMap4);
                    return;
                }
                com.sankuai.meituan.mapsdk.mapcore.utils.c.f(" so load failed!!");
                if (!com.sankuai.meituan.mapfoundation.soloader.a.b) {
                    HashMap hashMap5 = new HashMap();
                    HashMap hashMap6 = new HashMap();
                    hashMap5.put("status", "0");
                    hashMap6.put("MTMapEngineLoadStatus", Float.valueOf(0.0f));
                    f.a(hashMap5, hashMap6);
                }
            }
        }
    }

    private static void registerMapStorageListener() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "49624218994856bc517680541b1d85c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "49624218994856bc517680541b1d85c8");
        } else if (isRegistered) {
        } else {
            StorageCleaner.addEventListener("map_sdk", new com.sankuai.meituan.mapsdk.core.storage.a());
            isRegistered = true;
        }
    }

    public static void setOnRenderResponse(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "970cfc1e0540cff64af7b3b44fea6380", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "970cfc1e0540cff64af7b3b44fea6380");
            return;
        }
        if (aVar == null) {
            onRenderResponseSoftReference = null;
        }
        onRenderResponseSoftReference = new SoftReference<>(aVar);
    }

    public static boolean mapCanBeUsed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5b29b626e5155bf2ca2ce358c0292c49", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5b29b626e5155bf2ca2ce358c0292c49")).booleanValue();
        }
        if (!loaded) {
            load();
        }
        return loaded;
    }
}
