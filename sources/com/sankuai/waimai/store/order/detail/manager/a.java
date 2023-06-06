package com.sankuai.waimai.store.order.detail.manager;

import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.foundation.utils.z;
import com.sankuai.waimai.store.ui.common.CustomDialog;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(final Context context, final ArrayList<String> arrayList) {
        Object[] objArr = {context, arrayList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "65fa18c67323a979f2a9ec499a7cc7b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "65fa18c67323a979f2a9ec499a7cc7b8");
        } else if (com.sankuai.shangou.stone.util.a.b(arrayList)) {
        } else {
            new CustomDialog.a(context).a(R.string.wm_st_shop_cart_dial).a((CharSequence[]) arrayList.toArray(new String[arrayList.size()]), new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.store.order.detail.manager.a.1
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "601e3eca05df87bf593d48050c8bb438", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "601e3eca05df87bf593d48050c8bb438");
                    } else {
                        z.a(context, (String) arrayList.get(i));
                    }
                }
            }).b(R.string.cancel, (DialogInterface.OnClickListener) null).c();
        }
    }

    public static SpannableString a(String str, ArrayList<String> arrayList, @ColorInt final int i, final View.OnClickListener onClickListener) {
        Object[] objArr = {str, arrayList, Integer.valueOf(i), onClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a5316ad9db62d20ff23aee76c9a4df40", RobustBitConfig.DEFAULT_VALUE)) {
            return (SpannableString) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a5316ad9db62d20ff23aee76c9a4df40");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        SpannableString spannableString = new SpannableString(str);
        int a2 = com.sankuai.shangou.stone.util.a.a((List) arrayList);
        for (int i2 = 0; i2 < a2; i2++) {
            String str2 = arrayList.get(i2);
            if (!aa.a(str2)) {
                int indexOf = str.indexOf(str2);
                spannableString.setSpan(new ClickableSpan() { // from class: com.sankuai.waimai.store.order.detail.manager.a.2
                    public static ChangeQuickRedirect a;

                    @Override // android.text.style.ClickableSpan
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c9a93707fc8ad15b50a5c3f77df9ca42", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c9a93707fc8ad15b50a5c3f77df9ca42");
                        } else if (onClickListener != null) {
                            onClickListener.onClick(view);
                        }
                    }

                    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                    public final void updateDrawState(@NonNull TextPaint textPaint) {
                        Object[] objArr2 = {textPaint};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b4c56b7050795d0af092456c098a507c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b4c56b7050795d0af092456c098a507c");
                            return;
                        }
                        super.updateDrawState(textPaint);
                        textPaint.setColor(i);
                        textPaint.setUnderlineText(false);
                    }
                }, indexOf, str2.length() + indexOf, 33);
            }
        }
        return spannableString;
    }

    public static ArrayList<String> a(String str, @NonNull String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b7b417486d30313a0a6c208c209f4866", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b7b417486d30313a0a6c208c209f4866");
        }
        if (aa.a(str) || aa.a(str2)) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        Matcher matcher = Pattern.compile(str2).matcher(str);
        while (matcher.find()) {
            arrayList.add(matcher.group());
        }
        return arrayList;
    }

    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8d0b63b4a097529c3c7c6447b8bff0f2", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8d0b63b4a097529c3c7c6447b8bff0f2") : (TextUtils.isEmpty(str) || StringUtil.NULL.equals(str)) ? "-999" : str;
    }

    public static ArrayList<String> b(@NonNull String str, @NonNull String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4c4b509317b252464618b24e2dfb2c56", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4c4b509317b252464618b24e2dfb2c56");
        }
        ArrayList<String> arrayList = new ArrayList<>();
        Matcher matcher = Pattern.compile(str2).matcher(str);
        while (matcher.find()) {
            arrayList.add(matcher.group(1));
        }
        return arrayList;
    }
}
