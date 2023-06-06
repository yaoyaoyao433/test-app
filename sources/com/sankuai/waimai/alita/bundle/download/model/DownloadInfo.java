package com.sankuai.waimai.alita.bundle.download.model;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.bundle.download.a;
import com.sankuai.waimai.alita.bundle.download.exception.DownloadException;
import com.sankuai.waimai.alita.bundle.download.update.BundleInfo;
import com.sankuai.waimai.alita.core.utils.c;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class DownloadInfo {
    public static ChangeQuickRedirect a;
    public int b;
    public com.sankuai.waimai.alita.bundle.download.record.a c;
    public BundleInfo d;
    public int e;
    public boolean f;
    public String g;
    public String h;
    public Set<a.InterfaceC0693a> i;
    private a j;
    private long k;
    @Nullable
    private DownloadException l;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface Status {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
    }

    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3d31447dd12ff5cdcc280c6736fe827", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3d31447dd12ff5cdcc280c6736fe827") : this.d.getUrl();
    }

    public final void a(int i, DownloadException downloadException) {
        Object[] objArr = {Integer.valueOf(i), downloadException};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d84bc999027ad5df84e246c4ae27874", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d84bc999027ad5df84e246c4ae27874");
            return;
        }
        this.l = downloadException;
        a(i);
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21078481b93f82ea5951a97f3a46763d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21078481b93f82ea5951a97f3a46763d");
        } else if (this.e < i) {
            this.e = i;
            if (i == 1001) {
                return;
            }
            if (!this.f) {
                if (i == 1003) {
                    this.k = System.currentTimeMillis();
                    if (this.j != null) {
                    }
                } else if (i == 1004) {
                    this.k = System.currentTimeMillis();
                }
            } else if (i == 1005) {
                this.k = System.currentTimeMillis();
                if (this.j != null) {
                }
            } else if (i == 1006) {
                this.k = System.currentTimeMillis();
                if (this.j != null) {
                }
            }
        }
    }

    public final void a(DownloadException downloadException) {
        Object[] objArr = {downloadException};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e06529483f7997a913aebe2600e93f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e06529483f7997a913aebe2600e93f0");
        } else if (!b()) {
            c.a("DownloadInfo-->notifyCallbackOnFail:模板[" + e() + "] mCallbackList.size()=" + this.i.size());
            for (a.InterfaceC0693a interfaceC0693a : this.i) {
                if (interfaceC0693a != null) {
                    c.a("DownloadInfo-->notifyCallbackOnFail,[" + e() + "] callback=" + interfaceC0693a);
                    interfaceC0693a.a(this, downloadException);
                }
            }
            this.i.clear();
        }
    }

    public DownloadInfo(BundleInfo bundleInfo, String str, a.InterfaceC0693a interfaceC0693a) {
        Object[] objArr = {bundleInfo, str, interfaceC0693a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d98d02071702cb0eb921de1cfafed61", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d98d02071702cb0eb921de1cfafed61");
            return;
        }
        this.i = new CopyOnWriteArraySet();
        this.i.add(interfaceC0693a);
        this.d = bundleInfo;
        this.g = str;
        this.e = 1000;
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93bde3b8a438ad31ce6a8e4eab7c3222", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93bde3b8a438ad31ce6a8e4eab7c3222")).booleanValue() : this.i.isEmpty();
    }

    public final void a(a.InterfaceC0693a interfaceC0693a) {
        Object[] objArr = {interfaceC0693a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f030fced295f0029082027a7568c9c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f030fced295f0029082027a7568c9c1");
            return;
        }
        this.i.add(interfaceC0693a);
        c.a("DownloadInfo-->addCallback,callback" + interfaceC0693a + ",mCallbackList.size()=" + this.i.size());
    }

    public final String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b1792ec5732794e9a0a1ff87faaa684", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b1792ec5732794e9a0a1ff87faaa684") : this.d.getName();
    }

    public final String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a1ec0f54b955c25f0463e466b0dfcc0", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a1ec0f54b955c25f0463e466b0dfcc0") : this.d.getVersion();
    }

    public final String e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "399ed680035ede4df0262af1770c9096", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "399ed680035ede4df0262af1770c9096") : this.d.getJsId();
    }

    public final boolean f() {
        return this.e == 1002;
    }
}
