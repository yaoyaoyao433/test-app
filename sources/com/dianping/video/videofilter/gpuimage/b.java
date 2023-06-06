package com.dianping.video.videofilter.gpuimage;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.constants.PushConstants;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public final l b;
    public f c;
    public Bitmap d;
    public a e;
    private final Context f;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum a {
        CENTER_INSIDE,
        CENTER_CROP;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a0855d4f0d3ebd59c4442805428e542", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a0855d4f0d3ebd59c4442805428e542");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "64d7dc92ebdfa31a17109e1d07bf1315", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "64d7dc92ebdfa31a17109e1d07bf1315") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4c8a88206ef11ba658f814cddf840eeb", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4c8a88206ef11ba658f814cddf840eeb") : (a[]) values().clone();
        }
    }

    public b(Context context) {
        boolean z = true;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ce69b1e4e96ebab305fbdda786fdff7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ce69b1e4e96ebab305fbdda786fdff7");
            return;
        }
        this.e = a.CENTER_CROP;
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "caa2c843bb7b0b148aa4658c513a7fa8", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "caa2c843bb7b0b148aa4658c513a7fa8")).booleanValue();
        } else if (((ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getDeviceConfigurationInfo().reqGlEsVersion < 131072) {
            z = false;
        }
        if (!z) {
            throw new IllegalStateException("OpenGL ES 2.0 is not supported on this phone.");
        }
        this.f = context;
        this.c = new f();
        this.b = new l(this.c);
    }
}
