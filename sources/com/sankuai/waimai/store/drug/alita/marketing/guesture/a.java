package com.sankuai.waimai.store.drug.alita.marketing.guesture;

import android.support.annotation.NonNull;
import android.view.VelocityTracker;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    View b;
    int c;
    int d;
    int e;
    float f;
    VelocityTracker g;
    boolean h;
    public Runnable i;

    public a(@NonNull View view, boolean z) {
        Object[] objArr = {view, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a36c0971c4adb2fb8450c3560665187f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a36c0971c4adb2fb8450c3560665187f");
            return;
        }
        this.g = VelocityTracker.obtain();
        this.b = view;
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.sankuai.waimai.store.drug.alita.marketing.guesture.a.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view2) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2a301ff451ab1f10a26b55763cabd5c8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2a301ff451ab1f10a26b55763cabd5c8");
                } else if (a.this.g != null) {
                    a.this.g.recycle();
                    a.this.g = null;
                }
            }
        });
        this.h = true;
    }
}
