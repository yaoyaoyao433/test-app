package com.sankuai.waimai.store.widgets.filterbar.home.scene;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.widgets.filterbar.home.scene.impl.bean.QuickSortFilterBottomBean;
import com.sankuai.waimai.store.widgets.filterbar.home.scene.impl.bean.QuickSortFilterMiddleBean;
import com.sankuai.waimai.store.widgets.filterbar.home.scene.impl.bean.SpuFilterMiddleBean;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a implements c {
    public static ChangeQuickRedirect a;
    protected final Context b;
    public final com.sankuai.waimai.store.widgets.filterbar.home.b c;
    public final b d;

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.scene.c
    public void a(int i) {
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.scene.c
    public void a(int i, int i2) {
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.scene.c
    public void a(com.sankuai.waimai.store.base.statistic.a aVar) {
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.scene.c
    public void a(BaseModuleDesc baseModuleDesc) {
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.scene.c
    public void a(QuickSortFilterBottomBean quickSortFilterBottomBean) {
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.scene.c
    public void a(QuickSortFilterMiddleBean quickSortFilterMiddleBean) {
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.scene.c
    public void a(SpuFilterMiddleBean spuFilterMiddleBean) {
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.scene.c
    public void a(List<String> list) {
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.scene.c
    public void b(int i) {
    }

    public a(@NonNull Context context, @NonNull com.sankuai.waimai.store.widgets.filterbar.home.b bVar, @NonNull b bVar2) {
        Object[] objArr = {context, bVar, bVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8af038c12dfa236dc2820cf89c668b9b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8af038c12dfa236dc2820cf89c668b9b");
            return;
        }
        this.b = context;
        this.c = bVar;
        this.d = bVar2;
    }
}
