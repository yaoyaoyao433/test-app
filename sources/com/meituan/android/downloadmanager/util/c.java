package com.meituan.android.downloadmanager.util;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static <T> boolean a(List<T> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3ccc23d461eb7b98db8bbbc96d5b0ddd", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3ccc23d461eb7b98db8bbbc96d5b0ddd")).booleanValue() : list == null || list.isEmpty();
    }

    private static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9b6ed8249d5751b900ae69aab74c0a35", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9b6ed8249d5751b900ae69aab74c0a35")).booleanValue();
        }
        try {
            return "mounted".equals(Environment.getExternalStorageState());
        } catch (Exception unused) {
            return false;
        }
    }

    private static String a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f81bcbe20b757efae5603dd6781ac743", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f81bcbe20b757efae5603dd6781ac743");
        }
        if (context == null || !a()) {
            return "";
        }
        File b = q.b(context, "download", null, u.b);
        b.mkdirs();
        return b.getAbsolutePath();
    }

    public static String a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1fd7da6e6a953f69b5ecbaadf8873c9f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1fd7da6e6a953f69b5ecbaadf8873c9f");
        }
        String a2 = a(context);
        if (TextUtils.isEmpty(a2)) {
            return a2;
        }
        return a2 + File.separator + b(str) + a(str);
    }

    public static String b(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "96a748b738981a554fd52ce437ebcc10", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "96a748b738981a554fd52ce437ebcc10");
        }
        String a2 = a(context);
        if (TextUtils.isEmpty(a2)) {
            return a2;
        }
        return a2 + File.separator + b(str) + ".state";
    }

    public static String a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "72839672522efc023e0fb39ff6df9950", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "72839672522efc023e0fb39ff6df9950");
        }
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (!file.exists() ? !file.mkdirs() : !file.isDirectory()) {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                return new File(str) + File.separator + b(str2) + a(str2);
            }
        }
        return null;
    }

    public static String a(File file) {
        BufferedReader bufferedReader;
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        BufferedReader bufferedReader2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2e3eb003b0816420e8dc6c38665ceb49", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2e3eb003b0816420e8dc6c38665ceb49");
        }
        if (file.exists()) {
            try {
                bufferedReader = new BufferedReader(new FileReader(file));
            } catch (Exception unused) {
                bufferedReader = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                String readLine = bufferedReader.readLine();
                a(bufferedReader);
                return readLine;
            } catch (Exception unused2) {
                if (bufferedReader != null) {
                    a(bufferedReader);
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 != null) {
                    a(bufferedReader2);
                }
                throw th;
            }
        }
        return null;
    }

    public static void a(File file, String str) throws IOException {
        Object[] objArr = {file, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "643d27335fc47cf1b220f9359f5ce708", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "643d27335fc47cf1b220f9359f5ce708");
            return;
        }
        File file2 = new File(file.getAbsolutePath() + ".temp");
        if (file2.exists()) {
            file2.delete();
        }
        file2.createNewFile();
        b(file2, str);
        file.delete();
        file2.renameTo(file);
    }

    private static void b(File file, String str) {
        FileWriter fileWriter;
        Object[] objArr = {file, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        BufferedWriter bufferedWriter = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d62a484fc1d4010e3d65e61c113090de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d62a484fc1d4010e3d65e61c113090de");
        } else if (!file.exists() || TextUtils.isEmpty(str)) {
        } else {
            try {
                fileWriter = new FileWriter(file);
                try {
                    BufferedWriter bufferedWriter2 = new BufferedWriter(fileWriter);
                    try {
                        bufferedWriter2.write(str);
                        bufferedWriter2.flush();
                        fileWriter.flush();
                        a(bufferedWriter2);
                    } catch (Exception unused) {
                        bufferedWriter = bufferedWriter2;
                        a(bufferedWriter);
                        a(fileWriter);
                    } catch (Throwable th) {
                        th = th;
                        bufferedWriter = bufferedWriter2;
                        a(bufferedWriter);
                        a(fileWriter);
                        throw th;
                    }
                } catch (Exception unused2) {
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception unused3) {
                fileWriter = null;
            } catch (Throwable th3) {
                th = th3;
                fileWriter = null;
            }
            a(fileWriter);
        }
    }

    private static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4106d0ca89dd1852beddec245767f953", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4106d0ca89dd1852beddec245767f953");
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(47);
        int lastIndexOf2 = str.lastIndexOf(46);
        int lastIndexOf3 = str.lastIndexOf(63);
        if (lastIndexOf == -1 || lastIndexOf2 == -1 || lastIndexOf2 <= lastIndexOf) {
            return "";
        }
        if (lastIndexOf3 == -1) {
            return str.substring(lastIndexOf2, str.length());
        }
        return str.substring(lastIndexOf2, lastIndexOf3);
    }

    private static String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f43755c2f566e0d48922e49981405abd", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f43755c2f566e0d48922e49981405abd");
        }
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                String hexString = Integer.toHexString(b);
                if (hexString.length() == 1) {
                    sb.append('0');
                    sb.append(hexString.charAt(hexString.length() - 1));
                } else {
                    sb.append(hexString.substring(hexString.length() - 2));
                }
            }
            return sb.toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void a(Closeable closeable) {
        Object[] objArr = {closeable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0401fe9e1d544465404acbfe6b4a9c79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0401fe9e1d544465404acbfe6b4a9c79");
        } else if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
