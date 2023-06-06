package com.facebook.react.uimanager;

import android.support.annotation.Nullable;
import android.view.View;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class i extends JSApplicationCausedNativeException {
    @Nullable
    private View a;

    public i(String str) {
        super(str);
    }

    public i(String str, @Nullable View view, Throwable th) {
        super(str, th);
        this.a = view;
    }
}
