package com.meituan.android.neohybrid.v2.neo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b extends com.meituan.android.neohybrid.v2.neo.a {
    public static ChangeQuickRedirect d;
    private final Map<String, com.meituan.android.neohybrid.v2.neo.a> e;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void a(com.meituan.android.neohybrid.v2.neo.a aVar);
    }

    @Override // com.meituan.android.neohybrid.v2.neo.a
    public final String h() {
        return "manager";
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1820ceefdf678ec5d038a08f6b45caea", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1820ceefdf678ec5d038a08f6b45caea");
        } else {
            this.e = new HashMap();
        }
    }

    public void a(com.meituan.android.neohybrid.v2.neo.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62f2b30d1d312306f13b6aade8df1c82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62f2b30d1d312306f13b6aade8df1c82");
            return;
        }
        aVar.a(this.b);
        this.e.put(aVar.h(), aVar);
    }

    @Nullable
    public final com.meituan.android.neohybrid.v2.neo.a a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba02cd894cab20c50d17d945645542a6", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.neohybrid.v2.neo.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba02cd894cab20c50d17d945645542a6");
        }
        if (this.e == null || this.e.isEmpty()) {
            return null;
        }
        return this.e.get(str);
    }

    private void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "defd97673669595d16805db7e11ea6f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "defd97673669595d16805db7e11ea6f1");
        } else {
            a(aVar, true);
        }
    }

    public void a(a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3dce329e60442ca304bda3be3f632451", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3dce329e60442ca304bda3be3f632451");
        } else if (aVar != null) {
            for (com.meituan.android.neohybrid.v2.neo.a aVar2 : this.e.values()) {
                if (aVar2 != null && !aVar2.c && !aVar2.a(z)) {
                    aVar.a(aVar2);
                }
            }
        }
    }

    @Override // com.meituan.android.neohybrid.v2.neo.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffdbac03addce10ef5c820ae3a202551", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffdbac03addce10ef5c820ae3a202551");
        } else {
            a(g.a());
        }
    }

    @Override // com.meituan.android.neohybrid.v2.neo.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e555cc9044b749a65d1ed631e5622a8d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e555cc9044b749a65d1ed631e5622a8d");
        } else {
            a(j.a());
        }
    }

    @Override // com.meituan.android.neohybrid.v2.neo.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4aefe50d4d7f299c67d0f24b873ef645", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4aefe50d4d7f299c67d0f24b873ef645");
        } else {
            a(k.a());
        }
    }

    @Override // com.meituan.android.neohybrid.v2.neo.a
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b80d5c954742ff63c75710a9a701c95e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b80d5c954742ff63c75710a9a701c95e");
        } else {
            a(l.a());
        }
    }

    @Override // com.meituan.android.neohybrid.v2.neo.a
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34c3614a95fadc2dedc2926d97a5df88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34c3614a95fadc2dedc2926d97a5df88");
        } else {
            a(m.a());
        }
    }

    @Override // com.meituan.android.neohybrid.v2.neo.a
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac486e3087a65870bfc54319014a8f83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac486e3087a65870bfc54319014a8f83");
            return;
        }
        a(n.a());
        a(d.a());
        this.e.clear();
        a();
    }

    @Override // com.meituan.android.neohybrid.v2.neo.a
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e4fdbe17f00a32064ee711d452827a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e4fdbe17f00a32064ee711d452827a6");
            return;
        }
        Object[] objArr2 = {view};
        ChangeQuickRedirect changeQuickRedirect2 = h.a;
        a(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "962a92dddd53f13eb6bc0936a477f9ff", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "962a92dddd53f13eb6bc0936a477f9ff") : new h(view));
    }

    @Override // com.meituan.android.neohybrid.v2.neo.a
    public final void a(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28f6d6d43eb42d2e8165b7dd33363bc7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28f6d6d43eb42d2e8165b7dd33363bc7");
            return;
        }
        Object[] objArr2 = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = i.a;
        a(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c30259a397d206494d572d9b55fe5a3c", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c30259a397d206494d572d9b55fe5a3c") : new i(bundle));
    }

    @Override // com.meituan.android.neohybrid.v2.neo.a
    public final void a(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11a26189aa3c376b07ea1381b58ea1b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11a26189aa3c376b07ea1381b58ea1b4");
            return;
        }
        Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        a(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "fc140111b30f77061a3c3e46cd9b68ac", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "fc140111b30f77061a3c3e46cd9b68ac") : new e(i, i2, intent));
    }

    @Override // com.meituan.android.neohybrid.v2.neo.a
    public final void a(com.meituan.android.neohybrid.neo.n nVar) {
        Object[] objArr = {nVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cdb115a88772b59082c96afd6927e43e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cdb115a88772b59082c96afd6927e43e");
            return;
        }
        Object[] objArr2 = {nVar};
        ChangeQuickRedirect changeQuickRedirect2 = f.a;
        a(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "621c2da2ae824f3ffa37217fec4551b5", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "621c2da2ae824f3ffa37217fec4551b5") : new f(nVar));
    }
}
