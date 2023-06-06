package com.sankuai.meituan.bundle.service;

import android.text.TextUtils;
import com.meituan.msi.bean.ContainerInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.sankuai.meituan.retrofit2.ar;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public String b;
    public int c;
    public ar d;
    public ReadWriteLock e;
    private HashMap<String, d> f;
    private ArrayList<d> g;
    private ArrayList<d> h;
    private ExecutorService i;
    private ExecutorService j;

    public c(ar arVar, int i) {
        Object[] objArr = {arVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9211f1ddc9748f134c8ea76cf53115e3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9211f1ddc9748f134c8ea76cf53115e3");
            return;
        }
        this.f = new HashMap<>();
        this.g = new ArrayList<>();
        this.h = new ArrayList<>();
        this.c = i;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bde4c72b06578d4bf841d803dd27231f", RobustBitConfig.DEFAULT_VALUE)) {
            switch (this.c) {
                case 100:
                    this.b = "web";
                    break;
                case 101:
                    this.b = "mrn";
                    break;
                case 102:
                    this.b = ContainerInfo.ENV_MMP;
                    break;
                case 103:
                    this.b = PushConstants.PUSH_NOTIFICATION_CREATE_TIMES_TAMP;
                    break;
                case 104:
                    this.b = "fmp";
                    break;
                case 105:
                    this.b = "mgc";
                    break;
                default:
                    this.b = String.valueOf(this.c);
                    break;
            }
        } else {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bde4c72b06578d4bf841d803dd27231f");
        }
        PriorityBlockingQueue priorityBlockingQueue = new PriorityBlockingQueue(11, new a());
        this.i = com.sankuai.android.jarvis.c.a("knb-bs-" + this.b, 1, 1, 10L, TimeUnit.MINUTES, priorityBlockingQueue);
        this.j = com.sankuai.android.jarvis.c.b("knb-bs-" + this.b + "-hp");
        this.d = arVar;
        this.e = new ReentrantReadWriteLock();
    }

    public final synchronized boolean a(String str, d dVar) {
        Object[] objArr = {str, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bca13c740804c5b2d65f06a38b274def", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bca13c740804c5b2d65f06a38b274def")).booleanValue();
        }
        this.h.remove(dVar);
        if (this.f.containsKey(str)) {
            return false;
        }
        this.f.put(str, dVar);
        return true;
    }

    public final synchronized ArrayList<d> a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b615de904f75ebfc2c38ec7be8ec42cf", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b615de904f75ebfc2c38ec7be8ec42cf");
        }
        this.f.remove(str);
        ArrayList<d> arrayList = new ArrayList<>();
        for (int size = this.g.size() - 1; size >= 0; size--) {
            d dVar = this.g.get(size);
            if (TextUtils.equals(dVar.f, str)) {
                arrayList.add(dVar);
                this.g.remove(size);
            }
        }
        k.a("onExecuteTaskStop hash=%s; size=%d", str, Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    public final synchronized void a(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4aef75462e4c6f4317dce5b459ab45c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4aef75462e4c6f4317dce5b459ab45c");
            return;
        }
        if (!TextUtils.isEmpty(dVar.f)) {
            this.g.add(dVar);
            k.a("add task; hash=%s;bringToFront=%b", dVar.f, Boolean.valueOf(dVar.e));
            if (this.f.containsKey(dVar.f)) {
                k.a("executing hash=%s;bringToFront=%b", dVar.f, Boolean.valueOf(dVar.e));
                return;
            }
            Iterator<d> it = this.h.iterator();
            while (it.hasNext()) {
                d next = it.next();
                if (TextUtils.equals(next.f, dVar.f) && (!dVar.e || next.e)) {
                    k.a("in preExecTaskList will return;hash=%s;bringToFront=%b", dVar.f, Boolean.valueOf(dVar.e));
                    return;
                }
            }
            BlockingQueue<Runnable> queue = ((ThreadPoolExecutor) this.i).getQueue();
            Iterator it2 = queue.iterator();
            d dVar2 = null;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Runnable runnable = (Runnable) it2.next();
                if ((runnable instanceof d) && TextUtils.equals(((d) runnable).f, dVar.f)) {
                    dVar2 = (d) runnable;
                    break;
                }
            }
            if (dVar.e) {
                if (dVar2 != null) {
                    queue.remove(dVar2);
                    this.h.remove(dVar2);
                    k.a("move to high queue hash=%s;bringToFront=%b", dVar2.f, Boolean.valueOf(dVar2.e));
                }
            } else if (dVar2 != null) {
                k.a("exists at common queue hash=%s;bringToFront=%b", dVar2.f, Boolean.valueOf(dVar2.e));
                return;
            }
            this.h.add(dVar);
            (dVar.e ? this.j : this.i).execute(dVar);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class a<T extends Runnable> implements Comparator<T> {
        public static ChangeQuickRedirect a;

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            Runnable runnable = (Runnable) obj;
            Runnable runnable2 = (Runnable) obj2;
            Object[] objArr = {runnable, runnable2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "705ce8d53e045bf1b41f8d26880aa78c", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "705ce8d53e045bf1b41f8d26880aa78c")).intValue();
            }
            if ((runnable instanceof d) && (runnable2 instanceof d)) {
                return ((d) runnable2).b() - ((d) runnable).b();
            }
            return 1;
        }
    }
}
