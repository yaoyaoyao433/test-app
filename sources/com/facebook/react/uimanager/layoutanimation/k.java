package com.facebook.react.uimanager.layoutanimation;

import android.support.annotation.Nullable;
import android.view.View;
import android.view.animation.Animation;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class k extends a {
    @Override // com.facebook.react.uimanager.layoutanimation.a
    final boolean a() {
        return this.b > 0;
    }

    @Override // com.facebook.react.uimanager.layoutanimation.a
    @Nullable
    final Animation a(View view, int i, int i2, int i3, int i4) {
        boolean z = false;
        boolean z2 = (view.getX() == ((float) i) && view.getY() == ((float) i2)) ? false : true;
        z = (view.getWidth() == i3 && view.getHeight() == i4) ? true : true;
        if (z2 || z) {
            return new m(view, i, i2, i3, i4);
        }
        return null;
    }
}
