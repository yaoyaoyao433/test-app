package com.facebook.react.uimanager;

import android.view.View;
import android.view.ViewParent;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class ak {
    public static aj a(View view) {
        while (!(view instanceof aj)) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                return null;
            }
            com.facebook.infer.annotation.a.a(parent instanceof View);
            view = (View) parent;
        }
        return (aj) view;
    }
}
