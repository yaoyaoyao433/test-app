package android.support.v4.os;

import android.support.annotation.RestrictTo;
import com.meituan.robust.common.CommonConstant;
import java.util.Locale;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class LocaleHelper {
    LocaleHelper() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Locale forLanguageTag(String str) {
        if (str.contains(CommonConstant.Symbol.MINUS)) {
            String[] split = str.split(CommonConstant.Symbol.MINUS);
            if (split.length > 2) {
                return new Locale(split[0], split[1], split[2]);
            }
            if (split.length > 1) {
                return new Locale(split[0], split[1]);
            }
            if (split.length == 1) {
                return new Locale(split[0]);
            }
        } else if (str.contains(CommonConstant.Symbol.UNDERLINE)) {
            String[] split2 = str.split(CommonConstant.Symbol.UNDERLINE);
            if (split2.length > 2) {
                return new Locale(split2[0], split2[1], split2[2]);
            }
            if (split2.length > 1) {
                return new Locale(split2[0], split2[1]);
            }
            if (split2.length == 1) {
                return new Locale(split2[0]);
            }
        } else {
            return new Locale(str);
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String toLanguageTag(Locale locale) {
        StringBuilder sb = new StringBuilder();
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country != null && !country.isEmpty()) {
            sb.append(CommonConstant.Symbol.MINUS);
            sb.append(locale.getCountry());
        }
        return sb.toString();
    }
}
