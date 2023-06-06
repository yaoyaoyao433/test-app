package com.meituan.mmp.lib.update;

import android.text.TextUtils;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.reflect.TypeToken;
import com.meituan.mmp.lib.utils.bd;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MMPAppPropDeserializer implements JsonDeserializer<MMPAppProp>, JsonSerializer<MMPAppProp> {
    public static ChangeQuickRedirect a;

    @Override // com.google.gson.JsonDeserializer
    public /* synthetic */ MMPAppProp deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        boolean z;
        boolean z2 = false;
        Object[] objArr = {jsonElement, type, jsonDeserializationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bae4680fda9af9a8c7533be28d1a6ce", RobustBitConfig.DEFAULT_VALUE)) {
            return (MMPAppProp) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bae4680fda9af9a8c7533be28d1a6ce");
        }
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        MMPAppProp mMPAppProp = (MMPAppProp) com.meituan.mmp.lib.utils.j.b.fromJson(jsonElement, type);
        if (mMPAppProp == null || mMPAppProp.mainPackage == null || mMPAppProp.mainPackage.c() || mMPAppProp.mmpSdk == null || mMPAppProp.mmpSdk.c()) {
            return null;
        }
        if (asJsonObject.has("dioMmpsdk") || asJsonObject.has("dioMainPackage")) {
            mMPAppProp.isDioPackage = true;
        }
        mMPAppProp.mainPackage.r = 2;
        mMPAppProp.mainPackage.g = "main_app";
        mMPAppProp.mainPackage.h = mMPAppProp.appid;
        a(mMPAppProp.mainPackage, mMPAppProp);
        mMPAppProp.mmpSdk.r = 1;
        mMPAppProp.mmpSdk.g = "mmp_sdk";
        MMPPackageInfo mMPPackageInfo = mMPAppProp.mmpSdk;
        String str = mMPAppProp.mmpSdk.d;
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "fac493c0d3b1a98499b66817a5d66bc3", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "fac493c0d3b1a98499b66817a5d66bc3")).booleanValue();
        } else {
            z = !TextUtils.isEmpty(str) && bd.a(str, "4.1") >= 0;
        }
        mMPPackageInfo.q = z;
        a(mMPAppProp.mmpSdk, mMPAppProp);
        mMPAppProp.isInner = (mMPAppProp.isInner || !MMPEnvHelper.getEnvInfo().isThirdMiniProgram(mMPAppProp.appid)) ? true : true;
        if (asJsonObject.has("sub_packages") || asJsonObject.has("dioSubPackages")) {
            String str2 = asJsonObject.has("dioSubPackages") ? "dioSubPackages" : "sub_packages";
            Type type2 = new TypeToken<HashMap<String, MMPPackageInfo>>() { // from class: com.meituan.mmp.lib.update.MMPAppPropDeserializer.1
            }.getType();
            ArrayList<MMPPackageInfo> arrayList = new ArrayList<>();
            for (Map.Entry entry : ((HashMap) com.meituan.mmp.lib.utils.j.b.fromJson(asJsonObject.get(str2), type2)).entrySet()) {
                MMPPackageInfo mMPPackageInfo2 = (MMPPackageInfo) entry.getValue();
                mMPPackageInfo2.g = (String) entry.getKey();
                mMPPackageInfo2.r = 3;
                mMPPackageInfo2.h = mMPAppProp.appid;
                a(mMPPackageInfo2, mMPAppProp);
                if (!mMPPackageInfo2.c()) {
                    arrayList.add(mMPPackageInfo2);
                }
            }
            mMPAppProp.subPackages = arrayList;
        }
        return mMPAppProp;
    }

    @Override // com.google.gson.JsonSerializer
    public /* synthetic */ JsonElement serialize(MMPAppProp mMPAppProp, Type type, JsonSerializationContext jsonSerializationContext) {
        MMPAppProp mMPAppProp2 = mMPAppProp;
        Object[] objArr = {mMPAppProp2, type, jsonSerializationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "adcd11d76785e8d5ad48ae256c5eeea4", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonElement) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "adcd11d76785e8d5ad48ae256c5eeea4");
        }
        JsonObject asJsonObject = com.meituan.mmp.lib.utils.j.b.toJsonTree(mMPAppProp2).getAsJsonObject();
        JsonObject jsonObject = new JsonObject();
        if (mMPAppProp2.subPackages != null && mMPAppProp2.subPackages.size() > 0) {
            Iterator<MMPPackageInfo> it = mMPAppProp2.subPackages.iterator();
            while (it.hasNext()) {
                MMPPackageInfo next = it.next();
                jsonObject.add(next.g, jsonSerializationContext.serialize(next));
            }
        }
        asJsonObject.add("sub_packages", jsonObject);
        return asJsonObject;
    }

    private static void a(MMPPackageInfo mMPPackageInfo, MMPAppProp mMPAppProp) {
        Object[] objArr = {mMPPackageInfo, mMPAppProp};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "228994bc4e83f60148d02744401f5a62", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "228994bc4e83f60148d02744401f5a62");
        } else if (mMPPackageInfo.w == null) {
            mMPPackageInfo.v = mMPAppProp.isDioPackage;
        } else {
            mMPPackageInfo.v = TextUtils.equals(mMPPackageInfo.w, "dio");
        }
    }
}
