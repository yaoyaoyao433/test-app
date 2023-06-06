package com.facebook.react.uimanager;

import android.support.annotation.Nullable;
import com.facebook.react.uimanager.af;
import com.facebook.yoga.YogaDirection;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface af<T extends af> {
    void addChildAt(T t, int i);

    void addNativeChildAt(T t, int i);

    void calculateLayout();

    void calculateLayout(float f, float f2);

    Iterable<? extends af> calculateLayoutOnChildren();

    void dirty();

    boolean dispatchUpdates(float f, float f2, UIViewOperationQueue uIViewOperationQueue, t tVar);

    void dispose();

    T getChildAt(int i);

    int getChildCount();

    Integer getHeightMeasureSpec();

    float getLayoutHeight();

    @Nullable
    T getLayoutParent();

    float getLayoutWidth();

    float getLayoutX();

    float getLayoutY();

    int getNativeChildCount();

    s getNativeKind();

    int getNativeOffsetForChild(T t);

    @Nullable
    T getNativeParent();

    @Nullable
    T getParent();

    int getReactTag();

    int getRootTag();

    int getScreenHeight();

    int getScreenWidth();

    int getScreenX();

    int getScreenY();

    com.facebook.yoga.e getStyleHeight();

    com.facebook.yoga.e getStyleWidth();

    ao getThemedContext();

    String getViewClass();

    Integer getWidthMeasureSpec();

    boolean hasUpdates();

    int indexOf(T t);

    int indexOfNativeChild(T t);

    boolean isDescendantOf(T t);

    boolean isLayoutOnly();

    boolean isVirtual();

    void markUpdateSeen();

    void onAfterUpdateTransaction();

    void onBeforeLayout(t tVar);

    void onCollectExtraUpdates(UIViewOperationQueue uIViewOperationQueue);

    void removeAllNativeChildren();

    void removeAndDisposeAllChildren();

    T removeChildAt(int i);

    T removeNativeChildAt(int i);

    void setIsLayoutOnly(boolean z);

    void setLayoutDirection(YogaDirection yogaDirection);

    void setLayoutParent(@Nullable T t);

    void setLocalData(Object obj);

    void setMeasureSpecs(int i, int i2);

    void setReactTag(int i);

    void setRootTag(int i);

    void setStyleHeight(float f);

    void setStyleWidth(float f);

    void setThemedContext(ao aoVar);

    void setViewClassName(String str);

    boolean shouldNotifyOnLayout();

    void updateProperties(ag agVar);
}
