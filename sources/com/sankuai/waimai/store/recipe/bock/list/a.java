package com.sankuai.waimai.store.recipe.bock.list;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.recipe.model.Recipe;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public final Recipe.Ingredient b;
    public boolean c;
    public boolean d;
    @NonNull
    public final Recipe e;
    public final List<C1290a> f;

    public a(Recipe.Ingredient ingredient, @NonNull Recipe recipe, boolean z) {
        Object[] objArr = {ingredient, recipe, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd75d4640028428632ea1331e1725787", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd75d4640028428632ea1331e1725787");
            return;
        }
        this.c = true;
        this.f = new ArrayList();
        this.b = ingredient;
        this.d = z;
        this.f.addAll(a(recipe));
        this.e = recipe;
    }

    private List<C1290a> a(@NonNull Recipe recipe) {
        Object[] objArr = {recipe};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2c4722f114a21df228a6a5c6edd1635", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2c4722f114a21df228a6a5c6edd1635");
        }
        if (this.b == null || com.sankuai.shangou.stone.util.a.b(this.b.spuList)) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (GoodsSpu goodsSpu : this.b.spuList) {
            if (goodsSpu != null) {
                C1290a c1290a = new C1290a(recipe);
                c1290a.b = goodsSpu;
                c1290a.d = this.d;
                arrayList.add(c1290a);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.recipe.bock.list.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1290a {
        @NonNull
        public final Recipe a;
        public GoodsSpu b;
        public boolean c = true;
        public boolean d;

        public C1290a(@NonNull Recipe recipe) {
            this.a = recipe;
        }
    }
}
