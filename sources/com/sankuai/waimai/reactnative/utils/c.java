package com.sankuai.waimai.reactnative.utils;

import android.content.Context;
import android.support.annotation.Nullable;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private ReactApplicationContext b;
    private Context c;

    public c(ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "702d761d0273278a13fe9a2902347458", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "702d761d0273278a13fe9a2902347458");
        } else {
            this.b = reactApplicationContext;
        }
    }

    public c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a4b811b0583eb737aa3742cb6809f1e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a4b811b0583eb737aa3742cb6809f1e");
        } else {
            this.c = context;
        }
    }

    public final void a(String str, @Nullable WritableMap writableMap) {
        Object[] objArr = {str, writableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af178d1ff2f938c74d3d0f1c32ac5105", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af178d1ff2f938c74d3d0f1c32ac5105");
        } else if (this.b == null || this.b == null) {
        } else {
            try {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.b.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
            } catch (Exception unused) {
            }
        }
    }
}
