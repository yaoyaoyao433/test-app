package com.meituan.android.privacy.interfaces.def;

import android.media.AudioRecord;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b implements com.meituan.android.privacy.interfaces.j {
    public static ChangeQuickRedirect a;
    private AudioRecord b;

    public b(int i, int i2, int i3, int i4, int i5) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67bdaf7d59dc5512feabe4a4b75dd114", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67bdaf7d59dc5512feabe4a4b75dd114");
        } else {
            this.b = new AudioRecord(i, i2, i3, i4, i5);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.j
    public final void a() throws IllegalStateException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6eea18b0cbd07d63294e89b4a685a11", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6eea18b0cbd07d63294e89b4a685a11");
        } else {
            this.b.startRecording();
        }
    }

    @Override // com.meituan.android.privacy.interfaces.j
    public final void b() throws IllegalStateException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ab4496ea00b3e80310b38cb70d8dee5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ab4496ea00b3e80310b38cb70d8dee5");
        } else {
            this.b.stop();
        }
    }

    @Override // com.meituan.android.privacy.interfaces.j
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7fc7725f75e30f188f44255f28b7558", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7fc7725f75e30f188f44255f28b7558");
        } else {
            this.b.release();
        }
    }

    @Override // com.meituan.android.privacy.interfaces.j
    public final int d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24fbfe728157ea6b8c5c39fc6ae18c03", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24fbfe728157ea6b8c5c39fc6ae18c03")).intValue() : this.b.getState();
    }

    @Override // com.meituan.android.privacy.interfaces.j
    public final int e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "996eee16ead137e7c66744ac3ae681ee", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "996eee16ead137e7c66744ac3ae681ee")).intValue() : this.b.getAudioSessionId();
    }

    @Override // com.meituan.android.privacy.interfaces.j
    public final int f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5294b85189eedb0be65ed5d4dbff6d36", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5294b85189eedb0be65ed5d4dbff6d36")).intValue() : this.b.getRecordingState();
    }

    @Override // com.meituan.android.privacy.interfaces.j
    public final int a(byte[] bArr, int i, int i2) {
        Object[] objArr = {bArr, 0, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "802e0ea87679147fbae86412b20629d5", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "802e0ea87679147fbae86412b20629d5")).intValue() : this.b.read(bArr, 0, i2);
    }

    @Override // com.meituan.android.privacy.interfaces.j
    public final int a(@NonNull short[] sArr, int i, int i2) {
        Object[] objArr = {sArr, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f542df6d68150a45bcaeda420e47e0e9", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f542df6d68150a45bcaeda420e47e0e9")).intValue() : this.b.read(sArr, i, i2);
    }
}
