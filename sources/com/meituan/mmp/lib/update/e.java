package com.meituan.mmp.lib.update;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.mmp.lib.DebugHelper;
import com.meituan.mmp.lib.trace.b;
import com.meituan.mmp.lib.w;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e implements Runnable {
    public static ChangeQuickRedirect a;
    private final Context b;
    private final MMPUpdateConfig c;
    private final i d;
    private final i e;
    private final m f;
    private final m g;

    public e(Context context, MMPUpdateConfig mMPUpdateConfig, i iVar, m mVar, i iVar2, m mVar2) {
        Object[] objArr = {context, mMPUpdateConfig, iVar, mVar, iVar2, mVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "843bf57c092031af023cd2a81d692c58", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "843bf57c092031af023cd2a81d692c58");
            return;
        }
        this.b = context;
        this.c = mMPUpdateConfig;
        this.d = iVar;
        this.e = iVar2;
        this.f = mVar;
        this.g = mVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8417238029e10137ca9962a215c0edd4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8417238029e10137ca9962a215c0edd4");
            return;
        }
        boolean c = c.c(this.c.b);
        if (c) {
            com.meituan.mmp.lib.trace.b.a("MMPUpdateCacheDelegate", "load with BuildInPackage", this.c.b);
        }
        if (c && DebugHelper.i) {
            a(false);
        } else if (c && c.a(this.b, this.c.b)) {
            a();
        } else {
            MMPAppProp b = o.b(this.b, this.c.b);
            if (b == null || DebugHelper.f) {
                if (c) {
                    b.a.a("MMPUpdateCacheDelegate", "not cached, use inner package");
                    a();
                    return;
                }
                b.a.a("MMPUpdateCacheDelegate", "not cached, start foreground check");
                w.a().e.a("native_checkupdate_begin");
                l.a().a(this.c, this.d, this.f);
                return;
            }
            if (c) {
                z = false;
            } else {
                long currentTimeMillis = System.currentTimeMillis() - b.checkTime;
                if (currentTimeMillis < 0) {
                    currentTimeMillis = 2147483647L;
                }
                com.meituan.mmp.lib.config.c cVar = new com.meituan.mmp.lib.config.c(this.b);
                String str = this.c.b;
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = com.meituan.mmp.lib.config.c.a;
                long longValue = PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "cd443689d1cb89b61a69d6f5fb641404", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "cd443689d1cb89b61a69d6f5fb641404")).longValue() : cVar.c.getLong(str, com.meituan.mmp.lib.config.c.b);
                boolean z2 = currentTimeMillis >= longValue;
                com.meituan.mmp.lib.trace.b.b("MMPUpdateCacheDelegate", String.format("appId %s, cacheAge %s, appTimeOut %s", this.c.b, Long.toString(currentTimeMillis), Long.toString(longValue)));
                z = z2 && !DebugHelper.h;
                if (z) {
                    b.a.a("MMPUpdateCacheDelegate", "cache expired, need foreground check");
                }
            }
            boolean z3 = z | (b.isDioPackage && !com.meituan.mmp.lib.config.b.b(b.appid)) | DebugHelper.g;
            if (TextUtils.equals(this.c.b, "bfceace2a83e4328") && com.meituan.mmp.lib.config.b.S()) {
                z3 = true;
            }
            if (z3) {
                w.a().e.a("native_checkupdate_begin");
                b.a.a("MMPUpdateCacheDelegate", "start foreground check");
                b.loadType = 4;
                if (this.d != null) {
                    this.d.a(b);
                }
                l.a().a(this.c, this.d != null ? new n(this.b, b, this.c, this.d) : null, this.f);
                return;
            }
            b.loadType = 0;
            if (this.d != null) {
                this.d.a(b);
            }
            if (this.f != null) {
                this.f.a(false);
            }
            if (this.d != null) {
                this.d.a(b, b.mmpSdk);
                this.d.a(b, b.mainPackage);
            }
            MMPPackageInfo subPackageByPath = b.getSubPackageByPath(this.b, this.c.l);
            if (subPackageByPath == null) {
                if (this.d != null) {
                    this.d.a(b, (List<MMPPackageInfo>) null);
                }
            } else if (subPackageByPath.u) {
                if (this.d != null) {
                    this.d.a(b, subPackageByPath);
                    this.d.a(b, (ArrayList) com.meituan.mmp.lib.utils.h.a(subPackageByPath));
                }
            } else {
                b.a.a("MMPUpdateCacheDelegate", "cached but sub-package needs download: " + subPackageByPath.toString());
                MMPUpdateConfig mMPUpdateConfig = new MMPUpdateConfig(this.c);
                mMPUpdateConfig.m = com.meituan.mmp.lib.utils.h.a(subPackageByPath);
                l.a().a(mMPUpdateConfig, b, this.d, this.f);
            }
            if (DebugHelper.j || DebugHelper.h) {
                return;
            }
            b.a.a("MMPUpdateCacheDelegate", "cached, start background check");
            l a2 = l.a();
            MMPUpdateConfig mMPUpdateConfig2 = new MMPUpdateConfig(this.c);
            mMPUpdateConfig2.h = 2;
            a2.a(mMPUpdateConfig2, this.e, this.g);
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46901d28a89ab8df5a74570825268542", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46901d28a89ab8df5a74570825268542");
        } else {
            a(true);
        }
    }

    private void a(boolean z) {
        boolean z2 = true;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3cd9745cb7ca7ff90a481c4053293e49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3cd9745cb7ca7ff90a481c4053293e49");
            return;
        }
        l a2 = l.a();
        Context context = this.b;
        MMPUpdateConfig mMPUpdateConfig = this.c;
        mMPUpdateConfig.d = c.b(this.c.b);
        d dVar = new d(context, mMPUpdateConfig, this.d, this.f);
        dVar.b = c.a(this.c.b);
        a2.post(dVar.a((!z || DebugHelper.j) ? false : false, this.e, this.g));
    }
}
