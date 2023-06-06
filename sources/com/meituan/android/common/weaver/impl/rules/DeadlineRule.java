package com.meituan.android.common.weaver.impl.rules;

import android.support.annotation.NonNull;
import com.meituan.android.common.weaver.interfaces.WeaverEvent;
import com.meituan.android.common.weaver.interfaces.ffp.FFPUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
import java.util.LinkedList;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class DeadlineRule implements WeaverRule {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final long mMaxDelay;

    public DeadlineRule(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cd9aa204f6e70822153181ac911d8587", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cd9aa204f6e70822153181ac911d8587");
        } else {
            this.mMaxDelay = j;
        }
    }

    @Override // com.meituan.android.common.weaver.impl.rules.WeaverRule
    public void consumerEvents(@NonNull LinkedList<WeaverEvent> linkedList) {
        Object[] objArr = {linkedList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "76cf1b4600a125b6c4249c4945e5de11", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "76cf1b4600a125b6c4249c4945e5de11");
            return;
        }
        Iterator<WeaverEvent> it = linkedList.iterator();
        long currentTimeMillis = FFPUtil.currentTimeMillis();
        while (it.hasNext() && currentTimeMillis - it.next().createMs() > this.mMaxDelay) {
            it.remove();
        }
    }
}
