package com.sankuai.waimai.platform.capacity.abtest;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.hotel.android.hplus.diagnoseTool.DiagnoseLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.router.core.j;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends a {
    public static ChangeQuickRedirect a;

    private static void b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "441d70121c5b1b638a318d5300591577", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "441d70121c5b1b638a318d5300591577");
        } else {
            b(context, "", -1);
        }
    }

    private static void b(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ba4a5c395ae3c489967ac48f867c6682", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ba4a5c395ae3c489967ac48f867c6682");
        } else {
            a(context, "", i);
        }
    }

    public static void a(Context context, String str, int i) {
        Object[] objArr = {context, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1cbf7170bf52bf560bb53986cd338835", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1cbf7170bf52bf560bb53986cd338835");
        } else {
            b(context, str, i);
        }
    }

    private static void b(Context context, String str, int i) {
        String str2;
        Object[] objArr = {context, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c320167e674fbac56aa02f18949c6640", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c320167e674fbac56aa02f18949c6640");
            return;
        }
        com.sankuai.waimai.router.activity.d dVar = new com.sankuai.waimai.router.activity.d() { // from class: com.sankuai.waimai.platform.capacity.abtest.d.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.router.activity.d
            public final boolean a(@NonNull j jVar, @NonNull Intent intent) throws ActivityNotFoundException, SecurityException {
                Object[] objArr2 = {jVar, intent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e1ac895c5f57f30de25d4254fb14437f", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e1ac895c5f57f30de25d4254fb14437f")).booleanValue();
                }
                Object[] objArr3 = {jVar, intent};
                ChangeQuickRedirect changeQuickRedirect3 = e.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "22a9493af7dbd45de5bb88451ed816e2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "22a9493af7dbd45de5bb88451ed816e2");
                } else {
                    Context context2 = jVar.c;
                    if (context2 instanceof Activity) {
                        List<com.meituan.android.mrn.router.a> c = new com.meituan.android.mrn.router.f((Activity) context2).c();
                        JSONArray jSONArray = new JSONArray();
                        for (com.meituan.android.mrn.router.a aVar : c) {
                            jSONArray.put(aVar.b());
                        }
                        try {
                            if (d.a(jSONArray.toString())) {
                                intent.addFlags(603979776);
                            }
                            ((Activity) jVar.c).startActivity(intent);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    } else {
                        ((Activity) jVar.c).startActivity(intent);
                    }
                }
                return true;
            }
        };
        if (TextUtils.isEmpty(str)) {
            str2 = "wm_router://page/mrn?mrn_biz=waimai&mrn_entry=globalcartold&mrn_component=globalCartOld&source=0";
        } else {
            str2 = "wm_router://page/mrn?mrn_biz=waimai&mrn_entry=globalcartold&mrn_component=globalCartOld&source=0&" + str;
        }
        com.sankuai.waimai.foundation.router.a.a().a(i).a(dVar).a(context, str2);
    }

    public static boolean a(String str) throws JSONException {
        boolean z;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a65c8c5d3be58fd47e101f28e61e9075", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a65c8c5d3be58fd47e101f28e61e9075")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        JSONArray jSONArray = new JSONArray(str);
        if (jSONArray.length() > 0) {
            for (int length = jSONArray.length() - 1; length >= 0; length--) {
                JSONObject jSONObject = jSONArray.getJSONObject(length);
                String optString = jSONObject.optString("type");
                String optString2 = jSONObject.optString("url");
                if (TextUtils.equals(optString, DiagnoseLog.MRN)) {
                    Object[] objArr2 = {optString2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "bcde05b080c1ddbc2a631c278a662573", RobustBitConfig.DEFAULT_VALUE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "bcde05b080c1ddbc2a631c278a662573")).booleanValue();
                    } else {
                        z = !TextUtils.isEmpty(optString2) && TextUtils.equals(Uri.parse(optString2).getQueryParameter("mrn_entry"), "globalcart");
                    }
                    if (z) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c55ca2c44ab9abf2cabb6e98bc871f75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c55ca2c44ab9abf2cabb6e98bc871f75");
        } else {
            b(context);
        }
    }

    public static void a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0055e40339508e0ee760a5d7241bf3cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0055e40339508e0ee760a5d7241bf3cc");
            return;
        }
        Object[] objArr2 = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c4bf8373e11ac9e1d38eee8691b968bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c4bf8373e11ac9e1d38eee8691b968bc");
        } else {
            b(context, str, -1);
        }
    }

    public static void a(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f58c73bbbc036f2b6c81eccf2c61c00e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f58c73bbbc036f2b6c81eccf2c61c00e");
        } else {
            b(context, i);
        }
    }
}
