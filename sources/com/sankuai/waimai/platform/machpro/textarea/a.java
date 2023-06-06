package com.sankuai.waimai.platform.machpro.textarea;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import com.dianping.titans.widget.DynamicTitleParser;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.component.MPComponent;
import com.sankuai.waimai.machpro.instance.MPContext;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends MPComponent<MPEditText> {
    public static ChangeQuickRedirect a;
    protected String b;
    protected String c;
    protected String d;
    protected String[] e;
    protected int f;
    protected String g;
    protected int h;
    MPComponent i;
    private int j;
    private boolean k;
    private boolean l;
    private TextWatcher m;
    private View.OnFocusChangeListener n;
    private TextView.OnEditorActionListener o;

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public final /* synthetic */ MPEditText createView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0bb706ea72da4c9e7f94eeb7e3b1af59", RobustBitConfig.DEFAULT_VALUE)) {
            return (MPEditText) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0bb706ea72da4c9e7f94eeb7e3b1af59");
        }
        MPEditText mPEditText = new MPEditText(this.mMachContext.getContext());
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = MPEditText.a;
        if (PatchProxy.isSupport(objArr2, mPEditText, changeQuickRedirect2, false, "4b437944f96eb0ae797fdada22e3f832", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, mPEditText, changeQuickRedirect2, false, "4b437944f96eb0ae797fdada22e3f832");
        } else {
            mPEditText.b = new WeakReference<>(this);
        }
        mPEditText.setSingleLine(true);
        mPEditText.setMaxLines(1);
        mPEditText.setEllipsize(TextUtils.TruncateAt.END);
        mPEditText.setGravity(8388627);
        mPEditText.setTextSize(0, com.sankuai.waimai.machpro.util.b.b(12.0f));
        mPEditText.setBackground(null);
        return mPEditText;
    }

    public a(MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "972eac7c0590aa788178e0b6dac8bf14", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "972eac7c0590aa788178e0b6dac8bf14");
            return;
        }
        this.f = -16777216;
        this.g = "";
        this.h = 0;
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public final void onAttachToParent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d7fb5beae42b7c402aada5e2e74fdf4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d7fb5beae42b7c402aada5e2e74fdf4");
        } else {
            super.onAttachToParent();
        }
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public final void onDetachFromParent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a570bc1cf7d96f1a9ab9dcb8b3280b43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a570bc1cf7d96f1a9ab9dcb8b3280b43");
            return;
        }
        super.onDetachFromParent();
        if (this.m != null) {
            ((MPEditText) this.mView).removeTextChangedListener(this.m);
        }
        if (this.n != null) {
            ((MPEditText) this.mView).setOnFocusChangeListener(null);
            this.n = null;
        }
        if (this.o != null) {
            ((MPEditText) this.mView).setOnEditorActionListener(null);
            this.o = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
        if (r13.equals("blur") != false) goto L17;
     */
    @Override // com.sankuai.waimai.machpro.component.MPComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void addEventListener(java.lang.String r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.platform.machpro.textarea.a.a
            java.lang.String r11 = "5157a60827ae2dfc476d3fa38ddd73fe"
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
            r3 = -1361636432(0xffffffffaed713b0, float:-9.780565E-11)
            if (r2 == r3) goto L52
            r3 = 3027047(0x2e3067, float:4.241796E-39)
            if (r2 == r3) goto L49
            r0 = 97604824(0x5d154d8, float:1.9685432E-35)
            if (r2 == r0) goto L3f
            r0 = 951117504(0x38b0e6c0, float:8.4353145E-5)
            if (r2 == r0) goto L35
            goto L5c
        L35:
            java.lang.String r0 = "confirm"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L5c
            r0 = 3
            goto L5d
        L3f:
            java.lang.String r0 = "focus"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L5c
            r0 = 2
            goto L5d
        L49:
            java.lang.String r2 = "blur"
            boolean r2 = r13.equals(r2)
            if (r2 == 0) goto L5c
            goto L5d
        L52:
            java.lang.String r0 = "change"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L5c
            r0 = 0
            goto L5d
        L5c:
            r0 = -1
        L5d:
            switch(r0) {
                case 0: goto L87;
                case 1: goto L76;
                case 2: goto L76;
                case 3: goto L61;
                default: goto L60;
            }
        L60:
            goto L97
        L61:
            android.widget.TextView$OnEditorActionListener r0 = r12.o
            if (r0 != 0) goto L97
            com.sankuai.waimai.platform.machpro.textarea.a$3 r0 = new com.sankuai.waimai.platform.machpro.textarea.a$3
            r0.<init>()
            r12.o = r0
            T extends android.view.View r0 = r12.mView
            com.sankuai.waimai.platform.machpro.textarea.MPEditText r0 = (com.sankuai.waimai.platform.machpro.textarea.MPEditText) r0
            android.widget.TextView$OnEditorActionListener r1 = r12.o
            r0.setOnEditorActionListener(r1)
            goto L97
        L76:
            com.sankuai.waimai.platform.machpro.textarea.a$2 r0 = new com.sankuai.waimai.platform.machpro.textarea.a$2
            r0.<init>()
            r12.n = r0
            T extends android.view.View r0 = r12.mView
            com.sankuai.waimai.platform.machpro.textarea.MPEditText r0 = (com.sankuai.waimai.platform.machpro.textarea.MPEditText) r0
            android.view.View$OnFocusChangeListener r1 = r12.n
            r0.setOnFocusChangeListener(r1)
            goto L97
        L87:
            com.sankuai.waimai.platform.machpro.textarea.a$1 r0 = new com.sankuai.waimai.platform.machpro.textarea.a$1
            r0.<init>()
            r12.m = r0
            T extends android.view.View r0 = r12.mView
            com.sankuai.waimai.platform.machpro.textarea.MPEditText r0 = (com.sankuai.waimai.platform.machpro.textarea.MPEditText) r0
            android.text.TextWatcher r1 = r12.m
            r0.addTextChangedListener(r1)
        L97:
            super.addEventListener(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.platform.machpro.textarea.a.addEventListener(java.lang.String):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x022d, code lost:
        if (r5.equals("decimalPad") != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x04bb, code lost:
        if (r5.equals("search") != false) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x019d, code lost:
        if (r5.equals("right") == false) goto L43;
     */
    @Override // com.sankuai.waimai.machpro.component.MPComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void updateAttribute(java.lang.String r26, java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 1428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.platform.machpro.textarea.a.updateAttribute(java.lang.String, java.lang.Object):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01ef, code lost:
        if (r0.equals(com.dianping.titans.widget.DynamicTitleParser.PARSER_VAL_FONT_STYLE_UNDERLINE) != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0149, code lost:
        if (r8.equals("middle") != false) goto L34;
     */
    @Override // com.sankuai.waimai.machpro.component.MPComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void updateViewStyle(java.lang.String r21, java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 826
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.platform.machpro.textarea.a.updateViewStyle(java.lang.String, java.lang.Object):void");
    }

    private void a() {
        int i;
        boolean z;
        boolean z2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efc361a4a115a596da7eb8a5ef844eca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efc361a4a115a596da7eb8a5ef844eca");
            return;
        }
        Typeface typeface = ((MPEditText) this.mView).getTypeface();
        int style = typeface != null ? typeface.getStyle() : 0;
        if (DynamicTitleParser.PARSER_VAL_FONT_STYLE_ITALIC.equals(this.c) || (style & 2) != 0) {
            i = 2;
            z = true;
        } else {
            i = 0;
            z = false;
        }
        if (DynamicTitleParser.PARSER_VAL_FONT_STYLE_BOLD.equals(this.b) || (style & 1) != 0) {
            i |= 1;
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.e == null || this.e.length <= 0) {
            if (!z2) {
                TextPaint paint = ((MPEditText) this.mView).getPaint();
                if (paint.isFakeBoldText()) {
                    paint.setFakeBoldText(false);
                }
            }
            if (!z && z2) {
                ((MPEditText) this.mView).getPaint().setFakeBoldText(true);
            } else {
                ((MPEditText) this.mView).setTypeface(Typeface.defaultFromStyle(i));
            }
        } else {
            String[] strArr = this.e;
            int length = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                Typeface b = com.sankuai.waimai.machpro.util.b.b(strArr[i2], i);
                if (b != null) {
                    TextPaint paint2 = ((MPEditText) this.mView).getPaint();
                    if (paint2.isFakeBoldText()) {
                        paint2.setFakeBoldText(false);
                    }
                    ((MPEditText) this.mView).setTypeface(b);
                } else {
                    i2++;
                }
            }
        }
        requestLayout();
    }
}
