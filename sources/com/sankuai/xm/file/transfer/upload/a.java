package com.sankuai.xm.file.transfer.upload;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.file.bean.Block;
import com.sankuai.xm.file.bean.BlockManager;
import com.sankuai.xm.file.proxy.g;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class a extends com.sankuai.xm.file.transfer.a implements c {
    public static ChangeQuickRedirect i;
    protected BlockManager j;
    protected volatile boolean k;
    protected volatile boolean l;
    protected AtomicBoolean m;

    public int h() {
        return 0;
    }

    public a(int i2, long j, int i3, int i4) {
        super(i2, j, i3, i4);
        Object[] objArr = {Integer.valueOf(i2), new Long(j), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60a437a7cb76597ec59957cbd6e75842", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60a437a7cb76597ec59957cbd6e75842");
            return;
        }
        this.j = new BlockManager();
        this.k = false;
        this.l = false;
        this.m = new AtomicBoolean(false);
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [T, java.lang.Boolean] */
    @Override // com.sankuai.xm.file.transfer.c
    public final int d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb9f0c9f88ada83d0a04382dd8bd88ac", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb9f0c9f88ada83d0a04382dd8bd88ac")).intValue();
        }
        this.k = false;
        this.m.set(false);
        a(1);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = i;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d7098766f47b4f09d8e1242549e619a2", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d7098766f47b4f09d8e1242549e619a2")).intValue();
        }
        com.sankuai.xm.file.util.b.a("AbstractPartUploadTask::startImpl => task start, path: %s [task id: %d]", this.d.getLocalPath(), Integer.valueOf(this.d.getTaskId()));
        this.d.getStatisticEntry().taskStartTime = System.currentTimeMillis();
        if (!bW_()) {
            com.sankuai.xm.file.util.b.d("AbstractPartUploadTask::startImpl => prepare fail task quit: %d", Integer.valueOf(this.d.getTaskId()));
            return this.b;
        }
        g<Boolean> gVar = new g<>();
        gVar.b = Boolean.FALSE;
        if (!a(gVar)) {
            c(11016);
            b(11016);
            com.sankuai.xm.file.util.b.d("AbstractPartUploadTask::startImpl => initBlockFile fail task quit [task id: %d] ERROR_DIVIDE_UPLOAD_BLOCK_FAIL", Integer.valueOf(this.d.getTaskId()));
            return 11016;
        } else if (gVar.b.booleanValue()) {
            return a(true);
        } else {
            if (!b()) {
                this.d.getStatisticEntry().divideBlockTime = System.currentTimeMillis() - System.currentTimeMillis();
                if (!j()) {
                    if (this.m.get()) {
                        c(0);
                        a(5);
                        com.sankuai.xm.file.util.b.d("AbstractPartUploadTask::startImpl => stopped [task id: %d]", Integer.valueOf(this.d.getTaskId()));
                        return 0;
                    }
                    c(11006);
                    b(11006);
                    com.sankuai.xm.file.util.b.d("AbstractPartUploadTask::startImpl => loadBreakpoint fail task quit [task id: %d] ERROR_DIVIDE_UPLOAD_BLOCK_FAIL", Integer.valueOf(this.d.getTaskId()));
                    return 11006;
                }
                i();
            }
            return a(false);
        }
    }

    @Override // com.sankuai.xm.file.transfer.c
    public final int e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c41a2fefdb936273f76b683e1408bb6", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c41a2fefdb936273f76b683e1408bb6")).intValue();
        }
        this.k = true;
        this.m.set(true);
        return 0;
    }

    public final boolean f() {
        return this.k || this.l;
    }

    private int a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9f83a1ba072bf46e91569d26209d791", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9f83a1ba072bf46e91569d26209d791")).intValue();
        }
        int h = h();
        if (h != 0) {
            return h;
        }
        if (!z) {
            List<Block> blockList = this.j.getBlockList();
            this.d.getStatisticEntry().startSize = g();
            for (Block block : blockList) {
                if (block.getState() != 1) {
                    if (this.k || this.l || !a(block)) {
                        if (this.k) {
                            c(0);
                            a(5);
                            com.sankuai.xm.file.util.b.b("AbstractPartUploadTask::startImpl => stop task quit [task id: %d]", Integer.valueOf(this.d.getTaskId()));
                            return 0;
                        } else if (this.l) {
                            c(0);
                            a(4);
                            com.sankuai.xm.file.util.b.b("AbstractPartUploadTask::startImpl => suspend task quit [task id: %d]", Integer.valueOf(this.d.getTaskId()));
                            return 0;
                        } else {
                            c(11009);
                            b(11009);
                            com.sankuai.xm.file.util.b.d("AbstractPartUploadTask::startImpl => task quit [task id: %d] ERROR_UPLOAD_BLOCK_FAIL", Integer.valueOf(this.d.getTaskId()));
                            return 11009;
                        }
                    }
                    i();
                }
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (!l()) {
            this.d.getStatisticEntry().createPathTime = System.currentTimeMillis() - currentTimeMillis;
            c(11010);
            b(11010);
            com.sankuai.xm.file.util.b.d("AbstractPartUploadTask::startImpl => task quit [task id: %d] ERROR_CREATE_FILE_FAIL", Integer.valueOf(this.d.getTaskId()));
            return 11010;
        }
        this.d.getStatisticEntry().createPathTime = System.currentTimeMillis() - currentTimeMillis;
        k();
        c(0);
        a(7);
        com.sankuai.xm.file.util.b.b("AbstractPartUploadTask::startImpl => task finished [task id: %d]", Integer.valueOf(this.d.getTaskId()));
        return 0;
    }

    public final long g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4053c6959d58a2da60453813994b6c3c", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4053c6959d58a2da60453813994b6c3c")).longValue();
        }
        long j = 0;
        for (Block block : this.j.getBlockList()) {
            if (block.getState() == 1) {
                j += block.getLength();
            }
        }
        return j;
    }
}
