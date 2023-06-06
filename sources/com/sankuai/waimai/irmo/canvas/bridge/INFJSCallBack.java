package com.sankuai.waimai.irmo.canvas.bridge;

import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.irmo.canvas.util.b;
import com.sankuai.waimai.irmo.utils.d;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class INFJSCallBack implements com.sankuai.waimai.irmo.canvas.data.a {
    public static ChangeQuickRedirect changeQuickRedirect;
    private long mFuncPtr;
    private WeakReference<INFJSContext> mWeakJSContext;

    public INFJSCallBack(long j, INFJSContext iNFJSContext) {
        Object[] objArr = {new Long(j), iNFJSContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1823b8ee15640757f93d7026f4e8cd94", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1823b8ee15640757f93d7026f4e8cd94");
            return;
        }
        this.mFuncPtr = j;
        this.mWeakJSContext = new WeakReference<>(iNFJSContext);
    }

    @Override // com.sankuai.waimai.irmo.canvas.data.a
    public Object invoke(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6f8f38d8be0565a02070f997cb8226e8", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6f8f38d8be0565a02070f997cb8226e8");
        }
        INFJSContext jSContext = getJSContext();
        if (jSContext != null) {
            return jSContext.a(this.mFuncPtr, obj);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public INFJSContext getJSContext() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0a25d45e0410dbb39ed364f6ec740cee", RobustBitConfig.DEFAULT_VALUE)) {
            return (INFJSContext) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0a25d45e0410dbb39ed364f6ec740cee");
        }
        if (this.mWeakJSContext != null) {
            return this.mWeakJSContext.get();
        }
        return null;
    }

    public void finalize() throws Throwable {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bcfa2b2c58087cba767e35fca348b453", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bcfa2b2c58087cba767e35fca348b453");
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.sankuai.waimai.irmo.canvas.bridge.INFJSCallBack.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8c1272064c65c27bcd4378bc656dddc4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8c1272064c65c27bcd4378bc656dddc4");
                    return;
                }
                INFJSContext jSContext = INFJSCallBack.this.getJSContext();
                if (jSContext != null) {
                    long j = INFJSCallBack.this.mFuncPtr;
                    Object[] objArr3 = {new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect4 = INFJSContext.a;
                    if (PatchProxy.isSupport(objArr3, jSContext, changeQuickRedirect4, false, "172551e2bbc37c275a55f69d7bf568ae", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, jSContext, changeQuickRedirect4, false, "172551e2bbc37c275a55f69d7bf568ae");
                        return;
                    }
                    jSContext.b();
                    if (jSContext.d) {
                        return;
                    }
                    try {
                        jSContext._releaseJSCallBack(jSContext.c, j);
                    } catch (Exception e) {
                        d.a("Java inf_canvas_log: ErrorMessage：" + e.getMessage() + "\n" + b.a(e.getStackTrace()), new Object[0]);
                    }
                }
            }
        });
        super.finalize();
    }
}
