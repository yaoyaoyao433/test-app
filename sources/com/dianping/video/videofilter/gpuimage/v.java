package com.dianping.video.videofilter.gpuimage;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class v {
    public static ChangeQuickRedirect a;
    public static final float[] b = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};
    public static final float[] c = {1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f};
    public static final float[] d = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f};
    public static final float[] e = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};

    private static float a(float f) {
        return f == 0.0f ? 1.0f : 0.0f;
    }

    public static float[] a(u uVar, boolean z, boolean z2) {
        float[] fArr;
        Object[] objArr = {uVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "427f2091ef44d12c86e9a1925472182d", RobustBitConfig.DEFAULT_VALUE)) {
            return (float[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "427f2091ef44d12c86e9a1925472182d");
        }
        com.dianping.video.log.c a2 = com.dianping.video.log.c.a();
        a2.a("TextureRotationUtil", "rotatoin = " + uVar + " ; flipHorizontal = " + z + " ; flipVertical = " + z2);
        switch (uVar) {
            case ROTATION_90:
                fArr = c;
                break;
            case ROTATION_180:
                fArr = d;
                break;
            case ROTATION_270:
                fArr = e;
                break;
            default:
                fArr = b;
                break;
        }
        if (z) {
            fArr = new float[]{a(fArr[0]), fArr[1], a(fArr[2]), fArr[3], a(fArr[4]), fArr[5], a(fArr[6]), fArr[7]};
        }
        return z2 ? new float[]{fArr[0], a(fArr[1]), fArr[2], a(fArr[3]), fArr[4], a(fArr[5]), fArr[6], a(fArr[7])} : fArr;
    }
}
