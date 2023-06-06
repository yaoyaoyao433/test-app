package com.dianping.video.videofilter.gpuimage;

import android.opengl.GLES20;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class j extends q {
    public static ChangeQuickRedirect a;
    private int u;
    private float v;

    public j(String str) {
        this(str, 1.0f);
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e19589981546b5724292381c32bac47", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e19589981546b5724292381c32bac47");
        }
    }

    private j(String str, float f) {
        super(str);
        Object[] objArr = {str, Float.valueOf(1.0f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86b9ee62355bc33b11fb52463611a2a9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86b9ee62355bc33b11fb52463611a2a9");
        } else {
            this.v = 1.0f;
        }
    }

    @Override // com.dianping.video.videofilter.gpuimage.q, com.dianping.video.videofilter.gpuimage.f
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b32d7715f3cee862664a1315aea83704", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b32d7715f3cee862664a1315aea83704");
            return;
        }
        super.a();
        this.u = GLES20.glGetUniformLocation(h(), "mixturePercent");
    }

    @Override // com.dianping.video.videofilter.gpuimage.f
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e40ca593cbf28044865308421d3e1ee5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e40ca593cbf28044865308421d3e1ee5");
            return;
        }
        super.c();
        a(this.v);
    }

    public final void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6466a0fa024f92b6a5a113cfe0010eef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6466a0fa024f92b6a5a113cfe0010eef");
            return;
        }
        this.v = f;
        a(this.u, this.v);
    }
}
