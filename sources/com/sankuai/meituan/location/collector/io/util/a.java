package com.sankuai.meituan.location.collector.io.util;

import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    /* renamed from: com.sankuai.meituan.location.collector.io.util.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0599a {
        public FileOutputStream a;
        public FileLock b;

        public C0599a(FileOutputStream fileOutputStream, FileLock fileLock) {
            this.a = fileOutputStream;
            this.b = fileLock;
        }
    }

    public static C0599a a(File file) {
        FileOutputStream fileOutputStream;
        FileLock tryLock;
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "06cea93ae3eedb7388cb1f23e8f419c2", RobustBitConfig.DEFAULT_VALUE)) {
            return (C0599a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "06cea93ae3eedb7388cb1f23e8f419c2");
        }
        try {
            fileOutputStream = new FileOutputStream(file);
            tryLock = fileOutputStream.getChannel().tryLock();
        } catch (Exception e) {
            LogUtils.a(e);
        }
        if (tryLock == null || !tryLock.isValid()) {
            fileOutputStream.close();
            return null;
        }
        LogUtils.a("file lock");
        return new C0599a(fileOutputStream, tryLock);
    }

    public static void a(C0599a c0599a) {
        Object[] objArr = {c0599a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5264ffa252821e4459386af57586bba2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5264ffa252821e4459386af57586bba2");
        } else if (c0599a == null || c0599a.b == null || !c0599a.b.isValid()) {
        } else {
            try {
                c0599a.b.release();
            } catch (IOException e) {
                LogUtils.a(e);
            }
            try {
                c0599a.a.close();
            } catch (IOException e2) {
                LogUtils.a(e2);
            }
        }
    }
}
