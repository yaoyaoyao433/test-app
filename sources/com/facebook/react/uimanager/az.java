package com.facebook.react.uimanager;

import android.view.View;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class az extends ay {
    public final WeakReference<View> d;

    public az(View view, int i) {
        super(view.getId(), i);
        this.d = new WeakReference<>(view);
    }
}
