package com.sankuai.waimai.store.goods.list.templet.market.view.custom;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.ColorRes;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextPaint;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.waimai.store.util.b;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class BorderTextView extends AppCompatTextView {
    public static ChangeQuickRedirect a;
    private boolean b;
    private final Paint c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;

    public BorderTextView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aca7285225dfd3dda56100d57e8e3bc3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aca7285225dfd3dda56100d57e8e3bc3");
        }
    }

    public BorderTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c946e8b20ddfd4ed52f5603e8d54e413", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c946e8b20ddfd4ed52f5603e8d54e413");
        }
    }

    public BorderTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e7b8d3992a2a3b946908a9ab5b79665", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e7b8d3992a2a3b946908a9ab5b79665");
            return;
        }
        this.b = false;
        this.c = new Paint();
        this.e = R.color.wm_sg_color_666666;
        this.f = R.color.wm_sg_color_33312d;
        this.g = R.drawable.wm_sc_border_text_view_unselect_back_color;
        this.h = R.drawable.wm_sc_border_text_view_select_back_color;
        this.d = h.a(getContext(), 2.5f);
        this.i = 0;
        this.j = this.d;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "afd707ba7584d50501641f0f1fc8731f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "afd707ba7584d50501641f0f1fc8731f");
            return;
        }
        setMaxLines(1);
        this.c.setAntiAlias(true);
        this.c.setColor(-307644);
        setGravity(17);
        setTextSize(12.0f);
        setSelected(false);
    }

    public void setRedPointPaddingTop(int i) {
        this.i = i;
    }

    public void setRedPointPaddingLeft(int i) {
        this.j = i;
    }

    public void setUnselectedTextColor(@ColorRes int i) {
        this.e = i;
    }

    public void setUnselectedBackground(int i) {
        this.g = i;
    }

    public void setSelectedBackground(int i) {
        this.h = i;
    }

    public void setSelectedTextColor(int i) {
        this.f = i;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "509829796921c82f490ac74b1256869c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "509829796921c82f490ac74b1256869c");
            return;
        }
        super.onDraw(canvas);
        if (this.b) {
            TextPaint paint = getPaint();
            canvas.drawCircle(Math.min((getMeasuredWidth() / 2) + (paint.measureText(String.valueOf(getText())) / 2.0f), getMeasuredWidth() - getPaddingRight()) + this.j, ((getMeasuredHeight() - (paint.descent() - paint.ascent())) / 2.0f) + this.i, this.d, this.c);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setSelected(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11a0a20e837be900a98dc3fbd0bbfe7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11a0a20e837be900a98dc3fbd0bbfe7c");
        } else if (z) {
            setTextColor(b.b(getContext(), this.f));
            setBackgroundResource(this.h);
        } else {
            setTextColor(b.b(getContext(), this.e));
            setBackgroundResource(this.g);
        }
    }

    public void setRedPointStatus(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b17151a15699893503248567c2ac273", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b17151a15699893503248567c2ac273");
            return;
        }
        this.b = z;
        invalidate();
    }

    public void setInText(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38480009717288c76e3ad81075e12375", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38480009717288c76e3ad81075e12375");
            return;
        }
        if (charSequence != null && charSequence.length() > 6) {
            charSequence = ((Object) charSequence.subSequence(0, 5)) + "...";
        }
        super.setText(charSequence);
    }
}
