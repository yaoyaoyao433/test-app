package com.meituan.android.legwork.ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.android.legwork.utils.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class StrokeTextView extends TextView {
    public static ChangeQuickRedirect a;
    private TextView b;

    public StrokeTextView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63e7b0d3f3c9cf428499b5900bc2be60", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63e7b0d3f3c9cf428499b5900bc2be60");
            return;
        }
        this.b = null;
        this.b = new TextView(context);
        a();
    }

    public StrokeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24b97dbb2f7c6af15dd8406698e1fb1c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24b97dbb2f7c6af15dd8406698e1fb1c");
            return;
        }
        this.b = null;
        this.b = new TextView(context, attributeSet);
        a();
    }

    public StrokeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef157c720729b11ec9f0899337d4b56c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef157c720729b11ec9f0899337d4b56c");
            return;
        }
        this.b = null;
        this.b = new TextView(context, attributeSet, i);
        a();
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0235609967919a83ea5e76205d05874c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0235609967919a83ea5e76205d05874c");
            return;
        }
        TextPaint paint = this.b.getPaint();
        paint.setStrokeWidth(h.a(3.0f));
        paint.setStyle(Paint.Style.STROKE);
        this.b.setTextColor(Color.parseColor("#FFFFFF"));
        this.b.setGravity(getGravity());
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {layoutParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bd05d84eadf0289e6b189f106e6f085", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bd05d84eadf0289e6b189f106e6f085");
            return;
        }
        super.setLayoutParams(layoutParams);
        this.b.setLayoutParams(layoutParams);
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e5085eae076f8e345650f3c7df44833", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e5085eae076f8e345650f3c7df44833");
            return;
        }
        super.onMeasure(i, i2);
        CharSequence text = this.b.getText();
        if (text == null || !text.equals(getText())) {
            this.b.setText(getText());
            postInvalidate();
        }
        this.b.measure(i, i2);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63735df22a0eea251aa0eaa37d1e55c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63735df22a0eea251aa0eaa37d1e55c1");
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        this.b.layout(i, i2, i3, i4);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9f184ef3db639b6479ece590d40a3f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9f184ef3db639b6479ece590d40a3f7");
            return;
        }
        this.b.draw(canvas);
        super.onDraw(canvas);
    }
}
