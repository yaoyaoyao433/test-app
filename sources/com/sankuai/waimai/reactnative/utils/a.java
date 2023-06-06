package com.sankuai.waimai.reactnative.utils;

import android.support.constraint.R;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    @Nullable
    public static View a(View view, String str) {
        Object[] objArr = {view, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "958166cc09bcaf95ed8031784300ab5c", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "958166cc09bcaf95ed8031784300ab5c");
        }
        String a2 = a(view);
        if (a2 == null || !a2.equals(str)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    View a3 = a(viewGroup.getChildAt(i), str);
                    if (a3 != null) {
                        return a3;
                    }
                }
            }
            return null;
        }
        return view;
    }

    @Nullable
    private static String a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7d62e974f150807a81ddcc0d2fa507ae", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7d62e974f150807a81ddcc0d2fa507ae");
        }
        Object tag = view.getTag(R.id.react_test_id);
        if (tag instanceof String) {
            return (String) tag;
        }
        return null;
    }

    public static void a(ReactContext reactContext, String str, WritableMap writableMap) {
        Object[] objArr = {reactContext, str, writableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "12bc168b793e225efff09d255fb30fa1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "12bc168b793e225efff09d255fb30fa1");
        } else if (reactContext == null) {
        } else {
            try {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
            } catch (Exception unused) {
            }
        }
    }
}
