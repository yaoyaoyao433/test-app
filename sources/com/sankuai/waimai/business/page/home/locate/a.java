package com.sankuai.waimai.business.page.home.locate;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.locate.AddressRcmdApi;
import com.sankuai.waimai.contextual.computing.service.address.a;
import com.sankuai.waimai.foundation.utils.d;
import com.sankuai.waimai.monitor.model.ErrorCode;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.domain.core.location.AddressItem;
import com.sankuai.waimai.platform.domain.manager.location.model.NewHistoryAddressResponse;
import com.sankuai.waimai.platform.utils.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import rx.k;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    final String b;
    k c;
    k d;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.page.home.locate.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0787a {
        void a();

        void a(@NonNull List<AddressItem> list);
    }

    public static /* synthetic */ void a(a aVar, final InterfaceC0787a interfaceC0787a, final List list, final int i) {
        Object[] objArr = {interfaceC0787a, list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "3475f78ff0ff3e1e2b1605bb95137296", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "3475f78ff0ff3e1e2b1605bb95137296");
            return;
        }
        final com.sankuai.waimai.contextual.computing.service.address.a a2 = com.sankuai.waimai.contextual.computing.service.address.a.a();
        final a.InterfaceC0930a interfaceC0930a = new a.InterfaceC0930a() { // from class: com.sankuai.waimai.business.page.home.locate.a.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.contextual.computing.service.address.a.InterfaceC0930a
            public final void a(@Nullable List<AddressItem> list2) {
                Object[] objArr2 = {list2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d8bbba5f6ce1baab8cb824b97af8f16a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d8bbba5f6ce1baab8cb824b97af8f16a");
                } else if (d.a(list2)) {
                    a.b(a.this, interfaceC0787a, list, i);
                } else {
                    boolean equals = ErrorCode.ERROR_TYPE_B.equals(com.sankuai.waimai.business.page.common.abtest.a.b());
                    for (AddressItem addressItem : list2) {
                        addressItem.recommendStrategyCode = equals ? 1 : 2;
                    }
                    interfaceC0787a.a(list2);
                }
            }
        };
        Object[] objArr2 = {interfaceC0930a, Integer.valueOf(i), list};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.contextual.computing.service.address.a.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "c1f1b00f77e25018bf5b376797a16e35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "c1f1b00f77e25018bf5b376797a16e35");
            return;
        }
        a2.b = false;
        if (!a2.c.b) {
            interfaceC0930a.a(null);
        } else {
            com.sankuai.waimai.launcher.util.aop.b.a(o.a(), new Runnable() { // from class: com.sankuai.waimai.contextual.computing.service.address.a.2
                public static ChangeQuickRedirect a;

                /* JADX WARN: Removed duplicated region for block: B:153:0x0081 A[Catch: Exception -> 0x039d, TryCatch #0 {Exception -> 0x039d, blocks: (B:135:0x001b, B:137:0x0046, B:139:0x004f, B:142:0x0057, B:145:0x0060, B:147:0x0075, B:153:0x0081, B:155:0x008e, B:157:0x00a5, B:159:0x00c7, B:160:0x00cc, B:197:0x0205, B:199:0x023c, B:201:0x0297, B:202:0x02c4, B:206:0x02cd, B:208:0x02d5, B:212:0x02e5, B:214:0x02eb, B:215:0x02f5, B:217:0x0301, B:218:0x030b, B:220:0x0311, B:222:0x031d, B:223:0x0331, B:224:0x033a, B:226:0x0342, B:228:0x0348, B:229:0x0355, B:231:0x035b, B:232:0x0370, B:234:0x0376, B:237:0x038a, B:238:0x0390, B:200:0x0247, B:162:0x00d1, B:177:0x00ff, B:178:0x014e, B:180:0x0181, B:181:0x018a, B:196:0x01b6, B:154:0x0088), top: B:245:0x001b }] */
                /* JADX WARN: Removed duplicated region for block: B:154:0x0088 A[Catch: Exception -> 0x039d, TryCatch #0 {Exception -> 0x039d, blocks: (B:135:0x001b, B:137:0x0046, B:139:0x004f, B:142:0x0057, B:145:0x0060, B:147:0x0075, B:153:0x0081, B:155:0x008e, B:157:0x00a5, B:159:0x00c7, B:160:0x00cc, B:197:0x0205, B:199:0x023c, B:201:0x0297, B:202:0x02c4, B:206:0x02cd, B:208:0x02d5, B:212:0x02e5, B:214:0x02eb, B:215:0x02f5, B:217:0x0301, B:218:0x030b, B:220:0x0311, B:222:0x031d, B:223:0x0331, B:224:0x033a, B:226:0x0342, B:228:0x0348, B:229:0x0355, B:231:0x035b, B:232:0x0370, B:234:0x0376, B:237:0x038a, B:238:0x0390, B:200:0x0247, B:162:0x00d1, B:177:0x00ff, B:178:0x014e, B:180:0x0181, B:181:0x018a, B:196:0x01b6, B:154:0x0088), top: B:245:0x001b }] */
                /* JADX WARN: Removed duplicated region for block: B:157:0x00a5 A[Catch: Exception -> 0x039d, TryCatch #0 {Exception -> 0x039d, blocks: (B:135:0x001b, B:137:0x0046, B:139:0x004f, B:142:0x0057, B:145:0x0060, B:147:0x0075, B:153:0x0081, B:155:0x008e, B:157:0x00a5, B:159:0x00c7, B:160:0x00cc, B:197:0x0205, B:199:0x023c, B:201:0x0297, B:202:0x02c4, B:206:0x02cd, B:208:0x02d5, B:212:0x02e5, B:214:0x02eb, B:215:0x02f5, B:217:0x0301, B:218:0x030b, B:220:0x0311, B:222:0x031d, B:223:0x0331, B:224:0x033a, B:226:0x0342, B:228:0x0348, B:229:0x0355, B:231:0x035b, B:232:0x0370, B:234:0x0376, B:237:0x038a, B:238:0x0390, B:200:0x0247, B:162:0x00d1, B:177:0x00ff, B:178:0x014e, B:180:0x0181, B:181:0x018a, B:196:0x01b6, B:154:0x0088), top: B:245:0x001b }] */
                /* JADX WARN: Removed duplicated region for block: B:178:0x014e A[Catch: Exception -> 0x039d, TryCatch #0 {Exception -> 0x039d, blocks: (B:135:0x001b, B:137:0x0046, B:139:0x004f, B:142:0x0057, B:145:0x0060, B:147:0x0075, B:153:0x0081, B:155:0x008e, B:157:0x00a5, B:159:0x00c7, B:160:0x00cc, B:197:0x0205, B:199:0x023c, B:201:0x0297, B:202:0x02c4, B:206:0x02cd, B:208:0x02d5, B:212:0x02e5, B:214:0x02eb, B:215:0x02f5, B:217:0x0301, B:218:0x030b, B:220:0x0311, B:222:0x031d, B:223:0x0331, B:224:0x033a, B:226:0x0342, B:228:0x0348, B:229:0x0355, B:231:0x035b, B:232:0x0370, B:234:0x0376, B:237:0x038a, B:238:0x0390, B:200:0x0247, B:162:0x00d1, B:177:0x00ff, B:178:0x014e, B:180:0x0181, B:181:0x018a, B:196:0x01b6, B:154:0x0088), top: B:245:0x001b }] */
                /* JADX WARN: Removed duplicated region for block: B:199:0x023c A[Catch: Exception -> 0x039d, TryCatch #0 {Exception -> 0x039d, blocks: (B:135:0x001b, B:137:0x0046, B:139:0x004f, B:142:0x0057, B:145:0x0060, B:147:0x0075, B:153:0x0081, B:155:0x008e, B:157:0x00a5, B:159:0x00c7, B:160:0x00cc, B:197:0x0205, B:199:0x023c, B:201:0x0297, B:202:0x02c4, B:206:0x02cd, B:208:0x02d5, B:212:0x02e5, B:214:0x02eb, B:215:0x02f5, B:217:0x0301, B:218:0x030b, B:220:0x0311, B:222:0x031d, B:223:0x0331, B:224:0x033a, B:226:0x0342, B:228:0x0348, B:229:0x0355, B:231:0x035b, B:232:0x0370, B:234:0x0376, B:237:0x038a, B:238:0x0390, B:200:0x0247, B:162:0x00d1, B:177:0x00ff, B:178:0x014e, B:180:0x0181, B:181:0x018a, B:196:0x01b6, B:154:0x0088), top: B:245:0x001b }] */
                /* JADX WARN: Removed duplicated region for block: B:200:0x0247 A[Catch: Exception -> 0x039d, TryCatch #0 {Exception -> 0x039d, blocks: (B:135:0x001b, B:137:0x0046, B:139:0x004f, B:142:0x0057, B:145:0x0060, B:147:0x0075, B:153:0x0081, B:155:0x008e, B:157:0x00a5, B:159:0x00c7, B:160:0x00cc, B:197:0x0205, B:199:0x023c, B:201:0x0297, B:202:0x02c4, B:206:0x02cd, B:208:0x02d5, B:212:0x02e5, B:214:0x02eb, B:215:0x02f5, B:217:0x0301, B:218:0x030b, B:220:0x0311, B:222:0x031d, B:223:0x0331, B:224:0x033a, B:226:0x0342, B:228:0x0348, B:229:0x0355, B:231:0x035b, B:232:0x0370, B:234:0x0376, B:237:0x038a, B:238:0x0390, B:200:0x0247, B:162:0x00d1, B:177:0x00ff, B:178:0x014e, B:180:0x0181, B:181:0x018a, B:196:0x01b6, B:154:0x0088), top: B:245:0x001b }] */
                /* JADX WARN: Removed duplicated region for block: B:204:0x02ca  */
                /* JADX WARN: Removed duplicated region for block: B:228:0x0348 A[Catch: Exception -> 0x039d, TryCatch #0 {Exception -> 0x039d, blocks: (B:135:0x001b, B:137:0x0046, B:139:0x004f, B:142:0x0057, B:145:0x0060, B:147:0x0075, B:153:0x0081, B:155:0x008e, B:157:0x00a5, B:159:0x00c7, B:160:0x00cc, B:197:0x0205, B:199:0x023c, B:201:0x0297, B:202:0x02c4, B:206:0x02cd, B:208:0x02d5, B:212:0x02e5, B:214:0x02eb, B:215:0x02f5, B:217:0x0301, B:218:0x030b, B:220:0x0311, B:222:0x031d, B:223:0x0331, B:224:0x033a, B:226:0x0342, B:228:0x0348, B:229:0x0355, B:231:0x035b, B:232:0x0370, B:234:0x0376, B:237:0x038a, B:238:0x0390, B:200:0x0247, B:162:0x00d1, B:177:0x00ff, B:178:0x014e, B:180:0x0181, B:181:0x018a, B:196:0x01b6, B:154:0x0088), top: B:245:0x001b }] */
                /* JADX WARN: Removed duplicated region for block: B:229:0x0355 A[Catch: Exception -> 0x039d, TryCatch #0 {Exception -> 0x039d, blocks: (B:135:0x001b, B:137:0x0046, B:139:0x004f, B:142:0x0057, B:145:0x0060, B:147:0x0075, B:153:0x0081, B:155:0x008e, B:157:0x00a5, B:159:0x00c7, B:160:0x00cc, B:197:0x0205, B:199:0x023c, B:201:0x0297, B:202:0x02c4, B:206:0x02cd, B:208:0x02d5, B:212:0x02e5, B:214:0x02eb, B:215:0x02f5, B:217:0x0301, B:218:0x030b, B:220:0x0311, B:222:0x031d, B:223:0x0331, B:224:0x033a, B:226:0x0342, B:228:0x0348, B:229:0x0355, B:231:0x035b, B:232:0x0370, B:234:0x0376, B:237:0x038a, B:238:0x0390, B:200:0x0247, B:162:0x00d1, B:177:0x00ff, B:178:0x014e, B:180:0x0181, B:181:0x018a, B:196:0x01b6, B:154:0x0088), top: B:245:0x001b }] */
                /* JADX WARN: Removed duplicated region for block: B:246:0x0340 A[SYNTHETIC] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        Method dump skipped, instructions count: 941
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.contextual.computing.service.address.a.AnonymousClass2.run():void");
                }
            });
        }
    }

    public static /* synthetic */ void b(a aVar, InterfaceC0787a interfaceC0787a, List list, int i) {
        Object[] objArr = {interfaceC0787a, list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "27336dc25492dd246e91ac4970ce050b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "27336dc25492dd246e91ac4970ce050b");
        } else if (d.a(list)) {
            interfaceC0787a.a(Collections.emptyList());
        } else if (list.size() > i) {
            ArrayList arrayList = new ArrayList(i);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add((AddressItem) it.next());
                if (arrayList.size() == i) {
                    break;
                }
            }
            interfaceC0787a.a(arrayList);
        } else {
            interfaceC0787a.a(list);
        }
    }

    public a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1d66510fd5c3685031df5849dc7bb5a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1d66510fd5c3685031df5849dc7bb5a");
        } else {
            this.b = str;
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2fbc149642e82c29b271d6022748f0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2fbc149642e82c29b271d6022748f0d");
            return;
        }
        if (this.c != null) {
            this.c.unsubscribe();
            this.c = null;
        }
        if (this.d != null) {
            this.d.unsubscribe();
            this.d = null;
        }
    }

    public final void a(final InterfaceC0787a interfaceC0787a, int i) {
        Object[] objArr = {interfaceC0787a, 3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "793387fff08d75d8271e1e41531f12f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "793387fff08d75d8271e1e41531f12f9");
        } else {
            this.c = com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((AddressRcmdApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) AddressRcmdApi.class)).getAddressListB("1", "0"), new b.AbstractC1042b<NewHistoryAddressResponse>() { // from class: com.sankuai.waimai.business.page.home.locate.a.1
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final /* synthetic */ void onNext(Object obj) {
                    NewHistoryAddressResponse newHistoryAddressResponse = (NewHistoryAddressResponse) obj;
                    Object[] objArr2 = {newHistoryAddressResponse};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "444a3ce4c636236c9228935a15c70764", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "444a3ce4c636236c9228935a15c70764");
                        return;
                    }
                    a.this.c = null;
                    if (newHistoryAddressResponse == null || d.a(newHistoryAddressResponse.f)) {
                        interfaceC0787a.a(Collections.emptyList());
                        return;
                    }
                    final ArrayList arrayList = new ArrayList();
                    for (AddressItem addressItem : newHistoryAddressResponse.f) {
                        if (addressItem != null && !TextUtils.isEmpty(addressItem.addrBrief)) {
                            arrayList.add(addressItem);
                        }
                    }
                    if (d.a(arrayList)) {
                        interfaceC0787a.a(Collections.emptyList());
                    } else if (arrayList.size() <= r3) {
                        interfaceC0787a.a(arrayList);
                    } else {
                        String b = com.sankuai.waimai.business.page.common.abtest.a.b();
                        char c = 65535;
                        switch (b.hashCode()) {
                            case 65:
                                if (b.equals("A")) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case 66:
                                if (b.equals(ErrorCode.ERROR_TYPE_B)) {
                                    c = 1;
                                    break;
                                }
                                break;
                        }
                        switch (c) {
                            case 0:
                                final a aVar = a.this;
                                final InterfaceC0787a interfaceC0787a2 = interfaceC0787a;
                                final int i2 = r3;
                                Object[] objArr3 = {interfaceC0787a2, arrayList, Integer.valueOf(i2)};
                                ChangeQuickRedirect changeQuickRedirect3 = a.a;
                                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "293d22f2df09e693dbbd37ce5ff114b6", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "293d22f2df09e693dbbd37ce5ff114b6");
                                    return;
                                } else {
                                    aVar.d = com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((AddressRcmdApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) AddressRcmdApi.class)).getAddressListA(), new b.AbstractC1042b<BaseResponse<AddressRcmdApi.b>>() { // from class: com.sankuai.waimai.business.page.home.locate.a.2
                                        public static ChangeQuickRedirect a;

                                        /* JADX WARN: Code restructure failed: missing block: B:49:0x0090, code lost:
                                            continue;
                                         */
                                        @Override // rx.e
                                        /*
                                            Code decompiled incorrectly, please refer to instructions dump.
                                            To view partially-correct add '--show-bad-code' argument
                                        */
                                        public final /* synthetic */ void onNext(java.lang.Object r20) {
                                            /*
                                                Method dump skipped, instructions count: 258
                                                To view this dump add '--comments-level debug' option
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.page.home.locate.a.AnonymousClass2.onNext(java.lang.Object):void");
                                        }

                                        @Override // rx.e
                                        public final void onError(Throwable th) {
                                            Object[] objArr4 = {th};
                                            ChangeQuickRedirect changeQuickRedirect4 = a;
                                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "45724181f1c6de05bc5fa6a424d26588", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "45724181f1c6de05bc5fa6a424d26588");
                                                return;
                                            }
                                            a.this.d = null;
                                            a.a(a.this, interfaceC0787a2, arrayList, i2);
                                        }
                                    }, aVar.b);
                                    return;
                                }
                            case 1:
                                a.a(a.this, interfaceC0787a, arrayList, r3);
                                return;
                            default:
                                a.b(a.this, interfaceC0787a, arrayList, r3);
                                return;
                        }
                    }
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                    Object[] objArr2 = {th};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d87d7c776bf731512922c8f84d27cadb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d87d7c776bf731512922c8f84d27cadb");
                        return;
                    }
                    a.this.c = null;
                    interfaceC0787a.a();
                }
            }, this.b);
        }
    }
}
