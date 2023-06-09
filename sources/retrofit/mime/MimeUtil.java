package retrofit.mime;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class MimeUtil {
    private static final Pattern CHARSET = Pattern.compile("\\Wcharset=([^\\s;]+)", 2);

    @Deprecated
    public static String parseCharset(String str) {
        return parseCharset(str, "UTF-8");
    }

    public static String parseCharset(String str, String str2) {
        Matcher matcher = CHARSET.matcher(str);
        return matcher.find() ? matcher.group(1).replaceAll("[\"\\\\]", "") : str2;
    }

    private MimeUtil() {
    }
}
