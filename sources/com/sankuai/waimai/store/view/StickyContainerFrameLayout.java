package com.sankuai.waimai.store.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.store.util.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class StickyContainerFrameLayout extends FrameLayout {
    public static ChangeQuickRedirect a = null;
    private static int d = 0;
    private static long e = 200;
    public int b;
    public RecyclerView.c c;
    private a f;
    private List<a> g;
    private boolean h;
    private int i;
    private int j;
    private boolean k;

    public static /* synthetic */ void a(StickyContainerFrameLayout stickyContainerFrameLayout, int i, int i2) {
        a aVar;
        f fVar;
        int i3;
        int i4;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, stickyContainerFrameLayout, changeQuickRedirect, false, "7adf96a331b7eafbf0301d69a0bf2cce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, stickyContainerFrameLayout, changeQuickRedirect, false, "7adf96a331b7eafbf0301d69a0bf2cce");
            return;
        }
        if (stickyContainerFrameLayout.j <= (-d) && stickyContainerFrameLayout.a()) {
            int size = stickyContainerFrameLayout.g.size() - 1;
            while (true) {
                if (size < 0) {
                    i4 = -1;
                    break;
                }
                a aVar2 = stickyContainerFrameLayout.g.get(size);
                if (i2 >= aVar2.b) {
                    i4 = aVar2.b;
                    break;
                }
                size--;
            }
            if (i2 - i4 > 2) {
                stickyContainerFrameLayout.b();
                return;
            }
        }
        if (stickyContainerFrameLayout.f != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) stickyContainerFrameLayout.f.c.getLayoutParams();
            if (marginLayoutParams.topMargin < stickyContainerFrameLayout.f.e) {
                marginLayoutParams.topMargin -= i;
                if (marginLayoutParams.topMargin >= stickyContainerFrameLayout.f.e) {
                    marginLayoutParams.topMargin = stickyContainerFrameLayout.f.e;
                }
                stickyContainerFrameLayout.f.c.setLayoutParams(marginLayoutParams);
                return;
            }
        }
        while (stickyContainerFrameLayout.getChildCount() >= stickyContainerFrameLayout.i + 1) {
            View childAt = stickyContainerFrameLayout.getChildAt(stickyContainerFrameLayout.getChildCount() - 1);
            int b = b(childAt);
            int bottom = childAt.getBottom();
            for (int i5 = stickyContainerFrameLayout.i; i5 < stickyContainerFrameLayout.getChildCount(); i5++) {
                View childAt2 = stickyContainerFrameLayout.getChildAt(i5);
                int b2 = b(childAt2);
                int bottom2 = childAt2.getBottom();
                if (bottom2 >= bottom && (bottom2 > bottom || b2 > b)) {
                    childAt = childAt2;
                    b = b2;
                }
            }
            if (b < 0 && bottom <= 0) {
                break;
            }
            Iterator<a> it = stickyContainerFrameLayout.g.iterator();
            while (true) {
                aVar = null;
                if (!it.hasNext()) {
                    fVar = null;
                    i3 = -1;
                    break;
                }
                a next = it.next();
                if (next.c == childAt) {
                    fVar = next.d;
                    i3 = next.b;
                    break;
                }
            }
            if (fVar == null) {
                return;
            }
            int top = fVar.getTop();
            if (i3 < i2 || top < childAt.getTop() || fVar.getChildCount() != 0) {
                break;
            }
            int size2 = stickyContainerFrameLayout.g.size() - 1;
            while (true) {
                if (size2 >= 0) {
                    a aVar3 = stickyContainerFrameLayout.g.get(size2);
                    if (aVar3.d.b && i3 > aVar3.b) {
                        aVar = aVar3;
                        break;
                    }
                    size2--;
                }
            }
            stickyContainerFrameLayout.removeView(childAt);
            b(childAt, 0);
            fVar.addView(childAt);
            stickyContainerFrameLayout.f = aVar;
        }
        for (a aVar4 : stickyContainerFrameLayout.g) {
            int b3 = b(aVar4.c);
            int height = aVar4.c.getHeight();
            int i6 = aVar4.b;
            if (b3 <= (-height) && i6 >= i2 && aVar4.d.getChildCount() == 0) {
                stickyContainerFrameLayout.removeView(aVar4.c);
                b(aVar4.c, 0);
                aVar4.d.addView(aVar4.c);
            }
        }
    }

    public static /* synthetic */ void a(StickyContainerFrameLayout stickyContainerFrameLayout, RecyclerView recyclerView, int i, int i2) {
        Object[] objArr = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, stickyContainerFrameLayout, changeQuickRedirect, false, "6eacc915dadbbefec7452df710b48e75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, stickyContainerFrameLayout, changeQuickRedirect, false, "6eacc915dadbbefec7452df710b48e75");
        } else if (stickyContainerFrameLayout.c()) {
            stickyContainerFrameLayout.d();
        } else {
            stickyContainerFrameLayout.d(i);
            f fVar = null;
            int i3 = -1;
            int childCount = recyclerView.getChildCount();
            int i4 = 0;
            while (true) {
                if (i4 >= childCount) {
                    break;
                }
                View childAt = recyclerView.getChildAt(i4);
                if (childAt instanceof f) {
                    f fVar2 = (f) childAt;
                    if (fVar2.b && fVar2.getChildCount() > 0) {
                        i3 = recyclerView.getChildAdapterPosition(childAt);
                        fVar = fVar2;
                        break;
                    }
                }
                i4++;
            }
            if (fVar == null) {
                a b = stickyContainerFrameLayout.b(i);
                if (b == stickyContainerFrameLayout.f || b == null) {
                    return;
                }
                stickyContainerFrameLayout.f = b;
                stickyContainerFrameLayout.c(stickyContainerFrameLayout.f.b);
                return;
            }
            int top = fVar.getTop();
            int height = stickyContainerFrameLayout.f == null ? 0 : stickyContainerFrameLayout.f.c.getHeight();
            int a2 = stickyContainerFrameLayout.f == null ? 0 : stickyContainerFrameLayout.a(stickyContainerFrameLayout.f.d, 0);
            if (top <= stickyContainerFrameLayout.a(fVar, 0)) {
                if (fVar.getChildCount() > 0) {
                    if (stickyContainerFrameLayout.f != null) {
                        if (stickyContainerFrameLayout.f.d.getChildCount() > 0) {
                            stickyContainerFrameLayout.f.d.getLayoutParams().height = height;
                            stickyContainerFrameLayout.f.d.removeAllViews();
                            stickyContainerFrameLayout.addView(stickyContainerFrameLayout.f.c);
                        }
                        b(stickyContainerFrameLayout.f.c, -height);
                    }
                    stickyContainerFrameLayout.f = stickyContainerFrameLayout.b(i3);
                    if (stickyContainerFrameLayout.f == null || stickyContainerFrameLayout.f.d.getChildCount() <= 0) {
                        return;
                    }
                    stickyContainerFrameLayout.f.d.getLayoutParams().height = fVar.getHeight();
                    stickyContainerFrameLayout.f.d.removeAllViews();
                    b(stickyContainerFrameLayout.f.c, stickyContainerFrameLayout.a(fVar, 0));
                    stickyContainerFrameLayout.addView(stickyContainerFrameLayout.f.c);
                }
            } else if (top > a2 + height || stickyContainerFrameLayout.f == null) {
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) stickyContainerFrameLayout.f.c.getLayoutParams();
                int i5 = top + i2;
                if (i5 > height) {
                    i2 -= i5 - height;
                }
                int i6 = -height;
                if (marginLayoutParams.topMargin != i6) {
                    marginLayoutParams.topMargin -= i2;
                    if (marginLayoutParams.topMargin <= i6) {
                        marginLayoutParams.topMargin = i6;
                    }
                    stickyContainerFrameLayout.f.c.setLayoutParams(marginLayoutParams);
                }
            }
        }
    }

    public static /* synthetic */ void a(StickyContainerFrameLayout stickyContainerFrameLayout, boolean z, int i, int i2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, stickyContainerFrameLayout, changeQuickRedirect, false, "1a5a1561ead14407a4ba3ab946622e3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, stickyContainerFrameLayout, changeQuickRedirect, false, "1a5a1561ead14407a4ba3ab946622e3d");
        } else if (!com.sankuai.waimai.foundation.utils.b.b(stickyContainerFrameLayout.g)) {
            for (a aVar : stickyContainerFrameLayout.g) {
                if (aVar.b >= i) {
                    if (z) {
                        aVar.b += i2;
                    } else {
                        aVar.b -= i2;
                    }
                }
            }
        }
    }

    public static /* synthetic */ boolean a(StickyContainerFrameLayout stickyContainerFrameLayout, boolean z) {
        stickyContainerFrameLayout.k = false;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public int b;
        @NonNull
        public View c;
        @NonNull
        public f d;
        public int e;

        public a(int i, @NonNull View view, @NonNull f fVar, int i2) {
            Object[] objArr = {Integer.valueOf(i), view, fVar, Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c28199eaf1f14009b6614c99e593c8fb", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c28199eaf1f14009b6614c99e593c8fb");
                return;
            }
            this.b = i;
            this.c = view;
            this.d = fVar;
            this.e = i2;
        }

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07e068697c553a8ff1d0e6586997c15c", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07e068697c553a8ff1d0e6586997c15c");
            }
            return "[" + this.b + ", " + this.d + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT;
        }
    }

    public StickyContainerFrameLayout(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d0db05a093905101a517c0171bb4a6d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d0db05a093905101a517c0171bb4a6d");
            return;
        }
        this.b = -1;
        this.g = new ArrayList();
        this.j = 0;
        this.k = false;
    }

    public StickyContainerFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14aa5c3ca38b22d9e7b3702199b6374d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14aa5c3ca38b22d9e7b3702199b6374d");
            return;
        }
        this.b = -1;
        this.g = new ArrayList();
        this.j = 0;
        this.k = false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        try {
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "242f639caa99ab75dc6b975d19a930e5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "242f639caa99ab75dc6b975d19a930e5");
                return;
            }
            this.h = true;
            super.onLayout(z, i, i2, i3, i4);
        } catch (Exception e2) {
            com.sankuai.waimai.store.base.log.a.a(e2);
        } finally {
            this.h = false;
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa3cf41d3a02dd929eaa0257bf6417f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa3cf41d3a02dd929eaa0257bf6417f2");
            return;
        }
        super.onFinishInflate();
        RecyclerView recyclerView = null;
        while (true) {
            if (i >= getChildCount()) {
                break;
            }
            View childAt = getChildAt(i);
            if (childAt instanceof RecyclerView) {
                recyclerView = (RecyclerView) childAt;
                this.i = i + 1;
                break;
            }
            i++;
        }
        if (recyclerView == null) {
            return;
        }
        recyclerView.addOnScrollListener(new RecyclerView.k() { // from class: com.sankuai.waimai.store.view.StickyContainerFrameLayout.1
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrollStateChanged(RecyclerView recyclerView2, int i2) {
                int i3;
                Object[] objArr2 = {recyclerView2, Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9838df3f0d5abe533717d0138950e7a0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9838df3f0d5abe533717d0138950e7a0");
                    return;
                }
                super.onScrollStateChanged(recyclerView2, i2);
                if (i2 == 0) {
                    StickyContainerFrameLayout.this.j = 0;
                    if (StickyContainerFrameLayout.this.f != null) {
                        int b = StickyContainerFrameLayout.b(StickyContainerFrameLayout.this.f.c);
                        int height = StickyContainerFrameLayout.this.f.c.getHeight();
                        if (b >= 0 || b <= (i3 = -height) || StickyContainerFrameLayout.this.f.e != 0) {
                            return;
                        }
                        if (b < i3 / 2) {
                            b += height;
                        }
                        recyclerView2.smoothScrollBy(0, b);
                    }
                }
            }

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrolled(RecyclerView recyclerView2, int i2, int i3) {
                Object[] objArr2 = {recyclerView2, Integer.valueOf(i2), Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9dd21dc1c6d14db2afd3e1a92e1a9cb1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9dd21dc1c6d14db2afd3e1a92e1a9cb1");
                    return;
                }
                super.onScrolled(recyclerView2, i2, i3);
                if (StickyContainerFrameLayout.this.h) {
                    return;
                }
                RecyclerView.LayoutManager layoutManager = recyclerView2.getLayoutManager();
                if ((layoutManager instanceof LinearLayoutManager) || (layoutManager instanceof StaggeredGridLayoutManager)) {
                    int b = p.b(layoutManager);
                    StickyContainerFrameLayout.this.a(layoutManager, b, p.a(layoutManager));
                    StickyContainerFrameLayout.this.j += i3;
                    if (StickyContainerFrameLayout.this.k) {
                        return;
                    }
                    if (i3 > 0) {
                        StickyContainerFrameLayout.a(StickyContainerFrameLayout.this, recyclerView2, b, i3);
                    }
                    if (i3 < 0) {
                        StickyContainerFrameLayout.a(StickyContainerFrameLayout.this, i3, b);
                    }
                }
            }
        });
        this.c = new RecyclerView.c() { // from class: com.sankuai.waimai.store.view.StickyContainerFrameLayout.2
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.c
            public final void onItemRangeInserted(int i2, int i3) {
                Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f6a62477606e8350a44f383a4904464e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f6a62477606e8350a44f383a4904464e");
                } else {
                    StickyContainerFrameLayout.a(StickyContainerFrameLayout.this, true, i2, i3);
                }
            }

            @Override // android.support.v7.widget.RecyclerView.c
            public final void onItemRangeRemoved(int i2, int i3) {
                Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cb623890d8c702934602161126b493f2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cb623890d8c702934602161126b493f2");
                } else {
                    StickyContainerFrameLayout.a(StickyContainerFrameLayout.this, false, i2, i3);
                }
            }
        };
        d = g.b(getContext()) / 5;
    }

    public void a(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        View childAt;
        Object[] objArr = {layoutManager, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee32e402d28f61312f737a3867ecb604", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee32e402d28f61312f737a3867ecb604");
        } else if (this.b == -1 || this.b <= i2) {
            this.b = i2;
            for (int i3 = this.b == -1 ? 0 : this.b; i3 <= i2; i3++) {
                View findViewByPosition = layoutManager.findViewByPosition(i3);
                if (findViewByPosition != null) {
                    if (findViewByPosition instanceof f) {
                        f fVar = (f) findViewByPosition;
                        if ((fVar.b || fVar.c) && (childAt = fVar.getChildAt(0)) != null) {
                            a(new a(i3, childAt, fVar, fVar.getOffset()));
                        }
                    } else {
                        a(i3);
                    }
                } else {
                    this.b = -1;
                }
            }
        }
    }

    private void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9587ed7db19037a29afc9231967461c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9587ed7db19037a29afc9231967461c4");
            return;
        }
        Iterator<a> it = this.g.iterator();
        while (it.hasNext()) {
            if (it.next().b == i) {
                it.remove();
            }
        }
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d85be91c544e2479b95827455291687a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d85be91c544e2479b95827455291687a");
            return;
        }
        this.f = null;
        this.b = -1;
        for (int size = this.g.size() - 1; size >= 0; size--) {
            a aVar = this.g.get(size);
            b(aVar.c, 0);
            if (aVar.d.getChildCount() == 0) {
                removeView(aVar.c);
                aVar.d.addView(aVar.c);
            }
            a(z, aVar);
            this.g.remove(size);
        }
    }

    private void a(boolean z, @NonNull a aVar) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7930ace6f6ab713235e36a31c3c523c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7930ace6f6ab713235e36a31c3c523c");
        } else if (z) {
            aVar.d.getLayoutParams().height = -2;
            aVar.d.requestLayout();
        }
    }

    @Nullable
    private a b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c52bd8ba10cf13eb42d5cb69b513c9c", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c52bd8ba10cf13eb42d5cb69b513c9c");
        }
        for (int size = this.g.size() - 1; size >= 0; size--) {
            a aVar = this.g.get(size);
            if (i >= aVar.b && aVar.d.b) {
                return aVar;
            }
        }
        return null;
    }

    private void c(int i) {
        int i2;
        int i3 = 1;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d10768df5d90e6bcf180c287f454fe1a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d10768df5d90e6bcf180c287f454fe1a");
            return;
        }
        for (a aVar : this.g) {
            if (i >= aVar.b) {
                if (i != aVar.b) {
                    i2 = -aVar.c.getHeight();
                } else {
                    i2 = aVar.e;
                }
                int i4 = i2;
                Object[] objArr2 = new Object[2];
                objArr2[0] = aVar;
                objArr2[i3] = Integer.valueOf(i4);
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "978abfa48c5c1fad54867c36e13a7f34", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "978abfa48c5c1fad54867c36e13a7f34");
                } else {
                    b(aVar.c, i4);
                    if (aVar.d.getChildCount() > 0) {
                        aVar.d.removeAllViews();
                        aVar.d.getLayoutParams().height = aVar.c.getHeight();
                        addView(aVar.c);
                    }
                }
                i3 = 1;
            } else {
                Object[] objArr3 = new Object[i3];
                objArr3[0] = aVar;
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2a577cc7e121d1216236ea8d7fcaa80b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2a577cc7e121d1216236ea8d7fcaa80b");
                } else {
                    b(aVar.c, 0);
                    if (aVar.d.getChildCount() == 0) {
                        removeView(aVar.c);
                        aVar.d.addView(aVar.c);
                    }
                }
            }
        }
    }

    private void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c44902f2af2ba9faecd7c8347a77f03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c44902f2af2ba9faecd7c8347a77f03");
            return;
        }
        for (a aVar2 : this.g) {
            if (aVar2.b == aVar.b) {
                return;
            }
        }
        this.g.add(aVar);
    }

    private boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c204e08b19d2b81af0007c77702586f8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c204e08b19d2b81af0007c77702586f8")).booleanValue();
        }
        int childCount = getChildCount();
        if (childCount < this.i + 1) {
            return false;
        }
        for (int i = this.i; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (b(childAt) <= (-childAt.getHeight())) {
                for (a aVar : this.g) {
                    if (aVar.c == childAt && aVar.d.c) {
                        return true;
                    }
                }
                continue;
            }
        }
        return false;
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4862c19e1be0fc4a55d331eef1bfd7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4862c19e1be0fc4a55d331eef1bfd7c");
        } else if (!this.k) {
            int childCount = getChildCount();
            SparseIntArray sparseIntArray = new SparseIntArray();
            SparseIntArray sparseIntArray2 = new SparseIntArray();
            for (int i = this.i; i < childCount; i++) {
                View childAt = getChildAt(i);
                int height = childAt.getHeight();
                int b = b(childAt);
                if (b <= (-height)) {
                    Iterator<a> it = this.g.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            a next = it.next();
                            if (next.c == childAt && next.d.c) {
                                sparseIntArray.put(i, height);
                                sparseIntArray2.put(i, b);
                                break;
                            }
                        }
                    }
                } else if (b >= 0) {
                    sparseIntArray.put(i, height);
                    sparseIntArray2.put(i, b);
                }
            }
            SparseIntArray sparseIntArray3 = new SparseIntArray();
            for (int i2 = 0; i2 < sparseIntArray2.size(); i2++) {
                int keyAt = sparseIntArray2.keyAt(i2);
                int i3 = 0;
                for (int i4 = 0; i4 < sparseIntArray.size(); i4++) {
                    int keyAt2 = sparseIntArray.keyAt(i4);
                    int valueAt = sparseIntArray.valueAt(i4);
                    if (keyAt > keyAt2) {
                        i3 += valueAt;
                    }
                }
                sparseIntArray3.put(keyAt, i3);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            for (int i5 = 0; i5 < sparseIntArray2.size(); i5++) {
                final int keyAt3 = sparseIntArray2.keyAt(i5);
                ValueAnimator ofInt = ValueAnimator.ofInt(sparseIntArray2.get(keyAt3), sparseIntArray3.get(keyAt3));
                ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.waimai.store.view.StickyContainerFrameLayout.3
                    public static ChangeQuickRedirect a;

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Object[] objArr2 = {valueAnimator};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7e8fa03608a427adcf30499e10974811", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7e8fa03608a427adcf30499e10974811");
                            return;
                        }
                        View childAt2 = StickyContainerFrameLayout.this.getChildAt(keyAt3);
                        if (childAt2 == null) {
                            return;
                        }
                        StickyContainerFrameLayout.b(childAt2, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                    }
                });
                arrayList.add(ofInt);
            }
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(e);
            animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.sankuai.waimai.store.view.StickyContainerFrameLayout.4
                public static ChangeQuickRedirect a;

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    Object[] objArr2 = {animator};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9c4b06951a789a8f3ea51e5865ab26ab", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9c4b06951a789a8f3ea51e5865ab26ab");
                    } else {
                        StickyContainerFrameLayout.a(StickyContainerFrameLayout.this, false);
                    }
                }
            });
            this.k = true;
            animatorSet.start();
        }
    }

    private boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50cc17d5ba517e416e72ca32bf695fcd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50cc17d5ba517e416e72ca32bf695fcd")).booleanValue();
        }
        int childCount = getChildCount();
        int i = 0;
        for (int i2 = this.i; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (b(childAt) >= 0) {
                i++;
                for (a aVar : this.g) {
                    if (childAt == aVar.c && !aVar.d.b) {
                        return true;
                    }
                }
                continue;
            }
        }
        return i > 1;
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "203886d2326a4e26801f9c1ea858acda", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "203886d2326a4e26801f9c1ea858acda");
        } else if (!this.k) {
            int childCount = getChildCount();
            SparseIntArray sparseIntArray = new SparseIntArray();
            SparseIntArray sparseIntArray2 = new SparseIntArray();
            int i = -1;
            int i2 = Integer.MIN_VALUE;
            for (int i3 = this.i; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                int b = b(childAt);
                if (b >= 0) {
                    sparseIntArray.put(i3, b);
                    sparseIntArray2.put(i3, childAt.getHeight());
                    for (a aVar : this.g) {
                        if (aVar.c == childAt && aVar.d.b && b > i2) {
                            i = i3;
                            i2 = b;
                        }
                    }
                }
            }
            SparseIntArray sparseIntArray3 = new SparseIntArray();
            for (int i4 = 0; i4 < sparseIntArray.size(); i4++) {
                int keyAt = sparseIntArray.keyAt(i4);
                sparseIntArray3.put(keyAt, -sparseIntArray2.get(keyAt));
            }
            if (i != -1) {
                sparseIntArray3.put(i, 0);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            for (int i5 = 0; i5 < sparseIntArray.size(); i5++) {
                final int keyAt2 = sparseIntArray.keyAt(i5);
                ValueAnimator ofInt = ValueAnimator.ofInt(sparseIntArray.get(keyAt2), sparseIntArray3.get(keyAt2));
                ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.waimai.store.view.StickyContainerFrameLayout.5
                    public static ChangeQuickRedirect a;

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Object[] objArr2 = {valueAnimator};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "508d2f5b569b62a5bdf632a1a218ad6a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "508d2f5b569b62a5bdf632a1a218ad6a");
                            return;
                        }
                        View childAt2 = StickyContainerFrameLayout.this.getChildAt(keyAt2);
                        if (childAt2 == null) {
                            return;
                        }
                        StickyContainerFrameLayout.b(childAt2, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                    }
                });
                arrayList.add(ofInt);
            }
            animatorSet.playTogether(arrayList);
            animatorSet.setDuration(e);
            animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.sankuai.waimai.store.view.StickyContainerFrameLayout.6
                public static ChangeQuickRedirect a;

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    Object[] objArr2 = {animator};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "70ef5a6885b2141a0dee4333bcda66e4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "70ef5a6885b2141a0dee4333bcda66e4");
                    } else {
                        StickyContainerFrameLayout.a(StickyContainerFrameLayout.this, false);
                    }
                }
            });
            this.k = true;
            animatorSet.start();
        }
    }

    private void d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a74479d75edf5d4e4cc5f984941ecbe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a74479d75edf5d4e4cc5f984941ecbe");
            return;
        }
        for (a aVar : this.g) {
            if (aVar.b < i) {
                f fVar = aVar.d;
                if (!fVar.b && fVar.c && fVar.getChildCount() > 0) {
                    int height = aVar.c.getHeight();
                    fVar.getLayoutParams().height = height;
                    fVar.removeAllViews();
                    b(aVar.c, -height);
                    addView(aVar.c);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "575f5baf394674f9f312378ec9ad4c39", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "575f5baf394674f9f312378ec9ad4c39")).intValue() : ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "99de68963b813558f990975883082d0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "99de68963b813558f990975883082d0f");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.topMargin = i;
        view.setLayoutParams(marginLayoutParams);
    }

    public int getCurrentStickyHeaderHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64d4defe53b6234c075e847969be4aa6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64d4defe53b6234c075e847969be4aa6")).intValue();
        }
        if (this.f != null) {
            return this.f.c.getHeight();
        }
        return 0;
    }

    private int a(f fVar, int i) {
        Object[] objArr = {fVar, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ee87e7a60b652f7c91e2aa4e232306d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ee87e7a60b652f7c91e2aa4e232306d")).intValue();
        }
        if (fVar.d) {
            return fVar.getOffset();
        }
        return 0;
    }
}
