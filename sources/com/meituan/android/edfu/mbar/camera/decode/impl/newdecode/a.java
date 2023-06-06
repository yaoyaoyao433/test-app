package com.meituan.android.edfu.mbar.camera.decode.impl.newdecode;

import com.meituan.android.edfu.edfucamera.argorithm.e;
import com.meituan.android.edfu.mbar.camera.decode.impl.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class a {
    public static ChangeQuickRedirect a;
    private static a c;
    public f b;

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "79f73273564675bc1c433756af764ef2", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "79f73273564675bc1c433756af764ef2");
        }
        if (c == null) {
            synchronized (a.class) {
                if (c == null) {
                    c = new a();
                }
            }
        }
        return c;
    }

    public final String a(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b04c1b7fb0e8255e45690da9800bd6d0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b04c1b7fb0e8255e45690da9800bd6d0");
        }
        if (this.b == null) {
            this.b = new f();
        }
        return this.b.a(eVar);
    }

    public final float[] b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ce867c2a2bc5362ab403917f4f8030c", RobustBitConfig.DEFAULT_VALUE)) {
            return (float[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ce867c2a2bc5362ab403917f4f8030c");
        }
        if (this.b != null) {
            return this.b.a();
        }
        return null;
    }
}
