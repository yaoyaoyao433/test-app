package com.sankuai.xm.im.transfer.download;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.dianping.titans.js.JsBridgeResult;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.service.l;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.base.trace.j;
import com.sankuai.xm.base.util.b;
import com.sankuai.xm.base.util.k;
import com.sankuai.xm.file.a;
import com.sankuai.xm.file.bean.StatisticEntry;
import com.sankuai.xm.file.bean.TransferContext;
import com.sankuai.xm.im.IMClient;
import com.sankuai.xm.im.message.bean.MessageStatisticsEntry;
import com.sankuai.xm.monitor.cat.c;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes6.dex */
public class DownloadManager extends com.sankuai.xm.im.transfer.a implements com.sankuai.xm.file.transfer.d {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static DownloadManager sInstance;
    private HashMap<Integer, Boolean> mAutoDownloadType;
    private b mCurrentMap;
    private final Object mLocker;
    private com.sankuai.xm.file.transfer.b mTransferManager;
    private List<d> mWaitQueue;

    public DownloadManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9f32c4d43e3a75472a18991868f6bed6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9f32c4d43e3a75472a18991868f6bed6");
            return;
        }
        this.mWaitQueue = new ArrayList();
        this.mCurrentMap = new b();
        this.mTransferManager = a.C1381a.a.c;
        this.mTransferManager.a(this);
        this.mLocker = new Object();
        this.mAutoDownloadType = new HashMap<>();
    }

    @Keep
    public static DownloadManager getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6db1dfe46f1088bf07be3903fd16d6e7", 6917529027641081856L)) {
            return (DownloadManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6db1dfe46f1088bf07be3903fd16d6e7");
        }
        if (sInstance == null) {
            synchronized (DownloadManager.class) {
                if (sInstance == null) {
                    sInstance = new DownloadManager();
                }
            }
        }
        return sInstance;
    }

    @Keep
    public void addDownload(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ccc814e266fd264cf941cc9200160e03", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ccc814e266fd264cf941cc9200160e03");
            return;
        }
        try {
            com.sankuai.xm.im.utils.a.b("DownloadManager::addDownload => retry %d, request url: %s, request path: %s", Integer.valueOf(dVar.d), dVar.g, dVar.h);
            if (!TextUtils.isEmpty(dVar.g) && !TextUtils.isEmpty(dVar.h)) {
                synchronized (this.mLocker) {
                    d contains = contains(dVar.g);
                    if (contains == null && !this.mCurrentMap.b(dVar.g)) {
                        this.mWaitQueue.add(dVar);
                    } else if (contains != null && dVar.e == 1) {
                        contains.e = 1;
                    }
                }
                startDownload();
                return;
            }
            com.sankuai.xm.im.utils.a.d("DownloadManager::download => param error, request url: %s, local path: %s", dVar.g, dVar.h);
            notifyFailed(dVar.g == null ? "" : dVar.g, dVar.h == null ? "" : dVar.h, 10011, "download Error");
        } catch (Exception e) {
            com.sankuai.xm.im.utils.a.a(e);
        }
    }

    @Keep
    public void stop(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aab630cb4251066869713376bf79560e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aab630cb4251066869713376bf79560e");
            return;
        }
        com.sankuai.xm.im.utils.a.b("DownloadManager::stop => request url: %s", str);
        this.mTransferManager.b(str);
        synchronized (this.mLocker) {
            d contains = contains(str);
            if (contains != null) {
                this.mWaitQueue.remove(contains);
            }
            this.mCurrentMap.a(str);
        }
    }

    @Keep
    public void registerListener(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5eee968efe8893fb003549091d935cf2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5eee968efe8893fb003549091d935cf2");
        } else {
            ((l) m.a(l.class)).a(c.class).a((l.a) cVar);
        }
    }

    @Keep
    public void unregisterListener(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "67a7a86096adf3da7eeb36926e10f3b2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "67a7a86096adf3da7eeb36926e10f3b2");
        } else {
            ((l) m.a(l.class)).a(c.class).b(cVar);
        }
    }

    private e getDownloadStrategy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b070f318feaaf57bb02144612e5b5e09", 6917529027641081856L)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b070f318feaaf57bb02144612e5b5e09");
        }
        switch (com.sankuai.xm.base.util.net.d.c(IMClient.a().f())) {
            case -1:
            case 0:
            case 2:
            case 3:
            case 4:
                return f.c();
            case 1:
            default:
                return g.c();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ea, code lost:
        r3 = r15.mLocker;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ec, code lost:
        monitor-enter(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ed, code lost:
        r2 = r15.mWaitQueue.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f3, code lost:
        if (r2 <= 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f5, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f7, code lost:
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f8, code lost:
        monitor-exit(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f9, code lost:
        if (r4 == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x010a, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0119, code lost:
        if (r15.mCurrentMap.b(r4.g) == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x011b, code lost:
        com.sankuai.xm.im.utils.a.b("DownloadManager::startDownload => mCurrentMap contains url", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0123, code lost:
        r3 = r15.mLocker;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0125, code lost:
        monitor-enter(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0126, code lost:
        monitor-exit(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0127, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void startDownload() {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.im.transfer.download.DownloadManager.startDownload():void");
    }

    private boolean checkExists(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aaaebf9ecf29a131b10139edcc674303", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aaaebf9ecf29a131b10139edcc674303")).booleanValue();
        }
        if (k.o(str)) {
            if (k.p(str) == 0) {
                k.t(str);
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // com.sankuai.xm.file.transfer.d
    public void onStateChanged(TransferContext transferContext, int i) {
        d b;
        Object[] objArr = {transferContext, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "80835f03830065e8236d98d983eaba62", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "80835f03830065e8236d98d983eaba62");
        } else if (transferContext.getTransferType() == 1) {
            synchronized (this.mLocker) {
                b = this.mCurrentMap.b(transferContext.getTaskId());
                if (i == 7 || i == 5) {
                    b = this.mCurrentMap.a(transferContext.getTaskId());
                    startDownload();
                }
            }
            if (b != null) {
                com.sankuai.xm.im.utils.a.b("DownloadManager::onStateChanged => task id: %s, state: %d, url: %s", Integer.valueOf(transferContext.getTaskId()), Integer.valueOf(i), b.g);
                notifyStatusChange(transferContext.getFileInfo().getUrl(), transferContext.getLocalPath(), i);
                if (i == 7) {
                    notifySuccess(transferContext.getFileInfo().getUrl(), transferContext.getLocalPath());
                    downloadEventRecord(b, transferContext);
                }
            }
        }
    }

    @Override // com.sankuai.xm.file.transfer.d
    public void onProgress(TransferContext transferContext, double d, double d2) {
        d b;
        Object[] objArr = {transferContext, Double.valueOf(d), Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6ded56a3ce48a41b9848957e2ce43073", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6ded56a3ce48a41b9848957e2ce43073");
        } else if (transferContext.getTransferType() == 1) {
            synchronized (this.mLocker) {
                b = this.mCurrentMap.b(transferContext.getTaskId());
            }
            if (b != null) {
                notifyProgress(transferContext.getFileInfo().getUrl(), transferContext.getLocalPath(), (int) ((100.0d * d) / d2));
            }
        }
    }

    @Override // com.sankuai.xm.file.transfer.d
    public void onError(TransferContext transferContext, int i, String str) {
        final d a;
        Object[] objArr = {transferContext, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "50538e774be518d3caa5b6cb7459933e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "50538e774be518d3caa5b6cb7459933e");
        } else if (transferContext.getTransferType() == 1) {
            synchronized (this.mLocker) {
                a = this.mCurrentMap.a(transferContext.getTaskId());
                startDownload();
            }
            if (a != null) {
                com.sankuai.xm.im.utils.a.d("DownloadManager::onError => task id: %s, state: %s, retry: %s, url: %s", Integer.valueOf(transferContext.getTaskId()), 6, Integer.valueOf(a.d), a.g);
                if (a.d >= 2 || !a.i || transferContext.getServerResCode() > 0) {
                    notifyFailed(transferContext.getFileInfo().getUrl(), transferContext.getLocalPath(), i, str);
                    downloadEventRecord(a, transferContext);
                    return;
                }
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = d.a;
                if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect3, false, "a817cee4171b2e7a2d973d744a77e4f5", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect3, false, "a817cee4171b2e7a2d973d744a77e4f5");
                } else {
                    a.d++;
                }
                com.sankuai.xm.threadpool.scheduler.a.b().b(j.a(new Runnable() { // from class: com.sankuai.xm.im.transfer.download.DownloadManager.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "9c18ee73c7b2b06efaa9bfebd9c1e769", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "9c18ee73c7b2b06efaa9bfebd9c1e769");
                        } else {
                            DownloadManager.this.addDownload(a);
                        }
                    }
                }), a.a[a.d]);
            }
        }
    }

    private void notifySuccess(final String str, final String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c7b09938e361f1d6ed85748b68e3eaba", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c7b09938e361f1d6ed85748b68e3eaba");
        } else {
            ((l) m.a(l.class)).b(c.class).a(new b.a<c>() { // from class: com.sankuai.xm.im.transfer.download.DownloadManager.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.util.b.a
                public final /* synthetic */ boolean a(c cVar) {
                    c cVar2 = cVar;
                    Object[] objArr2 = {cVar2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0808e405031b936ea6b31dbe1237304c", 6917529027641081856L)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0808e405031b936ea6b31dbe1237304c")).booleanValue();
                    }
                    cVar2.a(str, str2);
                    return false;
                }
            });
        }
    }

    private void notifyStatusChange(final String str, final String str2, final int i) {
        Object[] objArr = {str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "889992c6f9847943c86b6ec563b93d3b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "889992c6f9847943c86b6ec563b93d3b");
        } else {
            ((l) m.a(l.class)).b(c.class).a(new b.a<c>() { // from class: com.sankuai.xm.im.transfer.download.DownloadManager.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.util.b.a
                public final /* synthetic */ boolean a(c cVar) {
                    Object[] objArr2 = {cVar};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f59caddf155a3f85285bdcc88d8546d9", 6917529027641081856L)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f59caddf155a3f85285bdcc88d8546d9")).booleanValue();
                    }
                    return false;
                }
            });
        }
    }

    private void notifyProgress(final String str, final String str2, final int i) {
        Object[] objArr = {str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b179b524942149cef5efbbbf4e2e3c09", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b179b524942149cef5efbbbf4e2e3c09");
        } else {
            ((l) m.a(l.class)).b(c.class).a(new b.a<c>() { // from class: com.sankuai.xm.im.transfer.download.DownloadManager.4
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.util.b.a
                public final /* synthetic */ boolean a(c cVar) {
                    c cVar2 = cVar;
                    Object[] objArr2 = {cVar2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2779073ee0219c51105a735e7d075f18", 6917529027641081856L)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2779073ee0219c51105a735e7d075f18")).booleanValue();
                    }
                    cVar2.a(str, str2, i);
                    return false;
                }
            });
        }
    }

    private void notifyFailed(final String str, final String str2, final int i, final String str3) {
        Object[] objArr = {str, str2, Integer.valueOf(i), str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dd6e2acb262dfe0385546fb0edc7f371", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dd6e2acb262dfe0385546fb0edc7f371");
        } else {
            ((l) m.a(l.class)).b(c.class).a(new b.a<c>() { // from class: com.sankuai.xm.im.transfer.download.DownloadManager.5
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.util.b.a
                public final /* synthetic */ boolean a(c cVar) {
                    c cVar2 = cVar;
                    Object[] objArr2 = {cVar2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7c9736f1e322418f5cfdb7a087887d82", 6917529027641081856L)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7c9736f1e322418f5cfdb7a087887d82")).booleanValue();
                    }
                    cVar2.a(str, str2, i, str3);
                    return false;
                }
            });
        }
    }

    private boolean checkIsBase64(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d60caae576e4c289039b8a100138999d", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d60caae576e4c289039b8a100138999d")).booleanValue() : !TextUtils.isEmpty(str) && str.startsWith("data:image");
    }

    private d contains(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9355f58485c8102edfe96920d9a162b0", 6917529027641081856L)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9355f58485c8102edfe96920d9a162b0");
        }
        synchronized (this.mLocker) {
            for (d dVar : this.mWaitQueue) {
                if (TextUtils.equals(str, dVar.g)) {
                    return dVar;
                }
            }
            return null;
        }
    }

    private void reportToCat(StatisticEntry statisticEntry) {
        Object[] objArr = {statisticEntry};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ade070b094019872fc57b3604a7698e3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ade070b094019872fc57b3604a7698e3");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("code", Integer.valueOf(statisticEntry.bizCode));
        hashMap.put(IjkMediaPlayer.OnNativeInvokeListener.ARG_HTTP_CODE, Integer.valueOf(statisticEntry.httpCode));
        hashMap.put("url", StatisticEntry.DOWNLOAD_URL);
        hashMap.put("time", Long.valueOf(statisticEntry.taskEndTime > statisticEntry.taskStartTime ? statisticEntry.taskEndTime - statisticEntry.taskStartTime : 0L));
        if (!TextUtils.isEmpty(statisticEntry.msg)) {
            hashMap.put("extraData", statisticEntry.msg);
        }
        c.a.a.a(hashMap);
    }

    public void cancelAutoDownload(Set<Integer> set) {
        Object[] objArr = {set};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0e0224026550868e32f04859b7693e91", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0e0224026550868e32f04859b7693e91");
            return;
        }
        for (Integer num : set) {
            this.mAutoDownloadType.put(num, Boolean.FALSE);
        }
    }

    public boolean isAutoDownload(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "15ad753d0f21ecadc3afee11812426b8", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "15ad753d0f21ecadc3afee11812426b8")).booleanValue();
        }
        Boolean bool = this.mAutoDownloadType.get(Integer.valueOf(i));
        if (bool == null) {
            return true;
        }
        return bool.booleanValue();
    }

    private boolean download(d dVar) {
        int intValue;
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c4753778c9272127f609d0fab443c5d7", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c4753778c9272127f609d0fab443c5d7")).booleanValue();
        }
        if (k.d(dVar.h)) {
            notifyFailed(dVar.g, dVar.h, 10011, "download Error");
            com.sankuai.xm.im.utils.a.d("DownloadManager::download => not download dir, request url: %s", dVar.g);
            return true;
        } else if (checkExists(dVar.h)) {
            com.sankuai.xm.im.utils.a.b("DownloadManager::download => file has exist, request url: %s", dVar.g);
            notifySuccess(dVar.g, dVar.h);
            return true;
        } else {
            if (dVar.c == 2 && checkIsBase64(dVar.g)) {
                com.sankuai.xm.im.utils.a.b("DownloadManager::download => picUrlIsBASE64, request url: %s", dVar.g);
                if (com.sankuai.xm.file.util.c.b(dVar.g, dVar.h) && k.o(dVar.h)) {
                    notifySuccess(dVar.g, dVar.h);
                    return true;
                }
            }
            synchronized (this.mLocker) {
                int i = dVar.c;
                if (i == 2) {
                    com.sankuai.xm.file.transfer.b bVar = this.mTransferManager;
                    String str = dVar.h;
                    String str2 = dVar.g;
                    String str3 = dVar.j;
                    Object[] objArr2 = {-1L, str, str2, str3};
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.xm.file.transfer.b.a;
                    intValue = PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect3, false, "2a28d0f9418db22fc8fc6e92d780972c", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect3, false, "2a28d0f9418db22fc8fc6e92d780972c")).intValue() : bVar.a("", -1L, str, "", str2, str3);
                } else {
                    switch (i) {
                        case 4:
                            com.sankuai.xm.file.transfer.b bVar2 = this.mTransferManager;
                            String str4 = dVar.h;
                            String str5 = dVar.g;
                            String str6 = dVar.j;
                            Object[] objArr3 = {-1L, str4, str5, str6};
                            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.xm.file.transfer.b.a;
                            if (!PatchProxy.isSupport(objArr3, bVar2, changeQuickRedirect4, false, "00afef1535386fb785f14bd81d90ed58", 6917529027641081856L)) {
                                intValue = bVar2.c("", -1L, str4, "", str5, str6);
                                break;
                            } else {
                                intValue = ((Integer) PatchProxy.accessDispatch(objArr3, bVar2, changeQuickRedirect4, false, "00afef1535386fb785f14bd81d90ed58")).intValue();
                                break;
                            }
                        case 5:
                            com.sankuai.xm.file.transfer.b bVar3 = this.mTransferManager;
                            String str7 = dVar.h;
                            String str8 = dVar.g;
                            String str9 = dVar.j;
                            Object[] objArr4 = {-1L, str7, str8, str9};
                            ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.xm.file.transfer.b.a;
                            if (!PatchProxy.isSupport(objArr4, bVar3, changeQuickRedirect5, false, "98f747d0d407f98f16c213ea6f063fce", 6917529027641081856L)) {
                                intValue = bVar3.d("", -1L, str7, "", str8, str9);
                                break;
                            } else {
                                intValue = ((Integer) PatchProxy.accessDispatch(objArr4, bVar3, changeQuickRedirect5, false, "98f747d0d407f98f16c213ea6f063fce")).intValue();
                                break;
                            }
                        default:
                            com.sankuai.xm.file.transfer.b bVar4 = this.mTransferManager;
                            String str10 = dVar.h;
                            String str11 = dVar.g;
                            String str12 = dVar.j;
                            Object[] objArr5 = {-1L, str10, str11, str12};
                            ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.xm.file.transfer.b.a;
                            if (!PatchProxy.isSupport(objArr5, bVar4, changeQuickRedirect6, false, "e836c357b72b2023b6d0375bc5ebf33a", 6917529027641081856L)) {
                                intValue = bVar4.b("", -1L, str10, "", str11, str12);
                                break;
                            } else {
                                intValue = ((Integer) PatchProxy.accessDispatch(objArr5, bVar4, changeQuickRedirect6, false, "e836c357b72b2023b6d0375bc5ebf33a")).intValue();
                                break;
                            }
                    }
                }
                com.sankuai.xm.im.utils.a.b("DownloadManager::download => task id:%d, retry:%d, url:%s", Integer.valueOf(intValue), Integer.valueOf(dVar.d), dVar.g);
                if (intValue < 0 && intValue == -1) {
                    com.sankuai.xm.im.utils.a.d("DownloadManager::download => download error or TASK_CONFLICT , request url: %s, ret: %d", dVar.g, Integer.valueOf(intValue));
                    TransferContext c = this.mTransferManager.c(dVar.h);
                    if (c != null) {
                        intValue = c.getTaskId();
                    }
                }
                if (intValue > 0) {
                    com.sankuai.xm.im.utils.a.b("DownloadManager::download => download ok, request url: %s, ret: %d", dVar.g, Integer.valueOf(intValue));
                    if (this.mCurrentMap.b(intValue) == null) {
                        this.mCurrentMap.a(intValue, dVar);
                        startDownload();
                    }
                    return false;
                }
                notifyFailed(dVar.g, dVar.h, -1, "download Error");
                com.sankuai.xm.im.utils.a.d("DownloadManager::download => download failed, requestUrl: %s, errorCode: %d", dVar.g, Integer.valueOf(intValue));
                return true;
            }
        }
    }

    private void downloadEventRecord(d dVar, TransferContext transferContext) {
        Object[] objArr = {dVar, transferContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1a5cec2f3ee85def0bac125a6aebda89", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1a5cec2f3ee85def0bac125a6aebda89");
        } else if (TextUtils.isEmpty(dVar.g)) {
        } else {
            StatisticEntry statisticEntry = transferContext.getStatisticEntry();
            try {
                HashMap hashMap = new HashMap();
                String n = k.n(dVar.h);
                long p = k.o(dVar.h) ? k.p(dVar.h) : 0L;
                hashMap.put("name", n);
                hashMap.put(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE, Long.valueOf(p));
                hashMap.put("type", Integer.valueOf(transferContext.getTaskType()));
                hashMap.put("time", Long.valueOf(statisticEntry.taskEndTime > statisticEntry.taskStartTime ? statisticEntry.taskEndTime - statisticEntry.taskStartTime : 0L));
                hashMap.put("code", Integer.valueOf(statisticEntry.httpCode));
                hashMap.put("msg", statisticEntry.msg);
                hashMap.put("net", Integer.valueOf(com.sankuai.xm.base.util.net.d.c(IMClient.a().f())));
                hashMap.put(MessageStatisticsEntry.PARAM_RETRY, Integer.valueOf(dVar.d));
                hashMap.put("result", Integer.valueOf(statisticEntry.bizCode));
                hashMap.put("url", statisticEntry.url);
                hashMap.put(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP, statisticEntry.localIP);
                hashMap.put("status", Boolean.valueOf(statisticEntry.useCdn));
                com.sankuai.xm.monitor.c.a("imdownload", hashMap);
                reportToCat(statisticEntry);
            } catch (Exception e) {
                com.sankuai.xm.im.utils.a.a(e);
            }
        }
    }
}
