package com.sankuai.waimai.store.drug.search.common.utils;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.d;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.store.search.model.BaseProductPoi;
import com.sankuai.waimai.store.util.ah;
import com.sankuai.waimai.store.util.i;
import com.sankuai.waimai.store.util.monitor.monitor.StoreException;
import com.sankuai.waimai.store.view.e;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(@NonNull Drawable drawable, List<BaseProductPoi.RedWord> list, @NonNull TextView textView, final String str, String str2, Integer... numArr) {
        Object[] objArr = {drawable, list, textView, str, str2, numArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5f1e2f90c70c49a1989ede32b89fb1c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5f1e2f90c70c49a1989ede32b89fb1c9");
            return;
        }
        Context context = textView.getContext();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "icon ");
        spannableStringBuilder.setSpan(new C1166a(drawable), 0, 4, 33);
        if (com.sankuai.shangou.stone.util.a.b(list)) {
            spannableStringBuilder.append((CharSequence) str2);
            textView.setText(spannableStringBuilder);
            return;
        }
        try {
            BaseProductPoi.RedWord a2 = a(list, numArr);
            if (a2 != null) {
                spannableStringBuilder.append((CharSequence) a2.word);
            }
            spannableStringBuilder.append((CharSequence) str2);
            for (int i = 0; i < list.size(); i++) {
                BaseProductPoi.RedWord redWord = list.get(i);
                if (redWord != null && !t.a(redWord.word) && a(redWord.position, numArr)) {
                    if (redWord.position != 2 && redWord.position != 3) {
                        if (redWord.position == 1 && !a(2, numArr)) {
                            spannableStringBuilder.setSpan(new com.sankuai.waimai.store.view.b(g.a(context, 14.0f), d.a("#19FF8000", -1), g.a(context, 4.0f), d.a("#FF8000", -1), g.a(context, 11.0f), g.a(context, 4.0f), 0, g.a(context, 2.0f)), 5, redWord.word.length(), 0);
                        }
                    }
                    spannableStringBuilder.setSpan(new e() { // from class: com.sankuai.waimai.store.drug.search.common.utils.a.2
                        public static ChangeQuickRedirect a;

                        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                        public final void updateDrawState(@NonNull TextPaint textPaint) {
                            Object[] objArr2 = {textPaint};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2596cccd3b3d3033614f1ff7ee9e22f0", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2596cccd3b3d3033614f1ff7ee9e22f0");
                                return;
                            }
                            super.updateDrawState(textPaint);
                            if (TextUtils.isEmpty(str)) {
                                textPaint.setColor(d.a("#FF8000", -1));
                            } else {
                                textPaint.setColor(d.a(str, -1));
                            }
                            textPaint.setUnderlineText(false);
                        }
                    }, redWord.index + 5, redWord.index + 5 + redWord.word.length(), 0);
                }
            }
            textView.setText(spannableStringBuilder);
        } catch (Exception unused) {
            textView.setText(str2);
            StoreException storeException = StoreException.ApiDataNotRightException;
            ah.a(storeException, "redWorlds: " + i.a(list) + " originText: " + str2);
        }
    }

    public static BaseProductPoi.RedWord a(List<BaseProductPoi.RedWord> list, Integer[] numArr) {
        Object[] objArr = {list, numArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b948a713523a4de8a53e073aac8c6283", RobustBitConfig.DEFAULT_VALUE)) {
            return (BaseProductPoi.RedWord) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b948a713523a4de8a53e073aac8c6283");
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            BaseProductPoi.RedWord redWord = list.get(i);
            if (redWord != null && redWord.position == 1 && a(1, numArr)) {
                return redWord;
            }
        }
        return null;
    }

    public static boolean a(int i, @NonNull Integer... numArr) {
        Object[] objArr = {Integer.valueOf(i), numArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "79c78685b50b1c5ff52d1c93948fd666", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "79c78685b50b1c5ff52d1c93948fd666")).booleanValue();
        }
        for (Integer num : numArr) {
            if (i == num.intValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.drug.search.common.utils.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1166a extends ImageSpan {
        public static ChangeQuickRedirect a;

        public C1166a(@NonNull Drawable drawable) {
            super(drawable);
            Object[] objArr = {drawable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dda99596b226a432603d0ef3a8238dc6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dda99596b226a432603d0ef3a8238dc6");
            }
        }

        @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
        public final void draw(@NonNull Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, @NonNull Paint paint) {
            Object[] objArr = {canvas, charSequence, Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), paint};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce47ba4aa1c4c2f95a40f91dec68784e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce47ba4aa1c4c2f95a40f91dec68784e");
                return;
            }
            Drawable drawable = getDrawable();
            if (drawable != null && canvas != null) {
                Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
                canvas.save();
                canvas.translate(f, ((((i4 + fontMetricsInt.descent) + i4) + fontMetricsInt.ascent) / 2) - (drawable.getBounds().bottom / 2));
                drawable.draw(canvas);
                canvas.restore();
                return;
            }
            super.draw(canvas, charSequence, i, i2, f, i3, i4, i5, paint);
        }
    }
}
