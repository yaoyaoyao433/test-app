package com.sankuai.meituan.takeoutnew.ui.page.boot;

import android.content.Context;
import com.meituan.android.cipstorage.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.base.WmBaseActivity;
import com.sankuai.waimai.business.page.home.utils.j;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WelcomeActivity extends WmBaseActivity {
    public static ChangeQuickRedirect b = null;
    public static long c = 0;
    private static boolean f = true;
    private boolean d;
    private boolean e;

    public WelcomeActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "635bd8a9141e532d5eaf14a5be671e87", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "635bd8a9141e532d5eaf14a5be671e87");
            return;
        }
        this.d = false;
        this.e = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007b A[Catch: Exception -> 0x00eb, TryCatch #0 {Exception -> 0x00eb, blocks: (B:6:0x001b, B:8:0x0040, B:10:0x0051, B:15:0x0066, B:17:0x007b, B:19:0x008e, B:28:0x00bc, B:31:0x00c3, B:33:0x00da, B:20:0x0099, B:22:0x009f, B:25:0x00aa, B:32:0x00d6), top: B:38:0x001b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(com.sankuai.meituan.takeoutnew.ui.page.boot.WelcomeActivity r14, android.content.Intent r15) {
        /*
            r9 = 1
            java.lang.Object[] r10 = new java.lang.Object[r9]
            r11 = 0
            r10[r11] = r15
            com.meituan.robust.ChangeQuickRedirect r12 = com.sankuai.meituan.takeoutnew.ui.page.boot.WelcomeActivity.b
            java.lang.String r13 = "8805cf1dc4dd538d3ca303189c835841"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r10
            r2 = r14
            r3 = r12
            r5 = r13
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1b
            com.meituan.robust.PatchProxy.accessDispatch(r10, r14, r12, r11, r13)
            return
        L1b:
            java.lang.String r1 = "redirect_to_other_page"
            com.sankuai.waimai.business.page.home.utils.j.cancel(r1)     // Catch: java.lang.Exception -> Leb
            android.net.Uri r1 = r15.getData()     // Catch: java.lang.Exception -> Leb
            java.lang.String r2 = "com.sankuai.waimai.router.from"
            int r2 = com.sankuai.waimai.platform.utils.f.a(r15, r2, r9)     // Catch: java.lang.Exception -> Leb
            java.lang.String r3 = r1.getPath()     // Catch: java.lang.Exception -> Leb
            android.app.Activity r4 = r14.bB_()     // Catch: java.lang.Exception -> Leb
            r5 = 2131363634(0x7f0a0732, float:1.8347082E38)
            java.lang.String r4 = r4.getString(r5)     // Catch: java.lang.Exception -> Leb
            boolean r4 = r4.equals(r3)     // Catch: java.lang.Exception -> Leb
            if (r4 != 0) goto L65
            android.app.Activity r4 = r14.bB_()     // Catch: java.lang.Exception -> Leb
            r5 = 2131363630(0x7f0a072e, float:1.8347074E38)
            java.lang.String r4 = r4.getString(r5)     // Catch: java.lang.Exception -> Leb
            boolean r4 = r4.equals(r3)     // Catch: java.lang.Exception -> Leb
            if (r4 != 0) goto L65
            android.app.Activity r4 = r14.bB_()     // Catch: java.lang.Exception -> Leb
            r5 = 2131363624(0x7f0a0728, float:1.8347062E38)
            java.lang.String r4 = r4.getString(r5)     // Catch: java.lang.Exception -> Leb
            boolean r3 = r4.equals(r3)     // Catch: java.lang.Exception -> Leb
            if (r3 == 0) goto L63
            goto L65
        L63:
            r3 = 0
            goto L66
        L65:
            r3 = 1
        L66:
            android.app.Activity r4 = r14.bB_()     // Catch: java.lang.Exception -> Leb
            android.content.Intent r10 = com.sankuai.meituan.takeoutnew.ui.page.boot.SchemeDispatchActivityDelegate.a(r4, r1, r2)     // Catch: java.lang.Exception -> Leb
            java.lang.String r1 = "_dl_task_ext_"
            java.lang.String r2 = "_dl_task_ext_"
            java.io.Serializable r2 = com.sankuai.waimai.platform.utils.f.c(r15, r2)     // Catch: java.lang.Exception -> Leb
            r10.putExtra(r1, r2)     // Catch: java.lang.Exception -> Leb
            if (r3 != 0) goto Ld6
            java.lang.Object[] r8 = new java.lang.Object[r11]     // Catch: java.lang.Exception -> Leb
            com.meituan.robust.ChangeQuickRedirect r12 = com.sankuai.meituan.takeoutnew.ui.page.boot.WelcomeActivity.b     // Catch: java.lang.Exception -> Leb
            java.lang.String r13 = "82fb3fddd6e2dbe0329114ec99471a62"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r14
            r3 = r12
            r5 = r13
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> Leb
            if (r1 == 0) goto L99
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r8, r14, r12, r11, r13)     // Catch: java.lang.Exception -> Leb
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Exception -> Leb
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Exception -> Leb
            goto Lba
        L99:
            android.content.Intent r1 = r14.getIntent()     // Catch: java.lang.Exception -> Leb
            if (r1 == 0) goto Lb9
            android.content.Intent r1 = r14.getIntent()     // Catch: java.lang.Exception -> Leb
            android.os.Bundle r1 = r1.getExtras()     // Catch: java.lang.Exception -> Leb
            if (r1 != 0) goto Laa
            goto Lb9
        Laa:
            android.content.Intent r1 = r14.getIntent()     // Catch: java.lang.Exception -> Leb
            android.os.Bundle r1 = r1.getExtras()     // Catch: java.lang.Exception -> Leb
            java.lang.String r2 = "extra_from_wx"
            boolean r1 = r1.getBoolean(r2, r11)     // Catch: java.lang.Exception -> Leb
            goto Lba
        Lb9:
            r1 = 0
        Lba:
            if (r1 == 0) goto Lc3
            boolean r1 = com.sankuai.meituan.takeoutnew.ui.page.boot.MainActivityLifecycle.isMainActivityCreated()     // Catch: java.lang.Exception -> Leb
            if (r1 == 0) goto Lc3
            goto Ld6
        Lc3:
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Exception -> Leb
            android.app.Activity r2 = r14.bB_()     // Catch: java.lang.Exception -> Leb
            java.lang.Class<com.sankuai.waimai.business.page.homepage.MainActivity> r3 = com.sankuai.waimai.business.page.homepage.MainActivity.class
            r1.<init>(r2, r3)     // Catch: java.lang.Exception -> Leb
            r2 = 2
            android.content.Intent[] r2 = new android.content.Intent[r2]     // Catch: java.lang.Exception -> Leb
            r2[r11] = r1     // Catch: java.lang.Exception -> Leb
            r2[r9] = r10     // Catch: java.lang.Exception -> Leb
            goto Lda
        Ld6:
            android.content.Intent[] r2 = new android.content.Intent[r9]     // Catch: java.lang.Exception -> Leb
            r2[r11] = r10     // Catch: java.lang.Exception -> Leb
        Lda:
            android.app.Activity r1 = r14.bB_()     // Catch: java.lang.Exception -> Leb
            r1.startActivities(r2)     // Catch: java.lang.Exception -> Leb
            r14.finish()     // Catch: java.lang.Exception -> Leb
            r1 = 2131034281(0x7f0500a9, float:1.7679075E38)
            r14.overridePendingTransition(r1, r1)     // Catch: java.lang.Exception -> Leb
            return
        Leb:
            r0 = move-exception
            java.lang.String r1 = "WelcomeSchemeJump"
            com.sankuai.waimai.foundation.utils.log.a.b(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.takeoutnew.ui.page.boot.WelcomeActivity.a(com.sankuai.meituan.takeoutnew.ui.page.boot.WelcomeActivity, android.content.Intent):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0289  */
    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r24) {
        /*
            Method dump skipped, instructions count: 973
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.takeoutnew.ui.page.boot.WelcomeActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "605bc5b8300d0d3138f3bcd11783017b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "605bc5b8300d0d3138f3bcd11783017b");
            return;
        }
        super.onResume();
        j.a("welcome_page_resume_end");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        char c2;
        Object valueOf;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77d0c25d53d0490811086b9993392f0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77d0c25d53d0490811086b9993392f0f");
            return;
        }
        super.onStop();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4b13e072589644d88434defa8a87f3f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4b13e072589644d88434defa8a87f3f8");
            return;
        }
        com.sankuai.waimai.platform.capacity.persistent.sp.a.a((Context) bB_(), "order_source", "default");
        if (com.sankuai.waimai.foundation.router.a.b(getIntent())) {
            com.sankuai.waimai.platform.capacity.persistent.sp.a.a((Context) bB_(), "order_source", "push");
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = b;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9fdb12d403133c026ad007c18fec7425", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9fdb12d403133c026ad007c18fec7425");
            return;
        }
        Boolean bool = Boolean.TRUE;
        Object[] objArr4 = {this, "w_newuser", Boolean.class, bool};
        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.platform.capacity.persistent.sp.a.a;
        if (!PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "ce59cbe961b5cfd65998300cdd6eb1b0", RobustBitConfig.DEFAULT_VALUE)) {
            q a = q.a(this, "waimai_takeout", 1);
            String substring = Boolean.class.getName().substring(10);
            switch (substring.hashCode()) {
                case -1808118735:
                    if (substring.equals("String")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -672261858:
                    if (substring.equals("Integer")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2374300:
                    if (substring.equals("Long")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 67973692:
                    if (substring.equals("Float")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1729365000:
                    if (substring.equals("Boolean")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    valueOf = Boolean.valueOf(a.b("w_newuser", bool.booleanValue()));
                    break;
                case 1:
                    valueOf = Float.valueOf(a.b("w_newuser", ((Float) bool).floatValue()));
                    break;
                case 2:
                    valueOf = Integer.valueOf(a.b("w_newuser", ((Integer) bool).intValue()));
                    break;
                case 3:
                    valueOf = Long.valueOf(a.b("w_newuser", ((Long) bool).longValue()));
                    break;
                case 4:
                    valueOf = a.b("w_newuser", (String) bool);
                    break;
                default:
                    valueOf = null;
                    break;
            }
        } else {
            valueOf = PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "ce59cbe961b5cfd65998300cdd6eb1b0");
        }
        if (((Boolean) valueOf).booleanValue()) {
            Boolean bool2 = Boolean.FALSE;
            Object[] objArr5 = {this, "w_newuser", bool2};
            ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.platform.capacity.persistent.sp.a.a;
            if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "80c78fb166bc3d85542aa1ed1068377e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "80c78fb166bc3d85542aa1ed1068377e");
                return;
            }
            q a2 = q.a(this, "waimai_takeout", 1);
            if (bool2 instanceof Boolean) {
                a2.a("w_newuser", bool2.booleanValue());
            }
        }
    }
}
