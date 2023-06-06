package com.sankuai.waimai.alita.core.dataupload;

import com.meituan.android.common.aidata.ai.mlmodel.predictor.MLModelEngineManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    public String d;
    public String e;
    public Map<String, ?> f;
    public Map<String, ?> g;
    public JSONObject h;
    public int i;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "137715a67854b683baf8af8c11b2c5f5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "137715a67854b683baf8af8c11b2c5f5");
        } else {
            this.i = 0;
        }
    }

    public final Map<String, Object> a(int i) {
        Map<String, Object> hashMap;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6cf171cc18ef2a7bbb2494c98f72b3f3", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6cf171cc18ef2a7bbb2494c98f72b3f3");
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ba60fec13583f5fa67859bbb70f30745", RobustBitConfig.DEFAULT_VALUE)) {
            hashMap = (Map) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ba60fec13583f5fa67859bbb70f30745");
        } else {
            hashMap = new HashMap<>();
            hashMap.put(MLModelEngineManager.RESULT_KEY_PREDICT_ID, this.e);
            hashMap.put("name", this.b);
            hashMap.put("version", this.c);
            hashMap.put("biz", this.d);
            hashMap.put("output", this.h);
        }
        hashMap.put("featureType", Integer.valueOf(i));
        if (i == 1) {
            hashMap.put("feature", this.g);
        } else {
            hashMap.put("feature", this.f);
        }
        return hashMap;
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8986340788415e231b94dce80f07b48d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8986340788415e231b94dce80f07b48d");
        }
        return "{modelId='" + this.b + "', modelVersion='" + this.c + "', biz='" + this.d + "', predictId='" + this.e + "', result=" + this.h + ", featureType=" + this.i + ", originFeatures=" + this.f + ", processedFeatures=" + this.g + '}';
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public String b;
        public String c;
        public String d;
        public Map<String, ?> e;
        public Map<String, ?> f;
        public JSONObject g;

        public a() {
        }
    }
}
