package com.meituan.passport.pojo.response;

import android.support.annotation.RestrictTo;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class SmsResult {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int action;
    public String countryCode;
    public Boolean isVoice;
    public String mobile;
    public String requestCode;
}
