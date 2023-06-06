package com.meituan.android.ptcommonim.pageadapter.event;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a extends b {
    public static ChangeQuickRedirect a;
    private final String c;

    public a(String str) {
        super("pt_im_click_jump");
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d39d177d6b21b8260a3113b1713cb863", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d39d177d6b21b8260a3113b1713cb863");
        } else {
            this.c = str;
        }
    }
}
