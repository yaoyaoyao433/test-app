package com.sankuai.waimai.irmo.mach.effect.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class EffectGyroConfig extends BaseEffectConfig {
    public static String ACTION_TYPE_ALPHA = "alpha";
    public static String ACTION_TYPE_ROTATION = "rotation";
    public static String ACTION_TYPE_TRANSLATION = "translation";
    public static String DIRECTION_POSITIVE = "positive";
    public static String DIRECTION_REVERSE = "reverse";
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("action-type")
    public String actionType;
    @SerializedName(Constants.GestureMoveEvent.KEY_X)
    public int actionX;
    @SerializedName(Constants.GestureMoveEvent.KEY_Y)
    public int actionY;
    @SerializedName("z")
    public int actionZ;
    @SerializedName("direction")
    public String direction;

    public EffectGyroConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "71fd1874b771b8a060e5f5e7e7b71910", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "71fd1874b771b8a060e5f5e7e7b71910");
        } else {
            this.direction = DIRECTION_POSITIVE;
        }
    }

    public boolean isPositive() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ac15f97601c6766d08ac9acec1b37845", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ac15f97601c6766d08ac9acec1b37845")).booleanValue() : !DIRECTION_REVERSE.equals(this.direction);
    }
}
