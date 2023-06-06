package com.sankuai.waimai.store.recipe;

import android.view.View;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.recipe.model.Recipe;
import com.sankuai.waimai.store.util.h;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface g extends com.sankuai.waimai.store.newwidgets.list.b {
    void a(View view, List<GoodsSpu> list);

    void a(GoodsSpu goodsSpu, int i);

    void a(GoodsSpu goodsSpu, View view, int i);

    void a(GoodsSpu goodsSpu, h hVar, int i);

    void a(Recipe recipe);

    boolean a();

    void b(Recipe recipe);

    boolean c(Recipe recipe);

    void d();

    void d(Recipe recipe);

    boolean e(Recipe recipe);

    void f();

    com.sankuai.waimai.store.platform.domain.manager.poi.a g();

    int h();

    d i();

    int j();
}
