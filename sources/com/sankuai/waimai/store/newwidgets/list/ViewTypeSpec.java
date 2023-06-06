package com.sankuai.waimai.store.newwidgets.list;

import com.meituan.robust.ChangeQuickRedirect;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class ViewTypeSpec {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface ViewType {
        public static final int TYPE_CONTENT = -1073741824;
        public static final int TYPE_FOOTER = Integer.MIN_VALUE;
        public static final int TYPE_HEADER = 1073741824;
    }
}
