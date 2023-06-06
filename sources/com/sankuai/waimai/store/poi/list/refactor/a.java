package com.sankuai.waimai.store.poi.list.refactor;

import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.assembler.component.BaseCard;
import com.sankuai.waimai.store.poi.list.refactor.cat.CardCreate;
import com.sankuai.waimai.store.poi.list.refactor.cat.CardMonitorMessage;
import com.sankuai.waimai.store.poi.list.refactor.generator.f;
import com.sankuai.waimai.store.poi.list.refactor.service.d;
import com.sankuai.waimai.store.poi.list.refactor.service.e;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements com.sankuai.waimai.store.poi.list.refactor.service.c {
    public static ChangeQuickRedirect a;
    private com.sankuai.waimai.store.poi.list.refactor.service.a b;
    private com.sankuai.waimai.store.poi.list.refactor.generator.a c;
    private com.sankuai.waimai.store.poi.list.refactor.service.b d;
    private com.sankuai.waimai.store.poi.list.refactor.generator.b e;
    private f f;
    private e g;
    private com.sankuai.waimai.store.poi.list.refactor.generator.e h;
    private d i;
    private com.sankuai.waimai.store.poi.list.refactor.generator.d j;
    private com.sankuai.waimai.store.param.a k;

    public a(@NonNull com.sankuai.waimai.store.param.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "601908a5f9fc53ed3a3bb25a9077bd61", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "601908a5f9fc53ed3a3bb25a9077bd61");
        } else {
            this.k = aVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    @Override // com.sankuai.waimai.store.poi.list.refactor.service.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.sankuai.waimai.store.assembler.component.BaseCard a(@android.support.annotation.NonNull com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse r12, @android.support.annotation.NonNull android.arch.lifecycle.f r13, @android.support.annotation.NonNull android.support.v4.app.FragmentActivity r14) {
        /*
            r11 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r12
            r1 = 1
            r0[r1] = r13
            r1 = 2
            r0[r1] = r14
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.waimai.store.poi.list.refactor.a.a
            java.lang.String r10 = "8d68da313d2a6ec4abc4a00a4322aa6a"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L24
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
            com.sankuai.waimai.store.assembler.component.BaseCard r12 = (com.sankuai.waimai.store.assembler.component.BaseCard) r12
            return r12
        L24:
            r0 = 0
            com.sankuai.waimai.store.poi.list.refactor.generator.a r1 = r11.c     // Catch: java.lang.Exception -> L63
            if (r1 != 0) goto L30
            com.sankuai.waimai.store.poi.list.refactor.generator.a r1 = new com.sankuai.waimai.store.poi.list.refactor.generator.a     // Catch: java.lang.Exception -> L63
            r1.<init>(r13, r14)     // Catch: java.lang.Exception -> L63
            r11.c = r1     // Catch: java.lang.Exception -> L63
        L30:
            com.sankuai.waimai.store.poi.list.refactor.service.a r1 = r11.b     // Catch: java.lang.Exception -> L63
            if (r1 == 0) goto L3b
            com.sankuai.waimai.store.poi.list.refactor.service.a r1 = r11.b     // Catch: java.lang.Exception -> L63
            com.sankuai.waimai.store.assembler.component.BaseCard r13 = r1.a(r0, r12, r13, r14)     // Catch: java.lang.Exception -> L63
            goto L3c
        L3b:
            r13 = r0
        L3c:
            if (r13 != 0) goto L48
            com.sankuai.waimai.store.poi.list.refactor.generator.a r14 = r11.c     // Catch: java.lang.Exception -> L45
            com.sankuai.waimai.store.assembler.component.BaseCard r12 = r14.a(r12)     // Catch: java.lang.Exception -> L45
            goto L49
        L45:
            r12 = move-exception
            r0 = r13
            goto L64
        L48:
            r12 = r13
        L49:
            if (r12 == 0) goto L5b
            java.lang.Class r13 = r12.getClass()     // Catch: java.lang.Exception -> L57
            java.lang.String r13 = r13.getSimpleName()     // Catch: java.lang.Exception -> L57
            r11.a(r13)     // Catch: java.lang.Exception -> L57
            goto L77
        L57:
            r13 = move-exception
            r0 = r12
            r12 = r13
            goto L64
        L5b:
            com.sankuai.waimai.store.poi.list.refactor.cat.CardCreate r13 = com.sankuai.waimai.store.poi.list.refactor.cat.CardCreate.NoCreator     // Catch: java.lang.Exception -> L57
            java.lang.String r14 = "ActionBarCard$$NO_CREATOR$$2"
            r11.a(r13, r0, r14)     // Catch: java.lang.Exception -> L57
            goto L77
        L63:
            r12 = move-exception
        L64:
            com.sankuai.waimai.store.poi.list.refactor.cat.CardCreate r13 = com.sankuai.waimai.store.poi.list.refactor.cat.CardCreate.Exception
            if (r0 != 0) goto L6b
            java.lang.String r14 = "ActionBarCard$$EXCEPTION$$1"
            goto L73
        L6b:
            java.lang.Class r14 = r0.getClass()
            java.lang.String r14 = r14.getSimpleName()
        L73:
            r11.a(r13, r12, r14)
            r12 = r0
        L77:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.poi.list.refactor.a.a(com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse, android.arch.lifecycle.f, android.support.v4.app.FragmentActivity):com.sankuai.waimai.store.assembler.component.BaseCard");
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.service.c
    public final BaseCard b(@NonNull PoiVerticalityDataResponse poiVerticalityDataResponse, @NonNull android.arch.lifecycle.f fVar, @NonNull FragmentActivity fragmentActivity) {
        BaseCard a2;
        Object[] objArr = {poiVerticalityDataResponse, fVar, fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cefeabd59bea6d3f81c4b122467fb2cd", RobustBitConfig.DEFAULT_VALUE)) {
            return (BaseCard) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cefeabd59bea6d3f81c4b122467fb2cd");
        }
        BaseCard baseCard = null;
        try {
            if (this.e == null) {
                this.e = new com.sankuai.waimai.store.poi.list.refactor.generator.b(fVar, fragmentActivity);
            }
            BaseCard a3 = this.d != null ? this.d.a(null, poiVerticalityDataResponse, fVar, fragmentActivity) : null;
            if (a3 == null) {
                try {
                    a2 = this.e.a(poiVerticalityDataResponse);
                } catch (Exception e) {
                    e = e;
                    baseCard = a3;
                    a(CardCreate.Exception, e, "BackgroundCard$$EXCEPTION$$1");
                    return baseCard;
                }
            } else {
                a2 = a3;
            }
        } catch (Exception e2) {
            e = e2;
        }
        try {
            if (a2 != null) {
                a(a2.getClass().getSimpleName());
                return a2;
            }
            a(CardCreate.NoCreator, (Exception) null, a2 == null ? "BackgroundCard$$NO_CREATOR$$2" : a2.getClass().getSimpleName());
            return a2;
        } catch (Exception e3) {
            baseCard = a2;
            e = e3;
            a(CardCreate.Exception, e, "BackgroundCard$$EXCEPTION$$1");
            return baseCard;
        }
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.service.c
    public final List<BaseCard> c(@NonNull PoiVerticalityDataResponse poiVerticalityDataResponse, @NonNull android.arch.lifecycle.f fVar, @NonNull FragmentActivity fragmentActivity) {
        List<BaseCard> list;
        Object[] objArr = {poiVerticalityDataResponse, fVar, fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26b8860ffdb170824630a1fd5d977aaa", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26b8860ffdb170824630a1fd5d977aaa");
        }
        try {
            if (this.f == null) {
                this.f = new f(fVar, fragmentActivity);
            }
            list = this.f.a(poiVerticalityDataResponse);
        } catch (Exception e) {
            e = e;
            list = null;
        }
        try {
            if (!com.sankuai.shangou.stone.util.a.b(list)) {
                for (BaseCard baseCard : list) {
                    if (baseCard != null) {
                        a(baseCard.getClass().getSimpleName());
                    }
                }
            } else if (com.sankuai.shangou.stone.util.a.b(poiVerticalityDataResponse.moduleList)) {
                a(CardCreate.NoData, (Exception) null, "ShoppingGuideCard$$NO_DATA$$0");
            } else {
                a(CardCreate.NoCreator, (Exception) null, "ShoppingGuideCard$$NO_CREATOR$$2");
            }
        } catch (Exception e2) {
            e = e2;
            a(CardCreate.Exception, e, "ShoppingGuideCard$$EXCEPTION$$1");
            return list;
        }
        return list;
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.service.c
    public final List<BaseCard> d(@NonNull PoiVerticalityDataResponse poiVerticalityDataResponse, @NonNull android.arch.lifecycle.f fVar, @NonNull FragmentActivity fragmentActivity) {
        Exception e;
        List<BaseCard> list;
        Object[] objArr = {poiVerticalityDataResponse, fVar, fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6614325d34940a4ac34778e03d190c59", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6614325d34940a4ac34778e03d190c59");
        }
        try {
            if (this.h == null) {
                this.h = new com.sankuai.waimai.store.poi.list.refactor.generator.e(fVar, fragmentActivity);
            }
            List<BaseCard> a2 = this.h.a(poiVerticalityDataResponse);
            try {
                list = this.g != null ? this.g.a(a2, poiVerticalityDataResponse, fVar, fragmentActivity) : a2;
            } catch (Exception e2) {
                e = e2;
                list = a2;
            }
            try {
                if (!com.sankuai.shangou.stone.util.a.b(list)) {
                    for (BaseCard baseCard : list) {
                        if (baseCard != null) {
                            a(baseCard.getClass().getSimpleName());
                        }
                    }
                } else {
                    a(CardCreate.NoCreator, (Exception) null, "FloatCard$$NO_CREATOR$$2");
                }
            } catch (Exception e3) {
                e = e3;
                a(CardCreate.Exception, e, "FloatCard$$EXCEPTION$$1");
                return list;
            }
        } catch (Exception e4) {
            e = e4;
            list = null;
        }
        return list;
    }

    @Override // com.sankuai.waimai.store.poi.list.refactor.service.c
    public final List<BaseCard> e(@NonNull PoiVerticalityDataResponse poiVerticalityDataResponse, @NonNull android.arch.lifecycle.f fVar, @NonNull FragmentActivity fragmentActivity) {
        Exception e;
        List<BaseCard> list;
        Object[] objArr = {poiVerticalityDataResponse, fVar, fragmentActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2cf9a53aed2c4e5f3c58725b32a7d04", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2cf9a53aed2c4e5f3c58725b32a7d04");
        }
        try {
            if (this.j == null) {
                this.j = new com.sankuai.waimai.store.poi.list.refactor.generator.d(fVar, fragmentActivity);
            }
            List<BaseCard> a2 = this.j.a(poiVerticalityDataResponse);
            try {
                list = this.i != null ? this.i.a(a2, poiVerticalityDataResponse, fVar, fragmentActivity) : a2;
            } catch (Exception e2) {
                e = e2;
                list = a2;
            }
            try {
                if (!com.sankuai.shangou.stone.util.a.b(list)) {
                    for (BaseCard baseCard : list) {
                        if (baseCard != null) {
                            a(baseCard.getClass().getSimpleName());
                        }
                    }
                } else {
                    a(CardCreate.NoCreator, (Exception) null, "FeedFlowCard$$NO_CREATOR$$2");
                }
            } catch (Exception e3) {
                e = e3;
                a(CardCreate.Exception, e, "FeedFlowCard$$EXCEPTION$$1");
                return list;
            }
        } catch (Exception e4) {
            e = e4;
            list = null;
        }
        return list;
    }

    private void a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "036e37971ed28a1fd26ac7cab7d07278", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "036e37971ed28a1fd26ac7cab7d07278");
        } else {
            com.sankuai.waimai.store.poi.list.refactor.cat.b.a(new CardMonitorMessage.a().a(str).a(CardCreate.Normal).c(String.valueOf(this.k.c)).b);
        }
    }

    private void a(@NonNull CardCreate cardCreate, Exception exc, String str) {
        Object[] objArr = {cardCreate, exc, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b00906f00eec6dce8eecefc7ede9b209", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b00906f00eec6dce8eecefc7ede9b209");
            return;
        }
        com.sankuai.waimai.store.poi.list.refactor.cat.b.b(new CardMonitorMessage.a().a(str).a(cardCreate).c(String.valueOf(this.k.c)).b(exc == null ? "" : exc.toString()).b);
        if (exc != null) {
            com.sankuai.waimai.store.base.log.a.a(exc);
        }
    }
}
