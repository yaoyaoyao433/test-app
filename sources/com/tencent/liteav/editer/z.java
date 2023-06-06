package com.tencent.liteav.editer;

import android.os.HandlerThread;
import android.os.Message;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.editer.d;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class z extends d {
    private final String Y = "VideoDecAndDemuxGenerateGivenTimes";

    @Override // com.tencent.liteav.editer.d
    public void a(boolean z) {
    }

    public z() {
        this.V = 0;
        this.W = 0;
        this.X = new AtomicBoolean(true);
        this.U = new ArrayList();
        this.C = new HandlerThread("DecGeneGiveTime");
        this.C.start();
        this.B = new d.b(this.C.getLooper());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tencent.liteav.editer.d
    public void l() {
        if (this.A.get() == 2) {
            TXCLog.e("VideoDecAndDemuxGenerateGivenTimes", "start ignore, state = " + this.A.get());
            return;
        }
        a(this.g.get());
        this.B.sendEmptyMessage(5);
        this.A.set(2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tencent.liteav.editer.d
    public void m() {
        if (this.A.get() == 1) {
            TXCLog.e("VideoDecAndDemuxGenerateGivenTimes", "stop ignore, mCurrentState = " + this.A.get());
            return;
        }
        this.B.sendEmptyMessage(7);
    }

    @Override // com.tencent.liteav.editer.d
    public synchronized void p() {
        this.X.set(true);
    }

    @Override // com.tencent.liteav.editer.c
    public void k() {
        if (this.C != null) {
            Message obtain = Message.obtain();
            obtain.what = 105;
            obtain.arg1 = 13;
            this.B.sendMessage(obtain);
            this.C = null;
        }
    }
}
