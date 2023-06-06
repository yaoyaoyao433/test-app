package com.unionpay;

import java.util.Comparator;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public final class i implements Comparator {
    String a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(String str) {
        this.a = "";
        this.a = str;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        int i = (((JSONObject) obj).optLong(this.a) > ((JSONObject) obj2).optLong(this.a) ? 1 : (((JSONObject) obj).optLong(this.a) == ((JSONObject) obj2).optLong(this.a) ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i > 0 ? 1 : 0;
    }
}
