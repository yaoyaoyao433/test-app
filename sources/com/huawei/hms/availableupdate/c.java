package com.huawei.hms.availableupdate;

import android.os.Handler;
import android.os.Looper;
import com.huawei.hms.utils.Checker;
import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class c implements e {
    public static final Executor b = Executors.newSingleThreadExecutor();
    public final e a;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static final class a implements f {
        public final /* synthetic */ f a;

        /* compiled from: ProGuard */
        /* renamed from: com.huawei.hms.availableupdate.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class RunnableC0171a implements Runnable {
            public final /* synthetic */ int a;
            public final /* synthetic */ g b;

            public RunnableC0171a(int i, g gVar) {
                this.a = i;
                this.b = gVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.a.a(this.a, this.b);
            }
        }

        /* compiled from: ProGuard */
        /* loaded from: classes2.dex */
        public class b implements Runnable {
            public final /* synthetic */ int a;
            public final /* synthetic */ int b;
            public final /* synthetic */ int c;
            public final /* synthetic */ File d;

            public b(int i, int i2, int i3, File file) {
                this.a = i;
                this.b = i2;
                this.c = i3;
                this.d = file;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.a.a(this.a, this.b, this.c, this.d);
            }
        }

        public a(f fVar) {
            this.a = fVar;
        }

        @Override // com.huawei.hms.availableupdate.f
        public final void a(int i, g gVar) {
            new Handler(Looper.getMainLooper()).post(new RunnableC0171a(i, gVar));
        }

        @Override // com.huawei.hms.availableupdate.f
        public final void a(int i, int i2, int i3, File file) {
            new Handler(Looper.getMainLooper()).post(new b(i, i2, i3, file));
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class b implements Runnable {
        public final /* synthetic */ f a;
        public final /* synthetic */ g b;

        public b(f fVar, g gVar) {
            this.a = fVar;
            this.b = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.a.a(c.b(this.a), this.b);
        }
    }

    public c(e eVar) {
        Checker.checkNonNull(eVar, "update must not be null.");
        this.a = eVar;
    }

    public static f b(f fVar) {
        return new a(fVar);
    }

    @Override // com.huawei.hms.availableupdate.e
    public void a() {
        this.a.a();
    }

    @Override // com.huawei.hms.availableupdate.e
    public void a(f fVar, g gVar) {
        com.sankuai.waimai.launcher.util.aop.b.a(b, new b(fVar, gVar));
    }
}
