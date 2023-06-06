package com.dianping.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.meituan.android.neohybrid.v2.neo.bridge.presenter.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d {
    public static ChangeQuickRedirect a;
    private static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    private static boolean a(File file, byte[] bArr) {
        FileOutputStream fileOutputStream;
        Object[] objArr = {file, bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        FileOutputStream fileOutputStream2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6dc5202bfe9860e2a0de3ffbdb38c332", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6dc5202bfe9860e2a0de3ffbdb38c332")).booleanValue();
        }
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            fileOutputStream.write(bArr);
            fileOutputStream.flush();
            try {
                fileOutputStream.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            return true;
        } catch (Exception e3) {
            e = e3;
            fileOutputStream2 = fileOutputStream;
            e.printStackTrace();
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
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
                    e5.printStackTrace();
                }
            }
            throw th;
        }
    }

    public static boolean a(File file, Parcelable parcelable) {
        byte[] marshall;
        Object[] objArr = {file, parcelable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "71b62d1ccea059acae2d9faed1b4d55a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "71b62d1ccea059acae2d9faed1b4d55a")).booleanValue();
        }
        Object[] objArr2 = {parcelable};
        ChangeQuickRedirect changeQuickRedirect2 = i.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "40f9e171d64621c581ee7001682eb8eb", RobustBitConfig.DEFAULT_VALUE)) {
            marshall = (byte[]) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "40f9e171d64621c581ee7001682eb8eb");
        } else {
            Parcel obtain = Parcel.obtain();
            parcelable.writeToParcel(obtain, 0);
            marshall = obtain.marshall();
            obtain.recycle();
        }
        return a(file, marshall);
    }

    private static byte[] b(File file) {
        RandomAccessFile randomAccessFile;
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1531f787ed3d932550cccec8996ca1e5", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1531f787ed3d932550cccec8996ca1e5");
        }
        try {
            randomAccessFile = new RandomAccessFile(file, r.o);
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

    public static String a(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "421537ee0d2d5acad076a5b249771849", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "421537ee0d2d5acad076a5b249771849");
        }
        byte[] b2 = b(file);
        if (b2 != null) {
            return new String(b2, Charset.forName("UTF-8"));
        }
        return null;
    }
}
