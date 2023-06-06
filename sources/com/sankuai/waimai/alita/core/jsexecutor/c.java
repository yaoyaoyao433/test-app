package com.sankuai.waimai.alita.core.jsexecutor;

import android.content.Context;
import android.os.Handler;
import android.support.annotation.NonNull;
import com.dianping.jscore.JSExecutor;
import com.dianping.jscore.JavaScriptInterface;
import com.dianping.jscore.SOLibraryLoader;
import com.dianping.jscore.Value;
import com.dianping.jscore.model.ArchiveException;
import com.dianping.jscore.model.Encoding;
import com.meituan.android.common.sniffer.db.SnifferDBHelper;
import com.meituan.android.soloader.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.engine.j;
import com.sankuai.waimai.alita.core.jsexecutor.modules.m;
import com.sankuai.waimai.alita.core.jsexecutor.task.g;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c implements g, h {
    public static ChangeQuickRedirect a;
    JSExecutor b;
    protected volatile d c;
    private Handler d;

    public static /* synthetic */ void a(c cVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "f0113e3a7c2fc1b42d7dc0a2cfb60b93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "f0113e3a7c2fc1b42d7dc0a2cfb60b93");
        } else if (cVar.b == null) {
            cVar.b = JSExecutor.create();
            JSExecutor jSExecutor = cVar.b;
            Object[] objArr2 = {jSExecutor};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "004f9bf49577b909617c644eec9f66dc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "004f9bf49577b909617c644eec9f66dc");
            } else if (com.sankuai.waimai.alita.platform.init.c.c()) {
                jSExecutor.injectGlobalJSObject("console", new Value(new a(cVar.d, new com.sankuai.waimai.alita.core.engine.g() { // from class: com.sankuai.waimai.alita.core.jsexecutor.c.3
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.alita.core.engine.g
                    public final void a(String str) {
                        Object[] objArr3 = {str};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1d6611e5bd41c43a006389b60f65ff27", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1d6611e5bd41c43a006389b60f65ff27");
                        } else {
                            com.sankuai.waimai.alita.core.utils.c.c(str);
                        }
                    }
                })));
            }
            cVar.c.d = cVar.b;
            com.sankuai.waimai.alita.core.utils.c.a("AlitaJSExecutor | initialize | Executor = " + cVar + " | jsCore " + cVar.b + " | jsworkdr " + cVar.c);
        }
    }

    public static /* synthetic */ void a(c cVar, String str, Throwable th, String str2) {
        Object[] objArr = {str, th, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "044977968cb1641053423bbff7498522", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "044977968cb1641053423bbff7498522");
            return;
        }
        com.sankuai.waimai.alita.core.utils.e.a();
        com.sankuai.waimai.alita.core.utils.c.a(str + " | " + th.getMessage() + str2);
        if (cVar.c != null) {
            d dVar = cVar.c;
            Exception exc = new Exception(th);
            Object[] objArr2 = {str, exc};
            ChangeQuickRedirect changeQuickRedirect2 = d.a;
            if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "982aea3f4fbb78faa191c9b8faa8f1f7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "982aea3f4fbb78faa191c9b8faa8f1f7");
                return;
            }
            dVar.a("onJSExecuteException");
            dVar.c.a(str, exc);
            dVar.c();
        }
    }

    public c(final Context context, long j) {
        Object[] objArr = {context, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b31953d53251f30a2f6565dd5a1ca70", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b31953d53251f30a2f6565dd5a1ca70");
            return;
        }
        this.c = new d(j);
        this.d = new Handler(context.getMainLooper());
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a627c4cdbc57af9b32442d0edff6441a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a627c4cdbc57af9b32442d0edff6441a");
        } else {
            b(new Runnable() { // from class: com.sankuai.waimai.alita.core.jsexecutor.c.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c0df942f1acbf1cf94672548c6a62b7a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c0df942f1acbf1cf94672548c6a62b7a");
                        return;
                    }
                    com.sankuai.waimai.alita.core.utils.c.a("AlitaJSExecutor | initialize");
                    Context context2 = context;
                    Object[] objArr4 = {context2};
                    ChangeQuickRedirect changeQuickRedirect4 = i.a;
                    if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "0c01e133793cfd0ade68ede1fb295cd2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "0c01e133793cfd0ade68ede1fb295cd2");
                    } else {
                        if (SOLibraryLoader.sContext == null) {
                            SOLibraryLoader.sContext = context2;
                        }
                        k.a(context2, false);
                    }
                    c.a(c.this);
                }
            });
        }
    }

    private void b(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09fedf77effe1c54dd68a0b42f072903", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09fedf77effe1c54dd68a0b42f072903");
        } else if (this.c != null) {
            this.c.a(runnable);
        }
    }

    private void b(final com.sankuai.waimai.alita.core.jsexecutor.task.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f967cc4be694d0bcad9e738b2b0a7aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f967cc4be694d0bcad9e738b2b0a7aa");
        } else if (this.c != null) {
            this.c.a(new Runnable() { // from class: com.sankuai.waimai.alita.core.jsexecutor.c.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "35dc71bb376c462de7f135af87eb7862", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "35dc71bb376c462de7f135af87eb7862");
                    } else {
                        c.this.a(aVar);
                    }
                }
            });
        }
    }

    synchronized void a(com.sankuai.waimai.alita.core.jsexecutor.task.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be54c36f8bcd8070cbcffaacd320b69d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be54c36f8bcd8070cbcffaacd320b69d");
            return;
        }
        com.sankuai.waimai.alita.core.utils.e.a();
        if (this.c != null) {
            d dVar = this.c;
            Object[] objArr2 = {aVar};
            ChangeQuickRedirect changeQuickRedirect2 = d.a;
            if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "94937add0efa1e37a0c836b22c0cdab3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "94937add0efa1e37a0c836b22c0cdab3");
            } else if (!dVar.d()) {
                com.sankuai.waimai.alita.core.utils.c.a("AlitaJSWorker handle is null");
            } else {
                dVar.a("enqueue");
                long a2 = d.a();
                Object[] objArr3 = {new Long(a2)};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.alita.core.jsexecutor.task.a.a;
                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "cb2872ea7731ccdb7e0f67ba33f063ae", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "cb2872ea7731ccdb7e0f67ba33f063ae");
                } else {
                    aVar.e = a2;
                }
                aVar.d = dVar;
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.alita.core.jsexecutor.task.a.a;
                if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "97f3ec431bcaea4e21881ee9ae8398be", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "97f3ec431bcaea4e21881ee9ae8398be");
                } else {
                    aVar.f = System.currentTimeMillis();
                    aVar.c = com.sankuai.waimai.alita.core.jsexecutor.task.h.STATUS_WAITING;
                    aVar.d("STATUS_WAITING");
                }
                dVar.c.a(aVar);
                com.sankuai.waimai.alita.core.jsexecutor.task.a a3 = dVar.c.a();
                if (a3 != null) {
                    a3.h();
                    dVar.b.post(a3);
                }
            }
        }
    }

    @Override // com.sankuai.waimai.alita.core.jsexecutor.g
    public final synchronized void a(com.sankuai.waimai.alita.core.jsexecutor.task.d dVar, String str, String str2, JSONObject jSONObject, com.sankuai.waimai.alita.core.engine.h hVar) {
        Object[] objArr = {dVar, str, str2, jSONObject, hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f928ff7aab176e9a4de4fe8bc9664bf9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f928ff7aab176e9a4de4fe8bc9664bf9");
            return;
        }
        g.a aVar = new g.a();
        aVar.b = str2;
        aVar.h = dVar;
        aVar.g = jSONObject;
        aVar.j = hVar;
        aVar.e = str;
        aVar.i = this;
        b((com.sankuai.waimai.alita.core.jsexecutor.task.a) new com.sankuai.waimai.alita.core.jsexecutor.task.f(aVar.a()));
    }

    @Override // com.sankuai.waimai.alita.core.jsexecutor.g
    public final synchronized void a(com.sankuai.waimai.alita.core.jsexecutor.task.d dVar, String str, List<JSONObject> list, com.sankuai.waimai.alita.core.engine.h hVar) {
        Object[] objArr = {dVar, str, list, hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4651e887dc53ee8b5df88f1a9c74b6ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4651e887dc53ee8b5df88f1a9c74b6ef");
            return;
        }
        g.a aVar = new g.a();
        aVar.b = str;
        aVar.h = dVar;
        aVar.j = hVar;
        aVar.f = list;
        b((com.sankuai.waimai.alita.core.jsexecutor.task.a) new com.sankuai.waimai.alita.core.jsexecutor.task.c(aVar.a()));
    }

    @Override // com.sankuai.waimai.alita.core.jsexecutor.g
    public final synchronized void a(com.sankuai.waimai.alita.core.jsexecutor.task.d dVar, String str, com.sankuai.waimai.alita.core.engine.h hVar) {
        Object[] objArr = {dVar, str, hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "581eb83a62d1ca0628a17cafb62393e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "581eb83a62d1ca0628a17cafb62393e2");
            return;
        }
        g.a aVar = new g.a();
        aVar.b = str;
        aVar.h = dVar;
        aVar.j = hVar;
        b((com.sankuai.waimai.alita.core.jsexecutor.task.a) new com.sankuai.waimai.alita.core.jsexecutor.task.e(aVar.a()));
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.alita.core.jsexecutor.c$4  reason: invalid class name */
    /* loaded from: classes4.dex */
    public class AnonymousClass4 implements Runnable {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;

        public AnonymousClass4(String str, String str2, String str3, String str4, String str5) {
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z;
            com.sankuai.waimai.alita.core.jsexecutor.task.a peek;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65c4749a8459f6f18c27a29e18d32a03", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65c4749a8459f6f18c27a29e18d32a03");
                return;
            }
            com.sankuai.waimai.alita.core.utils.c.a("alita_js", this.b + " | RunnableRun | onInvokeNativeBridge: " + this.c + " - " + this.d + " | Thread: " + Thread.currentThread());
            com.sankuai.waimai.alita.core.utils.e.a();
            Map<String, com.sankuai.waimai.alita.core.jsexecutor.modules.a> a2 = f.a().a(this.e);
            Object[] objArr2 = {a2};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.alita.core.utils.h.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "3c54658bd9071375ee5ca680bbc8e258", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "3c54658bd9071375ee5ca680bbc8e258")).booleanValue();
            } else {
                z = a2 == null || a2.size() <= 0;
            }
            if (z) {
                com.sankuai.waimai.alita.core.utils.c.a("onInvokeNativeBridge 无法匹配到对应的 module | " + this.e);
                return;
            }
            com.sankuai.waimai.alita.core.jsexecutor.modules.a aVar = a2.get(this.c);
            if (aVar == null) {
                com.sankuai.waimai.alita.core.utils.c.a("onInvokeNativeBridge 无法匹配到对应的 method | " + this.c);
                return;
            }
            if (c.this.c != null) {
                d dVar = c.this.c;
                String str = this.b;
                String str2 = this.d;
                Object[] objArr3 = {str, str2};
                ChangeQuickRedirect changeQuickRedirect3 = d.a;
                if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "3e771749c638fbcbf01840b6a483cfb6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "3e771749c638fbcbf01840b6a483cfb6");
                } else if (dVar.c != null) {
                    b bVar = dVar.c;
                    Object[] objArr4 = {str, str2};
                    ChangeQuickRedirect changeQuickRedirect4 = b.a;
                    if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "609b02fbb5a0d13e4b8809fa4135de35", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "609b02fbb5a0d13e4b8809fa4135de35");
                    } else if (!bVar.b.containsKey(str)) {
                        com.sankuai.waimai.alita.core.utils.c.e(str + "| AlitaExecutorTaskQueue | cacheCallBackIDIntoTask | 没有找到Queue | callBackID: " + str2 + " | Thread: " + Thread.currentThread());
                    } else if (bVar.b.containsKey(str) && (peek = bVar.b.get(str).peek()) != null) {
                        Object[] objArr5 = {str2};
                        ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.alita.core.jsexecutor.task.a.a;
                        if (PatchProxy.isSupport(objArr5, peek, changeQuickRedirect5, false, "81621bd19c39708a64206a8430a9f649", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, peek, changeQuickRedirect5, false, "81621bd19c39708a64206a8430a9f649");
                        } else {
                            com.sankuai.waimai.alita.core.utils.c.e(peek.a() + " | cacheCallBackID | callbackID: " + str2 + " | recordNO. " + peek.e + " | Thread: " + Thread.currentThread());
                            peek.g.add(str2);
                        }
                    }
                }
            }
            HashMap hashMap = new HashMap();
            hashMap.put("bridge_name", this.c);
            com.sankuai.waimai.alita.core.jsexecutor.task.d a3 = j.a().a(this.b);
            hashMap.put("bundle_id", a3 != null ? a3.b : "");
            hashMap.put("params", this.f);
            hashMap.put("callbackId", this.d);
            com.sankuai.waimai.alita.core.utils.c.b("alita_js", (String) null, "bridgeCall", (Map<String, Object>) hashMap);
            aVar.a(this.b, this.f, this.d, new m() { // from class: com.sankuai.waimai.alita.core.jsexecutor.c.4.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.alita.core.jsexecutor.modules.m
                public final void a(final String str3, final String str4) {
                    Object[] objArr6 = {str3, str4};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "06e94324f84665a8e3ff24db51e29f34", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "06e94324f84665a8e3ff24db51e29f34");
                    } else {
                        c.this.a(new Runnable() { // from class: com.sankuai.waimai.alita.core.jsexecutor.c.4.1.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr7 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect7 = a;
                                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "a7d9aeba93bd649fe9127e135a9ced7e", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "a7d9aeba93bd649fe9127e135a9ced7e");
                                    return;
                                }
                                com.sankuai.waimai.alita.core.utils.e.a();
                                c.this.a(AnonymousClass4.this.b, str4, str3);
                            }
                        });
                    }
                }
            });
        }
    }

    @Override // com.sankuai.waimai.alita.core.jsexecutor.h
    public final synchronized void a(String str, String str2, String str3, String str4, String str5) {
        Object[] objArr = {str, str2, str3, str4, str5};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "972686ab6cbf6cb84c3b2051ff615330", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "972686ab6cbf6cb84c3b2051ff615330");
        } else {
            a(new AnonymousClass4(str, str3, str5, str2, str4));
        }
    }

    public final synchronized void a(final String str, final String str2, final String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6737aff57bda8f3349987c87cfa967d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6737aff57bda8f3349987c87cfa967d2");
        } else {
            a(new Runnable() { // from class: com.sankuai.waimai.alita.core.jsexecutor.c.5
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    boolean z;
                    boolean z2;
                    boolean z3;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "969e3e1d098fb96a24f4bf330e837d6d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "969e3e1d098fb96a24f4bf330e837d6d");
                        return;
                    }
                    try {
                        com.sankuai.waimai.alita.core.utils.c.a("alita_js", str + " | RunnableRun | onNativeModuleResult: " + str3 + " | Thread: " + Thread.currentThread());
                        com.sankuai.waimai.alita.core.utils.e.a();
                        Value value = new Value(str3);
                        Value value2 = new Value(str2);
                        if (str3 != null) {
                            if (c.this.c != null) {
                                d dVar = c.this.c;
                                String str4 = str;
                                String str5 = str3;
                                Object[] objArr3 = {str4, str5};
                                ChangeQuickRedirect changeQuickRedirect3 = d.a;
                                if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "45b31cb8e56fa683b93dd8ac3a386a3d", RobustBitConfig.DEFAULT_VALUE)) {
                                    z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "45b31cb8e56fa683b93dd8ac3a386a3d")).booleanValue();
                                } else if (dVar.c != null) {
                                    b bVar = dVar.c;
                                    Object[] objArr4 = {str4, str5};
                                    ChangeQuickRedirect changeQuickRedirect4 = b.a;
                                    if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "5357bf2a9fa96827ecebe600ef2b663b", RobustBitConfig.DEFAULT_VALUE)) {
                                        z3 = ((Boolean) PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "5357bf2a9fa96827ecebe600ef2b663b")).booleanValue();
                                    } else {
                                        if (bVar.b.containsKey(str4)) {
                                            com.sankuai.waimai.alita.core.jsexecutor.task.a peek = bVar.b.get(str4).peek();
                                            if (peek != null) {
                                                Object[] objArr5 = {str5};
                                                ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.alita.core.jsexecutor.task.a.a;
                                                if (PatchProxy.isSupport(objArr5, peek, changeQuickRedirect5, false, "6e47175d88209cbae7c559faf11d63c8", RobustBitConfig.DEFAULT_VALUE)) {
                                                    z3 = ((Boolean) PatchProxy.accessDispatch(objArr5, peek, changeQuickRedirect5, false, "6e47175d88209cbae7c559faf11d63c8")).booleanValue();
                                                } else {
                                                    boolean z4 = peek.g != null && peek.g.size() > 0 && peek.g.contains(str5);
                                                    com.sankuai.waimai.alita.core.utils.c.e(peek.a() + " | isCallbackIDInWhiteList | callbackID: " + str5 + " | recordNO. " + peek.e + " | ret: " + z4 + " | Thread: " + Thread.currentThread());
                                                    z3 = z4;
                                                }
                                            } else {
                                                com.sankuai.waimai.alita.core.utils.c.e(str4 + "| AlitaExecutorTaskQueue | isCallBackIDInWhiteList | 没有找到Record callBackID : " + str5 + " | Thread: " + Thread.currentThread());
                                            }
                                        } else {
                                            com.sankuai.waimai.alita.core.utils.c.e(str4 + "| AlitaExecutorTaskQueue | isCallBackIDInWhiteList | 没有找到Queue callBackID : " + str5 + " | Thread: " + Thread.currentThread());
                                        }
                                        z3 = false;
                                    }
                                    z2 = z3;
                                } else {
                                    z2 = false;
                                }
                                if (z2) {
                                }
                            }
                            z = false;
                            if (c.this.b == null && z) {
                                c.this.b.invokeMethod(str, "nativeModuleCallback", new Value[]{value, value2});
                                return;
                            }
                        }
                        z = true;
                        if (c.this.b == null) {
                        }
                    } catch (Exception e) {
                        c.a(c.this, str, e, str2);
                    }
                }
            });
        }
    }

    @Override // com.sankuai.waimai.alita.core.jsexecutor.g
    public final synchronized void a(@NonNull final Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2857e375cdf9dbd8df164560286b4b71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2857e375cdf9dbd8df164560286b4b71");
        } else {
            b(new Runnable() { // from class: com.sankuai.waimai.alita.core.jsexecutor.c.6
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "44ec654c676279053cd80c905950112e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "44ec654c676279053cd80c905950112e");
                        return;
                    }
                    try {
                        runnable.run();
                    } catch (Throwable th) {
                        c cVar = c.this;
                        Object[] objArr3 = {th};
                        ChangeQuickRedirect changeQuickRedirect3 = c.a;
                        if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "989dd5e5c7cc4a3a0ee10d43ffb2676f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "989dd5e5c7cc4a3a0ee10d43ffb2676f");
                            return;
                        }
                        com.sankuai.waimai.alita.core.utils.e.a();
                        HashMap hashMap = new HashMap();
                        hashMap.put("errorMessage", th.getMessage());
                        com.sankuai.waimai.alita.core.utils.c.b("alita_js_executor", (String) null, "onUncaughtThrowable", (HashMap<String, Object>) hashMap);
                    }
                }
            });
        }
    }

    @Override // com.sankuai.waimai.alita.core.jsexecutor.g
    public final void a(@NonNull final Runnable runnable, long j) {
        Handler handler;
        Object[] objArr = {runnable, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a1953041f99e0904044ad98660d8124", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a1953041f99e0904044ad98660d8124");
            return;
        }
        d dVar = this.c;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "03c0778e163d111083a266c9f56f6e2d", RobustBitConfig.DEFAULT_VALUE)) {
            handler = (Handler) PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "03c0778e163d111083a266c9f56f6e2d");
        } else {
            com.sankuai.waimai.alita.core.utils.g.a(dVar.b);
            handler = dVar.b;
        }
        handler.postDelayed(new Runnable() { // from class: com.sankuai.waimai.alita.core.jsexecutor.c.7
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "372a246969e456faa74b2a1663d5ce11", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "372a246969e456faa74b2a1663d5ce11");
                } else {
                    c.this.a(runnable);
                }
            }
        }, j);
    }

    public final void finalize() throws Throwable {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18dde775a9948764c10c337af3f56d06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18dde775a9948764c10c337af3f56d06");
            return;
        }
        super.finalize();
        com.sankuai.waimai.alita.core.utils.c.a("AlitaJSExecutor | finalize");
    }

    @Override // com.sankuai.waimai.alita.core.jsexecutor.g
    public final synchronized void b(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51873c2fb5da8f1f2e676873d378fc8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51873c2fb5da8f1f2e676873d378fc8b");
            return;
        }
        com.sankuai.waimai.alita.core.utils.e.a();
        if (this.c != null) {
            d dVar = this.c;
            Object[] objArr2 = {str, str2, str3};
            ChangeQuickRedirect changeQuickRedirect2 = d.a;
            if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "a76bcc885db80f4058e329d57a1a7f58", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "a76bcc885db80f4058e329d57a1a7f58");
            } else {
                dVar.a("onJSResult");
                dVar.c.a(str, str2, str3);
            }
        }
    }

    @Override // com.sankuai.waimai.alita.core.jsexecutor.g
    public final synchronized Executor a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54653f4fe807e21401dee3ed67400fe9", RobustBitConfig.DEFAULT_VALUE)) {
            return (Executor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54653f4fe807e21401dee3ed67400fe9");
        }
        com.sankuai.waimai.alita.core.utils.e.a();
        if (this.c == null) {
            return null;
        }
        final d dVar = this.c;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "ab9c8eddaa2ede390dfe1650fe65a746", RobustBitConfig.DEFAULT_VALUE)) {
            return (Executor) PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "ab9c8eddaa2ede390dfe1650fe65a746");
        }
        return new Executor() { // from class: com.sankuai.waimai.alita.core.jsexecutor.d.1
            public static ChangeQuickRedirect a;

            @Override // java.util.concurrent.Executor
            public final void execute(@NonNull Runnable runnable) {
                Object[] objArr3 = {runnable};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "dafaf3d83b2c221dfd7c8d735826ad02", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "dafaf3d83b2c221dfd7c8d735826ad02");
                } else {
                    dVar.b.post(runnable);
                }
            }
        };
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a implements Encoding {
        public static ChangeQuickRedirect a;
        private com.sankuai.waimai.alita.core.engine.g b;
        private Handler c;

        public a(Handler handler, com.sankuai.waimai.alita.core.engine.g gVar) {
            Object[] objArr = {handler, gVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b17fe1ad5a00ee7c6c8c9cd977ffb00", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b17fe1ad5a00ee7c6c8c9cd977ffb00");
                return;
            }
            this.b = gVar;
            this.c = handler;
        }

        @Override // com.dianping.jscore.model.Encoding
        public final JSONObject encode() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5395b068e0673fa262483313aa1689b6", RobustBitConfig.DEFAULT_VALUE) ? (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5395b068e0673fa262483313aa1689b6") : new JSONObject();
        }

        @Override // com.dianping.jscore.model.Encoding
        public final String[] getFunctionNames() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc3a0f3ef039b5e139274ca8d65f7369", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc3a0f3ef039b5e139274ca8d65f7369") : new String[]{SnifferDBHelper.COLUMN_LOG};
        }

        @Override // com.dianping.jscore.model.Encoding
        public final JavaScriptInterface[] getFunctions() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95ad57604d475a6d2ac3e4d298476016", RobustBitConfig.DEFAULT_VALUE) ? (JavaScriptInterface[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95ad57604d475a6d2ac3e4d298476016") : new JavaScriptInterface[]{new C0706a(this.c, this.b)};
        }

        /* compiled from: ProGuard */
        /* renamed from: com.sankuai.waimai.alita.core.jsexecutor.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static class C0706a extends JavaScriptInterface {
            public static ChangeQuickRedirect a;
            private com.sankuai.waimai.alita.core.engine.g b;
            private Handler c;

            public C0706a(Handler handler, com.sankuai.waimai.alita.core.engine.g gVar) {
                Object[] objArr = {handler, gVar};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd5e857cd7d3d12b5434e764b505bcb7", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd5e857cd7d3d12b5434e764b505bcb7");
                    return;
                }
                this.c = handler;
                this.b = gVar;
            }

            @Override // com.dianping.jscore.JavaScriptInterface
            public final Value exec(Value[] valueArr) {
                final String str;
                Value value;
                Object[] objArr = {valueArr};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06062dfeb172711234e5bc99225fb64c", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Value) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06062dfeb172711234e5bc99225fb64c");
                }
                if (valueArr == null || valueArr.length == 0) {
                    return null;
                }
                try {
                    value = valueArr[0];
                } catch (ArchiveException e) {
                    e.printStackTrace();
                    str = null;
                }
                if (value.isNULL()) {
                    return null;
                }
                if (value.isString()) {
                    str = String.valueOf(value.string());
                } else if (value.isNumber()) {
                    str = String.valueOf(value.number());
                } else if (value.isBool()) {
                    str = String.valueOf(value.bool());
                } else {
                    str = String.valueOf(value);
                }
                if (str == null) {
                    return null;
                }
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "284c3302e29f7c89518681cd2be38499", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "284c3302e29f7c89518681cd2be38499");
                } else if (this.c != null && this.b != null) {
                    this.c.post(new Runnable() { // from class: com.sankuai.waimai.alita.core.jsexecutor.c.a.a.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "14b7a1d15035977afaee5dd1c864577d", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "14b7a1d15035977afaee5dd1c864577d");
                            } else {
                                C0706a.this.b.a(str);
                            }
                        }
                    });
                }
                return null;
            }
        }
    }
}
