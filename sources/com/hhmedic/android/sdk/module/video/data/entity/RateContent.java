package com.hhmedic.android.sdk.module.video.data.entity;

import android.text.TextUtils;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class RateContent implements Serializable {
    public String answerOne;
    public String content;
    public long id;

    public boolean isGood() {
        return TextUtils.equals("5", this.answerOne);
    }
}
