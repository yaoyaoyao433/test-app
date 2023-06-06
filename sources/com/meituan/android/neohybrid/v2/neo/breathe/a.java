package com.meituan.android.neohybrid.v2.neo.breathe;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ValueCallback;
import com.dianping.shield.entity.ExposeAction;
import com.google.gson.JsonObject;
import com.meituan.android.neohybrid.core.config.BreatheConfig;
import com.meituan.android.neohybrid.util.f;
import com.meituan.android.pay.common.promotion.bean.PayLabelConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final Handler d = new Handler(Looper.getMainLooper());
    public boolean b;
    private final com.meituan.android.neohybrid.v2.core.a c;
    private int e;
    private int f;
    private long g;
    private long h;
    private String i;
    private int j;
    private String k;
    private Set<Long> l;
    private boolean m;
    private boolean n;
    private boolean o;
    private int p;
    private long q;
    private long r;
    private long s;
    private String t;

    public static /* synthetic */ void a(a aVar, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "01ccc7260fec7bcf5282d4cd5aa5fb26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "01ccc7260fec7bcf5282d4cd5aa5fb26");
        } else if (aVar.a()) {
            try {
                if (aVar.l != null) {
                    aVar.l.clear();
                }
                if (str != null && !str.equals(StringUtil.NULL)) {
                    JSONObject jSONObject = new JSONObject(str);
                    JSONObject optJSONObject = jSONObject.optJSONObject("data");
                    int optInt = jSONObject.optInt("code");
                    if (optInt == -1) {
                        aVar.a("neo_breathe: err, code is -1");
                        return;
                    } else if (optInt == -2) {
                        aVar.a("neo_breathe: display handle, code is -2");
                        return;
                    } else {
                        String optString = optJSONObject.optString("breatheId");
                        if (aVar.i.equals(optString)) {
                            aVar.a("neo_breathe: err - breatheId is same");
                        }
                        aVar.i = optString;
                        if (aVar.n) {
                            int optInt2 = optJSONObject.optInt("pX", -1);
                            int optInt3 = optJSONObject.optInt("pY", -1);
                            if (optInt2 != -1 && optInt3 != -1) {
                                View j = aVar.c.b().j();
                                Object[] objArr2 = {j, Integer.valueOf(optInt2), Integer.valueOf(optInt3)};
                                ChangeQuickRedirect changeQuickRedirect2 = a;
                                if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "a6082a5b64b5c8d2266b45ca3c1b5668", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "a6082a5b64b5c8d2266b45ca3c1b5668");
                                } else {
                                    long currentTimeMillis = System.currentTimeMillis();
                                    Bitmap createBitmap = Bitmap.createBitmap(j.getWidth(), j.getHeight(), Bitmap.Config.RGB_565);
                                    j.draw(new Canvas(createBitmap));
                                    int pixel = createBitmap.getPixel(optInt2, optInt3);
                                    int red = Color.red(pixel);
                                    int green = Color.green(pixel);
                                    int blue = Color.blue(pixel);
                                    int alpha = Color.alpha(pixel);
                                    String str2 = "[" + red + CommonConstant.Symbol.COMMA + green + CommonConstant.Symbol.COMMA + blue + CommonConstant.Symbol.COMMA + alpha + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT;
                                    aVar.k = str2;
                                    f.a("neo_breathe: 像素点检测，RGBA=" + str2 + "; 耗时=" + (System.currentTimeMillis() - currentTimeMillis));
                                    if (alpha == 0) {
                                        aVar.a("neo_breathe: 像素点获取报错，页面透明");
                                        aVar.b();
                                    } else if (red == 255 && green == 255 && blue == 255) {
                                        aVar.a("neo_breathe: 像素点获取报错，页面白屏");
                                        aVar.b();
                                    } else if (red == 0 && green == 0 && blue == 0) {
                                        aVar.a("neo_breathe: 像素点获取报错，页面黑屏");
                                        aVar.b();
                                    }
                                }
                            }
                            f.a("neo_breathe: 像素点检测功能未启用");
                            return;
                        }
                        if (aVar.o) {
                            int optInt4 = optJSONObject.optInt("domCount", -1);
                            if (optInt4 == -1) {
                                f.a("neo_breathe: DOM数检测功能未启用");
                                return;
                            }
                            if (optInt4 == 0) {
                                aVar.a("neo_breathe: DOM数为0");
                                aVar.b();
                            } else {
                                aVar.j = optInt4;
                            }
                            if (aVar.j > 0 && aVar.j != optInt4) {
                                aVar.a("neo_breathe: err - domCount is not same. latestDomCount = " + aVar.j + "; currentDomCount = " + optInt4);
                            }
                            f.a("neo_breathe: DOM数=" + optInt4);
                            return;
                        }
                        return;
                    }
                }
                f.a("neo_breathe: err, jsData is null");
            } catch (Exception e) {
                aVar.a("neo_breathe: breacheAnalyse e = " + e.toString());
                if (aVar.l != null) {
                    aVar.l.clear();
                }
            }
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public a(com.meituan.android.neohybrid.v2.core.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f62f824baaca5f4549e9cc5d63780737", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f62f824baaca5f4549e9cc5d63780737");
            return;
        }
        this.e = 0;
        this.f = 0;
        this.g = 0L;
        this.h = 0L;
        this.i = "-1";
        this.j = -1;
        this.k = "[-1,-1,-1,-1]";
        this.l = new HashSet();
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = 2;
        this.q = ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE;
        this.r = 100L;
        this.s = ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE;
        this.t = PayLabelConstants.KEY_LABEL_CHECK;
        this.b = true;
        this.c = aVar;
        if (this.c == null || this.c.b() == null || !a()) {
            return;
        }
        BreatheConfig breathConfig = aVar.f().breathConfig();
        this.m = breathConfig.isEnableNeoBreathe();
        this.n = breathConfig.isEnablePixelColor();
        this.o = breathConfig.isEnableCheckDomCount();
        this.p = breathConfig.getBreatheUnresponsiveTimesAsBroken();
        this.q = breathConfig.getBreatheIntervalTimeMillis();
        this.r = breathConfig.getBreatheDelayMillis();
        this.s = breathConfig.getBreatheTimeoutMillis();
        this.t = breathConfig.getBreatheDeathOptions();
        this.h = System.currentTimeMillis();
        this.c.b().j().setOnTouchListener(b.a(this));
    }

    public static /* synthetic */ boolean a(a aVar, View view, MotionEvent motionEvent) {
        Object[] objArr = {aVar, view, motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6a16b32deb028635a336c78276230306", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6a16b32deb028635a336c78276230306")).booleanValue();
        }
        if (motionEvent.getAction() == 1) {
            aVar.e++;
            aVar.a(false);
        }
        return false;
    }

    @SuppressLint({"ObsoleteSdkInt"})
    private boolean a() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a663cfec6f023fea14d97dc450b03eda", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a663cfec6f023fea14d97dc450b03eda")).booleanValue();
        }
        if (Build.VERSION.SDK_INT < 19 || this.c == null || this.c.f() == null || this.c.b() == null || !this.b) {
            return false;
        }
        BreatheConfig breathConfig = this.c.f().breathConfig();
        if (breathConfig != null && breathConfig.isEnableNeoBreathe()) {
            z = true;
        }
        this.m = z;
        return this.m;
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee7a4ed2e69028c99904d29eae029fff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee7a4ed2e69028c99904d29eae029fff");
        } else if (a() && this.b) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.g <= this.q) {
                return;
            }
            this.g = currentTimeMillis;
            if (Looper.myLooper() != Looper.getMainLooper()) {
                a(c.a(this, z));
            } else {
                a(b(z), this.r);
            }
        }
    }

    public static /* synthetic */ void b(a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a4ab9a73bfac04c1d09263bbf7cbcb5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a4ab9a73bfac04c1d09263bbf7cbcb5b");
        } else {
            aVar.a(z);
        }
    }

    private Runnable b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73760f73c0367aabc53d599ae0c55476", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73760f73c0367aabc53d599ae0c55476") : d.a(this, z);
    }

    public static /* synthetic */ void a(a aVar, boolean z) {
        String str;
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f07062db79bd711550a27f0be54df2ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f07062db79bd711550a27f0be54df2ea");
        } else if (aVar.c == null || aVar.c.b() == null) {
        } else {
            aVar.f++;
            f.a("neo_breathe: start neo breathe, breatheTimes=" + aVar.f + " ,breathe time=" + (System.currentTimeMillis() - aVar.h));
            com.meituan.android.neohybrid.protocol.kernel.c b = aVar.c.b();
            long currentTimeMillis = System.currentTimeMillis();
            Object[] objArr2 = {new Long(currentTimeMillis)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "3aaf54047dacd80678b69e976948e576", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "3aaf54047dacd80678b69e976948e576");
            } else {
                if (aVar.l == null) {
                    aVar.l = new HashSet();
                }
                aVar.l.add(Long.valueOf(currentTimeMillis));
            }
            final long currentTimeMillis2 = System.currentTimeMillis();
            Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "376045da147b0028da738c7ab9551480", RobustBitConfig.DEFAULT_VALUE)) {
                str = (String) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "376045da147b0028da738c7ab9551480");
            } else {
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("breatheId", Integer.valueOf(aVar.f));
                jsonObject.addProperty("checkDisplay", Boolean.valueOf(z));
                str = "javascript:NeoScope.breathe(" + jsonObject.toString() + CommonConstant.Symbol.BRACKET_RIGHT;
                f.a(str);
            }
            b.a(str, new ValueCallback<String>() { // from class: com.meituan.android.neohybrid.v2.neo.breathe.a.1
                public static ChangeQuickRedirect a;

                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(String str2) {
                    String str3 = str2;
                    Object[] objArr4 = {str3};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "1995d0e7d6375dc393e7c1cc8a139045", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "1995d0e7d6375dc393e7c1cc8a139045");
                        return;
                    }
                    f.a("neo_breathe: 单次evaluateJavascript耗时" + (System.currentTimeMillis() - currentTimeMillis2));
                    a.a(a.this, str3);
                }
            });
            aVar.a(e.a(aVar), aVar.s);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
        if (r1.equals("recreate") != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b() {
        /*
            r11 = this;
            r0 = 0
            java.lang.Object[] r8 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.android.neohybrid.v2.neo.breathe.a.a
            java.lang.String r10 = "36e8d298b4b0e57db4268c63364c07e8"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L18
            com.meituan.robust.PatchProxy.accessDispatch(r8, r11, r9, r0, r10)
            return
        L18:
            boolean r1 = r11.a()
            if (r1 != 0) goto L1f
            return
        L1f:
            java.lang.String r1 = r11.t
            r2 = -1
            int r3 = r1.hashCode()
            r4 = -934641255(0xffffffffc84a8199, float:-207366.39)
            if (r3 == r4) goto L59
            r4 = -796853009(0xffffffffd080fcef, float:-1.73124792E10)
            if (r3 == r4) goto L4f
            r0 = 94627080(0x5a3e508, float:1.5412579E-35)
            if (r3 == r0) goto L45
            r0 = 1308176501(0x4df93075, float:5.22587808E8)
            if (r3 == r0) goto L3b
            goto L64
        L3b:
            java.lang.String r0 = "downgrade"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L64
            r0 = 2
            goto L65
        L45:
            java.lang.String r0 = "check"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L64
            r0 = 3
            goto L65
        L4f:
            java.lang.String r3 = "recreate"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L64
            goto L65
        L59:
            java.lang.String r0 = "reload"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L64
            r0 = 1
            goto L65
        L64:
            r0 = -1
        L65:
            switch(r0) {
                case 0: goto L7b;
                case 1: goto L71;
                case 2: goto L69;
                default: goto L68;
            }
        L68:
            goto L85
        L69:
            com.meituan.android.neohybrid.v2.core.a r0 = r11.c
            java.lang.String r1 = "downgrade_breathe_death"
            r0.a(r1)
            goto L85
        L71:
            com.meituan.android.neohybrid.v2.core.a r0 = r11.c
            com.meituan.android.neohybrid.protocol.kernel.c r0 = r0.b()
            r0.a()
            return
        L7b:
            com.meituan.android.neohybrid.v2.core.a r0 = r11.c
            android.app.Activity r0 = r0.d()
            r0.recreate()
            return
        L85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.neohybrid.v2.neo.breathe.a.b():void");
    }

    private void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87f9acca0e48d83e0c8567f8f9863932", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87f9acca0e48d83e0c8567f8f9863932");
        } else {
            d.post(runnable);
        }
    }

    private void a(Runnable runnable, long j) {
        Object[] objArr = {runnable, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2ec4f6dc4f25f65ca1d8cee4d561d2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2ec4f6dc4f25f65ca1d8cee4d561d2f");
        } else {
            d.postDelayed(runnable, j);
        }
    }

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ebeca798c174e1de3b573203555d3af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ebeca798c174e1de3b573203555d3af");
            return;
        }
        try {
            f.a(str);
            com.meituan.android.neohybrid.v2.neo.report.a.b(this.c, "b_pay_neo_native_common_exception_mv", com.meituan.android.neohybrid.neo.report.a.c("neo_breathe_msg", str).a("neo_breathe_time", Long.valueOf(System.currentTimeMillis() - this.h)).a("neo_breathe_touchup_times", Integer.valueOf(this.e)).a("neo_breathe_breathe_times", Integer.valueOf(this.f)).a("neo_breathe_breathe_id", this.i).a("neo_breathe_dom_count", Integer.valueOf(this.j)).a("neo_breathe_rgba", this.k).a("neo_breathe_uniqueid", this.c.l()).a("neo_breathe_url", this.c.j()).a("neo_breathe_is_foreground", Boolean.valueOf(this.c.h())).b);
        } catch (Exception unused) {
            com.meituan.android.neohybrid.v2.neo.report.a.b(this.c, "b_pay_neo_native_common_exception_mv", com.meituan.android.neohybrid.neo.report.a.c("neo_breathe_e", str).b);
        }
    }

    public static /* synthetic */ void a(a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "34d311cf548b0b661c1c799ddbad27b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "34d311cf548b0b661c1c799ddbad27b4");
        } else if (aVar.a()) {
            f.a("neo_breathe: breatheEventsTimestamp.size=" + aVar.l.size());
            if (aVar.p <= 0) {
                return;
            }
            if (aVar.l.size() > 0) {
                aVar.a("neo_breathe: breathe is broken, times is " + aVar.l.size());
            }
            if (aVar.l.size() >= aVar.p) {
                aVar.a("neo_breathe: breathe is over.");
                aVar.b();
            }
        }
    }
}
