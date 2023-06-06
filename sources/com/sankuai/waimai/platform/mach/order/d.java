package com.sankuai.waimai.platform.mach.order;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.StyleSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.dianping.titans.widget.DynamicTitleParser;
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
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.foundation.utils.ColorUtils;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.j;
import com.sankuai.waimai.mach.m;
import com.sankuai.waimai.mach.model.value.h;
import com.sankuai.waimai.mach.model.value.k;
import com.sankuai.waimai.mach.text.SizeSpec;
import com.sankuai.waimai.mach.utils.i;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends com.sankuai.waimai.mach.component.base.a<com.sankuai.waimai.mach.widget.e> implements YogaMeasureFunction {
    public static ChangeQuickRedirect a;
    private Drawable A;
    protected String b;
    protected com.sankuai.waimai.mach.widget.e c;
    private String[] d;
    private Layout e;
    private int f;
    private int g;
    private String h;
    private String i;
    private String j;
    private k k;
    private k r;
    private float s;
    private Integer t;
    private com.sankuai.waimai.mach.model.value.b u;
    private String v;
    private int w;
    private float x;
    private e y;
    private Activity z;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.platform.mach.order.d$d  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    interface InterfaceC1059d {
        void a(View view);
    }

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1353bc17ddf099b3ab8ec826556af18d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1353bc17ddf099b3ab8ec826556af18d");
            return;
        }
        this.f = -16777216;
        this.g = (int) i.c("12dp");
        this.r = k.a("center-vertical");
        this.t = 1;
        this.u = com.sankuai.waimai.mach.model.value.b.a("tail");
        this.y = new e();
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final /* synthetic */ void a(com.sankuai.waimai.mach.widget.e eVar) {
        String str;
        com.sankuai.waimai.mach.widget.e eVar2 = eVar;
        Object[] objArr = {eVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5efea77344bd102c2e5dfadc4e4383c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5efea77344bd102c2e5dfadc4e4383c");
            return;
        }
        super.a((d) eVar2);
        this.c = eVar2;
        a((TextView) this.c);
        e eVar3 = this.y;
        Object[] objArr2 = {eVar3};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eed8637ed5bc2ce7aeb20a163af20eb1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eed8637ed5bc2ce7aeb20a163af20eb1");
        } else if (eVar3 != null) {
            if (!TextUtils.equals(eVar3.h, "end")) {
                this.c.setPadding(0, 0, g.a(this.z, 15.0f), 0);
            }
            String str2 = eVar3.a;
            Object[] objArr3 = {str2};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c00a6e390eed00c9a53efb288cee62bb", RobustBitConfig.DEFAULT_VALUE)) {
                str = (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c00a6e390eed00c9a53efb288cee62bb");
            } else if (TextUtils.isEmpty(str2)) {
                str = "";
            } else {
                if (str2.startsWith("assets://") && this.n != null) {
                    str2 = str2.replaceFirst("assets://", this.n.a());
                }
                str = str2;
            }
            eVar3.a = str;
            if (TextUtils.isEmpty(eVar3.a)) {
                this.c.setText(this.b);
            } else {
                a((TextView) this.c);
            }
            ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
            if (layoutParams instanceof com.sankuai.waimai.mach.widget.d) {
                com.sankuai.waimai.mach.widget.d dVar = (com.sankuai.waimai.mach.widget.d) layoutParams;
                dVar.gravity = 17;
                dVar.width = -1;
                dVar.height = -2;
                this.c.setLayoutParams(dVar);
                return;
            }
            layoutParams.width = -1;
            layoutParams.height = -2;
            this.c.setLayoutParams(layoutParams);
        }
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    @NonNull
    public final /* synthetic */ com.sankuai.waimai.mach.widget.e b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6b173c7cc79db86dbff146fbb6b0e28", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.mach.widget.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6b173c7cc79db86dbff146fbb6b0e28") : new com.sankuai.waimai.mach.widget.e(context);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.sankuai.waimai.mach.component.base.a
    public final void a() {
        char c2;
        String replaceAll;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "213838d8bfab0917d00363388c3d14e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "213838d8bfab0917d00363388c3d14e6");
            return;
        }
        ac_().a((YogaMeasureFunction) this);
        String a2 = a("content");
        if (i(a2)) {
            this.b = a2;
        }
        String a3 = a("time-format");
        if (i(a3)) {
            this.v = a3;
            if (com.sankuai.waimai.mach.utils.e.a(a2)) {
                Object[] objArr2 = {a3};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0abdf4db5eed8ec601f14e87a30c9329", RobustBitConfig.DEFAULT_VALUE)) {
                    replaceAll = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0abdf4db5eed8ec601f14e87a30c9329");
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
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a9b0cbefc863bb40e1d6b3bececc9083", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a9b0cbefc863bb40e1d6b3bececc9083");
            } else {
                String key = entry.getKey();
                String obj = entry.getValue() == null ? "" : entry.getValue().toString();
                switch (key.hashCode()) {
                    case -1923578189:
                        if (key.equals(FontStyle.NAME)) {
                            c2 = 3;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1586082113:
                        if (key.equals(FontSize.NAME)) {
                            c2 = 2;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -1362940800:
                        if (key.equals("text-line-height")) {
                            c2 = '\f';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 94842723:
                        if (key.equals("color")) {
                            c2 = 1;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 108532386:
                        if (key.equals("font-family")) {
                            c2 = 5;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 125841635:
                        if (key.equals(EllipsizeMode.NAME)) {
                            c2 = '\n';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 428355132:
                        if (key.equals("text-letter-spacing")) {
                            c2 = '\b';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 431477072:
                        if (key.equals("text-decoration")) {
                            c2 = 0;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 598800822:
                        if (key.equals(FontWeight.NAME)) {
                            c2 = 4;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 746232421:
                        if (key.equals(TextAlign.NAME)) {
                            c2 = 6;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1588706701:
                        if (key.equals(NumberOfLines.NAME)) {
                            c2 = '\t';
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1703948766:
                        if (key.equals("text-align-vertical")) {
                            c2 = 7;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1889098060:
                        if (key.equals("text-indent")) {
                            c2 = 11;
                            break;
                        }
                        c2 = 65535;
                        break;
                    default:
                        c2 = 65535;
                        break;
                }
                switch (c2) {
                    case 0:
                        if (i(obj)) {
                            this.d = obj.split("\\s+");
                            break;
                        } else {
                            continue;
                        }
                    case 1:
                        this.f = h(obj);
                        continue;
                    case 2:
                        this.g = (int) i.c(obj);
                        continue;
                    case 3:
                        this.h = obj;
                        continue;
                    case 4:
                        this.j = obj;
                        continue;
                    case 5:
                        this.i = obj;
                        continue;
                    case 6:
                        this.k = k.a(obj);
                        continue;
                    case 7:
                        if ("center".equals(obj)) {
                            obj = obj + "-vertical";
                        }
                        this.r = k.a(obj);
                        continue;
                    case '\b':
                        this.s = i.c(obj) > 0.0f ? i.c(obj) : 0.0f;
                        continue;
                    case '\t':
                        int a4 = (int) com.sankuai.waimai.mach.utils.g.a(obj);
                        if (a4 <= 0) {
                            a4 = Integer.MAX_VALUE;
                        }
                        this.t = Integer.valueOf(a4);
                        continue;
                    case '\n':
                        this.u = com.sankuai.waimai.mach.model.value.b.a(obj);
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
        this.z = this.m.getActivity();
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "686156be6fc0bcf65bedf65bb94380f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "686156be6fc0bcf65bedf65bb94380f7");
        } else {
            e eVar = this.y;
            String a5 = a("icon-align");
            Object[] objArr5 = {a5};
            ChangeQuickRedirect changeQuickRedirect5 = a;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "90f77ce0ea9718e0190566be37edc964", RobustBitConfig.DEFAULT_VALUE)) {
                a5 = (String) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "90f77ce0ea9718e0190566be37edc964");
            } else if (TextUtils.isEmpty(a5)) {
                a5 = "start";
            }
            eVar.h = a5;
            this.y.a = a("icon-url");
            this.y.g = a("icon-scheme-url");
            this.y.b = (int) i.c(a("icon-width"));
            this.y.c = (int) i.c(a("icon-height"));
            this.y.d = (int) i.c(a("icon-padding"));
            this.y.e = a("highlight-color");
            this.y.f = a("highlight-weight");
        }
        Object[] objArr6 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect6 = a;
        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "f08b5394423b8224b521f1fc4f200763", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "f08b5394423b8224b521f1fc4f200763");
        } else if (!TextUtils.isEmpty(this.y.a)) {
            this.z.runOnUiThread(new Runnable() { // from class: com.sankuai.waimai.platform.mach.order.d.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr7 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "1102d2d3be692eeb1d13afc6258f7275", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "1102d2d3be692eeb1d13afc6258f7275");
                        return;
                    }
                    b.C0608b a6 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                    a6.b = d.this.z;
                    a6.c = d.this.y.a;
                    a6.e = 0;
                    a6.a(new b.a() { // from class: com.sankuai.waimai.platform.mach.order.d.2.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.meituan.mtimageloader.config.b.a
                        public final void a() {
                        }

                        @Override // com.sankuai.meituan.mtimageloader.config.b.a
                        public final void a(Bitmap bitmap) {
                            Object[] objArr8 = {bitmap};
                            ChangeQuickRedirect changeQuickRedirect8 = a;
                            if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "a02373be7ab4b734abadf028547d1e98", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "a02373be7ab4b734abadf028547d1e98");
                                return;
                            }
                            d.this.A = new BitmapDrawable(d.this.z.getResources(), bitmap);
                            if (d.this.c != null) {
                                d.this.a((TextView) d.this.c);
                            }
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(TextView textView) {
        String str;
        Object obj;
        int i = 1;
        int i2 = 0;
        Object[] objArr = {textView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "778b9e2b7b5168a3ad6f4c22383bca27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "778b9e2b7b5168a3ad6f4c22383bca27");
            return;
        }
        textView.setTextColor(this.f);
        textView.setTextSize(0, this.g);
        int i3 = this.k != null ? this.k.i | 0 : 0;
        if (this.r != null) {
            i3 |= this.r.i;
        }
        if (i3 != 0) {
            textView.setGravity(i3);
        } else {
            textView.setGravity(16);
        }
        if (this.t != null) {
            textView.setMaxLines(this.t.intValue());
        }
        Typeface j = j(this.i);
        if (j != null) {
            textView.setTypeface(j);
        } else if (this.h != null || this.j != null) {
            textView.setTypeface(h.a(this.h, this.j));
        }
        if (this.d != null && this.d.length > 0) {
            String str2 = this.d[0];
            char c2 = 65535;
            int hashCode = str2.hashCode();
            if (hashCode != -1171789332) {
                if (hashCode != -1026963764) {
                    if (hashCode == 3387192 && str2.equals("none")) {
                        c2 = 2;
                    }
                } else if (str2.equals(DynamicTitleParser.PARSER_VAL_FONT_STYLE_UNDERLINE)) {
                    c2 = 0;
                }
            } else if (str2.equals(DynamicTitleParser.PARSER_VAL_FONT_STYLE_LINE_THROUGH)) {
                c2 = 1;
            }
            switch (c2) {
                case 0:
                    textView.setPaintFlags(textView.getPaintFlags() | 8);
                    break;
                case 1:
                    textView.setPaintFlags(textView.getPaintFlags() | 16);
                    break;
                case 2:
                    break;
                default:
                    throw new IllegalArgumentException("unsupported decoration: " + str2);
            }
        }
        if (this.u != null && this.u.f != null) {
            textView.setEllipsize(this.u.f);
        }
        if (this.s > 0.0f && Build.VERSION.SDK_INT >= 21) {
            textView.setLetterSpacing(this.s);
        }
        if (this.b != null) {
            SpannableStringBuilder spannableStringBuilder = null;
            if (this.x > 0.0f) {
                spannableStringBuilder = new SpannableStringBuilder(this.b);
                spannableStringBuilder.setSpan(new com.sankuai.waimai.machpro.component.text.c(this.x), 0, spannableStringBuilder.length(), 17);
            }
            if (this.w > 0) {
                if (spannableStringBuilder == null) {
                    spannableStringBuilder = new SpannableStringBuilder(this.b);
                }
                spannableStringBuilder.setSpan(new LeadingMarginSpan.Standard(this.w, 0), 0, spannableStringBuilder.length(), 18);
            }
            String str3 = this.b;
            Drawable drawable = this.A;
            if (TextUtils.equals(this.y.h, "end")) {
                str = str3 + "     ";
            } else {
                str = "     " + str3;
            }
            String replaceAll = str.replaceAll("<highlight>", "");
            if (spannableStringBuilder == null) {
                spannableStringBuilder = new SpannableStringBuilder(replaceAll);
            } else {
                spannableStringBuilder.clear();
                spannableStringBuilder.append((CharSequence) replaceAll);
            }
            String[] split = str.split("<highlight>");
            if (split.length >= 2) {
                int length = split[0].length();
                int length2 = split[0].length() + split[1].length();
                if ("normal".equals(this.y.f)) {
                    i = 0;
                } else if (DynamicTitleParser.PARSER_VAL_FONT_STYLE_ITALIC.equals(this.y.f)) {
                    i = 2;
                } else if ("bold_italic".equals(this.y.f)) {
                    i = 3;
                }
                spannableStringBuilder.setSpan(new StyleSpan(i), length, length2, 33);
                Integer a2 = ColorUtils.a(this.y.e);
                if (a2 == null) {
                    a2 = ColorUtils.a("#FFA800");
                }
                spannableStringBuilder.setSpan(new ForegroundColorSpan(a2.intValue()), length, length2, 33);
            }
            if (drawable != null) {
                int i4 = 4;
                if (TextUtils.equals(this.y.h, "end")) {
                    i2 = spannableStringBuilder.length() - 4;
                    i4 = spannableStringBuilder.length();
                }
                if (TextUtils.isEmpty(this.y.g)) {
                    obj = new a(drawable);
                } else {
                    obj = new b(drawable) { // from class: com.sankuai.waimai.platform.mach.order.d.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.platform.mach.order.d.b, com.sankuai.waimai.platform.mach.order.d.InterfaceC1059d
                        public final void a(View view) {
                            Object[] objArr2 = {view};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "735e5749e9198f3f34dc8358d5e1dce6", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "735e5749e9198f3f34dc8358d5e1dce6");
                                return;
                            }
                            super.a(view);
                            if (d.this.m != null) {
                                com.sankuai.waimai.foundation.router.a.a(d.this.m.getActivity(), d.this.y.g);
                            }
                        }
                    };
                }
                spannableStringBuilder.setSpan(obj, i2, i4, 33);
            }
            if (spannableStringBuilder == null) {
                textView.setText(this.b);
                return;
            }
            if (!TextUtils.isEmpty(this.y.g)) {
                this.c.setMovementMethod(c.a());
            }
            textView.setText(spannableStringBuilder);
        }
    }

    @Nullable
    private Typeface j(String str) {
        j themeProvider;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5ffcfe8b618e8fb4d1cf55de83e7a71", RobustBitConfig.DEFAULT_VALUE)) {
            return (Typeface) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5ffcfe8b618e8fb4d1cf55de83e7a71");
        }
        if (str == null || "".equals(str) || (themeProvider = this.m.getThemeProvider()) == null) {
            return null;
        }
        return themeProvider.a(str);
    }

    @Override // com.facebook.yoga.YogaMeasureFunction
    public final long measure(com.facebook.yoga.d dVar, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
        int i;
        int i2;
        Object[] objArr = {dVar, Float.valueOf(f), yogaMeasureMode, Float.valueOf(f2), yogaMeasureMode2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52e0d8aab6371a6b3e912c957b1a6eba", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52e0d8aab6371a6b3e912c957b1a6eba")).longValue();
        }
        if (!TextUtils.equals(this.y.h, "end") && !TextUtils.isEmpty(this.y.a)) {
            f = (f - this.y.b) - 10.0f;
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
                } catch (Exception e2) {
                    com.sankuai.waimai.mach.manager_new.common.c.b("TextView Measure Exception: " + e2.getMessage());
                    String str = e2.getMessage() + " | ";
                    if (this.m.getMachBundle() != null && this.m.getMachBundle().q != null) {
                        str = str + this.m.getMachBundle().q.b + " | " + this.m.getMachBundle().q.c;
                    }
                    com.sankuai.waimai.mach.utils.e.a(com.sankuai.waimai.mach.component.e.class, "TextView Measure Exception", str);
                    com.sankuai.waimai.mach.text.a a5 = a(a2, a3);
                    i = a5.a;
                    i2 = a5.b;
                }
            }
            if (!TextUtils.isEmpty(this.v)) {
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31a584259dd6c98266896ce6c59067ba", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.mach.text.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31a584259dd6c98266896ce6c59067ba");
        }
        int intValue = this.t == null ? Integer.MAX_VALUE : this.t.intValue();
        TextUtils.TruncateAt truncateAt = this.u != null ? this.u.f : null;
        Typeface a3 = h.a(com.sankuai.waimai.mach.text.d.b);
        if (a3 == null) {
            style = com.sankuai.waimai.mach.text.d.b.getStyle();
        } else {
            style = a3.getStyle();
        }
        int i3 = style;
        Typeface j = j(this.i);
        if (j == null && (this.h != null || this.j != null)) {
            a2 = h.a(this.h, this.j);
        } else {
            a2 = h.a(j);
        }
        Typeface typeface = a2;
        boolean z = intValue == 1;
        com.sankuai.waimai.mach.text.a aVar = new com.sankuai.waimai.mach.text.a();
        this.e = com.sankuai.waimai.mach.text.d.a(Mach.getContext(), i, i2, aVar, this.b, truncateAt, true, 1, intValue, -1, -1, 0, Integer.MAX_VALUE, 0.0f, 0.0f, 0.0f, -7829368, z, this.f, com.sankuai.waimai.mach.text.d.c, 0, this.g, this.x, 0.0f, 1.0f, this.s, i3, typeface, com.sankuai.waimai.mach.text.b.TEXT_START, 0, 0, 0, ac_().u(), null, false, 0, this.w);
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class e {
        public String a;
        public int b;
        public int c;
        public int d;
        public String e;
        public String f;
        public String g;
        public String h;

        public e() {
            this.a = "";
            this.g = "";
            this.h = "";
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    class b extends ImageSpan implements InterfaceC1059d {
        public static ChangeQuickRedirect c;

        public void a(View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbb08dbf116efa9f34d092f96b45e1c4", 4611686018427387906L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbb08dbf116efa9f34d092f96b45e1c4");
            }
        }

        public b(@NonNull Drawable drawable) {
            super(drawable);
            Object[] objArr = {d.this, drawable};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e71c8fe4e18c6212ae1d0c2e94b4fff", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e71c8fe4e18c6212ae1d0c2e94b4fff");
            }
        }

        @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
        public int getSize(@NonNull Paint paint, CharSequence charSequence, int i, int i2, @Nullable Paint.FontMetricsInt fontMetricsInt) {
            int i3;
            Object[] objArr = {paint, charSequence, Integer.valueOf(i), Integer.valueOf(i2), fontMetricsInt};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46bd279613c686828097d532c7bd828c", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46bd279613c686828097d532c7bd828c")).intValue();
            }
            Drawable drawable = getDrawable();
            if (fontMetricsInt != null) {
                Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
                if (fontMetricsInt2 == null) {
                    return drawable.getBounds().right;
                }
                int i4 = fontMetricsInt2.descent - fontMetricsInt2.ascent;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (d.this.y != null) {
                    intrinsicWidth = d.this.y.b;
                    intrinsicHeight = d.this.y.c;
                    i3 = d.this.y.d;
                } else {
                    i3 = 0;
                }
                if (intrinsicHeight < i4) {
                    int i5 = fontMetricsInt2.descent - fontMetricsInt2.ascent;
                    drawable.setBounds(i3, 0, ((int) ((i5 / intrinsicHeight) * intrinsicWidth)) + i3, i5);
                }
                int i6 = (intrinsicHeight - i4) / 2;
                fontMetricsInt.ascent = fontMetricsInt2.ascent - i6;
                fontMetricsInt.top = fontMetricsInt2.ascent - i6;
                fontMetricsInt.bottom = fontMetricsInt2.descent + i6;
                fontMetricsInt.descent = fontMetricsInt2.descent + i6;
            }
            return drawable.getBounds().right;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class c extends LinkMovementMethod {
        public static ChangeQuickRedirect a;
        private static c b;

        public static c a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5e40353112c2509452f3e131fa81c3e6", RobustBitConfig.DEFAULT_VALUE)) {
                return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5e40353112c2509452f3e131fa81c3e6");
            }
            if (b == null) {
                synchronized (c.class) {
                    if (b == null) {
                        b = new c();
                    }
                }
            }
            return b;
        }

        @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
        public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
            Object[] objArr = {textView, spannable, motionEvent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b22b517a8183d684b3ade0c27a63696", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b22b517a8183d684b3ade0c27a63696")).booleanValue();
            }
            int action = motionEvent.getAction();
            if (action == 1 || action == 0) {
                int x = ((int) motionEvent.getX()) - textView.getTotalPaddingLeft();
                int y = ((int) motionEvent.getY()) - textView.getTotalPaddingTop();
                int scrollX = x + textView.getScrollX();
                int scrollY = y + textView.getScrollY();
                Layout layout = textView.getLayout();
                int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), scrollX);
                InterfaceC1059d[] interfaceC1059dArr = (InterfaceC1059d[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, InterfaceC1059d.class);
                if (interfaceC1059dArr != null && interfaceC1059dArr.length > 0) {
                    InterfaceC1059d interfaceC1059d = interfaceC1059dArr[0];
                    if (action == 1) {
                        interfaceC1059d.a(textView);
                    } else {
                        Selection.setSelection(spannable, spannable.getSpanStart(interfaceC1059d), spannable.getSpanEnd(interfaceC1059d));
                    }
                    return true;
                }
                return super.onTouchEvent(textView, spannable, motionEvent);
            }
            return super.onTouchEvent(textView, spannable, motionEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class a extends ImageSpan {
        public static ChangeQuickRedirect a;

        public a(Drawable drawable) {
            super(drawable);
            Object[] objArr = {d.this, drawable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1dc40fb63ad40e563b0eef275fd02c9d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1dc40fb63ad40e563b0eef275fd02c9d");
            }
        }

        @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
        public final void draw(@NonNull Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, @NonNull Paint paint) {
            Object[] objArr = {canvas, charSequence, Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), paint};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b496c21bdccd947334ee1f36d92e04bc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b496c21bdccd947334ee1f36d92e04bc");
                return;
            }
            try {
                Drawable drawable = getDrawable();
                canvas.save();
                canvas.translate(f, (((i5 - i3) - drawable.getBounds().height()) / 2) + i3);
                drawable.draw(canvas);
                canvas.restore();
            } catch (Throwable unused) {
            }
        }

        @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
        public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
            Object[] objArr = {paint, charSequence, Integer.valueOf(i), Integer.valueOf(i2), fontMetricsInt};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4aa5556a40c10f142bf72224c48c4cae", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4aa5556a40c10f142bf72224c48c4cae")).intValue();
            }
            Drawable drawable = getDrawable();
            int i3 = d.this.y.b;
            int i4 = d.this.y.c;
            e unused = d.this.y;
            if (i3 == 0) {
                i3 = drawable.getIntrinsicWidth();
            }
            if (i4 == 0) {
                i4 = drawable.getIntrinsicHeight();
            }
            drawable.setBounds(0, 0, i3, i4);
            if (fontMetricsInt != null) {
                Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
                if (fontMetricsInt2 == null) {
                    return drawable.getBounds().right;
                }
                int i5 = fontMetricsInt2.descent - fontMetricsInt2.ascent;
                if (i4 > i5) {
                    int i6 = (i4 - i5) / 2;
                    fontMetricsInt.ascent = fontMetricsInt2.ascent - i6;
                    fontMetricsInt.top = fontMetricsInt2.ascent - i6;
                    fontMetricsInt.bottom = fontMetricsInt2.descent + i6;
                    fontMetricsInt.descent = fontMetricsInt2.descent + i6;
                }
            }
            return drawable.getBounds().right;
        }
    }
}
