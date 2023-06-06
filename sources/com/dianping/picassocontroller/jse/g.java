package com.dianping.picassocontroller.jse;

import com.dianping.jscore.JSExecutor;
import com.dianping.jscore.JSRuntimeException;
import com.dianping.jscore.JavaScriptInterface;
import com.dianping.jscore.Value;
import com.dianping.jscore.model.Encoding;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class g implements a {
    public static ChangeQuickRedirect a;
    private JSExecutor b;

    public g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfae9c926c4b417e49eb1ee2df585a2e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfae9c926c4b417e49eb1ee2df585a2e");
        } else {
            this.b = JSExecutor.create();
        }
    }

    @Override // com.dianping.picassocontroller.jse.a
    public final void a(String str, String str2) throws JSRuntimeException {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c209322287b2d0c58b0367b27954042c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c209322287b2d0c58b0367b27954042c");
        } else {
            this.b.execJS(str, str2);
        }
    }

    @Override // com.dianping.picassocontroller.jse.a
    public final void a(String str, JavaScriptInterface javaScriptInterface) {
        Object[] objArr = {str, javaScriptInterface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4daf3325e8fb1bc72b3a5cc3819dabbd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4daf3325e8fb1bc72b3a5cc3819dabbd");
        } else {
            this.b.addJavaScriptInterface(str, javaScriptInterface);
        }
    }

    @Override // com.dianping.picassocontroller.jse.a
    public final void a(String str, Encoding encoding) {
        Object[] objArr = {str, encoding};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c1b59eb1b696454d28d44951a829be2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c1b59eb1b696454d28d44951a829be2");
        } else {
            this.b.injectGlobalJSObject(str, new Value(encoding));
        }
    }

    public final void finalize() throws Throwable {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf33b85535874c59ce3abbbad1756459", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf33b85535874c59ce3abbbad1756459");
            return;
        }
        super.finalize();
        this.b.destroy();
    }

    @Override // com.dianping.picassocontroller.jse.a
    public final Value a(String str, String str2, Value[] valueArr) throws JSRuntimeException {
        Object[] objArr = {str, str2, valueArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4305918f310a60a9b3e27c3a9ec1aad", RobustBitConfig.DEFAULT_VALUE) ? (Value) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4305918f310a60a9b3e27c3a9ec1aad") : new Value(this.b.invokeMethod(str, str2, valueArr));
    }
}
