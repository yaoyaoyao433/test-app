package com.facebook.react.uimanager;

import android.support.annotation.Nullable;
import com.facebook.react.uimanager.annotations.ReactPropertyHolder;
import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaBaselineFunction;
import com.facebook.yoga.YogaDirection;
import com.facebook.yoga.YogaDisplay;
import com.facebook.yoga.YogaEdge;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaOverflow;
import com.facebook.yoga.YogaPositionType;
import com.facebook.yoga.YogaWrap;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: ProGuard */
@ReactPropertyHolder
/* loaded from: classes.dex */
public class ReactShadowNodeImpl implements af<ReactShadowNodeImpl> {
    private static final com.facebook.yoga.a sYogaConfig = ah.a();
    @Nullable
    private ArrayList<ReactShadowNodeImpl> mChildren;
    private Integer mHeightMeasureSpec;
    private boolean mIsLayoutOnly;
    @Nullable
    private ReactShadowNodeImpl mLayoutParent;
    @Nullable
    private ArrayList<ReactShadowNodeImpl> mNativeChildren;
    @Nullable
    private ReactShadowNodeImpl mNativeParent;
    @Nullable
    private ReactShadowNodeImpl mParent;
    private int mReactTag;
    private int mRootTag;
    private int mScreenHeight;
    private int mScreenWidth;
    private int mScreenX;
    private int mScreenY;
    private boolean mShouldNotifyOnLayout;
    @Nullable
    private ao mThemedContext;
    @Nullable
    private String mViewClassName;
    private Integer mWidthMeasureSpec;
    public com.facebook.yoga.d mYogaNode;
    private boolean mNodeUpdated = true;
    private int mTotalNativeChildren = 0;
    private final float[] mPadding = new float[9];
    private final boolean[] mPaddingIsPercent = new boolean[9];
    private final am mDefaultPadding = new am(0.0f);

    public boolean hoistNativeChildren() {
        return false;
    }

    @Override // com.facebook.react.uimanager.af
    public boolean isVirtual() {
        return false;
    }

    public boolean isVirtualAnchor() {
        return false;
    }

    @Override // com.facebook.react.uimanager.af
    public void onAfterUpdateTransaction() {
    }

    @Override // com.facebook.react.uimanager.af
    public void onBeforeLayout(t tVar) {
    }

    @Override // com.facebook.react.uimanager.af
    public void onCollectExtraUpdates(UIViewOperationQueue uIViewOperationQueue) {
    }

    @Override // com.facebook.react.uimanager.af
    public void setLocalData(Object obj) {
    }

    public ReactShadowNodeImpl() {
        if (!isVirtual()) {
            com.facebook.yoga.d acquire = bg.a().acquire();
            this.mYogaNode = acquire == null ? com.facebook.yoga.d.a(sYogaConfig) : acquire;
            this.mYogaNode.a(this);
            Arrays.fill(this.mPadding, Float.NaN);
            return;
        }
        this.mYogaNode = null;
    }

    public boolean isYogaLeafNode() {
        return isMeasureDefined();
    }

    @Override // com.facebook.react.uimanager.af
    public final String getViewClass() {
        return (String) com.facebook.infer.annotation.a.a(this.mViewClassName);
    }

    @Override // com.facebook.react.uimanager.af
    public final boolean hasUpdates() {
        return this.mNodeUpdated || hasNewLayout() || isDirty();
    }

    @Override // com.facebook.react.uimanager.af
    public final void markUpdateSeen() {
        this.mNodeUpdated = false;
        if (hasNewLayout()) {
            markLayoutSeen();
        }
    }

    public void markUpdated() {
        if (this.mNodeUpdated) {
            return;
        }
        this.mNodeUpdated = true;
        ReactShadowNodeImpl parent = getParent();
        if (parent != null) {
            parent.markUpdated();
        }
    }

    public final boolean hasUnseenUpdates() {
        return this.mNodeUpdated;
    }

    @Override // com.facebook.react.uimanager.af
    public void dirty() {
        if (!isVirtual()) {
            this.mYogaNode.f();
        } else if (getParent() != null) {
            getParent().dirty();
        }
    }

