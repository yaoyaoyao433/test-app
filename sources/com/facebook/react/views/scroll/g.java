package com.facebook.react.views.scroll;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.au;
import com.meituan.metrics.sampler.fps.FpsEvent;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class g {
    public static void a(ViewGroup viewGroup, float f, float f2) {
        a(viewGroup, i.SCROLL, f, f2);
    }

    public static void a(ViewGroup viewGroup) {
        a(viewGroup, i.BEGIN_DRAG, 0.0f, 0.0f);
    }

    public static void b(ViewGroup viewGroup, float f, float f2) {
        a(viewGroup, i.END_DRAG, f, f2);
    }

    public static void a(ViewGroup viewGroup, int i, int i2) {
        a(viewGroup, i.MOMENTUM_BEGIN, i, i2);
    }

    public static void b(ViewGroup viewGroup) {
        a(viewGroup, i.MOMENTUM_END, 0.0f, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(ViewGroup viewGroup, i iVar, float f, float f2) {
        View childAt = viewGroup.getChildAt(0);
        if (childAt == null) {
            return;
        }
        au.a((ReactContext) viewGroup.getContext(), viewGroup.getId()).a(h.a(viewGroup.getId(), iVar, viewGroup.getScrollX(), viewGroup.getScrollY(), f, f2, childAt.getWidth(), childAt.getHeight(), viewGroup.getWidth(), viewGroup.getHeight()));
    }

    public static int a(String str) {
        if (str == null || str.equals(FpsEvent.TYPE_SCROLL_AUTO)) {
            return 1;
        }
        if (str.equals("always")) {
            return 0;
        }
        if (str.equals("never")) {
            return 2;
        }
        throw new JSApplicationIllegalArgumentException("wrong overScrollMode: " + str);
    }
}
