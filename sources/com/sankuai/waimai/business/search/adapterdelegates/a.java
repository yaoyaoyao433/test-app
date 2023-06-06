package com.sankuai.waimai.business.search.adapterdelegates;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.s;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.search.ui.SearchShareData;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class a<T, VH extends RecyclerView.s> extends c<List<T>> {
    public static ChangeQuickRedirect a;
    public Context b;
    public SearchShareData c;
    private LayoutInflater d;

    public abstract VH a(LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup);

    public abstract void a(T t, @NonNull VH vh, @NonNull int i);

    public abstract boolean a(@NonNull T t, @NonNull List<T> list, int i);

    @Override // com.sankuai.waimai.business.search.adapterdelegates.c
    public /* bridge */ /* synthetic */ void a(@NonNull Object obj, int i, @NonNull RecyclerView.s sVar, @NonNull List list) {
        a((List) ((List) obj), i, sVar, (List<Object>) list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.sankuai.waimai.business.search.adapterdelegates.c
    public final /* synthetic */ boolean a(@NonNull Object obj, int i) {
        List list = (List) obj;
        Object[] objArr = {list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4bc0c3cd6ac249fdd42e2f61d7e3020", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4bc0c3cd6ac249fdd42e2f61d7e3020")).booleanValue();
        }
        Object obj2 = list.get(i);
        if (obj2 == null) {
            return false;
        }
        return a((a<T, VH>) obj2, (List<a<T, VH>>) list, i);
    }

    public a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7e7a2e9f091010e0add97b7b3ce6259", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7e7a2e9f091010e0add97b7b3ce6259");
            return;
        }
        this.b = context;
        this.d = LayoutInflater.from(context);
        this.c = SearchShareData.a(context);
    }

    public void a(@NonNull List<T> list, int i, @NonNull RecyclerView.s sVar, @NonNull List<Object> list2) {
        Object[] objArr = {list, Integer.valueOf(i), sVar, list2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4b11df343fec40b59de94bf3374e03d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4b11df343fec40b59de94bf3374e03d");
        } else {
            a((a<T, VH>) list.get(i), (T) sVar, i);
        }
    }

    @Override // com.sankuai.waimai.business.search.adapterdelegates.c
    @NonNull
    public final VH a(@NonNull ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46e36155a687f4a128e5200d433d7047", RobustBitConfig.DEFAULT_VALUE) ? (VH) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46e36155a687f4a128e5200d433d7047") : a(this.d, viewGroup);
    }
}
