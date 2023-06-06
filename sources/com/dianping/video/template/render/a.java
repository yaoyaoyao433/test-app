package com.dianping.video.template.render;

import com.dianping.video.videofilter.gpuimage.u;
import com.dianping.video.videofilter.gpuimage.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public com.dianping.video.template.render.model.a b;
    public FloatBuffer c;
    public FloatBuffer d;
    public com.dianping.video.videofilter.template.c e;
    private int f;
    private int g;

    public a(com.dianping.video.template.render.model.a aVar, int i, int i2) {
        Object[] objArr = {aVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "919eeff5b47d87d0db788e8dc0e03c86", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "919eeff5b47d87d0db788e8dc0e03c86");
            return;
        }
        this.b = aVar;
        this.f = i;
        this.g = i2;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ee72465522a31c0ff8a4eeee1f348a19", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ee72465522a31c0ff8a4eeee1f348a19");
            return;
        }
        float[] a2 = v.a(u.NORMAL, false, true);
        this.d = ByteBuffer.allocateDirect(a2.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.d.put(a2).position(0);
        this.c = ByteBuffer.allocateDirect(com.dianping.video.template.utils.b.a.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.c.put(com.dianping.video.template.utils.b.a).position(0);
        this.e = new com.dianping.video.videofilter.template.c();
        this.e.b();
        this.e.a(true);
        this.e.a(this.f, this.g);
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ddd98732a9a0b6252378825e558b5a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ddd98732a9a0b6252378825e558b5a5");
        } else if (this.e != null) {
            this.e.d();
            this.e = null;
        }
    }
}
