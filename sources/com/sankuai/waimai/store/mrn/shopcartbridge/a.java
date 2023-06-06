package com.sankuai.waimai.store.mrn.shopcartbridge;

import android.support.annotation.Nullable;
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
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static JSONObject a(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8cb81575096fd02b3abd535a3431b562", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8cb81575096fd02b3abd535a3431b562");
        }
        if (readableMap == null || readableMap.toHashMap() == null) {
            return null;
        }
        return new JSONObject(readableMap.toHashMap());
    }

    public static JSONArray a(ReadableArray readableArray) {
        Object[] objArr = {readableArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1827a06735d054cb477170ac3ae875da", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1827a06735d054cb477170ac3ae875da");
        }
        if (readableArray == null || readableArray.toArrayList() == null) {
            return null;
        }
        return new JSONArray((Collection) readableArray.toArrayList());
    }

    @Nullable
    public static View a(View view, String str) {
        Object[] objArr = {view, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "349a7de1a059967a00454e70139e4bd7", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "349a7de1a059967a00454e70139e4bd7");
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "575c36a5633840be6cf2d26f0396c789", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "575c36a5633840be6cf2d26f0396c789");
        }
        Object tag = view.getTag(R.id.react_test_id);
        if (tag instanceof String) {
            return (String) tag;
        }
        return null;
    }

    public static GoodsSpu b(ReadableMap readableMap) {
        Object[] objArr = {readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8b6de3ddfed28323350ffa2a06ad8637", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsSpu) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8b6de3ddfed28323350ffa2a06ad8637");
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a35e2c8fb4f51576bbe207e6087dc1cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a35e2c8fb4f51576bbe207e6087dc1cd");
        } else if (reactContext == null || reactContext == null) {
        } else {
            try {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
            } catch (Exception e) {
                com.dianping.judas.util.a.a(e);
            }
        }
    }
}
