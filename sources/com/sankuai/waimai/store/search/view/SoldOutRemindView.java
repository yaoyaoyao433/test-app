package com.sankuai.waimai.store.search.view;

import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.search.model.SaleOutView;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SoldOutRemindView extends LinearLayout {
    public static ChangeQuickRedirect a;
    private TextView b;
    private TextView c;

    public SoldOutRemindView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c76d83042416042c782c8928cb2dc4ca", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c76d83042416042c782c8928cb2dc4ca");
        }
    }

    public SoldOutRemindView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0a364c166df84b63e55a6bca23d83a2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0a364c166df84b63e55a6bca23d83a2");
        }
    }

    public SoldOutRemindView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab542edbbbeadb07bab89e6faa5f0e75", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab542edbbbeadb07bab89e6faa5f0e75");
        }
    }

    public SoldOutRemindView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5b5deb8102433ddf8e21a517a68c605", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5b5deb8102433ddf8e21a517a68c605");
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db57fb190799ab515eb9cdf2907a5195", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db57fb190799ab515eb9cdf2907a5195");
            return;
        }
        super.onFinishInflate();
        this.b = (TextView) findViewById(R.id.sold_out_view_text);
        this.c = (TextView) findViewById(R.id.sold_out_view_remind);
    }

    public final void a(SaleOutView saleOutView) {
        Object[] objArr = {saleOutView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b6f9450e2bb15d7a4e2d3675fae36b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b6f9450e2bb15d7a4e2d3675fae36b9");
            return;
        }
        if (saleOutView == null) {
            setVisibility(8);
            return;
        }
        if (this.b != null) {
            this.b.setVisibility(TextUtils.isEmpty(saleOutView.saleOutText) ? 8 : 0);
            this.b.setText(saleOutView.saleOutText);
        }
        if (this.c != null) {
            this.c.setVisibility(TextUtils.isEmpty(saleOutView.arrivalReminderText) ? 8 : 0);
            this.c.setText(saleOutView.arrivalReminderText);
        }
    }
}
