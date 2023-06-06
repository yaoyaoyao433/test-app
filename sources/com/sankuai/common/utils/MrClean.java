package com.sankuai.common.utils;

import android.content.Context;
import android.os.Environment;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.monitor.model.ErrorCode;
import java.io.File;
import java.text.DecimalFormat;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MrClean {
    private static final long DEFAULT_CLEANAGE = 604800000;
    public static ChangeQuickRedirect changeQuickRedirect;
    private File cacheDir;
    private long cleanAge;
    private File sdcardDir;

    public MrClean(Context context) {
        this(context, DEFAULT_CLEANAGE);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "906e497f187c744166599d4928a1293a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "906e497f187c744166599d4928a1293a");
        }
    }

    public MrClean(Context context, long j) {
        Object[] objArr = {context, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "20725997409571bb5b0fcaafbe6848da", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "20725997409571bb5b0fcaafbe6848da");
            return;
        }
        this.cleanAge = j;
        this.cacheDir = q.a(context, Utils.CHANNEL, (String) null, u.b);
        String format = String.format("/Android/data/%s/cache/", context.getPackageName());
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory != null) {
            this.sdcardDir = new File(externalStorageDirectory.getAbsolutePath() + format);
        }
    }

    public String getCacheSizeWithUnits() {
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2f8fa1186189719c25a11942feb10d71", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2f8fa1186189719c25a11942feb10d71");
        }
        double cacheSize = getCacheSize();
        String[] strArr = {ErrorCode.ERROR_TYPE_B, "KB", "MB"};
        while (cacheSize > 1024.0d && i < 3) {
            cacheSize /= 1024.0d;
            i++;
        }
        return new DecimalFormat("###.##").format(cacheSize) + strArr[i];
    }

    public long getCacheSize() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "09c75978ab0eb39c5af536caddeec76a", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "09c75978ab0eb39c5af536caddeec76a")).longValue() : getInternalCacheSize() + getExternalCacheSize();
    }

    private long getInternalCacheSize() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "88f334445d06e8a2e29d82648c1fe61f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "88f334445d06e8a2e29d82648c1fe61f")).longValue();
        }
        long j = 0;
        File[] listFiles = this.cacheDir.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                j += file.length();
            }
        }
        return j;
    }

    private long getExternalCacheSize() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c18afa481df526e963383da48d3e3b6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c18afa481df526e963383da48d3e3b6")).longValue();
        }
        long j = 0;
        if (this.sdcardDir == null) {
            return 0L;
        }
        File[] listFiles = this.sdcardDir.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                j += file.length();
            }
        }
        return j;
    }

    public Void call() throws Exception {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d3d35951ee58e09a4dda430e0b992503", RobustBitConfig.DEFAULT_VALUE)) {
            return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d3d35951ee58e09a4dda430e0b992503");
        }
        cleanUpCacheDir();
        cleanUpSdcardDir();
        return null;
    }

    private void cleanUpSdcardDir() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ac93101f1690018eb929a8e910421eb9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ac93101f1690018eb929a8e910421eb9");
        } else if (this.sdcardDir != null) {
            File[] listFiles = this.sdcardDir.listFiles();
            boolean isSdcardFull = Utils.isSdcardFull();
            if (listFiles != null) {
                for (File file : listFiles) {
                    if (!file.isDirectory() && (isSdcardFull || isFileExpires(file))) {
                        file.delete();
                    }
                }
            }
        }
    }

    private void cleanUpCacheDir() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2b82a6257a681b7ee1485e3e7962be2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2b82a6257a681b7ee1485e3e7962be2a");
            return;
        }
        File[] listFiles = this.cacheDir.listFiles();
        boolean isDataFull = Utils.isDataFull();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (!file.isDirectory() && (isDataFull || isFileExpires(file))) {
                    file.delete();
                }
            }
        }
    }

    private boolean isFileExpires(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a2faf5f347aaff6de6fa1725e72a923c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a2faf5f347aaff6de6fa1725e72a923c")).booleanValue() : file != null && file.canRead() && file.lastModified() + this.cleanAge <= System.currentTimeMillis();
    }
}
