package com.meituan.msc.views.scroll;

import android.content.Context;
import android.widget.HorizontalScrollView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c extends com.meituan.msc.views.view.b {
    public static ChangeQuickRedirect a;
    private int h;
    private int i;

    public c(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99185088f0f458f363723b506e1191cb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99185088f0f458f363723b506e1191cb");
            return;
        }
        com.meituan.msc.jse.modules.i18nmanager.a.a();
        this.h = 0;
        this.i = 0;
    }

    @Override // com.meituan.msc.views.view.b, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f219b67b0819f202beb3677b30fee1c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f219b67b0819f202beb3677b30fee1c4");
            return;
        }
        if (this.h == 1) {
            setLeft(0);
            setRight((i3 - i) + 0);
            HorizontalScrollView horizontalScrollView = (HorizontalScrollView) getParent();
            horizontalScrollView.scrollTo((horizontalScrollView.getScrollX() + getWidth()) - this.i, horizontalScrollView.getScrollY());
        }
        this.i = getWidth();
    }
}
