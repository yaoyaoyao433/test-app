package com.sankuai.waimai.mach.jsv8.jsinterface.timer;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.v8jse.JSArray;
import com.meituan.v8jse.JSObject;
import com.meituan.v8jse.JSRuntime;
import com.meituan.v8jse.JSValue;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.jsv8.jsinterface.timer.c;
import java.util.LinkedList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f extends com.sankuai.waimai.mach.jsv8.jsinterface.a {
    public static ChangeQuickRedirect b;

    public f(Mach mach) {
        super(mach);
        Object[] objArr = {mach};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a15f605a727f5b637411451b38b252bc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a15f605a727f5b637411451b38b252bc");
        }
    }

    @Override // com.meituan.v8jse.JavaCallback
    public final JSValue invoke(JSObject jSObject, JSArray jSArray) {
        final String str;
        Object[] objArr = {jSObject, jSArray};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4cf765f63d1ed038e52bedb533317646", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSValue) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4cf765f63d1ed038e52bedb533317646");
        }
        if (jSArray != null) {
            try {
            } catch (Exception e) {
                com.sankuai.waimai.mach.log.b.b("MachJS_V8", "SetTimeoutJSInterface执行异常 | " + e.getMessage());
            }
            if (jSArray.length() >= 2) {
                JSValue jSValue = jSArray.get(0);
                if (jSValue != null) {
                    String stringValue = jSValue.isString() ? jSValue.stringValue() : null;
                    jSValue.close();
                    str = stringValue;
                } else {
                    str = null;
                }
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                JSValue jSValue2 = jSArray.get(1);
                if (jSValue2 != null) {
                    r1 = jSValue2.isInteger() ? jSValue2.integerValue() : -1;
                    jSValue2.close();
                }
                if (r1 < 0) {
                    return null;
                }
                final long currentTimeMillis = System.currentTimeMillis();
                final c cVar = new c(a(), r1, 0L);
                d.a().a(Long.valueOf(currentTimeMillis), cVar);
                cVar.b = new c.a() { // from class: com.sankuai.waimai.mach.jsv8.jsinterface.timer.f.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.mach.jsv8.jsinterface.timer.c.a
                    public final void a() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b7fc961517f2de87dfe2330827f5792f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b7fc961517f2de87dfe2330827f5792f");
                            return;
                        }
                        com.sankuai.waimai.mach.jsv8.b b2 = f.this.b();
                        if (b2 != null) {
                            LinkedList linkedList = new LinkedList();
                            linkedList.add(Long.valueOf(currentTimeMillis));
                            b2.a(str, linkedList);
                        }
                        d.a().a(Long.valueOf(currentTimeMillis));
                        if (cVar != null) {
                            cVar.d();
                        }
                    }
                };
                cVar.c();
                JSRuntime c = c();
                if (c != null) {
                    return JSValue.createDoubleValue(c, currentTimeMillis);
                }
                return null;
            }
        }
        return null;
    }
}
