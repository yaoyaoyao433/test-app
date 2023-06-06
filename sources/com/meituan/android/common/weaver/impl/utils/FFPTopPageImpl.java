package com.meituan.android.common.weaver.impl.utils;

import android.support.annotation.Nullable;
import com.meituan.android.common.weaver.interfaces.ffp.IFFPTopPage;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class FFPTopPageImpl implements IFFPTopPage {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static String pagePath;

    @Override // com.meituan.android.common.weaver.interfaces.ffp.IFFPTopPage
    @Nullable
    public String pagePath() {
        return pagePath;
    }
}
