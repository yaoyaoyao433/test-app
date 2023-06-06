package com.sankuai.waimai.irmo.render.bean.layers;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.d;
import com.sankuai.waimai.irmo.render.bean.IJSONObjectParser;
import com.sankuai.waimai.irmo.render.monitor.a;
import com.sankuai.waimai.irmo.render.monitor.b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class BaseAnimEffectParams extends EffectParams {
    private static final String DEFAULT_DELAY = "0";
    private static final String DEFAULT_PIVOT = "0.5";
    private static final String DEFAULT_PLAY_COUNT = "1";
    private static final String DSL_ANCHOR_POINT_X = "anchor_point_x";
    private static final String DSL_ANCHOR_POINT_Y = "anchor_point_y";
    private static final String DSL_BASE_ANIM = "base_animations";
    private static final String DSL_DELAY = "delay";
    private static final String DSL_DURATION = "duration";
    private static final String DSL_FILL_MODE = "fill_mode";
    private static final String DSL_FROM = "from";
    private static final String DSL_PATH = "path";
    private static final String DSL_PATHS = "paths";
    private static final String DSL_PLAY_COUNT = "play_count";
    private static final String DSL_REPEAT_TIME = "repeat_time";
    private static final String DSL_TO = "to";
    public static final String FILL_MODE_FORWARDS = "forwards";
    private static final String TAG = "BaseAnimEffectParams";
    public static ChangeQuickRedirect changeQuickRedirect;
    public List<AnimSlice> baseAnimSlices;
    public String fillMode;
    public boolean hasDraw;
    public long playCount;

    @Override // com.sankuai.waimai.irmo.render.bean.IJSONObjectParser
    public boolean parse(@Nullable JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cab64a9c3180571a894b07a7b99cb7ca", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cab64a9c3180571a894b07a7b99cb7ca")).booleanValue();
        }
        if (jSONObject == null) {
            return false;
        }
        try {
            if (jSONObject.has(DSL_PLAY_COUNT)) {
                this.playCount = Long.parseLong(jSONObject.optString(DSL_PLAY_COUNT, "1"));
            } else {
                this.playCount = Long.parseLong(jSONObject.optString(DSL_REPEAT_TIME, "1"));
            }
            this.fillMode = jSONObject.optString(DSL_FILL_MODE);
            JSONArray optJSONArray = jSONObject.optJSONArray(DSL_BASE_ANIM);
            if (optJSONArray == null) {
                return true;
            }
            this.baseAnimSlices = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                AnimSlice animSlice = new AnimSlice();
                if (!animSlice.parse(optJSONArray.optJSONObject(i))) {
                    return false;
                }
                if (!d.a(animSlice.drawables)) {
                    this.hasDraw = true;
                }
                this.baseAnimSlices.add(animSlice);
            }
            return true;
        } catch (Exception unused) {
            reportMistake("parse fail.");
            return false;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class AnimSlice implements IJSONObjectParser {
        public static ChangeQuickRedirect changeQuickRedirect;
        public long delay;
        public List<Property> drawables;
        public float pivotXp;
        public float pivotYp;
        public List<Property> properties;

        @Override // com.sankuai.waimai.irmo.render.bean.IJSONObjectParser
        public boolean parse(@Nullable JSONObject jSONObject) {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b8af6e9c9651020052015c450793ef95", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b8af6e9c9651020052015c450793ef95")).booleanValue();
            }
            if (jSONObject == null) {
                return false;
            }
            try {
                this.delay = Long.parseLong(jSONObject.optString(BaseAnimEffectParams.DSL_DELAY, "0"));
                this.pivotXp = Float.parseFloat(jSONObject.optString(BaseAnimEffectParams.DSL_ANCHOR_POINT_X, BaseAnimEffectParams.DEFAULT_PIVOT));
                this.pivotYp = Float.parseFloat(jSONObject.optString(BaseAnimEffectParams.DSL_ANCHOR_POINT_Y, BaseAnimEffectParams.DEFAULT_PIVOT));
                JSONArray optJSONArray = jSONObject.optJSONArray(BaseAnimEffectParams.DSL_PATHS);
                if (optJSONArray == null) {
                    return true;
                }
                this.properties = new ArrayList();
                this.drawables = new ArrayList();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    Property property = new Property();
                    if (!property.parse(optJSONArray.optJSONObject(i))) {
                        return false;
                    }
                    if (property.needDraw()) {
                        this.drawables.add(property);
                    } else {
                        this.properties.add(property);
                    }
                }
                if (this.delay < 0) {
                    BaseAnimEffectParams.reportMistake("slice delay invalid.");
                    return false;
                }
                return true;
            } catch (Exception unused) {
                BaseAnimEffectParams.reportMistake("slice parse fail.");
                return false;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class Property implements IJSONObjectParser {
        public static ChangeQuickRedirect changeQuickRedirect;
        public long delay;
        public long duration;
        public String fromValue;
        public String toValue;
        public PropertyType type;

        @Override // com.sankuai.waimai.irmo.render.bean.IJSONObjectParser
        public boolean parse(@Nullable JSONObject jSONObject) {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "34c6d3e29f7d1c7fbf1ee5b4cb702925", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "34c6d3e29f7d1c7fbf1ee5b4cb702925")).booleanValue();
            }
            if (jSONObject == null) {
                return false;
            }
            try {
                this.type = PropertyType.valueOf(jSONObject.getString("path"));
                this.delay = Long.parseLong(jSONObject.optString(BaseAnimEffectParams.DSL_DELAY, "0"));
                this.duration = Long.parseLong(jSONObject.getString("duration"));
                this.fromValue = jSONObject.getString("from");
                this.toValue = jSONObject.getString("to");
                if (this.duration <= 0 || this.delay < 0) {
                    BaseAnimEffectParams.reportMistake("property duration or delay invalid.");
                    return false;
                }
                return true;
            } catch (Exception unused) {
                BaseAnimEffectParams.reportMistake("property parse fail");
                return false;
            }
        }

        public boolean needDraw() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9213919080dd81ebbd16d387c3acf63e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9213919080dd81ebbd16d387c3acf63e")).booleanValue() : this.type == PropertyType.shadow || this.type == PropertyType.halo || this.type == PropertyType.cornerRadius || this.type == PropertyType.border;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void reportMistake(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "18e253e99660f6fb5e8e01ea2c658426", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "18e253e99660f6fb5e8e01ea2c658426");
            return;
        }
        b.b(new a.C0976a().a(1007).a(str).a());
        com.sankuai.waimai.foundation.utils.log.a.e(TAG, str, new Object[0]);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public enum PropertyType {
        translationX,
        translationY,
        translationZ,
        rotationX,
        rotationY,
        rotationZ,
        scaleX,
        scaleY,
        opacity,
        backgroundColor,
        shadow,
        halo,
        cornerRadius,
        border;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        PropertyType() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "738532e511d8f3aabfa8942da0c91267", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "738532e511d8f3aabfa8942da0c91267");
            }
        }

        public static PropertyType valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f35c3a5a840f9379e54cad6f9d3c5d28", RobustBitConfig.DEFAULT_VALUE) ? (PropertyType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f35c3a5a840f9379e54cad6f9d3c5d28") : (PropertyType) Enum.valueOf(PropertyType.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static PropertyType[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ef39a5ce66cef13249daac86fcee0012", RobustBitConfig.DEFAULT_VALUE) ? (PropertyType[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ef39a5ce66cef13249daac86fcee0012") : (PropertyType[]) values().clone();
        }
    }
}
