package com.sankuai.waimai.imbase.manager;

import android.app.Activity;
import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Looper;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.SparseArray;
import com.meituan.android.common.sniffer.Sniffer;
import com.meituan.metrics.Metrics;
import com.meituan.metrics.lifecycle.MetricsActivityLifecycleManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.imbase.dialog.IMCustomDialog;
import com.sankuai.waimai.imbase.init.IMSdkInitService;
import com.sankuai.waimai.imbase.manager.d;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.c;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.session.SessionId;
import com.sankuai.xm.imui.IMUIManager;
import com.sankuai.xm.imui.session.SessionActivity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import rx.d;
import rx.j;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final com.sankuai.waimai.imbase.c b = new com.sankuai.waimai.imbase.c();
    private static final IMClient.f c = new IMClient.f() { // from class: com.sankuai.waimai.imbase.manager.a.1
        public static ChangeQuickRedirect a;

        @Override // com.sankuai.xm.im.IMClient.f
        public final void a(List<com.sankuai.xm.im.session.entry.a> list) {
            Object[] objArr = {list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d1c464a7080055a5a96465faf981e3b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d1c464a7080055a5a96465faf981e3b");
            } else {
                a(list, true);
            }
        }

        @Override // com.sankuai.xm.im.IMClient.f
        public final void b(List<com.sankuai.xm.im.session.entry.a> list) {
            Object[] objArr = {list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "061ea86561b963c03ab6bd2e63ebdcd6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "061ea86561b963c03ab6bd2e63ebdcd6");
            } else {
                a(list, false);
            }
        }

        private void a(List<com.sankuai.xm.im.session.entry.a> list, boolean z) {
            Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e16356e6ed15810a1c2b847b5c9047a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e16356e6ed15810a1c2b847b5c9047a");
                return;
            }
            a.e();
            for (Map.Entry entry : a.a(list).entrySet()) {
                if (com.sankuai.waimai.imbase.register.a.a(((Short) entry.getKey()).shortValue())) {
                    List list2 = (List) a.d.get(((Short) entry.getKey()).shortValue());
                    if (!com.sankuai.waimai.imbase.utils.a.a(list2)) {
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            WeakReference weakReference = (WeakReference) it.next();
                            if (weakReference == null) {
                                it.remove();
                            } else {
                                d.InterfaceC0965d interfaceC0965d = (d.InterfaceC0965d) weakReference.get();
                                if (interfaceC0965d == null) {
                                    it.remove();
                                } else if (z) {
                                    interfaceC0965d.a(list);
                                } else {
                                    interfaceC0965d.b(list);
                                }
                            }
                        }
                    }
                }
            }
        }
    };
    private static SparseArray<List<WeakReference<d.InterfaceC0965d>>> d = new SparseArray<>();
    private static boolean e = true;
    private static boolean f;
    private static b g;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.imbase.manager.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0964a {
        void a(boolean z);
    }

    public static /* synthetic */ HashMap a(List list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ff5c8c4c55ac4cbc7f9e6cc5196985f1", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ff5c8c4c55ac4cbc7f9e6cc5196985f1");
        }
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.sankuai.xm.im.session.entry.a aVar = (com.sankuai.xm.im.session.entry.a) it.next();
            IMMessage iMMessage = aVar.b;
            if (iMMessage != null && com.sankuai.waimai.imbase.register.a.a(iMMessage.getChannel())) {
                if (hashMap.containsKey(Short.valueOf(iMMessage.getChannel()))) {
                    ((List) hashMap.get(Short.valueOf(iMMessage.getChannel()))).add(aVar);
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(aVar);
                    hashMap.put(Short.valueOf(iMMessage.getChannel()), arrayList);
                }
            }
        }
        return hashMap;
    }

    public static boolean a() {
        return e;
    }

    public static void a(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f9918ecf1dd5779b3db18cd3514c1748", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f9918ecf1dd5779b3db18cd3514c1748");
        } else {
            a(application, e);
        }
    }

    public static void a(Application application, boolean z) {
        Object[] objArr = {application, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b3e91f44b4f3cf40fdb09d176d54616c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b3e91f44b4f3cf40fdb09d176d54616c");
            return;
        }
        e = z;
        if (com.sankuai.waimai.imbase.manager.b.a().b()) {
            String str = "";
            try {
                PackageInfo packageInfo = application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
                if (packageInfo != null) {
                    str = String.valueOf(packageInfo.versionName);
                }
            } catch (PackageManager.NameNotFoundException e2) {
                e2.printStackTrace();
            }
            String str2 = str;
            if (e) {
                com.sankuai.xm.ui.a.a().a(application, (short) 3, (short) -1, str2, com.sankuai.xm.network.setting.e.ENV_RELEASE);
            } else {
                com.sankuai.xm.ui.a.a().a(application, (short) 3, (short) -1, str2, com.sankuai.waimai.imbase.b.d().c());
            }
            HashMap hashMap = new HashMap();
            hashMap.put(c.b.PEER_CHAT, new c.a(1000));
            hashMap.put(c.b.PUB_CHAT, new c.a(1000));
            hashMap.put(c.b.GROUP_CHAT, new c.a(1000));
            com.sankuai.xm.ui.a.a().a(hashMap);
            IMClient.a().a(com.sankuai.waimai.imbase.register.a.a());
            g();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class c extends Throwable {
        public c(Throwable th) {
            super(th);
        }
    }

    private static void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f8895e88d2ff447756715aca91dc4aa7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f8895e88d2ff447756715aca91dc4aa7");
        } else {
            new Thread(new Runnable() { // from class: com.sankuai.waimai.imbase.manager.a.7
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f06511859cb1849c63d2da85fba1e512", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f06511859cb1849c63d2da85fba1e512");
                        return;
                    }
                    char c2 = 1;
                    try {
                        for (IMSdkInitService iMSdkInitService : com.sankuai.waimai.router.a.a(IMSdkInitService.class)) {
                            iMSdkInitService.onInit();
                            com.sankuai.waimai.imbase.init.model.a createReceiveConfig = iMSdkInitService.createReceiveConfig();
                            if (createReceiveConfig != null) {
                                com.sankuai.waimai.imbase.listener.manager.a a2 = com.sankuai.waimai.imbase.listener.manager.a.a();
                                short s = createReceiveConfig.c;
                                com.sankuai.waimai.imbase.listener.a aVar = createReceiveConfig.d;
                                Object[] objArr3 = new Object[2];
                                objArr3[0] = Short.valueOf(s);
                                objArr3[c2] = aVar;
                                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.imbase.listener.manager.a.a;
                                if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "e8b9e89bdc7632658b01b50b8176742b", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "e8b9e89bdc7632658b01b50b8176742b");
                                } else if (!com.sankuai.waimai.imbase.register.a.a(s)) {
                                    if (a2.b.indexOfKey(s) >= 0) {
                                        a2.b.remove(s);
                                    }
                                } else {
                                    a2.b.put(s, aVar);
                                }
                            }
                            com.sankuai.waimai.imbase.init.model.b createSessionConfig = iMSdkInitService.createSessionConfig();
                            if (createSessionConfig != null) {
                                com.sankuai.waimai.imbase.listener.manager.b a3 = com.sankuai.waimai.imbase.listener.manager.b.a();
                                short s2 = createSessionConfig.b;
                                com.sankuai.waimai.imbase.listener.b bVar = createSessionConfig.c;
                                Object[] objArr4 = {Short.valueOf(s2), bVar};
                                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.imbase.listener.manager.b.a;
                                if (PatchProxy.isSupport(objArr4, a3, changeQuickRedirect4, false, "ab861af53281af246869fe2ad8281295", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, a3, changeQuickRedirect4, false, "ab861af53281af246869fe2ad8281295");
                                } else if (!com.sankuai.waimai.imbase.register.a.a(s2)) {
                                    if (a3.b.indexOfKey(s2) >= 0) {
                                        a3.b.remove(s2);
                                    }
                                } else {
                                    a3.b.put(s2, bVar);
                                }
                            }
                            c2 = 1;
                        }
                    } catch (Throwable th) {
                        Metrics.storeCrash(new c(th), 1, MetricsActivityLifecycleManager.currentActivity, false);
                    }
                }
            }, "IMinit").start();
        }
    }

    public static void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f70aad1cfedf194ee316e975c0810da0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f70aad1cfedf194ee316e975c0810da0");
        } else {
            a((InterfaceC0964a) null);
        }
    }

    private static void a(InterfaceC0964a interfaceC0964a) {
        Object[] objArr = {interfaceC0964a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "916c6de09438742116726289a79dc317", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "916c6de09438742116726289a79dc317");
        } else if (!com.sankuai.waimai.imbase.user.a.e().a() || d()) {
            if (interfaceC0964a != null) {
                interfaceC0964a.a(false);
            }
        } else {
            String valueOf = String.valueOf(com.sankuai.waimai.imbase.user.a.e().b());
            String c2 = com.sankuai.waimai.imbase.user.a.e().c();
            com.sankuai.xm.ui.a.a().a(com.sankuai.waimai.imbase.user.a.e().d());
            if (g != null) {
                IMClient.a().b(g);
                g.b = interfaceC0964a;
                IMClient.a().a(g);
            } else {
                g = new b(interfaceC0964a);
                IMClient.a().a(g);
            }
            IMClient.a().a((short) -1, (IMClient.i) b);
            IMClient.a().a((short) -1, c);
            com.sankuai.xm.ui.a.a().a(valueOf, c2);
        }
    }

    public static void a(short s, d.InterfaceC0965d interfaceC0965d) {
        boolean z = false;
        Object[] objArr = {Short.valueOf(s), interfaceC0965d};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "72f250e4f19d6cf09879a79345791c84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "72f250e4f19d6cf09879a79345791c84");
        } else if (com.sankuai.waimai.imbase.register.a.a(s)) {
            List<WeakReference<d.InterfaceC0965d>> list = d.get(s);
            if (!com.sankuai.waimai.imbase.utils.a.a(list)) {
                Iterator<WeakReference<d.InterfaceC0965d>> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    WeakReference<d.InterfaceC0965d> next = it.next();
                    if (next == null) {
                        it.remove();
                    } else {
                        d.InterfaceC0965d interfaceC0965d2 = next.get();
                        if (interfaceC0965d2 == null) {
                            it.remove();
                        } else if (interfaceC0965d2 == interfaceC0965d) {
                            z = true;
                            break;
                        }
                    }
                }
                if (z) {
                    return;
                }
                list.add(new WeakReference<>(interfaceC0965d));
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new WeakReference(interfaceC0965d));
            d.put(s, arrayList);
        }
    }

    public static void b(short s, d.InterfaceC0965d interfaceC0965d) {
        Object[] objArr = {Short.valueOf(s), interfaceC0965d};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ac98805d787450d99e35b1f91c4cc97c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ac98805d787450d99e35b1f91c4cc97c");
        } else if (com.sankuai.waimai.imbase.register.a.a(s)) {
            List<WeakReference<d.InterfaceC0965d>> list = d.get(s);
            if (com.sankuai.waimai.imbase.utils.a.a(list)) {
                return;
            }
            Iterator<WeakReference<d.InterfaceC0965d>> it = list.iterator();
            while (it.hasNext()) {
                WeakReference<d.InterfaceC0965d> next = it.next();
                if (next == null) {
                    it.remove();
                } else {
                    d.InterfaceC0965d interfaceC0965d2 = next.get();
                    if (interfaceC0965d2 == null) {
                        it.remove();
                    } else if (interfaceC0965d2 == interfaceC0965d) {
                        it.remove();
                        return;
                    }
                }
            }
        }
    }

    public static void a(boolean z) {
        f = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class b implements IMClient.d {
        public static ChangeQuickRedirect a;
        InterfaceC0964a b;

        @Override // com.sankuai.xm.im.IMClient.d
        public final void a(long j, int i) {
        }

        @Override // com.sankuai.xm.im.IMClient.d
        public final void a(boolean z) {
        }

        public b(InterfaceC0964a interfaceC0964a) {
            Object[] objArr = {interfaceC0964a};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74603957d0284dcec70bfa0c036d20c2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74603957d0284dcec70bfa0c036d20c2");
            } else {
                this.b = interfaceC0964a;
            }
        }

        @Override // com.sankuai.xm.im.IMClient.d
        public final void a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c03f938556128f7b086f6b3376d44fc3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c03f938556128f7b086f6b3376d44fc3");
                return;
            }
            Sniffer.smell("waimai_im", "login_status", "auth_error", "author error code=" + i, "");
        }

        @Override // com.sankuai.xm.im.IMClient.d
        public final void a(long j, String str, String str2, String str3) {
            Object[] objArr = {new Long(j), str, str2, str3};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15d5cb7c07639cb742e2605c005e5645", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15d5cb7c07639cb742e2605c005e5645");
                return;
            }
            com.sankuai.waimai.imbase.b.d().a(j);
            if (this.b != null) {
                this.b.a(true);
            }
            String b = com.sankuai.waimai.imbase.b.d().b();
            if (!TextUtils.isEmpty(b)) {
                com.sankuai.xm.ui.a a2 = com.sankuai.xm.ui.a.a();
                Object[] objArr2 = {b};
                ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.ui.a.a;
                if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "f171455063bb50eedab4a48b7424beab", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "f171455063bb50eedab4a48b7424beab");
                } else {
                    Object[] objArr3 = {b, ""};
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.ui.a.a;
                    if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "8d46f6bdac9fd520f71bc699c6f0aacf", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "8d46f6bdac9fd520f71bc699c6f0aacf");
                    } else if (a2.d()) {
                        if (a2.r()) {
                            com.sankuai.xm.c.a().a(b, "");
                        } else {
                            com.sankuai.xm.base.f.m().b(b).c("");
                        }
                    }
                }
            }
            Sniffer.normal("waimai_im", "login_status", "login");
        }

        @Override // com.sankuai.xm.im.IMClient.d
        public final void a(com.sankuai.xm.im.connection.b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a47dbf8d87d6b95bef55e2c962b06d0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a47dbf8d87d6b95bef55e2c962b06d0");
                return;
            }
            if (bVar == com.sankuai.xm.im.connection.b.KICKOFF) {
                Sniffer.smell("waimai_im", "login_status", "kicked_off", "IM帐号被踢", "");
            }
            if (bVar.equals(com.sankuai.xm.im.connection.b.KICKOFF)) {
                final Activity b = com.sankuai.waimai.foundation.utils.activity.a.a().b();
                if (b instanceof SessionActivity) {
                    b.runOnUiThread(new Runnable() { // from class: com.sankuai.waimai.imbase.manager.a.b.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "846f175da767fc71ac630e69178ebfab", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "846f175da767fc71ac630e69178ebfab");
                            } else {
                                new IMCustomDialog.a(b).b(b.getString(R.string.wm_imbase_account_has_been_login)).a(false).b(b.getString(R.string.wm_imbase_know), null).a();
                            }
                        }
                    });
                }
            }
        }
    }

    public static void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1fc6dd4ff3688de9f0748d0560bf91d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1fc6dd4ff3688de9f0748d0560bf91d3");
        } else if (d()) {
            com.sankuai.xm.ui.a a2 = com.sankuai.xm.ui.a.a();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.xm.ui.a.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "83801fd56241f3eedf56c1d4b84c5e9d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "83801fd56241f3eedf56c1d4b84c5e9d");
            } else {
                IMUIManager.a().d();
            }
            e.a().a((List<com.sankuai.xm.im.session.entry.a>) null);
            e.a().b();
            com.sankuai.waimai.imbase.b.d().a(0L);
        }
    }

    public static boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "53075964e0a6a27533bb4c31be50eb55", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "53075964e0a6a27533bb4c31be50eb55")).booleanValue() : com.sankuai.xm.ui.a.a().e();
    }

    public static void a(final SessionId sessionId, IMClient.g<com.sankuai.xm.im.session.entry.a> gVar) {
        Object[] objArr = {sessionId, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f5a4a46b5d8826fcc8a1aea1fec72b37", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f5a4a46b5d8826fcc8a1aea1fec72b37");
        } else if (gVar == null) {
        } else {
            final WeakReference weakReference = new WeakReference(gVar);
            if (!d()) {
                if (f) {
                    a(new InterfaceC0964a() { // from class: com.sankuai.waimai.imbase.manager.a.8
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.imbase.manager.a.InterfaceC0964a
                        public final void a(boolean z) {
                            Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9a4a88ff97ac6f3e64c63afab8036e12", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9a4a88ff97ac6f3e64c63afab8036e12");
                            } else if (z) {
                                a.b(SessionId.this, weakReference);
                            } else {
                                IMClient.g gVar2 = (IMClient.g) weakReference.get();
                                if (gVar2 != null) {
                                    gVar2.onFailure(-1, "No Login");
                                }
                            }
                        }
                    });
                    return;
                } else {
                    gVar.onFailure(-1, "No Login");
                    return;
                }
            }
            b(sessionId, weakReference);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(SessionId sessionId, WeakReference<IMClient.g<com.sankuai.xm.im.session.entry.a>> weakReference) {
        IMClient.g<com.sankuai.xm.im.session.entry.a> gVar;
        Object[] objArr = {sessionId, weakReference};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "43b0d1efcaa32c45a53b9e9a0665ce52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "43b0d1efcaa32c45a53b9e9a0665ce52");
        } else if (weakReference == null || (gVar = weakReference.get()) == null) {
        } else {
            IMClient.a().a(sessionId, gVar);
        }
    }

    public static void a(final short s, final long j, final short s2, final String str, final d.a aVar) {
        Object[] objArr = {Short.valueOf(s), new Long(j), Short.valueOf(s2), str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2f3bf0994e099fd96103d3bf5856c0a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2f3bf0994e099fd96103d3bf5856c0a7");
        } else if (aVar == null) {
        } else {
            if (!com.sankuai.waimai.imbase.user.a.e().a()) {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    aVar.a(0);
                } else {
                    com.sankuai.waimai.imbase.utils.e.a().a(new Runnable() { // from class: com.sankuai.waimai.imbase.manager.a.9
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "472b0011dd8839449ccf8563abf3dd9a", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "472b0011dd8839449ccf8563abf3dd9a");
                            } else {
                                d.a.this.a(0);
                            }
                        }
                    });
                }
            } else if (!d()) {
                if (f) {
                    a(new InterfaceC0964a() { // from class: com.sankuai.waimai.imbase.manager.a.10
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.imbase.manager.a.InterfaceC0964a
                        public final void a(boolean z) {
                            Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7f39769bebc2f1982287dcca5ae75e0d", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7f39769bebc2f1982287dcca5ae75e0d");
                            } else if (z) {
                                a.c(s, j, s2, str, aVar);
                            } else if (aVar != null) {
                                aVar.a(0);
                            }
                        }
                    });
                } else {
                    aVar.a(0);
                }
            } else {
                c(s, j, s2, str, aVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(short s, long j, short s2, String str, final d.a aVar) {
        Object[] objArr = {Short.valueOf(s), new Long(j), Short.valueOf(s2), str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a4b6e47c8c375eb7fe8629805195ca38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a4b6e47c8c375eb7fe8629805195ca38");
        } else {
            IMClient.a().a(SessionId.a(j, 0L, com.sankuai.xm.ui.chatbridge.a.a(str), s2, s), new IMClient.g<com.sankuai.xm.im.session.entry.a>() { // from class: com.sankuai.waimai.imbase.manager.a.11
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.im.IMClient.g
                public final /* synthetic */ void a(com.sankuai.xm.im.session.entry.a aVar2) {
                    final com.sankuai.xm.im.session.entry.a aVar3 = aVar2;
                    Object[] objArr2 = {aVar3};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a4fd3c18ee3ac6af138a3332181951b8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a4fd3c18ee3ac6af138a3332181951b8");
                    } else {
                        com.sankuai.waimai.imbase.utils.e.a().a(new Runnable() { // from class: com.sankuai.waimai.imbase.manager.a.11.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "69eafea090bd152ceaf0ba333f11d123", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "69eafea090bd152ceaf0ba333f11d123");
                                } else if (d.a.this != null) {
                                    if (aVar3 == null) {
                                        d.a.this.a(0);
                                    } else {
                                        d.a.this.a(aVar3.d);
                                    }
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    public static void a(d.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a9871f145a5c02550bdb7cd82d1e032d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a9871f145a5c02550bdb7cd82d1e032d");
            return;
        }
        final WeakReference weakReference = new WeakReference(aVar);
        if (!d()) {
            if (f) {
                a(new InterfaceC0964a() { // from class: com.sankuai.waimai.imbase.manager.a.12
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.imbase.manager.a.InterfaceC0964a
                    public final void a(boolean z) {
                        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1deb7f677d01e62df7313e5b0f0f4979", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1deb7f677d01e62df7313e5b0f0f4979");
                        } else if (z) {
                            a.b(weakReference);
                        } else {
                            d.a aVar2 = (d.a) weakReference.get();
                            if (aVar2 != null) {
                                aVar2.a(0);
                            }
                        }
                    }
                });
                return;
            } else {
                aVar.a(0);
                return;
            }
        }
        b(weakReference);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(final WeakReference<d.a> weakReference) {
        Object[] objArr = {weakReference};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1956d97e7f403c61c9cd087cb409eca4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1956d97e7f403c61c9cd087cb409eca4");
        } else {
            rx.d.a((d.a) new d.a<Integer>() { // from class: com.sankuai.waimai.imbase.manager.a.14
                public static ChangeQuickRedirect a;

                @Override // rx.functions.b
                public final /* synthetic */ void call(Object obj) {
                    int i;
                    j jVar = (j) obj;
                    Object[] objArr2 = {jVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "81402e00eee4f081518a0598713431de", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "81402e00eee4f081518a0598713431de");
                        return;
                    }
                    int i2 = 0;
                    for (Short sh : com.sankuai.waimai.imbase.register.a.a()) {
                        IMClient a2 = IMClient.a();
                        short shortValue = sh.shortValue();
                        Object[] objArr3 = {Short.valueOf(shortValue)};
                        ChangeQuickRedirect changeQuickRedirect3 = IMClient.a;
                        if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "0aa1a0812e1eb2ce388d7f33831e24d0", 6917529027641081856L)) {
                            i = ((Integer) PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "0aa1a0812e1eb2ce388d7f33831e24d0")).intValue();
                        } else if (a2.A()) {
                            i = 0;
                        } else {
                            int a3 = ((com.sankuai.xm.im.session.c) a2.E().a()).a(shortValue);
                            com.sankuai.xm.im.utils.a.b("IMClient::getUnreadByChannel2:: count = " + a3 + ", channel = " + ((int) shortValue), new Object[0]);
                            i = a3;
                        }
                        i2 += i;
                    }
                    jVar.onNext(Integer.valueOf(i2));
                    jVar.onCompleted();
                }
            }).b(rx.schedulers.a.e()).a(rx.android.schedulers.a.a()).c(new rx.functions.b<Integer>() { // from class: com.sankuai.waimai.imbase.manager.a.13
                public static ChangeQuickRedirect a;

                @Override // rx.functions.b
                public final /* synthetic */ void call(Integer num) {
                    d.a aVar;
                    Integer num2 = num;
                    Object[] objArr2 = {num2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "913a09eea082b84c5f74bec36686e1fe", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "913a09eea082b84c5f74bec36686e1fe");
                        return;
                    }
                    int intValue = num2 != null ? num2.intValue() : 0;
                    e.a().b = intValue;
                    if (weakReference == null || (aVar = (d.a) weakReference.get()) == null) {
                        return;
                    }
                    aVar.a(intValue);
                }
            });
        }
    }

    public static void a(short s, final d.a aVar) {
        Object[] objArr = {Short.valueOf(s), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0996bbff1d2aef4c5027b38f7af1552b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0996bbff1d2aef4c5027b38f7af1552b");
        } else {
            IMClient.a().a(s, (com.sankuai.xm.im.a<Integer>) new com.sankuai.xm.im.d<Integer>() { // from class: com.sankuai.waimai.imbase.manager.a.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.im.d
                public final /* synthetic */ void b_(Integer num) {
                    Integer num2 = num;
                    Object[] objArr2 = {num2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "33a570ffc8f3c926dff5757a74dccc1a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "33a570ffc8f3c926dff5757a74dccc1a");
                        return;
                    }
                    int intValue = num2 != null ? num2.intValue() : 0;
                    e.a().b = intValue;
                    if (d.a.this != null) {
                        d.a.this.a(intValue);
                    }
                }
            });
        }
    }

    public static void a(d.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a59940f77b23837b6a8d73cb7c583a4d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a59940f77b23837b6a8d73cb7c583a4d");
        } else {
            a((short) -1, cVar);
        }
    }

    public static void a(short s, final d.c cVar) {
        Object[] objArr = {Short.valueOf(s), cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "04da70765b0704f1fb2debe12569d607", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "04da70765b0704f1fb2debe12569d607");
        } else {
            IMClient.a().a(s, (IMClient.g<List<com.sankuai.xm.im.session.entry.a>>) new com.sankuai.xm.im.d<List<com.sankuai.xm.im.session.entry.a>>() { // from class: com.sankuai.waimai.imbase.manager.a.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.im.d
                public final /* synthetic */ void b_(List<com.sankuai.xm.im.session.entry.a> list) {
                    List<com.sankuai.xm.im.session.entry.a> list2 = list;
                    Object[] objArr2 = {list2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9356c23282ab73b2ee1e94d91ae934d8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9356c23282ab73b2ee1e94d91ae934d8");
                        return;
                    }
                    if (!com.sankuai.waimai.imbase.utils.a.a(list2) && list2.size() >= 2) {
                        Collections.sort(list2, new Comparator<com.sankuai.xm.im.session.entry.a>() { // from class: com.sankuai.waimai.imbase.manager.a.3.1
                            public static ChangeQuickRedirect a;

                            @Override // java.util.Comparator
                            public final /* synthetic */ int compare(com.sankuai.xm.im.session.entry.a aVar, com.sankuai.xm.im.session.entry.a aVar2) {
                                com.sankuai.xm.im.session.entry.a aVar3 = aVar;
                                com.sankuai.xm.im.session.entry.a aVar4 = aVar2;
                                Object[] objArr3 = {aVar3, aVar4};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e6206932b63cf257ad084068f0701b5b", RobustBitConfig.DEFAULT_VALUE)) {
                                    return ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e6206932b63cf257ad084068f0701b5b")).intValue();
                                }
                                int i = (aVar3.b.getCts() > aVar4.b.getCts() ? 1 : (aVar3.b.getCts() == aVar4.b.getCts() ? 0 : -1));
                                if (i < 0) {
                                    return 1;
                                }
                                return i == 0 ? 0 : -1;
                            }
                        });
                    }
                    if (d.c.this != null) {
                        d.c.this.a(list2);
                    }
                }
            });
        }
    }

    public static void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f32889e4245559c58191dfd0330b0b33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f32889e4245559c58191dfd0330b0b33");
            return;
        }
        if (!com.sankuai.waimai.imbase.manager.b.a().b()) {
            com.sankuai.waimai.imbase.utils.e.a().a(new Runnable() { // from class: com.sankuai.waimai.imbase.manager.a.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c4b439dc2502db407d59ff55bed74438", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c4b439dc2502db407d59ff55bed74438");
                        return;
                    }
                    e.a().a((List<com.sankuai.xm.im.session.entry.a>) null);
                    e.a().b();
                }
            });
        }
        if (d()) {
            IMClient.a().a((short) -1, new IMClient.g<List<com.sankuai.xm.im.session.entry.a>>() { // from class: com.sankuai.waimai.imbase.manager.a.5
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.im.IMClient.g
                public final /* synthetic */ void a(List<com.sankuai.xm.im.session.entry.a> list) {
                    final List<com.sankuai.xm.im.session.entry.a> list2 = list;
                    Object[] objArr2 = {list2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d274a0c7a5936e83e86ad8c522cf0360", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d274a0c7a5936e83e86ad8c522cf0360");
                    } else {
                        com.sankuai.waimai.imbase.utils.e.a().a(new Runnable() { // from class: com.sankuai.waimai.imbase.manager.a.5.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c387dadce5b03f9a9e674c68c0b53c2c", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c387dadce5b03f9a9e674c68c0b53c2c");
                                } else if (list2 == null) {
                                    e.a().a((List<com.sankuai.xm.im.session.entry.a>) null);
                                    e.a().b();
                                } else {
                                    e.a().a(list2);
                                    e.a().b();
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    public static void a(short s, long j, int i, final d.b bVar) {
        Object[] objArr = {Short.valueOf(s), new Long(j), Integer.valueOf(i), bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fecddc11d2c0a6d0ab11ee4b2f8368b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fecddc11d2c0a6d0ab11ee4b2f8368b2");
        } else if (d()) {
            IMClient.a().a(SessionId.a(j, 0L, i, (short) 0, s), true, new com.sankuai.xm.im.a<Void>() { // from class: com.sankuai.waimai.imbase.manager.a.6
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.callback.Callback
                public final /* synthetic */ void onSuccess(Object obj) {
                    Object[] objArr2 = {(Void) obj};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e25666dc53a68b9bf50756aca6dcb349", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e25666dc53a68b9bf50756aca6dcb349");
                    } else if (d.b.this != null) {
                        d.b.this.a();
                    }
                }

                @Override // com.sankuai.xm.base.callback.Callback
                public final void onFailure(int i2, String str) {
                    Object[] objArr2 = {Integer.valueOf(i2), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c67c9f0e698298a6177f85a76b2d70bc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c67c9f0e698298a6177f85a76b2d70bc");
                    } else if (d.b.this != null) {
                        d.b.this.a();
                    }
                }
            });
        }
    }
}
