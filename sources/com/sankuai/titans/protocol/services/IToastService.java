package com.sankuai.titans.protocol.services;

import android.app.Activity;
import android.view.View;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface IToastService {
    void showLongToast(Activity activity, CharSequence charSequence);

    void showLongToast(View view, CharSequence charSequence);

    void showShortToast(Activity activity, CharSequence charSequence);

    void showShortToast(View view, CharSequence charSequence);
}
