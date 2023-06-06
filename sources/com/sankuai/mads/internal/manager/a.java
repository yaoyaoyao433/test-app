package com.sankuai.mads.internal.manager;

import com.dianping.monitor.impl.l;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.r;
import kotlin.reflect.i;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001#B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u001e\u001a\u00020\u001cJ\u0006\u0010\u001f\u001a\u00020\u001cJ\u000e\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\"R!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000bR\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/sankuai/mads/internal/manager/DataIndicatorsManager;", "", "()V", "allDataMetrics", "Ljava/util/ArrayList;", "Lcom/sankuai/mads/internal/manager/DataIndicatorsManager$DataMetrics;", "Lkotlin/collections/ArrayList;", "getAllDataMetrics", "()Ljava/util/ArrayList;", "discardOverflow", "getDiscardOverflow", "()Lcom/sankuai/mads/internal/manager/DataIndicatorsManager$DataMetrics;", "discardRetry", "getDiscardRetry", "eventCount", "getEventCount", "eventSuccessCount", "getEventSuccessCount", "executor", "Ljava/util/concurrent/ScheduledExecutorService;", "getExecutor", "()Ljava/util/concurrent/ScheduledExecutorService;", "executor$delegate", "Lkotlin/Lazy;", "remedyCount", "getRemedyCount", "setLastEvent", "Lkotlin/Function0;", "", "setLastNotUpload", "report", "reportNotUpload", "setLastQueueLength", "value", "", "DataMetrics", "sdk_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public static final /* synthetic */ i[] b = {u.a(new s(u.a(a.class), "executor", "getExecutor()Ljava/util/concurrent/ScheduledExecutorService;"))};
    public static final a g = new a();
    static final kotlin.jvm.functions.a<r> c = g.b;
    static final kotlin.jvm.functions.a<r> d = f.b;
    @NotNull
    static final ArrayList<C0577a> e = new ArrayList<>();
    @NotNull
    private static final C0577a h = new C0577a("Event", c, d);
    @NotNull
    private static final C0577a i = new C0577a("EventSuccess", c);
    @NotNull
    private static final C0577a j = new C0577a("Remedy", new kotlin.jvm.functions.a[0]);
    @NotNull
    private static final C0577a k = new C0577a("DiscardOverflow", c);
    @NotNull
    private static final C0577a l = new C0577a("DiscardRetry", c);
    public static final kotlin.d f = kotlin.e.a(b.b);

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/util/concurrent/ScheduledExecutorService;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.jvm.internal.i implements kotlin.jvm.functions.a<ScheduledExecutorService> {
        public static ChangeQuickRedirect a;
        public static final b b = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.a
        public final /* synthetic */ ScheduledExecutorService invoke() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9618ab9357cc5e7f848738adef78d24", RobustBitConfig.DEFAULT_VALUE) ? (ScheduledExecutorService) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9618ab9357cc5e7f848738adef78d24") : com.sankuai.android.jarvis.c.c("mads_data_metrics");
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "metricMonitor", "Lcom/dianping/monitor/impl/MetricMonitor;", "invoke"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes3.dex */
    public static final class c extends kotlin.jvm.internal.i implements kotlin.jvm.functions.b<l, r> {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ HashMap b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(HashMap hashMap) {
            super(1);
            this.b = hashMap;
        }

        @Override // kotlin.jvm.functions.b
        public final /* synthetic */ r invoke(l lVar) {
            l lVar2 = lVar;
            Object[] objArr = {lVar2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e70e340299f0ff3277eebad677fb876", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e70e340299f0ff3277eebad677fb876");
            } else {
                h.b(lVar2, "metricMonitor");
                for (Map.Entry entry : this.b.entrySet()) {
                    com.sankuai.mads.internal.monitor.b bVar = com.sankuai.mads.internal.monitor.b.a;
                    lVar2.a((String) entry.getKey(), kotlin.collections.h.b(Float.valueOf(((Number) entry.getValue()).floatValue())));
                }
            }
            return r.a;
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "metricMonitor", "Lcom/dianping/monitor/impl/MetricMonitor;", "invoke"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes3.dex */
    public static final class d extends kotlin.jvm.internal.i implements kotlin.jvm.functions.b<l, r> {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i, int i2, int i3) {
            super(1);
            this.b = i;
            this.c = i2;
            this.d = i3;
        }

        @Override // kotlin.jvm.functions.b
        public final /* synthetic */ r invoke(l lVar) {
            l lVar2 = lVar;
            Object[] objArr = {lVar2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c381ec10ba85fb4179da1cc1ca507e8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c381ec10ba85fb4179da1cc1ca507e8");
            } else {
                h.b(lVar2, "metricMonitor");
                if (this.b != 0) {
                    com.sankuai.mads.internal.monitor.b bVar = com.sankuai.mads.internal.monitor.b.a;
                    lVar2.a("LastNotUpload", kotlin.collections.h.b(Float.valueOf(this.b)));
                    com.sankuai.mads.internal.utils.d.f.a(0);
                }
                if (this.c != 0) {
                    com.sankuai.mads.internal.monitor.b bVar2 = com.sankuai.mads.internal.monitor.b.a;
                    lVar2.a("LastEvent", kotlin.collections.h.b(Float.valueOf(this.c)));
                    com.sankuai.mads.internal.utils.d.f.b(0);
                }
                if (this.d != 0) {
                    com.sankuai.mads.internal.monitor.b bVar3 = com.sankuai.mads.internal.monitor.b.a;
                    lVar2.a("LastQueueLength", kotlin.collections.h.b(Float.valueOf(this.d)));
                    com.sankuai.mads.internal.utils.d.f.c(0);
                }
            }
            return r.a;
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class e extends kotlin.jvm.internal.g implements kotlin.jvm.functions.a<r> {
        public static ChangeQuickRedirect a;

        public e(a aVar) {
            super(0, aVar);
        }

        @Override // kotlin.jvm.internal.b, kotlin.reflect.b
        public final String getName() {
            return "report";
        }

        @Override // kotlin.jvm.internal.b
        public final kotlin.reflect.d getOwner() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aee2a0452f29306796ed1331df1b0671", RobustBitConfig.DEFAULT_VALUE) ? (kotlin.reflect.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aee2a0452f29306796ed1331df1b0671") : u.a(a.class);
        }

        @Override // kotlin.jvm.internal.b
        public final String getSignature() {
            return "report()V";
        }

        @Override // kotlin.jvm.functions.a
        public final /* synthetic */ r invoke() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "351cd4541430ba9934b8a55d4fb2b7da", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "351cd4541430ba9934b8a55d4fb2b7da");
            } else {
                a aVar = (a) this.receiver;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a.a;
                if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "d6a9b0c0ed6883589aa9d4a7379be4e8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "d6a9b0c0ed6883589aa9d4a7379be4e8");
                } else {
                    HashMap hashMap = new HashMap();
                    for (C0577a c0577a : a.e) {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = C0577a.a;
                        int intValue = PatchProxy.isSupport(objArr3, c0577a, changeQuickRedirect3, false, "4fa40aa2010f73cd68dbaf5b8c1456ee", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr3, c0577a, changeQuickRedirect3, false, "4fa40aa2010f73cd68dbaf5b8c1456ee")).intValue() : c0577a.b.getAndSet(0);
                        if (intValue > 0) {
                            hashMap.put(c0577a.c, Integer.valueOf(intValue));
                        }
                    }
                    if (hashMap.size() > 0) {
                        com.sankuai.mads.internal.monitor.c.b.a(new c(hashMap));
                    }
                    a.c.invoke();
                    a.d.invoke();
                }
            }
            return r.a;
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes3.dex */
    public static final class f extends kotlin.jvm.internal.i implements kotlin.jvm.functions.a<r> {
        public static ChangeQuickRedirect a;
        public static final f b = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.a
        public final /* synthetic */ r invoke() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1904b9bcb3a31e801516378a9c0061c7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1904b9bcb3a31e801516378a9c0061c7");
            } else {
                com.sankuai.mads.internal.utils.d dVar = com.sankuai.mads.internal.utils.d.f;
                a aVar = a.g;
                dVar.b(a.b().a());
            }
            return r.a;
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes3.dex */
    public static final class g extends kotlin.jvm.internal.i implements kotlin.jvm.functions.a<r> {
        public static ChangeQuickRedirect a;
        public static final g b = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.a
        public final /* synthetic */ r invoke() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6de9569f9418ed01a49c203ea2b78c5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6de9569f9418ed01a49c203ea2b78c5");
            } else {
                com.sankuai.mads.internal.utils.d dVar = com.sankuai.mads.internal.utils.d.f;
                a aVar = a.g;
                int a2 = a.b().a();
                a aVar2 = a.g;
                int a3 = a2 - a.c().a();
                a aVar3 = a.g;
                int a4 = a3 - a.e().a();
                a aVar4 = a.g;
                dVar.a(a4 - a.f().a());
            }
            return r.a;
        }
    }

    public final void a(int i2) {
        Object[] objArr = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2e4f8700ce96593df7b292f859a5729", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2e4f8700ce96593df7b292f859a5729");
        } else {
            com.sankuai.mads.internal.utils.d.f.c(i2);
        }
    }

    @NotNull
    public static ArrayList<C0577a> a() {
        return e;
    }

    @NotNull
    public static C0577a b() {
        return h;
    }

    @NotNull
    public static C0577a c() {
        return i;
    }

    @NotNull
    public static C0577a d() {
        return j;
    }

    @NotNull
    public static C0577a e() {
        return k;
    }

    @NotNull
    public static C0577a f() {
        return l;
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u001e\u0010\u0004\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005\"\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fJ\u0010\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u000fR\u001e\u0010\u0004\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/sankuai/mads/internal/manager/DataIndicatorsManager$DataMetrics;", "", "metricsKey", "", "increaseCallback", "", "Lkotlin/Function0;", "", "(Ljava/lang/String;[Lkotlin/jvm/functions/Function0;)V", "[Lkotlin/jvm/functions/Function0;", Constants.METRICS, "Ljava/util/concurrent/atomic/AtomicInteger;", "getMetricsKey", "()Ljava/lang/String;", "get", "", "getAndReset", "increase", "delta", "sdk_release"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.sankuai.mads.internal.manager.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0577a {
        public static ChangeQuickRedirect a;
        final AtomicInteger b;
        @NotNull
        final String c;
        private final kotlin.jvm.functions.a<r>[] d;

        public C0577a(@NotNull String str, @NotNull kotlin.jvm.functions.a<r>... aVarArr) {
            h.b(str, "metricsKey");
            h.b(aVarArr, "increaseCallback");
            Object[] objArr = {str, aVarArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9953f5eae0355a67e7850727b620bcd4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9953f5eae0355a67e7850727b620bcd4");
                return;
            }
            this.c = str;
            this.d = aVarArr;
            a aVar = a.g;
            a.a().add(this);
            this.b = new AtomicInteger();
        }

        public final void a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d98362003eaac31106581dbd7bb26252", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d98362003eaac31106581dbd7bb26252");
                return;
            }
            synchronized (this) {
                this.b.addAndGet(i);
                kotlin.jvm.functions.a<r>[] aVarArr = this.d;
                if (aVarArr != null) {
                    for (kotlin.jvm.functions.a<r> aVar : aVarArr) {
                        aVar.invoke();
                    }
                }
                r rVar = r.a;
            }
        }

        public final int a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5722b9eae7640a9f240c3147ca754feb", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5722b9eae7640a9f240c3147ca754feb")).intValue() : this.b.get();
        }
    }
}
