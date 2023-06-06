package com.dianping.video.videofilter.gpuimage;

import android.opengl.GLES20;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.nio.FloatBuffer;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class r extends f {
    public static ChangeQuickRedirect a;
    public FloatBuffer b;
    public FloatBuffer c;
    public int q;
    public float r;
    public float s;

    public r(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1af214dda983748d3c2fec155e03ea13", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1af214dda983748d3c2fec155e03ea13");
            return;
        }
        this.q = -1;
        this.s = f2;
        this.r = f;
    }

    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "370554eaa9e2fef138415f25f75da945", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "370554eaa9e2fef138415f25f75da945");
            return;
        }
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(1, 771);
        super.a(this.q, this.b, this.c);
        GLES20.glDisable(3042);
    }
}
