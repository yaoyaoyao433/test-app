package com.meituan.msi.interceptor;

import com.meituan.msi.api.ApiRequest;
import com.meituan.msi.api.ApiResponse;
import com.meituan.msi.bean.ApiException;
import com.meituan.msi.util.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e {
    private static final BlockingQueue<Runnable> a = new PriorityBlockingQueue(100);
    private static final int b = Runtime.getRuntime().availableProcessors() + 1;
    private static final ExecutorService c;

    static {
        int i = b;
        c = com.sankuai.android.jarvis.c.a("msi", i, i, 0L, TimeUnit.MILLISECONDS, a);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a implements Comparable<a>, Runnable {
        public static ChangeQuickRedirect a;
        private final ApiRequest<?> b;
        private final d c;
        private final com.meituan.msi.api.b d;
        private final Executor e;

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(a aVar) {
            a aVar2 = aVar;
            Object[] objArr = {aVar2};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa414d0f3472ce3b11d09bfff5bf470d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa414d0f3472ce3b11d09bfff5bf470d")).intValue() : this.b.compareTo((ApiRequest) aVar2.b);
        }

        public a(ApiRequest<?> apiRequest, List<b> list, com.meituan.msi.api.b bVar, com.meituan.msi.privacy.permission.a aVar, Executor executor) {
            Object[] objArr = {apiRequest, list, bVar, aVar, executor};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fadffc423d8822758562cc7518f89d9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fadffc423d8822758562cc7518f89d9");
                return;
            }
            this.b = apiRequest;
            this.d = bVar;
            this.c = d.a(apiRequest, list, this.d, aVar);
            if (executor == null) {
                this.e = e.c;
            } else {
                this.e = executor;
            }
        }

        public final void a(Map<String, com.meituan.msi.interceptor.a<?>> map) {
            Object[] objArr = {map};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8272f4dc36a34b9acb525acbefa7e9e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8272f4dc36a34b9acb525acbefa7e9e");
            } else {
                this.c.c = map;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18a4567926a6af08dbd8c54bbfd572f7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18a4567926a6af08dbd8c54bbfd572f7");
                return;
            }
            try {
                this.c.a(this.b);
            } catch (ApiException e) {
                ApiResponse.notifyNegativeResult(this.b.callback(), ApiResponse.negativeResponse(this.b, e, ApiResponse.a.callbackValue));
            }
        }

        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39b3c520506218711ce0d610dcb2ddea", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39b3c520506218711ce0d610dcb2ddea");
                return;
            }
            if (com.meituan.msi.api.e.b(this.b.getScope() + this.b.getName(), this.b.getSource())) {
                m.a(this);
                return;
            }
            if (com.meituan.msi.api.e.c(this.b.getScope() + this.b.getName(), this.b.getSource())) {
                m.a.a(this);
            } else {
                com.sankuai.waimai.launcher.util.aop.b.a(this.e, this);
            }
        }
    }
}
