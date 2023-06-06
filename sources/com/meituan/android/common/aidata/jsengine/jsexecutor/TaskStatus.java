package com.meituan.android.common.aidata.jsengine.jsexecutor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public enum TaskStatus {
    STATUS_INIT("初始", 0),
    STATUS_WAITING("等调度", 1),
    STATUS_PREPARE("准备中", 2),
    STATUS_RUNNING("运行中", 3),
    STATUS_RESULT("处理结果", 4),
    STATUS_END("结束", 5);
    
    public static ChangeQuickRedirect changeQuickRedirect;
    private String name;
    private int value;

    public static TaskStatus valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "40be072c988ba5fe9b8321bd288d18b9", RobustBitConfig.DEFAULT_VALUE) ? (TaskStatus) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "40be072c988ba5fe9b8321bd288d18b9") : (TaskStatus) Enum.valueOf(TaskStatus.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static TaskStatus[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "002754f89bed555d8d11909e1adc8d11", RobustBitConfig.DEFAULT_VALUE) ? (TaskStatus[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "002754f89bed555d8d11909e1adc8d11") : (TaskStatus[]) values().clone();
    }

    TaskStatus(String str, int i) {
        Object[] objArr = {r10, Integer.valueOf(r11), str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b9b56fc9bdd002cb6fff6cac6becbbce", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b9b56fc9bdd002cb6fff6cac6becbbce");
            return;
        }
        this.name = str;
        this.value = i;
    }

    public final String getName() {
        return this.name;
    }

    public final int getValue() {
        return this.value;
    }
}
