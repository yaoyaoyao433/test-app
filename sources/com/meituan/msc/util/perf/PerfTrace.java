package com.meituan.msc.util.perf;

import android.content.Context;
import android.support.annotation.Keep;
import com.meituan.msc.modules.reporter.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class PerfTrace {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final j controller = new j();
    private static final i onlineWrapper = new i(new PerfEventRecorder(), new h());
    private static final i jsOnlineWrapper = new i(new PerfEventRecorder(), new h());
    private static final f jsOfflineWrapper = new f(new PerfEventRecorder(), new h(), controller);
    private static final f offlineWrapper = new f(new PerfEventRecorder(), new h(), controller);
    private static final f offlineMethodWrapper = new f(new PerfEventRecorder(false), new h(), controller);
    private static Boolean isGenerating = null;
    private static final ExecutorService sExecutor = com.sankuai.android.jarvis.c.a("msc-perf-recorder");

    public static ExecutorService getExecutor() {
        return sExecutor;
    }

    public static void enterPerfMode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "806906679b8903934e7da5e2f69d0ee7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "806906679b8903934e7da5e2f69d0ee7");
            return;
        }
        j jVar = controller;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = j.a;
        if (PatchProxy.isSupport(objArr2, jVar, changeQuickRedirect3, false, "c1f35894e1bffe31c97bbdf6ca720561", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, jVar, changeQuickRedirect3, false, "c1f35894e1bffe31c97bbdf6ca720561");
        } else {
            jVar.b.getAndSet(true);
        }
    }

    public static void exitPerfMode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "dc3b8d8bc8426b5559a3f9db6d556c64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "dc3b8d8bc8426b5559a3f9db6d556c64");
            return;
        }
        j jVar = controller;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = j.a;
        if (PatchProxy.isSupport(objArr2, jVar, changeQuickRedirect3, false, "8d9c88342e0f38cbe89ac7274f2c6f72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, jVar, changeQuickRedirect3, false, "8d9c88342e0f38cbe89ac7274f2c6f72");
        } else {
            jVar.b.getAndSet(false);
        }
    }

    public static boolean isInPerfMode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "74a1e4be8c5690d31a421917221572d0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "74a1e4be8c5690d31a421917221572d0")).booleanValue() : controller.a();
    }

    public static i online() {
        return onlineWrapper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void clearCurrentPageEvents(PerfEventRecorder perfEventRecorder) {
        Object[] objArr = {perfEventRecorder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3e03957921583ea775b8493941f32908", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3e03957921583ea775b8493941f32908");
            return;
        }
        onlineWrapper.a();
        jsOnlineWrapper.a();
        jsOfflineWrapper.a();
        offlineWrapper.a();
        offlineMethodWrapper.a();
        if (perfEventRecorder != null) {
            perfEventRecorder.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void reportOnlineEventsSync(PerfEventRecorder perfEventRecorder, c cVar) {
        Object[] objArr = {perfEventRecorder, cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6a94457f310833bc69d340e92714ddd6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6a94457f310833bc69d340e92714ddd6");
            return;
        }
        if (perfEventRecorder != null) {
            perfEventRecorder.a(cVar);
        }
        jsOnlineWrapper.a(cVar);
        online().a(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void reportOfflineEventsSync() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1f5566a4c230031cb4f0b0e273bdf1ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1f5566a4c230031cb4f0b0e273bdf1ed");
            return;
        }
        jsOfflineWrapper.a((c) null);
        offlineWrapper.a((c) null);
        offlineMethodWrapper.a((c) null);
    }

    public static void reportCurrentPageEvents(final PerfEventRecorder perfEventRecorder, final c cVar) {
        Object[] objArr = {perfEventRecorder, cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2efe69bb5262a0a0f5d12b9c289d230f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2efe69bb5262a0a0f5d12b9c289d230f");
        } else {
            sExecutor.execute(new Runnable() { // from class: com.meituan.msc.util.perf.PerfTrace.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6188e179db050301111dca7f22200917", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6188e179db050301111dca7f22200917");
                        return;
                    }
                    o.a("reportCurrentPageEvents", new Object[0]);
                    PerfTrace.reportOnlineEventsSync(PerfEventRecorder.this, cVar);
                    if (PerfTrace.isInPerfMode()) {
                        PerfTrace.reportOfflineEventsSync();
                    }
                }
            });
        }
    }

    public static String buildEventName(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "93318e2102077cd99e8f63adf97c4924", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "93318e2102077cd99e8f63adf97c4924");
        }
        return str + "/" + str2;
    }

    public static String buildEventName(String str, String str2, int i) {
        Object[] objArr = {str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "039ad86b431f2cda59e2bf474e20c659", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "039ad86b431f2cda59e2bf474e20c659");
        }
        return str + "@" + Integer.toHexString(i) + CommonConstant.Symbol.DOT + str2;
    }

    public static synchronized void generatePerfettoTraceFile(final Context context, final PerfEventRecorder perfEventRecorder) {
        synchronized (PerfTrace.class) {
            Object[] objArr = {context, perfEventRecorder};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "047f69bb4fea409e866c24f60d65a72b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "047f69bb4fea409e866c24f60d65a72b");
            } else if (isGenerating != null) {
            } else {
                isGenerating = Boolean.TRUE;
                sExecutor.execute(new Runnable() { // from class: com.meituan.msc.util.perf.PerfTrace.2
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e0306f29ee7da08c026d3662d5b570ca", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e0306f29ee7da08c026d3662d5b570ca");
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        if (PerfEventRecorder.this != null) {
                            arrayList.addAll(PerfEventRecorder.this.b());
                        }
                        o.a("page:", Integer.valueOf(arrayList.size()));
                        arrayList.addAll(PerfTrace.onlineWrapper.b());
                        o.a("page+online:", Integer.valueOf(arrayList.size()));
                        arrayList.addAll(PerfTrace.jsOnlineWrapper.b());
                        o.a("page+online+jsOnline:", Integer.valueOf(arrayList.size()));
                        arrayList.addAll(PerfTrace.jsOfflineWrapper.b());
                        o.a("page+online+jsOnline+jsOffline:", Integer.valueOf(arrayList.size()));
                        arrayList.addAll(PerfTrace.offlineWrapper.b());
                        o.a("page+online+jsOnline+jsOffline+offline:", Integer.valueOf(arrayList.size()));
                        arrayList.addAll(PerfTrace.offlineMethodWrapper.b());
                        o.a("page+online+jsOnline+jsOffline+offline+offlineMethod:", Integer.valueOf(arrayList.size()));
                        o.b("generatePerfettoTraceFile", Integer.valueOf(arrayList.size()));
                        com.meituan.msc.util.perf.generator.a.a(context, arrayList);
                        o.c("generatePerfettoTraceFile", Integer.valueOf(arrayList.size()));
                        PerfTrace.clearCurrentPageEvents(PerfEventRecorder.this);
                        Boolean unused = PerfTrace.isGenerating = Boolean.FALSE;
                    }
                });
            }
        }
    }

    public static synchronized void beforeActivityCreate(Context context) {
        synchronized (PerfTrace.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7d8788765067757804fae58ec8b81e0a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7d8788765067757804fae58ec8b81e0a");
                return;
            }
            o.a("beforeActivityCreate", context);
            if (isGenerating != null && !isGenerating.booleanValue()) {
                isGenerating = null;
            }
        }
    }

    public static synchronized void afterActivityDestroy(Context context, PerfEventRecorder perfEventRecorder) {
        synchronized (PerfTrace.class) {
            Object[] objArr = {context, perfEventRecorder};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "963af10a053577ac41828aa83ca67f27", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "963af10a053577ac41828aa83ca67f27");
                return;
            }
            o.a("afterActivityDestroy", context);
            generatePerfettoTraceFile(context, perfEventRecorder);
        }
    }

    public static void methodBegin(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9e5432db8936047db0adb705b619a91d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9e5432db8936047db0adb705b619a91d");
        } else {
            offlineMethodWrapper.a(buildEventName(str, str2));
        }
    }

    public static void methodEnd(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1aa1efa022bbb198eea9352b9483b360", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1aa1efa022bbb198eea9352b9483b360");
        } else {
            offlineMethodWrapper.b(buildEventName(str, str2));
        }
    }

    public static void methodBegin(String str, String str2, int i) {
        Object[] objArr = {str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cfa61efc434f8b497ffc2b0bd34289a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cfa61efc434f8b497ffc2b0bd34289a7");
        } else {
            offlineMethodWrapper.a(buildEventName(str, str2, i));
        }
    }

    public static void methodEnd(String str, String str2, int i) {
        Object[] objArr = {str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7cc67ec3525c71069fd81cfc698a736b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7cc67ec3525c71069fd81cfc698a736b");
        } else {
            offlineMethodWrapper.b(buildEventName(str, str2, i));
        }
    }

    public static l begin(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ec45ef563d0ce7b1a361fa10d48ba0c1", RobustBitConfig.DEFAULT_VALUE) ? (l) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ec45ef563d0ce7b1a361fa10d48ba0c1") : offlineWrapper.a(str);
    }

    public static l end(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fc57add1ea52b6a7eea48b874e88a08c", RobustBitConfig.DEFAULT_VALUE) ? (l) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fc57add1ea52b6a7eea48b874e88a08c") : offlineWrapper.b(str);
    }

    public static l duration(String str, long j, long j2) {
        Object[] objArr = {str, new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7ba1b23e08e98ebb436ca0ee5962c4c0", RobustBitConfig.DEFAULT_VALUE) ? (l) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7ba1b23e08e98ebb436ca0ee5962c4c0") : offlineWrapper.a(str, j, j2);
    }

    public static l duration(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "26033b40cadafe085366d17eb598e8bd", RobustBitConfig.DEFAULT_VALUE) ? (l) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "26033b40cadafe085366d17eb598e8bd") : offlineWrapper.a(str, j);
    }

    public static l instant(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0172078dad2e15619ac24e5223326e7d", RobustBitConfig.DEFAULT_VALUE) ? (l) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0172078dad2e15619ac24e5223326e7d") : offlineWrapper.c(str);
    }

    public static l instant(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8abeb46215b67fbc8e4b8ea129f04c8a", RobustBitConfig.DEFAULT_VALUE) ? (l) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8abeb46215b67fbc8e4b8ea129f04c8a") : offlineWrapper.b(str, j);
    }

    public static void addJsPerfEvent(g gVar) {
        boolean z = false;
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "510e642080bb71e38888a8588e7cd920", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "510e642080bb71e38888a8588e7cd920");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = g.a;
        if (PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect3, false, "5c69b9264b9e88d1c95630a3026c4c44", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect3, false, "5c69b9264b9e88d1c95630a3026c4c44")).booleanValue();
        } else if (gVar.j != null) {
            z = gVar.j.optBoolean("report", false);
        }
        if (z) {
            jsOnlineWrapper.a(gVar);
        } else {
            jsOfflineWrapper.a(gVar);
        }
    }

    public static long currentTime() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "206ca0c099396a69a6bc31473f0a0da0", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "206ca0c099396a69a6bc31473f0a0da0")).longValue() : g.d();
    }

    public static long currentTimeMillis() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "08d5795e262ec2be5cd58e2df9fb5528", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "08d5795e262ec2be5cd58e2df9fb5528")).longValue() : g.e();
    }

    public static List<l> getOnlineEvents() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0622be9a1d0a6a60eed47ef58ad442a2", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0622be9a1d0a6a60eed47ef58ad442a2");
        }
        boolean isInPerfMode = isInPerfMode();
        List<g> onlinePerfEvents = getOnlinePerfEvents();
        ArrayList arrayList = new ArrayList(onlinePerfEvents.size());
        for (g gVar : onlinePerfEvents) {
            arrayList.add(new l(gVar, isInPerfMode));
        }
        return arrayList;
    }

    public static List<g> getOnlinePerfEvents() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6b367bf53c594a966d83e713f8328869", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6b367bf53c594a966d83e713f8328869") : online().b();
    }

    public static List<g> getOfflinePerfEvents() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c892d92680dbc240d19d64d125179504", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c892d92680dbc240d19d64d125179504") : offlineWrapper.b();
    }
}
