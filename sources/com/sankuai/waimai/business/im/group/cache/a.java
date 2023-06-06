package com.sankuai.waimai.business.im.group.cache;

import android.support.v4.util.ArrayMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.group.api.WmImGroupService;
import com.sankuai.waimai.business.im.group.model.c;
import com.sankuai.waimai.business.im.group.model.e;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private ArrayMap<Long, Long> b;

    public static /* synthetic */ void a(a aVar, c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "16154179531bf45d20ecc993303c890f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "16154179531bf45d20ecc993303c890f");
        } else {
            com.meituan.android.bus.a.a().c(new com.sankuai.waimai.business.im.group.rxbus.b(cVar));
        }
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89e3d5ee3fd547f1b39676381decbffd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89e3d5ee3fd547f1b39676381decbffd");
        } else {
            this.b = new ArrayMap<>();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.im.group.cache.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0738a {
        private static final a a = new a();
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "87add912630801137a7834cae34f0045", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "87add912630801137a7834cae34f0045") : C0738a.a;
    }

    public final long a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e90775ae40f83cd464832f04f39d081d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e90775ae40f83cd464832f04f39d081d")).longValue();
        }
        if (this.b.containsKey(Long.valueOf(j))) {
            return this.b.get(Long.valueOf(j)).longValue();
        }
        return 0L;
    }

    public final void a(long j, long j2) {
        Object[] objArr = {new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9dec47549c5db3de7b8d74d17d3ba8f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9dec47549c5db3de7b8d74d17d3ba8f2");
            return;
        }
        if (this.b.containsKey(Long.valueOf(j)) && j2 != 0 && j2 != this.b.get(Long.valueOf(j)).longValue()) {
            Object[] objArr2 = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "59e86a2b35fc4a30e99a2c8102aebccc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "59e86a2b35fc4a30e99a2c8102aebccc");
            } else {
                com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((WmImGroupService) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) WmImGroupService.class)).getGroupSessionInfo(String.valueOf(j)), new b.AbstractC1042b<BaseResponse<e>>() { // from class: com.sankuai.waimai.business.im.group.cache.a.1
                    public static ChangeQuickRedirect a;

                    @Override // rx.e
                    public final /* synthetic */ void onNext(Object obj) {
                        BaseResponse baseResponse = (BaseResponse) obj;
                        Object[] objArr3 = {baseResponse};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e6ee7740e003c54082438476b43122db", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e6ee7740e003c54082438476b43122db");
                        } else if (baseResponse == null || baseResponse.code != 0) {
                            a.a(a.this, (c) null);
                        } else {
                            e eVar = (e) baseResponse.data;
                            if (eVar == null || eVar.a == null || eVar.a.isEmpty()) {
                                a.a(a.this, (c) null);
                                return;
                            }
                            e.a aVar = eVar.a.get(0);
                            if (aVar == null) {
                                a.a(a.this, (c) null);
                                return;
                            }
                            b.a().a(eVar.b);
                            b.a().a(aVar.b, aVar);
                            com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((WmImGroupService) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) WmImGroupService.class)).getGroupImInfo(aVar.c, aVar.d, aVar.e, 0), new b.AbstractC1042b<BaseResponse<c>>() { // from class: com.sankuai.waimai.business.im.group.cache.a.1.1
                                public static ChangeQuickRedirect a;

                                @Override // rx.e
                                public final /* synthetic */ void onNext(Object obj2) {
                                    BaseResponse baseResponse2 = (BaseResponse) obj2;
                                    Object[] objArr4 = {baseResponse2};
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "18d103b57ed958211efaaca36f6dcb5d", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "18d103b57ed958211efaaca36f6dcb5d");
                                    } else if (baseResponse2 == null || baseResponse2.code != 0) {
                                        a.a(a.this, (c) null);
                                    } else {
                                        a.a(a.this, (c) baseResponse2.data);
                                    }
                                }

                                @Override // rx.e
                                public final void onError(Throwable th) {
                                    Object[] objArr4 = {th};
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "d305e256ff6aad4168ba12ccf5829461", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "d305e256ff6aad4168ba12ccf5829461");
                                    } else {
                                        a.a(a.this, (c) null);
                                    }
                                }
                            }, "");
                        }
                    }

                    @Override // rx.e
                    public final void onError(Throwable th) {
                        Object[] objArr3 = {th};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "aab91e49e2fd0ec426375549b4c342e4", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "aab91e49e2fd0ec426375549b4c342e4");
                        } else {
                            a.a(a.this, (c) null);
                        }
                    }
                }, "");
            }
        }
        this.b.put(Long.valueOf(j), Long.valueOf(j2));
    }
}
