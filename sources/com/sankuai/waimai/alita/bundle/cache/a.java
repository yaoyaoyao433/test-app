package com.sankuai.waimai.alita.bundle.cache;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.common.aidata.ai.bundle.AiDownloadEnv;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.bundle.d;
import com.sankuai.waimai.alita.bundle.download.update.BundleInfo;
import com.sankuai.waimai.alita.core.utils.f;
import java.io.File;
import java.io.FilenameFilter;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public final Context b;
    private final com.sankuai.waimai.alita.bundle.b c;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.alita.bundle.cache.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0691a {
        void a(@NonNull b bVar);

        void a(@NonNull com.sankuai.waimai.alita.bundle.model.a aVar);
    }

    public a(Context context, com.sankuai.waimai.alita.bundle.b bVar) {
        Object[] objArr = {context, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b05c1d178ad66dac822d360e74b016c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b05c1d178ad66dac822d360e74b016c");
            return;
        }
        this.b = context.getApplicationContext();
        this.c = bVar;
    }

    @NonNull
    public String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6960502d03e70fc271c741c5ab682187", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6960502d03e70fc271c741c5ab682187");
        }
        if (com.sankuai.waimai.alita.bundle.b.PROD.equals(this.c)) {
            return com.sankuai.waimai.alita.bundle.a.a().b(this.b) + File.separator + "js" + File.separator + "prod";
        } else if (com.sankuai.waimai.alita.bundle.b.TEST.equals(this.c)) {
            return com.sankuai.waimai.alita.bundle.a.a().b(this.b) + File.separator + "js" + File.separator + "test";
        } else {
            throw new IllegalArgumentException("查询MachBundle缓存异常，请指定AlitaEnv环境参数！");
        }
    }

    public c a(File file, c cVar, String str, String str2) {
        boolean z;
        boolean z2;
        char c = 1;
        int i = 2;
        Object[] objArr = {file, cVar, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb713a4454a80c323988c3fb18bcc0d3", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb713a4454a80c323988c3fb18bcc0d3");
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null && listFiles.length > 0) {
            int length = listFiles.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                File file2 = listFiles[i2];
                if (file2 != null && file2.isDirectory() && !f.e(file2)) {
                    String[] split = file2.getName().split("@");
                    if (split.length >= i) {
                        com.sankuai.waimai.alita.bundle.model.b bVar = new com.sankuai.waimai.alita.bundle.model.b();
                        bVar.b = split[0];
                        bVar.c = split[c];
                        bVar.d = file2.getAbsolutePath();
                        File[] listFiles2 = file2.listFiles();
                        if (listFiles2 != null && listFiles2.length > 0) {
                            for (File file3 : listFiles2) {
                                if (!AiDownloadEnv.FILE_NAME_JS.equals(file3.getName())) {
                                    if (!AiDownloadEnv.FILE_NAME_ENV_JSON.equals(file3.getName())) {
                                        if (!AiDownloadEnv.FILE_NAME_DATA_CVS.equals(file3.getName())) {
                                            if (!AiDownloadEnv.FILE_NAME_JS_CONFIG.equals(file3.getName())) {
                                                if (!AiDownloadEnv.FILE_NAME_AUTO_RUN_STRATEGY.equals(file3.getName())) {
                                                    if (!"model".equals(file3.getName())) {
                                                        if (!AiDownloadEnv.FILE_NAME_MODEL_CONFIG.equals(file3.getName())) {
                                                            if (!AiDownloadEnv.FILE_NAME_MODEL_FEATURE_CONFIG.equals(file3.getName())) {
                                                                if (AiDownloadEnv.FILE_NAME_MODEL_TENSOR_CONFIG.equals(file3.getName())) {
                                                                    bVar.l = file3.getAbsolutePath();
                                                                }
                                                            } else {
                                                                bVar.m = file3.getAbsolutePath();
                                                            }
                                                        } else {
                                                            bVar.k = file3.getAbsolutePath();
                                                        }
                                                    } else {
                                                        bVar.j = file3.getAbsolutePath();
                                                    }
                                                } else {
                                                    bVar.i = file3.getAbsolutePath();
                                                }
                                            } else {
                                                bVar.h = file3.getAbsolutePath();
                                            }
                                        } else {
                                            bVar.g = file3.getAbsolutePath();
                                        }
                                    } else {
                                        bVar.e = file3.getAbsolutePath();
                                    }
                                } else {
                                    bVar.f = file3.getAbsolutePath();
                                }
                            }
                        }
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.alita.bundle.model.b.a;
                        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "9ad464da1ce8f2fdab9718cb85c8e049", RobustBitConfig.DEFAULT_VALUE)) {
                            z2 = ((Boolean) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "9ad464da1ce8f2fdab9718cb85c8e049")).booleanValue();
                        } else {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.alita.bundle.model.b.a;
                            if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "8ac5be92ed19ffcbb2b37de92f666719", RobustBitConfig.DEFAULT_VALUE)) {
                                z = ((Boolean) PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "8ac5be92ed19ffcbb2b37de92f666719")).booleanValue();
                            } else {
                                if (!TextUtils.isEmpty(bVar.f)) {
                                    File file4 = new File(bVar.f);
                                    if (file4.exists() && file4.isFile() && file4.length() > 0) {
                                        z = true;
                                    }
                                }
                                z = false;
                            }
                            z2 = z || bVar.a();
                        }
                        if (!z2) {
                            cVar.b = 5;
                            if (b()) {
                                com.sankuai.waimai.alita.core.utils.c.a("id为[" + file.getName() + "]的模板[" + file2.getName() + "]无效");
                            }
                        } else {
                            cVar.a = new com.sankuai.waimai.alita.bundle.model.a(bVar, str);
                            break;
                        }
                    } else {
                        cVar.b = 5;
                        if (b()) {
                            com.sankuai.waimai.alita.core.utils.c.a("id为[" + file.getName() + "]的模板[" + file2.getName() + "]缺乏版本信息");
                        }
                    }
                }
                i2++;
                c = 1;
                i = 2;
            }
        } else {
            cVar.b = 4;
        }
        return cVar;
    }

    public boolean a(File file) {
        File[] listFiles;
        File[] listFiles2;
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c281810f022197f8cdc2bb3b03af4cd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c281810f022197f8cdc2bb3b03af4cd")).booleanValue();
        }
        if (file == null || !file.isDirectory() || (listFiles = file.listFiles()) == null || listFiles.length == 0) {
            return false;
        }
        for (File file2 : listFiles) {
            if (file2 != null && file2.isDirectory() && !f.e(file2) && (listFiles2 = file2.listFiles(new FilenameFilter() { // from class: com.sankuai.waimai.alita.bundle.cache.a.1
                public static ChangeQuickRedirect a;

                @Override // java.io.FilenameFilter
                public final boolean accept(File file3, String str) {
                    Object[] objArr2 = {file3, str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fd06197515325873b06f69c7c8477534", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fd06197515325873b06f69c7c8477534")).booleanValue() : str.equals(AiDownloadEnv.FILE_NAME_JS) || str.equals(AiDownloadEnv.FILE_NAME_MODEL_CONFIG);
                }
            })) != null && listFiles2.length > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean a(BundleInfo bundleInfo) {
        File[] listFiles;
        Object[] objArr = {bundleInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81fc22ab28671dc9e5060b2e8a9a740e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81fc22ab28671dc9e5060b2e8a9a740e")).booleanValue();
        }
        File file = new File(a(), bundleInfo.getJsId());
        if (!file.exists()) {
            com.sankuai.waimai.alita.core.utils.c.a("AlitaCacheManagerbundleFileDir not exists : " + file.getAbsolutePath());
            return false;
        }
        File[] listFiles2 = file.listFiles();
        if (listFiles2 != null && listFiles2.length > 0) {
            for (File file2 : listFiles2) {
                if (file2 != null && file2.isDirectory() && !f.e(file2)) {
                    String[] split = file2.getName().split("@");
                    if (TextUtils.equals(bundleInfo.getName(), split[0]) && TextUtils.equals(d.b(bundleInfo), split[1]) && (listFiles = file2.listFiles(new FilenameFilter() { // from class: com.sankuai.waimai.alita.bundle.cache.a.2
                        public static ChangeQuickRedirect a;

                        @Override // java.io.FilenameFilter
                        public final boolean accept(File file3, String str) {
                            Object[] objArr2 = {file3, str};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9b271bbd73a09331ea710cdf535826b7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9b271bbd73a09331ea710cdf535826b7")).booleanValue() : str.equals(AiDownloadEnv.FILE_NAME_JS) || str.equals(AiDownloadEnv.FILE_NAME_MODEL_CONFIG);
                        }
                    })) != null && listFiles.length > 0 && listFiles[0].length() > 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bae988e5206f69ebc8a3dcb38a17824d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bae988e5206f69ebc8a3dcb38a17824d")).booleanValue() : com.sankuai.waimai.alita.bundle.a.a().b;
    }

    public final void a(List<String> list) {
        File[] listFiles;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80c20462268b929ba8c1a2a0aa317281", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80c20462268b929ba8c1a2a0aa317281");
        } else if (list != null && !list.isEmpty()) {
            File file = new File(a());
            if (!file.exists() || !file.isDirectory() || (listFiles = file.listFiles()) == null || listFiles.length <= 0) {
                return;
            }
            for (File file2 : listFiles) {
                if (!list.contains(file2.getName())) {
                    com.sankuai.waimai.alita.core.utils.c.a("deleteOfflineBundles - 删除没有下发的Bundle文件：" + file2.getName());
                    f.b(file2);
                }
            }
        }
    }
}
