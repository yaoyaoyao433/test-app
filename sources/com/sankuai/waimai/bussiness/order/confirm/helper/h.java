package com.sankuai.waimai.bussiness.order.confirm.helper;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.StyleSpan;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.capacity.log.i;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class h {
    public static ChangeQuickRedirect a;
    private static final Pattern b = Pattern.compile("¥\\d+(.\\d{1,2})?");

    public static void a(@NonNull TextView textView, @Nullable String str, @Nullable Typeface typeface, int i, int i2) {
        Object[] objArr = {textView, str, typeface, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "da3d279cb717a39bfe197c849b4f8780", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "da3d279cb717a39bfe197c849b4f8780");
        } else {
            a(textView, str, typeface, i, i2, true);
        }
    }

    public static void a(@NonNull TextView textView, @Nullable String str, @Nullable Typeface typeface, int i, int i2, boolean z) {
        int indexOf;
        Object[] objArr = {textView, str, typeface, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e1729eea141073a5121ac10af3436bbd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e1729eea141073a5121ac10af3436bbd");
        } else if (TextUtils.isEmpty(str)) {
            textView.setText(str);
        } else {
            try {
                SpannableString spannableString = new SpannableString(str);
                Matcher matcher = b.matcher(str);
                while (matcher.find()) {
                    int start = matcher.start();
                    int end = matcher.end();
                    if (typeface != null) {
                        spannableString.setSpan(new a(typeface), start, end, 17);
                    }
                    if (z) {
                        spannableString.setSpan(new com.sankuai.waimai.bussiness.order.base.style.b(0, Math.round(textView.getResources().getDisplayMetrics().density * 1.0f)), start, start + 1, 17);
                    }
                    if (i >= 0) {
                        spannableString.setSpan(new AbsoluteSizeSpan(i), start, start + 1, 17);
                    }
                    if (i2 >= 0) {
                        spannableString.setSpan(new AbsoluteSizeSpan(i2), start + 1, end, 17);
                    }
                    if (i >= 0 && str.substring(start, end).contains(CommonConstant.Symbol.DOT) && (indexOf = str.indexOf(CommonConstant.Symbol.DOT, start) + 1) < end) {
                        spannableString.setSpan(new AbsoluteSizeSpan(i), indexOf, end, 17);
                    }
                    spannableString.setSpan(new StyleSpan(1), start, end, 17);
                }
                textView.setText(spannableString);
            } catch (Exception e) {
                textView.setText(str);
                i.d(new com.sankuai.waimai.bussiness.order.base.log.a().a("order_confirm_price_txt_style").c(e.getMessage()).b());
                com.sankuai.waimai.foundation.utils.log.a.b("PriceTextUtil", e.toString(), new Object[0]);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a extends MetricAffectingSpan {
        public static ChangeQuickRedirect a;
        private Typeface b;

        public a(Typeface typeface) {
            Object[] objArr = {typeface};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce888e850d7075d461a31fd8a5d050e5", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce888e850d7075d461a31fd8a5d050e5");
            } else {
                this.b = typeface;
            }
        }

        @Override // android.text.style.MetricAffectingSpan
        public final void updateMeasureState(@NonNull TextPaint textPaint) {
            Object[] objArr = {textPaint};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3b36f54bfbda671e1210c6f79733e0e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3b36f54bfbda671e1210c6f79733e0e");
            } else {
                a(textPaint, this.b);
            }
        }

        @Override // android.text.style.CharacterStyle
        public final void updateDrawState(TextPaint textPaint) {
            Object[] objArr = {textPaint};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7ddab40d553476d93c72053e24e209b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7ddab40d553476d93c72053e24e209b");
            } else {
                a(textPaint, this.b);
            }
        }

        private static void a(Paint paint, Typeface typeface) {
            Object[] objArr = {paint, typeface};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b3d3333fc51d44e5edb7956d8553c276", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b3d3333fc51d44e5edb7956d8553c276");
                return;
            }
            Typeface typeface2 = paint.getTypeface();
            int style = (~typeface.getStyle()) & (typeface2 != null ? typeface2.getStyle() : 0);
            if ((style & 1) != 0) {
                paint.setFakeBoldText(true);
            }
            if ((2 & style) != 0) {
                paint.setTextSkewX(-0.25f);
            }
            paint.setTypeface(typeface);
        }
    }
}
