package com.meituan.android.neohybrid.v2.neo.offline;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.android.mrn.engine.MRNBundleManager;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.android.neohybrid.core.config.NeoConfig;
import com.meituan.android.recce.host.RecceBridgeHandler;
import com.meituan.met.mercury.load.core.DDLoadStrategy;
import com.meituan.met.mercury.load.core.DDResource;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.FileUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class g {
    public static ChangeQuickRedirect a;
    private static final ConcurrentHashMap<String, String> b = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, String> c = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, String> d = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, Object> e = new ConcurrentHashMap<>();
    private static final Handler f = new Handler(Looper.getMainLooper());

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface d {
        void a(String str);

        void a(String str, c cVar);
    }

    public static /* synthetic */ int a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f4aa449beb9c8e7405094f454686a32e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f4aa449beb9c8e7405094f454686a32e")).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        if (split != null && split2 != null) {
            int i = 0;
            while (true) {
                if (i >= split.length && i >= split2.length) {
                    break;
                }
                int parseInt = i < split.length ? Integer.parseInt(split[i]) : 0;
                int parseInt2 = i < split2.length ? Integer.parseInt(split2[i]) : 0;
                if (parseInt > parseInt2) {
                    return 1;
                }
                if (parseInt < parseInt2) {
                    return -1;
                }
                i++;
            }
        }
        return 0;
    }

    public static void a(com.meituan.android.neohybrid.v2.core.a aVar, String str, String str2, d dVar) {
        Object[] objArr = {aVar, str, str2, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4d147f24be0cb3b162f1d232577ca5b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4d147f24be0cb3b162f1d232577ca5b3");
            return;
        }
        com.meituan.android.neohybrid.v2.neo.recce.a.a(aVar, "recce_offline_request", com.meituan.android.neohybrid.neo.report.a.a().a("status", "start").a(NeoConfig.NEO_SCENE, str).b);
        String str3 = b.get(str);
        if (!TextUtils.isEmpty(str3) && FileUtils.isFileExist(str3)) {
            dVar.a(str3, c.NET_CACHE);
            com.meituan.android.neohybrid.v2.neo.recce.a.a(aVar, "recce_offline_cache", com.meituan.android.neohybrid.neo.report.a.a().a("status", "success").a(NeoConfig.NEO_SCENE, str).a("offline_version", d.get(str3)).b);
            return;
        }
        com.meituan.android.neohybrid.v2.neo.recce.a.a(aVar, "recce_offline_cache", com.meituan.android.neohybrid.neo.report.a.a().a("status", "fail").a(NeoConfig.NEO_SCENE, str).b);
        String str4 = c.get(str);
        if (!TextUtils.isEmpty(str4) && FileUtils.isFileExist(str4)) {
            dVar.a(str4, c.PRESET_CACHE);
            com.meituan.android.neohybrid.v2.neo.recce.a.a(aVar, "recce_preset_cache", com.meituan.android.neohybrid.neo.report.a.a().a("status", "success").a(NeoConfig.NEO_SCENE, str).b);
            return;
        }
        com.meituan.android.neohybrid.v2.neo.recce.a.a(aVar, "recce_preset_cache", com.meituan.android.neohybrid.neo.report.a.a().a("status", "fail").a(NeoConfig.NEO_SCENE, str).b);
        b(aVar, str, str2, dVar);
    }

    public static boolean a(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e1a57d3bda524ab78e32917c6c589c74", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e1a57d3bda524ab78e32917c6c589c74")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String path = Uri.parse(str).getPath();
        return (TextUtils.isEmpty(b.get(path)) && TextUtils.isEmpty(c.get(path))) ? false : true;
    }

    public static void a(String str, String str2, boolean z) {
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "10178f7dae6428d04adb0ab8cf050be4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "10178f7dae6428d04adb0ab8cf050be4");
        } else {
            b(null, str, str2, null);
        }
    }

    private static void b(com.meituan.android.neohybrid.v2.core.a aVar, String str, String str2, d dVar) {
        Object[] objArr = {aVar, str, str2, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8c399b8f8debb923ff5b3d377ac357bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8c399b8f8debb923ff5b3d377ac357bb");
        } else if (com.meituan.android.recce.utils.a.a(com.meituan.android.recce.a.b())) {
            a(str, dVar);
        } else {
            if (dVar != null) {
                com.meituan.android.neohybrid.v2.neo.recce.a.a(aVar, "recce_offline_prepare", com.meituan.android.neohybrid.neo.report.a.a().a("status", "start").a(NeoConfig.NEO_SCENE, str).b);
            }
            a aVar2 = new a(aVar, str, dVar);
            b(str, aVar2);
            if (!TextUtils.isEmpty(str2)) {
                a(str, str2, aVar2);
            }
            c(str, aVar2);
        }
    }

    private static void a(String str, d dVar) {
        boolean z;
        Object[] objArr = {str, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "de711b8b570dec16d7b3ca5b43f054e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "de711b8b570dec16d7b3ca5b43f054e8");
            return;
        }
        Context b2 = com.meituan.android.recce.a.b();
        if (b2 == null) {
            return;
        }
        try {
            File a2 = q.a(b2, "jinrong_wasai", str, u.c);
            InputStream open = b2.getAssets().open("wasm/app.zip");
            File file = new File(b2.getCacheDir(), "app.zip");
            file.setWritable(true);
            b(open, new FileOutputStream(file));
            try {
                z = FileUtils.unzip(new File(file.getPath()), a2);
            } catch (IOException unused) {
                z = false;
            }
            if (z) {
                b.put(str, a2.getAbsolutePath());
                d.put(a2.getAbsolutePath(), "-1");
                if (dVar != null) {
                    dVar.a(a2.getAbsolutePath(), c.DEBUG);
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    private static void b(String str, d dVar) {
        Object[] objArr = {str, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d1b83d0146fef80a95218a8a35a032f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d1b83d0146fef80a95218a8a35a032f1");
            return;
        }
        new StringBuilder("开始拉取离线包 ").append(str);
        if (TextUtils.isEmpty(str)) {
            dVar.a("wasai_resource_name_is_empty");
        } else {
            com.meituan.met.mercury.load.core.g.a("jinrong_wasai").a(str, DDLoadStrategy.LOCAL_FIRST, new AnonymousClass1(str, dVar));
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.neohybrid.v2.neo.offline.g$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 implements com.meituan.met.mercury.load.core.k {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ String b;
        public final /* synthetic */ d c;

        public AnonymousClass1(String str, d dVar) {
            this.b = str;
            this.c = dVar;
        }

        @Override // com.meituan.met.mercury.load.core.k
        public final void onSuccess(@Nullable DDResource dDResource) {
            Object[] objArr = {dDResource};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d65c73d73eec84bd8d1f2eddb7ed1f72", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d65c73d73eec84bd8d1f2eddb7ed1f72");
            } else {
                g.f.post(h.a(dDResource, this.b, this.c));
            }
        }

        @Override // com.meituan.met.mercury.load.core.k
        public final void onFail(Exception exc) {
            Object[] objArr = {exc};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a54eaad0236266f40c534440ee028f84", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a54eaad0236266f40c534440ee028f84");
            } else {
                g.f.post(i.a(exc, this.c));
            }
        }
    }

    private static void a(String str, String str2, d dVar) {
        Object[] objArr = {str, str2, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f73c9d277125d3695926b31c76d8dd83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f73c9d277125d3695926b31c76d8dd83");
            return;
        }
        StringBuilder sb = new StringBuilder("开始拉取兜底离线包 ");
        sb.append(str);
        sb.append(" resourceVersion: ");
        sb.append(str2);
        if (TextUtils.isEmpty(str)) {
            dVar.a("wasai_resource_name_is_empty");
            return;
        }
        new StringBuilder("start to load resource ").append(str);
        com.meituan.met.mercury.load.core.g.a("jinrong_wasai").a(str, str2, new AnonymousClass2(str, dVar));
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.neohybrid.v2.neo.offline.g$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass2 implements com.meituan.met.mercury.load.core.k {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ String b;
        public final /* synthetic */ d c;

        public AnonymousClass2(String str, d dVar) {
            this.b = str;
            this.c = dVar;
        }

        @Override // com.meituan.met.mercury.load.core.k
        public final void onSuccess(@Nullable DDResource dDResource) {
            Object[] objArr = {dDResource};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "791bdd7be6688d7bb2ddad3d91f09928", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "791bdd7be6688d7bb2ddad3d91f09928");
            } else {
                g.f.post(j.a(dDResource, this.b, this.c));
            }
        }

        @Override // com.meituan.met.mercury.load.core.k
        public final void onFail(Exception exc) {
            Object[] objArr = {exc};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6702c5c9880a9be60f88f7fb0b1554f0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6702c5c9880a9be60f88f7fb0b1554f0");
            } else {
                g.f.post(k.a(exc, this.c));
            }
        }
    }

    private static long a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3e02801e5de08ed31724d4daa910710e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3e02801e5de08ed31724d4daa910710e")).longValue();
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            return 0L;
        }
    }

    private static void c(String str, d dVar) {
        Object[] objArr = {str, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8e6372c393e0e4a67ec7bd1f901dde02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8e6372c393e0e4a67ec7bd1f901dde02");
        } else if (TextUtils.isEmpty(str)) {
            dVar.a("wasai_resource_name_is_empty");
        } else {
            Context b2 = com.meituan.android.recce.a.b();
            if (b2 == null) {
                dVar.a("wasai_context_is_empty");
                return;
            }
            File a2 = q.a(b2, "jinrong_wasai", str, u.c);
            if (a2 == null) {
                dVar.a("wasai_request_unzip_target_file_path_fail");
                return;
            }
            String a3 = a(b2, a2);
            if (FileUtils.isFileExist(a3)) {
                c.put(str, a3);
                d.put(a3, "-1");
                dVar.a(a3, c.PRESET_CACHE);
                new StringBuilder("wasm path: ").append(a3);
                return;
            }
            a(a2, a3);
            com.sankuai.waimai.launcher.util.aop.b.a(new b(b2, str, new File(a3), dVar), com.sankuai.android.jarvis.c.a(), new Object[0]);
        }
    }

    private static void a(File file, String str) {
        Object[] objArr = {file, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e07e0e5132a8ce101c8584b301e11fe8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e07e0e5132a8ce101c8584b301e11fe8");
            return;
        }
        try {
            File file2 = new File(file.getAbsolutePath() + File.separator + "preset");
            if (file2.exists() && file2.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles.length > 0) {
                    for (File file3 : listFiles) {
                        if (!TextUtils.equals(str, file3.getAbsolutePath())) {
                            file3.delete();
                        }
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private static String a(Context context, File file) {
        Object[] objArr = {context, file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bec7ae485062532870b20980eb899ea0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bec7ae485062532870b20980eb899ea0");
        }
        long a2 = a(context);
        return file.getAbsolutePath() + File.separator + "preset" + File.separator + a2 + "_preset.dio";
    }

    public static String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f40c4a8eea23e9ffdb8e6cdfbb358399", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f40c4a8eea23e9ffdb8e6cdfbb358399") : d.containsKey(str) ? d.get(str) : "-1";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(InputStream inputStream, OutputStream outputStream) throws IOException {
        Object[] objArr = {inputStream, outputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e927811014e9e50b96bada09881d6db0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e927811014e9e50b96bada09881d6db0");
            return;
        }
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return;
            }
            outputStream.write(bArr, 0, read);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a implements d {
        public static ChangeQuickRedirect a;
        volatile d b;
        WeakReference<com.meituan.android.neohybrid.v2.core.a> c;
        private AtomicInteger d;
        private StringBuffer e;
        private String f;
        private long g;

        public a(com.meituan.android.neohybrid.v2.core.a aVar, String str, d dVar) {
            Object[] objArr = {aVar, str, dVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70b257f4182a9d92e613571178232d3b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70b257f4182a9d92e613571178232d3b");
                return;
            }
            this.d = new AtomicInteger(0);
            this.e = new StringBuffer();
            this.g = System.currentTimeMillis();
            this.c = new WeakReference<>(aVar);
            this.f = str;
            this.b = dVar;
            g.f.postDelayed(l.a(this, str), 15000L);
        }

        @Override // com.meituan.android.neohybrid.v2.neo.offline.g.d
        public final synchronized void a(String str, c cVar) {
            Object[] objArr = {str, cVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5a58dcfb00d780712e1a1f02f111768", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5a58dcfb00d780712e1a1f02f111768");
                return;
            }
            new StringBuilder("onResourceReady: ").append(str);
            if (this.b != null) {
                this.b.a(str, cVar);
                this.b = null;
                com.meituan.android.neohybrid.v2.neo.recce.a.a(this.c.get(), "recce_offline_prepare", com.meituan.android.neohybrid.neo.report.a.a().a("status", "success").a(NeoConfig.NEO_SCENE, this.f).a("duration", Long.valueOf(System.currentTimeMillis() - this.g)).a("offline_version", g.d.get(str)).b);
            }
        }

        @Override // com.meituan.android.neohybrid.v2.neo.offline.g.d
        public final synchronized void a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "893f0d417658ef43481769ac3eb4f699", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "893f0d417658ef43481769ac3eb4f699");
                return;
            }
            int incrementAndGet = this.d.incrementAndGet();
            StringBuilder sb = new StringBuilder("onResourceError ");
            sb.append(incrementAndGet);
            sb.append(": ");
            sb.append(str);
            if (this.b != null && incrementAndGet >= 3) {
                this.e.append(str);
                this.b.a(this.e.toString());
                this.b = null;
                com.meituan.android.neohybrid.v2.neo.recce.a.a(this.c.get(), "recce_offline_prepare", com.meituan.android.neohybrid.neo.report.a.a().a("status", "fail").a("error_message", this.e.toString()).a(NeoConfig.NEO_SCENE, this.f).b);
                return;
            }
            this.e.append(str);
            this.e.append(RecceBridgeHandler.RECCE_BRIDGE_ARGS_SEPARATOR);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class b extends AsyncTask<Object, Integer, String> {
        public static ChangeQuickRedirect a;
        private final WeakReference<Context> b;
        private final File c;
        private final String d;
        private final d e;

        @Override // android.os.AsyncTask
        public final /* synthetic */ void onPostExecute(String str) {
            String str2 = str;
            Object[] objArr = {str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3d2a23bb1f1c65ead56d140a7551a77", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3d2a23bb1f1c65ead56d140a7551a77");
                return;
            }
            super.onPostExecute(str2);
            if (this.e != null) {
                if (TextUtils.isEmpty(str2)) {
                    this.e.a("wasai_unzip_resource_fail");
                    return;
                }
                new StringBuilder("预置包成功的迁移到安装包目录下 ").append(str2);
                this.e.a(str2, c.PRESET);
                return;
            }
            com.dianping.networklog.c.a("ReOff: callback is null", 3, new String[]{"Recce-Android"});
        }

        public b(Context context, String str, File file, d dVar) {
            Object[] objArr = {context, str, file, dVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b192882f1c921db42f8e213889300b65", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b192882f1c921db42f8e213889300b65");
                return;
            }
            this.b = new WeakReference<>(context);
            this.c = file;
            this.d = str;
            this.e = dVar;
        }

        @Override // android.os.AsyncTask
        public final void onPreExecute() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0c9c767f5e0b3b2d4c3a6e4a4b8b0d0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0c9c767f5e0b3b2d4c3a6e4a4b8b0d0");
                return;
            }
            super.onPreExecute();
            if (g.e.get(this.c.getAbsolutePath()) == null) {
                g.e.put(this.c.getAbsolutePath(), new Object());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public String doInBackground(Object... objArr) {
            Object[] objArr2 = {objArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "e49c6d448e8ec1c4439b91a7d45690cf", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "e49c6d448e8ec1c4439b91a7d45690cf");
            }
            synchronized (g.e.get(this.c.getAbsolutePath())) {
                if (FileUtils.isFileExist(this.c.getAbsolutePath())) {
                    g.c.put(this.d, this.c.getAbsolutePath());
                    g.d.put(this.c.getAbsolutePath(), "-1");
                    return this.c.getAbsolutePath();
                }
                Context context = this.b.get();
                if (context == null) {
                    return null;
                }
                try {
                    if (!this.c.exists()) {
                        this.c.getParentFile().mkdirs();
                        this.c.createNewFile();
                    }
                    AssetManager assets = context.getAssets();
                    InputStream open = assets.open(KernelConfig.KERNEL_TYPE_RECCE + File.separator + this.d + MRNBundleManager.DIO_BUNDLE_SUFFIX);
                    FileOutputStream fileOutputStream = new FileOutputStream(this.c);
                    g.b(open, fileOutputStream);
                    fileOutputStream.close();
                    open.close();
                    g.c.put(this.d, this.c.getAbsolutePath());
                    g.d.put(this.c.getAbsolutePath(), "-1");
                    return this.c.getAbsolutePath();
                } catch (IOException e) {
                    e.printStackTrace();
                    try {
                        this.c.delete();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    Log.e("Recce-Android", "预置包迁移出错 " + e.getMessage());
                    com.dianping.networklog.c.a("UnzipLocalResourceAsyncTask: unzip ioException " + e.getMessage(), 3, new String[]{"Recce-Android"});
                    return null;
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public enum c {
        LATEST_NET,
        DEFAULT_NET,
        NET_CACHE,
        PRESET,
        PRESET_CACHE,
        DEBUG;
        
        public static ChangeQuickRedirect a;

        c() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "271f17d11e38b0fbac5c1208baeb68c1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "271f17d11e38b0fbac5c1208baeb68c1");
            }
        }

        public static c valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5fb5dd70a24efb3ff6e0cdd6bd8d5b19", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5fb5dd70a24efb3ff6e0cdd6bd8d5b19") : (c) Enum.valueOf(c.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "55114b7360b9502ace2335cbca53d68f", RobustBitConfig.DEFAULT_VALUE) ? (c[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "55114b7360b9502ace2335cbca53d68f") : (c[]) values().clone();
        }
    }
}
