package com.meituan.android.common.weaver.impl.rules;

import android.support.annotation.GuardedBy;
import android.support.annotation.NonNull;
import android.support.annotation.VisibleForTesting;
import com.meituan.android.common.weaver.impl.DelayChain;
import com.meituan.android.common.weaver.interfaces.WeaverEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.LinkedList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class RootRule implements DelayChain.Listener {
    public static ChangeQuickRedirect changeQuickRedirect;
    @GuardedBy("this")
    @VisibleForTesting
    public final LinkedList<WeaverEvent> mEvents;
    @GuardedBy("this")
    private final List<WeaverRule> mRules;

    public RootRule() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1b4c509ff76f8f19a9b7e16ef86d0362", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1b4c509ff76f8f19a9b7e16ef86d0362");
            return;
        }
        this.mEvents = new LinkedList<>();
        this.mRules = new LinkedList();
        this.mRules.add(new ActivityScopeRule());
        this.mRules.add(new DeadlineRule(20000L));
    }

    @Override // com.meituan.android.common.weaver.impl.DelayChain.Listener
    public synchronized void onEventDeadLine(@NonNull WeaverEvent weaverEvent) {
        Object[] objArr = {weaverEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7df11bfdeb6d71e55e448834f6748a49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7df11bfdeb6d71e55e448834f6748a49");
            return;
        }
        this.mEvents.add(weaverEvent);
        if (this.mEvents.size() > 30) {
            this.mEvents.poll();
        }
        for (WeaverRule weaverRule : this.mRules) {
            weaverRule.consumerEvents(this.mEvents);
        }
    }
}
