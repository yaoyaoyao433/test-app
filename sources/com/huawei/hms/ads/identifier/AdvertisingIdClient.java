package com.huawei.hms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.RemoteException;
import android.provider.Settings;
import android.support.annotation.Keep;
import android.text.TextUtils;
import com.huawei.hms.ads.identifier.aidl.OpenDeviceIdentifierService;
import java.io.IOException;
@Keep
/* loaded from: classes2.dex */
public class AdvertisingIdClient {
    private static final String SETTINGS_AD_ID = "pps_oaid";
    private static final String SETTINGS_TRACK_LIMIT = "pps_track_limit";

    @Keep
    /* loaded from: classes2.dex */
    public static final class Info {
        private final String advertisingId;
        private final boolean limitAdTrackingEnabled;

        @Keep
        public Info(String str, boolean z) {
            this.advertisingId = str;
            this.limitAdTrackingEnabled = z;
        }

        @Keep
        public final String getId() {
            return this.advertisingId;
        }

        @Keep
        public final boolean isLimitAdTrackingEnabled() {
            return this.limitAdTrackingEnabled;
        }
    }

    @Keep
    public static Info getAdvertisingIdInfo(Context context) throws IOException {
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                String string = Settings.Global.getString(context.getContentResolver(), SETTINGS_AD_ID);
                String string2 = Settings.Global.getString(context.getContentResolver(), SETTINGS_TRACK_LIMIT);
                if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                    updateAdvertisingIdInfo(context);
                    return new Info(string, Boolean.valueOf(string2).booleanValue());
                }
            } catch (Throwable unused) {
            }
        }
        return requestAdvertisingIdInfo(context);
    }

    @Keep
    public static boolean isAdvertisingIdAvailable(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            packageManager.getPackageInfo(b.a(context), 128);
            Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
            intent.setPackage(b.a(context));
            return !packageManager.queryIntentServices(intent, 0).isEmpty();
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Info requestAdvertisingIdInfo(Context context) throws IOException {
        try {
            context.getPackageManager().getPackageInfo(b.a(context), 128);
            a aVar = new a();
            Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
            intent.setPackage(b.a(context));
            try {
                if (context.bindService(intent, aVar, 1)) {
                    try {
                        try {
                            OpenDeviceIdentifierService asInterface = OpenDeviceIdentifierService.Stub.asInterface(aVar.a());
                            Info info = new Info(asInterface.getOaid(), asInterface.isOaidTrackLimited());
                            try {
                                context.unbindService(aVar);
                            } catch (Throwable th) {
                                new StringBuilder("unbind ").append(th.getClass().getSimpleName());
                            }
                            return info;
                        } catch (InterruptedException unused) {
                            throw new IOException("bind hms service InterruptedException");
                        }
                    } catch (RemoteException unused2) {
                        throw new IOException("bind hms service RemoteException");
                    }
                }
                throw new IOException("bind failed");
            } catch (Throwable th2) {
                try {
                    context.unbindService(aVar);
                } catch (Throwable th3) {
                    new StringBuilder("unbind ").append(th3.getClass().getSimpleName());
                }
                throw th2;
            }
        } catch (PackageManager.NameNotFoundException unused3) {
            throw new IOException("Service not found");
        }
    }

    private static void updateAdvertisingIdInfo(final Context context) {
        c.a.execute(new Runnable() { // from class: com.huawei.hms.ads.identifier.AdvertisingIdClient.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    AdvertisingIdClient.requestAdvertisingIdInfo(context);
                } catch (Throwable unused) {
                }
            }
        });
    }

    @Keep
    public static boolean verifyAdId(Context context, String str, boolean z) throws AdIdVerifyException {
        Info requestAdvertisingIdInfo = requestAdvertisingIdInfo(context);
        if (requestAdvertisingIdInfo != null && TextUtils.equals(str, requestAdvertisingIdInfo.getId())) {
            if (z == requestAdvertisingIdInfo.isLimitAdTrackingEnabled()) {
                return true;
            }
        }
        return false;
    }
}
