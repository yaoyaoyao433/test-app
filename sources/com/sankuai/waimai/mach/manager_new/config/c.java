package com.sankuai.waimai.mach.manager_new.config;

import android.os.SystemClock;
import android.text.TextUtils;
import com.dianping.shield.entity.ExposeAction;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.CollectionUtils;
import com.sankuai.meituan.retrofit2.ar;
import com.sankuai.meituan.retrofit2.raw.a;
import com.sankuai.waimai.mach.common.DevSettings;
import com.sankuai.waimai.mach.common.f;
import com.sankuai.waimai.mach.common.i;
import com.sankuai.waimai.mach.m;
import com.sankuai.waimai.mach.manager.checkupdate.a;
import com.sankuai.waimai.mach.manager.download.update.BundleInfo;
import com.sankuai.waimai.mach.manager.download.update.MachUpdateRequest;
import com.sankuai.waimai.mach.manager.download.update.UpdateResponse;
import com.sankuai.waimai.mach.manager_new.common.e;
import com.sankuai.waimai.mach.manager_new.config.a;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import rx.d;
import rx.j;
import rx.k;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class c {
    public static ChangeQuickRedirect a;
    private static final int[] e = {60000, 120000, 300000};
    volatile boolean b;
    public volatile boolean c;
    public k d;
    private com.sankuai.waimai.mach.manager_new.config.a f;
    private long g;
    private volatile AtomicInteger h;
    private final ScheduledExecutorService i;
    private ScheduledFuture<?> j;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(UpdateResponse updateResponse);

        void a(Exception exc);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        void a();

        void b();
    }

    public static /* synthetic */ void a(c cVar, long j) {
        Object[] objArr = {new Long((long) ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "f8f44f36e852fd29aed03602a72002f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "f8f44f36e852fd29aed03602a72002f3");
        } else if (cVar.i == null || cVar.i.isShutdown()) {
        } else {
            if (cVar.j != null) {
                cVar.j.cancel(false);
            }
            cVar.j = cVar.i.schedule(new Runnable() { // from class: com.sankuai.waimai.mach.manager_new.config.c.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ba3bcde4417fdc9d6ea0b31b84039bda", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ba3bcde4417fdc9d6ea0b31b84039bda");
                    } else {
                        c.this.a((b) null);
                    }
                }
            }, ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE, TimeUnit.MILLISECONDS);
        }
    }

    public static /* synthetic */ void a(c cVar, UpdateResponse updateResponse) {
        final List<BundleInfo> list;
        Object[] objArr = {updateResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "9d096d25b4c046e0387d2047aa8b01df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "9d096d25b4c046e0387d2047aa8b01df");
        } else if (updateResponse == null || updateResponse.body == null) {
            cVar.a(new _CheckUpdateException(16004));
        } else if (CollectionUtils.isEmpty(updateResponse.body.getBundleList())) {
            cVar.a(new _CheckUpdateException(16005));
        } else {
            final com.sankuai.waimai.mach.manager_new.config.a aVar = cVar.f;
            Object[] objArr2 = {updateResponse};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.mach.manager_new.config.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "319abad77f5e88e2c63a64d2a2e8b41e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "319abad77f5e88e2c63a64d2a2e8b41e");
            } else if (updateResponse == null || updateResponse.body == null || updateResponse.body.getBundleList() == null) {
                com.sankuai.waimai.mach.manager_new.common.c.b("Update response error");
            } else {
                Object[] objArr3 = {updateResponse};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.mach.manager_new.config.a.a;
                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "2e7c0c208d7984ab03d3549ea6ba07ae", RobustBitConfig.DEFAULT_VALUE)) {
                    list = (List) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "2e7c0c208d7984ab03d3549ea6ba07ae");
                } else {
                    List<BundleInfo> bundleList = updateResponse.body.getBundleList();
                    if (updateResponse.isPartUpdate) {
                        _BundleConfigRecord _bundleconfigrecord = aVar.c;
                        List<BundleInfo> linkedList = new LinkedList<>();
                        if (_bundleconfigrecord != null) {
                            List<BundleInfo> localBundle = _bundleconfigrecord.getLocalBundle();
                            linkedList.addAll(localBundle);
                            LinkedList linkedList2 = new LinkedList();
                            for (BundleInfo bundleInfo : localBundle) {
                                String name = bundleInfo.getName();
                                for (BundleInfo bundleInfo2 : bundleList) {
                                    if (bundleInfo2.getName().equals(name)) {
                                        linkedList2.add(bundleInfo);
                                    }
                                }
                            }
                            linkedList.removeAll(linkedList2);
                            linkedList.addAll(bundleList);
                            list = linkedList;
                        }
                    }
                    list = bundleList;
                }
                e.a(new e.a() { // from class: com.sankuai.waimai.mach.manager_new.config.a.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.mach.manager_new.common.e.a
                    public final void a() {
                        FileOutputStream fileOutputStream;
                        BufferedWriter bufferedWriter;
                        BufferedWriter bufferedWriter2;
                        File file;
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "e53c847ce548f8e6efb5799e3ba7732d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "e53c847ce548f8e6efb5799e3ba7732d");
                            return;
                        }
                        c cVar2 = aVar.d;
                        List list2 = list;
                        Object[] objArr5 = {list2};
                        ChangeQuickRedirect changeQuickRedirect5 = c.a;
                        if (PatchProxy.isSupport(objArr5, cVar2, changeQuickRedirect5, false, "b63ef6d19ed58499151946076b4bee80", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, cVar2, changeQuickRedirect5, false, "b63ef6d19ed58499151946076b4bee80");
                        } else if (list2 != null) {
                            try {
                                String str = cVar2.b;
                                Object[] objArr6 = {str, "machcheckupdate.json"};
                                ChangeQuickRedirect changeQuickRedirect6 = c.a;
                                if (PatchProxy.isSupport(objArr6, cVar2, changeQuickRedirect6, false, "d7aa2f111568ab6c7eaba3708252d405", RobustBitConfig.DEFAULT_VALUE)) {
                                    file = (File) PatchProxy.accessDispatch(objArr6, cVar2, changeQuickRedirect6, false, "d7aa2f111568ab6c7eaba3708252d405");
                                } else {
                                    File file2 = new File(str);
                                    if (com.sankuai.waimai.mach.manager_new.common.b.a(file2)) {
                                        file = new File(file2, "machcheckupdate.json");
                                        if (!file.exists()) {
                                            file.createNewFile();
                                        }
                                    } else {
                                        file = null;
                                    }
                                }
                                fileOutputStream = new FileOutputStream(file);
                                try {
                                    bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(fileOutputStream));
                                    try {
                                        try {
                                            String json = com.sankuai.waimai.mach.utils.b.a().toJson(list2);
                                            a.f = json;
                                            bufferedWriter2.write(json);
                                            bufferedWriter2.flush();
                                            File file3 = new File(cVar2.b + "checkupdate.json");
                                            if (file3.exists()) {
                                                file3.delete();
                                            }
                                        } catch (Exception e2) {
                                            e = e2;
                                            com.sankuai.waimai.mach.manager_new.common.c.b("save checkupate failed | " + e.getMessage());
                                            com.sankuai.waimai.mach.utils.e.a(bufferedWriter2);
                                            com.sankuai.waimai.mach.utils.e.a(fileOutputStream);
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        bufferedWriter = bufferedWriter2;
                                        com.sankuai.waimai.mach.utils.e.a(bufferedWriter);
                                        com.sankuai.waimai.mach.utils.e.a(fileOutputStream);
                                        throw th;
                                    }
                                } catch (Exception e3) {
                                    e = e3;
                                    bufferedWriter2 = null;
                                    com.sankuai.waimai.mach.manager_new.common.c.b("save checkupate failed | " + e.getMessage());
                                    com.sankuai.waimai.mach.utils.e.a(bufferedWriter2);
                                    com.sankuai.waimai.mach.utils.e.a(fileOutputStream);
                                } catch (Throwable th2) {
                                    th = th2;
                                    bufferedWriter = null;
                                    com.sankuai.waimai.mach.utils.e.a(bufferedWriter);
                                    com.sankuai.waimai.mach.utils.e.a(fileOutputStream);
                                    throw th;
                                }
                            } catch (Exception e4) {
                                e = e4;
                                fileOutputStream = null;
                            } catch (Throwable th3) {
                                th = th3;
                                fileOutputStream = null;
                            }
                            com.sankuai.waimai.mach.utils.e.a(bufferedWriter2);
                            com.sankuai.waimai.mach.utils.e.a(fileOutputStream);
                        }
                    }
                }, "MACH_CONFIG_SAVE_CONFIG");
                Iterator<a.InterfaceC1017a> it = aVar.h.iterator();
                while (it.hasNext()) {
                    it.next().a(list);
                    it.remove();
                }
                _BundleConfigRecord _bundleconfigrecord2 = aVar.c;
                aVar.a(list);
                com.sankuai.waimai.mach.manager_new.config.b a2 = aVar.a(_bundleconfigrecord2, aVar.c);
                if (aVar.e != null) {
                    aVar.e.a(a2);
                }
            }
        }
    }

    public static /* synthetic */ boolean a(c cVar, boolean z) {
        cVar.b = false;
        return false;
    }

    public c(com.sankuai.waimai.mach.manager_new.config.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a5f5bf7950e3067775623057c5a938f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a5f5bf7950e3067775623057c5a938f");
            return;
        }
        this.f = aVar;
        this.i = com.sankuai.android.jarvis.c.c("Update_request_Thread");
        this.b = false;
        this.c = false;
        this.h = new AtomicInteger(-1);
        com.sankuai.waimai.mach.lifecycle.e.a().a(new com.sankuai.waimai.mach.lifecycle.a() { // from class: com.sankuai.waimai.mach.manager_new.config.c.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.lifecycle.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "100a841fe9f6ff0fac435f84f09f114f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "100a841fe9f6ff0fac435f84f09f114f");
                    return;
                }
                com.sankuai.waimai.mach.manager_new.common.c.e("_BundleConfigUpdater | onAppEnterForeground");
                if (SystemClock.elapsedRealtime() - c.this.g >= c.this.b()) {
                    c.a(c.this, (long) ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
                }
            }

            @Override // com.sankuai.waimai.mach.lifecycle.a
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c9c1a9791492daa2c88578e3297b8f30", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c9c1a9791492daa2c88578e3297b8f30");
                } else {
                    com.sankuai.waimai.mach.manager_new.common.c.e("_BundleConfigUpdater | onAppEnterBackground");
                }
            }
        });
    }

    public final void a(final b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c2f11e7a85425e8d3dd7ae6cbc68017", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c2f11e7a85425e8d3dd7ae6cbc68017");
            return;
        }
        this.c = true;
        f g = i.a().g();
        DevSettings devSettings = i.a().f;
        a.InterfaceC0637a interfaceC0637a = i.a().e;
        if (g == null || interfaceC0637a == null || devSettings == null) {
            return;
        }
        a.C1014a c1014a = new a.C1014a();
        c1014a.c = g.b;
        c1014a.b = g.c;
        c1014a.f = g.h;
        c1014a.d = g.f;
        c1014a.e = g.i;
        c1014a.g = devSettings.b;
        c1014a.h = new ArrayList();
        com.sankuai.waimai.mach.manager.checkupdate.a a2 = c1014a.a();
        if (this.d != null && this.d.isUnsubscribed()) {
            this.d.unsubscribe();
        }
        this.d = a(a2, new a() { // from class: com.sankuai.waimai.mach.manager_new.config.c.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.manager_new.config.c.a
            public final void a(UpdateResponse updateResponse) {
                Object[] objArr2 = {updateResponse};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "26583a6f9fb1165aff8f53defbe75c5a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "26583a6f9fb1165aff8f53defbe75c5a");
                    return;
                }
                if (i.a().f.e) {
                    try {
                        Thread.sleep(20000L);
                    } catch (Exception unused) {
                    }
                }
                updateResponse.isPartUpdate = false;
                c.a(c.this, updateResponse);
                if (bVar != null) {
                    bVar.a();
                }
            }

            @Override // com.sankuai.waimai.mach.manager_new.config.c.a
            public final void a(Exception exc) {
                Object[] objArr2 = {exc};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7036de2a7db36d9050877feda5ab8ba6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7036de2a7db36d9050877feda5ab8ba6");
                    return;
                }
                c.this.a(exc);
                if (bVar != null) {
                    bVar.b();
                }
            }
        });
        this.b = true;
        com.sankuai.waimai.mach.manager_new.common.c.c("Update接口触发请求 | " + this.h);
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c5ada6ea55ecf5cc82f5060d42d910d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c5ada6ea55ecf5cc82f5060d42d910d");
            return;
        }
        f g = i.a().g();
        DevSettings devSettings = i.a().f;
        a.InterfaceC0637a interfaceC0637a = i.a().e;
        if (g == null || interfaceC0637a == null || devSettings == null) {
            return;
        }
        a.C1014a c1014a = new a.C1014a();
        c1014a.c = g.b;
        c1014a.b = g.c;
        c1014a.f = g.h;
        c1014a.d = g.f;
        c1014a.e = g.i;
        c1014a.g = devSettings.b;
        c1014a.h = new ArrayList();
        c1014a.i = g.q;
        this.d = a(c1014a.a(), new a() { // from class: com.sankuai.waimai.mach.manager_new.config.c.4
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.manager_new.config.c.a
            public final void a(UpdateResponse updateResponse) {
                Object[] objArr2 = {updateResponse};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "45667222bf9fe351669282db561116ad", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "45667222bf9fe351669282db561116ad");
                    return;
                }
                if (i.a().f.e) {
                    try {
                        Thread.sleep(20000L);
                    } catch (Exception unused) {
                    }
                }
                updateResponse.isPartUpdate = true;
                c.a(c.this, updateResponse);
            }

            @Override // com.sankuai.waimai.mach.manager_new.config.c.a
            public final void a(Exception exc) {
                Object[] objArr2 = {exc};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c27870f7201b9955f69e2115bc663302", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c27870f7201b9955f69e2115bc663302");
                } else {
                    c.this.a(exc);
                }
            }
        });
        this.b = true;
        com.sankuai.waimai.mach.manager_new.common.c.c("Update接口触发请求 | " + this.h);
    }

    private k a(com.sankuai.waimai.mach.manager.checkupdate.a aVar, final a aVar2) {
        Object[] objArr = {aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a2fb523d139724b6d58063f8d36ae8b", RobustBitConfig.DEFAULT_VALUE)) {
            return (k) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a2fb523d139724b6d58063f8d36ae8b");
        }
        k a2 = d.a(new j<UpdateResponse>() { // from class: com.sankuai.waimai.mach.manager_new.config.c.5
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final void onCompleted() {
            }

            @Override // rx.e
            public final /* synthetic */ void onNext(Object obj) {
                UpdateResponse updateResponse = (UpdateResponse) obj;
                Object[] objArr2 = {updateResponse};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "437b26c8f52642ff21b1cfc6e1966362", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "437b26c8f52642ff21b1cfc6e1966362");
                    return;
                }
                if (aVar2 != null) {
                    aVar2.a(updateResponse);
                }
                c.this.h.getAndIncrement();
                c.a(c.this, false);
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fbf6b165f1acd92e0c4ed93259c3c0bb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fbf6b165f1acd92e0c4ed93259c3c0bb");
                    return;
                }
                if (aVar2 != null) {
                    aVar2.a(new Exception(th));
                }
                c.a(c.this, false);
            }
        }, ((_MachUpdateService) new ar.a().a(aVar.g ? "http://api.mobile.wpt.test.sankuai.com/" : "https://apimobile.meituan.com/").a(com.sankuai.meituan.retrofit2.adapter.rxjava.f.a()).a(com.sankuai.meituan.retrofit2.converter.gson.a.a(new Gson())).a(i.a().e).a().a(_MachUpdateService.class)).checkUpdate(a(aVar)).b(rx.schedulers.a.e()).a(rx.schedulers.a.e()));
        a(SystemClock.elapsedRealtime());
        return a2;
    }

    private MachUpdateRequest a(com.sankuai.waimai.mach.manager.checkupdate.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c030db1d4e9ef09ee71bfddce96e0ae", RobustBitConfig.DEFAULT_VALUE)) {
            return (MachUpdateRequest) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c030db1d4e9ef09ee71bfddce96e0ae");
        }
        MachUpdateRequest machUpdateRequest = new MachUpdateRequest();
        machUpdateRequest.app = aVar.b;
        machUpdateRequest.app_version = aVar.a;
        machUpdateRequest.platform = aVar.c;
        machUpdateRequest.mach_version = aVar.e;
        machUpdateRequest.uuid = aVar.d;
        machUpdateRequest.bundles = aVar.f;
        if (aVar.h != null) {
            machUpdateRequest.tags = aVar.h;
        }
        return machUpdateRequest;
    }

    private void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67590464211e4cba4d009f5e40155665", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67590464211e4cba4d009f5e40155665");
        } else {
            this.g = j;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long b() {
        int[] iArr;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13c7168959e5c07f9d0b31327dfa0d88", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13c7168959e5c07f9d0b31327dfa0d88")).longValue();
        }
        String b2 = m.b();
        if (TextUtils.isEmpty(b2)) {
            return 600000L;
        }
        long j = 0;
        if ("0".equals(b2)) {
            return 0L;
        }
        try {
            String[] split = b2.split(CommonConstant.Symbol.COMMA);
            if (split.length > 0) {
                if (this.h.get() >= 0 && this.h.get() < split.length) {
                    j = Integer.parseInt(split[this.h.get()]) * 1000;
                } else {
                    j = Integer.parseInt(split[split.length - 1]) * 1000;
                }
            } else if (this.h.get() >= 0 && this.h.get() < e.length) {
                j = e[this.h.get()];
            } else {
                j = e[iArr.length - 1];
            }
        } catch (Exception unused) {
            com.sankuai.waimai.mach.manager_new.common.c.b("时间配置解析失败 | " + b2);
        }
        return j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Exception exc) {
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81b73f44f9d49c16a7e1e0c81d5df75b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81b73f44f9d49c16a7e1e0c81d5df75b");
            return;
        }
        com.sankuai.waimai.mach.manager_new.common.c.b("_BundleConfigUpdater | handlerException | " + exc.getMessage());
        com.sankuai.waimai.mach.utils.e.a(c.class, "handlerException", exc.getMessage());
    }
}
