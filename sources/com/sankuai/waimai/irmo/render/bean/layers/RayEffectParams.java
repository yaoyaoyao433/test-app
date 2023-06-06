package com.sankuai.waimai.irmo.render.bean.layers;

import android.graphics.Color;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewCompat;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.irmo.render.monitor.a;
import com.sankuai.waimai.irmo.render.monitor.b;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RayEffectParams extends EffectParams {
    private static final String DEFAULT_DELAY = "0";
    private static final String DEFAULT_DURATION = "2000";
    private static final String DEFAULT_PLAY_COUNT = "1";
    private static final String DEFAULT_RAY_ROTATION_Z = "30";
    private static final String DEFAULT_RAY_WIDTH = "40";
    private static final String DSL_DELAY = "delay";
    private static final String DSL_DURATION = "duration";
    private static final String DSL_PLAY_COUNT = "play_count";
    private static final String DSL_RAY_COLORS = "ray_colors";
    private static final String DSL_RAY_COLOR_POSITION = "ray_color_position";
    private static final String DSL_RAY_ROTATION_Z = "ray_rotation_z";
    private static final String DSL_RAY_WIDTH = "ray_width";
    private static final String TAG = "RayEffectParams";
    public static ChangeQuickRedirect changeQuickRedirect;
    public float[] colorPositions;
    public int[] colors;
    public long delay;
    public long duration;
    public int playCount;
    public float rayWidth;
    public float rotationZ;

    @Override // com.sankuai.waimai.irmo.render.bean.IJSONObjectParser
    public boolean parse(@Nullable JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d90a7b14e2f58ce7cb549e7367e5280c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d90a7b14e2f58ce7cb549e7367e5280c")).booleanValue();
        }
        if (jSONObject == null) {
            return false;
        }
        try {
            this.playCount = Integer.parseInt(jSONObject.optString(DSL_PLAY_COUNT, "1"));
            this.rayWidth = Float.parseFloat(jSONObject.optString(DSL_RAY_WIDTH, DEFAULT_RAY_WIDTH));
            this.rotationZ = Integer.parseInt(jSONObject.optString(DSL_RAY_ROTATION_Z, DEFAULT_RAY_ROTATION_Z));
            this.rotationZ %= 360.0f;
            if (this.rotationZ < 0.0f) {
                this.rotationZ += 360.0f;
            }
            this.duration = Long.parseLong(jSONObject.optString("duration", DEFAULT_DURATION));
            this.delay = Long.parseLong(jSONObject.optString(DSL_DELAY, "0"));
            JSONArray optJSONArray = jSONObject.optJSONArray(DSL_RAY_COLORS);
            if (optJSONArray != null) {
                this.colors = new int[optJSONArray.length()];
                for (int i = 0; i < optJSONArray.length(); i++) {
                    Integer parseColor = parseColor(optJSONArray.optString(i));
                    if (parseColor == null) {
                        reportMistake("color invalid.");
                        return false;
                    }
                    this.colors[i] = parseColor.intValue();
                }
            } else {
                this.colors = new int[]{ViewCompat.MEASURED_SIZE_MASK, -1275068417, ViewCompat.MEASURED_SIZE_MASK};
            }
            if (this.colors != null && this.colors.length > 0) {
                JSONArray optJSONArray2 = jSONObject.optJSONArray(DSL_RAY_COLOR_POSITION);
                if (optJSONArray2 != null) {
                    this.colorPositions = new float[optJSONArray2.length()];
                    for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                        float parseFloat = Float.parseFloat(optJSONArray2.optString(i2));
                        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
                            this.colorPositions[i2] = parseFloat;
                        }
                        reportMistake("color position invalid.");
                        return false;
                    }
                    if (this.colorPositions.length != this.colors.length) {
                        reportMistake("color and position not match.");
                        return false;
                    }
                }
                int i3 = this.colors[0];
                if (Color.alpha(this.colors[this.colors.length - 1]) != 0 || Color.alpha(i3) != 0) {
                    int[] iArr = new int[this.colors.length + 2];
                    System.arraycopy(this.colors, 0, iArr, 1, this.colors.length);
                    iArr[0] = 16777215;
                    iArr[this.colors.length + 1] = 16777215;
                    float[] fArr = new float[iArr.length];
                    if (this.colorPositions == null) {
                        float length = 1.0f / (this.colors.length - 1);
                        fArr[1] = 0.01f;
                        for (int i4 = 2; i4 < iArr.length - 2; i4++) {
                            fArr[i4] = fArr[i4 - 1] + length;
                        }
                        fArr[iArr.length - 2] = 0.99f;
                    } else {
                        System.arraycopy(this.colorPositions, 0, fArr, 1, this.colorPositions.length);
                        if (fArr[1] == 0.0f) {
                            fArr[1] = 0.01f;
                        }
                        if (fArr[this.colorPositions.length] == 1.0f) {
                            fArr[this.colorPositions.length] = 0.99f;
                        }
                    }
                    fArr[0] = 0.0f;
                    fArr[iArr.length - 1] = 1.0f;
                    this.colors = iArr;
                    this.colorPositions = fArr;
                    if (this.colorPositions.length != this.colors.length) {
                        reportMistake("color and position not match2.");
                        return false;
                    }
                }
                return true;
            }
            reportMistake("no color.");
            return false;
        } catch (Exception unused) {
            reportMistake("parse fail.");
            return false;
        }
    }

    private static void reportMistake(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "36c73a4412599bbd5a327ed95375e0b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "36c73a4412599bbd5a327ed95375e0b0");
            return;
        }
        b.b(new a.C0976a().a(1003).a(str).a());
        com.sankuai.waimai.foundation.utils.log.a.e(TAG, str, new Object[0]);
    }

    private static Integer parseColor(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4cacac3bcb61dbc2d5f76c359906bd1a", RobustBitConfig.DEFAULT_VALUE) ? (Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4cacac3bcb61dbc2d5f76c359906bd1a") : parseColor(str, null);
    }

    private static Integer parseColor(String str, Integer num) {
        Object[] objArr = {str, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3b2b00a1f0d60c688f2faedc2a5f1e56", RobustBitConfig.DEFAULT_VALUE)) {
            return (Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3b2b00a1f0d60c688f2faedc2a5f1e56");
        }
        if (TextUtils.isEmpty(str)) {
            return num;
        }
        try {
            return Integer.valueOf(Color.parseColor(str));
        } catch (IllegalArgumentException unused) {
            return num;
        }
    }
}
