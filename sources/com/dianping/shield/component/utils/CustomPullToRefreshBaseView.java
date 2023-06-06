package com.dianping.shield.component.utils;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class CustomPullToRefreshBaseView extends FrameLayout {
    public static final int STATE_COMPLETE = 3;
    public static final int STATE_NORMAL = 0;
    public static final int STATE_READY = 1;
    public static final int STATE_REFRESHING = 2;
    public static ChangeQuickRedirect changeQuickRedirect;
    private int state;

    public abstract void setY(int i);

    public CustomPullToRefreshBaseView(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c1a414db6e64bafeda32a3d7a85ae18b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c1a414db6e64bafeda32a3d7a85ae18b");
        }
    }

    public CustomPullToRefreshBaseView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "24d214d15f1c6ee3786623f397ebb712", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "24d214d15f1c6ee3786623f397ebb712");
        }
    }

    public void setState(int i) {
        if (i == this.state) {
            return;
        }
        this.state = i;
    }

    public int getState() {
        return this.state;
    }
}
