package com.sankuai.waimai.reactnative.modules;

import android.text.TextUtils;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.location.v2.WmAddress;
import com.sankuai.waimai.foundation.location.v2.g;
import com.sankuai.waimai.foundation.utils.ad;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WMRNLocationManager extends ReactContextBaseJavaModule {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "WMRNLocationManager";
    }

    public WMRNLocationManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9730b568b213757a5d1e2a3680925dfc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9730b568b213757a5d1e2a3680925dfc");
        }
    }

    @ReactMethod
    public void getCurrentLocation(final Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "07bedb479c5329e0b693b3378dd3021a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "07bedb479c5329e0b693b3378dd3021a");
        } else {
            ad.c(new Runnable() { // from class: com.sankuai.waimai.reactnative.modules.WMRNLocationManager.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    long j;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7d119c4065b70b082bb60d08cea02aed", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7d119c4065b70b082bb60d08cea02aed");
                        return;
                    }
                    try {
                        WmAddress k = g.a().k();
                        long j2 = 0;
                        if (k != null && k.getWMLocation() != null) {
                            j2 = (long) (k.getWMLocation().getLatitude() * 1000000.0d);
                            j = (long) (k.getWMLocation().getLongitude() * 1000000.0d);
                        } else {
                            WMLocation p = g.a().p();
                            if (p != null) {
                                j2 = (long) (p.getLatitude() * 1000000.0d);
                                j = (long) (p.getLongitude() * 1000000.0d);
                            } else {
                                j = 0;
                            }
                        }
                        WritableMap createMap = Arguments.createMap();
                        createMap.putString(Constants.PRIVACY.KEY_LATITUDE, String.valueOf(j2));
                        createMap.putString(Constants.PRIVACY.KEY_LONGITUDE, String.valueOf(j));
                        promise.resolve(createMap);
                    } catch (Exception e) {
                        promise.reject(e);
                    }
                }
            });
        }
    }

    @ReactMethod
    public void getCurrentAddressName(final Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6bfff45b7e14fb08e2a6fbcfea1ed75a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6bfff45b7e14fb08e2a6fbcfea1ed75a");
        } else {
            ad.c(new Runnable() { // from class: com.sankuai.waimai.reactnative.modules.WMRNLocationManager.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "5c4d48af1cf7819990f3164a41b4f54a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "5c4d48af1cf7819990f3164a41b4f54a");
                        return;
                    }
                    try {
                        WmAddress k = g.a().k();
                        String address = k != null ? k.getAddress() : "";
                        Promise promise2 = promise;
                        if (TextUtils.isEmpty(address)) {
                            address = "";
                        }
                        promise2.resolve(address);
                    } catch (Exception e) {
                        promise.reject(e);
                    }
                }
            });
        }
    }
}
