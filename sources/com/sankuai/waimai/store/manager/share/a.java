package com.sankuai.waimai.store.manager.share;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.Share.ShareTip;
import com.sankuai.waimai.store.platform.domain.core.tip.SCShareTip;
import com.sankuai.waimai.store.util.ab;
import com.sankuai.waimai.store.util.am;
import com.tencent.mapsdk.internal.y;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(Activity activity, SCShareTip sCShareTip, com.sankuai.waimai.store.i.share.a aVar, com.sankuai.waimai.store.i.share.b bVar, Bundle bundle, Map<String, Object> map) {
        Object[] objArr = {activity, sCShareTip, aVar, bVar, bundle, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f22bd50bdd88902a1c4162d1a692a4c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f22bd50bdd88902a1c4162d1a692a4c4");
        } else if (sCShareTip != null && a(activity)) {
            a(activity, sCShareTip, bundle.getInt("source"));
            com.sankuai.waimai.share.b.a(activity, sCShareTip, a(aVar), a(bVar), bundle);
            com.sankuai.waimai.store.manager.judas.b.b(activity, "b_smT3D").b(map).a();
        }
    }

    private static void a(@NonNull Context context, @NonNull ShareTip shareTip, int i) {
        Object[] objArr = {context, shareTip, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aa5fa45c974b20a692dbead8302642c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aa5fa45c974b20a692dbead8302642c3");
            return;
        }
        String description = shareTip.getDescription();
        if (TextUtils.isEmpty(description)) {
            if (i == 4) {
                description = ab.b().b(context, "poi_description", (String) null);
            } else if (i == 5) {
                description = ab.b().b(context, "food_share_description", (String) null);
            }
            shareTip.setDescription(description);
        } else if (i == 4) {
            ab.b().a(context, "poi_description", description);
        } else if (i == 5) {
            ab.b().a(context, "food_share_description", description);
        }
    }

    private static com.sankuai.waimai.foundation.core.service.share.listener.a a(final com.sankuai.waimai.store.i.share.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "acd3c5c7989ab713e32f3f21efa311a7", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.foundation.core.service.share.listener.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "acd3c5c7989ab713e32f3f21efa311a7") : new com.sankuai.waimai.foundation.core.service.share.listener.a() { // from class: com.sankuai.waimai.store.manager.share.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.foundation.core.service.share.listener.a
            public final void a(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5cd805b26db803b016d2ecf474a159bc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5cd805b26db803b016d2ecf474a159bc");
                } else if (com.sankuai.waimai.store.i.share.a.this != null) {
                    com.sankuai.waimai.store.i.share.a.this.a(i);
                }
            }
        };
    }

    private static com.sankuai.waimai.foundation.core.service.share.listener.b a(final com.sankuai.waimai.store.i.share.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "003b922a3742a014923b56f25e06387b", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.foundation.core.service.share.listener.b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "003b922a3742a014923b56f25e06387b") : new com.sankuai.waimai.foundation.core.service.share.listener.b() { // from class: com.sankuai.waimai.store.manager.share.a.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.foundation.core.service.share.listener.b
            public final void a(int i, int i2) {
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4f18694a846c8ecbec4b2703564f44a8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4f18694a846c8ecbec4b2703564f44a8");
                } else if (com.sankuai.waimai.store.i.share.b.this != null) {
                    com.sankuai.waimai.store.i.share.b.this.a(i, i2);
                }
            }
        };
    }

    public static boolean a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8f7e5882494c73b455bd5e04927d1fd6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8f7e5882494c73b455bd5e04927d1fd6")).booleanValue();
        }
        if (a((Context) activity) || b(activity)) {
            return true;
        }
        am.a(activity, (int) R.string.wm_sc_no_sharing_channels);
        return false;
    }

    private static boolean b(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "30daf733163dff487b7ffcf3d21f22e9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "30daf733163dff487b7ffcf3d21f22e9")).booleanValue() : com.sankuai.waimai.share.b.a(activity);
    }

    private static boolean a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d8c342cb7e071c58dd5289458e7cf64c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d8c342cb7e071c58dd5289458e7cf64c")).booleanValue();
        }
        if (context == null) {
            return false;
        }
        try {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.SUBJECT", context.getString(R.string.wm_sc_common_share));
            intent.setFlags(y.a);
            for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(intent, 0)) {
                if (TextUtils.equals("com.tencent.mobileqq", resolveInfo.activityInfo.packageName)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }
}
