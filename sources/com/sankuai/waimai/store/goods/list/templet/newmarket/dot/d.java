package com.sankuai.waimai.store.goods.list.templet.newmarket.dot;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.SparseArray;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends c {
    public static ChangeQuickRedirect d;
    private final SparseArray<com.sankuai.waimai.store.expose.v2.entity.b> e;
    private final boolean f;

    public d(@NonNull Context context, String str, boolean z) {
        super(context, str);
        Object[] objArr = {context, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c566cc96ce59f94daa7b6cbb8558981", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c566cc96ce59f94daa7b6cbb8558981");
            return;
        }
        this.e = new SparseArray<>();
        this.f = z;
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.dot.c
    public final void a(@NonNull String str, @NonNull Map<String, Object> map, View view, String str2) {
        Object[] objArr = {str, map, view, str2};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a75ef86df1a340c7deed100007e73cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a75ef86df1a340c7deed100007e73cc");
        } else {
            a(str, "", map, view, str2);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.dot.c
    public final void b(@NonNull String str, @NonNull Map<String, Object> map, View view, String str2) {
        Object[] objArr = {str, map, view, str2};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bd40f02255b80bf0c4866cde90e383c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bd40f02255b80bf0c4866cde90e383c");
        } else if (this.b instanceof com.sankuai.waimai.store.expose.v2.a) {
            com.sankuai.waimai.store.expose.v2.entity.b bVar = new com.sankuai.waimai.store.expose.v2.entity.b(str, view);
            bVar.e = str2;
            bVar.b(map);
            com.sankuai.waimai.store.expose.v2.b.a().a((com.sankuai.waimai.store.expose.v2.a) this.b, bVar);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.dot.c
    public final void a(@NonNull String str, @Nullable String str2, @NonNull Map<String, Object> map, View view, String str3) {
        Object[] objArr = {str, str2, map, view, str3};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75da19f7748df2e10f838a95073ec71a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75da19f7748df2e10f838a95073ec71a");
        } else if (this.b instanceof com.sankuai.waimai.store.expose.v2.a) {
            com.sankuai.waimai.store.expose.v2.entity.b bVar = this.e.get(view.hashCode());
            if (bVar == null) {
                bVar = new com.sankuai.waimai.store.expose.v2.entity.b(str, view);
                this.e.put(view.hashCode(), bVar);
                com.sankuai.waimai.store.expose.v2.b.a().a((com.sankuai.waimai.store.expose.v2.a) this.b, bVar);
            } else {
                bVar.g();
            }
            if (this.f && !t.a(str2)) {
                bVar.g = str2;
            }
            bVar.e = str3;
            bVar.b(map);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.dot.c
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a952a8c62d23eecddc4e25805bb1b4af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a952a8c62d23eecddc4e25805bb1b4af");
        } else if (view == null) {
        } else {
            this.e.remove(view.hashCode());
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.dot.c
    public final void a() {
        com.sankuai.waimai.store.expose.v2.c cVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73b2262d022236d5a47fec5bb10d5d96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73b2262d022236d5a47fec5bb10d5d96");
        } else if (this.f && (this.b instanceof com.sankuai.waimai.store.expose.v2.a)) {
            com.sankuai.waimai.store.expose.v2.b a = com.sankuai.waimai.store.expose.v2.b.a();
            com.sankuai.waimai.store.expose.v2.a aVar = (com.sankuai.waimai.store.expose.v2.a) this.b;
            Object[] objArr2 = {aVar};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.expose.v2.b.a;
            if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect2, false, "ebff28b9bfa05b5caf0740ba09636075", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect2, false, "ebff28b9bfa05b5caf0740ba09636075");
            } else if (aVar == null || (cVar = a.b.get(aVar)) == null) {
            } else {
                cVar.b();
            }
        }
    }
}
