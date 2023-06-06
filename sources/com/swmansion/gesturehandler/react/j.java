package com.swmansion.gesturehandler.react;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.uimanager.ac;
import com.facebook.react.uimanager.x;
import com.swmansion.gesturehandler.l;
import com.swmansion.gesturehandler.p;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class j implements p {
    @Override // com.swmansion.gesturehandler.p
    public final l a(View view) {
        x pointerEvents = view instanceof ac ? ((ac) view).getPointerEvents() : x.AUTO;
        if (!view.isEnabled()) {
            if (pointerEvents == x.AUTO) {
                return l.BOX_NONE;
            }
            if (pointerEvents == x.BOX_ONLY) {
                return l.NONE;
            }
        }
        switch (pointerEvents) {
            case BOX_ONLY:
                return l.BOX_ONLY;
            case BOX_NONE:
                return l.BOX_NONE;
            case NONE:
                return l.NONE;
            default:
                return l.AUTO;
        }
    }

    @Override // com.swmansion.gesturehandler.p
    public final View a(ViewGroup viewGroup, int i) {
        if (viewGroup instanceof com.facebook.react.views.view.f) {
            return viewGroup.getChildAt(((com.facebook.react.views.view.f) viewGroup).getZIndexMappedChildIndex(i));
        }
        return viewGroup.getChildAt(i);
    }

    @Override // com.swmansion.gesturehandler.p
    public final boolean a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT < 18 || viewGroup.getClipChildren()) {
            return true;
        }
        if (viewGroup instanceof com.facebook.react.views.view.f) {
            return "hidden".equals(((com.facebook.react.views.view.f) viewGroup).getOverflow());
        }
        return false;
    }
}
