package com.sankuai.waimai.alita.platform;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.android.common.aidata.AIData;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.session.SessionManager;
import com.meituan.metrics.traffic.reflection.OkHttp2Wrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ar;
import com.sankuai.waimai.alita.bundle.a;
import com.sankuai.waimai.alita.bundle.checkupdate.AlitaCheckUpdateParam;
import com.sankuai.waimai.alita.bundle.checkupdate.AlitaCheckUpdateRequest;
import com.sankuai.waimai.alita.bundle.checkupdate.AlitaCheckUpdateResponse;
import com.sankuai.waimai.alita.bundle.checkupdate.AlitaCheckUpdateService;
import com.sankuai.waimai.alita.bundle.checkupdate.a;
import com.sankuai.waimai.alita.bundle.download.service.FileDownloadService;
import com.sankuai.waimai.alita.bundle.load.a;
import com.sankuai.waimai.alita.core.base.b;
import com.sankuai.waimai.alita.core.config.AlitaBizConfigManager;
import com.sankuai.waimai.alita.core.config.observabledata.a;
import com.sankuai.waimai.alita.core.dataupload.f;
import com.sankuai.waimai.alita.core.engine.h;
import com.sankuai.waimai.alita.core.event.AlitaRealTimeEventCenter;
import com.sankuai.waimai.alita.core.event.a;
import com.sankuai.waimai.alita.core.event.autorunner.AlitaAutoRunManager;
import com.sankuai.waimai.alita.core.event.autorunner.c;
import com.sankuai.waimai.alita.core.jsexecutor.AlitaJSValue;
import com.sankuai.waimai.alita.core.jsexecutor.f;
import com.sankuai.waimai.alita.core.jsexecutor.modules.e;
import com.sankuai.waimai.alita.core.tasklistener.b;
import com.sankuai.waimai.alita.core.utils.a;
import com.sankuai.waimai.alita.platform.init.b;
import com.sankuai.waimai.alita.platform.init.c;
import com.sankuai.waimai.alita.platform.init.d;
import com.sankuai.waimai.alita.platform.init.g;
import com.sankuai.waimai.alita.platform.init.i;
import com.sankuai.waimai.alita.platform.init.j;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import com.squareup.okhttp.v;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a implements a.InterfaceC0700a<Integer> {
    public static ChangeQuickRedirect a = null;
    private static volatile a e = null;
    private static volatile boolean f = false;
    private static volatile boolean g = false;
    public com.sankuai.waimai.alita.core.config.observabledata.a<String> d;
    private Context h;
    private BroadcastReceiver i;
    private static Set<String> j = new HashSet();
    public static Map<String, String> b = new HashMap();
    private static Set<b> k = new CopyOnWriteArraySet();
    public static com.sankuai.waimai.alita.core.config.observabledata.b c = new com.sankuai.waimai.alita.core.config.observabledata.b();

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.alita.platform.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0717a {
        void a(String str, int i, String str2);
    }

    public static /* synthetic */ void a(Context context, d dVar) {
        ar a2;
        Object[] objArr = {context, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c366b301f5578367fc7aba09d5d1e818", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c366b301f5578367fc7aba09d5d1e818");
            return;
        }
        com.sankuai.waimai.alita.bundle.a.a().b = c.c();
        com.sankuai.waimai.alita.bundle.a a3 = com.sankuai.waimai.alita.bundle.a.a();
        com.sankuai.waimai.alita.bundle.b bVar = com.sankuai.waimai.alita.platform.debug.a.a().a() ? com.sankuai.waimai.alita.bundle.b.PROD : com.sankuai.waimai.alita.bundle.b.TEST;
        v vVar = dVar.d;
        Object[] objArr2 = {context, bVar, vVar};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.alita.bundle.a.a;
        if (PatchProxy.isSupport(objArr2, a3, changeQuickRedirect2, false, "79bc5ac7bcf585ff453d94f03e0f45d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a3, changeQuickRedirect2, false, "79bc5ac7bcf585ff453d94f03e0f45d1");
        } else if (a3.h) {
        } else {
            a3.c = new com.sankuai.waimai.alita.bundle.download.a(context);
            com.sankuai.waimai.alita.bundle.download.a aVar = a3.c;
            String str = bVar == com.sankuai.waimai.alita.bundle.b.PROD ? "prod" : "test";
            Object[] objArr3 = {"js", str, vVar};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.alita.bundle.download.a.a;
            if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "8c642390af82dae73d897da83a523d26", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "8c642390af82dae73d897da83a523d26");
            } else {
                com.sankuai.waimai.alita.core.utils.c.a("AlitaBundleDownloader init storageDir : js");
                aVar.b = "js";
                aVar.c = str;
                Object[] objArr4 = {vVar};
                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.alita.bundle.download.a.a;
                if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "405c738dc36a945acac04327221de1eb", RobustBitConfig.DEFAULT_VALUE)) {
                    a2 = (ar) PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "405c738dc36a945acac04327221de1eb");
                } else {
                    if (vVar == null) {
                        v vVar2 = new v();
                        OkHttp2Wrapper.addInterceptorToClient(vVar2);
                        vVar = com.sankuai.waimai.launcher.util.aop.b.a(vVar2);
                        vVar.a(30L, TimeUnit.SECONDS);
                        vVar.b(30L, TimeUnit.SECONDS);
                        vVar.c(30L, TimeUnit.SECONDS);
                    }
                    a2 = new ar.a().a("http://msstestdn.sankuai.com/").a(com.sankuai.waimai.alita.bundle.c.a).b(com.sankuai.waimai.alita.bundle.c.a).a(com.sankuai.meituan.retrofit2.callfactory.okhttp.a.a(vVar)).a();
                }
                aVar.d = (FileDownloadService) a2.a(FileDownloadService.class);
            }
            a.b bVar2 = new a.b(a3, null);
            com.sankuai.waimai.alita.bundle.download.a aVar2 = a3.c;
            Object[] objArr5 = {bVar2};
            ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.alita.bundle.download.a.a;
            if (PatchProxy.isSupport(objArr5, aVar2, changeQuickRedirect5, false, "9825af68bd89b08a1491195beeba1231", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, aVar2, changeQuickRedirect5, false, "9825af68bd89b08a1491195beeba1231");
            } else {
                aVar2.e.add(bVar2);
            }
            bVar2.b = new a.d(a3, null);
            a3.g = bVar2;
            a3.d = new com.sankuai.waimai.alita.bundle.cache.a(context, bVar);
            a3.h = true;
        }
    }

    public static /* synthetic */ void a(a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "bc3fa9ac5e11428616349d8f755e7c1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "bc3fa9ac5e11428616349d8f755e7c1d");
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new j() { // from class: com.sankuai.waimai.alita.platform.a.5
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.alita.platform.init.j
            public final List<com.sankuai.waimai.alita.core.jsexecutor.modules.b> a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d83c6dc1ee54fc14acc5d7fa94dea839", RobustBitConfig.DEFAULT_VALUE)) {
                    return (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d83c6dc1ee54fc14acc5d7fa94dea839");
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new e());
                return arrayList2;
            }
        });
        f.a().a(arrayList);
    }

    public static /* synthetic */ void a(a aVar, final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "02d0209cecdeb60993762880e87bd6c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "02d0209cecdeb60993762880e87bd6c1");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            com.sankuai.waimai.alita.core.utils.c.a("AlitaEngine.setupBundle():" + str + " 开始加载JsBundle: ----------------");
            final com.sankuai.waimai.alita.core.config.observabledata.c<String> cVar = com.sankuai.waimai.alita.core.config.c.a().a(str).e.b;
            cVar.b((a.InterfaceC0700a) new a.InterfaceC0700a<List<String>>() { // from class: com.sankuai.waimai.alita.platform.a.9
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.alita.core.config.observabledata.a.InterfaceC0700a
                public final /* synthetic */ void update(List<String> list, List<String> list2) {
                    Object[] objArr2 = {list, list2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d3e17c93dc1498feee5c56da1d0b9a40", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d3e17c93dc1498feee5c56da1d0b9a40");
                        return;
                    }
                    List<String> list3 = cVar.d;
                    if (list3 != null) {
                        com.sankuai.waimai.alita.core.utils.c.a("AlitaEngine.loadJsBundleList(): 读取下发的特征bundle列表 :");
                        for (String str2 : list3) {
                            if (!TextUtils.isEmpty(str2)) {
                                com.sankuai.waimai.alita.core.utils.c.a("AlitaEngine.loadJsBundleList(): 读取下发的特征bundle列表 : " + str2);
                            }
                        }
                        com.sankuai.waimai.alita.core.utils.c.a("AlitaEngine.loadJsBundleList(): 读取下发的特征bundle列表 : ----------------");
                        a.a(a.this, str, list3);
                    }
                    List<String> list4 = cVar.e;
                    if (list4 != null) {
                        com.sankuai.waimai.alita.core.utils.c.a("AlitaEngine.loadJsBundleList(): 读取删除的特征bundle列表 :");
                        for (String str3 : list4) {
                            if (!TextUtils.isEmpty(str3)) {
                                com.sankuai.waimai.alita.core.utils.c.a("AlitaEngine.loadJsBundleList(): 读取删除的特征bundle列表 : " + str3);
                            }
                        }
                        com.sankuai.waimai.alita.core.utils.c.a("AlitaEngine.loadJsBundleList(): 读取删除的特征bundle列表 : ----------------");
                        a.b(a.this, str, list4);
                    }
                }
            });
            final com.sankuai.waimai.alita.core.config.observabledata.c<String> cVar2 = com.sankuai.waimai.alita.core.config.c.a().a(str).e.c;
            cVar2.b((a.InterfaceC0700a) new a.InterfaceC0700a<List<String>>() { // from class: com.sankuai.waimai.alita.platform.a.10
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.alita.core.config.observabledata.a.InterfaceC0700a
                public final /* synthetic */ void update(List<String> list, List<String> list2) {
                    Object[] objArr2 = {list, list2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5e422ebf13be737b72c1ddea61155225", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5e422ebf13be737b72c1ddea61155225");
                        return;
                    }
                    List<String> list3 = cVar2.d;
                    if (list3 != null) {
                        com.sankuai.waimai.alita.core.utils.c.a("AlitaEngine.loadJsBundleList(): 读取下发的算子bundle列表 :");
                        for (String str2 : list3) {
                            if (!TextUtils.isEmpty(str2)) {
                                com.sankuai.waimai.alita.core.utils.c.a("AlitaEngine.loadJsBundleList(): 读取下发的算子bundle列表 : " + str2);
                            }
                        }
                        com.sankuai.waimai.alita.core.utils.c.a("AlitaEngine.loadJsBundleList(): 读取下发的算子bundle列表 : ----------------");
                        a.a(a.this, str, list3);
                    }
                }
            });
            final com.sankuai.waimai.alita.core.config.observabledata.c<String> cVar3 = com.sankuai.waimai.alita.core.config.c.a().a(str).e.d;
            cVar3.b((a.InterfaceC0700a) new a.InterfaceC0700a<List<String>>() { // from class: com.sankuai.waimai.alita.platform.a.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.alita.core.config.observabledata.a.InterfaceC0700a
                public final /* synthetic */ void update(List<String> list, List<String> list2) {
                    Object[] objArr2 = {list, list2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8408c833ee50e8de4711db18252fd13a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8408c833ee50e8de4711db18252fd13a");
                        return;
                    }
                    List<String> list3 = cVar3.d;
                    if (list3 != null) {
                        com.sankuai.waimai.alita.core.utils.c.a("AlitaEngine.loadJsBundleList(): 读取下发的策略bundle列表 :");
                        for (String str2 : list3) {
                            if (!TextUtils.isEmpty(str2)) {
                                com.sankuai.waimai.alita.core.utils.c.a("AlitaEngine.loadJsBundleList(): 读取下发的策略bundle列表 : " + str2);
                            }
                        }
                        com.sankuai.waimai.alita.core.utils.c.a("AlitaEngine.loadJsBundleList(): 读取下发的策略bundle列表 : ----------------");
                        a.a(a.this, str, list3);
                    }
                    List<String> list4 = cVar3.e;
                    if (list4 != null) {
                        com.sankuai.waimai.alita.core.utils.c.a("AlitaEngine.loadJsBundleList(): 读取删除的策略bundle列表 :");
                        for (String str3 : list4) {
                            if (!TextUtils.isEmpty(str3)) {
                                com.sankuai.waimai.alita.core.utils.c.a("AlitaEngine.loadJsBundleList(): 读取删除的策略bundle列表 : " + str3);
                            }
                        }
                        com.sankuai.waimai.alita.core.utils.c.a("AlitaEngine.loadJsBundleList(): 读取删除的策略bundle列表 : ----------------");
                        a.b(a.this, str, list4);
                    }
                }
            });
        }
    }

    public static /* synthetic */ void a(a aVar, String str, List list) {
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "5a08e9f44482657df880b71bfdb1bf96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "5a08e9f44482657df880b71bfdb1bf96");
        } else if (list != null && list.size() > 0) {
            com.sankuai.waimai.alita.core.event.autorunner.b a2 = com.sankuai.waimai.alita.core.event.autorunner.b.a();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (!TextUtils.isEmpty(str2)) {
                    a2.a(str, str2);
                    com.sankuai.waimai.alita.core.utils.c.a("AlitaEngine.loadBundleList(): 开始加载JsBundle: " + str2);
                }
            }
            a2.a(new com.sankuai.waimai.alita.core.tasklistener.b<String, Boolean, Exception>() { // from class: com.sankuai.waimai.alita.platform.a.7
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.alita.core.tasklistener.b
                public final void a(@NonNull Map<String, b.d<Boolean>> map) {
                    Object[] objArr2 = {map};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8e68e4811c633d8b7959b4de2d4c4ae1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8e68e4811c633d8b7959b4de2d4c4ae1");
                    } else if (com.sankuai.waimai.alita.platform.debug.a.a().b()) {
                        com.sankuai.waimai.alita.core.utils.c.a("AlitaEngine.loadBundleList(): onAllTaskComplete(): JsBundle加载完成");
                        for (Map.Entry<String, b.d<Boolean>> entry : map.entrySet()) {
                            b.d<Boolean> value = entry.getValue();
                            StringBuilder sb = new StringBuilder("AlitaEngine.loadBundleList(): onAllTaskComplete(): JsBundle加载完成: bundle名称 = ");
                            sb.append(entry.getKey());
                            sb.append(", 加载结果 = ");
                            sb.append((value.b == null || !value.b.booleanValue()) ? "失败" : "成功");
                            sb.append(", 加载状态 = ");
                            sb.append(com.sankuai.waimai.alita.core.tasklistener.b.a(value.a));
                            com.sankuai.waimai.alita.core.utils.c.a(sb.toString());
                        }
                    }
                }
            });
        } else {
            com.sankuai.waimai.alita.core.utils.c.a("AlitaEngine.loadBundleList(): 无JsBundle");
        }
    }

    public static /* synthetic */ void a(d dVar) {
        AlitaCheckUpdateParam alitaCheckUpdateParam;
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1e2f6be3d0c2e06170443625bd6b1678", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1e2f6be3d0c2e06170443625bd6b1678");
            return;
        }
        AlitaCheckUpdateRequest.a aVar = new AlitaCheckUpdateRequest.a();
        aVar.d = c.a().a();
        aVar.b = String.valueOf(c.a().b());
        aVar.g = com.sankuai.waimai.alita.core.common.a.a;
        aVar.e = "Android";
        aVar.h = !com.sankuai.waimai.alita.platform.debug.a.a().a();
        aVar.f = c.a().f();
        aVar.i = new ArrayList();
        aVar.j = dVar.e;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = AlitaCheckUpdateRequest.a.a;
        final AlitaCheckUpdateRequest alitaCheckUpdateRequest = PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "da30f6a64a9b50c2e54d2fae14d44a14", RobustBitConfig.DEFAULT_VALUE) ? (AlitaCheckUpdateRequest) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "da30f6a64a9b50c2e54d2fae14d44a14") : new AlitaCheckUpdateRequest(aVar);
        final com.sankuai.waimai.alita.bundle.checkupdate.a a2 = com.sankuai.waimai.alita.bundle.checkupdate.a.a();
        final a.InterfaceC0692a interfaceC0692a = new a.InterfaceC0692a() { // from class: com.sankuai.waimai.alita.platform.a.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.alita.bundle.checkupdate.a.InterfaceC0692a
            public final void a(AlitaCheckUpdateResponse alitaCheckUpdateResponse) {
                Object[] objArr3 = {alitaCheckUpdateResponse};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "92450b7ff6c5b782b6567c94b0116f2f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "92450b7ff6c5b782b6567c94b0116f2f");
                    return;
                }
                a.c.b((com.sankuai.waimai.alita.core.config.observabledata.b) 1);
                com.sankuai.waimai.alita.bundle.a.a().a(alitaCheckUpdateResponse, false);
            }

            @Override // com.sankuai.waimai.alita.bundle.checkupdate.a.InterfaceC0692a
            public final void b(AlitaCheckUpdateResponse alitaCheckUpdateResponse) {
                Object[] objArr3 = {alitaCheckUpdateResponse};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "14a7e65c5817b0ae349988c972751fe3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "14a7e65c5817b0ae349988c972751fe3");
                    return;
                }
                a.c.b((com.sankuai.waimai.alita.core.config.observabledata.b) 1);
                com.sankuai.waimai.alita.bundle.a.a().a(alitaCheckUpdateResponse, true);
            }

            @Override // com.sankuai.waimai.alita.bundle.checkupdate.a.InterfaceC0692a
            public final void a(int i) {
                Object[] objArr3 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "cdbb5ca37b1e5744cfb0c9073547264a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "cdbb5ca37b1e5744cfb0c9073547264a");
                } else {
                    com.sankuai.waimai.alita.bundle.a.a().i = i;
                }
            }
        };
        Object[] objArr3 = {alitaCheckUpdateRequest, interfaceC0692a};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.alita.bundle.checkupdate.a.a;
        if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "66f7050a73f74c451bb5a644c96b8ff6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "66f7050a73f74c451bb5a644c96b8ff6");
            return;
        }
        Object[] objArr4 = {alitaCheckUpdateRequest, interfaceC0692a};
        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.alita.bundle.checkupdate.a.a;
        if (PatchProxy.isSupport(objArr4, a2, changeQuickRedirect4, false, "6b6f20705704312000b4f67364e0ad6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect4, false, "6b6f20705704312000b4f67364e0ad6a");
        } else {
            rx.d.a((d.a) new d.a<AlitaCheckUpdateResponse>() { // from class: com.sankuai.waimai.alita.bundle.checkupdate.a.2
                public static ChangeQuickRedirect a;

                @Override // rx.functions.b
                public final /* synthetic */ void call(Object obj) {
                    rx.j jVar = (rx.j) obj;
                    Object[] objArr5 = {jVar};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "3005b16c9bf261d588bb665c9fdd7d3f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "3005b16c9bf261d588bb665c9fdd7d3f");
                        return;
                    }
                    String a3 = a.this.a(alitaCheckUpdateRequest.isAlitaDevelop);
                    if (!TextUtils.isEmpty(a3)) {
                        AlitaCheckUpdateResponse a4 = a.this.a(a3);
                        if (jVar.isUnsubscribed()) {
                            return;
                        }
                        if (a4 == null) {
                            jVar.onNext(null);
                        } else {
                            jVar.onNext(a4);
                        }
                    } else {
                        jVar.onNext(null);
                    }
                    jVar.onCompleted();
                }
            }).b(rx.schedulers.a.e()).a(rx.android.schedulers.a.a()).c(new rx.functions.b<AlitaCheckUpdateResponse>() { // from class: com.sankuai.waimai.alita.bundle.checkupdate.a.1
                public static ChangeQuickRedirect a;

                @Override // rx.functions.b
                public final /* synthetic */ void call(AlitaCheckUpdateResponse alitaCheckUpdateResponse) {
                    AlitaCheckUpdateResponse alitaCheckUpdateResponse2 = alitaCheckUpdateResponse;
                    Object[] objArr5 = {alitaCheckUpdateResponse2};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "7d946f75ecda164fe591ac54790ddbff", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "7d946f75ecda164fe591ac54790ddbff");
                        return;
                    }
                    com.sankuai.waimai.alita.core.utils.c.a("requestDiskCache checkUpdate response: " + alitaCheckUpdateResponse2);
                    if (interfaceC0692a != null) {
                        interfaceC0692a.b(alitaCheckUpdateResponse2);
                    }
                }
            });
        }
        Object[] objArr5 = {alitaCheckUpdateRequest, interfaceC0692a};
        ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.alita.bundle.checkupdate.a.a;
        if (PatchProxy.isSupport(objArr5, a2, changeQuickRedirect5, false, "4ed2ddc401c4aefbeb1696dc306d7ee7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, a2, changeQuickRedirect5, false, "4ed2ddc401c4aefbeb1696dc306d7ee7");
            return;
        }
        AlitaCheckUpdateService alitaCheckUpdateService = (AlitaCheckUpdateService) new ar.a().a(alitaCheckUpdateRequest.isAlitaDevelop ? "http://api.mobile.wpt.test.sankuai.com/" : "https://apimobile.meituan.com/").a(com.sankuai.meituan.retrofit2.adapter.rxjava.f.a()).a(com.sankuai.meituan.retrofit2.converter.gson.a.a(new Gson())).a(alitaCheckUpdateRequest.callFactory == null ? com.sankuai.meituan.retrofit2.callfactory.urlconnection.a.a() : alitaCheckUpdateRequest.callFactory).a().a(AlitaCheckUpdateService.class);
        Object[] objArr6 = {alitaCheckUpdateRequest};
        ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.alita.bundle.checkupdate.a.a;
        if (PatchProxy.isSupport(objArr6, a2, changeQuickRedirect6, false, "95be740ebfe89bb87673b269d5e112d8", RobustBitConfig.DEFAULT_VALUE)) {
            alitaCheckUpdateParam = (AlitaCheckUpdateParam) PatchProxy.accessDispatch(objArr6, a2, changeQuickRedirect6, false, "95be740ebfe89bb87673b269d5e112d8");
        } else {
            alitaCheckUpdateParam = new AlitaCheckUpdateParam();
            alitaCheckUpdateParam.app = alitaCheckUpdateRequest.app;
            alitaCheckUpdateParam.appVersion = alitaCheckUpdateRequest.appVersion;
            alitaCheckUpdateParam.channel = alitaCheckUpdateRequest.channel;
            alitaCheckUpdateParam.platform = alitaCheckUpdateRequest.platform;
            alitaCheckUpdateParam.sdkVersion = alitaCheckUpdateRequest.sdkVersion;
            alitaCheckUpdateParam.uuid = alitaCheckUpdateRequest.uuid;
            alitaCheckUpdateParam.bundles = alitaCheckUpdateRequest.bundles;
        }
        rx.d.a(new rx.j<AlitaCheckUpdateResponse>() { // from class: com.sankuai.waimai.alita.bundle.checkupdate.a.3
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final void onCompleted() {
            }

            @Override // rx.e
            public final /* synthetic */ void onNext(Object obj) {
                AlitaCheckUpdateResponse alitaCheckUpdateResponse = (AlitaCheckUpdateResponse) obj;
                Object[] objArr7 = {alitaCheckUpdateResponse};
                ChangeQuickRedirect changeQuickRedirect7 = a;
                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "9046a18e35f7b63c3ef641a7388630bc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "9046a18e35f7b63c3ef641a7388630bc");
                    return;
                }
                com.sankuai.waimai.alita.core.utils.c.a("requestNetwork checkUpdate response: " + alitaCheckUpdateResponse);
                if (interfaceC0692a != null) {
                    interfaceC0692a.a(alitaCheckUpdateResponse);
                    a.a(a.this, alitaCheckUpdateResponse, alitaCheckUpdateRequest.isAlitaDevelop);
                }
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                Object[] objArr7 = {th};
                ChangeQuickRedirect changeQuickRedirect7 = a;
                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "be53c9329581497105f5fc6bf5aafa34", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "be53c9329581497105f5fc6bf5aafa34");
                } else if (interfaceC0692a != null) {
                    interfaceC0692a.a(3);
                }
            }
        }, alitaCheckUpdateService.checkUpdate(alitaCheckUpdateParam).b(rx.schedulers.a.e()).a(rx.android.schedulers.a.a()).b(new rx.functions.a() { // from class: com.sankuai.waimai.alita.bundle.checkupdate.a.4
            public static ChangeQuickRedirect a;

            @Override // rx.functions.a
            public final void a() {
                Object[] objArr7 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect7 = a;
                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "cbe2fe0d322033af51e72f164974d402", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "cbe2fe0d322033af51e72f164974d402");
                } else if (interfaceC0692a != null) {
                    interfaceC0692a.a(1);
                }
            }
        }));
    }

    public static /* synthetic */ void b(a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "85656159211bf4c5d189feef24f96d44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "85656159211bf4c5d189feef24f96d44");
            return;
        }
        com.sankuai.waimai.alita.core.mlmodel.operator.b a2 = com.sankuai.waimai.alita.core.mlmodel.operator.c.a().a(AlitaMonitorCenter.AlitaExceptionMonitorConst.BUSINESS);
        a2.a(new com.sankuai.waimai.alita.core.mlmodel.operator.producer.common.b());
        a2.a(new com.sankuai.waimai.alita.core.mlmodel.operator.producer.date.b());
    }

    public static /* synthetic */ void b(a aVar, String str, List list) {
        int i = 2;
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "34c3942001969efda981860bc973d0aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "34c3942001969efda981860bc973d0aa");
        } else if (list != null && list.size() > 0) {
            com.sankuai.waimai.alita.core.utils.c.a("AlitaEngine.deleteBundleList(): 开始删除减少的JsBundle");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                com.sankuai.waimai.alita.core.event.autorunner.b a2 = com.sankuai.waimai.alita.core.event.autorunner.b.a();
                Object[] objArr2 = new Object[i];
                objArr2[0] = str;
                objArr2[1] = str2;
                ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.alita.core.event.autorunner.b.a;
                if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "2fbe503f05c43edb33f8ac9728e3b7e3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "2fbe503f05c43edb33f8ac9728e3b7e3");
                } else {
                    AlitaAutoRunManager a3 = com.sankuai.waimai.alita.core.event.autorunner.c.a().a(str);
                    if (a3 != null) {
                        a3.a(str2);
                    }
                }
                com.sankuai.waimai.alita.bundle.a a4 = com.sankuai.waimai.alita.bundle.a.a();
                Object[] objArr3 = {str2};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.alita.bundle.a.a;
                if (PatchProxy.isSupport(objArr3, a4, changeQuickRedirect3, false, "52b0c86f6a186950b7d5d579b4066aa6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, a4, changeQuickRedirect3, false, "52b0c86f6a186950b7d5d579b4066aa6");
                } else {
                    a4.e.remove(str2);
                }
                com.sankuai.waimai.alita.bundle.a a5 = com.sankuai.waimai.alita.bundle.a.a();
                Object[] objArr4 = {str2};
                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.alita.bundle.a.a;
                if (PatchProxy.isSupport(objArr4, a5, changeQuickRedirect4, false, "012efc9bab97aac8f70cbe158c8c2c64", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, a5, changeQuickRedirect4, false, "012efc9bab97aac8f70cbe158c8c2c64");
                } else if (a5.d != null) {
                    com.sankuai.waimai.alita.bundle.a.a().b();
                    com.sankuai.waimai.alita.bundle.cache.a aVar2 = a5.d;
                    Object[] objArr5 = {str2};
                    ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.alita.bundle.cache.a.a;
                    if (PatchProxy.isSupport(objArr5, aVar2, changeQuickRedirect5, false, "f26e53453b760af504b8acd507b815df", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, aVar2, changeQuickRedirect5, false, "f26e53453b760af504b8acd507b815df");
                    } else {
                        File file = new File(com.sankuai.waimai.alita.bundle.a.a().b(aVar2.b) + File.separator + "js" + File.separator + "debug");
                        if (file.exists()) {
                            com.sankuai.waimai.alita.core.utils.f.a(file, str2);
                        }
                    }
                }
                com.sankuai.waimai.alita.core.utils.c.a("AlitaEngine.deleteBundleList(): JsBundle删除完成:" + str2);
                i = 2;
            }
        } else {
            com.sankuai.waimai.alita.core.utils.c.a("AlitaEngine.deleteBundleList(): 无减少的JsBundle");
        }
    }

    public static /* synthetic */ void d(final a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "0d63005816952122315fb2846d403a40", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "0d63005816952122315fb2846d403a40");
            return;
        }
        AIData.init(aVar.h);
        AIData.subscribeRealTimeData("", AlitaRealTimeEventCenter.getInstance().getLxEventFilter(), AlitaRealTimeEventCenter.getInstance());
        aVar.d.a(AlitaRealTimeEventCenter.getInstance());
        aVar.d.a(com.sankuai.waimai.alita.core.intention.c.a());
        if (aVar.i == null) {
            aVar.i = new BroadcastReceiver() { // from class: com.sankuai.waimai.alita.platform.AlitaSDKManager$6
                public static ChangeQuickRedirect a;

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    Object[] objArr2 = {context, intent};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "09225932fe5237d3649475b734db4d93", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "09225932fe5237d3649475b734db4d93");
                    } else if (intent == null) {
                        com.sankuai.waimai.alita.core.utils.c.a("session_receiver | intent = null");
                    } else {
                        String a2 = com.sankuai.waimai.platform.utils.f.a(intent, "new_session");
                        if (TextUtils.isEmpty(a2)) {
                            com.sankuai.waimai.alita.core.utils.c.a("session_receiver | intent = null");
                            return;
                        }
                        com.sankuai.waimai.alita.core.utils.c.a("session_receiver | new_session | " + a2);
                        a.this.d.b((com.sankuai.waimai.alita.core.config.observabledata.a<String>) a2);
                    }
                }
            };
            com.meituan.android.singleton.b.a.getApplicationContext().registerReceiver(aVar.i, new IntentFilter(SessionManager.ACTION_SESSION_CHANGED));
        }
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90436bde3e2fa6d6a535de0f25fd98e7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90436bde3e2fa6d6a535de0f25fd98e7");
            return;
        }
        this.d = new com.sankuai.waimai.alita.core.config.observabledata.a<String>() { // from class: com.sankuai.waimai.alita.platform.a.1
            public static ChangeQuickRedirect c;

            @Override // com.sankuai.waimai.alita.core.config.observabledata.a
            public final /* synthetic */ boolean a(String str, String str2) {
                String str3 = str;
                String str4 = str2;
                Object[] objArr2 = {str3, str4};
                ChangeQuickRedirect changeQuickRedirect2 = c;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "25a761dd975d22f2f7565c33340739fc", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "25a761dd975d22f2f7565c33340739fc")).booleanValue() : TextUtils.equals(str3, str4);
            }
        };
        c.c(this);
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b860c0249d72b756cb352fb977341299", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b860c0249d72b756cb352fb977341299");
        }
        if (e == null) {
            synchronized (a.class) {
                if (e == null) {
                    e = new a();
                }
            }
        }
        return e;
    }

    public static String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e1778b4975336a7328cd8347eca33785", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e1778b4975336a7328cd8347eca33785") : Statistics.getSession();
    }

    public final synchronized void a(Context context, @NonNull final com.sankuai.waimai.alita.platform.init.d dVar, final i iVar) {
        boolean z;
        Object[] objArr = {context, dVar, iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "220dba3a6566fbea0b154a2c4330e35e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "220dba3a6566fbea0b154a2c4330e35e");
        } else if (f) {
            iVar.a(g);
            AlitaRealTimeEventCenter alitaRealTimeEventCenter = AlitaRealTimeEventCenter.getInstance();
            a.C0701a a2 = a.C0701a.a("alita_init");
            a2.b = AlitaMonitorCenter.AlitaExceptionMonitorConst.BUSINESS;
            alitaRealTimeEventCenter.writeAlitaCustomEvent(AlitaMonitorCenter.AlitaExceptionMonitorConst.BUSINESS, a2.a());
        } else {
            try {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "45b63aedae2ca4c16839a825570087cb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "45b63aedae2ca4c16839a825570087cb");
                } else {
                    try {
                        Class.forName("com.sankuai.waimai.alita.assistant.debugger.debugger.AlitaDebugger").getMethod("autoConnect", Boolean.TYPE).invoke(null, Boolean.TRUE);
                    } catch (Exception unused) {
                    }
                }
                this.h = context;
                c.a(dVar.b);
                com.sankuai.waimai.alita.platform.debug.a.a(dVar.c);
                z = false;
                try {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1d184f58c62736983af0e472af70d915", RobustBitConfig.DEFAULT_VALUE)) {
                        z = false;
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1d184f58c62736983af0e472af70d915");
                    } else {
                        com.sankuai.waimai.alita.platform.horn.b.a().b();
                    }
                    if (!c()) {
                        com.sankuai.waimai.alita.core.utils.c.a("Alita 功能关闭");
                        b(true, iVar);
                        return;
                    }
                    com.sankuai.waimai.alita.platform.knbbridge.a.a();
                    com.sankuai.waimai.alita.core.utils.c.a("alita init async start");
                    com.sankuai.waimai.alita.core.utils.a.a(new a.AbstractC0713a() { // from class: com.sankuai.waimai.alita.platform.a.4
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.alita.core.utils.a.AbstractC0713a
                        public final void a() {
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "e03fb41b716ed07e1096d755d55ce9cf", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "e03fb41b716ed07e1096d755d55ce9cf");
                                return;
                            }
                            AlitaBizConfigManager.a a3 = AlitaBizConfigManager.a(AlitaMonitorCenter.AlitaExceptionMonitorConst.BUSINESS);
                            a3.c = 0;
                            a3.a(new AlitaBizConfigManager.a.InterfaceC0698a() { // from class: com.sankuai.waimai.alita.platform.a.4.1
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.waimai.alita.core.config.AlitaBizConfigManager.a.InterfaceC0698a
                                public final void a(@NonNull AlitaBizConfigManager alitaBizConfigManager, boolean z2, String str) {
                                    String str2;
                                    int i;
                                    Object[] objArr5 = {alitaBizConfigManager, Byte.valueOf(z2 ? (byte) 1 : (byte) 0), str};
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "4031d44246d7e80869c3c6fdab67fb10", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "4031d44246d7e80869c3c6fdab67fb10");
                                        return;
                                    }
                                    try {
                                        HashMap hashMap = new HashMap();
                                        hashMap.put("config", str);
                                        com.sankuai.waimai.alita.core.utils.c.a("alita_config", "AlitaSDK", "", (HashMap<String, Object>) hashMap);
                                    } catch (Exception unused2) {
                                    }
                                    try {
                                        if (z2) {
                                            str2 = AlitaMonitorCenter.AlitaMonitorConst.BizConfig.TAG_VALUE_ERROR_CODE_SUCCESS;
                                            i = 1;
                                        } else {
                                            str2 = AlitaMonitorCenter.AlitaMonitorConst.BizConfig.TAG_VALUE_ERROR_CODE_FAILED;
                                            i = 0;
                                        }
                                        AlitaMonitorCenter.getCenter().getMonitor().availabilityLogBuilder(AlitaMonitorCenter.AlitaMonitorConst.BizConfig.MONITOR_KEY, i, AlitaMonitorCenter.AlitaExceptionMonitorConst.BUSINESS).biz(AlitaMonitorCenter.AlitaExceptionMonitorConst.BUSINESS).errorCode(str2).commit();
                                        com.sankuai.waimai.alita.core.config.c.a().a(alitaBizConfigManager);
                                        com.sankuai.waimai.alita.core.utils.c.a("alita async init doing");
                                        a.a(a.this);
                                        a.b(a.this);
                                        com.sankuai.waimai.alita.bundle.a.a().a(a.this.h);
                                        com.sankuai.waimai.alita.bundle.a a4 = com.sankuai.waimai.alita.bundle.a.a();
                                        Context context2 = a.this.h;
                                        Object[] objArr6 = {context2};
                                        ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.alita.bundle.a.a;
                                        if (PatchProxy.isSupport(objArr6, a4, changeQuickRedirect6, false, "a83d49ef6833b8719c008cc79b943926", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr6, a4, changeQuickRedirect6, false, "a83d49ef6833b8719c008cc79b943926");
                                        } else if (context2 != null) {
                                            com.sankuai.waimai.alita.core.utils.f.a(new File(a4.b(context2) + File.separator));
                                        }
                                        a.a(a.this.h, dVar);
                                        a.a(dVar);
                                        a.d(a.this);
                                        a.a(a.this, AlitaMonitorCenter.AlitaExceptionMonitorConst.BUSINESS);
                                        com.sankuai.waimai.alita.core.engine.e a5 = com.sankuai.waimai.alita.core.engine.e.a();
                                        com.sankuai.waimai.alita.platform.monitor.a aVar = new com.sankuai.waimai.alita.platform.monitor.a();
                                        Object[] objArr7 = {aVar};
                                        ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.alita.core.engine.e.a;
                                        if (PatchProxy.isSupport(objArr7, a5, changeQuickRedirect7, false, "fff9e070cb22fae48fa71102bf959dd3", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr7, a5, changeQuickRedirect7, false, "fff9e070cb22fae48fa71102bf959dd3");
                                        } else {
                                            com.sankuai.waimai.alita.core.engine.e.b.add(aVar);
                                        }
                                        Context context3 = a.this.h;
                                        Object[] objArr8 = {context3};
                                        ChangeQuickRedirect changeQuickRedirect8 = com.sankuai.waimai.alita.core.mlmodel.predictor.c.a;
                                        if (PatchProxy.isSupport(objArr8, null, changeQuickRedirect8, true, "51343171f9b9f5dc1e46e7dc8d1e3b30", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr8, null, changeQuickRedirect8, true, "51343171f9b9f5dc1e46e7dc8d1e3b30");
                                        } else {
                                            com.sankuai.waimai.alita.core.mlmodel.predictor.b.a().a(new com.sankuai.waimai.alita.core.mlmodel.predictor.xgb.a());
                                            com.sankuai.waimai.alita.core.mlmodel.predictor.b.a().a(new com.sankuai.waimai.alita.core.mlmodel.predictor.mtnn.b(context3));
                                        }
                                        AlitaRealTimeEventCenter.getInstance().addRealtimeEventFilter(AlitaMonitorCenter.AlitaExceptionMonitorConst.BUSINESS, new g() { // from class: com.sankuai.waimai.alita.platform.a.4.1.1
                                            @Override // com.sankuai.waimai.alita.platform.init.g
                                            public final com.sankuai.waimai.alita.platform.init.e a() {
                                                return null;
                                            }

                                            @Override // com.sankuai.waimai.alita.platform.init.g
                                            public final com.sankuai.waimai.alita.platform.init.e b() {
                                                return null;
                                            }
                                        });
                                        AlitaRealTimeEventCenter.getInstance().addEventListener(AlitaMonitorCenter.AlitaExceptionMonitorConst.BUSINESS, new com.sankuai.waimai.alita.core.event.c() { // from class: com.sankuai.waimai.alita.platform.a.4.1.2
                                            public static ChangeQuickRedirect a;

                                            @Override // com.sankuai.waimai.alita.core.event.c
                                            public final void a(com.sankuai.waimai.alita.core.event.a aVar2) {
                                                Object[] objArr9 = {aVar2};
                                                ChangeQuickRedirect changeQuickRedirect9 = a;
                                                if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "3cae7f0f613abc81ea939b126ffd972a", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "3cae7f0f613abc81ea939b126ffd972a");
                                                } else if ("AS".equalsIgnoreCase(aVar2.a())) {
                                                    com.sankuai.waimai.alita.core.utils.a.a(new Runnable() { // from class: com.sankuai.waimai.alita.platform.a.4.1.2.1
                                                        public static ChangeQuickRedirect a;

                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            Object[] objArr10 = new Object[0];
                                                            ChangeQuickRedirect changeQuickRedirect10 = a;
                                                            if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "2649f327fa1ddefbc62455edc9eaa283", RobustBitConfig.DEFAULT_VALUE)) {
                                                                PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "2649f327fa1ddefbc62455edc9eaa283");
                                                                return;
                                                            }
                                                            final com.sankuai.waimai.alita.core.datadownload.b a6 = com.sankuai.waimai.alita.core.datadownload.b.a();
                                                            Object[] objArr11 = {1};
                                                            ChangeQuickRedirect changeQuickRedirect11 = com.sankuai.waimai.alita.core.datadownload.b.c;
                                                            if (PatchProxy.isSupport(objArr11, a6, changeQuickRedirect11, false, "4cea286d95559d074ab6d7e10ccd211d", RobustBitConfig.DEFAULT_VALUE)) {
                                                                PatchProxy.accessDispatch(objArr11, a6, changeQuickRedirect11, false, "4cea286d95559d074ab6d7e10ccd211d");
                                                            } else {
                                                                a6.a(new b.InterfaceC0697b<com.sankuai.waimai.alita.core.datadownload.a>() { // from class: com.sankuai.waimai.alita.core.datadownload.b.1
                                                                    public static ChangeQuickRedirect a;

                                                                    @Override // com.sankuai.waimai.alita.core.base.b.InterfaceC0697b
                                                                    public final /* synthetic */ void a(@NonNull a aVar3) {
                                                                        a aVar4 = aVar3;
                                                                        Object[] objArr12 = {aVar4};
                                                                        ChangeQuickRedirect changeQuickRedirect12 = a;
                                                                        if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "ab73c9f1c957d18a7150fb0b952b40e4", RobustBitConfig.DEFAULT_VALUE)) {
                                                                            PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "ab73c9f1c957d18a7150fb0b952b40e4");
                                                                        } else {
                                                                            aVar4.a(r2);
                                                                        }
                                                                    }
                                                                });
                                                            }
                                                        }
                                                    }, 3000, "alita_async_change_foreground");
                                                }
                                            }
                                        });
                                        a.b(true, iVar);
                                    } catch (Exception e2) {
                                        HashMap hashMap2 = new HashMap();
                                        hashMap2.put("alita async init fault", e2.getMessage());
                                        com.sankuai.waimai.alita.core.utils.c.b("alita_engine", (String) null, "init", (HashMap<String, Object>) hashMap2);
                                        a.b(false, iVar);
                                    }
                                }
                            });
                        }
                    }, "alita_async_init");
                } catch (Throwable th) {
                    th = th;
                    b(z, iVar);
                    HashMap hashMap = new HashMap();
                    hashMap.put("alita init fault", th.getMessage());
                    com.sankuai.waimai.alita.core.utils.c.b("alita_engine", (String) null, "init", (HashMap<String, Object>) hashMap);
                }
            } catch (Throwable th2) {
                th = th2;
                z = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(boolean z, i iVar) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bcddfa9df13319151f2296d9d62d3c3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bcddfa9df13319151f2296d9d62d3c3d");
            return;
        }
        f = true;
        g = z;
        if (iVar != null) {
            iVar.a(z);
        }
        AlitaRealTimeEventCenter alitaRealTimeEventCenter = AlitaRealTimeEventCenter.getInstance();
        a.C0701a a2 = a.C0701a.a("alita_init");
        a2.b = AlitaMonitorCenter.AlitaExceptionMonitorConst.BUSINESS;
        alitaRealTimeEventCenter.writeAlitaCustomEvent(AlitaMonitorCenter.AlitaExceptionMonitorConst.BUSINESS, a2.a());
        if (z) {
            com.sankuai.waimai.alita.core.utils.c.a("alita_init", "AlitaSDK", "", (HashMap<String, Object>) null);
        }
    }

    public final synchronized void a(@NonNull com.sankuai.waimai.alita.platform.init.b bVar, @Nullable InterfaceC0717a interfaceC0717a) {
        Object[] objArr = {bVar, interfaceC0717a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a0f332d51e7ebaa6d09a10b0c74f745", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a0f332d51e7ebaa6d09a10b0c74f745");
        } else if (!c()) {
            com.sankuai.waimai.alita.core.utils.c.a("Alita 功能关闭");
        } else {
            bVar.f = interfaceC0717a;
            k.add(bVar);
            if (f) {
                String str = bVar.b;
                if (TextUtils.isEmpty(str)) {
                    com.sankuai.waimai.alita.core.utils.c.a("AlitaVSCodeDebug", "startBiz biz name is empty 直接回调onStartBizComplete");
                    b(str, -1, "biz name is empty");
                } else if (!j.contains(str)) {
                    if (b.containsKey(str)) {
                        com.sankuai.waimai.alita.core.utils.c.a("AlitaVSCodeDebug", "有startBiz结果 直接回调onStartBizComplete");
                        b(str, 0, "start biz success");
                        return;
                    }
                    a(bVar);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.sankuai.waimai.alita.core.config.observabledata.a.InterfaceC0700a
    /* renamed from: a */
    public synchronized void update(Integer num, Integer num2) {
        Object[] objArr = {num, num2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a62fed574c5351f3edb8d8f0bc4611e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a62fed574c5351f3edb8d8f0bc4611e2");
            return;
        }
        if (num.intValue() == 1) {
            for (com.sankuai.waimai.alita.platform.init.b bVar : k) {
                if (!j.contains(bVar.b)) {
                    a(bVar);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, int i, String str2) {
        Object[] objArr = {str, Integer.valueOf(i), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3bfce5f804516e7e9bfcc7a816bd3e80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3bfce5f804516e7e9bfcc7a816bd3e80");
            return;
        }
        for (com.sankuai.waimai.alita.platform.init.b bVar : k) {
            if (bVar.f != null && str.equals(bVar.b)) {
                bVar.f.a(b.get(str), i, str2);
                k.remove(bVar);
                com.sankuai.waimai.alita.core.utils.c.a("alita_start", str, "", (HashMap<String, Object>) null);
            }
        }
        j.remove(str);
    }

    public boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72d9af2e410d7e9ebb1e4fb5b5a5b7cf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72d9af2e410d7e9ebb1e4fb5b5a5b7cf")).booleanValue();
        }
        com.sankuai.waimai.alita.platform.horn.b.a();
        return com.sankuai.waimai.alita.platform.horn.b.c().a();
    }

    public final void a(final String str, final List<JSONObject> list, final h hVar) {
        Object[] objArr = {str, list, hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7772fe8c0f97bce87813dabec4e2295", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7772fe8c0f97bce87813dabec4e2295");
        } else if (!c()) {
            com.sankuai.waimai.alita.core.utils.c.a("Alita 功能关闭");
            com.sankuai.waimai.alita.core.base.util.c.a(hVar, new Exception("Alita 功能关闭"));
        } else {
            com.sankuai.waimai.alita.bundle.load.a.a(str, "js", new a.InterfaceC0694a() { // from class: com.sankuai.waimai.alita.platform.a.8
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.alita.bundle.load.a.InterfaceC0694a
                public final void a(com.sankuai.waimai.alita.bundle.model.a aVar) {
                    Object[] objArr2 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "47bf898f02dedaffdb3b2d7f2f9af75c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "47bf898f02dedaffdb3b2d7f2f9af75c");
                    } else if (aVar == null || !aVar.a()) {
                        com.sankuai.waimai.alita.core.utils.c.a("bundle load info invalid");
                        com.sankuai.waimai.alita.core.base.util.c.a(hVar, new Exception("bundle load info invalid"));
                    } else {
                        com.sankuai.waimai.alita.core.utils.c.a("bundle load success: " + str);
                        com.sankuai.waimai.alita.core.engine.a a2 = com.sankuai.waimai.alita.core.engine.d.a().a(aVar);
                        if (a2 == null) {
                            com.sankuai.waimai.alita.core.base.util.c.a(hVar, new Exception("JSEngine instance is null"));
                        } else if (!a2.a()) {
                            com.sankuai.waimai.alita.core.utils.c.a("hadLoadScript = false; bundle load jscript success");
                            a2.a(aVar.b, new h() { // from class: com.sankuai.waimai.alita.platform.a.8.1
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.waimai.alita.core.engine.h
                                public final void a(@Nullable String str2, @Nullable AlitaJSValue alitaJSValue) {
                                    Object[] objArr3 = {str2, alitaJSValue};
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "552f9798b178ff3d5de196ba1f7a213b", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "552f9798b178ff3d5de196ba1f7a213b");
                                    } else {
                                        com.sankuai.waimai.alita.core.engine.b.a().a(str2, list, hVar);
                                    }
                                }

                                @Override // com.sankuai.waimai.alita.core.engine.h
                                public final void a(@Nullable Exception exc) {
                                    Object[] objArr3 = {exc};
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a25b5054a9e92a46d5f81e8f523acf1d", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a25b5054a9e92a46d5f81e8f523acf1d");
                                    } else if (exc != null) {
                                        HashMap hashMap = new HashMap();
                                        hashMap.put("errorMessage", exc.getMessage());
                                        com.sankuai.waimai.alita.core.utils.c.b("alita_engine", (String) null, "asyncLoadJSBundleWithID", (HashMap<String, Object>) hashMap);
                                    }
                                }
                            });
                            a2.a(true);
                        } else {
                            a2.a(list, hVar);
                        }
                    }
                }

                @Override // com.sankuai.waimai.alita.bundle.load.a.InterfaceC0694a
                public final void a(com.sankuai.waimai.alita.bundle.load.b bVar) {
                    Object[] objArr2 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "aa1337b01ad53a3da2d5f208b2be1259", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "aa1337b01ad53a3da2d5f208b2be1259");
                        return;
                    }
                    com.sankuai.waimai.alita.core.utils.c.a("bundle load with error: " + bVar.getMessage());
                    if (hVar != null) {
                        hVar.a(bVar);
                    }
                }
            });
        }
    }

    public final synchronized void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1528c11b9098d2dc32a8cc1e0e7e4c81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1528c11b9098d2dc32a8cc1e0e7e4c81");
        } else if (b.containsKey(str)) {
            b.remove(str);
            AlitaAutoRunManager a2 = com.sankuai.waimai.alita.core.event.autorunner.c.a().a(str);
            if (a2 != null) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = AlitaAutoRunManager.a;
                if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "aaf750a310025b880c29198dbfb40f62", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "aaf750a310025b880c29198dbfb40f62");
                } else if (a2.e != null && !a2.e.isEmpty()) {
                    for (Map.Entry<String, com.sankuai.waimai.alita.core.event.autorunner.d> entry : a2.e.entrySet()) {
                        com.sankuai.waimai.alita.core.event.autorunner.d value = entry.getValue();
                        if (value != null) {
                            value.a();
                        }
                    }
                    a2.e.clear();
                }
                AlitaRealTimeEventCenter.getInstance().removeRealtimeEventFilter(str);
                Object[] objArr3 = {str};
                ChangeQuickRedirect changeQuickRedirect3 = AlitaAutoRunManager.a;
                if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "821570e3ccf124c936ee5cc5c05fb3c9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "821570e3ccf124c936ee5cc5c05fb3c9");
                } else {
                    AlitaRealTimeEventCenter.getInstance().removeEventListener(str);
                }
            }
            com.sankuai.waimai.alita.core.event.autorunner.c a3 = com.sankuai.waimai.alita.core.event.autorunner.c.a();
            Object[] objArr4 = {str};
            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.alita.core.event.autorunner.c.a;
            if (PatchProxy.isSupport(objArr4, a3, changeQuickRedirect4, false, "1332610cd258ee5559c667aaa41d9097", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, a3, changeQuickRedirect4, false, "1332610cd258ee5559c667aaa41d9097");
            } else {
                c.a a4 = a3.b.a((com.sankuai.waimai.alita.core.base.g<String, c.a>) str);
                com.sankuai.waimai.alita.core.base.g<String, c.a> gVar = a3.b;
                Object[] objArr5 = {a4};
                ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.alita.core.base.g.a;
                if (PatchProxy.isSupport(objArr5, gVar, changeQuickRedirect5, false, "0c6b1c62c9932b2846cde09d20cfe425", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, gVar, changeQuickRedirect5, false, "0c6b1c62c9932b2846cde09d20cfe425");
                } else if (a4 != null) {
                    gVar.b.remove(a4);
                }
            }
            j.remove(str);
            AlitaBizConfigManager a5 = com.sankuai.waimai.alita.core.config.c.a().a(str);
            if (a5 != null) {
                Object[] objArr6 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect6 = AlitaBizConfigManager.a;
                if (PatchProxy.isSupport(objArr6, a5, changeQuickRedirect6, false, "7892263ba257308f73afebea6b36cbf5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, a5, changeQuickRedirect6, false, "7892263ba257308f73afebea6b36cbf5");
                    return;
                }
                com.sankuai.waimai.alita.core.config.a aVar = a5.e;
                Object[] objArr7 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.alita.core.config.a.a;
                if (PatchProxy.isSupport(objArr7, aVar, changeQuickRedirect7, false, "8911f349b7935a1e366635461d36767a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr7, aVar, changeQuickRedirect7, false, "8911f349b7935a1e366635461d36767a");
                    return;
                }
                if (aVar.b != null) {
                    aVar.b.b();
                }
                if (aVar.c != null) {
                    aVar.c.b();
                }
                if (aVar.d != null) {
                    aVar.d.b();
                }
                if (aVar.g != null) {
                    aVar.g.b();
                }
                if (aVar.e != null) {
                    aVar.e.b();
                }
            }
        }
    }

    private synchronized void a(@NonNull final com.sankuai.waimai.alita.platform.init.b bVar) {
        boolean z = true;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bef6fcd11c30f228fc93d756d59fee12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bef6fcd11c30f228fc93d756d59fee12");
            return;
        }
        final String str = bVar.b;
        com.sankuai.waimai.alita.bundle.load.a.a(str);
        j.add(str);
        if (bVar.d != null) {
            AlitaBizConfigManager.a a2 = AlitaBizConfigManager.a(str);
            a2.c = 0;
            a2.d = null;
            a2.a(new AlitaBizConfigManager.a.InterfaceC0698a() { // from class: com.sankuai.waimai.alita.platform.a.6
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.alita.core.config.AlitaBizConfigManager.a.InterfaceC0698a
                public final void a(@NonNull AlitaBizConfigManager alitaBizConfigManager, boolean z2, String str2) {
                    String str3;
                    int i;
                    Object[] objArr2 = {alitaBizConfigManager, Byte.valueOf(z2 ? (byte) 1 : (byte) 0), str2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "baf301272e68a6b2731393903a51c537", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "baf301272e68a6b2731393903a51c537");
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("config", str2);
                    com.sankuai.waimai.alita.core.utils.c.a("alita_config", str, "", (HashMap<String, Object>) hashMap);
                    a.b.put(str, str2);
                    if (z2) {
                        str3 = AlitaMonitorCenter.AlitaMonitorConst.BizConfig.TAG_VALUE_ERROR_CODE_SUCCESS;
                        i = 1;
                    } else {
                        str3 = AlitaMonitorCenter.AlitaMonitorConst.BizConfig.TAG_VALUE_ERROR_CODE_FAILED;
                        i = 0;
                    }
                    AlitaMonitorCenter.getCenter().getMonitor().availabilityLogBuilder(AlitaMonitorCenter.AlitaMonitorConst.BizConfig.MONITOR_KEY, i, str).biz(str).errorCode(str3).commit();
                    com.sankuai.waimai.alita.core.config.c.a().a(alitaBizConfigManager);
                    List<j> list = bVar.c;
                    if (!com.sankuai.waimai.alita.core.utils.h.a(list)) {
                        f.a().a(list);
                    }
                    com.sankuai.waimai.alita.core.dataupload.f a3 = com.sankuai.waimai.alita.core.dataupload.f.a();
                    com.sankuai.waimai.alita.core.dataupload.e eVar = new com.sankuai.waimai.alita.core.dataupload.e(str);
                    Object[] objArr3 = {eVar};
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.alita.core.dataupload.f.a;
                    if (PatchProxy.isSupport(objArr3, a3, changeQuickRedirect3, false, "3f6cbad51aa2d8fab59df054ba8003d6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, a3, changeQuickRedirect3, false, "3f6cbad51aa2d8fab59df054ba8003d6");
                    } else {
                        a3.b.a((com.sankuai.waimai.alita.core.base.g<String, f.a>) new f.a(eVar));
                    }
                    try {
                        ((com.sankuai.waimai.alita.core.dataupload.e) Objects.requireNonNull(com.sankuai.waimai.alita.core.dataupload.f.a().a(str))).a(alitaBizConfigManager.e.e);
                    } catch (Exception unused) {
                    }
                    try {
                        com.sankuai.waimai.alita.core.featuredatareport.d.a().a(str).a(alitaBizConfigManager.e.h);
                    } catch (Exception unused2) {
                    }
                    com.sankuai.waimai.alita.core.event.autorunner.c.a().b(str);
                    g gVar = bVar.e;
                    if (gVar != null) {
                        AlitaRealTimeEventCenter.getInstance().addRealtimeEventFilter(str, gVar);
                    }
                    a.a(a.this, str);
                    com.sankuai.waimai.alita.core.datadownload.a a4 = com.sankuai.waimai.alita.core.datadownload.b.a().a(str);
                    if (a4 != null) {
                        a4.a(0);
                    }
                    a.b(str, 0, "success");
                }
            });
        } else {
            z = false;
        }
        if (!z) {
            b(str, -1, "not ready");
        }
    }
}
