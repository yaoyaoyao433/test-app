package com.meituan.android.privacy.impl.config;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.android.privacy.impl.config.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class g implements b {
    public static ChangeQuickRedirect a;
    @NonNull
    final b b;
    @NonNull
    final Context c;
    final d d;
    final h<String> e;
    final h<String> f;
    private final e g;
    private Map<String, f> h;
    private Set<String> i;

    public g(@NonNull b bVar, @NonNull Context context, @NonNull e eVar, d dVar) {
        Object[] objArr = {bVar, context, eVar, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d45ffe751ef643641d44705af9bd5d8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d45ffe751ef643641d44705af9bd5d8");
            return;
        }
        this.e = new h<>(30);
        this.f = new h<>(30);
        this.i = Collections.emptySet();
        this.b = bVar;
        this.c = context;
        this.g = eVar;
        this.d = dVar;
        this.h = this.g.h;
        this.i = eVar.j;
    }

    public final void a(Map<String, f> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0149865fabd778698b4c5df8b08d3baf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0149865fabd778698b4c5df8b08d3baf");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.h);
        hashMap.putAll(map);
        this.h = hashMap;
        for (String str : map.keySet()) {
            this.f.a(str, false);
        }
    }

    public final void a(Set<String> set) {
        Object[] objArr = {set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e783efe8479884fbafedb842c276db6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e783efe8479884fbafedb842c276db6f");
            return;
        }
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.i);
        hashSet.addAll(set);
        this.i = hashSet;
        for (String str : set) {
            this.e.a(str, false);
        }
    }

    @Override // com.meituan.android.privacy.impl.config.b
    public final String a() {
        return this.g.f;
    }

    @Override // com.meituan.android.privacy.impl.config.b
    public final d.a a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "322886e0546405f157652fbd2311b360", RobustBitConfig.DEFAULT_VALUE) ? (d.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "322886e0546405f157652fbd2311b360") : this.b.a(str);
    }

    @Override // com.meituan.android.privacy.impl.config.b
    public final f a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f676c5a28ddd6368b23ebfdfa8b11110", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f676c5a28ddd6368b23ebfdfa8b11110");
        }
        f fVar = this.h.get(str);
        if (fVar != null) {
            return fVar;
        }
        if (this.i.contains(str)) {
            return null;
        }
        f a2 = this.b.a(str, z);
        if (z) {
            if (a2 != null) {
                this.f.a(str, true);
            } else {
                this.e.a(str, true);
            }
        }
        return a2;
    }

    @Override // com.meituan.android.privacy.impl.config.b
    @NonNull
    public final com.meituan.android.privacy.interfaces.config.a b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7fe3b7cc3684cecd0018c970856a500", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.privacy.interfaces.config.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7fe3b7cc3684cecd0018c970856a500");
        }
        if (this.g == null) {
            return com.meituan.android.privacy.interfaces.config.a.a();
        }
        e eVar = this.g;
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "f2e06c8a14d9f2e005670344e1544224", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.privacy.interfaces.config.a) PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "f2e06c8a14d9f2e005670344e1544224");
        }
        if (eVar.k == null || !eVar.k.containsKey(str)) {
            return com.meituan.android.privacy.interfaces.config.a.a();
        }
        return eVar.k.get(str);
    }

    @Override // com.meituan.android.privacy.impl.config.b
    public final com.meituan.android.privacy.interfaces.config.c a(f fVar, String str, String str2) {
        Object[] objArr = {fVar, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1511bc54ca6421e8a5d7aed27fd1b8f1", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.privacy.interfaces.config.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1511bc54ca6421e8a5d7aed27fd1b8f1") : k.a(str, str2, this.g.i, fVar);
    }
}
