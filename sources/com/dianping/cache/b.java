package com.dianping.cache;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.meituan.android.neohybrid.v2.neo.bridge.presenter.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.RandomAccessFile;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        public static ChangeQuickRedirect a;
    }

    private static boolean a(File file, byte[] bArr, String str, String str2) {
        FileOutputStream fileOutputStream;
        Object[] objArr = {file, bArr, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        FileOutputStream fileOutputStream2 = null;
        try {
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4f2e2cd31a002766cba98754fa31892b", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4f2e2cd31a002766cba98754fa31892b")).booleanValue();
            }
            try {
                fileOutputStream = new FileOutputStream(file);
            } catch (Exception e) {
                e = e;
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
                Log.e("DPCache", "Dpcache save file error,category = " + str + " and key = " + str2 + ",Exception is\n" + e.toString());
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                }
                return false;
            } catch (Throwable th) {
                th = th;
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
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean a(File file, Parcelable parcelable, String str, String str2) {
        byte[] marshall;
        Object[] objArr = {file, parcelable, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bb2f2ec6763b7913bcd477f463844a86", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bb2f2ec6763b7913bcd477f463844a86")).booleanValue();
        }
        Object[] objArr2 = {parcelable};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "cd83fe49c5d11d4a5a136308efec2507", RobustBitConfig.DEFAULT_VALUE)) {
            marshall = (byte[]) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "cd83fe49c5d11d4a5a136308efec2507");
        } else {
            Parcel obtain = Parcel.obtain();
            parcelable.writeToParcel(obtain, 0);
            marshall = obtain.marshall();
            obtain.recycle();
        }
        return a(file, marshall, str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v3 */
    private static byte[] a(File file) {
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2 = 1;
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        try {
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9c3ee0e5545fca44c5135d5d0f9b0443", RobustBitConfig.DEFAULT_VALUE)) {
                return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9c3ee0e5545fca44c5135d5d0f9b0443");
            }
            try {
                randomAccessFile = new RandomAccessFile(file, r.o);
                try {
                    byte[] bArr = new byte[(int) randomAccessFile.length()];
                    randomAccessFile.read(bArr);
                    try {
                        randomAccessFile.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return bArr;
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    Log.e("DPCache", "FileUtils.getBytes() Throws info: " + a(e));
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    return null;
                }
            } catch (Exception e4) {
                e = e4;
                randomAccessFile = null;
            } catch (Throwable th) {
                th = th;
                randomAccessFile2 = 0;
                if (randomAccessFile2 != 0) {
                    try {
                        randomAccessFile2.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static <T> T a(File file, Parcelable.Creator<T> creator) {
        Parcel obtain;
        Object[] objArr = {file, creator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "acdb2e38514c7f654e70a42674ab7142", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "acdb2e38514c7f654e70a42674ab7142");
        }
        byte[] a2 = a(file);
        if (a2 == null) {
            return null;
        }
        Object[] objArr2 = {a2, creator};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a02cb80b7e2293365223b8dc4c0b492d", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a02cb80b7e2293365223b8dc4c0b492d");
        }
        Object[] objArr3 = {a2};
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "64b07606d92bd049cfbfde034550de2c", RobustBitConfig.DEFAULT_VALUE)) {
            obtain = (Parcel) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "64b07606d92bd049cfbfde034550de2c");
        } else {
            obtain = Parcel.obtain();
            obtain.unmarshall(a2, 0, a2.length);
            obtain.setDataPosition(0);
        }
        T createFromParcel = creator.createFromParcel(obtain);
        obtain.recycle();
        return createFromParcel;
    }

    private static String a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c78758dc3449c6d91472b3193d51bddf", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c78758dc3449c6d91472b3193d51bddf");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                try {
                    th.printStackTrace(new PrintStream(byteArrayOutputStream));
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    throw th2;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                byteArrayOutputStream.close();
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        return byteArrayOutputStream.toString();
    }
}
