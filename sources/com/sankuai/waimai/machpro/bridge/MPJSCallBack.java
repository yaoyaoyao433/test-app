package com.sankuai.waimai.machpro.bridge;

import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.base.MachMap;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class MPJSCallBack {
    public static ChangeQuickRedirect changeQuickRedirect;
    private long mFuncPtr;
    private WeakReference<MPJSContext> mWeakJSContext;

    public MPJSCallBack(long j, MPJSContext mPJSContext) {
        Object[] objArr = {new Long(j), mPJSContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b73e21123f65dea39d137b0bc3c22116", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b73e21123f65dea39d137b0bc3c22116");
            return;
        }
        this.mFuncPtr = j;
        this.mWeakJSContext = new WeakReference<>(mPJSContext);
    }

    public Object invoke(MachMap machMap) {
        Object[] objArr = {machMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b35e9971d534f55eb8b3e3135bea80cf", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b35e9971d534f55eb8b3e3135bea80cf");
        }
        MPJSContext jSContext = getJSContext();
        if (jSContext != null) {
            return jSContext.a(this.mFuncPtr, machMap);
        }
        return null;
    }

    public Object invoke(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "60cabbf7e20a891cd41b9f2b82ea19c3", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "60cabbf7e20a891cd41b9f2b82ea19c3");
        }
        MPJSContext jSContext = getJSContext();
        if (jSContext != null) {
            return jSContext.a(this.mFuncPtr, obj);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MPJSContext getJSContext() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a9d4552940edc4bdb8e794ee5fba9f59", RobustBitConfig.DEFAULT_VALUE)) {
            return (MPJSContext) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a9d4552940edc4bdb8e794ee5fba9f59");
        }
        if (this.mWeakJSContext != null) {
            return this.mWeakJSContext.get();
        }
        return null;
    }

    public void finalize() throws Throwable {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7e2db4483d010ab49107ff121a25dd00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7e2db4483d010ab49107ff121a25dd00");
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.sankuai.waimai.machpro.bridge.MPJSCallBack.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ee9dbf54db96512fbbcff48d674b1032", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ee9dbf54db96512fbbcff48d674b1032");
                    return;
                }
                MPJSContext jSContext = MPJSCallBack.this.getJSContext();
                if (jSContext != null) {
                    long j = MPJSCallBack.this.mFuncPtr;
                    Object[] objArr3 = {new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect4 = MPJSContext.a;
                    if (PatchProxy.isSupport(objArr3, jSContext, changeQuickRedirect4, false, "8175a31f88c89f83d93097e90b1b3f28", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, jSContext, changeQuickRedirect4, false, "8175a31f88c89f83d93097e90b1b3f28");
                        return;
                    }
                    jSContext.a();
                    if (jSContext.c) {
                        return;
                    }
                    try {
                        jSContext._releaseJSCallBack(jSContext.b, j);
                    } catch (Exception e) {
                        com.sankuai.waimai.machpro.util.a.a("ErrorMessage：" + e.getMessage() + "\n" + com.sankuai.waimai.machpro.util.b.a(e.getStackTrace()));
                    }
                }
            }
        });
        super.finalize();
    }
}
