package com.dianping.shield.layoutcontrol;

import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ZFrameLayout extends FrameLayout implements IZViewContainer {
    public static ChangeQuickRedirect changeQuickRedirect;
    private ViewsDrawOrderHelper drawingOrderHelper;
    private IDrawChildViewForeground foreground;
    private ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener;

    public void forceMeasure() {
    }

    public ZFrameLayout(@NonNull Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6787ade8caf9452f7646369032bef20a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6787ade8caf9452f7646369032bef20a");
        }
    }

    public ZFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8106a04914d00f21bdc404dacdd64f5b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8106a04914d00f21bdc404dacdd64f5b");
        }
    }

    public ZFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "54d653ff6001f551960976b1789802ab", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "54d653ff6001f551960976b1789802ab");
            return;
        }
        this.drawingOrderHelper = new ViewsDrawOrderHelper(this);
        setEnabled(false);
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ea2bde049f5ad90df2931f922f61a54", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ea2bde049f5ad90df2931f922f61a54")).intValue() : this.drawingOrderHelper.getChildDrawingOrder(i, i2);
    }

    @Override // com.dianping.shield.layoutcontrol.IZViewContainer
    public void addView(View view, ViewGroup.LayoutParams layoutParams, int i) {
        Object[] objArr = {view, layoutParams, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8e2436649edf98ba4be314bc18bcd506", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8e2436649edf98ba4be314bc18bcd506");
            return;
        }
        this.drawingOrderHelper.handleAddView(view, i);
        super.addView(view, -1, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {view, layoutParams};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "092e6c1624ddd282ea5fffa646f52bb3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "092e6c1624ddd282ea5fffa646f52bb3");
            return;
        }
        this.drawingOrderHelper.handleAddView(view, 0);
        super.addView(view, -1, layoutParams);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, int i2) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "910f4256bedaa78dc81bc38479109c7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "910f4256bedaa78dc81bc38479109c7b");
            return;
        }
        this.drawingOrderHelper.handleAddView(view, 0);
        FrameLayout.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        ((ViewGroup.LayoutParams) generateDefaultLayoutParams).width = i;
        ((ViewGroup.LayoutParams) generateDefaultLayoutParams).height = i2;
        super.addView(view, -1, generateDefaultLayoutParams);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f30587c6332fde86d5bb890a345b0762", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f30587c6332fde86d5bb890a345b0762");
            return;
        }
        this.drawingOrderHelper.handleAddView(view, 0);
        super.addView(view, -1, view.getLayoutParams());
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {view, Integer.valueOf(i), layoutParams};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b785b93c203415a26aeea400c0488fd6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b785b93c203415a26aeea400c0488fd6");
            return;
        }
        this.drawingOrderHelper.handleAddView(view, 0);
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "55f9b559ce481b9af676504e85d0a7a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "55f9b559ce481b9af676504e85d0a7a2");
            return;
        }
        super.onViewRemoved(view);
        this.drawingOrderHelper.handleRemoveView(view);
        setChildrenDrawingOrderEnabled();
        if (this.onHierarchyChangeListener != null) {
            this.onHierarchyChangeListener.onChildViewRemoved(this, view);
        }
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "12df9544aebaf81955e6d29b07500966", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "12df9544aebaf81955e6d29b07500966");
            return;
        }
        super.onViewAdded(view);
        setChildrenDrawingOrderEnabled();
        if (this.onHierarchyChangeListener != null) {
            this.onHierarchyChangeListener.onChildViewAdded(this, view);
        }
    }

    @Override // com.dianping.shield.layoutcontrol.IZViewContainer
    public void updateView(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d4619ee22039cad60c663892a463d7a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d4619ee22039cad60c663892a463d7a1");
        } else if (view.getParent() == this) {
            this.drawingOrderHelper.handleUpdateView(view, i);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        Object[] objArr = {canvas, view, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "51531a45ccd7c6cab2afcdec5ae80e2d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "51531a45ccd7c6cab2afcdec5ae80e2d")).booleanValue();
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        if (this.foreground != null) {
            this.foreground.onDraw(canvas, this, view);
        }
        return drawChild;
    }

    @Override // com.dianping.shield.layoutcontrol.IZViewContainer
    public void setDrawViewForeground(IDrawChildViewForeground iDrawChildViewForeground) {
        this.foreground = iDrawChildViewForeground;
    }

    private void setChildrenDrawingOrderEnabled() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "24e88a63ba400a78191023806ccfb52d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "24e88a63ba400a78191023806ccfb52d");
            return;
        }
        if (getChildCount() > 1 && this.drawingOrderHelper.shouldEnableCustomDrawingOrder()) {
            z = true;
        }
        setChildrenDrawingOrderEnabled(z);
    }

    @Override // com.dianping.shield.layoutcontrol.IZViewContainer
    public void setPrivateHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.onHierarchyChangeListener = onHierarchyChangeListener;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "37597638f76c2b159cf17e197ea401ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "37597638f76c2b159cf17e197ea401ff");
        } else {
            super.onLayout(z, i, i2, i3, i4);
        }
    }

    public View inflate(int i, Context context) {
        Object[] objArr = {Integer.valueOf(i), context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8f297bf33518316306c202e7d58a8999", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8f297bf33518316306c202e7d58a8999");
        }
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new IllegalStateException("zFrameLayout replaceview must have a non-null ViewGroup viewParent");
        }
        if (i != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            View inflateViewNoAdd = inflateViewNoAdd(viewGroup, i, context);
            replaceSelfWithView(inflateViewNoAdd, viewGroup);
            return inflateViewNoAdd;
        }
        throw new IllegalArgumentException("zFrameLayout replaceview must have a valid layoutResource");
    }

    private void replaceSelfWithView(View view, ViewGroup viewGroup) {
        Object[] objArr = {view, viewGroup};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dd92e372ea2d80d6b0c412c5d8c17620", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dd92e372ea2d80d6b0c412c5d8c17620");
            return;
        }
        int indexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(view, indexOfChild, layoutParams);
        } else {
            viewGroup.addView(view, indexOfChild);
        }
    }

    private View inflateViewNoAdd(ViewGroup viewGroup, int i, Context context) {
        Object[] objArr = {viewGroup, Integer.valueOf(i), context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "29e332f757147eba644d0617c4a34475", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "29e332f757147eba644d0617c4a34475") : LayoutInflater.from(context).inflate(i, viewGroup, false);
    }
}
