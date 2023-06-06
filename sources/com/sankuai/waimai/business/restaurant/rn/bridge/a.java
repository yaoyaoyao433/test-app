package com.sankuai.waimai.business.restaurant.rn.bridge;

import android.support.constraint.R;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import java.util.Collection;
import javax.annotation.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static JSONObject a(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "76fa209b665c7babdc5f7bab56d13349", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "76fa209b665c7babdc5f7bab56d13349");
        }
        if (readableMap == null || readableMap.toHashMap() == null) {
            return null;
        }
        return new JSONObject(readableMap.toHashMap());
    }

    public static JSONArray a(ReadableArray readableArray) {
        Object[] objArr = {readableArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7a8099558e306f9d48ce9607f4ed55fc", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7a8099558e306f9d48ce9607f4ed55fc");
        }
        if (readableArray == null || readableArray.toArrayList() == null) {
            return null;
        }
        return new JSONArray((Collection) readableArray.toArrayList());
    }

    @Nullable
    public static View a(View view, String str) {
        String str2;
        Object[] objArr = {view, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c283ddbe04f627c478508c2779e6eedc", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c283ddbe04f627c478508c2779e6eedc");
        }
        Object[] objArr2 = {view};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "b040140747188172c0f74ee0ce67cd59", RobustBitConfig.DEFAULT_VALUE)) {
            str2 = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "b040140747188172c0f74ee0ce67cd59");
        } else {
            Object tag = view.getTag(R.id.react_test_id);
            str2 = tag instanceof String ? (String) tag : null;
        }
        if (str2 == null || !str2.equals(str)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    View a2 = a(viewGroup.getChildAt(i), str);
                    if (a2 != null) {
                        return a2;
                    }
                }
            }
            return null;
        }
        return view;
    }

    public static GoodsSpu b(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cc44a986b352436a4d148bb9d1c49e06", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsSpu) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cc44a986b352436a4d148bb9d1c49e06");
        }
        if (readableMap != null) {
            JSONObject a2 = a(readableMap);
            GoodsSpu goodsSpu = new GoodsSpu();
            goodsSpu.parseJson(a2);
            return goodsSpu;
        }
        return null;
    }

    public static void a(ReactContext reactContext, String str, WritableMap writableMap) {
        Object[] objArr = {reactContext, str, writableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4d89477fd3a15583e62ce0d5ca400ec9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4d89477fd3a15583e62ce0d5ca400ec9");
        } else if (reactContext == null || reactContext == null) {
        } else {
            try {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
            } catch (Exception unused) {
            }
        }
    }
}
