package com.sankuai.meituan.takeoutnew.ui.page.boot;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.sankuai.waimai.foundation.core.base.activity.transfer.BaseActivityDelegate;
import com.sankuai.waimai.foundation.core.base.activity.transfer.TransferActivity;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.launcher.provider.scheme.d;
import java.io.Serializable;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class SchemeProxyActivityDelegate extends BaseActivityDelegate {
    public static ChangeQuickRedirect a;
    private boolean b;
    private String c;

    public SchemeProxyActivityDelegate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fffbdf49340ca03238b14a8bebe8c70", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fffbdf49340ca03238b14a8bebe8c70");
            return;
        }
        this.b = false;
        this.c = "";
    }

    public static Intent a(Context context, String str, int i) {
        Object[] objArr = {context, str, 4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9c3d8512350af7f1626b9afb7053a94e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9c3d8512350af7f1626b9afb7053a94e");
        }
        Intent intent = new Intent(context, TransferActivity.class);
        intent.setData(Uri.parse(str));
        intent.putExtra("com.sankuai.waimai.router.from", 4);
        return intent;
    }

    public static Intent a(Context context, String str, int i, JSONObject jSONObject) {
        Object[] objArr = {context, str, Integer.valueOf(i), jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "abc15969882e641cf1e897102a19974e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "abc15969882e641cf1e897102a19974e");
        }
        Intent intent = new Intent(context, TransferActivity.class);
        intent.setData(Uri.parse(str));
        intent.putExtra("com.sankuai.waimai.router.from", i);
        if (jSONObject != null) {
            int optInt = jSONObject.optInt(PushConstants.PUSH_TYPE);
            String optString = jSONObject.optString("category", "");
            String optString2 = jSONObject.optString("messageId", "");
            int optInt2 = jSONObject.optInt("im_type");
            intent.putExtra("category", optString);
            intent.putExtra("messageId", optString2);
            intent.putExtra(PushConstants.PUSH_TYPE, optInt);
            intent.putExtra("im_type", optInt2);
        }
        return intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0153  */
    @Override // com.sankuai.waimai.foundation.core.base.activity.transfer.BaseActivityDelegate, com.sankuai.waimai.foundation.core.base.activity.transfer.lifecycle.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.sankuai.waimai.foundation.core.base.activity.transfer.TransferActivity r23, @android.support.annotation.Nullable android.os.Bundle r24) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.takeoutnew.ui.page.boot.SchemeProxyActivityDelegate.a(com.sankuai.waimai.foundation.core.base.activity.transfer.TransferActivity, android.os.Bundle):void");
    }

    private long b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4931557f0ef80a89c14aa8562b95a2ac", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4931557f0ef80a89c14aa8562b95a2ac")).longValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(@android.support.annotation.NonNull android.net.Uri r22, int r23, boolean r24, android.net.Uri r25, java.io.Serializable r26) {
        /*
            r21 = this;
            r7 = r21
            r8 = r23
            r9 = r25
            r10 = r26
            r11 = 5
            java.lang.Object[] r12 = new java.lang.Object[r11]
            r13 = 0
            r12[r13] = r22
            java.lang.Integer r0 = java.lang.Integer.valueOf(r23)
            r5 = 1
            r12[r5] = r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r24)
            r15 = 2
            r12[r15] = r0
            r16 = 3
            r12[r16] = r9
            r6 = 4
            r12[r6] = r10
            com.meituan.robust.ChangeQuickRedirect r4 = com.sankuai.meituan.takeoutnew.ui.page.boot.SchemeProxyActivityDelegate.a
            java.lang.String r3 = "a34fbee591c27278ceee0117a40f70c9"
            r17 = 0
            r18 = 4611686018427387904(0x4000000000000000, double:2.0)
            r0 = r12
            r1 = r21
            r2 = r4
            r20 = r3
            r3 = r17
            r11 = r4
            r4 = r20
            r5 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L44
            r0 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r12, r7, r11, r13, r0)
            return
        L44:
            java.lang.String r0 = "WMRouter"
            java.lang.String r1 = "%s, jump, from = %d, startWelcome = %s, uri = %s"
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "SchemeProxyActivityDelegate"
            r2[r13] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r23)
            r4 = 1
            r2[r4] = r3
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r24)
            r2[r15] = r3
            java.lang.String r3 = r22.toString()
            r2[r16] = r3
            com.sankuai.waimai.foundation.utils.log.a.b(r0, r1, r2)
            if (r8 == r4) goto L6a
            r0 = 5
            if (r8 != r0) goto L73
        L6a:
            boolean r0 = com.sankuai.meituan.takeoutnew.util.b.a()
            if (r24 != 0) goto L76
            if (r0 == 0) goto L73
            goto L76
        L73:
            r14 = r22
            goto L7b
        L76:
            android.net.Uri r0 = com.sankuai.meituan.takeoutnew.util.b.a(r22)
            r14 = r0
        L7b:
            if (r24 == 0) goto Ldb
            boolean r0 = com.sankuai.waimai.platform.capacity.deeplink.a.a()
            if (r0 == 0) goto Ld4
            boolean r0 = com.sankuai.meituan.takeoutnew.app.config.WaimaiSP.f()
            if (r0 == 0) goto Ld4
            int r0 = com.sankuai.waimai.platform.capacity.deeplink.a.a(r25)
            if (r0 != r4) goto Ld4
            java.lang.String r0 = com.sankuai.meituan.takeoutnew.a.d
            boolean r0 = com.sankuai.waimai.platform.capacity.deeplink.a.a(r9, r0)
            if (r0 == 0) goto Ld4
            java.lang.String r0 = "redirect_to_other_page"
            com.sankuai.waimai.business.page.home.utils.j.cancel(r0)
            com.sankuai.waimai.foundation.core.base.activity.transfer.TransferActivity r0 = r7.h
            com.sankuai.waimai.router.common.b r1 = new com.sankuai.waimai.router.common.b
            r1.<init>(r0, r14)
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            com.sankuai.waimai.router.common.b r1 = r1.a(r2)
            java.lang.String r2 = "com.sankuai.waimai.router.from"
            com.sankuai.waimai.router.common.b r1 = r1.a(r2, r8)
            java.lang.String r2 = "_wm_dm_"
            com.sankuai.waimai.router.common.b r1 = r1.a(r2, r4)
            java.lang.String r2 = "_wm_rta_"
            java.lang.String r3 = com.sankuai.waimai.platform.capacity.deeplink.a.b(r25)
            com.sankuai.waimai.router.common.b r1 = r1.a(r2, r3)
            com.sankuai.waimai.router.common.b r1 = r1.a(r13, r13)
            r1.g()
            r0.finish()
            java.lang.String r0 = "t1"
            com.sankuai.waimai.platform.capacity.deeplink.b.b(r0)
            com.sankuai.waimai.platform.capacity.deeplink.b.a(r4)
            return
        Ld4:
            r7.a(r14, r8, r10)
            com.sankuai.waimai.platform.capacity.deeplink.b.a(r13)
            return
        Ldb:
            r7.b(r14, r8, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.takeoutnew.ui.page.boot.SchemeProxyActivityDelegate.a(android.net.Uri, int, boolean, android.net.Uri, java.io.Serializable):void");
    }

    private void a(@NonNull Uri uri, int i, Serializable serializable) {
        Object[] objArr = {uri, Integer.valueOf(i), serializable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8466ff977f58e519b8198c97725544d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8466ff977f58e519b8198c97725544d4");
            return;
        }
        try {
            Intent intent = new Intent(this.h, WelcomeActivity.class);
            intent.setData(uri);
            intent.putExtra("com.sankuai.waimai.router.from", i);
            intent.putExtra("_dl_task_ext_", serializable);
            this.h.startActivity(intent);
            this.h.finish();
            this.h.overridePendingTransition(R.anim.wm_common_stay_still, R.anim.wm_common_stay_still);
        } catch (Exception unused) {
            ae.a((Activity) this.h, (int) R.string.wm_main_jump_failed);
        }
    }

    private void b(@NonNull Uri uri, int i, Serializable serializable) {
        Object[] objArr = {uri, Integer.valueOf(i), serializable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7131e3d276423702ded750ff40cdaa2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7131e3d276423702ded750ff40cdaa2");
            return;
        }
        try {
            if (this.b && !TextUtils.isEmpty(this.c)) {
                com.sankuai.waimai.foundation.router.a.a().a(Integer.parseInt(this.c)).a(this.h, d.a(uri));
                return;
            }
            Intent a2 = SchemeDispatchActivityDelegate.a(this.h, uri, i);
            a2.putExtra("_dl_task_ext_", serializable);
            this.h.startActivity(a2);
            this.h.finish();
            this.h.overridePendingTransition(R.anim.wm_common_stay_still, R.anim.wm_common_stay_still);
        } catch (Throwable th) {
            com.sankuai.waimai.foundation.utils.log.a.b(th);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.transfer.BaseActivityDelegate, com.sankuai.waimai.foundation.core.base.activity.transfer.lifecycle.a
    public final void a(TransferActivity transferActivity, int i, int i2, Intent intent) {
        Object[] objArr = {transferActivity, Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "daf1a1e07a57b98dd054a6cd8b946476", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "daf1a1e07a57b98dd054a6cd8b946476");
        } else if (this.b && !TextUtils.isEmpty(this.c) && Integer.parseInt(this.c) == i) {
            if (intent != null && intent.getExtras() != null) {
                Intent intent2 = new Intent();
                intent2.putExtras(intent.getExtras());
                this.h.setResult(i2, intent2);
            } else {
                this.h.setResult(i2);
            }
            this.h.finish();
            this.h.overridePendingTransition(R.anim.wm_common_stay_still, R.anim.wm_common_stay_still);
        }
    }
}
