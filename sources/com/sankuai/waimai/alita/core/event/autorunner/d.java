package com.sankuai.waimai.alita.core.event.autorunner;

import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.event.autorunner.e;
import com.sankuai.waimai.alita.core.event.facade.e;
import com.sankuai.waimai.alita.core.jsexecutor.AlitaJSValue;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d implements g, Observer {
    public static ChangeQuickRedirect a;
    String b;
    a c;
    g d;
    public boolean e;
    b f;
    private int g;
    private e h;
    private int i;
    private h j;
    private boolean k;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a();

        void a(@Nullable com.sankuai.waimai.alita.core.engine.h hVar);

        void a(com.sankuai.waimai.alita.core.event.a aVar, @Nullable Map<String, ?> map, @Nullable com.sankuai.waimai.alita.core.engine.h hVar);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface b {
        Map<String, ?> a(com.sankuai.waimai.alita.core.event.a aVar);

        void a();

        void a(@Nullable Exception exc);

        void a(@Nullable String str, @Nullable AlitaJSValue alitaJSValue);

        void b();

        void b(@Nullable Exception exc);

        void b(@Nullable String str, @Nullable AlitaJSValue alitaJSValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6e8a42df2d67def0569a94d47d5e1360", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6e8a42df2d67def0569a94d47d5e1360");
        }
        switch (i) {
            case 1:
                return "STATE_INIT";
            case 2:
                return "STATE_RUNNING";
            case 3:
                return "STATE_SLEEP";
            case 4:
                return "STATE_DEAD";
            default:
                return "INKNOWN";
        }
    }

    public static /* synthetic */ String b(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "18a846207ab0eec2bae66965828e1b6a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "18a846207ab0eec2bae66965828e1b6a");
        }
        if (aVar != null) {
            if (aVar instanceof com.sankuai.waimai.alita.core.event.autorunner.a) {
                com.sankuai.waimai.alita.core.event.autorunner.a aVar2 = (com.sankuai.waimai.alita.core.event.autorunner.a) aVar;
                return aVar2.c != null ? aVar2.c : "";
            }
            return "";
        }
        return StringUtil.NULL;
    }

    public static /* synthetic */ int d(d dVar) {
        int i = dVar.i + 1;
        dVar.i = i;
        return i;
    }

    public d(String str, e eVar) {
        Object[] objArr = {str, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5207d4d4177d8aabb3f366c50160208a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5207d4d4177d8aabb3f366c50160208a");
            return;
        }
        this.b = str;
        this.h = eVar;
        this.g = 1;
    }

    @Override // com.sankuai.waimai.alita.core.event.autorunner.g
    public final void a(com.sankuai.waimai.alita.core.event.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5f495cf6f8345262cb973a28f90809c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5f495cf6f8345262cb973a28f90809c");
        } else if (this.d != null) {
            this.d.a(aVar);
        } else {
            b(aVar);
        }
    }

    public final void b(final com.sankuai.waimai.alita.core.event.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc7edb06750ed9a2e64cbc7aa07068f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc7edb06750ed9a2e64cbc7aa07068f9");
        } else if (this.g == 4 || this.k) {
        } else {
            switch (this.g) {
                case 1:
                case 3:
                    if (this.h != null && a(aVar, this.h.b)) {
                        com.sankuai.waimai.alita.core.utils.c.a("AlitaAutoRunStateMachine.receiveRealTimeEvent(): 命中策略 : bundle = " + c(this.c) + ", eventType = " + g(aVar) + ", cid = " + h(aVar) + ", bid = " + i(aVar) + ", 状态 = " + b(this.g) + ", 操作 = start");
                        a(aVar, new com.sankuai.waimai.alita.core.engine.h() { // from class: com.sankuai.waimai.alita.core.event.autorunner.d.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.alita.core.engine.h
                            public final void a(@Nullable String str, @Nullable AlitaJSValue alitaJSValue) {
                                Object[] objArr2 = {str, alitaJSValue};
                                ChangeQuickRedirect changeQuickRedirect2 = a;
                                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c6eece69943ee9a0929dc3603941079c", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c6eece69943ee9a0929dc3603941079c");
                                } else if (!TextUtils.isEmpty(str)) {
                                    StringBuilder sb = new StringBuilder("AlitaAutoRunStateMachine.receiveRealTimeEvent(): start.onSuccess(): 命中策略 : bundle = ");
                                    sb.append(d.c(d.this.c));
                                    sb.append(", eventType = ");
                                    sb.append(d.g(aVar));
                                    sb.append(", cid = ");
                                    sb.append(d.h(aVar));
                                    sb.append(", bid = ");
                                    sb.append(d.i(aVar));
                                    sb.append(", 状态 = ");
                                    sb.append(d.b(d.this.g));
                                    sb.append(", 操作 = start.onSuccess(), taskKey = ");
                                    sb.append(str);
                                    sb.append(", result = ");
                                    sb.append(alitaJSValue != null ? alitaJSValue.stringValue() : StringUtil.NULL);
                                    com.sankuai.waimai.alita.core.utils.c.a(sb.toString());
                                    d.this.b(aVar);
                                } else {
                                    com.sankuai.waimai.alita.core.utils.c.a("AlitaAutoRunStateMachine.receiveRealTimeEvent(): start.onFailed(): 命中策略 : bundle = " + d.c(d.this.c) + ", eventType = " + d.g(aVar) + ", cid = " + d.h(aVar) + ", bid = " + d.i(aVar) + ", 状态 = " + d.b(d.this.g) + ", 操作 = start.onSuccess(), taskKey = null");
                                }
                            }

                            @Override // com.sankuai.waimai.alita.core.engine.h
                            public final void a(@Nullable Exception exc) {
                                Object[] objArr2 = {exc};
                                ChangeQuickRedirect changeQuickRedirect2 = a;
                                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "38dd11bf27125ad5ad4243ccb2ac9797", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "38dd11bf27125ad5ad4243ccb2ac9797");
                                    return;
                                }
                                StringBuilder sb = new StringBuilder("AlitaAutoRunStateMachine.receiveRealTimeEvent(): start.onFailed(): 命中策略 : bundle = ");
                                sb.append(d.c(d.this.c));
                                sb.append(", eventType = ");
                                sb.append(d.g(aVar));
                                sb.append(", cid = ");
                                sb.append(d.h(aVar));
                                sb.append(", bid = ");
                                sb.append(d.i(aVar));
                                sb.append(", 状态 = ");
                                sb.append(d.b(d.this.g));
                                sb.append(", 操作 = start.onFailed(), e = ");
                                sb.append(exc != null ? exc.toString() : StringUtil.NULL);
                                com.sankuai.waimai.alita.core.utils.c.a(sb.toString());
                            }
                        });
                        return;
                    } else if (this.h == null || !a(aVar, this.h.g)) {
                        return;
                    } else {
                        b(g(aVar));
                        return;
                    }
                case 2:
                    if (this.h != null && a(aVar, this.h.g)) {
                        b(g(aVar));
                        return;
                    } else if (this.h != null && a(aVar, this.h.e)) {
                        a(g(aVar));
                        return;
                    } else if (this.h == null || !a(aVar, this.h.c)) {
                        return;
                    } else {
                        c(aVar);
                        return;
                    }
                default:
                    return;
            }
        }
    }

    private void a(com.sankuai.waimai.alita.core.event.a aVar, @Nullable final com.sankuai.waimai.alita.core.engine.h hVar) {
        Object[] objArr = {aVar, hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bef233db7ead820968dbfa9b138a4aeb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bef233db7ead820968dbfa9b138a4aeb");
        } else if (this.g == 2 || this.g == 4) {
        } else {
            try {
                this.g = 2;
                if (this.c != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("bundle_id", c(this.c));
                    hashMap.put("event_type", g(aVar));
                    com.sankuai.waimai.alita.core.utils.c.a("alita_ar", (String) null, "start", (HashMap<String, Object>) hashMap);
                    this.c.a(new com.sankuai.waimai.alita.core.engine.h() { // from class: com.sankuai.waimai.alita.core.event.autorunner.d.2
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.alita.core.engine.h
                        public final void a(@Nullable String str, @Nullable AlitaJSValue alitaJSValue) {
                            Object[] objArr2 = {str, alitaJSValue};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6e7553aad739c9431be193690f8fe211", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6e7553aad739c9431be193690f8fe211");
                                return;
                            }
                            if (hVar != null) {
                                hVar.a(str, alitaJSValue);
                            }
                            if (d.this.f != null) {
                                d.this.f.a(str, alitaJSValue);
                            }
                        }

                        @Override // com.sankuai.waimai.alita.core.engine.h
                        public final void a(@Nullable Exception exc) {
                            Object[] objArr2 = {exc};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "38a2e18d2765ce14470daeb9a2a08f2a", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "38a2e18d2765ce14470daeb9a2a08f2a");
                                return;
                            }
                            if (hVar != null) {
                                hVar.a(exc);
                            }
                            if (d.this.f != null) {
                                d.this.f.a(exc);
                            }
                        }
                    });
                }
                c();
            } catch (Exception unused) {
            }
        }
    }

    public final void c(final com.sankuai.waimai.alita.core.event.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4eb478da86467d06b9e446c564d579a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4eb478da86467d06b9e446c564d579a7");
        } else if (this.k) {
        } else {
            try {
                if (this.c != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("bundle_id", c(this.c));
                    hashMap.put("event_type", g(aVar));
                    com.sankuai.waimai.alita.core.utils.c.a("alita_ar", (String) null, "run", (HashMap<String, Object>) hashMap);
                    this.c.a(aVar, this.f != null ? this.f.a(aVar) : null, new com.sankuai.waimai.alita.core.engine.h() { // from class: com.sankuai.waimai.alita.core.event.autorunner.d.3
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.alita.core.engine.h
                        public final void a(@Nullable String str, @Nullable AlitaJSValue alitaJSValue) {
                            Object[] objArr2 = {str, alitaJSValue};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "877d7ed77d62346a7ee1c47680bafd55", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "877d7ed77d62346a7ee1c47680bafd55");
                                return;
                            }
                            d.d(d.this);
                            if (d.this.f != null) {
                                d.this.f.b(str, alitaJSValue);
                            }
                            if (d.this.h == null || d.this.h.h == null || d.this.i < d.this.h.h.b) {
                                if (d.this.h != null && d.this.h.f != null && d.this.i >= d.this.h.f.b) {
                                    d.this.a(d.g(aVar));
                                    return;
                                }
                                StringBuilder sb = new StringBuilder("AlitaAutoRunStateMachine(): delegate.shouldRun.run.onSuccess(): 运行成功 无命中策略 : bundle = ");
                                sb.append(d.c(d.this.c));
                                sb.append(", eventType = ");
                                sb.append(d.g(aVar));
                                sb.append(", 状态 = ");
                                sb.append(d.b(d.this.g));
                                sb.append(", 操作 = 无， count = ");
                                sb.append(d.this.i);
                                sb.append(", taskKey =");
                                sb.append(d.b(d.this.c));
                                sb.append(", result = ");
                                sb.append(alitaJSValue != null ? alitaJSValue.stringValue() : null);
                                com.sankuai.waimai.alita.core.utils.c.a(sb.toString());
                                return;
                            }
                            d.this.b(d.g(aVar));
                        }

                        @Override // com.sankuai.waimai.alita.core.engine.h
                        public final void a(@Nullable Exception exc) {
                            Object[] objArr2 = {exc};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b18e7b7faec4594d20bc6537b68caab3", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b18e7b7faec4594d20bc6537b68caab3");
                                return;
                            }
                            d.d(d.this);
                            if (d.this.f != null) {
                                d.this.f.b(exc);
                            }
                            if (d.this.h == null || d.this.h.h == null || d.this.i < d.this.h.h.b) {
                                if (d.this.h != null && d.this.h.f != null && d.this.i >= d.this.h.f.b) {
                                    d.this.a(d.g(aVar));
                                    return;
                                }
                                StringBuilder sb = new StringBuilder("AlitaAutoRunStateMachine(): delegate.shouldRun.run.onFailed(): 运行失败 无命中策略: bundle = ");
                                sb.append(d.c(d.this.c));
                                sb.append(", eventType = ");
                                sb.append(d.g(aVar));
                                sb.append(", 状态 = ");
                                sb.append(d.b(d.this.g));
                                sb.append(", 操作 = 无， count = ");
                                sb.append(d.this.i);
                                sb.append(", taskKey =");
                                sb.append(d.b(d.this.c));
                                sb.append(", e = ");
                                sb.append(exc != null ? exc.toString() : null);
                                com.sankuai.waimai.alita.core.utils.c.a(sb.toString());
                                return;
                            }
                            d.this.b(d.g(aVar));
                        }
                    });
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "829c0b9f5ba3e96ae329d82f4fdccccb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "829c0b9f5ba3e96ae329d82f4fdccccb");
        } else if (this.g == 3 || this.g == 4) {
        } else {
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("bundle_id", c(this.c));
                hashMap.put("event_type", str);
                com.sankuai.waimai.alita.core.utils.c.a("alita_ar", (String) null, "sleep", (HashMap<String, Object>) hashMap);
                d();
                this.g = 3;
                this.i = 0;
                if (this.f != null) {
                    this.f.a();
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5cd9f6645cc6db960327fafdec2b4a8f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5cd9f6645cc6db960327fafdec2b4a8f");
            return;
        }
        try {
            d();
            this.g = 4;
            this.i = 0;
            if (this.c != null) {
                this.c.a();
            }
            if (this.f != null) {
                this.f.b();
            }
            this.c = null;
        } catch (Exception unused) {
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b561e66a3e20e8cd9823477221e19a46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b561e66a3e20e8cd9823477221e19a46");
            return;
        }
        this.k = true;
        this.i = 0;
        d();
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        Object[] objArr = {observable, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef925e25d6b48814c25c64cfb793b772", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef925e25d6b48814c25c64cfb793b772");
        } else if (obj instanceof com.sankuai.waimai.alita.core.event.a) {
            a((com.sankuai.waimai.alita.core.event.a) obj);
        }
    }

    public final boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73501376eddc32a66dc385d696ed98b1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73501376eddc32a66dc385d696ed98b1")).booleanValue();
        }
        if (obj instanceof d) {
            return TextUtils.equals(this.b, ((d) obj).b);
        }
        return super.equals(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4b81485d6de0ebf284565efdce96306", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4b81485d6de0ebf284565efdce96306");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("bundle_id", c(this.c));
        hashMap.put("event_type", str);
        com.sankuai.waimai.alita.core.utils.c.a("alita_ar", (String) null, "dead", (HashMap<String, Object>) hashMap);
        a();
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27b5cb777f0777a5dd73c6e45ea1c93f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27b5cb777f0777a5dd73c6e45ea1c93f");
            return;
        }
        e.C0702e c0702e = this.h != null ? this.h.d : null;
        if (c0702e == null || !c0702e.a()) {
            return;
        }
        this.j = new h(c0702e.b * 1000, new c(), new Runnable() { // from class: com.sankuai.waimai.alita.core.event.autorunner.d.4
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                com.sankuai.waimai.alita.core.event.a aVar;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9d8dbcc69e8aed46ae8e16576a2d42e1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9d8dbcc69e8aed46ae8e16576a2d42e1");
                } else if (d.this.e) {
                } else {
                    Object[] objArr3 = {null};
                    ChangeQuickRedirect changeQuickRedirect3 = e.a.a;
                    e.a aVar2 = PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "fb26ffc81b88b841f1e972c2fbdd3ced", RobustBitConfig.DEFAULT_VALUE) ? (e.a) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "fb26ffc81b88b841f1e972c2fbdd3ced") : new e.a(null);
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = e.a.a;
                    if (PatchProxy.isSupport(objArr4, aVar2, changeQuickRedirect4, false, "5a8b40eb4b51eb2eb0b492bff26b4c03", RobustBitConfig.DEFAULT_VALUE)) {
                        aVar = (com.sankuai.waimai.alita.core.event.a) PatchProxy.accessDispatch(objArr4, aVar2, changeQuickRedirect4, false, "5a8b40eb4b51eb2eb0b492bff26b4c03");
                    } else {
                        aVar = new com.sankuai.waimai.alita.core.event.a();
                        aVar.b = "loop_timer";
                        if (aVar2.b != null) {
                            aVar.c = aVar2.b;
                        }
                        if (aVar2.c != null) {
                            aVar.h = aVar2.c;
                        }
                        if (aVar2.d != 0) {
                            aVar.a(aVar2.d);
                        }
                    }
                    d.this.c(aVar);
                }
            }
        });
        this.j.a();
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7c88e3ef9da9671bb64ab4005d401b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7c88e3ef9da9671bb64ab4005d401b9");
        } else if (this.j != null) {
            this.j.cancel();
            this.j = null;
        }
    }

    private boolean a(com.sankuai.waimai.alita.core.event.a aVar, List<e.c> list) {
        Object[] objArr = {aVar, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48a32606e219b48b0cb60772cb7af634", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48a32606e219b48b0cb60772cb7af634")).booleanValue();
        }
        if (aVar == null || list == null) {
            return false;
        }
        for (e.c cVar : list) {
            if (cVar != null && cVar.a(aVar)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class c extends Handler {
        public c() {
            super(Looper.getMainLooper());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String c(@Nullable a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "51ad155f0b4e965e4d7b563134db45d7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "51ad155f0b4e965e4d7b563134db45d7");
        }
        if (aVar != null) {
            if (aVar instanceof com.sankuai.waimai.alita.core.event.autorunner.a) {
                com.sankuai.waimai.alita.core.event.autorunner.a aVar2 = (com.sankuai.waimai.alita.core.event.autorunner.a) aVar;
                return aVar2.b != null ? aVar2.b.c : "";
            }
            return "";
        }
        return StringUtil.NULL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String g(@Nullable com.sankuai.waimai.alita.core.event.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "42653f24bacf373a20f6e1de0d5fae50", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "42653f24bacf373a20f6e1de0d5fae50");
        }
        if (aVar != null) {
            String a2 = aVar.a();
            return a2 == null ? StringUtil.NULL : a2;
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String h(@Nullable com.sankuai.waimai.alita.core.event.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "37dcb0c64d3a7b9929401476fe7aa4f9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "37dcb0c64d3a7b9929401476fe7aa4f9");
        }
        if (aVar != null) {
            String c2 = aVar.c();
            return c2 == null ? StringUtil.NULL : c2;
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String i(@Nullable com.sankuai.waimai.alita.core.event.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d6d957a68c0356aa64dc38bdc7bd9d1c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d6d957a68c0356aa64dc38bdc7bd9d1c");
        }
        if (aVar != null) {
            String d = aVar.d();
            return d == null ? StringUtil.NULL : d;
        }
        return "";
    }
}
