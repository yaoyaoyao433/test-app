package com.sankuai.waimai.mach.jsv8.jsinterface;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.v8jse.JSArray;
import com.meituan.v8jse.JSObject;
import com.meituan.v8jse.JSValue;
import com.sankuai.waimai.mach.Mach;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e extends a {
    public static ChangeQuickRedirect b;

    public e(Mach mach) {
        super(mach);
        Object[] objArr = {mach};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abf694e6b3f5bcfcc24f62d4d8995bf7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abf694e6b3f5bcfcc24f62d4d8995bf7");
        }
    }

    @Override // com.meituan.v8jse.JavaCallback
    public final JSValue invoke(JSObject jSObject, JSArray jSArray) {
        final String str;
        final Map<String, Object> map;
        JSValue jSValue;
        Object[] objArr = {jSObject, jSArray};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "622f5403e7daf17bc82a9ad8e08425e4", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSValue) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "622f5403e7daf17bc82a9ad8e08425e4");
        }
        if (jSArray != null) {
            try {
            } catch (Exception e) {
                com.sankuai.waimai.mach.log.b.b("MachJS_V8", "SendEventJSInterface执行异常 | " + e.getMessage());
            }
            if (jSArray.length() > 0) {
                str = "";
                JSValue jSValue2 = jSArray.get(0);
                if (jSValue2 != null) {
                    str = jSValue2.isString() ? jSValue2.stringValue() : "";
                    jSValue2.close();
                }
                if (jSArray.length() < 2 || (jSValue = jSArray.get(1)) == null) {
                    map = null;
                } else {
                    if (jSValue.isString()) {
                        map = com.sankuai.waimai.mach.utils.b.a(jSValue.stringValue());
                    } else {
                        map = jSValue instanceof JSObject ? com.sankuai.waimai.mach.utils.b.a(((JSObject) jSValue).toJson()) : null;
                    }
                    jSValue.close();
                }
                com.sankuai.waimai.mach.utils.e.a(new Runnable() { // from class: com.sankuai.waimai.mach.jsv8.jsinterface.e.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "91ac12e9d94ae0bfff692802e1861b60", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "91ac12e9d94ae0bfff692802e1861b60");
                            return;
                        }
                        Mach a2 = e.this.a();
                        if (a2 == null || a2.getReceiveJsEventListener() == null) {
                            return;
                        }
                        a2.getReceiveJsEventListener().a(str, map);
                    }
                });
                return null;
            }
        }
        return null;
    }
}
