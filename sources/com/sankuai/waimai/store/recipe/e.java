package com.sankuai.waimai.store.recipe;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.net.j;
import com.sankuai.waimai.store.recipe.model.Recipe;
import com.sankuai.waimai.store.util.al;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e {
    public static ChangeQuickRedirect a;
    final List<Recipe> b;
    final long c;
    long d;
    List<Long> e;
    final String f;
    private final Queue<a> g;

    public static /* synthetic */ void a(e eVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, eVar, changeQuickRedirect, false, "e1033f1cceaf96c25ec52cdb78e8cf35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, eVar, changeQuickRedirect, false, "e1033f1cceaf96c25ec52cdb78e8cf35");
            return;
        }
        eVar.g.poll();
        eVar.a();
    }

    public static /* synthetic */ boolean a(e eVar, a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, eVar, changeQuickRedirect, false, "27125007ca13b8d3b9b30d787b0c2796", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, eVar, changeQuickRedirect, false, "27125007ca13b8d3b9b30d787b0c2796")).booleanValue() : aVar != eVar.g.peek();
    }

    public e(long j, String str) {
        Object[] objArr = {new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93ab7d0942d561598f2da94750707a1d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93ab7d0942d561598f2da94750707a1d");
            return;
        }
        this.b = new ArrayList();
        this.g = new ArrayDeque();
        this.c = j;
        this.f = str;
    }

    public final void a(@NonNull Recipe recipe, j<Recipe> jVar, int i) {
        Object[] objArr = {recipe, jVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9aa797ee652aa749ebf9b57bb67e22e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9aa797ee652aa749ebf9b57bb67e22e");
            return;
        }
        a aVar = new a(recipe, jVar);
        if (this.g.contains(aVar)) {
            return;
        }
        if (i == 0) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ab99bd6911151287a4201064ba6b711c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ab99bd6911151287a4201064ba6b711c");
            } else {
                this.g.clear();
            }
        }
        this.g.offer(aVar);
        if (this.g.size() == 1) {
            a();
        }
    }

    void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e07c1d1fc0f75de0e6d3886c3ac660b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e07c1d1fc0f75de0e6d3886c3ac660b");
            return;
        }
        a peek = this.g.peek();
        if (peek != null) {
            a(peek);
        }
    }

    private void a(final a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47b9f4358ecd8abf5fb493d7bbd463c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47b9f4358ecd8abf5fb493d7bbd463c2");
        } else if (aVar.c == null) {
        } else {
            final Recipe recipe = aVar.b;
            if (com.sankuai.shangou.stone.util.a.b(recipe.ingredientList)) {
                com.sankuai.waimai.store.base.net.sg.a.a((Object) this.f).b(this.c, this.d, this.e, recipe.id, new j<Recipe>() { // from class: com.sankuai.waimai.store.recipe.e.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.base.net.j
                    public final /* synthetic */ void a(Recipe recipe2) {
                        Recipe recipe3 = recipe2;
                        Object[] objArr2 = {recipe3};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0a403482282fd3e482d192376e0113f2", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0a403482282fd3e482d192376e0113f2");
                        } else {
                            aVar.c.a((j<Recipe>) recipe3);
                        }
                    }

                    @Override // com.sankuai.waimai.store.base.net.j
                    public final void a() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "57929925e57307d08927f7a0991909a3", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "57929925e57307d08927f7a0991909a3");
                        } else {
                            aVar.c.a();
                        }
                    }

                    @Override // com.sankuai.waimai.store.base.net.j
                    public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                        Object[] objArr2 = {bVar};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7e0ad94d7f56dcece2d2b7d41d10cc2e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7e0ad94d7f56dcece2d2b7d41d10cc2e");
                        } else {
                            aVar.c.a(bVar);
                        }
                    }

                    @Override // com.sankuai.waimai.store.base.net.j
                    public final void b() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "72635ec0ced6abe4a1a2f8021f12780d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "72635ec0ced6abe4a1a2f8021f12780d");
                            return;
                        }
                        aVar.c.b();
                        if (!e.a(e.this, aVar)) {
                            e.a(e.this);
                        } else {
                            e.this.a();
                        }
                    }
                });
            } else {
                al.b(new Runnable() { // from class: com.sankuai.waimai.store.recipe.e.2
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f2b849afff6a4b32e64e1b5256125d01", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f2b849afff6a4b32e64e1b5256125d01");
                            return;
                        }
                        aVar.c.a((j<Recipe>) recipe);
                        if (!e.a(e.this, aVar)) {
                            e.a(e.this);
                        } else {
                            e.this.a();
                        }
                    }
                }, "");
            }
        }
    }

    public final Recipe b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c20cd55af88fa61ed502ded9bedc380d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Recipe) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c20cd55af88fa61ed502ded9bedc380d");
        }
        for (Recipe recipe : this.b) {
            if (recipe != null && recipe.isSelected()) {
                return recipe;
            }
        }
        Recipe recipe2 = (Recipe) com.sankuai.shangou.stone.util.a.a((List<Object>) this.b, 0);
        if (recipe2 != null) {
            recipe2.selected = 1;
        }
        return recipe2;
    }

    public final void a(Recipe recipe) {
        Object[] objArr = {recipe};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4346c72fa63dd7334dcf414f8b0b4c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4346c72fa63dd7334dcf414f8b0b4c7");
        } else if (recipe == null) {
        } else {
            Iterator<Recipe> it = this.b.iterator();
            while (it.hasNext()) {
                Recipe next = it.next();
                if (next != null) {
                    next.selected = next == recipe ? 1 : 0;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        @NonNull
        public Recipe b;
        public j<Recipe> c;

        private a(@NonNull Recipe recipe, j<Recipe> jVar) {
            Object[] objArr = {recipe, jVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c1fa869df0f09e24711296c9461637d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c1fa869df0f09e24711296c9461637d");
                return;
            }
            this.b = recipe;
            this.c = jVar;
        }

        public final boolean equals(Object obj) {
            Object[] objArr = {obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc246b954fee55ca932310022536a12f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc246b954fee55ca932310022536a12f")).booleanValue() : ((obj instanceof a) && this.b == ((a) obj).b) || super.equals(obj);
        }

        @NonNull
        public final String toString() {
            return this.b.name;
        }
    }
}
