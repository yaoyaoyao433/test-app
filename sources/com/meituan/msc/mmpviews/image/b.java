package com.meituan.msc.mmpviews.image;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.math.BigDecimal;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public enum b {
    scaleToFill("scaleToFill"),
    aspectFit("aspectFit"),
    aspectFill("aspectFill"),
    widthFix("widthFix"),
    heightFix("heightFix"),
    top("top"),
    bottom("bottom"),
    center("center"),
    left("left"),
    right("right"),
    topleft("topleft"),
    topright("topright"),
    bottomleft("bottomleft"),
    bottomright("bottomright");
    
    public static ChangeQuickRedirect a;
    private String p;

    public static b valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f2e7a8a482f8ee0a6e5a131ba5b29d7f", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f2e7a8a482f8ee0a6e5a131ba5b29d7f") : (b) Enum.valueOf(b.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static b[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bb649afff1f2a1ed493aa00d6a068083", RobustBitConfig.DEFAULT_VALUE) ? (b[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bb649afff1f2a1ed493aa00d6a068083") : (b[]) values().clone();
    }

    b(String str) {
        Object[] objArr = {r10, Integer.valueOf(r11), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "445cb7895892c67f69066cfec02b433c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "445cb7895892c67f69066cfec02b433c");
        } else {
            this.p = str;
        }
    }

    public static b a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bf59f0292e890d826042c9a66e2b233b", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bf59f0292e890d826042c9a66e2b233b");
        }
        try {
            return valueOf(str);
        } catch (Throwable th) {
            th.printStackTrace();
            return scaleToFill;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x008a, code lost:
        if (a(r11, r11) == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0096, code lost:
        if (a(r11, r11) == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0099, code lost:
        r12 = 0.0f;
        r2 = r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.meituan.msc.mmpviews.image.b.a a(com.meituan.msc.mmpviews.image.b r11, int r12, int r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.mmpviews.image.b.a(com.meituan.msc.mmpviews.image.b, int, int, int, int):com.meituan.msc.mmpviews.image.b$a");
    }

    private static boolean a(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "10972a9dac0ef78f36561b799010b7a7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "10972a9dac0ef78f36561b799010b7a7")).booleanValue() : !(BigDecimal.valueOf((double) f).compareTo(BigDecimal.valueOf(1.0d)) == 0 && BigDecimal.valueOf((double) f2).compareTo(BigDecimal.valueOf(1.0d)) == 0) && f > 0.0f && f2 > 0.0f;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public float a;
        public float b;
        public int c;
        public int d;

        public a(float f, float f2, int i, int i2) {
            this.a = 1.0f;
            this.b = 1.0f;
            this.c = 0;
            this.d = 0;
            this.a = f;
            this.b = f2;
            this.c = i;
            this.d = i2;
        }
    }
}
