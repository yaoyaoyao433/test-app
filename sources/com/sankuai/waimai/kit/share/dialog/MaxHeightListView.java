package com.sankuai.waimai.kit.share.dialog;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MaxHeightListView extends ListView {
    public static ChangeQuickRedirect a;
    private int b;

    public MaxHeightListView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd23814f1e21b64a55c8c0678aefd27e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd23814f1e21b64a55c8c0678aefd27e");
        } else {
            this.b = Integer.MAX_VALUE;
        }
    }

    public MaxHeightListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "617596a9e4bb30bf1987404db05f01ed", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "617596a9e4bb30bf1987404db05f01ed");
            return;
        }
        this.b = Integer.MAX_VALUE;
        a(attributeSet, 0);
    }

    public MaxHeightListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef0400f3eafd86d9b8a1a27cc09bde55", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef0400f3eafd86d9b8a1a27cc09bde55");
            return;
        }
        this.b = Integer.MAX_VALUE;
        a(attributeSet, i);
    }

    private void a(AttributeSet attributeSet, int i) {
        Object[] objArr = {attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9645b3211b36b46dd31931fb64fdb287", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9645b3211b36b46dd31931fb64fdb287");
            return;
        }
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{16843040}, i, 0);
        this.b = obtainStyledAttributes.getDimensionPixelSize(0, this.b);
        obtainStyledAttributes.recycle();
    }

    public void setMaxHeight(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2271d8351f20f32d18eea6efd68bccc0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2271d8351f20f32d18eea6efd68bccc0");
        } else if (i == this.b) {
        } else {
            this.b = i;
            requestLayout();
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "633a7741644f7ce670ace80789b12830", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "633a7741644f7ce670ace80789b12830");
            return;
        }
        super.onMeasure(i, i2);
        if (this.b < getMeasuredHeight()) {
            setMeasuredDimension(getMeasuredWidth(), this.b);
        }
    }
}
