package com.dianping.shield.entity;

import com.meituan.robust.ChangeQuickRedirect;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class AgentLifeCyclerStates {
    public static final int CONSTRUCTED = -3;
    public static final int CREATED = -2;
    public static final int DESTROYED = 3;
    public static final int INVALID = -99;
    public static final int PAUSED = 1;
    public static final int RESUMED = 0;
    public static final int STARTED = -1;
    public static final int STOPED = 2;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface AgentsState {
    }
}
