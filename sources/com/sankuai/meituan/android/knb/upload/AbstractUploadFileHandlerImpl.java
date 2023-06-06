package com.sankuai.meituan.android.knb.upload;

import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class AbstractUploadFileHandlerImpl implements IUploadFileHandler {
    protected static final String VENUS_DEBUG_SECURE_TOKEN_URL = "https://websafe.fe.st.sankuai.com/signature/venus/secureToken";
    protected static final String VENUS_DEBUG_SIGNATURE_URL = "https://websafe.fe.st.sankuai.com/signature/venus";
    protected static final String VENUS_SECURE_TOKEN_URL = "https://websafe.meituan.com/signature/venus/secureToken";
    protected static final String VENUS_SIGNATURE_URL = "https://websafe.meituan.com/signature/venus";
    public static ChangeQuickRedirect changeQuickRedirect;
}
