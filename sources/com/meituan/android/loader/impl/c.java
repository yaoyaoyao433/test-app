package com.meituan.android.loader.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.meituan.android.loader.DynLoader;
import com.meituan.android.loader.impl.bean.DynRunParam;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.ProcessUtils;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c implements Runnable {
    public static ChangeQuickRedirect a;
    public com.meituan.android.loader.impl.control.b b;
    private g c;
    private Handler d;
    private final boolean e;
    private final com.meituan.android.loader.a f;
    private com.meituan.android.loader.c g;
    private final DynRunParam h;
    private boolean i;

    /* JADX WARN: Removed duplicated region for block: B:57:0x01c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(com.meituan.android.loader.impl.c r27) {
        /*
            Method dump skipped, instructions count: 679
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.loader.impl.c.a(com.meituan.android.loader.impl.c):void");
    }

    public c(g gVar, com.meituan.android.loader.a aVar, com.meituan.android.loader.c cVar, boolean z, DynRunParam dynRunParam) {
        Object[] objArr = {gVar, aVar, cVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), dynRunParam};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5892737e2cbc507a5845e2a9080e7cc1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5892737e2cbc507a5845e2a9080e7cc1");
            return;
        }
        this.c = gVar;
        this.f = aVar;
        this.d = new Handler(Looper.getMainLooper());
        this.e = z;
        this.g = cVar;
        this.h = dynRunParam;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5808184c3f784328cb6dcf13a4b7beaa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5808184c3f784328cb6dcf13a4b7beaa");
            return;
        }
        try {
            new l(b.e) { // from class: com.meituan.android.loader.impl.c.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.loader.impl.m
                public final /* synthetic */ Boolean a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4b116f913dfdeab9c515a84b9b3ce25b", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4b116f913dfdeab9c515a84b9b3ce25b");
                    }
                    f.d("Dynloader 开启线程 at" + ProcessUtils.getCurrentProcessName());
                    c.a(c.this);
                    f.d("Dynloader 线程结束 at" + ProcessUtils.getCurrentProcessName());
                    return Boolean.FALSE;
                }
            }.e();
        } catch (IOException e) {
            f.e(">>>DynLoaderRunnable ProcessSafeOperate failed: " + e.getMessage());
        }
    }

    private void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ec8d5a0912d26ce2a1c07474b3ede64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ec8d5a0912d26ce2a1c07474b3ede64");
            return;
        }
        if (this.d == null) {
            this.d = new Handler(Looper.getMainLooper());
        }
        this.d.post(runnable);
    }

    private void a(final boolean z, final com.meituan.android.loader.a aVar) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "772ba857de802ee696b6758f6601932c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "772ba857de802ee696b6758f6601932c");
        } else if (this.e) {
            a(new Runnable() { // from class: com.meituan.android.loader.impl.c.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ab45bc14851bf617224b56196bb28453", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ab45bc14851bf617224b56196bb28453");
                    } else if (z) {
                        aVar.onDynDownloadSuccess();
                    } else {
                        aVar.onDynDownloadFailure();
                    }
                }
            });
        } else if (z) {
            aVar.onDynDownloadSuccess();
        } else {
            aVar.onDynDownloadFailure();
        }
    }

    private Set<DynFile> a(Context context) {
        String str;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0ee6e66e505ce8a2e375f0e7736c26e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0ee6e66e505ce8a2e375f0e7736c26e");
        }
        try {
            str = com.meituan.android.loader.impl.utils.a.a(context);
        } catch (Throwable th) {
            h.a().a(th, "fetchLocalList failed");
            str = null;
        }
        return b.b(str);
    }

    private Set<DynFile> a() {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "026872e44bc95fbc594521e9e98e37ae", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "026872e44bc95fbc594521e9e98e37ae");
        }
        Set<DynFile> c = b.c(a.e);
        Set<String> b = com.meituan.android.loader.impl.utils.a.b(a.e);
        if (c != null) {
            Iterator<DynFile> it = c.iterator();
            while (it.hasNext()) {
                DynFile next = it.next();
                if (next.isInnerSo() || b.contains(next.getBundleName())) {
                    z = false;
                } else {
                    f.d("删除旧版本的动态资源: " + next.getLocalPath());
                    z = true;
                }
                if (next.isInnerSo() && !this.i) {
                    f.d("覆盖安装时删除旧版本的内置so热更: " + next.getLocalPath());
                    z = true;
                }
                if (z) {
                    j.a(next.getLocalPath());
                    it.remove();
                }
            }
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6aa3217a655c5a7aefc8afda8ed11c7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6aa3217a655c5a7aefc8afda8ed11c7b");
        } else {
            DynLoader.a();
            com.meituan.android.loader.g.a(a.e, 1);
        }
        return c;
    }
}
