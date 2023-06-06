package com.sankuai.waimai.store.search.common.util;

import android.content.Context;
import android.support.annotation.ColorRes;
import android.support.constraint.R;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class g {
    public static ChangeQuickRedirect a;

    public static void a(Context context, TextView textView, String str, List<String> list) {
        Object[] objArr = {context, textView, str, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "abadd9eb2ea73a61c7beda763dc322e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "abadd9eb2ea73a61c7beda763dc322e6");
            return;
        }
        SpannableString a2 = a(context, str, list, R.color.wm_sc_nox_search_highlight_text, false);
        textView.setHighlightColor(0);
        textView.setText(a2);
    }

    public static void b(Context context, TextView textView, String str, List<String> list) {
        Object[] objArr = {context, textView, str, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d8771fdef5bbd7ef8a8334d56df3cec1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d8771fdef5bbd7ef8a8334d56df3cec1");
            return;
        }
        SpannableString a2 = a(context, str, list, R.color.wm_sc_nox_search_label_txt_correct_origin, true);
        textView.setHighlightColor(0);
        textView.setText(a2);
    }

    private static SpannableString a(final Context context, String str, List<String> list, @ColorRes final int i, final boolean z) {
        Object[] objArr = {context, str, list, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c93552822cfc1740eabe3dabbb3484f6", RobustBitConfig.DEFAULT_VALUE)) {
            return (SpannableString) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c93552822cfc1740eabe3dabbb3484f6");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        SpannableString spannableString = new SpannableString(str);
        if (com.sankuai.waimai.foundation.utils.d.a(list)) {
            return spannableString;
        }
        for (String str2 : list) {
            if (!TextUtils.isEmpty(str2)) {
                List<Pair<Integer, Integer>> a2 = a(str, str2);
                if (!com.sankuai.waimai.foundation.utils.d.a(a2)) {
                    for (Pair<Integer, Integer> pair : a2) {
                        spannableString.setSpan(new ClickableSpan() { // from class: com.sankuai.waimai.store.search.common.util.g.1
                            public static ChangeQuickRedirect a;

                            @Override // android.text.style.ClickableSpan
                            public final void onClick(View view) {
                                Object[] objArr2 = {view};
                                ChangeQuickRedirect changeQuickRedirect2 = a;
                                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "76b8c3cc2e6d6ca953de22cc52e3ab4a", 4611686018427387906L)) {
                                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "76b8c3cc2e6d6ca953de22cc52e3ab4a");
                                }
                            }

                            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                            public final void updateDrawState(TextPaint textPaint) {
                                Object[] objArr2 = {textPaint};
                                ChangeQuickRedirect changeQuickRedirect2 = a;
                                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ca5b1dfe86e62524d85c361b3c3ff71a", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ca5b1dfe86e62524d85c361b3c3ff71a");
                                    return;
                                }
                                super.updateDrawState(textPaint);
                                textPaint.setColor(context.getResources().getColor(i));
                                textPaint.setFakeBoldText(z);
                                textPaint.setUnderlineText(false);
                            }
                        }, ((Integer) pair.first).intValue(), ((Integer) pair.second).intValue(), 33);
                    }
                }
            }
        }
        return spannableString;
    }

    private static List<Pair<Integer, Integer>> a(String str, String str2) {
        int i = 0;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0d81011487d00cfd9d806d1fa07b06fe", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0d81011487d00cfd9d806d1fa07b06fe");
        }
        ArrayList arrayList = new ArrayList();
        String str3 = str;
        while (str3.contains(str2)) {
            int indexOf = str3.indexOf(str2);
            int indexOf2 = str3.indexOf(str2) + str2.length();
            if (indexOf >= 0 && indexOf2 >= 0 && indexOf < indexOf2) {
                int i2 = indexOf + i;
                i += indexOf2;
                arrayList.add(new Pair(Integer.valueOf(i2), Integer.valueOf(i)));
                str3 = str.substring(i);
            }
        }
        return arrayList;
    }

    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a4fd1fd9e02daea2170ece77163195f0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a4fd1fd9e02daea2170ece77163195f0");
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                return URLDecoder.decode(str, "utf-8");
            } catch (Exception e) {
                com.sankuai.waimai.store.base.log.a.a(e);
            }
        }
        return null;
    }
}
