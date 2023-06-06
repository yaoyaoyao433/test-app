package com.meituan.android.common.aidata.feature.repo;

import com.meituan.android.common.aidata.feature.AbsFeatureRequest;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class TableSelector {
    public static final String TABLE_NAME_AI_GLOBAL = "shared_table";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static String getTable(AbsFeatureRequest absFeatureRequest) {
        return TABLE_NAME_AI_GLOBAL;
    }
}
