package com.sankuai.waimai.imbase;

import android.net.Uri;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.imbase.listener.model.a;
import com.sankuai.waimai.imbase.utils.ImSP;
import com.sankuai.waimai.imbase.utils.f;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.message.bean.IMMessage;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import rx.functions.g;
import rx.j;
import rx.k;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c implements IMClient.i {
    public static ChangeQuickRedirect a;
    private static k b;
    private static a c;

    @Override // com.sankuai.xm.im.IMClient.i
    public final void a(List<IMMessage> list, boolean z) {
        IMMessage a2;
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b18c125998c12ed3eec397bae48ca8d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b18c125998c12ed3eec397bae48ca8d");
        } else if (list == null || list.isEmpty() || z || (a2 = a(list)) == null) {
        } else {
            a(a2);
        }
    }

    private IMMessage a(List<IMMessage> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1890e78f46b762d70b79f51577b167e", RobustBitConfig.DEFAULT_VALUE)) {
            return (IMMessage) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1890e78f46b762d70b79f51577b167e");
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            IMMessage iMMessage = list.get(size);
            if (c(iMMessage)) {
                return iMMessage;
            }
        }
        return null;
    }

    private static boolean c(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "95923c14a39f4888ed50cda6b2afdacd", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "95923c14a39f4888ed50cda6b2afdacd")).booleanValue() : iMMessage != null && iMMessage.getMsgStatus() == 7 && com.sankuai.waimai.imbase.register.a.a(iMMessage.getChannel());
    }

    public static void a(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "575fef5ef3319b4f6faf287f94464043", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "575fef5ef3319b4f6faf287f94464043");
        } else if (c(iMMessage)) {
            if (com.sankuai.waimai.imbase.push.b.c() && com.sankuai.waimai.imbase.push.b.a() != 2) {
                c();
                d(iMMessage);
                return;
            }
            e(iMMessage);
        }
    }

    private static void d(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "76746df145833b5a14cc7d396eb15e93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "76746df145833b5a14cc7d396eb15e93");
            return;
        }
        c = new a(iMMessage);
        b = rx.d.a(new j<Long>() { // from class: com.sankuai.waimai.imbase.c.1
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final void onError(Throwable th) {
            }

            @Override // rx.e
            public final /* bridge */ /* synthetic */ void onNext(Object obj) {
            }

            @Override // rx.e
            public final void onCompleted() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0301cfb22be4b0da9065e112f7831f18", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0301cfb22be4b0da9065e112f7831f18");
                    return;
                }
                int b2 = ImSP.b();
                if (b2 == 0) {
                    b2 = 2000;
                }
                ad.a(c.c, b2);
            }
        }, rx.d.a(0L, 1L, TimeUnit.SECONDS).b(rx.schedulers.a.e()).c(rx.schedulers.a.e()).a(rx.android.schedulers.a.a()).i(new g<Long, Boolean>() { // from class: com.sankuai.waimai.imbase.c.2
            public static ChangeQuickRedirect a;

            @Override // rx.functions.g
            public final /* synthetic */ Boolean call(Long l) {
                Object[] objArr2 = {l};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d45bd6476af40d09102fcdc9636f7b5b", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d45bd6476af40d09102fcdc9636f7b5b");
                }
                return Boolean.valueOf(com.sankuai.waimai.imbase.push.b.a() != 2);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2e0aa58bd3ff4a174b0c1d72a13ef967", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2e0aa58bd3ff4a174b0c1d72a13ef967");
            return;
        }
        if (b != null && !b.isUnsubscribed()) {
            b.unsubscribe();
        }
        if (c != null) {
            ad.b(c);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a implements Runnable {
        public static ChangeQuickRedirect a;
        private IMMessage b;

        public a(IMMessage iMMessage) {
            Object[] objArr = {iMMessage};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a47e8bac7d934bfce36647c7903ec43", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a47e8bac7d934bfce36647c7903ec43");
            } else {
                this.b = iMMessage;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3a993f4d2e5273eef63930eea272e88", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3a993f4d2e5273eef63930eea272e88");
                return;
            }
            c.e(this.b);
            c.c();
        }
    }

    private static Runnable a(final IMMessage iMMessage, final boolean z) {
        Object[] objArr = {iMMessage, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "802113e29475e4e32c23dd141cd9a606", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "802113e29475e4e32c23dd141cd9a606") : new Runnable() { // from class: com.sankuai.waimai.imbase.c.3
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2e544f6980905a73f411a6b18e8caed9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2e544f6980905a73f411a6b18e8caed9");
                    return;
                }
                String fromName = IMMessage.this.getFromName();
                String a2 = f.a(IMMessage.this);
                Uri.Builder a3 = com.sankuai.waimai.imbase.utils.c.a(IMMessage.this);
                if (z) {
                    Uri build = a3.build();
                    com.sankuai.waimai.imbase.push.b.a(com.sankuai.waimai.imbase.singleton.a.a, 0L);
                    com.sankuai.waimai.imbase.push.b.a((int) R.drawable.wm_imbase_launcher, "", fromName, a2, IMMessage.this.getSts(), build, (a.c) null);
                    return;
                }
                a3.appendQueryParameter("from_backend_push", "1");
                com.sankuai.waimai.imbase.push.b.a(com.sankuai.waimai.imbase.singleton.a.a, IMMessage.this.getMsgId());
                com.sankuai.waimai.imbase.push.b.a(com.sankuai.waimai.imbase.singleton.a.a, a3.build(), a2, IMMessage.this.getChannel());
            }
        };
    }

    private static Runnable a(final com.sankuai.waimai.imbase.listener.model.a aVar, final IMMessage iMMessage, final boolean z) {
        Object[] objArr = {aVar, iMMessage, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dae0d97b2963d53f8bc8c7cfba9bd94d", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dae0d97b2963d53f8bc8c7cfba9bd94d") : new Runnable() { // from class: com.sankuai.waimai.imbase.c.4
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f89d629976521da671b95f78bd90db03", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f89d629976521da671b95f78bd90db03");
                    return;
                }
                Uri.Builder a2 = com.sankuai.waimai.imbase.utils.c.a(IMMessage.this);
                if (z) {
                    a.C0962a c0962a = aVar.c;
                    if (c0962a == null) {
                        return;
                    }
                    Map<String, String> map = c0962a.g;
                    if (map != null) {
                        for (Map.Entry<String, String> entry : map.entrySet()) {
                            a2.appendQueryParameter(entry.getKey(), entry.getValue());
                        }
                    }
                    com.sankuai.waimai.imbase.push.b.a(com.sankuai.waimai.imbase.singleton.a.a, 0L);
                    com.sankuai.waimai.imbase.push.b.a(c0962a.c, c0962a.d, c0962a.e, c0962a.b, c0962a.f, a2.build(), c0962a.h);
                    return;
                }
                a.b bVar = aVar.d;
                if (bVar == null) {
                    return;
                }
                Map<String, String> map2 = bVar.f;
                if (map2 != null) {
                    for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                        a2.appendQueryParameter(entry2.getKey(), entry2.getValue());
                    }
                }
                a2.appendQueryParameter("from_backend_push", "1");
                com.sankuai.waimai.imbase.push.b.a(com.sankuai.waimai.imbase.singleton.a.a, IMMessage.this.getMsgId());
                if (bVar.e != null && !bVar.e.isEmpty()) {
                    com.sankuai.waimai.imbase.push.b.a(bVar.b, a2.build(), bVar.c, bVar.e);
                } else {
                    com.sankuai.waimai.imbase.push.b.a(bVar.b, a2.build(), bVar.c, bVar.d);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(IMMessage iMMessage) {
        Runnable a2;
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "06b1fc584add1e823c745f91147a7195", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "06b1fc584add1e823c745f91147a7195");
            return;
        }
        com.sankuai.waimai.imbase.push.b.b(com.sankuai.waimai.imbase.singleton.a.a, iMMessage.getMsgId());
        com.sankuai.waimai.imbase.listener.a a3 = com.sankuai.waimai.imbase.listener.manager.a.a().a(iMMessage.getChannel());
        boolean b2 = com.sankuai.waimai.imbase.push.b.b();
        com.sankuai.waimai.imbase.listener.model.a a4 = a3 != null ? a3.a(iMMessage, b2) : null;
        if (a4 == null || a4.b) {
            if (a4 != null) {
                a2 = a(a4, iMMessage, b2);
            } else {
                a2 = a(iMMessage, b2);
            }
            com.sankuai.xm.threadpool.scheduler.a.b().a(a2);
        }
    }
}
