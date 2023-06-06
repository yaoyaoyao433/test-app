package com.meituan.android.facedetection.algo;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class FaceLivenessDet {
    public static ChangeQuickRedirect changeQuickRedirect;
    public byte[] outputData;

    public native int BlinkDet(byte[] bArr, int[] iArr, byte[] bArr2);

    public native int BlinkDet(byte[] bArr, int[] iArr, byte[] bArr2, int[] iArr2, byte[] bArr3, byte[] bArr4);

    public native int FaceDecrypt(byte[] bArr, byte[] bArr2, int[] iArr);

    public native int FaceEncrypt(byte[] bArr, byte[] bArr2, int[] iArr);

    public native int FaceFrontDirectDet(byte[] bArr, int[] iArr, byte[] bArr2);

    @Deprecated
    public native boolean FaceLivenessDetConfig(FaceLivenessConfig faceLivenessConfig);

    public native int FaceLivenessDetConfigure(FaceLivenessConfig faceLivenessConfig);

    public native boolean FaceLivenessDetModelInit();

    public native boolean FaceLivenessDetModelInit(int i);

    public native boolean FaceLivenessDetModelInit(byte[] bArr);

    public native boolean FaceLivenessDetModelUnInit();

    public native String GetAntionSequence();

    public native int LightGetBestFrame(byte[] bArr, int[] iArr, byte[] bArr2, byte[] bArr3);

    public native int LightInputFrame(byte[] bArr, int[] iArr);

    public native int NewBlinkDet(byte[] bArr, int[] iArr, byte[] bArr2, int[] iArr2);

    public native int NewOpenMouthDet(byte[] bArr, int[] iArr, byte[] bArr2, int[] iArr2);

    public native int NewSwivelheadDet(byte[] bArr, int[] iArr, byte[] bArr2, int[] iArr2);

    public native int NewUpheadDet(byte[] bArr, int[] iArr, byte[] bArr2, int[] iArr2);

    public native int OpenMouthDet(byte[] bArr, int[] iArr, byte[] bArr2);

    public native int OpenMouthDet(byte[] bArr, int[] iArr, byte[] bArr2, int[] iArr2, byte[] bArr3, byte[] bArr4);

    public native int SwivelheadDet(byte[] bArr, int[] iArr, byte[] bArr2);

    public native int SwivelheadDet(byte[] bArr, int[] iArr, byte[] bArr2, int[] iArr2, byte[] bArr3, byte[] bArr4);

    public native int UpheadDet(byte[] bArr, int[] iArr, byte[] bArr2);

    public native int UpheadDet(byte[] bArr, int[] iArr, byte[] bArr2, int[] iArr2, byte[] bArr3, byte[] bArr4);

    @Deprecated
    public int wrapBlinkDet(byte[] bArr, int[] iArr, byte[] bArr2) {
        return 0;
    }

    @Deprecated
    public boolean wrapFaceLivenessDetConfig(FaceLivenessConfig faceLivenessConfig) {
        return false;
    }

    @Deprecated
    public int wrapOpenMouthDet(byte[] bArr, int[] iArr, byte[] bArr2) {
        return 0;
    }

    @Deprecated
    public int wrapSwivelheadDet(byte[] bArr, int[] iArr, byte[] bArr2) {
        return 0;
    }

    public boolean wrapFaceLivenessDetModelInit() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8235d08919873a3fef4700926ddb7241", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8235d08919873a3fef4700926ddb7241")).booleanValue();
        }
        try {
            System.loadLibrary("MNN");
            System.loadLibrary("faceliveness");
            return FaceLivenessDetModelInit();
        } catch (Throwable unused) {
            return false;
        }
    }

    public boolean wrapFaceLivenessDetModelInit(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c63efb640cdb7d831cead6d65ed4a9f5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c63efb640cdb7d831cead6d65ed4a9f5")).booleanValue();
        }
        try {
            System.loadLibrary("MNN");
            System.loadLibrary("faceliveness");
            return FaceLivenessDetModelInit(bArr);
        } catch (Throwable unused) {
            return false;
        }
    }

    public boolean wrapFaceLivenessDetModelInit(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "15c6c15ac5434d5bd01056e0f50e9556", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "15c6c15ac5434d5bd01056e0f50e9556")).booleanValue();
        }
        try {
            System.loadLibrary("MNN");
            System.loadLibrary("faceliveness");
            return FaceLivenessDetModelInit(i);
        } catch (Throwable unused) {
            return false;
        }
    }

    public int wrapFaceLivenessDetConfigure(FaceLivenessConfig faceLivenessConfig) {
        Object[] objArr = {faceLivenessConfig};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "66708d0eb81813c3fdc89617207af882", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "66708d0eb81813c3fdc89617207af882")).intValue();
        }
        try {
            System.loadLibrary("MNN");
            System.loadLibrary("faceliveness");
            return FaceLivenessDetConfigure(faceLivenessConfig);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public int wrapBlinkDet(byte[] bArr, int[] iArr, byte[] bArr2, int[] iArr2, byte[] bArr3, byte[] bArr4) {
        Object[] objArr = {bArr, iArr, bArr2, iArr2, bArr3, bArr4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "709f7d7ad50c56741f419e664964aa84", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "709f7d7ad50c56741f419e664964aa84")).intValue();
        }
        try {
            System.loadLibrary("MNN");
            System.loadLibrary("faceliveness");
            return BlinkDet(bArr, iArr, bArr2, iArr2, bArr3, bArr4);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public int wrapNewBlinkDet(byte[] bArr, int[] iArr, byte[] bArr2, int[] iArr2) {
        Object[] objArr = {bArr, iArr, bArr2, iArr2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e8678673d47e415ae49679342b3225ee", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e8678673d47e415ae49679342b3225ee")).intValue();
        }
        try {
            System.loadLibrary("MNN");
            System.loadLibrary("faceliveness");
            return NewBlinkDet(bArr, iArr, bArr2, iArr2);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public int wrapOpenMouthDet(byte[] bArr, int[] iArr, byte[] bArr2, int[] iArr2, byte[] bArr3, byte[] bArr4) {
        Object[] objArr = {bArr, iArr, bArr2, iArr2, bArr3, bArr4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "37a9b052eb49f358c1b31993a9ccc7eb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "37a9b052eb49f358c1b31993a9ccc7eb")).intValue();
        }
        try {
            System.loadLibrary("MNN");
            System.loadLibrary("faceliveness");
            return OpenMouthDet(bArr, iArr, bArr2, iArr2, bArr3, bArr4);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public int wrapNewOpenMouthDet(byte[] bArr, int[] iArr, byte[] bArr2, int[] iArr2) {
        Object[] objArr = {bArr, iArr, bArr2, iArr2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5961eb7ffe15fcc68edb96d56acdedd4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5961eb7ffe15fcc68edb96d56acdedd4")).intValue();
        }
        try {
            System.loadLibrary("MNN");
            System.loadLibrary("faceliveness");
            return NewOpenMouthDet(bArr, iArr, bArr2, iArr2);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public int wrapUpheadDet(byte[] bArr, int[] iArr, byte[] bArr2, int[] iArr2, byte[] bArr3, byte[] bArr4) {
        Object[] objArr = {bArr, iArr, bArr2, iArr2, bArr3, bArr4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e6d20f08e3c516a9b831467426dab554", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e6d20f08e3c516a9b831467426dab554")).intValue();
        }
        try {
            System.loadLibrary("MNN");
            System.loadLibrary("faceliveness");
            return UpheadDet(bArr, iArr, bArr2, iArr2, bArr3, bArr4);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public int wrapUpheadDet(byte[] bArr, int[] iArr, byte[] bArr2) {
        Object[] objArr = {bArr, iArr, bArr2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cb2b23500bc456c64bcbc3d5e8af90cc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cb2b23500bc456c64bcbc3d5e8af90cc")).intValue();
        }
        try {
            System.loadLibrary("MNN");
            System.loadLibrary("faceliveness");
            return UpheadDet(bArr, iArr, bArr2);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public int wrapNewUpheadDet(byte[] bArr, int[] iArr, byte[] bArr2, int[] iArr2) {
        Object[] objArr = {bArr, iArr, bArr2, iArr2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6de4374f7f3e508f57e64d1f6a823b85", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6de4374f7f3e508f57e64d1f6a823b85")).intValue();
        }
        try {
            System.loadLibrary("MNN");
            System.loadLibrary("faceliveness");
            return NewUpheadDet(bArr, iArr, bArr2, iArr2);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public int wrapSwivelheadDet(byte[] bArr, int[] iArr, byte[] bArr2, int[] iArr2, byte[] bArr3, byte[] bArr4) {
        Object[] objArr = {bArr, iArr, bArr2, iArr2, bArr3, bArr4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8f44dbf9fcfe5a5cb0fee77afb12a609", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8f44dbf9fcfe5a5cb0fee77afb12a609")).intValue();
        }
        try {
            System.loadLibrary("MNN");
            System.loadLibrary("faceliveness");
            return SwivelheadDet(bArr, iArr, bArr2, iArr2, bArr3, bArr4);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public int wrapNewSwivelheadDet(byte[] bArr, int[] iArr, byte[] bArr2, int[] iArr2) {
        Object[] objArr = {bArr, iArr, bArr2, iArr2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "93854b13de839a3401d8081ebc282b16", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "93854b13de839a3401d8081ebc282b16")).intValue();
        }
        try {
            System.loadLibrary("MNN");
            System.loadLibrary("faceliveness");
            return NewSwivelheadDet(bArr, iArr, bArr2, iArr2);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public int wrapFaceFrontDirectDet(byte[] bArr, int[] iArr, byte[] bArr2) {
        Object[] objArr = {bArr, iArr, bArr2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "060b8f6f239c2901bccaab5db8f19cc3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "060b8f6f239c2901bccaab5db8f19cc3")).intValue();
        }
        try {
            System.loadLibrary("MNN");
            System.loadLibrary("faceliveness");
            return FaceFrontDirectDet(bArr, iArr, bArr2);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public int wrapFaceDecrypt(byte[] bArr, byte[] bArr2, int[] iArr) {
        Object[] objArr = {bArr, bArr2, iArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "560df9dcddf5a24112ce92b563d4bc2d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "560df9dcddf5a24112ce92b563d4bc2d")).intValue();
        }
        try {
            System.loadLibrary("MNN");
            System.loadLibrary("faceliveness");
            return FaceDecrypt(bArr, bArr2, iArr);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public int wrapFaceEncrypt(byte[] bArr, byte[] bArr2, int[] iArr) {
        Object[] objArr = {bArr, bArr2, iArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f28361d2764ec8b9b1021e0876e92d80", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f28361d2764ec8b9b1021e0876e92d80")).intValue();
        }
        try {
            System.loadLibrary("MNN");
            System.loadLibrary("faceliveness");
            return FaceEncrypt(bArr, bArr2, iArr);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public boolean wrapFaceLivenessDetModelUnInit() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2aadbecb0e1e1a4745126a033cea3f59", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2aadbecb0e1e1a4745126a033cea3f59")).booleanValue();
        }
        try {
            System.loadLibrary("MNN");
            System.loadLibrary("faceliveness");
            return FaceLivenessDetModelUnInit();
        } catch (Throwable unused) {
            return false;
        }
    }

    public String wrapGetAntionSequence() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e68fd97b38059200257c011a57ec3dcf", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e68fd97b38059200257c011a57ec3dcf");
        }
        try {
            System.loadLibrary("MNN");
            System.loadLibrary("faceliveness");
            return GetAntionSequence();
        } catch (Throwable unused) {
            return "";
        }
    }

    public boolean initDetector(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "118da9bc07b12022f5f538ae74a50e81", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "118da9bc07b12022f5f538ae74a50e81")).booleanValue();
        }
        try {
            return wrapFaceLivenessDetModelInit((byte[]) null);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public int wrapLightInputFrame(byte[] bArr, int[] iArr) {
        Object[] objArr = {bArr, iArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "06b0eafc1c4b99c3d3e744e130a0793b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "06b0eafc1c4b99c3d3e744e130a0793b")).intValue();
        }
        try {
            System.loadLibrary("MNN");
            System.loadLibrary("faceliveness");
            return LightInputFrame(bArr, iArr);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public int wrapLightGetBestFrame(byte[] bArr, int[] iArr, byte[] bArr2, byte[] bArr3) {
        Object[] objArr = {bArr, iArr, bArr2, bArr3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8a07d46c8db92b8cf3eb3b8829dff88f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8a07d46c8db92b8cf3eb3b8829dff88f")).intValue();
        }
        try {
            System.loadLibrary("MNN");
            System.loadLibrary("faceliveness");
            return LightGetBestFrame(bArr, iArr, bArr2, bArr3);
        } catch (Throwable unused) {
            return 0;
        }
    }
}
