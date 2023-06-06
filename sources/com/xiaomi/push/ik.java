package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.push.is;
import com.xiaomi.push.jc;
/* loaded from: classes6.dex */
public final class ik {
    public static short a(Context context, hx hxVar) {
        return a(context, hxVar.f);
    }

    public static <T extends il<T, ?>> void a(T t, byte[] bArr) {
        if (bArr == null) {
            throw new iq("the message byte is empty.");
        }
        new ip(new jc.a(true, true, bArr.length)).a(t, bArr);
    }

    public static <T extends il<T, ?>> byte[] a(T t) {
        if (t == null) {
            return null;
        }
        try {
            ir irVar = new ir(new is.a());
            irVar.a.reset();
            t.b(irVar.b);
            return irVar.a.toByteArray();
        } catch (iq e) {
            com.xiaomi.channel.commonutils.logger.c.a("convertThriftObjectToBytes catch TException.", e);
            return null;
        }
    }

    private static short a(Context context, String str) {
        return (short) (fd.a(context, str, false).d + 0 + (l.b(context) ? 4 : 0) + (l.a(context) ? 8 : 0) + (com.xiaomi.push.service.w.a(context) ? 16 : 0));
    }
}
