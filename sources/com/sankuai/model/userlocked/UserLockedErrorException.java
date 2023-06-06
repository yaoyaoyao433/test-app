package com.sankuai.model.userlocked;

import com.meituan.robust.ChangeQuickRedirect;
import org.apache.http.client.HttpResponseException;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class UserLockedErrorException extends HttpResponseException {
    public static final int INVALID_TOKEN = 401;
    public static final int USER_BANNED_MOBILE = 405;
    public static final int USER_LOCKED_EMAIL = 404;
    public static final int USER_LOCKED_MOBILE = 403;
    public static final int USER_LOCKED_UNION = 402;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 1;

    public UserLockedErrorException(int i, String str) {
        super(i, str);
    }
}
