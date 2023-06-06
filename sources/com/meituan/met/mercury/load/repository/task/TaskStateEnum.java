package com.meituan.met.mercury.load.repository.task;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public enum TaskStateEnum {
    UNSTART,
    WORKING,
    SUCCESS,
    FAIL;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    public static TaskStateEnum valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "db5dff33fe5caaf69c258aa94cae4429", RobustBitConfig.DEFAULT_VALUE) ? (TaskStateEnum) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "db5dff33fe5caaf69c258aa94cae4429") : (TaskStateEnum) Enum.valueOf(TaskStateEnum.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static TaskStateEnum[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2899221c903c1f57fd322c57ae95de1e", RobustBitConfig.DEFAULT_VALUE) ? (TaskStateEnum[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2899221c903c1f57fd322c57ae95de1e") : (TaskStateEnum[]) values().clone();
    }

    TaskStateEnum() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f81498a9e49df5e3d69aa9071a9c8a87", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f81498a9e49df5e3d69aa9071a9c8a87");
        }
    }
}
