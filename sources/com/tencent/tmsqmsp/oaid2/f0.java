package com.tencent.tmsqmsp.oaid2;

import android.content.Context;
import com.meituan.robust.common.StringUtil;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class f0 implements b {
    public Context a = null;
    public IVendorCallback b = null;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Thread.sleep(1000L);
                if (f0.this.b != null) {
                    f0.this.b.onResult(e0.a(), e0.a(f0.this.a), e0.b(f0.this.a));
                }
            } catch (Exception e) {
                if (f0.this.b != null) {
                    f0.this.b.onResult(false, StringUtil.NULL, StringUtil.NULL);
                }
                e.printStackTrace();
            }
        }
    }

    @Override // com.tencent.tmsqmsp.oaid2.b
    public String a() {
        return "";
    }

    @Override // com.tencent.tmsqmsp.oaid2.b
    public String d() {
        return "";
    }

    @Override // com.tencent.tmsqmsp.oaid2.b
    public boolean e() {
        return e0.a();
    }

    @Override // com.tencent.tmsqmsp.oaid2.b
    public void j() {
        new Thread(new a()).start();
    }

    @Override // com.tencent.tmsqmsp.oaid2.b
    public boolean k() {
        return false;
    }

    @Override // com.tencent.tmsqmsp.oaid2.b
    public void l() {
    }

    @Override // com.tencent.tmsqmsp.oaid2.b
    public void a(Context context, IVendorCallback iVendorCallback) {
        this.a = context;
        this.b = iVendorCallback;
        e0.c(context);
    }
}
