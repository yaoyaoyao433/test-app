package com.tencent.liteav.audio.impl.Record;

import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import java.lang.ref.WeakReference;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class a implements Runnable {
    private WeakReference<c> a;
    private int b;
    private int c;
    private int d;
    private boolean e;
    private Thread f;
    private byte[] g;

    public void a() {
        this.e = false;
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f != null && this.f.isAlive() && Thread.currentThread().getId() != this.f.getId()) {
            try {
                this.f.join();
            } catch (Exception e) {
                TXCLog.e("AudioCenter:TXCAudioBGMRecord", "record stop Exception: " + e.getMessage());
            }
        }
        TXCLog.i("AudioCenter:TXCAudioBGMRecord", "stop record cost time(MS): " + (System.currentTimeMillis() - currentTimeMillis));
        this.f = null;
    }

    private void a(byte[] bArr, int i, long j) {
        c cVar;
        synchronized (this) {
            cVar = this.a != null ? this.a.get() : null;
        }
        if (cVar != null) {
            cVar.onAudioRecordPCM(bArr, i, j);
        } else {
            TXCLog.e("AudioCenter:TXCAudioBGMRecord", "onRecordPcmData:no callback");
        }
    }

    private void b() {
        c cVar;
        synchronized (this) {
            cVar = this.a != null ? this.a.get() : null;
        }
        if (cVar != null) {
            cVar.onAudioRecordStart();
        } else {
            TXCLog.e("AudioCenter:TXCAudioBGMRecord", "onRecordStart:no callback");
        }
    }

    private void c() {
        c cVar;
        synchronized (this) {
            cVar = this.a != null ? this.a.get() : null;
        }
        if (cVar != null) {
            cVar.onAudioRecordStop();
        } else {
            TXCLog.e("AudioCenter:TXCAudioBGMRecord", "onRecordStop:no callback");
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!this.e) {
            TXCLog.w("AudioCenter:TXCAudioBGMRecord", "audio record: abandom start audio sys record thread!");
            return;
        }
        b();
        int i = this.b;
        int i2 = this.c;
        int i3 = this.d;
        int i4 = ((i2 * 1024) * i3) / 8;
        this.g = new byte[i4];
        Arrays.fill(this.g, (byte) 0);
        long j = 0;
        long currentTimeMillis = System.currentTimeMillis();
        while (this.e && !Thread.interrupted()) {
            if (((((((System.currentTimeMillis() - currentTimeMillis) * i) * i2) * i3) / 8) / 1000) - j < i4) {
                try {
                    Thread.sleep(10L);
                } catch (InterruptedException unused) {
                }
            } else {
                j += this.g.length;
                a(this.g, this.g.length, TXCTimeUtil.getTimeTick());
            }
        }
        c();
    }
}
