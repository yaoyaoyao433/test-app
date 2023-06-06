package com.sankuai.waimai.machpro.view.decoration;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private static final c f = new c(1, new int[]{0, 0}, new float[]{0.0f, 1.0f});
    int b;
    float c;
    int[] d;
    float[] e;

    private c(int i, int[] iArr, float[] fArr) {
        Object[] objArr = {Integer.valueOf(i), iArr, fArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3741a8f316c604ba890224c53326912", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3741a8f316c604ba890224c53326912");
            return;
        }
        this.b = -1;
        this.c = -1.0f;
        this.b = i;
        this.d = iArr;
        this.e = fArr;
    }

    private c(float f2, int[] iArr, float[] fArr) {
        Object[] objArr = {Float.valueOf(f2), iArr, fArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a554659e5c4f4589d766df3e44c5f40a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a554659e5c4f4589d766df3e44c5f40a");
            return;
        }
        this.b = -1;
        this.c = -1.0f;
        this.c = f2;
        this.d = iArr;
        this.e = fArr;
    }

    public static c a(String str) {
        boolean z;
        float[] fArr;
        int i = 1;
        char c = 0;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3410d0f39e498b4243e86ef66c61f9f1", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3410d0f39e498b4243e86ef66c61f9f1");
        }
        if (TextUtils.isEmpty(str)) {
            return f;
        }
        int indexOf = str.indexOf(CommonConstant.Symbol.BRACKET_LEFT);
        int indexOf2 = str.indexOf(CommonConstant.Symbol.BRACKET_RIGHT);
        if (indexOf < 0 || indexOf2 < 0) {
            return f;
        }
        try {
            String substring = str.substring(indexOf + 1, indexOf2);
            if (TextUtils.isEmpty(substring)) {
                return f;
            }
            String[] split = substring.split(CommonConstant.Symbol.COMMA);
            if (split.length < 3) {
                return f;
            }
            int i2 = 1;
            while (true) {
                if (i2 >= split.length) {
                    z = false;
                    break;
                } else if (split[i2].endsWith("%")) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (!a(split, arrayList, arrayList2, z)) {
                return f;
            }
            int[] iArr = new int[arrayList.size()];
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                iArr[i3] = ((Integer) arrayList.get(i3)).intValue();
            }
            if (z) {
                fArr = new float[arrayList2.size()];
                for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                    fArr[i4] = ((Float) arrayList2.get(i4)).floatValue();
                }
            } else {
                fArr = null;
            }
            String trim = split[0].trim();
            if (trim.contains("deg")) {
                return new c(com.sankuai.waimai.machpro.util.b.b((Object) trim.substring(0, trim.indexOf("deg"))), iArr, fArr);
            }
            Object[] objArr2 = {trim};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (!PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "284c8084d312df690ab76630eab31fec", RobustBitConfig.DEFAULT_VALUE)) {
                switch (trim.hashCode()) {
                    case -2080783504:
                        if (trim.equals("to bottom")) {
                            break;
                        }
                        c = 65535;
                        break;
                    case -1213049204:
                        if (trim.equals("to left")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -870406608:
                        if (trim.equals("to top")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case -677950924:
                        if (trim.equals("to right bottom")) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    case 926430700:
                        if (trim.equals("to right top")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1055841335:
                        if (trim.equals("to right")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1381793217:
                        if (trim.equals("to left top")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1520072255:
                        if (trim.equals("to left bottom")) {
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
                        break;
                    case 1:
                        i = 2;
                        break;
                    case 2:
                        i = 3;
                        break;
                    case 3:
                        i = 4;
                        break;
                    case 4:
                        i = 5;
                        break;
                    case 5:
                        i = 6;
                        break;
                    case 6:
                        i = 7;
                        break;
                    case 7:
                        i = 8;
                        break;
                    default:
                        i = -1;
                        break;
                }
            } else {
                i = ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "284c8084d312df690ab76630eab31fec")).intValue();
            }
            if (i == -1) {
                return f;
            }
            return new c(i, iArr, fArr);
        } catch (Exception unused) {
            return f;
        }
    }

    private static boolean a(String[] strArr, ArrayList<Integer> arrayList, ArrayList<Float> arrayList2, boolean z) {
        Object[] objArr = {strArr, arrayList, arrayList2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "933d160dec179f85085579ad3f497d38", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "933d160dec179f85085579ad3f497d38")).booleanValue();
        }
        if (!z) {
            for (int i = 1; i < strArr.length; i++) {
                int b = com.sankuai.waimai.machpro.util.b.b(strArr[i].trim());
                if (b == Integer.MAX_VALUE) {
                    return false;
                }
                arrayList.add(Integer.valueOf(b));
            }
            return true;
        }
        for (int i2 = 1; i2 < strArr.length; i2++) {
            String[] split = strArr[i2].trim().split(StringUtil.SPACE);
            int b2 = com.sankuai.waimai.machpro.util.b.b(split[0]);
            if (b2 == Integer.MAX_VALUE) {
                return false;
            }
            if (split.length == 2 && split[1].endsWith("%")) {
                float b3 = com.sankuai.waimai.machpro.util.b.b((Object) split[1].substring(0, split[1].length() - 1)) / 100.0f;
                if (i2 == 1 && b3 > 0.0f) {
                    arrayList2.add(Float.valueOf(0.0f));
                    arrayList.add(Integer.valueOf(b2));
                }
                arrayList2.add(Float.valueOf(b3));
                arrayList.add(Integer.valueOf(b2));
                if (i2 == strArr.length - 1 && b3 < 1.0f) {
                    arrayList2.add(Float.valueOf(1.0f));
                    arrayList.add(Integer.valueOf(b2));
                }
            } else {
                if (i2 == 1) {
                    arrayList2.add(Float.valueOf(0.0f));
                } else if (i2 == strArr.length - 1) {
                    arrayList2.add(Float.valueOf(1.0f));
                }
                arrayList.add(Integer.valueOf(b2));
            }
        }
        return true;
    }
}
