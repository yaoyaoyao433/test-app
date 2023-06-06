package com.sankuai.waimai.mach.model.value;

import android.graphics.Typeface;
import android.widget.TextView;
import com.dianping.titans.widget.DynamicTitleParser;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.common.DevSettings;
import com.sankuai.waimai.mach.m;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum h {
    normal("normal", 0),
    bold(DynamicTitleParser.PARSER_VAL_FONT_STYLE_BOLD, 1),
    italic(DynamicTitleParser.PARSER_VAL_FONT_STYLE_ITALIC, 2),
    bold_italic("bold_italic", 3);
    
    public static ChangeQuickRedirect a;
    private static TextView h;
    public String f;
    public int g;

    public static h valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "797efa975947e53fa4686e0e05cc3a2c", RobustBitConfig.DEFAULT_VALUE) ? (h) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "797efa975947e53fa4686e0e05cc3a2c") : (h) Enum.valueOf(h.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static h[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4dd60d3621a6e7dd141d63155f47966c", RobustBitConfig.DEFAULT_VALUE) ? (h[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4dd60d3621a6e7dd141d63155f47966c") : (h[]) values().clone();
    }

    h(String str, int i2) {
        Object[] objArr = {r10, Integer.valueOf(r11), str, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08ef12968718b2b2861dacbe25cd50b5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08ef12968718b2b2861dacbe25cd50b5");
            return;
        }
        this.f = str;
        this.g = i2;
    }

    public static Typeface a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f8c3a28d7912ac0ad54420b48d184999", RobustBitConfig.DEFAULT_VALUE)) {
            return (Typeface) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f8c3a28d7912ac0ad54420b48d184999");
        }
        if (str == null) {
            str = "normal";
        }
        if (str2 == null) {
            str2 = "normal";
        }
        if ("medium".equals(str2)) {
            str2 = DynamicTitleParser.PARSER_VAL_FONT_STYLE_BOLD;
        }
        if ("normal".equals(str) && "normal".equals(str2)) {
            return a(normal);
        }
        if (DynamicTitleParser.PARSER_VAL_FONT_STYLE_ITALIC.equals(str) && "normal".equals(str2)) {
            return a(italic);
        }
        if ("normal".equals(str) && DynamicTitleParser.PARSER_VAL_FONT_STYLE_BOLD.equals(str2)) {
            return a(bold);
        }
        if (DynamicTitleParser.PARSER_VAL_FONT_STYLE_ITALIC.equals(str) && DynamicTitleParser.PARSER_VAL_FONT_STYLE_BOLD.equals(str2)) {
            return a(bold_italic);
        }
        return a(normal);
    }

    public static Typeface a(Typeface typeface) {
        Object[] objArr = {typeface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8de5d97d31538c73b618c0d8dc991acb", RobustBitConfig.DEFAULT_VALUE)) {
            return (Typeface) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8de5d97d31538c73b618c0d8dc991acb");
        }
        TextView a2 = a();
        if (a2 != null) {
            a2.setTypeface(typeface);
            return a2.getTypeface();
        }
        return typeface;
    }

    private static Typeface a(h hVar) {
        boolean z = true;
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0c0b569d7f9f90a53343e1fb312f358e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Typeface) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0c0b569d7f9f90a53343e1fb312f358e");
        }
        Typeface defaultFromStyle = Typeface.defaultFromStyle(hVar.g);
        DevSettings devSettings = com.sankuai.waimai.mach.common.i.a().f;
        z = (devSettings == null || !devSettings.k) ? false : false;
        if (!m.l() && z) {
            if (com.sankuai.waimai.mach.common.i.a().h()) {
                com.sankuai.waimai.mach.log.b.a("Mach-Text-Face", "TextTypeFace Horn开关打开", new Object[0]);
                return defaultFromStyle;
            }
            return defaultFromStyle;
        } else if (m.k() && z) {
            if (com.sankuai.waimai.mach.common.i.a().h()) {
                com.sankuai.waimai.mach.log.b.a("Mach-Text-Face", "TextTypeFace Horn开关打开", new Object[0]);
                return defaultFromStyle;
            }
            return defaultFromStyle;
        } else {
            if (h != null) {
                h.setTypeface(defaultFromStyle);
                defaultFromStyle = h.getTypeface();
            }
            TextView a2 = a();
            if (a2 != null) {
                a2.setTypeface(defaultFromStyle);
                return a2.getTypeface();
            }
            return defaultFromStyle;
        }
    }

    private static TextView a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "810a5698c9356c5b9c831afa50a72b10", RobustBitConfig.DEFAULT_VALUE)) {
            return (TextView) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "810a5698c9356c5b9c831afa50a72b10");
        }
        if (h == null) {
            synchronized (h.class) {
                if (h == null) {
                    h = new TextView(Mach.getContext());
                }
            }
        }
        return h;
    }
}
