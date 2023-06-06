package com.vivo.push.d;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.vivo.push.cache.ClientConfigManagerImpl;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class ah extends com.vivo.push.l {
    /* JADX INFO: Access modifiers changed from: package-private */
    public ah(com.vivo.push.o oVar) {
        super(oVar);
    }

    @Override // com.vivo.push.l
    public final void a(com.vivo.push.o oVar) {
        if (this.a == null) {
            com.vivo.push.util.p.d("SendCommandTask", "SendCommandTask " + oVar + " ; mContext is Null");
        } else if (oVar == null) {
            com.vivo.push.util.p.d("SendCommandTask", "SendCommandTask pushCommand is Null");
        } else {
            com.vivo.push.model.b a = com.vivo.push.util.t.a(this.a);
            int b = oVar.b();
            if (b != 0) {
                if (b == 2009) {
                    com.vivo.push.util.p.a(ClientConfigManagerImpl.getInstance(this.a).isDebug());
                    if (com.vivo.push.util.p.a()) {
                        com.vivo.push.e.a().i();
                        com.vivo.push.util.b bVar = new com.vivo.push.util.b();
                        bVar.a(this.a, "com.vivo.push_preferences.hybridapptoken_v1");
                        bVar.a();
                        com.vivo.push.util.b bVar2 = new com.vivo.push.util.b();
                        bVar2.a(this.a, "com.vivo.push_preferences.appconfig_v1");
                        bVar2.a();
                        if (!com.vivo.push.e.a().e()) {
                            ClientConfigManagerImpl.getInstance(this.a).clearPush();
                        }
                    }
                } else if (b == 2011) {
                    com.vivo.push.util.p.a(ClientConfigManagerImpl.getInstance(this.a).isDebug(((com.vivo.push.b.w) oVar).d()));
                } else {
                    switch (b) {
                        case 2002:
                        case 2003:
                        case 2004:
                        case 2005:
                            if (a == null || a.c()) {
                                com.vivo.push.e.a().a(((com.vivo.push.b.c) oVar).h(), 1005);
                                break;
                            } else {
                                com.vivo.push.b.c cVar = (com.vivo.push.b.c) oVar;
                                int a2 = com.vivo.push.util.s.a(cVar);
                                if (a2 != 0) {
                                    com.vivo.push.e.a().a(cVar.h(), a2);
                                    return;
                                }
                            }
                            break;
                    }
                }
            } else if (com.vivo.push.e.a().e()) {
                Context context = this.a;
                Intent intent = new Intent();
                intent.setPackage(context.getPackageName());
                intent.setClassName(context.getPackageName(), "com.vivo.push.sdk.service.CommandService");
                List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 128);
                if (queryIntentServices == null || queryIntentServices.size() <= 0) {
                    com.vivo.push.util.p.d("ModuleUtil", "disableDeprecatedService is null");
                } else {
                    PackageManager packageManager = context.getPackageManager();
                    ComponentName componentName = new ComponentName(context, queryIntentServices.get(0).serviceInfo.name);
                    if (packageManager.getComponentEnabledSetting(componentName) != 2) {
                        packageManager.setComponentEnabledSetting(componentName, 2, 1);
                    }
                }
                Context context2 = this.a;
                Intent intent2 = new Intent();
                intent2.setPackage(context2.getPackageName());
                intent2.setClassName(context2.getPackageName(), "com.vivo.push.sdk.service.LinkProxyActivity");
                List<ResolveInfo> queryIntentActivities = context2.getPackageManager().queryIntentActivities(intent2, 128);
                if (queryIntentActivities == null || queryIntentActivities.size() <= 0) {
                    com.vivo.push.util.p.d("ModuleUtil", "disableDeprecatedActivity is null");
                } else {
                    PackageManager packageManager2 = context2.getPackageManager();
                    ComponentName componentName2 = new ComponentName(context2, queryIntentActivities.get(0).activityInfo.name);
                    if (packageManager2.getComponentEnabledSetting(componentName2) != 2) {
                        packageManager2.setComponentEnabledSetting(componentName2, 2, 1);
                    }
                }
            }
            if (a == null) {
                com.vivo.push.util.p.d("SendCommandTask", "SendCommandTask " + oVar + " ; pushPkgInfo is Null");
                return;
            }
            String a3 = a.a();
            if (a.c()) {
                com.vivo.push.e.a().a(((com.vivo.push.b.c) oVar).h(), 1004);
                oVar = new com.vivo.push.b.e();
                com.vivo.push.util.p.d("SendCommandTask", "SendCommandTask " + oVar + " ; pkgName is InBlackList ");
            }
            com.vivo.push.a.a.a(this.a, a3, oVar);
        }
    }
}
