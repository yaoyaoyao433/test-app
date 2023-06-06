package com.hhmedic.android.sdk.base.utils.luban;

import android.text.TextUtils;
import com.meituan.robust.common.CommonConstant;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class Checker {
    private static final String GIF = "gif";
    private static final String JPEG = "jpeg";
    private static final String JPG = "jpg";
    private static final String PNG = "png";
    private static final String WEBP = "webp";
    private static final List<String> format;

    Checker() {
    }

    static {
        ArrayList arrayList = new ArrayList();
        format = arrayList;
        arrayList.add("jpg");
        format.add("jpeg");
        format.add(PNG);
        format.add(WEBP);
        format.add("gif");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isImage(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return format.contains(str.substring(str.lastIndexOf(CommonConstant.Symbol.DOT) + 1).toLowerCase());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isJPG(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.substring(str.lastIndexOf(CommonConstant.Symbol.DOT)).toLowerCase();
        return lowerCase.contains("jpg") || lowerCase.contains("jpeg");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String checkSuffix(String str) {
        return TextUtils.isEmpty(str) ? ".jpg" : str.substring(str.lastIndexOf(CommonConstant.Symbol.DOT));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isNeedCompress(int i, String str) {
        if (i > 0) {
            File file = new File(str);
            return file.exists() && file.length() > ((long) (i << 10));
        }
        return true;
    }
}
