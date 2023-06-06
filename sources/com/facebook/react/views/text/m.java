package com.facebook.react.views.text;

import android.os.Build;
import android.support.annotation.Nullable;
import com.dianping.titans.widget.DynamicTitleParser;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ag;
import com.facebook.react.uimanager.w;
import com.meituan.android.recce.props.gens.FontWeight;
import com.meituan.android.recce.props.gens.LetterSpacing;
import com.meituan.android.recce.props.gens.LineHeight;
import com.meituan.android.recce.props.gens.NumberOfLines;
import com.meituan.android.recce.props.gens.TextAlign;
import com.meituan.metrics.sampler.fps.FpsEvent;
import com.meituan.robust.common.CommonConstant;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class m {
    private static final int A;
    private static final int B;
    private final ag C;
    protected boolean c;
    protected int d;
    protected boolean e;
    protected int f;
    protected int g;
    protected float k;
    protected r m;
    protected float n;
    protected float o;
    protected float p;
    protected int q;
    protected boolean t;
    protected int u;
    protected int v;
    @Nullable
    protected String w;
    @Nullable
    protected String x;
    protected float a = Float.NaN;
    protected boolean b = false;
    protected int h = -1;
    protected float i = -1.0f;
    protected float j = -1.0f;
    protected int l = 0;
    protected boolean r = false;
    protected boolean s = false;
    protected boolean y = false;
    protected float z = Float.NaN;

    static {
        int i = Build.VERSION.SDK_INT;
        A = 0;
        B = Build.VERSION.SDK_INT >= 23 ? 1 : 0;
    }

    public m(ag agVar) {
        int i;
        int i2 = 0;
        this.c = true;
        this.e = false;
        this.g = -1;
        this.k = Float.NaN;
        this.m = r.UNSET;
        this.n = 0.0f;
        this.o = 0.0f;
        this.p = 1.0f;
        this.q = ReactBaseTextShadowNode.DEFAULT_TEXT_SHADOW_COLOR;
        this.t = true;
        this.u = -1;
        this.v = -1;
        this.w = null;
        this.x = null;
        this.C = agVar;
        int a = a(NumberOfLines.LOWER_CASE_NAME, -1);
        this.g = a == 0 ? -1 : a;
        a(a(LineHeight.LOWER_CASE_NAME, -1.0f));
        this.k = a(LetterSpacing.LOWER_CASE_NAME, Float.NaN);
        boolean a2 = a("allowFontScaling", true);
        if (a2 != this.c) {
            this.c = a2;
            b(this.i);
            a(this.j);
            this.k = this.k;
        }
        b(a("fontSize", -1.0f));
        a(agVar.a("color") ? Integer.valueOf(agVar.a("color", 0)) : null);
        a(agVar.a("foregroundColor") ? Integer.valueOf(agVar.a("foregroundColor", 0)) : null);
        Integer valueOf = agVar.a("backgroundColor") ? Integer.valueOf(agVar.a("backgroundColor", 0)) : null;
        this.e = valueOf != null;
        if (this.e) {
            this.f = valueOf.intValue();
        }
        this.w = b("fontFamily");
        String b = b(FontWeight.LOWER_CASE_NAME);
        int charAt = (b == null || b.length() != 3 || !b.endsWith("00") || b.charAt(0) > '9' || b.charAt(0) < '1') ? -1 : (b.charAt(0) - '0') * 100;
        if (charAt >= 500 || DynamicTitleParser.PARSER_VAL_FONT_STYLE_BOLD.equals(b)) {
            i = 1;
        } else {
            i = ("normal".equals(b) || (charAt != -1 && charAt < 500)) ? 0 : -1;
        }
        if (i != this.v) {
            this.v = i;
        }
        String b2 = b("fontStyle");
        if (DynamicTitleParser.PARSER_VAL_FONT_STYLE_ITALIC.equals(b2)) {
            i2 = 2;
        } else if (!"normal".equals(b2)) {
            i2 = -1;
        }
        if (i2 != this.u) {
            this.u = i2;
        }
        this.x = k.a(this.C.a("fontVariant") ? this.C.a.getArray("fontVariant") : null);
        this.t = a("includeFontPadding", true);
        c(b("textDecorationLine"));
        ReadableMap map = agVar.a(ReactBaseTextShadowNode.PROP_SHADOW_OFFSET) ? agVar.a.getMap(ReactBaseTextShadowNode.PROP_SHADOW_OFFSET) : null;
        this.n = 0.0f;
        this.o = 0.0f;
        if (map != null) {
            if (map.hasKey("width") && !map.isNull("width")) {
                this.n = w.a((float) map.getDouble("width"));
            }
            if (map.hasKey("height") && !map.isNull("height")) {
                this.o = w.a((float) map.getDouble("height"));
            }
        }
        float a3 = a("textShadowRadius", 1);
        if (a3 != this.p) {
            this.p = a3;
        }
        int a4 = a("textShadowColor", ReactBaseTextShadowNode.DEFAULT_TEXT_SHADOW_COLOR);
        if (a4 != this.q) {
            this.q = a4;
        }
        String b3 = b("textTransform");
        if (b3 == null || "none".equals(b3)) {
            this.m = r.NONE;
        } else if ("uppercase".equals(b3)) {
            this.m = r.UPPERCASE;
        } else if ("lowercase".equals(b3)) {
            this.m = r.LOWERCASE;
        } else if ("capitalize".equals(b3)) {
            this.m = r.CAPITALIZE;
        } else {
            throw new JSApplicationIllegalArgumentException("Invalid textTransform: " + b3);
        }
    }

    public static int a(ag agVar) {
        String b = agVar.a(TextAlign.LOWER_CASE_NAME) ? agVar.b(TextAlign.LOWER_CASE_NAME) : null;
        if ("justify".equals(b)) {
            return 3;
        }
        if (b == null || FpsEvent.TYPE_SCROLL_AUTO.equals(b)) {
            return 0;
        }
        if ("left".equals(b)) {
            return 3;
        }
        if ("right".equals(b)) {
            return 5;
        }
        if ("center".equals(b)) {
            return 1;
        }
        throw new JSApplicationIllegalArgumentException("Invalid textAlign: " + b);
    }

    public static int b(ag agVar) {
        if (!"justify".equals(agVar.a(TextAlign.LOWER_CASE_NAME) ? agVar.b(TextAlign.LOWER_CASE_NAME) : null) || Build.VERSION.SDK_INT < 26) {
            return A;
        }
        return 1;
    }

    private boolean a(String str, boolean z) {
        if (this.C.a(str)) {
            return this.C.a(str, true);
        }
        return true;
    }

    private String b(String str) {
        if (this.C.a(str)) {
            return this.C.b(str);
        }
        return null;
    }

    private int a(String str, int i) {
        return this.C.a(str) ? this.C.a(str, i) : i;
    }

    private float a(String str, float f) {
        return this.C.a(str) ? this.C.a(str, f) : f;
    }

    public final float a() {
        return !Float.isNaN(this.a) && !Float.isNaN(this.z) && (this.z > this.a ? 1 : (this.z == this.a ? 0 : -1)) > 0 ? this.z : this.a;
    }

    private void a(float f) {
        this.j = f;
        float f2 = Float.NaN;
        if (f != -1.0f) {
            if (!this.c) {
                f2 = w.a(f);
            } else {
                f2 = w.a(f, Float.NaN);
            }
        }
        this.a = f2;
    }

    public final float b() {
        float a;
        if (!this.c) {
            a = w.a(this.k);
        } else {
            a = w.a(this.k, Float.NaN);
        }
        if (this.h <= 0) {
            throw new IllegalArgumentException("FontSize should be a positive value. Current value: " + this.h);
        }
        return a / this.h;
    }

    private void b(float f) {
        this.i = f;
        if (f != -1.0f) {
            if (this.c) {
                f = (float) Math.ceil(w.a(f, Float.NaN));
            } else {
                f = (float) Math.ceil(w.a(f));
            }
        }
        this.h = (int) f;
    }

    private void a(@Nullable Integer num) {
        this.b = num != null;
        if (this.b) {
            this.d = num.intValue();
        }
    }

    private void c(@Nullable String str) {
        String[] split;
        this.r = false;
        this.s = false;
        if (str != null) {
            for (String str2 : str.split(CommonConstant.Symbol.MINUS)) {
                if (DynamicTitleParser.PARSER_VAL_FONT_STYLE_UNDERLINE.equals(str2)) {
                    this.r = true;
                } else if ("strikethrough".equals(str2)) {
                    this.s = true;
                }
            }
        }
    }

    public static int a(@Nullable String str) {
        int i = B;
        if (str != null) {
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1924829944) {
                if (hashCode == -902286926 && str.equals("simple")) {
                    c = 0;
                }
            } else if (str.equals("balanced")) {
                c = 1;
            }
            switch (c) {
                case 0:
                    return 0;
                case 1:
                    return 2;
                default:
                    return 1;
            }
        }
        return i;
    }
}
