package com.sankuai.xm.imui.session.view.adapter;

import android.content.Context;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface IMsgAdapter {
    public static final int STYLE_LEFT = 1;
    public static final int STYLE_MIDDLE = 3;
    public static final int STYLE_RIGHT = 2;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface Style {
    }

    /* compiled from: ProGuard */
    @Target({ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD, ElementType.LOCAL_VARIABLE})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface Visibility {
    }

    void init(Context context);

    void release();
}
