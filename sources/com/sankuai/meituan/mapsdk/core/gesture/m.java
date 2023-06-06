package com.sankuai.meituan.mapsdk.core.gesture;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.UiThread;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ProGuard */
@UiThread
/* loaded from: classes4.dex */
public final class m extends l<a> {
    public static ChangeQuickRedirect h;
    private static final Set<Integer> t;
    public float i;
    public float j;
    float s;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        boolean a(m mVar, float f, float f2);
    }

    static {
        HashSet hashSet = new HashSet();
        t = hashSet;
        hashSet.add(2);
    }

    public m(Context context, AndroidGesturesManager androidGesturesManager) {
        super(context, androidGesturesManager);
        Object[] objArr = {context, androidGesturesManager};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bc975249c51c06a85b23c87e722645b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bc975249c51c06a85b23c87e722645b");
        }
    }

    @Override // com.sankuai.meituan.mapsdk.core.gesture.l
    @NonNull
    public final Set<Integer> b() {
        return t;
    }

    @Override // com.sankuai.meituan.mapsdk.core.gesture.h
    public final boolean c() {
        float degrees;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fde8da85beef6c4e762857c767f2b64", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fde8da85beef6c4e762857c767f2b64")).booleanValue();
        }
        super.c();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = h;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "51eec5027fb90e117f47d8ee845af765", RobustBitConfig.DEFAULT_VALUE)) {
            degrees = ((Float) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "51eec5027fb90e117f47d8ee845af765")).floatValue();
        } else {
            g gVar = this.m.get(new k(this.l.get(0), this.l.get(1)));
            degrees = (float) Math.toDegrees(Math.atan2(gVar.c, gVar.b) - Math.atan2(gVar.e, gVar.d));
        }
        this.j = degrees;
        if (this.j == 0.0f) {
            d();
        }
        this.i += this.j;
        if (k() && this.j != 0.0f) {
            return ((a) this.g).a(this, this.j, this.i);
        }
        if (a(2)) {
            j();
            return true;
        }
        return false;
    }

    @Override // com.sankuai.meituan.mapsdk.core.gesture.h, com.sankuai.meituan.mapsdk.core.gesture.a
    public final boolean a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fb86ef4a7dfdce4e11871bd789c700e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fb86ef4a7dfdce4e11871bd789c700e")).booleanValue() : Math.abs(this.i) >= this.s && super.a(i);
    }

    @Override // com.sankuai.meituan.mapsdk.core.gesture.l
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f7393804b833549a477252460de8933", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f7393804b833549a477252460de8933");
            return;
        }
        super.e();
        if (this.j == 0.0f) {
            this.q = 0.0f;
            this.r = 0.0f;
        }
        float f = this.q;
        float f2 = this.r;
        Object[] objArr2 = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect2 = h;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3cf409ab59409001804347e2b561abeb", RobustBitConfig.DEFAULT_VALUE)) {
            ((Float) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3cf409ab59409001804347e2b561abeb")).floatValue();
            return;
        }
        Math.abs((float) (((i().x * f2) + (i().y * f)) / (Math.pow(i().x, 2.0d) + Math.pow(i().y, 2.0d))));
        int i = (this.j > 0.0f ? 1 : (this.j == 0.0f ? 0 : -1));
    }

    @Override // com.sankuai.meituan.mapsdk.core.gesture.h
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e916cf0b365fa1d66f7cb50ee75245c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e916cf0b365fa1d66f7cb50ee75245c");
            return;
        }
        super.d();
        this.i = 0.0f;
    }
}
