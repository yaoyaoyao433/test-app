package okhttp3.internal.http;

import com.meituan.robust.common.CommonConstant;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import okhttp3.Challenge;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okio.c;
import okio.f;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class HttpHeaders {
    private static final f QUOTED_STRING_DELIMITERS = f.a("\"\\");
    private static final f TOKEN_DELIMITERS = f.a("\t ,=");

    private HttpHeaders() {
    }

    public static long contentLength(Response response) {
        return contentLength(response.headers());
    }

    public static long contentLength(Headers headers) {
        return stringToLong(headers.get("Content-Length"));
    }

    private static long stringToLong(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static boolean varyMatches(Response response, Headers headers, Request request) {
        for (String str : varyFields(response)) {
            if (!Util.equal(headers.values(str), request.headers(str))) {
                return false;
            }
        }
        return true;
    }

    public static boolean hasVaryAll(Response response) {
        return hasVaryAll(response.headers());
    }

    public static boolean hasVaryAll(Headers headers) {
        return varyFields(headers).contains("*");
    }

    private static Set<String> varyFields(Response response) {
        return varyFields(response.headers());
    }

    public static Set<String> varyFields(Headers headers) {
        Set<String> emptySet = Collections.emptySet();
        int size = headers.size();
        Set<String> set = emptySet;
        for (int i = 0; i < size; i++) {
            if ("Vary".equalsIgnoreCase(headers.name(i))) {
                String value = headers.value(i);
                if (set.isEmpty()) {
                    set = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
                }
                for (String str : value.split(CommonConstant.Symbol.COMMA)) {
                    set.add(str.trim());
                }
            }
        }
        return set;
    }

    public static Headers varyHeaders(Response response) {
        return varyHeaders(response.networkResponse().request().headers(), response.headers());
    }

    public static Headers varyHeaders(Headers headers, Headers headers2) {
        Set<String> varyFields = varyFields(headers2);
        if (varyFields.isEmpty()) {
            return new Headers.Builder().build();
        }
        Headers.Builder builder = new Headers.Builder();
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            String name = headers.name(i);
            if (varyFields.contains(name)) {
                builder.add(name, headers.value(i));
            }
        }
        return builder.build();
    }

    public static List<Challenge> parseChallenges(Headers headers, String str) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < headers.size(); i++) {
            if (str.equalsIgnoreCase(headers.name(i))) {
                parseChallengeHeader(arrayList, new c().b(headers.value(i)));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00bb, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00bb, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void parseChallengeHeader(java.util.List<okhttp3.Challenge> r8, okio.c r9) {
        /*
            r0 = 0
        L1:
            r1 = r0
        L2:
            if (r1 != 0) goto Le
            skipWhitespaceAndCommas(r9)
            java.lang.String r1 = readToken(r9)
            if (r1 != 0) goto Le
            return
        Le:
            boolean r2 = skipWhitespaceAndCommas(r9)
            java.lang.String r3 = readToken(r9)
            if (r3 != 0) goto L2c
            boolean r9 = r9.d()
            if (r9 != 0) goto L1f
            return
        L1f:
            okhttp3.Challenge r9 = new okhttp3.Challenge
            java.util.Map r0 = java.util.Collections.emptyMap()
            r9.<init>(r1, r0)
            r8.add(r9)
            return
        L2c:
            r4 = 61
            int r5 = skipAll(r9, r4)
            boolean r6 = skipWhitespaceAndCommas(r9)
            if (r2 != 0) goto L60
            if (r6 != 0) goto L40
            boolean r2 = r9.d()
            if (r2 == 0) goto L60
        L40:
            okhttp3.Challenge r2 = new okhttp3.Challenge
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r3)
            java.lang.String r3 = repeat(r4, r5)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            r2.<init>(r1, r3)
            r8.add(r2)
            goto L1
        L60:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            int r6 = skipAll(r9, r4)
            int r5 = r5 + r6
        L6a:
            if (r3 != 0) goto L7a
            java.lang.String r3 = readToken(r9)
            boolean r5 = skipWhitespaceAndCommas(r9)
            if (r5 != 0) goto Lbb
            int r5 = skipAll(r9, r4)
        L7a:
            if (r5 == 0) goto Lbb
            r6 = 1
            if (r5 <= r6) goto L80
            return
        L80:
            boolean r6 = skipWhitespaceAndCommas(r9)
            if (r6 == 0) goto L87
            return
        L87:
            boolean r6 = r9.d()
            if (r6 != 0) goto L9c
            r6 = 0
            byte r6 = r9.c(r6)
            r7 = 34
            if (r6 != r7) goto L9c
            java.lang.String r6 = readQuotedString(r9)
            goto La0
        L9c:
            java.lang.String r6 = readToken(r9)
        La0:
            if (r6 != 0) goto La3
            return
        La3:
            java.lang.Object r3 = r2.put(r3, r6)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto Lac
            return
        Lac:
            boolean r3 = skipWhitespaceAndCommas(r9)
            if (r3 != 0) goto Lb9
            boolean r3 = r9.d()
            if (r3 != 0) goto Lb9
            return
        Lb9:
            r3 = r0
            goto L6a
        Lbb:
            okhttp3.Challenge r4 = new okhttp3.Challenge
            r4.<init>(r1, r2)
            r8.add(r4)
            r1 = r3
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.HttpHeaders.parseChallengeHeader(java.util.List, okio.c):void");
    }

    private static boolean skipWhitespaceAndCommas(c cVar) {
        boolean z = false;
        while (!cVar.d()) {
            byte c = cVar.c(0L);
            if (c != 44) {
                if (c != 32 && c != 9) {
                    break;
                }
                cVar.g();
            } else {
                cVar.g();
                z = true;
            }
        }
        return z;
    }

    private static int skipAll(c cVar, byte b) {
        int i = 0;
        while (!cVar.d() && cVar.c(0L) == b) {
            i++;
            cVar.g();
        }
        return i;
    }

    private static String readQuotedString(c cVar) {
        if (cVar.g() != 34) {
            throw new IllegalArgumentException();
        }
        c cVar2 = new c();
        while (true) {
            long b = cVar.b(QUOTED_STRING_DELIMITERS);
            if (b == -1) {
                return null;
            }
            if (cVar.c(b) == 34) {
                cVar2.write(cVar, b);
                cVar.g();
                return cVar2.p();
            } else if (cVar.b == b + 1) {
                return null;
            } else {
                cVar2.write(cVar, b);
                cVar.g();
                cVar2.write(cVar, 1L);
            }
        }
    }

    private static String readToken(c cVar) {
        try {
            long a = cVar.a(TOKEN_DELIMITERS, 0L);
            if (a == -1) {
                a = cVar.b;
            }
            if (a != 0) {
                return cVar.e(a);
            }
            return null;
        } catch (EOFException unused) {
            throw new AssertionError();
        }
    }

    private static String repeat(char c, int i) {
        char[] cArr = new char[i];
        Arrays.fill(cArr, c);
        return new String(cArr);
    }

    public static void receiveHeaders(CookieJar cookieJar, HttpUrl httpUrl, Headers headers) {
        if (cookieJar == CookieJar.NO_COOKIES) {
            return;
        }
        List<Cookie> parseAll = Cookie.parseAll(httpUrl, headers);
        if (parseAll.isEmpty()) {
            return;
        }
        cookieJar.saveFromResponse(httpUrl, parseAll);
    }

    public static boolean hasBody(Response response) {
        if (response.request().method().equals("HEAD")) {
            return false;
        }
        int code = response.code();
        return (((code >= 100 && code < 200) || code == 204 || code == 304) && contentLength(response) == -1 && !"chunked".equalsIgnoreCase(response.header("Transfer-Encoding"))) ? false : true;
    }

    public static int skipUntil(String str, int i, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    public static int skipWhitespace(String str, int i) {
        char charAt;
        while (i < str.length() && ((charAt = str.charAt(i)) == ' ' || charAt == '\t')) {
            i++;
        }
        return i;
    }

    public static int parseSeconds(String str, int i) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i;
        }
    }
}
