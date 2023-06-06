package com.dianping.shield.monitor;

import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/dianping/shield/monitor/ShieldSpeedStep;", "", Constants.SPEED_METER_STEP, "", "(Ljava/lang/String;II)V", "getStep", "()I", "MF_STEP_INIT", "MF_STEP_LOAD_VIEW", "MF_STEP_VIEW_DID_LOAD", "MF_STEP_PAGE_LOAD", "MF_STEP_UPDATE_MODULES", "MF_STEP_NEED_RELOAD_TABLE_VIEW", "MF_STEP_COMPUTE_START", "MF_STEP_PAINTING_END", "MF_STEP_MODULE_CONSTRUCT_END", "MF_STEP_MODULE_CREATE_END", "SHIELD_STEP_FIRST", "SHIELD_STEP_SECOND", "SHIELD_STEP_THIRD", "SHIELD_STEP_FOURTH", "SHIELD_STEP_FIFTH", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public enum ShieldSpeedStep {
    MF_STEP_INIT(1),
    MF_STEP_LOAD_VIEW(2),
    MF_STEP_VIEW_DID_LOAD(3),
    MF_STEP_PAGE_LOAD(4),
    MF_STEP_UPDATE_MODULES(1),
    MF_STEP_NEED_RELOAD_TABLE_VIEW(2),
    MF_STEP_COMPUTE_START(1),
    MF_STEP_PAINTING_END(2),
    MF_STEP_MODULE_CONSTRUCT_END(1),
    MF_STEP_MODULE_CREATE_END(1),
    SHIELD_STEP_FIRST(1),
    SHIELD_STEP_SECOND(2),
    SHIELD_STEP_THIRD(3),
    SHIELD_STEP_FOURTH(4),
    SHIELD_STEP_FIFTH(5);
    
    public static ChangeQuickRedirect changeQuickRedirect;
    private final int step;

    public static ShieldSpeedStep valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (ShieldSpeedStep) (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8e22167d1f58dc6ecf6ea1412cadb0d0", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8e22167d1f58dc6ecf6ea1412cadb0d0") : Enum.valueOf(ShieldSpeedStep.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static ShieldSpeedStep[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return (ShieldSpeedStep[]) (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8bb7e9bf8fcf3d6b883fe680c660e7e8", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8bb7e9bf8fcf3d6b883fe680c660e7e8") : values().clone());
    }

    ShieldSpeedStep(int i) {
        Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d5560c79863c46e384875601cc2cf979", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d5560c79863c46e384875601cc2cf979");
        } else {
            this.step = i;
        }
    }

    public final int getStep() {
        return this.step;
    }
}
