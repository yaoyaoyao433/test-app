package com.xiaomi.push;

import com.meituan.robust.common.CommonConstant;
import java.text.SimpleDateFormat;
import java.util.Date;
/* loaded from: classes6.dex */
public final class fl implements fz {
    public static boolean a = false;
    private fn c;
    private a d;
    private a e;
    private fq f;
    private SimpleDateFormat b = new SimpleDateFormat("hh:mm:ss aaa");
    private final String g = "[Slim] ";

    /* loaded from: classes6.dex */
    class a implements fs, ga {
        String a;
        private boolean c;

        a(boolean z) {
            this.c = true;
            this.c = z;
            this.a = z ? " RCV " : " Sent ";
        }

        @Override // com.xiaomi.push.fs
        public final void a(gf gfVar) {
            if (fl.a) {
                com.xiaomi.channel.commonutils.logger.c.c("[Slim] " + fl.this.b.format(new Date()) + this.a + " PKT " + gfVar.b());
                return;
            }
            com.xiaomi.channel.commonutils.logger.c.c("[Slim] " + fl.this.b.format(new Date()) + this.a + " PKT [" + gfVar.t + CommonConstant.Symbol.COMMA + gfVar.d() + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0126  */
        /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
        @Override // com.xiaomi.push.fs
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a(com.xiaomi.push.fb r6) {
            /*
                Method dump skipped, instructions count: 347
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.fl.a.a(com.xiaomi.push.fb):void");
        }
    }

    public fl(fn fnVar) {
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.c = fnVar;
        this.d = new a(true);
        this.e = new a(false);
        this.c.a(this.d, this.d);
        this.c.b(this.e, this.e);
        this.f = new fm(this);
    }
}
