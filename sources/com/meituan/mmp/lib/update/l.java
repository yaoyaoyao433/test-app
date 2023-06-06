package com.meituan.mmp.lib.update;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import com.meituan.android.cipstorage.q;
import com.meituan.android.mrn.engine.MRNBundleManager;
import com.meituan.mmp.lib.DebugHelper;
import com.meituan.mmp.lib.download.a;
import com.meituan.mmp.lib.download.d;
import com.meituan.mmp.lib.t;
import com.meituan.mmp.lib.trace.b;
import com.meituan.mmp.lib.utils.ay;
import com.meituan.mmp.lib.utils.bb;
import com.meituan.mmp.lib.utils.bd;
import com.meituan.mmp.lib.utils.s;
import com.meituan.mmp.lib.w;
import com.meituan.mmp.main.Logger;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class l extends Handler {
    public static ChangeQuickRedirect a;
    @SuppressLint({"StaticFieldLeak"})
    private static volatile l b;
    private Context c;
    private h d;
    private com.meituan.mmp.lib.download.d e;
    private final Queue<MMPUpdateConfig> f;
    private final Queue<MMPUpdateConfig> g;
    private final Set<MMPUpdateConfig> h;

    public static /* synthetic */ void a(l lVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, lVar, changeQuickRedirect, false, "7694f3fdfc39e721a75293fccaf0451d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, lVar, changeQuickRedirect, false, "7694f3fdfc39e721a75293fccaf0451d");
            return;
        }
        while (true) {
            MMPUpdateConfig poll = lVar.f.poll();
            if (poll == null) {
                break;
            } else if (poll.j) {
                lVar.d.a(poll, null, "update canceled", null);
            } else {
                lVar.a(poll);
            }
        }
        if (!lVar.h.isEmpty()) {
            return;
        }
        while (true) {
            MMPUpdateConfig poll2 = lVar.g.poll();
            if (poll2 == null) {
                return;
            }
            if (poll2.j) {
                b.a.a("update canceled: " + poll2.b);
                lVar.d.a(poll2, null, "update canceled", null);
            } else {
                lVar.a(poll2);
                return;
            }
        }
    }

    public static /* synthetic */ void a(l lVar, MMPAppProp mMPAppProp, MMPUpdateConfig mMPUpdateConfig) {
        boolean z;
        boolean z2;
        MMPPackageInfo subPackageByPath;
        Object[] objArr = {mMPAppProp, mMPUpdateConfig};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, lVar, changeQuickRedirect, false, "dfd4b2c3b0b3cb506f5f0fef180079e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, lVar, changeQuickRedirect, false, "dfd4b2c3b0b3cb506f5f0fef180079e9");
            return;
        }
        mMPUpdateConfig.i = true;
        if (mMPUpdateConfig.f != null && o.a(mMPUpdateConfig.f, mMPAppProp)) {
            com.meituan.mmp.lib.trace.b.b("MMPUpdateOperator#handleAppProp", mMPUpdateConfig.b + " - " + mMPAppProp.appName + ", type: " + MMPPackageInfo.a(mMPUpdateConfig.h) + ", not update for the version is same with innerPackage");
            mMPAppProp.loadType = 1;
            lVar.d.a(mMPUpdateConfig, mMPAppProp);
            lVar.d.a(mMPUpdateConfig, false, mMPAppProp);
            lVar.b(mMPUpdateConfig);
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = MMPUpdateConfig.a;
        if (PatchProxy.isSupport(objArr2, mMPUpdateConfig, changeQuickRedirect2, false, "34c4cee1627a119387be69e5a7b7b987", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, mMPUpdateConfig, changeQuickRedirect2, false, "34c4cee1627a119387be69e5a7b7b987")).booleanValue();
        } else {
            z = !TextUtils.isEmpty(mMPUpdateConfig.e);
        }
        mMPAppProp.setDebug(z);
        Context context = lVar.c;
        Object[] objArr3 = {context, mMPAppProp};
        ChangeQuickRedirect changeQuickRedirect3 = o.a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "812b372bcb3c320e85e54ebbc74c2407", RobustBitConfig.DEFAULT_VALUE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "812b372bcb3c320e85e54ebbc74c2407")).booleanValue();
        } else if (o.a(o.a(context, mMPAppProp.appid, false, false), mMPAppProp)) {
            o.a(context, mMPAppProp, false);
            z2 = true;
        } else {
            z2 = false;
        }
        mMPAppProp.loadType = z2 ? 1 : 2;
        lVar.d.a(mMPUpdateConfig, mMPAppProp);
        lVar.d.a(mMPUpdateConfig, !z2, mMPAppProp);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        mMPAppProp.mmpSdk.c(lVar.c);
        mMPAppProp.mainPackage.c(lVar.c);
        arrayList.add(mMPAppProp.mmpSdk);
        arrayList.add(mMPAppProp.mainPackage);
        if (!TextUtils.isEmpty(mMPUpdateConfig.l) && (subPackageByPath = mMPAppProp.getSubPackageByPath(lVar.c, mMPUpdateConfig.l)) != null) {
            arrayList.add(subPackageByPath);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            MMPPackageInfo mMPPackageInfo = (MMPPackageInfo) it.next();
            if (mMPPackageInfo.u) {
                lVar.d.a(mMPUpdateConfig, mMPAppProp, mMPPackageInfo);
            } else {
                arrayList2.add(mMPPackageInfo);
            }
        }
        com.meituan.mmp.lib.trace.b.b("MMPUpdateOperator#handleAppProp", mMPUpdateConfig.b + " - " + mMPAppProp.appName + ", type: " + MMPPackageInfo.a(mMPUpdateConfig.h) + ", " + arrayList2.size() + " packages need update");
        if (com.meituan.mmp.lib.utils.h.a((List) arrayList2)) {
            lVar.a(mMPUpdateConfig, mMPAppProp, arrayList, z2 ? false : true);
            return;
        }
        mMPUpdateConfig.m = arrayList2;
        lVar.a(mMPUpdateConfig, mMPAppProp);
    }

    public static /* synthetic */ void a(l lVar, final MMPUpdateConfig mMPUpdateConfig, final MMPAppProp mMPAppProp) {
        String absolutePath;
        Object[] objArr = {mMPUpdateConfig, mMPAppProp};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, lVar, changeQuickRedirect, false, "b2b1f1ef77a3dd036110fd40bc5a1cbe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, lVar, changeQuickRedirect, false, "b2b1f1ef77a3dd036110fd40bc5a1cbe");
            return;
        }
        com.meituan.mmp.lib.trace.b.b("MMPUpdateOperator#startPreparePackage", mMPUpdateConfig.b + " - " + mMPAppProp.appName + " type: " + MMPPackageInfo.a(mMPUpdateConfig.h) + StringUtil.SPACE + mMPAppProp);
        boolean z = false;
        for (final MMPPackageInfo mMPPackageInfo : mMPUpdateConfig.m) {
            if (mMPPackageInfo.u) {
                lVar.b(mMPUpdateConfig, mMPAppProp, mMPPackageInfo);
                lVar.a(mMPUpdateConfig, mMPAppProp, mMPPackageInfo);
            } else {
                if (!z) {
                    h hVar = lVar.d;
                    List<MMPPackageInfo> list = mMPUpdateConfig.m;
                    Object[] objArr2 = {mMPUpdateConfig, mMPAppProp, list};
                    ChangeQuickRedirect changeQuickRedirect2 = h.a;
                    if (PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect2, false, "bfad635a28df9c3e3bd97ffde7c6f775", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect2, false, "bfad635a28df9c3e3bd97ffde7c6f775");
                    } else {
                        Logger logger = hVar.c;
                        Object[] objArr3 = new Object[3];
                        objArr3[0] = mMPUpdateConfig;
                        objArr3[1] = "size:";
                        objArr3[2] = Integer.valueOf(list != null ? list.size() : 0);
                        logger.i("MMPUpdateInnerEventManager@onDownloadPackagesStart", objArr3);
                        m mVar = hVar.b.get(mMPUpdateConfig);
                        if (mVar != null) {
                            mVar.a(mMPAppProp, list);
                        }
                    }
                    z = true;
                }
                mMPPackageInfo.j = mMPUpdateConfig.h;
                com.meituan.mmp.lib.download.g gVar = new com.meituan.mmp.lib.download.g();
                gVar.b = mMPPackageInfo.e;
                gVar.g = mMPPackageInfo.f;
                int i = mMPUpdateConfig.h;
                gVar.f = i != 1 ? i != 7 ? 50 : 70 : 90;
                Context context = lVar.c;
                Object[] objArr4 = {context};
                ChangeQuickRedirect changeQuickRedirect3 = MMPPackageInfo.a;
                if (!PatchProxy.isSupport(objArr4, mMPPackageInfo, changeQuickRedirect3, false, "cf7cd3ff1b028656cab9a692362c12ca", RobustBitConfig.DEFAULT_VALUE)) {
                    switch (mMPPackageInfo.r) {
                        case 1:
                            absolutePath = ay.b(context).getAbsolutePath();
                            break;
                        case 2:
                        case 3:
                            absolutePath = p.c(context, mMPPackageInfo.h).getAbsolutePath();
                            break;
                        default:
                            absolutePath = null;
                            break;
                    }
                } else {
                    absolutePath = (String) PatchProxy.accessDispatch(objArr4, mMPPackageInfo, changeQuickRedirect3, false, "cf7cd3ff1b028656cab9a692362c12ca");
                }
                gVar.c = absolutePath;
                gVar.d = mMPPackageInfo.f + MRNBundleManager.MRN_BUNDLE_SUFFIX;
                gVar.e = "__mmp_file_unzip_done_check";
                gVar.h = mMPUpdateConfig.c ? 2 : 1;
                gVar.i = mMPPackageInfo.a(lVar.c);
                com.meituan.mmp.lib.download.d dVar = lVar.e;
                a.InterfaceC0405a interfaceC0405a = new a.InterfaceC0405a() { // from class: com.meituan.mmp.lib.update.l.5
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.mmp.lib.download.a.InterfaceC0405a
                    public final void a() {
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect4, false, "5ab10abe4dcd7a4a168a1e5367602b66", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect4, false, "5ab10abe4dcd7a4a168a1e5367602b66");
                        }
                    }

                    @Override // com.meituan.mmp.lib.download.a.InterfaceC0405a
                    public final void b() {
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect4, false, "197b8d8b7d2fdb4a6df5df59979e9805", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect4, false, "197b8d8b7d2fdb4a6df5df59979e9805");
                            return;
                        }
                        mMPPackageInfo.k = System.currentTimeMillis();
                        if (mMPUpdateConfig.h == 1) {
                            if (mMPPackageInfo.d()) {
                                w.a().e.a("native_runtime_download_begin");
                            } else if (mMPPackageInfo.e()) {
                                w.a().e.a("native_mainpkg_download_begin");
                            }
                        }
                        h hVar2 = l.this.d;
                        MMPUpdateConfig mMPUpdateConfig2 = mMPUpdateConfig;
                        MMPAppProp mMPAppProp2 = mMPAppProp;
                        MMPPackageInfo mMPPackageInfo2 = mMPPackageInfo;
                        Object[] objArr6 = {mMPUpdateConfig2, mMPAppProp2, mMPPackageInfo2};
                        ChangeQuickRedirect changeQuickRedirect5 = h.a;
                        if (PatchProxy.isSupport(objArr6, hVar2, changeQuickRedirect5, false, "ae8fde48ba78942974bae0d3a16a57d3", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, hVar2, changeQuickRedirect5, false, "ae8fde48ba78942974bae0d3a16a57d3");
                            return;
                        }
                        hVar2.c.i("MMPUpdateInnerEventManager@onDownloadStart", mMPUpdateConfig2, mMPPackageInfo2.g, mMPPackageInfo2.f);
                        m mVar2 = hVar2.b.get(mMPUpdateConfig2);
                        if (mVar2 != null) {
                            mVar2.a(mMPAppProp2, mMPPackageInfo2);
                        }
                    }

                    @Override // com.meituan.mmp.lib.download.a.InterfaceC0405a
                    public final void a(String str, boolean z2, long j) {
                        Object[] objArr5 = {str, Byte.valueOf(z2 ? (byte) 1 : (byte) 0), new Long(j)};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect4, false, "bfe9c0b1524e9605a0c95fdbe25c6b19", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect4, false, "bfe9c0b1524e9605a0c95fdbe25c6b19");
                            return;
                        }
                        if (z2) {
                            mMPPackageInfo.l = (int) (System.currentTimeMillis() - mMPPackageInfo.k);
                            mMPPackageInfo.m = (int) j;
                        } else {
                            mMPPackageInfo.k = -1L;
                        }
                        h hVar2 = l.this.d;
                        MMPUpdateConfig mMPUpdateConfig2 = mMPUpdateConfig;
                        MMPAppProp mMPAppProp2 = mMPAppProp;
                        MMPPackageInfo mMPPackageInfo2 = mMPPackageInfo;
                        Object[] objArr6 = {mMPUpdateConfig2, mMPAppProp2, mMPPackageInfo2, Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                        ChangeQuickRedirect changeQuickRedirect5 = h.a;
                        if (PatchProxy.isSupport(objArr6, hVar2, changeQuickRedirect5, false, "116a4ff7568e2e95f487d1ed0d609450", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, hVar2, changeQuickRedirect5, false, "116a4ff7568e2e95f487d1ed0d609450");
                        } else {
                            Logger logger2 = hVar2.c;
                            logger2.i("MMPUpdateInnerEventManager@onDownloadReady", mMPUpdateConfig2, "realDownload:" + z2, mMPPackageInfo2.g);
                            m mVar2 = hVar2.b.get(mMPUpdateConfig2);
                            if (mVar2 != null) {
                                mVar2.a(mMPAppProp2, mMPPackageInfo2, z2);
                            }
                        }
                        l.this.b(mMPUpdateConfig, mMPAppProp, mMPPackageInfo);
                    }

                    @Override // com.meituan.mmp.lib.download.a.InterfaceC0405a
                    public final void a(int i2, String str) {
                        Object[] objArr5 = {Integer.valueOf(i2), str};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect4, false, "f20fbba5b73fd0ced86693c60ef2b940", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect4, false, "f20fbba5b73fd0ced86693c60ef2b940");
                            return;
                        }
                        h hVar2 = l.this.d;
                        MMPUpdateConfig mMPUpdateConfig2 = mMPUpdateConfig;
                        MMPAppProp mMPAppProp2 = mMPAppProp;
                        MMPPackageInfo mMPPackageInfo2 = mMPPackageInfo;
                        String str2 = "ErrorCode: " + i2 + StringUtil.SPACE + str;
                        Object[] objArr6 = {mMPUpdateConfig2, mMPAppProp2, mMPPackageInfo2, str2, null};
                        ChangeQuickRedirect changeQuickRedirect5 = h.a;
                        if (PatchProxy.isSupport(objArr6, hVar2, changeQuickRedirect5, false, "16918b63cfc22725f07e58740708e449", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, hVar2, changeQuickRedirect5, false, "16918b63cfc22725f07e58740708e449");
                            return;
                        }
                        hVar2.c.e("MMPUpdateInnerEventManager@onDownloadFailed", null, mMPUpdateConfig2, mMPPackageInfo2, str2);
                        m mVar2 = hVar2.b.get(mMPUpdateConfig2);
                        if (mVar2 != null) {
                            mVar2.a(mMPAppProp2, mMPPackageInfo2, str2, null);
                        }
                    }

                    @Override // com.meituan.mmp.lib.download.a.InterfaceC0405a
                    public final void c() {
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect4, false, "3944dd7c0fb6189428d015ffce5fbc57", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect4, false, "3944dd7c0fb6189428d015ffce5fbc57");
                            return;
                        }
                        h hVar2 = l.this.d;
                        MMPUpdateConfig mMPUpdateConfig2 = mMPUpdateConfig;
                        MMPAppProp mMPAppProp2 = mMPAppProp;
                        MMPPackageInfo mMPPackageInfo2 = mMPPackageInfo;
                        Object[] objArr6 = {mMPUpdateConfig2, mMPAppProp2, mMPPackageInfo2};
                        ChangeQuickRedirect changeQuickRedirect5 = h.a;
                        if (PatchProxy.isSupport(objArr6, hVar2, changeQuickRedirect5, false, "bbea4c0ffc14a39fe49d6886eca50ad9", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, hVar2, changeQuickRedirect5, false, "bbea4c0ffc14a39fe49d6886eca50ad9");
                            return;
                        }
                        hVar2.c.i("MMPUpdateInnerEventManager@onUnzipStart", mMPUpdateConfig2, mMPPackageInfo2);
                        m mVar2 = hVar2.b.get(mMPUpdateConfig2);
                        if (mVar2 != null) {
                            mVar2.b(mMPAppProp2, mMPPackageInfo2);
                        }
                    }

                    @Override // com.meituan.mmp.lib.download.a.InterfaceC0405a
                    public final void a(String str) {
                        Object[] objArr5 = {str};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect4, false, "82296b520d5e17fcba278bc2068e8bd1", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect4, false, "82296b520d5e17fcba278bc2068e8bd1");
                            return;
                        }
                        if (mMPUpdateConfig.h == 1) {
                            if (mMPPackageInfo.d()) {
                                w.a().e.a("native_runtime_download_end");
                            } else if (mMPPackageInfo.e()) {
                                w.a().e.a("native_mainpkg_download_end");
                            }
                        }
                        h hVar2 = l.this.d;
                        MMPUpdateConfig mMPUpdateConfig2 = mMPUpdateConfig;
                        MMPAppProp mMPAppProp2 = mMPAppProp;
                        MMPPackageInfo mMPPackageInfo2 = mMPPackageInfo;
                        Object[] objArr6 = {mMPUpdateConfig2, mMPAppProp2, mMPPackageInfo2, (byte) 1};
                        ChangeQuickRedirect changeQuickRedirect5 = h.a;
                        if (PatchProxy.isSupport(objArr6, hVar2, changeQuickRedirect5, false, "5c69c308f5b08635ffd72ac4fcc22257", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, hVar2, changeQuickRedirect5, false, "5c69c308f5b08635ffd72ac4fcc22257");
                            return;
                        }
                        hVar2.c.i("MMPUpdateInnerEventManager@onUnzipReady", mMPUpdateConfig2, mMPPackageInfo2);
                        m mVar2 = hVar2.b.get(mMPUpdateConfig2);
                        if (mVar2 != null) {
                            mVar2.b(mMPAppProp2, mMPPackageInfo2, true);
                        }
                    }

                    @Override // com.meituan.mmp.lib.download.a.InterfaceC0405a
                    public final void b(int i2, String str) {
                        Object[] objArr5 = {4, str};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect4, false, "4fef0ba765ded3e4ebddedb3310274fc", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect4, false, "4fef0ba765ded3e4ebddedb3310274fc");
                            return;
                        }
                        h hVar2 = l.this.d;
                        MMPUpdateConfig mMPUpdateConfig2 = mMPUpdateConfig;
                        MMPAppProp mMPAppProp2 = mMPAppProp;
                        MMPPackageInfo mMPPackageInfo2 = mMPPackageInfo;
                        String str2 = "ErrorCode: 4" + StringUtil.SPACE + str;
                        Object[] objArr6 = {mMPUpdateConfig2, mMPAppProp2, mMPPackageInfo2, str2, null};
                        ChangeQuickRedirect changeQuickRedirect5 = h.a;
                        if (PatchProxy.isSupport(objArr6, hVar2, changeQuickRedirect5, false, "831d3c4d99f6bfdcf5d95962aca7d284", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, hVar2, changeQuickRedirect5, false, "831d3c4d99f6bfdcf5d95962aca7d284");
                            return;
                        }
                        hVar2.c.e("MMPUpdateInnerEventManager@onUnzipFailed", null, mMPUpdateConfig2, mMPPackageInfo2, str2);
                        m mVar2 = hVar2.b.get(mMPUpdateConfig2);
                        if (mVar2 != null) {
                            mVar2.b(mMPAppProp2, mMPPackageInfo2, str2, null);
                        }
                    }
                };
                a.b bVar = new a.b() { // from class: com.meituan.mmp.lib.update.l.6
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.mmp.lib.download.a.b
                    public final void a(final String str, String str2, boolean z2) {
                        Object[] objArr5 = {str, str2, Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect4, false, "c6454719d1102b0c0b4659707eac98a3", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect4, false, "c6454719d1102b0c0b4659707eac98a3");
                        } else if (!mMPPackageInfo.f(l.this.c)) {
                            l.this.a(mMPUpdateConfig, mMPAppProp, mMPPackageInfo, "checkSourceFileNotReady", null);
                            MMPEnvHelper.getSniffer().a("checkSourceFileNotReady", mMPAppProp.appid, l.this.a(str2), null);
                            s.a(str2);
                        } else {
                            if (z2) {
                                mMPPackageInfo.j = mMPUpdateConfig.h;
                                mMPPackageInfo.n = mMPUpdateConfig.k;
                                mMPPackageInfo.d(l.this.c);
                            }
                            l.this.a(mMPUpdateConfig, mMPAppProp, mMPPackageInfo);
                            com.meituan.mmp.lib.executor.a.a(new Runnable() { // from class: com.meituan.mmp.lib.update.l.6.1
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr6 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect5, false, "6446ebfa2f95fffcd8dbf7e603ca104f", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect5, false, "6446ebfa2f95fffcd8dbf7e603ca104f");
                                        return;
                                    }
                                    PackageManageUtil.a(mMPPackageInfo);
                                    s.a(str);
                                }
                            });
                        }
                    }

                    @Override // com.meituan.mmp.lib.download.a.b
                    public final void a(int i2, String str) {
                        Object[] objArr5 = {Integer.valueOf(i2), str};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect4, false, "a391278e7063d7b84ece8307da801519", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect4, false, "a391278e7063d7b84ece8307da801519");
                            return;
                        }
                        l lVar2 = l.this;
                        MMPUpdateConfig mMPUpdateConfig2 = mMPUpdateConfig;
                        MMPAppProp mMPAppProp2 = mMPAppProp;
                        MMPPackageInfo mMPPackageInfo2 = mMPPackageInfo;
                        lVar2.a(mMPUpdateConfig2, mMPAppProp2, mMPPackageInfo2, "ErrorCode: " + i2 + StringUtil.SPACE + str, null);
                    }
                };
                Object[] objArr5 = {gVar, interfaceC0405a, bVar};
                ChangeQuickRedirect changeQuickRedirect4 = com.meituan.mmp.lib.download.d.a;
                if (PatchProxy.isSupport(objArr5, dVar, changeQuickRedirect4, false, "037c95c275cfd05d998f5b9aede26bdb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, dVar, changeQuickRedirect4, false, "037c95c275cfd05d998f5b9aede26bdb");
                } else if (TextUtils.isEmpty(gVar.b)) {
                    bVar.a(5, "empty url");
                } else if (TextUtils.isEmpty(gVar.d)) {
                    bVar.a(5, "empty file name");
                } else if (TextUtils.isEmpty(gVar.c)) {
                    bVar.a(5, "empty download directory");
                } else {
                    interfaceC0405a.a();
                    com.meituan.mmp.lib.download.b bVar2 = dVar.c;
                    d.AnonymousClass1 anonymousClass1 = new d.AnonymousClass1(gVar, interfaceC0405a, bVar);
                    Object[] objArr6 = {anonymousClass1};
                    ChangeQuickRedirect changeQuickRedirect5 = com.meituan.mmp.lib.download.b.a;
                    if (PatchProxy.isSupport(objArr6, bVar2, changeQuickRedirect5, false, "365709c6ebca526f1415b060697f0f13", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, bVar2, changeQuickRedirect5, false, "365709c6ebca526f1415b060697f0f13");
                    } else {
                        bVar2.b.execute(anonymousClass1);
                    }
                }
            }
        }
    }

    public static /* synthetic */ void a(l lVar, MMPUpdateConfig mMPUpdateConfig, MMPAppProp mMPAppProp, MMPPackageInfo mMPPackageInfo) {
        Object[] objArr = {mMPUpdateConfig, mMPAppProp, mMPPackageInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, lVar, changeQuickRedirect, false, "03cb66e9eea1c09a2afd2fc979c3fe54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, lVar, changeQuickRedirect, false, "03cb66e9eea1c09a2afd2fc979c3fe54");
            return;
        }
        if (!mMPPackageInfo.a(lVar.c, mMPPackageInfo.a() ? 2 : 1)) {
            lVar.a(mMPUpdateConfig, mMPAppProp, mMPPackageInfo, "checkSourceNotReady", null);
            MMPEnvHelper.getSniffer().a("checkSourceFileNotReady", mMPAppProp.appid, lVar.a(mMPPackageInfo.a(lVar.c)), null);
            mMPPackageInfo.e(lVar.c);
            return;
        }
        Object[] objArr2 = {mMPUpdateConfig, mMPAppProp, mMPPackageInfo};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, lVar, changeQuickRedirect2, false, "31ca80caf802ffe77f093d27c7d81e0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, lVar, changeQuickRedirect2, false, "31ca80caf802ffe77f093d27c7d81e0c");
            return;
        }
        com.meituan.mmp.lib.trace.b.b("MMPUpdateOperator#onPackageUpdateSuccess", mMPAppProp.appid + " - " + mMPAppProp.appName + " - " + mMPPackageInfo.g);
        lVar.d.a(mMPUpdateConfig, mMPAppProp, mMPPackageInfo);
        lVar.c(mMPUpdateConfig, mMPAppProp, mMPPackageInfo);
    }

    public static l a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d4af745c0ba98330a8c40cf6f1e6399f", RobustBitConfig.DEFAULT_VALUE)) {
            return (l) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d4af745c0ba98330a8c40cf6f1e6399f");
        }
        if (b == null) {
            synchronized (l.class) {
                if (b == null) {
                    HandlerThread handlerThread = new HandlerThread("hera-appUpdate");
                    handlerThread.start();
                    b = new l(handlerThread.getLooper());
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "03f4dd1cb6956e0e2ecabc48af70e6c2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "03f4dd1cb6956e0e2ecabc48af70e6c2");
                    } else if (com.meituan.mmp.lib.mp.a.f()) {
                        a().post(new Runnable() { // from class: com.meituan.mmp.lib.update.l.7
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z;
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8604ef8ea0f3901e80dd2e2fd0b72884", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8604ef8ea0f3901e80dd2e2fd0b72884");
                                    return;
                                }
                                Context context = MMPEnvHelper.getContext();
                                String appCode = MMPEnvHelper.getEnvInfo().getAppCode();
                                Object[] objArr4 = {context, appCode};
                                ChangeQuickRedirect changeQuickRedirect4 = o.a;
                                if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "ac0578932619efb0f9bc26196046c283", RobustBitConfig.DEFAULT_VALUE)) {
                                    z = ((Boolean) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "ac0578932619efb0f9bc26196046c283")).booleanValue();
                                } else {
                                    String string = MMPEnvHelper.getDefaultSharedPreferences().getString("appCode", null);
                                    MMPEnvHelper.getDefaultSharedPreferences().edit().putString("appCode", appCode).apply();
                                    z = (TextUtils.isEmpty(string) || TextUtils.equals(string, appCode)) ? false : true;
                                }
                                if (z) {
                                    Context context2 = MMPEnvHelper.getContext();
                                    Object[] objArr5 = {context2};
                                    ChangeQuickRedirect changeQuickRedirect5 = o.a;
                                    if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "007f499d422717563c323f67057f2350", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "007f499d422717563c323f67057f2350");
                                        return;
                                    }
                                    for (String str : q.a(context2, false, false).keySet()) {
                                        if (str.startsWith("mmp_app_property_")) {
                                            com.meituan.mmp.lib.trace.b.b("clear AppProp", str);
                                            MMPEnvHelper.getSharedPreferences(context2, str).edit().clear().apply();
                                        }
                                    }
                                }
                            }
                        });
                    }
                }
            }
        }
        return b;
    }

    private l(Looper looper) {
        super(looper);
        Object[] objArr = {looper};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "386701a4bb7e83824a7c72b818ea1153", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "386701a4bb7e83824a7c72b818ea1153");
            return;
        }
        this.f = new ConcurrentLinkedQueue();
        this.g = new ConcurrentLinkedQueue();
        this.h = new CopyOnWriteArraySet();
        this.c = MMPEnvHelper.getEnvInfo().getApplicationContext();
        this.d = new h(MMPEnvHelper.getLogger());
        this.e = com.meituan.mmp.lib.download.f.a("mmp-update", this.c);
    }

    public final void a(MMPUpdateConfig mMPUpdateConfig, i iVar, m mVar) {
        Object[] objArr = {mMPUpdateConfig, iVar, mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7e8112a985d73b7af7c19047e3831a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7e8112a985d73b7af7c19047e3831a6");
            return;
        }
        StringBuilder sb = new StringBuilder("prepareMiniApp: ");
        sb.append(mMPUpdateConfig.b);
        sb.append(" downloadType: ");
        sb.append(mMPUpdateConfig.h == 1 ? ", foreground!" : Integer.valueOf(mMPUpdateConfig.h));
        com.meituan.mmp.lib.trace.b.c(sb.toString());
        this.d.a(mMPUpdateConfig, iVar, mVar);
        if (mMPUpdateConfig.h == 1 || mMPUpdateConfig.h == 7) {
            this.f.add(mMPUpdateConfig);
        } else {
            this.g.add(mMPUpdateConfig);
        }
        b();
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc241ca5d1c0b275fd7379162ecfd091", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc241ca5d1c0b275fd7379162ecfd091");
        } else {
            post(new Runnable() { // from class: com.meituan.mmp.lib.update.l.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a0283baa6bb1608d68fdff0d33fc03a2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a0283baa6bb1608d68fdff0d33fc03a2");
                    } else {
                        l.a(l.this);
                    }
                }
            });
        }
    }

    public final void a(@NonNull MMPUpdateConfig mMPUpdateConfig, @NonNull MMPAppProp mMPAppProp, i iVar, m mVar) {
        Object[] objArr = {mMPUpdateConfig, mMPAppProp, iVar, mVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b262bd666701b74ce9548d0628a38bf0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b262bd666701b74ce9548d0628a38bf0");
        } else if (com.meituan.mmp.lib.utils.h.a((List) mMPUpdateConfig.m)) {
        } else {
            this.d.a(mMPUpdateConfig, iVar, mVar);
            a(mMPUpdateConfig, mMPAppProp);
        }
    }

    private void a(@NonNull final MMPUpdateConfig mMPUpdateConfig, @NonNull final MMPAppProp mMPAppProp) {
        Object[] objArr = {mMPUpdateConfig, mMPAppProp};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88077054e20d3a54a89fa46e4d468ccd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88077054e20d3a54a89fa46e4d468ccd");
        } else {
            post(new Runnable() { // from class: com.meituan.mmp.lib.update.l.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "683b22c61ee4c6369c696e703686e89d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "683b22c61ee4c6369c696e703686e89d");
                    } else {
                        l.a(l.this, mMPUpdateConfig, mMPAppProp);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(@NonNull final MMPUpdateConfig mMPUpdateConfig, @NonNull final MMPAppProp mMPAppProp, @NonNull final MMPPackageInfo mMPPackageInfo) {
        Object[] objArr = {mMPUpdateConfig, mMPAppProp, mMPPackageInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebdc76484a1ffa267d04433dbe7a1ab0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebdc76484a1ffa267d04433dbe7a1ab0");
        } else {
            post(new Runnable() { // from class: com.meituan.mmp.lib.update.l.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e1a6df717dcb432b2537be6155445147", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e1a6df717dcb432b2537be6155445147");
                    } else {
                        l.a(l.this, mMPUpdateConfig, mMPAppProp, mMPPackageInfo);
                    }
                }
            });
        }
    }

    @WorkerThread
    private void a(final MMPUpdateConfig mMPUpdateConfig) {
        Object[] objArr = {mMPUpdateConfig};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1ee1614f18c0a0d9d43248403e78bba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1ee1614f18c0a0d9d43248403e78bba");
            return;
        }
        com.meituan.mmp.lib.trace.b.b("MMPUpdateOperator#checkPackageUpdate", mMPUpdateConfig.b + ", type: " + MMPPackageInfo.a(mMPUpdateConfig.h));
        this.h.add(mMPUpdateConfig);
        this.d.a(mMPUpdateConfig, true);
        MMPUpdateCheckService.a(this.c, mMPUpdateConfig, new f() { // from class: com.meituan.mmp.lib.update.l.4
            public static ChangeQuickRedirect a;

            @Override // com.meituan.mmp.lib.update.f
            public final void a(MMPAppProp mMPAppProp) {
                Object[] objArr2 = {mMPAppProp};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "beebe5063e0524c738c407777f70b890", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "beebe5063e0524c738c407777f70b890");
                    return;
                }
                if (DebugHelper.r) {
                    if (bd.a(mMPAppProp.mmpSdk.d, "5.27.5") != -1) {
                        bb.b("基础库版本" + mMPAppProp.mmpSdk.d + "无需替换", new Object[0]);
                    } else {
                        bb.b("替换基础库版本为折叠屏适配 - 5.27.5.20220729214418", new Object[0]);
                        mMPAppProp.mmpSdk = (MMPPackageInfo) com.meituan.mmp.lib.utils.j.b.fromJson("{\"isDioPackage\":true,\"isInner\":false,\"md5\":\"900e41a3c2c5192e2096a3d7b5de2ae7\",\"name\":\"mmp_sdk\",\"pkgType\":1,\"supportTemplateHtml\":true,\"url\":\"https://s3plus.meituan.net/v1/mss_e2821d7f0cfe4ac1bf9202ecf9590e67/cdn-prod/file:b21aadc4/mmpsdk.5.27.5.20220729214418.900e41a3.dio.zip\",\"version\":\"5.27.5.20220729214418\"}", (Class<Object>) MMPPackageInfo.class);
                    }
                }
                l.a(l.this, mMPAppProp, mMPUpdateConfig);
            }

            @Override // com.meituan.mmp.lib.update.f
            public final void a(String str, Exception exc) {
                Object[] objArr2 = {str, exc};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ebbe1c8f1bc9ec387ae11c616eed954a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ebbe1c8f1bc9ec387ae11c616eed954a");
                    return;
                }
                b.a.c("MMPUpdateOperator#checkPackageUpdate failed: " + str);
                h hVar = l.this.d;
                MMPUpdateConfig mMPUpdateConfig2 = mMPUpdateConfig;
                Object[] objArr3 = {mMPUpdateConfig2, str, exc};
                ChangeQuickRedirect changeQuickRedirect3 = h.a;
                if (PatchProxy.isSupport(objArr3, hVar, changeQuickRedirect3, false, "4f53a26fe945d936ba3fd3a55be20934", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, hVar, changeQuickRedirect3, false, "4f53a26fe945d936ba3fd3a55be20934");
                } else {
                    hVar.c.i("MMPUpdateInnerEventManager@onCheckUpdateFailed", exc, mMPUpdateConfig2, str);
                    m mVar = hVar.b.get(mMPUpdateConfig2);
                    if (mVar != null) {
                        mVar.a(str, exc);
                    }
                }
                l.this.d.a(mMPUpdateConfig, null, str, exc);
                l.this.a(mMPUpdateConfig, "check update failed");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a1ad84a8b77966796b29db4f54cb11d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a1ad84a8b77966796b29db4f54cb11d");
        }
        if (TextUtils.isEmpty(str)) {
            return "empty directory";
        }
        File file = new File(str);
        if (file.exists()) {
            StringBuilder sb = new StringBuilder();
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (file2 != null) {
                        if (file2.isDirectory()) {
                            sb.append("D-");
                            sb.append(file2.getName());
                            sb.append(";");
                        } else {
                            sb.append("F-");
                            sb.append(file2.getName());
                            sb.append(";");
                        }
                    }
                }
                return sb.toString();
            }
            return "empty directory";
        }
        return "empty directory";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(MMPUpdateConfig mMPUpdateConfig, MMPAppProp mMPAppProp, MMPPackageInfo mMPPackageInfo) {
        Object[] objArr = {mMPUpdateConfig, mMPAppProp, mMPPackageInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b973697a04c21521456b097eceb232e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b973697a04c21521456b097eceb232e");
            return;
        }
        mMPUpdateConfig.n.add(mMPPackageInfo);
        if (mMPUpdateConfig.m.size() == mMPUpdateConfig.n.size()) {
            this.d.a(mMPUpdateConfig, mMPAppProp, mMPUpdateConfig.m);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MMPUpdateConfig mMPUpdateConfig, MMPAppProp mMPAppProp, MMPPackageInfo mMPPackageInfo, String str, Exception exc) {
        Object[] objArr = {mMPUpdateConfig, mMPAppProp, mMPPackageInfo, str, exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd4a84f9748793ff6918bf47b3f3b1fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd4a84f9748793ff6918bf47b3f3b1fb");
            return;
        }
        com.meituan.mmp.lib.trace.b.b("MMPUpdateOperator#onPackageUpdateFailed", mMPAppProp.appid + " - " + mMPAppProp.appName + " - " + mMPPackageInfo.g + "： " + str);
        this.d.a(mMPUpdateConfig, mMPAppProp, str, exc);
        c(mMPUpdateConfig, mMPAppProp, mMPPackageInfo);
    }

    private void c(MMPUpdateConfig mMPUpdateConfig, MMPAppProp mMPAppProp, MMPPackageInfo mMPPackageInfo) {
        Object[] objArr = {mMPUpdateConfig, mMPAppProp, mMPPackageInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c75621bcf2d99cf523380ab624694d30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c75621bcf2d99cf523380ab624694d30");
            return;
        }
        mMPUpdateConfig.o.add(mMPPackageInfo);
        if (mMPUpdateConfig.o.size() == mMPUpdateConfig.m.size()) {
            if (b(mMPUpdateConfig, mMPAppProp)) {
                a(mMPUpdateConfig, mMPAppProp, mMPUpdateConfig.m, true);
                if (mMPUpdateConfig.h == 3 || mMPUpdateConfig.h == 5 || mMPUpdateConfig.h == 4) {
                    return;
                }
                PackageManageUtil.a(mMPAppProp, true);
                return;
            }
            a(mMPUpdateConfig, "some package is not source ready");
        }
    }

    private boolean b(MMPUpdateConfig mMPUpdateConfig, MMPAppProp mMPAppProp) {
        Object[] objArr = {mMPUpdateConfig, mMPAppProp};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86613fa2b1780845c59ad1f7936cdfc1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86613fa2b1780845c59ad1f7936cdfc1")).booleanValue();
        }
        for (MMPPackageInfo mMPPackageInfo : mMPUpdateConfig.m) {
            if (!mMPPackageInfo.u) {
                return false;
            }
        }
        return true;
    }

    private void a(MMPUpdateConfig mMPUpdateConfig, MMPAppProp mMPAppProp, List<MMPPackageInfo> list, boolean z) {
        Object[] objArr = {mMPUpdateConfig, mMPAppProp, list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e59215c6f2993f428b58581db94481f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e59215c6f2993f428b58581db94481f");
            return;
        }
        com.meituan.mmp.lib.trace.b.b("MMPUpdateOperator#onAppUpdateSuccess", mMPAppProp.appid + " - " + mMPAppProp.appName);
        if (z) {
            c(mMPUpdateConfig, mMPAppProp);
        }
        ArrayList<MMPPackageInfo> arrayList = new ArrayList<>(list);
        arrayList.remove(mMPAppProp.mainPackage);
        arrayList.remove(mMPAppProp.mmpSdk);
        this.d.a(mMPUpdateConfig, mMPAppProp, arrayList);
        b(mMPUpdateConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MMPUpdateConfig mMPUpdateConfig, String str) {
        Object[] objArr = {mMPUpdateConfig, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39fe959061439177e1fdec2908585f9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39fe959061439177e1fdec2908585f9a");
            return;
        }
        com.meituan.mmp.lib.trace.b.b("MMPUpdateOperator#onAppUpdateFailed", mMPUpdateConfig.b + ": " + str);
        b(mMPUpdateConfig);
    }

    private void b(MMPUpdateConfig mMPUpdateConfig) {
        Object[] objArr = {mMPUpdateConfig};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "265862b7da804fb24f6f11b622f59fd2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "265862b7da804fb24f6f11b622f59fd2");
            return;
        }
        this.h.remove(mMPUpdateConfig);
        b();
    }

    private void c(MMPUpdateConfig mMPUpdateConfig, MMPAppProp mMPAppProp) {
        Object[] objArr = {mMPUpdateConfig, mMPAppProp};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24eadf26ae36149ed6ca3d42fdb6ab5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24eadf26ae36149ed6ca3d42fdb6ab5d");
        } else if (mMPUpdateConfig.i && mMPAppProp.mainPackage.u && mMPAppProp.mmpSdk.u) {
            if (mMPUpdateConfig.a()) {
                o.a(this.c, mMPAppProp, false, false, !t.b(mMPAppProp.appid));
            } else if (t.c(mMPAppProp.appid)) {
                o.a(this.c, mMPAppProp, false, true, false);
            } else {
                o.a(this.c, mMPAppProp, false, true, true);
            }
        }
    }
}
