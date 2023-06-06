package com.meituan.mmp.lib.engine;

import com.meituan.mmp.lib.trace.b;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.smtt.sdk.QbSdk;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class x {
    public static ChangeQuickRedirect a = null;
    private static volatile boolean b = false;
    private static volatile boolean c = false;
    private static final CountDownLatch d = new CountDownLatch(1);

    public static /* synthetic */ boolean a(boolean z) {
        b = true;
        return true;
    }

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "29e15265aa47d20da0088bb092660a84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "29e15265aa47d20da0088bb092660a84");
        } else if (d()) {
        } else {
            com.meituan.mmp.lib.trace.b.b("X5Init", "initX5IfNeed, notNeeded: " + c);
            if (com.meituan.mmp.lib.config.f.a()) {
                try {
                    QbSdk.initX5Environment(MMPEnvHelper.getContext(), new QbSdk.PreInitCallback() { // from class: com.meituan.mmp.lib.engine.x.1
                        public static ChangeQuickRedirect a;

                        @Override // com.tencent.smtt.sdk.QbSdk.PreInitCallback
                        public final void onViewInitFinished(boolean z) {
                            Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5dfaa10b2df50331e306319d7e5a2a79", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5dfaa10b2df50331e306319d7e5a2a79");
                                return;
                            }
                            b.a.a("X5Init", "X5Init onViewInitFinished" + z);
                            x.a(true);
                            x.d.countDown();
                        }

                        @Override // com.tencent.smtt.sdk.QbSdk.PreInitCallback
                        public final void onCoreInitFinished() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0481487e3a6011230db69dac32e01f7c", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0481487e3a6011230db69dac32e01f7c");
                            } else {
                                com.meituan.mmp.lib.trace.b.b("X5Init", "onCoreInitFinished");
                            }
                        }
                    });
                } catch (Throwable th) {
                    th.printStackTrace();
                    b.a.c("TAG", "x5 init " + th.getMessage());
                }
                b.a.a("X5Init", "X5Init initX5Environment");
                return;
            }
            c = true;
            d.countDown();
        }
    }

    private static boolean d() {
        return b || c;
    }

    public static void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "92039efa45390ce6df249d10a66a0ee9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "92039efa45390ce6df249d10a66a0ee9");
        } else if (d()) {
        } else {
            try {
                d.await(1L, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                com.meituan.mmp.lib.trace.b.a(e);
            }
        }
    }
}
