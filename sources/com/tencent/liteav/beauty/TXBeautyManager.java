package com.tencent.liteav.beauty;

import android.graphics.Bitmap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface TXBeautyManager {
    void enableSharpnessEnhancement(boolean z);

    void setBeautyLevel(float f);

    void setBeautyStyle(int i);

    void setChinLevel(float f);

    void setEyeAngleLevel(float f);

    void setEyeDistanceLevel(float f);

    void setEyeLightenLevel(float f);

    void setEyeScaleLevel(float f);

    void setFaceBeautyLevel(float f);

    void setFaceShortLevel(float f);

    void setFaceSlimLevel(float f);

    void setFaceVLevel(float f);

    void setFilter(Bitmap bitmap);

    void setFilterStrength(float f);

    void setForeheadLevel(float f);

    void setGreenScreenFile(String str);

    void setLipsThicknessLevel(float f);

    void setMotionMute(boolean z);

    void setMotionTmpl(String str);

    void setMouthShapeLevel(float f);

    void setNosePositionLevel(float f);

    void setNoseSlimLevel(float f);

    void setNoseWingLevel(float f);

    void setPounchRemoveLevel(float f);

    void setPreprocessor(e eVar);

    void setRuddyLevel(float f);

    void setSmileLinesRemoveLevel(float f);

    void setToothWhitenLevel(float f);

    void setWhitenessLevel(float f);

    void setWrinkleRemoveLevel(float f);
}
