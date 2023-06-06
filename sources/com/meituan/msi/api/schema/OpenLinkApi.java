package com.meituan.msi.api.schema;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiApi;
import com.meituan.msi.bean.ApiException;
import com.meituan.msi.bean.ContainerInfo;
import com.meituan.msi.bean.EventHandler;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.bean.NavActivityInfo;
import com.meituan.msi.context.g;
import com.meituan.msi.context.i;
import com.meituan.msi.log.a;
import com.meituan.msi.util.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class OpenLinkApi implements IMsiApi {
    public static ChangeQuickRedirect a;
    public String b;
    private i c;
    private final String d;
    private final String e;
    private final String f;

    public OpenLinkApi() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1521dabe9c4d195927818da14f1fdc8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1521dabe9c4d195927818da14f1fdc8");
            return;
        }
        this.d = "is_scheme_dispatch_delegate";
        this.e = "7122f6e193de47c1";
        this.f = ContainerInfo.ENV_MSC;
    }

    @MsiApiMethod(isForeground = true, name = "openLink", request = OpenLinkParam.class)
    public void openExternalLink(OpenLinkParam openLinkParam, MsiContext msiContext) {
        ResolveInfo resolveInfo;
        ResolveInfo resolveActivity;
        Intent intent;
        boolean z = false;
        Object[] objArr = {openLinkParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c33d8a1f7b4aebc2e6056bc43475f783", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c33d8a1f7b4aebc2e6056bc43475f783");
            return;
        }
        String str = openLinkParam.url;
        if (!TextUtils.isEmpty(str)) {
            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str));
            Activity activity = msiContext.getActivity();
            this.c = msiContext.getSchemaContext();
            if (activity == null) {
                msiContext.onError("activity is not existed");
                return;
            }
            PackageManager packageManager = activity.getPackageManager();
            if (packageManager != null) {
                Intent intent3 = new Intent(intent2);
                intent3.setPackage(activity.getPackageName());
                try {
                    resolveInfo = packageManager.resolveActivity(intent3, 65536);
                } catch (RuntimeException unused) {
                    a.a(str + ", openLink fail resolveActivity RuntimeException1");
                    resolveInfo = null;
                }
                if (resolveInfo == null || resolveInfo.activityInfo == null) {
                    try {
                        resolveActivity = packageManager.resolveActivity(intent3, 0);
                    } catch (RuntimeException unused2) {
                        a.a(str + ", openLink fail resolveActivity RuntimeException2");
                    }
                    if (resolveActivity == null && resolveActivity.activityInfo != null) {
                        intent3.putExtra("name", resolveActivity.activityInfo.name);
                        Object[] objArr2 = {msiContext};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cf4c366dac927893df81e51d27e7c491", RobustBitConfig.DEFAULT_VALUE)) {
                            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cf4c366dac927893df81e51d27e7c491")).booleanValue();
                        } else if (msiContext.getContainerInfo() != null) {
                            q.a a2 = q.a();
                            if (TextUtils.equals(ContainerInfo.ENV_MSC, msiContext.getContainerInfo().name) && TextUtils.equals("7122f6e193de47c1", msiContext.getContainerInfo().containerId)) {
                                a.a("openlink:当前是闪购业务");
                                if (a2 != null && a2.b) {
                                    z = true;
                                }
                            }
                        }
                        if (z || openLinkParam.enableExtra) {
                            a.a("openlink:is_scheme_dispatch_delegate is true");
                            intent3.putExtra("is_scheme_dispatch_delegate", true);
                        }
                        msiContext.getEventDispatcher().a(EventHandler.EVENT_OPEN_LINK_INNER, str);
                        try {
                            intent = this.c.a("openLink", intent3, openLinkParam.extraData != null ? openLinkParam.extraData.toString() : "");
                        } catch (ApiException unused3) {
                            a.a(str + ", class not found or JSONException");
                            intent = null;
                        }
                        g navActivity = msiContext.getNavActivity();
                        if (navActivity != null) {
                            NavActivityInfo navActivityInfo = new NavActivityInfo();
                            if (openLinkParam.needResult != null && !openLinkParam.needResult.booleanValue()) {
                                navActivityInfo.code = -1;
                            }
                            navActivityInfo.pageId = msiContext.getPageId();
                            navActivityInfo.fromApiName = "openLink";
                            navActivity.a(intent, navActivityInfo, null);
                        } else if (openLinkParam.needResult != null && !openLinkParam.needResult.booleanValue()) {
                            activity.startActivity(intent);
                        } else {
                            activity.startActivityForResult(intent, 98);
                        }
                        msiContext.onSuccess("");
                        return;
                    }
                    this.b = "resolveActivity or activityInfo is null";
                }
                resolveActivity = resolveInfo;
                if (resolveActivity == null) {
                }
                this.b = "resolveActivity or activityInfo is null";
            } else {
                this.b = "packageManager is null";
            }
            if (this.c.a("openLink", str)) {
                msiContext.getEventDispatcher().a(EventHandler.EVENT_OPEN_LINK_INNER, str);
                g navActivity2 = msiContext.getNavActivity();
                if (navActivity2 != null) {
                    NavActivityInfo navActivityInfo2 = new NavActivityInfo();
                    navActivityInfo2.code = 98;
                    navActivityInfo2.pageId = msiContext.getPageId();
                    navActivityInfo2.fromApiName = "openLink";
                    navActivity2.a(intent2, navActivityInfo2, null);
                } else {
                    activity.startActivityForResult(intent2, 98);
                }
                msiContext.onSuccess("");
                return;
            }
            msiContext.onError(str + ", url not support" + this.b);
            return;
        }
        msiContext.onError("url is null");
    }
}
