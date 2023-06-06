package com.meituan.android.common.weaver.impl.blank;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class BlankScope {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private BlankPageDetector fullDetector;
    private Map<String, BlankPageDetector> name2WidgetDetector;

    public synchronized void setFullDetector(@NonNull BlankPageDetector blankPageDetector) {
        Object[] objArr = {blankPageDetector};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c152171142f1f90df65b0d03e4b93f50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c152171142f1f90df65b0d03e4b93f50");
            return;
        }
        if (this.fullDetector != null) {
            this.fullDetector.destroy();
        }
        this.fullDetector = blankPageDetector;
    }

    public synchronized void addWidgetDetector(@NonNull String str, @NonNull BlankPageDetector blankPageDetector) {
        Object[] objArr = {str, blankPageDetector};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "71408c587df538d6d815510a84618b68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "71408c587df538d6d815510a84618b68");
            return;
        }
        if (this.name2WidgetDetector == null) {
            this.name2WidgetDetector = new HashMap();
        }
        BlankPageDetector blankPageDetector2 = this.name2WidgetDetector.get(str);
        if (blankPageDetector2 != null) {
            blankPageDetector2.destroy();
        }
        this.name2WidgetDetector.put(str, blankPageDetector);
    }

    public synchronized void removeWidgetDetector(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d3fe0a6701e8a9c13cc9399c12b3de11", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d3fe0a6701e8a9c13cc9399c12b3de11");
            return;
        }
        if (this.name2WidgetDetector != null) {
            BlankPageDetector blankPageDetector = this.name2WidgetDetector.get(str);
            if (blankPageDetector != null) {
                blankPageDetector.destroy();
            }
            this.name2WidgetDetector.remove(str);
        }
    }

    @Nullable
    public synchronized BlankPageDetector findByName(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ac84e8b7c84e3e0c4c22e8428d80b63", RobustBitConfig.DEFAULT_VALUE)) {
            return (BlankPageDetector) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ac84e8b7c84e3e0c4c22e8428d80b63");
        } else if (this.name2WidgetDetector != null) {
            return this.name2WidgetDetector.get(str);
        } else {
            return null;
        }
    }

    public synchronized void destroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8d58a4b298759a3d726991f4f6bf3b8f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8d58a4b298759a3d726991f4f6bf3b8f");
            return;
        }
        if (this.fullDetector != null) {
            this.fullDetector.destroy();
        }
        if (this.name2WidgetDetector != null) {
            for (BlankPageDetector blankPageDetector : this.name2WidgetDetector.values()) {
                blankPageDetector.destroy();
            }
        }
    }
}
