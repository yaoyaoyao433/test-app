package com.sankuai.mads.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.dianping.monitor.impl.l;
import com.google.gson.GsonBuilder;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.mads.g;
import com.sankuai.mads.internal.BaseResponse;
import com.sankuai.mads.internal.CpcApi;
import com.sankuai.mads.internal.utils.b;
import com.sankuai.meituan.retrofit2.Interceptor;
import com.sankuai.meituan.retrofit2.adapter.rxjava.f;
import com.sankuai.meituan.retrofit2.ar;
import com.sankuai.meituan.retrofit2.raw.a;
import com.sankuai.meituan.retrofit2.y;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import kotlin.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.e;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0013\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0005H\u0002J\u0016\u0010\u0014\u001a\u00020\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u0005H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/sankuai/mads/internal/AdReportService;", "", "rawCallFactory", "Lcom/sankuai/meituan/retrofit2/raw/RawCall$Factory;", "interceptors", "", "Lcom/sankuai/meituan/retrofit2/Interceptor;", "(Lcom/sankuai/meituan/retrofit2/raw/RawCall$Factory;Ljava/util/List;)V", "cpcApi", "Lcom/sankuai/mads/internal/CpcApi;", "mEventCache", "Lcom/sankuai/mads/internal/cache/AdEventCache;", "mHandler", "Landroid/os/Handler;", "deferReport", "", "eventData", "Lcom/sankuai/mads/ReportEventData;", "directReport", "doRealReport", "startService", Constants.EventInfoConsts.KEY_LX_INNER_DATAS_LIST, "Companion", "sdk_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public static final a d = new a(null);
    final com.sankuai.mads.internal.cache.a b;
    Handler c;
    private final CpcApi e;

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "metricMonitor", "Lcom/dianping/monitor/impl/MetricMonitor;", "invoke"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.sankuai.mads.internal.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0571b extends i implements kotlin.jvm.functions.b<l, r> {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ List b;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0571b(List list, int i) {
            super(1);
            this.b = list;
            this.c = i;
        }

        @Override // kotlin.jvm.functions.b
        public final /* synthetic */ r invoke(l lVar) {
            l lVar2 = lVar;
            Object[] objArr = {lVar2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad6fd78845453e6fc2b5156dc9194e8a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad6fd78845453e6fc2b5156dc9194e8a");
            } else {
                h.b(lVar2, "metricMonitor");
                com.sankuai.mads.internal.monitor.b bVar = com.sankuai.mads.internal.monitor.b.a;
                com.sankuai.mads.internal.monitor.b bVar2 = com.sankuai.mads.internal.monitor.b.a;
                lVar2.a("Report", kotlin.collections.h.b(Float.valueOf(this.b.size()))).a("ReportLength", kotlin.collections.h.b(Float.valueOf(this.c)));
            }
            return r.a;
        }
    }

    public b(@NotNull a.InterfaceC0637a interfaceC0637a, @Nullable List<? extends Interceptor> list) {
        CpcApi cpcApi;
        h.b(interfaceC0637a, "rawCallFactory");
        boolean z = true;
        Object[] objArr = {interfaceC0637a, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2cc175f69d3d31147a57b6f4d0a927da", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2cc175f69d3d31147a57b6f4d0a927da");
            return;
        }
        CpcApi.a aVar = CpcApi.a;
        String i = com.sankuai.mads.internal.c.l.i();
        Object[] objArr2 = {i, interfaceC0637a, list};
        ChangeQuickRedirect changeQuickRedirect2 = CpcApi.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "773987c5a59937171e1539372c93e0ec", RobustBitConfig.DEFAULT_VALUE)) {
            cpcApi = (CpcApi) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "773987c5a59937171e1539372c93e0ec");
        } else {
            h.b(i, "baseUrl");
            h.b(interfaceC0637a, "rawCallFactory");
            GsonBuilder gsonBuilder = new GsonBuilder();
            gsonBuilder.registerTypeAdapter(BaseResponse.class, new BaseResponse.BaseResponseDeserializer());
            ar.a a2 = new ar.a().a(i).a(interfaceC0637a).a(com.sankuai.meituan.retrofit2.converter.gson.a.a(gsonBuilder.create())).a(f.a());
            List<? extends Interceptor> list2 = list;
            if (list2 != null && !list2.isEmpty()) {
                z = false;
            }
            if (!z) {
                a2.a((List<Interceptor>) list);
            }
            Object a3 = a2.a(new y(aVar.getClass().getSimpleName(), false)).a().a(CpcApi.class);
            h.a(a3, "retrofitBuilder.addInter…reate(CpcApi::class.java)");
            cpcApi = (CpcApi) a3;
        }
        this.e = cpcApi;
        this.b = new com.sankuai.mads.internal.cache.a();
        com.sankuai.mads.internal.tracker.b.a(new com.sankuai.mads.internal.tracker.a(null, "", "", "", "", 1, null));
        this.c = new d(Looper.getMainLooper());
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/sankuai/mads/internal/AdReportService$mHandler$1", "Landroid/os/Handler;", "handleMessage", "", "msg", "Landroid/os/Message;", "sdk_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes3.dex */
    public static final class d extends Handler {
        public static ChangeQuickRedirect a;

        public d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(@NotNull Message message) {
            Object[] objArr = {message};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "187576489915a16b6e20ffa734938f70", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "187576489915a16b6e20ffa734938f70");
                return;
            }
            h.b(message, "msg");
            super.handleMessage(message);
            if (message.what != 101) {
                return;
            }
            List<g> a2 = b.this.b.a();
            removeMessages(101);
            b.this.a(a2);
        }
    }

    public final void a(@NotNull g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1fb49f49da408c76ad59a16ad7cbafb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1fb49f49da408c76ad59a16ad7cbafb");
            return;
        }
        h.b(gVar, "eventData");
        com.sankuai.mads.internal.manager.a aVar = com.sankuai.mads.internal.manager.a.g;
        com.sankuai.mads.internal.manager.a.b().a(1);
        List<g> a2 = this.b.a(gVar);
        this.c.removeMessages(101);
        a(a2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(List<g> list) {
        int i = 0;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ead0cea1c8294c7516873adda25e576", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ead0cea1c8294c7516873adda25e576");
        } else if (list.isEmpty()) {
        } else {
            com.sankuai.mads.internal.horn.a aVar = com.sankuai.mads.internal.horn.a.c;
            int b = com.sankuai.mads.internal.horn.a.a().b.b();
            int size = list.size();
            if (size <= b) {
                b(list);
                return;
            }
            while (i < size) {
                int i2 = i + b;
                b(list.subList(i, i2 < size ? i2 : size));
                i = i2;
            }
        }
    }

    private final void b(List<g> list) {
        b.InterfaceC0580b a2;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22d603424b871c39978f62f4086ea563", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22d603424b871c39978f62f4086ea563");
            return;
        }
        try {
            List<g> list2 = list;
            ArrayList arrayList = new ArrayList(kotlin.collections.h.a((Iterable) list2, 10));
            for (g gVar : list2) {
                com.sankuai.mads.internal.utils.b bVar = com.sankuai.mads.internal.utils.b.b;
                com.sankuai.mads.internal.c cVar = com.sankuai.mads.internal.c.l;
                if (com.sankuai.mads.internal.c.e() && (a2 = com.sankuai.mads.internal.utils.b.a()) != null) {
                    a2.a("Upload " + gVar.b.b);
                }
                arrayList.add(gVar.c);
            }
            String a3 = com.sankuai.mads.internal.a.a(arrayList);
            int length = a3.length();
            com.sankuai.mads.internal.monitor.c.b.a(new C0571b(list, length));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            com.sankuai.mads.internal.horn.a aVar = com.sankuai.mads.internal.horn.a.c;
            if (com.sankuai.mads.internal.horn.a.a().c) {
                linkedHashMap.put("post-fail-over", "true");
            }
            this.e.uploadLogData(com.sankuai.mads.internal.c.l.h(), a3, linkedHashMap).b(rx.schedulers.a.e()).a(rx.android.schedulers.a.a()).a(new c(list, length));
        } catch (UnsupportedEncodingException e) {
            String str = "convert log error\n" + Log.getStackTraceString(e);
            com.sankuai.mads.internal.utils.b.a(com.sankuai.mads.internal.utils.b.b, str);
            b.InterfaceC0580b a4 = com.sankuai.mads.internal.utils.b.a();
            if (a4 != null) {
                a4.b(str);
            }
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00020\u0001J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\t\u001a\u00020\u00052\u0010\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002H\u0016J\u0016\u0010\u000b\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¨\u0006\u000f"}, d2 = {"com/sankuai/mads/internal/AdReportService$doRealReport$2", "Lrx/Observer;", "Lcom/sankuai/mads/internal/BaseResponse;", "", "onCompleted", "", "onError", "e", "", "onNext", "response", "retry", Constants.EventInfoConsts.KEY_LX_INNER_DATAS_LIST, "", "Lcom/sankuai/mads/ReportEventData;", "sdk_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes3.dex */
    public static final class c implements e<BaseResponse<String>> {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ List c;
        public final /* synthetic */ int d;

        @Override // rx.e
        public final void onCompleted() {
        }

        /* compiled from: ProGuard */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "metricMonitor", "Lcom/dianping/monitor/impl/MetricMonitor;", "invoke"}, k = 3, mv = {1, 1, 15})
        /* loaded from: classes3.dex */
        public static final class a extends i implements kotlin.jvm.functions.b<l, r> {
            public static ChangeQuickRedirect a;
            public final /* synthetic */ Throwable c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Throwable th) {
                super(1);
                this.c = th;
            }

            @Override // kotlin.jvm.functions.b
            public final /* synthetic */ r invoke(l lVar) {
                l lVar2 = lVar;
                Object[] objArr = {lVar2};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3373c1d11631ef23d1f216fb6584525c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3373c1d11631ef23d1f216fb6584525c");
                } else {
                    h.b(lVar2, "metricMonitor");
                    com.sankuai.mads.internal.monitor.b bVar = com.sankuai.mads.internal.monitor.b.a;
                    com.sankuai.mads.internal.monitor.b bVar2 = com.sankuai.mads.internal.monitor.b.a;
                    com.sankuai.mads.internal.monitor.b bVar3 = com.sankuai.mads.internal.monitor.b.a;
                    l a2 = lVar2.a("errorCode", this.c instanceof com.sankuai.meituan.retrofit2.exception.c ? String.valueOf(((com.sankuai.meituan.retrofit2.exception.c) this.c).a()) : "unknown");
                    h.a((Object) a2, "metricMonitor.addTags(\"e…oString() else \"unknown\")");
                    a2.a("ReportFailed", kotlin.collections.h.b(Float.valueOf(c.this.c.size()))).a("ReportFailedLength", kotlin.collections.h.b(Float.valueOf(c.this.d))).a("RequestSuccessRate", kotlin.collections.h.b(Float.valueOf(0.0f)));
                }
                return r.a;
            }
        }

        /* compiled from: ProGuard */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "metricMonitor", "Lcom/dianping/monitor/impl/MetricMonitor;", "invoke"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.sankuai.mads.internal.b$c$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0572b extends i implements kotlin.jvm.functions.b<l, r> {
            public static ChangeQuickRedirect a;
            public final /* synthetic */ BaseResponse c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0572b(BaseResponse baseResponse) {
                super(1);
                this.c = baseResponse;
            }

            @Override // kotlin.jvm.functions.b
            public final /* synthetic */ r invoke(l lVar) {
                l lVar2 = lVar;
                Object[] objArr = {lVar2};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a958b29357563da1624cd5ae2a1262f8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a958b29357563da1624cd5ae2a1262f8");
                } else {
                    h.b(lVar2, "metricMonitor");
                    com.sankuai.mads.internal.monitor.b bVar = com.sankuai.mads.internal.monitor.b.a;
                    com.sankuai.mads.internal.monitor.b bVar2 = com.sankuai.mads.internal.monitor.b.a;
                    com.sankuai.mads.internal.monitor.b bVar3 = com.sankuai.mads.internal.monitor.b.a;
                    BaseResponse baseResponse = this.c;
                    l a2 = lVar2.a("errorCode", (baseResponse == null || (r2 = String.valueOf(baseResponse.code)) == null) ? "s_unknown" : "s_unknown");
                    h.a((Object) a2, "metricMonitor.addTags(\"e…oString() ?: \"s_unknown\")");
                    a2.a("ReportFailed", kotlin.collections.h.b(Float.valueOf(c.this.c.size()))).a("ReportFailedLength", kotlin.collections.h.b(Float.valueOf(c.this.d))).a("RequestSuccessRate", kotlin.collections.h.b(Float.valueOf(0.0f)));
                }
                return r.a;
            }
        }

        /* compiled from: ProGuard */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "metricMonitor", "Lcom/dianping/monitor/impl/MetricMonitor;", "invoke"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.sankuai.mads.internal.b$c$c  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0573c extends i implements kotlin.jvm.functions.b<l, r> {
            public static ChangeQuickRedirect a;
            public final /* synthetic */ int c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0573c(int i) {
                super(1);
                this.c = i;
            }

            @Override // kotlin.jvm.functions.b
            public final /* synthetic */ r invoke(l lVar) {
                l lVar2 = lVar;
                Object[] objArr = {lVar2};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d5f831e5ec52f5ff4aee9ea07e53e35", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d5f831e5ec52f5ff4aee9ea07e53e35");
                } else {
                    h.b(lVar2, "metricMonitor");
                    com.sankuai.mads.internal.monitor.b bVar = com.sankuai.mads.internal.monitor.b.a;
                    com.sankuai.mads.internal.monitor.b bVar2 = com.sankuai.mads.internal.monitor.b.a;
                    com.sankuai.mads.internal.monitor.b bVar3 = com.sankuai.mads.internal.monitor.b.a;
                    lVar2.a("ReportSuccess", kotlin.collections.h.b(Float.valueOf(c.this.c.size()))).a("ReportSuccessLength", kotlin.collections.h.b(Float.valueOf(c.this.d))).a("RequestSuccessRate", kotlin.collections.h.b(Float.valueOf(1.0f)));
                    if (this.c > 0) {
                        com.sankuai.mads.internal.monitor.b bVar4 = com.sankuai.mads.internal.monitor.b.a;
                        lVar2.a("ReportRemedy", kotlin.collections.h.b(Float.valueOf(this.c)));
                    }
                }
                return r.a;
            }
        }

        public c(List list, int i) {
            this.c = list;
            this.d = i;
        }

        @Override // rx.e
        public final /* synthetic */ void onNext(BaseResponse<String> baseResponse) {
            b.InterfaceC0580b a2;
            BaseResponse<String> baseResponse2 = baseResponse;
            Object[] objArr = {baseResponse2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe5d2b82bd1b48a9a9109073945c0611", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe5d2b82bd1b48a9a9109073945c0611");
            } else if (baseResponse2 == null || baseResponse2.code != 0) {
                a(this.c);
                com.sankuai.mads.internal.monitor.c.b.a(new C0572b(baseResponse2));
            } else {
                com.sankuai.mads.internal.utils.b bVar = com.sankuai.mads.internal.utils.b.b;
                com.sankuai.mads.internal.c cVar = com.sankuai.mads.internal.c.l;
                if (com.sankuai.mads.internal.c.e() && (a2 = com.sankuai.mads.internal.utils.b.a()) != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("eventId[");
                    for (g gVar : this.c) {
                        sb.append(gVar.b.b);
                        sb.append(CommonConstant.Symbol.COMMA);
                    }
                    sb.append("] ");
                    sb.append("upload success");
                    String sb2 = sb.toString();
                    h.a((Object) sb2, "sb.toString()");
                    a2.a(sb2);
                }
                com.sankuai.mads.internal.manager.a aVar = com.sankuai.mads.internal.manager.a.g;
                com.sankuai.mads.internal.manager.a.c().a(this.c.size());
                int i = 0;
                for (g gVar2 : this.c) {
                    i += gVar2.d > 0 ? 1 : 0;
                }
                if (i > 0) {
                    com.sankuai.mads.internal.manager.a aVar2 = com.sankuai.mads.internal.manager.a.g;
                    com.sankuai.mads.internal.manager.a.d().a(i);
                }
                com.sankuai.mads.internal.monitor.c.b.a(new C0573c(i));
            }
        }

        private final void a(List<g> list) {
            b.InterfaceC0580b a2;
            Object[] objArr = {list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63a3bf3a5fb23774e63497be750013a5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63a3bf3a5fb23774e63497be750013a5");
                return;
            }
            com.sankuai.mads.internal.utils.b bVar = com.sankuai.mads.internal.utils.b.b;
            com.sankuai.mads.internal.c cVar = com.sankuai.mads.internal.c.l;
            if (com.sankuai.mads.internal.c.e() && (a2 = com.sankuai.mads.internal.utils.b.a()) != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("eventId[");
                for (g gVar : this.c) {
                    sb.append(gVar.b.b);
                    sb.append(CommonConstant.Symbol.COMMA);
                }
                sb.append("] ");
                sb.append("upload failed... Retry ");
                String sb2 = sb.toString();
                h.a((Object) sb2, "sb.toString()");
                a2.a(sb2);
            }
            b.this.b.a(list);
            if (b.this.c.hasMessages(101)) {
                return;
            }
            Handler handler = b.this.c;
            com.sankuai.mads.internal.horn.a aVar = com.sankuai.mads.internal.horn.a.c;
            handler.sendEmptyMessageDelayed(101, com.sankuai.mads.internal.horn.a.a().b.c());
        }

        @Override // rx.e
        public final void onError(@Nullable Throwable th) {
            Object[] objArr = {th};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0019e0c3993b6d12f97e9b03def901be", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0019e0c3993b6d12f97e9b03def901be");
                return;
            }
            a(this.c);
            com.sankuai.mads.internal.monitor.c.b.a(new a(th));
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/sankuai/mads/internal/AdReportService$Companion;", "", "()V", "MESSAGE_SEND", "", "sdk_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.f fVar) {
            this();
        }
    }
}
