package com.sankuai.waimai.alita.core.dataupload;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class AlitaModelDataUploadConfig {
    public static ChangeQuickRedirect a;
    public String b;
    public int c;
    public int d;
    public List<a> e;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface FeatureType {
        public static final int FEATURE_TYPE_INPUT = 1;
        public static final int FEATURE_TYPE_ORIGIN = 0;
        public static final int FEATURE_TYPE_ORIGIN_AND_INPUT = 2;
    }

    @Nullable
    public static AlitaModelDataUploadConfig a(@Nullable JSONObject jSONObject) {
        a aVar;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c676be240552f23274d121b0d32f6c57", RobustBitConfig.DEFAULT_VALUE)) {
            return (AlitaModelDataUploadConfig) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c676be240552f23274d121b0d32f6c57");
        }
        if (jSONObject != null) {
            AlitaModelDataUploadConfig alitaModelDataUploadConfig = new AlitaModelDataUploadConfig();
            alitaModelDataUploadConfig.b = jSONObject.optString("modelId");
            alitaModelDataUploadConfig.c = jSONObject.optInt("dataType", 0);
            alitaModelDataUploadConfig.d = jSONObject.optInt("sampleRate", 0);
            JSONArray optJSONArray = jSONObject.optJSONArray("label");
            if (optJSONArray != null) {
                alitaModelDataUploadConfig.e = new ArrayList();
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        Object[] objArr2 = {optJSONObject};
                        ChangeQuickRedirect changeQuickRedirect2 = a.a;
                        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "6d1569bc7941a2ce8261595c6ab658b5", RobustBitConfig.DEFAULT_VALUE)) {
                            aVar = (a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "6d1569bc7941a2ce8261595c6ab658b5");
                        } else if (optJSONObject != null) {
                            a aVar2 = new a();
                            aVar2.b = optJSONObject.optString("bid");
                            aVar = aVar2;
                        } else {
                            aVar = null;
                        }
                        if (aVar != null) {
                            alitaModelDataUploadConfig.e.add(aVar);
                        }
                    }
                }
                return alitaModelDataUploadConfig;
            }
            return alitaModelDataUploadConfig;
        }
        return null;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public String b;

        public final boolean a(@Nullable a aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddd663c92f33c6c33b459aa0109463a0", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddd663c92f33c6c33b459aa0109463a0")).booleanValue();
            }
            if (aVar != null) {
                return TextUtils.equals(this.b, aVar.b);
            }
            return false;
        }
    }
}
