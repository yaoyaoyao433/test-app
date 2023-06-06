package com.sankuai.waimai.router.core;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c implements i {
    public static ChangeQuickRedirect a;
    private final ArrayList<i> b;
    private final a c;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8df7cdf3c2859e2b5d42ba07862a872d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8df7cdf3c2859e2b5d42ba07862a872d");
            return;
        }
        this.b = new ArrayList<>();
        this.c = new a();
    }

    public final void a(@NonNull i iVar) {
        Object[] objArr = {iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "101b9f4a1b594dc91305da3811e0d790", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "101b9f4a1b594dc91305da3811e0d790");
        } else if (iVar != null) {
            this.b.add(iVar);
        }
    }

    @Override // com.sankuai.waimai.router.core.i
    public final void a(@NonNull j jVar, @NonNull g gVar) {
        Object[] objArr = {jVar, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fed1cb8a660ef4934bcf102cd72ac906", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fed1cb8a660ef4934bcf102cd72ac906");
        } else {
            this.c.a((Iterator) this.b.iterator(), jVar, gVar);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends com.sankuai.waimai.router.core.a<i> {
        public static ChangeQuickRedirect b;

        @Override // com.sankuai.waimai.router.core.a
        public final /* synthetic */ void a(@NonNull i iVar, @NonNull j jVar, @NonNull g gVar) {
            i iVar2 = iVar;
            Object[] objArr = {iVar2, jVar, gVar};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dac7e26d007389b9a8f3076752233bd8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dac7e26d007389b9a8f3076752233bd8");
                return;
            }
            if (d.b()) {
                d.a("    %s: intercept, request = %s", iVar2.getClass().getSimpleName(), jVar);
            }
            iVar2.a(jVar, gVar);
        }
    }
}
