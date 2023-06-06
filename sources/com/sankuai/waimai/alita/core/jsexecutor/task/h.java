package com.sankuai.waimai.alita.core.jsexecutor.task;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public enum h {
    STATUS_INIT("初始", 0),
    STATUS_WAITING("等调度", 1),
    STATUS_PREPARE("准备中", 2),
    STATUS_RUNNING("运行中", 3),
    STATUS_RESULT("处理结果", 4),
    STATUS_END("结束", 5);
    
    public static ChangeQuickRedirect a;
    public String h;
    private int i;

    public static h valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f18bd4fb1525e396f4a6a3394a6de553", RobustBitConfig.DEFAULT_VALUE) ? (h) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f18bd4fb1525e396f4a6a3394a6de553") : (h) Enum.valueOf(h.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static h[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "104c56fee7ffbfa6683cbc876dc4e416", RobustBitConfig.DEFAULT_VALUE) ? (h[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "104c56fee7ffbfa6683cbc876dc4e416") : (h[]) values().clone();
    }

    h(String str, int i) {
        Object[] objArr = {r10, Integer.valueOf(r11), str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12a8820439d683e8e250ebdc4f4a07c7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12a8820439d683e8e250ebdc4f4a07c7");
            return;
        }
        this.h = str;
        this.i = i;
    }
}
