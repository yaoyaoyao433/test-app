package com.meituan.android.common.aidata.ai.mlmodel.predictor.exception;

import com.meituan.android.common.aidata.raptoruploader.BlueException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class TensorParseException extends BlueException {
    private static final String EMPTY_NAME = "EMPTY";
    public static ChangeQuickRedirect changeQuickRedirect;
    private String mName;

    public TensorParseException(String str) {
        this(EMPTY_NAME, str);
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0236980aadf33fe813eaeaf0a59bd8f6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0236980aadf33fe813eaeaf0a59bd8f6");
        }
    }

    public TensorParseException(String str, String str2) {
        super(str2);
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "43a6dffa0e80bcda5bd6aeccb26ec17d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "43a6dffa0e80bcda5bd6aeccb26ec17d");
        } else {
            this.mName = str;
        }
    }

    public String getName() {
        return this.mName;
    }
}
