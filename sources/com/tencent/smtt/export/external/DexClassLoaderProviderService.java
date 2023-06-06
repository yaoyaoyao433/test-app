package com.tencent.smtt.export.external;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.meituan.takeoutnew.util.aop.k;
import com.sankuai.waimai.foundation.core.lifecycle.c;
import com.sankuai.waimai.platform.utils.f;
import java.io.File;
import java.util.ArrayList;
/* loaded from: classes6.dex */
public class DexClassLoaderProviderService extends Service {
    private static final String LOGTAG = "dexloader";

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        c.a(this);
        super.onCreate();
        DexClassLoaderProvider.setForceLoadDexFlag(true, this);
    }

    @Override // android.app.Service
    public void onDestroy() {
        c.b(this);
        k.a(0);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        ArrayList<String> b;
        StringBuilder sb = new StringBuilder("DexClassLoaderProviderService -- onStartCommand(");
        sb.append(intent);
        sb.append(CommonConstant.Symbol.BRACKET_RIGHT);
        if (intent == null) {
            return 1;
        }
        try {
            b = f.b(intent, "dex2oat");
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (b == null) {
            return 1;
        }
        String str = b.get(1);
        String str2 = b.get(2);
        String str3 = b.get(3);
        StringBuilder sb2 = new StringBuilder("DexClassLoaderProviderService -- onStartCommand(");
        sb2.append(b.get(0));
        sb2.append(CommonConstant.Symbol.BRACKET_RIGHT);
        ClassLoader classLoader = getClassLoader();
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdirs();
        }
        DexClassLoaderProvider.createDexClassLoader(str, str2, str3, classLoader, getApplicationContext());
        return 1;
    }
}
