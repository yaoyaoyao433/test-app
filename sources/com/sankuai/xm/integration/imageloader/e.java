package com.sankuai.xm.integration.imageloader;

import android.net.Uri;
import android.support.annotation.DrawableRes;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.integration.imageloader.shape.ImageShape;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class e {
    public static ChangeQuickRedirect a;
    private Uri b;
    private c c;

    public e(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3fe0e89100e506960b681f78999a4ce3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3fe0e89100e506960b681f78999a4ce3");
            return;
        }
        this.b = uri;
        this.c = new c();
        this.c.a = this.b;
    }

    public final e a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "368ef06869c186ded32e95bf9d05ddc8", 6917529027641081856L)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "368ef06869c186ded32e95bf9d05ddc8");
        }
        if (i < 0) {
            i = -1;
        }
        if (i2 < 0) {
            i2 = -1;
        }
        this.c.b = i;
        this.c.c = i2;
        return this;
    }

    public final e a(int i) {
        this.c.d = i;
        return this;
    }

    public final e a(ImageShape imageShape) {
        this.c.e = imageShape;
        return this;
    }

    public final e b(@DrawableRes int i) {
        this.c.f = i;
        return this;
    }

    public final e c(@DrawableRes int i) {
        this.c.g = i;
        return this;
    }

    public final a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "209d9d06682767f71d10fd70c7b089b5", 6917529027641081856L) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "209d9d06682767f71d10fd70c7b089b5") : new a(this.c);
    }

    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "693c4abe8a4674e2f9212a755c9958b0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "693c4abe8a4674e2f9212a755c9958b0");
        } else {
            new d(this.c).a(view);
        }
    }
}
