package com.dianping.shield.node.adapter;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.dianping.shield.bridge.ShieldLogger;
import com.dianping.shield.env.ShieldEnvironment;
import com.dianping.shield.layoutcontrol.IZViewContainer;
import com.dianping.shield.node.cellnode.ShieldDisplayNode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class DisplayNodeContainer extends ViewGroup {
    public static ChangeQuickRedirect changeQuickRedirect;
    private ShieldDisplayNode node;
    private View subView;
    private ShieldViewHolder viewHolder;

    public void init() {
    }

    public DisplayNodeContainer(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "deba2782d720236abf47784dcf274636", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "deba2782d720236abf47784dcf274636");
        } else {
            init();
        }
    }

    public DisplayNodeContainer(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "73af8587d9625a7304d99dc7adde4086", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "73af8587d9625a7304d99dc7adde4086");
        } else {
            init();
        }
    }

    public DisplayNodeContainer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6dd9858345105c5138f706e5a0714fc1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6dd9858345105c5138f706e5a0714fc1");
        } else {
            init();
        }
    }

    @TargetApi(21)
    public DisplayNodeContainer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5bb99c4292170fb2718a9cff921801f7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5bb99c4292170fb2718a9cff921801f7");
        } else {
            init();
        }
    }

    public void setSubView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "327c2c93af8f8db9355b4c0cc8cccd87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "327c2c93af8f8db9355b4c0cc8cccd87");
            return;
        }
        if (getChildCount() > 0) {
            removeAllViews();
        }
        this.subView = view;
        if (this.subView == null || this.subView.getParent() == this || (view.getParent() instanceof IZViewContainer)) {
            return;
        }
        boolean isFocused = this.subView.isFocused();
        if (this.subView.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.subView.getParent()).removeView(this.subView);
        }
        addView(this.subView);
        if (isFocused) {
            this.subView.requestFocus();
        }
    }

    public ShieldViewHolder getViewHolder() {
        return this.viewHolder;
    }

    public void setViewHolder(ShieldViewHolder shieldViewHolder) {
        Object[] objArr = {shieldViewHolder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "50a67ebe2611dded44bd9b7f390954bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "50a67ebe2611dded44bd9b7f390954bb");
            return;
        }
        this.viewHolder = shieldViewHolder;
        setSubView(shieldViewHolder.itemView);
    }

    public ShieldDisplayNode getNode() {
        return this.node;
    }

    public void setNode(ShieldDisplayNode shieldDisplayNode) {
        this.node = shieldDisplayNode;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof RecyclerView.g;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Object[] objArr = {attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2053602073928d6f7c977179881d2730", RobustBitConfig.DEFAULT_VALUE) ? (ViewGroup.LayoutParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2053602073928d6f7c977179881d2730") : new RecyclerView.g(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {layoutParams};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c7c45784fbd5ab49aabcb7c946b82242", RobustBitConfig.DEFAULT_VALUE)) {
            return (ViewGroup.LayoutParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c7c45784fbd5ab49aabcb7c946b82242");
        }
        RecyclerView.g gVar = new RecyclerView.g(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            gVar.leftMargin = marginLayoutParams.leftMargin;
            gVar.topMargin = marginLayoutParams.topMargin;
            gVar.rightMargin = marginLayoutParams.rightMargin;
            gVar.bottomMargin = marginLayoutParams.bottomMargin;
        }
        return gVar;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b0ac6bde48993fc0176820b28f7fa5a3", RobustBitConfig.DEFAULT_VALUE) ? (ViewGroup.LayoutParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b0ac6bde48993fc0176820b28f7fa5a3") : new RecyclerView.g(-1, -2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f9844d3c7ddcc50589769ba46e500165", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f9844d3c7ddcc50589769ba46e500165");
        } else if (this.subView == null || this.subView.getParent() != this) {
        } else {
            ViewGroup.LayoutParams layoutParams = this.subView.getLayoutParams();
            int i7 = i3 - i;
            int i8 = i4 - i2;
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                i5 = marginLayoutParams.leftMargin + 0;
                i6 = marginLayoutParams.topMargin + 0;
                i7 -= marginLayoutParams.rightMargin;
                i8 -= marginLayoutParams.bottomMargin;
                if (marginLayoutParams.leftMargin > 0 || marginLayoutParams.topMargin > 0) {
                    ShieldLogger shieldLogger = ShieldEnvironment.INSTANCE.getShieldLogger();
                    shieldLogger.e("@DisplayNodeContainer has margin:" + this.subView.getClass().getCanonicalName(), new Object[0]);
                }
            } else {
                i5 = 0;
                i6 = 0;
            }
            this.subView.layout(i5, i6, Math.min(i7, this.subView.getMeasuredWidth() + i5), Math.min(i8, this.subView.getMeasuredHeight() + i6));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0130, code lost:
        if (r0.height == (-1)) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0157  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.shield.node.adapter.DisplayNodeContainer.onMeasure(int, int):void");
    }
}
