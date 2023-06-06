package com.sankuai.waimai.pouch;

import android.app.Activity;
import android.arch.lifecycle.k;
import android.arch.lifecycle.l;
import android.arch.lifecycle.q;
import android.content.Context;
import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.pouch.model.PouchDynamicAd;
import com.sankuai.waimai.pouch.view.PouchAdView;
import com.sankuai.waimai.pouch.view.d;
import com.sankuai.waimai.pouch.viewmodel.PouchViewModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public PouchAdView b;
    public com.sankuai.waimai.mach.b c;
    public Map<String, Object> d;
    public Map<String, String> e;
    public com.sankuai.waimai.pouch.view.c f;
    public d g;
    public com.sankuai.waimai.pouch.plugin.b h;
    public String i;
    public com.sankuai.waimai.mach.d j;
    public boolean k;
    PouchViewModel l;
    public l<Void> m;
    public b n;
    public ArrayList<l<Pair<String, Map<String, Object>>>> o;
    private ViewGroup p;
    private Context q;
    private com.sankuai.waimai.pouch.model.c r;
    private Rect s;
    private l<Void> t;

    /* compiled from: ProGuard */
    @Deprecated
    /* loaded from: classes5.dex */
    public interface b {
        void a(Map<String, Object> map);
    }

    private a(C1112a c1112a) {
        Object[] objArr = {c1112a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d75f0cb4ec4b30a3e37899b85cd27e29", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d75f0cb4ec4b30a3e37899b85cd27e29");
            return;
        }
        this.d = new HashMap();
        this.e = new HashMap();
        this.p = c1112a.c;
        this.q = c1112a.b;
        this.r = c1112a.d;
        this.j = c1112a.e;
        this.c = c1112a.f;
        this.h = c1112a.g;
        this.s = c1112a.h;
        try {
            if (this.q instanceof FragmentActivity) {
                this.l = (PouchViewModel) q.a((FragmentActivity) this.q).a(PouchViewModel.class);
                this.t = new l<Void>() { // from class: com.sankuai.waimai.pouch.a.1
                    public static ChangeQuickRedirect a;

                    @Override // android.arch.lifecycle.l
                    public final /* synthetic */ void a(@Nullable Void r20) {
                        Object[] objArr2 = {r20};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "25c5f3ae9e06057d90e60a0251016606", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "25c5f3ae9e06057d90e60a0251016606");
                            return;
                        }
                        a aVar = a.this;
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a.a;
                        if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "003f543922f66dc18cfe577bf99e1c11", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "003f543922f66dc18cfe577bf99e1c11");
                        } else if (aVar.l != null) {
                            aVar.l.c().a((k<Void>) null);
                        }
                    }
                };
                this.l.d().a(this.t);
            }
        } catch (Exception e) {
            Log.wtf("PouchAds", e);
        }
    }

    public final void a(@NonNull PouchDynamicAd pouchDynamicAd) {
        Object[] objArr = {pouchDynamicAd};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f283ef37f6b2d45e320aca6ffdb9de6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f283ef37f6b2d45e320aca6ffdb9de6");
        } else {
            a(pouchDynamicAd, (com.sankuai.waimai.pouch.model.b) null);
        }
    }

    public final <B> void a(@NonNull PouchDynamicAd pouchDynamicAd, @Nullable com.sankuai.waimai.pouch.model.b<B> bVar) {
        Object[] objArr = {pouchDynamicAd, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "149acf68ef5b72aeb829321d4bbe6cfb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "149acf68ef5b72aeb829321d4bbe6cfb");
            return;
        }
        a(pouchDynamicAd, false);
        if (this.b != null) {
            if (bVar != null && bVar.a() != null) {
                this.b.a(pouchDynamicAd, bVar);
            } else {
                this.b.b(pouchDynamicAd);
            }
        }
    }

    public final void a(Activity activity, com.sankuai.waimai.mach.recycler.b bVar, @NonNull PouchDynamicAd pouchDynamicAd) {
        Object[] objArr = {activity, bVar, pouchDynamicAd};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e010383884ad0f8975ca815f5d65191", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e010383884ad0f8975ca815f5d65191");
        } else if (bVar == null || pouchDynamicAd == null) {
        } else {
            a(pouchDynamicAd, true);
            if (this.b != null) {
                this.b.a(activity, bVar, pouchDynamicAd);
            }
        }
    }

    public final void a(@NonNull ViewGroup viewGroup, @NonNull PouchDynamicAd pouchDynamicAd) {
        Object[] objArr = {viewGroup, pouchDynamicAd};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf15e58589321b7ba6fb99739fc05deb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf15e58589321b7ba6fb99739fc05deb");
        } else if (this.b != null) {
            this.b.a(viewGroup, pouchDynamicAd);
        }
    }

    public void a(PouchDynamicAd pouchDynamicAd, boolean z) {
        Object[] objArr = {pouchDynamicAd, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cc916b2c2f88b2ce9f3eff52ff657df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cc916b2c2f88b2ce9f3eff52ff657df");
            return;
        }
        String str = pouchDynamicAd.adContainerId;
        if (TextUtils.isEmpty(str)) {
            str = pouchDynamicAd.defaultAdContainerId;
        }
        String str2 = str;
        if (this.b != null) {
            this.b.a();
        }
        this.b = com.sankuai.waimai.pouch.view.b.a(str2);
        if (this.b != null) {
            if (!TextUtils.isEmpty(pouchDynamicAd.businessName) && this.r != null) {
                if (this.r.h != null) {
                    this.r.h.put("business_name", pouchDynamicAd.businessName);
                    this.r.h.put("use_pouch", "1");
                    this.r.h.put("index", Integer.valueOf(pouchDynamicAd.index));
                } else {
                    HashMap hashMap = new HashMap();
                    hashMap.put("business_name", pouchDynamicAd.businessName);
                    hashMap.put("use_pouch", "1");
                    hashMap.put("index", Integer.valueOf(pouchDynamicAd.index));
                    this.r.h = hashMap;
                }
            }
            if (z) {
                this.b.a(this.q, this.r, pouchDynamicAd, this, str2);
            } else {
                this.b.a(this.q, this.p, this.r, pouchDynamicAd, this, str2);
            }
            this.b.a(new PouchAdView.a() { // from class: com.sankuai.waimai.pouch.a.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.pouch.view.PouchAdView.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "901a003e1d5a1d4ee117b2731cabdf2e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "901a003e1d5a1d4ee117b2731cabdf2e");
                    } else if (a.this.f != null) {
                        a.this.f.a();
                    }
                }

                @Override // com.sankuai.waimai.pouch.view.PouchAdView.a
                public final void b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d424dbb1e19c916f1417da83a0310c0d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d424dbb1e19c916f1417da83a0310c0d");
                    } else if (a.this.f != null) {
                        a.this.f.b();
                    }
                }

                @Override // com.sankuai.waimai.pouch.view.PouchAdView.a
                public final void c() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "44749c4749edfb39f0c31f1f397ee199", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "44749c4749edfb39f0c31f1f397ee199");
                    } else if (a.this.f != null) {
                        a.this.f.c();
                    }
                }
            });
            this.b.a(new PouchAdView.b() { // from class: com.sankuai.waimai.pouch.a.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.pouch.view.PouchAdView.b
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "515e583d2fa890846fa5598b9ac1a839", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "515e583d2fa890846fa5598b9ac1a839");
                    }
                }

                @Override // com.sankuai.waimai.pouch.view.PouchAdView.b
                public final void a(String str3) {
                    Object[] objArr2 = {str3};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "75e4019d8015050a9039c767be5af04c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "75e4019d8015050a9039c767be5af04c");
                    } else if (a.this.g != null) {
                        a.this.g.a(str3);
                    }
                }
            });
        }
    }

    public final void a(Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28323860c979db4d470054f8f7130e32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28323860c979db4d470054f8f7130e32");
            return;
        }
        if (this.b != null) {
            this.b.a(rect);
        }
        if (this.r != null) {
            this.r.i = rect;
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.pouch.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1112a {
        public static ChangeQuickRedirect a;
        public Context b;
        public ViewGroup c;
        public com.sankuai.waimai.pouch.model.c d;
        public com.sankuai.waimai.mach.d e;
        public com.sankuai.waimai.mach.b f;
        public com.sankuai.waimai.pouch.plugin.b g;
        public Rect h;

        public final a a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32e06cbb3c2b02b83c04c2271106bf10", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32e06cbb3c2b02b83c04c2271106bf10") : new a(this);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75619abe80a7a0128e9c0ee99563520d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75619abe80a7a0128e9c0ee99563520d");
        } else if (this.b != null) {
            this.b.i();
        }
    }

    public final void a(Set set, String str) {
        Object[] objArr = {set, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebbc01ded7848c14b63e17c4c7877d13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebbc01ded7848c14b63e17c4c7877d13");
        } else if (this.b != null) {
            this.b.a(set, str);
        }
    }

    public final Mach b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b466b1b3718765e01206e1b749da1b26", RobustBitConfig.DEFAULT_VALUE)) {
            return (Mach) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b466b1b3718765e01206e1b749da1b26");
        }
        if (this.b != null) {
            return this.b.b();
        }
        return null;
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9ec784d67ed8ca150c9d26ec6532943", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9ec784d67ed8ca150c9d26ec6532943");
        } else if (this.b != null) {
            this.i = null;
            this.b.c();
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0d340fbc7e29da2dffa7270e67236b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0d340fbc7e29da2dffa7270e67236b0");
        } else if (this.b != null) {
            this.b.f();
        }
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "878f3f271b4b1102f6b64ab86fb29dab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "878f3f271b4b1102f6b64ab86fb29dab");
        } else if (this.b != null) {
            this.b.g();
        }
    }

    public final void a(com.sankuai.waimai.pouch.model.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce10f34ed8ac53f67651506d99554510", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce10f34ed8ac53f67651506d99554510");
            return;
        }
        this.r = cVar;
        if (this.b != null) {
            this.b.a(cVar);
        }
    }

    public final void a(com.sankuai.waimai.mach.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46a5c5c3dfecd6b439f65c135615f556", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46a5c5c3dfecd6b439f65c135615f556");
            return;
        }
        this.c = bVar;
        if (this.b != null) {
            this.b.a(bVar);
        }
    }

    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61d65b25026ca1a177923c999151cfbf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61d65b25026ca1a177923c999151cfbf");
            return;
        }
        if (this.l != null && this.t != null) {
            this.l.d().b(this.t);
        }
        if (this.b != null) {
            this.b.a();
        }
    }

    public final com.sankuai.waimai.pouch.mach.container.a g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2201ec5aed19ad3693a1e078b87edef3", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.pouch.mach.container.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2201ec5aed19ad3693a1e078b87edef3");
        }
        if (this.b != null) {
            return this.b.k();
        }
        return null;
    }
}
