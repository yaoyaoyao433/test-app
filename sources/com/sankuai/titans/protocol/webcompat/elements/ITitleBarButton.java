package com.sankuai.titans.protocol.webcompat.elements;

import android.graphics.Bitmap;
import android.view.View;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface ITitleBarButton {
    void fallbackUi();

    int getCalculatedWidth();

    View getView();

    void initBtnResources(String str, String str2);

    void initBtnResources(String str, String str2, int i);

    void setEnable(boolean z);

    void setFallbackUi(String str, int i, View.OnClickListener onClickListener, boolean z);

    void setIcon(Bitmap bitmap);

    void setIcon(String str);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setPerformClickListener(OnPerformClickListener onPerformClickListener);

    void setText(String str);

    void setTextColor(int i);

    void setTextSize(int i);

    void setTitleImageLayout(int i, int i2);
}
