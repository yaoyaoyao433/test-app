package com.tencent.tauth;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface IUiListener {
    void onCancel();

    void onComplete(Object obj);

    void onError(UiError uiError);

    void onWarning(int i);
}
