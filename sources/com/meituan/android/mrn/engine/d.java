package com.meituan.android.mrn.engine;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.mrn.update.ResponseBundle;
import com.meituan.android.mrn.update.ResponseDeleteBundleInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d {
    public static ChangeQuickRedirect a;
    static com.meituan.android.mrn.update.k b;
    private Context c;
    private ExecutorService d;
    private com.meituan.android.mrn.update.i e;

    public d(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c599db6e5797930f329610137aac52de", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c599db6e5797930f329610137aac52de");
            return;
        }
        this.e = new com.meituan.android.mrn.update.i() { // from class: com.meituan.android.mrn.engine.d.4
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.mrn.update.i
            public final void a(boolean z, List<ResponseBundle> list, List<ResponseDeleteBundleInfo> list2) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), list, list2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "71fc1480cc1684da53ac49a0de9e1c25", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "71fc1480cc1684da53ac49a0de9e1c25");
                } else if (list2 != null && list2.size() != 0) {
                    com.meituan.android.mrn.utils.p.a("[MRNBackgroundWorker@onFetchUpdateInfoSuccess]", "MRNBackgroundWorker:onFetchUpdateInfoSuccess");
                    for (ResponseDeleteBundleInfo responseDeleteBundleInfo : list2) {
                        if (a(list, responseDeleteBundleInfo)) {
                            com.facebook.common.logging.a.b("[MRNBackgroundWorker@onFetchUpdateInfoSuccess]", "deleteBundle: " + responseDeleteBundleInfo.name + StringUtil.SPACE + responseDeleteBundleInfo.version);
                            com.meituan.android.mrn.monitor.g.a().a(responseDeleteBundleInfo.name, responseDeleteBundleInfo.version, 0, true);
                            e bundle = MRNBundleManager.sharedInstance().getBundle(responseDeleteBundleInfo.name, responseDeleteBundleInfo.version);
                            if (bundle != null) {
                                MRNBundleManager.sharedInstance().removeBundleAndInstance(bundle, true);
                            }
                        }
                    }
                }
            }

            private boolean a(List<ResponseBundle> list, ResponseDeleteBundleInfo responseDeleteBundleInfo) {
                Object[] objArr2 = {list, responseDeleteBundleInfo};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "17b7168717d56bbfc44f5192003ade26", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "17b7168717d56bbfc44f5192003ade26")).booleanValue();
                }
                if (responseDeleteBundleInfo == null || MRNBundleManager.BASE_BUNDLE_NAME.equals(responseDeleteBundleInfo.name)) {
                    if (responseDeleteBundleInfo != null) {
                        com.meituan.android.mrn.monitor.g.a().a(responseDeleteBundleInfo.name, responseDeleteBundleInfo.version, 1, true);
                    }
                    return false;
                }
                e a2 = x.a().a(responseDeleteBundleInfo.name, responseDeleteBundleInfo.version);
                if (a2 == null || a2.g()) {
                    com.meituan.android.mrn.monitor.g.a().a(responseDeleteBundleInfo.name, responseDeleteBundleInfo.version, 2, true);
                    return false;
                } else if (MRNBundleManager.sharedInstance().isAssetsBundle(responseDeleteBundleInfo.name, responseDeleteBundleInfo.version)) {
                    e a3 = x.a().a(responseDeleteBundleInfo.name);
                    if (a3 == null || com.meituan.android.mrn.utils.e.a(a3.f, responseDeleteBundleInfo.version) <= 0) {
                        if (list != null) {
                            Iterator<ResponseBundle> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                ResponseBundle next = it.next();
                                if (TextUtils.equals(next.name, responseDeleteBundleInfo.name)) {
                                    if (com.meituan.android.mrn.utils.e.a(next.version, responseDeleteBundleInfo.version) > 0) {
                                        return true;
                                    }
                                }
                            }
                        }
                        com.meituan.android.mrn.monitor.g.a().a(responseDeleteBundleInfo.name, responseDeleteBundleInfo.version, 3, true);
                        return false;
                    }
                    return true;
                } else {
                    return true;
                }
            }
        };
        this.c = context.getApplicationContext();
        this.d = com.sankuai.android.jarvis.c.c("mrn-Worker");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b5 A[Catch: all -> 0x01c5, TryCatch #0 {, blocks: (B:4:0x0002, B:6:0x0015, B:9:0x001a, B:11:0x001e, B:14:0x0025, B:16:0x004e, B:59:0x014c, B:61:0x0165, B:66:0x0174, B:68:0x01af, B:71:0x01b4, B:63:0x016b, B:65:0x016f, B:17:0x0053, B:19:0x006a, B:49:0x00f3, B:51:0x0108, B:52:0x010c, B:55:0x0115, B:57:0x011d, B:58:0x0121, B:21:0x0073, B:38:0x00ae, B:40:0x00b5, B:42:0x00cd, B:43:0x00d4, B:46:0x00dc, B:28:0x008c, B:31:0x0097, B:34:0x00a2), top: B:77:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void a() {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.mrn.engine.d.a():void");
    }
}
