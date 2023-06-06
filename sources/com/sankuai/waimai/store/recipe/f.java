package com.sankuai.waimai.store.recipe;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.net.j;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.recipe.b;
import com.sankuai.waimai.store.recipe.model.Recipe;
import com.sankuai.waimai.store.recipe.model.RecipeResponse;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f extends b.a {
    public static ChangeQuickRedirect c;
    final e d;
    final com.sankuai.waimai.store.platform.domain.manager.poi.a e;
    private String f;

    public f(b.InterfaceC1289b interfaceC1289b, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, String str) {
        super(interfaceC1289b);
        Object[] objArr = {interfaceC1289b, aVar, str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "edb76f3f83fb9b8d9e358f0c2ecbf85c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "edb76f3f83fb9b8d9e358f0c2ecbf85c");
            return;
        }
        this.e = aVar;
        this.d = new e(aVar.f(), str);
    }

    @Override // com.sankuai.waimai.store.recipe.b.a
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f21114533a556d9306bd8234d63aa2cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f21114533a556d9306bd8234d63aa2cc");
            return;
        }
        this.f = str;
        e eVar = this.d;
        j<RecipeResponse> jVar = new j<RecipeResponse>() { // from class: com.sankuai.waimai.store.recipe.f.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.base.net.j
            public final void b() {
            }

            @Override // com.sankuai.waimai.store.base.net.j
            public final /* synthetic */ void a(RecipeResponse recipeResponse) {
                RecipeResponse recipeResponse2 = recipeResponse;
                Object[] objArr2 = {recipeResponse2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2eb7212c37aa32e57f44c41e4fbfc5d2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2eb7212c37aa32e57f44c41e4fbfc5d2");
                    return;
                }
                f fVar = f.this;
                Object[] objArr3 = {recipeResponse2};
                ChangeQuickRedirect changeQuickRedirect3 = f.c;
                if (PatchProxy.isSupport(objArr3, fVar, changeQuickRedirect3, false, "8d8b33a3377fca7f1792076e1c862f53", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, fVar, changeQuickRedirect3, false, "8d8b33a3377fca7f1792076e1c862f53");
                    return;
                }
                e eVar2 = fVar.d;
                List<Recipe> list = recipeResponse2.recipes;
                Object[] objArr4 = {list};
                ChangeQuickRedirect changeQuickRedirect4 = e.a;
                if (PatchProxy.isSupport(objArr4, eVar2, changeQuickRedirect4, false, "34a06e78c1f87763a633163b763b1788", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, eVar2, changeQuickRedirect4, false, "34a06e78c1f87763a633163b763b1788");
                } else {
                    eVar2.b.clear();
                    if (list != null) {
                        eVar2.b.addAll(list);
                    }
                }
                if (com.sankuai.shangou.stone.util.a.b(recipeResponse2.recipes)) {
                    fVar.b.c();
                    return;
                }
                fVar.b.a(recipeResponse2);
                Recipe d = fVar.d();
                fVar.f(d);
                fVar.a(d, 0);
            }

            @Override // com.sankuai.waimai.store.base.net.j
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3d28791c53741433ce628bd2b26319ed", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3d28791c53741433ce628bd2b26319ed");
                } else {
                    f.this.b.a(1);
                }
            }

            @Override // com.sankuai.waimai.store.base.net.j
            public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                Object[] objArr2 = {bVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3752707a7eb9bc9d1a58504bd5db1245", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3752707a7eb9bc9d1a58504bd5db1245");
                } else {
                    f.this.b.c();
                }
            }
        };
        Object[] objArr2 = {str, jVar};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "36683343e24e1a0c237aadd8410a4699", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "36683343e24e1a0c237aadd8410a4699");
        } else {
            com.sankuai.waimai.store.base.net.sg.a.a((Object) eVar.f).a(eVar.c, eVar.d, eVar.e, str, jVar);
        }
    }

    @Override // com.sankuai.waimai.store.recipe.b.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6b8a75f4464906a2b21c47c6a111ed1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6b8a75f4464906a2b21c47c6a111ed1");
        } else {
            a(this.f);
        }
    }

    @Override // com.sankuai.waimai.store.recipe.b.a
    public final void a(@NonNull GoodsSpu goodsSpu) {
        List<Long> list;
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "447f202ab9a66553f65ed315242968ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "447f202ab9a66553f65ed315242968ca");
            return;
        }
        e eVar = this.d;
        Object[] objArr2 = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "16da77b4d8076ec83d5519df7d51db7f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "16da77b4d8076ec83d5519df7d51db7f");
            return;
        }
        eVar.d = goodsSpu.getId();
        Object[] objArr3 = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect3 = e.a;
        if (PatchProxy.isSupport(objArr3, eVar, changeQuickRedirect3, false, "01fe9218e80ea9e7ae480ff499b6b14b", RobustBitConfig.DEFAULT_VALUE)) {
            list = (List) PatchProxy.accessDispatch(objArr3, eVar, changeQuickRedirect3, false, "01fe9218e80ea9e7ae480ff499b6b14b");
        } else {
            List<GoodsSku> list2 = goodsSpu.skus;
            if (com.sankuai.shangou.stone.util.a.b(list2)) {
                list = new ArrayList<>();
            } else {
                ArrayList arrayList = new ArrayList();
                for (GoodsSku goodsSku : list2) {
                    if (goodsSku != null) {
                        arrayList.add(Long.valueOf(goodsSku.id));
                    }
                }
                list = arrayList;
            }
        }
        eVar.e = list;
    }

    @Override // com.sankuai.waimai.store.recipe.b.a
    public final com.sankuai.waimai.store.platform.domain.manager.poi.a b() {
        return this.e;
    }

    @Override // com.sankuai.waimai.store.recipe.b.a
    public final int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7f4fb4cd875b534ba4dbebb5191440b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7f4fb4cd875b534ba4dbebb5191440b")).intValue();
        }
        e eVar = this.d;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "ef23ea5d3300458af7cd07d6d11287a3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "ef23ea5d3300458af7cd07d6d11287a3")).intValue();
        }
        int size = eVar.b.size();
        for (int i = 0; i < size; i++) {
            Recipe recipe = eVar.b.get(i);
            if (recipe != null && recipe.isSelected()) {
                return i;
            }
        }
        return 0;
    }

    @Override // com.sankuai.waimai.store.recipe.b.a
    public final void a(Recipe recipe) {
        Recipe recipe2;
        Object[] objArr = {recipe};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6898969b4254d7cccf1760ad1ec3afe0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6898969b4254d7cccf1760ad1ec3afe0");
            return;
        }
        e eVar = this.d;
        Object[] objArr2 = {recipe};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "a02ef07835fdb2917656c915cbafa690", RobustBitConfig.DEFAULT_VALUE)) {
            recipe2 = (Recipe) PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "a02ef07835fdb2917656c915cbafa690");
        } else {
            int indexOf = eVar.b.indexOf(recipe);
            recipe2 = indexOf < 0 ? null : (Recipe) com.sankuai.shangou.stone.util.a.a((List<Object>) eVar.b, indexOf - 1);
        }
        if (recipe2 != null) {
            a(recipe2, 2);
        }
    }

    @Override // com.sankuai.waimai.store.recipe.b.a
    public final void b(Recipe recipe) {
        Recipe recipe2;
        Object[] objArr = {recipe};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbba26eedd64eae6dde045e8e3493965", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbba26eedd64eae6dde045e8e3493965");
            return;
        }
        e eVar = this.d;
        Object[] objArr2 = {recipe};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "32067719271524c757705fc7102a716d", RobustBitConfig.DEFAULT_VALUE)) {
            recipe2 = (Recipe) PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "32067719271524c757705fc7102a716d");
        } else {
            int indexOf = eVar.b.indexOf(recipe);
            recipe2 = indexOf < 0 ? null : (Recipe) com.sankuai.shangou.stone.util.a.a((List<Object>) eVar.b, indexOf + 1);
        }
        if (recipe2 != null) {
            a(recipe2, 1);
        }
    }

    @Override // com.sankuai.waimai.store.recipe.b.a
    public final boolean c(Recipe recipe) {
        Object[] objArr = {recipe};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51964db5c009ba659fa1a515479acff0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51964db5c009ba659fa1a515479acff0")).booleanValue();
        }
        e eVar = this.d;
        Object[] objArr2 = {recipe};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        return PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "d71f8af182863c79949cb878ff0564e8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "d71f8af182863c79949cb878ff0564e8")).booleanValue() : recipe != null && ((Recipe) com.sankuai.shangou.stone.util.a.a((List<Object>) eVar.b, 0)) == recipe;
    }

    @Override // com.sankuai.waimai.store.recipe.b.a
    public final void d(Recipe recipe) {
        Object[] objArr = {recipe};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fef6f127f882dfa0db24080050bdecf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fef6f127f882dfa0db24080050bdecf");
        } else {
            f(recipe);
        }
    }

    @Override // com.sankuai.waimai.store.recipe.b.a
    public final boolean e(Recipe recipe) {
        Object[] objArr = {recipe};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1dcfe97ec6162b5d5493419209ac394", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1dcfe97ec6162b5d5493419209ac394")).booleanValue();
        }
        e eVar = this.d;
        Object[] objArr2 = {recipe};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        return PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "a6cac2f5159b2ae56be093e86df253ea", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "a6cac2f5159b2ae56be093e86df253ea")).booleanValue() : recipe != null && ((Recipe) com.sankuai.shangou.stone.util.a.a((List<Object>) eVar.b, eVar.b.size() - 1)) == recipe;
    }

    Recipe d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5737f2ef09a3180d2be220e7dd6e7009", RobustBitConfig.DEFAULT_VALUE) ? (Recipe) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5737f2ef09a3180d2be220e7dd6e7009") : this.d.b();
    }

    void f(Recipe recipe) {
        Object[] objArr = {recipe};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5bc9f74ccdba3c50d57f6d6c765c77c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5bc9f74ccdba3c50d57f6d6c765c77c7");
        } else if (recipe == null || recipe == d()) {
        } else {
            this.d.a(recipe);
            this.b.b();
        }
    }

    void a(Recipe recipe, int i) {
        Object[] objArr = {recipe, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a702cbdbcf0b0b2f5a43aa68b3b2ff7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a702cbdbcf0b0b2f5a43aa68b3b2ff7");
        } else if (recipe == null) {
        } else {
            b(recipe, i);
        }
    }

    private void b(@NonNull final Recipe recipe, final int i) {
        Object[] objArr = {recipe, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d1aa62e41692d8165dc402914c6ffa1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d1aa62e41692d8165dc402914c6ffa1");
        } else {
            this.d.a(recipe, new j<Recipe>() { // from class: com.sankuai.waimai.store.recipe.f.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.base.net.j
                public final void b() {
                }

                @Override // com.sankuai.waimai.store.base.net.j
                public final /* synthetic */ void a(Recipe recipe2) {
                    Recipe recipe3 = recipe2;
                    Object[] objArr2 = {recipe3};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "26324ed5dc335eed7133fc0da1f8796b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "26324ed5dc335eed7133fc0da1f8796b");
                        return;
                    }
                    if (f.this.e == null || f.this.e.b == null || !f.this.e.b.isOptimizedRecipe()) {
                        recipe.copy(recipe3);
                    } else {
                        recipe.copyAll(recipe3);
                    }
                    if (com.sankuai.shangou.stone.util.a.b(recipe.ingredientList)) {
                        f.this.b.c();
                        return;
                    }
                    if (i == 0) {
                        f.this.f(recipe);
                    }
                    f.this.b.a(recipe, i);
                }

                @Override // com.sankuai.waimai.store.base.net.j
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1ae59845a34b5a2563b4d021711bb0eb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1ae59845a34b5a2563b4d021711bb0eb");
                    } else if (i == 0) {
                        f.this.b.a(2);
                    }
                }

                @Override // com.sankuai.waimai.store.base.net.j
                public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                    Object[] objArr2 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "60314e524f411c8adf232ba722899384", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "60314e524f411c8adf232ba722899384");
                    } else {
                        f.this.b.c();
                    }
                }
            }, i);
        }
    }
}
