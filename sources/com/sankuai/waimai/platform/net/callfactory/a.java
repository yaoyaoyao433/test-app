package com.sankuai.waimai.platform.net.callfactory;

import com.dianping.nvnetwork.Request;
import com.dianping.nvnetwork.j;
import com.dianping.nvnetwork.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Interceptor;
import com.sankuai.meituan.retrofit2.aj;
import com.sankuai.meituan.retrofit2.raw.a;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements a.InterfaceC0637a {
    public static ChangeQuickRedirect a;
    private final j b;

    public a(j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c11c8df66436edac7274c9db050273e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c11c8df66436edac7274c9db050273e");
        } else {
            this.b = jVar;
        }
    }

    @Override // com.sankuai.meituan.retrofit2.raw.a.InterfaceC0637a
    public final com.sankuai.meituan.retrofit2.raw.a get(aj ajVar) {
        Object[] objArr = {ajVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a05fcd5ad79337dbc665c7fa267d582", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.meituan.retrofit2.raw.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a05fcd5ad79337dbc665c7fa267d582") : new C1067a(this.b, ajVar);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.platform.net.callfactory.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static class C1067a implements Interceptor.a, com.sankuai.meituan.retrofit2.raw.a {
        public static ChangeQuickRedirect a;
        private final j b;
        private final aj c;
        private Request d;
        private volatile boolean e;
        private boolean f;

        public final /* synthetic */ Object clone() throws CloneNotSupportedException {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63e06ae26a0abb4d79bd8cbaf01dfc0e", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.meituan.retrofit2.raw.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63e06ae26a0abb4d79bd8cbaf01dfc0e") : new C1067a(this.b, this.c);
        }

        public C1067a(j jVar, aj ajVar) {
            Object[] objArr = {jVar, ajVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e98971e7941984a4342a6288a08d1d49", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e98971e7941984a4342a6288a08d1d49");
                return;
            }
            this.b = jVar;
            this.c = ajVar;
            try {
                this.d = com.sankuai.meituan.retrofit2.utils_nvnetwork.a.a(ajVar);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override // com.sankuai.meituan.retrofit2.Interceptor.a
        public final aj request() {
            return this.c;
        }

        @Override // com.sankuai.meituan.retrofit2.Interceptor.a
        public final com.sankuai.meituan.retrofit2.raw.b a(aj ajVar) throws IOException {
            Object[] objArr = {ajVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4225e101d1c0d9016e22096f6edf7351", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4225e101d1c0d9016e22096f6edf7351") : execute();
        }

        @Override // com.sankuai.meituan.retrofit2.raw.a
        public final com.sankuai.meituan.retrofit2.raw.b execute() throws IOException {
            IOException iOException;
            IOException iOException2;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aeb72d31f999172e3ba09734c715c6f7", RobustBitConfig.DEFAULT_VALUE)) {
                return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aeb72d31f999172e3ba09734c715c6f7");
            }
            synchronized (this) {
                if (this.f) {
                    throw new IllegalStateException("Already executed.");
                }
                this.f = true;
            }
            if (this.e) {
                throw new IOException("Already canceled");
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d7057ae03ed96463fc329daafcd5c4df", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d7057ae03ed96463fc329daafcd5c4df");
            } else if (this.d == null) {
                throw new IOException("convert com.dianping.nvnetwork.Request failed");
            }
            q execSync = this.b.execSync(this.d);
            b bVar = new b(execSync, this.d);
            Object[] objArr3 = {execSync};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e0d40f2e96bcde5f0d877635d35ce50d", RobustBitConfig.DEFAULT_VALUE)) {
                iOException2 = (IOException) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e0d40f2e96bcde5f0d877635d35ce50d");
            } else if (execSync.isSuccess()) {
                iOException2 = null;
            } else {
                Object error = execSync.error();
                if (error == null) {
                    iOException2 = new IOException("error not found");
                } else {
                    if (error instanceof Throwable) {
                        iOException = new IOException((Throwable) error);
                    } else {
                        iOException = new IOException(error.toString());
                    }
                    iOException2 = iOException;
                }
            }
            if (iOException2 == null) {
                return bVar;
            }
            throw iOException2;
        }

        @Override // com.sankuai.meituan.retrofit2.raw.a
        public final void cancel() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd8146aac71b89899f4352fdcc9bb8d6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd8146aac71b89899f4352fdcc9bb8d6");
                return;
            }
            this.e = true;
            if (this.d != null) {
                this.b.abort(this.d);
            }
        }
    }
}
