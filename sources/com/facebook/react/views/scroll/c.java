package com.facebook.react.views.scroll;

import android.content.Context;
import android.widget.HorizontalScrollView;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c extends com.facebook.react.views.view.f {
    private int a;
    private int b;

    public c(Context context) {
        super(context);
        this.a = com.facebook.react.modules.i18nmanager.a.a().a(context) ? 1 : 0;
        this.b = 0;
    }

    @Override // com.facebook.react.views.view.f, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.a == 1) {
            setLeft(0);
            setRight((i3 - i) + 0);
            HorizontalScrollView horizontalScrollView = (HorizontalScrollView) getParent();
            horizontalScrollView.scrollTo((horizontalScrollView.getScrollX() + getWidth()) - this.b, horizontalScrollView.getScrollY());
        }
        this.b = getWidth();
    }
}
