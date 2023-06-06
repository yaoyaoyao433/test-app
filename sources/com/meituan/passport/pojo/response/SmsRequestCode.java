package com.meituan.passport.pojo.response;

import android.support.annotation.RestrictTo;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class SmsRequestCode {
    public static final int TYPE_SMS = 2;
    public static final int TYPE_VOICE = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    public int action;
    public int type;
    public String value;
}
