package com.unionpay;

import android.os.Bundle;
/* loaded from: classes6.dex */
public final class c implements UPQuerySEPayInfoCallback {
    @Override // com.unionpay.UPQuerySEPayInfoCallback
    public final void onError(String str, String str2, String str3, String str4) {
        String unused = UPPayAssistEx.A = str2;
        UPPayAssistEx.s();
    }

    @Override // com.unionpay.UPQuerySEPayInfoCallback
    public final void onResult(String str, String str2, int i, Bundle bundle) {
        String unused = UPPayAssistEx.A = str2;
        UPPayAssistEx.s();
    }
}
