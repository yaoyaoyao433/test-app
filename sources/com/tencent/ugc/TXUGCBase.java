package com.tencent.ugc;

import android.content.Context;
import com.tencent.liteav.basic.license.LicenceCheck;
import com.tencent.liteav.basic.license.f;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class TXUGCBase {
    private static TXUGCBase sInstance;
    private LicenceCheck mUGCLicenseNewCheck;

    public static TXUGCBase getInstance() {
        if (sInstance == null) {
            synchronized (TXUGCBase.class) {
                if (sInstance == null) {
                    sInstance = new TXUGCBase();
                }
            }
        }
        return sInstance;
    }

    private TXUGCBase() {
    }

    public void setLicence(Context context, String str, String str2) {
        this.mUGCLicenseNewCheck = LicenceCheck.a();
        this.mUGCLicenseNewCheck.a(context, str, str2);
    }

    public String getLicenceInfo(Context context) {
        f fVar = new f();
        LicenceCheck.a().a(fVar, context);
        return fVar.a;
    }
}
