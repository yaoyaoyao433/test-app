package com.squareup.okhttp;

import com.meituan.robust.common.CommonConstant;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class s {
    private static final char[] f = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final String a;
    public final String b;
    public final int c;
    public final List<String> d;
    final List<String> e;
    private final String g;
    private final String h;
    private final String i;
    private final String j;

    static int a(char c) {
        if (c < '0' || c > '9') {
            if (c < 'a' || c > 'f') {
                if (c < 'A' || c > 'F') {
                    return -1;
                }
                return (c - 'A') + 10;
            }
            return (c - 'a') + 10;
        }
        return c - '0';
    }

    /* synthetic */ s(a aVar, AnonymousClass1 anonymousClass1) {
        this(aVar);
    }

    private s(a aVar) {
        this.a = aVar.a;
        this.g = a(aVar.b, false);
        this.h = a(aVar.c, false);
        this.b = aVar.d;
        this.c = aVar.a();
        this.d = a(aVar.f, false);
        this.e = aVar.g != null ? a(aVar.g, true) : null;
        this.i = aVar.h != null ? a(aVar.h, false) : null;
        this.j = aVar.toString();
    }

    public final URL a() {
        try {
            return new URL(this.j);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public final URI b() {
        try {
            a i = i();
            int size = i.f.size();
            for (int i2 = 0; i2 < size; i2++) {
                i.f.set(i2, a(i.f.get(i2), "[]", true, false, true));
            }
            if (i.g != null) {
                int size2 = i.g.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    String str = i.g.get(i3);
                    if (str != null) {
                        i.g.set(i3, a(str, "\\^`{|}", true, true, true));
                    }
                }
            }
            if (i.h != null) {
                i.h = a(i.h, " \"#<>\\^`{|}", true, false, false);
            }
            return new URI(i.toString());
        } catch (URISyntaxException unused) {
            throw new IllegalStateException("not valid as a java.net.URI: " + this.j);
        }
    }

    public final boolean c() {
        return this.a.equals("https");
    }

    public final String d() {
        if (this.g.isEmpty()) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.j;
        return this.j.substring(length, b(str, length, str.length(), ":@"));
    }

    public final String e() {
        if (this.h.isEmpty()) {
            return "";
        }
        int indexOf = this.j.indexOf(64);
        return this.j.substring(this.j.indexOf(58, this.a.length() + 3) + 1, indexOf);
    }

    public static int a(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public final String f() {
        int indexOf = this.j.indexOf(47, this.a.length() + 3);
        String str = this.j;
        return this.j.substring(indexOf, b(str, indexOf, str.length(), "?#"));
    }

    static void a(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append('/');
            sb.append(list.get(i));
        }
    }

    public final List<String> g() {
        int indexOf = this.j.indexOf(47, this.a.length() + 3);
        String str = this.j;
        int b = b(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < b) {
            int i = indexOf + 1;
            int b2 = b(this.j, i, b, "/");
            arrayList.add(this.j.substring(i, b2));
            indexOf = b2;
        }
        return arrayList;
    }

    public final String h() {
        if (this.e == null) {
            return null;
        }
        int indexOf = this.j.indexOf(63) + 1;
        return this.j.substring(indexOf, b(this.j, indexOf + 1, this.j.length(), "#"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            String str = list.get(i);
            String str2 = list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    public static List<String> b(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int indexOf = str.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i, indexOf));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            }
            i = indexOf + 1;
        }
        return arrayList;
    }

    private String j() {
        if (this.i == null) {
            return null;
        }
        return this.j.substring(this.j.indexOf(35) + 1);
    }

    public final s c(String str) {
        a aVar = new a();
        if (aVar.a(this, str) == a.EnumC1426a.a) {
            return aVar.b();
        }
        return null;
    }

    public final a i() {
        a aVar = new a();
        aVar.a = this.a;
        aVar.b = d();
        aVar.c = e();
        aVar.d = this.b;
        aVar.e = this.c != a(this.a) ? this.c : -1;
        aVar.f.clear();
        aVar.f.addAll(g());
        aVar.c(h());
        aVar.h = j();
        return aVar;
    }

    public static s d(String str) {
        a aVar = new a();
        if (aVar.a(null, str) == a.EnumC1426a.a) {
            return aVar.b();
        }
        return null;
    }

    public static s a(URL url) {
        return d(url.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.squareup.okhttp.s$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[a.EnumC1426a.a().length];

        static {
            try {
                a[a.EnumC1426a.a - 1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[a.EnumC1426a.e - 1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[a.EnumC1426a.c - 1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[a.EnumC1426a.b - 1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[a.EnumC1426a.d - 1] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof s) && ((s) obj).j.equals(this.j);
    }

    public final int hashCode() {
        return this.j.hashCode();
    }

    public final String toString() {
        return this.j;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class a {
        String a;
        String d;
        public List<String> g;
        String h;
        String b = "";
        String c = "";
        int e = -1;
        final List<String> f = new ArrayList();

        public a() {
            this.f.add("");
        }

        public final a a(String str) {
            if (str == null) {
                throw new IllegalArgumentException("scheme == null");
            }
            if (str.equalsIgnoreCase("http")) {
                this.a = "http";
            } else if (str.equalsIgnoreCase("https")) {
                this.a = "https";
            } else {
                throw new IllegalArgumentException("unexpected scheme: " + str);
            }
            return this;
        }

        public final a b(String str) {
            if (str == null) {
                throw new IllegalArgumentException("host == null");
            }
            String g = g(str, 0, str.length());
            if (g == null) {
                throw new IllegalArgumentException("unexpected host: " + str);
            }
            this.d = g;
            return this;
        }

        public final a a(int i) {
            if (i <= 0 || i > 65535) {
                throw new IllegalArgumentException("unexpected port: " + i);
            }
            this.e = i;
            return this;
        }

        final int a() {
            return this.e != -1 ? this.e : s.a(this.a);
        }

        public final a c(String str) {
            this.g = str != null ? s.b(s.a(str, " \"'<>#", true, true, true)) : null;
            return this;
        }

        public final s b() {
            if (this.a == null) {
                throw new IllegalStateException("scheme == null");
            }
            if (this.d == null) {
                throw new IllegalStateException("host == null");
            }
            return new s(this, null);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.a);
            sb.append("://");
            if (!this.b.isEmpty() || !this.c.isEmpty()) {
                sb.append(this.b);
                if (!this.c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.c);
                }
                sb.append('@');
            }
            if (this.d.indexOf(58) != -1) {
                sb.append('[');
                sb.append(this.d);
                sb.append(']');
            } else {
                sb.append(this.d);
            }
            int a = a();
            if (a != s.a(this.a)) {
                sb.append(':');
                sb.append(a);
            }
            s.a(sb, this.f);
            if (this.g != null) {
                sb.append('?');
                s.b(sb, this.g);
            }
            if (this.h != null) {
                sb.append('#');
                sb.append(this.h);
            }
            return sb.toString();
        }

        /* JADX WARN: $VALUES field not found */
        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* compiled from: ProGuard */
        /* renamed from: com.squareup.okhttp.s$a$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class EnumC1426a {
            public static final int a = 1;
            public static final int b = 2;
            public static final int c = 3;
            public static final int d = 4;
            public static final int e = 5;
            private static final /* synthetic */ int[] f = {a, b, c, d, e};

            public static int[] a() {
                return (int[]) f.clone();
            }
        }

        final int a(s sVar, String str) {
            int b;
            boolean z = false;
            int b2 = b(str, 0, str.length());
            int c = c(str, b2, str.length());
            if (d(str, b2, c) != -1) {
                if (str.regionMatches(true, b2, "https:", 0, 6)) {
                    this.a = "https";
                    b2 += 6;
                } else if (str.regionMatches(true, b2, "http:", 0, 5)) {
                    this.a = "http";
                    b2 += 5;
                } else {
                    return EnumC1426a.c;
                }
            } else if (sVar != null) {
                this.a = sVar.a;
            } else {
                return EnumC1426a.b;
            }
            int e = e(str, b2, c);
            if (e >= 2 || sVar == null || !sVar.a.equals(this.a)) {
                int i = b2 + e;
                boolean z2 = false;
                while (true) {
                    b = s.b(str, i, c, "@/\\?#");
                    char charAt = b != c ? str.charAt(b) : (char) 65535;
                    if (charAt != 65535 && charAt != '#' && charAt != '/' && charAt != '\\') {
                        switch (charAt) {
                            case '@':
                                if (!z) {
                                    int b3 = s.b(str, i, b, CommonConstant.Symbol.COLON);
                                    String a = s.a(str, i, b3, " \"':;<=>@[]^`{}|/\\?#", true, false, true);
                                    if (z2) {
                                        a = this.b + "%40" + a;
                                    }
                                    this.b = a;
                                    if (b3 != b) {
                                        this.c = s.a(str, b3 + 1, b, " \"':;<=>@[]^`{}|/\\?#", true, false, true);
                                        z = true;
                                    }
                                    z2 = true;
                                } else {
                                    this.c += "%40" + s.a(str, i, b, " \"':;<=>@[]^`{}|/\\?#", true, false, true);
                                }
                                i = b + 1;
                                break;
                        }
                    }
                }
                int f = f(str, i, b);
                int i2 = f + 1;
                if (i2 < b) {
                    this.d = g(str, i, f);
                    this.e = i(str, i2, b);
                    if (this.e == -1) {
                        return EnumC1426a.d;
                    }
                } else {
                    this.d = g(str, i, f);
                    this.e = s.a(this.a);
                }
                if (this.d == null) {
                    return EnumC1426a.e;
                }
            } else {
                this.b = sVar.d();
                this.c = sVar.e();
                this.d = sVar.b;
                this.e = sVar.c;
                this.f.clear();
                this.f.addAll(sVar.g());
                if (b2 == c || str.charAt(b2) == '#') {
                    c(sVar.h());
                }
                b = b2;
            }
            int b4 = s.b(str, b, c, "?#");
            a(str, b, b4);
            if (b4 < c && str.charAt(b4) == '?') {
                int b5 = s.b(str, b4, c, "#");
                this.g = s.b(s.a(str, b4 + 1, b5, " \"'<>#", true, true, true));
                b4 = b5;
            }
            if (b4 < c && str.charAt(b4) == '#') {
                this.h = s.a(str, 1 + b4, c, "", true, false, false);
            }
            return EnumC1426a.a;
        }

        private void a(String str, int i, int i2) {
            if (i == i2) {
                return;
            }
            char charAt = str.charAt(i);
            if (charAt == '/' || charAt == '\\') {
                this.f.clear();
                this.f.add("");
                i++;
            } else {
                this.f.set(this.f.size() - 1, "");
            }
            while (true) {
                int i3 = i;
                if (i3 >= i2) {
                    return;
                }
                i = s.b(str, i3, i2, "/\\");
                boolean z = i < i2;
                a(str, i3, i, z, true);
                if (z) {
                    i++;
                }
            }
        }

        public void a(String str, int i, int i2, boolean z, boolean z2) {
            String a = s.a(str, i, i2, " \"<>^`{}|/\\?#", z2, false, true);
            if (d(a)) {
                return;
            }
            if (e(a)) {
                c();
                return;
            }
            if (this.f.get(this.f.size() - 1).isEmpty()) {
                this.f.set(this.f.size() - 1, a);
            } else {
                this.f.add(a);
            }
            if (z) {
                this.f.add("");
            }
        }

        private static boolean d(String str) {
            return str.equals(CommonConstant.Symbol.DOT) || str.equalsIgnoreCase("%2e");
        }

        private static boolean e(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        private void c() {
            if (this.f.remove(this.f.size() - 1).isEmpty() && !this.f.isEmpty()) {
                this.f.set(this.f.size() - 1, "");
            } else {
                this.f.add("");
            }
        }

        private static int b(String str, int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                switch (str.charAt(i3)) {
                    case '\t':
                    case '\n':
                    case '\f':
                    case '\r':
                    case ' ':
                    default:
                        return i3;
                }
            }
            return i2;
        }

        private static int c(String str, int i, int i2) {
            for (int i3 = i2 - 1; i3 >= i; i3--) {
                switch (str.charAt(i3)) {
                    case '\t':
                    case '\n':
                    case '\f':
                    case '\r':
                    case ' ':
                    default:
                        return i3 + 1;
                }
            }
            return i;
        }

        private static int d(String str, int i, int i2) {
            if (i2 - i < 2) {
                return -1;
            }
            char charAt = str.charAt(i);
            if ((charAt < 'a' || charAt > 'z') && (charAt < 'A' || charAt > 'Z')) {
                return -1;
            }
            while (true) {
                i++;
                if (i >= i2) {
                    return -1;
                }
                char charAt2 = str.charAt(i);
                if (charAt2 < 'a' || charAt2 > 'z') {
                    if (charAt2 < 'A' || charAt2 > 'Z') {
                        if (charAt2 < '0' || charAt2 > '9') {
                            if (charAt2 != '+' && charAt2 != '-' && charAt2 != '.') {
                                if (charAt2 == ':') {
                                    return i;
                                }
                                return -1;
                            }
                        }
                    }
                }
            }
        }

        private static int e(String str, int i, int i2) {
            int i3 = 0;
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt != '\\' && charAt != '/') {
                    break;
                }
                i3++;
                i++;
            }
            return i3;
        }

        private static int f(String str, int i, int i2) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt == ':') {
                    return i;
                }
                if (charAt == '[') {
                    do {
                        i++;
                        if (i < i2) {
                        }
                    } while (str.charAt(i) != ']');
                }
                i++;
            }
            return i2;
        }

        private static String g(String str, int i, int i2) {
            String a = s.a(str, i, i2, false);
            if (a.startsWith("[") && a.endsWith(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT)) {
                InetAddress h = h(a, 1, a.length() - 1);
                if (h == null) {
                    return null;
                }
                byte[] address = h.getAddress();
                if (address.length == 16) {
                    return a(address);
                }
                throw new AssertionError();
            }
            return f(a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:51:0x0095, code lost:
            r6 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x00d1, code lost:
            return null;
         */
        /* JADX WARN: Removed duplicated region for block: B:60:0x00a4  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.net.InetAddress h(java.lang.String r16, int r17, int r18) {
            /*
                Method dump skipped, instructions count: 242
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.s.a.h(java.lang.String, int, int):java.net.InetAddress");
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0038, code lost:
            return null;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String f(java.lang.String r6) {
            /*
                r0 = 0
                java.lang.String r6 = java.net.IDN.toASCII(r6)     // Catch: java.lang.IllegalArgumentException -> L3a
                java.util.Locale r1 = java.util.Locale.US     // Catch: java.lang.IllegalArgumentException -> L3a
                java.lang.String r6 = r6.toLowerCase(r1)     // Catch: java.lang.IllegalArgumentException -> L3a
                boolean r1 = r6.isEmpty()     // Catch: java.lang.IllegalArgumentException -> L3a
                if (r1 == 0) goto L12
                return r0
            L12:
                r1 = 0
                r2 = 0
            L14:
                int r3 = r6.length()     // Catch: java.lang.IllegalArgumentException -> L3a
                r4 = 1
                if (r2 >= r3) goto L35
                char r3 = r6.charAt(r2)     // Catch: java.lang.IllegalArgumentException -> L3a
                r5 = 31
                if (r3 <= r5) goto L36
                r5 = 127(0x7f, float:1.78E-43)
                if (r3 < r5) goto L28
                goto L36
            L28:
                java.lang.String r5 = " #%/:?@[\\]"
                int r3 = r5.indexOf(r3)     // Catch: java.lang.IllegalArgumentException -> L3a
                r5 = -1
                if (r3 == r5) goto L32
                goto L36
            L32:
                int r2 = r2 + 1
                goto L14
            L35:
                r4 = 0
            L36:
                if (r4 == 0) goto L39
                return r0
            L39:
                return r6
            L3a:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.s.a.f(java.lang.String):java.lang.String");
        }

        private static String a(byte[] bArr) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = -1;
            while (i2 < bArr.length) {
                int i5 = i2;
                while (i5 < 16 && bArr[i5] == 0 && bArr[i5 + 1] == 0) {
                    i5 += 2;
                }
                int i6 = i5 - i2;
                if (i6 > i3) {
                    i4 = i2;
                    i3 = i6;
                }
                i2 = i5 + 2;
            }
            okio.c cVar = new okio.c();
            while (i < bArr.length) {
                if (i == i4) {
                    cVar.h(58);
                    i += i3;
                    if (i == 16) {
                        cVar.h(58);
                    }
                } else {
                    if (i > 0) {
                        cVar.h(58);
                    }
                    cVar.m(((bArr[i] & 255) << 8) | (bArr[i + 1] & 255));
                    i += 2;
                }
            }
            return cVar.p();
        }

        private static int i(String str, int i, int i2) {
            try {
                int parseInt = Integer.parseInt(s.a(str, i, i2, "", false, false, true));
                if (parseInt <= 0 || parseInt > 65535) {
                    return -1;
                }
                return parseInt;
            } catch (NumberFormatException unused) {
                return -1;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(String str, int i, int i2, String str2) {
        while (i < i2) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                return i;
            }
            i++;
        }
        return i2;
    }

    private static String a(String str, boolean z) {
        return a(str, 0, str.length(), z);
    }

    private static List<String> a(List<String> list, boolean z) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            arrayList.add(next != null ? a(next, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    static String a(String str, int i, int i2, boolean z) {
        for (int i3 = i; i3 < i2; i3++) {
            char charAt = str.charAt(i3);
            if (charAt == '%' || (charAt == '+' && z)) {
                okio.c cVar = new okio.c();
                cVar.a(str, i, i3);
                a(cVar, str, i3, i2, z);
                return cVar.p();
            }
        }
        return str.substring(i, i2);
    }

    private static void a(okio.c cVar, String str, int i, int i2, boolean z) {
        int i3;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt == 37 && (i3 = i + 2) < i2) {
                int a2 = a(str.charAt(i + 1));
                int a3 = a(str.charAt(i3));
                if (a2 != -1 && a3 != -1) {
                    cVar.h((a2 << 4) + a3);
                    i = i3;
                }
                cVar.a(codePointAt);
            } else {
                if (codePointAt == 43 && z) {
                    cVar.h(32);
                }
                cVar.a(codePointAt);
            }
            i += Character.charCount(codePointAt);
        }
    }

    static String a(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3) {
        int i3 = i;
        while (i3 < i2) {
            int codePointAt = str.codePointAt(i3);
            if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || !z3) && str2.indexOf(codePointAt) == -1 && ((codePointAt != 37 || z) && (codePointAt != 43 || !z2)))) {
                i3 += Character.charCount(codePointAt);
            } else {
                okio.c cVar = new okio.c();
                cVar.a(str, i, i3);
                a(cVar, str, i3, i2, str2, z, z2, z3);
                return cVar.p();
            }
        }
        return str.substring(i, i2);
    }

    public static void a(okio.c cVar, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3) {
        okio.c cVar2 = null;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (!z || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                if (codePointAt == 43 && z2) {
                    cVar.b(z ? "+" : "%2B");
                } else if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z3) || str2.indexOf(codePointAt) != -1 || (codePointAt == 37 && !z))) {
                    if (cVar2 == null) {
                        cVar2 = new okio.c();
                    }
                    cVar2.a(codePointAt);
                    while (!cVar2.d()) {
                        int g = cVar2.g() & 255;
                        cVar.h(37);
                        cVar.h((int) f[(g >> 4) & 15]);
                        cVar.h((int) f[g & 15]);
                    }
                } else {
                    cVar.a(codePointAt);
                }
            }
            i += Character.charCount(codePointAt);
        }
    }

    public static String a(String str, String str2, boolean z, boolean z2, boolean z3) {
        return a(str, 0, str.length(), str2, z, z2, z3);
    }
}
