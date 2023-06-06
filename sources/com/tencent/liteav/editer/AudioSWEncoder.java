package com.tencent.liteav.editer;

import com.tencent.liteav.basic.log.TXCLog;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class AudioSWEncoder implements i {
    private long a;
    private Queue<com.tencent.liteav.d.e> b = new LinkedBlockingDeque();

    private native void nativeSetEncodeParam(long j, int i, int i2, int i3);

    public native long nativeInit();

    public native byte[] nativeProcess(long j, byte[] bArr, int i);

    public native void nativeUnit(long j);

    @Override // com.tencent.liteav.editer.i
    public void a() {
        synchronized (this) {
            this.a = nativeInit();
        }
    }

    @Override // com.tencent.liteav.editer.i
    public void b() {
        synchronized (this) {
            nativeUnit(this.a);
            this.a = 0L;
        }
        this.b.clear();
    }

    @Override // com.tencent.liteav.editer.i
    public void a(t tVar) {
        synchronized (this) {
            if (this.a == 0) {
                return;
            }
            TXCLog.i("AudioSWEncoder", "setEncodeParam channel:" + tVar.channelCount + ",sampleRate:" + tVar.sampleRate);
            nativeSetEncodeParam(this.a, tVar.channelCount, tVar.sampleRate, 16);
        }
    }

    @Override // com.tencent.liteav.editer.i
    public void a(com.tencent.liteav.d.e eVar) {
        b(eVar);
    }

    @Override // com.tencent.liteav.editer.i
    public com.tencent.liteav.d.e c() {
        return this.b.poll();
    }

    private void b(com.tencent.liteav.d.e eVar) {
        ByteBuffer b = eVar.b();
        int g = eVar.g();
        if (g == 0) {
            if ((eVar.f() & 4) != 0) {
                com.tencent.liteav.d.e eVar2 = new com.tencent.liteav.d.e();
                eVar2.c(eVar.f());
                eVar2.d(0);
                this.b.add(eVar2);
                return;
            }
            return;
        }
        byte[] bArr = new byte[g];
        b.order(ByteOrder.nativeOrder());
        b.get(bArr);
        synchronized (this) {
            if (this.a == 0) {
                return;
            }
            byte[] nativeProcess = nativeProcess(this.a, bArr, g);
            com.tencent.liteav.d.e eVar3 = new com.tencent.liteav.d.e();
            eVar3.i(eVar.l());
            eVar3.c(eVar.f());
            if (nativeProcess == null || nativeProcess.length <= 0) {
                return;
            }
            eVar3.d(nativeProcess.length);
            eVar3.a(ByteBuffer.wrap(nativeProcess));
            this.b.add(eVar3);
        }
    }
}
