package com.sankuai.android.share.keymodule.shareChannel.service;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.provider.Telephony;
import android.support.constraint.R;
import com.meituan.android.nom.annotation.NomApiInterface;
import com.meituan.android.nom.annotation.NomServiceInterface;
import com.meituan.android.nom.lyingkit.LyingkitTraceBody;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.share.bean.ShareBaseBean;
import com.sankuai.android.share.constant.a;
import com.sankuai.android.share.interfaces.b;
import com.sankuai.android.share.interfaces.c;
import com.tencent.mapsdk.internal.y;
/* compiled from: ProGuard */
@NomServiceInterface(componentName = "share", keyModuleName = "share", serviceName = "smsService")
/* loaded from: classes3.dex */
public class c extends com.sankuai.android.share.keymodule.b {
    public static ChangeQuickRedirect a;

    @NomApiInterface(alias = "sms")
    public void share(LyingkitTraceBody lyingkitTraceBody, Context context, b.a aVar, ShareBaseBean shareBaseBean, com.sankuai.android.share.interfaces.c cVar) {
        Object[] objArr = {lyingkitTraceBody, context, aVar, shareBaseBean, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80a445a9b7e6e66a77512c35f507d0f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80a445a9b7e6e66a77512c35f507d0f1");
            return;
        }
        Object[] objArr2 = {context, shareBaseBean, aVar, cVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5690e7eafa1631c629e524ef6bbafd6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5690e7eafa1631c629e524ef6bbafd6e");
        } else if (shareBaseBean == null) {
            if (cVar != null) {
                cVar.a(b.a.QZONE, c.a.FAILED);
            }
            com.sankuai.android.share.util.d.a(context, aVar, shareBaseBean, a.EnumC0540a.Data);
        } else {
            if (Build.VERSION.SDK_INT >= 19) {
                String defaultSmsPackage = Telephony.Sms.getDefaultSmsPackage(context);
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setFlags(y.a);
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TEXT", shareBaseBean.getContent() + shareBaseBean.getUrl());
                if (defaultSmsPackage != null) {
                    intent.setPackage(defaultSmsPackage);
                    if (a(context, intent)) {
                        if (cVar != null) {
                            cVar.a(b.a.SMS, c.a.COMPLETE);
                        }
                        com.sankuai.android.share.util.d.a(context, aVar, shareBaseBean);
                        return;
                    } else if (cVar != null) {
                        cVar.a(b.a.SMS, c.a.FAILED);
                        return;
                    } else {
                        return;
                    }
                }
                if (cVar != null) {
                    cVar.a(b.a.QZONE, c.a.FAILED);
                }
                com.sankuai.android.share.util.d.a(context, aVar, shareBaseBean, a.EnumC0540a.ErrorFailedSystem);
            } else {
                PackageManager packageManager = context.getPackageManager();
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.setFlags(y.a);
                intent2.setType("vnd.android-dir/mms-sms");
                if (packageManager.queryIntentActivities(intent2, 0).size() > 0) {
                    intent2.putExtra("sms_body", shareBaseBean.getContent() + shareBaseBean.getUrl());
                    if (a(context, intent2)) {
                        if (cVar != null) {
                            cVar.a(b.a.SMS, c.a.COMPLETE);
                            return;
                        }
                        return;
                    } else if (cVar != null) {
                        cVar.a(b.a.SMS, c.a.FAILED);
                        return;
                    } else {
                        return;
                    }
                }
            }
            com.sankuai.android.share.a.a(context, (int) R.string.share_no_sms);
            if (cVar != null) {
                cVar.a(b.a.SMS, c.a.FAILED);
            }
            com.sankuai.android.share.util.d.a(context, aVar, shareBaseBean, a.EnumC0540a.ErrorFailedSystem);
        }
    }

    private boolean a(Context context, Intent intent) {
        Object[] objArr = {context, intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87fa4a9cf5eb99d7aaddc1dead1d7df3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87fa4a9cf5eb99d7aaddc1dead1d7df3")).booleanValue();
        }
        try {
            context.startActivity(intent);
        } catch (Exception unused) {
        }
        return true;
    }
}
