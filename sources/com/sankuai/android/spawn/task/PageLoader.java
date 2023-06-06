package com.sankuai.android.spawn.task;

import android.location.Location;
import android.os.Handler;
import android.support.v4.content.ConcurrentTask;
import android.support.v4.content.Loader;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.model.Request;
import com.sankuai.model.pager.PageIterator;
import java.io.IOException;
import java.util.concurrent.Executor;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes3.dex */
public class PageLoader<D> extends AbstractModelLoader<D> {
    public static ChangeQuickRedirect d;
    public Loader<Location> e;
    public Loader.OnLoadCompleteListener f;
    private final PageIterator<D> g;
    private final a<D> h;
    private final Handler i;
    private Location j;
    private boolean k;
    private Runnable l;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a<D> {
        D a(D d, Location location);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x010b, code lost:
        if (r0 > 100.0f) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(com.sankuai.android.spawn.task.PageLoader r20, android.location.Location r21) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.android.spawn.task.PageLoader.a(com.sankuai.android.spawn.task.PageLoader, android.location.Location):void");
    }

    @Override // android.support.v4.content.Loader
    public void onStopLoading() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99c9a417e1c6205fc3e1273d52c11e36", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99c9a417e1c6205fc3e1273d52c11e36");
            return;
        }
        this.i.removeCallbacks(this.l);
        if (this.e != null) {
            this.e.unregisterListener(this.f);
            this.e = null;
        }
        super.onStopLoading();
    }

    @Override // com.sankuai.android.spawn.task.AbstractModelLoader, android.support.v4.content.Loader
    public void onStartLoading() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2df718cefd126fcae9fc452af24c660", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2df718cefd126fcae9fc452af24c660");
        } else {
            super.onStartLoading();
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.android.spawn.task.PageLoader$2  reason: invalid class name */
    /* loaded from: classes3.dex */
    public class AnonymousClass2 implements Loader.OnLoadCompleteListener<Location> {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ PageLoader b;

        @Override // android.support.v4.content.Loader.OnLoadCompleteListener
        public /* synthetic */ void onLoadComplete(Loader<Location> loader, Location location) {
            Location location2 = location;
            Object[] objArr = {loader, location2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b70a5e6fc9c8d12ce1d8af419ba56bf9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b70a5e6fc9c8d12ce1d8af419ba56bf9");
            } else {
                PageLoader.a(this.b, location2);
            }
        }
    }

    @Override // com.sankuai.android.spawn.task.AbstractModelLoader
    public final D a() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f697e0be4028c6c97db9652afd919b9f", 6917529027641081856L)) {
            return (D) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f697e0be4028c6c97db9652afd919b9f");
        }
        if (!this.k) {
            this.k = true;
            this.g.next();
            return this.g.getResource();
        } else if (this.c != null || this.g.getResource() == null) {
            return null;
        } else {
            return this.h.a(this.g.getResource(), this.j);
        }
    }

    @Override // android.support.v4.content.ConcurrentTaskLoader
    public Executor dispatchExecutor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "833cd28518c64268a9759ef407c52852", 6917529027641081856L)) {
            return (Executor) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "833cd28518c64268a9759ef407c52852");
        }
        if (this.g.loadFrom() == Request.Origin.LOCAL) {
            return ConcurrentTask.SERIAL_EXECUTOR;
        }
        return ConcurrentTask.THREAD_POOL_EXECUTOR;
    }
}
