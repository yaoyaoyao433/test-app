package com.sankuai.waimai.bussiness.order.confirm.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes4.dex */
public class NoBottomPaddingTextView extends TextView {
    public static ChangeQuickRedirect a;

    public NoBottomPaddingTextView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7eaf6a824668065b57edabc69013a241", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7eaf6a824668065b57edabc69013a241");
        } else {
            a();
        }
    }

    public NoBottomPaddingTextView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "400468c38e4613462b52e8b755d80422", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "400468c38e4613462b52e8b755d80422");
        } else {
            a();
        }
    }

    public NoBottomPaddingTextView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b880832f7cdcdc3223fd00070352addd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b880832f7cdcdc3223fd00070352addd");
        } else {
            a();
        }
    }

    @RequiresApi(api = 21)
    public NoBottomPaddingTextView(Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09cfb229b84f35f839169e8f2b62ffb9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09cfb229b84f35f839169e8f2b62ffb9");
        } else {
            a();
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e60e5bd0ac2c551b8253b3348de9825a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e60e5bd0ac2c551b8253b3348de9825a");
            return;
        }
        Paint paint = new Paint();
        paint.setTextSize(getTextSize());
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        setPadding(0, 0, 0, fontMetricsInt.top - fontMetricsInt.ascent);
    }
}
