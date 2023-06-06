package com.sankuai.android.share.keymodule.SharePanel;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.util.SparseArray;
import com.meituan.android.nom.annotation.NomApiInterface;
import com.meituan.android.nom.annotation.NomServiceInterface;
import com.meituan.android.nom.lyingkit.LyingkitTraceBody;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.share.ShareActivity;
import com.sankuai.android.share.bean.ShareBaseBean;
import com.sankuai.android.share.interfaces.e;
import com.sankuai.android.share.util.j;
/* compiled from: ProGuard */
@NomServiceInterface(componentName = "share", keyModuleName = "share", serviceName = "panelService")
/* loaded from: classes3.dex */
public class c {
    public static ChangeQuickRedirect a;

    @NomApiInterface(alias = "show")
    public void show(LyingkitTraceBody lyingkitTraceBody, Activity activity, SparseArray<ShareBaseBean> sparseArray, ShareBaseBean shareBaseBean, e eVar, boolean z, int i, boolean z2) {
        Object[] objArr = {lyingkitTraceBody, activity, sparseArray, shareBaseBean, eVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "638e7e02badef074927e6b78fdcef30b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "638e7e02badef074927e6b78fdcef30b");
            return;
        }
        Intent a2 = j.a(Uri.parse("imeituan://www.meituan.com/shareActivity"));
        ShareActivity.a.a(String.valueOf(activity.hashCode()), eVar);
        if (sparseArray == null) {
            a2.putExtra("extra_share_data", shareBaseBean);
        } else {
            Bundle bundle = new Bundle();
            bundle.putSparseParcelableArray("extra_share_data", sparseArray);
            a2.putExtra("extra_share_data", bundle);
        }
        a2.setPackage(activity.getPackageName());
        a2.putExtra("listenercode", String.valueOf(activity.hashCode()));
        a2.putExtra("tracebody", lyingkitTraceBody);
        a2.putExtra("image_type", z2);
        if (z) {
            Object[] objArr2 = {activity, a2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dcaa748e6cdb36acfbaed7510a8baffc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dcaa748e6cdb36acfbaed7510a8baffc");
                return;
            } else if (activity == null || activity.isFinishing() || a2 == null) {
                return;
            } else {
                String num = Integer.toString(activity.hashCode());
                a2.setPackage(activity.getPackageName());
                a2.putExtra("filter", num);
                LocalBroadcastManager.getInstance(activity).registerReceiver(new ShareBroadcastReceiver(activity), new IntentFilter(num));
                try {
                    activity.startActivityForResult(a2, i);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
        }
        Object[] objArr3 = {activity, a2};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "312e2b004346638b1b46c86b39a5d61a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "312e2b004346638b1b46c86b39a5d61a");
        } else if (activity == null || activity.isFinishing() || a2 == null) {
        } else {
            String num2 = Integer.toString(activity.hashCode());
            a2.setPackage(activity.getPackageName());
            a2.putExtra("filter", num2);
            LocalBroadcastManager.getInstance(activity).registerReceiver(new ShareBroadcastReceiver(activity), new IntentFilter(num2));
            try {
                activity.startActivity(a2);
            } catch (Exception unused2) {
            }
        }
    }
}
