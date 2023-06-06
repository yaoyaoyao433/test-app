package com.sankuai.xm.imui.common.processors;

import android.support.annotation.ColorInt;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class d {
    public static ChangeQuickRedirect a;
    private Boolean b;
    private Integer c;
    private Set<String> d;
    private boolean e;
    private Integer f;
    private List<e> g;
    private c h;
    private LinkProcessor i;
    private a j;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5401b3516f12e7c97a8e46567617481", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5401b3516f12e7c97a8e46567617481");
            return;
        }
        this.e = false;
        this.g = new ArrayList();
    }

    public final void a(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "454d9c61a4cc7961c857533ca9586608", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "454d9c61a4cc7961c857533ca9586608");
        } else if (eVar instanceof c) {
            this.h = (c) eVar;
        } else if (eVar instanceof a) {
            this.j = (a) eVar;
        } else if (eVar instanceof LinkProcessor) {
            this.i = (LinkProcessor) eVar;
        } else if (eVar != null) {
            this.g.add(eVar);
        }
    }

    public final CharSequence a(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f90d75df85e50d9f347d5e829aa35539", 6917529027641081856L)) {
            return (CharSequence) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f90d75df85e50d9f347d5e829aa35539");
        }
        if (charSequence == null) {
            return "";
        }
        if (this.h != null) {
            if (this.f != null) {
                charSequence = this.h.a(charSequence, this.f.intValue());
            } else {
                charSequence = this.h.a(charSequence);
            }
        }
        if (this.j != null) {
            charSequence = this.j.a(charSequence);
        }
        if (this.i != null) {
            if (!this.e) {
                if (this.c != null) {
                    this.i.b = this.c.intValue();
                }
                if (this.d != null) {
                    this.i.a(this.d);
                }
                if (this.b != null) {
                    this.i.c = this.b.booleanValue();
                }
                this.e = true;
            }
            charSequence = this.i.a(charSequence);
        }
        for (e eVar : this.g) {
            charSequence = eVar.a(charSequence);
        }
        return charSequence;
    }

    private d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c533c56e3c021b7a99d67c79d321eb3", 6917529027641081856L)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c533c56e3c021b7a99d67c79d321eb3");
        }
        if (this.i == null) {
            this.i = new LinkProcessor();
        }
        return this;
    }

    public final d a(@ColorInt int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "765e9c5e6d00f81086eb99d11d8bd9dd", 6917529027641081856L)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "765e9c5e6d00f81086eb99d11d8bd9dd");
        }
        this.c = Integer.valueOf(i);
        this.e = false;
        return a();
    }

    public final d a(Set<String> set) {
        Object[] objArr = {set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd97a244213dac0b38c8daaebe00e15a", 6917529027641081856L)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd97a244213dac0b38c8daaebe00e15a");
        }
        this.d = set;
        this.e = false;
        return a();
    }

    public final d a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44f0ca4faff5f39803985082dbdbdc35", 6917529027641081856L)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44f0ca4faff5f39803985082dbdbdc35");
        }
        this.b = Boolean.valueOf(z);
        this.e = false;
        return a();
    }

    public final d b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b43ecf027333e950002facf767d6ea76", 6917529027641081856L)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b43ecf027333e950002facf767d6ea76");
        }
        this.f = Integer.valueOf(i);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "026c2d47e5fed3373d1cb29f30210aa9", 6917529027641081856L)) {
            return (d) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "026c2d47e5fed3373d1cb29f30210aa9");
        }
        if (this.h == null) {
            this.h = f.b().a(com.sankuai.xm.base.f.m().g());
        }
        return this;
    }
}
