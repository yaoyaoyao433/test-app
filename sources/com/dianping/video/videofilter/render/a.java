package com.dianping.video.videofilter.render;

import android.content.Context;
import com.dianping.video.model.b;
import com.dianping.video.model.c;
import com.dianping.video.util.FilterManager;
import com.dianping.video.videofilter.gpuimage.f;
import com.dianping.video.videofilter.gpuimage.g;
import com.dianping.video.videofilter.gpuimage.i;
import com.dianping.video.videofilter.gpuimage.k;
import com.dianping.video.videofilter.renderformat.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public volatile boolean b;
    public boolean c;
    public g d;
    public e e;
    public Map<b, List<Integer>> f;
    public Queue<Runnable> g;
    public float[] h;
    private ArrayList<c> i;
    private WeakReference<Context> j;

    public a(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33ac40d977834e7ff60de56c54ffcfe2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33ac40d977834e7ff60de56c54ffcfe2");
            return;
        }
        this.c = false;
        this.g = new ConcurrentLinkedQueue();
        this.e = eVar;
    }

    public final void a() {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2eb8d3132b451cedf1f5f8fa4877bb42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2eb8d3132b451cedf1f5f8fa4877bb42");
            return;
        }
        b[] a2 = this.e.a();
        for (int i = 0; i < a2.length; i++) {
            com.dianping.video.log.c.a().a("FrameRenderUnit", "FrameRenderInfo = " + a2[i].toString());
        }
        this.i = new ArrayList<>();
        this.f = new HashMap();
        this.d = new g();
        for (b bVar : a2) {
            ArrayList<c> arrayList = bVar.d;
            ArrayList arrayList2 = new ArrayList();
            Iterator<c> it = arrayList.iterator();
            while (it.hasNext()) {
                c next = it.next();
                int i2 = 0;
                while (true) {
                    if (i2 >= this.i.size()) {
                        z = false;
                        break;
                    } else if (this.i.get(i2).equals(next)) {
                        arrayList2.add(Integer.valueOf(i2));
                        z = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (!z) {
                    arrayList2.add(Integer.valueOf(this.i.size()));
                    this.i.add(next);
                }
            }
            this.f.put(bVar, arrayList2);
        }
        Iterator<c> it2 = this.i.iterator();
        while (it2.hasNext()) {
            c next2 = it2.next();
            if (next2.c != null) {
                this.d.a(next2.c);
            } else {
                f a3 = a(next2);
                this.d.a(a3);
                next2.c = a3;
            }
        }
        if (this.e.f != null && !this.e.f.isEmpty()) {
            this.c = true;
        }
        if (this.c) {
            if (this.e.f == null || this.e.f.isEmpty()) {
                this.d.a(new f());
            } else {
                c cVar = this.e.f.get(0);
                if (cVar.c != null) {
                    this.d.a(cVar.c);
                } else {
                    f a4 = a(cVar);
                    this.d.a(a4);
                    cVar.c = a4;
                }
            }
        }
        for (f fVar : this.d.i()) {
            fVar.a(this.h);
        }
        com.dianping.video.log.c.a().a("FrameRenderUnit", "mergedFilters = " + this.i.toString());
    }

    private f a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e58cc47295962d200297e1aa28037cd5", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e58cc47295962d200297e1aa28037cd5");
        }
        if (cVar.b == f.class) {
            return new f();
        }
        if (cVar.b == com.dianping.video.videofilter.gpuimage.e.class) {
            return new com.dianping.video.videofilter.gpuimage.e();
        }
        if (cVar.b == i.class) {
            Context context = this.j.get();
            if (context != null) {
                i iVar = new i();
                iVar.a(FilterManager.a().a(cVar.e).a(context));
                iVar.a(cVar.d);
                return iVar;
            }
            return new f();
        } else if (cVar.b == k.class) {
            return null;
        } else {
            throw new RuntimeException("we not support this filter,filterClass = " + cVar.b);
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebd1184a15bcdf909eadfb78413614ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebd1184a15bcdf909eadfb78413614ac");
        } else if (this.d == null || !this.b) {
        } else {
            this.d.d();
            this.b = false;
            com.dianping.video.log.c.a().a("FrameRenderUnit", "pauseRender");
        }
    }

    public final void a(int i, final f fVar) {
        Object[] objArr = {0, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b59e22cb9092023533262ec2a08421a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b59e22cb9092023533262ec2a08421a");
        } else {
            a(new Runnable() { // from class: com.dianping.video.videofilter.render.a.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ea0dfebf9a71bdb82b44d7428c0be1d0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ea0dfebf9a71bdb82b44d7428c0be1d0");
                        return;
                    }
                    com.dianping.video.log.c.a().a("FrameRenderUnit", "removeRenderFilter");
                    a.this.b();
                    a.this.e.a(r2, fVar);
                    a.this.a();
                }
            });
        }
    }

    public void a(Queue<Runnable> queue) {
        Object[] objArr = {queue};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d778706f2e1afdcaee9a12ce89f2bbf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d778706f2e1afdcaee9a12ce89f2bbf");
            return;
        }
        synchronized (queue) {
            while (!queue.isEmpty()) {
                queue.poll().run();
            }
        }
    }

    public final void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdc2d77e144e73db3cdf461ae870afdc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdc2d77e144e73db3cdf461ae870afdc");
            return;
        }
        synchronized (this.g) {
            this.g.add(runnable);
        }
    }
}
