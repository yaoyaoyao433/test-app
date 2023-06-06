package com.sankuai.waimai.store.goods.list.templet.newmarket.presenter;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.net.k;
import com.sankuai.waimai.store.goods.list.templet.newmarket.f;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import com.sankuai.waimai.store.platform.shop.model.IMarketResponse;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class i extends f.a {
    public static ChangeQuickRedirect d;
    boolean e;
    @Nullable
    private f.a f;
    @NonNull
    private final com.sankuai.waimai.store.platform.domain.manager.poi.a g;
    private final b h;

    public i(f.b bVar, @NonNull com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, int i) {
        super(bVar, i);
        Object[] objArr = {bVar, aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e6cba657a026673466642f4d8683378", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e6cba657a026673466642f4d8683378");
            return;
        }
        this.e = false;
        this.g = aVar;
        if (bVar.i() == 1) {
            this.h = new c();
        } else {
            this.h = new d();
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.a
    public final void a(IMarketResponse iMarketResponse) {
        Object[] objArr = {iMarketResponse};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24e556458a13fc2e8ae9dbce9b816f88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24e556458a13fc2e8ae9dbce9b816f88");
            return;
        }
        this.f = new com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.smooth.a(this.b, this.g, this.c);
        this.f.a(iMarketResponse);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.a
    public final int a(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11fa6c5c5cf08ad018bb725daa185edc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11fa6c5c5cf08ad018bb725daa185edc")).intValue();
        }
        if (this.f == null) {
            return 0;
        }
        return this.f.a(goodsPoiCategory);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.a
    public final void a(GoodsPoiCategory goodsPoiCategory, GoodsPoiCategory goodsPoiCategory2) {
        Object[] objArr = {goodsPoiCategory, goodsPoiCategory2};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42b9eb0a580d09f70ee236218b295b5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42b9eb0a580d09f70ee236218b295b5a");
        } else if (this.f == null) {
        } else {
            this.f.a(goodsPoiCategory, goodsPoiCategory2);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.a
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32f2164caf8799eacc5bcb77eb59def5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32f2164caf8799eacc5bcb77eb59def5");
        } else if (this.f == null) {
        } else {
            this.f.a(str);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.a
    public final void b(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c01aa7b43fb650384bd0f0972fb6ece", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c01aa7b43fb650384bd0f0972fb6ece");
        } else if (this.f == null) {
        } else {
            this.f.b(goodsPoiCategory);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.a
    public final GoodsPoiCategory a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aae3d4776852f8f15293e57abe8ec19c", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsPoiCategory) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aae3d4776852f8f15293e57abe8ec19c");
        }
        if (this.f == null) {
            return null;
        }
        return this.f.a();
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.a
    public final GoodsPoiCategory b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9066b564b72983bc4fb4e1185fdd1f48", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsPoiCategory) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9066b564b72983bc4fb4e1185fdd1f48");
        }
        if (this.f == null) {
            return null;
        }
        return this.f.b();
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.a
    public final GoodsPoiCategory f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d19af3f91df3b810613e077d42481b6", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsPoiCategory) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d19af3f91df3b810613e077d42481b6");
        }
        if (this.f == null) {
            return null;
        }
        return this.f.f();
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.a
    public final GoodsPoiCategory g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cdeebf029bc7d2667d4919c4dae5dc99", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsPoiCategory) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cdeebf029bc7d2667d4919c4dae5dc99");
        }
        if (this.f == null) {
            return null;
        }
        return this.f.g();
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.a
    public final GoodsPoiCategory c(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e520ad0b509b82c5f612af2cd9850ee5", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsPoiCategory) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e520ad0b509b82c5f612af2cd9850ee5");
        }
        if (this.f == null) {
            return null;
        }
        return this.f.c(goodsPoiCategory);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.a
    public final GoodsPoiCategory d(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4d8b8a8e442049b8f77dcb7d1106963", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsPoiCategory) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4d8b8a8e442049b8f77dcb7d1106963");
        }
        if (this.f == null) {
            return null;
        }
        return this.f.d(goodsPoiCategory);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.a
    public final long c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "249bcdb30560ae691ee6b11ee4a0cae5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "249bcdb30560ae691ee6b11ee4a0cae5")).longValue();
        }
        if (this.f == null) {
            return 0L;
        }
        return this.f.c();
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.a
    public final boolean a(GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "871c8363f1fc70a54e459dc3a24c90c1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "871c8363f1fc70a54e459dc3a24c90c1")).booleanValue() : this.f != null && this.f.a(goodsSpu);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.a
    public final void a(int i, GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu, int i2, List<Long> list) {
        Object[] objArr = {Integer.valueOf(i), goodsPoiCategory, goodsSpu, Integer.valueOf(i2), list};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d19d64ba317b027adca094f17674998", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d19d64ba317b027adca094f17674998");
        } else if (this.f == null) {
        } else {
            this.f.a(i, goodsPoiCategory, goodsSpu, i2, list);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d105665b17ec58d6897a24f6fcc9c7df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d105665b17ec58d6897a24f6fcc9c7df");
        } else if (this.f == null) {
        } else {
            this.f.d();
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.a
    public final int e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "802b451a868f1da1c4a170e9cb118352", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "802b451a868f1da1c4a170e9cb118352")).intValue();
        }
        if (this.f == null) {
            return 0;
        }
        return this.f.e();
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.a
    public final int h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61b9dbaccb15be70d246e668550689b6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61b9dbaccb15be70d246e668550689b6")).intValue();
        }
        if (this.f == null) {
            return 0;
        }
        return this.f.h();
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.a
    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf58eefa14f9dbb18fd06b2f7001f774", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf58eefa14f9dbb18fd06b2f7001f774");
        } else if (this.f == null) {
        } else {
            this.f.a(j);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.a
    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4901f448ec154b7fa83c4e913ab7374f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4901f448ec154b7fa83c4e913ab7374f");
        } else if (this.f == null) {
        } else {
            this.f.b(str);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.a
    public final boolean i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcc6a80753ad7af3bd0df13aa16e77da", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcc6a80753ad7af3bd0df13aa16e77da")).booleanValue() : this.f != null && this.f.i();
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.a
    public final GoodsPoiCategory j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62e28fcd8206a79aa6e48259c5ffa77d", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsPoiCategory) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62e28fcd8206a79aa6e48259c5ffa77d");
        }
        if (this.f == null) {
            return null;
        }
        return this.f.j();
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.a
    public final boolean e(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56be7e036a1cac2108cce145607211de", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56be7e036a1cac2108cce145607211de")).booleanValue() : this.f != null && this.f.e(goodsPoiCategory);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.a
    public final boolean f(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee85d97997436614e921e21bb6d3db36", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee85d97997436614e921e21bb6d3db36")).booleanValue() : this.f != null && this.f.f(goodsPoiCategory);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.a
    public final int a(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        Object[] objArr = {goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97a78b503aeca34d7f1599fa61501106", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97a78b503aeca34d7f1599fa61501106")).intValue();
        }
        if (this.f == null) {
            return 0;
        }
        return this.f.a(goodsPoiCategory, goodsSpu);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.a
    public final boolean b(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        Object[] objArr = {goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e639e220f22795b1018b5a99529e240", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e639e220f22795b1018b5a99529e240")).booleanValue() : this.f != null && this.f.b(goodsPoiCategory, goodsSpu);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.a
    public final boolean c(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        Object[] objArr = {goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1fbb2ec5d7ce4fbd983cbb8c0257073", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1fbb2ec5d7ce4fbd983cbb8c0257073")).booleanValue() : this.f != null && this.f.c(goodsPoiCategory, goodsSpu);
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.a
    public final void a(long j, long j2, int i) {
        Object[] objArr = {new Long(j), new Long(j2), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8a50b3436353f7ce206fe983e17751a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8a50b3436353f7ce206fe983e17751a");
        } else if (this.f != null) {
            this.f.a(j, j2, i);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.a
    public final void a(GoodsSpu goodsSpu, GoodsSku goodsSku, GoodsPoiCategory goodsPoiCategory, String str) {
        Object[] objArr = {goodsSpu, goodsSku, goodsPoiCategory, str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30a0779dfa168f0880a8749d38b67988", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30a0779dfa168f0880a8749d38b67988");
        } else if (this.f != null) {
            this.f.a(goodsSpu, goodsSku, goodsPoiCategory, str);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.a
    public final boolean b(GoodsPoiCategory goodsPoiCategory, GoodsPoiCategory goodsPoiCategory2) {
        Object[] objArr = {goodsPoiCategory, goodsPoiCategory2};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f3483e027988f412e33fc4e2e5cb88a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f3483e027988f412e33fc4e2e5cb88a")).booleanValue() : this.f != null && this.f.b(goodsPoiCategory, goodsPoiCategory2);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class a extends k<RestMenuResponse> {
        public static ChangeQuickRedirect a;

        private a() {
            Object[] objArr = {i.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "678b3d6f55f383e27ffd88631f2736f5", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "678b3d6f55f383e27ffd88631f2736f5");
            }
        }

        @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
        public final /* synthetic */ void a(Object obj) {
            RestMenuResponse restMenuResponse = (RestMenuResponse) obj;
            Object[] objArr = {restMenuResponse};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "954c994f0038ca2bc647fb869563a805", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "954c994f0038ca2bc647fb869563a805");
                return;
            }
            restMenuResponse.setChosenSpu(i.this.b.n(), i.this.b.o());
            i.this.a(restMenuResponse);
            i.this.b.m();
        }

        @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1233f53658260e7c5b06abe2d71dec33", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1233f53658260e7c5b06abe2d71dec33");
                return;
            }
            i.this.e = true;
            i.this.b.l();
        }

        @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
        public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35ea15e59e0c5eaa0a4a6a6149baaf13", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35ea15e59e0c5eaa0a4a6a6149baaf13");
            } else {
                i.this.b.a(bVar.b);
            }
        }

        @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
        public final void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1b70dce395dae5e4cea27622162e001", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1b70dce395dae5e4cea27622162e001");
            } else {
                i.this.e = false;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static abstract class b {
        public static ChangeQuickRedirect a;
        protected String b;

        public abstract void a(long j, String str, long j2, String str2, k<RestMenuResponse> kVar);

        void a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ec0cd232641dd29c22d4d7b270e88a7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ec0cd232641dd29c22d4d7b270e88a7");
            } else if (TextUtils.isEmpty(this.b)) {
                this.b = str;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class c extends b {
        public static ChangeQuickRedirect c;

        public c() {
        }

        @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.i.b
        public final void a(long j, String str, long j2, String str2, k<RestMenuResponse> kVar) {
            Object[] objArr = {new Long(j), str, new Long(j2), str2, kVar};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12e917b3a34377e6358d6df5693eca3c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12e917b3a34377e6358d6df5693eca3c");
            } else {
                com.sankuai.waimai.store.base.net.sg.a.a((Object) this.b).a(j, -1L, j2, str2, "2", kVar);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class d extends b {
        public static ChangeQuickRedirect c;

        public d() {
        }

        @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.presenter.i.b
        public final void a(long j, String str, long j2, String str2, k<RestMenuResponse> kVar) {
            Object[] objArr = {new Long(j), str, new Long(j2), str2, kVar};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfffc1d83558ace2c534fbf076f6befc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfffc1d83558ace2c534fbf076f6befc");
            } else {
                com.sankuai.waimai.store.base.net.sg.a.a((Object) this.b).a(j, str, j2, str2, kVar);
            }
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.templet.newmarket.f.a
    public final void a(String str, long j) {
        boolean z = false;
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a6683fad15984619c789e0a331692ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a6683fad15984619c789e0a331692ed");
            return;
        }
        if (this.f == null && !this.e) {
            this.h.a(this.b.H());
            this.h.a(this.g.f(), this.g.h(), j, str, new a());
            return;
        }
        Object[] objArr2 = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4beb0d49e0caa117719545faf2deb69c", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4beb0d49e0caa117719545faf2deb69c")).booleanValue();
        } else if (-1000 == j || 0 == j) {
            z = true;
        }
        if (z) {
            d();
        } else {
            a(String.valueOf(j));
        }
    }
}
