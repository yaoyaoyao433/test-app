package com.speech.vadsdk.nativelib;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class d {
    public final VadNative a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(VadNative vadNative) {
        this.a = vadNative;
    }

    public final int a(short[] sArr, int i, int i2, boolean z) {
        return this.a.nativeComputeWakeUp(sArr, i, i2, z);
    }

    public final int a(float f) {
        return this.a.setWakeupThreshold(f);
    }

    public final void a() {
        this.a.nativeResetWakeUp();
    }
}
