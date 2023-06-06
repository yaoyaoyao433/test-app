package com.sankuai.meituan.animplayer;

import android.opengl.GLES20;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class h {
    public static ChangeQuickRedirect a;
    final float[] b;
    private final FloatBuffer c;

    public h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b38765a2db291eb802dc73c23aa3ba9a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b38765a2db291eb802dc73c23aa3ba9a");
            return;
        }
        this.b = new float[8];
        this.c = ByteBuffer.allocateDirect(this.b.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(this.b);
    }

    public h(float[] fArr) {
        Object[] objArr = {fArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1bece3d187b82b1de8564b3777cfd58d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1bece3d187b82b1de8564b3777cfd58d");
            return;
        }
        this.b = fArr;
        this.c = ByteBuffer.allocateDirect(this.b.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr);
    }

    public final void a(float[] fArr) {
        Object[] objArr = {fArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0cd768dadbc3e55abbf998c0a3f3c32e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0cd768dadbc3e55abbf998c0a3f3c32e");
            return;
        }
        this.c.position(0);
        this.c.put(fArr);
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7e10e62c38de14e304bb6d7c3a686c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7e10e62c38de14e304bb6d7c3a686c7");
            return;
        }
        this.c.position(0);
        GLES20.glVertexAttribPointer(i, 2, 5126, false, 0, (Buffer) this.c);
        GLES20.glEnableVertexAttribArray(i);
    }
}
