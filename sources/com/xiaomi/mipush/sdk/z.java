package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.ge;
import com.xiaomi.push.ha;
import com.xiaomi.push.hq;
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
import java.nio.ByteBuffer;
/* loaded from: classes6.dex */
public final class z {
    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends il<T, ?>> hx a(Context context, T t, ha haVar, boolean z, String str, String str2) {
        return a(context, t, haVar, z, str, str2, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends il<T, ?>> hx b(Context context, T t, ha haVar, boolean z, String str, String str2) {
        return a(context, t, haVar, z, str, str2, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends il<T, ?>> hx a(Context context, T t, ha haVar) {
        return a(context, t, haVar, !haVar.equals(ha.Registration), context.getPackageName(), ap.a(context).b.a);
    }

    private static <T extends il<T, ?>> hx a(Context context, T t, ha haVar, boolean z, String str, String str2, boolean z2) {
        byte[] bArr;
        byte[] a = ik.a(t);
        if (a == null) {
            com.xiaomi.channel.commonutils.logger.c.a("invoke convertThriftObjectToBytes method, return null.");
            return null;
        }
        hx hxVar = new hx();
        if (z) {
            String str3 = ap.a(context).b.d;
            if (TextUtils.isEmpty(str3)) {
                com.xiaomi.channel.commonutils.logger.c.a("regSecret is empty, return null");
                return null;
            }
            try {
                bArr = ge.b(com.xiaomi.push.ao.b(str3), a);
            } catch (Exception unused) {
                com.xiaomi.channel.commonutils.logger.c.d("encryption error. ");
            }
            hq hqVar = new hq();
            hqVar.a = 5L;
            hqVar.b = "fakeid";
            hxVar.g = hqVar;
            hxVar.d = ByteBuffer.wrap(bArr);
            hxVar.a = haVar;
            hxVar.b(z2);
            hxVar.f = str;
            hxVar.a(z);
            hxVar.e = str2;
            return hxVar;
        }
        bArr = a;
        hq hqVar2 = new hq();
        hqVar2.a = 5L;
        hqVar2.b = "fakeid";
        hxVar.g = hqVar2;
        hxVar.d = ByteBuffer.wrap(bArr);
        hxVar.a = haVar;
        hxVar.b(z2);
        hxVar.f = str;
        hxVar.a(z);
        hxVar.e = str2;
        return hxVar;
    }

    public static il a(Context context, hx hxVar) {
        byte[] a;
        hs hsVar;
        if (hxVar.b) {
            byte[] a2 = aw.a(context, hxVar, as.ASSEMBLE_PUSH_FCM);
            if (a2 == null) {
                a2 = com.xiaomi.push.ao.b(ap.a(context).b.d);
            }
            try {
                a = ge.a(a2, hxVar.a());
            } catch (Exception e) {
                throw new bh("the aes decrypt failed.", e);
            }
        } else {
            a = hxVar.a();
        }
        ha haVar = hxVar.a;
        boolean z = hxVar.c;
        switch (aa.a[haVar.ordinal()]) {
            case 1:
                hsVar = new ic();
                break;
            case 2:
                hsVar = new ii();
                break;
            case 3:
                hsVar = new ig();
                break;
            case 4:
                hsVar = new ij();
                break;
            case 5:
                hsVar = new ie();
                break;
            case 6:
                hsVar = new hr();
                break;
            case 7:
                hsVar = new hw();
                break;
            case 8:
                hsVar = new id();
                break;
            case 9:
                if (!z) {
                    hs hsVar2 = new hs();
                    hsVar2.a(true);
                    hsVar = hsVar2;
                    break;
                } else {
                    hsVar = new ia();
                    break;
                }
            case 10:
                hsVar = new hw();
                break;
            default:
                hsVar = null;
                break;
        }
        if (hsVar != null) {
            ik.a(hsVar, a);
        }
        return hsVar;
    }
}
