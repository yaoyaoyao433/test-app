package com.sankuai.waimai.store.drug.newwidgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.constraint.R;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.AbsoluteSizeSpan;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.base.log.a;
import java.lang.reflect.Field;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGAutoSizeTextView extends View {
    public static ChangeQuickRedirect a;
    public float b;
    private final String c;
    private final String d;
    private final int e;
    private int f;
    private CharSequence g;
    private TextPaint h;
    private TextPaint i;
    private float j;
    private boolean k;
    private String l;
    private String m;
    private Rect n;
    private StaticLayout o;
    private float p;
    private float q;

    public SGAutoSizeTextView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "895ffcd057abc92d489a96c621493c0f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "895ffcd057abc92d489a96c621493c0f");
            return;
        }
        this.c = "¥";
        this.d = CommonConstant.Symbol.DOT;
        this.e = 10;
        a(context, null);
    }

    public SGAutoSizeTextView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a00ce7602a7bc5524fcc76873f23d51", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a00ce7602a7bc5524fcc76873f23d51");
            return;
        }
        this.c = "¥";
        this.d = CommonConstant.Symbol.DOT;
        this.e = 10;
        a(context, attributeSet);
    }

    public SGAutoSizeTextView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "943ac9a6b0a63399bbdcf2e3cd4cbeb9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "943ac9a6b0a63399bbdcf2e3cd4cbeb9");
            return;
        }
        this.c = "¥";
        this.d = CommonConstant.Symbol.DOT;
        this.e = 10;
        a(context, attributeSet);
    }

    @RequiresApi(api = 21)
    public SGAutoSizeTextView(Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "014a00439f041742247eda5cb2adbb66", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "014a00439f041742247eda5cb2adbb66");
            return;
        }
        this.c = "¥";
        this.d = CommonConstant.Symbol.DOT;
        this.e = 10;
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55e742f8c680c7893f7cdbe1ced96b0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55e742f8c680c7893f7cdbe1ced96b0b");
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ASTV_textColor, R.attr.ASTV_text, R.attr.ASTV_pointTextSize, R.attr.ASTV_textSize, R.attr.ASTV_isBold});
        this.f = obtainStyledAttributes.getColor(0, Color.parseColor("#333333"));
        this.j = obtainStyledAttributes.getDimension(3, 20.0f);
        this.p = this.j;
        this.g = obtainStyledAttributes.getString(1);
        this.b = obtainStyledAttributes.getDimension(2, 20.0f);
        this.q = this.b;
        this.k = obtainStyledAttributes.getBoolean(4, false);
        obtainStyledAttributes.recycle();
        b();
        this.h = new TextPaint(1);
        this.h.setColor(this.f);
        this.h.setTextSize(this.j);
        this.h.setStyle(Paint.Style.FILL);
        this.h.setFakeBoldText(this.k);
        this.i = new TextPaint(1);
        this.i.setColor(this.f);
        this.i.setTextSize(this.b);
        this.i.setStyle(Paint.Style.FILL);
        this.i.setFakeBoldText(this.k);
        this.n = new Rect();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4dadb353c63204a342d867e2449f442", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4dadb353c63204a342d867e2449f442");
            return;
        }
        super.onMeasure(i, i2);
        setMeasuredDimension(getDefaultSize(getSuggestedMinimumWidth(), View.MeasureSpec.makeMeasureSpec(Math.min(getOriginalContentWidth() + h.a(getContext(), 4.0f), getMeasuredWidth()), 1073741824)), getDefaultSize(getSuggestedMinimumHeight(), i2));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48aafda8e7b37e28667602554b444f22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48aafda8e7b37e28667602554b444f22");
            return;
        }
        super.onDraw(canvas);
        if (this.g == null) {
            return;
        }
        this.h.setTextSize(this.j);
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        while (getContentWidth() > width && this.j > 10.0f) {
            TextPaint textPaint = this.h;
            float f = this.j;
            this.j = f - 1.0f;
            textPaint.setTextSize(f);
        }
        if (this.o == null) {
            this.o = new StaticLayout(this.g, this.h, width, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        }
        while (this.o.getLineCount() > 1 && this.j > 10.0f) {
            TextPaint textPaint2 = this.h;
            float f2 = this.j;
            this.j = f2 - 1.0f;
            textPaint2.setTextSize(f2);
            this.o = new StaticLayout(this.g, this.h, width, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        }
        if (this.b > this.j) {
            this.b = this.j;
            a();
        }
        this.o.draw(canvas);
    }

    public void setText(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2cebf34c771c2bf5fa14c757a271cd92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2cebf34c771c2bf5fa14c757a271cd92");
            return;
        }
        this.g = charSequence;
        b();
        invalidate();
    }

    private void a() {
        AbsoluteSizeSpan[] absoluteSizeSpanArr;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06e9872df6f675bf1a44d9f43602c6bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06e9872df6f675bf1a44d9f43602c6bb");
        } else if (this.g != null && (this.g instanceof SpannableString)) {
            SpannableString spannableString = (SpannableString) this.g;
            for (AbsoluteSizeSpan absoluteSizeSpan : (AbsoluteSizeSpan[]) spannableString.getSpans(0, spannableString.length(), AbsoluteSizeSpan.class)) {
                try {
                    Field declaredField = AbsoluteSizeSpan.class.getDeclaredField("mSize");
                    declaredField.setAccessible(true);
                    try {
                        declaredField.setInt(absoluteSizeSpan, (int) this.b);
                    } catch (IllegalAccessException e) {
                        a.a(e);
                    }
                } catch (NoSuchFieldException e2) {
                    a.a(e2);
                }
            }
        }
    }

    private void b() {
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eed2a20fec1445cd248e2dc21309eb37", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eed2a20fec1445cd248e2dc21309eb37");
        } else if (this.g != null) {
            String trim = this.g.toString().trim();
            if (t.a(trim)) {
                return;
            }
            StringBuilder sb = new StringBuilder("");
            int length = trim.length();
            int indexOf = trim.indexOf("¥");
            int indexOf2 = trim.indexOf(CommonConstant.Symbol.DOT);
            if (indexOf != -1) {
                sb.append("¥");
                i = 1;
            }
            if (indexOf2 != -1) {
                sb.append(trim.substring(indexOf2));
                length = indexOf2;
            }
            this.l = trim.substring(i, length);
            this.m = sb.toString();
        }
    }

    private int getContentWidth() {
        int i;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65d4d9ad546bd0d6479c564aed719497", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65d4d9ad546bd0d6479c564aed719497")).intValue();
        }
        if (t.a(this.l)) {
            i = 0;
        } else {
            this.h.getTextBounds(this.l, 0, this.l.length(), this.n);
            i = this.n.width() + 0;
        }
        if (t.a(this.m)) {
            return i;
        }
        this.i.getTextBounds(this.m, 0, this.m.length(), this.n);
        return i + this.n.width();
    }

    private int getOriginalContentWidth() {
        int i;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f61593e2de3af7770f6c492879b081a6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f61593e2de3af7770f6c492879b081a6")).intValue();
        }
        if (t.a(this.l)) {
            i = 0;
        } else {
            this.h.setTextSize(this.p);
            this.h.getTextBounds(this.l, 0, this.l.length(), this.n);
            i = this.n.width() + 0;
        }
        if (t.a(this.m)) {
            return i;
        }
        this.h.setTextSize(this.q);
        this.i.getTextBounds(this.m, 0, this.m.length(), this.n);
        return i + this.n.width();
    }
}
