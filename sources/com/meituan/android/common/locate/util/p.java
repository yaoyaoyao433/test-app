package com.meituan.android.common.locate.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public class p {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Runnable a;
    private long b;
    private Handler c;
    private boolean d;
    private long e;
    private long f;
    private boolean g;

    public p() {
        this(Looper.myLooper());
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3b93027a7c8d8364d3fcdbf4f92cb905", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3b93027a7c8d8364d3fcdbf4f92cb905");
        }
    }

    public p(Looper looper) {
        Object[] objArr = {looper};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "39f086a8e826639892f29ae1215e34ab", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "39f086a8e826639892f29ae1215e34ab");
            return;
        }
        this.d = false;
        this.e = 0L;
        this.f = 0L;
        this.g = false;
        this.c = new Handler(looper) { // from class: com.meituan.android.common.locate.util.p.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "512bdb3209c2b2103277b1b299224890", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "512bdb3209c2b2103277b1b299224890");
                } else if (message.what != 1) {
                } else {
                    try {
                        p.this.a.run();
                    } catch (Throwable unused) {
                    }
                    p.this.c();
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a607e2c19009b825e577daa8670bf1c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a607e2c19009b825e577daa8670bf1c2");
            return;
        }
        if (this.d) {
            this.f++;
            if (this.f >= this.e) {
                a();
                return;
            }
        }
        if (this.g) {
            this.c.sendEmptyMessageDelayed(1, this.b);
        }
    }

    public p a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6ab30063c27b65a0cf7bc06cd1e096c5", RobustBitConfig.DEFAULT_VALUE)) {
            return (p) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6ab30063c27b65a0cf7bc06cd1e096c5");
        }
        this.b = j;
        return this;
    }

    public p a(Runnable runnable) {
        this.a = runnable;
        return this;
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "13f1d58af4bda61b6228d5b2eec9d0cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "13f1d58af4bda61b6228d5b2eec9d0cd");
            return;
        }
        this.g = false;
        this.c.removeMessages(1);
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c63cab31ee2fb9759c3951caace9b27d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c63cab31ee2fb9759c3951caace9b27d");
            return;
        }
        this.g = true;
        if (this.c.hasMessages(1)) {
            this.c.removeMessages(1);
        }
        this.c.sendEmptyMessageDelayed(1, 0L);
    }
}
