package com.meituan.roodesign.widgets.iconfont;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class c extends Drawable {
    public static ChangeQuickRedirect a;
    private Context b;
    private Typeface c;
    private String d;
    private TextPaint e;
    private int f;
    private int g;

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    public c(Context context, Typeface typeface, String str) {
        Object[] objArr = {context, typeface, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc7a977bc8fe1d090176c65b5bbc1ac4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc7a977bc8fe1d090176c65b5bbc1ac4");
            return;
        }
        this.f = -1;
        this.g = 255;
        if (typeface == null) {
            Log.e(c.class.getCanonicalName(), "不存在该字体");
            return;
        }
        Object[] objArr2 = {context, typeface, str};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d6c1ba0c30ceb9b1e1035c15223957e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d6c1ba0c30ceb9b1e1035c15223957e1");
            return;
        }
        this.b = context;
        this.c = typeface;
        this.d = str;
        this.e = new TextPaint();
        this.e.setTypeface(this.c);
        this.e.setStyle(Paint.Style.FILL);
        this.e.setTextAlign(Paint.Align.CENTER);
        this.e.setUnderlineText(false);
        this.e.setColor(-16777216);
        this.e.setAntiAlias(true);
    }

    public final c a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "417360495b483d5f6c044fdc3423ef5f", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "417360495b483d5f6c044fdc3423ef5f") : c(this.b.getResources().getDimensionPixelSize(i));
    }

    public final c b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c128265bc64bad4ef5c2a0edc194b41", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c128265bc64bad4ef5c2a0edc194b41");
        }
        Context context = this.b;
        float f = i;
        Object[] objArr2 = {context, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        return c(PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "65741de2ff1ddcc27dc10dee0d0b0674", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "65741de2ff1ddcc27dc10dee0d0b0674")).intValue() : (int) TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics()));
    }

    public final c c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac5c9017aa1e92ad855695693d80b0f3", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac5c9017aa1e92ad855695693d80b0f3");
        }
        this.f = i;
        setBounds(0, 0, i, i);
        invalidateSelf();
        return this;
    }

    public final c d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "652a45a2a9618e427987da025ea59b2c", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "652a45a2a9618e427987da025ea59b2c");
        }
        this.e.setColor(i);
        invalidateSelf();
        return this;
    }

    public final c e(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e5b903c2faec4ee9dafabb7aa37ff6f", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e5b903c2faec4ee9dafabb7aa37ff6f");
        }
        this.e.setColor(this.b.getResources().getColor(i));
        invalidateSelf();
        return this;
    }

    public final c f(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3df4d4d61e0bb5c9b16aacd4839c2eb", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3df4d4d61e0bb5c9b16aacd4839c2eb");
        }
        setAlpha(i);
        invalidateSelf();
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4996cb4236621b7b7fc900827e843bc5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4996cb4236621b7b7fc900827e843bc5");
            return;
        }
        String str = this.d;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Rect bounds = getBounds();
        int height = bounds.height();
        this.e.setTextSize(height);
        Rect rect = new Rect();
        this.e.getTextBounds(str, 0, 1, rect);
        int height2 = rect.height();
        canvas.drawText(str, bounds.exactCenterX(), ((bounds.top + ((height - height2) / 2.0f)) + height2) - rect.bottom, this.e);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        boolean z;
        Object[] objArr = {iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1771d8968d69dd39b99a6aa95f66dab3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1771d8968d69dd39b99a6aa95f66dab3")).booleanValue();
        }
        int alpha = this.e.getAlpha();
        Object[] objArr2 = {iArr};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "845f75274e3ca8b716f3f6ff9ce48d20", RobustBitConfig.DEFAULT_VALUE)) {
            int length = iArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                } else if (iArr[i] == 16842910) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
        } else {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "845f75274e3ca8b716f3f6ff9ce48d20")).booleanValue();
        }
        int i2 = z ? this.g : this.g / 2;
        this.e.setAlpha(i2);
        return alpha != i2;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56ae808510fe13f2e6933aafae6056d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56ae808510fe13f2e6933aafae6056d6");
            return;
        }
        this.g = i;
        this.e.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Object[] objArr = {colorFilter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71de2a11b1e8eb032b3c08555cd884e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71de2a11b1e8eb032b3c08555cd884e6");
        } else {
            this.e.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2742abd401a12d564e4a803694ff588", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2742abd401a12d564e4a803694ff588");
        } else {
            this.e.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.g;
    }

    public final void a(Paint.Style style) {
        Object[] objArr = {style};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a5970f156452e3eab89f7c3b5898051", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a5970f156452e3eab89f7c3b5898051");
        } else {
            this.e.setStyle(style);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public int b;
        public String c;
        public Typeface d;
        public int e;
        public int f;
        public int g;
        public int h;
        private Context i;
        private String j;
        private int k;
        private Paint.Style l;
        private int m;

        public a(Context context) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99ef0b6cf77a7aae02a37a3b06e5ee9d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99ef0b6cf77a7aae02a37a3b06e5ee9d");
            } else {
                this.i = context;
            }
        }

        public final c a() {
            Typeface a2;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce626b6d5c684c8e0d2618534dfe4366", RobustBitConfig.DEFAULT_VALUE)) {
                return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce626b6d5c684c8e0d2618534dfe4366");
            }
            if (!com.meituan.roodesign.widgets.iconfont.a.a().b) {
                com.meituan.roodesign.widgets.iconfont.a.a().a(this.i);
            }
            if (this.d != null) {
                a2 = this.d;
            } else if (!TextUtils.isEmpty(this.j)) {
                a2 = com.meituan.roodesign.widgets.iconfont.a.a().a(this.j);
            } else {
                a2 = com.meituan.roodesign.widgets.iconfont.a.a().a("wm_c_iconfont");
            }
            String str = null;
            if (this.c != null) {
                str = this.c;
            } else if (this.b != 0) {
                str = this.i.getString(this.b);
            }
            c cVar = new c(this.i, a2, str);
            if (this.g != 0) {
                cVar.d(this.g);
            } else if (this.h != 0) {
                cVar.e(this.h);
            }
            if (this.e != 0) {
                cVar.c(this.e);
            }
            if (this.k != 0) {
                cVar.a(this.k);
            }
            if (this.f != 0) {
                cVar.b(this.f);
            }
            if (this.m != 0) {
                cVar.f(this.m);
            }
            if (this.l != null) {
                cVar.a(this.l);
            }
            return cVar;
        }
    }
}
