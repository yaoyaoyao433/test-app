package com.xiaomi.push.service;

import android.os.Build;
import android.provider.Settings;
import com.xiaomi.push.ha;
import com.xiaomi.push.ia;
import com.xiaomi.push.ik;
import com.xiaomi.push.service.XMPushService;
import java.util.HashMap;
/* loaded from: classes6.dex */
public final class bp extends XMPushService.j {
    final /* synthetic */ XMPushService a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp(XMPushService xMPushService, int i) {
        super(17);
        this.a = xMPushService;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public final String b() {
        return "[Guardian] send parents_guardian_state";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public final void a() {
        if (Build.VERSION.SDK_INT >= 17) {
            String string = Settings.Global.getString(this.a.getContentResolver(), "parents_guardian_state");
            cm a = cn.a(this.a);
            if (a == null) {
                return;
            }
            ia iaVar = new ia();
            iaVar.d = a.d;
            iaVar.e = "1".equals(string) ? "kids_mode_on" : "kids_mode_off";
            iaVar.c = ad.a();
            iaVar.h = new HashMap();
            this.a.a(this.a.getPackageName(), ik.a(h.a(this.a.getPackageName(), a.d, iaVar, ha.Notification)), false);
        }
    }
}
