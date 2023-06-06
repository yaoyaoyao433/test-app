package com.sankuai.waimai.reactnative.modules;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.unionid.oneid.OneIdHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ad;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WMRNIDGenerator extends ReactContextBaseJavaModule {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "WMRNIDGenerator";
    }

    public WMRNIDGenerator(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "105ab4b86601805592c6d35f547e95fd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "105ab4b86601805592c6d35f547e95fd");
        }
    }

    @ReactMethod
    public void getUnionID(final Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0dec8462a9e8fbccffff51b7e231446b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0dec8462a9e8fbccffff51b7e231446b");
        } else {
            ad.c(new Runnable() { // from class: com.sankuai.waimai.reactnative.modules.WMRNIDGenerator.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "edef2a0a0e42285ea386f8164a71195c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "edef2a0a0e42285ea386f8164a71195c");
                        return;
                    }
                    try {
                        String localOneId = OneIdHandler.getInstance(com.meituan.android.singleton.b.a).getLocalOneId();
                        Promise promise2 = promise;
                        if (localOneId == null) {
                            localOneId = "";
                        }
                        promise2.resolve(localOneId);
                    } catch (Exception e) {
                        promise.reject(e);
                    }
                }
            });
        }
    }

    @ReactMethod
    public void getSessionID(final Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7e39daca3cb555ff984954e22d0051ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7e39daca3cb555ff984954e22d0051ae");
        } else {
            ad.c(new Runnable() { // from class: com.sankuai.waimai.reactnative.modules.WMRNIDGenerator.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c667fd8b6211ccdf8667bb4e8fe5c11f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c667fd8b6211ccdf8667bb4e8fe5c11f");
                        return;
                    }
                    try {
                        String session = Statistics.getSession();
                        Promise promise2 = promise;
                        if (session == null) {
                            session = "";
                        }
                        promise2.resolve(session);
                    } catch (Exception e) {
                        promise.reject(e);
                    }
                }
            });
        }
    }

    @ReactMethod
    public void getListID(final Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4f568cabeba14f2346e65272aaff294e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4f568cabeba14f2346e65272aaff294e");
        } else {
            ad.c(new Runnable() { // from class: com.sankuai.waimai.reactnative.modules.WMRNIDGenerator.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3008ddf29f1d26e27c5a582f2d1a0bf6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3008ddf29f1d26e27c5a582f2d1a0bf6");
                        return;
                    }
                    try {
                        promise.resolve("");
                    } catch (Exception e) {
                        promise.reject(e);
                    }
                }
            });
        }
    }

    @ReactMethod
    public void getAllBoringIDs(final Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "51439cd015bbdee5370aaf1fd65e9585", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "51439cd015bbdee5370aaf1fd65e9585");
        } else {
            ad.c(new Runnable() { // from class: com.sankuai.waimai.reactnative.modules.WMRNIDGenerator.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ebd0185e92793dc17d89861853d7ba49", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ebd0185e92793dc17d89861853d7ba49");
                        return;
                    }
                    try {
                        String localOneId = OneIdHandler.getInstance(com.meituan.android.singleton.b.a).getLocalOneId();
                        String session = Statistics.getSession();
                        WritableMap createMap = Arguments.createMap();
                        if (localOneId == null) {
                            localOneId = "";
                        }
                        createMap.putString("unionID", localOneId);
                        if (session == null) {
                            session = "";
                        }
                        createMap.putString("sessionID", session);
                        createMap.putString("listID", "");
                        promise.resolve(createMap);
                    } catch (Exception e) {
                        promise.reject(e);
                    }
                }
            });
        }
    }
}
