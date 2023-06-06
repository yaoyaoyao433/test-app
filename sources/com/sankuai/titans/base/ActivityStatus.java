package com.sankuai.titans.base;

import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ActivityStatus implements IActivityStatus {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean hasStartActivity;
    private boolean isAppear;
    private boolean isPause;

    @Override // com.sankuai.titans.base.IActivityStatus
    public boolean isHasStartActivity() {
        return this.hasStartActivity;
    }

    @Override // com.sankuai.titans.base.IActivityStatus
    public void setHasStartActivity(boolean z) {
        this.hasStartActivity = z;
    }

    @Override // com.sankuai.titans.base.IActivityStatus
    public boolean isPause() {
        return this.isPause;
    }

    @Override // com.sankuai.titans.base.IActivityStatus
    public void setPause(boolean z) {
        this.isPause = z;
    }

    @Override // com.sankuai.titans.base.IActivityStatus
    public boolean isAppear() {
        return this.isAppear;
    }

    @Override // com.sankuai.titans.base.IActivityStatus
    public void setAppear(boolean z) {
        this.isAppear = z;
    }
}
