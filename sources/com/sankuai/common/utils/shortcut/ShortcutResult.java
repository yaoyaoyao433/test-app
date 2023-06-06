package com.sankuai.common.utils.shortcut;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ShortcutResult {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int mErrorCode;
    private String mErrorMsg;

    public ShortcutResult(int i) {
        this(i, "");
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8619b66450b296df33d79c9f1bbaa7f9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8619b66450b296df33d79c9f1bbaa7f9");
        }
    }

    public ShortcutResult(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a93a3353344abf72678388b0097dbe0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a93a3353344abf72678388b0097dbe0");
            return;
        }
        this.mErrorCode = i;
        this.mErrorMsg = str;
    }

    public String getErrorMsg() {
        return this.mErrorMsg;
    }

    public void setErrorMsg(String str) {
        this.mErrorMsg = str;
    }

    public int getErrorCode() {
        return this.mErrorCode;
    }

    public void setErrorCode(int i) {
        this.mErrorCode = i;
    }

    public boolean isSucceed() {
        return this.mErrorCode == 200;
    }
}
