package com.sankuai.waimai.platform.mach.order;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.dianping.titans.widget.DynamicTitleParser;
import com.facebook.yoga.YogaMeasureMode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.foundation.utils.ColorUtils;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.mach.utils.i;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends com.sankuai.waimai.mach.component.e {
    public static ChangeQuickRedirect e;
    private e f;
    private Activity g;
    private Drawable h;
    private boolean i;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    interface d {
        void a(View view);
    }

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc61cd727c5a7db3654f2c78b8728bd2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc61cd727c5a7db3654f2c78b8728bd2");
        } else {
            this.f = new e();
        }
    }

    @Override // com.sankuai.waimai.mach.component.e, com.sankuai.waimai.mach.component.base.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5cac6d98a7086a5a034db81ee80f7142", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5cac6d98a7086a5a034db81ee80f7142");
            return;
        }
        super.a();
        this.g = this.m.getActivity();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = e;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0a4e48d56348fd5804a5394aca2739ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0a4e48d56348fd5804a5394aca2739ff");
        } else {
            e eVar = this.f;
            String a2 = a("icon-align");
            Object[] objArr3 = {a2};
            ChangeQuickRedirect changeQuickRedirect3 = e;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "cbdfb25f57e1baf7a66a370d849a5d6a", RobustBitConfig.DEFAULT_VALUE)) {
                a2 = (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "cbdfb25f57e1baf7a66a370d849a5d6a");
            } else if (TextUtils.isEmpty(a2)) {
                a2 = "start";
            }
            eVar.h = a2;
            this.f.a = a("icon-url");
            this.f.g = a("icon-scheme-url");
            this.f.b = (int) i.c(a("icon-width"));
            this.f.c = (int) i.c(a("icon-height"));
            this.f.d = (int) i.c(a("icon-padding"));
            this.f.e = a("highlight-color");
            this.f.f = a("highlight-weight");
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = e;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "21fcd548b0a9bb779c2a8c09a814497a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "21fcd548b0a9bb779c2a8c09a814497a");
        } else if (TextUtils.isEmpty(this.f.a)) {
        } else {
            this.g.runOnUiThread(new Runnable() { // from class: com.sankuai.waimai.platform.mach.order.c.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "b7494796ea21fe2ac13350dd9afdc87e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "b7494796ea21fe2ac13350dd9afdc87e");
                        return;
                    }
                    b.C0608b a3 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                    a3.b = c.this.g;
                    a3.c = c.this.f.a;
                    a3.e = 0;
                    a3.a(new b.a() { // from class: com.sankuai.waimai.platform.mach.order.c.1.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.meituan.mtimageloader.config.b.a
                        public final void a() {
                        }

                        @Override // com.sankuai.meituan.mtimageloader.config.b.a
                        public final void a(Bitmap bitmap) {
                            Object[] objArr6 = {bitmap};
                            ChangeQuickRedirect changeQuickRedirect6 = a;
                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "e872ba13a8400a367c020923b1240475", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "e872ba13a8400a367c020923b1240475");
                                return;
                            }
                            c.this.h = new BitmapDrawable(c.this.g.getResources(), bitmap);
                            if (c.this.i) {
                                c.this.g();
                            }
                        }
                    });
                }
            });
        }
    }

    @Override // com.sankuai.waimai.mach.component.e, com.sankuai.waimai.mach.component.base.a
    public final void a(com.sankuai.waimai.mach.widget.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f8305bc9695cf6ba150b6ef26a33d1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f8305bc9695cf6ba150b6ef26a33d1e");
            return;
        }
        super.a(eVar);
        e eVar2 = this.f;
        Object[] objArr2 = {eVar2};
        ChangeQuickRedirect changeQuickRedirect2 = e;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c18c2d72a1af3ba59864d75e40e0ad03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c18c2d72a1af3ba59864d75e40e0ad03");
        } else if (eVar2 != null) {
            if (!TextUtils.equals(eVar2.h, "end")) {
                this.d.setPadding(0, 0, g.a(this.g, 15.0f), 0);
            }
            String str = eVar2.a;
            Object[] objArr3 = {str};
            ChangeQuickRedirect changeQuickRedirect3 = e;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d438d76fb2aad61d8045edcb2cbcd57e", RobustBitConfig.DEFAULT_VALUE)) {
                str = (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d438d76fb2aad61d8045edcb2cbcd57e");
            } else if (TextUtils.isEmpty(str)) {
                str = "";
            } else if (str.startsWith("assets://") && this.n != null) {
                str = str.replaceFirst("assets://", this.n.a());
            }
            eVar2.a = str;
            if (TextUtils.isEmpty(eVar2.a)) {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = e;
                if (!(PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "07b3add9f9f995bfa3c54bd9914202fe", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "07b3add9f9f995bfa3c54bd9914202fe")).booleanValue() : this.b.contains("<underline>"))) {
                    this.d.setText(this.b);
                } else {
                    f();
                }
            } else {
                g();
            }
            ViewGroup.LayoutParams layoutParams = this.d.getLayoutParams();
            if (layoutParams instanceof com.sankuai.waimai.mach.widget.d) {
                com.sankuai.waimai.mach.widget.d dVar = (com.sankuai.waimai.mach.widget.d) layoutParams;
                dVar.gravity = 17;
                dVar.width = -1;
                dVar.height = -2;
                this.d.setLayoutParams(dVar);
            } else {
                layoutParams.width = -1;
                layoutParams.height = -2;
                this.d.setLayoutParams(layoutParams);
            }
        }
        this.i = true;
    }

    @Override // com.sankuai.waimai.mach.component.e, com.facebook.yoga.YogaMeasureFunction
    public final long measure(com.facebook.yoga.d dVar, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
        Object[] objArr = {dVar, Float.valueOf(f), yogaMeasureMode, Float.valueOf(f2), yogaMeasureMode2};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c921862c8b0aa4b940711bf1240aae48", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c921862c8b0aa4b940711bf1240aae48")).longValue();
        }
        return super.measure(dVar, (TextUtils.equals(this.f.h, "end") || TextUtils.isEmpty(this.f.a)) ? f : (f - this.f.b) - 10.0f, yogaMeasureMode, f2, yogaMeasureMode2);
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2df3bd311a38b5f0db600ad60131e644", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2df3bd311a38b5f0db600ad60131e644");
            return;
        }
        try {
            this.d.setText(j(this.b));
        } catch (Throwable unused) {
            this.d.setText(this.b);
        }
    }

    private SpannableString j(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52246d16be9f4713ce74ab1d35922fcd", RobustBitConfig.DEFAULT_VALUE)) {
            return (SpannableString) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52246d16be9f4713ce74ab1d35922fcd");
        }
        SpannableString spannableString = new SpannableString(str.replaceAll("<underline>", ""));
        String[] split = str.split("<underline>");
        if (split.length >= 2) {
            spannableString.setSpan(new UnderlineSpan(), split[0].length(), split[0].length() + split[1].length(), 33);
        }
        return spannableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cadd67474569c13db905ce31637627a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cadd67474569c13db905ce31637627a2");
            return;
        }
        try {
            SpannableString a2 = a(this.b, this.h);
            if (!TextUtils.isEmpty(this.f.g)) {
                this.d.setMovementMethod(C1058c.a());
            }
            this.d.setText(a2);
        } catch (Throwable unused) {
            this.d.setText(this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class e {
        public String a;
        public int b;
        public int c;
        public int d;
        public String e;
        public String f;
        public String g;
        public String h;

        public e() {
            this.a = "";
            this.g = "";
            this.h = "";
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    class b extends ImageSpan implements d {
        public static ChangeQuickRedirect c;

        public void a(View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24a5202cd7999bc648f7beea1a06eab0", 4611686018427387906L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24a5202cd7999bc648f7beea1a06eab0");
            }
        }

        public b(@NonNull Drawable drawable) {
            super(drawable);
            Object[] objArr = {c.this, drawable};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bebc62e4bb50bda77b81d83607192ab", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bebc62e4bb50bda77b81d83607192ab");
            }
        }

        @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
        public int getSize(@NonNull Paint paint, CharSequence charSequence, int i, int i2, @Nullable Paint.FontMetricsInt fontMetricsInt) {
            int i3;
            Object[] objArr = {paint, charSequence, Integer.valueOf(i), Integer.valueOf(i2), fontMetricsInt};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14441705bd36e37c197746f1f5ef583e", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14441705bd36e37c197746f1f5ef583e")).intValue();
            }
            Drawable drawable = getDrawable();
            if (fontMetricsInt != null) {
                Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
                if (fontMetricsInt2 == null) {
                    return drawable.getBounds().right;
                }
                int i4 = fontMetricsInt2.descent - fontMetricsInt2.ascent;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (c.this.f != null) {
                    intrinsicWidth = c.this.f.b;
                    intrinsicHeight = c.this.f.c;
                    i3 = c.this.f.d;
                } else {
                    i3 = 0;
                }
                if (intrinsicHeight < i4) {
                    int i5 = fontMetricsInt2.descent - fontMetricsInt2.ascent;
                    drawable.setBounds(i3, 0, ((int) ((i5 / intrinsicHeight) * intrinsicWidth)) + i3, i5);
                }
                int i6 = (intrinsicHeight - i4) / 2;
                fontMetricsInt.ascent = fontMetricsInt2.ascent - i6;
                fontMetricsInt.top = fontMetricsInt2.ascent - i6;
                fontMetricsInt.bottom = fontMetricsInt2.descent + i6;
                fontMetricsInt.descent = fontMetricsInt2.descent + i6;
            }
            return drawable.getBounds().right;
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.platform.mach.order.c$c  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1058c extends LinkMovementMethod {
        public static ChangeQuickRedirect a;
        private static C1058c b;

        public static C1058c a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "73a7c725814e7f77903fc473a66cf5d2", RobustBitConfig.DEFAULT_VALUE)) {
                return (C1058c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "73a7c725814e7f77903fc473a66cf5d2");
            }
            if (b == null) {
                synchronized (C1058c.class) {
                    if (b == null) {
                        b = new C1058c();
                    }
                }
            }
            return b;
        }

        @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
        public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
            Object[] objArr = {textView, spannable, motionEvent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5dda3cb68ab0e1309e8ebaf2a9fbde21", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5dda3cb68ab0e1309e8ebaf2a9fbde21")).booleanValue();
            }
            int action = motionEvent.getAction();
            if (action == 1 || action == 0) {
                int x = ((int) motionEvent.getX()) - textView.getTotalPaddingLeft();
                int y = ((int) motionEvent.getY()) - textView.getTotalPaddingTop();
                int scrollX = x + textView.getScrollX();
                int scrollY = y + textView.getScrollY();
                Layout layout = textView.getLayout();
                int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), scrollX);
                d[] dVarArr = (d[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, d.class);
                if (dVarArr != null && dVarArr.length > 0) {
                    d dVar = dVarArr[0];
                    if (action == 1) {
                        dVar.a(textView);
                    } else {
                        Selection.setSelection(spannable, spannable.getSpanStart(dVar), spannable.getSpanEnd(dVar));
                    }
                    return true;
                }
                return super.onTouchEvent(textView, spannable, motionEvent);
            }
            return super.onTouchEvent(textView, spannable, motionEvent);
        }
    }

    private SpannableString a(String str, Drawable drawable) {
        String str2;
        Object obj;
        int i = 2;
        int i2 = 0;
        Object[] objArr = {str, drawable};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5967bce71b858e8179e70caa5598428", RobustBitConfig.DEFAULT_VALUE)) {
            return (SpannableString) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5967bce71b858e8179e70caa5598428");
        }
        if (TextUtils.equals(this.f.h, "end")) {
            str2 = str + "     ";
        } else {
            str2 = "     " + str;
        }
        SpannableString spannableString = new SpannableString(str2.replaceAll("<highlight>", ""));
        String[] split = str2.split("<highlight>");
        if (split.length >= 2) {
            int length = split[0].length();
            int length2 = split[0].length() + split[1].length();
            if ("normal".equals(this.f.f)) {
                i = 0;
            } else if (!DynamicTitleParser.PARSER_VAL_FONT_STYLE_ITALIC.equals(this.f.f)) {
                i = "bold_italic".equals(this.f.f) ? 3 : 1;
            }
            spannableString.setSpan(new StyleSpan(i), length, length2, 33);
            Integer a2 = ColorUtils.a(this.f.e);
            if (a2 == null) {
                a2 = ColorUtils.a("#FFA800");
            }
            spannableString.setSpan(new ForegroundColorSpan(a2.intValue()), length, length2, 33);
        }
        if (drawable != null) {
            int i3 = 4;
            if (TextUtils.equals(this.f.h, "end")) {
                i2 = spannableString.length() - 4;
                i3 = spannableString.length();
            }
            if (TextUtils.isEmpty(this.f.g)) {
                obj = new a(drawable);
            } else {
                obj = new b(drawable) { // from class: com.sankuai.waimai.platform.mach.order.c.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.platform.mach.order.c.b, com.sankuai.waimai.platform.mach.order.c.d
                    public final void a(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "62f2b892f3bd05fdd1bf805d49091b45", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "62f2b892f3bd05fdd1bf805d49091b45");
                            return;
                        }
                        super.a(view);
                        if (c.this.m != null) {
                            com.sankuai.waimai.foundation.router.a.a(c.this.m.getActivity(), c.this.f.g);
                        }
                    }
                };
            }
            spannableString.setSpan(obj, i2, i3, 33);
        }
        return spannableString;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class a extends ImageSpan {
        public static ChangeQuickRedirect a;

        public a(Drawable drawable) {
            super(drawable);
            Object[] objArr = {c.this, drawable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e426634b532cf9f77e703bd93a22682f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e426634b532cf9f77e703bd93a22682f");
            }
        }

        @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
        public final void draw(@NonNull Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, @NonNull Paint paint) {
            Object[] objArr = {canvas, charSequence, Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), paint};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1302488712db9dd26a6bd06906910f3c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1302488712db9dd26a6bd06906910f3c");
                return;
            }
            try {
                Drawable drawable = getDrawable();
                canvas.save();
                canvas.translate(f, (((i5 - i3) - drawable.getBounds().height()) / 2) + i3);
                drawable.draw(canvas);
                canvas.restore();
            } catch (Throwable unused) {
            }
        }

        @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
        public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
            Object[] objArr = {paint, charSequence, Integer.valueOf(i), Integer.valueOf(i2), fontMetricsInt};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0105256e68f200cae297dd526ffa5200", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0105256e68f200cae297dd526ffa5200")).intValue();
            }
            Drawable drawable = getDrawable();
            int i3 = c.this.f.b;
            int i4 = c.this.f.c;
            e unused = c.this.f;
            if (i3 == 0) {
                i3 = drawable.getIntrinsicWidth();
            }
            if (i4 == 0) {
                i4 = drawable.getIntrinsicHeight();
            }
            drawable.setBounds(0, 0, i3, i4);
            if (fontMetricsInt != null) {
                Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
                if (fontMetricsInt2 == null) {
                    return drawable.getBounds().right;
                }
                int i5 = fontMetricsInt2.descent - fontMetricsInt2.ascent;
                if (i4 > i5) {
                    int i6 = (i4 - i5) / 2;
                    fontMetricsInt.ascent = fontMetricsInt2.ascent - i6;
                    fontMetricsInt.top = fontMetricsInt2.ascent - i6;
                    fontMetricsInt.bottom = fontMetricsInt2.descent + i6;
                    fontMetricsInt.descent = fontMetricsInt2.descent + i6;
                }
            }
            return drawable.getBounds().right;
        }
    }
}
