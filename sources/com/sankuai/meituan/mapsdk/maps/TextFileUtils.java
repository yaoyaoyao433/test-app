package com.sankuai.meituan.mapsdk.maps;

import android.content.Context;
import android.content.res.Resources;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class TextFileUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static String getStringFromAsset(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e1633af8149642abeb4d864d842ed18a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e1633af8149642abeb4d864d842ed18a");
        }
        try {
            return getString(context.getAssets().open(str));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String getStringFromResource(Resources resources, int i) {
        Object[] objArr = {resources, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2352b90fd267b19b4bc024c99607e65a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2352b90fd267b19b4bc024c99607e65a") : getString(resources.openRawResource(i));
    }

    public static String getFileContent(String str) throws IOException {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2170d0e31f1ce631fb2c5785e9f190a0", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2170d0e31f1ce631fb2c5785e9f190a0") : getFileContent(new File(str));
    }

    public static String getFileContent(File file) throws IOException {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "feca71d4892d4430699f67d40e6b39a1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "feca71d4892d4430699f67d40e6b39a1");
        }
        StringBuilder sb = new StringBuilder();
        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                    sb.append("\n");
                } else {
                    bufferedReader.close();
                    inputStreamReader.close();
                    fileInputStream.close();
                    return sb.toString();
                }
            } catch (Throwable th) {
                bufferedReader.close();
                inputStreamReader.close();
                fileInputStream.close();
                throw th;
            }
        }
    }

    public static String getString(InputStream inputStream) {
        InputStreamReader inputStreamReader;
        Object[] objArr = {inputStream};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "988319d7aee03618936fc0d3d41b72e3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "988319d7aee03618936fc0d3d41b72e3");
        }
        try {
            inputStreamReader = new InputStreamReader(inputStream);
        } catch (Exception e) {
            e.printStackTrace();
            inputStreamReader = null;
        }
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        StringBuffer stringBuffer = new StringBuffer("");
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                stringBuffer.append(readLine);
                stringBuffer.append("\n");
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
        return stringBuffer.toString();
    }
}
