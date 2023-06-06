package com.sankuai.waimai.reactnative.upload;

import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import com.meituan.android.common.unionid.oneid.network.OneIdNetworkTool;
import com.meituan.android.mrn.utils.o;
import com.meituan.metrics.traffic.reflection.OkHttp2Wrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBRuntime;
import com.squareup.okhttp.u;
import com.squareup.okhttp.v;
import com.squareup.okhttp.x;
import com.squareup.okhttp.y;
import com.squareup.okhttp.z;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okio.s;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class l {
    public static ChangeQuickRedirect a;
    private static v b;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(int i);

        void a(int i, String str);

        void a(String str);
    }

    static {
        v vVar = new v();
        OkHttp2Wrapper.addInterceptorToClient(vVar);
        v a2 = com.sankuai.waimai.launcher.util.aop.b.a(vVar);
        b = a2;
        a2.a(10L, TimeUnit.SECONDS);
        b.b(10L, TimeUnit.SECONDS);
    }

    public static void a(final String str, final String str2, final a aVar) {
        Object[] objArr = {str, str2, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "da35c6fbf45dd2a66f1e12824b8e9497", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "da35c6fbf45dd2a66f1e12824b8e9497");
        } else {
            KNBRuntime.getRuntime().executeOnThreadPool(new Runnable() { // from class: com.sankuai.waimai.reactnative.upload.l.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "707aada169dd4eaa89fc583b40a5ba5d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "707aada169dd4eaa89fc583b40a5ba5d");
                    } else {
                        l.b(str, str2, aVar);
                    }
                }
            });
        }
    }

    @WorkerThread
    public static void b(String str, String str2, a aVar) {
        Object[] objArr = {str, str2, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5d9691d0450fe8accda84d5957ccd567", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5d9691d0450fe8accda84d5957ccd567");
            return;
        }
        try {
            z a2 = b.a(new x.a().a(str2).a(OneIdNetworkTool.PUT, new b(new File(str), null, 90, aVar)).a()).a();
            if (a2 == null) {
                if (aVar != null) {
                    aVar.a(2021, "response is null");
                }
            } else if (!a2.c()) {
                if (aVar != null) {
                    aVar.a(a2.c, a2.d);
                }
            } else if (aVar != null) {
                aVar.a(100);
                aVar.a("");
            }
        } catch (IOException e) {
            if (aVar != null) {
                aVar.a(2021, e.getMessage());
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b extends y {
        public static ChangeQuickRedirect a;
        protected File b;
        protected a c;
        protected String d;
        private int e;

        public b(File file, String str, int i, a aVar) {
            Object[] objArr = {file, null, 90, aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4108b2365738b33e03724817509f764", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4108b2365738b33e03724817509f764");
                return;
            }
            this.b = file;
            this.d = null;
            this.e = 90;
            this.c = aVar;
        }

        @Override // com.squareup.okhttp.y
        @Nullable
        public final u contentType() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "835eb8db4a428a112f5800d4fdee7e18", RobustBitConfig.DEFAULT_VALUE)) {
                return (u) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "835eb8db4a428a112f5800d4fdee7e18");
            }
            if (TextUtils.isEmpty(this.d)) {
                return null;
            }
            return u.a(this.d);
        }

        @Override // com.squareup.okhttp.y
        public final long contentLength() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50e113098410a17f1cc198d8353f563e", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50e113098410a17f1cc198d8353f563e")).longValue() : this.b.length();
        }

        @Override // com.squareup.okhttp.y
        public final void writeTo(okio.d dVar) {
            Object[] objArr = {dVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbb4af69b574fb53e2fe8d85dcfe96f1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbb4af69b574fb53e2fe8d85dcfe96f1");
                return;
            }
            s sVar = null;
            long contentLength = contentLength();
            long j = 0;
            try {
                try {
                    s a2 = okio.m.a(this.b);
                    while (true) {
                        try {
                            long read = a2.read(dVar.a(), 4096L);
                            if (read != -1) {
                                j += read;
                                dVar.flush();
                                if (this.c != null) {
                                    this.c.a((int) ((((float) (this.e * j)) * 1.0f) / ((float) contentLength)));
                                }
                            } else {
                                o.a(a2);
                                return;
                            }
                        } catch (Exception e) {
                            e = e;
                            sVar = a2;
                            com.sankuai.waimai.foundation.utils.log.a.b("ProgressRequestBody", "writeTo, ex:", e);
                            o.a(sVar);
                            return;
                        } catch (Throwable th) {
                            th = th;
                            sVar = a2;
                            o.a(sVar);
                            throw th;
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }
}
