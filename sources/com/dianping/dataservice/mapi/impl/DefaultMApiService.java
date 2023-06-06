package com.dianping.dataservice.mapi.impl;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.dianping.monitor.impl.k;
import com.dianping.nvnetwork.NVDefaultNetworkService;
import com.dianping.nvnetwork.Request;
import com.dianping.nvnetwork.i;
import com.dianping.nvnetwork.o;
import com.dianping.nvnetwork.q;
import com.dianping.util.h;
import com.meituan.android.cipstorage.x;
import com.meituan.metrics.traffic.reflection.SharkWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class DefaultMApiService implements com.dianping.dataservice.mapi.g {
    private static final String TAG = "mapi";
    public static ChangeQuickRedirect changeQuickRedirect;
    private Context context;
    private d interceptor;
    private k monitorService;
    private com.dianping.dataservice.http.d networkInfo;
    private NVDefaultNetworkService nvNetworkService;
    private ConcurrentHashMap<com.dianping.dataservice.http.b, a> runningRequests;

    @Deprecated
    public static void init(Application application, int i, String str) {
    }

    @Deprecated
    private void resetTunnel() {
    }

    @Deprecated
    public void resetLocalDns() {
    }

    @Deprecated
    public void setDismissTokenListener(com.dianping.dataservice.mapi.impl.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d48d23d2eaf93f61992508eb83d734b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d48d23d2eaf93f61992508eb83d734b1");
        }
    }

    public Request transferRequest(Request request) {
        return request;
    }

    @Override // com.dianping.dataservice.b
    public /* bridge */ /* synthetic */ void exec(com.dianping.dataservice.mapi.e eVar, com.dianping.dataservice.d<com.dianping.dataservice.mapi.e, com.dianping.dataservice.mapi.f> dVar) {
        exec2(eVar, (com.dianping.dataservice.d) dVar);
    }

    public DefaultMApiService(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fdca11139877ece7c2f5d74ba3c14840", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fdca11139877ece7c2f5d74ba3c14840");
            return;
        }
        this.runningRequests = new ConcurrentHashMap<>();
        this.context = context;
        this.networkInfo = new com.dianping.dataservice.http.d(context);
        this.interceptor = new d(this.networkInfo) { // from class: com.dianping.dataservice.mapi.impl.DefaultMApiService.1
            public static ChangeQuickRedirect a;

            @Override // com.dianping.dataservice.mapi.impl.d
            public final Request a(Request request) {
                Object[] objArr2 = {request};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ebb01630c2d52e174892218388d4f4cf", RobustBitConfig.DEFAULT_VALUE) ? (Request) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ebb01630c2d52e174892218388d4f4cf") : DefaultMApiService.this.transferRequest(request);
            }
        };
        NVDefaultNetworkService.a aVar = new NVDefaultNetworkService.a(context);
        SharkWrapper.addInterceptorToBuilder(aVar);
        NVDefaultNetworkService.a a2 = aVar.a(this.interceptor);
        a2.e = true;
        this.nvNetworkService = a2.a();
        this.monitorService = new k(com.dianping.nvnetwork.g.d());
    }

    @Deprecated
    public com.dianping.dataservice.cache.a cache() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f686a910ad032b9a981731928bdcbd89", RobustBitConfig.DEFAULT_VALUE) ? (com.dianping.dataservice.cache.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f686a910ad032b9a981731928bdcbd89") : new b();
    }

    public String diagnosisInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c5bac3c97ca29e5ae914d96da7ddf9ec", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c5bac3c97ca29e5ae914d96da7ddf9ec");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("dpid=" + getDpid());
        sb.append(com.dianping.nvnetwork.g.t());
        return sb.toString();
    }

    public void setResponseUnauthorizedListener(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "be6a5c692f83f88a629ae3332fade2c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "be6a5c692f83f88a629ae3332fade2c3");
        } else if (this.interceptor != null) {
            this.interceptor.e = fVar;
        }
    }

    public void setUpdateNewTokenListener(g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8fd797b19e7c03f905352b5cff97058b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8fd797b19e7c03f905352b5cff97058b");
        } else if (this.interceptor != null) {
            this.interceptor.d = gVar;
        }
    }

    public void mock(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0330b03c333b91926ed683abcf06f6e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0330b03c333b91926ed683abcf06f6e2");
            return;
        }
        i a2 = i.a();
        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect3 = i.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect3, false, "d8bcdd1ff23fa17594502216cc300a72", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect3, false, "d8bcdd1ff23fa17594502216cc300a72");
        } else {
            a2.a(z, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class a implements com.dianping.nvnetwork.b {
        public static ChangeQuickRedirect a;
        public com.dianping.dataservice.d<com.dianping.dataservice.mapi.e, com.dianping.dataservice.mapi.f> b;
        public com.dianping.dataservice.mapi.e c;
        public Request d;

        @Override // com.dianping.nvnetwork.b
        public final void a(Request request) {
            Object[] objArr = {request};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aabe19c22541e1c3f6d23f2e1404513a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aabe19c22541e1c3f6d23f2e1404513a");
            }
        }

        @Override // com.dianping.nvnetwork.b
        public final void a(Request request, int i, int i2) {
            Object[] objArr = {request, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8649732b7f98c830013f662ab92c1469", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8649732b7f98c830013f662ab92c1469");
            }
        }

        public a(com.dianping.dataservice.mapi.e eVar, Request request, com.dianping.dataservice.d<com.dianping.dataservice.mapi.e, com.dianping.dataservice.mapi.f> dVar) {
            Object[] objArr = {DefaultMApiService.this, eVar, request, dVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "830eaf8108752f56331f42c6004b0181", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "830eaf8108752f56331f42c6004b0181");
                return;
            }
            this.c = eVar;
            this.d = request;
            this.b = dVar;
        }

        @Override // com.dianping.nvnetwork.o
        public final void a(Request request, q qVar) {
            Object[] objArr = {request, qVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b7a2bbad77a42666487f8850850070b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b7a2bbad77a42666487f8850850070b");
                return;
            }
            if (qVar.statusCode() != 401) {
                if (this.b != null) {
                    this.b.onRequestFinish(this.c, DefaultMApiService.this.transferResponse(qVar));
                } else {
                    com.dianping.networklog.c.a("mapi handler is null-->url:" + this.c.a(), 3);
                }
            }
            DefaultMApiService.this.runningRequests.remove(this.c);
        }

        @Override // com.dianping.nvnetwork.o
        public final void b(Request request, q qVar) {
            Object[] objArr = {request, qVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44a004a513fe765f6ea7f07634fd0d3b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44a004a513fe765f6ea7f07634fd0d3b");
                return;
            }
            if (qVar.statusCode() != 401) {
                if (this.b != null) {
                    this.b.onRequestFailed(this.c, DefaultMApiService.this.transferResponse(qVar));
                } else {
                    com.dianping.networklog.c.a("mapi handler is null-->url:" + this.c.a(), 3);
                }
            }
            DefaultMApiService.this.runningRequests.remove(this.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.dianping.dataservice.mapi.f transferResponse(q qVar) {
        Object[] objArr = {qVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "06ff434a08cc2b7cd2ac18161defd113", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.dianping.dataservice.mapi.f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "06ff434a08cc2b7cd2ac18161defd113");
        }
        ArrayList arrayList = new ArrayList();
        if (qVar.headers() != null) {
            for (Map.Entry<String, String> entry : qVar.headers().entrySet()) {
                arrayList.add(new com.dianping.apache.http.message.a(entry.getKey(), entry.getValue()));
            }
        }
        return new com.dianping.dataservice.mapi.impl.a(qVar.statusCode(), qVar.result() != null ? e.b(qVar.result()) : null, arrayList, qVar.h, qVar.error(), qVar.f, qVar.g);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.dianping.nvnetwork.Request transferRequest(com.dianping.dataservice.mapi.e r20) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.dataservice.mapi.impl.DefaultMApiService.transferRequest(com.dianping.dataservice.mapi.e):com.dianping.nvnetwork.Request");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.dianping.nvnetwork.cache.c transferCacheType(com.dianping.dataservice.mapi.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c419fc3e72e4774690d0dbdbb07ebd7b", RobustBitConfig.DEFAULT_VALUE) ? (com.dianping.nvnetwork.cache.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c419fc3e72e4774690d0dbdbb07ebd7b") : cVar == com.dianping.dataservice.mapi.c.DISABLED ? com.dianping.nvnetwork.cache.c.DISABLED : cVar == com.dianping.dataservice.mapi.c.NORMAL ? com.dianping.nvnetwork.cache.c.NORMAL : cVar == com.dianping.dataservice.mapi.c.HOURLY ? com.dianping.nvnetwork.cache.c.HOURLY : cVar == com.dianping.dataservice.mapi.c.DAILY ? com.dianping.nvnetwork.cache.c.DAILY : cVar == com.dianping.dataservice.mapi.c.CRITICAL ? com.dianping.nvnetwork.cache.c.CRITICAL : cVar == com.dianping.dataservice.mapi.c.SERVICE ? com.dianping.nvnetwork.cache.c.SERVICE : com.dianping.nvnetwork.cache.c.DISABLED;
    }

    /* renamed from: exec  reason: avoid collision after fix types in other method */
    public void exec2(com.dianping.dataservice.mapi.e eVar, com.dianping.dataservice.d dVar) {
        Object[] objArr = {eVar, dVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fc10dd5f3acd45e19e288f64fec13cb5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fc10dd5f3acd45e19e288f64fec13cb5");
        } else if (!this.runningRequests.containsKey(eVar)) {
            Request transferRequest = transferRequest(eVar);
            a aVar = new a(eVar, transferRequest, dVar);
            this.nvNetworkService.exec(transferRequest, aVar);
            this.runningRequests.put(eVar, aVar);
        } else {
            h.d(TAG, "cannot exec duplicate request (same instance)");
        }
    }

    public com.dianping.dataservice.mapi.f execSync(com.dianping.dataservice.mapi.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5c652667bc96eaf4e575984f2af14a69", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.dianping.dataservice.mapi.f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5c652667bc96eaf4e575984f2af14a69");
        }
        try {
            return transferResponse(this.nvNetworkService.execSync(transferRequest(eVar)));
        } catch (Exception e) {
            e.printStackTrace();
            return new com.dianping.dataservice.mapi.impl.a(-100, null, null, null, e);
        }
    }

    public q execSync(Request request) {
        Object[] objArr = {request};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9df1c7b6b21f5eacd81ece08dd124c58", RobustBitConfig.DEFAULT_VALUE) ? (q) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9df1c7b6b21f5eacd81ece08dd124c58") : this.nvNetworkService.execSync(request);
    }

    public void exec(Request request, o oVar) {
        Object[] objArr = {request, oVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "53b9ac5860874c0bbdd3b56e3ab6d4b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "53b9ac5860874c0bbdd3b56e3ab6d4b8");
        } else {
            this.nvNetworkService.exec(request, oVar);
        }
    }

    public void abort(Request request, o oVar, boolean z) {
        Object[] objArr = {request, oVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c28c803f326e806c823113024a9b3efc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c28c803f326e806c823113024a9b3efc");
        } else {
            this.nvNetworkService.abort(request);
        }
    }

    @Override // com.dianping.dataservice.b
    public void abort(com.dianping.dataservice.mapi.e eVar, com.dianping.dataservice.d<com.dianping.dataservice.mapi.e, com.dianping.dataservice.mapi.f> dVar, boolean z) {
        Object[] objArr = {eVar, dVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "36bea2062507d79b795da52dd6c0b6ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "36bea2062507d79b795da52dd6c0b6ce");
            return;
        }
        a remove = this.runningRequests.remove(eVar);
        if (remove != null) {
            this.nvNetworkService.abort(remove.d);
        }
    }

    @Deprecated
    public String getDpid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "491a8e0c0a055ae2949f161d72a5eac6", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "491a8e0c0a055ae2949f161d72a5eac6") : com.dianping.dataservice.mapi.h.a().a(true);
    }

    @Deprecated
    public void setDpid(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ffd1f5b596ad1fa4a8b8d1d2b0c1c53d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ffd1f5b596ad1fa4a8b8d1d2b0c1c53d");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            x.a(com.meituan.android.cipstorage.q.a(this.context, "dpplatform_mapi", 1)).a("dpid", str, this.context.getPackageName());
        }
    }

    public k getMonitor() {
        return this.monitorService;
    }

    public void setBackgroundMode(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "628a4dcb5a54a226093f216cd0d936b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "628a4dcb5a54a226093f216cd0d936b1");
        } else if (z) {
        } else {
            resetLocalDns();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class b implements com.dianping.dataservice.cache.a {
        public static ChangeQuickRedirect a;

        public b() {
            Object[] objArr = {DefaultMApiService.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "375076af89b6f9555e622c7e18800313", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "375076af89b6f9555e622c7e18800313");
            }
        }

        @Override // com.dianping.dataservice.b
        public final /* synthetic */ void abort(com.dianping.dataservice.http.b bVar, com.dianping.dataservice.d<com.dianping.dataservice.http.b, com.dianping.dataservice.http.c> dVar, boolean z) {
            Object[] objArr = {bVar, dVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (!PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86078a47952874eae881adcf466aef66", RobustBitConfig.DEFAULT_VALUE)) {
                throw new UnsupportedOperationException("unsupported operation!");
            }
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86078a47952874eae881adcf466aef66");
        }

        @Override // com.dianping.dataservice.b
        public final /* synthetic */ void exec(com.dianping.dataservice.http.b bVar, com.dianping.dataservice.d<com.dianping.dataservice.http.b, com.dianping.dataservice.http.c> dVar) {
            Object[] objArr = {bVar, dVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (!PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "327875e8fabad926110dcbf8449bf907", RobustBitConfig.DEFAULT_VALUE)) {
                throw new UnsupportedOperationException("unsupported operation!");
            }
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "327875e8fabad926110dcbf8449bf907");
        }

        @Override // com.dianping.dataservice.cache.a
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d47844618a356fee3e34cc341e4023c8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d47844618a356fee3e34cc341e4023c8");
            } else {
                DefaultMApiService.this.nvNetworkService.cacheService().a();
            }
        }
    }
}
