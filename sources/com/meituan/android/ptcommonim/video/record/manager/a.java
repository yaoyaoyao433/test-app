package com.meituan.android.ptcommonim.video.record.manager;

import android.os.Handler;
import android.os.Looper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtlive.ugc.library.MTUgcView;
import com.sankuai.meituan.mtlive.ugc.library.c;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public com.sankuai.meituan.mtlive.ugc.library.interfaces.b b;
    public com.meituan.android.ptcommonim.video.record.listener.a c;
    public volatile int d;
    public volatile int e;
    public boolean f;
    private final Handler g;

    private int d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d13d4a17a5ae319b0df1679180175dee", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d13d4a17a5ae319b0df1679180175dee")).intValue();
        }
        if (i != 0) {
            if (i != 90) {
                if (i != 180) {
                    return i != 270 ? 1 : 2;
                }
                return 3;
            }
            return 0;
        }
        return 1;
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d5a067fe0254312ad3fe33447d9e905", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d5a067fe0254312ad3fe33447d9e905");
            return;
        }
        this.g = new Handler(Looper.getMainLooper());
        this.d = 0;
        this.e = 0;
        this.f = false;
    }

    public final boolean a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a84b03a0f010da1ef7cee11734065a8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a84b03a0f010da1ef7cee11734065a8")).booleanValue();
        }
        if (this.f) {
            return this.b.b(z);
        }
        return false;
    }

    public final boolean b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67e02305221db5c8eae4fa9f8456c1bd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67e02305221db5c8eae4fa9f8456c1bd")).booleanValue();
        }
        if (this.f) {
            return this.b.a(z);
        }
        return false;
    }

    public final void a(c.d dVar, MTUgcView mTUgcView) {
        Object[] objArr = {dVar, mTUgcView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1f769f5c2cb7e91214942e8b6b5ee27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1f769f5c2cb7e91214942e8b6b5ee27");
        } else if (this.b == null || this.f) {
        } else {
            if (this.b.a(dVar, mTUgcView) == 0) {
                this.f = true;
            } else {
                c(-1);
            }
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2c558e8bce1aebbe59504fa4873eec2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2c558e8bce1aebbe59504fa4873eec2");
        } else if (this.b == null || this.d != 1 || this.e == 2) {
        } else {
            this.e = 2;
            this.b.e();
            c(2);
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "717683a893994330e2e62de810e881a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "717683a893994330e2e62de810e881a6");
            return;
        }
        if (this.b != null && this.b.b() != null) {
            this.b.b().d();
        }
        c(0);
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ce9baaceb0a65fa0594112a02022d62", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ce9baaceb0a65fa0594112a02022d62");
        } else if (this.b != null) {
            this.b.b(d(i));
        }
    }

    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "750f67629a52a5df9fc2822a2562e790", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "750f67629a52a5df9fc2822a2562e790");
        } else if (this.b != null) {
            this.b.c(i);
        }
    }

    public void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5af168fa27ebd4b931b1a76cd6c09776", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5af168fa27ebd4b931b1a76cd6c09776");
        } else {
            a(i, true);
        }
    }

    public void a(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cdffd96d4156a3f5c7093422891eecc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cdffd96d4156a3f5c7093422891eecc");
        } else {
            a(i, z, false);
        }
    }

    public void a(int i, boolean z, boolean z2) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5a0ff3ad26f5c8676d86eef76f69c99", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5a0ff3ad26f5c8676d86eef76f69c99");
            return;
        }
        this.e = i;
        this.d = i;
        if (z) {
            b(i, z2);
        }
    }

    private void b(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef0111cc6699e41ea8deceb5cad7a9dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef0111cc6699e41ea8deceb5cad7a9dc");
        } else if (z) {
            if (this.c != null) {
                this.c.a(i);
            }
        } else {
            this.g.post(c.a(this, i));
        }
    }
}
