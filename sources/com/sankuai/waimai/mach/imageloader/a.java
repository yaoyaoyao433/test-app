package com.sankuai.waimai.mach.imageloader;

import android.support.annotation.MainThread;
import android.text.TextUtils;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.meituan.android.recce.props.gens.TintColor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.c;
import com.sankuai.waimai.mach.imageloader.c;
import com.sankuai.waimai.mach.k;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public String b;
    public com.sankuai.waimai.mach.component.base.a c;
    private String d;
    private String e;
    private String f;
    private boolean g;
    private int[] h;
    private Float i;
    private Integer j;
    private Boolean k;
    private boolean l;
    private String[] m;

    public a(com.sankuai.waimai.mach.component.base.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f7b0424914d6e05dbf50f6b6bca87e6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f7b0424914d6e05dbf50f6b6bca87e6");
        } else {
            this.c = aVar;
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6847e767c13088c0c2c6d86d314c758e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6847e767c13088c0c2c6d86d314c758e");
            return;
        }
        String e = e("source");
        if (d(e)) {
            this.d = e;
        }
        String e2 = e(ReactTextInputShadowNode.PROP_PLACEHOLDER);
        if (d(e2)) {
            this.e = e2;
        } else {
            this.e = "";
        }
        String e3 = e("error");
        if (d(e3)) {
            this.f = e3;
        } else {
            this.f = "";
        }
        String e4 = e("disable-cdn-optimization");
        if (d(e4)) {
            this.g = b(e4);
        }
        if (!this.g) {
            String e5 = e("cdn-optimization-quality");
            if (d(e5)) {
                this.j = Integer.valueOf(Math.min(100, Math.max(c(e5), 0)));
            }
            String e6 = e("cdn-optimization-size");
            if (d(e6)) {
                String[] split = e6.split("\\.");
                if (split.length >= 2 && d(split[0]) && d(split[1])) {
                    this.h = new int[]{c(split[0]), c(split[1])};
                }
                if (split.length >= 3) {
                    this.j = Integer.valueOf(Math.min(100, Math.max(c(split[2]), 0)));
                }
            }
            if (this.h == null) {
                String e7 = e("cdn-optimization-multiple");
                if (d(e7)) {
                    this.i = Float.valueOf(a(e7));
                }
            }
            String e8 = e("cdn-optimization-webp");
            if (d(e8)) {
                this.k = Boolean.valueOf(b(e8));
            }
        }
        String e9 = e("retry");
        if (d(e9)) {
            this.l = b(e9);
        }
        String f = f("cap-insets");
        if (d(f)) {
            this.m = f.split("\\s+");
        }
        this.b = f(TintColor.NAME);
    }

    private float a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42aef6042a067109e992c9c46e815c86", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42aef6042a067109e992c9c46e815c86")).floatValue() : this.c.c(str);
    }

    private boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40d83e35eb2617b2db68d5c20bd72ef0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40d83e35eb2617b2db68d5c20bd72ef0")).booleanValue() : this.c.g(str);
    }

    private int c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ddbe553436357e514da6ed3868da8da", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ddbe553436357e514da6ed3868da8da")).intValue() : this.c.f(str);
    }

    private boolean d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8555eb8024102ecc0a75bcfa18d354d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8555eb8024102ecc0a75bcfa18d354d")).booleanValue() : this.c.i(str);
    }

    private String e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d47fbbc4de8b82511914781dd862fe6", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d47fbbc4de8b82511914781dd862fe6") : this.c.a(str);
    }

    private String f(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c58c60c5200677d2d758b960ee79c157", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c58c60c5200677d2d758b960ee79c157") : this.c.b(str);
    }

    @MainThread
    public final void a(k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d0164636964bed4df745e8349b8fa54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d0164636964bed4df745e8349b8fa54");
            return;
        }
        com.sankuai.waimai.mach.c imageLoader = this.c.m.getImageLoader();
        if (imageLoader == null) {
            return;
        }
        c.a aVar = new c.a();
        a(aVar);
        imageLoader.a(aVar, kVar);
    }

    private void a(c.a aVar) {
        int i;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53a5c16c4cbdfae1384c39448f7a7ad0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53a5c16c4cbdfae1384c39448f7a7ad0");
            return;
        }
        aVar.b = new c.a.C1000a();
        aVar.b.b = 1;
        aVar.b.c = this.d;
        com.sankuai.waimai.mach.node.a aVar2 = this.c.n;
        if (aVar2 != null) {
            String a2 = aVar2.a();
            aVar.b = a(this.d, a2);
            aVar.c = a(this.e, a2);
            aVar.d = a(this.f, a2);
        }
        aVar.a = aVar2;
        float s = this.c.ac_().s();
        float t = this.c.ac_().t();
        aVar.b.f = this.l;
        c.a.C1000a c1000a = aVar.b;
        if (this.k == null) {
            i = -1;
        } else {
            i = this.k.booleanValue() ? 1 : 0;
        }
        c1000a.d = i;
        if (!this.g) {
            if (this.h != null) {
                if (this.h[0] <= 0 && this.h[1] <= 0) {
                    aVar.b.e = null;
                } else if (this.h[0] <= 0) {
                    aVar.b.e = new int[]{(int) (this.h[1] * (s / t)), this.h[1]};
                } else if (this.h[1] <= 0) {
                    aVar.b.e = new int[]{this.h[0], (int) (this.h[0] * (t / s))};
                } else {
                    aVar.b.e = this.h;
                }
            } else if (this.i != null) {
                aVar.b.e = new int[]{(int) (this.i.floatValue() * s), (int) (this.i.floatValue() * t)};
            } else {
                aVar.b.e = new int[]{(int) s, (int) t};
            }
        }
        aVar.b.g = this.j != null ? this.j.intValue() : -1;
        int i2 = (int) s;
        int i3 = (int) t;
        aVar.d.e = new int[]{i2, i3};
        aVar.c.e = new int[]{i2, i3};
        if (this.m == null || this.m.length < 4) {
            return;
        }
        try {
            aVar.e = new c.b(this.m);
        } catch (Exception unused) {
        }
    }

    private c.a.C1000a a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8dda86e1bf1dd2b6a4a0b4f99d5e344", RobustBitConfig.DEFAULT_VALUE)) {
            return (c.a.C1000a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8dda86e1bf1dd2b6a4a0b4f99d5e344");
        }
        c.a.C1000a c1000a = new c.a.C1000a();
        c1000a.b = 0;
        c1000a.c = "";
        if (!TextUtils.isEmpty(str)) {
            if (str.startsWith("http")) {
                c1000a.b = 1;
                c1000a.c = str;
            } else if (str.startsWith("assets://")) {
                c1000a.b = 1;
                if (str2 == null) {
                    str2 = "";
                }
                c1000a.c = str.replaceFirst("assets://", str2);
            }
        }
        return c1000a;
    }
}
