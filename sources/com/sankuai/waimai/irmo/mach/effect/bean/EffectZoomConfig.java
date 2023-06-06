package com.sankuai.waimai.irmo.mach.effect.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.recce.views.anim.RecceAnimUtils;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class EffectZoomConfig extends BaseEffectConfig {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("duration")
    public int duration;
    @SerializedName(RecceAnimUtils.REPEAT_COUNT)
    public int repeatCount;
    @SerializedName("zoomValues")
    public float[] zoomValues;
}
