package com.sankuai.waimai.store.search.adapterdelegates;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.s;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.search.statistics.f;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class b<T, VH extends RecyclerView.s> {
    public static ChangeQuickRedirect j;
    public Context k;
    public SearchShareData l;

    @NonNull
    public abstract VH a(LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup);

    public void a(@NonNull VH vh) {
    }

    public abstract void a(@NonNull T t, @NonNull VH vh, int i);

    public void a(@NonNull T t, @NonNull f fVar) {
    }

    public boolean a(Serializable serializable) {
        return false;
    }

    public abstract boolean a(@NonNull String str);

    public b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9546c698f627d94d1edb334cd4c8f6e1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9546c698f627d94d1edb334cd4c8f6e1");
            return;
        }
        this.k = context;
        this.l = SearchShareData.a(context);
    }

    @NonNull
    public VH a(LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup, int i) {
        Object[] objArr = {layoutInflater, viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = j;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6aae905e650dc8e9853477860c66e40c", RobustBitConfig.DEFAULT_VALUE) ? (VH) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6aae905e650dc8e9853477860c66e40c") : a(layoutInflater, viewGroup);
    }
}
