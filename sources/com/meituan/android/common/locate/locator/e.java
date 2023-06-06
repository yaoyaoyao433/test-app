package com.meituan.android.common.locate.locator;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import com.meituan.android.common.locate.controller.f;
import com.meituan.android.common.locate.platform.logs.n;
import com.meituan.android.common.locate.reporter.j;
import com.meituan.android.common.locate.util.FakeMainThread;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public class e {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final int a;
    private final int b;
    private boolean c;
    private boolean d;
    private long e;
    private Handler f;
    private SystemLocator g;
    private Context h;

    public e(SystemLocator systemLocator, Context context) {
        Object[] objArr = {systemLocator, context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c98d226545cf5776f4ed6b9eae2ceb57", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c98d226545cf5776f4ed6b9eae2ceb57");
            return;
        }
        this.a = 0;
        this.b = 1;
        this.c = true;
        this.d = true;
        this.f = new Handler(FakeMainThread.getInstance().getLooper()) { // from class: com.meituan.android.common.locate.locator.e.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.os.Handler
            public void handleMessage(@NonNull Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f4d0c98df4bff0e545724f37b6ae2f80", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f4d0c98df4bff0e545724f37b6ae2f80");
                    return;
                }
                switch (message.what) {
                    case 0:
                        if (!e.this.h()) {
                            e.this.e();
                            return;
                        }
                        com.meituan.android.common.locate.platform.logs.c.a("SystemLocator::reboot", 3);
                        n.e().a();
                        e.this.g.stop();
                        e.this.d = false;
                        e.this.c = false;
                        e.this.g.start();
                        n.e().g();
                        return;
                    case 1:
                        e.this.f.sendEmptyMessageDelayed(0, e.this.c ? e.this.f() : e.this.g());
                        return;
                    default:
                        return;
                }
            }
        };
        this.g = systemLocator;
        this.h = context;
        d.a().a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "48b26b14d24636c5e93c5a2bdb6676b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "48b26b14d24636c5e93c5a2bdb6676b9");
        } else if (this.f.hasMessages(0)) {
            this.f.removeMessages(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a3bc89cd8c3cf06a1144ffd5a29cd447", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a3bc89cd8c3cf06a1144ffd5a29cd447")).longValue();
        }
        switch (j.a(this.h).h()) {
            case 0:
                return j.a(this.h).a();
            case 1:
                return Math.max(com.meituan.android.common.locate.strategy.b.a().b() * j.a(this.h).b(), j.a(this.h).c());
            default:
                return j.a(this.h).a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bbdb18df49899ee4c92980be66e085cd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bbdb18df49899ee4c92980be66e085cd")).longValue();
        }
        switch (j.a(this.h).h()) {
            case 0:
                return j.a(this.h).a();
            case 1:
                return Math.max(com.meituan.android.common.locate.strategy.b.a().b() * j.a(this.h).d(), j.a(this.h).e());
            default:
                return j.a(this.h).a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bd2a624d460bc8e7c0fb6973aa7e7684", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bd2a624d460bc8e7c0fb6973aa7e7684")).booleanValue() : this.g != null && this.g.isGpsRunning() && f.a().i();
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8bfc9f9e2c015587d3e1b586a2d55490", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8bfc9f9e2c015587d3e1b586a2d55490");
        } else if (!h() || SystemClock.elapsedRealtime() - this.e <= j.a(this.h).i()) {
        } else {
            com.meituan.android.common.locate.platform.logs.c.a("SystemLocator::reboot", 3);
            this.g.stop();
            this.g.start();
        }
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5ed95a59b4836e613e1e743760f349d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5ed95a59b4836e613e1e743760f349d3");
        } else if (h()) {
            e();
            com.meituan.android.common.locate.platform.logs.c.a("SystemLocator::reboot_start", 3);
            if (!this.d) {
                this.f.sendEmptyMessageDelayed(0, this.c ? f() : g());
                return;
            }
            this.f.sendEmptyMessageDelayed(1, j.a(this.h).f());
            this.d = false;
        }
    }

    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f2ff56243d9edfe6d4d1290548b36568", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f2ff56243d9edfe6d4d1290548b36568");
            return;
        }
        e();
        com.meituan.android.common.locate.platform.logs.c.a("SystemLocator::reboot_stop", 3);
        this.d = true;
        this.c = true;
    }

    public void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "79100f82558afe7cdd299e7d4cf49dbd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "79100f82558afe7cdd299e7d4cf49dbd");
            return;
        }
        this.e = SystemClock.elapsedRealtime();
        if (h()) {
            e();
            this.f.sendEmptyMessageDelayed(0, this.c ? f() : g());
        }
        n.e().f();
    }
}
