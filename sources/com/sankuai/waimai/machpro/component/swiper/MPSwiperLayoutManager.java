package com.sankuai.waimai.machpro.component.swiper;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
import java.util.LinkedList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MPSwiperLayoutManager extends RecyclerView.LayoutManager {
    public static ChangeQuickRedirect a;
    int b;
    int c;
    int d;
    boolean e;
    float f;
    a g;
    boolean h;
    private int i;
    private MPSwiperRecyclerView j;
    private boolean k;
    private Scroller l;
    private RecyclerView.m m;
    private RecyclerView.k n;
    private RecyclerView.i o;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(int i);

        void b(int i);
    }

    public MPSwiperLayoutManager(MPSwiperRecyclerView mPSwiperRecyclerView) {
        Object[] objArr = {mPSwiperRecyclerView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf9525b71dd82eae2ec72fabbb739612", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf9525b71dd82eae2ec72fabbb739612");
            return;
        }
        this.b = 0;
        this.d = 0;
        this.i = -1;
        this.e = true;
        this.f = 1.0f;
        this.n = new RecyclerView.k() { // from class: com.sankuai.waimai.machpro.component.swiper.MPSwiperLayoutManager.1
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cf8f3e9a54aedc6e266118ab286c8b68", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cf8f3e9a54aedc6e266118ab286c8b68");
                    return;
                }
                super.onScrollStateChanged(recyclerView, i);
                if (i != 0 || MPSwiperLayoutManager.this.a()) {
                    return;
                }
                MPSwiperLayoutManager.this.a(MPSwiperLayoutManager.this.m);
            }
        };
        this.o = new RecyclerView.i() { // from class: com.sankuai.waimai.machpro.component.swiper.MPSwiperLayoutManager.2
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.i
            public final boolean onFling(int i, int i2) {
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9dc59e5311985aeb9602e470a9c5b6d4", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9dc59e5311985aeb9602e470a9c5b6d4")).booleanValue();
                }
                int minFlingVelocity = MPSwiperLayoutManager.this.j.getMinFlingVelocity();
                MPSwiperLayoutManager.this.l.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                if (MPSwiperLayoutManager.this.j.getLayoutManager() instanceof MPSwiperLayoutManager) {
                    MPSwiperLayoutManager mPSwiperLayoutManager = (MPSwiperLayoutManager) MPSwiperLayoutManager.this.j.getLayoutManager();
                    if (mPSwiperLayoutManager.b == 1 && Math.abs(i2) > minFlingVelocity) {
                        int i3 = mPSwiperLayoutManager.d;
                        MPSwiperLayoutManager.this.j.smoothScrollToPosition(i2 > 0 ? i3 + 1 : i3 - 1);
                        return true;
                    } else if (mPSwiperLayoutManager.b != 0 || Math.abs(i) <= minFlingVelocity) {
                        return false;
                    } else {
                        int i4 = mPSwiperLayoutManager.d;
                        MPSwiperLayoutManager.this.j.smoothScrollToPosition(i > 0 ? i4 + 1 : i4 - 1);
                        return true;
                    }
                }
                return false;
            }
        };
        this.j = mPSwiperRecyclerView;
        this.j.removeOnScrollListener(this.n);
        this.j.addOnScrollListener(this.n);
        this.l = new Scroller(this.j.getContext(), new DecelerateInterpolator());
        this.j.setOnFlingListener(this.o);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public RecyclerView.g generateDefaultLayoutParams() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60cb80a054f248604e551044abd55705", RobustBitConfig.DEFAULT_VALUE) ? (RecyclerView.g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60cb80a054f248604e551044abd55705") : new RecyclerView.g(-2, -2);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.m mVar, RecyclerView.State state) {
        Object[] objArr = {mVar, state};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "328533015c2a0960e4f2fcfd4f549eaa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "328533015c2a0960e4f2fcfd4f549eaa");
            return;
        }
        this.m = mVar;
        detachAndScrapAttachedViews(mVar);
        int i = this.d;
        if (this.i != -1 && this.i >= 0 && this.i < getItemCount()) {
            i = this.i;
            this.i = -1;
        }
        this.k = true;
        if (d()) {
            a(getWidth(), i, mVar);
        } else {
            b(getHeight(), i, mVar);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(RecyclerView.State state) {
        Object[] objArr = {state};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38e7b4da4f64879576b3574e39c355e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38e7b4da4f64879576b3574e39c355e0");
        } else {
            super.onLayoutCompleted(state);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        Object[] objArr = {recyclerView, state, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a98c995c236cccaac7221787fce593e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a98c995c236cccaac7221787fce593e0");
        } else if (i >= 0 && i < getItemCount()) {
            this.d = i;
            View findViewByPosition = findViewByPosition(i);
            if (findViewByPosition != null) {
                if (d()) {
                    this.j.smoothScrollBy(findViewByPosition.getLeft() - (this.e ? (getWidth() - findViewByPosition.getWidth()) / 2 : 0), 0);
                    return;
                } else {
                    this.j.smoothScrollBy(0, findViewByPosition.getTop() - (this.e ? (getHeight() - findViewByPosition.getHeight()) / 2 : 0));
                    return;
                }
            }
            a();
        } else {
            a();
        }
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ae1ddd40b9fac94d473f80e45ed31e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ae1ddd40b9fac94d473f80e45ed31e2");
        } else if (i < 0 || i >= getItemCount()) {
        } else {
            this.i = i;
            this.d = this.i;
            this.k = true;
            requestLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82c504b7278f7550869ce430f07f4fd5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82c504b7278f7550869ce430f07f4fd5")).booleanValue();
        }
        if (d()) {
            return b();
        }
        return c();
    }

    private boolean b() {
        View view;
        int width;
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f6886b349f239b334eca0ea9a2208a0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f6886b349f239b334eca0ea9a2208a0")).booleanValue();
        }
        int width2 = getWidth() / 2;
        int i = 0;
        while (true) {
            if (i >= getChildCount()) {
                view = null;
                break;
            }
            view = getChildAt(i);
            if (view != null) {
                width = this.e ? (getWidth() - view.getWidth()) / 2 : 0;
                if (view.getLeft() == width2 || view.getRight() == width2) {
                    break;
                } else if ((view.getLeft() < width2 || view.getLeft() - this.c < width2) && view.getRight() > width2) {
                    if (!this.e && this.f == 1.0f && getPosition(view) == getItemCount() - 1) {
                        width = getWidth() - view.getWidth();
                    }
                    int left = view.getLeft() - width;
                    if (left != 0) {
                        this.j.smoothScrollBy(left, 0);
                    }
                }
            }
            i++;
        }
        this.j.smoothScrollBy(view.getLeft() - width, 0);
        z = true;
        if (view != null) {
            this.d = getPosition(view);
            if (this.g != null) {
                this.g.b(this.d);
            }
        }
        return z;
    }

    private boolean c() {
        View view;
        int height;
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e67e04bf75204c2bc75d5628527e2b10", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e67e04bf75204c2bc75d5628527e2b10")).booleanValue();
        }
        int height2 = getHeight() / 2;
        int i = 0;
        while (true) {
            if (i >= getChildCount()) {
                view = null;
                break;
            }
            view = getChildAt(i);
            if (view != null) {
                height = this.e ? (getHeight() - view.getHeight()) / 2 : 0;
                if (view.getTop() == height2 || view.getBottom() == height2) {
                    break;
                } else if ((view.getTop() < height2 || view.getTop() - this.c < height2) && view.getBottom() > height2) {
                    if (!this.e && this.f == 1.0f && getPosition(view) == getItemCount() - 1) {
                        height = getHeight() - view.getHeight();
                    }
                    int top = view.getTop() - height;
                    if (top != 0) {
                        this.j.smoothScrollBy(0, top);
                    }
                }
            }
            i++;
        }
        this.j.smoothScrollBy(0, view.getTop() - height);
        z = true;
        if (view != null) {
            this.d = getPosition(view);
            if (this.g != null) {
                this.g.b(this.d);
            }
        }
        return z;
    }

    private boolean d() {
        return this.b == 0;
    }

    private boolean e() {
        return this.b == 1;
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "885d58b0f3dd0ca3da84fe6a407593f2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "885d58b0f3dd0ca3da84fe6a407593f2")).booleanValue() : d();
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i, RecyclerView.m mVar, RecyclerView.State state) {
        Object[] objArr = {Integer.valueOf(i), mVar, state};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "434e9016c204709ff7c14ef6d18f704f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "434e9016c204709ff7c14ef6d18f704f")).intValue();
        }
        int a2 = a(i, 0, mVar);
        a(a2);
        offsetChildrenHorizontal(-a2);
        b(a2);
        b(i, mVar);
        return a2;
    }

    private void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea191d1614e58bb5063de2cceb4263e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea191d1614e58bb5063de2cceb4263e8");
            return;
        }
        int width = getWidth() / 2;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt != null) {
                if (i > 0) {
                    if (childAt.getLeft() > width && childAt.getLeft() - i < width && this.g != null) {
                        this.g.a(getPosition(childAt));
                    }
                } else if (i < 0 && childAt.getRight() < width && childAt.getRight() - i > width && this.g != null) {
                    this.g.a(getPosition(childAt));
                }
            }
        }
    }

    private void b(int i) {
        int width;
        float f;
        int width2;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a93c0b1f480a9ab2d4af45ba6427c646", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a93c0b1f480a9ab2d4af45ba6427c646");
        } else if (this.f != 1.0f) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                if (childAt != null && childAt.getRight() >= 0 && childAt.getLeft() <= getWidth() && i != 0) {
                    float width3 = childAt.getWidth() + this.c;
                    if (i > 0) {
                        float abs = Math.abs(childAt.getLeft() - width2) / width3;
                        if (childAt.getLeft() < (this.e ? (getWidth() - childAt.getWidth()) / 2 : 0)) {
                            f = 1.0f - (abs * (1.0f - this.f));
                        } else {
                            f = ((1.0f - abs) * (1.0f - this.f)) + this.f;
                        }
                    } else {
                        float abs2 = Math.abs(childAt.getRight() - width) / width3;
                        if (childAt.getRight() < (this.e ? ((getWidth() - childAt.getWidth()) / 2) + childAt.getWidth() : childAt.getWidth())) {
                            f = ((1.0f - abs2) * (1.0f - this.f)) + this.f;
                        } else {
                            f = 1.0f - (abs2 * (1.0f - this.f));
                        }
                    }
                    childAt.setScaleX(f);
                    childAt.setScaleY(f);
                }
            }
        }
    }

    private void c(int i) {
        int height;
        float f;
        int height2;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37d300856802967bd3928424e515460a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37d300856802967bd3928424e515460a");
        } else if (this.f != 1.0f) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                if (childAt != null && childAt.getBottom() >= 0 && childAt.getTop() <= getHeight() && i != 0) {
                    float height3 = childAt.getHeight() + this.c;
                    if (i > 0) {
                        float abs = Math.abs(childAt.getTop() - height2) / height3;
                        if (childAt.getTop() < (this.e ? (getHeight() - childAt.getHeight()) / 2 : 0)) {
                            f = 1.0f - (abs * (1.0f - this.f));
                        } else {
                            f = ((1.0f - abs) * (1.0f - this.f)) + this.f;
                        }
                    } else {
                        float abs2 = Math.abs(childAt.getBottom() - height) / height3;
                        if (childAt.getBottom() < (this.e ? ((getHeight() - childAt.getHeight()) / 2) + childAt.getHeight() : childAt.getHeight())) {
                            f = ((1.0f - abs2) * (1.0f - this.f)) + this.f;
                        } else {
                            f = 1.0f - (abs2 * (1.0f - this.f));
                        }
                    }
                    childAt.setScaleX(f);
                    childAt.setScaleY(f);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0197 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int a(int r19, int r20, android.support.v7.widget.RecyclerView.m r21) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.machpro.component.swiper.MPSwiperLayoutManager.a(int, int, android.support.v7.widget.RecyclerView$m):int");
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33f6957e76932997d82eccccc0775361", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33f6957e76932997d82eccccc0775361")).booleanValue() : e();
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, RecyclerView.m mVar, RecyclerView.State state) {
        Object[] objArr = {Integer.valueOf(i), mVar, state};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8d8fdc2f7cbb66b7945a582966ce402", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8d8fdc2f7cbb66b7945a582966ce402")).intValue();
        }
        int b = b(i, 0, mVar);
        d(b);
        offsetChildrenVertical(-b);
        c(b);
        a(b, mVar);
        return b;
    }

    private void d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "017985f1ead092973d8d42ac2dcdecda", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "017985f1ead092973d8d42ac2dcdecda");
            return;
        }
        int height = getHeight() / 2;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt != null) {
                if (i > 0) {
                    if (childAt.getTop() > height && childAt.getTop() - i < height && this.g != null) {
                        this.g.a(getPosition(childAt));
                    }
                } else if (i < 0 && childAt.getBottom() < height && childAt.getBottom() - i > height && this.g != null) {
                    this.g.a(getPosition(childAt));
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0199 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int b(int r19, int r20, android.support.v7.widget.RecyclerView.m r21) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.machpro.component.swiper.MPSwiperLayoutManager.b(int, int, android.support.v7.widget.RecyclerView$m):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(RecyclerView.m mVar) {
        Object[] objArr = {mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6be8cc7f57588be3b6b0191b90b9442b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6be8cc7f57588be3b6b0191b90b9442b");
        } else if (getChildCount() <= 0) {
        } else {
            try {
                if (e()) {
                    if (this.e || this.h) {
                        c(mVar);
                    }
                } else if (d()) {
                    if (this.e || this.h) {
                        b(mVar);
                    }
                }
            } catch (Exception e) {
                com.sankuai.waimai.machpro.util.a.a(e.getMessage());
            }
        }
    }

    private void b(RecyclerView.m mVar) {
        int position;
        int position2;
        Object[] objArr = {mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8649449f99569615386ef2a1f2d7764", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8649449f99569615386ef2a1f2d7764");
            return;
        }
        View childAt = getChildAt(getChildCount() - 1);
        if (childAt.getLeft() <= getWidth() && (position2 = getPosition(childAt) + 1) < getItemCount()) {
            View b = mVar.b(position2);
            addView(b);
            measureChild(b, 0, 0);
            int height = (getHeight() - getDecoratedMeasuredHeight(b)) / 2;
            int decoratedMeasuredHeight = height + getDecoratedMeasuredHeight(b);
            int right = this.c + childAt.getRight();
            layoutDecorated(b, right, height, right + getDecoratedMeasuredWidth(b), decoratedMeasuredHeight);
        }
        View childAt2 = getChildAt(0);
        if (childAt2.getLeft() > 0 || (position = getPosition(childAt2) - 1) < 0) {
            return;
        }
        View b2 = mVar.b(position);
        addView(b2, 0);
        measureChild(b2, 0, 0);
        int height2 = (getHeight() - getDecoratedMeasuredHeight(b2)) / 2;
        int decoratedMeasuredHeight2 = height2 + getDecoratedMeasuredHeight(b2);
        int left = childAt2.getLeft() - this.c;
        layoutDecorated(b2, left - getDecoratedMeasuredWidth(b2), height2, left, decoratedMeasuredHeight2);
    }

    private void c(RecyclerView.m mVar) {
        int position;
        int position2;
        Object[] objArr = {mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da6f15687288d6a8f34e3d8b1426120b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da6f15687288d6a8f34e3d8b1426120b");
            return;
        }
        View childAt = getChildAt(getChildCount() - 1);
        if (childAt.getTop() <= getHeight() && (position2 = getPosition(childAt) + 1) < getItemCount()) {
            View b = mVar.b(position2);
            addView(b);
            measureChild(b, 0, 0);
            int bottom = childAt.getBottom() + this.c;
            int decoratedMeasuredHeight = bottom + getDecoratedMeasuredHeight(b);
            int width = (getWidth() - getDecoratedMeasuredWidth(b)) / 2;
            layoutDecorated(b, width, bottom, width + getDecoratedMeasuredWidth(b), decoratedMeasuredHeight);
        }
        View childAt2 = getChildAt(0);
        if (childAt2.getTop() > 0 || (position = getPosition(childAt2) - 1) < 0) {
            return;
        }
        View b2 = mVar.b(position);
        addView(b2, 0);
        measureChild(b2, 0, 0);
        int top = childAt2.getTop() - this.c;
        int decoratedMeasuredHeight2 = top - getDecoratedMeasuredHeight(b2);
        int width2 = (getWidth() - getDecoratedMeasuredWidth(b2)) / 2;
        layoutDecorated(b2, width2, decoratedMeasuredHeight2, width2 + getDecoratedMeasuredWidth(b2), top);
    }

    private void a(int i, RecyclerView.m mVar) {
        Object[] objArr = {Integer.valueOf(i), mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "989dbcf119f071aae881addb8c46b6ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "989dbcf119f071aae881addb8c46b6ab");
            return;
        }
        LinkedList linkedList = new LinkedList();
        if (i > 0) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                if (getDecoratedBottom(childAt) > 0) {
                    break;
                }
                linkedList.add(childAt);
            }
        } else if (i < 0) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt2 = getChildAt(childCount);
                if (getDecoratedTop(childAt2) <= getHeight() + 1) {
                    break;
                }
                linkedList.add(childAt2);
            }
        }
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            removeAndRecycleView((View) it.next(), mVar);
        }
        linkedList.clear();
    }

    private void b(int i, RecyclerView.m mVar) {
        Object[] objArr = {Integer.valueOf(i), mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce928c1027c0a667236b13597679a014", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce928c1027c0a667236b13597679a014");
            return;
        }
        LinkedList linkedList = new LinkedList();
        if (i > 0) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                if (getDecoratedRight(childAt) > 0) {
                    break;
                }
                linkedList.add(childAt);
            }
        } else if (i < 0) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt2 = getChildAt(childCount);
                if (getDecoratedLeft(childAt2) <= getWidth() + 1) {
                    break;
                }
                linkedList.add(childAt2);
            }
        }
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            removeAndRecycleView((View) it.next(), mVar);
        }
        linkedList.clear();
    }
}
