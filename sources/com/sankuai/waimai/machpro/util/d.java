package com.sankuai.waimai.machpro.util;

import android.text.TextUtils;
import com.facebook.yoga.YogaEdge;
import com.facebook.yoga.YogaUnit;
import com.meituan.android.recce.props.gens.AlignContent;
import com.meituan.android.recce.props.gens.AlignItems;
import com.meituan.android.recce.props.gens.AlignSelf;
import com.meituan.android.recce.props.gens.AspectRatio;
import com.meituan.android.recce.props.gens.FlexBasis;
import com.meituan.android.recce.props.gens.FlexDirection;
import com.meituan.android.recce.props.gens.FlexGrow;
import com.meituan.android.recce.props.gens.FlexShrink;
import com.meituan.android.recce.props.gens.FlexWrap;
import com.meituan.android.recce.props.gens.JustifyContent;
import com.meituan.android.recce.props.gens.MarginBottom;
import com.meituan.android.recce.props.gens.MarginLeft;
import com.meituan.android.recce.props.gens.MarginRight;
import com.meituan.android.recce.props.gens.MarginTop;
import com.meituan.android.recce.props.gens.MaxHeight;
import com.meituan.android.recce.props.gens.MaxWidth;
import com.meituan.android.recce.props.gens.MinHeight;
import com.meituan.android.recce.props.gens.MinWidth;
import com.meituan.android.recce.props.gens.PaddingBottom;
import com.meituan.android.recce.props.gens.PaddingLeft;
import com.meituan.android.recce.props.gens.PaddingRight;
import com.meituan.android.recce.props.gens.PaddingTop;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a;
    private static Set<String> b;

    static {
        HashSet hashSet = new HashSet();
        b = hashSet;
        hashSet.add("width");
        b.add("height");
        b.add("margin");
        b.add(MarginTop.NAME);
        b.add(MarginBottom.NAME);
        b.add(MarginLeft.NAME);
        b.add(MarginRight.NAME);
        b.add("padding");
        b.add(PaddingTop.NAME);
        b.add(PaddingBottom.NAME);
        b.add(PaddingLeft.NAME);
        b.add(PaddingRight.NAME);
        b.add(FlexDirection.NAME);
        b.add(JustifyContent.NAME);
        b.add(AlignItems.NAME);
        b.add(AlignContent.NAME);
        b.add(FlexGrow.NAME);
        b.add(FlexShrink.NAME);
        b.add(MaxWidth.NAME);
        b.add(MinWidth.NAME);
        b.add(MaxHeight.NAME);
        b.add(MinHeight.NAME);
        b.add("position");
        b.add(FlexWrap.NAME);
        b.add(FlexBasis.NAME);
        b.add(AlignSelf.NAME);
        b.add(AspectRatio.NAME);
        b.add("top");
        b.add("bottom");
        b.add("left");
        b.add("right");
        b.add("flex");
    }

    public static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "026135f56762bd2ef9c218b5ac932613", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "026135f56762bd2ef9c218b5ac932613")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return b.contains(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0268, code lost:
        if (r28.equals("nowrap") != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0361, code lost:
        if (r28.equals("flex-end") == false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x03d1, code lost:
        if (r28.equals("flex-end") != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x048b, code lost:
        if (r28.equals("flex-end") != false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x0542, code lost:
        if (r28.equals("flex-end") != false) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x05f8, code lost:
        if (r28.equals("row-reverse") != false) goto L275;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(com.facebook.yoga.d r26, java.lang.String r27, java.lang.String r28) {
        /*
            Method dump skipped, instructions count: 2460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.machpro.util.d.a(com.facebook.yoga.d, java.lang.String, java.lang.String):void");
    }

    private static void a(com.facebook.yoga.d dVar, YogaEdge yogaEdge, String str) {
        Object[] objArr = {dVar, yogaEdge, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b33102e321324c6aeb1e35e657b0ed73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b33102e321324c6aeb1e35e657b0ed73");
        } else if (str.endsWith("%")) {
            dVar.g(yogaEdge, b.a(str));
        } else {
            dVar.f(yogaEdge, b.a((Object) str));
        }
    }

    private static void b(com.facebook.yoga.d dVar, YogaEdge yogaEdge, String str) {
        Object[] objArr = {dVar, yogaEdge, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b0681b75fad10078632ef51758b1670d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b0681b75fad10078632ef51758b1670d");
        } else if (str.endsWith("%")) {
            dVar.b(yogaEdge, b.a(str));
        } else {
            dVar.a(yogaEdge, b.a((Object) str));
        }
    }

    private static void c(com.facebook.yoga.d dVar, YogaEdge yogaEdge, String str) {
        Object[] objArr = {dVar, yogaEdge, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eb005aa1a2f1353c90110863304132b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eb005aa1a2f1353c90110863304132b8");
        } else if (str.endsWith("%")) {
            dVar.d(yogaEdge, b.a(str));
        } else {
            dVar.c(yogaEdge, b.a((Object) str));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void a(com.facebook.yoga.d dVar, float f, String str) {
        char c;
        Object[] objArr = {dVar, Float.valueOf(f), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a0f757135950c602764a7b619b82908a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a0f757135950c602764a7b619b82908a");
        } else if (dVar == null || dVar.d() == null) {
        } else {
            com.facebook.yoga.d d = dVar.d();
            switch (str.hashCode()) {
                case -1383228885:
                    if (str.equals("bottom")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -1221029593:
                    if (str.equals("height")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -887955139:
                    if (str.equals(MarginRight.NAME)) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 115029:
                    if (str.equals("top")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 3317767:
                    if (str.equals("left")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 108511772:
                    if (str.equals("right")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 113126854:
                    if (str.equals("width")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 941004998:
                    if (str.equals(MarginLeft.NAME)) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 1970025654:
                    if (str.equals(MarginTop.NAME)) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 2086035242:
                    if (str.equals(MarginBottom.NAME)) {
                        c = '\t';
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
                    if (d.m().e == YogaUnit.PERCENT) {
                        dVar.g((d.m().d * f) / 100.0f);
                        return;
                    } else if (d.m().e == YogaUnit.POINT) {
                        dVar.f((d.m().d * f) / 100.0f);
                        return;
                    } else {
                        return;
                    }
                case 1:
                    if (d.o().e == YogaUnit.PERCENT) {
                        dVar.i((d.o().d * f) / 100.0f);
                        return;
                    } else if (d.o().e == YogaUnit.POINT) {
                        dVar.h((d.o().d * f) / 100.0f);
                        return;
                    } else {
                        return;
                    }
                case 2:
                    if (d.m().e == YogaUnit.PERCENT) {
                        dVar.g(YogaEdge.LEFT, (d.m().d * f) / 100.0f);
                        return;
                    } else if (d.m().e == YogaUnit.POINT) {
                        dVar.f(YogaEdge.LEFT, (d.m().d * f) / 100.0f);
                        return;
                    } else {
                        return;
                    }
                case 3:
                    if (d.m().e == YogaUnit.PERCENT) {
                        dVar.g(YogaEdge.RIGHT, (d.m().d * f) / 100.0f);
                        return;
                    } else if (d.m().e == YogaUnit.POINT) {
                        dVar.f(YogaEdge.RIGHT, (d.m().d * f) / 100.0f);
                        return;
                    } else {
                        return;
                    }
                case 4:
                    if (d.o().e == YogaUnit.PERCENT) {
                        dVar.g(YogaEdge.TOP, (d.o().d * f) / 100.0f);
                        return;
                    } else if (d.o().e == YogaUnit.POINT) {
                        dVar.f(YogaEdge.TOP, (d.o().d * f) / 100.0f);
                        return;
                    } else {
                        return;
                    }
                case 5:
                    if (d.o().e == YogaUnit.PERCENT) {
                        dVar.g(YogaEdge.BOTTOM, (d.o().d * f) / 100.0f);
                        return;
                    } else if (d.o().e == YogaUnit.POINT) {
                        dVar.f(YogaEdge.BOTTOM, (d.o().d * f) / 100.0f);
                        return;
                    } else {
                        return;
                    }
                case 6:
                    if (d.m().e == YogaUnit.PERCENT) {
                        dVar.b(YogaEdge.LEFT, (d.m().d * f) / 100.0f);
                        return;
                    } else if (d.m().e == YogaUnit.POINT) {
                        dVar.a(YogaEdge.LEFT, (d.m().d * f) / 100.0f);
                        return;
                    } else {
                        return;
                    }
                case 7:
                    if (d.m().e == YogaUnit.PERCENT) {
                        dVar.b(YogaEdge.RIGHT, (d.m().d * f) / 100.0f);
                        return;
                    } else if (d.m().e == YogaUnit.POINT) {
                        dVar.a(YogaEdge.RIGHT, (d.m().d * f) / 100.0f);
                        return;
                    } else {
                        return;
                    }
                case '\b':
                    if (d.o().e == YogaUnit.PERCENT) {
                        dVar.b(YogaEdge.TOP, (d.o().d * f) / 100.0f);
                        return;
                    } else if (d.o().e == YogaUnit.POINT) {
                        dVar.a(YogaEdge.TOP, (d.o().d * f) / 100.0f);
                        return;
                    } else {
                        return;
                    }
                case '\t':
                    if (d.o().e == YogaUnit.PERCENT) {
                        dVar.b(YogaEdge.BOTTOM, (d.o().d * f) / 100.0f);
                        return;
                    } else if (d.o().e == YogaUnit.POINT) {
                        dVar.a(YogaEdge.BOTTOM, (d.o().d * f) / 100.0f);
                        return;
                    } else {
                        return;
                    }
                default:
                    return;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x014d, code lost:
        if (r14.equals("margin") != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(com.facebook.yoga.d r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 826
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.machpro.util.d.a(com.facebook.yoga.d, java.lang.String):void");
    }
}
