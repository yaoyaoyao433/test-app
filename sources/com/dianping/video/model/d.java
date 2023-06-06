package com.dianping.video.model;

import com.dianping.video.videofilter.gpuimage.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d {
    public static ChangeQuickRedirect a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public a j;
    public u k;
    public String l;

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a16670064d850f31c72e4308fc6084df", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a16670064d850f31c72e4308fc6084df");
        }
        return "RenderStrategyModel{canvasWidth=" + this.b + ", canvasHeight=" + this.c + ", frameWidth=" + this.d + ", frameHeight=" + this.e + ", flipHorizonal=" + this.f + ", flipVertical=" + this.g + ", frameIsRotated=" + this.h + ", frameRotation=" + this.k + ", scaleType=" + this.j + '}';
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum a {
        CENTER_INSIDE,
        CENTER_CROP;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f124c0fab7cbd31b320dcc6d837ab69", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f124c0fab7cbd31b320dcc6d837ab69");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1c75c3a285eaa0ae7cfe7c8a5e9ca748", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1c75c3a285eaa0ae7cfe7c8a5e9ca748") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a6900784280ecf83bd411caecbf390a3", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a6900784280ecf83bd411caecbf390a3") : (a[]) values().clone();
        }
    }
}
