package com.meituan.msc.common.utils;

import android.content.Context;
import com.meituan.msi.bean.ContainerInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.newwidgets.pullrefresh.DefaultHeaderService;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class ag {
    public static ChangeQuickRedirect a;
    public static final String b = File.separator;
    public static final String c = DefaultHeaderService.KEY_STORE + b;
    public static final String d = "usr" + b;

    public static String a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e19ffa840440e19a496df9cd4e8bbea7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e19ffa840440e19a496df9cd4e8bbea7");
        }
        return e.a(context, ContainerInfo.ENV_MSC, "mtplatform_msc") + b;
    }

    public static String b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0f7a2b664bf386d6258fbec56bf904b2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0f7a2b664bf386d6258fbec56bf904b2");
        }
        return e.a(context, "hera", "mtplatform_mmp") + b;
    }

    public static File a(String str, String str2) {
        String str3;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9ed9db8779b93dd214ad185d87c9f84d", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9ed9db8779b93dd214ad185d87c9f84d");
        }
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "8839e0c59448ebc71d0f8980e96a137a", RobustBitConfig.DEFAULT_VALUE)) {
            str3 = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "8839e0c59448ebc71d0f8980e96a137a");
        } else {
            str3 = str + "app/";
        }
        File file = new File(str3, str2);
        if (!file.exists() || !file.isDirectory()) {
            file.mkdirs();
        }
        return file;
    }

    public static File a(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9b7ec04cf0051a6e798ad85bd70ba757", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9b7ec04cf0051a6e798ad85bd70ba757");
        }
        File file2 = new File(file, DefaultHeaderService.KEY_STORE);
        if (!file2.exists() || !file2.isDirectory()) {
            file2.mkdirs();
        }
        return file2;
    }

    public static File b(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e47a9e94f379a303b3ac70eb7ecd0384", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e47a9e94f379a303b3ac70eb7ecd0384");
        }
        File file2 = new File(file, "temp");
        if (!file2.exists() || !file2.isDirectory()) {
            file2.mkdirs();
        }
        return file2;
    }

    public static void a(String str, File file) {
        File[] listFiles;
        Object[] objArr = {str, file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ca0f36bb5c15ebd42563f450f6f100b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ca0f36bb5c15ebd42563f450f6f100b2");
        } else if (!com.meituan.msc.common.framework.d.b(str) && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (file2.getName().startsWith("tmp_")) {
                    file2.delete();
                }
            }
        }
    }

    public static File c(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "02956bee3babad8e1bdd1989069b9d09", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "02956bee3babad8e1bdd1989069b9d09");
        }
        File file2 = new File(file, "usr");
        if (!file2.exists() || !file2.isDirectory()) {
            file2.mkdirs();
        }
        return file2;
    }
}
