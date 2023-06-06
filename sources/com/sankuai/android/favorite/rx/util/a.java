package com.sankuai.android.favorite.rx.util;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final DecimalFormat b = new DecimalFormat("0.##");

    public static String a(File file) {
        BufferedReader bufferedReader;
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        BufferedReader bufferedReader2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0a9e38961e55ea21271f215eb8d907c5", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0a9e38961e55ea21271f215eb8d907c5");
        }
        if (file == null || !file.exists()) {
            return null;
        }
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
        } catch (Exception unused) {
            bufferedReader = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            String readLine = bufferedReader.readLine();
            try {
                bufferedReader.close();
                return readLine;
            } catch (IOException e) {
                e.printStackTrace();
                return readLine;
            }
        } catch (Exception unused2) {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            bufferedReader2 = bufferedReader;
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
            }
            throw th;
        }
    }

    public static void a(File file, String str) throws Exception {
        Object[] objArr = {file, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5066dd083965ccc0e58c9ccf0da72a22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5066dd083965ccc0e58c9ccf0da72a22");
        } else if (file == null) {
        } else {
            File file2 = new File(file.getAbsolutePath() + ".temp");
            if (file2.exists()) {
                file2.delete();
            }
            file2.createNewFile();
            Object[] objArr2 = {file2, str};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "3301d4f7730003dedd1facaeaddd645c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "3301d4f7730003dedd1facaeaddd645c");
            } else if (file2.exists() && !TextUtils.isEmpty(str)) {
                try {
                    FileWriter fileWriter = new FileWriter(file2);
                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                    bufferedWriter.write(str);
                    bufferedWriter.flush();
                    bufferedWriter.close();
                    fileWriter.flush();
                    fileWriter.close();
                } catch (Exception unused) {
                }
            }
            file.delete();
            file2.renameTo(file);
        }
    }

    public static String a(String str, String[] strArr) {
        Object[] objArr = {str, strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "56d0c9cdae050009598389790603dafe", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "56d0c9cdae050009598389790603dafe");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(CommonConstant.Symbol.UNDERLINE);
        for (String str2 : strArr) {
            sb.append(str2);
            sb.append(CommonConstant.Symbol.UNDERLINE);
        }
        return sb.substring(0, sb.length() - 1);
    }

    public static String a(String[] strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f756012cd83118f415047a06bc3302a9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f756012cd83118f415047a06bc3302a9");
        }
        StringBuilder sb = new StringBuilder();
        if (strArr == null || strArr.length == 0) {
            return sb.toString();
        }
        for (String str : strArr) {
            sb.append(str);
            sb.append(CommonConstant.Symbol.COMMA);
        }
        return sb.length() > 0 ? sb.substring(0, sb.length() - 1) : "";
    }
}
