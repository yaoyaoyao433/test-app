package com.sankuai.waimai.store.recipe;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.recipe.model.Recipe;
import com.sankuai.waimai.store.recipe.model.RecipeResponse;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface b {

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.recipe.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC1289b {
        void a(int i);

        void a(Recipe recipe, int i);

        void a(RecipeResponse recipeResponse);

        void b();

        void c();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static abstract class a {
        public static ChangeQuickRedirect a;
        public final InterfaceC1289b b;

        public abstract void a();

        public abstract void a(@NonNull GoodsSpu goodsSpu);

        public abstract void a(Recipe recipe);

        public abstract void a(String str);

        public abstract com.sankuai.waimai.store.platform.domain.manager.poi.a b();

        public abstract void b(Recipe recipe);

        public abstract int c();

        public abstract boolean c(Recipe recipe);

        public abstract void d(Recipe recipe);

        public abstract boolean e(Recipe recipe);

        public a(InterfaceC1289b interfaceC1289b) {
            Object[] objArr = {interfaceC1289b};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba45cadae081aa7700f18d6976759203", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba45cadae081aa7700f18d6976759203");
            } else {
                this.b = interfaceC1289b;
            }
        }
    }
}
