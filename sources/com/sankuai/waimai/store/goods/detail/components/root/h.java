package com.sankuai.waimai.store.goods.detail.components.root;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.shop.GetMenuResponse;
import com.sankuai.waimai.store.repository.model.GoodsDetailResponse;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface h {

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        void a(int i, String str);

        void a(long j, @NonNull GoodsSpu goodsSpu, String str, List<com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.indicator.a> list);

        void a(GetMenuResponse getMenuResponse);

        void a(@NonNull com.sankuai.waimai.store.platform.domain.manager.poi.a aVar);

        void a(com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, @NonNull GoodsDetailResponse goodsDetailResponse);

        void a(GoodsDetailResponse goodsDetailResponse);

        void a(@NonNull GoodsDetailResponse goodsDetailResponse, @NonNull GoodsSpu goodsSpu, @Nullable GoodsSku goodsSku);

        void a(String str, long j, String str2);

        void a(List<? extends c> list);

        void a(List<c> list, GoodsDetailResponse goodsDetailResponse);

        void b(int i);

        void b(GoodsDetailResponse goodsDetailResponse);

        void b(String str);

        SCBaseActivity q();

        void s();

        void t();

        void u();

        void v();

        void w();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static abstract class a {
        public static ChangeQuickRedirect a;
        protected b b;

        public abstract void a();

        public abstract void a(@NonNull Intent intent);

        public abstract void a(@NonNull Intent intent, String str);

        public abstract void a(Bundle bundle);

        public abstract void a(String str);

        public abstract void a(String str, String str2);

        public abstract void a(boolean z);

        public abstract void b();

        public abstract void b(@NonNull Intent intent);

        public abstract void b(Bundle bundle);

        public abstract void b(String str);

        @NonNull
        public abstract com.sankuai.waimai.store.platform.domain.manager.poi.a c();

        public abstract void c(String str);

        public abstract GoodsSpu d();

        public abstract boolean e();

        public abstract void f();

        public abstract void g();

        public abstract String h();

        public abstract com.sankuai.waimai.mach.recycler.b i();

        public abstract com.sankuai.waimai.store.poilist.mach.b j();

        public abstract Map<String, Object> k();

        public a(b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6183d4cda767334f686e436220521cf", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6183d4cda767334f686e436220521cf");
            } else {
                this.b = bVar;
            }
        }
    }
}
