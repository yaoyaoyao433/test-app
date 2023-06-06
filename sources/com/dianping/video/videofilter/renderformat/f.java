package com.dianping.video.videofilter.renderformat;

import com.dianping.video.model.d;
import com.dianping.video.videofilter.gpuimage.u;
import com.dianping.video.videofilter.gpuimage.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.nio.FloatBuffer;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class f {
    public static ChangeQuickRedirect a;

    private static float a(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cfa1b07edeb07615dfe6c47219642853", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cfa1b07edeb07615dfe6c47219642853")).floatValue() : f == 0.0f ? f2 : 1.0f - f2;
    }

    public static void a(FloatBuffer floatBuffer, FloatBuffer floatBuffer2, com.dianping.video.model.d dVar, String str) {
        boolean z;
        float f;
        float f2;
        u uVar;
        float[] a2;
        float[] fArr;
        u uVar2;
        Object[] objArr = {floatBuffer, floatBuffer2, dVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "deae9ceae80fd92417181b2e0726c11c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "deae9ceae80fd92417181b2e0726c11c");
            return;
        }
        com.dianping.video.log.c.a().a("VideoRenderStrategyPresets", "updateCoordinates,tag = " + str + ", RenderStrategyModel = " + dVar.toString());
        float f3 = (float) dVar.b;
        float f4 = (float) dVar.c;
        int i = dVar.d;
        int i2 = dVar.e;
        if (dVar.k == u.ROTATION_270 || dVar.k == u.ROTATION_90) {
            f3 = dVar.c;
            f4 = dVar.b;
            z = true;
        } else {
            z = false;
        }
        if (dVar.h && (dVar.k == u.NORMAL || dVar.k == u.ROTATION_180)) {
            f3 = dVar.c;
            f4 = dVar.b;
            z = true;
        }
        float f5 = f3 / i;
        float f6 = f4 / i2;
        float max = Math.max(f5, f6);
        float round = Math.round(f * max) / f3;
        float round2 = Math.round(max * f2) / f4;
        float[] fArr2 = com.dianping.video.constant.a.a;
        if (com.dianping.video.constant.b.a) {
            if (!dVar.i || dVar.h) {
                uVar2 = u.NORMAL;
            } else {
                uVar2 = dVar.k;
            }
            a2 = v.a(uVar2, dVar.f, !dVar.i || dVar.g);
        } else {
            if (dVar.h) {
                uVar = u.NORMAL;
            } else {
                uVar = dVar.k;
            }
            a2 = v.a(uVar, dVar.f, dVar.g);
        }
        if (dVar.j == d.a.CENTER_CROP) {
            float f7 = (1.0f - (1.0f / round)) / 2.0f;
            float f8 = (1.0f - (1.0f / round2)) / 2.0f;
            if (!com.dianping.video.constant.b.a || !z || dVar.i) {
                f7 = f8;
                f8 = f7;
            }
            a2 = new float[]{a(a2[0], f8), a(a2[1], f7), a(a2[2], f8), a(a2[3], f7), a(a2[4], f8), a(a2[5], f7), a(a2[6], f8), a(a2[7], f7)};
            fArr = fArr2;
        } else {
            float min = Math.min(f5, f6);
            float round3 = Math.round(f * min) / f3;
            float round4 = Math.round(f2 * min) / f4;
            if (dVar.k != u.ROTATION_270 && dVar.k != u.ROTATION_90) {
                round3 = round4;
                round4 = round3;
            }
            fArr = new float[]{com.dianping.video.constant.a.a[0] * round4, com.dianping.video.constant.a.a[1] * round3, com.dianping.video.constant.a.a[2] * round4, com.dianping.video.constant.a.a[3] * round3, com.dianping.video.constant.a.a[4] * round4, com.dianping.video.constant.a.a[5] * round3, com.dianping.video.constant.a.a[6] * round4, com.dianping.video.constant.a.a[7] * round3};
        }
        floatBuffer.clear();
        floatBuffer2.clear();
        floatBuffer.put(fArr).position(0);
        floatBuffer2.put(a2).position(0);
    }

    public static void a(FloatBuffer floatBuffer, com.dianping.video.model.d dVar) {
        float f;
        float f2;
        u uVar;
        float[] fArr;
        Object[] objArr = {floatBuffer, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d2eed26dcc04d0719b5af2fe9eef7c74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d2eed26dcc04d0719b5af2fe9eef7c74");
            return;
        }
        float f3 = dVar.b;
        float f4 = dVar.c;
        int i = dVar.d;
        int i2 = dVar.e;
        if (dVar.k == u.ROTATION_270 || dVar.k == u.ROTATION_90) {
            f3 = dVar.c;
            f4 = dVar.b;
        }
        float f5 = f3 / 2.0f;
        float f6 = f4 / 2.0f;
        float max = Math.max(f5 / i, f6 / i2);
        float round = Math.round(f * max) / f5;
        float round2 = Math.round(f2 * max) / f6;
        if (dVar.h) {
            uVar = u.NORMAL;
        } else {
            uVar = dVar.k;
        }
        float[] a2 = v.a(uVar, dVar.f, dVar.g);
        if (dVar.j == d.a.CENTER_CROP) {
            float f7 = (1.0f - (1.0f / round)) / 2.0f;
            float f8 = (1.0f - (1.0f / round2)) / 2.0f;
            fArr = new float[]{a(a2[0], f7), a(a2[1], f8), a(a2[2], f7), a(a2[3], f8), a(a2[4], f7), a(a2[5], f8), a(a2[6], f7), a(a2[7], f8)};
        } else {
            fArr = a2;
        }
        floatBuffer.clear();
        floatBuffer.put(fArr).position(0);
    }

    public static void a(FloatBuffer floatBuffer, FloatBuffer floatBuffer2, FloatBuffer floatBuffer3, FloatBuffer floatBuffer4, com.dianping.video.model.d dVar) {
        float f;
        float f2;
        u uVar;
        u uVar2;
        Object[] objArr = {floatBuffer, floatBuffer2, floatBuffer3, floatBuffer4, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5bb7437af08cb31da2e2318a5a1337d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5bb7437af08cb31da2e2318a5a1337d3");
            return;
        }
        float f3 = dVar.b;
        float f4 = dVar.c;
        int i = dVar.d;
        int i2 = dVar.e;
        if (dVar.k == u.ROTATION_270 || dVar.k == u.ROTATION_90) {
            f3 = dVar.c;
            f4 = dVar.b;
        }
        float f5 = f3 / 2.0f;
        float max = Math.max(f5 / i, f4 / i2);
        float round = Math.round(f * max) / f5;
        float round2 = Math.round(f2 * max) / f4;
        float[] fArr = {-1.0f, -1.0f, 0.0f, -1.0f, -1.0f, 1.0f, 0.0f, 1.0f};
        floatBuffer.put(new float[]{fArr[0] / round2, fArr[1] / round, fArr[2] / round2, fArr[3] / round, fArr[4] / round2, fArr[5] / round, fArr[6] / round2, fArr[7] / round}).position(0);
        float[] fArr2 = {0.0f, -1.0f, 1.0f, -1.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        floatBuffer3.put(new float[]{fArr2[0] / round2, fArr2[1] / round, fArr2[2] / round2, fArr2[3] / round, fArr2[4] / round2, fArr2[5] / round, fArr2[6] / round2, fArr2[7] / round}).position(0);
        if (dVar.h) {
            uVar = u.NORMAL;
        } else {
            uVar = dVar.k;
        }
        floatBuffer2.put(v.a(uVar, dVar.f, dVar.g)).position(0);
        if (dVar.h) {
            uVar2 = u.NORMAL;
        } else {
            uVar2 = dVar.k;
        }
        floatBuffer4.put(v.a(uVar2, dVar.f, !dVar.g)).position(0);
    }

    public static void b(FloatBuffer floatBuffer, FloatBuffer floatBuffer2, FloatBuffer floatBuffer3, FloatBuffer floatBuffer4, com.dianping.video.model.d dVar) {
        float f;
        float f2;
        u uVar;
        float[] fArr;
        Object[] objArr = {floatBuffer, floatBuffer2, floatBuffer3, floatBuffer4, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "07c38a362722e7ee198a0293e0998447", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "07c38a362722e7ee198a0293e0998447");
            return;
        }
        float f3 = dVar.b;
        float f4 = dVar.c;
        int i = dVar.d;
        int i2 = dVar.e;
        if (dVar.k == u.ROTATION_270 || dVar.k == u.ROTATION_90) {
            f3 = dVar.c;
            f4 = dVar.b;
        }
        float max = Math.max(f3 / i, f4 / i2);
        float round = Math.round(f * max) / f3;
        float round2 = Math.round(f2 * max) / f4;
        float[] fArr2 = com.dianping.video.constant.a.a;
        if (dVar.h) {
            uVar = u.NORMAL;
        } else {
            uVar = dVar.k;
        }
        float[] a2 = v.a(uVar, dVar.f, dVar.g);
        if (dVar.j == d.a.CENTER_CROP) {
            float f5 = (1.0f - (1.0f / round)) / 2.0f;
            float f6 = (1.0f - (1.0f / round2)) / 2.0f;
            fArr = new float[]{a(a2[0], f5), a(a2[1], f6), a(a2[2], f5), a(a2[3], f6), a(a2[4], f5), a(a2[5], f6), a(a2[6], f5), a(a2[7], f6)};
        } else {
            fArr2 = new float[]{com.dianping.video.constant.a.a[0] / round2, com.dianping.video.constant.a.a[1] / round, com.dianping.video.constant.a.a[2] / round2, com.dianping.video.constant.a.a[3] / round, com.dianping.video.constant.a.a[4] / round2, com.dianping.video.constant.a.a[5] / round, com.dianping.video.constant.a.a[6] / round2, com.dianping.video.constant.a.a[7] / round};
            fArr = a2;
        }
        floatBuffer.put(fArr2).position(0);
        floatBuffer2.put(fArr).position(0);
        for (int i3 = 0; i3 < fArr2.length; i3++) {
            fArr2[i3] = fArr2[i3] / 2.0f;
            fArr[i3] = fArr[i3] / 2.0f;
        }
        floatBuffer3.put(fArr2).position(0);
        floatBuffer4.put(fArr).position(0);
    }
}
