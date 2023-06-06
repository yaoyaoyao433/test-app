package com.meituan.android.legwork.common.jarvis;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.android.legwork.utils.x;
import com.meituan.android.legwork.utils.z;
import com.meituan.banma.jarvis.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private RequireJarvisConfigReceiver b;
    private boolean c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.legwork.common.jarvis.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0263a {
        private static final a a = new a();
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b9470520b3944e7571e9ebb4a754d712", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b9470520b3944e7571e9ebb4a754d712") : C0263a.a;
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3312d2ab37a516bbf1c3d9b71f81043f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3312d2ab37a516bbf1c3d9b71f81043f");
        } else {
            this.c = false;
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ece9d003f4a61c163070a7df903fdd4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ece9d003f4a61c163070a7df903fdd4");
        } else if (!this.c) {
            e();
        } else {
            c();
        }
    }

    private void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5d11ac12a98f0e4d38970c5c3dba56b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5d11ac12a98f0e4d38970c5c3dba56b");
            return;
        }
        this.c = true;
        if (this.b == null) {
            this.b = new RequireJarvisConfigReceiver();
            this.b.a(com.meituan.android.legwork.a.a());
        }
        c.a().a(f());
        c.a().a(new com.meituan.banma.jarvis.env.b() { // from class: com.meituan.android.legwork.common.jarvis.a.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.banma.jarvis.env.b
            public final long a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e4338b7f0f23b751e8f78ed1983031a7", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e4338b7f0f23b751e8f78ed1983031a7")).longValue() : z.a("jarvis_polling_time_seconds", 180L);
            }

            @Override // com.meituan.banma.jarvis.env.b
            public final int b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d536f36fe0be64d5572fdaa241bbc468", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d536f36fe0be64d5572fdaa241bbc468")).intValue() : z.b("jarvis_file_cache_time_hours", 3);
            }
        });
        c.a().a(com.meituan.android.legwork.net.manager.a.a().b());
        c.a().a(com.meituan.android.legwork.a.c, new com.meituan.banma.jarvis.env.a() { // from class: com.meituan.android.legwork.common.jarvis.a.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.banma.jarvis.env.a
            public final Map<String, Object> a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0abae32e0f9ab92238d29b167fdbc8bd", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Map) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0abae32e0f9ab92238d29b167fdbc8bd");
                }
                HashMap<String, Object> hashMap = new HashMap<String, Object>() { // from class: com.meituan.android.legwork.common.jarvis.a.2.1
                    {
                        put(DeviceInfo.USER_ID, Long.valueOf(com.meituan.android.legwork.common.user.a.a().d()));
                        com.meituan.android.legwork.common.hostInfo.b.e();
                        put("ctype", com.meituan.android.legwork.common.hostInfo.b.h());
                        put("appVersion", com.meituan.android.legwork.common.hostInfo.b.e().c());
                        put("channel", com.meituan.android.legwork.common.hostInfo.b.e().a());
                    }
                };
                long j = 0;
                try {
                    j = Long.parseLong(com.meituan.android.legwork.common.location.c.l().j());
                } catch (NumberFormatException e) {
                    x.e("LegworkJarvisManager", "transform cityId to long exception " + e);
                }
                hashMap.put("cityId", Long.valueOf(j));
                return hashMap;
            }
        }, b.a(this));
        x.c("LegworkJarvisManager.init", "初始化并开启Jarvis降级轮询");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42b092f6bc3cbfcc61d3de1d23287135", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42b092f6bc3cbfcc61d3de1d23287135");
            return;
        }
        x.c("LegworkJarvisManager.restartLooper", "重新启动Jarvis降级轮询");
        if (this.b == null) {
            this.b = new RequireJarvisConfigReceiver();
            this.b.a(com.meituan.android.legwork.a.a());
        }
        c.a().b();
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c30b4684d3ae56533a303117b2f3e2e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c30b4684d3ae56533a303117b2f3e2e7");
            return;
        }
        x.c("LegworkJarvisManager.stopLooper", "停止Jarvis降级轮询");
        if (this.b != null) {
            this.b.b(com.meituan.android.legwork.a.a());
            this.b = null;
        }
        c.a().c();
    }

    public final Map<String, Object> a(@NonNull String str, int i, String str2) {
        Map<String, Object> a2;
        String str3;
        Object[] objArr = {str, Integer.valueOf(i), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2368edf4e04cd6e6096d6240dd64912f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2368edf4e04cd6e6096d6240dd64912f");
        }
        if (this.c && !TextUtils.isEmpty(str) && com.meituan.android.legwork.common.util.a.a().c()) {
            try {
                c a3 = c.a();
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = c.a;
                a2 = PatchProxy.isSupport(objArr2, a3, changeQuickRedirect2, false, "22ee07d91ea25381f5fed9b0628ca99c", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr2, a3, changeQuickRedirect2, false, "22ee07d91ea25381f5fed9b0628ca99c") : com.meituan.banma.jarvis.b.a();
            } catch (Exception e) {
                x.e("LegworkJarvisManager", "getPageDegradeInfo exception " + e);
                x.a(e);
            }
            if (a2 != null && TextUtils.equals(str2, "scrollBarConfig")) {
                List<Map<String, Object>> list = (List) a2.get(str2);
                if (list != null && list.size() > 0) {
                    for (Map<String, Object> map : list) {
                        try {
                            str3 = (String) map.get("pageUri");
                        } catch (Exception e2) {
                            e = e2;
                        }
                        if (TextUtils.equals(str, str3)) {
                            return map;
                        }
                        if (!TextUtils.isEmpty(str3)) {
                            Uri parse = Uri.parse(str);
                            Uri parse2 = Uri.parse(str3);
                            if (i == 9) {
                                try {
                                    if (TextUtils.equals(parse.getQueryParameter("mrn_biz"), parse2.getQueryParameter("mrn_biz")) && TextUtils.equals(parse.getQueryParameter("mrn_entry"), parse2.getQueryParameter("mrn_entry")) && TextUtils.equals(parse.getQueryParameter("mrn_component"), parse2.getQueryParameter("mrn_component"))) {
                                        return map;
                                    }
                                } catch (Exception e3) {
                                    e = e3;
                                    x.e("LegworkJarvisManager", "getPageDegradeInfo exception " + e);
                                    x.a(e);
                                }
                            } else if (TextUtils.equals(parse.getPath(), parse2.getPath())) {
                                return map;
                            }
                        }
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
        if (r1.equals("http://paotui.banma.st.meituan.com/") != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.meituan.banma.jarvis.env.d f() {
        /*
            r11 = this;
            r0 = 0
            java.lang.Object[] r8 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.android.legwork.common.jarvis.a.a
            java.lang.String r10 = "8643eca3bbd50a453a8a0611fd6436b7"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1b
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r8, r11, r9, r0, r10)
            com.meituan.banma.jarvis.env.d r0 = (com.meituan.banma.jarvis.env.d) r0
            return r0
        L1b:
            com.meituan.banma.jarvis.env.d r1 = com.meituan.banma.jarvis.env.d.ENV_RELEASE
            boolean r2 = com.meituan.android.legwork.a.b
            if (r2 == 0) goto L7e
            com.meituan.android.legwork.net.b r1 = com.meituan.android.legwork.net.b.a()
            r2 = 1
            java.lang.String r1 = r1.a(r2)
            r3 = -1
            int r4 = r1.hashCode()
            r5 = -884561102(0xffffffffcb46ab32, float:-1.3019954E7)
            if (r4 == r5) goto L64
            r5 = -623254999(0xffffffffdad9e229, float:-3.06643678E16)
            if (r4 == r5) goto L59
            r5 = 280837325(0x10bd3ccd, float:7.4641034E-29)
            if (r4 == r5) goto L4f
            r0 = 1869995808(0x6f75df20, float:7.609357E28)
            if (r4 == r0) goto L44
            goto L6f
        L44:
            java.lang.String r0 = "http://paotui.banma.dev.sankuai.com/"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6f
            r0 = 1
            goto L70
        L4f:
            java.lang.String r2 = "http://paotui.banma.st.meituan.com/"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L6f
            goto L70
        L59:
            java.lang.String r0 = "http://paotui.banma.test.sankuai.com/"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6f
            r0 = 2
            goto L70
        L64:
            java.lang.String r0 = "https://paotui.meituan.com/"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6f
            r0 = 3
            goto L70
        L6f:
            r0 = -1
        L70:
            switch(r0) {
                case 0: goto L7c;
                case 1: goto L79;
                case 2: goto L76;
                default: goto L73;
            }
        L73:
            com.meituan.banma.jarvis.env.d r1 = com.meituan.banma.jarvis.env.d.ENV_RELEASE
            goto L7e
        L76:
            com.meituan.banma.jarvis.env.d r1 = com.meituan.banma.jarvis.env.d.ENV_TEST
            goto L7e
        L79:
            com.meituan.banma.jarvis.env.d r1 = com.meituan.banma.jarvis.env.d.ENV_DEV
            goto L7e
        L7c:
            com.meituan.banma.jarvis.env.d r1 = com.meituan.banma.jarvis.env.d.ENV_STAGING
        L7e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.legwork.common.jarvis.a.f():com.meituan.banma.jarvis.env.d");
    }
}
