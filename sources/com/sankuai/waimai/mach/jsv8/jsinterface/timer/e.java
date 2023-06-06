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
public final class e extends com.sankuai.waimai.mach.jsv8.jsinterface.a {
    public static ChangeQuickRedirect b;

    public e(Mach mach) {
        super(mach);
        Object[] objArr = {mach};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64f037607126fcb0f80fc203bf55aa01", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64f037607126fcb0f80fc203bf55aa01");
        }
    }

    @Override // com.meituan.v8jse.JavaCallback
    public final JSValue invoke(JSObject jSObject, JSArray jSArray) {
        final String str;
        Object[] objArr = {jSObject, jSArray};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a748ac338247aadcc00fbea16091eaa", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSValue) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a748ac338247aadcc00fbea16091eaa");
        }
        if (jSArray != null) {
            try {
            } catch (Exception e) {
                com.sankuai.waimai.mach.log.b.b("MachJS_V8", "SetIntervalJSInterface执行异常 | " + e.getMessage());
            }
            if (jSArray.length() >= 2) {
                JSValue jSValue = jSArray.get(0);
                if (jSValue != null) {
                    str = jSValue.isString() ? jSValue.stringValue() : null;
                    jSValue.close();
                } else {
                    str = null;
                }
                JSValue jSValue2 = jSArray.get(1);
                if (jSValue2 != null) {
                    r2 = jSValue2.isInteger() ? jSValue2.integerValue() : -1;
                    jSValue2.close();
                }
                if (!TextUtils.isEmpty(str) && r2 >= 0) {
                    final long nanoTime = System.nanoTime();
                    long j = r2;
                    c cVar = new c(a(), j, j);
                    d.a().a(Long.valueOf(nanoTime), cVar);
                    cVar.b = new c.a() { // from class: com.sankuai.waimai.mach.jsv8.jsinterface.timer.e.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.mach.jsv8.jsinterface.timer.c.a
                        public final void a() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b93069b9a243430d0afecf9c73f10cdd", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b93069b9a243430d0afecf9c73f10cdd");
                                return;
                            }
                            com.sankuai.waimai.mach.jsv8.b b2 = e.this.b();
                            if (b2 != null) {
                                LinkedList linkedList = new LinkedList();
                                linkedList.add(Long.valueOf(nanoTime));
                                b2.a(str, linkedList);
                            }
                        }
                    };
                    cVar.c();
                    JSRuntime c = c();
                    if (c != null) {
                        return JSValue.createDoubleValue(c, nanoTime);
                    }
                    return null;
                }
                return null;
            }
        }
        return null;
    }
}
