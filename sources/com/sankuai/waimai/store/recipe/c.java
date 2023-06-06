package com.sankuai.waimai.store.recipe;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.SparseArray;
import android.view.View;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;
    @NonNull
    private final Context b;
    private final SparseArray<com.sankuai.waimai.store.expose.v2.entity.b> c;

    public c(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25536e94a23a9d2ab11771246807f35d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25536e94a23a9d2ab11771246807f35d");
            return;
        }
        this.c = new SparseArray<>();
        this.b = context;
    }

    public final void a(@NonNull String str, @NonNull Map<String, Object> map, View view, String str2) {
        Object[] objArr = {str, map, view, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0304ffdd27d071bce581f703f95c6b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0304ffdd27d071bce581f703f95c6b5");
        } else if (this.b instanceof com.sankuai.waimai.store.expose.v2.a) {
            com.sankuai.waimai.store.expose.v2.entity.b bVar = this.c.get(view.hashCode());
            if (bVar == null) {
                bVar = new com.sankuai.waimai.store.expose.v2.entity.b(str, view);
                this.c.put(view.hashCode(), bVar);
                com.sankuai.waimai.store.expose.v2.b.a().a((com.sankuai.waimai.store.expose.v2.a) this.b, bVar);
            }
            bVar.e = str2;
            bVar.b(map);
        }
    }

    public final void a(@NonNull String str, @NonNull Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51baf95aaccd07da6abb401db0a0de9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51baf95aaccd07da6abb401db0a0de9c");
        } else {
            com.sankuai.waimai.store.manager.judas.b.a(this.b, str).b(map).a(AppUtil.generatePageInfoKey(this.b)).a();
        }
    }
}
