package com.meituan.android.facedetection.algo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class FaceLivenessConfig {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int brushFaceWillingness;
    public byte[] kmsEdk;
    public int overtimeTime;

    public FaceLivenessConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e6588c159b3317e6e7c23479fb301d0d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e6588c159b3317e6e7c23479fb301d0d");
            return;
        }
        this.overtimeTime = -1;
        this.brushFaceWillingness = 0;
        this.kmsEdk = null;
    }

    public FaceLivenessConfig(int i, int i2, byte[] bArr) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "727a67ead7c1a44f71fd64aa10a7e9cf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "727a67ead7c1a44f71fd64aa10a7e9cf");
            return;
        }
        this.overtimeTime = -1;
        this.brushFaceWillingness = 0;
        this.kmsEdk = null;
        this.overtimeTime = i;
        this.brushFaceWillingness = i2;
        this.kmsEdk = bArr;
    }

    @Deprecated
    public FaceLivenessConfig(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "44a2e19b5a0d889fde771b0a8bd0c9aa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "44a2e19b5a0d889fde771b0a8bd0c9aa");
            return;
        }
        this.overtimeTime = -1;
        this.brushFaceWillingness = 0;
        this.kmsEdk = null;
        this.overtimeTime = i;
        this.brushFaceWillingness = i2;
    }

    public int getOvertimeTime() {
        return this.overtimeTime;
    }

    public void setOvertimeTime(int i) {
        this.overtimeTime = i;
    }

    public int getBrushFaceWillingness() {
        return this.brushFaceWillingness;
    }

    public void setBrushFaceWillingness(int i) {
        this.brushFaceWillingness = i;
    }

    public byte[] getKmsEdk() {
        return this.kmsEdk;
    }

    public void setKmsEdk(byte[] bArr) {
        this.kmsEdk = bArr;
    }
}
