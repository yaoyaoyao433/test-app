package com.sankuai.waimai.platform.widget.coordinator;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.animation.FastOutLinearInInterpolator;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.foundation.utils.ai;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.foundation.utils.o;
import com.sankuai.waimai.platform.widget.smoothnestedscroll.core.b;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class ExpandableHeaderBehavior extends CoordinatorLayout.a<View> implements com.sankuai.waimai.platform.widget.smoothnestedscroll.core.a {
    public static final String TAG = "HeaderBehavior";
    public static ChangeQuickRedirect changeQuickRedirect;
    private d mAnimation;
    private int mCurrentScrollPosition;
    private e mDefaultPositionProvider;
    private b mEventListener;
    private final com.sankuai.waimai.platform.widget.smoothnestedscroll.core.b mFlinger;
    private boolean mIsExpand;
    private e mMaxPositionProvider;
    private int mMinPosition;
    private Set<c> mOnScrollListeners;
    private boolean mScrollHeader;
    private int mScrollState;
    protected final ai<View> mTarget;
    public String pageInfoKeyForListener;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        void a(boolean z);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface c {
        void a(int i, int i2, int i3, int i4, int i5);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface e {
        int a();
    }

    private static boolean isVerticalAxes(int i) {
        return (i & 2) != 0;
    }

    public ExpandableHeaderBehavior() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "534cd1542c6c89bfd4e8b63e32f078f6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "534cd1542c6c89bfd4e8b63e32f078f6");
            return;
        }
        this.mTarget = new ai<>();
        this.mIsExpand = false;
        this.mScrollHeader = false;
        this.mScrollState = 0;
        this.mCurrentScrollPosition = 0;
        this.mMinPosition = 0;
        this.mFlinger = new com.sankuai.waimai.platform.widget.smoothnestedscroll.core.b();
    }

    public ExpandableHeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df986c51329dabf66c32508a148f33ff", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df986c51329dabf66c32508a148f33ff");
            return;
        }
        this.mTarget = new ai<>();
        this.mIsExpand = false;
        this.mScrollHeader = false;
        this.mScrollState = 0;
        this.mCurrentScrollPosition = 0;
        this.mMinPosition = 0;
        this.mFlinger = new com.sankuai.waimai.platform.widget.smoothnestedscroll.core.b();
    }

    public void setScrollHeader(boolean z) {
        this.mScrollHeader = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScrollState(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c96d01612a8e552a86bd7382fee25fc3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c96d01612a8e552a86bd7382fee25fc3");
        } else if (this.mScrollState != i) {
            this.mScrollState = i;
            com.sankuai.waimai.foundation.utils.log.a.b(TAG, "scroll state = %d", Integer.valueOf(this.mScrollState));
            if (com.sankuai.waimai.foundation.utils.b.a(this.mOnScrollListeners)) {
                Iterator<c> it = this.mOnScrollListeners.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
            com.sankuai.waimai.platform.widget.coordinator.b.a(this.pageInfoKeyForListener, i);
        }
    }

    @Override // android.support.design.widget.CoordinatorLayout.a
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        Object[] objArr = {coordinatorLayout, view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "89b637ca47ee2edc70ff47afc856d2e1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "89b637ca47ee2edc70ff47afc856d2e1")).booleanValue();
        }
        if (this.mIsExpand) {
            int currentPosition = getCurrentPosition();
            int maxPosition = getMaxPosition(coordinatorLayout);
            if (currentPosition < maxPosition) {
                scrollTo(maxPosition, coordinatorLayout);
            }
        }
        return super.onLayoutChild(coordinatorLayout, view, i);
    }

    @Override // android.support.design.widget.CoordinatorLayout.a
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i) {
        boolean z = false;
        Object[] objArr = {coordinatorLayout, view, view2, view3, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "826d580f95adaf81150e5f0e5f7271b9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "826d580f95adaf81150e5f0e5f7271b9")).booleanValue();
        }
        this.mFlinger.cancel();
        if (isVerticalAxes(i) && isNotNewTarget(view3) && com.sankuai.waimai.platform.widget.coordinator.a.a(coordinatorLayout, view2, view)) {
            z = true;
        }
        if (z) {
            setScrollState(1);
        }
        return z;
    }

    private boolean isNotNewTarget(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d4e920ef294d9ebb08a7813e0139259d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d4e920ef294d9ebb08a7813e0139259d")).booleanValue();
        }
        View a2 = this.mTarget.a();
        if (a2 == view) {
            return true;
        }
        if (a2 == null) {
            this.mTarget.a(view);
            return true;
        }
        return false;
    }

    @Override // android.support.design.widget.CoordinatorLayout.a
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr) {
        Object[] objArr = {coordinatorLayout, view, view2, Integer.valueOf(i), Integer.valueOf(i2), iArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7434dba7b25d535ac6369aecf000c752", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7434dba7b25d535ac6369aecf000c752");
            return;
        }
        if (i2 > 0) {
            iArr[1] = iArr[1] + scrollByWithTarget(i2, coordinatorLayout, view, view2);
        }
        com.sankuai.waimai.foundation.utils.log.a.b(TAG, "onNestedPreScroll  target = %s, [dx, dy] = [%d, %d], consumed = [ %d, %d ]", new com.sankuai.waimai.foundation.utils.log.b().a(this.mTarget.a()), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]));
    }

    @Override // android.support.design.widget.CoordinatorLayout.a
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4) {
        Object[] objArr = {coordinatorLayout, view, view2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6a078e417ab8cb786c028b9af4deecfc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6a078e417ab8cb786c028b9af4deecfc");
        } else {
            scrollByWithTarget(i4, coordinatorLayout, view, view2);
        }
    }

    @Override // android.support.design.widget.CoordinatorLayout.a
    public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2) {
        Object[] objArr = {coordinatorLayout, view, view2, Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bc5e2e6a0206a47b7b77f1d01f6c4142", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bc5e2e6a0206a47b7b77f1d01f6c4142")).booleanValue() : super.onNestedPreFling(coordinatorLayout, view, view2, f, f2);
    }

    @Override // android.support.design.widget.CoordinatorLayout.a
    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2) {
        Object[] objArr = {coordinatorLayout, view, view2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "16bc8c29adb9e71a7296d64c935cf63a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "16bc8c29adb9e71a7296d64c935cf63a");
            return;
        }
        super.onStopNestedScroll(coordinatorLayout, view, view2);
        this.mTarget.a(null);
        com.sankuai.waimai.foundation.utils.log.a.b(TAG, "onStopNestedScroll, scroll state = %d", Integer.valueOf(this.mScrollState));
        if (this.mScrollState != 2) {
            onScrollEndSmoothReset(coordinatorLayout);
        }
    }

    @Override // com.sankuai.waimai.platform.widget.smoothnestedscroll.core.a
    public void onSmoothPreFling(final CoordinatorLayout coordinatorLayout, View view, final int i, final int i2, int i3, int i4, final com.sankuai.waimai.platform.widget.smoothnestedscroll.core.c cVar) {
        Object[] objArr = {coordinatorLayout, view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "820c5a00ce87abb9577e435e18418359", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "820c5a00ce87abb9577e435e18418359");
        } else if (getCurrentPosition() >= getDefaultPosition()) {
        } else {
            if (i4 > 0) {
                setScrollState(2);
                this.mFlinger.a(view.getContext(), new a(coordinatorLayout) { // from class: com.sankuai.waimai.platform.widget.coordinator.ExpandableHeaderBehavior.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.platform.widget.smoothnestedscroll.core.b.AbstractC1102b
                    public final void a(@NonNull com.sankuai.waimai.platform.widget.smoothnestedscroll.core.b bVar, int i5, int i6) {
                        Object[] objArr2 = {bVar, Integer.valueOf(i5), Integer.valueOf(i6)};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6121fda66824077068d8710b04000a13", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6121fda66824077068d8710b04000a13");
                        } else {
                            cVar.a(coordinatorLayout, i, i2, i5, i6);
                        }
                    }
                }, i3, i4);
                return;
            }
            cVar.a(view, i, i2, i3, i4);
        }
    }

    @Override // com.sankuai.waimai.platform.widget.smoothnestedscroll.core.a
    public void onSmoothFling(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        Object[] objArr = {coordinatorLayout, view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eed467171d6cdf1a2b203d5f2b032198", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eed467171d6cdf1a2b203d5f2b032198");
            return;
        }
        if (i4 < 0) {
            this.mFlinger.a(view.getContext(), new a(coordinatorLayout), i3, i4);
        } else {
            setScrollState(0);
        }
    }

    @Override // com.sankuai.waimai.platform.widget.smoothnestedscroll.core.a
    public void cancelSmoothFling() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b0e11220e5dda09ff603cc2b837422c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b0e11220e5dda09ff603cc2b837422c1");
        } else {
            this.mFlinger.cancel();
        }
    }

    private View findHeaderView(CoordinatorLayout coordinatorLayout) {
        Object[] objArr = {coordinatorLayout};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "400c97f2a498f7703f5f557c1c199030", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "400c97f2a498f7703f5f557c1c199030");
        }
        if (coordinatorLayout != null) {
            for (int i = 0; i < coordinatorLayout.getChildCount(); i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (com.sankuai.waimai.platform.widget.coordinator.a.a(childAt) == this) {
                    return childAt;
                }
            }
            return null;
        }
        return null;
    }

    private View findScrollingView(CoordinatorLayout coordinatorLayout) {
        Object[] objArr = {coordinatorLayout};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7f92fb9b0a754e931f58295f514a8fc7", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7f92fb9b0a754e931f58295f514a8fc7");
        }
        if (coordinatorLayout != null) {
            for (int i = 0; i < coordinatorLayout.getChildCount(); i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (com.sankuai.waimai.platform.widget.coordinator.a.a(childAt) instanceof ExpandableScrollingBehavior) {
                    return childAt;
                }
            }
            return null;
        }
        return null;
    }

    private void onScrollEndSmoothReset(CoordinatorLayout coordinatorLayout) {
        Object[] objArr = {coordinatorLayout};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91bf4185b52ac1d1b48cdf0f1d0be329", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91bf4185b52ac1d1b48cdf0f1d0be329");
            return;
        }
        int currentPosition = getCurrentPosition();
        int defaultPosition = getDefaultPosition();
        com.sankuai.waimai.foundation.utils.log.a.b(TAG, "smoothReset, cur = %d, default = %d", Integer.valueOf(currentPosition), Integer.valueOf(defaultPosition));
        if (currentPosition > defaultPosition) {
            setScrollState(2);
            boolean z = currentPosition >= (Math.min(getCoordinatorHeight(coordinatorLayout), getMaxPosition(coordinatorLayout)) + (defaultPosition * 3)) / 4;
            if (z) {
                smoothScrollToMaxPosition(coordinatorLayout);
            } else {
                smoothScrollTo(defaultPosition, coordinatorLayout);
            }
            if (this.mEventListener != null) {
                this.mEventListener.a(z);
                return;
            }
            return;
        }
        setScrollState(0);
    }

    public String getPageInfoKeyForListener() {
        return this.pageInfoKeyForListener;
    }

    public void setPageInfoKeyForListener(String str) {
        this.pageInfoKeyForListener = str;
    }

    public void setEventListener(b bVar) {
        this.mEventListener = bVar;
    }

    public void addOnScrollListener(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d05c8dcbc6b5853bc6caafa46b9b3c31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d05c8dcbc6b5853bc6caafa46b9b3c31");
        } else if (cVar == null) {
        } else {
            if (this.mOnScrollListeners == null) {
                this.mOnScrollListeners = new HashSet();
            }
            this.mOnScrollListeners.add(cVar);
        }
    }

    public void removeOnScrollListener(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6030db29716de23316f393bf9a51a1ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6030db29716de23316f393bf9a51a1ce");
        } else if (cVar == null || this.mOnScrollListeners == null) {
        } else {
            this.mOnScrollListeners.remove(cVar);
        }
    }

    public void setMinPosition(int i) {
        this.mMinPosition = i;
    }

    public int getMinPosition() {
        return this.mMinPosition;
    }

    public void setDefaultPosition(final int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9d635969bc1b5bbe009c03feb1dc0ec5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9d635969bc1b5bbe009c03feb1dc0ec5");
            return;
        }
        this.mDefaultPositionProvider = new e() { // from class: com.sankuai.waimai.platform.widget.coordinator.ExpandableHeaderBehavior.2
            @Override // com.sankuai.waimai.platform.widget.coordinator.ExpandableHeaderBehavior.e
            public final int a() {
                return i;
            }
        };
        this.mCurrentScrollPosition = i;
    }

    public void setDefaultPosition(e eVar) {
        this.mDefaultPositionProvider = eVar;
    }

    public int getDefaultPosition() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "65a601b893baabf6cf11a3e018f75f50", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "65a601b893baabf6cf11a3e018f75f50")).intValue();
        }
        if (this.mDefaultPositionProvider == null) {
            return 0;
        }
        return this.mDefaultPositionProvider.a();
    }

    public void setMaxPosition(e eVar) {
        this.mMaxPositionProvider = eVar;
    }

    public int getMaxPosition(CoordinatorLayout coordinatorLayout) {
        Object[] objArr = {coordinatorLayout};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b563fe04f299382682b12367bf37fd2c", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b563fe04f299382682b12367bf37fd2c")).intValue() : this.mMaxPositionProvider == null ? getCoordinatorHeight(coordinatorLayout) : this.mMaxPositionProvider.a();
    }

    public int getCoordinatorHeight(CoordinatorLayout coordinatorLayout) {
        Object[] objArr = {coordinatorLayout};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a7ab3d20fc8ed102b1560dfb5d94ca59", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a7ab3d20fc8ed102b1560dfb5d94ca59")).intValue() : coordinatorLayout.getHeight();
    }

    public int getCurrentPosition() {
        return this.mCurrentScrollPosition;
    }

    public void scrollToMinPosition(CoordinatorLayout coordinatorLayout) {
        Object[] objArr = {coordinatorLayout};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dd24c4013f4d40dad166d0820d986d34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dd24c4013f4d40dad166d0820d986d34");
        } else {
            scrollTo(getMinPosition(), coordinatorLayout);
        }
    }

    public void scrollToDefaultPosition(CoordinatorLayout coordinatorLayout) {
        Object[] objArr = {coordinatorLayout};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "18fbbe78da5792fb05f632a3ba622bd8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "18fbbe78da5792fb05f632a3ba622bd8");
        } else {
            scrollTo(getDefaultPosition(), coordinatorLayout);
        }
    }

    public void scrollToMaxPosition(CoordinatorLayout coordinatorLayout) {
        Object[] objArr = {coordinatorLayout};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fec1144232f5bdbbd47eb65727ea3841", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fec1144232f5bdbbd47eb65727ea3841");
        } else {
            scrollTo(getMaxPosition(coordinatorLayout), coordinatorLayout);
        }
    }

    public void smoothScrollToMinPosition(CoordinatorLayout coordinatorLayout) {
        Object[] objArr = {coordinatorLayout};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "85ab13f5e6cc34965444fb1a10050943", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "85ab13f5e6cc34965444fb1a10050943");
        } else {
            smoothScrollTo(getMinPosition(), coordinatorLayout);
        }
    }

    public void smoothScrollToDefaultPosition(CoordinatorLayout coordinatorLayout) {
        Object[] objArr = {coordinatorLayout};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5bef5aed8c1ac7f5b98dc3cf9502374e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5bef5aed8c1ac7f5b98dc3cf9502374e");
        } else {
            smoothScrollTo(getDefaultPosition(), coordinatorLayout);
        }
    }

    public void smoothScrollToMaxPosition(CoordinatorLayout coordinatorLayout) {
        Object[] objArr = {coordinatorLayout};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c9ee7bbf120364dfd5ab2d59cf02d33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c9ee7bbf120364dfd5ab2d59cf02d33");
        } else {
            smoothScrollTo(getMaxPosition(coordinatorLayout), coordinatorLayout);
        }
    }

    public int scrollTo(int i, CoordinatorLayout coordinatorLayout) {
        Object[] objArr = {Integer.valueOf(i), coordinatorLayout};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6f17ed79e63cf3389ced14634f965858", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6f17ed79e63cf3389ced14634f965858")).intValue();
        }
        int currentPosition = getCurrentPosition();
        com.sankuai.waimai.foundation.utils.log.a.b(TAG, "scrollTo, cur = %d, y = %d", Integer.valueOf(currentPosition), Integer.valueOf(i));
        return scrollBy(currentPosition - i, coordinatorLayout);
    }

    public void smoothScrollTo(int i, CoordinatorLayout coordinatorLayout) {
        Object[] objArr = {Integer.valueOf(i), coordinatorLayout};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1adf56206ad1285d651611c56ec7d568", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1adf56206ad1285d651611c56ec7d568");
            return;
        }
        cancelScrollAnimation();
        this.mAnimation = new d(coordinatorLayout, getCurrentPosition(), i);
        this.mAnimation.addListener(new com.sankuai.waimai.platform.widget.a("restaurant_header_animation"));
        this.mAnimation.start();
    }

    public void cancelScrollAnimation() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c04f26fd293b2667d9c41b8fe33994ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c04f26fd293b2667d9c41b8fe33994ea");
        } else if (this.mAnimation != null) {
            this.mAnimation.cancel();
            this.mAnimation = null;
        }
    }

    public int scrollBy(int i, CoordinatorLayout coordinatorLayout) {
        Object[] objArr = {Integer.valueOf(i), coordinatorLayout};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2a726f11f99ee4cf7068c310b47fb7b8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2a726f11f99ee4cf7068c310b47fb7b8")).intValue();
        }
        if (i == 0 || coordinatorLayout == null) {
            return 0;
        }
        return performScrollBy(i, coordinatorLayout, findHeaderView(coordinatorLayout), findScrollingView(coordinatorLayout));
    }

    public int scrollByWithTarget(int i, CoordinatorLayout coordinatorLayout, View view, View view2) {
        Object[] objArr = {Integer.valueOf(i), coordinatorLayout, view, view2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "caeaf6c584282c22d28fc73555d2b67f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "caeaf6c584282c22d28fc73555d2b67f")).intValue();
        }
        if (i == 0 || coordinatorLayout == null || view == null || view2 == null) {
            return 0;
        }
        return performScrollBy(i, coordinatorLayout, view, ah.a(coordinatorLayout, view2));
    }

    public int performScrollBy(int i, CoordinatorLayout coordinatorLayout, View view, View view2) {
        Object[] objArr = {Integer.valueOf(i), coordinatorLayout, view, view2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e97f5bf953ffea57c2b7b792f9abfd1b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e97f5bf953ffea57c2b7b792f9abfd1b")).intValue();
        }
        if (i == 0 || coordinatorLayout == null || view == null || view2 == null) {
            return 0;
        }
        int currentPosition = getCurrentPosition();
        int minPosition = getMinPosition();
        int maxPosition = getMaxPosition(coordinatorLayout);
        int b2 = o.b(currentPosition - i, minPosition, maxPosition);
        int i2 = b2 - currentPosition;
        if (i2 != 0) {
            this.mCurrentScrollPosition = b2;
            int defaultPosition = getDefaultPosition();
            if (this.mScrollHeader) {
                view.scrollTo(0, Math.max(defaultPosition - b2, 0));
            }
            setViewTop(view2, b2);
            int coordinatorHeight = getCoordinatorHeight(coordinatorLayout);
            this.mIsExpand = b2 >= coordinatorHeight;
            notifyOnScrollListener(b2, minPosition, defaultPosition, coordinatorHeight, maxPosition);
        }
        return -i2;
    }

    private void notifyOnScrollListener(int i, int i2, int i3, int i4, int i5) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "40be7dc406be31b18206c6875140aaa5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "40be7dc406be31b18206c6875140aaa5");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.b(TAG, "scroll to %4d, (min, def, height, max) = (%4d, %4d, %4d, %4d)", Integer.valueOf(this.mCurrentScrollPosition), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
        if (com.sankuai.waimai.foundation.utils.b.a(this.mOnScrollListeners)) {
            for (c cVar : this.mOnScrollListeners) {
                cVar.a(i, i2, i3, i4, i5);
            }
        }
        com.sankuai.waimai.platform.widget.coordinator.b.a(this.pageInfoKeyForListener, i, i2, i3, i4, i5);
    }

    private void setViewTop(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bcbe77316f376f38c8fe2a7253e66bcc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bcbe77316f376f38c8fe2a7253e66bcc");
        } else if (i != view.getTop()) {
            ViewCompat.offsetTopAndBottom(view, i - view.getTop());
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    class a extends b.AbstractC1102b {
        public static ChangeQuickRedirect g;
        private final CoordinatorLayout a;

        private a(CoordinatorLayout coordinatorLayout) {
            Object[] objArr = {ExpandableHeaderBehavior.this, coordinatorLayout};
            ChangeQuickRedirect changeQuickRedirect = g;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b69bfb7988468dfb677d413a1ed95191", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b69bfb7988468dfb677d413a1ed95191");
            } else {
                this.a = coordinatorLayout;
            }
        }

        @Override // com.sankuai.waimai.platform.widget.smoothnestedscroll.core.b.AbstractC1102b
        public final int a(@NonNull com.sankuai.waimai.platform.widget.smoothnestedscroll.core.b bVar, int i) {
            Object[] objArr = {bVar, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = g;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55808bf41755207b6c6c099f6d9ad73c", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55808bf41755207b6c6c099f6d9ad73c")).intValue();
            }
            if (i < 0) {
                int currentPosition = ExpandableHeaderBehavior.this.getCurrentPosition();
                int i2 = currentPosition - i;
                int defaultPosition = ExpandableHeaderBehavior.this.getDefaultPosition();
                if (i2 > defaultPosition) {
                    int i3 = defaultPosition - currentPosition;
                    com.sankuai.waimai.foundation.utils.log.a.b(ExpandableHeaderBehavior.TAG, "behavior scroll, dy = %d, limited = %d, from = %d, max = %d", Integer.valueOf(i), Integer.valueOf(i3), Integer.valueOf(currentPosition), Integer.valueOf(defaultPosition));
                    return ExpandableHeaderBehavior.this.scrollBy(-i3, this.a);
                }
            }
            return ExpandableHeaderBehavior.this.scrollBy(i, this.a);
        }

        @Override // com.sankuai.waimai.platform.widget.smoothnestedscroll.core.b.AbstractC1102b
        public final void a(Runnable runnable) {
            Object[] objArr = {runnable};
            ChangeQuickRedirect changeQuickRedirect = g;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21ae053da902276b484882819f6a11d5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21ae053da902276b484882819f6a11d5");
            } else {
                ViewCompat.postOnAnimation(this.a, runnable);
            }
        }

        @Override // com.sankuai.waimai.platform.widget.smoothnestedscroll.core.b.AbstractC1102b
        public final void b(Runnable runnable) {
            Object[] objArr = {runnable};
            ChangeQuickRedirect changeQuickRedirect = g;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c91ce78e03bbdfbe6d3a38a7f91b9cbd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c91ce78e03bbdfbe6d3a38a7f91b9cbd");
            } else {
                this.a.removeCallbacks(runnable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class d extends ValueAnimator implements Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect a;
        private final WeakReference<CoordinatorLayout> c;

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        private d(CoordinatorLayout coordinatorLayout, int i, int i2) {
            Object[] objArr = {ExpandableHeaderBehavior.this, coordinatorLayout, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61c918ff20d4875dcead2441e184bb52", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61c918ff20d4875dcead2441e184bb52");
                return;
            }
            setIntValues(i, i2);
            this.c = new WeakReference<>(coordinatorLayout);
            setDuration(o.b((int) (g.c(coordinatorLayout.getContext(), Math.abs(i - i2)) * 0.85f), 80, 400));
            addUpdateListener(this);
            setInterpolator(new FastOutLinearInInterpolator());
            addListener(this);
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object[] objArr = {valueAnimator};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcebb340b635a9473e76a65a3cf466fa", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcebb340b635a9473e76a65a3cf466fa");
                return;
            }
            CoordinatorLayout coordinatorLayout = this.c.get();
            if (coordinatorLayout == null) {
                cancel();
                return;
            }
            Object animatedValue = getAnimatedValue();
            if (animatedValue instanceof Integer) {
                ExpandableHeaderBehavior.this.scrollTo(((Integer) animatedValue).intValue(), coordinatorLayout);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            Object[] objArr = {animator};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97b85ef3bf50a082db51e52f27d12fcb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97b85ef3bf50a082db51e52f27d12fcb");
            } else if (ExpandableHeaderBehavior.this.mScrollState == 0) {
                ExpandableHeaderBehavior.this.setScrollState(2);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            Object[] objArr = {animator};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "404efb0b09d2471c656e5c77f11e6e57", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "404efb0b09d2471c656e5c77f11e6e57");
                return;
            }
            ExpandableHeaderBehavior.this.setScrollState(0);
            ExpandableHeaderBehavior.this.mAnimation = null;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            Object[] objArr = {animator};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f69de56667de43de901c67f590ca229d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f69de56667de43de901c67f590ca229d");
                return;
            }
            ExpandableHeaderBehavior.this.setScrollState(0);
            ExpandableHeaderBehavior.this.mAnimation = null;
        }
    }
}
