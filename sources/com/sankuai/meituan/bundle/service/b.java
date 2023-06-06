package com.sankuai.meituan.bundle.service;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ar;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public static Context b;
    private static volatile ConcurrentMap<Integer, c> c;
    private static volatile q d;
    private static volatile SparseArray<h> e;
    private static long f;
    private static com.sankuai.meituan.bundle.service.entity.a g;

    public static com.sankuai.meituan.bundle.service.entity.a a() {
        return g;
    }

    public static synchronized void a(Context context, int i, h hVar) {
        synchronized (b.class) {
            Object[] objArr = {context, 101, hVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bb4756228c4ca0213545f3be7cfcfb5f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bb4756228c4ca0213545f3be7cfcfb5f");
                return;
            }
            if (c == null) {
                c = new ConcurrentHashMap();
            }
            if (e == null) {
                e = new SparseArray<>();
            }
            e.put(101, hVar);
            if (!c.containsKey(101)) {
                int i2 = hVar.a > 0 ? hVar.a : 5000;
                c.put(101, new c(new ar.a().a("http://s3plus.meituan.net").a(com.sankuai.meituan.retrofit2.callfactory.urlconnection.a.a(i2, i2)).a(), 101));
            }
            if (d == null) {
                d = q.a(context, "smart-download");
            }
            if (b == null) {
                b = context.getApplicationContext();
            }
            com.sankuai.meituan.bundle.service.util.b.a(b, hVar.c == 0 ? 10 : hVar.c);
            final Gson create = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
            Horn.register("bundle_service_cdn_config", new HornCallback() { // from class: com.sankuai.meituan.bundle.service.b.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.common.horn.HornCallback
                public final void onChanged(boolean z, String str) {
                    Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "892f2ad593d88cc5bc0c616b697306d5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "892f2ad593d88cc5bc0c616b697306d5");
                    } else if (b.f + 300000 > System.currentTimeMillis()) {
                    } else {
                        long unused = b.f = System.currentTimeMillis();
                        Log.e("cdn", str);
                        try {
                            com.sankuai.meituan.bundle.service.entity.a unused2 = b.g = (com.sankuai.meituan.bundle.service.entity.a) Gson.this.fromJson(str, (Class<Object>) com.sankuai.meituan.bundle.service.entity.a.class);
                        } catch (Exception unused3) {
                            com.sankuai.meituan.bundle.service.entity.a unused4 = b.g = null;
                        }
                    }
                }
            });
        }
    }

    private static u d(int i) {
        h hVar;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d66d2f0822a2cb22ace1534a7cbeac43", RobustBitConfig.DEFAULT_VALUE)) {
            return (u) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d66d2f0822a2cb22ace1534a7cbeac43");
        }
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "1f5f9fffafc6248ff9b97b7d3ab45208", RobustBitConfig.DEFAULT_VALUE)) {
            hVar = (h) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "1f5f9fffafc6248ff9b97b7d3ab45208");
        } else if (e == null || (hVar = e.get(i)) == null) {
            hVar = new h();
        }
        return hVar.b ? u.e : u.b;
    }

    private static boolean a(int i, a aVar, String str) {
        Object[] objArr = {Integer.valueOf(i), aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fa8510dbc8ca18104e689c44676fa02f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fa8510dbc8ca18104e689c44676fa02f")).booleanValue();
        }
        if (d == null) {
            com.sankuai.meituan.bundle.service.util.a.a(str, "cipStorageCenter is null");
            a(aVar, 10, (d) null);
            return false;
        } else if (c == null) {
            com.sankuai.meituan.bundle.service.util.a.a(str, "downloadQueueConcurrentMap is null");
            a(aVar, 10, (d) null);
            return false;
        } else if (c.get(Integer.valueOf(i)) == null) {
            com.sankuai.meituan.bundle.service.util.a.a(str, "downloadQueue is null");
            a(aVar, 10, (d) null);
            return false;
        } else {
            return true;
        }
    }

    public static void a(int i, com.sankuai.meituan.bundle.service.a aVar, com.sankuai.meituan.bundle.service.a aVar2, g gVar, a aVar3) {
        Object[] objArr = {101, aVar, aVar2, gVar, aVar3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b698ca5b5d0a370d76ae6fc859af063d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b698ca5b5d0a370d76ae6fc859af063d");
            return;
        }
        aVar3.k = gVar.b;
        aVar3.l = gVar.a;
        if (TextUtils.isEmpty(aVar2.a)) {
            com.sankuai.meituan.bundle.service.util.a.a("installBundle", "targetL0.hash is empty");
            a(aVar3, 12, (d) null);
        } else if (TextUtils.isEmpty(aVar.a)) {
            com.sankuai.meituan.bundle.service.util.a.a("installBundle", "targetL9.hash is empty");
            a(aVar3, 12, (d) null);
        } else if (a(101, aVar3, "installBundle")) {
            c cVar = c.get(101);
            gVar.d = aVar2.a;
            cVar.a(new f(cVar, aVar, aVar2, gVar, aVar3));
        }
    }

    public static void a(int i, com.sankuai.meituan.bundle.service.a aVar, com.sankuai.meituan.bundle.service.a aVar2, com.sankuai.meituan.bundle.service.a aVar3, g gVar, a aVar4) {
        Object[] objArr = {101, aVar, aVar2, aVar3, gVar, aVar4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f6901b6196c365bf6ff470709d4407c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f6901b6196c365bf6ff470709d4407c4");
            return;
        }
        aVar4.k = gVar.b;
        aVar4.l = gVar.a;
        if (TextUtils.isEmpty(aVar2.a)) {
            com.sankuai.meituan.bundle.service.util.a.a("installPatchBundle", "targetL0.hash is empty");
            a(aVar4, 12, (d) null);
        } else if (TextUtils.isEmpty(aVar.a)) {
            com.sankuai.meituan.bundle.service.util.a.a("installPatchBundle", "targetDiff.hash is empty");
            a(aVar4, 12, (d) null);
        } else if (TextUtils.isEmpty(aVar3.a) && TextUtils.isEmpty(aVar3.c)) {
            com.sankuai.meituan.bundle.service.util.a.a("installPatchBundle", "sourceL0.hash && sourceL0.uri is empty");
            a(aVar4, 12, (d) null);
        } else if (a(101, aVar4, "installPatchBundle")) {
            c cVar = c.get(101);
            gVar.d = aVar2.a;
            cVar.a(new i(cVar, aVar, aVar2, aVar3, gVar, aVar4));
        }
    }

    public static void a(a aVar, int i, d dVar) {
        Object[] objArr = {aVar, Integer.valueOf(i), dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a86bde7de917463a862e40ea8e4d6b1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a86bde7de917463a862e40ea8e4d6b1e");
        } else if (dVar != null) {
            dVar.a(i);
        } else if (aVar != null) {
            aVar.a(i);
        }
    }

    public static void a(a aVar, File file, d dVar) {
        Object[] objArr = {aVar, file, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "13cdedd472f369cc80c351bee7ab1f74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "13cdedd472f369cc80c351bee7ab1f74");
        } else {
            dVar.a(file);
        }
    }

    public static String a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f2209a855d9d8e7d75d0323e60b54524", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f2209a855d9d8e7d75d0323e60b54524");
        }
        StringBuffer stringBuffer = new StringBuffer();
        switch (i) {
            case 100:
                stringBuffer.append("web-");
                break;
            case 101:
                stringBuffer.append("mrn-");
                break;
            case 102:
                stringBuffer.append("mmp-");
                break;
            case 103:
                stringBuffer.append("travel_ticket-");
                break;
            case 104:
                stringBuffer.append("fmp-");
                break;
            case 105:
                stringBuffer.append("mgc-");
                break;
            default:
                stringBuffer.append(i);
                break;
        }
        stringBuffer.append(str);
        return stringBuffer.toString();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static abstract class a {
        public static ChangeQuickRedirect j;
        public boolean k;
        public boolean l;

        public abstract void a(int i);

        public void a(int i, long j2, long j3) {
        }

        public abstract void a(File file);

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = j;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "643c6b282a4acacccb0b7e28d3fc48f5", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "643c6b282a4acacccb0b7e28d3fc48f5");
                return;
            }
            this.k = false;
            this.l = false;
        }
    }

    public static File a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "65bbec91dbd2b1eccbfea73ff84cdbe1", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "65bbec91dbd2b1eccbfea73ff84cdbe1");
        }
        q qVar = d;
        u d2 = d(i);
        return qVar.c("bundle" + File.separator + i, true, d2);
    }

    public static File b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4ed9ead849ca1831516eb6ddafd609c0", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4ed9ead849ca1831516eb6ddafd609c0");
        }
        q qVar = d;
        u d2 = d(i);
        return qVar.c("unzip" + File.separator + i, false, d2);
    }

    public static File c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1c8cd7459c8f841f1856307075b07ea6", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1c8cd7459c8f841f1856307075b07ea6");
        }
        q qVar = d;
        u d2 = d(i);
        return qVar.c("temp" + File.separator + i, false, d2);
    }
}
