package com.tencent.map.geolocation.a.b;

import android.app.ActivityManager;
import android.content.Context;
import com.meituan.robust.common.CommonConstant;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b {
    public static int a(Context context) {
        String b = h.b(context, "__pro_dex_load_info__", "default");
        boolean z = true;
        if (b.equals("default")) {
            return 1;
        }
        try {
            String[] split = b.split("#");
            if (split != null && split.length > 0) {
                boolean z2 = true;
                for (String str : split) {
                    String[] split2 = str.split("&");
                    if (split2 != null && split2.length == 2 && a(context, Integer.parseInt(split2[0]))) {
                        z2 = false;
                    }
                }
                z = z2;
            }
            return z ? 3 : 4;
        } catch (Exception unused) {
            return 4;
        }
    }

    private static boolean a(Context context, int i) {
        try {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == i) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void b(Context context) {
        String d = h.d(context);
        if (d == null) {
            return;
        }
        int a = h.a();
        String b = h.b(context, "__pro_dex_load_info__", "default");
        if (b.equals("default")) {
            h.a(context, "__pro_dex_load_info__", a + "&" + d + "#");
            return;
        }
        try {
            String[] split = b.split("#");
            if (split == null || split.length <= 0) {
                return;
            }
            boolean z = false;
            for (int i = 0; i < split.length; i++) {
                String[] split2 = split[i].split("&");
                if (split2 != null && split2.length == 2) {
                    String str = split2[1];
                    Integer.parseInt(split2[0]);
                    if (d.equals(str)) {
                        split[i] = a + "&" + d;
                        z = true;
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            for (String str2 : split) {
                sb.append(str2);
                sb.append("#");
            }
            if (!z) {
                sb.append(a);
                sb.append("&");
                sb.append(d);
                sb.append("#");
            }
            h.a(context, "__pro_dex_load_info__", sb.toString());
        } catch (Exception unused) {
        }
    }

    public static void c(Context context) {
        try {
            File file = new File(context.getFilesDir(), "TencentLocation/odex");
            if (!file.exists()) {
                file.mkdirs();
            }
            if (file.canRead() && file.canWrite() && file.canExecute()) {
                com.tencent.map.geolocation.a.a.e.a().a("DMK", "ods:ok");
                return;
            }
            boolean readable = file.setReadable(true);
            boolean writable = file.setWritable(true);
            boolean executable = file.setExecutable(true);
            com.tencent.map.geolocation.a.a.e.a().a("DMK", "ods:" + writable + CommonConstant.Symbol.UNDERLINE + readable + CommonConstant.Symbol.UNDERLINE + executable);
            File[] listFiles = file.listFiles();
            if (listFiles == null || listFiles.length <= 0) {
                return;
            }
            for (File file2 : listFiles) {
                if (file2.canRead() && file2.canWrite() && file2.canExecute()) {
                    com.tencent.map.geolocation.a.a.e.a().a("DMK", "ofs:ok");
                }
                boolean writable2 = file2.setWritable(true);
                boolean readable2 = file2.setReadable(true);
                boolean executable2 = file2.setExecutable(true);
                com.tencent.map.geolocation.a.a.e.a().a("DMK", "ofs:" + writable2 + CommonConstant.Symbol.UNDERLINE + readable2 + CommonConstant.Symbol.UNDERLINE + executable2);
            }
        } catch (Throwable th) {
            com.tencent.map.geolocation.a.a.e.a().a("DMK", "exp:" + th.toString());
        }
    }

    public static boolean d(Context context) {
        String b;
        if (!h.b(context, "__SP_UPDATE_TencentLoc_COMP_SDK_VER__", "").equals(com.tencent.map.geolocation.a.a.h.a) || (b = h.b(context, "__SP_UPDATE_TencentLoc_COMP_INFO__", "")) == null || b.equals("")) {
            return false;
        }
        List<com.tencent.map.geolocation.a.a.a> b2 = h.b(b);
        if (b2.isEmpty()) {
            return false;
        }
        String b3 = h.b(context, "__bad_dex_info__", "preference_default");
        List<com.tencent.map.geolocation.a.a.a> b4 = h.b(b3);
        if (b3.equals("preference_default") || b4.isEmpty() || !a(b2, b4)) {
            byte[] bArr = new byte[2048];
            String str = context.getFilesDir().getAbsolutePath() + File.separator + "TencentLocation/comp";
            String str2 = context.getFilesDir().getAbsolutePath() + File.separator + "TencentLocation/UpCp";
            ArrayList<com.tencent.map.geolocation.a.a.a> arrayList = new ArrayList();
            boolean z = true;
            for (com.tencent.map.geolocation.a.a.a aVar : b2) {
                if (!h.a(str2 + File.separator + aVar.c, str, "tmp_backup_" + aVar.c, bArr)) {
                    File file = new File(str + File.separator + "tmp_backup_" + aVar.c);
                    if (file.exists() && file.isFile()) {
                        file.delete();
                    }
                    z = false;
                } else {
                    arrayList.add(aVar);
                }
            }
            if (!z) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    File file2 = new File(str + File.separator + "tmp_backup_" + ((com.tencent.map.geolocation.a.a.a) it.next()).c);
                    if (file2.exists() && file2.isFile()) {
                        file2.delete();
                    }
                }
                arrayList.clear();
                return false;
            } else if (b2.size() == arrayList.size()) {
                for (com.tencent.map.geolocation.a.a.a aVar2 : arrayList) {
                    File file3 = new File(str, aVar2.c);
                    if (file3.exists() && file3.isFile()) {
                        file3.delete();
                    }
                    new File(str, "tmp_backup_" + aVar2.c).renameTo(file3);
                }
                String a = h.a(arrayList);
                h.a(context, "__SP_Tencent_Loc_COMP_INFO__", a);
                com.tencent.map.geolocation.a.a.e.a(context).a("DBC", a);
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public static boolean e(Context context) {
        boolean z;
        com.tencent.map.geolocation.a.a.a aVar;
        String b = h.b(context);
        h.d(b);
        List<com.tencent.map.geolocation.a.a.a> b2 = h.b(h.b(context, "TencentLocationComp" + File.separator + "comp_list"));
        byte[] bArr = new byte[2048];
        ArrayList arrayList = new ArrayList();
        Iterator<com.tencent.map.geolocation.a.a.a> it = b2.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = true;
                break;
            }
            com.tencent.map.geolocation.a.a.a next = it.next();
            next.c += ".dex";
            String str = "tmp_asset_" + next.c;
            if (!h.a(context, "TencentLocationComp" + File.separator + next.c, b, str, bArr)) {
                File file = new File(b + File.separator + str);
                if (file.exists() && file.isFile()) {
                    file.delete();
                }
                z = false;
            } else {
                arrayList.add(next);
            }
        }
        if (!z) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                File file2 = new File(b + File.separator + "tmp_asset_" + ((com.tencent.map.geolocation.a.a.a) it2.next()).c);
                if (file2.exists() && file2.isFile()) {
                    file2.delete();
                }
            }
            return false;
        } else if (arrayList.size() == b2.size()) {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                File file3 = new File(b, ((com.tencent.map.geolocation.a.a.a) it3.next()).c);
                if (file3.exists() && file3.isFile()) {
                    file3.delete();
                }
                new File(b, "tmp_asset_" + aVar.c).renameTo(file3);
            }
            h.a(context, "__SP_Tencent_Loc_COMP_INFO__", h.a(b2));
            return true;
        } else {
            return false;
        }
    }

    public static boolean a(List<com.tencent.map.geolocation.a.a.a> list, List<com.tencent.map.geolocation.a.a.a> list2) {
        boolean z;
        boolean z2 = true;
        for (com.tencent.map.geolocation.a.a.a aVar : list) {
            if (!aVar.c.contains(".dex")) {
                aVar.c += ".dex";
            }
            Iterator<com.tencent.map.geolocation.a.a.a> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                com.tencent.map.geolocation.a.a.a next = it.next();
                if (!next.c.contains(".dex")) {
                    next.c += ".dex";
                }
                if (aVar.c.equals(next.c) && aVar.d == next.d && aVar.e.equals(next.e)) {
                    z = true;
                    break;
                }
            }
            if (!z) {
                z2 = false;
            }
        }
        return z2;
    }
}
