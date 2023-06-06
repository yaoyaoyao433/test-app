package com.meituan.android.edfu.camerainterface.cameraDevice;

import android.annotation.TargetApi;
import android.hardware.Camera;
import android.os.AsyncTask;
import android.util.Log;
import com.meituan.android.privacy.interfaces.p;
import com.meituan.metrics.sampler.fps.FpsEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.RejectedExecutionException;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a implements Camera.AutoFocusCallback {
    public static ChangeQuickRedirect a = null;
    private static final String c = "a";
    private static long d = 1000;
    private static final Collection<String> e;
    public boolean b;
    private boolean f;
    private boolean g;
    private boolean h;
    private final p i;
    private AsyncTask<?, ?, ?> j;

    static {
        ArrayList arrayList = new ArrayList(2);
        e = arrayList;
        arrayList.add(FpsEvent.TYPE_SCROLL_AUTO);
        e.add("macro");
    }

    public a(p pVar) {
        Object[] objArr = {pVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c6d02fc4fdf021fcb5eedf50d96bf54", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c6d02fc4fdf021fcb5eedf50d96bf54");
            return;
        }
        this.h = false;
        this.i = pVar;
        try {
            this.h = e.contains(pVar.b().getFocusMode());
            if (!this.h) {
                com.meituan.android.edfu.utils.c.a().a("CameraManager", " AutoFocusManager autofocus false");
            }
            a();
        } catch (Exception e2) {
            com.meituan.android.edfu.utils.c a2 = com.meituan.android.edfu.utils.c.a();
            a2.a("CameraManager", " AutoFocusManager" + e2.getMessage());
        }
    }

    public static void a(long j) {
        d = j;
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public final synchronized void onAutoFocus(boolean z, Camera camera) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), camera};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a971e4fe08e2ef6b79be7165f592fbc9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a971e4fe08e2ef6b79be7165f592fbc9");
            return;
        }
        this.g = false;
        d();
    }

    @TargetApi(11)
    private synchronized void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "403e4b3f5c4a290dd9086e5815ec46f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "403e4b3f5c4a290dd9086e5815ec46f9");
            return;
        }
        if (!this.f && this.j == null) {
            AsyncTaskC0251a asyncTaskC0251a = new AsyncTaskC0251a();
            try {
                com.sankuai.waimai.launcher.util.aop.b.a(asyncTaskC0251a, com.sankuai.android.jarvis.c.a(), new Object[0]);
                this.j = asyncTaskC0251a;
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    public final synchronized void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebb2cf96656b46609d53ad02de0e071a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebb2cf96656b46609d53ad02de0e071a");
            return;
        }
        if (this.h) {
            this.j = null;
            if (!this.f && !this.g && this.i != null) {
                this.b = true;
                try {
                    this.i.a(this);
                    this.g = true;
                } catch (RuntimeException unused) {
                    d();
                }
            }
        }
    }

    private synchronized void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3d735d8a0a375528c7ef3578fdc7230", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3d735d8a0a375528c7ef3578fdc7230");
            return;
        }
        if (this.j != null) {
            if (this.j.getStatus() != AsyncTask.Status.FINISHED) {
                this.j.cancel(true);
            }
            this.j = null;
        }
    }

    public final synchronized void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ce097740029d354397ecb852bfa1339", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ce097740029d354397ecb852bfa1339");
            return;
        }
        this.f = true;
        this.b = false;
        if (this.h && this.i != null) {
            e();
            try {
                this.i.c();
            } catch (RuntimeException e2) {
                Log.w(c, "Unexpected exception while cancelling focusing", e2);
            }
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.edfu.camerainterface.cameraDevice.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public final class AsyncTaskC0251a extends AsyncTask<Object, Object, Object> {
        public static ChangeQuickRedirect a;

        private AsyncTaskC0251a() {
            Object[] objArr = {a.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5cffa586dc3d2efa04a0de04f3eb1b2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5cffa586dc3d2efa04a0de04f3eb1b2");
            }
        }

        @Override // android.os.AsyncTask
        public final Object doInBackground(Object... objArr) {
            Object[] objArr2 = {objArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "1f31d15432fe2f8c8c2a7a7537809daa", RobustBitConfig.DEFAULT_VALUE)) {
                return PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "1f31d15432fe2f8c8c2a7a7537809daa");
            }
            try {
                Thread.sleep(a.d);
            } catch (InterruptedException unused) {
            }
            a.this.a();
            return null;
        }
    }
}
