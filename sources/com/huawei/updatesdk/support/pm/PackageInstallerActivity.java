package com.huawei.updatesdk.support.pm;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.updatesdk.a.a.d.h.c;
import com.huawei.updatesdk.a.b.b.b;
import com.huawei.updatesdk.b.d.e;
import com.huawei.updatesdk.fileprovider.UpdateSdkFileProvider;
import com.meituan.android.privacy.aop.a;
import com.tencent.mapsdk.internal.y;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class PackageInstallerActivity extends Activity {
    private Intent a(Context context, String str) {
        Uri fromFile;
        if (TextUtils.isEmpty(str) || str.contains("../") || str.contains("..") || str.contains("%00") || str.contains(".\\.\\") || str.contains("./")) {
            throw new IllegalArgumentException("getNomalInstallIntent: Not a standard path");
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.INSTALL_PACKAGE");
        if (Build.VERSION.SDK_INT >= 24) {
            intent.addFlags(1);
            fromFile = UpdateSdkFileProvider.getUriForFile(context, context.getApplicationContext().getPackageName() + UpdateSdkFileProvider.AUTHORITIES_SUFFIX, new File(str));
        } else {
            fromFile = Uri.fromFile(new File(str));
        }
        intent.setData(fromFile);
        if (!(context instanceof Activity)) {
            intent.addFlags(y.a);
        }
        return intent;
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        a.a();
        super.onActivityResult(i, i2, intent);
        if (1000 == i) {
            if (i2 == 0) {
                e.a(7, 0);
            } else {
                int a = intent != null ? b.a(intent).a("android.intent.extra.INSTALL_RESULT", -10004) : -10004;
                if (a != 0 && a != 1) {
                    e.a(4, a);
                }
            }
        }
        finish();
        a.b();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        c.d().a(getWindow());
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            com.huawei.updatesdk.a.a.c.a.a.a.b("PackageInstallerActivity", "PackageInstallerActivity error intent");
            return;
        }
        b a = b.a(intent);
        String a2 = a.a("install_path");
        String a3 = a.a("install_packagename");
        if (TextUtils.isEmpty(a2)) {
            e.a(4, -3);
            finish();
            com.huawei.updatesdk.a.a.c.a.a.a.b("PackageInstallerActivity", "PackageInstallerActivity can not find filePath.");
            return;
        }
        try {
            Intent a4 = a(this, a2);
            a4.putExtra("android.intent.extra.NOT_UNKNOWN_SOURCE", true);
            a4.putExtra("android.intent.extra.RETURN_RESULT", true);
            com.huawei.updatesdk.a.a.c.a.a.a.c("PackageInstallerActivity", " onCreate filePath:" + a2 + ",packageName:" + a3 + ",taskId:" + getTaskId());
            startActivityForResult(a4, 1000);
        } catch (Exception unused) {
            com.huawei.updatesdk.a.a.c.a.a.a.b("PackageInstallerActivity", "can not start install action");
            e.a(4, -2);
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        finishActivity(1000);
        super.onDestroy();
    }
}
