package com.dianping.video.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public Class<? extends com.dianping.video.videofilter.gpuimage.f> b;
    public com.dianping.video.videofilter.gpuimage.f c;
    public float d;
    public String e;

    public c() {
    }

    public c(Class<? extends com.dianping.video.videofilter.gpuimage.f> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0221b021a01a51233b8133aba9c568f7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0221b021a01a51233b8133aba9c568f7");
        } else {
            this.b = cls;
        }
    }

    public final boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79ea57d5ffebb4534e244387ff8e6292", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79ea57d5ffebb4534e244387ff8e6292")).booleanValue();
        }
        if (obj == null) {
            return false;
        }
        c cVar = (c) obj;
        if (this.b != null && this.b == cVar.b && this.d == cVar.d && ((this.e == null && cVar.e == null) || this.e.equals(cVar.e))) {
            return true;
        }
        return this.c != null && this.c == cVar.c;
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc07862f2cb49df957b3c42d0f038ce4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc07862f2cb49df957b3c42d0f038ce4");
        }
        return "RenderFilterInfo{filterClass=" + this.b + ", gpuImageFilter=" + this.c + ", filterIntensity=" + this.d + ", filterId='" + this.e + "'}";
    }
}
