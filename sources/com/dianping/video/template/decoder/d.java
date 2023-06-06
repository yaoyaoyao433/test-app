package com.dianping.video.template.decoder;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.view.Surface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class d {
    public static ChangeQuickRedirect b;
    protected String c;
    protected int d;
    protected SurfaceTexture e;
    protected Surface f;
    protected boolean g;
    protected String h;
    protected a i;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
        void a(String str);

        void a(String str, int i, int i2, int i3, int i4, long j);

        void a(String str, int i, long j);
    }

    public abstract void a(long j);

    public abstract boolean b();

    public d(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bde80c7411bca90556494e36392d164a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bde80c7411bca90556494e36392d164a");
            return;
        }
        this.d = -1;
        this.c = str;
        this.h = str2;
    }

    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e05cf78487ee66966a1c0855c893d3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e05cf78487ee66966a1c0855c893d3b");
        } else if (this.g) {
        } else {
            this.g = true;
            GLES20.glDeleteTextures(1, new int[]{this.d}, 0);
        }
    }

    public final void a(a aVar) {
        this.i = aVar;
    }
}
