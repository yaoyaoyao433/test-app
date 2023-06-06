package com.sankuai.waimai.touchmatrix.views;

import android.app.Dialog;
import android.support.annotation.Keep;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public interface ITMatrixView {
    void cancel();

    void dismiss();

    Dialog getDialog();

    boolean isShowing();

    void show();
}
