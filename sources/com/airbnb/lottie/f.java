package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.support.annotation.RawRes;
import android.support.annotation.WorkerThread;
import android.support.v4.util.LongSparseArray;
import android.support.v4.util.SparseArrayCompat;
import android.util.JsonReader;
import com.airbnb.lottie.parser.r;
import com.meituan.android.mrn.engine.MRNBundleManager;
import com.meituan.robust.resource.APKStructure;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class f {
    private static final Map<String, k<e>> a = new HashMap();

    public static k<e> b(Context context, final String str) {
        final Context applicationContext = context.getApplicationContext();
        return a(str, new Callable<j<e>>() { // from class: com.airbnb.lottie.f.1
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ j<e> call() throws Exception {
                return f.c(applicationContext, str);
            }
        });
    }

    @WorkerThread
    public static j<e> c(Context context, String str) {
        try {
            String str2 = "asset_" + str;
            if (str.endsWith(MRNBundleManager.MRN_BUNDLE_SUFFIX)) {
                return a(new ZipInputStream(context.getAssets().open(str)), str2);
            }
            return a(context.getAssets().open(str), str2, true);
        } catch (IOException e) {
            return new j<>(e);
        }
    }

    public static k<e> a(Context context, @RawRes final int i) {
        final Context applicationContext = context.getApplicationContext();
        return a(a(i), new Callable<j<e>>() { // from class: com.airbnb.lottie.f.2
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ j<e> call() throws Exception {
                return f.b(applicationContext, i);
            }
        });
    }

    @WorkerThread
    public static j<e> b(Context context, @RawRes int i) {
        try {
            return a(context.getResources().openRawResource(i), a(i), true);
        } catch (Resources.NotFoundException e) {
            return new j<>(e);
        }
    }

    private static String a(@RawRes int i) {
        return "rawRes_" + i;
    }

    @WorkerThread
    public static j<e> a(InputStream inputStream, @Nullable String str) {
        return a(inputStream, str, true);
    }

    @WorkerThread
    private static j<e> a(InputStream inputStream, @Nullable String str, boolean z) {
        try {
            return b(new JsonReader(new InputStreamReader(inputStream)), str);
        } finally {
            if (z) {
                com.airbnb.lottie.utils.f.a(inputStream);
            }
        }
    }

    @WorkerThread
    public static j<e> a(String str, @Nullable String str2) {
        return b(new JsonReader(new StringReader(str)), (String) null);
    }

    public static k<e> a(final JsonReader jsonReader, @Nullable final String str) {
        return a(str, new Callable<j<e>>() { // from class: com.airbnb.lottie.f.3
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ j<e> call() throws Exception {
                return f.b(jsonReader, str);
            }
        });
    }

    @WorkerThread
    public static j<e> a(ZipInputStream zipInputStream, @Nullable String str) {
        try {
            return b(zipInputStream, str);
        } finally {
            com.airbnb.lottie.utils.f.a(zipInputStream);
        }
    }

    @WorkerThread
    private static j<e> b(ZipInputStream zipInputStream, @Nullable String str) {
        HashMap hashMap = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            e eVar = null;
            while (nextEntry != null) {
                if (!nextEntry.getName().contains("__MACOSX")) {
                    if (!nextEntry.getName().contains(".json")) {
                        if (nextEntry.getName().contains(".png")) {
                            String[] split = nextEntry.getName().split("/");
                            hashMap.put(split[split.length - 1], com.sankuai.waimai.launcher.util.image.a.a(zipInputStream));
                        }
                    } else {
                        eVar = a(zipInputStream, str, false).a;
                    }
                    nextEntry = zipInputStream.getNextEntry();
                }
                zipInputStream.closeEntry();
                nextEntry = zipInputStream.getNextEntry();
            }
            if (eVar == null) {
                return new j<>(new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                g a2 = a(eVar, (String) entry.getKey());
                if (a2 != null) {
                    a2.c = (Bitmap) entry.getValue();
                }
            }
            for (Map.Entry<String, g> entry2 : eVar.c.entrySet()) {
                if (entry2.getValue().c == null) {
                    return new j<>(new IllegalStateException("There is no image for " + entry2.getValue().b));
                }
            }
            com.airbnb.lottie.model.g.a().a(str, eVar);
            return new j<>(eVar);
        } catch (IOException e) {
            return new j<>(e);
        }
    }

    private static k<e> a(final String str, Callable<j<e>> callable) {
        if (a.containsKey(str)) {
            return a.get(str);
        }
        k<e> kVar = new k<>(callable);
        kVar.a(new h<e>() { // from class: com.airbnb.lottie.f.4
            @Override // com.airbnb.lottie.h
            public final /* synthetic */ void a(e eVar) {
                f.a.remove(str);
            }
        });
        kVar.c(new h<Throwable>() { // from class: com.airbnb.lottie.f.5
            @Override // com.airbnb.lottie.h
            public final /* synthetic */ void a(Throwable th) {
                f.a.remove(str);
            }
        });
        a.put(str, kVar);
        return kVar;
    }

    public static k<e> a(Context context, String str) {
        final com.airbnb.lottie.network.c cVar = new com.airbnb.lottie.network.c(context, str);
        return new k<>(new Callable<j<e>>() { // from class: com.airbnb.lottie.network.c.1
            /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
            /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final /* synthetic */ com.airbnb.lottie.j<com.airbnb.lottie.e> call() throws java.lang.Exception {
                /*
                    r4 = this;
                    com.airbnb.lottie.network.c r0 = com.airbnb.lottie.network.c.this
                    com.airbnb.lottie.network.b r1 = r0.b
                    android.support.v4.util.Pair r1 = r1.a()
                    if (r1 == 0) goto L31
                    F r2 = r1.first
                    com.airbnb.lottie.network.a r2 = (com.airbnb.lottie.network.a) r2
                    S r1 = r1.second
                    java.io.InputStream r1 = (java.io.InputStream) r1
                    com.airbnb.lottie.network.a r3 = com.airbnb.lottie.network.a.Zip
                    if (r2 != r3) goto L22
                    java.util.zip.ZipInputStream r2 = new java.util.zip.ZipInputStream
                    r2.<init>(r1)
                    java.lang.String r1 = r0.a
                    com.airbnb.lottie.j r1 = com.airbnb.lottie.f.a(r2, r1)
                    goto L28
                L22:
                    java.lang.String r2 = r0.a
                    com.airbnb.lottie.j r1 = com.airbnb.lottie.f.a(r1, r2)
                L28:
                    V r2 = r1.a
                    if (r2 == 0) goto L31
                    V r1 = r1.a
                    com.airbnb.lottie.e r1 = (com.airbnb.lottie.e) r1
                    goto L32
                L31:
                    r1 = 0
                L32:
                    if (r1 == 0) goto L3a
                    com.airbnb.lottie.j r0 = new com.airbnb.lottie.j
                    r0.<init>(r1)
                    return r0
                L3a:
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    java.lang.String r2 = "Animation for "
                    r1.<init>(r2)
                    java.lang.String r2 = r0.a
                    r1.append(r2)
                    java.lang.String r2 = " not found in cache. Fetching from network."
                    r1.append(r2)
                    java.lang.String r1 = r1.toString()
                    com.airbnb.lottie.d.a(r1)
                    com.airbnb.lottie.j r0 = r0.a()
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.network.c.AnonymousClass1.call():java.lang.Object");
            }
        });
    }

    @WorkerThread
    public static j<e> b(JsonReader jsonReader, @Nullable String str) {
        char c;
        HashMap hashMap;
        SparseArrayCompat<com.airbnb.lottie.model.d> sparseArrayCompat;
        try {
            float a2 = com.airbnb.lottie.utils.f.a();
            LongSparseArray<com.airbnb.lottie.model.layer.d> longSparseArray = new LongSparseArray<>();
            ArrayList arrayList = new ArrayList();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            HashMap hashMap4 = new HashMap();
            SparseArrayCompat<com.airbnb.lottie.model.d> sparseArrayCompat2 = new SparseArrayCompat<>();
            e eVar = new e();
            jsonReader.beginObject();
            int i = 0;
            int i2 = 0;
            float f = 0.0f;
            float f2 = 0.0f;
            float f3 = 0.0f;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                switch (nextName.hashCode()) {
                    case -1408207997:
                        if (nextName.equals(APKStructure.Assets_Type)) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1109732030:
                        if (nextName.equals("layers")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case 104:
                        if (nextName.equals("h")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 118:
                        if (nextName.equals("v")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case 119:
                        if (nextName.equals("w")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3276:
                        if (nextName.equals("fr")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3367:
                        if (nextName.equals(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP)) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3553:
                        if (nextName.equals("op")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 94623709:
                        if (nextName.equals("chars")) {
                            c = '\t';
                            break;
                        }
                        c = 65535;
                        break;
                    case 97615364:
                        if (nextName.equals("fonts")) {
                            c = '\b';
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        hashMap = hashMap4;
                        sparseArrayCompat = sparseArrayCompat2;
                        i = jsonReader.nextInt();
                        break;
                    case 1:
                        hashMap = hashMap4;
                        sparseArrayCompat = sparseArrayCompat2;
                        i2 = jsonReader.nextInt();
                        break;
                    case 2:
                        hashMap = hashMap4;
                        sparseArrayCompat = sparseArrayCompat2;
                        f = (float) jsonReader.nextDouble();
                        break;
                    case 3:
                        hashMap = hashMap4;
                        sparseArrayCompat = sparseArrayCompat2;
                        f2 = ((float) jsonReader.nextDouble()) - 0.01f;
                        break;
                    case 4:
                        f3 = (float) jsonReader.nextDouble();
                        continue;
                    case 5:
                        String[] split = jsonReader.nextString().split("\\.");
                        if (!com.airbnb.lottie.utils.f.a(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), 4, 4, 0)) {
                            eVar.a("Lottie only supports bodymovin >= 4.4.0");
                        }
                        hashMap = hashMap4;
                        sparseArrayCompat = sparseArrayCompat2;
                        break;
                    case 6:
                        r.a(jsonReader, eVar, arrayList, longSparseArray);
                        hashMap = hashMap4;
                        sparseArrayCompat = sparseArrayCompat2;
                        break;
                    case 7:
                        r.a(jsonReader, eVar, hashMap2, hashMap3);
                        hashMap = hashMap4;
                        sparseArrayCompat = sparseArrayCompat2;
                        break;
                    case '\b':
                        r.a(jsonReader, hashMap4);
                        hashMap = hashMap4;
                        sparseArrayCompat = sparseArrayCompat2;
                        break;
                    case '\t':
                        r.a(jsonReader, eVar, sparseArrayCompat2);
                        hashMap = hashMap4;
                        sparseArrayCompat = sparseArrayCompat2;
                        break;
                    default:
                        hashMap = hashMap4;
                        sparseArrayCompat = sparseArrayCompat2;
                        jsonReader.skipValue();
                        break;
                }
                hashMap4 = hashMap;
                sparseArrayCompat2 = sparseArrayCompat;
            }
            jsonReader.endObject();
            eVar.h = new Rect(0, 0, (int) (i * a2), (int) (i2 * a2));
            eVar.i = f;
            eVar.j = f2;
            eVar.k = f3;
            eVar.g = arrayList;
            eVar.f = longSparseArray;
            eVar.b = hashMap2;
            eVar.c = hashMap3;
            eVar.e = sparseArrayCompat2;
            eVar.d = hashMap4;
            com.airbnb.lottie.model.g.a().a(str, eVar);
            return new j<>(eVar);
        } catch (Exception e) {
            return new j<>(e);
        }
    }

    @Nullable
    private static g a(e eVar, String str) {
        for (g gVar : eVar.c.values()) {
            if (gVar.b.equals(str)) {
                return gVar;
            }
        }
        return null;
    }
}
