package com.sankuai.meituan.retrofit2;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class ad {
    public static ChangeQuickRedirect a;
    private static final Pattern c = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    private static final Pattern d = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    final String b;
    private final String e;
    private final String f;
    private final String g;

    private ad(String str, String str2, String str3, String str4) {
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0faa476f4644c0c226971d45a908d287", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0faa476f4644c0c226971d45a908d287");
            return;
        }
        this.e = str;
        this.b = str2;
        this.f = str3;
        this.g = str4;
    }

    public static ad a(String str) {
        String group;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f7ff7f8afe06f6f8aadc8a59884ffccb", 6917529027641081856L)) {
            return (ad) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f7ff7f8afe06f6f8aadc8a59884ffccb");
        }
        if (str == null) {
            return null;
        }
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
                String group2 = matcher2.group(1);
                if (group2 != null && group2.equalsIgnoreCase("charset")) {
                    if (matcher2.group(2) != null) {
                        group = matcher2.group(2);
                    } else {
                        group = matcher2.group(3);
                    }
                    if (str2 != null && !group.equalsIgnoreCase(str2)) {
                        throw new IllegalArgumentException("Multiple different charsets: " + str);
                    }
                    str2 = group;
                }
            }
            return new ad(str, lowerCase, lowerCase2, str2);
        }
        return null;
    }

    public final Charset a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c14ac8b1c799f50ef3647052953ac445", 6917529027641081856L)) {
            return (Charset) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c14ac8b1c799f50ef3647052953ac445");
        }
        if (this.g != null) {
            return Charset.forName(this.g);
        }
        return null;
    }

    public final String toString() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82d54aeba84977431ef36615d0dad999", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82d54aeba84977431ef36615d0dad999")).booleanValue() : (obj instanceof ad) && ((ad) obj).e.equals(this.e);
    }

    public final int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e2111e36ab63c3c4458c6d47ca71140", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e2111e36ab63c3c4458c6d47ca71140")).intValue() : this.e.hashCode();
    }
}
