package com.meituan.android.common.kitefly;

import com.meituan.robust.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class KiteFlyConfigEntity {
    public static ChangeQuickRedirect changeQuickRedirect;
    public DirectConfig direct;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static class DirectConfig {
        public static ChangeQuickRedirect changeQuickRedirect;
        public int count;
        public List<String> processBlacklist = new ArrayList();
        public int samplerateType;
        public boolean toggle;
        public boolean user;
    }
}
