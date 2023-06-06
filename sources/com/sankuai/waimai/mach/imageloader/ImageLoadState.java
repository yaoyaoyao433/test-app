package com.sankuai.waimai.mach.imageloader;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.mach.c;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class ImageLoadState {
    public static ChangeQuickRedirect a;
    int b;
    c.a.C1000a c;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface State {
    }

    public ImageLoadState(c.a.C1000a c1000a) {
        Object[] objArr = {c1000a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfa5f95e5076e9d50b40cc04c23315e7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfa5f95e5076e9d50b40cc04c23315e7");
        } else {
            this.c = c1000a;
        }
    }
}
