package com.squareup.okhttp;

import com.meituan.robust.common.CommonConstant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class r {
    public final String[] a;

    private r(a aVar) {
        this.a = (String[]) aVar.a.toArray(new String[aVar.a.size()]);
    }

    private r(String[] strArr) {
        this.a = strArr;
    }

    public final String a(String str) {
        return a(this.a, str);
    }

    public final Date b(String str) {
        String a2 = a(str);
        if (a2 != null) {
            return com.squareup.okhttp.internal.http.g.a(a2);
        }
        return null;
    }

    public final int a() {
        return this.a.length / 2;
    }

    public final String a(int i) {
        int i2 = i * 2;
        if (i2 < 0 || i2 >= this.a.length) {
            return null;
        }
        return this.a[i2];
    }

    public final String b(int i) {
        int i2 = (i * 2) + 1;
        if (i2 < 0 || i2 >= this.a.length) {
            return null;
        }
        return this.a[i2];
    }

    public final Set<String> b() {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        int length = this.a.length / 2;
        for (int i = 0; i < length; i++) {
            treeSet.add(a(i));
        }
        return Collections.unmodifiableSet(treeSet);
    }

    public final a c() {
        a aVar = new a();
        Collections.addAll(aVar.a, this.a);
        return aVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int length = this.a.length / 2;
        for (int i = 0; i < length; i++) {
            sb.append(a(i));
            sb.append(": ");
            sb.append(b(i));
            sb.append("\n");
        }
        return sb.toString();
    }

    public final Map<String, List<String>> d() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = this.a.length / 2;
        for (int i = 0; i < length; i++) {
            String a2 = a(i);
            List list = (List) linkedHashMap.get(a2);
            if (list == null) {
                list = new ArrayList(2);
                linkedHashMap.put(a2, list);
            }
            list.add(b(i));
        }
        return linkedHashMap;
    }

    private static String a(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    public static r a(String... strArr) {
        String[] strArr2 = (String[]) strArr.clone();
        for (int i = 0; i < strArr2.length; i++) {
            if (strArr2[i] == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr2[i] = strArr2[i].trim();
        }
        for (int i2 = 0; i2 < strArr2.length; i2 += 2) {
            String str = strArr2[i2];
            String str2 = strArr2[i2 + 1];
            if (str.length() == 0 || str.indexOf(0) != -1 || str2.indexOf(0) != -1) {
                throw new IllegalArgumentException("Unexpected header: " + str + ": " + str2);
            }
        }
        return new r(strArr2);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class a {
        final List<String> a = new ArrayList(20);

        /* JADX INFO: Access modifiers changed from: package-private */
        public final a a(String str) {
            int indexOf = str.indexOf(CommonConstant.Symbol.COLON, 1);
            if (indexOf != -1) {
                return c(str.substring(0, indexOf), str.substring(indexOf + 1));
            }
            if (str.startsWith(CommonConstant.Symbol.COLON)) {
                return c("", str.substring(1));
            }
            return c("", str);
        }

        public final a a(String str, String str2) {
            d(str, str2);
            return c(str, str2);
        }

        private a c(String str, String str2) {
            this.a.add(str);
            this.a.add(str2.trim());
            return this;
        }

        public final a b(String str) {
            int i = 0;
            while (i < this.a.size()) {
                if (str.equalsIgnoreCase(this.a.get(i))) {
                    this.a.remove(i);
                    this.a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        public final a b(String str, String str2) {
            d(str, str2);
            b(str);
            c(str, str2);
            return this;
        }

        private static void d(String str, String str2) {
            if (str == null) {
                throw new IllegalArgumentException("name == null");
            }
            if (str.isEmpty()) {
                throw new IllegalArgumentException("name is empty");
            }
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt <= 31 || charAt >= 127) {
                    throw new IllegalArgumentException(String.format("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str));
                }
            }
            if (str2 == null) {
                throw new IllegalArgumentException("value == null");
            }
            int length2 = str2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                char charAt2 = str2.charAt(i2);
                if (charAt2 <= 31 || charAt2 >= 127) {
                    throw new IllegalArgumentException(String.format("Unexpected char %#04x at %d in header value: %s", Integer.valueOf(charAt2), Integer.valueOf(i2), str2));
                }
            }
        }

        public final r a() {
            return new r(this);
        }
    }

    public final List<String> c(String str) {
        int length = this.a.length / 2;
        ArrayList arrayList = null;
        for (int i = 0; i < length; i++) {
            if (str.equalsIgnoreCase(a(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(b(i));
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.emptyList();
    }
}
