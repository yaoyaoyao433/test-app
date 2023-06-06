package com.dianping.video.videofilter.gpuimage;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.nio.FloatBuffer;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d extends f {
    public static ChangeQuickRedirect a;
    public float[] b;
    public FloatBuffer c;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c36b0312d2a5a4392e00e739138f0254", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c36b0312d2a5a4392e00e739138f0254");
            return;
        }
        this.b = new float[]{0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        this.c = null;
    }

    @Override // com.dianping.video.videofilter.gpuimage.f
    public final void a(int i, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        Object[] objArr = {Integer.valueOf(i), floatBuffer, floatBuffer2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f289fe8a08546a0da431bd79a66b40b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f289fe8a08546a0da431bd79a66b40b7");
        } else if (this.c != null) {
            super.a(i, floatBuffer, this.c);
        } else {
            super.a(i, floatBuffer, floatBuffer2);
        }
    }
}
