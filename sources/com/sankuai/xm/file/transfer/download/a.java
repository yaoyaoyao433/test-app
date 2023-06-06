package com.sankuai.xm.file.transfer.download;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.meituan.xp.core.XPlayerConstants;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class a extends com.sankuai.xm.file.transfer.a implements b {
    public static ChangeQuickRedirect i;
    protected volatile boolean j;
    protected volatile boolean k;

    public a(int i2, long j) {
        super(-1, -1L, 0, 0);
        Object[] objArr = {-1, -1L};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "043aac40f9919821a68a20274af79023", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "043aac40f9919821a68a20274af79023");
        }
    }

    @Override // com.sankuai.xm.file.transfer.c
    public final int d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f878516fdbe12786e3aa308167c141b", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f878516fdbe12786e3aa308167c141b")).intValue();
        }
        this.j = false;
        a(1);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = i;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "64ed0bda713565097aa0d1a3dc181b48", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "64ed0bda713565097aa0d1a3dc181b48")).intValue();
        }
        com.sankuai.xm.file.util.b.a("AbstractSimpleDownloadTask::startImpl => task start: %d", Integer.valueOf(this.d.getTaskId()));
        this.d.getStatisticEntry().taskStartTime = System.currentTimeMillis();
        if (!bV_()) {
            com.sankuai.xm.file.util.b.d("AbstractSimpleDownloadTask::startImpl => prepare fail task quit: %d", Integer.valueOf(this.d.getTaskId()));
            return this.b;
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = i;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2c29a6959544ae327748bb29b4c2ca66", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2c29a6959544ae327748bb29b4c2ca66")).intValue();
        }
        if (this.j || this.k || !b()) {
            if (this.j) {
                c(0);
                a(5);
                com.sankuai.xm.file.util.b.b("AbstractSimpleDownloadTask::startImpl => stop task quit [task id: %d]", Integer.valueOf(this.d.getTaskId()));
                return 0;
            } else if (this.k) {
                c(0);
                a(4);
                com.sankuai.xm.file.util.b.b("AbstractSimpleDownloadTask::startImpl => suspend task quit [task id: %d]", Integer.valueOf(this.d.getTaskId()));
                return 0;
            } else {
                c(XPlayerConstants.FFP_MSG_RECEIVE_SEI_FRAME);
                b(XPlayerConstants.FFP_MSG_RECEIVE_SEI_FRAME);
                com.sankuai.xm.file.util.b.d("AbstractSimpleDownloadTask::startImpl => task quit [task id: %d] ERROR_DOWNLOAD_BLOCK_FAIL", Integer.valueOf(this.d.getTaskId()));
                return XPlayerConstants.FFP_MSG_RECEIVE_SEI_FRAME;
            }
        } else if (!g()) {
            if (this.j) {
                c(0);
                a(5);
                com.sankuai.xm.file.util.b.b("AbstractSimpleDownloadTask::startImpl => stop task quit [task id: %d]", Integer.valueOf(this.d.getTaskId()));
                return 0;
            } else if (this.k) {
                c(0);
                a(4);
                com.sankuai.xm.file.util.b.b("AbstractSimpleDownloadTask::startImpl => suspend task quit [task id: %d]", Integer.valueOf(this.d.getTaskId()));
                return 0;
            } else {
                c(11005);
                b(11005);
                i();
                com.sankuai.xm.file.util.b.d("AbstractSimpleDownloadTask::startImpl => task quit [task id: %d] ERROR_UPLOAD_BLOCK_FAIL", Integer.valueOf(this.d.getTaskId()));
                return 11005;
            }
        } else if (!h()) {
            c(11003);
            b(11003);
            i();
            com.sankuai.xm.file.util.b.d("AbstractSimpleDownloadTask::startImpl => task quit [task id: %d] ERROR_UPLOAD_BLOCK_FAIL", Integer.valueOf(this.d.getTaskId()));
            return 11003;
        } else if (!i()) {
            c(11004);
            b(11004);
            com.sankuai.xm.file.util.b.d("AbstractSimpleDownloadTask::startImpl => task quit [task id: %d] ERROR_UPLOAD_BLOCK_FAIL", Integer.valueOf(this.d.getTaskId()));
            return 11004;
        } else {
            c(0);
            a(7);
            com.sankuai.xm.file.util.b.b("AbstractSimpleDownloadTask::startImpl => task finished: %d", Integer.valueOf(this.d.getTaskId()));
            return 0;
        }
    }

    @Override // com.sankuai.xm.file.transfer.c
    public final int e() {
        this.j = true;
        return 0;
    }

    public final boolean f() {
        return this.j || this.k;
    }
}
