package com.tencent.open.b;

import android.os.Bundle;
import java.io.Serializable;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class c implements Serializable {
    public final HashMap<String, String> a;

    public c(Bundle bundle) {
        this.a = new HashMap<>();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                this.a.put(str, bundle.getString(str));
            }
        }
    }

    public c(HashMap<String, String> hashMap) {
        this.a = new HashMap<>(hashMap);
    }

    public String toString() {
        return "BaseData{time=" + this.a.get("time") + ", name=" + this.a.get("interface_name") + '}';
    }
}
