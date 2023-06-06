package com.sankuai.waimai.platform.mach.util;

import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewTreeObserver;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        void a(boolean z);
    }

    public static ViewTreeObserver.OnGlobalLayoutListener a(View view, b bVar) {
        Object[] objArr = {view, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dadbd8d32e7bc0fa1a9ceade8cacde8f", RobustBitConfig.DEFAULT_VALUE)) {
            return (ViewTreeObserver.OnGlobalLayoutListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dadbd8d32e7bc0fa1a9ceade8cacde8f");
        }
        ViewTreeObserver$OnGlobalLayoutListenerC1060a viewTreeObserver$OnGlobalLayoutListenerC1060a = new ViewTreeObserver$OnGlobalLayoutListenerC1060a(view, bVar);
        view.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserver$OnGlobalLayoutListenerC1060a);
        return viewTreeObserver$OnGlobalLayoutListenerC1060a;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.platform.mach.util.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class ViewTreeObserver$OnGlobalLayoutListenerC1060a implements ViewTreeObserver.OnGlobalLayoutListener {
        public static ChangeQuickRedirect a;
        private static final int e = g.a(com.meituan.android.singleton.b.a, 100.0f);
        private final View b;
        private final b c;
        private boolean d;

        public ViewTreeObserver$OnGlobalLayoutListenerC1060a(@NonNull View view, @NonNull b bVar) {
            Object[] objArr = {view, bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abfabba5485b4f7dd1d2eed89be8ac80", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abfabba5485b4f7dd1d2eed89be8ac80");
                return;
            }
            this.d = false;
            this.b = view;
            this.c = bVar;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b885ccf36f7e150cfb9e110ec6204580", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b885ccf36f7e150cfb9e110ec6204580");
                return;
            }
            Rect rect = new Rect();
            this.b.getWindowVisibleDisplayFrame(rect);
            boolean z = this.b.getRootView().getHeight() - rect.bottom > e;
            if (z != this.d) {
                this.d = z;
                this.c.a(z);
            }
        }
    }
}
