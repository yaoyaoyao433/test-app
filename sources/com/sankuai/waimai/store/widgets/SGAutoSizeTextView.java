package com.sankuai.waimai.store.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
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
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.foundation.utils.ColorUtils;
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

    public SGAutoSizeTextView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b199b09feab986763afafef2af8ee433", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b199b09feab986763afafef2af8ee433");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e9d6ece01e8a1fd2b3acb152eac6c63", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e9d6ece01e8a1fd2b3acb152eac6c63");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9378c473a0cde292d5f65805b326d639", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9378c473a0cde292d5f65805b326d639");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "677de2cf9479a835d65128f844532a1b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "677de2cf9479a835d65128f844532a1b");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e4fe895739acc5611f9b94246cb3977", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e4fe895739acc5611f9b94246cb3977");
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ASTV_textColor, R.attr.ASTV_text, R.attr.ASTV_pointTextSize, R.attr.ASTV_textSize, R.attr.ASTV_isBold});
        this.f = obtainStyledAttributes.getColor(0, ColorUtils.a("#333333", -16777216));
        this.j = obtainStyledAttributes.getDimension(3, 20.0f);
        this.g = obtainStyledAttributes.getString(1);
        this.b = obtainStyledAttributes.getDimension(2, 20.0f);
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
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d715cee216a7ed1b3fc89c2514a0a881", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d715cee216a7ed1b3fc89c2514a0a881");
            return;
        }
        super.onDraw(canvas);
        if (this.g == null) {
            return;
        }
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88f08bc8c5ff99eba8a8dc06bf57661a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88f08bc8c5ff99eba8a8dc06bf57661a");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cdf411c2b52926d364086efd8c9c5f1a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cdf411c2b52926d364086efd8c9c5f1a");
        } else if (this.g != null && (this.g instanceof SpannableString)) {
            SpannableString spannableString = (SpannableString) this.g;
            for (AbsoluteSizeSpan absoluteSizeSpan : (AbsoluteSizeSpan[]) spannableString.getSpans(0, spannableString.length(), AbsoluteSizeSpan.class)) {
                try {
                    Field declaredField = AbsoluteSizeSpan.class.getDeclaredField("mSize");
                    declaredField.setAccessible(true);
                    try {
                        declaredField.setInt(absoluteSizeSpan, (int) this.b);
                    } catch (IllegalAccessException e) {
                        com.sankuai.waimai.store.base.log.a.a(e);
                    }
                } catch (NoSuchFieldException e2) {
                    com.sankuai.waimai.store.base.log.a.a(e2);
                }
            }
        }
    }

    private void b() {
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8a2f34d03c9171a2fe0277b00a14266", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8a2f34d03c9171a2fe0277b00a14266");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df5bb17cd4949aa98d1a1d1d98dc3125", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df5bb17cd4949aa98d1a1d1d98dc3125")).intValue();
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
}
