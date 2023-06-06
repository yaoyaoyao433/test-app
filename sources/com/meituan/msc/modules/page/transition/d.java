package com.meituan.msc.modules.page.transition;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d extends FrameLayout {
    public static ChangeQuickRedirect a;
    public a b;
    public boolean c;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a();

        void b();
    }

    public d(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c300f3c0bfd8a43b7d8a1d711c57e70", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c300f3c0bfd8a43b7d8a1d711c57e70");
        } else {
            this.c = true;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {view, Integer.valueOf(i), layoutParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "294c603307a5e8ea169a8dc93c89a056", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "294c603307a5e8ea169a8dc93c89a056");
            return;
        }
        if (this.c && (view instanceof com.meituan.msc.modules.page.transition.a)) {
            setLayoutTransition(((com.meituan.msc.modules.page.transition.a) view).getPushTransition());
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ba2bcea645df749bd16e17ca0c68f39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ba2bcea645df749bd16e17ca0c68f39");
            return;
        }
        View childAt = getChildAt(i);
        if (this.c && (childAt instanceof com.meituan.msc.modules.page.transition.a)) {
            setLayoutTransition(((com.meituan.msc.modules.page.transition.a) childAt).getPopTransition());
        }
        super.removeViewAt(i);
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7f5f950f9a16536917b67cd8ab23de3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7f5f950f9a16536917b67cd8ab23de3");
            return;
        }
        this.c = false;
        setLayoutTransition(null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9670160434dda8af5220aa48cbd6754", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9670160434dda8af5220aa48cbd6754");
            return;
        }
        super.onAttachedToWindow();
        if (this.b != null) {
            this.b.b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "023d486c1ef67a334e898cfc4371386b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "023d486c1ef67a334e898cfc4371386b");
            return;
        }
        super.onDetachedFromWindow();
        if (this.b != null) {
            this.b.a();
        }
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "415839c72f3c398b5370048c45ef6517", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "415839c72f3c398b5370048c45ef6517");
        } else if (!z) {
            a();
        } else {
            this.c = true;
        }
    }
}
