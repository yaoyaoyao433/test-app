package com.sankuai.waimai.business.search.common.view;

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
import com.sankuai.waimai.business.search.common.util.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class StickyContainerFrameLayout extends FrameLayout {
    public static ChangeQuickRedirect a = null;
    private static int c = 0;
    private static long d = 200;
    public RecyclerView.c b;
    private a e;
    private int f;
    private List<a> g;
    private boolean h;
    private int i;
    private int j;
    private boolean k;

    public static /* synthetic */ void a(StickyContainerFrameLayout stickyContainerFrameLayout, int i, int i2) {
        a aVar;
        com.sankuai.waimai.business.search.common.view.a aVar2;
        int i3;
        int i4;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, stickyContainerFrameLayout, changeQuickRedirect, false, "868a3d96344517edb8aa10d687f37e1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, stickyContainerFrameLayout, changeQuickRedirect, false, "868a3d96344517edb8aa10d687f37e1e");
            return;
        }
        if (stickyContainerFrameLayout.j <= (-c) && stickyContainerFrameLayout.b()) {
            int size = stickyContainerFrameLayout.g.size() - 1;
            while (true) {
                if (size < 0) {
                    i4 = -1;
                    break;
                }
                a aVar3 = stickyContainerFrameLayout.g.get(size);
                if (i2 >= aVar3.b) {
                    i4 = aVar3.b;
                    break;
                }
                size--;
            }
            if (i2 - i4 > 2) {
                stickyContainerFrameLayout.c();
                return;
            }
        }
        if (stickyContainerFrameLayout.e != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) stickyContainerFrameLayout.e.c.getLayoutParams();
            if (marginLayoutParams.topMargin < 0) {
                marginLayoutParams.topMargin -= i;
                if (marginLayoutParams.topMargin >= 0) {
                    marginLayoutParams.topMargin = 0;
                }
                stickyContainerFrameLayout.e.c.setLayoutParams(marginLayoutParams);
                return;
            }
        }
        while (stickyContainerFrameLayout.getChildCount() >= stickyContainerFrameLayout.i + 1) {
            View childAt = stickyContainerFrameLayout.getChildAt(stickyContainerFrameLayout.getChildCount() - 1);
            int b = b(childAt);
            for (int i5 = stickyContainerFrameLayout.i; i5 < stickyContainerFrameLayout.getChildCount(); i5++) {
                View childAt2 = stickyContainerFrameLayout.getChildAt(i5);
                int b2 = b(childAt2);
                if (b2 > b) {
                    childAt = childAt2;
                    b = b2;
                }
            }
            if (b < 0) {
                break;
            }
            Iterator<a> it = stickyContainerFrameLayout.g.iterator();
            while (true) {
                aVar = null;
                if (!it.hasNext()) {
                    aVar2 = null;
                    i3 = -1;
                    break;
                }
                a next = it.next();
                if (next.c == childAt) {
                    aVar2 = next.d;
                    i3 = next.b;
                    break;
                }
            }
            if (aVar2 == null) {
                return;
            }
            int top = aVar2.getTop();
            if (i3 < i2 || top < childAt.getTop() || aVar2.getChildCount() != 0) {
                break;
            }
            int size2 = stickyContainerFrameLayout.g.size() - 1;
            while (true) {
                if (size2 >= 0) {
                    a aVar4 = stickyContainerFrameLayout.g.get(size2);
                    if (aVar4.d.b && i3 > aVar4.b) {
                        aVar = aVar4;
                        break;
                    }
                    size2--;
                }
            }
            stickyContainerFrameLayout.removeView(childAt);
            b(childAt, 0);
            aVar2.addView(childAt);
            stickyContainerFrameLayout.e = aVar;
        }
        for (a aVar5 : stickyContainerFrameLayout.g) {
            int b3 = b(aVar5.c);
            int height = aVar5.c.getHeight();
            int i6 = aVar5.b;
            if (b3 <= (-height) && i6 >= i2 && aVar5.d.getChildCount() == 0) {
                stickyContainerFrameLayout.removeView(aVar5.c);
                b(aVar5.c, 0);
                aVar5.d.addView(aVar5.c);
            }
        }
    }

    public static /* synthetic */ void a(StickyContainerFrameLayout stickyContainerFrameLayout, RecyclerView.LayoutManager layoutManager, int i, int i2) {
        View childAt;
        Object[] objArr = {layoutManager, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, stickyContainerFrameLayout, changeQuickRedirect, false, "1af5e6626bd7d7bbfe8da6e752a8f1b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, stickyContainerFrameLayout, changeQuickRedirect, false, "1af5e6626bd7d7bbfe8da6e752a8f1b6");
        } else if (stickyContainerFrameLayout.f == -1 || stickyContainerFrameLayout.f <= i2) {
            stickyContainerFrameLayout.f = i2;
            for (int i3 = stickyContainerFrameLayout.f == -1 ? 0 : stickyContainerFrameLayout.f; i3 <= i2; i3++) {
                View findViewByPosition = layoutManager.findViewByPosition(i3);
                if (findViewByPosition != null) {
                    if (findViewByPosition instanceof com.sankuai.waimai.business.search.common.view.a) {
                        com.sankuai.waimai.business.search.common.view.a aVar = (com.sankuai.waimai.business.search.common.view.a) findViewByPosition;
                        if ((aVar.b || aVar.c) && (childAt = aVar.getChildAt(0)) != null) {
                            stickyContainerFrameLayout.a(new a(i3, childAt, aVar));
                        }
                    } else {
                        stickyContainerFrameLayout.a(i3);
                    }
                } else {
                    stickyContainerFrameLayout.f = -1;
                }
            }
        }
    }

    public static /* synthetic */ void a(StickyContainerFrameLayout stickyContainerFrameLayout, RecyclerView recyclerView, int i, int i2) {
        Object[] objArr = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, stickyContainerFrameLayout, changeQuickRedirect, false, "9d8470f38e11705c33f2e2dda8c8aa13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, stickyContainerFrameLayout, changeQuickRedirect, false, "9d8470f38e11705c33f2e2dda8c8aa13");
        } else if (stickyContainerFrameLayout.d()) {
            stickyContainerFrameLayout.e();
        } else {
            stickyContainerFrameLayout.d(i);
            com.sankuai.waimai.business.search.common.view.a aVar = null;
            int i3 = -1;
            int childCount = recyclerView.getChildCount();
            int i4 = 0;
            while (true) {
                if (i4 >= childCount) {
                    break;
                }
                View childAt = recyclerView.getChildAt(i4);
                if (childAt instanceof com.sankuai.waimai.business.search.common.view.a) {
                    com.sankuai.waimai.business.search.common.view.a aVar2 = (com.sankuai.waimai.business.search.common.view.a) childAt;
                    if (aVar2.b) {
                        i3 = recyclerView.getChildAdapterPosition(childAt);
                        aVar = aVar2;
                    }
                } else {
                    i4++;
                }
            }
            if (aVar == null) {
                a b = stickyContainerFrameLayout.b(i);
                if (b == stickyContainerFrameLayout.e || b == null) {
                    return;
                }
                stickyContainerFrameLayout.e = b;
                stickyContainerFrameLayout.c(stickyContainerFrameLayout.e.b);
                return;
            }
            int top = aVar.getTop();
            int height = stickyContainerFrameLayout.e == null ? 0 : stickyContainerFrameLayout.e.c.getHeight();
            if (top > 0) {
                if (top <= height) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) stickyContainerFrameLayout.e.c.getLayoutParams();
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
                        stickyContainerFrameLayout.e.c.setLayoutParams(marginLayoutParams);
                    }
                }
            } else if (aVar.getChildCount() > 0) {
                if (stickyContainerFrameLayout.e != null) {
                    b(stickyContainerFrameLayout.e.c, -height);
                }
                stickyContainerFrameLayout.e = stickyContainerFrameLayout.b(i3);
                if (stickyContainerFrameLayout.e == null || stickyContainerFrameLayout.e.d.getChildCount() <= 0) {
                    return;
                }
                stickyContainerFrameLayout.e.d.getLayoutParams().height = aVar.getHeight();
                stickyContainerFrameLayout.e.d.removeAllViews();
                b(stickyContainerFrameLayout.e.c, 0);
                if (stickyContainerFrameLayout.e.c.getParent() == null) {
                    stickyContainerFrameLayout.addView(stickyContainerFrameLayout.e.c);
                }
            }
        }
    }

    public static /* synthetic */ void a(StickyContainerFrameLayout stickyContainerFrameLayout, boolean z, int i, int i2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, stickyContainerFrameLayout, changeQuickRedirect, false, "18b0ba555a6b3e4b94d271cc398323a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, stickyContainerFrameLayout, changeQuickRedirect, false, "18b0ba555a6b3e4b94d271cc398323a4");
        } else if (stickyContainerFrameLayout.g != null && stickyContainerFrameLayout.g.size() != 0) {
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
    /* loaded from: classes4.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public int b;
        @NonNull
        public View c;
        @NonNull
        public com.sankuai.waimai.business.search.common.view.a d;

        public a(int i, @NonNull View view, @NonNull com.sankuai.waimai.business.search.common.view.a aVar) {
            Object[] objArr = {Integer.valueOf(i), view, aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5cdf7be00c65de63fb9697bfe98b30e1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5cdf7be00c65de63fb9697bfe98b30e1");
                return;
            }
            this.b = i;
            this.c = view;
            this.d = aVar;
        }

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85bc252d46afed72ccb663540776f5fd", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85bc252d46afed72ccb663540776f5fd");
            }
            return "[" + this.b + ", " + this.d + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT;
        }
    }

    public StickyContainerFrameLayout(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d91c58dc59606a0e17b6327e1b140867", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d91c58dc59606a0e17b6327e1b140867");
            return;
        }
        this.f = -1;
        this.g = new ArrayList();
        this.j = 0;
        this.k = false;
    }

    public StickyContainerFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36600455b94771622fa32cdcf6fbaeb4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36600455b94771622fa32cdcf6fbaeb4");
            return;
        }
        this.f = -1;
        this.g = new ArrayList();
        this.j = 0;
        this.k = false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        try {
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "977c35858b494d17c8df1ce7e2a1abaa", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "977c35858b494d17c8df1ce7e2a1abaa");
                return;
            }
            this.h = true;
            super.onLayout(z, i, i2, i3, i4);
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.b(e);
            e.printStackTrace();
        } finally {
            this.h = false;
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5792f03304d0e80d5c1311b9866b29f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5792f03304d0e80d5c1311b9866b29f");
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
        recyclerView.addOnScrollListener(new RecyclerView.k() { // from class: com.sankuai.waimai.business.search.common.view.StickyContainerFrameLayout.1
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrollStateChanged(RecyclerView recyclerView2, int i2) {
                int i3;
                Object[] objArr2 = {recyclerView2, Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7fa20e8124384ca2d13b43c119e4150a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7fa20e8124384ca2d13b43c119e4150a");
                    return;
                }
                super.onScrollStateChanged(recyclerView2, i2);
                if (i2 == 0) {
                    StickyContainerFrameLayout.this.j = 0;
                    if (StickyContainerFrameLayout.this.e != null) {
                        int b = StickyContainerFrameLayout.b(StickyContainerFrameLayout.this.e.c);
                        int height = StickyContainerFrameLayout.this.e.c.getHeight();
                        if (b >= 0 || b <= (i3 = -height)) {
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
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "081d14519c5dcc3578a6bc85f091e94b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "081d14519c5dcc3578a6bc85f091e94b");
                    return;
                }
                super.onScrolled(recyclerView2, i2, i3);
                if (StickyContainerFrameLayout.this.h) {
                    return;
                }
                RecyclerView.LayoutManager layoutManager = recyclerView2.getLayoutManager();
                boolean z = layoutManager instanceof LinearLayoutManager;
                if (z || (layoutManager instanceof StaggeredGridLayoutManager)) {
                    Object[] objArr3 = {layoutManager};
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.search.ui.result.utils.a.a;
                    int i4 = -1;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "1180f39d2c283136be4d4e6451fb23d1", RobustBitConfig.DEFAULT_VALUE)) {
                        i4 = ((Integer) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "1180f39d2c283136be4d4e6451fb23d1")).intValue();
                    } else if (layoutManager != null) {
                        if (z) {
                            i4 = ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
                        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
                            i4 = com.sankuai.waimai.business.search.ui.result.utils.a.a(((StaggeredGridLayoutManager) layoutManager).findFirstVisibleItemPositions(null));
                        }
                    }
                    StickyContainerFrameLayout.a(StickyContainerFrameLayout.this, layoutManager, i4, com.sankuai.waimai.business.search.ui.result.utils.a.a(layoutManager));
                    StickyContainerFrameLayout.this.j += i3;
                    if (StickyContainerFrameLayout.this.k) {
                        return;
                    }
                    if (i3 > 0) {
                        StickyContainerFrameLayout.a(StickyContainerFrameLayout.this, recyclerView2, i4, i3);
                    }
                    if (i3 < 0) {
                        StickyContainerFrameLayout.a(StickyContainerFrameLayout.this, i3, i4);
                    }
                }
            }
        });
        this.b = new RecyclerView.c() { // from class: com.sankuai.waimai.business.search.common.view.StickyContainerFrameLayout.2
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.c
            public final void onItemRangeInserted(int i2, int i3) {
                Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "927d2b206fc9ba87759f24d8f13bc24e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "927d2b206fc9ba87759f24d8f13bc24e");
                } else {
                    StickyContainerFrameLayout.a(StickyContainerFrameLayout.this, true, i2, i3);
                }
            }

            @Override // android.support.v7.widget.RecyclerView.c
            public final void onItemRangeRemoved(int i2, int i3) {
                Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1786c5f8d9d319e633b6350559f07061", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1786c5f8d9d319e633b6350559f07061");
                } else {
                    StickyContainerFrameLayout.a(StickyContainerFrameLayout.this, false, i2, i3);
                }
            }
        };
        c = l.a(getContext()) / 5;
    }

    private void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b2cf0c924f47a37b3b3536402471f71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b2cf0c924f47a37b3b3536402471f71");
            return;
        }
        Iterator<a> it = this.g.iterator();
        while (it.hasNext()) {
            if (it.next().b == i) {
                it.remove();
            }
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ba5e08c8705f1c81953490b4043d474", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ba5e08c8705f1c81953490b4043d474");
            return;
        }
        this.e = null;
        this.f = -1;
        for (int size = this.g.size() - 1; size >= 0; size--) {
            a aVar = this.g.get(size);
            b(aVar.c, 0);
            if (aVar.d.getChildCount() == 0) {
                removeView(aVar.c);
                aVar.d.addView(aVar.c);
            }
            this.g.remove(size);
        }
    }

    @Nullable
    private a b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2fc486fe1c8e1b39c8ded06742579af", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2fc486fe1c8e1b39c8ded06742579af");
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
        int i2 = 1;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0267ffa21b08e409249c904856db5168", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0267ffa21b08e409249c904856db5168");
            return;
        }
        for (a aVar : this.g) {
            if (i >= aVar.b) {
                int i3 = i == aVar.b ? 0 : -aVar.c.getHeight();
                Object[] objArr2 = new Object[2];
                objArr2[0] = aVar;
                objArr2[i2] = Integer.valueOf(i3);
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "92bd0273458320af91b499f3d85a81ba", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "92bd0273458320af91b499f3d85a81ba");
                } else {
                    b(aVar.c, i3);
                    if (aVar.d.getChildCount() > 0) {
                        aVar.d.removeAllViews();
                        aVar.d.getLayoutParams().height = aVar.c.getHeight();
                        if (aVar.c.getParent() == null) {
                            addView(aVar.c);
                        }
                    }
                }
                i2 = 1;
            } else {
                Object[] objArr3 = new Object[i2];
                objArr3[0] = aVar;
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2a45ed0730b1be9f36b50845e6e37b84", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2a45ed0730b1be9f36b50845e6e37b84");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7a3df9dd7ca27b322f3f5c27e6d38c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7a3df9dd7ca27b322f3f5c27e6d38c5");
            return;
        }
        for (a aVar2 : this.g) {
            if (aVar2.b == aVar.b) {
                return;
            }
        }
        this.g.add(aVar);
    }

    private boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e59c41eb57b9c40f82f42fd066654377", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e59c41eb57b9c40f82f42fd066654377")).booleanValue();
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

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d2e24ba404cf19197f3d45e35e5e974", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d2e24ba404cf19197f3d45e35e5e974");
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
                ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.waimai.business.search.common.view.StickyContainerFrameLayout.3
                    public static ChangeQuickRedirect a;

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Object[] objArr2 = {valueAnimator};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "50f094ff070e496d93632cd69489b05d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "50f094ff070e496d93632cd69489b05d");
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
            animatorSet.setDuration(d);
            animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.sankuai.waimai.business.search.common.view.StickyContainerFrameLayout.4
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
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e7b711037df10a1aaef43d4c47361eb1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e7b711037df10a1aaef43d4c47361eb1");
                    } else {
                        StickyContainerFrameLayout.a(StickyContainerFrameLayout.this, false);
                    }
                }
            });
            this.k = true;
            animatorSet.start();
        }
    }

    private boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f36395667515287f82a721779621a48", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f36395667515287f82a721779621a48")).booleanValue();
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

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a1137e626e8659fcddcc1765b67066a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a1137e626e8659fcddcc1765b67066a");
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
                ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.waimai.business.search.common.view.StickyContainerFrameLayout.5
                    public static ChangeQuickRedirect a;

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Object[] objArr2 = {valueAnimator};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f97ac8d0640f3119b6e2116d694312d0", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f97ac8d0640f3119b6e2116d694312d0");
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
            animatorSet.setDuration(d);
            animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.sankuai.waimai.business.search.common.view.StickyContainerFrameLayout.6
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
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "40aed8b0bdbb64e0b070c859edc96680", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "40aed8b0bdbb64e0b070c859edc96680");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7db0a521a1b39838164221d81873ff20", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7db0a521a1b39838164221d81873ff20");
            return;
        }
        for (a aVar : this.g) {
            if (aVar.b < i) {
                com.sankuai.waimai.business.search.common.view.a aVar2 = aVar.d;
                if (!aVar2.b && aVar2.c && aVar2.getChildCount() > 0) {
                    int height = aVar.c.getHeight();
                    aVar2.getLayoutParams().height = height;
                    aVar2.removeAllViews();
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
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2fdb29390afc7f764f012a6190c2922f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2fdb29390afc7f764f012a6190c2922f")).intValue() : ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "061c537cc13a266cea8f37da1900cff0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "061c537cc13a266cea8f37da1900cff0");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.topMargin = i;
        view.setLayoutParams(marginLayoutParams);
    }

    public int getCurrentStickyHeaderHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc10371b54a93fac1c4e984f967cb493", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc10371b54a93fac1c4e984f967cb493")).intValue();
        }
        if (this.e != null) {
            return this.e.c.getHeight();
        }
        return 0;
    }
}
