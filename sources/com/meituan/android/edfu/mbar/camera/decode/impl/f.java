package com.meituan.android.edfu.mbar.camera.decode.impl;

import android.util.Log;
import com.meituan.android.edfu.mbar.jni.JNIMbarDetect;
import com.meituan.android.edfu.mbar.util.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class f {
    public static ChangeQuickRedirect a;
    public int b;
    public boolean c;
    public boolean d;
    private String e;
    private long f;
    private int g;

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c7dcccf2188456cbf1f2973674583b1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c7dcccf2188456cbf1f2973674583b1");
            return;
        }
        this.e = f.class.getSimpleName();
        this.b = -2;
        this.f = 0L;
        this.c = false;
        this.d = false;
        this.g = 0;
    }

    public final synchronized String a(com.meituan.android.edfu.edfucamera.argorithm.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f3cfe3864de08f8a4298609ea7857ba", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f3cfe3864de08f8a4298609ea7857ba");
        }
        if (this.f == 0 ? com.meituan.android.edfu.mbar.util.g.a() : false) {
            this.f = JNIMbarDetect.objInit();
        }
        if (this.b != 0) {
            this.b = JNIMbarDetect.loadModel(this.f, com.meituan.android.edfu.mbar.util.g.b);
        }
        if (this.f != 0) {
            new StringBuilder("相册扫码 ").append(this.b);
            String detect = JNIMbarDetect.detect(this.f, eVar.f, eVar.b, eVar.c, eVar.d, eVar.e, eVar.i, eVar.j);
            new StringBuilder("edfu mbar android decoder:").append(detect);
            return detect;
        }
        return null;
    }

    public final float[] a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f715ff4c186cd7f768d7ea12abf10d4e", RobustBitConfig.DEFAULT_VALUE)) {
            return (float[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f715ff4c186cd7f768d7ea12abf10d4e");
        }
        if (this.f != 0) {
            try {
                return JNIMbarDetect.getDetectResult(this.f);
            } catch (Throwable th) {
                Log.e(this.e, th.toString());
                m.a().a("detector", th.getMessage());
                return null;
            }
        }
        return null;
    }
}
