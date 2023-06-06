package com.tencent.liteav.editer;

import android.os.HandlerThread;
import android.os.Message;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.editer.d;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class ai extends d {
    private final String Y = "VideoDecAndDemuxGenerateGivenTimes";
    private boolean Z;

    public ai(String str) {
        this.V = 0;
        this.W = 0;
        this.X = new AtomicBoolean(true);
        this.U = new ArrayList();
        this.C = new HandlerThread(str + "Dec");
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
        if (this.B != null) {
            if (this.Z) {
                this.B.sendEmptyMessage(5);
            } else {
                this.B.sendEmptyMessage(8);
            }
        }
        this.A.set(2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tencent.liteav.editer.d
    public void m() {
        if (this.A.get() == 1) {
            TXCLog.e("VideoDecAndDemuxGenerateGivenTimes", "stop ignore, mCurrentState = " + this.A.get());
        } else if (this.B != null) {
            this.B.sendEmptyMessage(7);
        }
    }

    @Override // com.tencent.liteav.editer.d
    public synchronized void p() {
        this.X.set(true);
    }

    @Override // com.tencent.liteav.editer.c
    public void k() {
        if (this.C != null) {
            if (this.B != null) {
                if (this.Z) {
                    Message obtain = Message.obtain();
                    obtain.what = 105;
                    obtain.arg1 = 13;
                    this.B.sendMessage(obtain);
                } else {
                    Message obtain2 = Message.obtain();
                    obtain2.what = 105;
                    obtain2.arg1 = 12;
                    this.B.sendMessage(obtain2);
                }
            }
            this.C = null;
        }
    }

    @Override // com.tencent.liteav.editer.d
    public void a(boolean z) {
        this.Z = z;
    }
}
