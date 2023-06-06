package com.sankuai.xm.imui.common.adapter;

import android.app.Activity;
import com.sankuai.xm.imui.common.view.titlebar.TitleBarAdapter;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface IPageEventAdapter {
    boolean isShowUnreadMessageNotification();

    void onAccountError(Activity activity);

    boolean onScrollFromLeft(Activity activity);

    void onUnReadCountChanged(TitleBarAdapter titleBarAdapter);
}
