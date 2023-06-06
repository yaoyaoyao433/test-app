package com.sankuai.waimai.mach.manager_new.download;

import android.text.TextUtils;
import com.meituan.android.common.aidata.ai.bundle.download.exception.DownloadException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.waimai.mach.manager.download.service.FileDownloadService;
import com.sankuai.waimai.mach.manager.download.update.BundleInfo;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements Runnable {
    public static ChangeQuickRedirect a;
    private final Call<ap> b;
    private final BundleInfo c;
    private final b d;
    private final Executor e;
    private final Executor f;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        void a(Response<ap> response);

        void a(Throwable th, int i);
    }

    public a(FileDownloadService fileDownloadService, BundleInfo bundleInfo, b bVar, Executor executor, Executor executor2) {
        Object[] objArr = {fileDownloadService, bundleInfo, bVar, executor, executor2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d10cb3d19d6a1e6a249a5c955452613d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d10cb3d19d6a1e6a249a5c955452613d");
            return;
        }
        this.b = fileDownloadService.downloadFile(bundleInfo.getUrl());
        this.c = bundleInfo;
        this.d = bVar;
        this.e = executor;
        this.f = executor2;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2d881bc7b8abda17e26d01a5684367c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2d881bc7b8abda17e26d01a5684367c");
        } else if (this.e != null) {
            com.sankuai.waimai.launcher.util.aop.b.a(this.e, this);
        } else {
            run();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "544492162b4eca96fd0ab746cdbb3c10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "544492162b4eca96fd0ab746cdbb3c10");
            return;
        }
        try {
            final Response<ap> a2 = this.b.a();
            Object[] objArr2 = {a2};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "43f137d2e6fda98bbe48e84b9a3559d2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "43f137d2e6fda98bbe48e84b9a3559d2");
            } else if (this.d != null) {
                final b bVar = this.d;
                Object[] objArr3 = {bVar, a2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                Runnable runnable = PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "405af4efbf9e345b6ed8b5b6a6ba6d86", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "405af4efbf9e345b6ed8b5b6a6ba6d86") : new Runnable() { // from class: com.sankuai.waimai.mach.manager_new.download.a.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "8fa24b99537f5f1e753cbd732b8d26ed", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "8fa24b99537f5f1e753cbd732b8d26ed");
                        } else {
                            b.this.a(a2);
                        }
                    }
                };
                if (this.f != null) {
                    com.sankuai.waimai.launcher.util.aop.b.a(this.f, runnable);
                } else {
                    runnable.run();
                }
            }
        } catch (Throwable th) {
            if (this.b.c()) {
                i = DownloadException.CANCELED;
            } else {
                i = th instanceof IOException ? DownloadException.NET_ERROR : 18016;
            }
            if (this.d != null) {
                this.d.a(th, i);
            }
        }
    }

    public final boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3caec1297dcb99f505ec3456e857b885", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3caec1297dcb99f505ec3456e857b885")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return TextUtils.equals(this.c.getName(), ((a) obj).c.getName());
    }

    public final int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a8cc89d893dc6642ceb99a38d412d2b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a8cc89d893dc6642ceb99a38d412d2b")).intValue() : Objects.hash(this.c.getName());
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.mach.manager_new.download.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static class C1018a {
        public static ChangeQuickRedirect a;
        b b;
        Executor c;
        Executor d;
        private final FileDownloadService e;
        private final BundleInfo f;

        public C1018a(FileDownloadService fileDownloadService, BundleInfo bundleInfo) {
            Object[] objArr = {fileDownloadService, bundleInfo};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67f6d6a72c58862706aa2877217a1dad", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67f6d6a72c58862706aa2877217a1dad");
                return;
            }
            this.e = fileDownloadService;
            this.f = bundleInfo;
        }

        public final a a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03552d0850111307fcda491ce04ae426", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03552d0850111307fcda491ce04ae426") : new a(this.e, this.f, this.b, this.c, this.d);
        }
    }
}
