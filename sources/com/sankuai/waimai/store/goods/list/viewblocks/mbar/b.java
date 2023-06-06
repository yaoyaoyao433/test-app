package com.sankuai.waimai.store.goods.list.viewblocks.mbar;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.base.net.j;
import com.sankuai.waimai.store.goods.list.viewblocks.mbar.a;
import com.sankuai.waimai.store.mach.clickhandler.a;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.goods.ScanProductResponse;
import com.sankuai.waimai.store.shopping.cart.f;
import com.sankuai.waimai.store.skuchoose.i;
import com.sankuai.waimai.store.util.al;
import com.sankuai.waimai.store.util.am;
import java.util.Collection;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends a.AbstractC1197a {
    public static ChangeQuickRedirect c;
    int d;
    i e;

    public b(a.b bVar) {
        super(bVar);
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed1556a4b8480b9139323dbe5a54d20f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed1556a4b8480b9139323dbe5a54d20f");
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0550d11469ff305014203a6710d5c238", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0550d11469ff305014203a6710d5c238");
            return;
        }
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "26cfa8f227bcb1fbbe23061dca438484", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "26cfa8f227bcb1fbbe23061dca438484");
        } else {
            com.sankuai.waimai.store.base.net.sg.a.a((Object) this.b.a().w()).a(String.valueOf(this.b.b().f()), str, new j<ScanProductResponse>() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.mbar.b.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.base.net.j
                public final void a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "388c5b48bc75491b199214064b4b95f2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "388c5b48bc75491b199214064b4b95f2");
                    }
                }

                @Override // com.sankuai.waimai.store.base.net.j
                public final void b() {
                }

                @Override // com.sankuai.waimai.store.base.net.j
                public final /* synthetic */ void a(ScanProductResponse scanProductResponse) {
                    ScanProductResponse scanProductResponse2 = scanProductResponse;
                    Object[] objArr3 = {scanProductResponse2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9ec32981fc7782b0df1ecb016ecb7a0a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9ec32981fc7782b0df1ecb016ecb7a0a");
                    } else if (scanProductResponse2 != null && com.sankuai.shangou.stone.util.a.a((Collection<?>) scanProductResponse2.productSpuList)) {
                        b.this.b.a(scanProductResponse2.productSpuList, scanProductResponse2.upcCode);
                    } else {
                        b.this.b.d();
                    }
                }

                @Override // com.sankuai.waimai.store.base.net.j
                public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                    Object[] objArr3 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3a02bfcc8eeec154731c50afc22023ad", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3a02bfcc8eeec154731c50afc22023ad");
                    } else {
                        b.this.b.j();
                    }
                }
            });
        }
    }

    public final void a(GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f6952cd754c2509b366afc81f751b81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f6952cd754c2509b366afc81f751b81");
        } else {
            com.sankuai.waimai.store.order.a.e().a(this.b.b().f(), goodsSpu, (GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) goodsSpu.getSkuList(), 0), (GoodsAttr[]) null, new com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.mbar.b.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4be87a8c0e5a97b762430b7a00e16320", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4be87a8c0e5a97b762430b7a00e16320");
                    }
                }

                @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                public final void a(com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar) {
                    Object[] objArr2 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2d6397e937d84a8f3cd5e40ad2b141a9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2d6397e937d84a8f3cd5e40ad2b141a9");
                    } else {
                        b.this.b.a(bVar);
                    }
                }

                @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                public final void a(com.sankuai.waimai.store.exceptions.a aVar) {
                    Object[] objArr2 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "396276be74a6b02659187fa285c07ca0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "396276be74a6b02659187fa285c07ca0");
                        return;
                    }
                    if (!TextUtils.isEmpty(aVar.getMessage())) {
                        am.a((Activity) b.this.b.a(), aVar.getMessage());
                    }
                    b.this.b.j();
                }
            });
        }
    }

    public final void a(final Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53c675ac5c1035ad1e4309196ae878db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53c675ac5c1035ad1e4309196ae878db");
        } else if (map == null || map.get("spu") == null) {
        } else {
            al.a(new al.b<GoodsSpu>() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.mbar.b.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.util.al.b
                public final /* synthetic */ GoodsSpu a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "41ee980f9aacc3a9df13e7426dd8c244", RobustBitConfig.DEFAULT_VALUE) ? (GoodsSpu) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "41ee980f9aacc3a9df13e7426dd8c244") : (GoodsSpu) com.sankuai.waimai.store.util.i.a(com.sankuai.waimai.store.util.i.a(map.get("spu")), GoodsSpu.class);
                }

                @Override // com.sankuai.waimai.store.util.al.b
                public final /* synthetic */ void a(GoodsSpu goodsSpu) {
                    GoodsSpu goodsSpu2 = goodsSpu;
                    Object[] objArr2 = {goodsSpu2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8dd42478c02caf5c4573205da76a4304", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8dd42478c02caf5c4573205da76a4304");
                    } else if (goodsSpu2 != null) {
                        b.this.e = i.a.a(b.this.b.a(), goodsSpu2);
                        b.this.e.a(1, b.this.b.b().b, goodsSpu2);
                    }
                }
            }, this.b.a().w());
        }
    }

    public final void a(a.C1218a c1218a) {
        Object[] objArr = {c1218a};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12830170ecaa2acd9cfa61e16506cfba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12830170ecaa2acd9cfa61e16506cfba");
        } else if (this.b.a() != c1218a.b || c1218a == null || c1218a.d != this.b.b().f() || c1218a.f == null) {
        } else {
            final View view = c1218a.c;
            GoodsSpu goodsSpu = c1218a.f;
            long j = c1218a.d;
            Context context = view.getContext();
            Object[] objArr2 = {context};
            ChangeQuickRedirect changeQuickRedirect2 = c;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0eed051b416824eb1a515e43b57afc43", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0eed051b416824eb1a515e43b57afc43");
            } else if (f.a().b != null) {
                ImageView imageView = f.a().b.get(Integer.valueOf(this.b.a().hashCode()));
                this.d = context.hashCode();
                if (f.a().b.get(Integer.valueOf(this.d)) == null && imageView != null) {
                    f.a().b.put(Integer.valueOf(this.d), imageView);
                }
            }
            SCBaseActivity a = this.b.a();
            Object[] objArr3 = {a, view, new Long(j), goodsSpu, null};
            ChangeQuickRedirect changeQuickRedirect3 = c;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3779bf187102948353e7730532810677", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3779bf187102948353e7730532810677");
            } else if (a == null || goodsSpu == null) {
            } else {
                com.sankuai.waimai.store.order.a.e().a(j, goodsSpu, (GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) goodsSpu.getSkuList(), 0), (GoodsAttr[]) null, new com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b() { // from class: com.sankuai.waimai.store.goods.list.viewblocks.mbar.b.4
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                    public final void a() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "e1f5bdc4cd49020ac675d6a34feca07b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "e1f5bdc4cd49020ac675d6a34feca07b");
                        }
                    }

                    @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                    public final void a(com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar) {
                        Object[] objArr4 = {bVar};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "bf9eb5e38cd44394af6eb74fa42e4120", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "bf9eb5e38cd44394af6eb74fa42e4120");
                        } else {
                            f.a().a(view, b.this.b.b().f());
                        }
                    }

                    @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                    public final void a(com.sankuai.waimai.store.exceptions.a aVar) {
                        Object[] objArr4 = {aVar};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "fcca0d0ac2c040888401ad099c1fa0ad", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "fcca0d0ac2c040888401ad099c1fa0ad");
                        } else if (TextUtils.isEmpty(aVar.getMessage())) {
                        } else {
                            am.a((Activity) b.this.b.a(), aVar.getMessage());
                        }
                    }
                });
            }
        }
    }
}
