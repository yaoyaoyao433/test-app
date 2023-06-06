package com.sankuai.waimai.store.search.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.StyleSpan;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.foundation.utils.ColorUtils;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.store.search.model.BaseProductPoi;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static void a(boolean z, boolean z2, List<BaseProductPoi.RedWord> list, TextView textView, String str) {
        String str2;
        String str3;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), list, textView, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "878b757a79b7d8126c618e5448ed708c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "878b757a79b7d8126c618e5448ed708c");
            return;
        }
        Context context = textView.getContext();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z) {
            try {
                str2 = "预售";
                spannableStringBuilder.append((CharSequence) "预售");
                com.sankuai.waimai.store.view.c cVar = new com.sankuai.waimai.store.view.c(g.a(context, 16.0f), new LinearGradient(0.0f, 0.0f, 100.0f, 100.0f, ColorUtils.a("#00D2AF", ContextCompat.getColor(context, R.color.wm_sc_nox_search_color_00D2AF)), ColorUtils.a("#00BFBF", ContextCompat.getColor(context, R.color.wm_sc_nox_search_color_00BFBF)), Shader.TileMode.MIRROR), g.a(context, 4.0f), com.sankuai.shangou.stone.util.d.a("#ffffff", -1), g.a(context, 10.0f), g.a(context, 4.0f), 0, g.a(context, 4.0f));
                cVar.b = 5;
                spannableStringBuilder.setSpan(cVar, 0, "预售".length(), 0);
            } catch (Exception unused) {
                textView.setText(spannableStringBuilder);
                return;
            }
        } else {
            str2 = "";
        }
        String str4 = str2;
        if (z2) {
            str3 = "周期购";
            spannableStringBuilder.append((CharSequence) "周期购");
            com.sankuai.waimai.store.view.b bVar = new com.sankuai.waimai.store.view.b(g.a(context, 16.0f), com.sankuai.shangou.stone.util.d.a("#12B536", -1), g.a(context, 4.0f), com.sankuai.shangou.stone.util.d.a("#ffffff", -1), g.a(context, 10.0f), g.a(context, 4.0f), 0, g.a(context, 4.0f));
            bVar.b = 5;
            spannableStringBuilder.setSpan(bVar, str4.length(), str4.length() + "周期购".length(), 0);
        } else {
            str3 = "";
        }
        spannableStringBuilder.append((CharSequence) str);
        a(textView, str, str4.length() + str3.length(), spannableStringBuilder);
        if (list != null) {
            a(spannableStringBuilder, list, str4.length() + str3.length());
        }
        textView.setText(spannableStringBuilder);
    }

    public static void a(String str, final List<BaseProductPoi.RedWord> list, final TextView textView, final String str2) {
        Object[] objArr = {str, list, textView, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f515df1676a666bc55fdf89140652062", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f515df1676a666bc55fdf89140652062");
            return;
        }
        final Context context = textView.getContext();
        final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        final int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_16);
        final int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_4);
        final float a2 = a(str);
        if (a2 == -1.0f) {
            spannableStringBuilder.append((CharSequence) str2);
            a(textView, str2, 0, spannableStringBuilder);
            if (list != null) {
                a(spannableStringBuilder, list, 0);
            }
            textView.setText(spannableStringBuilder);
            return;
        }
        b.C0608b a3 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
        a3.b = context;
        a3.c = str;
        a3.a(new b.a() { // from class: com.sankuai.waimai.store.search.util.d.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.mtimageloader.config.b.a
            public final void a(Bitmap bitmap) {
                Object[] objArr2 = {bitmap};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9289642cd020052e8f23a80e27444514", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9289642cd020052e8f23a80e27444514");
                    return;
                }
                BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), bitmap);
                bitmapDrawable.setBounds(0, 0, (int) (a2 * dimensionPixelSize), dimensionPixelSize);
                spannableStringBuilder.append(StringUtil.SPACE, new com.sankuai.waimai.store.widgets.text.a(bitmapDrawable, 0, dimensionPixelSize2), 0);
                spannableStringBuilder.append((CharSequence) str2);
                d.a(textView, str2, 1, spannableStringBuilder);
                if (list != null) {
                    d.a(spannableStringBuilder, list, 1);
                }
                textView.setText(spannableStringBuilder);
            }

            @Override // com.sankuai.meituan.mtimageloader.config.b.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "02699bf0483e20610cde4b536536a6a3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "02699bf0483e20610cde4b536536a6a3");
                    return;
                }
                spannableStringBuilder.append((CharSequence) str2);
                d.a(textView, str2, 0, spannableStringBuilder);
                if (list != null) {
                    d.a(spannableStringBuilder, list, 0);
                }
                textView.setText(spannableStringBuilder);
            }
        });
    }

    static void a(@NonNull TextView textView, String str, int i, SpannableStringBuilder spannableStringBuilder) {
        Object[] objArr = {textView, str, Integer.valueOf(i), spannableStringBuilder};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5b88d52860313736d519913e21568760", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5b88d52860313736d519913e21568760");
            return;
        }
        textView.setTypeface(Typeface.defaultFromStyle(0));
        spannableStringBuilder.setSpan(new StyleSpan(0), 0, i, 0);
        spannableStringBuilder.setSpan(new StyleSpan(1), i, str.length() + i, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(SpannableStringBuilder spannableStringBuilder, List<BaseProductPoi.RedWord> list, int i) {
        Object[] objArr = {spannableStringBuilder, list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2e2b8084c563d1be9e15ff313ff3cf2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2e2b8084c563d1be9e15ff313ff3cf2a");
            return;
        }
        int a2 = com.sankuai.shangou.stone.util.a.a((List) list);
        for (int i2 = 0; i2 < a2; i2++) {
            BaseProductPoi.RedWord redWord = (BaseProductPoi.RedWord) com.sankuai.shangou.stone.util.a.a((List<Object>) list, i2);
            if (redWord != null && !t.a(redWord.word) && redWord.position == 2) {
                spannableStringBuilder.setSpan(new com.sankuai.waimai.store.view.e() { // from class: com.sankuai.waimai.store.search.util.d.2
                    public static ChangeQuickRedirect a;

                    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                    public final void updateDrawState(@NonNull TextPaint textPaint) {
                        Object[] objArr2 = {textPaint};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8477ca4613fd0f7c36e9dcd91047b8f3", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8477ca4613fd0f7c36e9dcd91047b8f3");
                            return;
                        }
                        super.updateDrawState(textPaint);
                        textPaint.setColor(com.sankuai.shangou.stone.util.d.a("#FF8000", -1));
                        textPaint.setUnderlineText(false);
                    }
                }, redWord.index + i, redWord.index + i + redWord.word.length(), 0);
            }
        }
    }

    private static float a(String str) {
        int i;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8c32e4162dd61e5c78f54d67ead5c01d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8c32e4162dd61e5c78f54d67ead5c01d")).floatValue();
        }
        int indexOf = str.indexOf(63);
        int lastIndexOf = str.lastIndexOf(38);
        if (indexOf == -1 || lastIndexOf == -1) {
            return -1.0f;
        }
        int i2 = indexOf + 3;
        try {
            if (i2 <= str.length() && (i = lastIndexOf + 3) <= str.length()) {
                return Integer.parseInt(str.substring(i2, lastIndexOf)) / Integer.parseInt(str.substring(i));
            }
            return -1.0f;
        } catch (Exception e) {
            com.sankuai.shangou.stone.util.log.a.a(e);
            return -1.0f;
        }
    }
}
