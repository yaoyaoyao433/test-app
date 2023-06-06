package com.dianping.shield.layoutcontrol;

import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.WeakHashMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ViewsDrawOrderHelper {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private int[] mDrawingOrderIndices;
    private int mNumberOfChildrenWithZIndex;
    private final ViewGroup mViewGroup;
    private WeakHashMap<View, Integer> mZIndexHash;

    public ViewsDrawOrderHelper(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8db8591ec78d04229dc97b2d0887365b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8db8591ec78d04229dc97b2d0887365b");
            return;
        }
        this.mNumberOfChildrenWithZIndex = 0;
        this.mViewGroup = viewGroup;
        this.mZIndexHash = new WeakHashMap<>();
    }

    public void handleAddView(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "464a027f6ada01d2f45b351256945f67", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "464a027f6ada01d2f45b351256945f67");
            return;
        }
        this.mZIndexHash.put(view, Integer.valueOf(i));
        this.mNumberOfChildrenWithZIndex++;
        this.mDrawingOrderIndices = null;
    }

    public void handleRemoveView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d7a444de28437290d54461e8b126c67", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d7a444de28437290d54461e8b126c67");
            return;
        }
        if (this.mZIndexHash.remove(view) != null) {
            this.mNumberOfChildrenWithZIndex--;
        }
        this.mDrawingOrderIndices = null;
    }

    public void handleUpdateView(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9adc8f835471e6083a26ed368fa20db5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9adc8f835471e6083a26ed368fa20db5");
            return;
        }
        this.mZIndexHash.put(view, Integer.valueOf(i));
        this.mDrawingOrderIndices = null;
    }

    public boolean shouldEnableCustomDrawingOrder() {
        return this.mNumberOfChildrenWithZIndex > 0;
    }

    public int getChildDrawingOrder(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d9c180bd8361b27ff289ffcdfb858336", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d9c180bd8361b27ff289ffcdfb858336")).intValue();
        }
        if (this.mDrawingOrderIndices == null) {
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < i; i3++) {
                arrayList.add(this.mViewGroup.getChildAt(i3));
            }
            Collections.sort(arrayList, new Comparator<View>() { // from class: com.dianping.shield.layoutcontrol.ViewsDrawOrderHelper.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.util.Comparator
                public int compare(View view, View view2) {
                    Object[] objArr2 = {view, view2};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "17028457e45c49875a90719e90ede58a", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "17028457e45c49875a90719e90ede58a")).intValue();
                    }
                    Integer num = (Integer) ViewsDrawOrderHelper.this.mZIndexHash.get(view);
                    if (num == null) {
                        num = 0;
                    }
                    Integer num2 = (Integer) ViewsDrawOrderHelper.this.mZIndexHash.get(view2);
                    if (num2 == null) {
                        num2 = 0;
                    }
                    return num.intValue() - num2.intValue();
                }
            });
            this.mDrawingOrderIndices = new int[i];
            for (int i4 = 0; i4 < i; i4++) {
                this.mDrawingOrderIndices[i4] = this.mViewGroup.indexOfChild((View) arrayList.get(i4));
            }
        }
        return this.mDrawingOrderIndices[i2];
    }

    public void update() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1f824e148c0e30caaf1b76f68ad645fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1f824e148c0e30caaf1b76f68ad645fc");
            return;
        }
        this.mNumberOfChildrenWithZIndex = 0;
        for (int i = 0; i < this.mViewGroup.getChildCount(); i++) {
            if (this.mZIndexHash.get(this.mViewGroup.getChildAt(i)) != null) {
                this.mNumberOfChildrenWithZIndex++;
            }
        }
        this.mDrawingOrderIndices = null;
    }
}
