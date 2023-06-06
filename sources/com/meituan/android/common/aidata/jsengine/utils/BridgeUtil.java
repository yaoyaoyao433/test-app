package com.meituan.android.common.aidata.jsengine.utils;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class BridgeUtil {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r11v2 */
    public static String assetFile2Str(Context context, String str) {
        InputStream inputStream;
        String readLine;
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "78b9b13545f731ec3b7a3bc3528dbed3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "78b9b13545f731ec3b7a3bc3528dbed3");
        }
        if (context != 0) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    try {
                        inputStream = context.getAssets().open(str);
                        try {
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                            StringBuilder sb = new StringBuilder();
                            do {
                                readLine = bufferedReader.readLine();
                                if (readLine != null && !readLine.matches("^\\s*\\/\\/.*")) {
                                    sb.append(readLine);
                                    continue;
                                }
                            } while (readLine != null);
                            bufferedReader.close();
                            inputStream.close();
                            String sb2 = sb.toString();
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException unused) {
                                }
                            }
                            return sb2;
                        } catch (Exception e) {
                            e = e;
                            e.printStackTrace();
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException unused2) {
                                }
                            }
                            return null;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        inputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        context = 0;
                        if (context != 0) {
                            try {
                                context.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return null;
    }
}
