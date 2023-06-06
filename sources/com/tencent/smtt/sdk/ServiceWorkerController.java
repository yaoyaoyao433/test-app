package com.tencent.smtt.sdk;

import android.content.Context;
import android.os.Build;
import com.tencent.smtt.export.external.interfaces.IX5CoreServiceWorkerController;
import com.tencent.smtt.export.external.interfaces.ServiceWorkerClient;
import com.tencent.smtt.export.external.interfaces.ServiceWorkerWebSettings;
/* loaded from: classes6.dex */
public abstract class ServiceWorkerController {
    public static ServiceWorkerController getInstance(Context context) {
        x a = x.a();
        a.a(context);
        if (!a.b()) {
            if (Build.VERSION.SDK_INT >= 24) {
                return new l();
            }
            return null;
        }
        final IX5CoreServiceWorkerController q = x.a().c().q();
        if (q != null) {
            return new ServiceWorkerController() { // from class: com.tencent.smtt.sdk.ServiceWorkerController.1
                @Override // com.tencent.smtt.sdk.ServiceWorkerController
                public final ServiceWorkerWebSettings getServiceWorkerWebSettings() {
                    return IX5CoreServiceWorkerController.this.getServiceWorkerWebSettings();
                }

                @Override // com.tencent.smtt.sdk.ServiceWorkerController
                public final void setServiceWorkerClient(ServiceWorkerClient serviceWorkerClient) {
                    IX5CoreServiceWorkerController.this.setServiceWorkerClient(serviceWorkerClient);
                }
            };
        }
        return null;
    }

    public abstract ServiceWorkerWebSettings getServiceWorkerWebSettings();

    public abstract void setServiceWorkerClient(ServiceWorkerClient serviceWorkerClient);
}
