package com.meituan.msi.api.router;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiApi;
import com.meituan.msi.api.g;
import com.meituan.msi.bean.EventHandler;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.log.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class JumpToLink implements IMsiApi, g {
    public static ChangeQuickRedirect a;

    @MsiApiMethod(name = "jumpToLink", request = JumpToLinkParam.class)
    public void jumpToLink(JumpToLinkParam jumpToLinkParam, MsiContext msiContext) {
        Object[] objArr = {jumpToLinkParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba06a56c11eb370095e4a47cac3b7023", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba06a56c11eb370095e4a47cac3b7023");
            return;
        }
        String str = jumpToLinkParam.url;
        if (TextUtils.isEmpty(str)) {
            msiContext.onError(500, "url is empty");
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        Activity activity = msiContext.getActivity();
        if (activity == null) {
            msiContext.onError(500, "activity is null");
            return;
        }
        PackageManager packageManager = activity.getPackageManager();
        if (packageManager == null) {
            msiContext.onError(500, "packageManager is null");
            return;
        }
        Intent intent2 = new Intent(intent);
        intent2.setPackage(activity.getPackageName());
        ResolveInfo resolveInfo = null;
        try {
            resolveInfo = packageManager.resolveActivity(intent2, 65536);
        } catch (RuntimeException unused) {
            a.a(str + ", jumpToLink fail resolveActivity RuntimeException1");
        }
        if (resolveInfo == null || resolveInfo.activityInfo == null) {
            try {
                resolveInfo = packageManager.resolveActivity(intent2, 0);
            } catch (RuntimeException unused2) {
                a.a(str + ", jumpToLink fail resolveActivity RuntimeException2");
            }
        }
        if (resolveInfo != null && resolveInfo.activityInfo != null) {
            if (msiContext.getEventDispatcher() != null) {
                msiContext.getEventDispatcher().a(EventHandler.EVENT_JUMP_LINK_INNER, "record_page_path");
            }
            intent2.putExtra("name", resolveInfo.activityInfo.name);
            msiContext.startActivityForResult(intent2, 114);
            msiContext.onSuccess("");
            return;
        }
        msiContext.onError(500, "resolveActivity or activityInfo is null");
    }

    @Override // com.meituan.msi.api.g
    public final void a(int i, Intent intent, MsiContext msiContext) {
        Object[] objArr = {Integer.valueOf(i), intent, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7acc525a0b19de5922e2bfbbe2f5537c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7acc525a0b19de5922e2bfbbe2f5537c");
        } else if (msiContext.getEventDispatcher() != null) {
            msiContext.getEventDispatcher().a(EventHandler.EVENT_JUMP_LINK_INNER, "");
        }
    }
}
