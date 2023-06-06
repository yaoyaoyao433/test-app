package com.sankuai.waimai.mach.component.base;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.CallSuper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.yoga.YogaEdge;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.animator.c;
import com.sankuai.waimai.mach.lifecycle.d;
import com.sankuai.waimai.machpro.view.b;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a<V extends View> extends d {
    public static ChangeQuickRedirect l;
    private b a;
    public Mach m;
    public com.sankuai.waimai.mach.node.a<V> n;
    public V o;
    public c p;
    public com.sankuai.waimai.mach.animator.d q;

    public abstract void a();

    public boolean ad_() {
        return true;
    }

    public abstract V b(Context context);

    public void j() {
    }

    /* JADX WARN: Removed duplicated region for block: B:212:0x00ca A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x00cc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x00d0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x00c9 A[SYNTHETIC] */
    @android.support.annotation.CallSuper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(V r25) {
        /*
            Method dump skipped, instructions count: 1158
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.mach.component.base.a.a(android.view.View):void");
    }

    @CallSuper
    public final void a(com.sankuai.waimai.mach.node.a<V> aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d746f0248725968d011fd5aba126e05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d746f0248725968d011fd5aba126e05");
            return;
        }
        this.n = aVar;
        if (!z) {
            e();
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = l;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "76430adc27aebc2e28da499aa50361ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "76430adc27aebc2e28da499aa50361ca");
        } else if (this.o != null) {
            ViewGroup.LayoutParams layoutParams = this.o.getLayoutParams();
            if ((layoutParams instanceof com.sankuai.waimai.mach.widget.d) && this.n.g != null) {
                com.sankuai.waimai.mach.expose.b machExpose = this.n.g.getMachExpose();
                com.sankuai.waimai.mach.widget.d dVar = (com.sankuai.waimai.mach.widget.d) layoutParams;
                dVar.w = this.n;
                dVar.a(machExpose);
                dVar.r = this.m;
                dVar.b = this.n.o;
                dVar.a(this.n.p, this.n.q, this.n.r, this.n.t, this.n.s);
                if (this.n.u != null && this.n.u.length > 2) {
                    dVar.a(this.n.u);
                }
                dVar.u = this.n.v;
                com.facebook.yoga.d dVar2 = this.n.c;
                dVar.leftMargin = (int) this.n.d();
                dVar.topMargin = (int) this.n.e();
                dVar.width = (int) dVar2.s();
                dVar.height = (int) dVar2.t();
                dVar.s = this.m.getLogReport();
                if (!(this.o instanceof ViewGroup)) {
                    this.o.setPadding((int) (dVar2.f(YogaEdge.LEFT) + dVar2.g(YogaEdge.LEFT)), (int) (dVar2.f(YogaEdge.TOP) + dVar2.g(YogaEdge.TOP)), (int) (dVar2.f(YogaEdge.RIGHT) + dVar2.g(YogaEdge.RIGHT)), (int) (dVar2.f(YogaEdge.BOTTOM) + dVar2.g(YogaEdge.BOTTOM)));
                }
                this.o.setLayoutParams(dVar);
                this.n.a(this.o);
            }
        }
        e();
        a((a<V>) this.o);
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a87e50c1a51cc8a2bc6d7ddbce2ac2ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a87e50c1a51cc8a2bc6d7ddbce2ac2ab");
            return;
        }
        f();
        a();
    }

    @Nullable
    public String a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "611713a6d797fe4c97db2ba6c237b22e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "611713a6d797fe4c97db2ba6c237b22e");
        }
        if (k() == null || !k().containsKey(str)) {
            return null;
        }
        return k().get(str).toString();
    }

    @Nullable
    public final String b(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "681cca9136d718a87be0033aff27fc50", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "681cca9136d718a87be0033aff27fc50");
        }
        if (l() == null || !l().containsKey(str)) {
            return null;
        }
        return l().get(str).toString();
    }

    @Nullable
    public final Map<String, Object> k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f4fa62410c9cd36a3ba9019cbfea932", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f4fa62410c9cd36a3ba9019cbfea932");
        }
        if (this.n == null) {
            return null;
        }
        return this.n.h();
    }

    @Nullable
    public final Map<String, Object> l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61c0b04cd4a1194a54e981a133005286", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61c0b04cd4a1194a54e981a133005286");
        }
        if (this.n == null) {
            return null;
        }
        return this.n.i();
    }

    public final float c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a6df3b9bb8205679e330740cb33bc64", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a6df3b9bb8205679e330740cb33bc64")).floatValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 0.0f;
        }
        try {
            return Float.parseFloat(str);
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    public final long d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71b27552cc0db1ea4f1bd06b65b444a6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71b27552cc0db1ea4f1bd06b65b444a6")).longValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        try {
            return Long.parseLong(str);
        } catch (Exception unused) {
            return 0L;
        }
    }

    public final double e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88f8cb44e055a50b0553532165db9475", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88f8cb44e055a50b0553532165db9475")).doubleValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 0.0d;
        }
        try {
            return Double.parseDouble(str);
        } catch (Exception unused) {
            return 0.0d;
        }
    }

    public final int f(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e39301a1295110c14156c7d9d4c4c76", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e39301a1295110c14156c7d9d4c4c76")).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return 0;
        }
    }

    public final boolean g(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e87686d776d621c000b124229b6875a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e87686d776d621c000b124229b6875a")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return Boolean.parseBoolean(str);
        } catch (Exception unused) {
            return false;
        }
    }

    public final int h(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e31e469dbe8988d1ad885a5a167719e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e31e469dbe8988d1ad885a5a167719e")).intValue();
        }
        try {
            return Color.parseColor(str);
        } catch (Exception unused) {
            return -16777216;
        }
    }

    public final boolean i(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = l;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "094144f48e96d255c6f6b3c723ecc11c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "094144f48e96d255c6f6b3c723ecc11c")).booleanValue() : !TextUtils.isEmpty(str);
    }

    public com.facebook.yoga.d ac_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01101cbcf38ea5f501b745aab0cdf039", RobustBitConfig.DEFAULT_VALUE) ? (com.facebook.yoga.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01101cbcf38ea5f501b745aab0cdf039") : this.n.c;
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a55493a02e8e4d8b9e6fa166a390bc2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a55493a02e8e4d8b9e6fa166a390bc2");
        } else if (this.n.u != null) {
            g();
        }
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e02e055099dcc082d42633a994bb1916", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e02e055099dcc082d42633a994bb1916");
            return;
        }
        com.sankuai.waimai.mach.node.a aVar = this.n.e;
        d dVar = aVar != null ? aVar.h : null;
        if (dVar instanceof com.sankuai.waimai.mach.component.a) {
            ((com.sankuai.waimai.mach.component.a) dVar).c(false);
        }
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "704d56a4b27a7a53aa6cf4ec3cf383bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "704d56a4b27a7a53aa6cf4ec3cf383bf");
        } else {
            this.o = null;
        }
    }
}
