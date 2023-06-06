package com.sankuai.waimai.store.search.template.machcontainer;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.config.i;
import com.sankuai.waimai.store.search.model.CommonMachData;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.store.search.adapterdelegates.b<Serializable, C1311a> {
    public static ChangeQuickRedirect a;
    private boolean b;
    private boolean c;

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    public final boolean a(@NonNull String str) {
        return false;
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    @NonNull
    public final /* synthetic */ C1311a a(LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3654e36d8428a6e00a57f62421308133", RobustBitConfig.DEFAULT_VALUE)) {
            return (C1311a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3654e36d8428a6e00a57f62421308133");
        }
        b bVar = new b(this.k, this.b, this.c);
        Object[] objArr2 = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        return new C1311a(PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "2590fe2dc94d0f9f1dbf118a2832ed3d", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "2590fe2dc94d0f9f1dbf118a2832ed3d") : bVar.a(viewGroup, -3), bVar);
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    @NonNull
    public final /* synthetic */ C1311a a(LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup, int i) {
        Object[] objArr = {layoutInflater, viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65dac1446c0b80e86c69164319bb5dad", RobustBitConfig.DEFAULT_VALUE)) {
            return (C1311a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65dac1446c0b80e86c69164319bb5dad");
        }
        b bVar = new b(this.k, this.b, this.c);
        return new C1311a(bVar.a(viewGroup, i), bVar);
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    public final /* synthetic */ void a(@NonNull C1311a c1311a) {
        C1311a c1311a2 = c1311a;
        Object[] objArr = {c1311a2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91b278c8df9621f4d1a4c1bf2e76e5b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91b278c8df9621f4d1a4c1bf2e76e5b5");
            return;
        }
        super.a((a) c1311a2);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = C1311a.a;
        if (PatchProxy.isSupport(objArr2, c1311a2, changeQuickRedirect2, false, "41424590ab67eb6abc9889638a09fd21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, c1311a2, changeQuickRedirect2, false, "41424590ab67eb6abc9889638a09fd21");
            return;
        }
        b bVar = c1311a2.b;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = b.a;
        if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "6eab38559617b5f50b0e75b01d713620", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "6eab38559617b5f50b0e75b01d713620");
        } else if (!bVar.k || bVar.e.t == null) {
        } else {
            bVar.e.t.b(bVar.f);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x019f, code lost:
        if (r8.equals("supermarket-search-drop-down-filter") != false) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d6  */
    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void a(@android.support.annotation.NonNull java.io.Serializable r24, @android.support.annotation.NonNull com.sankuai.waimai.store.search.template.machcontainer.a.C1311a r25, int r26) {
        /*
            Method dump skipped, instructions count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.search.template.machcontainer.a.a(java.lang.Object, android.support.v7.widget.RecyclerView$s, int):void");
    }

    public a(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3db359500ab2dc8fa422219026695cfa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3db359500ab2dc8fa422219026695cfa");
            return;
        }
        this.b = i.h().a("global_search_mach_delay_expose/stop_search_mach_delay_expose", true);
        this.c = i.h().a("search_mach_disable_expose_manager/disable_expose_manager", true);
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    public final boolean a(Serializable serializable) {
        return (serializable instanceof CommonMachData) && ((CommonMachData) serializable).mItem != null;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.search.template.machcontainer.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1311a extends RecyclerView.s {
        public static ChangeQuickRedirect a;
        public b b;

        public C1311a(View view, b bVar) {
            super(view);
            Object[] objArr = {view, bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75297d79a8efc94dbcde60ae36b611cc", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75297d79a8efc94dbcde60ae36b611cc");
            } else {
                this.b = bVar;
            }
        }
    }
}
