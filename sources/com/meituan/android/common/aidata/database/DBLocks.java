package com.meituan.android.common.aidata.database;

import com.meituan.robust.ChangeQuickRedirect;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class DBLocks {
    public static final ReadWriteLock AIDATA_DB_RW_LOCK = new ReentrantReadWriteLock();
    public static final ReadWriteLock PERSONA_DB_RW_LOCK = new ReentrantReadWriteLock();
    public static ChangeQuickRedirect changeQuickRedirect;
}
