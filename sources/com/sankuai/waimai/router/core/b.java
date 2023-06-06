package com.sankuai.waimai.router.core;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class b extends h {
    public static ChangeQuickRedirect d;
    private final com.sankuai.waimai.router.utils.d<h> a;
    private final a b;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50521ee37c2abe0d355f328f379f5900", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50521ee37c2abe0d355f328f379f5900");
            return;
        }
        this.a = new com.sankuai.waimai.router.utils.d<>();
        this.b = new a();
    }

    public b a(@NonNull h hVar, int i) {
        Object[] objArr = {hVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bec8544b1f1b02ebb7d13cdce952dc56", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bec8544b1f1b02ebb7d13cdce952dc56");
        }
        this.a.a(hVar, i);
        return this;
    }

    @Override // com.sankuai.waimai.router.core.h
    public boolean a(@NonNull j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6fa9c097f2192ddc86fa2de536880f2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6fa9c097f2192ddc86fa2de536880f2")).booleanValue() : !this.a.isEmpty();
    }

    @Override // com.sankuai.waimai.router.core.h
    public void a(@NonNull j jVar, @NonNull g gVar) {
        Object[] objArr = {jVar, gVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea2fccedf4c0962e3ee3fdf22fed429e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea2fccedf4c0962e3ee3fdf22fed429e");
        } else {
            this.b.a((Iterator) this.a.iterator(), jVar, gVar);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends com.sankuai.waimai.router.core.a<h> {
        public static ChangeQuickRedirect b;

        @Override // com.sankuai.waimai.router.core.a
        public final /* synthetic */ void a(@NonNull h hVar, @NonNull j jVar, @NonNull g gVar) {
            h hVar2 = hVar;
            Object[] objArr = {hVar2, jVar, gVar};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d23b6e5657e53a9d4f946332bec5467b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d23b6e5657e53a9d4f946332bec5467b");
            } else {
                hVar2.b(jVar, gVar);
            }
        }
    }
}
