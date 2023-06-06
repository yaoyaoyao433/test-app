package com.meituan.android.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class AlphabetView extends View {
    public static ChangeQuickRedirect a;
    private String[] b;
    private String c;
    private boolean d;
    private a e;
    private Paint f;
    private Paint g;
    private float h;
    private boolean i;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
    }

    public AlphabetView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a442826fdd6819095dd6cccd530ccca5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a442826fdd6819095dd6cccd530ccca5");
        }
    }

    private AlphabetView(Context context, AttributeSet attributeSet) {
        this(context, null, 2);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48d2d1c21c502c663210dfae25f0182c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48d2d1c21c502c663210dfae25f0182c");
        }
    }

    public AlphabetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "641099d57d3191c9ec3afb85b6e71d2c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "641099d57d3191c9ec3afb85b6e71d2c");
            return;
        }
        Resources resources = context.getResources();
        float dimension = resources.getDimension(R.dimen.commonui_alphabet_view_alphabet_padding);
        float dimension2 = resources.getDimension(R.dimen.commonui_alphabet_view_text_size);
        int color = resources.getColor(R.color.commonui_alphabet_view_text_color);
        int color2 = resources.getColor(R.color.commonui_alphabet_view_path_color);
        float dimension3 = resources.getDimension(R.dimen.commonui_alphabet_view_path_radius);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842901, 16842904, R.attr.alphabetPadding, R.attr.pathColor, R.attr.pathRadius}, i, 0);
        this.h = obtainStyledAttributes.getDimension(2, dimension);
        this.f = new Paint();
        this.f.setAntiAlias(true);
        this.f.setTypeface(Typeface.DEFAULT_BOLD);
        this.f.setTextSize(obtainStyledAttributes.getDimension(0, dimension2));
        this.f.setColor(obtainStyledAttributes.getColor(1, color));
        this.g = new Paint();
        this.g.setAntiAlias(true);
        this.g.setColor(obtainStyledAttributes.getColor(3, color2));
        this.g.setPathEffect(new CornerPathEffect(obtainStyledAttributes.getDimension(4, dimension3)));
        obtainStyledAttributes.recycle();
    }

    public void setCharacters(String[] strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a55fbb9a91943be13749157104cc3ef0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a55fbb9a91943be13749157104cc3ef0");
            return;
        }
        this.b = strArr;
        requestLayout();
    }

    public void setOnAlphabetChangeListener(a aVar) {
        this.e = aVar;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        float min;
        int ceil;
        float min2;
        int ceil2;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "561e7f0394ec5b80d6dbca23e26bc109", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "561e7f0394ec5b80d6dbca23e26bc109");
        } else if (this.b == null || this.b.length == 0) {
            setMeasuredDimension(0, 0);
        } else {
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9131d8ea2af214f524a8748736a07b88", RobustBitConfig.DEFAULT_VALUE)) {
                ceil = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9131d8ea2af214f524a8748736a07b88")).intValue();
            } else {
                int mode = View.MeasureSpec.getMode(i);
                int size = View.MeasureSpec.getSize(i);
                if (mode == 1073741824) {
                    min = size;
                } else {
                    float paddingLeft = getPaddingLeft() + getPaddingRight() + a();
                    min = mode == Integer.MIN_VALUE ? Math.min(paddingLeft, size) : paddingLeft;
                }
                ceil = (int) Math.ceil(min);
            }
            int i3 = ceil;
            Object[] objArr3 = {Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8897f4bc6a2c9d8c78cea4a824b73339", RobustBitConfig.DEFAULT_VALUE)) {
                ceil2 = ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8897f4bc6a2c9d8c78cea4a824b73339")).intValue();
            } else {
                int mode2 = View.MeasureSpec.getMode(i2);
                int size2 = View.MeasureSpec.getSize(i2);
                if (mode2 == 1073741824) {
                    min2 = size2;
                } else {
                    float paddingTop = getPaddingTop() + getPaddingBottom() + (this.b.length * (this.f.descent() - this.f.ascent())) + ((this.b.length - 1) * this.h);
                    min2 = mode2 == Integer.MIN_VALUE ? Math.min(paddingTop, size2) : paddingTop;
                }
                ceil2 = (int) Math.ceil(min2);
            }
            setMeasuredDimension(i3, ceil2);
        }
    }

    private float a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d87eab1736162256aebf1cd23935ca94", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d87eab1736162256aebf1cd23935ca94")).floatValue();
        }
        float f = -1.0f;
        for (String str : this.b) {
            float measureText = this.f.measureText(str);
            if (measureText > f) {
                f = measureText;
            }
        }
        return f;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        String[] strArr;
        Path path;
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03a5c1ac3cf7f042909ebd146446e4a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03a5c1ac3cf7f042909ebd146446e4a0");
        } else if (this.b != null) {
            if (this.i) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "baba1ef607d2ff762f28b31f85182731", RobustBitConfig.DEFAULT_VALUE)) {
                    path = (Path) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "baba1ef607d2ff762f28b31f85182731");
                } else {
                    int measuredWidth = getMeasuredWidth();
                    int measuredHeight = getMeasuredHeight();
                    Path path2 = new Path();
                    path2.moveTo(0.0f, 0.0f);
                    float f = measuredWidth;
                    path2.lineTo(f, 0.0f);
                    float f2 = measuredHeight;
                    path2.lineTo(f, f2);
                    path2.lineTo(0.0f, f2);
                    path2.lineTo(0.0f, 0.0f);
                    path2.lineTo(f, 0.0f);
                    path = path2;
                }
                canvas.drawPath(path, this.g);
            }
            float paddingLeft = getPaddingLeft();
            float measuredWidth2 = paddingLeft + (((getMeasuredWidth() - paddingLeft) - getPaddingRight()) / 2.0f);
            float paddingTop = getPaddingTop() - this.f.ascent();
            for (String str : this.b) {
                canvas.drawText(str, measuredWidth2 - (this.f.measureText(str) / 2.0f), paddingTop, this.f);
                paddingTop = paddingTop + (this.f.descent() - this.f.ascent()) + this.h;
            }
        }
    }

    private String a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ee5561dfabba2262870a9fbc09b2371", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ee5561dfabba2262870a9fbc09b2371");
        }
        int paddingTop = (int) ((f - getPaddingTop()) / ((this.f.descent() - this.f.ascent()) + this.h));
        if (paddingTop < 0 || paddingTop >= this.b.length) {
            return null;
        }
        return this.b[paddingTop];
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e85002cd67848f0f2d606a588a3804a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e85002cd67848f0f2d606a588a3804a")).booleanValue();
        }
        int action = motionEvent.getAction();
        float y = motionEvent.getY();
        switch (action) {
            case 0:
                this.i = true;
                this.d = true;
                this.c = a(y);
                break;
            case 1:
                this.i = false;
                this.d = true;
                this.c = null;
                break;
            case 2:
                String a2 = a(y);
                if (this.c != a2) {
                    this.d = true;
                    this.c = a2;
                    break;
                } else {
                    this.d = false;
                    break;
                }
        }
        invalidate();
        return true;
    }
}
