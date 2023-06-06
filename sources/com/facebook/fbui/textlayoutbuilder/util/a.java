package com.facebook.fbui.textlayoutbuilder.util;

import android.text.Layout;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public static int a(Layout layout) {
        if (layout == null) {
            return 0;
        }
        int lineCount = layout.getLineCount();
        int i = 0;
        for (int i2 = 0; i2 < lineCount; i2++) {
            i = Math.max(i, (int) layout.getLineRight(i2));
        }
        return i;
    }
}
