package com.sankuai.waimai.bussiness.order.detailnew.widget;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class OrderStatusTitleView extends AppCompatTextView {
    public static ChangeQuickRedirect a;

    public OrderStatusTitleView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7127d675362d4960a19812c53f293766", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7127d675362d4960a19812c53f293766");
        }
    }

    public OrderStatusTitleView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3573bbc035d9d1b7e3f82e214e30f9a7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3573bbc035d9d1b7e3f82e214e30f9a7");
        }
    }

    public OrderStatusTitleView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce2620bf568df3d5bc5087777f54ce29", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce2620bf568df3d5bc5087777f54ce29");
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d59e6651ee8fc4660cbe08ef45e2288", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d59e6651ee8fc4660cbe08ef45e2288");
            return;
        }
        a(View.MeasureSpec.getSize(i));
        super.onMeasure(i, i2);
    }

    private void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f588abb664d6ed2a5759812cfa1947e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f588abb664d6ed2a5759812cfa1947e2");
        } else if (i <= 0) {
        } else {
            TextPaint paint = getPaint();
            String charSequence = getText().toString();
            int i2 = 24;
            do {
                setTextSize(i2);
                if (paint.measureText(charSequence) <= i) {
                    return;
                }
                i2 -= 2;
            } while (i2 >= 18);
        }
    }
}
