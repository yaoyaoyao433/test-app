package com.meituan.android.mrn.component.skeleton;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.LruCache;
import android.view.WindowManager;
import com.meituan.dio.easy.DioFile;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.mapsdk.internal.jw;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import rx.d;
import rx.j;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static LruCache<String, Map<String, Object>> b = new LruCache<String, Map<String, Object>>(102400) { // from class: com.meituan.android.mrn.component.skeleton.b.1
        public static ChangeQuickRedirect a;

        {
            super(102400);
        }

        @Override // android.util.LruCache
        public final /* synthetic */ int sizeOf(String str, Map<String, Object> map) {
            Map<String, Object> map2 = map;
            Object[] objArr = {str, map2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45371f4f1724d682e5dbd0cada7d44f2", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45371f4f1724d682e5dbd0cada7d44f2")).intValue();
            }
            if (map2 != null) {
                return (((List) map2.get("LIST_SKELETON")).size() * 13) + 6;
            }
            return 1;
        }
    };

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void a();

        void a(Map<String, Object> map);
    }

    public static int a(short s, int i) {
        return (int) (s / (((i * 1.0f) / 160.0f) * 1.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<String, Object> b(Context context, String str, File file, DioFile dioFile) {
        Object[] objArr = {context, str, file, dioFile};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b31ee11b01f99f47746e7f1a0b674ea4", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b31ee11b01f99f47746e7f1a0b674ea4");
        }
        try {
            if (str.contains(CommonConstant.Symbol.DOLLAR)) {
                String[] split = str.split("\\$");
                str = split[split.length - 1];
            }
            return a(context, a(context, str, file, dioFile, (byte[]) null));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<String, Object> b(Context context, byte[] bArr) {
        Object[] objArr = {context, bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eeb9dcd259094d5d247128400d20209a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eeb9dcd259094d5d247128400d20209a");
        }
        try {
            return a(context, a(context, (String) null, (File) null, (DioFile) null, bArr));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static Map<String, Object> a(Context context, DataInputStream dataInputStream) {
        byte readByte;
        boolean z = true;
        Object[] objArr = {context, dataInputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        try {
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "660a642abd60ba4508b4e5414eddfe21", RobustBitConfig.DEFAULT_VALUE)) {
                return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "660a642abd60ba4508b4e5414eddfe21");
            }
            try {
                HashMap hashMap = new HashMap();
                try {
                    int available = (dataInputStream.available() - 20) / 13;
                    hashMap.put("CURRENT_SKELETON_VERSION", Integer.valueOf(dataInputStream.readByte()));
                    hashMap.put("ORIGIN_ROOT_VIEW_SKELETON_WIDTH", Integer.valueOf(dataInputStream.readShort()));
                    hashMap.put("ORIGIN_ROOT_VIEW_SKELETON_DENSITY_DPI", Integer.valueOf(dataInputStream.readShort()));
                    if (dataInputStream.readByte() != 1) {
                        z = false;
                    }
                    hashMap.put("IS_COMPAT_STATUS_BAR", Boolean.valueOf(z));
                    dataInputStream.skipBytes(14);
                    ArrayList arrayList = new ArrayList(available);
                    int i = 0;
                    for (int i2 = 0; i2 < available; i2++) {
                        ArrayList arrayList2 = new ArrayList();
                        int a2 = a(context, dataInputStream.readShort());
                        arrayList2.add(Integer.valueOf(a2));
                        int a3 = a(context, dataInputStream.readShort());
                        arrayList2.add(Integer.valueOf(a3));
                        int a4 = a(context, dataInputStream.readShort());
                        arrayList2.add(Integer.valueOf(a4));
                        int a5 = a(context, dataInputStream.readShort());
                        arrayList2.add(Integer.valueOf(a5));
                        arrayList2.add(Float.valueOf(dataInputStream.readByte() < 0 ? 999.0f : a(context, readByte) * 1.0f));
                        arrayList2.add(Integer.valueOf(dataInputStream.readInt()));
                        arrayList.add(arrayList2);
                        int i3 = a3 + a5;
                        if (i < i3) {
                            i = i3;
                        }
                        int i4 = a2 + a4;
                        if (i4 > 0) {
                            i = i4;
                        }
                    }
                    hashMap.put("MAX_HEIGHT", Integer.valueOf(i));
                    hashMap.put("MAX_WIDTH", 0);
                    hashMap.put("LIST_SKELETON", arrayList);
                    if (dataInputStream != null) {
                        try {
                            dataInputStream.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    return hashMap;
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    if (dataInputStream != null) {
                        try {
                            dataInputStream.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    return null;
                }
            } catch (Exception e4) {
                e = e4;
                dataInputStream = null;
            } catch (Throwable th) {
                th = th;
                dataInputStream = null;
                if (dataInputStream != null) {
                    try {
                        dataInputStream.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static DataInputStream a(Context context, String str, File file, DioFile dioFile, byte[] bArr) throws Exception {
        Object[] objArr = {context, str, file, dioFile, bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6e0d4104d6421b152402924b60978a74", RobustBitConfig.DEFAULT_VALUE)) {
            return (DataInputStream) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6e0d4104d6421b152402924b60978a74");
        }
        if (bArr != null) {
            return new DataInputStream(new ByteArrayInputStream(bArr));
        }
        if (file != null) {
            try {
                return new DataInputStream(new FileInputStream(file));
            } catch (FileNotFoundException unused) {
                return new DataInputStream(context.getAssets().open(str));
            }
        } else if (dioFile != null) {
            try {
                return new DataInputStream(dioFile.b());
            } catch (FileNotFoundException unused2) {
                return new DataInputStream(context.getAssets().open(str));
            }
        } else {
            return new DataInputStream(context.getAssets().open(str));
        }
    }

    public static void a(final Context context, boolean z, final String str, final String str2, final File file, final DioFile dioFile, final a aVar) {
        Map<String, Object> b2;
        Map<String, Object> map;
        Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0), str, str2, file, dioFile, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e65a8a0abc61be369920828bd39fc389", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e65a8a0abc61be369920828bd39fc389");
            return;
        }
        String str3 = TextUtils.isEmpty(str) ? str2 : str;
        if (!TextUtils.isEmpty(str3) && (map = b.get(str3)) != null && map.get("LIST_SKELETON") != null) {
            b(context, b.get(str3), str2, str, aVar);
        } else if (!z) {
            if (!TextUtils.isEmpty(str)) {
                b2 = b(context, Base64.decode(str, 0));
            } else {
                b2 = b(context, str2, file, dioFile);
            }
            b(context, b2, str2, str, aVar);
        } else {
            d.a((d.a) new d.a<Map<String, Object>>() { // from class: com.meituan.android.mrn.component.skeleton.b.4
                public static ChangeQuickRedirect a;

                @Override // rx.functions.b
                public final /* synthetic */ void call(Object obj) {
                    j jVar = (j) obj;
                    Object[] objArr2 = {jVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "46f958fff6851a262d7493c2370dbc2c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "46f958fff6851a262d7493c2370dbc2c");
                        return;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        jVar.onNext(b.b(context, Base64.decode(str, 0)));
                    } else {
                        jVar.onNext(b.b(context, str2, file, dioFile));
                    }
                    jVar.onCompleted();
                }
            }).b(rx.schedulers.a.d()).a(rx.android.schedulers.a.a()).a(new rx.functions.b<Map<String, Object>>() { // from class: com.meituan.android.mrn.component.skeleton.b.2
                public static ChangeQuickRedirect a;

                @Override // rx.functions.b
                public final /* synthetic */ void call(Map<String, Object> map2) {
                    Map<String, Object> map3 = map2;
                    Object[] objArr2 = {map3};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "437346e001dc69794566f4527b06a472", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "437346e001dc69794566f4527b06a472");
                    } else {
                        b.b(context, map3, str2, str, aVar);
                    }
                }
            }, new rx.functions.b<Throwable>() { // from class: com.meituan.android.mrn.component.skeleton.b.3
                @Override // rx.functions.b
                public final /* bridge */ /* synthetic */ void call(Throwable th) {
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, Map<String, Object> map, String str, String str2, a aVar) {
        Object[] objArr = {context, map, str, str2, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4b27298a984728b392dda6a221b34050", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4b27298a984728b392dda6a221b34050");
        } else if (map != null) {
            if (map.get("LIST_SKELETON") != null) {
                aVar.a(map);
                if (!TextUtils.isEmpty(str2)) {
                    str = str2;
                }
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                b.put(str, map);
                return;
            }
            aVar.a();
        } else {
            aVar.a();
        }
    }

    private static int a(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0122c513ae7f3fccfb8be997fc514bd6", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0122c513ae7f3fccfb8be997fc514bd6")).intValue() : (int) (i * ((a(context) * 1.0f) / 160.0f) * 1.0f);
    }

    public static int a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b02a266faf5011a728c77dd681e9a8ea", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b02a266faf5011a728c77dd681e9a8ea")).intValue();
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            return displayMetrics.densityDpi;
        }
        return jw.g;
    }

    public static int b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "11611c871108a10359ec98318b85dc4d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "11611c871108a10359ec98318b85dc4d")).intValue();
        }
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelOffset(identifier);
        }
        return 0;
    }
}
