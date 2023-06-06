package com.meituan.msc.views.text;

import android.os.Build;
import android.support.annotation.Nullable;
import com.dianping.titans.widget.DynamicTitleParser;
import com.meituan.android.recce.props.gens.TextAlign;
import com.meituan.metrics.sampler.fps.FpsEvent;
import com.meituan.msc.jse.bridge.JSApplicationIllegalArgumentException;
import com.meituan.msc.uimanager.ab;
import com.meituan.msc.uimanager.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class m {
    private static final int B;
    private static final int C;
    public static ChangeQuickRedirect a;
    protected float A;
    private final ab D;
    protected float b;
    protected boolean c;
    protected boolean d;
    protected int e;
    protected boolean f;
    protected int g;
    protected int h;
    protected int i;
    protected float j;
    protected float k;
    protected float l;
    protected int m;
    protected r n;
    protected float o;
    protected float p;
    protected float q;
    protected int r;
    protected boolean s;
    protected boolean t;
    protected boolean u;
    protected int v;
    protected int w;
    @Nullable
    protected String x;
    @Nullable
    protected String y;
    protected boolean z;

    static {
        int i = Build.VERSION.SDK_INT;
        B = 0;
        C = Build.VERSION.SDK_INT >= 23 ? 1 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0294  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public m(com.meituan.msc.uimanager.ab r29) {
        /*
            Method dump skipped, instructions count: 970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.views.text.m.<init>(com.meituan.msc.uimanager.ab):void");
    }

    public static int a(ab abVar) {
        Object[] objArr = {abVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "959ad63ab3fa177c406e9e5290bf5b87", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "959ad63ab3fa177c406e9e5290bf5b87")).intValue();
        }
        String b = abVar.a(TextAlign.LOWER_CASE_NAME) ? abVar.b(TextAlign.LOWER_CASE_NAME) : null;
        if (!"justify".equals(b)) {
            if (b == null || FpsEvent.TYPE_SCROLL_AUTO.equals(b)) {
                return 0;
            }
            if (!"left".equals(b)) {
                if ("right".equals(b)) {
                    return 5;
                }
                if ("center".equals(b)) {
                    return 1;
                }
                throw new JSApplicationIllegalArgumentException("Invalid textAlign: " + b);
            }
        }
        return 3;
    }

    public static int b(ab abVar) {
        Object[] objArr = {abVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ccc29aec8f4acaa9c27f6c64142208a1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ccc29aec8f4acaa9c27f6c64142208a1")).intValue();
        }
        if (!"justify".equals(abVar.a(TextAlign.LOWER_CASE_NAME) ? abVar.b(TextAlign.LOWER_CASE_NAME) : null) || Build.VERSION.SDK_INT < 26) {
            return B;
        }
        return 1;
    }

    private boolean a(String str, boolean z) {
        Object[] objArr = {str, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42acfcc61d781a35f7796aa3dd92ba22", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42acfcc61d781a35f7796aa3dd92ba22")).booleanValue();
        }
        if (this.D.a(str)) {
            return this.D.a(str, true);
        }
        return true;
    }

    private String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a9f6b337edc709ed31f76aa187d7a81", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a9f6b337edc709ed31f76aa187d7a81");
        }
        if (this.D.a(str)) {
            return this.D.b(str);
        }
        return null;
    }

    private int a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41d40cf7c53410d51c3db414254ee2f5", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41d40cf7c53410d51c3db414254ee2f5")).intValue() : this.D.a(str) ? this.D.a(str, i) : i;
    }

    private float a(String str, float f) {
        Object[] objArr = {str, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59847970e4ea3dc848ddcdc049240e47", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59847970e4ea3dc848ddcdc049240e47")).floatValue() : this.D.a(str) ? this.D.a(str, f) : f;
    }

    public final float a() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66e688589bbcd8e26e96fc5e23c21a20", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66e688589bbcd8e26e96fc5e23c21a20")).floatValue();
        }
        if (!Float.isNaN(this.b) && !Float.isNaN(this.A) && this.A > this.b) {
            z = true;
        }
        return z ? this.A : this.b;
    }

    private void a(float f) {
        float a2;
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "051e57d35305f6d8686b3477d9b505b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "051e57d35305f6d8686b3477d9b505b7");
            return;
        }
        this.k = f;
        if (f == -1.0f) {
            a2 = Float.NaN;
        } else if (this.d) {
            a2 = s.b(f);
        } else {
            a2 = s.a(f);
        }
        this.b = a2;
    }

    public final float b() {
        float a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5df0998173c8009cf1d5a138af60804e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5df0998173c8009cf1d5a138af60804e")).floatValue();
        }
        if (this.d) {
            a2 = s.b(this.l);
        } else {
            a2 = s.a(this.l);
        }
        if (this.i <= 0) {
            throw new IllegalArgumentException("FontSize should be a positive value. Current value: " + this.i);
        }
        return a2 / this.i;
    }

    private void b(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6438b252b23fca2f425e1e6577d445fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6438b252b23fca2f425e1e6577d445fc");
            return;
        }
        this.j = f;
        if (f != -1.0f) {
            if (this.d) {
                f = (float) Math.ceil(s.b(f));
            } else {
                f = (float) Math.ceil(s.a(f));
            }
        }
        this.i = (int) f;
    }

    private void a(@Nullable Integer num) {
        Object[] objArr = {num};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0cf7dcf96f4d9438968dbaf68bed6330", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0cf7dcf96f4d9438968dbaf68bed6330");
            return;
        }
        this.c = num != null;
        if (this.c) {
            this.e = num.intValue();
        }
    }

    private void c(@Nullable String str) {
        String[] split;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "391564dac6398ebecf285bc29186c568", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "391564dac6398ebecf285bc29186c568");
            return;
        }
        this.s = false;
        this.t = false;
        if (str != null) {
            for (String str2 : str.split(CommonConstant.Symbol.MINUS)) {
                if (DynamicTitleParser.PARSER_VAL_FONT_STYLE_UNDERLINE.equals(str2)) {
                    this.s = true;
                } else if ("strikethrough".equals(str2)) {
                    this.t = true;
                }
            }
        }
    }

    public static int a(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a9424786f469c6c2e78df0b7f5088d6b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a9424786f469c6c2e78df0b7f5088d6b")).intValue();
        }
        int i = C;
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
