package com.sankuai.waimai.store.repository.model;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class ExposeSpuInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 1744910312964759783L;
    private boolean isPurchased;
    private boolean isShowFeed;
    private Set<Object> set;

    public boolean isShowFeed() {
        return this.isShowFeed;
    }

    public void setShowFeed(boolean z) {
        this.isShowFeed = z;
    }

    public boolean isPurchased() {
        return this.isPurchased;
    }

    public void setPurchased(boolean z) {
        this.isPurchased = z;
    }

    @NonNull
    public Set<Object> getSet() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "53a672651f9f1db01e61117fad09a3c0", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "53a672651f9f1db01e61117fad09a3c0");
        }
        if (this.set == null) {
            this.set = new LinkedHashSet();
        }
        return this.set;
    }

    public void setSet(Set<Object> set) {
        this.set = set;
    }
}
