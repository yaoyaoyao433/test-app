package com.sankuai.mads;

import android.app.Application;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.locate.loader.LocationStrategy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.mads.internal.c;
import com.sankuai.mads.internal.horn.a;
import com.sankuai.mads.internal.manager.a;
import com.sankuai.mads.internal.utils.b;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0010"}, d2 = {"Lcom/sankuai/mads/Mads;", "", "()V", "getDefaultReporter", "Lcom/sankuai/mads/MadsReporter;", "install", "", "application", "Landroid/app/Application;", "madsConfig", "Lkotlin/Function0;", "Lcom/sankuai/mads/Mads$MadsConfig;", "report", "event", "Lcom/sankuai/mads/Event;", "MadsConfig", "sdk_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public static final c b = new c();

    @JvmStatic
    @JvmOverloads
    public static final void a(@NotNull Application application, @NotNull kotlin.jvm.functions.a<a> aVar) {
        Map<String, String> a2;
        Object[] objArr = {application, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "829eb63f6c1bdfc010c5fba9452132f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "829eb63f6c1bdfc010c5fba9452132f1");
            return;
        }
        kotlin.jvm.internal.h.b(application, "application");
        kotlin.jvm.internal.h.b(aVar, "madsConfig");
        com.sankuai.mads.internal.c cVar = com.sankuai.mads.internal.c.l;
        Object[] objArr2 = {application, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.mads.internal.c.a;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "f7490748b6b26b1aa0af5e6277884e5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "f7490748b6b26b1aa0af5e6277884e5f");
        } else {
            kotlin.jvm.internal.h.b(application, "application");
            kotlin.jvm.internal.h.b(aVar, "madsConfig");
            if (com.sankuai.mads.internal.c.c == null) {
                com.sankuai.mads.internal.c.c = application;
                com.sankuai.mads.internal.c.d = com.sankuai.mads.internal.utils.a.a(application);
                String packageName = application.getPackageName();
                kotlin.jvm.internal.h.a((Object) packageName, "application.packageName");
                com.sankuai.mads.internal.c.k = packageName;
                a invoke = aVar.invoke();
                com.sankuai.mads.internal.c.f = invoke.d;
                Integer num = invoke.b;
                com.sankuai.mads.internal.c.e = num != null ? num.intValue() : 404;
                com.sankuai.mads.a aVar2 = invoke.c;
                com.sankuai.mads.internal.c.g = aVar2 != null ? new com.sankuai.mads.internal.cache.b<>(new c.b(aVar2), 180000L) : null;
                com.sankuai.mads.a aVar3 = invoke.c;
                com.sankuai.mads.internal.c.i = aVar3 != null && (com.sankuai.mads.internal.c.d || new c.C0574c(aVar3).invoke().booleanValue());
                com.sankuai.mads.internal.c.h = new com.sankuai.mads.internal.cache.b<>(new c.d(application), LocationStrategy.LOCATION_TIMEOUT);
                b.a.C0579a c0579a = b.a.b;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = b.a.C0579a.a;
                if (PatchProxy.isSupport(objArr3, c0579a, changeQuickRedirect3, false, "18726b62f85a1101d3ff58fbfbc92e13", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, c0579a, changeQuickRedirect3, false, "18726b62f85a1101d3ff58fbfbc92e13");
                } else {
                    com.sankuai.mads.internal.utils.b bVar = com.sankuai.mads.internal.utils.b.b;
                    com.sankuai.mads.internal.utils.b.a(new b.a());
                }
                com.sankuai.mads.internal.horn.a aVar4 = com.sankuai.mads.internal.horn.a.c;
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.mads.internal.horn.a.a;
                if (PatchProxy.isSupport(objArr4, aVar4, changeQuickRedirect4, false, "ae8959c9cf6d92e5cef0554bb80e729c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, aVar4, changeQuickRedirect4, false, "ae8959c9cf6d92e5cef0554bb80e729c");
                } else {
                    a.d dVar = a.d.b;
                    HashMap hashMap = new HashMap();
                    com.sankuai.mads.internal.c cVar2 = com.sankuai.mads.internal.c.l;
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.mads.internal.c.a;
                    String str = (String) (PatchProxy.isSupport(objArr5, cVar2, changeQuickRedirect5, false, "8a19cc9bb5f7b5d31ab02af9f631dd64", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr5, cVar2, changeQuickRedirect5, false, "8a19cc9bb5f7b5d31ab02af9f631dd64") : com.sankuai.mads.internal.c.j.a());
                    if (str != null) {
                        hashMap.put("uuid", str);
                    }
                    com.sankuai.mads.internal.c cVar3 = com.sankuai.mads.internal.c.l;
                    com.sankuai.mads.internal.cache.b<Map<String, String>> c = com.sankuai.mads.internal.c.c();
                    if (c != null && (a2 = c.a()) != null) {
                        hashMap.putAll(a2);
                    }
                    Horn.register("ad_mads", dVar, hashMap);
                }
                com.sankuai.mads.internal.manager.a aVar5 = com.sankuai.mads.internal.manager.a.g;
                Object[] objArr6 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.mads.internal.manager.a.a;
                if (PatchProxy.isSupport(objArr6, aVar5, changeQuickRedirect6, false, "f5426ae91c0003f92cec973607fe5df6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, aVar5, changeQuickRedirect6, false, "f5426ae91c0003f92cec973607fe5df6");
                } else {
                    com.sankuai.mads.internal.utils.d dVar2 = com.sankuai.mads.internal.utils.d.f;
                    Object[] objArr7 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.mads.internal.utils.d.a;
                    int intValue = PatchProxy.isSupport(objArr7, dVar2, changeQuickRedirect7, false, "c26daf16384d3a4e1695d08ecd3c126b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr7, dVar2, changeQuickRedirect7, false, "c26daf16384d3a4e1695d08ecd3c126b")).intValue() : ((Number) com.sankuai.mads.internal.utils.d.c.getValue(dVar2, com.sankuai.mads.internal.utils.d.b[1])).intValue();
                    com.sankuai.mads.internal.utils.d dVar3 = com.sankuai.mads.internal.utils.d.f;
                    Object[] objArr8 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect8 = com.sankuai.mads.internal.utils.d.a;
                    int intValue2 = PatchProxy.isSupport(objArr8, dVar3, changeQuickRedirect8, false, "c04ec186c622a4a345d5d1575bbf559b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr8, dVar3, changeQuickRedirect8, false, "c04ec186c622a4a345d5d1575bbf559b")).intValue() : ((Number) com.sankuai.mads.internal.utils.d.d.getValue(dVar3, com.sankuai.mads.internal.utils.d.b[2])).intValue();
                    com.sankuai.mads.internal.utils.d dVar4 = com.sankuai.mads.internal.utils.d.f;
                    Object[] objArr9 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect9 = com.sankuai.mads.internal.utils.d.a;
                    com.sankuai.mads.internal.monitor.c.b.a(new a.d(intValue, intValue2, PatchProxy.isSupport(objArr9, dVar4, changeQuickRedirect9, false, "ec58a56a895105ce6b0fabc086f9515b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr9, dVar4, changeQuickRedirect9, false, "ec58a56a895105ce6b0fabc086f9515b")).intValue() : ((Number) com.sankuai.mads.internal.utils.d.e.getValue(dVar4, com.sankuai.mads.internal.utils.d.b[3])).intValue()));
                    com.sankuai.mads.internal.horn.a aVar6 = com.sankuai.mads.internal.horn.a.c;
                    a.b bVar2 = com.sankuai.mads.internal.horn.a.a().b;
                    long j = bVar2.e <= 0 ? 20 : bVar2.e;
                    Object[] objArr10 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect10 = com.sankuai.mads.internal.manager.a.a;
                    ((ScheduledExecutorService) (PatchProxy.isSupport(objArr10, aVar5, changeQuickRedirect10, false, "c4ef9582f5d5eaf77cc331c2f9655de4", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr10, aVar5, changeQuickRedirect10, false, "c4ef9582f5d5eaf77cc331c2f9655de4") : com.sankuai.mads.internal.manager.a.f.a())).scheduleWithFixedDelay(new com.sankuai.mads.internal.manager.b(new a.e(aVar5)), j, j, TimeUnit.SECONDS);
                }
            }
        }
        com.sankuai.mads.internal.utils.b.a(com.sankuai.mads.internal.utils.b.b, "Mads install");
        b.InterfaceC0580b a3 = com.sankuai.mads.internal.utils.b.a();
        if (a3 != null) {
            a3.b("Mads install");
        }
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B1\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/sankuai/mads/Mads$MadsConfig;", "", "appId", "", "isDevelop", "", "commonParameters", "Lcom/sankuai/mads/CommonParameters;", "defaultReporter", "Lcom/sankuai/mads/MadsReporter;", "(Ljava/lang/Integer;ZLcom/sankuai/mads/CommonParameters;Lcom/sankuai/mads/MadsReporter;)V", "getAppId", "()Ljava/lang/Integer;", "setAppId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getCommonParameters", "()Lcom/sankuai/mads/CommonParameters;", "setCommonParameters", "(Lcom/sankuai/mads/CommonParameters;)V", "getDefaultReporter", "()Lcom/sankuai/mads/MadsReporter;", "setDefaultReporter", "(Lcom/sankuai/mads/MadsReporter;)V", "()Z", "setDevelop", "(Z)V", "sdk_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes3.dex */
    public static final class a {
        public static ChangeQuickRedirect a;
        @Nullable
        public Integer b;
        @Nullable
        public com.sankuai.mads.a c;
        @NotNull
        public d d;
        private boolean e;

        @JvmOverloads
        public a(@NotNull d dVar) {
            this(null, false, null, dVar, 7, null);
            Object[] objArr = {dVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b067c602ce55c3fdbfcb699b72d85b2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b067c602ce55c3fdbfcb699b72d85b2");
            }
        }

        @JvmOverloads
        private a(@Nullable Integer num, boolean z, @Nullable com.sankuai.mads.a aVar, @NotNull d dVar) {
            kotlin.jvm.internal.h.b(dVar, "defaultReporter");
            Object[] objArr = {num, Byte.valueOf(z ? (byte) 1 : (byte) 0), aVar, dVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5a72ed01a27baba0c3b4c6d89e6ab18", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5a72ed01a27baba0c3b4c6d89e6ab18");
                return;
            }
            this.b = num;
            this.e = z;
            this.c = aVar;
            this.d = dVar;
        }

        private /* synthetic */ a(Integer num, boolean z, com.sankuai.mads.a aVar, d dVar, int i, kotlin.jvm.internal.f fVar) {
            this(null, false, null, dVar);
        }
    }

    @JvmStatic
    public static final void a(@NotNull b bVar) {
        com.sankuai.mads.internal.d dVar;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d281d999dff93365f76bd1e3fee98851", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d281d999dff93365f76bd1e3fee98851");
            return;
        }
        kotlin.jvm.internal.h.b(bVar, "event");
        com.sankuai.mads.internal.c cVar = com.sankuai.mads.internal.c.l;
        Object[] objArr2 = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.mads.internal.c.a;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "8e822404a7fda18d23436e0cdae1b60e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "8e822404a7fda18d23436e0cdae1b60e");
            return;
        }
        kotlin.jvm.internal.h.b(bVar, "event");
        if (com.sankuai.mads.internal.c.d) {
            if (!(com.sankuai.mads.internal.c.f != null)) {
                throw new IllegalStateException("defaultReporter 为空，请在 Mads初始化调用 install 时的 MadsConfig 中传入 defaultReporter 或自建 MadsReporter".toString());
            }
        }
        d dVar2 = com.sankuai.mads.internal.c.f;
        if (dVar2 != null) {
            Object[] objArr3 = {bVar};
            ChangeQuickRedirect changeQuickRedirect3 = d.a;
            if (PatchProxy.isSupport(objArr3, dVar2, changeQuickRedirect3, false, "618e106b2e4a3cf60c21d6aeb0d0a000", RobustBitConfig.DEFAULT_VALUE)) {
                dVar = (f) PatchProxy.accessDispatch(objArr3, dVar2, changeQuickRedirect3, false, "618e106b2e4a3cf60c21d6aeb0d0a000");
            } else {
                kotlin.jvm.internal.h.b(bVar, "event");
                dVar = new com.sankuai.mads.internal.d(dVar2, bVar);
            }
            if (dVar != null) {
                dVar.a();
            }
        }
    }
}
