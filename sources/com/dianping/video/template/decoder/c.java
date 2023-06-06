package com.dianping.video.template.decoder;

import android.graphics.Bitmap;
import com.dianping.video.videofilter.gpuimage.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c extends d {
    public static ChangeQuickRedirect a;
    private int j;
    private int k;

    @Override // com.dianping.video.template.decoder.d
    public final void a(long j) {
    }

    public c(String str, String str2) {
        super(str, str2);
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f2093bb863fc3d0b630c096b6438997", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f2093bb863fc3d0b630c096b6438997");
        }
    }

    public final void a(int i, int i2) {
        this.j = i;
        this.k = i2;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30f0513dc404cac7525d11ff5b010dbb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30f0513dc404cac7525d11ff5b010dbb");
        } else if (!com.dianping.video.util.c.a(this.c)) {
            throw new com.dianping.video.template.constant.a(-10001);
        } else {
            Bitmap a2 = com.dianping.video.util.a.a(this.c, this.j, this.k);
            if (a2 == null) {
                throw new com.dianping.video.template.constant.a(-10002);
            }
            if (this.i != null) {
                this.i.a(this.h, a2.getWidth(), a2.getHeight(), 0, 30, 0L);
            }
            this.d = s.a(a2, this.d);
        }
    }

    @Override // com.dianping.video.template.decoder.d
    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c96dea76280ed47ae885f6cdfc19dd5a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c96dea76280ed47ae885f6cdfc19dd5a")).booleanValue();
        }
        if (this.i != null) {
            this.i.a(this.h, this.d, 0L);
            return true;
        }
        return true;
    }

    @Override // com.dianping.video.template.decoder.d
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00ba49ea9b458c484a9400b751cc21cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00ba49ea9b458c484a9400b751cc21cf");
        } else {
            super.c();
        }
    }
}
