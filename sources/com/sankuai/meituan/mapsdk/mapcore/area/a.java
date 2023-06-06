package com.sankuai.meituan.mapsdk.mapcore.area;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.mapcore.net.OutlineConfig;
import com.sankuai.meituan.mapsdk.mapcore.net.b;
import com.sankuai.meituan.mapsdk.mapcore.net.c;
import com.sankuai.meituan.mapsdk.mapcore.outline.Geometry;
import com.sankuai.meituan.mapsdk.maps.TextFileUtils;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a {
    public static ChangeQuickRedirect a = null;
    private static volatile int b = 2;
    private static Geometry c;

    public static /* synthetic */ void a(String str, final Context context) {
        Object[] objArr = {str, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3f00c8f62fcf3f57261f7496beea2114", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3f00c8f62fcf3f57261f7496beea2114");
        } else {
            c.a(str, new b<String>() { // from class: com.sankuai.meituan.mapsdk.mapcore.area.a.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mapsdk.mapcore.net.b
                public final /* synthetic */ void a(int i, Map map, String str2) {
                    Geometry a2;
                    String str3 = str2;
                    Object[] objArr2 = {0, null, str3};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9dc9d2a266b7efd0b88553da9ba9e57f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9dc9d2a266b7efd0b88553da9ba9e57f");
                        return;
                    }
                    com.sankuai.meituan.mapsdk.mapcore.utils.c.c("Area downloadOutlineConfigFile onSuccess.");
                    if (TextUtils.isEmpty(str3)) {
                        com.sankuai.meituan.mapsdk.mapcore.utils.c.d("Area downloadOutlineConfigFile return null, return.");
                        return;
                    }
                    try {
                        a2 = (Geometry) new Gson().fromJson(str3, (Class<Object>) Geometry.class);
                    } catch (Exception unused) {
                        com.sankuai.meituan.mapsdk.mapcore.utils.c.e("Area downloadOutlineConfigFile error: parse json error.");
                        a2 = com.sankuai.meituan.mapsdk.mapcore.utils.a.a(str3);
                    }
                    if (a.c(a2)) {
                        Geometry unused2 = a.c = a2;
                        com.sankuai.meituan.mapsdk.mapcore.utils.c.c("Area downloadOutlineConfigFile() outLineInfo update to version: " + a2.getVersion());
                        a.b(str3, a.d(context).getAbsolutePath());
                        return;
                    }
                    com.sankuai.meituan.mapsdk.mapcore.utils.c.e("Area downloadOutlineConfigFile error: outline info invalidate.");
                }

                @Override // com.sankuai.meituan.mapsdk.mapcore.net.b
                public final void a(Exception exc) {
                    Object[] objArr2 = {exc};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d88014d6d8e02c39c2b95eb5c7885cf2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d88014d6d8e02c39c2b95eb5c7885cf2");
                        return;
                    }
                    com.sankuai.meituan.mapsdk.mapcore.utils.c.e("Area downloadOutlineConfigFile onFailed:" + exc);
                }
            });
        }
    }

    public static void a(final Context context) {
        String version;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "46c5cf68c97d5fa45371f5b82e81ce8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "46c5cf68c97d5fa45371f5b82e81ce8a");
        } else if (c != null && b != 2) {
            com.sankuai.meituan.mapsdk.mapcore.utils.c.c("Area loadOutlineConfig() Already load");
        } else {
            Object[] objArr2 = {context};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "d2df914be9c5204f2f02b83be8d5771a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "d2df914be9c5204f2f02b83be8d5771a");
            } else {
                Geometry c2 = c(context);
                if (c2 != null) {
                    com.sankuai.meituan.mapsdk.mapcore.utils.c.c("Area loadOutlineConfig() from sdcard success: version=" + c2.getVersion());
                } else {
                    c2 = a();
                    if (c2 != null) {
                        com.sankuai.meituan.mapsdk.mapcore.utils.c.c("Area loadOutlineConfig() from asserts success: version=" + c2.getVersion());
                    } else {
                        com.sankuai.meituan.mapsdk.mapcore.utils.c.c("Area loadOutlineConfig() from asserts null");
                    }
                }
                c = c2;
            }
            Object[] objArr3 = {context};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "59e99393eca1b12a023698525d656e21", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "59e99393eca1b12a023698525d656e21");
                return;
            }
            synchronized (a.class) {
                if (b != 2) {
                    return;
                }
                b = 1;
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "a679ca5466fe46901256200f477e7337", RobustBitConfig.DEFAULT_VALUE)) {
                    version = (String) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "a679ca5466fe46901256200f477e7337");
                } else {
                    version = c == null ? "" : c.getVersion();
                }
                c.a(context, version, new b<OutlineConfig>() { // from class: com.sankuai.meituan.mapsdk.mapcore.area.a.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.meituan.mapsdk.mapcore.net.b
                    public final /* synthetic */ void a(int i, Map map, OutlineConfig outlineConfig) {
                        OutlineConfig outlineConfig2 = outlineConfig;
                        Object[] objArr5 = {0, null, outlineConfig2};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "4d554781496be1d59a92887efcaa3b6d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "4d554781496be1d59a92887efcaa3b6d");
                        } else if (outlineConfig2 == null) {
                            com.sankuai.meituan.mapsdk.mapcore.utils.c.d("Area updateAreaInfo(): return invalid outlineConfigResult from service: null");
                        } else {
                            OutlineConfig.Result result = outlineConfig2.getResult();
                            if (result == null || result.getFilePath() == null || result.getVersion() == null) {
                                int unused = a.b = 2;
                                com.sankuai.meituan.mapsdk.mapcore.utils.c.d("Area updateAreaInfo(): return invalid outlineConfigResult from service: " + outlineConfig2.getStatus() + CommonConstant.Symbol.COLON + outlineConfig2.getMsg() + CommonConstant.Symbol.DOT);
                                return;
                            }
                            String filePath = result.getFilePath();
                            String version2 = result.getVersion();
                            if (TextUtils.isEmpty(filePath)) {
                                com.sankuai.meituan.mapsdk.mapcore.utils.c.c("Area updateAreaInfo(): no need to download outlineConfigResult file, already up to date.");
                            } else {
                                com.sankuai.meituan.mapsdk.mapcore.utils.c.c("Area updateAreaInfo(): download outlineConfigResult file: version=" + version2);
                                a.a(filePath, context);
                            }
                            int unused2 = a.b = 0;
                        }
                    }

                    @Override // com.sankuai.meituan.mapsdk.mapcore.net.b
                    public final void a(Exception exc) {
                        Object[] objArr5 = {exc};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "507aab5009b7e7a5f654d13cb8fbf844", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "507aab5009b7e7a5f654d13cb8fbf844");
                            return;
                        }
                        com.sankuai.meituan.mapsdk.mapcore.utils.c.e("Area updateAreaInfo() error:" + exc);
                        int unused = a.b = 2;
                    }
                });
            }
        }
    }

    public static int a(LatLng latLng) {
        Object[] objArr = {latLng};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ed13dd1484529958d6259fc026f46fcf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ed13dd1484529958d6259fc026f46fcf")).intValue();
        }
        if (c == null) {
            c = a();
        }
        Geometry geometry = c;
        if (geometry == null || TextUtils.isEmpty(geometry.getVersion())) {
            return 0;
        }
        ArrayList<ArrayList<LatLng>> poligons = geometry.getMainlands().getPoligons();
        int size = poligons.size();
        for (int i = 0; i < size; i++) {
            if (a(poligons.get(i), latLng)) {
                return 0;
            }
        }
        ArrayList<ArrayList<LatLng>> poligons2 = geometry.getTaiwan().getPoligons();
        int size2 = poligons2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (a(poligons2.get(i2), latLng)) {
                return 1;
            }
        }
        return 2;
    }

    private static boolean a(ArrayList<LatLng> arrayList, LatLng latLng) {
        Object[] objArr = {arrayList, latLng};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "156a1b8e014ad8de8af01dfab6250554", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "156a1b8e014ad8de8af01dfab6250554")).booleanValue();
        }
        if (arrayList == null || arrayList.size() < 3 || latLng == null) {
            return false;
        }
        int size = arrayList.size() - 1;
        boolean z = false;
        for (int i = 0; i < arrayList.size(); i++) {
            if (((arrayList.get(i).latitude < latLng.latitude && arrayList.get(size).latitude >= latLng.latitude) || (arrayList.get(size).latitude < latLng.latitude && arrayList.get(i).latitude >= latLng.latitude)) && (arrayList.get(i).longitude <= latLng.longitude || arrayList.get(size).longitude <= latLng.longitude)) {
                z ^= arrayList.get(i).longitude + (((latLng.latitude - arrayList.get(i).latitude) / (arrayList.get(size).latitude - arrayList.get(i).latitude)) * (arrayList.get(size).longitude - arrayList.get(i).longitude)) < latLng.longitude;
            }
            size = i;
        }
        return z;
    }

    private static synchronized Geometry c(Context context) {
        Geometry a2;
        synchronized (a.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "88f4e75e6fdf638dc940328354f3b42a", RobustBitConfig.DEFAULT_VALUE)) {
                return (Geometry) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "88f4e75e6fdf638dc940328354f3b42a");
            }
            try {
                a2 = (Geometry) new Gson().fromJson(TextFileUtils.getFileContent(d(context)), (Class<Object>) Geometry.class);
            } catch (FileNotFoundException unused) {
                com.sankuai.meituan.mapsdk.mapcore.utils.c.c("Area loadOutlineConfigFromSdcard file not found.");
                return null;
            } catch (Exception e) {
                com.sankuai.meituan.mapsdk.mapcore.utils.c.d("Area loadOutlineConfigFromSdcard error: " + e);
                try {
                    a2 = com.sankuai.meituan.mapsdk.mapcore.utils.a.a(TextFileUtils.getFileContent(d(context)));
                } catch (IOException unused2) {
                    return null;
                }
            }
            if (c(a2)) {
                return a2;
            }
            com.sankuai.meituan.mapsdk.mapcore.utils.c.d("Area loadOutlineConfigFromSdcard error: outline in sdcard is invalidate.");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean c(Geometry geometry) {
        Object[] objArr = {geometry};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "510b90bde2edf9fd3317b346d022d166", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "510b90bde2edf9fd3317b346d022d166")).booleanValue() : (geometry == null || geometry.getVersion() == null || geometry.getMainlands() == null || geometry.getTaiwan() == null) ? false : true;
    }

    private static Geometry a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "abc38dae676e189fd2ce05af7f4327bf", RobustBitConfig.DEFAULT_VALUE)) {
            return (Geometry) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "abc38dae676e189fd2ce05af7f4327bf");
        }
        Context a2 = com.sankuai.meituan.mapsdk.mapcore.a.a();
        if (a2 == null) {
            return null;
        }
        String stringFromAsset = TextFileUtils.getStringFromAsset(a2, "china.json");
        try {
            return (Geometry) new Gson().fromJson(stringFromAsset, (Class<Object>) Geometry.class);
        } catch (Exception unused) {
            return com.sankuai.meituan.mapsdk.mapcore.utils.a.a(stringFromAsset);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void b(String str, String str2) {
        synchronized (a.class) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "32cad1ef27fd3dc94a38ecb8931d1678", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "32cad1ef27fd3dc94a38ecb8931d1678");
            } else {
                com.sankuai.waimai.launcher.util.aop.b.a(new AsyncTaskC0607a(), str, str2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static File d(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b6aecf187f1d96425ae2383fa74c878f", RobustBitConfig.DEFAULT_VALUE) ? (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b6aecf187f1d96425ae2383fa74c878f") : com.sankuai.meituan.mapfoundation.storage.b.a("map_sdk", "map_config/outline/outline.json", false);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.meituan.mapsdk.mapcore.area.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class AsyncTaskC0607a extends AsyncTask<String, Integer, Boolean> {
        public static ChangeQuickRedirect a;

        public AsyncTaskC0607a() {
        }

        @Override // android.os.AsyncTask
        public final /* synthetic */ Boolean doInBackground(String[] strArr) {
            String[] strArr2 = strArr;
            Object[] objArr = {strArr2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2c18e3ae12c669f818d891b243cb7e4", RobustBitConfig.DEFAULT_VALUE)) {
                return (Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2c18e3ae12c669f818d891b243cb7e4");
            }
            if (strArr2.length != 2) {
                com.sankuai.meituan.mapsdk.mapcore.utils.c.d("Area WriteFileTask params count is invalid: " + strArr2.length);
                return Boolean.FALSE;
            }
            return Boolean.valueOf(a(strArr2[0], strArr2[1]));
        }

        @Override // android.os.AsyncTask
        public final /* synthetic */ void onPostExecute(Boolean bool) {
            Boolean bool2 = bool;
            Object[] objArr = {bool2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c166d7c1adc3dc37c30314eff16f6302", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c166d7c1adc3dc37c30314eff16f6302");
                return;
            }
            super.onPostExecute(bool2);
            if (bool2.booleanValue()) {
                com.sankuai.meituan.mapsdk.mapcore.utils.c.c("Area WriteFileTask success.");
            } else {
                com.sankuai.meituan.mapsdk.mapcore.utils.c.c("Area WriteFileTask failed.");
            }
        }

        private boolean a(String str, String str2) {
            byte[] bytes;
            FileOutputStream fileOutputStream;
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5349f11b84093d8b081d55f2c2d322f", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5349f11b84093d8b081d55f2c2d322f")).booleanValue();
            }
            FileOutputStream fileOutputStream2 = null;
            try {
                try {
                    bytes = str.getBytes();
                    File file = new File(str2);
                    if (file.exists()) {
                        file.delete();
                    }
                    file.createNewFile();
                    fileOutputStream = new FileOutputStream(file);
                } catch (Throwable th) {
                    th = th;
                }
            } catch (IOException e) {
                e = e;
            }
            try {
                fileOutputStream.write(bytes);
                try {
                    fileOutputStream.close();
                } catch (IOException e2) {
                    com.sankuai.meituan.mapsdk.mapcore.utils.c.e("Area WriteFileTask writeToSdcard() error: " + e2);
                }
                return true;
            } catch (IOException e3) {
                e = e3;
                fileOutputStream2 = fileOutputStream;
                com.sankuai.meituan.mapsdk.mapcore.utils.c.e("Area WriteFileTask writeToSdcard() error: " + e);
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e4) {
                        com.sankuai.meituan.mapsdk.mapcore.utils.c.e("Area WriteFileTask writeToSdcard() error: " + e4);
                    }
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream2 = fileOutputStream;
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e5) {
                        com.sankuai.meituan.mapsdk.mapcore.utils.c.e("Area WriteFileTask writeToSdcard() error: " + e5);
                    }
                }
                throw th;
            }
        }
    }
}
