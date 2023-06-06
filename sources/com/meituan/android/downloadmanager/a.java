package com.meituan.android.downloadmanager;

import android.content.Context;
import android.os.RemoteException;
import android.support.constraint.R;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.android.downloadmanager.MultiDownloadService;
import com.meituan.android.downloadmanager.model.DownloadException;
import com.meituan.android.downloadmanager.model.DownloadStateData;
import com.meituan.android.downloadmanager.model.Request;
import com.meituan.android.downloadmanager.retrofit.DownloadInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.NetWorkUtils;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.q;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.SocketTimeoutException;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a implements Runnable {
    public static ChangeQuickRedirect a;
    Call<ap> b;
    boolean c;
    private Request d;
    private MultiDownloadService e;
    private Context f;
    private String g;
    private long h;
    private int i;
    private Gson j;

    public a(Request request, MultiDownloadService multiDownloadService) {
        Object[] objArr = {request, multiDownloadService};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8dfb51ff04b749c72f3b43f7206f383", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8dfb51ff04b749c72f3b43f7206f383");
            return;
        }
        this.d = request;
        this.e = multiDownloadService;
        this.f = multiDownloadService.getApplicationContext();
        this.g = com.meituan.android.downloadmanager.util.c.a(request.f, request.d);
        if (TextUtils.isEmpty(this.g)) {
            this.g = com.meituan.android.downloadmanager.util.c.a(multiDownloadService, request.d);
        }
        this.c = false;
        this.j = new Gson();
    }

    private void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2696a06f894cd8ffc772bdd8ce9763b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2696a06f894cd8ffc772bdd8ce9763b7");
        } else {
            a(i, null);
        }
    }

    private void a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a40e93e5316f2bc5b51b3ee88f508ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a40e93e5316f2bc5b51b3ee88f508ed");
            return;
        }
        this.d.e = i;
        this.e.a(this.d, str);
    }

    @Override // java.lang.Runnable
    public final void run() {
        int a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4880ae5d3c967dd67ca01519465ce86f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4880ae5d3c967dd67ca01519465ce86f");
            return;
        }
        a(3);
        do {
            a2 = a();
            if (a2 <= 0) {
                return;
            }
        } while (a2 <= 5);
    }

    private int a() {
        long j;
        long j2;
        long j3;
        RandomAccessFile randomAccessFile;
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a40602ce63b81cb924555ad2fdb7d1ff", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a40602ce63b81cb924555ad2fdb7d1ff")).intValue();
        }
        DownloadStateData b = b();
        String str = this.d.d;
        if (b != null && b.totalBytes > 0) {
            long j4 = b.totalBytes;
            Object[] objArr2 = {new Long(j4)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b9c9ad7e74b8abb0563dd96db87735c1", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b9c9ad7e74b8abb0563dd96db87735c1")).booleanValue();
            } else {
                if (!TextUtils.isEmpty(this.g)) {
                    File file = new File(this.g);
                    if (file.exists() && j4 == file.length()) {
                        z = true;
                    }
                }
                z = false;
            }
            if (z) {
                if (b.isComplete) {
                    this.h = b.totalBytes;
                    a(5);
                    a(str, 11, "success");
                    a(str, 12, "file exist");
                    this.e.b(str);
                    this.e.a(str, b.totalBytes);
                    this.e.a(str, this.g);
                    return -1;
                }
                this.h = b.breakPointBytes;
            } else {
                this.h = 0L;
            }
        } else {
            this.h = 0L;
        }
        if (NetWorkUtils.getNetworkType("pt-11c77473fa787786", this.f) != 0 && this.d.h == 0) {
            a(2);
            a(str, 13, "wait wifi");
            return -1;
        }
        com.meituan.android.downloadmanager.retrofit.b a2 = com.meituan.android.downloadmanager.retrofit.b.a(this.e);
        String str2 = "bytes=" + this.h + CommonConstant.Symbol.MINUS;
        Map<String, String> map = this.d.g;
        Object[] objArr3 = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.downloadmanager.retrofit.b.a;
        this.b = PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "e9250566ee9eb33f4c70d50bb4879dbd", RobustBitConfig.DEFAULT_VALUE) ? (Call) PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "e9250566ee9eb33f4c70d50bb4879dbd") : ((DownloadInterface) a2.b.a(DownloadInterface.class)).getDownloadBody(str, str2, map);
        try {
            Response<ap> a3 = this.b.a();
            if ((a3.b() != 200 && a3.b() != 206) || a3.e() == null) {
                a(6);
                this.e.b(str);
                StringBuilder sb = new StringBuilder();
                sb.append(a3.b());
                a(str, 14, sb.toString());
                this.e.a(str, new com.meituan.android.downloadmanager.model.a(a3.b() + StringUtil.SPACE + a3.c()));
                return -1;
            }
            if (a(a3.d())) {
                j = 0;
            } else {
                j = 0;
                this.h = 0L;
            }
            if (this.h == j) {
                j2 = b(a3.d());
            } else {
                j2 = b != null ? b.totalBytes : 0L;
            }
            this.e.a(str, j2);
            this.e.a(str, this.h, j2);
            if (this.h <= 0) {
                if (!TextUtils.isEmpty(this.g)) {
                    new File(this.g).delete();
                    new File(com.meituan.android.downloadmanager.util.c.b(this.e, str)).delete();
                }
                RandomAccessFile randomAccessFile2 = null;
                try {
                    randomAccessFile = new RandomAccessFile(this.g, "rwd");
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    randomAccessFile.setLength(j2);
                    this.h = 0L;
                    j3 = j2;
                    a(this.h, j3, false);
                    com.meituan.android.downloadmanager.util.c.a(randomAccessFile);
                } catch (Throwable th2) {
                    th = th2;
                    randomAccessFile2 = randomAccessFile;
                    if (randomAccessFile2 != null) {
                        com.meituan.android.downloadmanager.util.c.a(randomAccessFile2);
                    }
                    throw th;
                }
            } else {
                j3 = j2;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.h);
                a(str, 15, sb2.toString());
                a(this.h, j3, false);
            }
            if (!this.c && !TextUtils.isEmpty(this.g)) {
                a(a3.e(), new File(this.g), this.h, j3);
            }
            return -1;
        } catch (Exception e) {
            if (this.c) {
                a(4);
                a(str, 17, "paused");
                this.e.b(str);
            } else {
                if (this.d.e != 2) {
                    a(6);
                }
                if (this.i < 5) {
                    if (this.b != null) {
                        this.b.cancel();
                    }
                    this.i++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(this.i);
                    a(str, 18, sb3.toString());
                    return this.i;
                }
                this.e.b(str);
                if (e instanceof SocketTimeoutException) {
                    final MultiDownloadService multiDownloadService = this.e;
                    Object[] objArr4 = {str, e};
                    ChangeQuickRedirect changeQuickRedirect4 = MultiDownloadService.a;
                    if (PatchProxy.isSupport(objArr4, multiDownloadService, changeQuickRedirect4, false, "b8c5b48450c787fd721dda97a57a8b12", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, multiDownloadService, changeQuickRedirect4, false, "b8c5b48450c787fd721dda97a57a8b12");
                    } else {
                        multiDownloadService.a(str, new MultiDownloadService.a() { // from class: com.meituan.android.downloadmanager.MultiDownloadService.5
                            public static ChangeQuickRedirect a;

                            @Override // com.meituan.android.downloadmanager.MultiDownloadService.a
                            public final void a(ICallbackService iCallbackService) throws RemoteException {
                                Object[] objArr5 = {iCallbackService};
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "fc509b1a7327d1e43b07257eb22ef3ef", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "fc509b1a7327d1e43b07257eb22ef3ef");
                                } else {
                                    iCallbackService.onLoadTimeOut(new DownloadException(e));
                                }
                            }
                        });
                    }
                } else {
                    this.e.a(str, e);
                }
                a(str, 10, e.getClass().getSimpleName());
            }
            return -1;
        }
    }

    private void a(ap apVar, File file, long j, long j2) throws IOException {
        RandomAccessFile randomAccessFile;
        byte[] bArr;
        long j3 = j;
        Object[] objArr = {apVar, file, new Long(j3), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "356e67d571ff1d8ff781860d4a4153bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "356e67d571ff1d8ff781860d4a4153bf");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.h = j3;
        InputStream source = apVar.source();
        String str = this.d.d;
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            randomAccessFile = new RandomAccessFile(file, "rwd");
            try {
                randomAccessFile.seek(j3);
                byte[] bArr2 = new byte[4096];
                long j4 = currentTimeMillis;
                boolean z = false;
                while (true) {
                    int read = source.read(bArr2);
                    if (read <= 0) {
                        break;
                    }
                    randomAccessFile.write(bArr2, 0, read);
                    j3 += read;
                    if (j3 - this.h >= 1048576) {
                        this.h = j3;
                        a(this.h, j2, false);
                    }
                    if (System.currentTimeMillis() - j4 > 1500) {
                        if (j3 > j2) {
                            j3 = j2;
                            z = true;
                        }
                        a(3, this.f.getString(R.string.download_downloading) + ((int) ((((float) j3) / ((float) j2)) * 100.0f)) + "%");
                        bArr = bArr2;
                        this.e.a(str, j3, j2);
                        j4 = System.currentTimeMillis();
                    } else {
                        bArr = bArr2;
                    }
                    if (this.c) {
                        a(4);
                        a(str, 17, "paused");
                        this.e.b(str);
                        break;
                    }
                    bArr2 = bArr;
                }
                if (z) {
                    a(str, 16, "outRange");
                }
                if (j3 >= j2) {
                    this.h = j2;
                    a(5);
                    a(this.h, j2, true);
                    a(str, 11, "success");
                    this.e.b(str);
                    this.e.a(str, this.g);
                }
                com.meituan.android.downloadmanager.util.c.a(source);
                com.meituan.android.downloadmanager.util.c.a(randomAccessFile);
                com.meituan.android.downloadmanager.util.c.a(apVar);
            } catch (Throwable th) {
                th = th;
                com.meituan.android.downloadmanager.util.c.a(source);
                com.meituan.android.downloadmanager.util.c.a(randomAccessFile);
                com.meituan.android.downloadmanager.util.c.a(apVar);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
    }

    private void a(long j, long j2, boolean z) throws IOException {
        Object[] objArr = {new Long(j), new Long(j2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f391c9b273cd040ef15bff5ac1fbed3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f391c9b273cd040ef15bff5ac1fbed3");
            return;
        }
        DownloadStateData downloadStateData = new DownloadStateData();
        downloadStateData.isComplete = z;
        downloadStateData.breakPointBytes = j;
        downloadStateData.totalBytes = j2;
        a(this.j.toJson(downloadStateData));
    }

    private DownloadStateData b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e755ffe55be194fd0eda54eca53561d", RobustBitConfig.DEFAULT_VALUE)) {
            return (DownloadStateData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e755ffe55be194fd0eda54eca53561d");
        }
        File file = new File(com.meituan.android.downloadmanager.util.c.b(this.e, this.d.d));
        if (file.exists()) {
            try {
                return (DownloadStateData) this.j.fromJson(com.meituan.android.downloadmanager.util.c.a(file), (Class<Object>) DownloadStateData.class);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        return null;
    }

    private void a(String str) throws IOException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da6fd8cc75376e0af04490db16be0511", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da6fd8cc75376e0af04490db16be0511");
            return;
        }
        File file = new File(com.meituan.android.downloadmanager.util.c.b(this.e, this.d.d));
        if (!file.exists()) {
            file.createNewFile();
        }
        com.meituan.android.downloadmanager.util.c.a(file, str);
    }

    private boolean a(List<q> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08c24686bcc13d22d095223ccf3444b4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08c24686bcc13d22d095223ccf3444b4")).booleanValue();
        }
        if (!com.meituan.android.downloadmanager.util.c.a(list)) {
            for (q qVar : list) {
                if (qVar != null && "content-range".equalsIgnoreCase(qVar.a())) {
                    return true;
                }
            }
        }
        return false;
    }

    private long b(List<q> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eeb443f9584bae3140577e1b7ac6d864", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eeb443f9584bae3140577e1b7ac6d864")).longValue();
        }
        if (!com.meituan.android.downloadmanager.util.c.a(list)) {
            for (q qVar : list) {
                if (qVar != null && "content-length".equalsIgnoreCase(qVar.a())) {
                    try {
                        return Long.parseLong(qVar.b());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return 0L;
    }

    private void a(String str, int i, String str2) {
        Object[] objArr = {str, Integer.valueOf(i), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa1c50bbe860bfdd5b07bd2d936dbfe9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa1c50bbe860bfdd5b07bd2d936dbfe9");
            return;
        }
        String str3 = this.d.c;
        if (TextUtils.isEmpty(str3)) {
            str3 = this.f.getPackageName();
        }
        com.meituan.android.downloadmanager.util.b.a(str, i, str2, str3);
    }
}
