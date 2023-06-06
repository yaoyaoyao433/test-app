package com.sankuai.waimai.business.search.adapterdelegates;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.s;
import android.support.v7.widget.StaggeredGridLayoutManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class b<T, VH extends RecyclerView.s> extends a<T, VH> {
    public static ChangeQuickRedirect d;

    public boolean a(T t) {
        return true;
    }

    @Override // com.sankuai.waimai.business.search.adapterdelegates.a, com.sankuai.waimai.business.search.adapterdelegates.c
    public final /* bridge */ /* synthetic */ void a(@NonNull Object obj, int i, @NonNull RecyclerView.s sVar, @NonNull List list) {
        a((List) ((List) obj), i, sVar, (List<Object>) list);
    }

    public b(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec998543d2b64615dc0a824352fc0102", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec998543d2b64615dc0a824352fc0102");
        }
    }

    @Override // com.sankuai.waimai.business.search.adapterdelegates.a
    public final void a(@NonNull List<T> list, int i, @NonNull RecyclerView.s sVar, @NonNull List<Object> list2) {
        Object[] objArr = {list, Integer.valueOf(i), sVar, list2};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72f2639a9e7acdcc7ce0403934656988", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72f2639a9e7acdcc7ce0403934656988");
            return;
        }
        if (sVar.itemView != null && (sVar.itemView.getLayoutParams() instanceof StaggeredGridLayoutManager.b)) {
            ((StaggeredGridLayoutManager.b) sVar.itemView.getLayoutParams()).b = a((b<T, VH>) list.get(i));
        }
        a((b<T, VH>) list.get(i), (T) sVar, i);
    }
}
