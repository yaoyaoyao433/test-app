package com.meizu.cloud.pushsdk.c.c;

import com.meituan.robust.common.CommonConstant;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes3.dex */
public final class f {
    private static final char[] i = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final List<String> f;
    public final String g;
    public final String h;
    private final List<String> j;

    /* renamed from: com.meizu.cloud.pushsdk.c.c.f$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[a.EnumC0526a.a().length];

        static {
            try {
                a[a.EnumC0526a.a - 1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[a.EnumC0526a.e - 1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[a.EnumC0526a.c - 1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[a.EnumC0526a.b - 1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[a.EnumC0526a.d - 1] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private f(a aVar) {
        this.a = aVar.a;
        this.b = a(aVar.b, false);
        this.c = a(aVar.c, false);
        this.d = aVar.d;
        this.e = aVar.a();
        this.j = a(aVar.f, false);
        this.f = aVar.g != null ? a(aVar.g, true) : null;
        this.g = aVar.h != null ? a(aVar.h, false) : null;
        this.h = aVar.toString();
    }

    /* synthetic */ f(a aVar, AnonymousClass1 anonymousClass1) {
        this(aVar);
    }

    public static int a(String str) {
        if ("http".equals(str)) {
            return 80;
        }
        return "https".equals(str) ? 443 : -1;
    }

    public static String a(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return b(str, 0, str.length(), str2, z, false, true, true);
    }

    private static String a(String str, boolean z) {
        return b(str, 0, str.length(), z);
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

    private static void a(com.meizu.cloud.pushsdk.c.g.b bVar, String str, int i2, int i3, boolean z) {
        int i4;
        while (i2 < i3) {
            int codePointAt = str.codePointAt(i2);
            if (codePointAt != 37 || (i4 = i2 + 2) >= i3) {
                if (codePointAt == 43 && z) {
                    bVar.b(32);
                }
                bVar.a(codePointAt);
            } else {
                int b = b(str.charAt(i2 + 1));
                int b2 = b(str.charAt(i4));
                if (b != -1 && b2 != -1) {
                    bVar.b((b << 4) + b2);
                    i2 = i4;
                }
                bVar.a(codePointAt);
            }
            i2 += Character.charCount(codePointAt);
        }
    }

    static void a(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append('/');
            sb.append(list.get(i2));
        }
    }

    private static boolean a(int i2, int i3, String str, int i4, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        if (i2 < 32 || i2 == 127) {
            return true;
        }
        if ((i2 < 128 || !z4) && str2.indexOf(i2) == -1) {
            boolean z5 = !z || (z2 && !a(str, i3, i4));
            if (i2 == 37 && z5) {
                return true;
            }
            return i2 == 43 && z3;
        }
        return true;
    }

