package com.speech.vadsdk.nativelib;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class c {
    private final VadNative a;
    private long b;

    public final int a(short[] sArr, int i, int i2, boolean z, int[] iArr, int i3) {
        return this.a.executeNativeComputeVad(sArr, i, 16000, z, iArr, i3);
    }

    public final void a() {
        this.a.nativeReset();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(long j, VadNative vadNative) {
        this.a = vadNative;
        this.b = j;
    }
}
