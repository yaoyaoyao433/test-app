package com.sankuai.waimai.business.im.utils;

import android.os.Parcel;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.AbsoluteSizeSpan;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class IMTextUtils {
    public static ChangeQuickRedirect a;

    public static Spannable a(String[] strArr, int[] iArr, int[] iArr2) {
        Object[] objArr = {strArr, iArr, iArr2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b96694aa46b193557f6abce1b7e9bdb3", RobustBitConfig.DEFAULT_VALUE)) {
            return (Spannable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b96694aa46b193557f6abce1b7e9bdb3");
        }
        if (strArr.length == 0) {
            return new SpannableString("");
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            sb.append(str);
        }
        SpannableString spannableString = new SpannableString(sb.toString());
        int i = 0;
        for (int i2 = 0; i2 < strArr.length; i2++) {
            spannableString.setSpan(new AbsoluteSizeColorSpan(iArr2[i2], true, iArr[i2]), i, strArr[i2].length() + i, 33);
            i += strArr[i2].length();
        }
        return spannableString;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class AbsoluteSizeColorSpan extends AbsoluteSizeSpan {
        public static ChangeQuickRedirect a;
        public final int b;

        public AbsoluteSizeColorSpan(int i, boolean z, int i2) {
            super(i, true);
            Object[] objArr = {Integer.valueOf(i), (byte) 1, Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84d20fc00a03fd95fc009aa8a035a838", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84d20fc00a03fd95fc009aa8a035a838");
            } else {
                this.b = i2;
            }
        }

        @Override // android.text.style.AbsoluteSizeSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            Object[] objArr = {textPaint};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "caa872822726b105ff96a011b451d056", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "caa872822726b105ff96a011b451d056");
                return;
            }
            super.updateDrawState(textPaint);
            textPaint.setColor(this.b);
        }

        @Override // android.text.style.AbsoluteSizeSpan, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            Object[] objArr = {parcel, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7e0b91b37be9fcae45fe1d7dbac4623", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7e0b91b37be9fcae45fe1d7dbac4623");
                return;
            }
            Object[] objArr2 = {parcel, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9fc3ada931b6e3ded4b3b7ea39d9c84f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9fc3ada931b6e3ded4b3b7ea39d9c84f");
                return;
            }
            parcel.writeInt(getSize());
            parcel.writeInt(getDip() ? 1 : 0);
            parcel.writeInt(this.b);
        }
    }
}
