package com.meituan.msc.mmpviews.scroll.nested;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.NestedScrollingChild2;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.msc.mmpviews.shell.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MSCNestedScrollView extends NestedScrollView {
    public static ChangeQuickRedirect b;
    private String a;
    final Set<Integer> c;
    private final int[] e;
    private WeakReference<View> f;
    private boolean g;
    private boolean h;
    private int i;
    private f j;

    public f getDelegate() {
        return this.j;
    }

    public void setDelegate(f fVar) {
        this.j = fVar;
    }

    public MSCNestedScrollView(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05a0bb0da6c26171e6130c0de22e66d6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05a0bb0da6c26171e6130c0de22e66d6");
            return;
        }
        this.a = "MSCNestedScrollView";
        this.e = new int[2];
        this.c = new HashSet();
        this.g = false;
        this.h = false;
    }

    public MSCNestedScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a05807c300b3e5e4f6803d02f1e0a001", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a05807c300b3e5e4f6803d02f1e0a001");
            return;
        }
        this.a = "MSCNestedScrollView";
        this.e = new int[2];
        this.c = new HashSet();
        this.g = false;
        this.h = false;
    }

    public void setForbidScroll(boolean z) {
        this.h = z;
    }

    public void setIsVertical(boolean z) {
        this.g = z;
    }

    public void setSubCategoryHeight(int i) {
        this.i = i;
    }

    @Override // com.meituan.msc.mmpviews.scroll.nested.NestedScrollView, android.support.v4.view.NestedScrollingParent2
    public boolean onStartNestedScroll(@NonNull View view, @NonNull View view2, int i, int i2) {
        Object[] objArr = {view, view2, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c014ed6623b15a299b20eee73fe688f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c014ed6623b15a299b20eee73fe688f")).booleanValue();
        }
        if (this.g && (i & 2) == 0) {
            return false;
        }
        int id = view2.getId();
        if (id < 0 && (view2.getParent() instanceof ViewGroup)) {
            id = ((ViewGroup) view2.getParent()).getId();
        }
        if (this.h || !this.c.contains(Integer.valueOf(id))) {
            return false;
        }
        return super.onStartNestedScroll(view, view2, i, i2);
    }

    @Override // com.meituan.msc.mmpviews.scroll.nested.NestedScrollView, android.support.v4.view.NestedScrollingParent2
    public void onStopNestedScroll(@NonNull View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6e676b66178113ef0cf9d9019276a11", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6e676b66178113ef0cf9d9019276a11");
            return;
        }
        super.onStopNestedScroll(view, i);
        this.f = null;
    }

    @Override // com.meituan.msc.mmpviews.scroll.nested.NestedScrollView, android.support.v4.view.NestedScrollingParent2
    public void onNestedPreScroll(@NonNull View view, int i, int i2, @NonNull int[] iArr, int i3) {
        int i4 = 0;
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), iArr, Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb44347db849fbd79f01e7987789331e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb44347db849fbd79f01e7987789331e");
        } else if (i2 == 0) {
            super.onNestedPreScroll(view, i, i2, iArr, i3);
        } else {
            if (i2 > 0) {
                a(view, i, i2, iArr, i3);
                int i5 = i2 - iArr[1];
                if (i5 != 0) {
                    Object[] objArr2 = {Integer.valueOf(i5)};
                    ChangeQuickRedirect changeQuickRedirect2 = b;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "edaad453d0f0bf636a3367f551508b64", RobustBitConfig.DEFAULT_VALUE)) {
                        i4 = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "edaad453d0f0bf636a3367f551508b64")).intValue();
                    } else if (i5 != 0) {
                        int computeVerticalScrollRange = (computeVerticalScrollRange() - computeVerticalScrollExtent()) - computeVerticalScrollOffset();
                        int min = computeVerticalScrollRange <= 0 ? 0 : Math.min(i5, computeVerticalScrollRange);
                        scrollBy(0, min);
                        i4 = min;
                    }
                    iArr[1] = iArr[1] + i4;
                }
            } else if (this.i > 0) {
                a(view, i, i2, iArr, i3);
                int i6 = i2 - iArr[1];
                if (i6 != 0) {
                    Object[] objArr3 = {Integer.valueOf(i6)};
                    ChangeQuickRedirect changeQuickRedirect3 = b;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8a4060ecee5901f6959de11d70900877", RobustBitConfig.DEFAULT_VALUE)) {
                        i4 = ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8a4060ecee5901f6959de11d70900877")).intValue();
                    } else if (i6 != 0) {
                        int computeVerticalScrollRange2 = ((computeVerticalScrollRange() - computeVerticalScrollExtent()) - computeVerticalScrollOffset()) - this.i;
                        int max = computeVerticalScrollRange2 >= 0 ? 0 : Math.max(i6, computeVerticalScrollRange2);
                        scrollBy(0, max);
                        i4 = max;
                    }
                    iArr[1] = iArr[1] + i4;
                }
            } else {
                super.onNestedPreScroll(view, i, i2, iArr, i3);
            }
        }
    }

    private void a(View view, int i, int i2, int[] iArr, int i3) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), iArr, Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62a43eabb7b1a5457c4caf733bf869a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62a43eabb7b1a5457c4caf733bf869a6");
            return;
        }
        this.e[0] = 0;
        this.e[1] = 0;
        super.onNestedPreScroll(view, i, i2, this.e, i3);
        iArr[0] = iArr[0] + this.e[0];
        iArr[1] = iArr[1] + this.e[1];
    }

    @Override // com.meituan.msc.mmpviews.scroll.nested.NestedScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "459dac26a9a7cd5326c129350b2b1ca6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "459dac26a9a7cd5326c129350b2b1ca6")).booleanValue();
        }
        if (this.h) {
            return false;
        }
        if (motionEvent.getAction() != 0 || motionEvent.getY() < getMaxOffset() - getScrollY()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // com.meituan.msc.mmpviews.scroll.nested.NestedScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2798f33d54791ccb5f2b7462c30308a5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2798f33d54791ccb5f2b7462c30308a5")).booleanValue();
        }
        if (this.h) {
            return false;
        }
        if (motionEvent.getAction() != 0 || motionEvent.getY() < getMaxOffset() - getScrollY()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    public int getMaxOffset() {
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9975cc35316c2281aa7716649ca7ec1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9975cc35316c2281aa7716649ca7ec1")).intValue();
        }
        int contentHeight = getContentHeight();
        if (this.f != null && this.f.get() != null) {
            return contentHeight - this.f.get().getHeight();
        }
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        if (arrayList.size() == 0) {
            return contentHeight;
        }
        for (View view : arrayList) {
            if (view.getHeight() > i) {
                i = view.getHeight();
            }
        }
        return contentHeight - i;
    }

    private void a(ViewGroup viewGroup, List<View> list) {
        Object[] objArr = {viewGroup, list};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2aaf21e5e3ca854088a1776d9535aed1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2aaf21e5e3ca854088a1776d9535aed1");
        } else if (viewGroup != null) {
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof NestedScrollingChild2) && !(childAt.getParent() instanceof ViewPager)) {
                    list.add(childAt);
                } else if (childAt instanceof ViewGroup) {
                    a((ViewGroup) childAt, list);
                }
            }
        }
    }

    public int getContentHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "810a525a5bb4071ba6cb05b254a2a71e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "810a525a5bb4071ba6cb05b254a2a71e")).intValue();
        }
        if (getChildCount() > 0) {
            return getChildAt(0).getHeight();
        }
        return getHeight();
    }
}
