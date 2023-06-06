package com.sankuai.eh.component.service.utils;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.huawei.hms.actions.SearchIntents;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e {
    public static ChangeQuickRedirect a;

    public static String a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7d27f6763c4b1b0b42813323475053a4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7d27f6763c4b1b0b42813323475053a4");
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return str;
        }
        Uri parse = Uri.parse(str);
        String a2 = a(parse, "fragment");
        Uri.Builder path = new Uri.Builder().scheme(a(parse, NetLogConstants.Details.SCHEME)).authority(a(parse, "authority")).path(a(parse, "path"));
        for (String str3 : parse.getQueryParameterNames()) {
            if (!str2.equals(str3)) {
                path.appendQueryParameter(str3, parse.getQueryParameter(str3));
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(path.toString());
        sb.append(TextUtils.isEmpty(a2) ? "" : "#" + a2);
        return sb.toString();
    }

    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8509e8152feac0b67ed491e0c5480b9e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8509e8152feac0b67ed491e0c5480b9e");
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Uri parse = Uri.parse(str);
        return new Uri.Builder().scheme(a(parse, NetLogConstants.Details.SCHEME)).authority(a(parse, "authority")).path(a(parse, "path")).toString();
    }

    public static String b(String str) {
        String str2;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b7edfae7e527bc7893ae36f73aaef368", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b7edfae7e527bc7893ae36f73aaef368");
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String a2 = a(Uri.parse(str), "fragment");
        StringBuilder sb = new StringBuilder();
        sb.append(a(str));
        if (TextUtils.isEmpty(a2)) {
            str2 = "";
        } else {
            str2 = "#" + a2;
        }
        sb.append(str2);
        return sb.toString();
    }

    public static String b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4568e5ce669e2c2734ed2525eb4b24db", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4568e5ce669e2c2734ed2525eb4b24db");
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        try {
            Uri parse = Uri.parse(str);
            String queryParameter = Uri.parse(h(parse.getQueryParameter("url") != null ? parse.getQueryParameter("url") : "")).getQueryParameter(str2);
            return !TextUtils.isEmpty(queryParameter) ? queryParameter : parse.getQueryParameter(str2);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0087ee78c2950618b17ea2e397daf3b5", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0087ee78c2950618b17ea2e397daf3b5") : !TextUtils.isEmpty(str) ? (str.startsWith("https") || str.startsWith("http")) ? str : b(str, "url") : "";
    }

    public static String a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "51f69d42fbb2508e36cc5d235d4033ad", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "51f69d42fbb2508e36cc5d235d4033ad") : TextUtils.isEmpty(str) ? str : Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).toString();
    }

    private static String h(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "972428e76f3ad7404d747184b843d780", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "972428e76f3ad7404d747184b843d780");
        }
        try {
            return URLDecoder.decode(str);
        } catch (Exception unused) {
            return str;
        }
    }

    public static int a(String[] strArr, String str) {
        Object[] objArr = {strArr, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8fbc4a5c7a34cc913d1a1752bd822fe9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8fbc4a5c7a34cc913d1a1752bd822fe9")).intValue();
        }
        for (String str2 : strArr) {
            if (str2.equals(str)) {
                return 1;
            }
            if (str.contains("*")) {
                if (str.equals(str2.substring(0, str2.indexOf("=") + 1) + "*")) {
                    return 0;
                }
                String[] split = str.split("=");
                if (split != null && split.length == 2 && str2.contains(split[0]) && str2.contains(split[1].replace("*", ""))) {
                    return 0;
                }
            }
        }
        return -1;
    }

    private static int b(String str, String str2, String str3) {
        String str4;
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cc36aa4944f0395d9dfe7dcf24560dab", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cc36aa4944f0395d9dfe7dcf24560dab")).intValue();
        }
        String str5 = str + str2;
        String a2 = a(str5);
        String a3 = a(str3);
        if ("/".equals(str2)) {
            Object[] objArr2 = {a3};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e9cc2dcc54d1522b8edb909c60d199c8", RobustBitConfig.DEFAULT_VALUE)) {
                str4 = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e9cc2dcc54d1522b8edb909c60d199c8");
            } else if (!a3.endsWith("/")) {
                str4 = a3 + "/";
            }
            a3 = str4;
        }
        if (TextUtils.isEmpty(a2) || TextUtils.isEmpty(a3)) {
            return 0;
        }
        String d = d(str5);
        String d2 = d(str3);
        if (d != null) {
            return d.equals(d2) ? 3 : 0;
        } else if (a2.contains("/**/*")) {
            return 4;
        } else {
            return a2.contains("*") ? c(a2, a3) ? 2 : 0 : a2.equals(a3) ? 1 : 0;
        }
    }

    public static String d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c14500325b0bbbaa342fcb20051d084e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c14500325b0bbbaa342fcb20051d084e");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String a2 = a(Uri.parse(str), "fragment");
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        int indexOf = a2.indexOf(CommonConstant.Symbol.QUESTION_MARK);
        return indexOf != -1 ? a2.substring(0, indexOf) : a2;
    }

    public static String e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b52a42832f453f8d1973ae030cbbbfef", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b52a42832f453f8d1973ae030cbbbfef");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (str.startsWith("http") || str.startsWith("https")) ? str : b(str, "url");
    }

    public static String f(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a4ab24a75992acd4975307ff51395bc3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a4ab24a75992acd4975307ff51395bc3");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return a(Uri.parse(str), SearchIntents.EXTRA_QUERY);
    }

    public static boolean c(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aa8dfb7db8ebac389b4fcb247c5c3304", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aa8dfb7db8ebac389b4fcb247c5c3304")).booleanValue();
        }
        if (i(str) && i(str2)) {
            char[] charArray = str.toCharArray();
            char[] charArray2 = str2.toCharArray();
            int i = 0;
            int i2 = 0;
            while (i < charArray.length && i2 < charArray2.length) {
                if (charArray[i] != charArray2[i2]) {
                    if (charArray[i] != '*') {
                        break;
                    } else if (charArray2[i2] != '/') {
                        i2++;
                        if (i2 == charArray2.length) {
                            i++;
                        }
                    } else {
                        i++;
                        if (i == charArray.length) {
                            i2++;
                        }
                    }
                } else {
                    i++;
                    i2++;
                }
            }
            return i2 == charArray2.length && i == charArray.length;
        }
        return false;
    }

    private static boolean i(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "301986821bcbbcec3dd268b810a8b952", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "301986821bcbbcec3dd268b810a8b952")).booleanValue() : !TextUtils.isEmpty(str) && Uri.parse(str).isHierarchical();
    }

    public static JsonElement a(String str, JsonArray jsonArray, String str2, String str3) {
        Object[] objArr = {str, jsonArray, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ed57d391ab770c20c8693371b2fa61a2", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonElement) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ed57d391ab770c20c8693371b2fa61a2");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < jsonArray.size(); i++) {
            JsonElement jsonElement = jsonArray.get(i);
            switch (b(str, b.b(b.c(jsonElement).get(str2), ""), str3)) {
                case 1:
                    arrayList2.add(jsonElement);
                    break;
                case 2:
                    arrayList3.add(jsonElement);
                    break;
                case 3:
                    arrayList.add(jsonElement);
                    break;
                case 4:
                    arrayList4.add(jsonElement);
                    break;
            }
        }
        if (arrayList.size() > 0) {
            return a(str, arrayList, str2, str3);
        }
        if (arrayList2.size() > 0) {
            return a(str, arrayList2, str2, str3);
        }
        if (arrayList3.size() > 0) {
            return a(str, arrayList3, str2, str3);
        }
        if (arrayList4.size() > 0) {
            return (JsonElement) arrayList4.get(0);
        }
        return null;
    }

    private static int a(int[] iArr) {
        Object[] objArr = {iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "859d9d5eb1484b56fdb341b2f2c43315", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "859d9d5eb1484b56fdb341b2f2c43315")).intValue();
        }
        int i = 0;
        for (int i2 : iArr) {
            if (i2 != -1) {
                i += i2;
            }
        }
        return i;
    }

    private static JsonElement a(String str, List<JsonElement> list, String str2, String str3) {
        int[] iArr;
        int i;
        int i2;
        boolean z = true;
        int i3 = 2;
        Object[] objArr = {str, list, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        Object obj = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5511240d10b66d4b287e3d32750c2321", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonElement) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5511240d10b66d4b287e3d32750c2321");
        }
        int[] iArr2 = {-1, -1};
        JsonElement jsonElement = null;
        for (JsonElement jsonElement2 : list) {
            Map<String, JsonElement> c = b.c(jsonElement2);
            JsonArray b = b.b(b.c(c.get("condition"), "ab"));
            String b2 = b.b(c.get(str2), "");
            Object[] objArr2 = new Object[3];
            objArr2[0] = str;
            objArr2[z ? 1 : 0] = b2;
            objArr2[i3] = str3;
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "1760065188db161de4bad04db33576b5", RobustBitConfig.DEFAULT_VALUE)) {
                iArr = (int[]) PatchProxy.accessDispatch(objArr2, obj, changeQuickRedirect2, z, "1760065188db161de4bad04db33576b5");
            } else {
                String str4 = str + b2;
                int[] iArr3 = new int[i3];
                if (!TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str3)) {
                    String a2 = a(Uri.parse(str4), SearchIntents.EXTRA_QUERY);
                    String a3 = a(Uri.parse(str3), SearchIntents.EXTRA_QUERY);
                    if (!TextUtils.isEmpty(a2)) {
                        Arrays.fill(iArr3, -1);
                        if (!TextUtils.isEmpty(a3)) {
                            String[] split = a2.split("&");
                            String[] split2 = a3.split("&");
                            int length = split.length;
                            int i4 = 0;
                            boolean z2 = true;
                            while (i4 < length) {
                                String str5 = split[i4];
                                if (!z2) {
                                    break;
                                }
                                if (a(split2, str5) == z) {
                                    if (iArr3[0] == -1) {
                                        i2 = 1;
                                    } else {
                                        i2 = iArr3[0] + 1;
                                        iArr3[0] = i2;
                                    }
                                    iArr3[0] = i2;
                                } else if (a(split2, str5) == 0) {
                                    if (iArr3[1] == -1) {
                                        i = 1;
                                    } else {
                                        i = iArr3[1] + 1;
                                        iArr3[1] = i;
                                    }
                                    iArr3[1] = i;
                                } else {
                                    Arrays.fill(iArr3, -1);
                                    z2 = false;
                                }
                                i4++;
                                z = true;
                            }
                        }
                    }
                }
                iArr = iArr3;
            }
            if (iArr[0] == 0 && iArr[1] == 0) {
                if (jsonElement == null && f.a(b)) {
                    jsonElement = jsonElement2;
                    obj = null;
                    z = true;
                    i3 = 2;
                } else {
                    obj = null;
                    z = true;
                    i3 = 2;
                }
            }
            if (a(iArr2) < a(iArr)) {
                if (f.a(b)) {
                    System.arraycopy(iArr, 0, iArr2, 0, 2);
                    jsonElement = jsonElement2;
                }
            } else if (a(iArr2) == a(iArr) && iArr2[0] < iArr[0] && f.a(b)) {
                System.arraycopy(iArr, 0, iArr2, 0, 2);
                jsonElement = jsonElement2;
            }
            obj = null;
            z = true;
            i3 = 2;
        }
        return jsonElement;
    }

    public static Uri g(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f76231cb7e9a771fa037cb64fdd18d92", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f76231cb7e9a771fa037cb64fdd18d92");
        }
        if (str == null) {
            return Uri.parse("");
        }
        return Uri.parse(str);
    }

    public static String a(Uri uri, String str) {
        char c = 2;
        Object[] objArr = {uri, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e38261a45c3ea8fa229076cc065499dd", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e38261a45c3ea8fa229076cc065499dd");
        }
        if (uri == null) {
            return "";
        }
        try {
            switch (str.hashCode()) {
                case -1650269616:
                    if (str.equals("fragment")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -907987547:
                    if (str.equals(NetLogConstants.Details.SCHEME)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 3208616:
                    if (str.equals("host")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 3433509:
                    if (str.equals("path")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 107944136:
                    if (str.equals(SearchIntents.EXTRA_QUERY)) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 1475610435:
                    if (str.equals("authority")) {
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    return uri.getScheme();
                case 1:
                    return uri.getHost();
                case 2:
                    return uri.getAuthority();
                case 3:
                    return uri.getPath();
                case 4:
                    return uri.getQuery();
                case 5:
                    return uri.getFragment();
                default:
                    return "";
            }
        } catch (Throwable unused) {
            return "";
        }
    }

    public static Bundle a(Intent intent, Bundle bundle) {
        Object[] objArr = {intent, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eb25f8ecdd47eee9592c56e13b74e7e5", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bundle) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eb25f8ecdd47eee9592c56e13b74e7e5");
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                bundle.putAll(extras);
            }
        } catch (Exception e) {
            com.sankuai.eh.component.service.tools.d.a(e);
        }
        bundle.putAll(a(intent.getData()));
        return bundle;
    }

    public static Bundle a(Uri uri) {
        int i = 0;
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "842c591699545724a7d9784876774645", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bundle) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "842c591699545724a7d9784876774645");
        }
        Bundle bundle = new Bundle();
        if (uri == null || TextUtils.isEmpty(uri.getEncodedQuery())) {
            return bundle;
        }
        String encodedQuery = uri.getEncodedQuery();
        int length = encodedQuery.length();
        while (true) {
            int indexOf = encodedQuery.indexOf(38, i);
            int i2 = indexOf != -1 ? indexOf : length;
            int indexOf2 = encodedQuery.indexOf(61, i);
            if (indexOf2 > i2 || indexOf2 == -1) {
                indexOf2 = i2;
            }
            if (indexOf2 > i) {
                String substring = encodedQuery.substring(i, indexOf2);
                String substring2 = indexOf2 == i2 ? "" : encodedQuery.substring(indexOf2 + 1, i2);
                if ("url".equalsIgnoreCase(substring) && substring2.contains(CommonConstant.Symbol.QUESTION_MARK)) {
                    substring2 = encodedQuery.substring(indexOf2 + 1);
                }
                String decode = Uri.decode(substring);
                if (!bundle.containsKey(decode)) {
                    try {
                        bundle.putString(decode, Uri.decode(substring2));
                    } catch (Exception e) {
                        com.sankuai.eh.component.service.tools.d.a(e);
                    }
                }
            }
            if (indexOf == -1) {
                return bundle;
            }
            i = indexOf + 1;
        }
    }
}
