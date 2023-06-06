package com.sankuai.waimai.mach.component;

import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.text.TextUtils;
import android.widget.TextView;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
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
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class e extends com.sankuai.waimai.mach.component.base.a<com.sankuai.waimai.mach.widget.e> implements YogaMeasureFunction {
    public static ChangeQuickRedirect a;
    protected String b;
    public String c;
    protected com.sankuai.waimai.mach.widget.e d;
    private String[] e;
    private Layout f;
    private int g;
    private int h;
    private String i;
    private String j;
    private String k;
    private k r;
    private k s;
    private float t;
    private Integer u;
    private com.sankuai.waimai.mach.model.value.b v;
    private int w;
    private float x;

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d11f2e86ff5e9d83e31c23634a81a8b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d11f2e86ff5e9d83e31c23634a81a8b");
            return;
        }
        this.g = -16777216;
        this.h = (int) i.c("12dp");
        this.s = k.a("center-vertical");
        this.u = 1;
        this.v = com.sankuai.waimai.mach.model.value.b.a("tail");
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    @NonNull
    public final /* synthetic */ com.sankuai.waimai.mach.widget.e b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "796a13e75ba4aaf2f537ed1a658ca7d3", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.mach.widget.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "796a13e75ba4aaf2f537ed1a658ca7d3") : new com.sankuai.waimai.mach.widget.e(context);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.sankuai.waimai.mach.component.base.a
    public void a() {
        char c;
        String replaceAll;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e69eab64d5970525a146013d35648d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e69eab64d5970525a146013d35648d7");
            return;
        }
        ac_().a((YogaMeasureFunction) this);
        String a2 = a("content");
        if (i(a2)) {
            this.b = a2;
        }
        String a3 = a("time-format");
        if (i(a3)) {
            this.c = a3;
            if (com.sankuai.waimai.mach.utils.e.a(a2)) {
                Object[] objArr2 = {a3};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f07d43f603a95ceed4906aef27313fb8", RobustBitConfig.DEFAULT_VALUE)) {
                    replaceAll = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f07d43f603a95ceed4906aef27313fb8");
                } else {
                    replaceAll = "HHH".equals(a3) ? "00" : a3.replaceAll("[yMdHms]", "0");
                }
                this.b = replaceAll;
            }
        }
        Map<String, Object> l = l();
        if (l == null || l.isEmpty()) {
            return;
        }
        for (Map.Entry<String, Object> entry : l.entrySet()) {
            Object[] objArr3 = {entry};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c745fcfa5d27a6ac779ab504d8f1074f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c745fcfa5d27a6ac779ab504d8f1074f");
            } else {
                String key = entry.getKey();
                String obj = entry.getValue() == null ? "" : entry.getValue().toString();
                switch (key.hashCode()) {
                    case -1923578189:
                        if (key.equals(FontStyle.NAME)) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1586082113:
                        if (key.equals(FontSize.NAME)) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1362940800:
                        if (key.equals("text-line-height")) {
                            c = '\f';
                            break;
                        }
                        c = 65535;
                        break;
                    case 94842723:
                        if (key.equals("color")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 108532386:
                        if (key.equals("font-family")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case 125841635:
                        if (key.equals(EllipsizeMode.NAME)) {
                            c = '\n';
                            break;
                        }
                        c = 65535;
                        break;
                    case 428355132:
                        if (key.equals("text-letter-spacing")) {
                            c = '\b';
                            break;
                        }
                        c = 65535;
                        break;
                    case 431477072:
                        if (key.equals("text-decoration")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 598800822:
                        if (key.equals(FontWeight.NAME)) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 746232421:
                        if (key.equals(TextAlign.NAME)) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1588706701:
                        if (key.equals(NumberOfLines.NAME)) {
                            c = '\t';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1703948766:
                        if (key.equals("text-align-vertical")) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1889098060:
                        if (key.equals("text-indent")) {
                            c = 11;
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
                        if (i(obj)) {
                            this.e = obj.split("\\s+");
                            break;
                        } else {
                            continue;
                        }
                    case 1:
                        this.g = h(obj);
                        continue;
                    case 2:
                        this.h = (int) i.c(obj);
                        continue;
                    case 3:
                        this.i = obj;
                        continue;
                    case 4:
                        this.k = obj;
                        continue;
                    case 5:
                        this.j = obj;
                        continue;
                    case 6:
                        this.r = k.a(obj);
                        continue;
                    case 7:
                        if ("center".equals(obj)) {
                            obj = obj + "-vertical";
                        }
                        this.s = k.a(obj);
                        continue;
                    case '\b':
                        this.t = i.c(obj) > 0.0f ? i.c(obj) : 0.0f;
                        continue;
                    case '\t':
                        int a4 = (int) g.a(obj);
                        if (a4 <= 0) {
                            a4 = Integer.MAX_VALUE;
                        }
                        this.u = Integer.valueOf(a4);
                        continue;
                    case '\n':
                        this.v = com.sankuai.waimai.mach.model.value.b.a(obj);
                        continue;
                    case 11:
                        this.w = (int) i.c(obj);
                        continue;
                    case '\f':
                        this.x = (int) i.c(obj);
                        continue;
                }
            }
        }
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public void a(com.sankuai.waimai.mach.widget.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bcb484dbe026be60977cb075114da7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bcb484dbe026be60977cb075114da7b");
            return;
        }
        super.a((e) eVar);
        this.d = eVar;
        a((TextView) this.d);
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
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.mach.component.e.a(android.widget.TextView):void");
    }

    @Nullable
    private Typeface j(String str) {
        j themeProvider;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed8432797ed596eaca93e933f4d960dd", RobustBitConfig.DEFAULT_VALUE)) {
            return (Typeface) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed8432797ed596eaca93e933f4d960dd");
        }
        if (str == null || "".equals(str) || (themeProvider = this.m.getThemeProvider()) == null) {
            return null;
        }
        return themeProvider.a(str);
    }

    @Override // com.facebook.yoga.YogaMeasureFunction
    public long measure(com.facebook.yoga.d dVar, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
        int i;
        int i2;
        Object[] objArr = {dVar, Float.valueOf(f), yogaMeasureMode, Float.valueOf(f2), yogaMeasureMode2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35918fbed384897dbef4748711fc6004", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35918fbed384897dbef4748711fc6004")).longValue();
        }
        if (!TextUtils.isEmpty(this.b)) {
            int a2 = SizeSpec.a(f, yogaMeasureMode);
            int a3 = SizeSpec.a(f2, yogaMeasureMode2);
            com.sankuai.waimai.mach.common.i.a();
            if (!m.m()) {
                com.sankuai.waimai.mach.text.a a4 = a(a2, a3);
                i = a4.a;
                i2 = a4.b;
            } else {
                try {
                    synchronized (this.m) {
                        TextView textView = this.m.getTextMeasureHelper().b;
                        a(textView);
                        textView.measure(a2, a3);
                        i = textView.getMeasuredWidth();
                        i2 = textView.getMeasuredHeight();
                        this.m.getTextMeasureHelper().a();
                    }
                } catch (Exception e) {
                    com.sankuai.waimai.mach.manager_new.common.c.b("TextView Measure Exception: " + e.getMessage());
                    String str = e.getMessage() + " | ";
                    if (this.m.getMachBundle() != null && this.m.getMachBundle().q != null) {
                        str = str + this.m.getMachBundle().q.b + " | " + this.m.getMachBundle().q.c;
                    }
                    com.sankuai.waimai.mach.utils.e.a(e.class, "TextView Measure Exception", str);
                    com.sankuai.waimai.mach.text.a a5 = a(a2, a3);
                    i = a5.a;
                    i2 = a5.b;
                }
            }
            if (!TextUtils.isEmpty(this.c)) {
                i += 2;
            }
            return com.facebook.yoga.c.a(i, i2);
        }
        float f3 = 0;
        return com.facebook.yoga.c.a(f3, f3);
    }

    private com.sankuai.waimai.mach.text.a a(int i, int i2) {
        int style;
        Typeface a2;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f836cc08c036c8e2b960f40c7aa8a3fd", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.mach.text.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f836cc08c036c8e2b960f40c7aa8a3fd");
        }
        int intValue = this.u == null ? Integer.MAX_VALUE : this.u.intValue();
        TextUtils.TruncateAt truncateAt = this.v != null ? this.v.f : null;
        Typeface a3 = h.a(com.sankuai.waimai.mach.text.d.b);
        if (a3 == null) {
            style = com.sankuai.waimai.mach.text.d.b.getStyle();
        } else {
            style = a3.getStyle();
        }
        int i3 = style;
        Typeface j = j(this.j);
        if (j == null && (this.i != null || this.k != null)) {
            a2 = h.a(this.i, this.k);
        } else {
            a2 = h.a(j);
        }
        Typeface typeface = a2;
        boolean z = intValue == 1;
        com.sankuai.waimai.mach.text.a aVar = new com.sankuai.waimai.mach.text.a();
        this.f = com.sankuai.waimai.mach.text.d.a(Mach.getContext(), i, i2, aVar, this.b, truncateAt, true, 1, intValue, -1, -1, 0, Integer.MAX_VALUE, 0.0f, 0.0f, 0.0f, -7829368, z, this.g, com.sankuai.waimai.mach.text.d.c, 0, this.h, this.x, 0.0f, 1.0f, this.t, i3, typeface, com.sankuai.waimai.mach.text.b.TEXT_START, 0, 0, 0, ac_().u(), null, false, 0, this.w);
        return aVar;
    }

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37c4525926f51abd3e64e0e7a20454c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37c4525926f51abd3e64e0e7a20454c9");
        } else if (f()) {
            this.b = com.sankuai.waimai.mach.utils.e.a(j, this.c);
            this.d.setText(this.b);
        }
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4eda0554290ad6abf1c5bdedfdb60194", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4eda0554290ad6abf1c5bdedfdb60194");
        } else if (f()) {
            a(0L);
        }
    }

    private boolean f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad11f9a4f1b4a2b69f513ec35d537887", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad11f9a4f1b4a2b69f513ec35d537887")).booleanValue() : this.d != null && i(this.c);
    }
}
