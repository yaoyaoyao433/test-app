package com.dianping.video.template.render;

import com.dianping.video.videofilter.gpuimage.u;
import com.dianping.video.videofilter.gpuimage.v;
import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class c {
    public static ChangeQuickRedirect a;
    public int b;
    public int c;
    public com.dianping.video.videofilter.template.b d;
    public com.dianping.video.template.model.material.extra.c e;
    public com.dianping.video.template.render.model.c f;
    public ArrayList<JsonObject> g;
    public ArrayList<JsonObject> h;
    private FloatBuffer i;
    private FloatBuffer j;

    public c(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "562cdffc83aac11116bb48cd63b73e8e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "562cdffc83aac11116bb48cd63b73e8e");
            return;
        }
        this.g = new ArrayList<>();
        this.h = new ArrayList<>();
        this.b = i;
        this.c = i2;
        float[] a2 = v.a(u.NORMAL, false, true);
        this.j = ByteBuffer.allocateDirect(a2.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.j.put(a2).position(0);
        this.i = ByteBuffer.allocateDirect(com.dianping.video.template.utils.b.a.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.i.put(com.dianping.video.template.utils.b.a).position(0);
    }

    public final int a(long j, int i, int i2) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e617623af62bce05bd042607bd3d8cf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e617623af62bce05bd042607bd3d8cf")).intValue();
        }
        if (i2 == -1 || this.d == null) {
            return i;
        }
        com.dianping.video.videofilter.template.b bVar = this.d;
        Object[] objArr2 = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = com.dianping.video.videofilter.template.a.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "a03d405ccaa461a784dc41f6a0ab5d53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "a03d405ccaa461a784dc41f6a0ab5d53");
        } else {
            if (bVar.b == null) {
                bVar.b = new ArrayList();
            }
            bVar.b.add(Integer.valueOf(i2));
        }
        float f = (((float) (j - ((this.f.l.c + (this.f.l.d - this.e.a)) * 1000))) * 1.0f) / (this.e.a * 1000);
        com.dianping.codelog.b.a(c.class, "draw", "now progress = " + f);
        if (this.g != null) {
            for (int i3 = 0; i3 < this.g.size(); i3++) {
                com.dianping.video.template.utils.c.a(this.d, this.g.get(i3), f);
            }
        }
        this.d.a(i, this.i, this.j);
        return this.d.i();
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ca81374161a75005cb1c09169cee2d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ca81374161a75005cb1c09169cee2d3");
        } else if (this.d == null) {
        } else {
            this.d.d();
            this.d = null;
            this.e = null;
            this.f = null;
        }
    }
}
