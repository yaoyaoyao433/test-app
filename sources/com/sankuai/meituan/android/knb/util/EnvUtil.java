package com.sankuai.meituan.android.knb.util;

import android.content.Context;
import android.os.Environment;
import android.util.Log;
import com.dianping.titans.service.FileUtil;
import com.dianping.titans.utils.TempUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBRuntime;
import com.sankuai.meituan.android.knb.KNBWebManager;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class EnvUtil {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean TITANS_DEBUG;
    private boolean mInited;
    private File processTempDir;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class Holder {
        public static ChangeQuickRedirect changeQuickRedirect;
        public static EnvUtil instance = new EnvUtil();
    }

    public EnvUtil() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3f78a522b563842f1f7188be67157ba5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3f78a522b563842f1f7188be67157ba5");
        } else {
            this.mInited = false;
        }
    }

    public void init(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d6081a1e4253a4efaed4913458a1c69d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d6081a1e4253a4efaed4913458a1c69d");
        } else if (checkInited()) {
        } else {
            try {
                this.TITANS_DEBUG = new File(Environment.getExternalStorageDirectory().getPath(), context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName.replace(CommonConstant.Symbol.DOT, "") + "03690").exists();
                this.mInited = true;
                if (this.TITANS_DEBUG) {
                    System.out.println("offline debug open");
                }
                this.processTempDir = TempUtil.getTempFile(context);
                final File[] listFiles = this.processTempDir.listFiles();
                if (listFiles == null || listFiles.length <= 1) {
                    return;
                }
                KNBRuntime.getRuntime().executeOnThreadPool(new Runnable() { // from class: com.sankuai.meituan.android.knb.util.EnvUtil.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public void run() {
                        File[] fileArr;
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "dc09ea4c9cf4cfb229e117500eff7f90", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "dc09ea4c9cf4cfb229e117500eff7f90");
                            return;
                        }
                        Log.e("EnvUtil", "delete cache");
                        for (File file : listFiles) {
                            if (!file.getAbsolutePath().equals(EnvUtil.this.processTempDir.getAbsolutePath())) {
                                FileUtil.deleteFileForce(file);
                            }
                        }
                    }
                });
            } catch (Exception unused) {
                this.TITANS_DEBUG = false;
            }
        }
    }

    private boolean checkInited() {
        return this.mInited;
    }

    public static EnvUtil self() {
        return Holder.instance;
    }

    public File getTitansTempDir() {
        return this.processTempDir;
    }

    public boolean debugTitans() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b6a7fafec677d9c5306808aa850b6059", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b6a7fafec677d9c5306808aa850b6059")).booleanValue() : this.TITANS_DEBUG || KNBWebManager.isDebug();
    }
}
