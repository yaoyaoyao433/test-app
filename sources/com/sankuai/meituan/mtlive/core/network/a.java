package com.sankuai.meituan.mtlive.core.network;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private List<InterfaceC0610a> b;
    private ExecutorService c;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.meituan.mtlive.core.network.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0610a {
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a04f361406db8c7f12948a787f93e0da", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a04f361406db8c7f12948a787f93e0da");
            return;
        }
        this.b = new ArrayList();
        this.c = com.sankuai.android.jarvis.c.a("mtlive-traffic-service", 1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), null, new RejectedExecutionHandler() { // from class: com.sankuai.meituan.mtlive.core.network.a.1
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            }
        });
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "344c639c5a6c528d14de5d52cbdac492", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "344c639c5a6c528d14de5d52cbdac492") : b.a;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class b {
        private static final a a = new a();
    }

    public final synchronized void a(final e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41458c34d04e3b07e8bf3d15eecb3b50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41458c34d04e3b07e8bf3d15eecb3b50");
        } else if (this.b != null) {
            for (final InterfaceC0610a interfaceC0610a : this.b) {
                this.c.submit(new Runnable() { // from class: com.sankuai.meituan.mtlive.core.network.a.2
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e871f992b4eecf7f42641d1ea016a99a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e871f992b4eecf7f42641d1ea016a99a");
                        }
                    }
                });
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class e {
        public static ChangeQuickRedirect a;
        public c b;
        public d c;
        public int d;

        @NonNull
        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c9f7d3aeaa7597b88e3fe80a2bd5a93", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c9f7d3aeaa7597b88e3fe80a2bd5a93");
            }
            return "liveType: " + this.b + ",trafficDirection: " + this.c + ", dataLength: " + this.d + " kb";
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public enum c {
        TXPUSHER,
        TXPLAYER,
        RPUSHER,
        RPLAYER,
        TRTC,
        MRTC;
        
        public static ChangeQuickRedirect a;

        c() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12edde778665e8e4f028bfdaf3de6b4d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12edde778665e8e4f028bfdaf3de6b4d");
            }
        }

        public static c valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5abfcf38d15792a11033fc06fdfc4131", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5abfcf38d15792a11033fc06fdfc4131") : (c) Enum.valueOf(c.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "346110ae403d255c8ff513aba71d06b5", RobustBitConfig.DEFAULT_VALUE) ? (c[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "346110ae403d255c8ff513aba71d06b5") : (c[]) values().clone();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public enum d {
        UpLink,
        DownLink;
        
        public static ChangeQuickRedirect a;

        d() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb125b2348c6fbf8f64b3d002cb14cfc", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb125b2348c6fbf8f64b3d002cb14cfc");
            }
        }

        public static d valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bbd2ae2e6af3415ff01dc2fafd8cb117", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bbd2ae2e6af3415ff01dc2fafd8cb117") : (d) Enum.valueOf(d.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static d[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "21ebb51c3f072fed746537c9aa6fe5f6", RobustBitConfig.DEFAULT_VALUE) ? (d[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "21ebb51c3f072fed746537c9aa6fe5f6") : (d[]) values().clone();
        }
    }
}
