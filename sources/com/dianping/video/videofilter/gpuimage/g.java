package com.dianping.video.videofilter.gpuimage;

import android.annotation.SuppressLint;
import android.opengl.GLES20;
import com.dianping.titans.service.FileUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class g extends f {
    public static ChangeQuickRedirect a;
    protected List<f> b;
    protected List<f> c;
    private int[] q;
    private int[] r;
    private int[] s;
    private int[] t;
    private final FloatBuffer u;
    private final FloatBuffer v;
    private final FloatBuffer w;

    public g() {
        this(null);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b67857bc2b83409c3b389cde3978658", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b67857bc2b83409c3b389cde3978658");
        }
    }

    private g(List<f> list) {
        Object[] objArr = {null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f061bcd5162bc756a1e6ab3387fa6d3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f061bcd5162bc756a1e6ab3387fa6d3");
            return;
        }
        this.b = null;
        if (this.b == null) {
            this.b = new ArrayList();
        } else {
            k();
        }
        this.u = ByteBuffer.allocateDirect(a.a.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.u.put(a.a).position(0);
        this.v = ByteBuffer.allocateDirect(v.b.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.v.put(v.b).position(0);
        float[] a2 = v.a(u.NORMAL, false, true);
        this.w = ByteBuffer.allocateDirect(a2.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.w.put(a2).position(0);
    }

    public final void a(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99be28d9dd828a6ca3000c03d95f06fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99be28d9dd828a6ca3000c03d95f06fb");
        } else if (fVar != null) {
            this.b.add(fVar);
            k();
            if (e) {
                new StringBuilder(" add filter=").append(fVar.getClass().getSimpleName());
                StringBuilder sb = new StringBuilder();
                sb.append("mFilters = ");
                for (f fVar2 : this.b) {
                    sb.append(fVar2.getClass().getSimpleName());
                    sb.append(StringUtil.SPACE);
                }
                new StringBuilder(StringUtil.SPACE).append(sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append("mMergedFilters = ");
                for (f fVar3 : this.c) {
                    sb2.append(fVar3.getClass().getSimpleName());
                    sb2.append(StringUtil.SPACE);
                }
                new StringBuilder(StringUtil.SPACE).append(sb2.toString());
            }
        }
    }

    @Override // com.dianping.video.videofilter.gpuimage.f
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5f4c17623739d008aeddcdc25f49635", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5f4c17623739d008aeddcdc25f49635");
            return;
        }
        super.a();
        for (f fVar : this.b) {
            fVar.b();
        }
    }

    @Override // com.dianping.video.videofilter.gpuimage.f
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5bf880d252891e0a977bc0fa763d9d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5bf880d252891e0a977bc0fa763d9d4");
            return;
        }
        j();
        for (f fVar : this.b) {
            fVar.d();
        }
        super.e();
    }

    private void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a312ec82c8fe52e3b1b35cc405b039c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a312ec82c8fe52e3b1b35cc405b039c0");
            return;
        }
        if (this.r != null) {
            GLES20.glDeleteTextures(this.r.length, this.r, 0);
            this.r = null;
        }
        if (this.q != null) {
            GLES20.glDeleteFramebuffers(this.q.length, this.q, 0);
            this.q = null;
        }
        if (this.t != null) {
            GLES20.glDeleteTextures(this.t.length, this.t, 0);
            this.t = null;
        }
        if (this.s != null) {
            GLES20.glDeleteFramebuffers(this.s.length, this.s, 0);
            this.s = null;
        }
    }

    @Override // com.dianping.video.videofilter.gpuimage.f
    public final void a(int i, int i2) {
        int i3 = 1;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc13b75a018735f0a205228433896ba6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc13b75a018735f0a205228433896ba6");
            return;
        }
        super.a(i, i2);
        if (this.q != null) {
            j();
        }
        int size = this.b.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.b.get(i4).a(i, i2);
        }
        if (this.c == null || this.c.size() <= 0) {
            return;
        }
        int size2 = this.c.size() - 1;
        this.q = new int[size2];
        this.r = new int[size2];
        this.s = new int[1];
        this.t = new int[1];
        int i5 = 0;
        while (i5 < size2) {
            try {
                GLES20.glGenFramebuffers(i3, this.q, i5);
                GLES20.glGenTextures(i3, this.r, i5);
                GLES20.glBindTexture(3553, this.r[i5]);
                GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
                GLES20.glTexParameterf(3553, FileUtil.DEFAULT_STREAM_BUFFER_SIZE, 9729.0f);
                GLES20.glTexParameterf(3553, 10241, 9729.0f);
                GLES20.glTexParameterf(3553, 10242, 33071.0f);
                GLES20.glTexParameterf(3553, 10243, 33071.0f);
                GLES20.glBindFramebuffer(36160, this.q[i5]);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.r[i5], 0);
                GLES20.glBindTexture(3553, 0);
                GLES20.glBindFramebuffer(36160, 0);
                i5++;
                i3 = 1;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        GLES20.glGenFramebuffers(1, this.s, 0);
        GLES20.glGenTextures(1, this.t, 0);
        GLES20.glBindTexture(3553, this.t[0]);
        GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
        GLES20.glTexParameterf(3553, FileUtil.DEFAULT_STREAM_BUFFER_SIZE, 9729.0f);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        GLES20.glBindFramebuffer(36160, this.s[0]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.t[0], 0);
        GLES20.glBindTexture(3553, 0);
        GLES20.glBindFramebuffer(36160, 0);
    }

    @Override // com.dianping.video.videofilter.gpuimage.f
    @SuppressLint({"WrongCall"})
    public final void a(int i, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        Object[] objArr = {Integer.valueOf(i), floatBuffer, floatBuffer2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e9a6a78aba3fefdd8bca5e99fb5dc4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e9a6a78aba3fefdd8bca5e99fb5dc4e");
            return;
        }
        g();
        if (!this.p || this.q == null || this.r == null) {
            return;
        }
        try {
            if (this.c != null) {
                int size = this.c.size();
                int i2 = i;
                int i3 = 0;
                while (i3 < size) {
                    f fVar = this.c.get(i3);
                    int i4 = size - 1;
                    boolean z = i3 < i4;
                    if (z) {
                        GLES20.glBindFramebuffer(36160, this.q[i3]);
                        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if (i3 == 0) {
                        fVar.a(i2, floatBuffer, floatBuffer2);
                    } else if (i3 == i4) {
                        fVar.a(i2, this.u, size % 2 == 0 ? this.w : this.v);
                    } else {
                        fVar.a(i2, this.u, this.v);
                    }
                    if (z) {
                        GLES20.glBindFramebuffer(36160, 0);
                        i2 = this.r[i3];
                    }
                    i3++;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void a(int i, FloatBuffer floatBuffer, FloatBuffer floatBuffer2, List<Integer> list) {
        Object[] objArr = {Integer.valueOf(i), floatBuffer, floatBuffer2, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac8c5ad6aba0dbf8482a8a23134e691d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac8c5ad6aba0dbf8482a8a23134e691d");
            return;
        }
        g();
        if (!this.p || this.q == null || this.r == null) {
            return;
        }
        try {
            if (this.c != null) {
                int size = list.size();
                int i2 = i;
                int i3 = 0;
                while (i3 < size) {
                    f fVar = this.c.get(list.get(i3).intValue());
                    int i4 = size - 1;
                    boolean z = i3 < i4;
                    if (z) {
                        GLES20.glBindFramebuffer(36160, this.q[list.get(i3).intValue()]);
                        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if (i3 == 0) {
                        fVar.a(i2, this.u, floatBuffer2);
                    } else if (i3 == i4) {
                        fVar.a(i2, floatBuffer, size % 2 == 0 ? this.w : this.v);
                    } else {
                        fVar.a(i2, this.u, this.v);
                    }
                    if (z) {
                        GLES20.glBindFramebuffer(36160, 0);
                        i2 = this.r[list.get(i3).intValue()];
                    }
                    i3++;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void a(int i, FloatBuffer floatBuffer, FloatBuffer floatBuffer2, List<Integer> list, boolean z) {
        Object[] objArr = {Integer.valueOf(i), floatBuffer, floatBuffer2, list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87480ba27767c0c2370363ab13ec299e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87480ba27767c0c2370363ab13ec299e");
            return;
        }
        g();
        if (!this.p || this.q == null || this.r == null) {
            return;
        }
        try {
            if (this.c != null) {
                int size = list.size();
                int i2 = i;
                int i3 = 0;
                while (i3 < size) {
                    f fVar = this.c.get(list.get(i3).intValue());
                    int i4 = size - 1;
                    boolean z2 = i3 < i4;
                    if (z2) {
                        GLES20.glBindFramebuffer(36160, this.q[list.get(i3).intValue()]);
                        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        GLES20.glBindFramebuffer(36160, this.s[0]);
                        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    if (i3 == 0 && i3 == i4) {
                        fVar.a(i2, floatBuffer, floatBuffer2);
                    } else if (i3 == 0) {
                        fVar.a(i2, this.u, floatBuffer2);
                    } else if (i3 == i4) {
                        fVar.a(i2, floatBuffer, size % 2 == 0 ? this.w : this.v);
                    } else {
                        fVar.a(i2, this.u, this.v);
                    }
                    if (z2) {
                        GLES20.glBindFramebuffer(36160, 0);
                        i2 = this.r[list.get(i3).intValue()];
                    } else {
                        GLES20.glBindFramebuffer(36160, 0);
                    }
                    i3++;
                }
                if (z) {
                    this.c.get(this.c.size() - 1).a(this.t[0], this.u, this.w);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final List<f> i() {
        return this.b;
    }

    private void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3a0c3ecc035f77286fb67be096f6c81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3a0c3ecc035f77286fb67be096f6c81");
        } else if (this.b != null) {
            if (this.c == null) {
                this.c = new ArrayList();
            } else {
                this.c.clear();
            }
            for (f fVar : this.b) {
                if (fVar instanceof g) {
                    g gVar = (g) fVar;
                    gVar.k();
                    List<f> list = gVar.c;
                    if (list != null && !list.isEmpty()) {
                        this.c.addAll(list);
                    }
                } else {
                    this.c.add(fVar);
                }
            }
        }
    }
}