    private static boolean a(String str, int i2, int i3) {
        int i4 = i2 + 2;
        return i4 < i3 && str.charAt(i2) == '%' && b(str.charAt(i2 + 1)) != -1 && b(str.charAt(i4)) != -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(char c) {
        if (c < '0' || c > '9') {
            char c2 = 'a';
            if (c < 'a' || c > 'f') {
                c2 = 'A';
                if (c < 'A' || c > 'F') {
                    return -1;
                }
            }
            return (c - c2) + 10;
        }
        return c - '0';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(String str, int i2, int i3, boolean z) {
        for (int i4 = i2; i4 < i3; i4++) {
            char charAt = str.charAt(i4);
            boolean z2 = false;
            boolean z3 = charAt == '%';
            if (charAt == '+' && z) {
                z2 = true;
            }
            if (z3 || z2) {
                com.meizu.cloud.pushsdk.c.g.b bVar = new com.meizu.cloud.pushsdk.c.g.b();
                bVar.a(str, i2, i4);
                a(bVar, str, i4, i3, z);
                return bVar.e();
            }
        }
        return str.substring(i2, i3);
    }

    public static List<String> b(String str) {
        String str2;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 <= str.length()) {
            int indexOf = str.indexOf(38, i2);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i2);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i2, indexOf));
                str2 = null;
            } else {
                arrayList.add(str.substring(i2, indexOf2));
                str2 = str.substring(indexOf2 + 1, indexOf);
            }
            arrayList.add(str2);
            i2 = indexOf + 1;
        }
        return arrayList;
    }

    static void b(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2 += 2) {
            String str = list.get(i2);
            String str2 = list.get(i2 + 1);
            if (i2 > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    public final List<String> a() {
        int indexOf = this.h.indexOf(47, this.a.length() + 3);
        String str = this.h;
        int a2 = m.a(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < a2) {
            int i2 = indexOf + 1;
            int a3 = m.a(this.h, i2, a2, '/');
            arrayList.add(this.h.substring(i2, a3));
            indexOf = a3;
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof f) && ((f) obj).h.equals(this.h);
    }

    public final int hashCode() {
        return this.h.hashCode();
    }

    public final String toString() {
        return this.h;
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public String a;
        public String d;
        public List<String> g;
        public String h;
        public String b = "";
        public String c = "";
        public int e = -1;
        public final List<String> f = new ArrayList();

        /* JADX WARN: $VALUES field not found */
        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* renamed from: com.meizu.cloud.pushsdk.c.c.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        static final class EnumC0526a {
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

        public a() {
            this.f.add("");
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
            com.meizu.cloud.pushsdk.c.g.b bVar = new com.meizu.cloud.pushsdk.c.g.b();
            while (i < bArr.length) {
                if (i == i4) {
                    bVar.b(58);
                    i += i3;
                    if (i == 16) {
                        bVar.b(58);
                    }
                } else {
                    if (i > 0) {
                        bVar.b(58);
                    }
                    bVar.b(((bArr[i] & 255) << 8) | (bArr[i + 1] & 255));
                    i += 2;
                }
            }
            return bVar.e();
        }

        static int b(String str, int i, int i2) {
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

        static String c(String str, int i, int i2) {
            String b = f.b(str, i, i2, false);
            if (b.contains(CommonConstant.Symbol.COLON)) {
                InetAddress e = (b.startsWith("[") && b.endsWith(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT)) ? e(b, 1, b.length() - 1) : e(b, 0, b.length());
                if (e == null) {
                    return null;
                }
                byte[] address = e.getAddress();
                if (address.length == 16) {
                    return a(address);
                }
                throw new AssertionError();
            }
            return m.a(b);
        }

        static int d(String str, int i, int i2) {
            int parseInt;
            try {
                parseInt = Integer.parseInt(f.b(str, i, i2, "", false, false, false, true));
            } catch (NumberFormatException unused) {
            }
            if (parseInt <= 0 || parseInt > 65535) {
                return -1;
            }
            return parseInt;
        }

        final int a() {
            return this.e != -1 ? this.e : f.a(this.a);
        }

        public final f b() {
            if (this.a != null) {
                if (this.d != null) {
                    return new f(this, null);
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
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
            if (a != f.a(this.a)) {
                sb.append(':');
                sb.append(a);
            }
            f.a(sb, this.f);
            if (this.g != null) {
                sb.append('?');
                f.b(sb, this.g);
            }
            if (this.h != null) {
                sb.append('#');
                sb.append(this.h);
            }
            return sb.toString();
        }

        void a(String str, int i, int i2) {
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
                i = m.a(str, i3, i2, "/\\");
                boolean z = false;
                boolean z2 = i < i2;
                String b = f.b(str, i3, i, " \"<>^`{}|/\\?#", true, false, false, true);
                if (!(CommonConstant.Symbol.DOT.equals(b) || "%2e".equalsIgnoreCase(b))) {
                    if (!(("..".equals(b) || "%2e.".equalsIgnoreCase(b) || ".%2e".equalsIgnoreCase(b) || "%2e%2e".equalsIgnoreCase(b)) ? true : true)) {
                        if (this.f.get(this.f.size() - 1).isEmpty()) {
                            this.f.set(this.f.size() - 1, b);
                        } else {
                            this.f.add(b);
                        }
                        if (z2) {
                            this.f.add("");
                        }
                    } else if (!this.f.remove(this.f.size() - 1).isEmpty() || this.f.isEmpty()) {
                        this.f.add("");
                    } else {
                        this.f.set(this.f.size() - 1, "");
                    }
                }
                if (z2) {
                    i++;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:63:0x00cf, code lost:
            return null;
         */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00a2  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.net.InetAddress e(java.lang.String r17, int r18, int r19) {
            /*
                Method dump skipped, instructions count: 241
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meizu.cloud.pushsdk.c.c.f.a.e(java.lang.String, int, int):java.net.InetAddress");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0065, code lost:
        if (r3 == ':') goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.meizu.cloud.pushsdk.c.c.f c(java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meizu.cloud.pushsdk.c.c.f.c(java.lang.String):com.meizu.cloud.pushsdk.c.c.f");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(String str, int i2, int i3, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        int i4 = i2;
        while (i4 < i3) {
            int codePointAt = str.codePointAt(i4);
            if (a(codePointAt, i4, str, i3, str2, z, z2, z3, z4)) {
                com.meizu.cloud.pushsdk.c.g.b bVar = new com.meizu.cloud.pushsdk.c.g.b();
                bVar.a(str, i2, i4);
                com.meizu.cloud.pushsdk.c.g.b bVar2 = null;
                while (i4 < i3) {
                    int codePointAt2 = str.codePointAt(i4);
                    if (codePointAt2 == 43 && z3) {
                        bVar.b(z ? "+" : "%2B");
                    } else if (a(codePointAt2, i4, str, i3, str2, z, z2, z3, z4)) {
                        if (bVar2 == null) {
                            bVar2 = new com.meizu.cloud.pushsdk.c.g.b();
                        }
                        bVar2.a(codePointAt2);
                        while (true) {
                            if (!(bVar2.b == 0)) {
                                int d = bVar2.d() & 255;
                                bVar.b(37);
                                bVar.b((int) i[(d >> 4) & 15]);
                                bVar.b((int) i[d & 15]);
                            }
                        }
                    } else {
                        bVar.a(codePointAt2);
                    }
                    i4 += Character.charCount(codePointAt2);
                }
                return bVar.e();
            }
            i4 += Character.charCount(codePointAt);
        }
        return str.substring(i2, i3);
    }
}
