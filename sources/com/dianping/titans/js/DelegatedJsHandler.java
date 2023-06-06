package com.dianping.titans.js;

import android.content.Context;
import android.content.Intent;
import com.dianping.titans.js.IJSHandlerDelegate;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.dianping.titans.utils.ReflectUtils;
import com.dianping.titansmodel.apimodel.d;
import com.dianping.titansmodel.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Type;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class DelegatedJsHandler<P, R extends g> extends BaseJsHandler implements IJSHandlerDelegate<R> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Type actualType;
    private IJSHandlerDelegate.OnActivityResultListener mOnActivityResultListener;
    private IJSHandlerDelegate.OnDestroyListener mOnDestroyListener;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public int jsHandlerType() {
        return 2;
    }

    public DelegatedJsHandler() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d9cfb9abb5fe8b858bf13bdb8f676898", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d9cfb9abb5fe8b858bf13bdb8f676898");
        } else {
            this.actualType = null;
        }
    }

    @Override // com.dianping.titans.js.IJSHandlerDelegate
    public void setOnDestroyListener(IJSHandlerDelegate.OnDestroyListener onDestroyListener) {
        this.mOnDestroyListener = onDestroyListener;
    }

    @Override // com.dianping.titans.js.IJSHandlerDelegate
    public void setOnActivityResultListener(IJSHandlerDelegate.OnActivityResultListener onActivityResultListener) {
        this.mOnActivityResultListener = onActivityResultListener;
    }

    @Override // com.dianping.titans.js.IJSHandlerDelegate
    public Context getContext() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c4c224cc6e1814257d980adb159bce69", RobustBitConfig.DEFAULT_VALUE) ? (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c4c224cc6e1814257d980adb159bce69") : jsHost().getContext();
    }

    @Override // com.dianping.titans.js.IJSHandlerDelegate
    public JsHost getJsHost() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7a65e13d07e94e11c292a29c66b4bde2", RobustBitConfig.DEFAULT_VALUE) ? (JsHost) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7a65e13d07e94e11c292a29c66b4bde2") : jsHost();
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8e3c8045619bad9d6075094cb35ad95a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8e3c8045619bad9d6075094cb35ad95a");
        } else if (this.mOnActivityResultListener != null) {
            this.mOnActivityResultListener.onActivityResult(i, i2, intent);
        }
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6a3198827824f92d2e8b15abc9d8a2ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6a3198827824f92d2e8b15abc9d8a2ba");
        } else if (this.mOnDestroyListener != null) {
            this.mOnDestroyListener.onDestroy();
        }
    }

    @Override // com.dianping.titans.js.IJSHandlerDelegate
    public void actionCallback(R r) {
        Object[] objArr = {r};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a15ac3bb8433e8e19cacbf1ddca4b88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a15ac3bb8433e8e19cacbf1ddca4b88");
            return;
        }
        if (r == null) {
            r = (R) new g();
        }
        r.status = "action";
        r.result = "next";
        jsCallback(r.writeToJSON());
    }

    @Override // com.dianping.titans.js.IJSHandlerDelegate
    public void failCallback(g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "63cb232ee5893544221705deaa7763ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "63cb232ee5893544221705deaa7763ef");
            return;
        }
        if (gVar == null) {
            gVar = new g();
        }
        gVar.status = "fail";
        gVar.result = "next";
        jsCallback(gVar.writeToJSON());
    }

    @Override // com.dianping.titans.js.IJSHandlerDelegate
    public void successCallback(g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f6e747a109b92755e67274eea981a856", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f6e747a109b92755e67274eea981a856");
            return;
        }
        if (gVar == null) {
            gVar = new g();
        }
        gVar.status = "success";
        gVar.result = "next";
        jsCallback(gVar.writeToJSON());
    }

    public P args() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c5e72224d72c73e64f2bedec1969a8b5", RobustBitConfig.DEFAULT_VALUE)) {
            return (P) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c5e72224d72c73e64f2bedec1969a8b5");
        }
        Class cls = (Class) getActualType();
        if (cls.getInterfaces().length > 0 && cls.getInterfaces()[0] == d.class) {
            try {
                P p = (P) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                ((d) p).initParamWithJSON(jsBean().argsJson);
                return p;
            } catch (Exception unused) {
            }
        }
        return (P) jsBean().argsJson;
    }

    private Type getActualType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1fd6aa4efa9484bcae8aa82a3289fb3c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Type) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1fd6aa4efa9484bcae8aa82a3289fb3c");
        }
        if (this.actualType != null) {
            return this.actualType;
        }
        for (Class<?> cls = getClass(); this.actualType == null && cls != Object.class; cls = cls.getSuperclass()) {
            try {
                this.actualType = ReflectUtils.getActualTypeArguments(cls, 0);
            } catch (Throwable unused) {
            }
            if (this.actualType != null) {
                break;
            }
        }
        return this.actualType != null ? this.actualType : Void.class;
    }
}
