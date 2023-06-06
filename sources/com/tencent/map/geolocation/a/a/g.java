package com.tencent.map.geolocation.a.a;

import android.content.Context;
import com.meituan.robust.common.CommonConstant;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class g {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<String> a(Context context) {
        File[] listFiles;
        File file = new File(context.getFilesDir(), "TencentLocation/comp");
        if (!file.exists() || !file.isDirectory() || (listFiles = file.listFiles()) == null || listFiles.length <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (File file2 : listFiles) {
            arrayList.add(file2.getName() + CommonConstant.Symbol.COMMA + file2.length() + CommonConstant.Symbol.COMMA + com.tencent.map.geolocation.a.b.h.b(file2));
        }
        return arrayList;
    }
}
