package com.meituan.android.yoda.fragment.face;

import com.meituan.android.facedetection.algo.FaceLivenessDet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class ai {
    public static ChangeQuickRedirect a;
    private static final ai c = new ai();
    FaceLivenessDet b;

    public static ai a() {
        return c;
    }

    public ai() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5a4e83a30ee19b094e4868a1e9f58d7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5a4e83a30ee19b094e4868a1e9f58d7");
        } else {
            this.b = new FaceLivenessDet();
        }
    }
}
