package com.sankuai.waimai.launcher.init.mainly;

import android.app.Application;
import android.os.AsyncTask;
import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.init.AbsInit;
import java.lang.reflect.Field;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class ag extends AbsInit {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "VivoV3MaxCrashInit";
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void init(Application application) {
        boolean z;
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ce3719f4e205097ad7c778ec3fe4e83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ce3719f4e205097ad7c778ec3fe4e83");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2d6539d99353f036524ad96ccfccfb7c", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2d6539d99353f036524ad96ccfccfb7c")).booleanValue();
        } else {
            z = "vivo".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("vivo V3Max") && Build.VERSION.SDK_INT <= 22;
        }
        if (z) {
            try {
                Field declaredField = AsyncTask.class.getDeclaredField("SERIAL_EXECUTOR");
                AnonymousClass1 anonymousClass1 = new AnonymousClass1();
                Object[] objArr3 = {declaredField, anonymousClass1};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "2f150c21762c965329ca111377c34c2f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "2f150c21762c965329ca111377c34c2f");
                } else {
                    declaredField.setAccessible(true);
                    Field declaredField2 = Field.class.getDeclaredField("artField");
                    declaredField2.setAccessible(true);
                    Object obj = declaredField2.get(declaredField);
                    Field declaredField3 = obj.getClass().getDeclaredField("accessFlags");
                    declaredField3.setAccessible(true);
                    declaredField3.setInt(obj, declaredField.getModifiers() & (-17));
                    declaredField.set(null, anonymousClass1);
                }
                Field declaredField4 = AsyncTask.class.getDeclaredField("sDefaultExecutor");
                declaredField4.setAccessible(true);
                declaredField4.set(null, AsyncTask.SERIAL_EXECUTOR);
            } catch (Exception e) {
                com.sankuai.waimai.foundation.utils.log.a.a(e);
            }
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.launcher.init.mainly.ag$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public class AnonymousClass1 implements Executor {
        public static ChangeQuickRedirect a;
        public final ArrayDeque<Runnable> b = new ArrayDeque<>();
        public Runnable c;

        public AnonymousClass1() {
        }

        @Override // java.util.concurrent.Executor
        public final synchronized void execute(final Runnable runnable) {
            Object[] objArr = {runnable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7dedd192d05e41e6e5406891575d72e0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7dedd192d05e41e6e5406891575d72e0");
                return;
            }
            this.b.offer(new Runnable() { // from class: com.sankuai.waimai.launcher.init.mainly.ag.1.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    try {
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "418a3e4415439e1b941be8247337c7d1", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "418a3e4415439e1b941be8247337c7d1");
                            return;
                        }
                        try {
                            runnable.run();
                        } catch (Exception e) {
                            com.sankuai.waimai.foundation.utils.log.a.a(e);
                        }
                    } finally {
                        AnonymousClass1.this.a();
                    }
                }
            });
            if (this.c == null) {
                a();
            }
        }

        public final synchronized void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6bfed3390d8f6301e6a956722ca59039", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6bfed3390d8f6301e6a956722ca59039");
                return;
            }
            Runnable poll = this.b.poll();
            this.c = poll;
            if (poll != null) {
                AsyncTask.THREAD_POOL_EXECUTOR.execute(this.c);
            }
        }
    }
}
