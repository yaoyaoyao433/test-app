package com.sankuai.waimai.machpro.component.text;

import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.LeadingMarginSpan;
import android.widget.TextView;
import com.dianping.titans.widget.DynamicTitleParser;
import com.meituan.android.recce.props.gens.EllipsizeMode;
import com.meituan.android.recce.props.gens.FontSize;
import com.meituan.android.recce.props.gens.FontStyle;
import com.meituan.android.recce.props.gens.FontWeight;
import com.meituan.android.recce.props.gens.LetterSpacing;
import com.meituan.android.recce.props.gens.LineHeight;
import com.meituan.android.recce.props.gens.TextAlign;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.component.MPComponent;
import com.sankuai.waimai.machpro.instance.MPContext;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class e extends MPComponent<TextView> {
    public static ChangeQuickRedirect b;
    private float a;
    protected String c;
    protected String d;
    protected String e;
    protected String[] f;
    protected int g;
    protected String h;
    protected SpannableStringBuilder i;
    protected int j;
    protected float k;
    private int l;

    public e(MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14b7a15ad988d986659f01c702aae3f7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14b7a15ad988d986659f01c702aae3f7");
            return;
        }
        this.g = -16777216;
        this.h = "";
        this.j = 0;
        this.k = -1.0f;
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    /* renamed from: a */
    public TextView createView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83319f495db631a0464e817ca1445662", RobustBitConfig.DEFAULT_VALUE)) {
            return (TextView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83319f495db631a0464e817ca1445662");
        }
        MPTextView a = this.mMachContext.getInstance().a() != null ? this.mMachContext.getInstance().a().a() : null;
        if (a == null) {
            a = new MPTextView(this.mMachContext.getContext());
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.a = a.getLetterSpacing();
        }
        this.l = a.getPaintFlags();
        a.a(this);
        a.setMaxLines(1);
        a.setEllipsize(TextUtils.TruncateAt.END);
        a.setGravity(16);
        a.setTextSize(0, com.sankuai.waimai.machpro.util.b.b(12.0f));
        this.mMachContext.getInstance().r.a(1);
        return a;
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public void updateAttribute(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71beca53c268664ffea751dd9892bc43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71beca53c268664ffea751dd9892bc43");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != 951530617) {
                if (hashCode == 1806129616 && str.equals(EllipsizeMode.LOWER_CASE_NAME)) {
                    c = 1;
                }
            } else if (str.equals("content")) {
                c = 0;
            }
            switch (c) {
                case 0:
                    this.h = com.sankuai.waimai.machpro.util.b.a(obj, "");
                    b();
                    return;
                case 1:
                    a(com.sankuai.waimai.machpro.util.b.a(obj, ""));
                    return;
                default:
                    super.updateAttribute(str, obj);
                    return;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
        if (r14.equals(com.meituan.android.recce.props.gens.FontWeight.NAME) != false) goto L14;
     */
    @Override // com.sankuai.waimai.machpro.component.MPComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void updateViewStyle(java.lang.String r14, java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.machpro.component.text.e.updateViewStyle(java.lang.String, java.lang.Object):void");
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public void resetCssProperty(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f435f5fe6e05ca8926740a784fedba7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f435f5fe6e05ca8926740a784fedba7");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            char c = 65535;
            switch (str.hashCode()) {
                case -1988401764:
                    if (str.equals(LetterSpacing.NAME)) {
                        c = 11;
                        break;
                    }
                    break;
                case -1923578189:
                    if (str.equals(FontStyle.NAME)) {
                        c = 4;
                        break;
                    }
                    break;
                case -1672581802:
                    if (str.equals("max-lines")) {
                        c = '\t';
                        break;
                    }
                    break;
                case -1586082113:
                    if (str.equals(FontSize.NAME)) {
                        c = 1;
                        break;
                    }
                    break;
                case -1215680224:
                    if (str.equals(LineHeight.NAME)) {
                        c = 6;
                        break;
                    }
                    break;
                case -930515806:
                    if (str.equals("text-overflow")) {
                        c = '\f';
                        break;
                    }
                    break;
                case -326942437:
                    if (str.equals("baseline-offset")) {
                        c = '\n';
                        break;
                    }
                    break;
                case 94842723:
                    if (str.equals("color")) {
                        c = 0;
                        break;
                    }
                    break;
                case 108532386:
                    if (str.equals("font-family")) {
                        c = 3;
                        break;
                    }
                    break;
                case 431477072:
                    if (str.equals("text-decoration")) {
                        c = 7;
                        break;
                    }
                    break;
                case 598800822:
                    if (str.equals(FontWeight.NAME)) {
                        c = 2;
                        break;
                    }
                    break;
                case 746232421:
                    if (str.equals(TextAlign.NAME)) {
                        c = 5;
                        break;
                    }
                    break;
                case 1889098060:
                    if (str.equals("text-indent")) {
                        c = '\b';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    this.g = -16777216;
                    ((TextView) this.mView).setTextColor(this.g);
                    return;
                case 1:
                    ((TextView) this.mView).setTextSize(0, com.sankuai.waimai.machpro.util.b.a((Object) "12"));
                    requestLayout();
                    return;
                case 2:
                    this.c = "normal";
                    c();
                    return;
                case 3:
                    this.e = "";
                    this.f = null;
                    c();
                    return;
                case 4:
                    this.d = "normal";
                    c();
                    return;
                case 5:
                    ((TextView) this.mView).setGravity(8388627);
                    return;
                case 6:
                    this.k = -1.0f;
                    this.i = null;
                    if (TextUtils.isEmpty(this.h)) {
                        return;
                    }
                    b();
                    return;
                case 7:
                    b("none");
                    return;
                case '\b':
                    this.j = 0;
                    this.i = null;
                    if (TextUtils.isEmpty(this.h)) {
                        return;
                    }
                    b();
                    return;
                case '\t':
                    ((TextView) this.mView).setMaxLines(1);
                    requestLayout();
                    return;
                case '\n':
                    return;
                case 11:
                    if (Build.VERSION.SDK_INT >= 21) {
                        ((TextView) this.mView).setLetterSpacing(this.a);
                        requestLayout();
                        return;
                    }
                    return;
                case '\f':
                    a("tail");
                    return;
                default:
                    super.resetCssProperty(str);
                    return;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
        if (r13.equals("middle") != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(java.lang.String r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.machpro.component.text.e.b
            java.lang.String r11 = "034261b08ff2f2f2f3da0bd50fa79e93"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1b
            com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
            return
        L1b:
            r1 = -1
            int r2 = r13.hashCode()
            switch(r2) {
                case -1074341483: goto L59;
                case 3056464: goto L4f;
                case 3198432: goto L44;
                case 3552336: goto L39;
                case 844038445: goto L2e;
                case 1516766305: goto L24;
                default: goto L23;
            }
        L23:
            goto L63
        L24:
            java.lang.String r0 = "char-wrap"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L63
            r0 = 5
            goto L64
        L2e:
            java.lang.String r0 = "word-wrap"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L63
            r0 = 4
            goto L64
        L39:
            java.lang.String r0 = "tail"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L63
            r0 = 2
            goto L64
        L44:
            java.lang.String r0 = "head"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L63
            r0 = 0
            goto L64
        L4f:
            java.lang.String r0 = "clip"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L63
            r0 = 3
            goto L64
        L59:
            java.lang.String r2 = "middle"
            boolean r13 = r13.equals(r2)
            if (r13 == 0) goto L63
            goto L64
        L63:
            r0 = -1
        L64:
            switch(r0) {
                case 0: goto L85;
                case 1: goto L7b;
                case 2: goto L71;
                case 3: goto L68;
                case 4: goto L68;
                case 5: goto L68;
                default: goto L67;
            }
        L67:
            goto L8e
        L68:
            T extends android.view.View r13 = r12.mView
            android.widget.TextView r13 = (android.widget.TextView) r13
            r0 = 0
            r13.setEllipsize(r0)
            goto L8e
        L71:
            T extends android.view.View r13 = r12.mView
            android.widget.TextView r13 = (android.widget.TextView) r13
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            r13.setEllipsize(r0)
            goto L8e
        L7b:
            T extends android.view.View r13 = r12.mView
            android.widget.TextView r13 = (android.widget.TextView) r13
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.MIDDLE
            r13.setEllipsize(r0)
            goto L8e
        L85:
            T extends android.view.View r13 = r12.mView
            android.widget.TextView r13 = (android.widget.TextView) r13
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.START
            r13.setEllipsize(r0)
        L8e:
            r12.requestLayout()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.machpro.component.text.e.a(java.lang.String):void");
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0c25c33aa13d104de1d2cdcd376af00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0c25c33aa13d104de1d2cdcd376af00");
            return;
        }
        if (this.j > 0 || this.k >= 0.0f) {
            if (this.i == null) {
                this.i = new SpannableStringBuilder();
            }
            this.i.clear();
            this.i.clearSpans();
            this.i.append((CharSequence) this.h);
            if (this.j > 0) {
                this.i.setSpan(new LeadingMarginSpan.Standard(this.j, 0), 0, this.i.length(), 17);
            }
            if (this.k >= 0.0f) {
                this.i.setSpan(new c(this.k), 0, this.i.length(), 17);
            }
        }
        if (this.i != null) {
            ((TextView) this.mView).setText(this.i);
        } else {
            ((TextView) this.mView).setText(this.h);
        }
        requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
        if (r13.equals(com.dianping.titans.widget.DynamicTitleParser.PARSER_VAL_FONT_STYLE_UNDERLINE) != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b(java.lang.String r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.machpro.component.text.e.b
            java.lang.String r11 = "be23c602177db04f3d4cddb14e268b8a"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1b
            com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
            return
        L1b:
            boolean r1 = android.text.TextUtils.isEmpty(r13)
            if (r1 != 0) goto L94
            java.lang.String r1 = "\\s+"
            java.lang.String[] r13 = r13.split(r1)
            int r1 = r13.length
            if (r1 <= 0) goto L94
            r13 = r13[r9]
            r1 = -1
            int r2 = r13.hashCode()
            r3 = -1171789332(0xffffffffba27e9ec, float:-6.4054015E-4)
            if (r2 == r3) goto L56
            r3 = -1026963764(0xffffffffc2c9c6cc, float:-100.888275)
            if (r2 == r3) goto L4c
            r0 = 3387192(0x33af38, float:4.746467E-39)
            if (r2 == r0) goto L41
            goto L61
        L41:
            java.lang.String r0 = "none"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L61
            r0 = 2
            goto L62
        L4c:
            java.lang.String r2 = "underline"
            boolean r13 = r13.equals(r2)
            if (r13 == 0) goto L61
            goto L62
        L56:
            java.lang.String r0 = "line-through"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L61
            r0 = 0
            goto L62
        L61:
            r0 = -1
        L62:
            switch(r0) {
                case 0: goto L82;
                case 1: goto L70;
                case 2: goto L66;
                default: goto L65;
            }
        L65:
            goto L94
        L66:
            T extends android.view.View r13 = r12.mView
            android.widget.TextView r13 = (android.widget.TextView) r13
            int r0 = r12.l
            r13.setPaintFlags(r0)
            goto L94
        L70:
            T extends android.view.View r13 = r12.mView
            android.widget.TextView r13 = (android.widget.TextView) r13
            T extends android.view.View r0 = r12.mView
            android.widget.TextView r0 = (android.widget.TextView) r0
            int r0 = r0.getPaintFlags()
            r0 = r0 | 8
            r13.setPaintFlags(r0)
            return
        L82:
            T extends android.view.View r13 = r12.mView
            android.widget.TextView r13 = (android.widget.TextView) r13
            T extends android.view.View r0 = r12.mView
            android.widget.TextView r0 = (android.widget.TextView) r0
            int r0 = r0.getPaintFlags()
            r0 = r0 | 16
            r13.setPaintFlags(r0)
            return
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.machpro.component.text.e.b(java.lang.String):void");
    }

    private void c() {
        int i;
        boolean z;
        com.sankuai.waimai.machpro.c cVar;
        int i2 = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21fe4963166d194585de6dac1cdfed7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21fe4963166d194585de6dac1cdfed7b");
            return;
        }
        ((TextView) this.mView).getTypeface();
        if (DynamicTitleParser.PARSER_VAL_FONT_STYLE_ITALIC.equals(this.d)) {
            i = 2;
            z = true;
        } else {
            i = 0;
            z = false;
        }
        if (DynamicTitleParser.PARSER_VAL_FONT_STYLE_BOLD.equals(this.c)) {
            i |= 1;
        }
        if (this.f != null && this.f.length > 0) {
            String[] strArr = this.f;
            int length = strArr.length;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                Typeface b2 = com.sankuai.waimai.machpro.util.b.b(strArr[i2], i);
                if (b2 != null) {
                    ((TextView) this.mView).setTypeface(b2);
                    break;
                }
                i2++;
            }
        } else {
            if (!z && (cVar = com.sankuai.waimai.machpro.f.a().i) != null && !TextUtils.isEmpty(cVar.g) && cVar.g.toLowerCase().contains("xiaomi")) {
                TextPaint paint = ((TextView) this.mView).getPaint();
                if (paint.getTextSkewX() != 0.0f) {
                    paint.setTextSkewX(0.0f);
                }
            }
            if (z) {
                ((TextView) this.mView).setTypeface(Typeface.defaultFromStyle(i));
                com.sankuai.waimai.machpro.c cVar2 = com.sankuai.waimai.machpro.f.a().i;
                if (cVar2 != null && !TextUtils.isEmpty(cVar2.g) && cVar2.g.toLowerCase().contains("xiaomi")) {
                    ((TextView) this.mView).getPaint().setTextSkewX(-0.25f);
                }
            } else {
                ((TextView) this.mView).setTypeface(Typeface.defaultFromStyle(i));
            }
        }
        requestLayout();
    }
}
