package com.squareup.okhttp;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class u {
    private static final Pattern c = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    private static final Pattern d = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    public final String a;
    final String b;
    private final String e;
    private final String f;

    private u(String str, String str2, String str3, String str4) {
        this.e = str;
        this.f = str2;
        this.a = str3;
        this.b = str4;
    }

    public static u a(String str) {
        Matcher matcher = c.matcher(str);
        if (matcher.lookingAt()) {
            String lowerCase = matcher.group(1).toLowerCase(Locale.US);
            String lowerCase2 = matcher.group(2).toLowerCase(Locale.US);
            Matcher matcher2 = d.matcher(str);
            String str2 = null;
            for (int end = matcher.end(); end < str.length(); end = matcher2.end()) {
                matcher2.region(end, str.length());
                if (!matcher2.lookingAt()) {
                    return null;
                }
                String group = matcher2.group(1);
                if (group != null && group.equalsIgnoreCase("charset")) {
                    String group2 = matcher2.group(2) != null ? matcher2.group(2) : matcher2.group(3);
                    if (str2 != null && !group2.equalsIgnoreCase(str2)) {
                        throw new IllegalArgumentException("Multiple different charsets: " + str);
                    }
                    str2 = group2;
                }
            }
            return new u(str, lowerCase, lowerCase2, str2);
        }
        return null;
    }

    public final String a() {
        return this.a;
    }

    public final Charset a(Charset charset) {
        return this.b != null ? Charset.forName(this.b) : charset;
    }

    public final String toString() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof u) && ((u) obj).e.equals(this.e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
