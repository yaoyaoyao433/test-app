package com.sankuai.waimai.machpro.animator;

import android.animation.Keyframe;
import android.text.TextUtils;
import com.dianping.picasso.view.command.AnimationViewCommandModel;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.android.recce.props.gens.BackgroundColor;
import com.meituan.android.recce.views.anim.RecceAnimUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.base.MachMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
        if (r12.equals("ease-in-out") != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.animation.TimeInterpolator a(java.lang.String r12) {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.machpro.animator.c.a
            java.lang.String r11 = "a7de274e4dab7e06422625ab66d0dcfe"
            r2 = 0
            r4 = 1
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1f
            r12 = 0
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r0, r11)
            android.animation.TimeInterpolator r12 = (android.animation.TimeInterpolator) r12
            return r12
        L1f:
            r1 = -1
            int r2 = r12.hashCode()
            r3 = -1965120668(0xffffffff8adea364, float:-2.1439283E-32)
            if (r2 == r3) goto L56
            r3 = -789192465(0xffffffffd0f5e0ef, float:-3.30012733E10)
            if (r2 == r3) goto L4c
            r3 = -361990811(0xffffffffea6c7565, float:-7.146522E25)
            if (r2 == r3) goto L43
            r0 = 3105774(0x2f63ee, float:4.352116E-39)
            if (r2 == r0) goto L39
            goto L60
        L39:
            java.lang.String r0 = "ease"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L60
            r0 = 0
            goto L61
        L43:
            java.lang.String r2 = "ease-in-out"
            boolean r12 = r12.equals(r2)
            if (r12 == 0) goto L60
            goto L61
        L4c:
            java.lang.String r0 = "ease-out"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L60
            r0 = 3
            goto L61
        L56:
            java.lang.String r0 = "ease-in"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L60
            r0 = 2
            goto L61
        L60:
            r0 = -1
        L61:
            switch(r0) {
                case 0: goto L76;
                case 1: goto L76;
                case 2: goto L70;
                case 3: goto L6a;
                default: goto L64;
            }
        L64:
            android.view.animation.LinearInterpolator r12 = new android.view.animation.LinearInterpolator
            r12.<init>()
            goto L7b
        L6a:
            android.view.animation.DecelerateInterpolator r12 = new android.view.animation.DecelerateInterpolator
            r12.<init>()
            goto L7b
        L70:
            android.view.animation.AccelerateInterpolator r12 = new android.view.animation.AccelerateInterpolator
            r12.<init>()
            goto L7b
        L76:
            android.view.animation.AccelerateDecelerateInterpolator r12 = new android.view.animation.AccelerateDecelerateInterpolator
            r12.<init>()
        L7b:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.machpro.animator.c.a(java.lang.String):android.animation.TimeInterpolator");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Map<String, Float> a(Object obj, boolean z) {
        String[] g;
        char c;
        String[] strArr;
        Object[] objArr = {obj, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a6541437f91d2af3d229a38a65b62d2a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a6541437f91d2af3d229a38a65b62d2a");
        }
        HashMap hashMap = new HashMap();
        if (obj instanceof String) {
            for (String str : g(obj.toString())) {
                if (!TextUtils.isEmpty(str)) {
                    Object[] objArr2 = {str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    String substring = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "dc1dad0ef637608f1acd683579392ff6", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "dc1dad0ef637608f1acd683579392ff6") : str.trim().substring(0, str.indexOf(CommonConstant.Symbol.BRACKET_LEFT));
                    Object[] objArr3 = {substring, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (!PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "d9673a5225deed4c0b6c36322c69dcc5", RobustBitConfig.DEFAULT_VALUE)) {
                        String trim = substring.trim();
                        switch (trim.hashCode()) {
                            case -1721943862:
                                if (trim.equals("translateX")) {
                                    c = 4;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1721943861:
                                if (trim.equals("translateY")) {
                                    c = 5;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1721943860:
                                if (trim.equals("translateZ")) {
                                    c = 6;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -925180581:
                                if (trim.equals(AnimationViewCommandModel.Rotation)) {
                                    c = 7;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -908189618:
                                if (trim.equals(RecceAnimUtils.SCALE_X)) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -908189617:
                                if (trim.equals(RecceAnimUtils.SCALE_Y)) {
                                    c = 2;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 109250890:
                                if (trim.equals("scale")) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1052832078:
                                if (trim.equals("translate")) {
                                    c = 3;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1384173149:
                                if (trim.equals(AnimationViewCommandModel.RotationX)) {
                                    c = '\t';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1384173150:
                                if (trim.equals(AnimationViewCommandModel.RotationY)) {
                                    c = '\n';
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1384173151:
                                if (trim.equals("rotateZ")) {
                                    c = '\b';
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
                                strArr = new String[]{RecceAnimUtils.SCALE_X, RecceAnimUtils.SCALE_Y};
                                break;
                            case 1:
                                strArr = new String[]{RecceAnimUtils.SCALE_X};
                                break;
                            case 2:
                                strArr = new String[]{RecceAnimUtils.SCALE_Y};
                                break;
                            case 3:
                                if (z) {
                                    strArr = new String[]{"translateX", "translateY"};
                                    break;
                                } else {
                                    strArr = new String[]{RecceAnimUtils.TRANSLATION_X, RecceAnimUtils.TRANSLATION_Y};
                                    break;
                                }
                            case 4:
                                if (z) {
                                    strArr = new String[]{"translateX"};
                                    break;
                                } else {
                                    strArr = new String[]{RecceAnimUtils.TRANSLATION_X};
                                    break;
                                }
                            case 5:
                                if (z) {
                                    strArr = new String[]{"translateY"};
                                    break;
                                } else {
                                    strArr = new String[]{RecceAnimUtils.TRANSLATION_Y};
                                    break;
                                }
                            case 6:
                                if (z) {
                                    strArr = new String[]{"translateZ"};
                                    break;
                                } else {
                                    strArr = new String[]{"translationZ"};
                                    break;
                                }
                            case 7:
                            case '\b':
                                if (z) {
                                    strArr = new String[]{AnimationViewCommandModel.RotationX, AnimationViewCommandModel.RotationY};
                                    break;
                                } else {
                                    strArr = new String[]{RecceAnimUtils.ROTATION};
                                    break;
                                }
                            case '\t':
                                if (z) {
                                    strArr = new String[]{AnimationViewCommandModel.RotationX};
                                    break;
                                } else {
                                    strArr = new String[]{RecceAnimUtils.ROTATION_X};
                                    break;
                                }
                            case '\n':
                                if (z) {
                                    strArr = new String[]{AnimationViewCommandModel.RotationY};
                                    break;
                                } else {
                                    strArr = new String[]{RecceAnimUtils.ROTATION_Y};
                                    break;
                                }
                            default:
                                strArr = null;
                                break;
                        }
                    } else {
                        strArr = (String[]) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "d9673a5225deed4c0b6c36322c69dcc5");
                    }
                    if (strArr != null) {
                        float[] a2 = a(str, substring.equals("scale"));
                        for (int i = 0; i < strArr.length; i++) {
                            hashMap.put(strArr[i], Float.valueOf(a2[i]));
                        }
                    }
                }
            }
        }
        return hashMap;
    }

    public static void a(Map<String, Object> map, Map<String, ArrayList<Keyframe>> map2, Map<String, ArrayList<Keyframe>> map3, Map<String, Object> map4) {
        float c;
        Map map5;
        Object[] objArr = {map, map2, map3, map4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0a8ca0528f53f15f085eabbb4aa67361", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0a8ca0528f53f15f085eabbb4aa67361");
            return;
        }
        boolean z = map4 == null;
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object[] objArr2 = {key};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "8ba738212e8ca2d585fe63fb78f503f6", RobustBitConfig.DEFAULT_VALUE)) {
                c = ((Float) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "8ba738212e8ca2d585fe63fb78f503f6")).floatValue();
            } else if ("from".equals(key)) {
                c = 0.0f;
            } else {
                c = RemoteMessageConst.TO.equals(key) ? 1.0f : c(key);
            }
            if (entry.getValue() instanceof MachMap) {
                map5 = com.sankuai.waimai.machpro.util.b.b((MachMap) entry.getValue());
            } else {
                map5 = (Map) entry.getValue();
            }
            for (Map.Entry entry2 : map5.entrySet()) {
                if (entry2 != null) {
                    String str = (String) entry2.getKey();
                    Object value = entry2.getValue();
                    char c2 = 65535;
                    int hashCode = str.hashCode();
                    if (hashCode != -1267206133) {
                        if (hashCode != 605322756) {
                            if (hashCode != 1052666732) {
                                if (hashCode == 1287124693 && str.equals("backgroundColor")) {
                                    c2 = 3;
                                }
                            } else if (str.equals("transform")) {
                                c2 = 0;
                            }
                        } else if (str.equals(BackgroundColor.NAME)) {
                            c2 = 2;
                        }
                    } else if (str.equals("opacity")) {
                        c2 = 1;
                    }
                    switch (c2) {
                        case 0:
                            for (Map.Entry<String, Float> entry3 : a(value, false).entrySet()) {
                                a(entry3.getKey(), Keyframe.ofFloat(c, entry3.getValue().floatValue()), map2, z);
                            }
                            break;
                        case 1:
                            a("alpha", Keyframe.ofFloat(c, com.sankuai.waimai.machpro.util.b.b((Object) value.toString())), map2, false);
                            break;
                        case 2:
                        case 3:
                            a("backgroundColor", Keyframe.ofInt(c, com.sankuai.waimai.machpro.util.b.b(value.toString())), map2, false);
                            break;
                        default:
                            if (value.toString().endsWith("%")) {
                                String str2 = str + "WithPercent";
                                String obj = value.toString();
                                Object[] objArr3 = {obj};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                a(str2, Keyframe.ofObject(c, Float.valueOf(PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "0805c800e1ad0e4c111bef06a39e5d97", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "0805c800e1ad0e4c111bef06a39e5d97")).floatValue() : com.sankuai.waimai.machpro.util.b.a(obj))), map3);
                                break;
                            } else {
                                a(str, Keyframe.ofObject(c, Float.valueOf(f(value.toString()))), map3);
                                break;
                            }
                    }
                }
            }
        }
    }

    private static void a(String str, Keyframe keyframe, Map<String, ArrayList<Keyframe>> map, boolean z) {
        Object[] objArr = {str, keyframe, map, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c91bf8f8941f672a9fbb40afa2547bf2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c91bf8f8941f672a9fbb40afa2547bf2");
        } else if (keyframe == null) {
        } else {
            ArrayList<Keyframe> arrayList = map.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                map.put(str, arrayList);
            }
            arrayList.add(keyframe);
        }
    }

    private static void a(String str, Keyframe keyframe, Map<String, ArrayList<Keyframe>> map) {
        Object[] objArr = {str, keyframe, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2f93a7fcfa88820e2c53dc44357156a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2f93a7fcfa88820e2c53dc44357156a7");
        } else if (keyframe == null) {
        } else {
            ArrayList<Keyframe> arrayList = map.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                map.put(str, arrayList);
            }
            arrayList.add(keyframe);
        }
    }

    private static float e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "db51b9945bc5805cf8ed2530bd2abd3f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "db51b9945bc5805cf8ed2530bd2abd3f")).floatValue();
        }
        if (str.endsWith("deg")) {
            return com.sankuai.waimai.machpro.util.b.b((Object) str.substring(0, str.length() - 3));
        }
        return com.sankuai.waimai.machpro.util.b.b((Object) str);
    }

    private static float f(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1bbddb6d1a6aaef11fe2cea7a9cfeb63", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1bbddb6d1a6aaef11fe2cea7a9cfeb63")).floatValue() : com.sankuai.waimai.machpro.util.b.a((Object) str);
    }

    public static long b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6dc1d9043a9eeabcd265a106202b4abf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6dc1d9043a9eeabcd265a106202b4abf")).longValue();
        }
        if (str.endsWith("ms")) {
            return com.sankuai.waimai.machpro.util.b.b((Object) str.substring(0, str.length() - 2));
        }
        if (str.endsWith("s")) {
            return com.sankuai.waimai.machpro.util.b.b((Object) str.substring(0, str.length() - 1)) * 1000.0f;
        }
        return 0L;
    }

    private static float[] a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "33b633a09e58605caec6d3efc7f228a9", RobustBitConfig.DEFAULT_VALUE)) {
            return (float[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "33b633a09e58605caec6d3efc7f228a9");
        }
        boolean contains = str.contains("translate");
        String substring = str.substring(str.indexOf(CommonConstant.Symbol.BRACKET_LEFT) + 1, str.indexOf(CommonConstant.Symbol.BRACKET_RIGHT));
        if (!substring.contains(CommonConstant.Symbol.COMMA)) {
            return z ? new float[]{e(substring), e(substring)} : contains ? new float[]{f(substring)} : new float[]{e(substring)};
        }
        String[] split = substring.split(CommonConstant.Symbol.COMMA);
        float[] fArr = new float[split.length];
        for (int i = 0; i < split.length; i++) {
            fArr[i] = contains ? f(split[i]) : e(split[i]);
        }
        return fArr;
    }

    public static float c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "10641e3a5ecb995078f990667b0a26a1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "10641e3a5ecb995078f990667b0a26a1")).floatValue();
        }
        if (str.endsWith("%")) {
            return com.sankuai.waimai.machpro.util.b.b((Object) str.substring(0, str.length() - 1)) * 0.01f;
        }
        return com.sankuai.waimai.machpro.util.b.b((Object) str);
    }

    private static String[] g(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1dc5832f3457e1d9b234dfc404eb898c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1dc5832f3457e1d9b234dfc404eb898c");
        }
        String[] split = str.trim().split("\\)");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            sb.setLength(0);
            sb.append(split[i].replace(StringUtil.SPACE, ""));
            sb.append(CommonConstant.Symbol.BRACKET_RIGHT);
            split[i] = sb.toString();
        }
        return split;
    }

    public static String[] d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5c381e14137780ccfbb1e09196e3798e", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5c381e14137780ccfbb1e09196e3798e") : str.trim().split(StringUtil.SPACE);
    }

    public static void a(Map<String, Object> map, Map<String, Object> map2, ArrayList<Map<String, Object>> arrayList, Map<String, Object> map3, Map<String, Object> map4) {
        Object[] objArr = {map, map2, arrayList, map3, map4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8f9824a8cacce1ff5c694857f34b73eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8f9824a8cacce1ff5c694857f34b73eb");
            return;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Iterator<Map<String, Object>> it = arrayList.iterator();
        while (it.hasNext()) {
            Map<String, Object> next = it.next();
            String valueOf = String.valueOf(next.get("propertyName"));
            Object obj = next.get("animation-duration");
            Object obj2 = next.get("animation-delay");
            Object obj3 = next.get("animation-timing-function");
            if (obj != null) {
                map3.put(valueOf + "#animation-duration", obj);
            }
            if (obj2 != null) {
                map3.put(valueOf + "#animation-delay", obj2);
            }
            if (obj3 != null) {
                map3.put(valueOf + "#animation-timing-function", obj3);
            }
            Object obj4 = map.get(valueOf);
            Object obj5 = map2.get(valueOf);
            if (obj4 != null) {
                hashMap.put(valueOf, obj4);
            }
            if (obj5 != null) {
                hashMap2.put(valueOf, obj5);
            }
        }
        map4.put("from", hashMap);
        map4.put(RemoteMessageConst.TO, hashMap2);
    }

    public static String a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "86b7dfc6fba1306fc1e949807c870197", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "86b7dfc6fba1306fc1e949807c870197");
        }
        Map<String, Float> a2 = a(obj, true);
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Float> entry : a2.entrySet()) {
            String key = entry.getKey();
            if (key.contains("scale")) {
                sb.append(key);
                sb.append("(1");
                sb.append(") ");
            } else {
                sb.append(key);
                sb.append("(0");
                sb.append(") ");
            }
        }
        return sb.toString();
    }
}
