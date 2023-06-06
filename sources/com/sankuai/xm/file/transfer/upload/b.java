package com.sankuai.xm.file.transfer.upload;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class b extends com.sankuai.xm.file.transfer.a implements d {
    public static ChangeQuickRedirect i;
    protected volatile boolean j;
    protected volatile boolean k;
    protected AtomicBoolean l;

    public b(int i2, long j, int i3, int i4) {
        super(i2, j, i3, i4);
        Object[] objArr = {Integer.valueOf(i2), new Long(j), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f785343fb426c49bff480334923b117", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f785343fb426c49bff480334923b117");
            return;
        }
        this.j = false;
        this.k = false;
        this.l = new AtomicBoolean(false);
    }

    @Override // com.sankuai.xm.file.transfer.c
    public final int d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d730c6c5e1aff92fb81c24d14b40165e", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d730c6c5e1aff92fb81c24d14b40165e")).intValue();
        }
        this.j = false;
        this.l.set(false);
        a(1);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = i;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1376ebf8e73f79cc7844cc5c2d4bd6f2", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1376ebf8e73f79cc7844cc5c2d4bd6f2")).intValue();
        }
        com.sankuai.xm.file.util.b.a("AbstractSingleUploadTask::startImpl => task start: %d", Integer.valueOf(this.d.getTaskId()));
        this.d.getStatisticEntry().taskStartTime = System.currentTimeMillis();
        if (!bX_()) {
            com.sankuai.xm.file.util.b.d("AbstractSingleUploadTask::startImpl => prepare fail task quit: %d", Integer.valueOf(this.d.getTaskId()));
            return this.b;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.j || this.k || !b()) {
            this.d.getStatisticEntry().createPathTime = System.currentTimeMillis() - currentTimeMillis;
            if (this.j) {
                c(0);
                a(5);
                com.sankuai.xm.file.util.b.b("AbstractSingleUploadTask::startImpl => stop task quit [task id: %d]", Integer.valueOf(this.d.getTaskId()));
                return 0;
            } else if (this.k) {
                c(0);
                a(4);
                com.sankuai.xm.file.util.b.b("AbstractSingleUploadTask::startImpl => suspend task quit [task id: %d]", Integer.valueOf(this.d.getTaskId()));
                return 0;
            } else {
                c(11009);
                b(11015);
                com.sankuai.xm.file.util.b.d("AbstractSingleUploadTask::startImpl => task quit [task id: %d] ERROR_UPLOAD_BLOCK_FAIL", Integer.valueOf(this.d.getTaskId()));
                return 11015;
            }
        }
        c(0);
        a(7);
        com.sankuai.xm.file.util.b.b("AbstractSingleUploadTask::startImpl => task finished [task id: %d]", Integer.valueOf(this.d.getTaskId()));
        return 0;
    }

    @Override // com.sankuai.xm.file.transfer.c
    public final int e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76ce1f5c8efc1ec61cb4eb798be2edec", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76ce1f5c8efc1ec61cb4eb798be2edec")).intValue();
        }
        this.l.set(true);
        this.j = true;
        return 0;
    }

    public final boolean f() {
        return this.j || this.k;
    }
}
