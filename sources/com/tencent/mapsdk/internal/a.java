package com.tencent.mapsdk.internal;

import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.Constants;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a {
    private static ClassLoader a = null;
    private static boolean b = true;

    private static void a(boolean z, ClassLoader classLoader) {
        b = z;
        a = classLoader;
    }

    private static void a(ArrayList<String> arrayList, String str) {
        int length = str.length();
        while (str.charAt(length - 1) == '>' && length - 1 != 0) {
        }
        String substring = str.substring(0, length);
        if (substring.equals("int32")) {
            substring = Constants.LANG_INT;
        } else if (substring.equals("bool")) {
            substring = Constants.LANG_BOOLEAN;
        } else if (substring.equals(Constants.CHAR)) {
            substring = Constants.LANG_BYTE;
        } else if (substring.equals(Constants.DOUBLE)) {
            substring = Constants.LANG_DOUBLE;
        } else if (substring.equals("float")) {
            substring = Constants.LANG_FLOAT;
        } else if (substring.equals("int64")) {
            substring = Constants.LANG_LONG;
        } else if (substring.equals(Constants.SHORT)) {
            substring = Constants.LANG_SHORT;
        } else if (substring.equals("string")) {
            substring = "java.lang.String";
        } else if (substring.equals(Constants.EventInfoConsts.KEY_LX_INNER_DATAS_LIST)) {
            substring = "java.util.List";
        } else if (substring.equals("map")) {
            substring = "java.util.Map";
        }
        arrayList.add(0, substring);
    }

    private static ArrayList<String> a(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        int indexOf = str.indexOf("<");
        int i = 0;
        while (i < indexOf) {
            a(arrayList, str.substring(i, indexOf));
            i = indexOf + 1;
            indexOf = str.indexOf("<", i);
            int indexOf2 = str.indexOf(CommonConstant.Symbol.COMMA, i);
            if (indexOf == -1) {
                indexOf = indexOf2;
            }
            if (indexOf2 != -1 && indexOf2 < indexOf) {
                indexOf = indexOf2;
            }
        }
        a(arrayList, str.substring(i, str.length()));
        return arrayList;
    }

    public static String a(ArrayList<String> arrayList) {
        int i;
        int i2;
        int i3;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            String str = arrayList.get(i4);
            if (str.equals(com.meituan.robust.Constants.LANG_INT) || str.equals("int")) {
                str = "int32";
            } else if (str.equals(com.meituan.robust.Constants.LANG_BOOLEAN) || str.equals(com.meituan.robust.Constants.BOOLEAN)) {
                str = "bool";
            } else if (str.equals(com.meituan.robust.Constants.LANG_BYTE) || str.equals(com.meituan.robust.Constants.BYTE)) {
                str = com.meituan.robust.Constants.CHAR;
            } else if (str.equals(com.meituan.robust.Constants.LANG_DOUBLE) || str.equals(com.meituan.robust.Constants.DOUBLE)) {
                str = com.meituan.robust.Constants.DOUBLE;
            } else if (str.equals(com.meituan.robust.Constants.LANG_FLOAT) || str.equals("float")) {
                str = "float";
            } else if (str.equals(com.meituan.robust.Constants.LANG_LONG) || str.equals(com.meituan.robust.Constants.LONG)) {
                str = "int64";
            } else if (str.equals(com.meituan.robust.Constants.LANG_SHORT) || str.equals(com.meituan.robust.Constants.SHORT)) {
                str = com.meituan.robust.Constants.SHORT;
            } else if (str.equals("java.lang.Character")) {
                throw new IllegalArgumentException("can not support java.lang.Character");
            } else {
                if (str.equals("java.lang.String")) {
                    str = "string";
                } else if (str.equals("java.util.List")) {
                    str = Constants.EventInfoConsts.KEY_LX_INNER_DATAS_LIST;
                } else if (str.equals("java.util.Map")) {
                    str = "map";
                }
            }
            arrayList.set(i4, str);
        }
        Collections.reverse(arrayList);
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            String str2 = arrayList.get(i5);
            if (str2.equals(Constants.EventInfoConsts.KEY_LX_INNER_DATAS_LIST)) {
                arrayList.set(i5 - 1, "<" + arrayList.get(i3));
                arrayList.set(0, arrayList.get(0) + ">");
            } else if (str2.equals("map")) {
                arrayList.set(i5 - 1, "<" + arrayList.get(i2) + CommonConstant.Symbol.COMMA);
                arrayList.set(0, arrayList.get(0) + ">");
            } else if (str2.equals("Array")) {
                arrayList.set(i5 - 1, "<" + arrayList.get(i));
                arrayList.set(0, arrayList.get(0) + ">");
            }
        }
        Collections.reverse(arrayList);
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            stringBuffer.append(it.next());
        }
        return stringBuffer.toString();
    }

    private static Object b(String str, boolean z, ClassLoader classLoader) throws b {
        Class<?> cls;
        if (str.equals(com.meituan.robust.Constants.LANG_INT)) {
            return 0;
        }
        if (str.equals(com.meituan.robust.Constants.LANG_BOOLEAN)) {
            return Boolean.FALSE;
        }
        if (str.equals(com.meituan.robust.Constants.LANG_BYTE)) {
            return (byte) 0;
        }
        if (str.equals(com.meituan.robust.Constants.LANG_DOUBLE)) {
            return Double.valueOf(0.0d);
        }
        if (str.equals(com.meituan.robust.Constants.LANG_FLOAT)) {
            return Float.valueOf(0.0f);
        }
        if (str.equals(com.meituan.robust.Constants.LANG_LONG)) {
            return 0L;
        }
        if (str.equals(com.meituan.robust.Constants.LANG_SHORT)) {
            return (short) 0;
        }
        if (str.equals("java.lang.Character")) {
            throw new IllegalArgumentException("can not support java.lang.Character");
        }
        if (str.equals("java.lang.String")) {
            return "";
        }
        if (str.equals("java.util.List")) {
            return new ArrayList();
        }
        if (str.equals("java.util.Map")) {
            return new HashMap();
        }
        if (str.equals("Array")) {
            return "Array";
        }
        if (str.equals(CommonConstant.Symbol.QUESTION_MARK)) {
            return str;
        }
        try {
            if (classLoader != null) {
                cls = Class.forName(str, z, classLoader);
            } else if (a != null) {
                cls = Class.forName(str, b, a);
            } else {
                cls = Class.forName(str);
            }
            return cls.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            e.printStackTrace();
            throw new b(e);
        }
    }

    private static String b(String str) {
        if (str.equals(com.meituan.robust.Constants.LANG_INT) || str.equals("int")) {
            return "int32";
        }
        if (str.equals(com.meituan.robust.Constants.LANG_BOOLEAN) || str.equals(com.meituan.robust.Constants.BOOLEAN)) {
            return "bool";
        }
        if (str.equals(com.meituan.robust.Constants.LANG_BYTE) || str.equals(com.meituan.robust.Constants.BYTE)) {
            return com.meituan.robust.Constants.CHAR;
        }
        if (str.equals(com.meituan.robust.Constants.LANG_DOUBLE) || str.equals(com.meituan.robust.Constants.DOUBLE)) {
            return com.meituan.robust.Constants.DOUBLE;
        }
        if (str.equals(com.meituan.robust.Constants.LANG_FLOAT) || str.equals("float")) {
            return "float";
        }
        if (str.equals(com.meituan.robust.Constants.LANG_LONG) || str.equals(com.meituan.robust.Constants.LONG)) {
            return "int64";
        }
        if (str.equals(com.meituan.robust.Constants.LANG_SHORT) || str.equals(com.meituan.robust.Constants.SHORT)) {
            return com.meituan.robust.Constants.SHORT;
        }
        if (str.equals("java.lang.Character")) {
            throw new IllegalArgumentException("can not support java.lang.Character");
        }
        return str.equals("java.lang.String") ? "string" : str.equals("java.util.List") ? Constants.EventInfoConsts.KEY_LX_INNER_DATAS_LIST : str.equals("java.util.Map") ? "map" : str;
    }

    private static String c(String str) {
        return str.equals("int32") ? com.meituan.robust.Constants.LANG_INT : str.equals("bool") ? com.meituan.robust.Constants.LANG_BOOLEAN : str.equals(com.meituan.robust.Constants.CHAR) ? com.meituan.robust.Constants.LANG_BYTE : str.equals(com.meituan.robust.Constants.DOUBLE) ? com.meituan.robust.Constants.LANG_DOUBLE : str.equals("float") ? com.meituan.robust.Constants.LANG_FLOAT : str.equals("int64") ? com.meituan.robust.Constants.LANG_LONG : str.equals(com.meituan.robust.Constants.SHORT) ? com.meituan.robust.Constants.LANG_SHORT : str.equals("string") ? "java.lang.String" : str.equals(Constants.EventInfoConsts.KEY_LX_INNER_DATAS_LIST) ? "java.util.List" : str.equals("map") ? "java.util.Map" : str;
    }

    private static boolean d(String str) {
        return str.equals("int") || str.equals(com.meituan.robust.Constants.BOOLEAN) || str.equals(com.meituan.robust.Constants.BYTE) || str.equals(com.meituan.robust.Constants.DOUBLE) || str.equals("float") || str.equals(com.meituan.robust.Constants.LONG) || str.equals(com.meituan.robust.Constants.SHORT) || str.equals(com.meituan.robust.Constants.CHAR) || str.equals("Integer") || str.equals("Boolean") || str.equals("Byte") || str.equals("Double") || str.equals("Float") || str.equals("Long") || str.equals("Short") || str.equals("Char");
    }

    private static String e(String str) {
        return str.equals("int") ? "Integer" : str.equals(com.meituan.robust.Constants.BOOLEAN) ? "Boolean" : str.equals(com.meituan.robust.Constants.BYTE) ? "Byte" : str.equals(com.meituan.robust.Constants.DOUBLE) ? "Double" : str.equals("float") ? "Float" : str.equals(com.meituan.robust.Constants.LONG) ? "Long" : str.equals(com.meituan.robust.Constants.SHORT) ? "Short" : str.equals(com.meituan.robust.Constants.CHAR) ? com.meituan.robust.Constants.LANG_CHARACTER : str;
    }

    private static String a(String str, String str2) {
        if (str2.equals("int")) {
            return str2 + StringUtil.SPACE + str + "=0 ;\n";
        } else if (str2.equals(com.meituan.robust.Constants.BOOLEAN)) {
            return str2 + StringUtil.SPACE + str + "=false ;\n";
        } else if (str2.equals(com.meituan.robust.Constants.BYTE)) {
            return str2 + StringUtil.SPACE + str + " ;\n";
        } else if (str2.equals(com.meituan.robust.Constants.DOUBLE)) {
            return str2 + StringUtil.SPACE + str + "=0 ;\n";
        } else if (str2.equals("float")) {
            return str2 + StringUtil.SPACE + str + "=0 ;\n";
        } else if (str2.equals(com.meituan.robust.Constants.LONG)) {
            return str2 + StringUtil.SPACE + str + "=0 ;\n";
        } else if (str2.equals(com.meituan.robust.Constants.SHORT)) {
            return str2 + StringUtil.SPACE + str + "=0 ;\n";
        } else if (str2.equals(com.meituan.robust.Constants.CHAR)) {
            return str2 + StringUtil.SPACE + str + " ;\n";
        } else {
            return str2 + StringUtil.SPACE + str + " = null ;\n";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0072, code lost:
        if (r3 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
        r4 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ae, code lost:
        if (r3 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b0, code lost:
        r3 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(java.lang.String r7, boolean r8, java.lang.ClassLoader r9) throws com.tencent.mapsdk.internal.b {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "<"
            int r1 = r7.indexOf(r1)
            r2 = 0
            r3 = r1
            r1 = 0
        Le:
            if (r1 >= r3) goto L2f
            java.lang.String r1 = r7.substring(r1, r3)
            a(r0, r1)
            int r1 = r3 + 1
            java.lang.String r3 = "<"
            int r3 = r7.indexOf(r3, r1)
            java.lang.String r4 = ","
            int r4 = r7.indexOf(r4, r1)
            r5 = -1
            if (r3 != r5) goto L29
            r3 = r4
        L29:
            if (r4 == r5) goto Le
            if (r4 >= r3) goto Le
            r3 = r4
            goto Le
        L2f:
            int r3 = r7.length()
            java.lang.String r7 = r7.substring(r1, r3)
            a(r0, r7)
            java.util.Iterator r7 = r0.iterator()
            r0 = 0
            r1 = r0
            r3 = r1
        L41:
            r4 = r3
        L42:
            boolean r5 = r7.hasNext()
            if (r5 == 0) goto Lb2
            java.lang.Object r1 = r7.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = b(r1, r8, r9)
            boolean r5 = r1 instanceof java.lang.String
            if (r5 == 0) goto L77
            java.lang.String r5 = "Array"
            r6 = r1
            java.lang.String r6 = (java.lang.String) r6
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L6a
            if (r3 != 0) goto L42
            java.lang.Class<java.lang.Byte> r1 = java.lang.Byte.class
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r2)
            goto L42
        L6a:
            java.lang.String r5 = "?"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L42
            if (r3 != 0) goto L75
            goto Lb0
        L75:
            r4 = r3
            goto Lb0
        L77:
            boolean r5 = r1 instanceof java.util.List
            r6 = 1
            if (r5 == 0) goto L96
            if (r3 == 0) goto L8c
            boolean r5 = r3 instanceof java.lang.Byte
            if (r5 == 0) goto L8c
            java.lang.Class<java.lang.Byte> r1 = java.lang.Byte.class
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r6)
            java.lang.reflect.Array.set(r1, r2, r3)
            goto L42
        L8c:
            if (r3 == 0) goto L94
            r5 = r1
            java.util.List r5 = (java.util.List) r5
            r5.add(r3)
        L94:
            r3 = r0
            goto L42
        L96:
            boolean r5 = r1 instanceof java.util.Map
            if (r5 == 0) goto Lae
            if (r3 == 0) goto L9e
            r5 = 1
            goto L9f
        L9e:
            r5 = 0
        L9f:
            if (r4 == 0) goto La2
            goto La3
        La2:
            r6 = 0
        La3:
            r5 = r5 & r6
            if (r5 == 0) goto Lac
            r5 = r1
            java.util.Map r5 = (java.util.Map) r5
            r5.put(r3, r4)
        Lac:
            r3 = r0
            goto L41
        Lae:
            if (r3 != 0) goto L75
        Lb0:
            r3 = r1
            goto L42
        Lb2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.a.a(java.lang.String, boolean, java.lang.ClassLoader):java.lang.Object");
    }
}
