package com.meituan.v8jse;

import android.support.annotation.Keep;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import org.json.JSONArray;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class JSArray extends JSObject {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.v8jse.JSValue
    public boolean isArray() {
        return true;
    }

    public JSArray(JSRuntime jSRuntime) {
        super(jSRuntime);
        Object[] objArr = {jSRuntime};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5c2adfada16b7b39ffe2640a6746af7f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5c2adfada16b7b39ffe2640a6746af7f");
        } else {
            this.mType = 8;
        }
    }

    public static JSArray createJSArray(JSRuntime jSRuntime) {
        Object[] objArr = {jSRuntime};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "715a7fca513fd26aa8e3c41fadd552da", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "715a7fca513fd26aa8e3c41fadd552da");
        }
        long newJSArray = jSRuntime.newJSArray();
        JSArray jSArray = new JSArray(jSRuntime);
        jSArray.mObjKey = newJSArray;
        return jSArray;
    }

    public static JSArray createJSArray(JSRuntime jSRuntime, JSONArray jSONArray) {
        Object[] objArr = {jSRuntime, jSONArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a2c46fb7a996b95df6a96bb36d0ee2ea", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a2c46fb7a996b95df6a96bb36d0ee2ea");
        }
        if (jSONArray == null) {
            return null;
        }
        long createJSObjectByJson = jSRuntime.createJSObjectByJson(jSONArray.toString());
        JSArray jSArray = new JSArray(jSRuntime);
        jSArray.mObjKey = createJSObjectByJson;
        return jSArray;
    }

    public boolean push(JSValue jSValue) {
        Object[] objArr = {jSValue};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3da0feb769c2c50f555291bf4b3cacc7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3da0feb769c2c50f555291bf4b3cacc7")).booleanValue();
        }
        checkRelease();
        return this.mRuntime.pushJSValue(this.mObjKey, jSValue.mObjKey);
    }

    public int length() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a635451abd3dbdd4e0829a137ce16ebb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a635451abd3dbdd4e0829a137ce16ebb")).intValue();
        }
        checkRelease();
        return this.mRuntime.getArraySize(this.mObjKey);
    }

    @Override // com.meituan.v8jse.JSObject, com.meituan.v8jse.JSValue
    public Object getValue() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3aec404aba2d91ec009521a88dc79836", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3aec404aba2d91ec009521a88dc79836");
        }
        try {
            return (List) new Gson().fromJson(toJson(), new TypeToken<List<Object>>() { // from class: com.meituan.v8jse.JSArray.1
            }.getType());
        } catch (Exception unused) {
            return null;
        }
    }
}
