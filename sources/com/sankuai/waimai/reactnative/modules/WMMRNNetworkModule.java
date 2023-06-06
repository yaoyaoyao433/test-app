package com.sankuai.waimai.reactnative.modules;

import android.app.Activity;
import android.support.annotation.Keep;
import android.text.TextUtils;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.reactnative.WmRNActivity;
import com.sankuai.waimai.reactnative.upload.e;
import com.sankuai.waimai.reactnative.upload.h;
import com.sankuai.waimai.reactnative.upload.j;
import com.sankuai.waimai.reactnative.upload.m;
import com.tencent.mapsdk.internal.jw;
import java.io.File;
import java.util.ArrayList;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class WMMRNNetworkModule extends ReactContextBaseJavaModule implements e {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final String DEFAULT_URL;
    private final String PARAMS_IMG_MAXPIXEL;
    private final String PARAMS_IMG_QUALITY;
    private final String PARAMS_KEY_LOCALIDS;
    private final String PARAMS_KEY_URL;
    private final String PERMISSION_TOKEN;
    private final String SCENE_TOKEN;
    private j mImageUploadManager;
    private ArrayList<Object> mImgList;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "WMMRNNetwork";
    }

    public WMMRNNetworkModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "beab4afa4339081ee0747d5130f6db8c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "beab4afa4339081ee0747d5130f6db8c");
            return;
        }
        this.PARAMS_KEY_LOCALIDS = "localIds";
        this.PERMISSION_TOKEN = "permissionToken";
        this.SCENE_TOKEN = "sceneToken";
        this.PARAMS_IMG_MAXPIXEL = "maxPixel";
        this.PARAMS_IMG_QUALITY = "compressionQuality";
        this.PARAMS_KEY_URL = "url";
        this.DEFAULT_URL = "";
        this.mImgList = new ArrayList<>();
        this.mImageUploadManager = j.a(reactApplicationContext);
        setupLifecycleEventListener(reactApplicationContext);
    }

    @ReactMethod
    public void isProductEnv(Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a850b1ab57f1446a6e4810f8b2d9fad9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a850b1ab57f1446a6e4810f8b2d9fad9");
            return;
        }
        try {
            WritableMap createMap = Arguments.createMap();
            createMap.putBoolean("isProductEnv", com.sankuai.waimai.platform.net.c.a().b());
            promise.resolve(createMap);
        } catch (Throwable unused) {
            promise.reject("", "");
        }
    }

    @ReactMethod
    public void getWMBackend(Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "35d4f9085c978b7bc6121dea5501bf31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "35d4f9085c978b7bc6121dea5501bf31");
            return;
        }
        try {
            promise.resolve(com.sankuai.waimai.platform.net.c.a().e());
        } catch (Throwable unused) {
            promise.reject("", "");
        }
    }

    @ReactMethod
    public void uploadLocalImage(ReadableMap readableMap, Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6d2c7ec6f493463e493562f648107090", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6d2c7ec6f493463e493562f648107090");
            return;
        }
        String str = "";
        if (readableMap.hasKey("permissionToken")) {
            str = readableMap.getString("permissionToken");
        } else if (readableMap.hasKey("sceneToken")) {
            str = readableMap.getString("sceneToken");
        }
        if (TextUtils.isEmpty(str)) {
            str = "dj-d2865e42de07ebac";
        }
        if (readableMap.hasKey("localIds")) {
            this.mImageUploadManager.a(readableMap.hasKey("maxPixel") ? readableMap.getInt("maxPixel") : jw.h, readableMap.hasKey("compressionQuality") ? readableMap.getInt("compressionQuality") : 75);
            ReadableArray array = readableMap.getArray("localIds");
            if (array != null) {
                this.mImgList = array.toArrayList();
                if (com.sankuai.waimai.foundation.utils.b.a(this.mImgList)) {
                    j jVar = this.mImageUploadManager;
                    ArrayList<Object> arrayList = this.mImgList;
                    Object[] objArr2 = {arrayList, "", promise, this, str};
                    ChangeQuickRedirect changeQuickRedirect3 = j.a;
                    if (PatchProxy.isSupport(objArr2, jVar, changeQuickRedirect3, false, "52d4b1748ded5bb32407266c5cc515a4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, jVar, changeQuickRedirect3, false, "52d4b1748ded5bb32407266c5cc515a4");
                        return;
                    } else if (com.sankuai.waimai.foundation.utils.b.b(arrayList)) {
                        return;
                    } else {
                        jVar.a(TextUtils.isEmpty("") ? "v6/comment/picture/upload" : "");
                        jVar.h = this;
                        jVar.g = promise;
                        jVar.e.clear();
                        jVar.f.clear();
                        for (int i = 0; i < arrayList.size(); i++) {
                            Object obj = arrayList.get(i);
                            if (obj instanceof String) {
                                String str2 = (String) obj;
                                if (!aa.a(str2)) {
                                    File file = new File(str2);
                                    if (file.exists() && file.isFile()) {
                                        ArrayList<m> arrayList2 = jVar.f;
                                        m.a aVar = new m.a(i);
                                        aVar.c = str2;
                                        aVar.e = file.getAbsolutePath();
                                        arrayList2.add(aVar.a());
                                        h hVar = new h(file.getAbsolutePath());
                                        hVar.b = i;
                                        jVar.e.add(hVar);
                                    }
                                }
                            }
                        }
                        jVar.c.a(jVar.e);
                        return;
                    }
                }
                promise.reject("0", "localIds size 0");
                return;
            }
            promise.reject("0", "localIds size 0");
            return;
        }
        promise.reject("0", "localIds size 0");
    }

    @ReactMethod
    public void uploadImage(ReadableMap readableMap, Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2d98836a02f59eb28376d1b16991975a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2d98836a02f59eb28376d1b16991975a");
            return;
        }
        String str = "";
        if (readableMap.hasKey("permissionToken")) {
            str = readableMap.getString("permissionToken");
        } else if (readableMap.hasKey("sceneToken")) {
            str = readableMap.getString("sceneToken");
        }
        if (TextUtils.isEmpty(str)) {
            str = "dj-d2865e42de07ebac";
        }
        String str2 = str;
        if (readableMap.hasKey("localIds")) {
            this.mImageUploadManager.a(readableMap.hasKey("maxPixel") ? readableMap.getInt("maxPixel") : jw.h, readableMap.hasKey("compressionQuality") ? readableMap.getInt("compressionQuality") : 75);
            ReadableArray array = readableMap.getArray("localIds");
            if (array != null) {
                this.mImgList = array.toArrayList();
                if (this.mImgList != null && !this.mImgList.isEmpty()) {
                    if (readableMap.hasKey("url")) {
                        this.mImageUploadManager.a(this.mImgList, readableMap.getString("url"), promise, this, str2);
                        return;
                    } else {
                        this.mImageUploadManager.a(this.mImgList, "", promise, this, str2);
                        return;
                    }
                }
                promise.reject("0", "localIds size 0");
                return;
            }
            promise.reject("0", "localIds size 0");
            return;
        }
        promise.reject("0", "localIds size 0");
    }

    private void setupLifecycleEventListener(final ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7fdcee6cb5366a912ac902ca9b59f126", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7fdcee6cb5366a912ac902ca9b59f126");
        } else {
            reactApplicationContext.addLifecycleEventListener(new LifecycleEventListener() { // from class: com.sankuai.waimai.reactnative.modules.WMMRNNetworkModule.1
                public static ChangeQuickRedirect a;

                @Override // com.facebook.react.bridge.LifecycleEventListener
                public final void onHostPause() {
                }

                @Override // com.facebook.react.bridge.LifecycleEventListener
                public final void onHostResume() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4401ed59c68b413f383e982eae33a8d9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4401ed59c68b413f383e982eae33a8d9");
                    } else if (WMMRNNetworkModule.this.mImageUploadManager != null) {
                        WMMRNNetworkModule.this.mImageUploadManager.d = false;
                    }
                }

                @Override // com.facebook.react.bridge.LifecycleEventListener
                public final void onHostDestroy() {
                    boolean z = false;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "63700b1b2f97c294e680cd5a24324e69", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "63700b1b2f97c294e680cd5a24324e69");
                        return;
                    }
                    Activity currentActivity = reactApplicationContext.getCurrentActivity();
                    if (currentActivity instanceof WmRNActivity) {
                        String m = ((WmRNActivity) currentActivity).m();
                        j jVar = WMMRNNetworkModule.this.mImageUploadManager;
                        Object[] objArr3 = {m};
                        ChangeQuickRedirect changeQuickRedirect4 = j.a;
                        if (PatchProxy.isSupport(objArr3, jVar, changeQuickRedirect4, false, "de1a4d21f437d9b338968971a71a4aee", RobustBitConfig.DEFAULT_VALUE)) {
                            z = ((Boolean) PatchProxy.accessDispatch(objArr3, jVar, changeQuickRedirect4, false, "de1a4d21f437d9b338968971a71a4aee")).booleanValue();
                        } else if (j.b != null) {
                            z = j.b.contains(m);
                        }
                        if (z || WMMRNNetworkModule.this.mImageUploadManager == null) {
                            return;
                        }
                        WMMRNNetworkModule.this.mImageUploadManager.d = true;
                        WMMRNNetworkModule.this.mImageUploadManager.a();
                    }
                }
            });
        }
    }

    @Override // com.sankuai.waimai.reactnative.upload.e
    public void sendEvent(String str, WritableMap writableMap) {
        Object[] objArr = {str, writableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "831f516af715811dfea057953bf18e72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "831f516af715811dfea057953bf18e72");
        } else {
            new com.sankuai.waimai.reactnative.utils.c(getReactApplicationContext()).a(str, writableMap);
        }
    }
}
