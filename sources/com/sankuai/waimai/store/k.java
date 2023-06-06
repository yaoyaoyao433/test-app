package com.sankuai.waimai.store;

import android.support.v4.app.Fragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class k extends com.meituan.android.cube.core.h {
    public static ChangeQuickRedirect h;

    public void a(boolean z) {
    }

    public k(Fragment fragment) {
        super(fragment);
        Object[] objArr = {fragment};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f44babe8cf311319b0e8b79f0e988c4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f44babe8cf311319b0e8b79f0e988c4");
        }
    }
}
