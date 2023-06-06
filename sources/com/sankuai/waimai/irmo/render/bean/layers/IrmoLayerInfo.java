package com.sankuai.waimai.irmo.render.bean.layers;

import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
import com.sankuai.waimai.foundation.core.service.abtest.IABTestService;
import com.sankuai.waimai.irmo.render.bean.IJSONObjectParser;
import com.sankuai.waimai.irmo.render.bean.assets.IrmoAssetInfo;
import com.sankuai.waimai.irmo.utils.d;
import com.sankuai.waimai.irmo.utils.f;
import com.sankuai.waimai.router.a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class IrmoLayerInfo implements IJSONObjectParser {
    private static final String DSL_LAYERS_BACKGROUND = "background";
    private static final String DSL_LAYERS_EFFECT_PARAMS = "effect_params";
    private static final String DSL_LAYERS_END_TIME = "end_time";
    private static final String DSL_LAYERS_ENGINE_VERSION = "engine_version";
    private static final String DSL_LAYERS_START_TIME = "start_time";
    private static final String DSL_LAYERS_TYPE = "type";
    private static final String DSL_LAYERS_UNSUPPORTED_MODEL = "no_support_model";
    private static final String DSL_LAYERS_UNSUPPORTED_OS = "no_support_os";
    private static final String TAG = "IrmoLayerInfo_Irmo";
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    public List<IrmoAssetInfo> assetList;
    @Nullable
    public Background backGround;
    @Nullable
    public EffectParams effectParams;
    public int endTime;
    public boolean engineIsOff;
    public String engineVersion;
    public boolean rendered;
    @Nullable
    public String rootPath;
    public double startTime;
    public int type;

    @Override // com.sankuai.waimai.irmo.render.bean.IJSONObjectParser
    public boolean parse(@Nullable JSONObject jSONObject) {
        boolean z;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df48ce5bd8d36531ad30fad411a91525", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df48ce5bd8d36531ad30fad411a91525")).booleanValue();
        }
        if (jSONObject == null) {
            return false;
        }
        try {
            this.type = jSONObject.getInt("type");
            int i = this.type;
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect3 = f.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect3, true, "aca0915db2dc0369e369791fee9b2027", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect3, true, "aca0915db2dc0369e369791fee9b2027")).booleanValue();
            } else {
                IABTestService iABTestService = (IABTestService) a.a(IABTestService.class, IABTestService.KEY);
                if (iABTestService == null) {
                    d.e("MatrixABUtils 获取AB Service 失败 默认引擎开启", new Object[0]);
                } else {
                    String str = "infinite_engine_type_%d_state_android_in_wm";
                    if (com.sankuai.waimai.foundation.core.a.e()) {
                        str = "infinite_engine_type_%d_state_android_in_mt";
                    } else if (com.sankuai.waimai.foundation.core.a.f()) {
                        str = "infinite_engine_type_%d_state_android_in_dp";
                    }
                    ABStrategy strategy = iABTestService.getStrategy(String.format(str, Integer.valueOf(i)), null);
                    if (strategy == null) {
                        d.e("MatrixABUtils 获取引擎%d策略 strategy == null 默认引擎开启", Integer.valueOf(i));
                    } else {
                        boolean equals = TextUtils.equals(strategy.expName, "off");
                        d.c("MatrixABUtils 获取引擎%d策略 引擎关闭:%b ", Integer.valueOf(i), Boolean.valueOf(equals));
                        z = equals;
                    }
                }
                z = false;
            }
            this.engineIsOff = z;
            this.engineVersion = jSONObject.optString(DSL_LAYERS_ENGINE_VERSION);
            this.startTime = jSONObject.optDouble("start_time");
            this.endTime = jSONObject.optInt("end_time");
            JSONObject optJSONObject = jSONObject.optJSONObject("background");
            this.backGround = new Background();
            if (this.backGround.parse(optJSONObject)) {
                JSONObject optJSONObject2 = jSONObject.optJSONObject(DSL_LAYERS_UNSUPPORTED_OS);
                UnsupportedDev unsupportedDev = new UnsupportedDev();
                unsupportedDev.parse(optJSONObject2);
                if (unsupportedDev.isUnsupported(Build.VERSION.RELEASE)) {
                    com.sankuai.waimai.foundation.utils.log.a.c(TAG, Build.VERSION.RELEASE + " not support", new Object[0]);
                    return false;
                }
                JSONObject optJSONObject3 = jSONObject.optJSONObject(DSL_LAYERS_UNSUPPORTED_MODEL);
                UnsupportedDev unsupportedDev2 = new UnsupportedDev();
                unsupportedDev2.parse(optJSONObject3);
                if (unsupportedDev2.isUnsupported(Build.MODEL)) {
                    com.sankuai.waimai.foundation.utils.log.a.c(TAG, Build.MODEL + " not support", new Object[0]);
                    return false;
                }
                JSONObject jSONObject2 = jSONObject.getJSONObject(DSL_LAYERS_EFFECT_PARAMS);
                this.effectParams = createEffectParams(this.type);
                return this.effectParams == null || this.effectParams.parse(jSONObject2);
            }
            return false;
        } catch (JSONException e) {
            com.sankuai.waimai.foundation.utils.log.a.a(TAG, "IrmoLayerInfo parse fail", e);
            return false;
        }
    }

    private EffectParams createEffectParams(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c6f69e744a33239a9b277ba4ea92b426", RobustBitConfig.DEFAULT_VALUE)) {
            return (EffectParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c6f69e744a33239a9b277ba4ea92b426");
        }
        switch (i) {
            case 1000:
                return new VideoEffectParams();
            case 1001:
            case 1004:
            case 1005:
            case 1006:
            default:
                return null;
            case 1002:
                return new GyroEffectParams();
            case 1003:
                return new RayEffectParams();
            case 1007:
                return new BaseAnimEffectParams();
            case 1008:
                return new ScratchCardEffectParams();
        }
    }

    public void setAssetRootPath(@Nullable String str) {
        this.rootPath = str;
    }

    public void associateDependentAsset(@NonNull List<IrmoAssetInfo> list) {
        this.assetList = list;
    }

    @Nullable
    public IrmoAssetInfo getAssetById(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f72a7eedd77ab353a41a37fc96891cc8", RobustBitConfig.DEFAULT_VALUE)) {
            return (IrmoAssetInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f72a7eedd77ab353a41a37fc96891cc8");
        }
        if (this.assetList == null || this.assetList.isEmpty() || TextUtils.isEmpty(str)) {
            return null;
        }
        for (IrmoAssetInfo irmoAssetInfo : this.assetList) {
            if (irmoAssetInfo.id != null && irmoAssetInfo.id.equals(str)) {
                return irmoAssetInfo;
            }
        }
        return null;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    class UnsupportedDev implements IJSONObjectParser {
        private static final String DSL_UNSUPPORTED_AND = "and";
        public static ChangeQuickRedirect changeQuickRedirect;
        private List<String> unsupported;

        public UnsupportedDev() {
            Object[] objArr = {IrmoLayerInfo.this};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "418bc29db858f04e0d09a9c20c4bd0a8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "418bc29db858f04e0d09a9c20c4bd0a8");
            } else {
                this.unsupported = new ArrayList();
            }
        }

        @Override // com.sankuai.waimai.irmo.render.bean.IJSONObjectParser
        public boolean parse(@Nullable JSONObject jSONObject) {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7c3cee3b84a508c0236e74d560bfc467", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7c3cee3b84a508c0236e74d560bfc467")).booleanValue();
            }
            if (jSONObject == null) {
                return true;
            }
            try {
                JSONArray jSONArray = jSONObject.getJSONArray(DSL_UNSUPPORTED_AND);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    this.unsupported.add(jSONArray.getString(i));
                }
            } catch (JSONException e) {
                com.sankuai.waimai.foundation.utils.log.a.a(IrmoLayerInfo.TAG, "UnsupportedOS parse fail", e);
            }
            return true;
        }

        public boolean isUnsupported(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9e62c342fc0b32edc3d92734206ef1ef", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9e62c342fc0b32edc3d92734206ef1ef")).booleanValue() : this.unsupported.contains(str);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    class Background implements IJSONObjectParser {
        private static final String BACKGROUND_TYPE = "type";
        private static final String BACKGROUND_VALUE = "value";
        public static ChangeQuickRedirect changeQuickRedirect;
        public String type;
        public String value;

        public Background() {
        }

        @Override // com.sankuai.waimai.irmo.render.bean.IJSONObjectParser
        public boolean parse(@Nullable JSONObject jSONObject) {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1cf533239d89700037b21d736ddae3b1", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1cf533239d89700037b21d736ddae3b1")).booleanValue();
            }
            if (jSONObject == null) {
                return true;
            }
            try {
                this.type = jSONObject.getString("type");
                this.value = jSONObject.getString("value");
                return true;
            } catch (JSONException e) {
                com.sankuai.waimai.foundation.utils.log.a.a(IrmoLayerInfo.TAG, "Background parse fail", e);
                return false;
            }
        }
    }
}
