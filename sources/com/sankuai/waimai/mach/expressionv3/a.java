package com.sankuai.waimai.mach.expressionv3;

import android.support.annotation.NonNull;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0370, code lost:
        throw new com.sankuai.waimai.mach.expressionv3.b("无效的条件表达式");
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0151, code lost:
        if (r3.equals("+") != false) goto L71;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [byte] */
    /* JADX WARN: Type inference failed for: r3v65 */
    @android.support.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.sankuai.waimai.mach.expressionv3.c a(java.util.Map<java.lang.String, java.lang.Object> r27, java.util.Map<java.lang.String, java.lang.Object> r28, boolean r29) throws com.sankuai.waimai.mach.expressionv3.b {
        /*
            Method dump skipped, instructions count: 2282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.mach.expressionv3.a.a(java.util.Map, java.util.Map, boolean):com.sankuai.waimai.mach.expressionv3.c");
    }

    @NonNull
    private static c a(Map<String, Object> map, Map<String, Object> map2) throws b {
        Object[] objArr = {map, map2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ac73b388214a4d8be4b7b89539881b39", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ac73b388214a4d8be4b7b89539881b39");
        }
        Object obj = map.get("ca");
        Object obj2 = map.get("ags");
        if (!(obj instanceof Map)) {
            throw new b("无效的函数表达式");
        }
        c a2 = a((Map<String, Object>) obj, map2, false);
        if (a2.d != 1) {
            throw new b("方法名必须是一个字符串类型，而不是 " + a2.f());
        }
        String a3 = a2.a();
        int size = obj2 instanceof List ? ((List) obj2).size() : 0;
        c[] cVarArr = new c[size];
        for (int i = 0; i < size; i++) {
            Object obj3 = ((List) obj2).get(i);
            if (!(obj3 instanceof Map)) {
                throw new b("方法 " + a3 + " 的第 " + i + " 个参数无效");
            }
            cVarArr[i] = a((Map<String, Object>) obj3, map2, true);
        }
        char c = 65535;
        switch (a3.hashCode()) {
            case -2060248300:
                if (a3.equals("subtract")) {
                    c = 1;
                    break;
                }
                break;
            case -1331463047:
                if (a3.equals("divide")) {
                    c = 3;
                    break;
                }
                break;
            case -1224452763:
                if (a3.equals("hasKey")) {
                    c = '\f';
                    break;
                }
                break;
            case -1106363674:
                if (a3.equals("length")) {
                    c = 11;
                    break;
                }
                break;
            case -1003958423:
                if (a3.equals("parseFloat")) {
                    c = '\n';
                    break;
                }
                break;
            case -789478776:
                if (a3.equals("networkTimestamp")) {
                    c = 14;
                    break;
                }
                break;
            case -189271733:
                if (a3.equals("stringify")) {
                    c = '\b';
                    break;
                }
                break;
            case 96370:
                if (a3.equals("abs")) {
                    c = 7;
                    break;
                }
                break;
            case 96417:
                if (a3.equals("add")) {
                    c = 0;
                    break;
                }
                break;
            case 108290:
                if (a3.equals("mod")) {
                    c = 4;
                    break;
                }
                break;
            case 3049733:
                if (a3.equals("ceil")) {
                    c = 6;
                    break;
                }
                break;
            case 97526796:
                if (a3.equals(GearsLocator.MALL_FLOOR)) {
                    c = 5;
                    break;
                }
                break;
            case 653829668:
                if (a3.equals("multiply")) {
                    c = 2;
                    break;
                }
                break;
            case 1094496948:
                if (a3.equals("replace")) {
                    c = 15;
                    break;
                }
                break;
            case 1187783740:
                if (a3.equals("parseInt")) {
                    c = '\t';
                    break;
                }
                break;
            case 1441831689:
                if (a3.equals("formatMoney")) {
                    c = '\r';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                a(a3, cVarArr, 2);
                return a(cVarArr);
            case 1:
                a(a3, cVarArr, 2);
                return b(cVarArr);
            case 2:
                a(a3, cVarArr, 2);
                return c(cVarArr);
            case 3:
                a(a3, cVarArr, 2);
                return d(cVarArr);
            case 4:
                a(a3, cVarArr, 2);
                return e(cVarArr);
            case 5:
                a(a3, cVarArr, 1);
                Object[] objArr2 = {cVarArr};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "ba0f34df80afca393f58e0dcddac70c7", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "ba0f34df80afca393f58e0dcddac70c7") : c.a(Integer.valueOf((int) Math.floor(cVarArr[0].b().doubleValue())));
            case 6:
                a(a3, cVarArr, 1);
                Object[] objArr3 = {cVarArr};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "3d1ad8c3829f1976965de425ca89f0c6", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "3d1ad8c3829f1976965de425ca89f0c6") : c.a(Integer.valueOf((int) Math.ceil(cVarArr[0].b().doubleValue())));
            case 7:
                a(a3, cVarArr, 1);
                Object[] objArr4 = {cVarArr};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                return PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "b0647924c487a48dacd3dd1045456886", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "b0647924c487a48dacd3dd1045456886") : c.a(Double.valueOf(cVarArr[0].b().doubleValue()));
            case '\b':
                a(a3, cVarArr, 1);
                Object[] objArr5 = {cVarArr};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "6db2afc5210e6e4a8ddc9e0a09eb49ff", RobustBitConfig.DEFAULT_VALUE)) {
                    return (c) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "6db2afc5210e6e4a8ddc9e0a09eb49ff");
                }
                c cVar = cVarArr[0];
                if (cVar.d == 1) {
                    return cVar;
                }
                if (cVar.d == 0) {
                    return c.a(cVar.b().toString());
                }
                return c.b;
            case '\t':
                a(a3, cVarArr, 1);
                return f(cVarArr);
            case '\n':
                a(a3, cVarArr, 1);
                return g(cVarArr);
            case 11:
                a(a3, cVarArr, 1);
                Object[] objArr6 = {cVarArr};
                ChangeQuickRedirect changeQuickRedirect6 = a;
                if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "253e4c73b9db153c0db78d2b992dac8d", RobustBitConfig.DEFAULT_VALUE)) {
                    return (c) PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "253e4c73b9db153c0db78d2b992dac8d");
                }
                c cVar2 = cVarArr[0];
                if (cVar2.d == 1) {
                    return c.a(Integer.valueOf(cVar2.a().length()));
                }
                if (cVar2.d == 3) {
                    return c.a(Integer.valueOf(cVar2.d().size()));
                }
                if (cVar2.d == 4) {
                    return c.a(Integer.valueOf(cVar2.e().size()));
                }
                return c.a((Object) 0);
            case '\f':
                a(a3, cVarArr, 2);
                Object[] objArr7 = {cVarArr};
                ChangeQuickRedirect changeQuickRedirect7 = a;
                if (PatchProxy.isSupport(objArr7, null, changeQuickRedirect7, true, "8144e896ca8e9f8f5163fcb6a639fe11", RobustBitConfig.DEFAULT_VALUE)) {
                    return (c) PatchProxy.accessDispatch(objArr7, null, changeQuickRedirect7, true, "8144e896ca8e9f8f5163fcb6a639fe11");
                }
                c cVar3 = cVarArr[0];
                c cVar4 = cVarArr[1];
                if (cVar3.d == 4) {
                    Map e = cVar3.e();
                    if (cVar4.d == 1 && e.get(cVar4.a()) != null) {
                        return c.a(Boolean.TRUE);
                    }
                }
                return c.a(Boolean.FALSE);
            case '\r':
                a(a3, cVarArr, 1);
                Object[] objArr8 = {cVarArr};
                ChangeQuickRedirect changeQuickRedirect8 = a;
                if (PatchProxy.isSupport(objArr8, null, changeQuickRedirect8, true, "fdba4f7d4b0806aa593423565dd4a832", RobustBitConfig.DEFAULT_VALUE)) {
                    return (c) PatchProxy.accessDispatch(objArr8, null, changeQuickRedirect8, true, "fdba4f7d4b0806aa593423565dd4a832");
                }
                c cVar5 = cVarArr[0];
                if (cVar5.d == 0) {
                    return c.a(a(Double.valueOf(cVar5.b().doubleValue()), 0, 2));
                }
                return c.b;
            case 14:
                a(a3, cVarArr, 0);
                Object[] objArr9 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect9 = a;
                return PatchProxy.isSupport(objArr9, null, changeQuickRedirect9, true, "12a2b5007272e22a708d8bb352c23a74", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr9, null, changeQuickRedirect9, true, "12a2b5007272e22a708d8bb352c23a74") : c.a(Long.valueOf(com.meituan.android.time.c.b() / 1000));
            case 15:
                a(a3, cVarArr, 3);
                Object[] objArr10 = {cVarArr};
                ChangeQuickRedirect changeQuickRedirect10 = a;
                if (PatchProxy.isSupport(objArr10, null, changeQuickRedirect10, true, "de951bc829636ee6a54c8d2127252fe9", RobustBitConfig.DEFAULT_VALUE)) {
                    return (c) PatchProxy.accessDispatch(objArr10, null, changeQuickRedirect10, true, "de951bc829636ee6a54c8d2127252fe9");
                }
                c cVar6 = cVarArr[0];
                c cVar7 = cVarArr[1];
                c cVar8 = cVarArr[2];
                if (cVar6.d != 1 || cVar7.d != 1 || cVar8.d != 1) {
                    throw new b("replace 方法的实际参数类型和签名不匹配. 需要的参数类型为 (String, String, String)");
                }
                return c.a(cVar6.a().replace(cVar7.a(), cVar8.a()));
            default:
                return c.b;
        }
    }

    private static void a(String str, c[] cVarArr, int i) throws b {
        Object[] objArr = {str, cVarArr, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6ee1bf5474dd5593dd6c34e2421e8496", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6ee1bf5474dd5593dd6c34e2421e8496");
        } else if (cVarArr.length == i) {
        } else {
            throw new b("方法 " + str + " 需要 " + i + " 个参数, 实际参数个数为 " + cVarArr.length);
        }
    }

    @NonNull
    private static c a(c[] cVarArr) throws b {
        Object[] objArr = {cVarArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "126ae37ce0526c712a702857b358efb3", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "126ae37ce0526c712a702857b358efb3") : b(cVarArr[0], cVarArr[1]);
    }

    @NonNull
    private static c b(c[] cVarArr) {
        Object[] objArr = {cVarArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c987ffa91b4581469a7f93cce06bd385", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c987ffa91b4581469a7f93cce06bd385") : c.a(Double.valueOf(cVarArr[0].b().doubleValue() - cVarArr[1].b().doubleValue()));
    }

    @NonNull
    private static c c(c[] cVarArr) {
        Object[] objArr = {cVarArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d56366e4318daf5c2046b93f4d4d428e", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d56366e4318daf5c2046b93f4d4d428e") : c.a(Double.valueOf(cVarArr[0].b().doubleValue() * cVarArr[1].b().doubleValue()));
    }

    @NonNull
    private static c d(c[] cVarArr) throws b {
        Object[] objArr = {cVarArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0a5cb99f959550639d1d62b23cd55e12", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0a5cb99f959550639d1d62b23cd55e12");
        }
        c cVar = cVarArr[0];
        c cVar2 = cVarArr[1];
        if (cVar2.b().doubleValue() == 0.0d) {
            throw new b("除 0 错误");
        }
        return c.a(Double.valueOf(cVar.b().doubleValue() / cVar2.b().doubleValue()));
    }

    @NonNull
    private static c e(c[] cVarArr) {
        Object[] objArr = {cVarArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b379582e11c3072a8fa9c343376d7d35", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b379582e11c3072a8fa9c343376d7d35") : c.a(Integer.valueOf(cVarArr[0].b().intValue() % cVarArr[1].b().intValue()));
    }

    @NonNull
    private static c f(c[] cVarArr) throws b {
        Object[] objArr = {cVarArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "92e11add0e6b299ff5faf4765818131e", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "92e11add0e6b299ff5faf4765818131e");
        }
        c cVar = cVarArr[0];
        if (cVar.d == 0) {
            return c.a(Integer.valueOf(cVar.b().intValue()));
        }
        if (cVar.d == 1) {
            try {
                return c.a(Integer.valueOf((int) Double.parseDouble(cVar.a())));
            } catch (NumberFormatException unused) {
                throw new b("字符串 \"" + cVar.a() + "\" 无法转成成 int");
            }
        }
        throw new b("parseInt 函数的参数类型 " + cVar.f() + " 不支持");
    }

    @NonNull
    private static c g(c[] cVarArr) throws b {
        Object[] objArr = {cVarArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d87fd1d8201df8d234950902c3f364e9", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d87fd1d8201df8d234950902c3f364e9");
        }
        c cVar = cVarArr[0];
        if (cVar.d == 0) {
            return c.a(Double.valueOf(cVar.b().doubleValue()));
        }
        if (cVar.d == 1) {
            try {
                return c.a(Double.valueOf(Double.parseDouble(cVar.a())));
            } catch (NumberFormatException unused) {
                throw new b("字符串 \"" + cVar.a() + "\" 无法转成 float");
            }
        }
        throw new b("parseFloat 函数的参数类型 " + cVar.f() + " 不支持");
    }

    @NonNull
    private static c b(Map<String, Object> map, Map<String, Object> map2) throws b {
        Object[] objArr = {map, map2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4c808d865cd28be3f3bdef1de4f10ce2", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4c808d865cd28be3f3bdef1de4f10ce2");
        }
        Object obj = map.get("e");
        if (!(obj instanceof List)) {
            return c.b;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj2 : (List) obj) {
            if (obj2 instanceof Map) {
                c a2 = a((Map<String, Object>) obj2, map2, false);
                if (a2.d == 1) {
                    arrayList.add(a2.a());
                    i++;
                } else {
                    throw new b("序列表达式的第 " + i + " 个表达式的值不是一个标识符");
                }
            } else {
                throw new b("序列表达式的第 " + i + " 个表达式无效");
            }
        }
        return c.a(arrayList);
    }

    private static String a(Double d, int i, int i2) {
        Object[] objArr = {d, 0, 2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d22b9dc87d19e4b3d57ebaece63280f0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d22b9dc87d19e4b3d57ebaece63280f0");
        }
        if (d == null) {
            return "";
        }
        String format = String.format("%.2f", d);
        int indexOf = format.indexOf(46);
        int length = format.length();
        if (indexOf < 0 || indexOf >= length) {
            return format;
        }
        while (indexOf < length) {
            char charAt = format.charAt(length - 1);
            if (charAt != '0' && charAt != '.') {
                break;
            }
            length--;
        }
        return format.substring(0, length);
    }

    @NonNull
    private static c a(c cVar, c cVar2) throws b {
        String str;
        Object[] objArr = {cVar, cVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        String str2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0ba16299f7751434a9a73397f714b59b", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0ba16299f7751434a9a73397f714b59b");
        }
        if (cVar2.d != 3) {
            throw new b("操作符 in 的右操作数必须是数组, 而不是 " + cVar2.f());
        }
        if (cVar.d == 1) {
            str2 = cVar.a();
            str = null;
        } else if (cVar.d == 3) {
            List d = cVar.d();
            if (d.size() != 2) {
                throw new b("操作符 in 仅支持 item in array 和 (item, index) in array 两种格式");
            }
            Object obj = d.get(0);
            if (!(obj instanceof String)) {
                StringBuilder sb = new StringBuilder("item 的名称必须是标识符, 而不是 ");
                sb.append(obj == null ? StringUtil.NULL : obj.getClass());
                throw new b(sb.toString());
            }
            str2 = (String) obj;
            Object obj2 = d.get(1);
            if (!(obj2 instanceof String)) {
                StringBuilder sb2 = new StringBuilder("index 的名称必须是标识符, 而不是 ");
                sb2.append(obj2 == null ? StringUtil.NULL : obj2.getClass());
                throw new b(sb2.toString());
            }
            str = (String) obj2;
        } else {
            str = null;
        }
        List d2 = cVar2.d();
        if (d2.isEmpty()) {
            return c.a(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < d2.size(); i++) {
            HashMap hashMap = new HashMap();
            if (str2 != null && !str2.isEmpty()) {
                hashMap.put(str2, d2.get(i));
            }
            if (str != null && !str.isEmpty()) {
                hashMap.put(str, Long.valueOf(i));
            }
            arrayList.add(hashMap);
        }
        return c.a(arrayList);
    }

    @NonNull
    private static c b(c cVar, c cVar2) throws b {
        Object[] objArr = {cVar, cVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8950bee6c37de8260b9ab0f8dd83da22", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8950bee6c37de8260b9ab0f8dd83da22");
        }
        if ((cVar.d == 0 || cVar.d == 2 || cVar.d == 0) && (cVar2.d == 0 || cVar2.d == 2 || cVar2.d == 5)) {
            return c.a(Double.valueOf(cVar.b().doubleValue() + cVar2.b().doubleValue()));
        }
        if ((cVar.d == 1 && cVar2.d == 1) || ((cVar.d == 1 && (cVar2.d == 0 || cVar2.d == 2 || cVar2.d == 5)) || (cVar2.d == 1 && (cVar.d == 0 || cVar.d == 2 || cVar.d == 5)))) {
            return c.a(cVar.a() + cVar2.a());
        }
        throw new b("二元表达式中 + 操作符的参数必须是字符串、数字或者布尔值");
    }
}
