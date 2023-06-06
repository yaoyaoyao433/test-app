package com.meituan.android.common.locate.altbeacon.beacon;

import android.os.Message;
import android.support.annotation.NonNull;
import com.meituan.android.common.locate.platform.sniffer.c;
import com.meituan.android.common.locate.util.LocationUtils;
import com.meituan.android.common.locate.util.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public class e extends com.meituan.android.common.locate.altbeacon.beacon.d {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static e i;

    /* loaded from: classes2.dex */
    public interface a {
        void a(a aVar, Object obj);
    }

    /* loaded from: classes2.dex */
    public class b implements a {
        public static ChangeQuickRedirect changeQuickRedirect;
        public com.meituan.android.common.locate.altbeacon.beacon.bean.a a;

        public b() {
            Object[] objArr = {e.this};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ff2b36764b6f9b834ca07f1a3256f3f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ff2b36764b6f9b834ca07f1a3256f3f");
            } else {
                this.a = null;
            }
        }

        public void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7fb632db17f45b1a62e35f253cb88a6a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7fb632db17f45b1a62e35f253cb88a6a");
                return;
            }
            Message obtain = Message.obtain();
            obtain.what = 3;
            obtain.obj = this.a;
            e.this.h.sendMessage(obtain);
        }

        @Override // com.meituan.android.common.locate.altbeacon.beacon.e.a
        public void a(a aVar, Object obj) {
            Object[] objArr = {aVar, obj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "08ae512678ac7f1a08924d774cd19f71", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "08ae512678ac7f1a08924d774cd19f71");
                return;
            }
            e.this.g = 2;
            this.a = null;
            if (LocationUtils.h(e.this.a)) {
                new o<com.meituan.android.common.locate.altbeacon.beacon.bean.a>() { // from class: com.meituan.android.common.locate.altbeacon.beacon.e.b.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // com.meituan.android.common.locate.util.o
                    /* renamed from: a */
                    public com.meituan.android.common.locate.altbeacon.beacon.bean.a b(Void... voidArr) {
                        Object[] objArr2 = {voidArr};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6db9ce8a1d24b1c90bbf47dbe28e8ff4", RobustBitConfig.DEFAULT_VALUE)) {
                            return (com.meituan.android.common.locate.altbeacon.beacon.bean.a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6db9ce8a1d24b1c90bbf47dbe28e8ff4");
                        }
                        if (e.this.b != null) {
                            com.meituan.android.common.locate.provider.a.a(e.this.a);
                            return e.this.b.a(com.meituan.android.common.locate.provider.a.a, com.meituan.android.common.locate.provider.a.c(), com.meituan.android.common.locate.provider.a.d(), com.meituan.android.common.locate.provider.b.a());
                        }
                        return null;
                    }

                    @Override // com.meituan.android.common.locate.util.o
                    public void a(com.meituan.android.common.locate.altbeacon.beacon.bean.a aVar2) {
                        Object[] objArr2 = {aVar2};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3b0f7942b30e52c7f9d90df264e826ee", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3b0f7942b30e52c7f9d90df264e826ee");
                        } else if (aVar2 == null) {
                            com.meituan.android.common.locate.platform.sniffer.b.b(new c.a("sniffer_module_beacon_net_conf", "config_fail"));
                            if (e.this.g == 2) {
                                b.this.a();
                            }
                        } else {
                            com.meituan.android.common.locate.altbeacon.beacon.util.d.a("NetConfig:" + aVar2.toString());
                            com.meituan.android.common.locate.platform.sniffer.b.a(new c.a("sniffer_module_beacon_net_conf", "config_suc"));
                            b.this.a = aVar2;
                            if (e.this.g == 2) {
                                b.this.a();
                            }
                        }
                    }

                    @Override // com.meituan.android.common.locate.util.o
                    public void a(Throwable th) {
                        b.this.a = null;
                    }
                }.b();
            } else {
                a();
            }
        }
    }

    /* loaded from: classes2.dex */
    public class c implements a {
        public static ChangeQuickRedirect changeQuickRedirect;

        public c() {
            Object[] objArr = {e.this};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b1b1ce639940eed74cf550b66805967a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b1b1ce639940eed74cf550b66805967a");
            }
        }

        public void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8d068d8f2ad70eb4603de3b17d94c1ea", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8d068d8f2ad70eb4603de3b17d94c1ea");
            } else {
                e.this.h.sendEmptyMessage(2);
            }
        }

        @Override // com.meituan.android.common.locate.altbeacon.beacon.e.a
        public void a(a aVar, Object obj) {
            Object[] objArr = {aVar, obj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "38cb4b64a21af3b1afbb00eafdada2f8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "38cb4b64a21af3b1afbb00eafdada2f8");
                return;
            }
            e.this.g = 1;
            if (com.meituan.android.common.locate.altbeacon.beacon.util.b.a(e.this.a) != 0) {
                com.meituan.android.common.locate.platform.sniffer.b.b(new c.a("sniffer_module_beacon_device_state", "nonsupport"));
            } else if (!com.meituan.android.common.locate.altbeacon.beacon.util.b.b(e.this.a)) {
                com.meituan.android.common.locate.platform.sniffer.b.b(new c.a("sniffer_module_beacon_device_state", "switch_close"));
            } else {
                com.meituan.android.common.locate.platform.sniffer.b.a(new c.a("sniffer_module_beacon_device_state", "state_ok"));
                a();
            }
        }
    }

    /* loaded from: classes2.dex */
    public class d implements a {
        public static ChangeQuickRedirect changeQuickRedirect;

        public d() {
            Object[] objArr = {e.this};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3a8737441d8b80da3af8211fcd576b69", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3a8737441d8b80da3af8211fcd576b69");
            }
        }

        public void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a27f246e7e289f56148e7b246b0234cd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a27f246e7e289f56148e7b246b0234cd");
                return;
            }
            e.this.h.removeCallbacksAndMessages(null);
            e.this.h.sendEmptyMessageDelayed(2, com.meituan.android.common.locate.altbeacon.beacon.config.a.a().b);
        }

        @Override // com.meituan.android.common.locate.altbeacon.beacon.e.a
        public void a(a aVar, Object obj) {
            c.a aVar2;
            Object[] objArr = {aVar, obj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f3bf2bcaeaae944ec97437c818046b06", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f3bf2bcaeaae944ec97437c818046b06");
                return;
            }
            e.this.g = 3;
            com.meituan.android.common.locate.altbeacon.beacon.a a = com.meituan.android.common.locate.altbeacon.beacon.util.b.a(obj);
            if (a == null && e.this.c != null && e.this.c.a()) {
                e.this.c.b();
            }
            if (a == null && !LocationUtils.h(e.this.a)) {
                a();
            } else if (a == null) {
            } else {
                com.meituan.android.common.locate.altbeacon.beacon.util.d.a("AltBeacon:" + a.toString());
                if (e.this.c == null) {
                    e.this.c = new com.meituan.android.common.locate.altbeacon.beacon.c(e.this.a);
                }
                if (e.this.c.a()) {
                    e.this.c.b();
                    aVar2 = new c.a("sniffer_module_beacon_start", "restart");
                } else {
                    aVar2 = new c.a("sniffer_module_beacon_start", "start");
                }
                com.meituan.android.common.locate.platform.sniffer.b.b(aVar2);
                e.this.c.a(a);
                a();
            }
        }
    }

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "66b15f4f70b81febcc577b1d171f5742", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "66b15f4f70b81febcc577b1d171f5742");
            return;
        }
        this.b = com.meituan.android.common.locate.remote.c.a();
        this.d = new c();
        this.e = new b();
        this.f = new d();
    }

    public static e a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "74da190f3bfddf1411037a01e95116dd", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "74da190f3bfddf1411037a01e95116dd");
        }
        if (i == null) {
            synchronized (e.class) {
                if (i == null) {
                    i = new e();
                }
            }
        }
        return i;
    }

    @Override // com.meituan.android.common.locate.altbeacon.beacon.d
    public boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "72830b474af8a3d8bacab3d4d22b6c99", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "72830b474af8a3d8bacab3d4d22b6c99")).booleanValue();
        }
        com.meituan.android.common.locate.altbeacon.beacon.util.d.a("startTransmitter type:" + str);
        if (super.a(str)) {
            this.g = 1;
            this.h.removeCallbacksAndMessages(null);
            this.h.sendEmptyMessageDelayed(1, 10000L);
            return true;
        }
        return false;
    }

    @Override // com.meituan.android.common.locate.altbeacon.beacon.d
    public boolean b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f54ed23d4f82462aea0f1d67fc2012a6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f54ed23d4f82462aea0f1d67fc2012a6")).booleanValue();
        }
        com.meituan.android.common.locate.altbeacon.beacon.util.d.a("stopTransmitter type:" + str);
        return super.b(str);
    }

    @Override // com.meituan.android.common.locate.altbeacon.beacon.d, android.os.Handler.Callback
    public /* bridge */ /* synthetic */ boolean handleMessage(@NonNull Message message) {
        return super.handleMessage(message);
    }
}
