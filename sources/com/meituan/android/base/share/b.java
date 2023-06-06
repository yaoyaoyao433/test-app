package com.meituan.android.base.share;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.passport.UserCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.uuid.GetUUID;
import com.sankuai.android.share.ShareActivity;
import com.sankuai.android.share.util.d;
import java.util.HashMap;
import java.util.HashSet;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b extends a {
    public static ChangeQuickRedirect b;
    private static String c;
    private static HashSet<String> d;
    private static Activity e;

    static {
        HashSet<String> hashSet = new HashSet<>();
        d = hashSet;
        hashSet.add("com.meituan.android.base.share.CommonShareActivity");
        d.add("com.sankuai.android.share.ShareActivity");
        d.add("com.sankuai.meituan.wxapi.WXEntryActivity");
        d.add("com.sankuai.android.share.keymodule.shareChannel.weibo.WeiboShareActivity");
        d.add("com.tencent.tauth.AuthActivity");
        d.add("com.tencent.connect.common.AssistActivity");
        d.add("com.sina.weibo.sdk.web.WeiboSdkWebActivity");
        d.add("com.sina.weibo.sdk.share.WbShareTransActivity");
        d.add("com.sina.weibo.sdk.share.WbShareToStoryActivity");
    }

    @Override // com.meituan.android.base.share.a, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Uri data;
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d7f3cfa8992b0b85af9c3d196a34056", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d7f3cfa8992b0b85af9c3d196a34056");
            return;
        }
        super.onActivityCreated(activity, bundle);
        if (activity == null || activity.getIntent() == null || (data = activity.getIntent().getData()) == null || !data.isHierarchical()) {
            return;
        }
        String queryParameter = data.getQueryParameter("utm_source");
        String queryParameter2 = data.getQueryParameter("utm_sharesource");
        String queryParameter3 = data.getQueryParameter("utm_fromapp");
        if (TextUtils.equals("appshare", queryParameter) && !TextUtils.isEmpty(queryParameter3)) {
            HashMap hashMap = new HashMap();
            hashMap.put("utm_fromapp", queryParameter3);
            hashMap.put("utm_sharesource", queryParameter2);
            hashMap.put("url", data.toString());
            hashMap.put("uuid", GetUUID.getInstance().getUUID(activity));
            UserCenter userCenter = UserCenter.getInstance(activity);
            if (userCenter != null && userCenter.isLogin()) {
                hashMap.put("user_id", Long.valueOf(userCenter.getUser().id));
            }
            Statistics.getChannel().writeModelView(AppUtil.generatePageInfoKey(activity), "b_giooqgjs", hashMap, "c_sxr976a");
        }
        String a = c.a(data);
        HashMap hashMap2 = new HashMap();
        String a2 = c.a(a);
        hashMap2.put("share_id", a2);
        hashMap2.put("channel", d.c(c.b(a2)));
        hashMap2.put("url", data.toString());
        if (TextUtils.isEmpty(a) || !a.contains("appshare")) {
            return;
        }
        if (TextUtils.equals(activity.getClass().getName(), "com.sankuai.meituan.mbc.dsp.DspActivity")) {
            Statistics.getChannel().writeModelClick(AppUtil.generatePageInfoKey(activity), "b_group_e4e9zqq3_mc", hashMap2, "c_sxr976a");
        } else {
            Statistics.getChannel().writeModelClick(AppUtil.generatePageInfoKey(activity), "b_group_jatki387_mc", hashMap2, "c_sxr976a");
        }
    }

    @Override // com.meituan.android.base.share.a, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac8b0b9a75bed5c5a02d6a08abe049ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac8b0b9a75bed5c5a02d6a08abe049ad");
            return;
        }
        super.onActivityResumed(activity);
        if (activity == null || activity.getClass() == null || (activity instanceof ShareActivity)) {
            return;
        }
        e = activity;
        String name = activity.getClass().getName();
        Object[] objArr2 = {name};
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c75246a9ae4bdbcdb1de50a2a47a4f18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c75246a9ae4bdbcdb1de50a2a47a4f18");
        } else if (TextUtils.isEmpty(name) || d == null || d.contains(name)) {
        } else {
            c = name;
        }
    }

    @Override // com.meituan.android.base.share.a, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b465f3e5c368c21f98d7ff776fccd612", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b465f3e5c368c21f98d7ff776fccd612");
            return;
        }
        super.onActivityDestroyed(activity);
        e = null;
        com.sankuai.android.share.common.util.d.a();
    }

    public static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "98a49d24b0e852241636fe383abd271f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "98a49d24b0e852241636fe383abd271f") : TextUtils.isEmpty(c) ? "" : c;
    }

    public static Activity b() {
        return e;
    }
}
