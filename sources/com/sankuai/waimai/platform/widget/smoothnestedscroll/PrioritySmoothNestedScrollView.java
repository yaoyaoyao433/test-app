package com.sankuai.waimai.platform.widget.smoothnestedscroll;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ai;
import com.sankuai.waimai.foundation.utils.log.b;
import com.sankuai.waimai.foundation.utils.o;
import com.sankuai.waimai.platform.widget.smoothnestedscroll.base.SmoothNestedScrollView;
import com.sankuai.waimai.platform.widget.smoothnestedscroll.core.c;
import com.sankuai.waimai.platform.widget.smoothnestedscroll.core.e;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class PrioritySmoothNestedScrollView extends SmoothNestedScrollView implements e {
    public static ChangeQuickRedirect a;
    private String d;
    private boolean e;
    private final ai<View> f;
    private final int[] g;
    private final ai<View> h;
    private int i;
    private a j;
    private boolean k;
    private float l;
    private float m;
    private boolean n;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
    }

    public void setNestedScrollEnabled(boolean z) {
        this.k = z;
    }

    public PrioritySmoothNestedScrollView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c541c99d72ceef0cda5ecaac658d410", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c541c99d72ceef0cda5ecaac658d410");
            return;
        }
        this.d = "FlingScrollView";
        this.e = true;
        this.f = new ai<>();
        this.g = new int[2];
        this.h = new ai<>();
        this.k = true;
        a(context, null);
    }

    public PrioritySmoothNestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fbc1234da098f50c8391d94ea94e61d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fbc1234da098f50c8391d94ea94e61d");
            return;
        }
        this.d = "FlingScrollView";
        this.e = true;
        this.f = new ai<>();
        this.g = new int[2];
        this.h = new ai<>();
        this.k = true;
        a(context, attributeSet);
    }

    private void a(Context context, @Nullable AttributeSet attributeSet) {
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb16aa977c6ef013205792e7b95b02b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb16aa977c6ef013205792e7b95b02b3");
            return;
        }
        this.d = new b(this.d).append(Constants.SPACE).a(context, getId()).toString();
        this.e = true;
    }

    public void setMatchSizeChild(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c875a969183c8125ee2ac97d43edfcb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c875a969183c8125ee2ac97d43edfcb");
            return;
        }
        Object[] objArr2 = {view, 0};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1665f0248142995e165cade009e4d015", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1665f0248142995e165cade009e4d015");
            return;
        }
        this.f.a(view);
        this.i = 0;
    }

    public View getMatchSizeChild() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65bd92ac0304180f4fb0989076078a89", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65bd92ac0304180f4fb0989076078a89") : this.f.a();
    }

    public int getChildSizeOffset() {
        return this.i;
    }

    @Override // android.support.v4.widget.NestedScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f156bc27ead375cfdb7344476e08bbb5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f156bc27ead375cfdb7344476e08bbb5");
            return;
        }
        View a2 = this.f.a();
        if (a2 == null) {
            super.onMeasure(i, i2);
            return;
        }
        int defaultSize = getDefaultSize(getSuggestedMinimumWidth(), i);
        int defaultSize2 = getDefaultSize(getSuggestedMinimumHeight(), i2);
        int childSizeOffset = defaultSize2 - getChildSizeOffset();
        Object[] objArr2 = {a2, Integer.valueOf(defaultSize), Integer.valueOf(childSizeOffset)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "955900b500ab7912ff0baccd52bbe32f", RobustBitConfig.DEFAULT_VALUE)) {
            ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "955900b500ab7912ff0baccd52bbe32f")).booleanValue();
        } else {
            ViewGroup.LayoutParams layoutParams = a2.getLayoutParams();
            if (layoutParams != null) {
                if (defaultSize != 0) {
                    layoutParams.width = defaultSize;
                }
                if (childSizeOffset != 0) {
                    layoutParams.height = childSizeOffset;
                }
                a2.setLayoutParams(layoutParams);
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(defaultSize, 1073741824), View.MeasureSpec.makeMeasureSpec(defaultSize2, 1073741824));
    }

    @Override // com.sankuai.waimai.platform.widget.smoothnestedscroll.base.SmoothNestedScrollView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5358eb51a4c15aa4b87da554eddb7d3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5358eb51a4c15aa4b87da554eddb7d3")).booleanValue();
        }
        this.c.a();
        if (!this.e) {
            switch (motionEvent.getAction()) {
                case 0:
                    this.l = motionEvent.getRawX();
                    this.m = motionEvent.getRawY();
                    this.n = false;
                    break;
                case 1:
                    if (this.n) {
                        return false;
                    }
                    break;
                case 2:
                    float abs = Math.abs(motionEvent.getRawX() - this.l);
                    float abs2 = Math.abs(motionEvent.getRawY() - this.m);
                    if (abs > ViewConfiguration.get(getContext()).getScaledTouchSlop() || abs2 > ViewConfiguration.get(getContext()).getScaledTouchSlop()) {
                        this.n = true;
                    }
                    return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setScrollable(boolean z) {
        this.e = z;
    }

    @Override // android.support.v4.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        Object[] objArr = {view, view2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba6f9393dca9ed541063a8d3b8e39ab1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba6f9393dca9ed541063a8d3b8e39ab1")).booleanValue();
        }
        if ((i & 2) == 0) {
            return false;
        }
        View a2 = this.h.a();
        if (a2 == null || a2 == view2) {
            this.h.a(view2);
            return super.onStartNestedScroll(view, view2, i);
        }
        return false;
    }

    @Override // android.support.v4.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18b9c0bb4c19565115c006035fe6d9e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18b9c0bb4c19565115c006035fe6d9e4");
        } else if (this.k) {
            super.onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // android.support.v4.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public void onStopNestedScroll(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f85ed479a6ea9a5583cfe4662f71d301", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f85ed479a6ea9a5583cfe4662f71d301");
            return;
        }
        super.onStopNestedScroll(view);
        this.h.a(null);
    }

    @Override // android.support.v4.widget.NestedScrollView, android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        int b;
        int i3 = 0;
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f76f58d1612eefa939884e78b7912df8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f76f58d1612eefa939884e78b7912df8");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.b(this.d, "onNestedPreScroll, dx = %d, dy = %d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i2 == 0) {
            super.onNestedPreScroll(view, i, i2, iArr);
            return;
        }
        if (i2 > 0) {
            Object[] objArr2 = {view, Integer.valueOf(i), Integer.valueOf(i2), iArr};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "748b99e447b8c241af935a97422dc2bb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "748b99e447b8c241af935a97422dc2bb");
            } else {
                this.g[0] = 0;
                this.g[1] = 0;
                super.onNestedPreScroll(view, i, i2, this.g);
                iArr[0] = iArr[0] + this.g[0];
                iArr[1] = iArr[1] + this.g[1];
            }
            int i4 = i2 - iArr[1];
            if (i4 != 0) {
                Object[] objArr3 = {Integer.valueOf(i4)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "66886d9f1088f0256801990e38f96a34", RobustBitConfig.DEFAULT_VALUE)) {
                    i3 = ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "66886d9f1088f0256801990e38f96a34")).intValue();
                } else if (i4 != 0) {
                    int computeVerticalScrollOffset = computeVerticalScrollOffset();
                    int computeVerticalScrollRange = computeVerticalScrollRange() - computeVerticalScrollExtent();
                    if (computeVerticalScrollRange != 0 && (b = o.b(computeVerticalScrollOffset + i4, 0, computeVerticalScrollRange)) != computeVerticalScrollOffset) {
                        scrollTo(0, b);
                        int i5 = b - computeVerticalScrollOffset;
                        Object[] objArr4 = {Integer.valueOf(computeVerticalScrollOffset), Integer.valueOf(i4), Integer.valueOf(i5)};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "9606959c3eba69994d21bc170bc3b44a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "9606959c3eba69994d21bc170bc3b44a");
                        } else {
                            com.sankuai.waimai.foundation.utils.log.a.b(this.d, "onConsumeScrollBy, dy = %d, consumed = %d", Integer.valueOf(i4), Integer.valueOf(i5));
                        }
                        i3 = i5;
                    }
                }
                iArr[1] = iArr[1] + i3;
                return;
            }
            return;
        }
        super.onNestedPreScroll(view, i, i2, iArr);
    }

    @Override // com.sankuai.waimai.platform.widget.smoothnestedscroll.base.SmoothNestedScrollView, com.sankuai.waimai.platform.widget.smoothnestedscroll.core.e
    public final void a(View view, int i, int i2, int i3, int i4, final c cVar) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "688e249a0ab101c4cfb86098222ef7c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "688e249a0ab101c4cfb86098222ef7c7");
            return;
        }
        boolean z = i4 > 0;
        com.sankuai.waimai.foundation.utils.log.a.b(this.d, "onSmoothPreFling, scrollUp = %s, vy = %d", Boolean.valueOf(z), Integer.valueOf(i4));
        if (z) {
            b(view, i, i2, i3, i4, new c() { // from class: com.sankuai.waimai.platform.widget.smoothnestedscroll.PrioritySmoothNestedScrollView.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.widget.smoothnestedscroll.core.c
                public final void a(View view2, int i5, int i6, int i7, int i8) {
                    Object[] objArr2 = {view2, Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7645a5d2af1def2bdd48492a3a58dd7f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7645a5d2af1def2bdd48492a3a58dd7f");
                        return;
                    }
                    com.sankuai.waimai.foundation.utils.log.a.b(PrioritySmoothNestedScrollView.this.d, "onSmoothPreFling dispatch complete, scrollUp = %s, remain vy = %d", Boolean.TRUE, Integer.valueOf(i8));
                    PrioritySmoothNestedScrollView.this.c.a(i5, i6, i7, i8, cVar);
                }
            });
        } else {
            b(view, i, i2, i3, i4, cVar);
        }
    }

    @Override // com.sankuai.waimai.platform.widget.smoothnestedscroll.base.SmoothNestedScrollView, com.sankuai.waimai.platform.widget.smoothnestedscroll.core.e
    public final void b(View view, int i, int i2, int i3, int i4) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4e8c2a6f387431dd3bfa25e8e8c23d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4e8c2a6f387431dd3bfa25e8e8c23d7");
        } else if (this.k) {
            boolean z = i4 < 0;
            com.sankuai.waimai.foundation.utils.log.a.b(this.d, "onSmoothFling, scrollDown = %s, vy = %d", Boolean.valueOf(z), Integer.valueOf(i4));
            if (z) {
                this.c.a(i, i2, i3, i4, new c() { // from class: com.sankuai.waimai.platform.widget.smoothnestedscroll.PrioritySmoothNestedScrollView.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.platform.widget.smoothnestedscroll.core.c
                    public final void a(View view2, int i5, int i6, int i7, int i8) {
                        Object[] objArr2 = {view2, Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b5b685ee4dab1931bb7be8f2fdc434df", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b5b685ee4dab1931bb7be8f2fdc434df");
                            return;
                        }
                        com.sankuai.waimai.foundation.utils.log.a.b(PrioritySmoothNestedScrollView.this.d, "onSmoothFling self complete, scrollDown = %s, remain vy = %d", Boolean.TRUE, Integer.valueOf(i8));
                        PrioritySmoothNestedScrollView.this.a(PrioritySmoothNestedScrollView.this, i5, i6, i7, i8);
                    }
                });
            } else {
                a(view, i, i2, i3, i4);
            }
        }
    }

    @Override // android.support.v4.widget.NestedScrollView, android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "560eb5246e0a1828fa023224569363cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "560eb5246e0a1828fa023224569363cb");
        } else {
            super.onScrollChanged(i, i2, i3, i4);
        }
    }

    public void setOnScrollListener(a aVar) {
        this.j = aVar;
    }

    @Override // android.view.View
    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d60818882f93ee3d06efe0049b1884e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d60818882f93ee3d06efe0049b1884e");
        }
        return this.d + " @ " + hashCode();
    }
}
