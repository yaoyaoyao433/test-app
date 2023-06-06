package com.meituan.v8jse;

import android.support.annotation.Keep;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class JSObject extends JSValue {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.v8jse.JSValue
    public boolean isObject() {
        return true;
    }

    public JSObject(JSRuntime jSRuntime) {
        super(jSRuntime);
        Object[] objArr = {jSRuntime};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "68d881581d3e5f78ab78ee594bf95228", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "68d881581d3e5f78ab78ee594bf95228");
        } else {
            this.mType = 7;
        }
    }

    public static JSObject createJSObject(JSRuntime jSRuntime) {
        Object[] objArr = {jSRuntime};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "823995e60954c3a74fbfd5044db65489", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "823995e60954c3a74fbfd5044db65489");
        }
        long newJSObject = jSRuntime.newJSObject();
        JSObject jSObject = new JSObject(jSRuntime);
        jSObject.mObjKey = newJSObject;
        return jSObject;
    }

    public static JSObject createJSObject(JSRuntime jSRuntime, JSONObject jSONObject) {
        Object[] objArr = {jSRuntime, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a1bce788523cad1cc5ddae9493aa62dd", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a1bce788523cad1cc5ddae9493aa62dd");
        }
        if (jSONObject == null) {
            return null;
        }
        long createJSObjectByJson = jSRuntime.createJSObjectByJson(jSONObject.toString());
        JSObject jSObject = new JSObject(jSRuntime);
        jSObject.mObjKey = createJSObjectByJson;
        return jSObject;
    }

    public boolean add(String str, JSValue jSValue) {
        Object[] objArr = {str, jSValue};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3fe58ae1de32f6030751a75e601aea08", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3fe58ae1de32f6030751a75e601aea08")).booleanValue();
        }
        checkRelease();
        return this.mRuntime.addJSValue(this.mObjKey, str, jSValue.mObjKey);
    }

    public boolean add(int i, JSValue jSValue) {
        Object[] objArr = {Integer.valueOf(i), jSValue};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "85ad2d3f253a79e0b9679fe572c70895", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "85ad2d3f253a79e0b9679fe572c70895")).booleanValue();
        }
        checkRelease();
        return this.mRuntime.addJSValue(this.mObjKey, i, jSValue.mObjKey);
    }

    public JSValue get(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5b8dae44c3b1085b07e94022385cda6f", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSValue) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5b8dae44c3b1085b07e94022385cda6f");
        }
        checkRelease();
        return this.mRuntime.getJSValue(this.mObjKey, str);
    }

    public JSValue get(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ae7c2b986515dfa1beda28ccab5a508e", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSValue) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ae7c2b986515dfa1beda28ccab5a508e");
        }
        checkRelease();
        return this.mRuntime.getJSValue(this.mObjKey, i);
    }

    public boolean has(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4f446ff9a2f9835abe432eb525bdb859", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4f446ff9a2f9835abe432eb525bdb859")).booleanValue();
        }
        checkRelease();
        return this.mRuntime.hasProperty(this.mObjKey, str);
    }

    public boolean delete(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "17ad390e961254a3b1c86f7d625aabda", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "17ad390e961254a3b1c86f7d625aabda")).booleanValue();
        }
        checkRelease();
        return this.mRuntime.deleteProperty(this.mObjKey, str);
    }

    public boolean delete(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "72a0d5aee22bbf920bfe809af61f4b55", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "72a0d5aee22bbf920bfe809af61f4b55")).booleanValue();
        }
        checkRelease();
        return this.mRuntime.deleteProperty(this.mObjKey, i);
    }

    public JSValue executeFunction(String str, JSArray jSArray) {
        Object[] objArr = {str, jSArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2135769df88871aa1a5e209b29ccb7e8", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSValue) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2135769df88871aa1a5e209b29ccb7e8");
        }
        checkRelease();
        return this.mRuntime.executeFunction(this.mObjKey, str, jSArray != null ? jSArray.mObjKey : -1L);
    }

    public void executeVoidFunction(String str, JSArray jSArray) {
        Object[] objArr = {str, jSArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1f1618f757a8450c6bf541ac78f93f82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1f1618f757a8450c6bf541ac78f93f82");
            return;
        }
        JSValue executeFunction = executeFunction(str, jSArray);
        if (executeFunction != null) {
            executeFunction.close();
        }
    }

    public void registerJavaMethod(String str, JavaCallback javaCallback) {
        Object[] objArr = {str, javaCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cce89077781c6ba12e25c19f3b4ba118", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cce89077781c6ba12e25c19f3b4ba118");
            return;
        }
        checkRelease();
        this.mRuntime.registerCallBack(this.mObjKey, str, javaCallback);
    }

    public String toJson() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "42038f397ac01e85e592b2b09e877cfe", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "42038f397ac01e85e592b2b09e877cfe");
        }
        checkRelease();
        return this.mRuntime.jsObjectToJson(this.mObjKey);
    }

    @Override // com.meituan.v8jse.JSValue
    public Object getValue() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1ff4b5b8102b78933ee115241c395641", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1ff4b5b8102b78933ee115241c395641");
        }
        try {
            return (Map) new Gson().fromJson(toJson(), new TypeToken<Map<String, Object>>() { // from class: com.meituan.v8jse.JSObject.1
            }.getType());
        } catch (Exception unused) {
            return null;
        }
    }
}
