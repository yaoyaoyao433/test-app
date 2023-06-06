package com.dianping.imagemanager.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static byte[] a(File file) {
        RandomAccessFile randomAccessFile;
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a1e5498ea43056e403ee1df09f97c63d", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a1e5498ea43056e403ee1df09f97c63d");
        }
        try {
            randomAccessFile = new RandomAccessFile(file, com.meituan.android.neohybrid.v2.neo.bridge.presenter.r.o);
        } catch (Throwable th) {
            th = th;
            randomAccessFile = null;
        }
        try {
            byte[] bArr = new byte[(int) randomAccessFile.length()];
            randomAccessFile.read(bArr);
            try {
                randomAccessFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return bArr;
        } catch (Throwable th2) {
            th = th2;
            try {
                th.printStackTrace();
                return null;
            } finally {
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
    }
}
