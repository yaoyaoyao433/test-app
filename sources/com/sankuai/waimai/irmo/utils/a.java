package com.sankuai.waimai.irmo.utils;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public float b;
    public float c;
    public float d;
    public int e;
    public int f;
    public int g;
    public float[] h;
    public boolean i;
    public Paint j;
    public Path k;
    public RectF l;
    public Bitmap m;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b58eebfb7966aa1c1092118502ac4ed2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b58eebfb7966aa1c1092118502ac4ed2");
            return;
        }
        this.h = new float[8];
        this.j = new Paint();
        this.j.setAntiAlias(true);
    }

    public final void a(float f) {
        Object[] objArr = {Float.valueOf(20.0f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43f8df8debc37445aad7d9a423c77426", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43f8df8debc37445aad7d9a423c77426");
            return;
        }
        for (int i = 0; i < 8; i++) {
            this.h[i] = 20.0f;
        }
    }
}
