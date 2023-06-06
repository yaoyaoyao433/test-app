package com.dianping.shield.layoutcontrol;

import android.animation.LayoutTransition;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import com.dianping.shield.node.adapter.status.ICollectionWithExposeElement;
import com.dianping.shield.node.adapter.status.IScreenVisibleExposeEdge;
import com.dianping.shield.node.cellnode.InnerHoverInfo;
import com.dianping.shield.node.cellnode.ShieldDisplayNode;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface IHoverLayout extends ICollectionWithExposeElement<ShieldDisplayNode> {

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface OnChildHeightChangeListener {
        void onChildHeightChangeListener(View view, int i, int i2, int i3, int i4);
    }

    void addChildHeightChangeListener(OnChildHeightChangeListener onChildHeightChangeListener);

    boolean addView(@NonNull View view, @NonNull ZLayoutChildInfo zLayoutChildInfo);

    void clearFocus();

    void forceMeasure();

    List<View> getChildsByType(@NonNull InnerHoverInfo.HoverType hoverType);

    ViewGroup getContainer();

    List<View> getCurrentHoverView();

    View getFocusedChild();

    ViewGroup.LayoutParams getLayoutParam(ViewGroup.MarginLayoutParams marginLayoutParams, int i);

    int getMeasuredHeight();

    int getMeasuredWidth();

    boolean isChild(@NonNull View view);

    void removeChildHeightChangeListener(OnChildHeightChangeListener onChildHeightChangeListener);

    boolean removeView(@NonNull View view);

    boolean removeView(@NonNull View view, @NonNull InnerHoverInfo.HoverType hoverType);

    void requestLayout();

    void setGlobalExtraNodeExposeInterface(IScreenVisibleExposeEdge iScreenVisibleExposeEdge);

    void setLayoutTransition(LayoutTransition layoutTransition);

    void updateView(@NonNull View view, @NonNull ZLayoutChildInfo zLayoutChildInfo);
}
