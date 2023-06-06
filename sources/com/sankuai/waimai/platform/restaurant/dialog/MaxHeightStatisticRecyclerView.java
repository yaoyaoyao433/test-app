package com.sankuai.waimai.platform.restaurant.dialog;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.log.judas.StatisticsRecyclerView;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MaxHeightStatisticRecyclerView extends StatisticsRecyclerView {
    public static ChangeQuickRedirect a;
    private int e;

    public MaxHeightStatisticRecyclerView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a2de46c08cb1164458258dfe143daa0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a2de46c08cb1164458258dfe143daa0");
        } else {
            this.e = 536870911;
        }
    }

    public MaxHeightStatisticRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "571e6a06e08145b238a5bcc9528bf935", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "571e6a06e08145b238a5bcc9528bf935");
        } else {
            this.e = 536870911;
        }
    }

    public MaxHeightStatisticRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df8ad3ca3745db4c43eab8edcb9d6024", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df8ad3ca3745db4c43eab8edcb9d6024");
        } else {
            this.e = 536870911;
        }
    }

    public void setMaxHeight(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c91a57f808e6bcdb35ad548910a9497e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c91a57f808e6bcdb35ad548910a9497e");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ac025820fe37eceeecffa8860df4e4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ac025820fe37eceeecffa8860df4e4a");
        } else {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.e, Integer.MIN_VALUE));
        }
    }
}
