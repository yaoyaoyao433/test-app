package com.meituan.msc.modules.engine;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import com.meituan.msc.common.utils.am;
import com.meituan.msc.common.utils.aw;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.msc.modules.devtools.DebugHelper;
import com.meituan.msc.modules.manager.ModuleName;
import com.meituan.msc.modules.preload.MSCHornPreloadConfig;
import com.meituan.msc.modules.update.bean.PackageInfoWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
@ModuleName(name = "RendererManager")
/* loaded from: classes3.dex */
public final class m extends com.meituan.msc.modules.manager.k implements c {
    public static ChangeQuickRedirect a;
    public volatile boolean b;
    com.meituan.msc.modules.page.render.webview.g c;
    private boolean d;
    private volatile boolean e;
    private final List<com.meituan.msc.modules.page.render.j> f;
    private final List<com.meituan.msc.modules.page.render.rn.g> g;
    private final List<com.meituan.msc.modules.page.render.rn.g> h;

    public m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc905264a5493adf8954b8579474ef7a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc905264a5493adf8954b8579474ef7a");
            return;
        }
        this.f = new CopyOnWriteArrayList();
        this.g = new CopyOnWriteArrayList();
        this.h = new CopyOnWriteArrayList();
    }

    @Override // com.meituan.msc.modules.engine.c
    public final void a(boolean z) {
        this.b = z;
    }

    @Override // com.meituan.msc.modules.engine.c
    public final int a(com.meituan.msc.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49770ae152edfe4d7f7b0ecbebd89153", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49770ae152edfe4d7f7b0ecbebd89153")).intValue();
        }
        List<com.meituan.msc.modules.page.render.rn.g> list = bVar == com.meituan.msc.b.RN ? this.h : this.g;
        int size = list.size();
        com.meituan.msc.b bVar2 = com.meituan.msc.b.RN;
        if (size <= 0) {
            com.meituan.msc.modules.reporter.g.a("cache one rn renderer");
            com.meituan.msc.modules.page.render.rn.g gVar = (com.meituan.msc.modules.page.render.rn.g) com.meituan.msc.modules.page.render.i.a(bVar, MSCEnvHelper.getContext(), U_());
            list.add(gVar);
            return gVar.j();
        }
        com.meituan.msc.modules.page.render.rn.g gVar2 = list.get(0);
        if (gVar2 != null) {
            return gVar2.j();
        }
        return -1;
    }

    @Override // com.meituan.msc.modules.engine.c
    public final com.meituan.msc.modules.page.render.d a(String str) {
        com.meituan.msc.modules.page.render.d dVar;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "778fe1ab04c8c86ae8df203f4f853a2a", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.modules.page.render.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "778fe1ab04c8c86ae8df203f4f853a2a");
        }
        this.d = true;
        com.meituan.msc.b o = s().c.r.o(str);
        com.meituan.msc.modules.page.render.d dVar2 = null;
        if (o == com.meituan.msc.b.RN || o == com.meituan.msc.b.NATIVE) {
            Object[] objArr2 = {o};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3b201ec645ba1ff0ff0fda02e1c51781", RobustBitConfig.DEFAULT_VALUE)) {
                dVar = (com.meituan.msc.modules.page.render.rn.g) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3b201ec645ba1ff0ff0fda02e1c51781");
            } else {
                List<com.meituan.msc.modules.page.render.rn.g> list = o == com.meituan.msc.b.RN ? this.h : this.g;
                if (!list.isEmpty()) {
                    com.meituan.msc.modules.reporter.g.a("consume one rn renderer");
                    dVar2 = (com.meituan.msc.modules.page.render.rn.g) list.remove(0);
                    if (dVar2 != null) {
                        dVar2.l = n.PRE_CREATE;
                    }
                }
                dVar = dVar2;
            }
        } else {
            Object[] objArr3 = {str};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "21d67cf0246729af50e1fbfb5b5cfdb0", RobustBitConfig.DEFAULT_VALUE)) {
                dVar = (com.meituan.msc.modules.page.render.j) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "21d67cf0246729af50e1fbfb5b5cfdb0");
            } else {
                com.meituan.msc.modules.page.render.j b = b(am.b(str));
                if (b != null) {
                    this.f.remove(b);
                    aw.b("从复用池取出Renderer，path: " + b.k.a + ", 资源：" + com.meituan.msc.common.utils.f.a(b.u()) + ", 剩余" + this.f.size(), new Object[0]);
                    e();
                    boolean z = b instanceof com.meituan.msc.modules.page.render.webview.e;
                    dVar = b;
                    if (z) {
                        boolean z2 = ((com.meituan.msc.modules.page.render.webview.e) b).A;
                        dVar = b;
                        if (z2) {
                            aw.b("复用池中的Renderer已经发生RenderProcessGone，无法复用", new Object[0]);
                            dVar = dVar2;
                        }
                    }
                } else {
                    aw.b("复用池中未找到合适的Renderer，新建", new Object[0]);
                    dVar = b;
                }
            }
        }
        if (dVar != null) {
            if (o == dVar.n()) {
                com.meituan.msc.modules.reporter.g.d("RendererManager", "reuse render", str, dVar);
                if (dVar instanceof com.meituan.msc.modules.page.render.webview.e) {
                    ((com.meituan.msc.modules.page.render.webview.e) dVar).C();
                }
                return dVar;
            }
            com.meituan.msc.modules.reporter.g.d("RendererManager", "get renderer from pool but type ", dVar.n(), " not matching target type ", o, ", destroy: ", str);
            dVar.k();
        }
        com.meituan.msc.modules.page.render.d dVar3 = (com.meituan.msc.modules.page.render.d) com.meituan.msc.modules.page.render.i.a(o, MSCEnvHelper.getContext(), U_());
        if (dVar3 instanceof com.meituan.msc.modules.page.render.webview.e) {
            ((com.meituan.msc.modules.page.render.webview.e) dVar3).C();
        }
        com.meituan.msc.modules.reporter.g.d("RendererManager", "retainRenderer", str, dVar3);
        return dVar3;
    }

    private com.meituan.msc.modules.page.render.j b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "762657daba101ab9ea23f8b66a716b42", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.modules.page.render.j) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "762657daba101ab9ea23f8b66a716b42");
        }
        com.meituan.msc.modules.page.render.j a2 = a(str, true, false, false);
        if (a2 == null) {
            com.meituan.msc.modules.page.render.j a3 = a(str, false, true, false);
            if (a3 == null) {
                com.meituan.msc.modules.page.render.j a4 = a(str, false, false, true);
                if (a4 == null) {
                    com.meituan.msc.modules.page.render.j d = d();
                    if (d != null) {
                        d.l = n.PRELOAD_BASE;
                    }
                    return d;
                }
                com.meituan.msc.modules.reporter.g.d("RendererManager", "find Renderer that loaded resource: ", str);
                a4.l = n.PRELOAD_BUSINESS;
                return a4;
            }
            com.meituan.msc.modules.reporter.g.d("RendererManager", "find Renderer that loaded page matched: ", str);
            a3.l = n.PRELOAD_PAGE;
            return a3;
        }
        com.meituan.msc.modules.reporter.g.d("RendererManager", "find Renderer that current page matched: ", str);
        a2.l = n.PRELOAD_PAGE;
        return a2;
    }

    private boolean a(com.meituan.msc.modules.page.render.j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82c9dceaf5c4ba7064673c981eccf1b7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82c9dceaf5c4ba7064673c981eccf1b7")).booleanValue();
        }
        if (jVar instanceof com.meituan.msc.modules.page.render.webview.e) {
            PackageInfoWrapper packageInfoWrapper = U_().r.i;
            for (PackageInfoWrapper packageInfoWrapper2 : ((com.meituan.msc.modules.page.render.webview.e) jVar).E) {
                if (packageInfoWrapper2 != null && TextUtils.equals(packageInfoWrapper.getDDResourceName(), packageInfoWrapper2.getDDResourceName()) && !TextUtils.equals(packageInfoWrapper.getMd5(), packageInfoWrapper2.getMd5())) {
                    com.meituan.msc.modules.reporter.g.b("RendererManager", "verifyLoadedPackage, loaded package does not match current version, destroy renderer");
                    b((com.meituan.msc.modules.page.render.d) jVar);
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    private com.meituan.msc.modules.page.render.j a(@NonNull String str, boolean z, boolean z2, boolean z3) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe03b959756204e2b3883c957b3612fd", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.msc.modules.page.render.j) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe03b959756204e2b3883c957b3612fd") : a(str, z, z2, z3, false);
    }

    private com.meituan.msc.modules.page.render.j d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9ae8fe1bef20735a0af43384c5ac919", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.msc.modules.page.render.j) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9ae8fe1bef20735a0af43384c5ac919") : a(null, false, false, false, true);
    }

    private com.meituan.msc.modules.page.render.j a(@Nullable String str, boolean z, boolean z2, boolean z3, boolean z4) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0), Byte.valueOf(z4 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7287968bc1b2430e8cdddc33b38ffd7", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.modules.page.render.j) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7287968bc1b2430e8cdddc33b38ffd7");
        }
        List<com.meituan.msc.modules.page.render.j> a2 = a(true, str, z, z2, z3, z4);
        if (a2.isEmpty()) {
            return null;
        }
        return a2.get(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00e9  */
    @android.support.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.List<com.meituan.msc.modules.page.render.j> a(boolean r20, @android.support.annotation.Nullable java.lang.String r21, boolean r22, boolean r23, boolean r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.modules.engine.m.a(boolean, java.lang.String, boolean, boolean, boolean, boolean):java.util.List");
    }

    private boolean b(@NonNull com.meituan.msc.modules.page.render.j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66e9adc3a4ed07900b975b31a8cfe29f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66e9adc3a4ed07900b975b31a8cfe29f")).booleanValue() : jVar.u().size() < com.meituan.msc.common.config.b.l();
    }

    private com.meituan.msc.modules.page.render.j b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e37ee6721cb4e0e462843602117e1b4d", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.modules.page.render.j) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e37ee6721cb4e0e462843602117e1b4d");
        }
        com.meituan.msc.modules.page.render.j jVar = (com.meituan.msc.modules.page.render.j) com.meituan.msc.modules.page.render.i.a(com.meituan.msc.b.WEBVIEW, context, U_());
        if (!this.d) {
            jVar.a(this.c);
        }
        c(jVar);
        return jVar;
    }

    @Override // com.meituan.msc.modules.engine.c
    public final boolean b(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd900aa02ff8d31099e7308ac46cfb27", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd900aa02ff8d31099e7308ac46cfb27")).booleanValue();
        }
        com.meituan.msc.modules.page.render.j b = b(str);
        com.meituan.msc.modules.reporter.g.b("RendererManager", "preload App Page in ContainerController OnCreate");
        if (b == null) {
            b(context).c(str);
            return true;
        } else if (b.s()) {
            return false;
        } else {
            b.c(str);
            return true;
        }
    }

    @Override // com.meituan.msc.modules.engine.c
    public final void a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98241be82c4bf035841ed17a1607a746", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98241be82c4bf035841ed17a1607a746");
        } else if (this.e) {
        } else {
            com.meituan.msc.modules.reporter.g.b("RendererManager", "cacheRendererForNextPage, curr: ", str);
            a(context, c(str), (o) null);
        }
    }

    @Override // com.meituan.msc.modules.engine.c
    public final void a(Context context, o oVar) {
        Object[] objArr = {context, oVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b57429cb58811d8f84cb7143b26e4db5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b57429cb58811d8f84cb7143b26e4db5");
            return;
        }
        com.meituan.msc.modules.reporter.g.b("RendererManager", "preloadDefaultResources");
        a(context, c("/"), oVar);
    }

    private void a(Context context, @Nullable List<String> list, final o oVar) {
        Object[] objArr = {context, list, oVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48656506509193aa920ba28b87875d6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48656506509193aa920ba28b87875d6e");
            return;
        }
        com.meituan.msc.modules.reporter.g.b("RendererManager", "preloadResources: ", com.meituan.msc.common.utils.f.a((Collection) list));
        if (this.e) {
            return;
        }
        if (!MSCHornPreloadConfig.d().f()) {
            com.meituan.msc.modules.reporter.g.b("RendererManager", "page resource preload disabled by config");
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            arrayList.addAll(list);
        }
        HashMap hashMap = new HashMap();
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            List<com.meituan.msc.modules.page.render.j> a2 = a(false, it.next(), true, true, true, false);
            if (!a2.isEmpty()) {
                it.remove();
                for (com.meituan.msc.modules.page.render.j jVar : a2) {
                    Integer num = (Integer) hashMap.get(jVar);
                    hashMap.put(jVar, Integer.valueOf(num == null ? 1 : num.intValue() + 1));
                }
            }
        }
        if (arrayList.isEmpty()) {
            String str = com.meituan.msc.common.utils.f.a((List) list) ? "resource not requested, no need to preload resource" : "Renderer in pool have all requested resources, no need to preload resource";
            com.meituan.msc.modules.reporter.g.d("RendererManager", str);
            if (oVar != null) {
                oVar.onReceiveValue(str);
            }
        } else {
            com.meituan.msc.modules.reporter.g.b("RendererManager", "need preload resource: ", com.meituan.msc.common.utils.f.a((Collection) arrayList));
            final com.meituan.msc.modules.page.render.j jVar2 = null;
            int i = 0;
            for (Map.Entry entry : hashMap.entrySet()) {
                com.meituan.msc.modules.page.render.j jVar3 = (com.meituan.msc.modules.page.render.j) entry.getKey();
                if (!jVar3.s() && b(jVar3) && ((Integer) entry.getValue()).intValue() > i) {
                    i = ((Integer) entry.getValue()).intValue();
                    jVar2 = jVar3;
                }
            }
            if (jVar2 == null) {
                jVar2 = d();
            }
            if (jVar2 == null) {
                jVar2 = b(context);
            } else {
                this.f.remove(jVar2);
                this.f.add(jVar2);
                com.meituan.msc.modules.reporter.g.b("RendererManager", "preload resource to Renderer that have: ", com.meituan.msc.common.utils.f.a(jVar2.u()));
            }
            if (!this.b) {
                return;
            }
            if (!arrayList.isEmpty()) {
                com.meituan.msc.modules.reporter.g.b("RendererManager", "preload resource to Renderer: ", com.meituan.msc.common.utils.f.a((Collection) arrayList));
                jVar2.a(arrayList);
                e();
            }
            jVar2.a(new o() { // from class: com.meituan.msc.modules.engine.m.1
                public static ChangeQuickRedirect a;

                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(String str2) {
                    String str3 = str2;
                    Object[] objArr2 = {str3};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5d3e27b8826a34ae88f08fc007267e0e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5d3e27b8826a34ae88f08fc007267e0e");
                    } else if (oVar != null) {
                        oVar.onReceiveValue(str3);
                    }
                }

                @Override // com.meituan.msc.modules.engine.o
                public final void a(Exception exc) {
                    Object[] objArr2 = {exc};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "95caa01cb4a9ec4eac62578bae5a9aee", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "95caa01cb4a9ec4eac62578bae5a9aee");
                        return;
                    }
                    if (oVar != null) {
                        oVar.a(exc);
                    }
                    m.this.b((com.meituan.msc.modules.page.render.d) jVar2);
                }
            });
        }
        if (d() == null) {
            com.meituan.msc.modules.reporter.g.b("RendererManager", "no Renderer in pool have resource space, create one");
            b(context).a((o) null);
        }
    }

    @Override // com.meituan.msc.modules.engine.c
    public final void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e408eae7c31c738a1d7f4b0ada28e029", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e408eae7c31c738a1d7f4b0ada28e029");
        } else if (this.e) {
        } else {
            String f = U_().r.f();
            com.meituan.msc.modules.page.render.j b = b(f);
            if (b == null) {
                b = b(context);
            }
            if (this.b && !b.s()) {
                b.c(f);
            }
        }
    }

    private void c(com.meituan.msc.modules.page.render.j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9720323f59e6c9c5c55cd5c2b906c14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9720323f59e6c9c5c55cd5c2b906c14");
            return;
        }
        com.meituan.msc.modules.reporter.g.d("RendererManager", "addRendererToPool", jVar);
        this.f.add(jVar);
        e();
        if (this.f.size() > com.meituan.msc.common.config.b.k()) {
            aw.b("复用池满，" + this.f.size() + "个，销毁最老的Renderer", new Object[0]);
            this.f.remove(0).k();
        }
    }

    @Override // com.meituan.msc.modules.engine.c
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5029d9561121bc5e7d5f4538b13f9ee2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5029d9561121bc5e7d5f4538b13f9ee2");
            return;
        }
        for (com.meituan.msc.modules.page.render.j jVar : this.f) {
            jVar.k();
        }
        this.f.clear();
    }

    @Override // com.meituan.msc.modules.engine.c
    public final void b(com.meituan.msc.modules.page.render.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "540e391a6dfbd09f065dc6bd3d401126", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "540e391a6dfbd09f065dc6bd3d401126");
            return;
        }
        this.f.remove(dVar);
        dVar.k();
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73adccf8f3985cd6c8de2c793825c66f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73adccf8f3985cd6c8de2c793825c66f");
        } else if (DebugHelper.a()) {
            String str = "pool: \n";
            if (this.f.isEmpty()) {
                str = "pool: \nempty";
            } else {
                for (com.meituan.msc.modules.page.render.j jVar : this.f) {
                    if (jVar.k.a != null) {
                        str = str + "current: " + jVar.k.a + ", ";
                    }
                    str = ((str + jVar.u().size() + " resources, ") + com.meituan.msc.common.utils.f.a(jVar.u())) + "\n";
                }
            }
            com.meituan.msc.modules.reporter.g.a("RendererManager", str);
        }
    }

    @Override // com.meituan.msc.modules.engine.c
    @SuppressLint({"Iterator"})
    public final void a(View view) {
        boolean z;
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd978c03b864c4b1948917aa60ab2913", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd978c03b864c4b1948917aa60ab2913");
            return;
        }
        for (com.meituan.msc.modules.page.render.j jVar : this.f) {
            Object[] objArr2 = {jVar, view};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f4c9c0acd3ac3e98af2025093fbc2d9a", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f4c9c0acd3ac3e98af2025093fbc2d9a")).booleanValue();
            } else if ((jVar instanceof com.meituan.msc.modules.page.render.webview.e) && com.meituan.msc.modules.page.render.webview.o.a(((com.meituan.msc.modules.page.render.webview.e) jVar).B(), view)) {
                jVar.k();
                com.meituan.msc.modules.reporter.g.b((String) null, "releaseRendererIfWebViewCrashed renderer:", jVar, ", view: ", view);
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f.remove(jVar);
            }
        }
    }

    @Nullable
    private List<String> c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "592748e3acf101ff82d7a30a7755bb0b", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "592748e3acf101ff82d7a30a7755bb0b");
        }
        List<String> p = U_().r.p(str);
        if (p == null) {
            return null;
        }
        Iterator<String> it = p.iterator();
        while (it.hasNext()) {
            if (!com.meituan.msc.common.utils.n.a(U_(), it.next())) {
                it.remove();
            }
        }
        return p;
    }

    @Override // com.meituan.msc.modules.manager.k
    public final void L_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f86429176e72dcb82e03246a97c0f4c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f86429176e72dcb82e03246a97c0f4c8");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "76b46ae42aa04189a753c8a559412142", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "76b46ae42aa04189a753c8a559412142");
            return;
        }
        this.e = true;
        b();
    }

    @Override // com.meituan.msc.modules.engine.c
    public final void a(com.meituan.msc.modules.page.render.d dVar) {
        boolean z;
        boolean z2 = true;
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a5caf4f82bf1d1ffdc5a60410dfd15e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a5caf4f82bf1d1ffdc5a60410dfd15e");
            return;
        }
        String b = am.b(dVar.k.a);
        Object[] objArr2 = {dVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3c3720c9e0c0171b27dbfb4272dd3442", RobustBitConfig.DEFAULT_VALUE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3c3720c9e0c0171b27dbfb4272dd3442")).booleanValue();
        } else {
            if (dVar instanceof com.meituan.msc.modules.page.render.j) {
                com.meituan.msc.modules.page.render.j jVar = (com.meituan.msc.modules.page.render.j) dVar;
                if (this.e) {
                    com.meituan.msc.modules.reporter.g.b("RendererManager", "app released, destroy webView");
                } else {
                    com.meituan.msc.modules.update.f fVar = U_().r;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = com.meituan.msc.modules.update.f.a;
                    if (PatchProxy.isSupport(objArr3, fVar, changeQuickRedirect3, false, "83ef0b3a513cd1987b39120e2a190428", RobustBitConfig.DEFAULT_VALUE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr3, fVar, changeQuickRedirect3, false, "83ef0b3a513cd1987b39120e2a190428")).booleanValue();
                    } else {
                        com.meituan.msc.modules.update.a aVar = fVar.U_().s;
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = com.meituan.msc.modules.update.a.a;
                        if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "62b57cfea3949c5ad344a5d1781d94d6", RobustBitConfig.DEFAULT_VALUE)) {
                            z = ((Boolean) PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "62b57cfea3949c5ad344a5d1781d94d6")).booleanValue();
                        } else {
                            z = com.meituan.msc.common.config.b.m() && aVar.b != null && aVar.b.optBoolean("enableWebViewRecycle", true);
                        }
                    }
                    if (!z) {
                        com.meituan.msc.modules.reporter.g.b("RendererManager", "webView recycle not enabled");
                    } else if ((jVar instanceof com.meituan.msc.modules.page.render.webview.e) && ((com.meituan.msc.modules.page.render.webview.e) jVar).A) {
                        com.meituan.msc.modules.reporter.g.b("RendererManager", "webView render process gone, should destroy");
                    }
                }
            }
            z2 = false;
        }
        if (z2 && ((com.meituan.msc.modules.page.render.j) dVar).w()) {
            dVar.a((com.meituan.msc.modules.container.p) null);
            c((com.meituan.msc.modules.page.render.webview.e) dVar);
            aw.b("Renderer进入复用池：" + this.f.size() + "个, " + b, new Object[0]);
            e();
            return;
        }
        aw.b("Renderer无法复用，销毁：" + b, new Object[0]);
        dVar.k();
    }
}
