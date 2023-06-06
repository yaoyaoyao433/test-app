package com.sankuai.waimai.business.search.common.util;

import android.content.Context;
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
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class l {
    public static ChangeQuickRedirect a;

    public static int a(Context context, int i) {
        Object[] objArr = {context, 40};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c7758f30c72c1bce5f6f015fd7489e67", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c7758f30c72c1bce5f6f015fd7489e67")).intValue();
        }
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        return (int) ((PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "b6819746d717bb30edd0ce07c9c5b5a9", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "b6819746d717bb30edd0ce07c9c5b5a9")).floatValue() : context.getResources().getDisplayMetrics().density) * 40.0f);
    }

    public static int a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7516d1ef5eb80d97cbc46fa29dd090db", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7516d1ef5eb80d97cbc46fa29dd090db")).intValue() : context.getResources().getDisplayMetrics().heightPixels;
    }

    public static void a(final Context context, TextView textView, String str, List<String> list) {
        Object[] objArr = {context, textView, str, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        SpannableString spannableString = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d5b1712b66407dabc4a3b33ff2972196", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d5b1712b66407dabc4a3b33ff2972196");
            return;
        }
        Object[] objArr2 = {context, str, list, Integer.valueOf((int) R.color.wm_nox_search_label_txt_correct_origin), (byte) 0};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "8349c6181af2c84adee19d3dc8ee13c1", RobustBitConfig.DEFAULT_VALUE)) {
            spannableString = (SpannableString) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "8349c6181af2c84adee19d3dc8ee13c1");
        } else if (!TextUtils.isEmpty(str)) {
            spannableString = new SpannableString(str);
            if (!com.sankuai.waimai.foundation.utils.d.a(list)) {
                for (String str2 : list) {
                    if (!TextUtils.isEmpty(str2)) {
                        List<Pair<Integer, Integer>> a2 = a(str, str2);
                        if (!com.sankuai.waimai.foundation.utils.d.a(a2)) {
                            for (Pair<Integer, Integer> pair : a2) {
                                spannableString.setSpan(new ClickableSpan() { // from class: com.sankuai.waimai.business.search.common.util.l.1
                                    public static ChangeQuickRedirect a;

                                    @Override // android.text.style.ClickableSpan
                                    public final void onClick(View view) {
                                        Object[] objArr3 = {view};
                                        ChangeQuickRedirect changeQuickRedirect3 = a;
                                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "20bd9f3b3d25c7869a37daac7dc61afa", 4611686018427387906L)) {
                                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "20bd9f3b3d25c7869a37daac7dc61afa");
                                        }
                                    }

                                    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                                    public final void updateDrawState(TextPaint textPaint) {
                                        Object[] objArr3 = {textPaint};
                                        ChangeQuickRedirect changeQuickRedirect3 = a;
                                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9f1c471d53ffc91c38bf0f521941c2e1", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9f1c471d53ffc91c38bf0f521941c2e1");
                                            return;
                                        }
                                        super.updateDrawState(textPaint);
                                        textPaint.setColor(context.getResources().getColor(r2));
                                        textPaint.setFakeBoldText(r3);
                                        textPaint.setUnderlineText(false);
                                    }
                                }, ((Integer) pair.first).intValue(), ((Integer) pair.second).intValue(), 33);
                            }
                        }
                    }
                }
            }
        }
        textView.setHighlightColor(0);
        textView.setText(spannableString);
    }

    private static List<Pair<Integer, Integer>> a(String str, String str2) {
        int i = 0;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "437c786b5ab31b13bb354fee19377ca3", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "437c786b5ab31b13bb354fee19377ca3");
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
}
