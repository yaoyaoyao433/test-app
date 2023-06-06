package com.meituan.android.common.aidata.cep.rule;

import com.meituan.android.common.aidata.entity.EventData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class IRuleTrigger {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String mIdentifier;
    protected AtomicBoolean mStarted;

    public abstract void onStart();

    public abstract void onStop();

    public abstract void run(EventData eventData);

    public IRuleTrigger(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "30bc207af68db186bd7c57338dcfb563", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "30bc207af68db186bd7c57338dcfb563");
            return;
        }
        this.mIdentifier = null;
        this.mStarted = new AtomicBoolean(false);
        this.mIdentifier = str;
    }

    public String getIdentifier() {
        return this.mIdentifier;
    }

    public boolean iStarted() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "23be9b661628eeec8a5f7431a432350f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "23be9b661628eeec8a5f7431a432350f")).booleanValue() : this.mStarted.get();
    }

    public void start() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "421e0ee9bf1016e6ec18db43910cc73e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "421e0ee9bf1016e6ec18db43910cc73e");
        } else if (iStarted()) {
        } else {
            this.mStarted.compareAndSet(false, true);
            onStart();
        }
    }

    public void stop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "85f064e062ec213559a5175d7e3b23dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "85f064e062ec213559a5175d7e3b23dc");
        } else if (iStarted()) {
            this.mStarted.compareAndSet(true, false);
            onStop();
        }
    }
}
