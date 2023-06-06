package com.meituan.mtwebkit.internal.system;

import android.webkit.ConsoleMessage;
import com.meituan.mtwebkit.MTConsoleMessage;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class t extends MTConsoleMessage {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.mtwebkit.internal.system.t$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] a = new int[ConsoleMessage.MessageLevel.values().length];

        static {
            try {
                a[ConsoleMessage.MessageLevel.TIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ConsoleMessage.MessageLevel.LOG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ConsoleMessage.MessageLevel.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public t(android.webkit.ConsoleMessage r19) {
        /*
            r18 = this;
            r7 = r18
            java.lang.String r0 = r19.message()
            java.lang.String r1 = r19.sourceId()
            int r2 = r19.lineNumber()
            android.webkit.ConsoleMessage$MessageLevel r3 = r19.messageLevel()
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r15 = 0
            r5[r15] = r3
            com.meituan.robust.ChangeQuickRedirect r6 = com.meituan.mtwebkit.internal.system.t.a
            java.lang.String r13 = "d6034a699f1b183cc24c02a2005b921b"
            r9 = 0
            r11 = 1
            r16 = 4611686018427387904(0x4000000000000000, double:2.0)
            r8 = r5
            r10 = r6
            r12 = r13
            r15 = r13
            r13 = r16
            boolean r8 = com.meituan.robust.PatchProxy.isSupport(r8, r9, r10, r11, r12, r13)
            if (r8 == 0) goto L34
            r3 = 0
            java.lang.Object r3 = com.meituan.robust.PatchProxy.accessDispatch(r5, r3, r6, r4, r15)
            com.meituan.mtwebkit.MTConsoleMessage$MessageLevel r3 = (com.meituan.mtwebkit.MTConsoleMessage.MessageLevel) r3
            goto L50
        L34:
            if (r3 == 0) goto L4e
            int[] r5 = com.meituan.mtwebkit.internal.system.t.AnonymousClass1.a
            int r3 = r3.ordinal()
            r3 = r5[r3]
            switch(r3) {
                case 1: goto L4b;
                case 2: goto L48;
                case 3: goto L45;
                case 4: goto L42;
                default: goto L41;
            }
        L41:
            goto L4e
        L42:
            com.meituan.mtwebkit.MTConsoleMessage$MessageLevel r3 = com.meituan.mtwebkit.MTConsoleMessage.MessageLevel.ERROR
            goto L50
        L45:
            com.meituan.mtwebkit.MTConsoleMessage$MessageLevel r3 = com.meituan.mtwebkit.MTConsoleMessage.MessageLevel.WARNING
            goto L50
        L48:
            com.meituan.mtwebkit.MTConsoleMessage$MessageLevel r3 = com.meituan.mtwebkit.MTConsoleMessage.MessageLevel.LOG
            goto L50
        L4b:
            com.meituan.mtwebkit.MTConsoleMessage$MessageLevel r3 = com.meituan.mtwebkit.MTConsoleMessage.MessageLevel.TIP
            goto L50
        L4e:
            com.meituan.mtwebkit.MTConsoleMessage$MessageLevel r3 = com.meituan.mtwebkit.MTConsoleMessage.MessageLevel.DEBUG
        L50:
            r7.<init>(r0, r1, r2, r3)
            java.lang.Object[] r8 = new java.lang.Object[r4]
            r1 = 0
            r8[r1] = r19
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.mtwebkit.internal.system.t.a
            java.lang.String r10 = "c5d3221655d953fe8f0f741bbd242dc9"
            r3 = 0
            r5 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r0 = r8
            r1 = r18
            r2 = r9
            r4 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L6f
            r0 = 0
            com.meituan.robust.PatchProxy.accessDispatch(r8, r7, r9, r0, r10)
            return
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.mtwebkit.internal.system.t.<init>(android.webkit.ConsoleMessage):void");
    }
}
