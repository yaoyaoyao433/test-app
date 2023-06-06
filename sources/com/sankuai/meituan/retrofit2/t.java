package com.sankuai.meituan.retrofit2;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class t {
    public static ChangeQuickRedirect a;
    private static final char[] c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    final List<String> b;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final int h;
    private final List<String> i;
    private final String j;
    private final String k;

    public static int a(char c2) {
        Object[] objArr = {Character.valueOf(c2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "df26805c432aa75db206fac26d239e95", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "df26805c432aa75db206fac26d239e95")).intValue();
        }
        if (c2 < '0' || c2 > '9') {
            if (c2 < 'a' || c2 > 'f') {
                if (c2 < 'A' || c2 > 'F') {
                    return -1;
                }
                return (c2 - 'A') + 10;
            }
            return (c2 - 'a') + 10;
        }
        return c2 - '0';
    }

    public /* synthetic */ t(a aVar, AnonymousClass1 anonymousClass1) {
        this(aVar);
    }

    private t(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "074be37e11e1bca61f99c69e24128c22", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "074be37e11e1bca61f99c69e24128c22");
            return;
        }
        this.d = aVar.b;
        this.e = a(aVar.c, false);
        this.f = a(aVar.d, false);
        this.g = aVar.e;
        this.h = aVar.a();
        this.b = a(aVar.g, false);
        this.i = aVar.h != null ? a(aVar.h, true) : null;
        this.j = aVar.i != null ? a(aVar.i, false) : null;
        this.k = aVar.toString();
    }

    public final URI a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a092c2c3ada459d259b53229beb87c79", 6917529027641081856L)) {
            return (URI) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a092c2c3ada459d259b53229beb87c79");
        }
        a m = m();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, m, changeQuickRedirect2, false, "adc73063da6c0c6eecedd6f611f8f25c", 6917529027641081856L)) {
            m = (a) PatchProxy.accessDispatch(objArr2, m, changeQuickRedirect2, false, "adc73063da6c0c6eecedd6f611f8f25c");
        } else {
            int size = m.g.size();
            for (int i = 0; i < size; i++) {
                m.g.set(i, a(m.g.get(i), "[]", true, true, false, true));
            }
            if (m.h != null) {
                int size2 = m.h.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str = m.h.get(i2);
                    if (str != null) {
                        m.h.set(i2, a(str, "\\^`{|}", true, true, true, true));
                    }
                }
            }
            if (m.i != null) {
                m.i = a(m.i, " \"#<>\\^`{|}", true, true, false, false);
            }
        }
        String aVar = m.toString();
        try {
            return new URI(aVar);
        } catch (URISyntaxException e) {
            try {
                return URI.create(aVar.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final String b() {
        return this.d;
    }

    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fb51bed44073ab8188150ed26db0883", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fb51bed44073ab8188150ed26db0883")).booleanValue() : this.d.equals("https");
    }

    public final String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef5347f282316a6764f6ed66e7e71022", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef5347f282316a6764f6ed66e7e71022");
        }
        if (this.e.isEmpty()) {
            return "";
        }
        int length = this.d.length() + 3;
        String str = this.k;
        return this.k.substring(length, g.a(str, length, str.length(), ":@"));
    }

    public final String e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84a3964c76b2d585f21c0a1623ba2af5", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84a3964c76b2d585f21c0a1623ba2af5");
        }
        if (this.f.isEmpty()) {
            return "";
        }
        int indexOf = this.k.indexOf(64);
        return this.k.substring(this.k.indexOf(58, this.d.length() + 3) + 1, indexOf);
    }

    public final String f() {
        return this.g;
    }

    public final int g() {
        return this.h;
    }

    public static int a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "09d72cbcf99ebee6f3ba89f09f662611", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "09d72cbcf99ebee6f3ba89f09f662611")).intValue();
        }
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public final String h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80588d53888b54f99a033e358ff6d13a", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80588d53888b54f99a033e358ff6d13a");
        }
        int indexOf = this.k.indexOf(47, this.d.length() + 3);
        String str = this.k;
        return this.k.substring(indexOf, g.a(str, indexOf, str.length(), "?#"));
    }

    public static void a(StringBuilder sb, List<String> list) {
        Object[] objArr = {sb, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c24ada7e283fc04629b7e7c2ba40ff44", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c24ada7e283fc04629b7e7c2ba40ff44");
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append('/');
            sb.append(list.get(i));
        }
    }

    public final List<String> i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2609703507115cc75b3b83848a7ffd42", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2609703507115cc75b3b83848a7ffd42");
        }
        int indexOf = this.k.indexOf(47, this.d.length() + 3);
        String str = this.k;
        int a2 = g.a(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < a2) {
            int i = indexOf + 1;
            int a3 = g.a(this.k, i, a2, '/');
            arrayList.add(this.k.substring(i, a3));
            indexOf = a3;
        }
        return arrayList;
    }

    public final List<String> j() {
        return this.b;
    }

    public final String k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a690a5fd23dd8bf43c0ec71a72b609e", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a690a5fd23dd8bf43c0ec71a72b609e");
        }
        if (this.i == null) {
            return null;
        }
        int indexOf = this.k.indexOf(63) + 1;
        return this.k.substring(indexOf, g.a(this.k, indexOf + 1, this.k.length(), '#'));
    }

    public static void b(StringBuilder sb, List<String> list) {
        Object[] objArr = {sb, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "467bb2a67e19d722a4701b5aae2449fa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "467bb2a67e19d722a4701b5aae2449fa");
            return;
        }
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
        int i = 0;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "66a735ba9cff358d2474efd3363a9e09", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "66a735ba9cff358d2474efd3363a9e09");
        }
        ArrayList arrayList = new ArrayList();
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

    public final String c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc770b9566a842002dc1480c0a810a4a", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc770b9566a842002dc1480c0a810a4a");
        }
        if (this.i == null) {
            return null;
        }
        int size = this.i.size();
        for (int i = 0; i < size; i += 2) {
            if (str.equals(this.i.get(i))) {
                return this.i.get(i + 1);
            }
        }
        return null;
    }

    public final Set<String> l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "971e5fac5930f12b65b78f1346556cd5", 6917529027641081856L)) {
            return (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "971e5fac5930f12b65b78f1346556cd5");
        }
        if (this.i == null) {
            return Collections.emptySet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = this.i.size();
        for (int i = 0; i < size; i += 2) {
            linkedHashSet.add(this.i.get(i));
        }
        return Collections.unmodifiableSet(linkedHashSet);
    }

    private String n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5c9b20e32154a7c873d32683e6dad7e", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5c9b20e32154a7c873d32683e6dad7e");
        }
        if (this.j == null) {
            return null;
        }
        return this.k.substring(this.k.indexOf(35) + 1);
    }

    public final a m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa5a19bd3aa72668b245e0eac505e255", 6917529027641081856L)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa5a19bd3aa72668b245e0eac505e255");
        }
        a aVar = new a();
        aVar.b = this.d;
        aVar.c = d();
        aVar.d = e();
        aVar.e = this.g;
        aVar.f = this.h != a(this.d) ? this.h : -1;
        aVar.g.clear();
        aVar.g.addAll(i());
        aVar.e(k());
        aVar.i = n();
        return aVar;
    }

    public final a d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7001a5fd691ae30eb2fe5007ecf2cb7", 6917529027641081856L)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7001a5fd691ae30eb2fe5007ecf2cb7");
        }
        a aVar = new a();
        if (aVar.a(this, str) == a.EnumC0638a.SUCCESS) {
            return aVar;
        }
        return null;
    }

    public static t e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cac32c5f03bbc846d075792716f79f4c", 6917529027641081856L)) {
            return (t) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cac32c5f03bbc846d075792716f79f4c");
        }
        a aVar = new a();
        if (aVar.a((t) null, str) == a.EnumC0638a.SUCCESS) {
            return aVar.b();
        }
        return null;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.meituan.retrofit2.t$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] a = new int[a.EnumC0638a.valuesCustom().length];

        static {
            try {
                a[a.EnumC0638a.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[a.EnumC0638a.INVALID_HOST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[a.EnumC0638a.UNSUPPORTED_SCHEME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[a.EnumC0638a.MISSING_SCHEME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[a.EnumC0638a.INVALID_PORT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public final boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce37ec853c0ed4650e05f443f1d23b52", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce37ec853c0ed4650e05f443f1d23b52")).booleanValue() : (obj instanceof t) && ((t) obj).k.equals(this.k);
    }

    public final int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fa1cb4967306f0903525c3feea07ab7", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fa1cb4967306f0903525c3feea07ab7")).intValue() : this.k.hashCode();
    }

    public final String toString() {
        return this.k;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class a {
        public static ChangeQuickRedirect a;
        public String b;
        public String c;
        public String d;
        public String e;
        public int f;
        public final List<String> g;
        public List<String> h;
        public String i;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6328c58afbc5afd4872809c405338ca4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6328c58afbc5afd4872809c405338ca4");
                return;
            }
            this.c = "";
            this.d = "";
            this.f = -1;
            this.g = new ArrayList();
            this.g.add("");
        }

        public final a a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22027535d9295060938b00ae48aad2e7", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22027535d9295060938b00ae48aad2e7");
            }
            if (str == null) {
                throw new NullPointerException("scheme == null");
            }
            if (str.equalsIgnoreCase("http")) {
                this.b = "http";
            } else if (str.equalsIgnoreCase("https")) {
                this.b = "https";
            } else {
                throw new IllegalArgumentException("unexpected scheme: " + str);
            }
            return this;
        }

        public final a b(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc74c91eef0815444dae7b27ed42714f", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc74c91eef0815444dae7b27ed42714f");
            }
            if (str == null) {
                throw new NullPointerException("host == null");
            }
            String e = e(str, 0, str.length());
            if (e == null) {
                throw new IllegalArgumentException("unexpected host: " + str);
            }
            this.e = e;
            return this;
        }

        public final a a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3fca5cad0ecd9d00482369daa983f783", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3fca5cad0ecd9d00482369daa983f783");
            }
            if (i <= 0 || i > 65535) {
                throw new IllegalArgumentException("unexpected port: " + i);
            }
            this.f = i;
            return this;
        }

        public final int a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ae9d041b4a0df9b54d5b2d0ac25c8c3", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ae9d041b4a0df9b54d5b2d0ac25c8c3")).intValue() : this.f != -1 ? this.f : t.a(this.b);
        }

        public final a a(int i, String str) {
            Object[] objArr = {0, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aff417329ae01023042552e13c258d6e", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aff417329ae01023042552e13c258d6e");
            }
            if (str == null) {
                throw new NullPointerException("pathSegment == null");
            }
            String a2 = t.a(str, 0, str.length(), " \"<>^`{}|/\\?#", false, false, false, true);
            if (f(a2) || g(a2)) {
                throw new IllegalArgumentException("unexpected path segment: " + str);
            }
            this.g.set(0, a2);
            return this;
        }

        public final a c(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c804e13711a614338241ca02db658a86", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c804e13711a614338241ca02db658a86");
            }
            if (str == null) {
                throw new NullPointerException("encodedPath == null");
            }
            if (!str.startsWith("/")) {
                throw new IllegalArgumentException("unexpected encodedPath: " + str);
            }
            a(str, 0, str.length());
            return this;
        }

        public final a d(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "748f885062fb3e933825713a5dabdee5", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "748f885062fb3e933825713a5dabdee5");
            }
            this.h = str != null ? t.b(t.a(str, " \"'<>#", false, false, true, true)) : null;
            return this;
        }

        public final a e(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf04dfe05bfcc53026a38911d282c608", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf04dfe05bfcc53026a38911d282c608");
            }
            this.h = str != null ? t.b(t.a(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        public final a a(String str, String str2) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "762e65332c46e5c0640d1091a8899290", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "762e65332c46e5c0640d1091a8899290");
            }
            if (str == null) {
                throw new NullPointerException("name == null");
            }
            if (this.h == null) {
                this.h = new ArrayList();
            }
            this.h.add(t.a(str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true));
            this.h.add(str2 != null ? t.a(str2, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true) : null);
            return this;
        }

        public final a b(String str, String str2) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc921e60599ce2e7c09f1b5014a7fc3a", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc921e60599ce2e7c09f1b5014a7fc3a");
            }
            if (str == null) {
                throw new NullPointerException("encodedName == null");
            }
            if (this.h == null) {
                this.h = new ArrayList();
            }
            this.h.add(t.a(str, " \"'<>#&=", true, false, true, true));
            this.h.add(str2 != null ? t.a(str2, " \"'<>#&=", true, false, true, true) : null);
            return this;
        }

        public final t b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad091e68099377b38e5681750d467afa", 6917529027641081856L)) {
                return (t) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad091e68099377b38e5681750d467afa");
            }
            if (this.b == null) {
                throw new IllegalStateException("scheme == null");
            }
            if (this.e == null) {
                throw new IllegalStateException("host == null");
            }
            return new t(this, null);
        }

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3def4d87158588f30188c0f511ef836", 6917529027641081856L)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3def4d87158588f30188c0f511ef836");
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.b);
            sb.append("://");
            if (!this.c.isEmpty() || !this.d.isEmpty()) {
                sb.append(this.c);
                if (!this.d.isEmpty()) {
                    sb.append(':');
                    sb.append(this.d);
                }
                sb.append('@');
            }
            if (this.e.indexOf(58) != -1) {
                sb.append('[');
                sb.append(this.e);
                sb.append(']');
            } else {
                sb.append(this.e);
            }
            int a2 = a();
            if (a2 != t.a(this.b)) {
                sb.append(':');
                sb.append(a2);
            }
            t.a(sb, this.g);
            if (this.h != null) {
                sb.append('?');
                t.b(sb, this.h);
            }
            if (this.i != null) {
                sb.append('#');
                sb.append(this.i);
            }
            return sb.toString();
        }

        /* compiled from: ProGuard */
        /* renamed from: com.sankuai.meituan.retrofit2.t$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public enum EnumC0638a {
            SUCCESS,
            MISSING_SCHEME,
            UNSUPPORTED_SCHEME,
            INVALID_PORT,
            INVALID_HOST;
            
            public static ChangeQuickRedirect a;

            EnumC0638a() {
                Object[] objArr = {r10, Integer.valueOf(r11)};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b809e8fb87863f5a66f710d0e02e610c", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b809e8fb87863f5a66f710d0e02e610c");
                }
            }

            public static EnumC0638a valueOf(String str) {
                Object[] objArr = {str};
                ChangeQuickRedirect changeQuickRedirect = a;
                return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b19a259974ce7f27869be5f7e09bd398", 6917529027641081856L) ? (EnumC0638a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b19a259974ce7f27869be5f7e09bd398") : (EnumC0638a) Enum.valueOf(EnumC0638a.class, str);
            }

            /* renamed from: values  reason: to resolve conflict with enum method */
            public static EnumC0638a[] valuesCustom() {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect = a;
                return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "af5b8344c1e486e24fc126f8f8191938", 6917529027641081856L) ? (EnumC0638a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "af5b8344c1e486e24fc126f8f8191938") : (EnumC0638a[]) values().clone();
            }
        }

        public final EnumC0638a a(t tVar, String str) {
            int a2;
            int i;
            String str2;
            int i2;
            String str3;
            String str4 = str;
            Object[] objArr = {tVar, str4};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "023830bcdc7d59d6ee9ef201da42af06", 6917529027641081856L)) {
                return (EnumC0638a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "023830bcdc7d59d6ee9ef201da42af06");
            }
            int a3 = g.a(str4, 0, str.length());
            int b = g.b(str4, a3, str.length());
            char c = 65535;
            if (b(str4, a3, b) != -1) {
                if (str.regionMatches(true, a3, "https:", 0, 6)) {
                    this.b = "https";
                    a3 += 6;
                } else if (str.regionMatches(true, a3, "http:", 0, 5)) {
                    this.b = "http";
                    a3 += 5;
                } else {
                    return EnumC0638a.UNSUPPORTED_SCHEME;
                }
            } else if (tVar != null) {
                this.b = tVar.d;
            } else {
                return EnumC0638a.MISSING_SCHEME;
            }
            int c2 = c(str4, a3, b);
            char c3 = '#';
            if (c2 >= 2 || tVar == null || !tVar.d.equals(this.b)) {
                int i3 = a3 + c2;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    a2 = g.a(str4, i3, b, "@/\\?#");
                    char charAt = a2 != b ? str4.charAt(a2) : (char) 65535;
                    if (charAt != c && charAt != c3 && charAt != '/' && charAt != '\\') {
                        switch (charAt) {
                            case '@':
                                if (!z) {
                                    int a4 = g.a(str4, i3, a2, ':');
                                    i2 = b;
                                    str3 = str4;
                                    String a5 = t.a(str, i3, a4, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                                    if (z2) {
                                        a5 = this.c + "%40" + a5;
                                    }
                                    this.c = a5;
                                    if (a4 != a2) {
                                        this.d = t.a(str, a4 + 1, a2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                                        z = true;
                                    }
                                    z2 = true;
                                } else {
                                    i2 = b;
                                    str3 = str4;
                                    this.d += "%40" + t.a(str, i3, a2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                                }
                                i3 = a2 + 1;
                                b = i2;
                                str4 = str3;
                                c3 = '#';
                                c = 65535;
                                break;
                        }
                    }
                }
                i = b;
                str2 = str4;
                int d = d(str2, i3, a2);
                int i4 = d + 1;
                if (i4 < a2) {
                    this.e = e(str2, i3, d);
                    this.f = g(str2, i4, a2);
                    if (this.f == -1) {
                        return EnumC0638a.INVALID_PORT;
                    }
                } else {
                    this.e = e(str2, i3, d);
                    this.f = t.a(this.b);
                }
                if (this.e == null) {
                    return EnumC0638a.INVALID_HOST;
                }
            } else {
                this.c = tVar.d();
                this.d = tVar.e();
                this.e = tVar.g;
                this.f = tVar.h;
                this.g.clear();
                this.g.addAll(tVar.i());
                if (a3 == b || str4.charAt(a3) == '#') {
                    e(tVar.k());
                }
                a2 = a3;
                i = b;
                str2 = str4;
            }
            int a6 = g.a(str2, a2, i, "?#");
            a(str2, a2, a6);
            if (a6 < i && str2.charAt(a6) == '?') {
                int a7 = g.a(str2, a6, i, '#');
                this.h = t.b(t.a(str, a6 + 1, a7, " \"'<>#", true, false, true, true));
                a6 = a7;
            }
            if (a6 < i && str2.charAt(a6) == '#') {
                this.i = t.a(str, a6 + 1, i, "", true, false, false, false);
            }
            return EnumC0638a.SUCCESS;
        }

        /* JADX WARN: Type inference failed for: r12v0 */
        /* JADX WARN: Type inference failed for: r12v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r12v3 */
        private void a(String str, int i, int i2) {
            int i3;
            int i4;
            String str2 = str;
            int i5 = i2;
            char c = 3;
            ?? r12 = 0;
            Object[] objArr = {str2, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e45eed4c1a0a4cbdad9e87d65407486c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e45eed4c1a0a4cbdad9e87d65407486c");
            } else if (i == i5) {
            } else {
                char charAt = str.charAt(i);
                if (charAt == '/' || charAt == '\\') {
                    this.g.clear();
                    this.g.add("");
                    i3 = i + 1;
                } else {
                    this.g.set(this.g.size() - 1, "");
                    i3 = i;
                }
                int i6 = i3;
                while (i6 < i5) {
                    int a2 = g.a(str2, i6, i5, "/\\");
                    byte b = a2 < i5 ? (byte) 1 : (byte) 0;
                    Object[] objArr2 = new Object[5];
                    objArr2[r12] = str2;
                    objArr2[1] = Integer.valueOf(i6);
                    objArr2[2] = Integer.valueOf(a2);
                    objArr2[c] = Byte.valueOf(b);
                    objArr2[4] = (byte) 1;
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a28e70fea1978fb7a67d30483ad1bf96", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, r12, "a28e70fea1978fb7a67d30483ad1bf96");
                        i4 = a2;
                    } else {
                        i4 = a2;
                        String a3 = t.a(str, i6, a2, " \"<>^`{}|/\\?#", true, false, false, true);
                        if (!f(a3)) {
                            if (g(a3)) {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "59ed99002738323c286a16c277ff9f8a", 6917529027641081856L)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "59ed99002738323c286a16c277ff9f8a");
                                } else if (this.g.remove(this.g.size() - 1).isEmpty() && !this.g.isEmpty()) {
                                    this.g.set(this.g.size() - 1, "");
                                } else {
                                    this.g.add("");
                                }
                            } else {
                                if (this.g.get(this.g.size() - 1).isEmpty()) {
                                    this.g.set(this.g.size() - 1, a3);
                                } else {
                                    this.g.add(a3);
                                }
                                if (b != 0) {
                                    this.g.add("");
                                }
                            }
                        }
                    }
                    i6 = b != 0 ? i4 + 1 : i4;
                    str2 = str;
                    i5 = i2;
                    r12 = 0;
                    c = 3;
                }
            }
        }

        private boolean f(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d3c704a22aeb993c2d8b8c095d4ab32", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d3c704a22aeb993c2d8b8c095d4ab32")).booleanValue() : str.equals(CommonConstant.Symbol.DOT) || str.equalsIgnoreCase("%2e");
        }

        private boolean g(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b313dd343dce150065ab98233fc1fc6", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b313dd343dce150065ab98233fc1fc6")).booleanValue() : str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        private static int b(String str, int i, int i2) {
            Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "87530d07569e65ec919106a3e35ae273", 6917529027641081856L)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "87530d07569e65ec919106a3e35ae273")).intValue();
            }
            if (i2 - i < 2) {
                return -1;
            }
            char charAt = str.charAt(i);
            if ((charAt < 'a' || charAt > 'z') && (charAt < 'A' || charAt > 'Z')) {
                return -1;
            }
            for (int i3 = i + 1; i3 < i2; i3++) {
                char charAt2 = str.charAt(i3);
                if ((charAt2 < 'a' || charAt2 > 'z') && ((charAt2 < 'A' || charAt2 > 'Z') && !((charAt2 >= '0' && charAt2 <= '9') || charAt2 == '+' || charAt2 == '-' || charAt2 == '.'))) {
                    if (charAt2 == ':') {
                        return i3;
                    }
                    return -1;
                }
            }
            return -1;
        }

        private static int c(String str, int i, int i2) {
            int i3 = 0;
            Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4776530b11b7e8a5e92dc39a4cb78cb7", 6917529027641081856L)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4776530b11b7e8a5e92dc39a4cb78cb7")).intValue();
            }
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

        private static int d(String str, int i, int i2) {
            Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fd7c973703f0e723bbe2e55604012b8d", 6917529027641081856L)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fd7c973703f0e723bbe2e55604012b8d")).intValue();
            }
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

        private static String e(String str, int i, int i2) {
            InetAddress f;
            Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aad65149e4393653707f479010ee0a90", 6917529027641081856L)) {
                return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aad65149e4393653707f479010ee0a90");
            }
            String a2 = t.a(str, i, i2, false);
            if (a2.contains(CommonConstant.Symbol.COLON)) {
                if (a2.startsWith("[") && a2.endsWith(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT)) {
                    f = f(a2, 1, a2.length() - 1);
                } else {
                    f = f(a2, 0, a2.length());
                }
                if (f == null) {
                    return null;
                }
                byte[] address = f.getAddress();
                if (address.length == 16) {
                    return a(address);
                }
                throw new AssertionError();
            }
            return g.a(a2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:43:0x00a1, code lost:
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00a2, code lost:
            if (r4 == 16) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00a4, code lost:
            if (r5 != (-1)) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00a6, code lost:
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00a7, code lost:
            r13 = r4 - r5;
            java.lang.System.arraycopy(r1, r5, r1, 16 - r13, r13);
            java.util.Arrays.fill(r1, r5, (16 - r4) + r5, (byte) 0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00b7, code lost:
            return java.net.InetAddress.getByAddress(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x00bd, code lost:
            throw new java.lang.AssertionError();
         */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0078  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.net.InetAddress f(java.lang.String r13, int r14, int r15) {
            /*
                Method dump skipped, instructions count: 190
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.retrofit2.t.a.f(java.lang.String, int, int):java.net.InetAddress");
        }

        private static boolean a(String str, int i, int i2, byte[] bArr, int i3) {
            Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), bArr, Integer.valueOf(i3)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8113b981a399f2d954d1dc62500ba3f2", 6917529027641081856L)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8113b981a399f2d954d1dc62500ba3f2")).booleanValue();
            }
            int i4 = i;
            int i5 = i3;
            while (i4 < i2) {
                if (i5 == 16) {
                    return false;
                }
                if (i5 != i3) {
                    if (str.charAt(i4) != '.') {
                        return false;
                    }
                    i4++;
                }
                int i6 = i4;
                int i7 = 0;
                while (i6 < i2) {
                    char charAt = str.charAt(i6);
                    if (charAt < '0' || charAt > '9') {
                        break;
                    } else if ((i7 == 0 && i4 != i6) || (i7 = ((i7 * 10) + charAt) - 48) > 255) {
                        return false;
                    } else {
                        i6++;
                    }
                }
                if (i6 - i4 == 0) {
                    return false;
                }
                bArr[i5] = (byte) i7;
                i5++;
                i4 = i6;
            }
            return i5 == i3 + 4;
        }

        private static String a(byte[] bArr) {
            int i = 0;
            Object[] objArr = {bArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "32c2355f028ff3d3bc7350e2f5bf4e28", 6917529027641081856L)) {
                return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "32c2355f028ff3d3bc7350e2f5bf4e28");
            }
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

        private static int g(String str, int i, int i2) {
            Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "47036e7ffdadbe85a54072703e10992b", 6917529027641081856L)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "47036e7ffdadbe85a54072703e10992b")).intValue();
            }
            try {
                int parseInt = Integer.parseInt(t.a(str, i, i2, "", false, false, false, true));
                if (parseInt <= 0 || parseInt > 65535) {
                    return -1;
                }
                return parseInt;
            } catch (NumberFormatException unused) {
                return -1;
            }
        }
    }

    public static String a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9d8ab52484769998974d54daf31089d2", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9d8ab52484769998974d54daf31089d2") : a(str, 0, str.length(), z);
    }

    private List<String> a(List<String> list, boolean z) {
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d99eeaf5853d813491920cc73374a2b1", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d99eeaf5853d813491920cc73374a2b1");
        }
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str = list.get(i);
            arrayList.add(str != null ? a(str, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static String a(String str, int i, int i2, boolean z) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aa36d315c7559c1717fc3db474665623", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aa36d315c7559c1717fc3db474665623");
        }
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
        Object[] objArr = {cVar, str, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "af814edff2cb412b8840f7fadca1ac4a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "af814edff2cb412b8840f7fadca1ac4a");
            return;
        }
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

    private static boolean a(String str, int i, int i2) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e77f9309fe805f9adbad759afd507644", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e77f9309fe805f9adbad759afd507644")).booleanValue();
        }
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && a(str.charAt(i + 1)) != -1 && a(str.charAt(i3)) != -1;
    }

    public static String a(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0), Byte.valueOf(z4 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5c05e49803e3635340a8f911d6f9a8ed", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5c05e49803e3635340a8f911d6f9a8ed");
        }
        int i3 = i;
        while (i3 < i2) {
            int codePointAt = str.codePointAt(i3);
            if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || !z4) && str2.indexOf(codePointAt) == -1 && ((codePointAt != 37 || (z && (!z2 || a(str, i3, i2)))) && (codePointAt != 43 || !z3)))) {
                i3 += Character.charCount(codePointAt);
            } else {
                okio.c cVar = new okio.c();
                cVar.a(str, i, i3);
                a(cVar, str, i3, i2, str2, z, z2, z3, z4);
                return cVar.p();
            }
        }
        return str.substring(i, i2);
    }

    private static void a(okio.c cVar, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        Object[] objArr = {cVar, str, Integer.valueOf(i), Integer.valueOf(i2), str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0), Byte.valueOf(z4 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        okio.c cVar2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c532b157be1d5e3022de432934edf638", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c532b157be1d5e3022de432934edf638");
            return;
        }
        int i3 = i;
        while (i3 < i2) {
            int codePointAt = str.codePointAt(i3);
            if (z) {
                if (codePointAt != 9) {
                    if (codePointAt != 10) {
                        if (codePointAt != 12) {
                            if (codePointAt == 13) {
                            }
                        }
                    }
                }
                i3 += Character.charCount(codePointAt);
            }
            if (codePointAt == 43 && z3) {
                cVar.b(z ? "+" : "%2B");
            } else if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z4) || str2.indexOf(codePointAt) != -1 || (codePointAt == 37 && (!z || (z2 && !a(str, i3, i2)))))) {
                if (cVar2 == null) {
                    cVar2 = new okio.c();
                }
                cVar2.a(codePointAt);
                while (!cVar2.d()) {
                    int g = cVar2.g() & 255;
                    cVar.h(37);
                    cVar.h((int) c[(g >> 4) & 15]);
                    cVar.h((int) c[g & 15]);
                }
            } else {
                cVar.a(codePointAt);
            }
            i3 += Character.charCount(codePointAt);
        }
    }

    public static String a(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0), Byte.valueOf(z4 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "10891f96ebe55ba550ecdcfd179ad0b3", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "10891f96ebe55ba550ecdcfd179ad0b3") : a(str, 0, str.length(), str2, z, z2, z3, z4);
    }
}
