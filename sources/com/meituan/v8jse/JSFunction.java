package com.meituan.v8jse;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class JSFunction extends JSObject {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.v8jse.JSValue
    public boolean isFunction() {
        return true;
    }

    public JSFunction(JSRuntime jSRuntime) {
        super(jSRuntime);
        Object[] objArr = {jSRuntime};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d43eba6c2ea4129ae3a3ce9b86c2b3c0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d43eba6c2ea4129ae3a3ce9b86c2b3c0");
        } else {
            this.mType = 9;
        }
    }

    public static JSFunction createJSFunction(JSRuntime jSRuntime, JavaCallback javaCallback) {
        Object[] objArr = {jSRuntime, javaCallback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "dda7b826fcde80ff8b31e8eb551c97ef", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSFunction) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "dda7b826fcde80ff8b31e8eb551c97ef");
        }
        long newJSFunction = jSRuntime.newJSFunction(javaCallback);
        JSFunction jSFunction = new JSFunction(jSRuntime);
        jSFunction.mObjKey = newJSFunction;
        return jSFunction;
    }

    public JSValue call(JSObject jSObject, JSArray jSArray) {
        Object[] objArr = {jSObject, jSArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c95128ed8284f13fa8dd8a02f63efb0b", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSValue) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c95128ed8284f13fa8dd8a02f63efb0b");
        }
        checkRelease();
        return this.mRuntime.invokeFunction(this.mObjKey, jSObject.mObjKey, jSArray == null ? -1L : jSArray.mObjKey);
    }
}
