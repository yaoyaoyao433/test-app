package com.sankuai.waimai.reactnative.modules;

import android.support.v4.app.NotificationCompat;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.reactnative.upload.e;
import com.sankuai.waimai.reactnative.upload.l;
import com.tencent.smtt.sdk.TbsReaderView;
import javax.annotation.Nonnull;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WmUploadFileModule extends ReactContextBaseJavaModule implements e {
    private static final int PROGRESS_REFRESH_RATE = 5;
    public static final String REACT_CLASS = "WMUploadFileModule";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return REACT_CLASS;
    }

    public WmUploadFileModule(@Nonnull ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e532793b13096d644b2ac5ee609875da", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e532793b13096d644b2ac5ee609875da");
        }
    }

    @ReactMethod
    public void uploadFile(ReadableMap readableMap, final Promise promise) {
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "85693dd669bab8d0d5ba32e549fa782b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "85693dd669bab8d0d5ba32e549fa782b");
        } else {
            l.a(readableMap.getString(TbsReaderView.KEY_FILE_PATH), readableMap.getString("presignedUrl"), new l.a() { // from class: com.sankuai.waimai.reactnative.modules.WmUploadFileModule.1
                public static ChangeQuickRedirect a;
                private int d;

                @Override // com.sankuai.waimai.reactnative.upload.l.a
                public final void a(int i) {
                    Object[] objArr2 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d967f87715cd06f045decc41b7873cf9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d967f87715cd06f045decc41b7873cf9");
                    } else if (i % 5 != 0 || i <= this.d) {
                    } else {
                        new StringBuilder("progress:").append(i);
                        WritableMap createMap = Arguments.createMap();
                        createMap.putDouble(NotificationCompat.CATEGORY_PROGRESS, (i * 1.0d) / 100.0d);
                        WmUploadFileModule.this.sendEvent("UploadFileUpdateProgressEvent", createMap);
                        this.d = i;
                    }
                }

                @Override // com.sankuai.waimai.reactnative.upload.l.a
                public final void a(String str) {
                    Object[] objArr2 = {str};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "367018682aa2ecb4e38acd61ae337632", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "367018682aa2ecb4e38acd61ae337632");
                        return;
                    }
                    WritableMap createMap = Arguments.createMap();
                    createMap.putString("url", str);
                    promise.resolve(createMap);
                }

                @Override // com.sankuai.waimai.reactnative.upload.l.a
                public final void a(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d97af339f9bae897a7d44b66252fc6bc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d97af339f9bae897a7d44b66252fc6bc");
                    } else {
                        promise.reject(String.valueOf(i), str);
                    }
                }
            });
        }
    }

    @Override // com.sankuai.waimai.reactnative.upload.e
    public void sendEvent(String str, WritableMap writableMap) {
        Object[] objArr = {str, writableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b5ec4fa74a82b53f8208c9918096b962", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b5ec4fa74a82b53f8208c9918096b962");
        } else {
            new com.sankuai.waimai.reactnative.utils.c(getReactApplicationContext()).a(str, writableMap);
        }
    }
}
