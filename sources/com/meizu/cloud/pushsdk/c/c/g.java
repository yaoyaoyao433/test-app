package com.meizu.cloud.pushsdk.c.c;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes3.dex */
public final class g {
    private static final Pattern b = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    private static final Pattern c = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    final String a;
    private final String d;
    private final String e;
    private final String f;

    private g(String str, String str2, String str3, String str4) {
        this.d = str;
        this.a = str2;
        this.e = str3;
        this.f = str4;
    }

    public static g a(String str) {
        Matcher matcher = b.matcher(str);
        if (matcher.lookingAt()) {
            String lowerCase = matcher.group(1).toLowerCase(Locale.US);
            String lowerCase2 = matcher.group(2).toLowerCase(Locale.US);
            Matcher matcher2 = c.matcher(str);
            String str2 = null;
            for (int end = matcher.end(); end < str.length(); end = matcher2.end()) {
                matcher2.region(end, str.length());
                if (!matcher2.lookingAt()) {
                    return null;
                }
                if ("charset".equalsIgnoreCase(matcher2.group(1))) {
                    String group = matcher2.group(2) != null ? matcher2.group(2) : matcher2.group(3);
                    if (str2 != null && !group.equalsIgnoreCase(str2)) {
                        throw new IllegalArgumentException("Multiple different charsets: " + str);
                    }
                    str2 = group;
                }
            }
            return new g(str, lowerCase, lowerCase2, str2);
        }
        return null;
    }

    public final Charset a() {
        if (this.f != null) {
            return Charset.forName(this.f);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof g) && ((g) obj).d.equals(this.d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return this.d;
    }
}
