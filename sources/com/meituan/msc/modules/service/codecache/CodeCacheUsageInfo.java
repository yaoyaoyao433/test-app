package com.meituan.msc.modules.service.codecache;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class CodeCacheUsageInfo extends CodeCacheKey {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String codeCacheFile;
    private final long createTimeInMs;
    private long fileSize;
    private long lastUseTimeInMs;
    private transient com.meituan.msc.common.utils.collection.a localCacheMap;
    private boolean markedToRemove;
    private int usageCount;

    public void attachLocalCacheMap(com.meituan.msc.common.utils.collection.a aVar) {
        this.localCacheMap = aVar;
    }

    public void saveChanges() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b67e1c898b763e6f0105a24056eb3917", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b67e1c898b763e6f0105a24056eb3917");
        } else if (this.localCacheMap != null) {
            this.localCacheMap.d();
        }
    }

    public CodeCacheUsageInfo(String str, String str2, String str3, String str4, String str5, long j, long j2, int i) {
        super(str, str2, str3, str4);
        Object[] objArr = {str, str2, str3, str4, str5, new Long(j), new Long(j2), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3aa0ea6f44e8e1b5b7cea973ba715398", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3aa0ea6f44e8e1b5b7cea973ba715398");
            return;
        }
        this.markedToRemove = false;
        this.codeCacheFile = str5;
        this.createTimeInMs = j;
        this.usageCount = i;
        this.fileSize = j2;
    }

    public long getCreateTimeInMs() {
        return this.createTimeInMs;
    }

    public long getLastUseTimeInMs() {
        return this.lastUseTimeInMs;
    }

    public void setLastUseTimeInMs(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7a33d175f42b0e2083f86aa802b6b2a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7a33d175f42b0e2083f86aa802b6b2a4");
            return;
        }
        this.lastUseTimeInMs = j;
        saveChanges();
    }

    public int getUsageCount() {
        return this.usageCount;
    }

    public long getFileSize() {
        return this.fileSize;
    }

    public void setFileSize(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1a3f62fa5c7b1f4925ce37c9f2df2a7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1a3f62fa5c7b1f4925ce37c9f2df2a7a");
        } else {
            this.fileSize = j;
        }
    }

    public void setUsageCount(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "20bfb757f5c0c31cb17c3b2234d37134", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "20bfb757f5c0c31cb17c3b2234d37134");
            return;
        }
        this.usageCount = i;
        saveChanges();
    }

    public void usageCountIncrement() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e5cb1a7c577d2c192298640fd16909b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e5cb1a7c577d2c192298640fd16909b6");
        } else {
            usageCountIncrement(1);
        }
    }

    public void usageCountIncrement(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "29704e7968eff64bc36bce8b3739845c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "29704e7968eff64bc36bce8b3739845c");
        } else {
            setUsageCount(this.usageCount + i);
        }
    }

    public String getCodeCacheFile() {
        return this.codeCacheFile;
    }

    public boolean isMarkedToRemove() {
        return this.markedToRemove;
    }

    public void setMarkedToRemove(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d12d1ec859e8fd87912ce8e046e7ad14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d12d1ec859e8fd87912ce8e046e7ad14");
            return;
        }
        this.markedToRemove = z;
        saveChanges();
    }

    public void setCodeCacheFile(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "475d0cf61bd58ff47369b6e1e7d6c68c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "475d0cf61bd58ff47369b6e1e7d6c68c");
            return;
        }
        this.codeCacheFile = str;
        saveChanges();
    }
}
