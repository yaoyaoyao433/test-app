package com.tencent.liteav.videoediter.audio;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class f {
    private volatile float a = 1.0f;
    private volatile float b = 1.0f;

    private short a(int i) {
        if (i > 32767) {
            return Short.MAX_VALUE;
        }
        if (i < -32768) {
            return Short.MIN_VALUE;
        }
        return (short) i;
    }

    public void a(float f) {
        this.a = f;
    }

    public void b(float f) {
        this.b = f;
    }

    public short[] a(short[] sArr, short[] sArr2) {
        int i = 0;
        if (sArr2 == null || sArr2.length == 0) {
            if (this.b == 1.0f) {
                return sArr;
            }
            while (i < sArr.length) {
                sArr[i] = a((int) (sArr[i] * this.b));
                i++;
            }
            return sArr;
        }
        while (i < sArr.length) {
            sArr[i] = a((int) ((sArr[i] * this.b) + (sArr2[i] * this.a)));
            i++;
        }
        return sArr;
    }
}
