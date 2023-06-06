package com.sankuai.waimai.launcher.provider.pltform;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.dianping.judas.expose.d;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.launcher.model.AppInfo;
import com.sankuai.waimai.platform.capacity.network.errorhanding.c;
import com.sankuai.waimai.platform.domain.manager.exceptions.datastate.b;
import com.sankuai.waimai.platform.utils.l;
import com.sankuai.waimai.platform.widget.dialog.CustomDialog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements com.sankuai.waimai.foundation.core.base.activity.a {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.foundation.core.base.activity.a
    public final void a(BaseActivity baseActivity, Bundle bundle) {
        Object[] objArr = {baseActivity, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e932183165f0a38951daabdd65ad6ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e932183165f0a38951daabdd65ad6ba");
            return;
        }
        b.a().b(bundle);
        Intent intent = baseActivity.getIntent();
        Object[] objArr2 = {intent};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "abf398d5a621d1b50cce31930c3ea75b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "abf398d5a621d1b50cce31930c3ea75b");
        } else if (intent != null) {
            Uri data = intent.getData();
            Uri.Builder builder = data == null ? new Uri.Builder() : data.buildUpon();
            builder.appendQueryParameter(Constants.Environment.KEY_PUSHID, com.sankuai.waimai.platform.b.A().t());
            intent.setData(builder.build());
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.a
    public final void a(final BaseActivity baseActivity) {
        Object[] objArr = {baseActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "084a7dda1f6078bf77eeb68e52fe0378", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "084a7dda1f6078bf77eeb68e52fe0378");
            return;
        }
        com.dianping.widget.view.a a2 = com.dianping.widget.view.a.a();
        Object[] objArr2 = {baseActivity};
        ChangeQuickRedirect changeQuickRedirect2 = com.dianping.widget.view.a.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "b258074301637e5fe02f430521bbe5a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "b258074301637e5fe02f430521bbe5a4");
        } else {
            com.dianping.widget.view.a.b = d.a().a(baseActivity);
            final d a3 = d.a();
            Object[] objArr3 = {baseActivity};
            ChangeQuickRedirect changeQuickRedirect3 = d.a;
            if (PatchProxy.isSupport(objArr3, a3, changeQuickRedirect3, false, "99a536ddb967220542846a817654c0d3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, a3, changeQuickRedirect3, false, "99a536ddb967220542846a817654c0d3");
            } else {
                a3.a(new Runnable() { // from class: com.dianping.judas.expose.d.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Set<b> set;
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "fa91ba2c63947eae4dbd9521edae32f8", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "fa91ba2c63947eae4dbd9521edae32f8");
                        } else if (baseActivity != null && !baseActivity.isFinishing()) {
                            d dVar = a3;
                            Activity activity = baseActivity;
                            Object[] objArr5 = {activity};
                            ChangeQuickRedirect changeQuickRedirect5 = d.a;
                            if (!PatchProxy.isSupport(objArr5, dVar, changeQuickRedirect5, false, "f9d40fee45278cc131f8121234e6ec3f", RobustBitConfig.DEFAULT_VALUE)) {
                                Iterator<a> it = dVar.b.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        set = null;
                                        break;
                                    }
                                    a next = it.next();
                                    if (next.a(activity)) {
                                        set = next.b;
                                        break;
                                    }
                                }
                            } else {
                                set = (Set) PatchProxy.accessDispatch(objArr5, dVar, changeQuickRedirect5, false, "f9d40fee45278cc131f8121234e6ec3f");
                            }
                            if (set != null) {
                                for (b bVar : set) {
                                    bVar.a();
                                }
                            }
                        }
                    }
                }, 300L);
            }
        }
        AppInfo.onActivityStart(baseActivity.getClass());
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.a
    public final void b(BaseActivity baseActivity) {
        Object[] objArr = {baseActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f84f032103ef8c33f3dd89484f36182f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f84f032103ef8c33f3dd89484f36182f");
            return;
        }
        c a2 = c.a();
        Object[] objArr2 = {baseActivity};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "24846051a322806efd58dbdbba30eb51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "24846051a322806efd58dbdbba30eb51");
            return;
        }
        if (a2.b == null) {
            a2.b = new ArrayList();
        }
        a2.b.add(baseActivity);
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.a
    public final void c(BaseActivity baseActivity) {
        Object[] objArr = {baseActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89d79c0dee53a8c93f66a554053832d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89d79c0dee53a8c93f66a554053832d3");
            return;
        }
        c a2 = c.a();
        Object[] objArr2 = {baseActivity};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "47195d8d152521b4dd9e6e6504f4a109", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "47195d8d152521b4dd9e6e6504f4a109");
        } else if (a2.b != null && a2.b.contains(baseActivity)) {
            a2.b.remove(baseActivity);
        }
        baseActivity.s().disable();
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.a
    public final void d(BaseActivity baseActivity) {
        Object[] objArr = {baseActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f25ad2beb13a63380f0bf1325c73fa43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f25ad2beb13a63380f0bf1325c73fa43");
            return;
        }
        l.cancel(baseActivity.w());
        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(baseActivity.w());
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.a
    public final void a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "091842017a8a7f3fa4896d834dc7e0fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "091842017a8a7f3fa4896d834dc7e0fa");
        } else {
            b.a().a(bundle);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.a
    public final void a(BaseActivity baseActivity, int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        Object[] objArr = {baseActivity, Integer.valueOf(i), strArr, iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bb45221850ae8f5ffd0f3d66644a555", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bb45221850ae8f5ffd0f3d66644a555");
        } else if (com.sankuai.waimai.foundation.core.a.b()) {
            try {
                throw new IllegalArgumentException("需要替换隐私SDK接口");
            } catch (Exception e) {
                com.sankuai.waimai.foundation.utils.log.a.b(e);
            }
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.a
    public final void a(final BaseActivity baseActivity, final int i, final String str) {
        Object[] objArr = {baseActivity, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54682e1c5cb885f07a1d1ad03d1ca8b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54682e1c5cb885f07a1d1ad03d1ca8b1");
        } else {
            baseActivity.runOnUiThread(new Runnable() { // from class: com.sankuai.waimai.launcher.provider.pltform.a.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ba64a2bc339430d4bc017a7192dbf51d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ba64a2bc339430d4bc017a7192dbf51d");
                    } else {
                        c.a();
                    }
                }
            });
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.a
    public final void a(final BaseActivity baseActivity, final JSONObject jSONObject) {
        Object[] objArr = {baseActivity, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef1015ff821307492c8c84e9e3c4736a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef1015ff821307492c8c84e9e3c4736a");
        } else if (baseActivity != com.sankuai.waimai.foundation.utils.activity.a.a().b()) {
        } else {
            baseActivity.runOnUiThread(new Runnable() { // from class: com.sankuai.waimai.launcher.provider.pltform.a.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    JSONArray optJSONArray;
                    JSONArray jSONArray;
                    int i = 0;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b9d6b8c2781a7e906a2f18a69173458a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b9d6b8c2781a7e906a2f18a69173458a");
                        return;
                    }
                    com.sankuai.waimai.platform.domain.manager.chamelon.b a2 = com.sankuai.waimai.platform.domain.manager.chamelon.b.a();
                    BaseActivity baseActivity2 = baseActivity;
                    JSONObject jSONObject2 = jSONObject;
                    Object[] objArr3 = {baseActivity2, jSONObject2};
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.platform.domain.manager.chamelon.b.a;
                    if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "e49633fe64141fe4d3711b6848b482ed", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "e49633fe64141fe4d3711b6848b482ed");
                        return;
                    }
                    try {
                        final com.sankuai.waimai.platform.domain.manager.chamelon.a aVar = new com.sankuai.waimai.platform.domain.manager.chamelon.a(baseActivity2);
                        Object[] objArr4 = {baseActivity2, jSONObject2};
                        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.platform.domain.manager.chamelon.a.a;
                        if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "8d14cef3231ed3cdd3272ef9f9b88f97", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "8d14cef3231ed3cdd3272ef9f9b88f97");
                        } else if (baseActivity2 == null || (optJSONArray = jSONObject2.optJSONArray("cmds")) == null || optJSONArray.length() <= 0) {
                        } else {
                            int i2 = 0;
                            while (i2 <= 0) {
                                JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                                if (optJSONObject != null) {
                                    aVar.b = optJSONObject.optString("cmd_type");
                                    aVar.c = optJSONObject.optString("cmd_id");
                                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("cmd_detail");
                                    if (optJSONObject2 != null) {
                                        aVar.d = optJSONObject2.optInt("type");
                                        aVar.e = optJSONObject2.optString("title");
                                        aVar.f = optJSONObject2.optString("message");
                                        aVar.g = optJSONObject2.optString("positive_button");
                                        aVar.h = optJSONObject2.optString("positive_url");
                                        aVar.i = optJSONObject2.optString("negative_button");
                                        aVar.j = optJSONObject2.optString("negative_url");
                                    }
                                }
                                final Set<String> stringSet = baseActivity2.getSharedPreferences("wm_chameleon", i).getStringSet("chameleon_cmd_storage_set", null);
                                if (stringSet == null) {
                                    stringSet = new LinkedHashSet<>(50);
                                }
                                if (TextUtils.isEmpty(aVar.c) || !aVar.b.equals("WINDOW") || aVar.d != 0 || TextUtils.isEmpty(aVar.f) || stringSet.contains(aVar.c)) {
                                    jSONArray = optJSONArray;
                                } else {
                                    aVar.a(aVar.c, stringSet);
                                    String str = aVar.e;
                                    String str2 = aVar.f;
                                    String str3 = aVar.g;
                                    String str4 = aVar.i;
                                    final String str5 = aVar.h;
                                    final String str6 = aVar.j;
                                    final String str7 = aVar.c;
                                    Object[] objArr5 = new Object[9];
                                    objArr5[i] = baseActivity2;
                                    objArr5[1] = str;
                                    objArr5[2] = str2;
                                    objArr5[3] = str3;
                                    objArr5[4] = str4;
                                    objArr5[5] = str5;
                                    objArr5[6] = str6;
                                    objArr5[7] = str7;
                                    objArr5[8] = stringSet;
                                    ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.platform.domain.manager.chamelon.a.a;
                                    jSONArray = optJSONArray;
                                    if (PatchProxy.isSupport(objArr5, aVar, changeQuickRedirect5, false, "8124cdc4b8ec33611dc9e528dfb6e31a", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr5, aVar, changeQuickRedirect5, false, "8124cdc4b8ec33611dc9e528dfb6e31a");
                                    } else {
                                        CustomDialog.a b = new CustomDialog.a(baseActivity2).a(str).b(str2).a(str3, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.platform.domain.manager.chamelon.a.2
                                            public static ChangeQuickRedirect a;

                                            @Override // android.content.DialogInterface.OnClickListener
                                            public final void onClick(DialogInterface dialogInterface, int i3) {
                                                Object[] objArr6 = {dialogInterface, Integer.valueOf(i3)};
                                                ChangeQuickRedirect changeQuickRedirect6 = a;
                                                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "bc01bb13f3fb8424460f3c72899ebd32", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "bc01bb13f3fb8424460f3c72899ebd32");
                                                    return;
                                                }
                                                aVar.a(str7, stringSet);
                                                if (TextUtils.isEmpty(str5)) {
                                                    return;
                                                }
                                                a.a(aVar, str5);
                                            }
                                        }).b(str4, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.platform.domain.manager.chamelon.a.1
                                            public static ChangeQuickRedirect a;

                                            @Override // android.content.DialogInterface.OnClickListener
                                            public final void onClick(DialogInterface dialogInterface, int i3) {
                                                Object[] objArr6 = {dialogInterface, Integer.valueOf(i3)};
                                                ChangeQuickRedirect changeQuickRedirect6 = a;
                                                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "bed21c3ecf91d2b841942c4988267978", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "bed21c3ecf91d2b841942c4988267978");
                                                    return;
                                                }
                                                aVar.a(str7, stringSet);
                                                if (TextUtils.isEmpty(str6)) {
                                                    return;
                                                }
                                                a.a(aVar, str6);
                                            }
                                        });
                                        aVar.a(str7, stringSet);
                                        Object[] objArr6 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect6 = CustomDialog.a.b;
                                        if (PatchProxy.isSupport(objArr6, b, changeQuickRedirect6, false, "6f5b30f7e70d5eaa09b6fcf130e0a0c7", RobustBitConfig.DEFAULT_VALUE)) {
                                            CustomDialog customDialog = (CustomDialog) PatchProxy.accessDispatch(objArr6, b, changeQuickRedirect6, false, "6f5b30f7e70d5eaa09b6fcf130e0a0c7");
                                        } else {
                                            b.a(CustomDialog.d.CENTER);
                                        }
                                    }
                                }
                                i2++;
                                optJSONArray = jSONArray;
                                i = 0;
                            }
                        }
                    } catch (Exception e) {
                        com.sankuai.waimai.foundation.utils.log.a.e(a2.getClass().getSimpleName(), e.getMessage(), new Object[0]);
                    }
                }
            });
        }
    }
}
