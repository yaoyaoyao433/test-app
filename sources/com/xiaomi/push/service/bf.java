package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.push.ha;
import com.xiaomi.push.hr;
import com.xiaomi.push.hs;
import com.xiaomi.push.hw;
import com.xiaomi.push.hx;
import com.xiaomi.push.ia;
import com.xiaomi.push.ic;
import com.xiaomi.push.id;
import com.xiaomi.push.ie;
import com.xiaomi.push.ig;
import com.xiaomi.push.ii;
import com.xiaomi.push.ij;
import com.xiaomi.push.ik;
import com.xiaomi.push.il;
/* loaded from: classes6.dex */
public final class bf {
    public static il a(Context context, hx hxVar) {
        hw hwVar = null;
        if (hxVar.b) {
            return null;
        }
        byte[] a = hxVar.a();
        ha haVar = hxVar.a;
        boolean z = hxVar.c;
        switch (haVar) {
            case Registration:
                hwVar = new ic();
                break;
            case UnRegistration:
                hwVar = new ii();
                break;
            case Subscription:
                hwVar = new ig();
                break;
            case UnSubscription:
                hwVar = new ij();
                break;
            case SendMessage:
                hwVar = new ie();
                break;
            case AckMessage:
                hwVar = new hr();
                break;
            case SetConfig:
                hwVar = new hw();
                break;
            case ReportFeedback:
                hwVar = new id();
                break;
            case Notification:
                if (!z) {
                    hs hsVar = new hs();
                    hsVar.a(true);
                    hwVar = hsVar;
                    break;
                } else {
                    hwVar = new ia();
                    break;
                }
            case Command:
                hwVar = new hw();
                break;
        }
        if (hwVar != null) {
            ik.a(hwVar, a);
        }
        return hwVar;
    }
}
