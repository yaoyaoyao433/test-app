package com.sankuai.waimai.reactnative.modules;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.meituan.android.mrn.container.MRNBaseActivity;
import com.meituan.android.mrn.engine.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WMScreenShotModule extends ReactContextBaseJavaModule {
    public static ChangeQuickRedirect changeQuickRedirect;
    private ContentObserver contentObserver;

    @Override // com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "WMScreenShotModule";
    }

    public WMScreenShotModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9916256b93376cb7b7865cf40765fe9b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9916256b93376cb7b7865cf40765fe9b");
        }
    }

    @ReactMethod
    public void registerScreenShotObserver(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b8bdef4b25e929db0364c754635b2e61", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b8bdef4b25e929db0364c754635b2e61");
        } else if (this.contentObserver != null || getReactApplicationContext().getContentResolver() == null) {
        } else {
            try {
                ContentResolver contentResolver = getReactApplicationContext().getContentResolver();
                Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                ContentObserver contentObserver = new ContentObserver(new Handler(Looper.getMainLooper())) { // from class: com.sankuai.waimai.reactnative.modules.WMScreenShotModule.1
                    public static ChangeQuickRedirect a;

                    @Override // android.database.ContentObserver
                    public final void onChange(boolean z, Uri uri2) {
                        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), uri2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "655d0d4e7ad165e246bb2c692d6ae602", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "655d0d4e7ad165e246bb2c692d6ae602");
                        } else if (uri2 == null || !uri2.equals(MediaStore.Images.Media.EXTERNAL_CONTENT_URI)) {
                        } else {
                            WMScreenShotModule.this.sendMsgToRN("onScreenShotSuccess", Arguments.createMap());
                        }
                    }
                };
                this.contentObserver = contentObserver;
                contentResolver.registerContentObserver(uri, false, contentObserver);
            } catch (Exception unused) {
            }
        }
    }

    @ReactMethod
    public void unRegisterScreenShotObserver(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91b528cd8cf08b16343a66bf14aa0f98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91b528cd8cf08b16343a66bf14aa0f98");
        } else if (this.contentObserver == null || getReactApplicationContext().getContentResolver() == null) {
        } else {
            try {
                getReactApplicationContext().getContentResolver().unregisterContentObserver(this.contentObserver);
            } catch (Exception unused) {
            }
            this.contentObserver = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendMsgToRN(String str, WritableMap writableMap) {
        Object[] objArr = {str, writableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2515fa194c7e5b97da749ffb0cb51cd1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2515fa194c7e5b97da749ffb0cb51cd1");
            return;
        }
        try {
            if (getCurrentActivity() instanceof MRNBaseActivity) {
                n.a(((MRNBaseActivity) getCurrentActivity()).l(), str, writableMap);
            }
        } catch (Exception unused) {
        }
    }
}
