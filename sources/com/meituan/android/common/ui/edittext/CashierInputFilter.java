package com.meituan.android.common.ui.edittext;

import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CashierInputFilter implements InputFilter {
    private static final int MAX_VALUE = Integer.MAX_VALUE;
    private static final String POINTER = ".";
    private static final int POINTER_LENGTH = 2;
    private static final String ZERO = "0";
    public static ChangeQuickRedirect changeQuickRedirect;
    public Pattern mPattern;

    public CashierInputFilter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9a2d0d89ffdea9fc17af9707490872f9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9a2d0d89ffdea9fc17af9707490872f9");
        } else {
            this.mPattern = Pattern.compile("([0-9]|\\.|￥)*");
        }
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        Object[] objArr = {charSequence, Integer.valueOf(i), Integer.valueOf(i2), spanned, Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7cbfa4d33b73aeac338a85f04654980f", RobustBitConfig.DEFAULT_VALUE)) {
            return (CharSequence) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7cbfa4d33b73aeac338a85f04654980f");
        }
        String charSequence2 = charSequence.toString();
        String obj = spanned.toString();
        if (TextUtils.isEmpty(charSequence2)) {
            return "";
        }
        Matcher matcher = this.mPattern.matcher(charSequence);
        if (obj.contains(".")) {
            if (!matcher.matches() || ".".equals(charSequence.toString())) {
                return "";
            }
            if (i4 - obj.indexOf(".") > 2) {
                return spanned.subSequence(i3, i4);
            }
        } else if (!matcher.matches()) {
            return "";
        } else {
            if (".".equals(charSequence.toString()) && TextUtils.isEmpty(obj)) {
                return "";
            }
            if (!".".equals(charSequence.toString()) && "0".equals(obj)) {
                return "";
            }
        }
        String str = obj + charSequence2;
        if (str.contains("￥")) {
            str = str.substring(1);
        }
        try {
            return Double.parseDouble(str) > 2.147483647E9d ? spanned.subSequence(i3, i4) : charSequence;
        } catch (Exception unused) {
            return spanned.subSequence(i3, i4);
        }
    }
}
