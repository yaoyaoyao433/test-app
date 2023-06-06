package com.tencent.liteav.editer;

import android.annotation.TargetApi;
import android.os.HandlerThread;
import android.os.Message;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.editer.d;
import com.tencent.liteav.i.a;
import com.tencent.smtt.sdk.TbsListener;
/* compiled from: ProGuard */
@TargetApi(16)
/* loaded from: classes6.dex */
public class y extends d {
    private final String Y = "VideoDecAndDemuxGenerate";

    @Override // com.tencent.liteav.editer.d
    public void a(boolean z) {
    }

    public y(String str) {
        this.C = new HandlerThread(str + "VdecGene");
        this.C.start();
        this.B = new d.b(this.C.getLooper());
        this.E = new HandlerThread(str + "AdecGene");
        this.E.start();
        this.D = new d.a(this.E.getLooper());
    }

    @Override // com.tencent.liteav.editer.d
    public synchronized void l() {
        if (this.A.get() != 2 && this.A.get() != 3) {
            this.u.clear();
            this.v.clear();
            this.A.set(2);
            this.S.set(false);
            this.T.getAndSet(false);
            this.w.getAndSet(false);
            this.x.getAndSet(false);
            this.y.getAndSet(false);
            this.z.getAndSet(false);
            this.i = 0;
            a.i b = com.tencent.liteav.c.f.a().b();
            if (b == null) {
                b(0L, 0L);
            } else {
                b(b.a * 1000, b.b * 1000);
            }
            a(this.g.get());
            this.B.sendEmptyMessage(101);
            if (h()) {
                this.D.sendEmptyMessage(TbsListener.ErrorCode.EXCEED_UNZIP_RETRY_NUM);
            }
            return;
        }
        TXCLog.e("VideoDecAndDemuxGenerate", "start ignore, mCurrentState = " + this.A.get());
    }

    @Override // com.tencent.liteav.editer.d
    public synchronized void m() {
        if (this.A.get() == 1) {
            TXCLog.e("VideoDecAndDemuxGenerate", "stop ignore, mCurrentState is STATE_INIT");
            return;
        }
        this.A.set(1);
        this.B.sendEmptyMessage(103);
        if (h()) {
            this.D.sendEmptyMessage(TbsListener.ErrorCode.APK_VERSION_ERROR);
        }
    }

    @Override // com.tencent.liteav.editer.c
    public void k() {
        if (this.C != null) {
            Message obtain = Message.obtain();
            obtain.what = 105;
            obtain.arg1 = 14;
            this.B.sendMessage(obtain);
            this.C = null;
        }
        if (this.E != null) {
            if (h()) {
                Message obtain2 = Message.obtain();
                obtain2.what = TbsListener.ErrorCode.UNZIP_DIR_ERROR;
                this.D.sendMessage(obtain2);
                this.E = null;
            } else {
                this.E.quit();
            }
            this.E = null;
        }
    }
}
