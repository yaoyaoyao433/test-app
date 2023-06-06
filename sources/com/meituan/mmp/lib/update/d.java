package com.meituan.mmp.lib.update;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.common.aidata.ai.bundle.AiDownloadEnv;
import com.meituan.met.mercury.load.core.DDResource;
import com.meituan.mmp.lib.t;
import com.meituan.mmp.lib.utils.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d implements Runnable {
    public static ChangeQuickRedirect a;
    DDResource b;
    private final Context c;
    private final MMPUpdateConfig d;
    private boolean e;
    private i f;
    private m g;
    private final i h;
    private final m i;

    public d(Context context, MMPUpdateConfig mMPUpdateConfig, i iVar, m mVar) {
        Object[] objArr = {context, mMPUpdateConfig, iVar, mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2d275e902f3d3d01b31f0f6325e4385", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2d275e902f3d3d01b31f0f6325e4385");
            return;
        }
        this.c = context;
        this.d = mMPUpdateConfig;
        this.h = iVar;
        this.i = mVar;
    }

    public final d a(boolean z, i iVar, m mVar) {
        this.e = z;
        this.f = iVar;
        this.g = mVar;
        return this;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebe9e7074bf4079c789b95ad385ee87a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebe9e7074bf4079c789b95ad385ee87a");
            return;
        }
        com.meituan.mmp.lib.trace.b.b("MMPInnerPackageDelegate", "start InnerPackage");
        if (TextUtils.isEmpty(this.d.d) && this.b == null) {
            this.h.a(null, "Inner Package without localPath", null);
            return;
        }
        File a2 = p.a(this.c, this.d.b);
        File file = new File(a2, AiDownloadEnv.AI_JS_FRAMEWORK_CONFIG_NAME);
        if (a(a2, file)) {
            MMPAppProp a3 = a(file);
            if (a3 == null) {
                this.h.a(null, "Inner Package appProp is null", null);
                s.a(a2.getAbsolutePath());
                return;
            }
            this.h.a(a3);
            a(a3);
            if (this.e) {
                l a4 = l.a();
                MMPUpdateConfig mMPUpdateConfig = new MMPUpdateConfig(this.d);
                mMPUpdateConfig.h = 2;
                mMPUpdateConfig.f = a3;
                a4.a(mMPUpdateConfig, this.f, this.g);
            }
        }
    }

    private boolean a(MMPAppProp mMPAppProp) {
        Object[] objArr = {mMPAppProp};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93d468e70562f8b22b7843bfcd02783c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93d468e70562f8b22b7843bfcd02783c")).booleanValue();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        mMPAppProp.mmpSdk.c(this.c);
        mMPAppProp.mainPackage.c(this.c);
        arrayList.add(mMPAppProp.mmpSdk);
        arrayList.add(mMPAppProp.mainPackage);
        MMPPackageInfo subPackageByPath = mMPAppProp.getSubPackageByPath(this.c, this.d.l);
        if (subPackageByPath != null) {
            arrayList.add(subPackageByPath);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            MMPPackageInfo mMPPackageInfo = (MMPPackageInfo) it.next();
            if (mMPPackageInfo.u) {
                this.h.a(mMPAppProp, mMPPackageInfo);
            } else if (!mMPPackageInfo.t) {
                arrayList2.add(mMPPackageInfo);
            } else {
                String format = String.format("Inner Package %s not ready; %s", mMPPackageInfo, this.d.l);
                com.meituan.mmp.lib.trace.b.d("MMPInnerPackageDelegate", format);
                System.out.println(format);
                this.h.a(mMPAppProp, format, null);
                return false;
            }
        }
        o.a(this.c, mMPAppProp, false, false, !t.b(mMPAppProp.appid));
        if (com.meituan.mmp.lib.utils.h.a((List) arrayList2)) {
            this.h.a(mMPAppProp, (List<MMPPackageInfo>) null);
        } else {
            MMPUpdateConfig mMPUpdateConfig = new MMPUpdateConfig(this.d);
            mMPUpdateConfig.m = arrayList2;
            l.a().a(mMPUpdateConfig, mMPAppProp, this.h, this.i);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a(java.io.File r14, java.io.File r15) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.mmp.lib.update.d.a(java.io.File, java.io.File):boolean");
    }

    private MMPAppProp a(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "590e688728e2e766e6dd169acb34cdf7", RobustBitConfig.DEFAULT_VALUE)) {
            return (MMPAppProp) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "590e688728e2e766e6dd169acb34cdf7");
        }
        String a2 = s.a(file);
        try {
            MMPAppProp mMPAppProp = (MMPAppProp) g.a().b().fromJson(a2, (Class<Object>) MMPAppProp.class);
            if (mMPAppProp != null) {
                mMPAppProp.appid = this.d.b;
                mMPAppProp.mainPackage.h = this.d.b;
                mMPAppProp.mmpSdk.h = this.d.b;
                if (mMPAppProp.subPackages != null) {
                    Iterator<MMPPackageInfo> it = mMPAppProp.subPackages.iterator();
                    while (it.hasNext()) {
                        MMPPackageInfo next = it.next();
                        if (next != null) {
                            next.h = this.d.b;
                        }
                    }
                }
            } else {
                com.meituan.mmp.lib.trace.b.d("MMPInnerPackageDelegate", String.format("Inner Package config.json is not valid format! appProp null, config=%s", a2));
                this.h.a(null, "Inner Package config.json not JSON format!", null);
            }
            return mMPAppProp;
        } catch (Exception unused) {
            com.meituan.mmp.lib.trace.b.d("MMPInnerPackageDelegate", String.format("Inner Package config.json is not valid format! config=%s", a2));
            this.h.a(null, "Inner Package config.json  not valid JSON format!", null);
            return null;
        }
    }
}
