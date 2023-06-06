package com.tencent.mapsdk.internal;

import com.meituan.robust.common.StringUtil;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class li extends lm {
    protected String b;

    @Override // com.tencent.mapsdk.internal.lm, com.tencent.mapsdk.internal.le
    public final InputStream e(String str) {
        try {
            String file = new URL(str).getFile();
            if (!hb.a(file)) {
                this.b = file.substring(file.lastIndexOf("/") + 1).replace("%20", StringUtil.SPACE);
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return super.e(str);
    }

    private String c() {
        return this.b;
    }
}
