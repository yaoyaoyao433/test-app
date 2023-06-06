package com.meituan.android.pike.bean.proto;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PikeProto implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int c;
    private String d;
    private int v;

    public PikeProto() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ac673b259c5ea71aedaa8f831bc8747", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ac673b259c5ea71aedaa8f831bc8747");
        } else {
            setV(1);
        }
    }

    public int getV() {
        return this.v;
    }

    public void setV(int i) {
        this.v = i;
    }

    public void setC(int i) {
        this.c = i;
    }

    public int getC() {
        return this.c;
    }

    public String getD() {
        return this.d;
    }

    public void setD(String str) {
        this.d = str;
    }
}
