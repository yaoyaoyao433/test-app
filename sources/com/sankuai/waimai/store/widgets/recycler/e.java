package com.sankuai.waimai.store.widgets.recycler;

import android.support.annotation.CallSuper;
import android.support.annotation.IdRes;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class e extends RecyclerView.s implements View.OnClickListener {
    public static ChangeQuickRedirect L;
    a M;

    public e(View view) {
        super(view);
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = L;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fea8c25e20501128a1e1c819becd5cdd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fea8c25e20501128a1e1c819becd5cdd");
        } else {
            view.setOnClickListener(this);
        }
    }

    public final <T extends View> T a(@IdRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = L;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bfc750b5e903aa2857577b54e0533b4", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bfc750b5e903aa2857577b54e0533b4") : (T) this.itemView.findViewById(i);
    }

    @CallSuper
    public void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = L;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46cd8ca356bc57e1edff77122ac6fd15", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46cd8ca356bc57e1edff77122ac6fd15");
            return;
        }
        Object[] objArr2 = {view};
        ChangeQuickRedirect changeQuickRedirect2 = L;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1ae026c284ecc8eacb26c6e6c00a788f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1ae026c284ecc8eacb26c6e6c00a788f");
        } else if (this.M != null) {
            this.M.a(this, view);
        }
    }

    public final <T extends a> T g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = L;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4accf05d19a251b082b14c3093e56bc", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4accf05d19a251b082b14c3093e56bc") : (T) com.sankuai.shangou.stone.util.f.e(this.M);
    }
}
