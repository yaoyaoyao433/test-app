package com.meituan.mtwebkit.internal.update.tasks;

import com.meituan.mtwebkit.internal.task.Depend;
import com.meituan.mtwebkit.internal.update.model.VersionInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.ScheduledFuture;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d extends com.meituan.mtwebkit.internal.task.a<Boolean> {
    public static ChangeQuickRedirect a;
    private int b;
    @Depend
    private c k;
    @Depend
    private b l;
    @Depend
    private e m;
    @Depend
    private DDVersionInfoTask n;
    @Depend
    private a o;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ccf20f28d15c9c2efbc6ea61e4ddd96", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ccf20f28d15c9c2efbc6ea61e4ddd96");
        } else {
            this.b = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Finally extract failed */
    @Override // com.meituan.mtwebkit.internal.task.a
    /* renamed from: a */
    public Boolean b() throws Throwable {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2fbb45802f5a9fcb198235ed37dbc31", RobustBitConfig.DEFAULT_VALUE)) {
            return (Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2fbb45802f5a9fcb198235ed37dbc31");
        }
        this.k.c();
        ScheduledFuture<?> c = this.l.c();
        try {
            this.m.c();
            VersionInfo c2 = this.n.c();
            if (c2 != null) {
                this.b = c2.currentVersion;
            }
            com.meituan.mtwebkit.internal.reporter.c.a(this.m.d(), this.b, this.o.c());
            c.cancel(true);
            com.meituan.mtwebkit.internal.h.a(1);
            return Boolean.TRUE;
        } catch (Throwable th) {
            VersionInfo c3 = this.n.c();
            if (c3 != null) {
                this.b = c3.currentVersion;
            }
            com.meituan.mtwebkit.internal.reporter.c.a(this.m.d(), this.b, this.o.c());
            c.cancel(true);
            com.meituan.mtwebkit.internal.h.a(1);
            throw th;
        }
    }
}
