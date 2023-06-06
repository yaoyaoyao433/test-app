package com.sankuai.waimai.bussiness.order.confirm.pgablock.root;

import android.arch.lifecycle.k;
import android.os.Build;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.cube.pga.common.g;
import com.meituan.android.cube.pga.common.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.submit.model.BusinessType;
import com.sankuai.waimai.business.order.api.submit.model.ExpInfo;
import com.sankuai.waimai.business.order.api.submit.model.OrderTagInfo;
import com.sankuai.waimai.business.order.submit.SubmitOrderManager;
import com.sankuai.waimai.business.order.submit.model.CyclePurchaseInfo;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.m;
import com.sankuai.waimai.store.newwidgets.pullrefresh.DefaultHeaderService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.meituan.android.cube.pga.block.b<a, com.sankuai.waimai.bussiness.order.confirm.a> {
    public static ChangeQuickRedirect f;
    m g;

    public static /* synthetic */ boolean d(b bVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "88c0c6f9d6c31fb0c3a81c7cb09cd1a9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "88c0c6f9d6c31fb0c3a81c7cb09cd1a9")).booleanValue() : ((a) bVar.n).p.businessTypeList != null && ((a) bVar.n).p() == 2;
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26d6450786c5e4c04c51d271ea000df8", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26d6450786c5e4c04c51d271ea000df8") : new a(F());
    }

    public b(com.sankuai.waimai.bussiness.order.confirm.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04232caddea2cd77a249bc31722ea39d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04232caddea2cd77a249bc31722ea39d");
        }
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69c0a9e17456b4b05e646066b7e06120", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69c0a9e17456b4b05e646066b7e06120");
            return;
        }
        super.s();
        F().u.b = new com.meituan.android.cube.pga.action.d<Long>() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.root.b.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final /* synthetic */ Long a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1b06cf222b587442008ecfd515d15ae3", RobustBitConfig.DEFAULT_VALUE) ? (Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1b06cf222b587442008ecfd515d15ae3") : Long.valueOf(b.this.F().aH_());
            }
        };
        g<Boolean> gVar = F().v;
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        gVar.b = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "46312f6ffb09cc375c19bc082c595848", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.pga.action.d) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "46312f6ffb09cc375c19bc082c595848") : new c(this);
        F().x.b = new com.meituan.android.cube.pga.action.d<BusinessType>() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.root.b.4
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final /* synthetic */ BusinessType a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "bba0911f806a2ec0aa4fd838b7cb46b1", RobustBitConfig.DEFAULT_VALUE) ? (BusinessType) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "bba0911f806a2ec0aa4fd838b7cb46b1") : ((a) b.this.n).o();
            }
        };
        F().w.b = new com.meituan.android.cube.pga.action.d() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.root.b.5
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final Object a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0b1ebee8f2458f210498564b9f17bde3", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0b1ebee8f2458f210498564b9f17bde3") : Integer.valueOf(((a) b.this.n).p());
            }
        };
        F().z.b = new com.meituan.android.cube.pga.action.d() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.root.b.6
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final Object a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7774d30ba47edb79d57e8461535bb6d6", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7774d30ba47edb79d57e8461535bb6d6") : ((a) b.this.n).p.businessTypeList;
            }
        };
        F().y.b = new com.meituan.android.cube.pga.action.d() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.root.b.7
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final Object a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c1f79973f29b2ce0d6e3abf935ac6fcf", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c1f79973f29b2ce0d6e3abf935ac6fcf") : b.this.G().p.extendsInfo;
            }
        };
        F().K.b = new com.meituan.android.cube.pga.action.d<Boolean>() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.root.b.8
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final /* synthetic */ Boolean a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6b2b257e265cd675ea258525ef11e799", RobustBitConfig.DEFAULT_VALUE) ? (Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6b2b257e265cd675ea258525ef11e799") : Boolean.valueOf(b.d(b.this));
            }
        };
        F().aS.b = new com.meituan.android.cube.pga.action.d<String>() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.root.b.9
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final /* synthetic */ String a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "946d80605807a76a3b885f39bb7971e8", RobustBitConfig.DEFAULT_VALUE)) {
                    return (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "946d80605807a76a3b885f39bb7971e8");
                }
                CyclePurchaseInfo cyclePurchaseInfo = ((a) b.this.n).p.cyclePurchaseInfo;
                return cyclePurchaseInfo == null ? "" : com.sankuai.waimai.mach.utils.b.a().toJson(cyclePurchaseInfo);
            }
        };
        F().aq.b = new com.meituan.android.cube.pga.action.d() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.root.b.10
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final Object a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "dd6dcb21ca27740b6466dc3ffef75c17", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "dd6dcb21ca27740b6466dc3ffef75c17") : Integer.valueOf(((a) b.this.n).p.getOrderTagMode(2));
            }
        };
        F().ar.b = new com.meituan.android.cube.pga.action.d<String>() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.root.b.11
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final /* synthetic */ String a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4a094d47ee75005a2696a2c57b539290", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4a094d47ee75005a2696a2c57b539290") : ((a) b.this.n).n();
            }
        };
        F().as.b = new com.meituan.android.cube.pga.action.d() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.root.b.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final Object a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c922c1581e927656a4bf254f3d413aa7", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c922c1581e927656a4bf254f3d413aa7") : Integer.valueOf(((a) b.this.n).p.getOrderTagMode(1));
            }
        };
        F().at.b = new com.meituan.android.cube.pga.action.d() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.root.b.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final Object a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "411afc20f1e1d148e9dd2dc361b43b4e", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "411afc20f1e1d148e9dd2dc361b43b4e") : Integer.valueOf(((a) b.this.n).p.isLargeOrderTag());
            }
        };
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        String str;
        double d;
        Map map;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "291e3c70fbfb59744619512ce298cad7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "291e3c70fbfb59744619512ce298cad7");
            return;
        }
        super.I();
        F().B.b((k<String>) ((a) this.n).p.token);
        F().C.a((j<Boolean>) Boolean.valueOf(((a) this.n).p.preOrder == 1));
        F().D.b((k<String>) ((a) this.n).p.poiIcon);
        F().E.b((k<String>) ((a) this.n).p.poiName);
        F().F.a((j<Double>) Double.valueOf(((a) this.n).p.total));
        F().G.a((j<Double>) Double.valueOf(((a) this.n).p.originalPrice));
        F().H.a((j<Integer>) Integer.valueOf(((a) this.n).p.bizType));
        F().I.a((j<String>) ((a) this.n).p.bizLine);
        F().J.a((j<LogicInfo>) ((a) this.n).p);
        List<ExpInfo> list = ((a) this.n).p.abExpInfoList;
        F().A.b((k<List<ExpInfo>>) list);
        F().ap.b((k<List<OrderTagInfo>>) ((a) this.n).p.orderTagInfos);
        if (F().au.a().booleanValue()) {
            com.sankuai.waimai.bussiness.order.confirm.cache.a a2 = com.sankuai.waimai.bussiness.order.confirm.cache.a.a();
            boolean isUseCache = ExpInfo.isUseCache(list);
            Object[] objArr2 = {Byte.valueOf(isUseCache ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.bussiness.order.confirm.cache.a.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "f01af9593222d6ab25b54ef25bd8faf2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "f01af9593222d6ab25b54ef25bd8faf2");
            } else {
                a2.c = isUseCache;
                if (!a2.c) {
                    a2.d();
                }
            }
        }
        Integer valueOf = Integer.valueOf(((a) this.n).p.getOrderTagMode(2));
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.c("purchase_type", valueOf != null ? Integer.toString(valueOf.intValue()) : "-1");
        Integer valueOf2 = Integer.valueOf(((a) this.n).p.getOrderTagMode(1));
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.c("inquiry_flow_type", valueOf2 != null ? Integer.toString(valueOf2.intValue()) : "-1");
        Object[] objArr3 = {valueOf2};
        ChangeQuickRedirect changeQuickRedirect3 = f;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "3fffe6e716d7a164367e08efb21e6371", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "3fffe6e716d7a164367e08efb21e6371");
        } else if (valueOf2 != null && valueOf2.intValue() >= 0) {
            HashMap hashMap = new HashMap();
            String valueOf3 = String.valueOf(valueOf2);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("inquiry_flow_type", valueOf3);
            hashMap.put(DefaultHeaderService.KEY_DRUG, hashMap2);
            Statistics.getChannel().updateTag("waimai", hashMap);
        }
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.b(false, false, "digest", "");
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.b(false, false, "wm_poi_id", Long.valueOf(F().aH_()));
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.b(false, false, FoodDetailNetWorkPreLoader.URI_POI_STR, F().aI_());
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.b(false, false, "token", ((a) this.n).p.token);
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.b(false, false, "preview_order_callback_info", ((a) this.n).n());
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.b(false, false, "user_id", Long.valueOf(com.sankuai.waimai.platform.domain.manager.user.a.i().d()));
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.b(false, false, "hash_id", SubmitOrderManager.getInstance().getHashId());
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = f;
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.b(false, false, "coupon_code", PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "70eab0b5b8ea6501b4e6c771a7ef44a6", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "70eab0b5b8ea6501b4e6c771a7ef44a6") : com.sankuai.waimai.platform.capacity.persistent.sp.a.b(l(), "cash_coupon_code", (String) null));
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.b(false, true, "client_cache_status", 1);
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.b(true, false, "login_token", com.sankuai.waimai.platform.domain.manager.user.a.i().e());
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = f;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "47a9b32c28000ca771425cf41a455a3e", RobustBitConfig.DEFAULT_VALUE)) {
            str = (String) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "47a9b32c28000ca771425cf41a455a3e");
        } else {
            str = com.dianping.mainboard.a.b().h;
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
        }
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.b(true, false, "push_token", str);
        Object[] objArr6 = {m(), 20000012, "submit_new_order", "submit", ""};
        ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.bussiness.order.confirm.b.a;
        if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "9b5a017146b44a0aedf50f905cad6e52", RobustBitConfig.DEFAULT_VALUE)) {
            map = (Map) PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "9b5a017146b44a0aedf50f905cad6e52");
        } else {
            HashMap hashMap3 = new HashMap();
            hashMap3.put("dType", Build.MODEL);
            hashMap3.put("dId", com.sankuai.waimai.platform.b.A().b());
            hashMap3.put("dVersion", Build.VERSION.SDK + CommonConstant.Symbol.UNDERLINE + Build.VERSION.RELEASE);
            hashMap3.put("appName", com.sankuai.waimai.platform.b.A().q());
            hashMap3.put("appCode", Integer.valueOf(com.sankuai.waimai.platform.b.A().j()));
            hashMap3.put("appVersion", com.sankuai.waimai.platform.b.A().i());
            hashMap3.put("customerId", Long.valueOf(com.sankuai.waimai.platform.domain.manager.user.a.i().d()));
            hashMap3.put("uuid", com.sankuai.waimai.platform.b.A().c());
            hashMap3.put("code", 20000012);
            hashMap3.put("action", "submit_new_order");
            hashMap3.put("category", "submit");
            hashMap3.put("result", "");
            hashMap3.put("time", Long.valueOf(System.currentTimeMillis() / 1000));
            hashMap3.put("logType", "C");
            hashMap3.put("cType", com.sankuai.waimai.platform.b.A().o());
            hashMap3.put("info", "");
            hashMap3.put("channel", com.sankuai.waimai.platform.b.A().d());
            String i = com.sankuai.waimai.foundation.location.g.i();
            double[] e = com.sankuai.waimai.foundation.location.g.e();
            double d2 = 0.0d;
            if (e != null) {
                d2 = e[0];
                d = e[1];
            } else {
                d = 0.0d;
            }
            hashMap3.put(Constants.PRIVACY.KEY_LATITUDE, Double.valueOf(d2 * 1000000.0d));
            hashMap3.put(Constants.PRIVACY.KEY_LONGITUDE, Double.valueOf(d * 1000000.0d));
            hashMap3.put(GearsLocator.ADDRESS, i);
            map = hashMap3;
        }
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.b(true, false, "info", map);
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.b(false, false, "cycle_purchase_info", ((a) this.n).p.cyclePurchaseInfo);
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.b(false, false, "business_type", Integer.valueOf(((a) this.n).p()));
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class a extends com.meituan.android.cube.pga.viewmodel.a<m> {
        public static ChangeQuickRedirect o;
        @NonNull
        LogicInfo p;
        public List<BusinessType> q;
        @NonNull
        private final com.sankuai.waimai.bussiness.order.confirm.a s;

        public a(@NotNull com.sankuai.waimai.bussiness.order.confirm.a aVar) {
            Object[] objArr = {b.this, aVar};
            ChangeQuickRedirect changeQuickRedirect = o;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c6679ad58361c7a197fe1b1b052c2c4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c6679ad58361c7a197fe1b1b052c2c4");
                return;
            }
            this.p = new LogicInfo();
            this.s = aVar;
        }

        @Override // com.meituan.android.cube.pga.viewmodel.a
        public final Boolean c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = o;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec7099968e4b3c3771390862e6de3a29", RobustBitConfig.DEFAULT_VALUE) ? (Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec7099968e4b3c3771390862e6de3a29") : super.c();
        }

        @Override // com.meituan.android.cube.pga.viewmodel.a
        public final void d() {
            boolean z = false;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = o;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cca8b027d6534fb9096bdc2f9696ad89", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cca8b027d6534fb9096bdc2f9696ad89");
                return;
            }
            super.d();
            if (this.c == 0 || ((m) this.c).b == null) {
                return;
            }
            b.this.g = (m) this.c;
            this.p = (LogicInfo) com.sankuai.waimai.mach.utils.b.a().fromJson(com.sankuai.waimai.mach.utils.b.a().toJson(((m) this.c).b), (Class<Object>) LogicInfo.class);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = o;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "de8a9e3800c873f04d50122e659018f7", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "de8a9e3800c873f04d50122e659018f7")).booleanValue();
            } else {
                Boolean bool = this.s.v.a().b;
                if (bool != null && bool.booleanValue()) {
                    z = true;
                }
            }
            if (z) {
                this.p.businessTypeList = this.q;
                return;
            }
            this.q = this.p.businessTypeList;
        }

        public final String n() {
            CallbackInfo callbackInfo = this.p.extendsInfo;
            return callbackInfo == null ? "" : callbackInfo.previewOrderCallbackInfo;
        }

        public final BusinessType o() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = o;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b014f07ebe0dace233f984d0058b1876", RobustBitConfig.DEFAULT_VALUE)) {
                return (BusinessType) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b014f07ebe0dace233f984d0058b1876");
            }
            if (this.p.businessTypeList != null) {
                if (this.p.businessTypeList.size() == 1) {
                    return this.p.businessTypeList.get(0);
                }
                for (BusinessType businessType : this.p.businessTypeList) {
                    if (businessType.selected == 1) {
                        return businessType;
                    }
                }
                return null;
            }
            return null;
        }

        public final int p() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = o;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93d5745692324b2f6d4f3e08c281bc8a", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93d5745692324b2f6d4f3e08c281bc8a")).intValue();
            }
            BusinessType o2 = o();
            if (o2 != null) {
                return o2.type;
            }
            return -1;
        }
    }
}