    public final boolean isDirty() {
        return this.mYogaNode != null && this.mYogaNode.g();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.facebook.react.uimanager.af
    public void addChildAt(ReactShadowNodeImpl reactShadowNodeImpl, int i) {
        if (this.mChildren == null) {
            this.mChildren = new ArrayList<>(4);
        }
        if (i > this.mChildren.size() || i < 0) {
            com.facebook.common.logging.a.d("[ReactShadowNodeImpl@addChildAt]", "child index out of bound");
            return;
        }
        this.mChildren.add(i, reactShadowNodeImpl);
        reactShadowNodeImpl.mParent = this;
        if (this.mYogaNode != null && !isYogaLeafNode()) {
            com.facebook.yoga.d dVar = reactShadowNodeImpl.mYogaNode;
            if (dVar == null) {
                throw new RuntimeException("Cannot add a child that doesn't have a YogaNode to a parent without a measure function! (Trying to add a '" + reactShadowNodeImpl.toString() + "' to a '" + toString() + "')");
            }
            this.mYogaNode.a(dVar, i);
        }
        markUpdated();
        int totalNativeNodeContributionToParent = reactShadowNodeImpl.getTotalNativeNodeContributionToParent();
        this.mTotalNativeChildren += totalNativeNodeContributionToParent;
        updateNativeChildrenCountInParent(totalNativeNodeContributionToParent);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.facebook.react.uimanager.af
    public ReactShadowNodeImpl removeChildAt(int i) {
        if (this.mChildren == null) {
            throw new ArrayIndexOutOfBoundsException("Index " + i + " out of bounds: node has no children");
        }
        ReactShadowNodeImpl remove = this.mChildren.remove(i);
        remove.mParent = null;
        if (this.mYogaNode != null && !isYogaLeafNode()) {
            this.mYogaNode.b(i);
        }
        markUpdated();
        int totalNativeNodeContributionToParent = remove.getTotalNativeNodeContributionToParent();
        this.mTotalNativeChildren -= totalNativeNodeContributionToParent;
        updateNativeChildrenCountInParent(-totalNativeNodeContributionToParent);
        return remove;
    }

    @Override // com.facebook.react.uimanager.af
    public final int getChildCount() {
        if (this.mChildren == null) {
            return 0;
        }
        return this.mChildren.size();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.facebook.react.uimanager.af
    public final ReactShadowNodeImpl getChildAt(int i) {
        if (this.mChildren == null) {
            throw new ArrayIndexOutOfBoundsException("Index " + i + " out of bounds: node has no children");
        }
        return this.mChildren.get(i);
    }

    @Override // com.facebook.react.uimanager.af
    public final int indexOf(ReactShadowNodeImpl reactShadowNodeImpl) {
        if (this.mChildren == null) {
            return -1;
        }
        return this.mChildren.indexOf(reactShadowNodeImpl);
    }

    @Override // com.facebook.react.uimanager.af
    public void removeAndDisposeAllChildren() {
        if (getChildCount() == 0) {
            return;
        }
        int i = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (this.mYogaNode != null && !isYogaLeafNode()) {
                this.mYogaNode.b(childCount);
            }
            ReactShadowNodeImpl childAt = getChildAt(childCount);
            childAt.mParent = null;
            i += childAt.getTotalNativeNodeContributionToParent();
            childAt.dispose();
        }
        ((ArrayList) com.facebook.infer.annotation.a.a(this.mChildren)).clear();
        markUpdated();
        this.mTotalNativeChildren -= i;
        updateNativeChildrenCountInParent(-i);
    }

    private void updateNativeChildrenCountInParent(int i) {
        if (getNativeKind() != s.PARENT) {
            for (ReactShadowNodeImpl parent = getParent(); parent != null; parent = parent.getParent()) {
                parent.mTotalNativeChildren += i;
                if (parent.getNativeKind() == s.PARENT) {
                    return;
                }
            }
        }
    }

    @Override // com.facebook.react.uimanager.af
    public final void updateProperties(ag agVar) {
        bc.a(this, agVar);
        onAfterUpdateTransaction();
    }

    @Override // com.facebook.react.uimanager.af
    public boolean dispatchUpdates(float f, float f2, UIViewOperationQueue uIViewOperationQueue, @Nullable t tVar) {
        if (this.mNodeUpdated) {
            onCollectExtraUpdates(uIViewOperationQueue);
        }
        boolean z = false;
        if (hasNewLayout()) {
            float layoutX = getLayoutX();
            float layoutY = getLayoutY();
            float f3 = f + layoutX;
            int round = Math.round(f3);
            float f4 = f2 + layoutY;
            int round2 = Math.round(f4);
            int round3 = Math.round(f3 + getLayoutWidth());
            int round4 = Math.round(f4 + getLayoutHeight());
            int round5 = Math.round(layoutX);
            int round6 = Math.round(layoutY);
            int i = round3 - round;
            int i2 = round4 - round2;
            z = (round5 == this.mScreenX && round6 == this.mScreenY && i == this.mScreenWidth && i2 == this.mScreenHeight) ? true : true;
            this.mScreenX = round5;
            this.mScreenY = round6;
            this.mScreenWidth = i;
            this.mScreenHeight = i2;
            if (z) {
                if (tVar == null) {
                    uIViewOperationQueue.a(getRootTag(), getParent().getReactTag(), getReactTag(), getScreenX(), getScreenY(), getScreenWidth(), getScreenHeight());
                } else {
                    tVar.c(this);
                }
            }
            return z;
        }
        return false;
    }

    @Override // com.facebook.react.uimanager.af
    public final int getReactTag() {
        return this.mReactTag;
    }

    @Override // com.facebook.react.uimanager.af
    public void setReactTag(int i) {
        this.mReactTag = i;
    }

    @Override // com.facebook.react.uimanager.af
    public final int getRootTag() {
        com.facebook.infer.annotation.a.a(this.mRootTag != 0);
        return this.mRootTag;
    }

    @Override // com.facebook.react.uimanager.af
    public final void setRootTag(int i) {
        this.mRootTag = i;
    }

    @Override // com.facebook.react.uimanager.af
    public final void setViewClassName(String str) {
        this.mViewClassName = str;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.facebook.react.uimanager.af
    @Nullable
    public final ReactShadowNodeImpl getParent() {
        return this.mParent;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.facebook.react.uimanager.af
    @Nullable
    public final ReactShadowNodeImpl getLayoutParent() {
        return this.mLayoutParent != null ? this.mLayoutParent : getNativeParent();
    }

    @Override // com.facebook.react.uimanager.af
    public final void setLayoutParent(@Nullable ReactShadowNodeImpl reactShadowNodeImpl) {
        this.mLayoutParent = reactShadowNodeImpl;
    }

    @Override // com.facebook.react.uimanager.af
    public final ao getThemedContext() {
        return (ao) com.facebook.infer.annotation.a.a(this.mThemedContext);
    }

    @Override // com.facebook.react.uimanager.af
    public void setThemedContext(ao aoVar) {
        this.mThemedContext = aoVar;
    }

    @Override // com.facebook.react.uimanager.af
    public final boolean shouldNotifyOnLayout() {
        return this.mShouldNotifyOnLayout;
    }

    @Override // com.facebook.react.uimanager.af
    public void calculateLayout() {
        calculateLayout(Float.NaN, Float.NaN);
    }

    @Override // com.facebook.react.uimanager.af
    public void calculateLayout(float f, float f2) {
        this.mYogaNode.a(f, f2);
    }

    public final boolean hasNewLayout() {
        return this.mYogaNode != null && this.mYogaNode.e();
    }

    public final void markLayoutSeen() {
        if (this.mYogaNode != null) {
            this.mYogaNode.i();
        }
    }

    @Override // com.facebook.react.uimanager.af
    public final void addNativeChildAt(ReactShadowNodeImpl reactShadowNodeImpl, int i) {
        com.facebook.infer.annotation.a.a(getNativeKind() == s.PARENT);
        com.facebook.infer.annotation.a.a(reactShadowNodeImpl.getNativeKind() != s.NONE);
        if (this.mNativeChildren == null) {
            this.mNativeChildren = new ArrayList<>(4);
        }
        this.mNativeChildren.add(i, reactShadowNodeImpl);
        reactShadowNodeImpl.mNativeParent = this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.facebook.react.uimanager.af
    public final ReactShadowNodeImpl removeNativeChildAt(int i) {
        com.facebook.infer.annotation.a.a(this.mNativeChildren);
        ReactShadowNodeImpl remove = this.mNativeChildren.remove(i);
        remove.mNativeParent = null;
        return remove;
    }

    @Override // com.facebook.react.uimanager.af
    public final void removeAllNativeChildren() {
        if (this.mNativeChildren != null) {
            for (int size = this.mNativeChildren.size() - 1; size >= 0; size--) {
                this.mNativeChildren.get(size).mNativeParent = null;
            }
            this.mNativeChildren.clear();
        }
    }

    @Override // com.facebook.react.uimanager.af
    public final int getNativeChildCount() {
        if (this.mNativeChildren == null) {
            return 0;
        }
        return this.mNativeChildren.size();
    }

    @Override // com.facebook.react.uimanager.af
    public final int indexOfNativeChild(ReactShadowNodeImpl reactShadowNodeImpl) {
        com.facebook.infer.annotation.a.a(this.mNativeChildren);
        return this.mNativeChildren.indexOf(reactShadowNodeImpl);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.facebook.react.uimanager.af
    @Nullable
    public final ReactShadowNodeImpl getNativeParent() {
        return this.mNativeParent;
    }

    @Override // com.facebook.react.uimanager.af
    public final void setIsLayoutOnly(boolean z) {
        com.facebook.infer.annotation.a.a(getParent() == null, "Must remove from no opt parent first");
        com.facebook.infer.annotation.a.a(this.mNativeParent == null, "Must remove from native parent first");
        com.facebook.infer.annotation.a.a(getNativeChildCount() == 0, "Must remove all native children first");
        this.mIsLayoutOnly = z;
    }

    @Override // com.facebook.react.uimanager.af
    public final boolean isLayoutOnly() {
        return this.mIsLayoutOnly;
    }

    @Override // com.facebook.react.uimanager.af
    public s getNativeKind() {
        if (isVirtual() || isLayoutOnly()) {
            return s.NONE;
        }
        return hoistNativeChildren() ? s.LEAF : s.PARENT;
    }

    public final int getTotalNativeChildren() {
        return this.mTotalNativeChildren;
    }

    @Override // com.facebook.react.uimanager.af
    public boolean isDescendantOf(ReactShadowNodeImpl reactShadowNodeImpl) {
        for (ReactShadowNodeImpl parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent == reactShadowNodeImpl) {
                return true;
            }
        }
        return false;
    }

    private int getTotalNativeNodeContributionToParent() {
        s nativeKind = getNativeKind();
        if (nativeKind == s.NONE) {
            return this.mTotalNativeChildren;
        }
        if (nativeKind == s.LEAF) {
            return this.mTotalNativeChildren + 1;
        }
        return 1;
    }

    public String toString() {
        return "[" + this.mViewClassName + StringUtil.SPACE + getReactTag() + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT;
    }

    @Override // com.facebook.react.uimanager.af
    public final int getNativeOffsetForChild(ReactShadowNodeImpl reactShadowNodeImpl) {
        boolean z = false;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= getChildCount()) {
                break;
            }
            ReactShadowNodeImpl childAt = getChildAt(i);
            if (reactShadowNodeImpl == childAt) {
                z = true;
                break;
            }
            i2 += childAt.getTotalNativeNodeContributionToParent();
            i++;
        }
        if (z) {
            return i2;
        }
        throw new RuntimeException("Child " + reactShadowNodeImpl.getReactTag() + " was not a child of " + this.mReactTag);
    }

    @Override // com.facebook.react.uimanager.af
    public final float getLayoutX() {
        return this.mYogaNode.q();
    }

    @Override // com.facebook.react.uimanager.af
    public final float getLayoutY() {
        return this.mYogaNode.r();
    }

    @Override // com.facebook.react.uimanager.af
    public final float getLayoutWidth() {
        return this.mYogaNode.s();
    }

    @Override // com.facebook.react.uimanager.af
    public final float getLayoutHeight() {
        return this.mYogaNode.t();
    }

    @Override // com.facebook.react.uimanager.af
    public int getScreenX() {
        return this.mScreenX;
    }

    @Override // com.facebook.react.uimanager.af
    public int getScreenY() {
        return this.mScreenY;
    }

    @Override // com.facebook.react.uimanager.af
    public int getScreenWidth() {
        return this.mScreenWidth;
    }

    @Override // com.facebook.react.uimanager.af
    public int getScreenHeight() {
        return this.mScreenHeight;
    }

    public final YogaDirection getLayoutDirection() {
        return this.mYogaNode.u();
    }

    @Override // com.facebook.react.uimanager.af
    public void setLayoutDirection(YogaDirection yogaDirection) {
        this.mYogaNode.a(yogaDirection);
    }

    @Override // com.facebook.react.uimanager.af
    public final com.facebook.yoga.e getStyleWidth() {
        return this.mYogaNode.m();
    }

    @Override // com.facebook.react.uimanager.af
    public void setStyleWidth(float f) {
        this.mYogaNode.f(f);
    }

    public void setStyleWidthPercent(float f) {
        this.mYogaNode.g(f);
    }

    public void setStyleWidthAuto() {
        this.mYogaNode.n();
    }

    public void setStyleMinWidth(float f) {
        this.mYogaNode.j(f);
    }

    public void setStyleMinWidthPercent(float f) {
        this.mYogaNode.k(f);
    }

    public void setStyleMaxWidth(float f) {
        this.mYogaNode.n(f);
    }

    public void setStyleMaxWidthPercent(float f) {
        this.mYogaNode.o(f);
    }

    @Override // com.facebook.react.uimanager.af
    public final com.facebook.yoga.e getStyleHeight() {
        return this.mYogaNode.o();
    }

    @Override // com.facebook.react.uimanager.af
    public void setStyleHeight(float f) {
        this.mYogaNode.h(f);
    }

    public void setStyleHeightPercent(float f) {
        this.mYogaNode.i(f);
    }

    public void setStyleHeightAuto() {
        this.mYogaNode.p();
    }

    public void setStyleMinHeight(float f) {
        this.mYogaNode.l(f);
    }

    public void setStyleMinHeightPercent(float f) {
        this.mYogaNode.m(f);
    }

    public void setStyleMaxHeight(float f) {
        this.mYogaNode.p(f);
    }

    public void setStyleMaxHeightPercent(float f) {
        this.mYogaNode.q(f);
    }

    public void setFlex(float f) {
        this.mYogaNode.a(f);
    }

    public void setFlexGrow(float f) {
        this.mYogaNode.b(f);
    }

    public void setFlexShrink(float f) {
        this.mYogaNode.c(f);
    }

    public void setFlexBasis(float f) {
        this.mYogaNode.d(f);
    }

    public void setFlexBasisAuto() {
        this.mYogaNode.l();
    }

    public void setFlexBasisPercent(float f) {
        this.mYogaNode.e(f);
    }

    public void setStyleAspectRatio(float f) {
        this.mYogaNode.r(f);
    }

    public void setFlexDirection(YogaFlexDirection yogaFlexDirection) {
        this.mYogaNode.a(yogaFlexDirection);
    }

    public void setFlexWrap(YogaWrap yogaWrap) {
        this.mYogaNode.a(yogaWrap);
    }

    public void setAlignSelf(YogaAlign yogaAlign) {
        this.mYogaNode.b(yogaAlign);
    }

    public void setAlignItems(YogaAlign yogaAlign) {
        this.mYogaNode.a(yogaAlign);
    }

    public void setAlignContent(YogaAlign yogaAlign) {
        this.mYogaNode.c(yogaAlign);
    }

    public void setJustifyContent(YogaJustify yogaJustify) {
        this.mYogaNode.a(yogaJustify);
    }

    public void setOverflow(YogaOverflow yogaOverflow) {
        this.mYogaNode.a(yogaOverflow);
    }

    public void setDisplay(YogaDisplay yogaDisplay) {
        this.mYogaNode.a(yogaDisplay);
    }

    public void setMargin(int i, float f) {
        this.mYogaNode.a(YogaEdge.a(i), f);
    }

    public void setMarginPercent(int i, float f) {
        this.mYogaNode.b(YogaEdge.a(i), f);
    }

    public void setMarginAuto(int i) {
        this.mYogaNode.b(YogaEdge.a(i));
    }

    public final float getPadding(int i) {
        return this.mYogaNode.f(YogaEdge.a(i));
    }

    public final com.facebook.yoga.e getStylePadding(int i) {
        return this.mYogaNode.c(YogaEdge.a(i));
    }

    public void setDefaultPadding(int i, float f) {
        this.mDefaultPadding.a(i, f);
        updatePadding();
    }

    public void setPadding(int i, float f) {
        this.mPadding[i] = f;
        this.mPaddingIsPercent[i] = false;
        updatePadding();
    }

    public void setPaddingPercent(int i, float f) {
        this.mPadding[i] = f;
        this.mPaddingIsPercent[i] = !com.facebook.yoga.b.a(f);
        updatePadding();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void updatePadding() {
        /*
            r4 = this;
            r0 = 0
        L1:
            r1 = 8
            if (r0 > r1) goto Lb6
            if (r0 == 0) goto L62
            r2 = 2
            if (r0 == r2) goto L62
            r2 = 4
            if (r0 == r2) goto L62
            r2 = 5
            if (r0 != r2) goto L11
            goto L62
        L11:
            r2 = 1
            if (r0 == r2) goto L33
            r2 = 3
            if (r0 != r2) goto L18
            goto L33
        L18:
            float[] r1 = r4.mPadding
            r1 = r1[r0]
            boolean r1 = com.facebook.yoga.b.a(r1)
            if (r1 == 0) goto L91
            com.facebook.yoga.d r1 = r4.mYogaNode
            com.facebook.yoga.YogaEdge r2 = com.facebook.yoga.YogaEdge.a(r0)
            com.facebook.react.uimanager.am r3 = r4.mDefaultPadding
            float[] r3 = r3.a
            r3 = r3[r0]
            r1.c(r2, r3)
            goto Lb2
        L33:
            float[] r2 = r4.mPadding
            r2 = r2[r0]
            boolean r2 = com.facebook.yoga.b.a(r2)
            if (r2 == 0) goto L91
            float[] r2 = r4.mPadding
            r3 = 7
            r2 = r2[r3]
            boolean r2 = com.facebook.yoga.b.a(r2)
            if (r2 == 0) goto L91
            float[] r2 = r4.mPadding
            r1 = r2[r1]
            boolean r1 = com.facebook.yoga.b.a(r1)
            if (r1 == 0) goto L91
            com.facebook.yoga.d r1 = r4.mYogaNode
            com.facebook.yoga.YogaEdge r2 = com.facebook.yoga.YogaEdge.a(r0)
            com.facebook.react.uimanager.am r3 = r4.mDefaultPadding
            float[] r3 = r3.a
            r3 = r3[r0]
            r1.c(r2, r3)
            goto Lb2
        L62:
            float[] r2 = r4.mPadding
            r2 = r2[r0]
            boolean r2 = com.facebook.yoga.b.a(r2)
            if (r2 == 0) goto L91
            float[] r2 = r4.mPadding
            r3 = 6
            r2 = r2[r3]
            boolean r2 = com.facebook.yoga.b.a(r2)
            if (r2 == 0) goto L91
            float[] r2 = r4.mPadding
            r1 = r2[r1]
            boolean r1 = com.facebook.yoga.b.a(r1)
            if (r1 == 0) goto L91
            com.facebook.yoga.d r1 = r4.mYogaNode
            com.facebook.yoga.YogaEdge r2 = com.facebook.yoga.YogaEdge.a(r0)
            com.facebook.react.uimanager.am r3 = r4.mDefaultPadding
            float[] r3 = r3.a
            r3 = r3[r0]
            r1.c(r2, r3)
            goto Lb2
        L91:
            boolean[] r1 = r4.mPaddingIsPercent
            boolean r1 = r1[r0]
            if (r1 == 0) goto La5
            com.facebook.yoga.d r1 = r4.mYogaNode
            com.facebook.yoga.YogaEdge r2 = com.facebook.yoga.YogaEdge.a(r0)
            float[] r3 = r4.mPadding
            r3 = r3[r0]
            r1.d(r2, r3)
            goto Lb2
        La5:
            com.facebook.yoga.d r1 = r4.mYogaNode
            com.facebook.yoga.YogaEdge r2 = com.facebook.yoga.YogaEdge.a(r0)
            float[] r3 = r4.mPadding
            r3 = r3[r0]
            r1.c(r2, r3)
        Lb2:
            int r0 = r0 + 1
            goto L1
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.ReactShadowNodeImpl.updatePadding():void");
    }

    public void setBorder(int i, float f) {
        this.mYogaNode.e(YogaEdge.a(i), f);
    }

    public void setPosition(int i, float f) {
        this.mYogaNode.f(YogaEdge.a(i), f);
    }

    public void setPositionPercent(int i, float f) {
        this.mYogaNode.g(YogaEdge.a(i), f);
    }

    public void setPositionType(YogaPositionType yogaPositionType) {
        this.mYogaNode.a(yogaPositionType);
    }

    public void setShouldNotifyOnLayout(boolean z) {
        this.mShouldNotifyOnLayout = z;
    }

    public void setBaselineFunction(YogaBaselineFunction yogaBaselineFunction) {
        this.mYogaNode.a(yogaBaselineFunction);
    }

    public void setMeasureFunction(YogaMeasureFunction yogaMeasureFunction) {
        this.mYogaNode.a(yogaMeasureFunction);
    }

    public boolean isMeasureDefined() {
        return this.mYogaNode.v();
    }

    public String getHierarchyInfo() {
        StringBuilder sb = new StringBuilder();
        getHierarchyInfoWithIndentation(sb, 0);
        return sb.toString();
    }

    private void getHierarchyInfoWithIndentation(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        sb.append("<");
        sb.append(getClass().getSimpleName());
        sb.append(" view='");
        sb.append(getViewClass());
        sb.append("' tag=");
        sb.append(getReactTag());
        if (this.mYogaNode != null) {
            sb.append(" layout='x:");
            sb.append(getScreenX());
            sb.append(" y:");
            sb.append(getScreenY());
            sb.append(" w:");
            sb.append(getLayoutWidth());
            sb.append(" h:");
            sb.append(getLayoutHeight());
            sb.append(CommonConstant.Symbol.SINGLE_QUOTES);
        } else {
            sb.append("(virtual node)");
        }
        sb.append(">\n");
        if (getChildCount() == 0) {
            return;
        }
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            getChildAt(i3).getHierarchyInfoWithIndentation(sb, i + 1);
        }
    }

    @Override // com.facebook.react.uimanager.af
    public void dispose() {
        if (this.mYogaNode == null || this.mYogaNode.h()) {
            return;
        }
        this.mYogaNode.b();
        bg.a().release(this.mYogaNode);
    }

    @Override // com.facebook.react.uimanager.af
    public void setMeasureSpecs(int i, int i2) {
        this.mWidthMeasureSpec = Integer.valueOf(i);
        this.mHeightMeasureSpec = Integer.valueOf(i2);
    }

    @Override // com.facebook.react.uimanager.af
    public Integer getWidthMeasureSpec() {
        return this.mWidthMeasureSpec;
    }

    @Override // com.facebook.react.uimanager.af
    public Integer getHeightMeasureSpec() {
        return this.mHeightMeasureSpec;
    }

    @Override // com.facebook.react.uimanager.af
    public Iterable<? extends af> calculateLayoutOnChildren() {
        if (isVirtualAnchor()) {
            return null;
        }
        return this.mChildren;
    }

    public void setScreenX(int i) {
        this.mScreenX = i;
    }

    public void setScreenY(int i) {
        this.mScreenY = i;
    }

    public void setScreenWidth(int i) {
        this.mScreenWidth = i;
    }

    public void setScreenHeight(int i) {
        this.mScreenHeight = i;
    }
}
