package com.meituan.metrics.sampler;

import com.meituan.metrics.model.AbstractEvent;
import com.meituan.robust.ChangeQuickRedirect;
import java.text.DecimalFormat;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class AbstractSampleEvent extends AbstractEvent {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected static final DecimalFormat df = new DecimalFormat("#.##");

    @Override // com.meituan.metrics.model.AbstractEvent
    public String getEventType() {
        return "default";
    }

    @Override // com.meituan.metrics.model.AbstractEvent
    public String getLocalEventType() {
        return "default";
    }
}
