package com.meituan.msc.uimanager.bingingx;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import com.meituan.msc.mmpviews.scroll.i;
import com.meituan.msc.modules.reporter.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a extends com.alibaba.android.bindingx.core.internal.b {
    public static ChangeQuickRedirect o;
    int p;
    int q;
    private ViewTreeObserver$OnScrollChangedListenerC0483a r;
    private RecyclerView.k s;

    @Override // com.alibaba.android.bindingx.core.c
    public final void b() {
    }

    @Override // com.alibaba.android.bindingx.core.c
    public final void b(@NonNull String str, @NonNull String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66792431968bca36abb340b5170d8e6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66792431968bca36abb340b5170d8e6e");
        }
    }

    @Override // com.alibaba.android.bindingx.core.c
    public final void c() {
    }

    public a(Context context, com.alibaba.android.bindingx.core.e eVar, Object... objArr) {
        super(context, eVar, objArr);
        Object[] objArr2 = {context, eVar, objArr};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "915cd5d5cdeea7f891066b5159e3e848", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "915cd5d5cdeea7f891066b5159e3e848");
            return;
        }
        this.r = null;
        this.p = 0;
        this.q = 0;
        this.s = new RecyclerView.k() { // from class: com.meituan.msc.uimanager.bingingx.a.1
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
                Object[] objArr3 = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "820984a143cd7e82c9825015effd8469", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "820984a143cd7e82c9825015effd8469");
                    return;
                }
                super.onScrolled(recyclerView, i, i2);
                a.this.p += i2;
                a.this.q += i;
            }
        };
    }

    @Override // com.alibaba.android.bindingx.core.c
    public final boolean a(@NonNull String str, @NonNull String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a87dbc83e4984bb7da9da90d502c92f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a87dbc83e4984bb7da9da90d502c92f")).booleanValue();
        }
        View a = this.h.a().a(str, new Object[0]);
        if (a instanceof i) {
            i iVar = (i) a;
            if (iVar.getChildCount() == 0 || iVar.getChildAt(0) == null) {
                return false;
            }
            View childAt = iVar.getChildAt(0);
            if (childAt instanceof ScrollView) {
                a = (ScrollView) childAt;
            }
        }
        if (a instanceof RecyclerView) {
            ((RecyclerView) a).addOnScrollListener(this.s);
        }
        ViewTreeObserver viewTreeObserver = a.getViewTreeObserver();
        if (viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return false;
        }
        this.r = new ViewTreeObserver$OnScrollChangedListenerC0483a(a);
        viewTreeObserver.addOnScrollChangedListener(this.r);
        return true;
    }

    @Override // com.alibaba.android.bindingx.core.internal.b, com.alibaba.android.bindingx.core.c
    public final boolean c(@NonNull String str, @NonNull String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2cf329e38dc1ab2baef26b3994446eab", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2cf329e38dc1ab2baef26b3994446eab")).booleanValue();
        }
        super.c(str, str2);
        View a = this.h.a().a(str, new Object[0]);
        if (a instanceof i) {
            i iVar = (i) a;
            if (iVar.getChildCount() == 0 || iVar.getChildAt(0) == null) {
                return false;
            }
            View childAt = iVar.getChildAt(0);
            if (childAt instanceof ScrollView) {
                a = (ScrollView) childAt;
            }
        }
        ViewTreeObserver viewTreeObserver = a.getViewTreeObserver();
        if (viewTreeObserver == null || !viewTreeObserver.isAlive() || this.r == null) {
            return false;
        }
        if (a instanceof RecyclerView) {
            ((RecyclerView) a).removeOnScrollListener(this.s);
            this.s = null;
        }
        viewTreeObserver.removeOnScrollChangedListener(this.r);
        this.r = null;
        return true;
    }

    @Override // com.alibaba.android.bindingx.core.internal.b, com.alibaba.android.bindingx.core.internal.a, com.alibaba.android.bindingx.core.c
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b496c200143dd4513e81b7b1e8b33916", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b496c200143dd4513e81b7b1e8b33916");
            return;
        }
        super.a();
        this.r = null;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.msc.uimanager.bingingx.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class ViewTreeObserver$OnScrollChangedListenerC0483a implements ViewTreeObserver.OnScrollChangedListener {
        public static ChangeQuickRedirect a;
        private int c;
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;
        private WeakReference<View> i;

        public ViewTreeObserver$OnScrollChangedListenerC0483a(View view) {
            Object[] objArr = {a.this, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "184d9c340c76ad9fb41daf6e5dcd12aa", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "184d9c340c76ad9fb41daf6e5dcd12aa");
                return;
            }
            this.c = 0;
            this.d = 0;
            this.e = 0;
            this.f = 0;
            this.g = 0;
            this.h = 0;
            this.i = new WeakReference<>(view);
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public final void onScrollChanged() {
            int scrollX;
            int scrollY;
            boolean z = false;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e56a33a374bd0dac6259fcdf86603ab0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e56a33a374bd0dac6259fcdf86603ab0");
                return;
            }
            View view = this.i == null ? null : this.i.get();
            if (view == null) {
                g.b("[InnerScrollViewListener@onScrollChanged]", null, "hostView null");
                return;
            }
            boolean z2 = view instanceof RecyclerView;
            if (!z2) {
                scrollX = view.getScrollX();
            } else {
                scrollX = a.this.q;
            }
            if (!z2) {
                scrollY = view.getScrollY();
            } else {
                scrollY = a.this.p;
            }
            int i = scrollX - this.c;
            int i2 = scrollY - this.d;
            this.c = scrollX;
            this.d = scrollY;
            if (i == 0 && i2 == 0) {
                g.d("[InnerScrollViewListener@onScrollChanged]", null, "content offset no change");
                return;
            }
            int i3 = this.h;
            if (!((i2 > 0 && i3 > 0) || (i2 < 0 && i3 < 0))) {
                this.f = this.d;
                z = true;
            }
            int i4 = this.c - this.e;
            int i5 = this.d - this.f;
            this.g = i;
            this.h = i2;
            if (z) {
                a.super.a("turn", this.c, this.d, i, i2, i4, i5);
            }
            a.super.a(this.c, this.d, i, i2, i4, i5);
        }
    }
}
