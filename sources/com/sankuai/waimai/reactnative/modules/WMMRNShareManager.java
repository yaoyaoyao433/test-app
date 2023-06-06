package com.sankuai.waimai.reactnative.modules;

import android.os.Bundle;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.platform.domain.core.Share.ShareTip;
import com.sankuai.waimai.reactnative.modules.a;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WMMRNShareManager extends ReactContextBaseJavaModule {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "WMMRNShareManager";
    }

    public WMMRNShareManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d249c48650152c2c660f3372437e9821", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d249c48650152c2c660f3372437e9821");
        }
    }

    @ReactMethod
    public void isWXInstalled(final Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ee1ba4fdd40ef8afc5ba01004470310b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ee1ba4fdd40ef8afc5ba01004470310b");
        } else {
            ad.c(new Runnable() { // from class: com.sankuai.waimai.reactnative.modules.WMMRNShareManager.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "253334129b081fceda6b973540807ef5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "253334129b081fceda6b973540807ef5");
                        return;
                    }
                    try {
                        WritableMap createMap = Arguments.createMap();
                        createMap.putBoolean("result", com.sankuai.waimai.share.b.a(WMMRNShareManager.this.getCurrentActivity()));
                        promise.resolve(createMap);
                    } catch (Exception e) {
                        promise.reject(e);
                    }
                }
            });
        }
    }

    @ReactMethod
    public void shareToWX(final ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "44abc76b5dc5801a29823d3341b605d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "44abc76b5dc5801a29823d3341b605d8");
        } else {
            ad.c(new Runnable() { // from class: com.sankuai.waimai.reactnative.modules.WMMRNShareManager.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d6d2818122debe9155b5d59ca40c266f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d6d2818122debe9155b5d59ca40c266f");
                        return;
                    }
                    try {
                        ShareTip shareTip = new ShareTip();
                        shareTip.setUrl(WMMRNShareManager.this.getStringSafely("url", readableMap));
                        shareTip.setIcon(WMMRNShareManager.this.getStringSafely(RemoteMessageConst.Notification.ICON, readableMap));
                        shareTip.setContent(WMMRNShareManager.this.getStringSafely("content", readableMap));
                        shareTip.setTitle(WMMRNShareManager.this.getStringSafely("title", readableMap));
                        shareTip.setWeixinUrl(WMMRNShareManager.this.getStringSafely("wx_url", readableMap));
                        shareTip.setCid(WMMRNShareManager.this.getStringSafely("cid", readableMap));
                        com.sankuai.waimai.share.b.a(WMMRNShareManager.this.getCurrentActivity(), shareTip, 2, new com.sankuai.waimai.foundation.core.service.share.listener.b() { // from class: com.sankuai.waimai.reactnative.modules.WMMRNShareManager.2.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.foundation.core.service.share.listener.b
                            public final void a(int i, int i2) {
                                Object[] objArr3 = {Integer.valueOf(i), Integer.valueOf(i2)};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "feb8b0435791eb32c3963eeee083ba94", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "feb8b0435791eb32c3963eeee083ba94");
                                    return;
                                }
                                WritableMap createMap = Arguments.createMap();
                                createMap.putInt("result", i2);
                                promise.resolve(createMap);
                            }
                        }, (Bundle) null);
                    } catch (Exception e) {
                        promise.reject(e);
                    }
                }
            });
        }
    }

    @ReactMethod
    public void shareToWXGroup(final ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b7667732468fdc2da0e55c924487bb1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b7667732468fdc2da0e55c924487bb1d");
        } else {
            ad.c(new Runnable() { // from class: com.sankuai.waimai.reactnative.modules.WMMRNShareManager.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "34c2d04fc1c8cdb9c4555777c559381a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "34c2d04fc1c8cdb9c4555777c559381a");
                        return;
                    }
                    try {
                        ShareTip shareTip = new ShareTip();
                        shareTip.setUrl(WMMRNShareManager.this.getStringSafely("url", readableMap));
                        shareTip.setIcon(WMMRNShareManager.this.getStringSafely(RemoteMessageConst.Notification.ICON, readableMap));
                        shareTip.setContent(WMMRNShareManager.this.getStringSafely("content", readableMap));
                        shareTip.setTitle(WMMRNShareManager.this.getStringSafely("title", readableMap));
                        shareTip.setWeixinUrl(WMMRNShareManager.this.getStringSafely("wx_url", readableMap));
                        shareTip.setCid(WMMRNShareManager.this.getStringSafely("cid", readableMap));
                        com.sankuai.waimai.share.b.a(WMMRNShareManager.this.getCurrentActivity(), shareTip, 1, new com.sankuai.waimai.foundation.core.service.share.listener.b() { // from class: com.sankuai.waimai.reactnative.modules.WMMRNShareManager.3.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.foundation.core.service.share.listener.b
                            public final void a(int i, int i2) {
                                Object[] objArr3 = {Integer.valueOf(i), Integer.valueOf(i2)};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "c1c52a7e3896e59f5897ebfcf7437720", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "c1c52a7e3896e59f5897ebfcf7437720");
                                    return;
                                }
                                WritableMap createMap = Arguments.createMap();
                                createMap.putInt("result", i2);
                                promise.resolve(createMap);
                            }
                        }, (Bundle) null);
                    } catch (Exception e) {
                        promise.reject(e);
                    }
                }
            });
        }
    }

    @ReactMethod
    public void shareMultiPersonOrderToWX(final ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6a75afcf6beb4e54ea4458d2b0e460b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6a75afcf6beb4e54ea4458d2b0e460b2");
        } else {
            ad.c(new Runnable() { // from class: com.sankuai.waimai.reactnative.modules.WMMRNShareManager.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e4375c77777585b54bee1125a417ca2d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e4375c77777585b54bee1125a417ca2d");
                        return;
                    }
                    try {
                        final ShareTip shareTip = new ShareTip();
                        shareTip.setUrl(WMMRNShareManager.this.getStringSafely("url", readableMap));
                        shareTip.setIcon(WMMRNShareManager.this.getStringSafely(RemoteMessageConst.Notification.ICON, readableMap));
                        shareTip.setContent(WMMRNShareManager.this.getStringSafely("content", readableMap));
                        shareTip.setTitle(WMMRNShareManager.this.getStringSafely("title", readableMap));
                        shareTip.setWeixinUrl(WMMRNShareManager.this.getStringSafely("wx_url", readableMap));
                        shareTip.setCid(WMMRNShareManager.this.getStringSafely("cid", readableMap));
                        ArrayList<String> array = WMMRNShareManager.this.getArray("enough_discount_labels", readableMap);
                        ArrayList<String> array2 = WMMRNShareManager.this.getArray("share_discount_labels", readableMap);
                        final b bVar = new b(WMMRNShareManager.this.getCurrentActivity(), "local_share_order");
                        bVar.a(WMMRNShareManager.this.getCurrentActivity(), shareTip, array, array2, new a.InterfaceC1117a() { // from class: com.sankuai.waimai.reactnative.modules.WMMRNShareManager.4.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.reactnative.modules.a.InterfaceC1117a
                            public final void a(boolean z) {
                                Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "e2787f53df2be23c6a1ef14ffcf45fa2", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "e2787f53df2be23c6a1ef14ffcf45fa2");
                                } else {
                                    WMMRNShareManager.this.share(bVar, shareTip, promise);
                                }
                            }
                        });
                    } catch (Exception e) {
                        promise.reject(e);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void share(b bVar, ShareTip shareTip, final Promise promise) {
        Object[] objArr = {bVar, shareTip, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "38b0ecb973a6542159abf7e45f5e01fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "38b0ecb973a6542159abf7e45f5e01fa");
            return;
        }
        if (bVar != null) {
            shareTip.setIcon(bVar.c());
        }
        com.sankuai.waimai.share.b.a(getCurrentActivity(), shareTip, 2, new com.sankuai.waimai.foundation.core.service.share.listener.b() { // from class: com.sankuai.waimai.reactnative.modules.WMMRNShareManager.5
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.foundation.core.service.share.listener.b
            public final void a(int i, int i2) {
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "102456d89e00f91abf37e9f0d43d7e46", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "102456d89e00f91abf37e9f0d43d7e46");
                    return;
                }
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("result", i2);
                promise.resolve(createMap);
            }
        }, (Bundle) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getStringSafely(String str, ReadableMap readableMap) {
        Object[] objArr = {str, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8b11c0b2269f6f00c43b31ec3ae4f7ec", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8b11c0b2269f6f00c43b31ec3ae4f7ec") : readableMap.hasKey(str) ? readableMap.getString(str) : "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList getArray(String str, ReadableMap readableMap) {
        Object[] objArr = {str, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "456849a1ff54e35f7bca3473edc35c46", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "456849a1ff54e35f7bca3473edc35c46");
        }
        if (readableMap.hasKey(str)) {
            return readableMap.getArray(str).toArrayList();
        }
        return null;
    }
}
