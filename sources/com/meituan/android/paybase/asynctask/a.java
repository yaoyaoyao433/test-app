package com.meituan.android.paybase.asynctask;

import android.support.annotation.UiThread;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class a<Params, Progress, Result> extends b<Params, Progress, Result> {
    private static final BlockingQueue<Runnable> a = new LinkedBlockingQueue();
    private static final Executor b = c.a("Paybase-ConcurrentTask", 2, 4, 1, TimeUnit.SECONDS, a);
    public static ChangeQuickRedirect i;
    private Executor c;

    public a() {
        this(b);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d7c446458ea98ebf0070a34ecc02d87", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d7c446458ea98ebf0070a34ecc02d87");
        }
    }

    private a(Executor executor) {
        Object[] objArr = {executor};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebfe82d783fc8be5801b0c55bfb487f2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebfe82d783fc8be5801b0c55bfb487f2");
        } else {
            this.c = executor;
        }
    }

    public final void b(Params... paramsArr) {
        Object[] objArr = {paramsArr};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b9964de0c42e60d853c1c852524fee6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b9964de0c42e60d853c1c852524fee6");
        } else {
            a(this.c, paramsArr);
        }
    }

    @UiThread
    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ac1b824fec0d3b8ef00a909da39689ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ac1b824fec0d3b8ef00a909da39689ca");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b.j;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "b5543105ac2486e756df81de1605f8f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "b5543105ac2486e756df81de1605f8f0");
        } else {
            b.k.getLooper();
        }
    }
}
