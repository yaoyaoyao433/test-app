package com.sankuai.xm.imui.session.view.adapter;

import android.support.annotation.ColorInt;
import android.support.annotation.DrawableRes;
import android.view.View;
import com.sankuai.xm.imui.session.entity.b;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface ICommonStatusAdapter extends IMsgAdapter {
    public static final int STATUS_GRAVITY_BOTTOM = 3;
    public static final int STATUS_GRAVITY_CENTER = 2;
    public static final int STATUS_GRAVITY_TOP = 1;

    /* compiled from: ProGuard */
    @Target({ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD, ElementType.LOCAL_VARIABLE})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface StatusGravity {
    }

    @ColorInt
    int getMsgStatusTextColor(b bVar);

    int getMsgStatusVisibility(b bVar);

    @DrawableRes
    int getProgressBarResource(b bVar);

    int getStatusGravity(b bVar);

    String getTimeStamp(b bVar);

    int getTimeStampVisibility(b bVar);

    void onMsgFailTipClick(View view, b bVar);

    void onMsgStatusClick(View view, b bVar);
}
