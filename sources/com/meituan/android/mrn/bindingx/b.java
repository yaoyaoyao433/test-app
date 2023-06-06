package com.meituan.android.mrn.bindingx;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b extends com.alibaba.android.bindingx.core.internal.b {
    public static ChangeQuickRedirect o;
    private a p;

    @Override // com.alibaba.android.bindingx.core.c
    public final void b() {
    }

    @Override // com.alibaba.android.bindingx.core.c
    public final void b(@NonNull String str, @NonNull String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdf24c0bf133225726ada764bee0794c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdf24c0bf133225726ada764bee0794c");
        }
    }

    @Override // com.alibaba.android.bindingx.core.c
    public final void c() {
    }

    public b(Context context, com.alibaba.android.bindingx.core.e eVar, Object... objArr) {
        super(context, eVar, objArr);
        Object[] objArr2 = {context, eVar, objArr};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "e197959df357d21a0ca3a26fbd5f3cd8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "e197959df357d21a0ca3a26fbd5f3cd8");
        } else {
            this.p = null;
        }
    }

    @Override // com.alibaba.android.bindingx.core.c
    public final boolean a(@NonNull String str, @NonNull String str2) {
        ScrollView scrollView;
        ViewTreeObserver viewTreeObserver;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4fab005a2ff5c40211f408b290cfe62", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4fab005a2ff5c40211f408b290cfe62")).booleanValue();
        }
        View a2 = this.h.b.a(str, new Object[0]);
        if ((a2 instanceof ScrollView) && (viewTreeObserver = (scrollView = (ScrollView) a2).getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            this.p = new a(scrollView);
            viewTreeObserver.addOnScrollChangedListener(this.p);
            return true;
        }
        return false;
    }

    @Override // com.alibaba.android.bindingx.core.internal.b, com.alibaba.android.bindingx.core.c
    public final boolean c(@NonNull String str, @NonNull String str2) {
        ViewTreeObserver viewTreeObserver;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f387bbee8d1671259f079ae38bf564d5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f387bbee8d1671259f079ae38bf564d5")).booleanValue();
        }
        super.c(str, str2);
        View a2 = this.h.b.a(str, new Object[0]);
        if (!(a2 instanceof ScrollView) || (viewTreeObserver = ((ScrollView) a2).getViewTreeObserver()) == null || !viewTreeObserver.isAlive() || this.p == null) {
            return false;
        }
        viewTreeObserver.removeOnScrollChangedListener(this.p);
        this.p = null;
        return true;
    }

    @Override // com.alibaba.android.bindingx.core.internal.b, com.alibaba.android.bindingx.core.internal.a, com.alibaba.android.bindingx.core.c
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "472c444928bd1eeaf0bd1ac361a094a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "472c444928bd1eeaf0bd1ac361a094a9");
            return;
        }
        super.a();
        this.p = null;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class a implements ViewTreeObserver.OnScrollChangedListener {
        public static ChangeQuickRedirect a;
        private int c;
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;
        private WeakReference<ScrollView> i;

        public a(ScrollView scrollView) {
            Object[] objArr = {b.this, scrollView};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb9621862e237b788f5b741441f369e7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb9621862e237b788f5b741441f369e7");
                return;
            }
            this.c = 0;
            this.d = 0;
            this.e = 0;
            this.f = 0;
            this.g = 0;
            this.h = 0;
            this.i = new WeakReference<>(scrollView);
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public final void onScrollChanged() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4617059f261fadaabf27586ae0be54c6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4617059f261fadaabf27586ae0be54c6");
                return;
            }
            ScrollView scrollView = this.i == null ? null : this.i.get();
            if (scrollView == null) {
                return;
            }
            int scrollX = scrollView.getScrollX();
            int scrollY = scrollView.getScrollY();
            if (scrollX == this.c && scrollY == this.d) {
                return;
            }
            int i = scrollX - this.c;
            int i2 = scrollY - this.d;
            this.c = scrollX;
            this.d = scrollY;
            if (i == 0 && i2 == 0) {
                return;
            }
            int i3 = this.h;
            boolean z = true;
            if ((i2 > 0 && i3 > 0) || (i2 < 0 && i3 < 0)) {
                z = false;
            } else {
                this.f = this.d;
            }
            int i4 = this.c - this.e;
            int i5 = this.d - this.f;
            this.g = i;
            this.h = i2;
            if (z) {
                b.super.a("turn", this.c, this.d, i, i2, i4, i5);
            }
            b.super.a(this.c, this.d, i, i2, i4, i5);
        }
    }
}
