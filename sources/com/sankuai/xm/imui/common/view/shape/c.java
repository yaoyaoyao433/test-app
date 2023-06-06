package com.sankuai.xm.imui.common.view.shape;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class c {
    public static ChangeQuickRedirect a;
    a b;
    final Paint c;
    final RectF d;
    private final View e;

    public c(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a04c1baaeb2d7e2d239d77d20e1d6927", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a04c1baaeb2d7e2d239d77d20e1d6927");
            return;
        }
        this.d = new RectF();
        this.e = view;
        this.c = new Paint();
        this.c.setAntiAlias(true);
        this.c.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
    }
}
