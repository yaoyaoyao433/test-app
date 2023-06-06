package com.sankuai.waimai.lottie;

import android.os.SystemClock;
import com.meituan.android.cipstorage.q;
import com.meituan.android.singleton.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.CollectionUtils;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.ar;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.foundation.utils.k;
import com.sankuai.waimai.lottie.b;
import com.sankuai.waimai.platform.capacity.log.a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import rx.functions.g;
import rx.j;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a;
    private static volatile d b = new d();
    private final DownloadService c;
    private ThreadPoolExecutor d;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "229b5bf06700fa360377eb801d0c48aa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "229b5bf06700fa360377eb801d0c48aa");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        this.c = (DownloadService) (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "57fe1e7e6d89df0d3f437fb56694428d", RobustBitConfig.DEFAULT_VALUE) ? (ar) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "57fe1e7e6d89df0d3f437fb56694428d") : new ar.a().a("http://msstestdn.sankuai.com/").a(i.a("defaultokhttp")).a(com.sankuai.meituan.retrofit2.adapter.rxjava.f.a()).a()).a(DownloadService.class);
        this.d = com.sankuai.android.jarvis.c.a("WM-Lottie", 0, 4, 60L, TimeUnit.SECONDS, new SynchronousQueue());
    }

    public static d a() {
        return b;
    }

    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "239f47505829afb490257c9c5da3edf0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "239f47505829afb490257c9c5da3edf0");
        } else if (str != null) {
            Map map = (Map) k.a().fromJson(str, (Class<Object>) Map.class);
            ArrayList arrayList = new ArrayList();
            if (map != null && !map.isEmpty()) {
                for (Map.Entry entry : map.entrySet()) {
                    LottieResItem lottieResItem = new LottieResItem();
                    lottieResItem.key = (String) entry.getKey();
                    lottieResItem.value = (String) entry.getValue();
                    lottieResItem.md5 = (String) entry.getValue();
                }
            }
            a(arrayList, str2);
        }
    }

    public final void a(List<String> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9498ed5da4c4c308cc0ac380b957a291", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9498ed5da4c4c308cc0ac380b957a291");
        } else if (CollectionUtils.isEmpty(list)) {
        } else {
            b.a().a(list);
        }
    }

    public final void a(List<LottieResItem> list, String str) {
        char c = 2;
        char c2 = 1;
        Object[] objArr = {list, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0c88e254cfa69b7ced88ae138ae35d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0c88e254cfa69b7ced88ae138ae35d9");
            return;
        }
        final q a2 = q.a(com.meituan.android.singleton.b.a, str, 1);
        HashMap hashMap = new HashMap();
        if (!CollectionUtils.isEmpty(list)) {
            for (LottieResItem lottieResItem : list) {
                if (!a2.a(lottieResItem.key) || (!aa.a(lottieResItem.md5) && !lottieResItem.md5.equals(a2.b(lottieResItem.key, "")))) {
                    com.sankuai.waimai.foundation.utils.log.a.b("Lottie", "Lottie未命中缓存，正在准备下载", new Object[0]);
                    hashMap.put(lottieResItem.key, lottieResItem.value);
                    b.a().a(lottieResItem.key).a();
                    final String str2 = lottieResItem.key;
                    final String str3 = lottieResItem.value;
                    final String str4 = lottieResItem.md5;
                    Object[] objArr2 = new Object[4];
                    objArr2[0] = str2;
                    objArr2[c2] = str3;
                    objArr2[c] = str4;
                    objArr2[3] = a2;
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "467ea05b62b2c8d853a63d2e2add0f2f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "467ea05b62b2c8d853a63d2e2add0f2f");
                    } else if (str3 != null) {
                        final b.a a3 = b.a().a(str2);
                        rx.d.a(new j<b.a>() { // from class: com.sankuai.waimai.lottie.d.1
                            public static ChangeQuickRedirect a;

                            @Override // rx.e
                            public final /* bridge */ /* synthetic */ void onNext(Object obj) {
                            }

                            @Override // rx.e
                            public final void onCompleted() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2eee01a59a4169872cfc2cc00c63d1db", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2eee01a59a4169872cfc2cc00c63d1db");
                                } else {
                                    com.sankuai.waimai.platform.capacity.log.c.a().a(0, "lottie/download", SystemClock.elapsedRealtime());
                                }
                            }

                            @Override // rx.e
                            public final void onError(Throwable th) {
                                Object[] objArr3 = {th};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b420120dd80b9b86e348d3ae5915bb9a", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b420120dd80b9b86e348d3ae5915bb9a");
                                    return;
                                }
                                th.printStackTrace();
                                com.sankuai.waimai.platform.capacity.log.c.a().a(1, "lottie/download", SystemClock.elapsedRealtime());
                                a.AbstractC1040a c3 = new f().a("lottie/download").b("lottie/download").c("zip_download_failed");
                                com.sankuai.waimai.platform.capacity.log.i.d(c3.d(str2 + str3).b());
                            }
                        }, this.c.downloadFile(str3).b(rx.schedulers.a.a(this.d)).d(new g<ap, b.a>() { // from class: com.sankuai.waimai.lottie.d.2
                            public static ChangeQuickRedirect a;

                            /* JADX INFO: Access modifiers changed from: private */
                            @Override // rx.functions.g
                            /* renamed from: a */
                            public b.a call(ap apVar) {
                                ZipInputStream zipInputStream;
                                Object[] objArr3 = {apVar};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "21cc456a04a45ecd23fb97b0d8107e49", RobustBitConfig.DEFAULT_VALUE)) {
                                    return (b.a) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "21cc456a04a45ecd23fb97b0d8107e49");
                                }
                                ZipInputStream zipInputStream2 = null;
                                if (apVar == null) {
                                    return null;
                                }
                                b.a aVar = a3;
                                InputStream source = apVar.source();
                                Object[] objArr4 = {source};
                                ChangeQuickRedirect changeQuickRedirect4 = b.a.a;
                                if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "f6223c42fdae0b0a343284f572ebfc56", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "f6223c42fdae0b0a343284f572ebfc56");
                                } else {
                                    try {
                                        try {
                                            if (source != null) {
                                                try {
                                                    if (!aVar.c.exists()) {
                                                        aVar.c.mkdirs();
                                                    }
                                                    zipInputStream = new ZipInputStream(source);
                                                    while (true) {
                                                        try {
                                                            ZipEntry nextEntry = zipInputStream.getNextEntry();
                                                            if (nextEntry == null) {
                                                                break;
                                                            }
                                                            String name = nextEntry.getName();
                                                            if (!name.contains("../") && !name.contains("__MACOSX") && !name.contains("DS_Store")) {
                                                                File file = new File(aVar.c, name);
                                                                if (nextEntry.isDirectory()) {
                                                                    file.mkdirs();
                                                                } else {
                                                                    FileOutputStream fileOutputStream = new FileOutputStream(file, false);
                                                                    byte[] bArr = new byte[1024];
                                                                    while (true) {
                                                                        int read = zipInputStream.read(bArr);
                                                                        if (read <= 0) {
                                                                            break;
                                                                        }
                                                                        fileOutputStream.write(bArr, 0, read);
                                                                    }
                                                                    fileOutputStream.close();
                                                                }
                                                            }
                                                        } catch (IOException e) {
                                                            e = e;
                                                            zipInputStream2 = zipInputStream;
                                                            e.printStackTrace();
                                                            if (zipInputStream2 != null) {
                                                                zipInputStream2.close();
                                                            }
                                                            a2.a(str2, str4);
                                                            com.sankuai.waimai.foundation.utils.log.a.b("Lottie", "Lottie文件下载完成：" + str2, new Object[0]);
                                                            return a3;
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            if (zipInputStream != null) {
                                                                try {
                                                                    zipInputStream.close();
                                                                } catch (IOException e2) {
                                                                    e2.printStackTrace();
                                                                }
                                                            }
                                                            throw th;
                                                        }
                                                    }
                                                    zipInputStream.close();
                                                } catch (IOException e3) {
                                                    e = e3;
                                                }
                                            }
                                        } catch (IOException e4) {
                                            e4.printStackTrace();
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        zipInputStream = null;
                                    }
                                }
                                a2.a(str2, str4);
                                com.sankuai.waimai.foundation.utils.log.a.b("Lottie", "Lottie文件下载完成：" + str2, new Object[0]);
                                return a3;
                            }
                        }));
                    }
                } else if (!aa.a(lottieResItem.md5) && lottieResItem.md5.equals(a2.b(lottieResItem.key, ""))) {
                    com.sankuai.waimai.foundation.utils.log.a.b("Lottie", "Lottie命中缓存，无需下载", new Object[0]);
                    hashMap.put(lottieResItem.key, lottieResItem.value);
                }
                c = 2;
                c2 = 1;
            }
        }
        try {
            List<String> arrayList = new ArrayList<>();
            Map<String, ?> b2 = a2.b();
            if (b2 == null || b2.isEmpty()) {
                return;
            }
            for (Map.Entry<String, ?> entry : b2.entrySet()) {
                if (CollectionUtils.isEmpty(list) || !hashMap.containsKey(entry.getKey()) || aa.a((String) hashMap.get(entry.getKey()))) {
                    a2.b(entry.getKey());
                    arrayList.add(entry.getKey());
                }
            }
            a(arrayList);
        } catch (Exception e) {
            e.printStackTrace();
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
    }
}
