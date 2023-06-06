package com.dianping.eunomia;

import android.os.Parcelable;
import com.dianping.eunomia.m;
import com.dianping.eunomia.model.models.ModuleConfigResponse;
import com.dianping.model.SimpleMsg;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.open.SocialConstants;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.d;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u001fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u0011R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/dianping/eunomia/ModuleService;", "", "()V", "fetchSubscription", "Lrx/Subscription;", "finalHit", "", "handler", "Lcom/dianping/eunomia/ModuleRequestHandler;", "Lcom/dianping/eunomia/ModulesConfig;", "lastFetchTime", "", "getLastFetchTime$eunomia_release", "()J", "setLastFetchTime$eunomia_release", "(J)V", "mapiService", "Lcom/dianping/dataservice/mapi/MApiService;", "getMapiService$eunomia_release", "()Lcom/dianping/dataservice/mapi/MApiService;", "setMapiService$eunomia_release", "(Lcom/dianping/dataservice/mapi/MApiService;)V", SocialConstants.TYPE_REQUEST, "Lcom/dianping/dataservice/mapi/MApiRequest;", "fetch", "", "forceTotal", "disableRetry", "cacheType", "Lcom/dianping/dataservice/mapi/CacheType;", "init", "RetryWithDelay", "eunomia_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class l {
    public static ChangeQuickRedirect a;
    @NotNull
    public static com.dianping.dataservice.mapi.g b;
    public static final l c = new l();
    private static com.dianping.dataservice.mapi.e<ModulesConfig> d;
    private static k<ModulesConfig> e;
    private static boolean f;
    private static long g;
    private static rx.k h;

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<no name provided>", "Lrx/Observable;", "Lcom/dianping/eunomia/ModulesConfig;", HiAnalyticsConstant.Direction.REQUEST, "Lcom/dianping/dataservice/mapi/MApiRequest;", "invoke"}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class c<T, R> implements rx.functions.g<T, rx.d<? extends R>> {
        public static ChangeQuickRedirect a;
        public static final c b = new c();

        @Override // rx.functions.g
        public final /* synthetic */ Object call(Object obj) {
            final com.dianping.dataservice.mapi.e eVar = (com.dianping.dataservice.mapi.e) obj;
            Object[] objArr = {eVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c541d2c71d0c66608638f52f16d483ce", RobustBitConfig.DEFAULT_VALUE)) {
                return (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c541d2c71d0c66608638f52f16d483ce");
            }
            kotlin.jvm.internal.h.b(eVar, HiAnalyticsConstant.Direction.REQUEST);
            rx.d<T> b2 = rx.d.a((d.a) new d.a<ModulesConfig>() { // from class: com.dianping.eunomia.l.c.1
                public static ChangeQuickRedirect a;

                @Override // rx.functions.b
                public final /* synthetic */ void call(Object obj2) {
                    final rx.j jVar = (rx.j) obj2;
                    Object[] objArr2 = {jVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2b9948ac1aaeb6ad7f2c6659855bdf6c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2b9948ac1aaeb6ad7f2c6659855bdf6c");
                        return;
                    }
                    com.dianping.dataservice.mapi.e a2 = l.a(l.c);
                    if (a2 != null) {
                        l lVar = l.c;
                        l.a().abort(a2, l.b(l.c), true);
                    }
                    l lVar2 = l.c;
                    l.d = com.dianping.dataservice.mapi.e.this;
                    l lVar3 = l.c;
                    l.e = new k<ModulesConfig>() { // from class: com.dianping.eunomia.l.c.1.1
                        public static ChangeQuickRedirect b;

                        @Override // com.dianping.eunomia.k
                        public final /* synthetic */ void a(com.dianping.dataservice.mapi.e<ModulesConfig> eVar2, ModulesConfig modulesConfig, int i) {
                            ModulesConfig modulesConfig2 = modulesConfig;
                            Object[] objArr3 = {eVar2, modulesConfig2, Integer.valueOf(i)};
                            ChangeQuickRedirect changeQuickRedirect3 = b;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3d8b0941c7dc4004329fa04d76661e89", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3d8b0941c7dc4004329fa04d76661e89");
                                return;
                            }
                            kotlin.jvm.internal.h.b(eVar2, HiAnalyticsConstant.Direction.REQUEST);
                            if (!kotlin.jvm.internal.h.a(eVar2, l.a(l.c))) {
                                return;
                            }
                            l lVar4 = l.c;
                            l.d = null;
                            if (modulesConfig2 == null) {
                                rx.j.this.onError(new Exception("request failed"));
                                return;
                            }
                            rx.j.this.onNext(modulesConfig2);
                            rx.j.this.onCompleted();
                        }

                        @Override // com.dianping.eunomia.k
                        public final void a(@NotNull com.dianping.dataservice.mapi.e<ModulesConfig> eVar2, @Nullable SimpleMsg simpleMsg, int i) {
                            Object[] objArr3 = {eVar2, simpleMsg, Integer.valueOf(i)};
                            ChangeQuickRedirect changeQuickRedirect3 = b;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "936d5fef371608a411298320ac67a9b4", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "936d5fef371608a411298320ac67a9b4");
                                return;
                            }
                            kotlin.jvm.internal.h.b(eVar2, HiAnalyticsConstant.Direction.REQUEST);
                            if (!kotlin.jvm.internal.h.a(eVar2, l.a(l.c))) {
                                return;
                            }
                            l lVar4 = l.c;
                            l.d = null;
                            rx.j.this.onError(new Exception(simpleMsg != null ? simpleMsg.b() : null));
                        }
                    };
                    l lVar4 = l.c;
                    l.a().exec(l.a(l.c), l.b(l.c));
                }
            }).b(rx.android.schedulers.a.a());
            kotlin.jvm.internal.h.a((Object) b2, "Observable\n             …dSchedulers.mainThread())");
            return b2;
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<no name provided>", "Lrx/Observable;", "Lcom/dianping/eunomia/model/models/ModuleConfigResponse;", "response", "Lcom/dianping/eunomia/ModulesConfig;", "invoke"}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class d<T, R> implements rx.functions.g<T, rx.d<? extends R>> {
        public static ChangeQuickRedirect a;
        public static final d b = new d();

        /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x00c1  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x00d4  */
        @Override // rx.functions.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final /* synthetic */ java.lang.Object call(java.lang.Object r14) {
            /*
                Method dump skipped, instructions count: 272
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dianping.eunomia.l.d.call(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<no name provided>", "", "data", "Lcom/dianping/eunomia/model/models/ModuleConfigResponse;", "invoke"}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class e<T> implements rx.functions.b<ModuleConfigResponse> {
        public static ChangeQuickRedirect a;
        public static final e b = new e();

        @Override // rx.functions.b
        public final /* synthetic */ void call(ModuleConfigResponse moduleConfigResponse) {
            ModuleConfigResponse moduleConfigResponse2 = moduleConfigResponse;
            Object[] objArr = {moduleConfigResponse2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74894100d147a37a303dc54083cafcd2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74894100d147a37a303dc54083cafcd2");
            } else if (moduleConfigResponse2 != null) {
                m mVar = m.d;
                Object[] objArr2 = {moduleConfigResponse2};
                ChangeQuickRedirect changeQuickRedirect2 = m.a;
                if (PatchProxy.isSupport(objArr2, mVar, changeQuickRedirect2, false, "3d5c50b1bc5de976ec3f76d447887224", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, mVar, changeQuickRedirect2, false, "3d5c50b1bc5de976ec3f76d447887224");
                    return;
                }
                kotlin.jvm.internal.h.b(moduleConfigResponse2, "data");
                m.c = new com.dianping.eunomia.b(false, moduleConfigResponse2);
                ModuleConfigPersist moduleConfigPersist = new ModuleConfigPersist();
                moduleConfigPersist.appVersion = m.b;
                moduleConfigPersist.moduleConfigResponse = moduleConfigResponse2;
                Object[] objArr3 = {moduleConfigPersist};
                ChangeQuickRedirect changeQuickRedirect3 = m.a;
                if (PatchProxy.isSupport(objArr3, mVar, changeQuickRedirect3, false, "98670ffd2a8fcd5b795bd712cfc9fbe2", RobustBitConfig.DEFAULT_VALUE)) {
                    ((Boolean) PatchProxy.accessDispatch(objArr3, mVar, changeQuickRedirect3, false, "98670ffd2a8fcd5b795bd712cfc9fbe2")).booleanValue();
                } else {
                    com.dianping.cache.a.a().a("eunomia_moduleconfigfile", (String) null, (Parcelable) moduleConfigPersist, 31539600000L, false);
                }
            }
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<no name provided>", "", "t", "", "invoke"}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class f<T> implements rx.functions.b<Throwable> {
        public static ChangeQuickRedirect a;
        public static final f b = new f();

        @Override // rx.functions.b
        public final /* synthetic */ void call(Throwable th) {
            Throwable th2 = th;
            Object[] objArr = {th2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a3f60ef837705061abb24a39ace9abd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a3f60ef837705061abb24a39ace9abd");
                return;
            }
            kotlin.jvm.internal.h.b(th2, "t");
            if (!l.c(l.c)) {
                l lVar = l.c;
                l.f = true;
                l.c.a(true, true, com.dianping.dataservice.mapi.c.DISABLED);
                h hVar = h.b;
                Class<?> cls = l.c.getClass();
                hVar.a(cls, "fetch:failed finally, use finalHit \nerror message:" + th2.getMessage());
                return;
            }
            h hVar2 = h.b;
            Class<?> cls2 = l.c.getClass();
            hVar2.a(cls2, "fetch:failed finally \nerror message:" + th2.getMessage());
        }
    }

    public static final /* synthetic */ com.dianping.dataservice.mapi.e a(l lVar) {
        return d;
    }

    public static final /* synthetic */ k b(l lVar) {
        return e;
    }

    public static final /* synthetic */ boolean c(l lVar) {
        return f;
    }

    @NotNull
    public static com.dianping.dataservice.mapi.g a() {
        com.dianping.dataservice.mapi.g gVar = b;
        if (gVar == null) {
            kotlin.jvm.internal.h.a("mapiService");
        }
        return gVar;
    }

    public final void a(boolean z, boolean z2, @NotNull com.dianping.dataservice.mapi.c cVar) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "971bf20ff1fa1f467bc83ad22698aaf1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "971bf20ff1fa1f467bc83ad22698aaf1");
            return;
        }
        kotlin.jvm.internal.h.b(cVar, "cacheType");
        if (b == null) {
            return;
        }
        g = System.currentTimeMillis();
        rx.k kVar = h;
        if (kVar != null && !kVar.isUnsubscribed()) {
            kVar.unsubscribe();
        }
        rx.d c2 = rx.d.a((d.a) new b(cVar, z)).b(rx.android.schedulers.a.a()).c(c.b).a(rx.schedulers.a.e()).c(d.b);
        if (!z2) {
            c2 = c2.g(new a(2, 100L));
        }
        h = c2.a(rx.android.schedulers.a.a()).a(e.b, f.b);
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012F\u0010\u0002\u001aB\u0012\u001a\b\u0000\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004 \u0006* \u0012\u001a\b\u0000\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "subscriber", "Lrx/Subscriber;", "Lcom/dianping/dataservice/mapi/MApiRequest;", "Lcom/dianping/eunomia/ModulesConfig;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class b<T> implements d.a<com.dianping.dataservice.mapi.e<ModulesConfig>> {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ com.dianping.dataservice.mapi.c b;
        public final /* synthetic */ boolean c;

        public b(com.dianping.dataservice.mapi.c cVar, boolean z) {
            this.b = cVar;
            this.c = z;
        }

        @Override // rx.functions.b
        public final /* synthetic */ void call(Object obj) {
            rx.d d;
            final rx.j jVar = (rx.j) obj;
            Object[] objArr = {jVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f124e530f25642d4ac5b7d1284257bc4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f124e530f25642d4ac5b7d1284257bc4");
                return;
            }
            final com.dianping.eunomia.model.apimodel.a aVar = new com.dianping.eunomia.model.apimodel.a();
            aVar.f = this.b;
            if (this.c) {
                jVar.onNext(aVar.a());
                jVar.onCompleted();
                return;
            }
            l lVar = l.c;
            m mVar = m.d;
            if (m.a() != null) {
                d = rx.d.a((d.a) a.b);
                kotlin.jvm.internal.h.a((Object) d, "Observable.create { subs…                        }");
            } else {
                m mVar2 = m.d;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = m.a;
                if (PatchProxy.isSupport(objArr2, mVar2, changeQuickRedirect2, false, "ddc9fec6bb358c9adac7ab232d6c7ee1", RobustBitConfig.DEFAULT_VALUE)) {
                    d = (rx.d) PatchProxy.accessDispatch(objArr2, mVar2, changeQuickRedirect2, false, "ddc9fec6bb358c9adac7ab232d6c7ee1");
                } else {
                    d = rx.d.a((d.a) m.a.b).b(rx.schedulers.a.e()).a(rx.android.schedulers.a.a()).d(m.b.b);
                    kotlin.jvm.internal.h.a((Object) d, "Observable\n             …turn c\n                })");
                }
            }
            d.a(new rx.functions.b<com.dianping.eunomia.b>() { // from class: com.dianping.eunomia.l.b.1
                public static ChangeQuickRedirect a;

                @Override // rx.functions.b
                public final /* synthetic */ void call(com.dianping.eunomia.b bVar) {
                    com.dianping.eunomia.b bVar2 = bVar;
                    Object[] objArr3 = {bVar2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e4b83b3cc6e2e8a77431c43e2f20f767", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e4b83b3cc6e2e8a77431c43e2f20f767");
                        return;
                    }
                    kotlin.jvm.internal.h.b(bVar2, com.huawei.hms.opendevice.c.a);
                    if (!bVar2.b) {
                        com.dianping.eunomia.model.apimodel.a.this.c = Long.valueOf(bVar2.c.timeStamp);
                        com.dianping.eunomia.model.apimodel.a.this.d = bVar2.c.md5;
                        com.dianping.eunomia.model.apimodel.a.this.e = Integer.valueOf(bVar2.c.env);
                    }
                    jVar.onNext(com.dianping.eunomia.model.apimodel.a.this.a());
                    jVar.onCompleted();
                }
            }, new rx.functions.b<Throwable>() { // from class: com.dianping.eunomia.l.b.2
                public static ChangeQuickRedirect a;

                @Override // rx.functions.b
                public final /* synthetic */ void call(Throwable th) {
                    Throwable th2 = th;
                    Object[] objArr3 = {th2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b71a14a503f4270e14bd207786a42cec", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b71a14a503f4270e14bd207786a42cec");
                        return;
                    }
                    kotlin.jvm.internal.h.b(th2, "t");
                    rx.j.this.onError(th2);
                }
            });
        }

        /* compiled from: ProGuard */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012.\u0010\u0002\u001a*\u0012\u000e\b\u0000\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0014\u0012\u000e\b\u0000\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "subscriber", "Lrx/Subscriber;", "Lcom/dianping/eunomia/ModuleConfigCache;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 13})
        /* loaded from: classes.dex */
        public static final class a<T> implements d.a<T> {
            public static ChangeQuickRedirect a;
            public static final a b = new a();

            @Override // rx.functions.b
            public final /* synthetic */ void call(Object obj) {
                rx.j jVar = (rx.j) obj;
                Object[] objArr = {jVar};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b8ef0566398bb2700d97ba3e5f19637", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b8ef0566398bb2700d97ba3e5f19637");
                    return;
                }
                m mVar = m.d;
                jVar.onNext(m.a());
                jVar.onCompleted();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0002\u0018\u00002\u001a\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001c\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u00022\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/dianping/eunomia/ModuleService$RetryWithDelay;", "Lrx/functions/Func1;", "Lrx/Observable;", "", "maxCount", "", "baseDelay", "", "(IJ)V", "count", "call", "observable", "eunomia_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes.dex */
    public static final class a implements rx.functions.g<rx.d<? extends Throwable>, rx.d<?>> {
        public static ChangeQuickRedirect a;
        int b;
        final int c;
        final long d;

        /* compiled from: ProGuard */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0002\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<no name provided>", "Lrx/Observable;", "", "t", "", "invoke"}, k = 3, mv = {1, 1, 13})
        /* renamed from: com.dianping.eunomia.l$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0059a<T, R> implements rx.functions.g<T, rx.d<? extends R>> {
            public static ChangeQuickRedirect a;

            public C0059a() {
            }

            @Override // rx.functions.g
            public final /* synthetic */ Object call(Object obj) {
                Throwable th = (Throwable) obj;
                Object[] objArr = {th};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07cfaf7347fbe0aba66848c20c410e72", RobustBitConfig.DEFAULT_VALUE)) {
                    return (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07cfaf7347fbe0aba66848c20c410e72");
                }
                kotlin.jvm.internal.h.b(th, "t");
                a aVar = a.this;
                aVar.b++;
                if (aVar.b <= a.this.c) {
                    h.b.a(l.c.getClass(), "RetryWithDelay:count " + a.this.b + " \nerror message:" + th.getMessage());
                    return rx.d.b((long) Math.pow(a.this.d, a.this.b), TimeUnit.MILLISECONDS);
                }
                return rx.d.a(th);
            }
        }

        public a(int i, long j) {
            Object[] objArr = {2, 100L};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3f216850d373a2f4c33d1c1184b8b69", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3f216850d373a2f4c33d1c1184b8b69");
                return;
            }
            this.c = 2;
            this.d = 100L;
        }

        @Override // rx.functions.g
        public final /* synthetic */ rx.d<?> call(rx.d<? extends Throwable> dVar) {
            rx.d<? extends Throwable> dVar2 = dVar;
            Object[] objArr = {dVar2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "728d0fb2b3119e3dbb6ec2e8d910d0da", RobustBitConfig.DEFAULT_VALUE)) {
                return (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "728d0fb2b3119e3dbb6ec2e8d910d0da");
            }
            kotlin.jvm.internal.h.b(dVar2, "observable");
            rx.d c = dVar2.c(new C0059a());
            kotlin.jvm.internal.h.a((Object) c, "observable\n             …t)\n                    })");
            return c;
        }
    }
}
