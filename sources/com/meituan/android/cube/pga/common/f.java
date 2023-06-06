package com.meituan.android.cube.pga.common;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;
import rx.k;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class f {
    public static ChangeQuickRedirect a;
    private ArrayList<e> b;
    private final ReentrantLock c;
    private boolean d;

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2f482b48fdb9c677969da9a5a6f1dde", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2f482b48fdb9c677969da9a5a6f1dde");
            return;
        }
        this.b = new ArrayList<>();
        this.c = new ReentrantLock();
        this.d = false;
    }

    public final void a(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb9300d6804d20a6718ad4f42548c491", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb9300d6804d20a6718ad4f42548c491");
            return;
        }
        this.c.lock();
        if (this.d) {
            if (!eVar.isUnsubscribed()) {
                eVar.unsubscribe();
            }
        } else {
            this.b.add(eVar);
        }
        this.c.unlock();
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7faa846b37d1759897d1109f6929b0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7faa846b37d1759897d1109f6929b0c");
            return;
        }
        this.c.lock();
        this.d = true;
        this.c.unlock();
        Iterator it = ((ArrayList) this.b.clone()).iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            if (!kVar.isUnsubscribed()) {
                kVar.unsubscribe();
            }
        }
    }
}
