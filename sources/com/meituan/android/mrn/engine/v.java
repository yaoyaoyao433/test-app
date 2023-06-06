package com.meituan.android.mrn.engine;

import android.text.TextUtils;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.NativeModuleCallExceptionHandler;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UnexpectedNativeTypeException;
import com.facebook.react.devsupport.JSException;
import com.meituan.android.common.aidata.mrn.Constants;
import com.meituan.android.mrn.module.MRNExceptionsManagerModule;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class v implements NativeModuleCallExceptionHandler {
    public static ChangeQuickRedirect a;
    public volatile boolean b;
    private WeakReference<k> c;

    public v(k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a582be04b0fee098143462253b87476", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a582be04b0fee098143462253b87476");
            return;
        }
        this.b = false;
        this.c = new WeakReference<>(kVar);
    }

    private k a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed120500f51bffe19cd535b61d5fcee9", RobustBitConfig.DEFAULT_VALUE)) {
            return (k) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed120500f51bffe19cd535b61d5fcee9");
        }
        if (this.c == null) {
            return null;
        }
        return this.c.get();
    }

    @Override // com.facebook.react.bridge.NativeModuleCallExceptionHandler
    public final void handleException(Exception exc) {
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5984fd6787df138e5ba8b8a66ce126a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5984fd6787df138e5ba8b8a66ce126a3");
        } else if (exc == null) {
        } else {
            exc.printStackTrace();
            k a2 = a();
            if (a2 != null) {
                if (a2.l == null && !a2.m) {
                    a2.a(com.meituan.android.mrn.config.q.LOAD_BASE_ERROR);
                } else if (a2.a((com.meituan.android.mrn.config.q) null) == null) {
                    a2.a(com.meituan.android.mrn.config.q.LOAD_MAIN_BUNDLE_FAILED);
                }
            }
            if (com.meituan.android.mrn.debug.a.a()) {
                Object[] objArr2 = {exc};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "35bb51fa765aafc6d34566f35e2b0791", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "35bb51fa765aafc6d34566f35e2b0791");
                    return;
                }
                k a3 = a();
                if (a3 == null || a3.b == null || a3.b.getDevSupportManager() == null) {
                    throw new RuntimeException(exc);
                }
                ReactInstanceManager reactInstanceManager = a3.b;
                if (reactInstanceManager.getCurrentActivity() == null) {
                    reactInstanceManager.setCurrentActivity(com.meituan.android.mrn.router.c.a().b());
                }
                reactInstanceManager.getDevSupportManager();
                StringBuilder sb = new StringBuilder("此类异常修复请参考文档：https://km.sankuai.com/page/277968556\n\n");
                sb.append(exc.getMessage() == null ? "Exception in native call from JS" : exc.getMessage());
                Throwable cause = exc.getCause();
                Throwable th = exc;
                while (cause != null) {
                    sb.append("\n\n");
                    sb.append(cause.getMessage());
                    cause = cause.getCause();
                    th = th.getCause();
                }
                if (exc instanceof JSException) {
                    String str = ((JSException) exc).a;
                    sb.append("\n\n");
                    sb.append(str);
                    return;
                }
                return;
            }
            Object[] objArr3 = {exc};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "059051e698918786db172da5c91ba25d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "059051e698918786db172da5c91ba25d");
            } else if ((exc instanceof com.meituan.android.mrn.exception.a) || (exc instanceof com.meituan.android.mrn.exception.c)) {
                throw ((RuntimeException) exc);
            } else {
                if (exc instanceof com.meituan.android.mrn.exception.b) {
                    if (exc.getCause() == null) {
                        a("NativeModuleCallExceptionOther1", exc);
                        return;
                    }
                    Throwable cause2 = exc.getCause();
                    if ((cause2 instanceof JSApplicationCausedNativeException) || (cause2 instanceof UnexpectedNativeTypeException) || (cause2 instanceof NullPointerException)) {
                        a(exc);
                    } else if (cause2 instanceof ClassCastException) {
                        a("NativeModuleCallExceptionNew", exc);
                    } else {
                        a(exc);
                    }
                } else if (exc instanceof JSApplicationIllegalArgumentException) {
                    a(exc);
                } else {
                    a("NativeModuleCallExceptionOther2", exc);
                    k a4 = a();
                    if (a4 == null || this.b) {
                        return;
                    }
                    this.b = true;
                    a4.f = p.ERROR;
                    MRNExceptionsManagerModule mRNExceptionsManagerModule = (a4.b == null || a4.b.getCurrentReactContext() == null) ? null : (MRNExceptionsManagerModule) a4.b.getCurrentReactContext().getNativeModule(MRNExceptionsManagerModule.class);
                    if (mRNExceptionsManagerModule != null) {
                        mRNExceptionsManagerModule.handleLoadBundleException(new MRNExceptionsManagerModule.b(true, exc.getMessage(), (Throwable) exc, (ReadableMap) null));
                    } else {
                        com.meituan.android.mrn.utils.s.a(a4);
                    }
                }
            }
        }
    }

    private void a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "877ed586a6858f0270076e58dec0681e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "877ed586a6858f0270076e58dec0681e");
            return;
        }
        k a2 = a();
        if (a2 == null) {
            return;
        }
        MRNExceptionsManagerModule.reportError(com.meituan.android.mrn.common.a.a(), a2, new MRNExceptionsManagerModule.b(true, th.getMessage(), th, (ReadableMap) null), true, false);
    }

    private String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2aaf889646352d27ae65b56149b97a8b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2aaf889646352d27ae65b56149b97a8b");
        }
        k a2 = a();
        return a2 == null ? "mrn" : a2.k;
    }

    private void a(String str, Exception exc) {
        Object[] objArr = {str, exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e99e96ef9b5757d84716a6eaf9c2b3c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e99e96ef9b5757d84716a6eaf9c2b3c5");
            return;
        }
        HashMap hashMap = new HashMap();
        String b = b();
        if (TextUtils.isEmpty(b)) {
            b = "mrn";
        }
        hashMap.put(Constants.ModelBeanConstants.KEY_BUNDLE_NAME, b);
        com.meituan.android.mrn.utils.c.a("MRNNativeModuleCallExceptionHandler@" + str, hashMap, exc);
    }
}
