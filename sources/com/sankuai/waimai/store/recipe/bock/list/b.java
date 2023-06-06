package com.sankuai.waimai.store.recipe.bock.list;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.recipe.model.Recipe;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public final Recipe b;
    public final List<a> c;
    public boolean d;

    public b(Recipe recipe, boolean z) {
        Object[] objArr = {recipe, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "602fa694729d965be33f63db6e528307", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "602fa694729d965be33f63db6e528307");
            return;
        }
        this.c = new ArrayList();
        this.d = true;
        this.b = recipe;
        if (recipe != null) {
            this.c.addAll(a(recipe.ingredientList, recipe));
        }
        this.d = !z ? 1 : 0;
    }

    private List<a> a(List<Recipe.Ingredient> list, @NonNull Recipe recipe) {
        boolean z = true;
        Object[] objArr = {list, recipe};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aeafa9d3f538551211e2ef5d2bad2d24", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aeafa9d3f538551211e2ef5d2bad2d24");
        }
        ArrayList arrayList = new ArrayList();
        if (com.sankuai.shangou.stone.util.a.b(list)) {
            return arrayList;
        }
        for (Recipe.Ingredient ingredient : list) {
            if (ingredient != null) {
                arrayList.add(new a(ingredient, recipe, z));
                z = false;
            }
        }
        return arrayList;
    }
}
