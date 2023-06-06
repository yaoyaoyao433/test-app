package com.sankuai.waimai.platform.shop.channellabel;

import android.app.Activity;
import android.app.Application;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.af;
import com.sankuai.waimai.log.judas.JudasManualManager;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static Uri a(Object obj, @NonNull Uri uri, @NonNull Uri uri2) {
        String str;
        com.sankuai.waimai.platform.domain.core.channel.a aVar;
        Object[] objArr = {obj, uri, uri2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9f70f6656581af9149fa9e7d5e7f479e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9f70f6656581af9149fa9e7d5e7f479e");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str2 : uri.getQueryParameterNames()) {
                if (!"target_url".equals(str2)) {
                    String queryParameter = uri.getQueryParameter(str2);
                    Object[] objArr2 = {str2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "daf09169917a5b3303d5e61a3b954e06", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "daf09169917a5b3303d5e61a3b954e06")).booleanValue() : TextUtils.equals(str2, "backurl")) {
                        jSONObject.put("back_url", queryParameter);
                    } else {
                        jSONObject.put(str2, queryParameter);
                    }
                }
            }
            str = jSONObject.toString();
        } catch (Exception unused) {
            str = "";
        }
        Object[] objArr3 = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.platform.domain.core.channel.a.a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "ef9c6c612c42ce2fa0276d69f4e544fe", RobustBitConfig.DEFAULT_VALUE)) {
            aVar = (com.sankuai.waimai.platform.domain.core.channel.a) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "ef9c6c612c42ce2fa0276d69f4e544fe");
        } else {
            aVar = new com.sankuai.waimai.platform.domain.core.channel.a();
            aVar.b = jSONObject.optString("ys");
            aVar.c = jSONObject.optString("ys_id");
            aVar.d = jSONObject.optString("activity_id");
            aVar.f = jSONObject.optString("back_url");
            aVar.e = jSONObject.optString("chname");
            aVar.g = jSONObject.optString("restaurant_id");
        }
        JudasManualManager.b("AdPageView", obj).a("ys", aVar.b).a("ys_id", aVar.c).a("activity_id", aVar.d).a("restaurant_id", aVar.g).b();
        String path = uri2.getPath();
        if ("/pois".equals(path) || "/menu".equals(path) || "/selfdeliveryshop".equals(path)) {
            return af.c(uri2, "ch_ad_params", str);
        }
        if ("/browser".equals(path)) {
            Uri c = af.c(uri2, "ch_ad_params", str);
            String queryParameter2 = c.getQueryParameter("inner_url");
            Uri parse = TextUtils.isEmpty(queryParameter2) ? Uri.EMPTY : Uri.parse(queryParameter2);
            return !af.b(parse) ? af.c(c, "inner_url", af.c(parse, "ch_ad_params", str).toString()) : c;
        }
        if (!TextUtils.isEmpty(path) && com.sankuai.waimai.foundation.core.a.d()) {
            final b bVar = new b(str, path);
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = b.a;
            if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "0994041445ccea2291a2e00d372b567c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "0994041445ccea2291a2e00d372b567c");
            } else if ((com.meituan.android.singleton.b.a instanceof Application) && bVar.d != null && !TextUtils.isEmpty(bVar.d.f)) {
                ((Application) com.meituan.android.singleton.b.a).registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.sankuai.waimai.platform.shop.channellabel.b.1
                    public static ChangeQuickRedirect a;

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
                        Object[] objArr5 = {activity, bundle};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "dafbd7fe0b116ac922d0779fcda55525", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "dafbd7fe0b116ac922d0779fcda55525");
                        }
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityDestroyed(@NonNull Activity activity) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityStarted(@NonNull Activity activity) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityResumed(@NonNull Activity activity) {
                        Object[] objArr5 = {activity};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "41de8430c2262c76a5439abe48d75c49", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "41de8430c2262c76a5439abe48d75c49");
                            return;
                        }
                        b bVar2 = bVar;
                        Object[] objArr6 = {activity};
                        ChangeQuickRedirect changeQuickRedirect6 = b.a;
                        if (PatchProxy.isSupport(objArr6, bVar2, changeQuickRedirect6, false, "d33cc79a213dad6be0cd59d04c39b80e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, bVar2, changeQuickRedirect6, false, "d33cc79a213dad6be0cd59d04c39b80e");
                        } else if (bVar2.b != null || activity.isFinishing() || activity.isDestroyed() || activity.getWindow() == null || activity.getWindow().getDecorView() == null) {
                        } else {
                            String simpleName = activity.getClass().getSimpleName();
                            if ("TransferActivity".equals(simpleName) || "WelcomeActivity".equals(simpleName) || "SplashAdActivity".equals(simpleName)) {
                                return;
                            }
                            if (!"MainActivity".equals(simpleName) || bVar2.e) {
                                try {
                                    ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
                                    if (viewGroup == null) {
                                        return;
                                    }
                                    bVar2.c = LayoutInflater.from(activity).inflate(R.layout.wm_normal_channel_scheme_return_label_layout, (ViewGroup) null);
                                    if (bVar2.c == null) {
                                        return;
                                    }
                                    viewGroup.addView(bVar2.c);
                                    bVar2.b = new ChannelLabelController(activity, bVar2.c.findViewById(R.id.layout_channel_label_normal));
                                    bVar2.b.a(bVar2.d, 9999);
                                } catch (Exception unused2) {
                                }
                            }
                        }
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityPaused(@NonNull Activity activity) {
                        Object[] objArr5 = {activity};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "8a207f4e8af4ee25544bc05d522d00d2", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "8a207f4e8af4ee25544bc05d522d00d2");
                        } else if ("/mine".equals(bVar.f)) {
                            b.a(bVar, activity, this);
                        }
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityStopped(@NonNull Activity activity) {
                        Object[] objArr5 = {activity};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "b92ae97280a7cbe55a0a6ffabaa23b87", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "b92ae97280a7cbe55a0a6ffabaa23b87");
                        } else {
                            b.a(bVar, activity, this);
                        }
                    }
                });
            }
        }
        return uri2;
    }
}
