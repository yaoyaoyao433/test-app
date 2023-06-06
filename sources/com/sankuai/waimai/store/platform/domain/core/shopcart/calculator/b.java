package com.sankuai.waimai.store.platform.domain.core.shopcart.calculator;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.o;
import com.sankuai.waimai.store.base.net.j;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.NetPriceCalculatorResult;
import com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.e;
import com.sankuai.waimai.store.platform.domain.manager.order.b;
import com.sankuai.waimai.store.ui.common.SCBaseDialog;
import com.sankuai.waimai.store.util.am;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public final void a(@Nullable GoodsSpu goodsSpu, final com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, final com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar, List<b.a> list, final com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b bVar2) {
        Object[] objArr = {goodsSpu, aVar, bVar, list, bVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59e559279dbd8be83399e78aed466452", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59e559279dbd8be83399e78aed466452");
        } else if (c.a().b) {
        } else {
            if (bVar2 != null) {
                bVar2.a();
            }
            if (aVar == null || aVar.b == null) {
                if (bVar2 != null) {
                    bVar2.a(new com.sankuai.waimai.store.exceptions.a("poiHelper为null", com.sankuai.waimai.store.exceptions.a.a(-999, "poiHelper为null")));
                }
            } else if (bVar.l()) {
                a(bVar);
                if (bVar2 != null) {
                    bVar2.a(bVar);
                }
            } else if (!o.b(com.sankuai.waimai.store.util.b.a())) {
                if (bVar2 != null) {
                    bVar2.a(new com.sankuai.waimai.store.exceptions.a("您的网络好像不太给力，请稍后再试"));
                }
            } else {
                c.a().b = true;
                e a2 = a.a(goodsSpu, aVar, bVar, list);
                if (bVar2 != null) {
                    bVar2.a(a2);
                }
                String json = new Gson().toJson(a2);
                j<NetPriceCalculatorResult> jVar = new j<NetPriceCalculatorResult>() { // from class: com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.b.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.base.net.j
                    public final /* synthetic */ void a(NetPriceCalculatorResult netPriceCalculatorResult) {
                        boolean z;
                        NetPriceCalculatorResult netPriceCalculatorResult2 = netPriceCalculatorResult;
                        Object[] objArr2 = {netPriceCalculatorResult2};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2879b18c7d78260e4057f2764c3c9ee8", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2879b18c7d78260e4057f2764c3c9ee8");
                            return;
                        }
                        if (netPriceCalculatorResult2 != null) {
                            com.sankuai.waimai.store.order.a.e().a(aVar.g(), aVar.h(), netPriceCalculatorResult2.b, netPriceCalculatorResult2.c);
                            a.a(bVar, netPriceCalculatorResult2);
                            if (netPriceCalculatorResult2.I != null) {
                                b bVar3 = b.this;
                                com.sankuai.waimai.store.platform.domain.manager.poi.a aVar2 = aVar;
                                com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar4 = bVar;
                                NetPriceCalculatorResult.ShopCartExceptionInfo shopCartExceptionInfo = netPriceCalculatorResult2.I;
                                Object[] objArr3 = {aVar2, bVar4, shopCartExceptionInfo};
                                ChangeQuickRedirect changeQuickRedirect3 = b.a;
                                if (PatchProxy.isSupport(objArr3, bVar3, changeQuickRedirect3, false, "1cfbd5da9684ffcc9fee4490bf942893", RobustBitConfig.DEFAULT_VALUE)) {
                                    z = ((Boolean) PatchProxy.accessDispatch(objArr3, bVar3, changeQuickRedirect3, false, "1cfbd5da9684ffcc9fee4490bf942893")).booleanValue();
                                } else if (shopCartExceptionInfo.code == 607 && !TextUtils.isEmpty(shopCartExceptionInfo.msg)) {
                                    am.a(SCBaseDialog.j(), shopCartExceptionInfo.msg, com.sankuai.waimai.store.manager.appinfo.a.c());
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    if (bVar2 != null) {
                                        bVar2.a(new com.sankuai.waimai.store.exceptions.a("", com.sankuai.waimai.store.exceptions.a.a(netPriceCalculatorResult2.I.code, netPriceCalculatorResult2.I.msg)));
                                    }
                                }
                            }
                            if (bVar2 != null) {
                                bVar2.a(bVar);
                            }
                        } else if (bVar2 != null) {
                            bVar2.a(new com.sankuai.waimai.store.exceptions.a(""));
                        }
                        if (bVar.q == 1) {
                            bVar.q = 0;
                        }
                        c.a().b = false;
                    }

                    @Override // com.sankuai.waimai.store.base.net.j
                    public final void a() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3d57fb802138f1e9030a65cb66fd5fe0", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3d57fb802138f1e9030a65cb66fd5fe0");
                        } else if (bVar2 != null) {
                            bVar2.a();
                        }
                    }

                    @Override // com.sankuai.waimai.store.base.net.j
                    public final void a(com.sankuai.waimai.store.repository.net.b bVar3) {
                        com.sankuai.waimai.store.exceptions.a a3;
                        Object[] objArr2 = {bVar3};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d7a7e6d877eddfee8b5c3b6b0423356b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d7a7e6d877eddfee8b5c3b6b0423356b");
                            return;
                        }
                        if (bVar2 != null) {
                            if (bVar3 != null) {
                                a3 = com.sankuai.waimai.store.exceptions.a.a(bVar3.c, bVar3.getMessage());
                            } else {
                                a3 = com.sankuai.waimai.store.exceptions.a.a(-1, "api fail");
                            }
                            bVar2.a(new com.sankuai.waimai.store.exceptions.a("", a3));
                        }
                        c.a().b = false;
                    }

                    @Override // com.sankuai.waimai.store.base.net.j
                    public final void b() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2f6f7c1676a3fbfa7c7d4abf893c48dd", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2f6f7c1676a3fbfa7c7d4abf893c48dd");
                        } else {
                            c.a().b = false;
                        }
                    }
                };
                String b = bVar2 != null ? bVar2.b() : "";
                if (TextUtils.isEmpty(b)) {
                    b = "NetPriceCalculator";
                }
                com.sankuai.waimai.store.downgrade.b.a(b, aVar.f(), aVar.d(), json, jVar);
            }
        }
    }

    private void a(@NonNull com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ed6a214620a3a9f33beed49d715bfe3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ed6a214620a3a9f33beed49d715bfe3");
        } else {
            bVar.c();
        }
    }
}
