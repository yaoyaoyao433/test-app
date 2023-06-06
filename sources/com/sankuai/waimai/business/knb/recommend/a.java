package com.sankuai.waimai.business.knb.recommend;

import android.os.Message;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.knb.recommend.RecommendApi;
import java.util.concurrent.ConcurrentHashMap;
import rx.functions.b;
import rx.k;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public final com.sankuai.waimai.platform.net.service.a b;
    public final ConcurrentHashMap<String, com.sankuai.waimai.business.knb.recommend.subscriber.a> c;
    private volatile k d;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d10bf94d841b374acfa24bda05c375b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d10bf94d841b374acfa24bda05c375b");
            return;
        }
        this.c = new ConcurrentHashMap<>();
        this.b = new com.sankuai.waimai.platform.net.service.a() { // from class: com.sankuai.waimai.business.knb.recommend.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.net.service.a
            public final String c() {
                return "https://i.waimai.meituan.com/";
            }

            @Override // com.sankuai.waimai.platform.net.service.a
            public final Gson d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "380f078b6c6cf14c3df8d7b5d725dc92", RobustBitConfig.DEFAULT_VALUE) ? (Gson) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "380f078b6c6cf14c3df8d7b5d725dc92") : new GsonBuilder().registerTypeAdapter(RecommendApi.a.class, new RecommendApi.RecommendResponseDeserializer()).create();
            }
        };
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.knb.recommend.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0749a {
        private static a a = new a();
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f23d9115cd2521eb9a535ee782f10051", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f23d9115cd2521eb9a535ee782f10051") : C0749a.a;
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcbc156fdfe64b0d63b7f16d59bae952", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcbc156fdfe64b0d63b7f16d59bae952");
        } else if (this.d != null) {
        } else {
            synchronized (this) {
                if (this.d == null) {
                    this.d = com.sankuai.waimai.platform.capacity.network.rxsupport.a.a().a(Message.class).e().b(rx.schedulers.a.d()).a(rx.android.schedulers.a.a()).c(new b<Message>() { // from class: com.sankuai.waimai.business.knb.recommend.a.3
                        public static ChangeQuickRedirect a;

                        @Override // rx.functions.b
                        public final /* synthetic */ void call(Message message) {
                            Message message2 = message;
                            Object[] objArr2 = {message2};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8c24b49db5c3337c5450ceb1850ecab9", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8c24b49db5c3337c5450ceb1850ecab9");
                            } else if (message2.what == 10001) {
                                a aVar = a.this;
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a.a;
                                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "75d8bb88629373fb9a26e26f16ebb717", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "75d8bb88629373fb9a26e26f16ebb717");
                                    return;
                                }
                                for (com.sankuai.waimai.business.knb.recommend.subscriber.a aVar2 : aVar.c.values()) {
                                    if (aVar2 != null) {
                                        aVar2.b();
                                    }
                                }
                                aVar.c.clear();
                                aVar.c();
                            }
                        }
                    });
                }
            }
        }
    }

    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a8e60605dd7b073626d562e8066addc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a8e60605dd7b073626d562e8066addc");
        } else if (this.d == null) {
        } else {
            synchronized (this) {
                if (this.d != null && !this.d.isUnsubscribed()) {
                    this.d.unsubscribe();
                }
                this.d = null;
            }
        }
    }
}
