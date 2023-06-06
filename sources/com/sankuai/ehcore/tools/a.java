package com.sankuai.ehcore.tools;

import android.net.Uri;
import android.text.TextUtils;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.huawei.hms.actions.SearchIntents;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.tools.d;
import com.sankuai.eh.component.service.utils.e;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;

    private static int a(String[] strArr, String str) {
        Object[] objArr = {strArr, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5b21f267309c99ea6a3853241be62b7c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5b21f267309c99ea6a3853241be62b7c")).intValue();
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

    private static int a(String str, String str2) {
        boolean z;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bb108fdc78d2767b62ecf3e435ba8ceb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bb108fdc78d2767b62ecf3e435ba8ceb")).intValue();
        }
        String a2 = e.a(str);
        String a3 = e.a(str2);
        if (TextUtils.isEmpty(a2) || TextUtils.isEmpty(a3)) {
            return 0;
        }
        String a4 = a(str);
        String a5 = a(str2);
        if (a4 == null || a4.equals(a5)) {
            if (!a2.contains("*")) {
                return a2.equals(a3) ? 1 : 0;
            }
            Object[] objArr2 = {a2, a3};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "4634706617c9b93d3107415902685efd", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "4634706617c9b93d3107415902685efd")).booleanValue();
            } else {
                if (b(a2) && b(a3)) {
                    char[] charArray = a2.toCharArray();
                    char[] charArray2 = a3.toCharArray();
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
                    if (i2 == charArray2.length && i == charArray.length) {
                        z = true;
                    }
                }
                z = false;
            }
            return z ? 2 : 0;
        }
        return 0;
    }

    private static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9da8f210c41ac3c52eada1a88aa9f9d3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9da8f210c41ac3c52eada1a88aa9f9d3");
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

    private static boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a7d08734f97a295c91f73b834f17963d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a7d08734f97a295c91f73b834f17963d")).booleanValue() : !TextUtils.isEmpty(str) && Uri.parse(str).isHierarchical();
    }

    public static JsonElement a(JsonArray jsonArray, String str, String str2) {
        Object[] objArr = {jsonArray, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ca1270a3793754ef1f3a5eeba5690d5a", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonElement) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ca1270a3793754ef1f3a5eeba5690d5a");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i = 0; i < jsonArray.size(); i++) {
            JsonElement jsonElement = jsonArray.get(i);
            switch (a(com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(jsonElement).get(str), ""), str2)) {
                case 1:
                    arrayList2.add(jsonElement);
                    break;
                case 2:
                    arrayList3.add(jsonElement);
                    break;
                case 3:
                    arrayList.add(jsonElement);
                    break;
            }
        }
        if (arrayList.size() > 0) {
            return a(arrayList, str, str2);
        }
        if (arrayList2.size() > 0) {
            return a(arrayList2, str, str2);
        }
        if (arrayList3.size() > 0) {
            return a(arrayList3, str, str2);
        }
        return null;
    }

    private static int a(int[] iArr) {
        Object[] objArr = {iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cca426bd01231570e8e820cb63aa3eda", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cca426bd01231570e8e820cb63aa3eda")).intValue();
        }
        int i = 0;
        for (int i2 : iArr) {
            if (i2 != -1) {
                i += i2;
            }
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0110, code lost:
        if (com.sankuai.eh.component.service.utils.f.a(r7) != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.gson.JsonElement a(java.util.List<com.google.gson.JsonElement> r21, java.lang.String r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.ehcore.tools.a.a(java.util.List, java.lang.String, java.lang.String):com.google.gson.JsonElement");
    }

    private static String a(Uri uri, String str) {
        char c = 2;
        Object[] objArr = {uri, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cd39bb7d4fe969b38457210ef2a98121", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cd39bb7d4fe969b38457210ef2a98121");
        }
        if (uri == null) {
            return "";
        }
        try {
            switch (str.hashCode()) {
                case -1650269616:
                    if (str.equals("fragment")) {
                        c = 4;
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
                case 3433509:
                    if (str.equals("path")) {
                        break;
                    }
                    c = 65535;
                    break;
                case 107944136:
                    if (str.equals(SearchIntents.EXTRA_QUERY)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1475610435:
                    if (str.equals("authority")) {
                        c = 1;
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
                    return uri.getAuthority();
                case 2:
                    return uri.getPath();
                case 3:
                    return uri.getQuery();
                case 4:
                    return uri.getFragment();
                default:
                    return "";
            }
        } catch (Throwable th) {
            d.a(th);
            return "";
        }
    }
}
