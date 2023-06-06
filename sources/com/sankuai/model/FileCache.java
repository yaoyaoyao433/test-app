package com.sankuai.model;

import android.content.Context;
import android.os.Environment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.model.utils.Strings;
import com.sankuai.model.utils.Utils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class FileCache implements Cache {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final File mCacheDir;
    private String mKey;
    private final File mSdcardDir;
    private long mValidity;

    public FileCache(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "47b750bcb221dff3440ca2cf81fa28fa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "47b750bcb221dff3440ca2cf81fa28fa");
            return;
        }
        this.mCacheDir = context.getCacheDir();
        String format = String.format("/Android/data/%s/cache/", context.getPackageName());
        this.mSdcardDir = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + format);
        if (this.mSdcardDir.exists() || !Utils.hasSdcard()) {
            return;
        }
        this.mSdcardDir.mkdirs();
    }

    @Override // com.sankuai.model.Cache
    public InputStream get() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "34276f5f4d6cb11f436290305799882b", RobustBitConfig.DEFAULT_VALUE)) {
            return (InputStream) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "34276f5f4d6cb11f436290305799882b");
        }
        String md5 = Strings.md5(this.mKey);
        File file = new File(this.mSdcardDir, md5);
        if (!file.exists() || !file.canRead()) {
            file = new File(this.mCacheDir, md5);
        }
        if (file.exists() && file.canRead()) {
            try {
                return new FileInputStream(file);
            } catch (FileNotFoundException unused) {
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.sankuai.model.Cache
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void save(java.io.InputStream r12) {
        /*
            r11 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r12
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.model.FileCache.changeQuickRedirect
            java.lang.String r10 = "2644ca4bb348069a3030a0080899618a"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1b
            com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
            return
        L1b:
            java.lang.String r0 = r11.mKey
            java.lang.String r0 = com.sankuai.model.utils.Strings.toString(r0)
            java.lang.String r0 = com.sankuai.model.utils.Strings.md5(r0)
            r1 = 0
            boolean r2 = com.sankuai.model.utils.Utils.isSdcardFull()
            if (r2 != 0) goto L39
            java.io.File r2 = new java.io.File
            java.io.File r3 = r11.mSdcardDir
            r2.<init>(r3, r0)
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.io.FileNotFoundException -> L39
            r3.<init>(r2)     // Catch: java.io.FileNotFoundException -> L39
            r1 = r3
        L39:
            if (r1 != 0) goto L48
            java.io.File r2 = new java.io.File
            java.io.File r3 = r11.mCacheDir
            r2.<init>(r3, r0)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.io.FileNotFoundException -> L48
            r0.<init>(r2)     // Catch: java.io.FileNotFoundException -> L48
            goto L49
        L48:
            r0 = r1
        L49:
            if (r0 == 0) goto L5b
            com.sankuai.model.utils.IOUtils.copy(r12, r0)     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L57
            com.sankuai.model.utils.IOUtils.close(r0)
            return
        L52:
            r12 = move-exception
            com.sankuai.model.utils.IOUtils.close(r0)
            throw r12
        L57:
            com.sankuai.model.utils.IOUtils.close(r0)
            return
        L5b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.model.FileCache.save(java.io.InputStream):void");
    }

    @Override // com.sankuai.model.Cache
    public boolean hasCache() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fc5927e15cc65ae46573f394911e597c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fc5927e15cc65ae46573f394911e597c")).booleanValue();
        }
        String md5 = Strings.md5(this.mKey);
        File file = new File(this.mSdcardDir, md5);
        if (file.exists() && file.canRead()) {
            return true;
        }
        File file2 = new File(this.mCacheDir, md5);
        return file2.exists() && file2.canRead();
    }

    @Override // com.sankuai.model.Cache
    public boolean isExpired() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "26db65c39b4fc8fa3458a88f353a26c3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "26db65c39b4fc8fa3458a88f353a26c3")).booleanValue();
        }
        String md5 = Strings.md5(this.mKey);
        File file = new File(this.mSdcardDir, md5);
        if (!file.exists() || !file.canRead()) {
            file = new File(this.mCacheDir, md5);
        }
        return (file.exists() && file.canRead() && System.currentTimeMillis() - file.lastModified() <= this.mValidity) ? false : true;
    }

    @Override // com.sankuai.model.Cache
    public void removeCache() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7cf09c3498571fe162c7d73f63fa6cf6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7cf09c3498571fe162c7d73f63fa6cf6");
            return;
        }
        String md5 = Strings.md5(this.mKey);
        File file = new File(this.mSdcardDir, md5);
        if (file.exists() && file.canWrite()) {
            file.delete();
        }
        File file2 = new File(this.mCacheDir, md5);
        if (file2.exists() && file2.canWrite()) {
            file2.delete();
        }
    }

    @Override // com.sankuai.model.Cache
    public Cache setKey(String str) {
        this.mKey = str;
        return this;
    }

    @Override // com.sankuai.model.Cache
    public Cache setValidity(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2e2e9a9263e78adaebe2a0657c6f534a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Cache) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2e2e9a9263e78adaebe2a0657c6f534a");
        }
        this.mValidity = j;
        return this;
    }

    @Override // com.sankuai.model.Cache
    public long getLastModified() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a1cf2a0c10a6dad9fe07720aa61bbeeb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a1cf2a0c10a6dad9fe07720aa61bbeeb")).longValue();
        }
        String md5 = Strings.md5(this.mKey);
        File file = new File(this.mSdcardDir, md5);
        if (!file.exists() || !file.canRead()) {
            file = new File(this.mCacheDir, md5);
        }
        if (file.exists() && file.canRead()) {
            return file.lastModified();
        }
        return 0L;
    }

    @Override // com.sankuai.model.Cache
    public void touch() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8f1639ab3ecc4c1efcbc4d936f380a11", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8f1639ab3ecc4c1efcbc4d936f380a11");
            return;
        }
        String md5 = Strings.md5(this.mKey);
        File file = new File(this.mSdcardDir, md5);
        if (file.exists() && file.canWrite()) {
            file.setLastModified(System.currentTimeMillis());
        }
        File file2 = new File(this.mCacheDir, md5);
        if (file2.exists() && file2.canWrite()) {
            file2.setLastModified(System.currentTimeMillis());
        }
    }
}
