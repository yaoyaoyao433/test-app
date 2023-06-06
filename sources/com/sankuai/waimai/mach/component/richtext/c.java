package com.sankuai.waimai.mach.component.richtext;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Html;
import android.text.Layout;
import android.text.TextUtils;
import android.widget.TextView;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.d;
import com.meituan.android.recce.props.gens.EllipsizeMode;
import com.meituan.android.recce.props.gens.FontSize;
import com.meituan.android.recce.props.gens.FontStyle;
import com.meituan.android.recce.props.gens.FontWeight;
import com.meituan.android.recce.props.gens.NumberOfLines;
import com.meituan.android.recce.props.gens.TextAlign;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.j;
import com.sankuai.waimai.mach.m;
import com.sankuai.waimai.mach.model.value.h;
import com.sankuai.waimai.mach.model.value.k;
import com.sankuai.waimai.mach.text.SizeSpec;
import com.sankuai.waimai.mach.utils.g;
import com.sankuai.waimai.mach.utils.i;
import com.sankuai.waimai.mach.widget.e;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends com.sankuai.waimai.mach.component.base.a<e> implements YogaMeasureFunction {
    public static ChangeQuickRedirect a;
    private String b;
    private String[] c;
    private Layout d;
    private int e;
    private int f;
    private String g;
    private String h;
    private String i;
    private k j;
    private k k;
    private float r;
    private Integer s;
    private com.sankuai.waimai.mach.model.value.b t;
    private String u;
    private int v;
    private float w;
    private e x;

    @Override // com.sankuai.waimai.mach.component.base.a
    public final /* synthetic */ void a(e eVar) {
        e eVar2 = eVar;
        Object[] objArr = {eVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d46607b63a85329da4c7a3dc0b5c9c26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d46607b63a85329da4c7a3dc0b5c9c26");
            return;
        }
        super.a((c) eVar2);
        this.x = eVar2;
        a((TextView) this.x);
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    @NonNull
    public final /* synthetic */ e b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8416d85760bf443001f8c361395bb3b3", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8416d85760bf443001f8c361395bb3b3") : new e(context);
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final void a() {
        String b;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6603cf29355838cb37abb4eeab49e538", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6603cf29355838cb37abb4eeab49e538");
            return;
        }
        ac_().a((YogaMeasureFunction) this);
        String b2 = b("text-decoration");
        if (i(b2)) {
            this.c = b2.split("\\s+");
        }
        String a2 = a("content");
        if (i(a2)) {
            this.b = a2;
        }
        String b3 = b("color");
        if (i(b3)) {
            this.e = h(b3);
        } else {
            this.e = -16777216;
        }
        String b4 = b(FontSize.NAME);
        if (i(b4)) {
            this.f = (int) i.c(b4);
        } else {
            this.f = (int) i.c("12dp");
        }
        String b5 = b(FontStyle.NAME);
        if (i(b5)) {
            this.g = b5;
        }
        String b6 = b(FontWeight.NAME);
        if (i(b6)) {
            this.i = b6;
        }
        String b7 = b("font-family");
        if (i(b7)) {
            this.h = b7;
        }
        String b8 = b(TextAlign.NAME);
        if (i(b8)) {
            this.j = k.a(b8);
        }
        String b9 = b("text-align-vertical");
        if (i(b9)) {
            if (b9.equals("center")) {
                b9 = b9 + "-vertical";
            }
            this.k = k.a(b9);
        } else {
            this.k = k.a("center-vertical");
        }
        String b10 = b("text-letter-spacing");
        if (i(b10)) {
            this.r = i.c(b10) > 0.0f ? i.c(b10) : 0.0f;
        }
        String b11 = b(NumberOfLines.NAME);
        if (i(b11)) {
            this.s = Integer.valueOf((int) g.a(b11));
        } else {
            this.s = 1;
        }
        String b12 = b(EllipsizeMode.NAME);
        if (i(b12)) {
            this.t = com.sankuai.waimai.mach.model.value.b.a(b12);
        } else {
            this.t = com.sankuai.waimai.mach.model.value.b.a("tail");
        }
        String a3 = a("time-format");
        if (i(a3)) {
            this.u = a3;
            if (com.sankuai.waimai.mach.utils.e.a(a2)) {
                Object[] objArr2 = {a3};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                this.b = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5ccbb97a46ecc08488b0b3c6d3f697fa", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5ccbb97a46ecc08488b0b3c6d3f697fa") : a3.replaceAll("[yMdHms]", "0");
            }
        }
        String b13 = b("text-indent");
        if (i(b13)) {
            this.v = (int) i.c(b13);
        } else {
            this.v = 0;
        }
        if (i(b("text-line-height"))) {
            this.w = (int) i.c(b);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b0, code lost:
        if (r1.equals(com.dianping.titans.widget.DynamicTitleParser.PARSER_VAL_FONT_STYLE_LINE_THROUGH) != false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(android.widget.TextView r13) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.mach.component.richtext.c.a(android.widget.TextView):void");
    }

    @Nullable
    private Typeface j(String str) {
        j themeProvider;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4e992e02585f6197bf377795e3871a4", RobustBitConfig.DEFAULT_VALUE)) {
            return (Typeface) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4e992e02585f6197bf377795e3871a4");
        }
        if (str == null || "".equals(str) || (themeProvider = this.m.getThemeProvider()) == null) {
            return null;
        }
        return themeProvider.a(str);
    }

    @Override // com.facebook.yoga.YogaMeasureFunction
    public final long measure(d dVar, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
        int i;
        int i2;
        int measuredWidth;
        int measuredHeight;
        Object[] objArr = {dVar, Float.valueOf(f), yogaMeasureMode, Float.valueOf(f2), yogaMeasureMode2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35686b2c2c73c2886b7731003733c16f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35686b2c2c73c2886b7731003733c16f")).longValue();
        }
        if (!TextUtils.isEmpty(this.b)) {
            if (m.n()) {
                int a2 = SizeSpec.a(f, yogaMeasureMode);
                int a3 = SizeSpec.a(f2, yogaMeasureMode2);
                try {
                    synchronized (this.m) {
                        TextView b = this.m.getTextMeasureHelper().b();
                        a(b);
                        b.measure(a2, a3);
                        measuredWidth = b.getMeasuredWidth();
                        measuredHeight = b.getMeasuredHeight();
                        com.sankuai.waimai.mach.text.c textMeasureHelper = this.m.getTextMeasureHelper();
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.mach.text.c.a;
                        if (PatchProxy.isSupport(objArr2, textMeasureHelper, changeQuickRedirect2, false, "2894bf46b7b760828aba0bb083945d95", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, textMeasureHelper, changeQuickRedirect2, false, "2894bf46b7b760828aba0bb083945d95");
                        } else {
                            if (textMeasureHelper.e == null) {
                                textMeasureHelper.e = new TextView(Mach.getContext());
                            }
                            textMeasureHelper.d.setText((CharSequence) null);
                            textMeasureHelper.d.setTextSize(0, textMeasureHelper.e.getTextSize());
                            textMeasureHelper.d.setGravity(textMeasureHelper.e.getGravity());
                            textMeasureHelper.d.setMaxLines(textMeasureHelper.e.getMaxLines());
                            textMeasureHelper.d.setTypeface(textMeasureHelper.e.getTypeface());
                            textMeasureHelper.d.setPaintFlags(textMeasureHelper.e.getPaintFlags());
                            textMeasureHelper.d.setEllipsize(textMeasureHelper.e.getEllipsize());
                            if (Build.VERSION.SDK_INT >= 21) {
                                textMeasureHelper.d.setLetterSpacing(textMeasureHelper.e.getLetterSpacing());
                            }
                        }
                    }
                    i = measuredWidth;
                    i2 = measuredHeight;
                } catch (Exception unused) {
                    com.sankuai.waimai.mach.text.a a4 = a(f, yogaMeasureMode, f2, yogaMeasureMode2);
                    i = a4.a;
                    i2 = a4.b;
                }
            } else {
                com.sankuai.waimai.mach.text.a a5 = a(f, yogaMeasureMode, f2, yogaMeasureMode2);
                i = a5.a;
                i2 = a5.b;
            }
            return com.facebook.yoga.c.a(i, i2);
        }
        float f3 = 0;
        return com.facebook.yoga.c.a(f3, f3);
    }

    private com.sankuai.waimai.mach.text.a a(float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
        int style;
        Typeface a2;
        Object[] objArr = {Float.valueOf(f), yogaMeasureMode, Float.valueOf(f2), yogaMeasureMode2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "800f35490eaf9f13c04e661bdd9ea3db", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.mach.text.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "800f35490eaf9f13c04e661bdd9ea3db");
        }
        int intValue = this.s == null ? Integer.MAX_VALUE : this.s.intValue();
        TextUtils.TruncateAt truncateAt = this.t != null ? this.t.f : null;
        int a3 = SizeSpec.a(f, yogaMeasureMode);
        int a4 = SizeSpec.a(f2, yogaMeasureMode2);
        Typeface a5 = h.a(com.sankuai.waimai.mach.text.d.b);
        if (a5 == null) {
            style = com.sankuai.waimai.mach.text.d.b.getStyle();
        } else {
            style = a5.getStyle();
        }
        int i = style;
        Typeface j = j(this.h);
        if (j == null && (this.g != null || this.i != null)) {
            a2 = h.a(this.g, this.i);
        } else {
            a2 = h.a(j);
        }
        Typeface typeface = a2;
        boolean z = intValue == 1;
        com.sankuai.waimai.mach.text.a aVar = new com.sankuai.waimai.mach.text.a();
        this.d = com.sankuai.waimai.mach.text.d.a(Mach.getContext(), a3, a4, aVar, Html.fromHtml(this.b), truncateAt, true, 1, intValue, -1, -1, 0, Integer.MAX_VALUE, 0.0f, 0.0f, 0.0f, -7829368, z, this.e, com.sankuai.waimai.mach.text.d.c, 0, this.f, this.w, 0.0f, 1.0f, this.r, i, typeface, com.sankuai.waimai.mach.text.b.TEXT_START, 0, 0, 0, ac_().u(), null, false, 0, this.v);
        return aVar;
    }
}
