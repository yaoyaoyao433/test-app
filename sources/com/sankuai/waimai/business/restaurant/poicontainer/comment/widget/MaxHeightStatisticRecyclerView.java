package com.sankuai.waimai.business.restaurant.poicontainer.comment.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.log.judas.StatisticsRecyclerView;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MaxHeightStatisticRecyclerView extends StatisticsRecyclerView {
    public static ChangeQuickRedirect a;
    private int e;

    public MaxHeightStatisticRecyclerView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e4e1a9ca31a2de6d0e56d29da5e8bda", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e4e1a9ca31a2de6d0e56d29da5e8bda");
        } else {
            this.e = 536870911;
        }
    }

    public MaxHeightStatisticRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6017c5adab86eff71c79f6a106063c8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6017c5adab86eff71c79f6a106063c8");
        } else {
            this.e = 536870911;
        }
    }

    public MaxHeightStatisticRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17b83a8c595d78bbec51db0cdfcb8098", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17b83a8c595d78bbec51db0cdfcb8098");
        } else {
            this.e = 536870911;
        }
    }

    public void setMaxHeight(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcd6dde8b6e1fc574551aba4893d7899", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcd6dde8b6e1fc574551aba4893d7899");
        } else if (i == this.e) {
        } else {
            this.e = i;
            requestLayout();
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efd78b54ed0421d57158c5d86f318027", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efd78b54ed0421d57158c5d86f318027");
        } else {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.e, Integer.MIN_VALUE));
        }
    }
}
