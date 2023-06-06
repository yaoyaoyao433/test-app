package com.sankuai.waimai.business.im.group.init;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.group.api.WmImGroupService;
import com.sankuai.waimai.business.im.group.model.e;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import java.util.concurrent.CountDownLatch;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.sankuai.waimai.imbase.init.model.a {
    public b() {
        super((short) 1025, new a());
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a implements com.sankuai.waimai.imbase.listener.a {
        public static ChangeQuickRedirect a;

        public a() {
        }

        @Nullable
        private e.a a(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96b5e447adaf84598d803cee3aac5be0", RobustBitConfig.DEFAULT_VALUE)) {
                return (e.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96b5e447adaf84598d803cee3aac5be0");
            }
            e.a a2 = com.sankuai.waimai.business.im.group.cache.b.a().a(j);
            if (a2 != null) {
                return a2;
            }
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((WmImGroupService) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) WmImGroupService.class)).getGroupSessionInfo(String.valueOf(j)).a(rx.schedulers.a.c()), new b.AbstractC1042b<BaseResponse<e>>() { // from class: com.sankuai.waimai.business.im.group.init.b.a.1
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final /* synthetic */ void onNext(Object obj) {
                    BaseResponse baseResponse = (BaseResponse) obj;
                    Object[] objArr2 = {baseResponse};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e473f83bd39017e7690cc284b6453da5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e473f83bd39017e7690cc284b6453da5");
                    } else if (baseResponse == null || baseResponse.code != 0) {
                        countDownLatch.countDown();
                    } else {
                        e eVar = (e) baseResponse.data;
                        if (eVar == null || eVar.a == null || eVar.a.isEmpty()) {
                            countDownLatch.countDown();
                            return;
                        }
                        e.a aVar = eVar.a.get(0);
                        if (aVar == null) {
                            countDownLatch.countDown();
                            return;
                        }
                        com.sankuai.waimai.business.im.group.cache.b.a().a(eVar.b);
                        com.sankuai.waimai.business.im.group.cache.b.a().a(aVar.b, aVar);
                        countDownLatch.countDown();
                    }
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                    Object[] objArr2 = {th};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "26c4f00076d00e066edcce25554e8823", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "26c4f00076d00e066edcce25554e8823");
                    } else {
                        countDownLatch.countDown();
                    }
                }
            }, "", false);
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return com.sankuai.waimai.business.im.group.cache.b.a().a(j);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x00cb  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00d8  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0105  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x010b  */
        /* JADX WARN: Type inference failed for: r3v10 */
        /* JADX WARN: Type inference failed for: r3v18 */
        /* JADX WARN: Type inference failed for: r3v19 */
        /* JADX WARN: Type inference failed for: r3v5, types: [boolean] */
        @Override // com.sankuai.waimai.imbase.listener.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.sankuai.waimai.imbase.listener.model.a a(com.sankuai.xm.im.message.bean.IMMessage r24, boolean r25) {
            /*
                Method dump skipped, instructions count: 423
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.im.group.init.b.a.a(com.sankuai.xm.im.message.bean.IMMessage, boolean):com.sankuai.waimai.imbase.listener.model.a");
        }
    }
}
