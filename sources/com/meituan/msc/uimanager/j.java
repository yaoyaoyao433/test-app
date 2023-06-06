package com.meituan.msc.uimanager;

import android.os.Looper;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import com.meituan.android.msc.csslib.CSSParserNative;
import com.meituan.android.recce.props.gens.FlexDirection;
import com.meituan.android.recce.props.gens.NumberOfLines;
import com.meituan.msc.devsupport.perf.RenderPerf;
import com.meituan.msc.jse.bridge.MSCReadableMap;
import com.meituan.msc.jse.bridge.ReactApplicationContext;
import com.meituan.msc.jse.bridge.ReadableArray;
import com.meituan.msc.jse.bridge.ReadableMap;
import com.meituan.msc.mmpviews.msiviews.MSIViewManager;
import com.meituan.msc.mmpviews.text.MPTextShadowNode;
import com.meituan.msc.util.perf.PerfTrace;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class j extends UIImplementation {
    public static ChangeQuickRedirect a;
    public static final AtomicLong b = new AtomicLong();
    private List<p> w;
    private final String x;
    private Runnable y;

    public boolean c() {
        return true;
    }

    public void d() {
    }

    public static /* synthetic */ void a(j jVar, int i, List list) {
        aa c;
        Object[] objArr = {Integer.valueOf(i), list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, jVar, changeQuickRedirect, false, "0c95c876994d371d0158f9a8cda1a93b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, jVar, changeQuickRedirect, false, "0c95c876994d371d0158f9a8cda1a93b");
            return;
        }
        com.meituan.msc.systrace.a.a(0L, "UIImplementation.updateViewHierarchyWithPatches");
        try {
            HashMap hashMap = new HashMap();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                p pVar = (p) it.next();
                aa c2 = jVar.k.c(pVar.a);
                if (c2 != null && (c = jVar.k.c(c2.q())) != null) {
                    List list2 = (List) hashMap.get(c);
                    if (list2 == null) {
                        list2 = new ArrayList();
                        hashMap.put(c, list2);
                    }
                    list2.add(pVar);
                }
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                jVar.a(i, (aa) entry.getKey(), (List) entry.getValue());
            }
        } finally {
            com.meituan.msc.systrace.a.a(0L);
        }
    }

    public j(ReactApplicationContext reactApplicationContext, av avVar, ag agVar, UIViewOperationQueue uIViewOperationQueue, com.meituan.msc.uimanager.events.b bVar) {
        super(reactApplicationContext, avVar, agVar, uIViewOperationQueue, bVar);
        Object[] objArr = {reactApplicationContext, avVar, agVar, uIViewOperationQueue, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6164319a255bcf91dda7a30176b17832", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6164319a255bcf91dda7a30176b17832");
            return;
        }
        this.w = new ArrayList();
        this.x = "MPUIImplementation@" + Integer.toHexString(hashCode());
        this.y = new Runnable() { // from class: com.meituan.msc.uimanager.j.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9fadc7c5491448382c30cfff03ddf07c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9fadc7c5491448382c30cfff03ddf07c");
                    return;
                }
                ArrayList arrayList = new ArrayList();
                synchronized (j.this.w) {
                    if (j.this.w.size() == 0) {
                        return;
                    }
                    arrayList.addAll(j.this.w);
                    j.this.w.clear();
                    UIImplementation.g--;
                    j.this.j.getRuntimeDelegate().getRenderPerf().a(UIImplementation.g, 0L);
                    j.a(j.this, UIImplementation.g, arrayList);
                    j.this.n.a();
                    j.this.m.a(UIImplementation.g, 0L, j.this.q);
                    j.this.j.runOnNativeModulesQueueThreadDelay(this, 500L);
                    j.this.j.getRuntimeDelegate().getRenderPerf().a(UIImplementation.g);
                }
            }
        };
    }

    private String q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64e19be1e83d1f139e276e65aa3ad429", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64e19be1e83d1f139e276e65aa3ad429") : this.j.getRuntimeDelegate().getCssParserKey();
    }

    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67809ece4c5a2f717bba902318742953", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67809ece4c5a2f717bba902318742953") : this.j.getRuntimeDelegate().getCssFileContent();
    }

    @Override // com.meituan.msc.uimanager.UIImplementation
    public final void a(int i) {
        long j;
        JSONObject jSONObject;
        int i2 = 1;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "360b9cbe389d0051611e6094cbffc546", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "360b9cbe389d0051611e6094cbffc546");
            return;
        }
        long j2 = 0;
        com.meituan.msc.systrace.a.a(0L, "UIImplementation.updateViewHierarchy");
        RenderPerf renderPerf = this.j.getRuntimeDelegate().getRenderPerf();
        int i3 = 0;
        while (i3 < this.k.a()) {
            try {
                aa c = this.k.c(this.k.e(i3));
                if (c.L() != null && c.M() != null) {
                    com.meituan.msc.systrace.b.a(j2, "UIImplementation.notifyOnBeforeLayoutRecursive");
                    int d = d(c);
                    Object[] objArr2 = new Object[i2];
                    objArr2[0] = c;
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    try {
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "31965817deaa5e1b53bdb99ed0545caa", RobustBitConfig.DEFAULT_VALUE)) {
                            jSONObject = (JSONObject) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "31965817deaa5e1b53bdb99ed0545caa");
                        } else {
                            jSONObject = new JSONObject();
                            if (this.j != null && this.j.getRuntimeDelegate() != null && !this.j.getRuntimeDelegate().isProdEnv()) {
                                a(c, jSONObject);
                            }
                        }
                        if (r()) {
                            b(i, c, d, jSONObject);
                        } else {
                            a(i, c, d, jSONObject);
                        }
                        d();
                        renderPerf.a("notifyBeforeLayout", i);
                        b(c);
                        j = 0;
                        try {
                            com.meituan.msc.systrace.a.a(0L);
                            renderPerf.b("notifyBeforeLayout", i);
                            renderPerf.a("layout", i);
                            a("layout", i, jSONObject);
                            long currentTimeMillis = System.currentTimeMillis();
                            c(c);
                            com.meituan.msc.modules.reporter.g.d(this.x, "[calculateRootLayout] ", "cost: ", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                            renderPerf.b("layout", i);
                            b("layout", i, jSONObject);
                            renderPerf.a("updateLayoutProperties", i);
                            a("update_layout_properties", i, jSONObject);
                            try {
                                a(c, 0.0f, 0.0f);
                                com.meituan.msc.systrace.a.a(0L);
                                b("update_layout_properties", i, jSONObject);
                                renderPerf.b("updateLayoutProperties", i);
                                if (this.r != null) {
                                    this.m.a(c, this.r);
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            com.meituan.msc.systrace.a.a(j);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        j = 0;
                    }
                }
                i3++;
                i2 = 1;
                j2 = 0;
            } catch (Throwable th3) {
                th = th3;
                j = j2;
            }
        }
        com.meituan.msc.systrace.a.a(j2);
    }

    @Override // com.meituan.msc.uimanager.UIImplementation
    public final void a(int i, ReadableArray readableArray) {
        Object[] objArr = {Integer.valueOf(i), readableArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f790518a6c3e830c4995d2dc4306b402", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f790518a6c3e830c4995d2dc4306b402");
        } else if (this.t) {
            synchronized (this.h) {
                aa c = this.k.c(i);
                if (c == null) {
                    com.meituan.msc.modules.reporter.g.b(this.x, null, "[setChildren] cssNodeToManage with tag: ", Integer.valueOf(i), " is null");
                    return;
                }
                if (readableArray.size() > 0 && c.m() > 0) {
                    com.meituan.msc.modules.reporter.g.b(this.x, null, "[setChildren] origin child count > 0:", Integer.valueOf(i), readableArray, Integer.valueOf(c.m()));
                }
                for (int i2 = 0; i2 < readableArray.size(); i2++) {
                    aa c2 = this.k.c(readableArray.getInt(i2));
                    if (c2 == null) {
                        String str = this.x;
                        com.meituan.msc.modules.reporter.g.b(str, null, "[setChildren] Trying to add unknown view tag: ", Integer.valueOf(readableArray.getInt(i2)), ",cssNodeToManage: " + i, "parent:", i(i));
                        this.j.getUIManagerModule().a(this);
                        this.j.getRuntimeDelegate().printPendingTasks();
                        throw new g("Trying to add unknown view tag");
                    }
                    c.a(c2, i2);
                }
                this.n.a(c, readableArray, false);
            }
        }
    }

    @Override // com.meituan.msc.uimanager.UIImplementation
    public final void a(int i, @Nullable ReadableArray readableArray, @Nullable ReadableArray readableArray2, @Nullable ReadableArray readableArray3, @Nullable ReadableArray readableArray4, @Nullable ReadableArray readableArray5) {
        Object[] objArr = {Integer.valueOf(i), readableArray, readableArray2, readableArray3, readableArray4, readableArray5};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d6eee5eda79265b8ddd6d2763d488d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d6eee5eda79265b8ddd6d2763d488d1");
            return;
        }
        try {
            b(i, readableArray, readableArray2, readableArray3, readableArray4, readableArray5);
        } catch (g e) {
            if (e.getMessage() != null && e.getMessage().contains("Trying to add unknown view tag")) {
                com.meituan.msc.modules.reporter.g.b(this.x, e, "[manageChildren]", c(i, readableArray, readableArray2, readableArray3, readableArray4, readableArray5));
                this.j.getUIManagerModule().a(this);
                this.j.getRuntimeDelegate().printPendingTasks();
                g gVar = new g("Trying to add unknown view tag");
                gVar.setStackTrace(e.getStackTrace());
                throw gVar;
            }
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            com.meituan.msc.modules.reporter.g.b(this.x, e2, "[manageChildren]", c(i, readableArray, readableArray2, readableArray3, readableArray4, readableArray5));
            this.j.getUIManagerModule().a(this);
            this.j.getRuntimeDelegate().printPendingTasks();
            IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("IndexOutOfBoundsException");
            indexOutOfBoundsException.setStackTrace(e2.getStackTrace());
            throw indexOutOfBoundsException;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009c, code lost:
        if (r35 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a2, code lost:
        if (r7 != r35.size()) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ac, code lost:
        throw new com.meituan.msc.uimanager.g("Size of addChildTags != size of addAtIndices!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b(int r31, @android.support.annotation.Nullable com.meituan.msc.jse.bridge.ReadableArray r32, @android.support.annotation.Nullable com.meituan.msc.jse.bridge.ReadableArray r33, @android.support.annotation.Nullable com.meituan.msc.jse.bridge.ReadableArray r34, @android.support.annotation.Nullable com.meituan.msc.jse.bridge.ReadableArray r35, @android.support.annotation.Nullable com.meituan.msc.jse.bridge.ReadableArray r36) {
        /*
            Method dump skipped, instructions count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.uimanager.j.b(int, com.meituan.msc.jse.bridge.ReadableArray, com.meituan.msc.jse.bridge.ReadableArray, com.meituan.msc.jse.bridge.ReadableArray, com.meituan.msc.jse.bridge.ReadableArray, com.meituan.msc.jse.bridge.ReadableArray):void");
    }

    private String c(int i, @Nullable ReadableArray readableArray, @Nullable ReadableArray readableArray2, @Nullable ReadableArray readableArray3, @Nullable ReadableArray readableArray4, @Nullable ReadableArray readableArray5) {
        Object[] objArr = {Integer.valueOf(i), readableArray, readableArray2, readableArray3, readableArray4, readableArray5};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f290d235e4aa23507ef5047b887f1aab", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f290d235e4aa23507ef5047b887f1aab");
        }
        return "viewTag:" + i + " moveFrom:" + readableArray + " moveTo:" + readableArray2 + " addChildTags:" + readableArray3 + " addAtIndices:" + readableArray4 + " removeFrom:" + readableArray5 + i(i);
    }

    private String i(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0baa932a4d0607acdc33f11c5a9f5e7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0baa932a4d0607acdc33f11c5a9f5e7");
        }
        StringBuilder sb = new StringBuilder();
        aa c = p().c(i);
        if (c == null) {
            return sb.toString();
        }
        sb.append(" position:");
        sb.append(c.Q() == null ? "no yoga" : c.Q().j());
        sb.append(" children:");
        sb.append(c.n());
        aa r = c.r();
        if (r == null) {
            return sb.toString();
        }
        sb.append(" parent:");
        sb.append(r.p());
        sb.append(" brothers:");
        sb.append(r.n());
        return sb.toString();
    }

    @Override // com.meituan.msc.uimanager.UIImplementation
    public void a(p pVar) {
        Object[] objArr = {pVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "826d7d75261068706802012e433aea62", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "826d7d75261068706802012e433aea62");
            return;
        }
        synchronized (this.w) {
            this.w.add(pVar);
        }
        this.j.runOnNativeModulesQueueThreadDelay(this.y, 500L);
    }

    @Override // com.meituan.msc.uimanager.UIImplementation
    public final aa a(int i, int i2, String str) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1615d109b32f4fbbd316525d1620de3", RobustBitConfig.DEFAULT_VALUE)) {
            return (aa) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1615d109b32f4fbbd316525d1620de3");
        }
        b.incrementAndGet();
        boolean z = Looper.myLooper() == Looper.getMainLooper();
        long nanoTime = System.nanoTime();
        aa aaVar = null;
        as a2 = this.l.a(str);
        if (this.j.getRuntimeDelegate().isPreCreateShadows() && (aaVar = com.meituan.msc.views.precreate.b.a().a(str, a2)) != null) {
            if (i2 != 1) {
                aaVar.g(i2);
            }
            if (a2 instanceof MSIViewManager) {
                ((MSIViewManager) a2).a(this.j);
            }
        }
        if (aaVar == null) {
            aaVar = a2.a(i, this.j);
            aaVar.b(str);
            aaVar.c(str);
            aaVar.g(i2);
        }
        long nanoTime2 = System.nanoTime() - nanoTime;
        if (z) {
            com.meituan.msc.views.precreate.c.v++;
            com.meituan.msc.views.precreate.c.w += nanoTime2;
        } else {
            com.meituan.msc.views.precreate.c.t++;
            com.meituan.msc.views.precreate.c.u += nanoTime2;
        }
        return aaVar;
    }

    public final aa b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9e9471b71f8c182f7a5e0cab2c4c60d", RobustBitConfig.DEFAULT_VALUE)) {
            return (aa) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9e9471b71f8c182f7a5e0cab2c4c60d");
        }
        ReactShadowNodeImpl reactShadowNodeImpl = new ReactShadowNodeImpl();
        com.meituan.msc.jse.modules.i18nmanager.a.a();
        reactShadowNodeImpl.b("MSCView");
        reactShadowNodeImpl.b(true);
        reactShadowNodeImpl.a("display:flex;flex-direction:column");
        com.meituan.msc.modules.reporter.g.d(this.x, "[createRootShadowNode]", reactShadowNodeImpl);
        return reactShadowNodeImpl;
    }

    @Override // com.meituan.msc.uimanager.UIImplementation
    public final void a(int i, String str, int i2, ReadableMap readableMap) {
        Object[] objArr = {Integer.valueOf(i), str, Integer.valueOf(i2), readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98261e30ce066130b96792877b488bf3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98261e30ce066130b96792877b488bf3");
        } else if (this.t) {
            synchronized (this.h) {
                if (!this.p.contains(Integer.valueOf(i2))) {
                    this.p.add(Integer.valueOf(i2));
                }
                aa a2 = a(i, i2, str);
                aa c = this.k.c(i2);
                ab abVar = null;
                if (c == null) {
                    com.meituan.msc.modules.reporter.g.b(this.x, null, "[createView] root node: ", Integer.valueOf(i2), " null while createView, set mViewOperationEnabled false to prevent next creates", Integer.valueOf(i), str, readableMap);
                    this.t = false;
                }
                com.facebook.infer.annotation.a.a(c, "Root node with tag " + i2 + " doesn't exist");
                a2.f(i);
                if (readableMap != null && readableMap.hasKey("is")) {
                    a2.c(readableMap.getString("is"));
                }
                a2.a(c.t());
                this.k.b(a2);
                if (readableMap != null) {
                    abVar = new ab(readableMap);
                    a2.a(abVar);
                }
                if (!a2.b()) {
                    this.n.a(a2, a2.t(), abVar);
                }
            }
        }
    }

    public void a(ThemedReactContext themedReactContext, int i, String str, int i2, ReadableMap readableMap) {
        aa c;
        Object[] objArr = {themedReactContext, Integer.valueOf(i), str, Integer.valueOf(i2), readableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6143d6689bb3ea789881e3859d5b78d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6143d6689bb3ea789881e3859d5b78d");
        } else if (this.t) {
            synchronized (this.h) {
                if (!this.p.contains(Integer.valueOf(i2))) {
                    this.p.add(Integer.valueOf(i2));
                }
                PerfTrace.begin("create_shadow_tree").a(i).a("tag", Integer.valueOf(i)).a("name", str).a("isList", Boolean.valueOf(this.s));
                aa a2 = a(i, i2, str);
                a2.f(i);
                if (readableMap != null && readableMap.hasKey("is")) {
                    a2.c(readableMap.getString("is"));
                }
                if (i2 == a2.p()) {
                    c = a2;
                } else {
                    c = this.k.c(i2);
                    com.facebook.infer.annotation.a.a(c, "Root node with tag " + i2 + " doesn't exist");
                }
                a2.a(themedReactContext != null ? themedReactContext : c.t());
                this.k.b(a2);
                PerfTrace.end("create_shadow_tree").a(i).a("tag", Integer.valueOf(i)).a("name", str).a("isList", Boolean.valueOf(this.s));
                PerfTrace.begin("update_shadow_properties").a(i).a("tag", Integer.valueOf(i)).a("name", str).a("isList", Boolean.valueOf(this.s));
                ab abVar = null;
                if (readableMap != null) {
                    abVar = new ab(readableMap);
                    a2.a(abVar);
                }
                PerfTrace.end("update_shadow_properties").a(i).a("tag", Integer.valueOf(i)).a("name", str).a("isList", Boolean.valueOf(this.s));
                a(a2, i2, abVar);
            }
        }
    }

    @Override // com.meituan.msc.uimanager.UIImplementation
    public final <T extends View> void a(T t, final int i, final ThemedReactContext themedReactContext) {
        Object[] objArr = {t, Integer.valueOf(i), themedReactContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0bc8cae74a83ae932641de8ef5cc22d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0bc8cae74a83ae932641de8ef5cc22d1");
            return;
        }
        com.meituan.msc.modules.reporter.g.d(this.x, "[registerRootView]", Integer.valueOf(i), ", rootView: ", t);
        synchronized (this.h) {
            if (themedReactContext.isOnNativeModulesQueueThread()) {
                CSSParserNative.a();
                aa b2 = b();
                b2.f(i);
                b2.a(themedReactContext);
                this.k.a(b2);
            } else {
                themedReactContext.runOnNativeModulesQueueThread(new Runnable() { // from class: com.meituan.msc.uimanager.j.2
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6d4c848edd9e95e6b224ebb19c087dd4", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6d4c848edd9e95e6b224ebb19c087dd4");
                            return;
                        }
                        CSSParserNative.a();
                        aa b3 = j.this.b();
                        b3.f(i);
                        b3.a(themedReactContext);
                        j.this.k.a(b3);
                    }
                });
            }
            this.m.a(i, (View) t);
        }
    }

    private void a(aa aaVar, float f, float f2) {
        View g;
        View g2;
        Object[] objArr = {aaVar, Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00d21c62c180e01345d6b196053c0262", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00d21c62c180e01345d6b196053c0262");
        } else if (aaVar != null && aaVar.k()) {
            List<aa> a2 = aaVar.a(this.k);
            if (a2 != null) {
                for (aa aaVar2 : a2) {
                    a(aaVar2, aaVar.B() + f, aaVar.C() + f2);
                }
            }
            if (aaVar.Q().e()) {
                Object[] objArr2 = {aaVar, a2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b2b174d761cffcce4d8e8031fefbe84b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b2b174d761cffcce4d8e8031fefbe84b");
                } else if (this.j != null && this.j.getRuntimeDelegate() != null && this.j.getRuntimeDelegate().enableOptimizeApplyViewUpdate()) {
                    b(aaVar, a2);
                } else {
                    a(aaVar, a2);
                }
                aaVar.Q().f();
            }
            int p = aaVar.p();
            boolean a3 = aaVar.a(f, f2, this.m, this.n);
            if (MPTextShadowNode.I) {
                if ((this instanceof com.meituan.msc.uimanager.list.c) && aaVar.P() && (g2 = g(p)) != null) {
                    g2.measure(View.MeasureSpec.makeMeasureSpec((int) aaVar.D(), 1073741824), View.MeasureSpec.makeMeasureSpec((int) aaVar.E(), 1073741824));
                }
            } else if ((this instanceof com.meituan.msc.uimanager.list.c) && (g = g(p)) != null) {
                g.measure(View.MeasureSpec.makeMeasureSpec((int) aaVar.D(), 1073741824), View.MeasureSpec.makeMeasureSpec((int) aaVar.E(), 1073741824));
            }
            if (a3 && aaVar.u()) {
                this.i.a(r.a(p, aaVar.F(), aaVar.G(), aaVar.H(), aaVar.I()));
            }
            aaVar.l();
            if (com.meituan.msc.jse.config.a.h) {
                this.n.d(aaVar);
            }
        }
    }

    private void a(aa aaVar, List<aa> list) {
        boolean z = true;
        Object[] objArr = {aaVar, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b15dc0ec7dfe4478ba38bdc92d54c8af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b15dc0ec7dfe4478ba38bdc92d54c8af");
        } else if (aaVar.A() == m.PARENT) {
            List<Integer> N = aaVar.N();
            int size = list.size();
            int size2 = aaVar.N() == null ? 0 : N.size();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < size2; i++) {
                arrayList.add(new aq(N.get(i).intValue(), i));
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (int i2 = 0; i2 < size; i2++) {
                aa aaVar2 = list.get(i2);
                if (aaVar2 != null) {
                    int p = aaVar2.p();
                    arrayList2.add(new aq(p, i2));
                    arrayList3.add(Integer.valueOf(p));
                }
            }
            z = (N != null || this.j.getRuntimeDelegate().shouldManageViewByCommand()) ? false : false;
            if (arrayList.size() > 0 || arrayList2.size() > 0) {
                aaVar.a(arrayList3);
                Iterator it = arrayList.iterator();
                Iterator it2 = arrayList2.iterator();
                while (it.hasNext() && it2.hasNext()) {
                    if (((aq) it.next()).c == ((aq) it2.next()).c) {
                        it.remove();
                        it2.remove();
                    }
                }
                aq[] aqVarArr = new aq[arrayList2.size()];
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    aqVarArr[i3] = (aq) arrayList2.get(i3);
                }
                int[] iArr = new int[arrayList.size()];
                ArrayList arrayList4 = new ArrayList();
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    iArr[i4] = ((aq) arrayList.get(i4)).d;
                    int i5 = ((aq) arrayList.get(i4)).c;
                    aa c = this.k.c(i5);
                    if ((c == null || c.r() == null) && !arrayList3.contains(Integer.valueOf(i5))) {
                        arrayList4.add(Integer.valueOf(i5));
                    }
                }
                int[] iArr2 = new int[arrayList4.size()];
                for (int i6 = 0; i6 < arrayList4.size(); i6++) {
                    iArr2[i6] = ((Integer) arrayList4.get(i6)).intValue();
                }
                n nVar = this.n;
                int p2 = aaVar.p();
                if (z) {
                    iArr = null;
                }
                if (!c()) {
                    iArr2 = null;
                }
                nVar.a(p2, iArr, aqVarArr, iArr2);
            }
        }
    }

    private void b(aa aaVar, List<aa> list) {
        boolean z = true;
        Object[] objArr = {aaVar, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e66528f1e29c982020ffee87271c780d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e66528f1e29c982020ffee87271c780d");
        } else if (aaVar.A() == m.PARENT) {
            List<Integer> N = aaVar.N();
            int size = list.size();
            int size2 = aaVar.N() == null ? 0 : N.size();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < size2; i++) {
                arrayList.add(N.get(i));
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < size; i2++) {
                aa aaVar2 = list.get(i2);
                if (aaVar2 != null) {
                    arrayList2.add(Integer.valueOf(aaVar2.p()));
                }
            }
            z = (N != null || this.j.getRuntimeDelegate().shouldManageViewByCommand()) ? false : false;
            if (arrayList.size() > 0 || arrayList2.size() > 0) {
                aaVar.a(arrayList2);
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                HashMap hashMap = new HashMap();
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    int intValue = ((Integer) arrayList.get(i3)).intValue();
                    if (!arrayList2.contains(Integer.valueOf(intValue))) {
                        aa c = this.k.c(intValue);
                        if (c == null || c.r() == null) {
                            arrayList5.add(Integer.valueOf(intValue));
                        }
                        arrayList3.add(Integer.valueOf(i3));
                    } else {
                        hashMap.put(Integer.valueOf(intValue), Integer.valueOf(i3 - arrayList3.size()));
                    }
                }
                int i4 = 0;
                for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                    int intValue2 = arrayList2.get(i5).intValue();
                    if (!arrayList.contains(Integer.valueOf(intValue2))) {
                        arrayList4.add(new aq(intValue2, i5));
                        i4++;
                    } else if (((Integer) hashMap.get(Integer.valueOf(intValue2))).intValue() != i5 - i4) {
                        arrayList3.add(Integer.valueOf(arrayList.indexOf(Integer.valueOf(intValue2))));
                        arrayList4.add(new aq(intValue2, i5));
                    }
                }
                Collections.sort(arrayList3);
                int[] iArr = new int[arrayList3.size()];
                for (int i6 = 0; i6 < arrayList3.size(); i6++) {
                    iArr[i6] = ((Integer) arrayList3.get(i6)).intValue();
                }
                aq[] aqVarArr = new aq[arrayList4.size()];
                for (int i7 = 0; i7 < arrayList4.size(); i7++) {
                    aqVarArr[i7] = (aq) arrayList4.get(i7);
                }
                int[] iArr2 = new int[arrayList5.size()];
                for (int i8 = 0; i8 < arrayList5.size(); i8++) {
                    iArr2[i8] = ((Integer) arrayList5.get(i8)).intValue();
                }
                n nVar = this.n;
                int p = aaVar.p();
                if (z) {
                    iArr = null;
                }
                if (!c()) {
                    iArr2 = null;
                }
                nVar.a(p, iArr, aqVarArr, iArr2);
            }
        }
    }

    private boolean r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e288ef1c4dc4925010e1eb1e7969d923", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e288ef1c4dc4925010e1eb1e7969d923")).booleanValue();
        }
        try {
            return e().getRuntimeDelegate().cascadeUseByteArrayCharset();
        } catch (Throwable th) {
            com.meituan.msc.modules.reporter.g.a(th);
            return false;
        }
    }

    private void b(int i, aa aaVar, int i2, JSONObject jSONObject) {
        char c;
        Object[] objArr = {Integer.valueOf(i), aaVar, Integer.valueOf(i2), jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82a8e3743dd0950108e06c08e9fa26bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82a8e3743dd0950108e06c08e9fa26bd");
            return;
        }
        this.j.getRuntimeDelegate().getRenderPerf().a("cascade", i);
        PerfTrace.begin("cascade").a("cascade", jSONObject);
        String q = q();
        if (q == null) {
            com.meituan.msc.modules.reporter.g.b(this.x, null, "[cascadeRootNode] cssKey: null! ", Integer.valueOf(i2));
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        com.meituan.android.msc.csslib.b bVar = new com.meituan.android.msc.csslib.b(CSSParserNative.b(q, aaVar.O(), new CSSParserNative.a() { // from class: com.meituan.msc.uimanager.j.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.msc.csslib.CSSParserNative.a
            public final String a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4eda710cbbfb39893ed9d1cb32eec50e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4eda710cbbfb39893ed9d1cb32eec50e") : j.this.a();
            }
        }));
        this.j.getRuntimeDelegate().getRenderPerf().b("cascade", i);
        PerfTrace.end("cascade").a("cascade", jSONObject);
        int a2 = bVar.a();
        long currentTimeMillis2 = System.currentTimeMillis();
        this.j.getRuntimeDelegate().getRenderPerf().a("updateStyleProperties", i);
        PerfTrace.begin("updateStyleProperties").a("updateStyleProperties", jSONObject);
        if (a2 != 0) {
            try {
                for (Map.Entry<Integer, JSONObject> entry : bVar.b()) {
                    Integer key = entry.getKey();
                    JSONObject value = entry.getValue();
                    aa c2 = this.k.c(key.intValue());
                    if (c2 != null) {
                        if (c2.j() != null && c2.j().startsWith("u-")) {
                            value.put("display", "flex");
                            if (!value.has(FlexDirection.LOWER_CASE_NAME)) {
                                value.put(FlexDirection.LOWER_CASE_NAME, "column");
                            }
                        }
                        if (c2.i().equals("MSCText") && value.has("whiteSpace") && "nowrap".equals(value.getString("whiteSpace"))) {
                            value.put(NumberOfLines.LOWER_CASE_NAME, 1);
                        }
                        a(key.intValue(), c2.i(), new MSCReadableMap(value));
                    } else {
                        com.meituan.msc.modules.reporter.g.b(this.x, null, "cascade error : node not found ", key);
                    }
                }
            } catch (Throwable th) {
                c = 1;
                com.meituan.msc.modules.reporter.g.b(this.x, null, "cascade error : cascade exception ", th.getMessage());
            }
        }
        c = 1;
        String str = this.x;
        Object[] objArr2 = new Object[8];
        objArr2[0] = "[cascadeRootNodeWithByteArrayCharset] totalNodeCount: ";
        objArr2[c] = Integer.valueOf(i2);
        objArr2[2] = ", cascadeCount: ";
        objArr2[3] = Integer.valueOf(a2);
        objArr2[4] = ", cascadeCost: ";
        objArr2[5] = Long.valueOf(currentTimeMillis2 - currentTimeMillis);
        objArr2[6] = ", updateCssProps cost: ";
        objArr2[7] = Long.valueOf(System.currentTimeMillis() - currentTimeMillis2);
        com.meituan.msc.modules.reporter.g.d(str, objArr2);
        this.j.getRuntimeDelegate().getRenderPerf().b("updateStyleProperties", i);
        this.j.getRuntimeDelegate().getRenderPerf().a(i, i2, a2);
        PerfTrace.end("updateStyleProperties").a("updateStyleProperties", jSONObject);
    }

    public void a(int i, aa aaVar, int i2, JSONObject jSONObject) {
        int i3;
        char c;
        char c2;
        Object[] objArr = {Integer.valueOf(i), aaVar, Integer.valueOf(i2), jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bca0bb9b62a1594dad0e1c970504165f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bca0bb9b62a1594dad0e1c970504165f");
            return;
        }
        this.j.getRuntimeDelegate().getRenderPerf().a("cascade", i);
        a("cascade", i, jSONObject);
        String q = q();
        if (q == null) {
            com.meituan.msc.modules.reporter.g.b(this.x, null, "[cascadeRootNode] cssKey: null! ", Integer.valueOf(i2));
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String a2 = CSSParserNative.a(q, aaVar.O(), new CSSParserNative.a() { // from class: com.meituan.msc.uimanager.j.4
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.msc.csslib.CSSParserNative.a
            public final String a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c2e8d2aef2e39f02a751ec76b79bcbad", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c2e8d2aef2e39f02a751ec76b79bcbad") : j.this.a();
            }
        });
        this.j.getRuntimeDelegate().getRenderPerf().b("cascade", i);
        b("cascade", i, jSONObject);
        long currentTimeMillis2 = System.currentTimeMillis();
        this.j.getRuntimeDelegate().getRenderPerf().a("updateStyleProperties", i);
        a("updateStyleProperties", i, jSONObject);
        try {
            if (TextUtils.isEmpty(a2)) {
                i3 = 0;
            } else {
                PerfTrace.begin("parse_css_string").a("batchId", Integer.valueOf(i));
                JSONArray jSONArray = new JSONArray(a2);
                PerfTrace.end("parse_css_string").a("batchId", Integer.valueOf(i));
                i3 = jSONArray.length();
                for (int i4 = 0; i4 < i3; i4++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i4);
                        int i5 = jSONObject2.getInt("id");
                        aa c3 = this.k.c(i5);
                        if (c3 != null) {
                            JSONObject jSONObject3 = jSONObject2.getJSONObject("css");
                            if (c3.j() != null && c3.j().startsWith("u-")) {
                                jSONObject3.put("display", "flex");
                                if (!jSONObject3.has(FlexDirection.LOWER_CASE_NAME)) {
                                    jSONObject3.put(FlexDirection.LOWER_CASE_NAME, "column");
                                }
                            }
                            if (c3.i().equals("MSCText") && jSONObject3.has("whiteSpace") && "nowrap".equals(jSONObject3.getString("whiteSpace"))) {
                                jSONObject3.put(NumberOfLines.LOWER_CASE_NAME, 1);
                            }
                            a(i5, c3.i(), new MSCReadableMap(jSONObject3));
                        } else {
                            com.meituan.msc.modules.reporter.g.b(this.x, null, "cascade error : node not found ", Integer.valueOf(i5));
                        }
                    } catch (Throwable th) {
                        th = th;
                        c = 0;
                        c2 = 1;
                        com.meituan.msc.modules.reporter.g.b(this.x, null, "cascade error : cascade exception ", th.getMessage());
                        String str = this.x;
                        Object[] objArr2 = new Object[8];
                        objArr2[c] = "[cascadeRootNode] totalNodeCount: ";
                        objArr2[c2] = Integer.valueOf(i2);
                        objArr2[2] = ", cascadeCount: ";
                        objArr2[3] = Integer.valueOf(i3);
                        objArr2[4] = ", cascadeCost: ";
                        objArr2[5] = Long.valueOf(currentTimeMillis2 - currentTimeMillis);
                        objArr2[6] = ", updateCssProps cost: ";
                        objArr2[7] = Long.valueOf(System.currentTimeMillis() - currentTimeMillis2);
                        com.meituan.msc.modules.reporter.g.d(str, objArr2);
                        this.j.getRuntimeDelegate().getRenderPerf().b("updateStyleProperties", i);
                        this.j.getRuntimeDelegate().getRenderPerf().a(i, i2, i3);
                        b("updateStyleProperties", i, jSONObject);
                    }
                }
            }
            c2 = 1;
            c = 0;
        } catch (Throwable th2) {
            th = th2;
            i3 = 0;
        }
        String str2 = this.x;
        Object[] objArr22 = new Object[8];
        objArr22[c] = "[cascadeRootNode] totalNodeCount: ";
        objArr22[c2] = Integer.valueOf(i2);
        objArr22[2] = ", cascadeCount: ";
        objArr22[3] = Integer.valueOf(i3);
        objArr22[4] = ", cascadeCost: ";
        objArr22[5] = Long.valueOf(currentTimeMillis2 - currentTimeMillis);
        objArr22[6] = ", updateCssProps cost: ";
        objArr22[7] = Long.valueOf(System.currentTimeMillis() - currentTimeMillis2);
        com.meituan.msc.modules.reporter.g.d(str2, objArr22);
        this.j.getRuntimeDelegate().getRenderPerf().b("updateStyleProperties", i);
        this.j.getRuntimeDelegate().getRenderPerf().a(i, i2, i3);
        b("updateStyleProperties", i, jSONObject);
    }

    private void a(int i, aa aaVar, List<p> list) {
        Object[] objArr = {Integer.valueOf(i), aaVar, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e0914873921de7b5ef7036aac7f806e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e0914873921de7b5ef7036aac7f806e");
        } else if (aaVar.L() != null && aaVar.M() != null && list != null && list.size() != 0) {
            this.j.getRuntimeDelegate().getRenderPerf().a(i, d(aaVar), list.size());
            this.j.getRuntimeDelegate().getRenderPerf().a("updateStyleProperties", i);
            com.meituan.msc.systrace.b.a(0L, "UIImplementation.notifyOnBeforeLayoutRecursive");
            for (p pVar : list) {
                aa c = this.k.c(pVar.a);
                if (c != null) {
                    c.a(new ab(pVar.b));
                }
            }
            this.j.getRuntimeDelegate().getRenderPerf().b("updateStyleProperties", i);
            this.j.getRuntimeDelegate().getRenderPerf().a("notifyBeforeLayout", i);
            try {
                b(aaVar);
                com.meituan.msc.systrace.a.a(0L);
                this.j.getRuntimeDelegate().getRenderPerf().b("notifyBeforeLayout", i);
                this.j.getRuntimeDelegate().getRenderPerf().a("layout", i);
                c(aaVar);
                this.j.getRuntimeDelegate().getRenderPerf().b("layout", i);
                com.meituan.msc.systrace.b.a(0L, "UIImplementation.applyUpdatesRecursive");
                try {
                    this.j.getRuntimeDelegate().getRenderPerf().a("updateLayoutProperties", i);
                    a(aaVar, 0.0f, 0.0f);
                    this.j.getRuntimeDelegate().getRenderPerf().b("updateLayoutProperties", i);
                    com.meituan.msc.systrace.a.a(0L);
                    if (this.r != null) {
                        this.m.a(aaVar, this.r);
                    }
                } finally {
                }
            } finally {
            }
        }
    }

    private void a(String str, int i, JSONObject jSONObject) {
        Object[] objArr = {str, Integer.valueOf(i), jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea55c1ea684bcbfa134e711c224ad699", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea55c1ea684bcbfa134e711c224ad699");
        } else {
            a(str, i, jSONObject, true);
        }
    }

    private void b(String str, int i, JSONObject jSONObject) {
        Object[] objArr = {str, Integer.valueOf(i), jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ef43619cb4aeaa14b87b1243351f941", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ef43619cb4aeaa14b87b1243351f941");
        } else {
            a(str, i, jSONObject, false);
        }
    }

    private void a(String str, int i, JSONObject jSONObject, boolean z) {
        Object[] objArr = {str, Integer.valueOf(i), jSONObject, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "551daf559dae8c7f916fa29486f8c8b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "551daf559dae8c7f916fa29486f8c8b5");
        } else if (z) {
            PerfTrace.begin(str).a("batchId", Integer.valueOf(i)).a("typeCount", jSONObject).a("isList", Boolean.valueOf(this.s)).a("isReuseCell", Boolean.valueOf(i > 1));
        } else {
            PerfTrace.end(str).a("batchId", Integer.valueOf(i)).a("typeCount", jSONObject).a("isList", Boolean.valueOf(this.s)).a("isReuseCell", Boolean.valueOf(i > 1));
        }
    }

    private void a(aa aaVar, JSONObject jSONObject) {
        Object[] objArr = {aaVar, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03877b87aa2f7d830e30fe991c3c965c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03877b87aa2f7d830e30fe991c3c965c");
        } else if (aaVar != null) {
            try {
                jSONObject.put(aaVar.i(), jSONObject.has(aaVar.i()) ? 1 + jSONObject.optInt(aaVar.i()) : 1);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < aaVar.m(); i++) {
                a(aaVar.e(i), jSONObject);
            }
        }
    }
}
