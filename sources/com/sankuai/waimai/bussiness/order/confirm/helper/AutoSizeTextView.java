package com.sankuai.waimai.bussiness.order.confirm.helper;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class AutoSizeTextView extends AppCompatTextView {
    public static ChangeQuickRedirect a;
    private float b;
    private float c;
    private int d;

    public AutoSizeTextView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a51e5af6e176951a4d321be49dde6670", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a51e5af6e176951a4d321be49dde6670");
        } else {
            a();
        }
    }

    public AutoSizeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98356324afaf2bcb280efd8b37b202b0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98356324afaf2bcb280efd8b37b202b0");
        } else {
            a();
        }
    }

    public AutoSizeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c4dc4b1edb9c9d3d65dbf5b5d54ac60", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c4dc4b1edb9c9d3d65dbf5b5d54ac60");
        } else {
            a();
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e8f6c70c4b6e53e68924b120cf6482d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e8f6c70c4b6e53e68924b120cf6482d");
            return;
        }
        this.b = com.meituan.roodesign.widgets.internal.a.b(getContext(), 12.0f);
        this.c = com.meituan.roodesign.widgets.internal.a.b(getContext(), 6.0f);
        this.d = 1;
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        Object[] objArr = {charSequence, bufferType};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6e831a55f8c5aaf32abe1dc27d7e78f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6e831a55f8c5aaf32abe1dc27d7e78f");
            return;
        }
        getPaint().setTextSize(this.b);
        super.setText(charSequence, bufferType);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z = false;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "106e8f8a9f03efe75aef825751000732", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "106e8f8a9f03efe75aef825751000732");
            return;
        }
        super.onMeasure(i, i2);
        CharSequence text = getText();
        TextPaint paint = getPaint();
        if (TextUtils.isEmpty(text)) {
            return;
        }
        float measureText = paint.measureText(text.toString());
        float textSize = paint.getTextSize();
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        while (measureText > measuredWidth && textSize > this.c) {
            textSize -= this.d;
            paint.setTextSize(textSize);
            measureText = paint.measureText(text.toString());
            z = true;
        }
        if (z) {
            super.onMeasure(i, i2);
        }
    }
}
