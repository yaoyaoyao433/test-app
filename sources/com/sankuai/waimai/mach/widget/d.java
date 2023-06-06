package com.sankuai.waimai.mach.widget;

import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.Mach;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends FrameLayout.LayoutParams {
    public static ChangeQuickRedirect a;
    private float A;
    private float B;
    private float C;
    private boolean D;
    public com.sankuai.waimai.mach.model.value.a b;
    public String c;
    public com.sankuai.waimai.mach.parser.d d;
    public String e;
    public com.sankuai.waimai.mach.parser.d f;
    public com.sankuai.waimai.mach.parser.d g;
    public com.sankuai.waimai.mach.parser.d h;
    public com.sankuai.waimai.mach.parser.d i;
    public com.sankuai.waimai.mach.parser.d j;
    public com.sankuai.waimai.mach.parser.d k;
    public com.sankuai.waimai.mach.parser.d l;
    public com.sankuai.waimai.mach.parser.d m;
    public Map<String, Object> n;
    public Map<String, Object> o;
    public Map<String, Object> p;
    public Map<String, Object> q;
    public Mach r;
    public com.sankuai.waimai.mach.d s;
    public com.sankuai.waimai.mach.widget.decorations.b t;
    public Float u;
    public com.sankuai.waimai.mach.b v;
    public com.sankuai.waimai.mach.node.a w;
    private float[] x;
    private float y;
    private float z;

    public d(d dVar) {
        super((FrameLayout.LayoutParams) dVar);
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a339f1cafae1b0413d126354cc5efa87", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a339f1cafae1b0413d126354cc5efa87");
            return;
        }
        this.x = dVar.x;
        this.b = dVar.b;
        this.y = dVar.y;
        this.z = dVar.z;
        this.A = dVar.A;
        this.B = dVar.B;
        this.c = dVar.c;
        this.d = dVar.d;
        this.e = dVar.e;
        this.f = dVar.f;
        this.g = dVar.g;
        this.h = dVar.h;
        this.i = dVar.i;
        this.j = dVar.j;
        this.k = dVar.k;
        this.l = dVar.l;
        this.m = dVar.m;
        this.n = dVar.n;
        this.o = dVar.o;
        this.p = dVar.p;
        this.q = dVar.q;
        this.r = dVar.r;
        this.C = dVar.C;
        this.s = dVar.s;
        this.t = dVar.t;
        this.u = dVar.u;
        this.D = dVar.D;
        this.v = dVar.v;
        this.w = dVar.w;
    }

    public d(int i, int i2) {
        super(i, i2);
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2503b53a2043590547483cd29e8a558", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2503b53a2043590547483cd29e8a558");
        }
    }

    public final void a(float f, float f2, float f3, float f4, float f5) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ee4b75d831950cff261f2758f0004ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ee4b75d831950cff261f2758f0004ae");
            return;
        }
        float f6 = f;
        this.C = f6;
        this.y = f2 > 0.0f ? f2 : f6;
        this.z = f3 > 0.0f ? f3 : f6;
        this.A = f4 > 0.0f ? f4 : f6;
        if (f5 > 0.0f) {
            f6 = f5;
        }
        this.B = f6;
    }

    public final boolean a() {
        return this.y == this.z && this.y == this.A && this.y == this.B;
    }

    public final float[] b() {
        if (this.x == null) {
            this.x = new float[]{this.y, this.y, this.z, this.z, this.A, this.A, this.B, this.B};
        }
        return this.x;
    }

    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc968b838bb7da2a1bed80881a564e57", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc968b838bb7da2a1bed80881a564e57")).booleanValue() : this.C > 0.0f || this.y > 0.0f || this.z > 0.0f || this.A > 0.0f || this.B > 0.0f;
    }

    public final void a(String[] strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "138b4f808226df59bfbadad0047a40f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "138b4f808226df59bfbadad0047a40f4");
        } else if (strArr != null) {
            this.t = new com.sankuai.waimai.mach.widget.decorations.b(strArr);
        }
    }

    public final void a(com.sankuai.waimai.mach.expose.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3550fb895b24a8b984ea29757ab14c84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3550fb895b24a8b984ea29757ab14c84");
            return;
        }
        this.c = bVar.b;
        this.d = bVar.c;
        this.e = bVar.d;
        this.f = bVar.e;
        this.g = bVar.f;
        this.h = bVar.g;
        this.i = bVar.h;
        this.j = bVar.i;
        this.k = bVar.j;
        this.n = bVar.m;
        this.l = bVar.k;
        this.o = bVar.o;
        this.m = bVar.l;
        this.p = bVar.n;
        this.q = bVar.p;
    }
}
