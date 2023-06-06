package com.sankuai.waimai.irmo.render.bean.layers;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.log.a;
import com.sankuai.waimai.irmo.render.bean.IJSONObjectParser;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ScratchCardEffectParams extends EffectParams implements IJSONObjectParser {
    private static final String DSL_PARAMS_BRUSH_WIDTH = "brush_width";
    private static final String DSL_PARAMS_CLEAR_DURATION = "clear_duration";
    private static final String DSL_PARAMS_GUIDE_IMAGE = "guide_image";
    private static final String DSL_PARAMS_IMAGE = "image";
    private static final String DSL_PARAMS_SCRATCH_PERCENT = "scratch_percent";
    private static final String TAG = "ScratchCardEffectParams_Irmo";
    public static ChangeQuickRedirect changeQuickRedirect;
    public int brushWidth;
    public float clearDuration;
    public String guideImage;
    public String image;
    public float scratchPercent;

    @Override // com.sankuai.waimai.irmo.render.bean.IJSONObjectParser
    public boolean parse(@Nullable JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "40fca9c4aa2b78b2d04055e7ea543bd7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "40fca9c4aa2b78b2d04055e7ea543bd7")).booleanValue();
        }
        if (jSONObject == null) {
            return false;
        }
        try {
            this.scratchPercent = (float) jSONObject.optDouble(DSL_PARAMS_SCRATCH_PERCENT, 0.25d);
            this.brushWidth = jSONObject.optInt(DSL_PARAMS_BRUSH_WIDTH, 30);
            this.image = jSONObject.optString("image");
            this.clearDuration = (float) jSONObject.optDouble(DSL_PARAMS_CLEAR_DURATION, 0.25d);
            this.guideImage = jSONObject.optString(DSL_PARAMS_GUIDE_IMAGE);
            return true;
        } catch (Exception e) {
            a.a(TAG, "GyroEffectParams parse fail", e);
            return false;
        }
    }
}
