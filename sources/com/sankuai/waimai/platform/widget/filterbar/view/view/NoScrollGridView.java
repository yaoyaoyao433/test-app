package com.sankuai.waimai.platform.widget.filterbar.view.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.GridView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class NoScrollGridView extends GridView {
    public static ChangeQuickRedirect a;
    public boolean b;

    public NoScrollGridView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f183630146f3c245bcbb4b377ad2f18", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f183630146f3c245bcbb4b377ad2f18");
        } else {
            this.b = false;
        }
    }

    public NoScrollGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7af9d755ccc6557b7d417aad9c6c9e99", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7af9d755ccc6557b7d417aad9c6c9e99");
        } else {
            this.b = false;
        }
    }

    public NoScrollGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ff264cfdd0d1b2c42f8d9f4d452074b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ff264cfdd0d1b2c42f8d9f4d452074b");
        } else {
            this.b = false;
        }
    }

    public void setIsScroll(boolean z) {
        this.b = z;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1799427d33107a5a42de65093df66b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1799427d33107a5a42de65093df66b3");
        } else if (!this.b) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
        } else {
            super.onMeasure(i, i2);
        }
    }
}
