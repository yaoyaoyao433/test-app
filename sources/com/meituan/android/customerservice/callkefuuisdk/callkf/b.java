package com.meituan.android.customerservice.callkefuuisdk.callkf;

import android.os.Handler;
import android.os.Message;
import android.widget.TextView;
import com.meituan.android.customerservice.cscallsdk.d;
import com.meituan.android.legwork.bean.monitor.DaBaiBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a;
    int b;
    TextView c;
    a d;
    Runnable e;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a extends Handler {
        public static ChangeQuickRedirect a;

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Object[] objArr = {message};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b93b689bb71256fbade3b3136a48ff76", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b93b689bb71256fbade3b3136a48ff76");
            } else {
                super.handleMessage(message);
            }
        }
    }

    public b(TextView textView) {
        Object[] objArr = {textView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "406f19eee8884f16434e5e1e833fd873", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "406f19eee8884f16434e5e1e833fd873");
            return;
        }
        this.b = 0;
        this.e = new Runnable() { // from class: com.meituan.android.customerservice.callkefuuisdk.callkf.b.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5024f20e5702a151cebbde08a4fa7297", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5024f20e5702a151cebbde08a4fa7297");
                    return;
                }
                int i = b.this.b;
                b.this.b = (int) (d.j().g().e() / 1000);
                if (b.this.b > i) {
                    final b bVar = b.this;
                    final int i2 = b.this.b;
                    Object[] objArr3 = {Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect3 = b.a;
                    if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "7b9f71aa3718fe98bf7040a0d29ac9c6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "7b9f71aa3718fe98bf7040a0d29ac9c6");
                    } else if (d.j().g().d() == 3) {
                        Object[] objArr4 = {Integer.valueOf(i2)};
                        ChangeQuickRedirect changeQuickRedirect4 = b.a;
                        if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "bf18096d18b28fecb847d74de24fcb45", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "bf18096d18b28fecb847d74de24fcb45");
                        } else {
                            bVar.d.post(new Runnable() { // from class: com.meituan.android.customerservice.callkefuuisdk.callkf.b.2
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    String sb;
                                    Object[] objArr5 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "9fbf8881b11841d2a2abfdbad40faecf", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "9fbf8881b11841d2a2abfdbad40faecf");
                                    } else if (i2 > 0) {
                                        TextView textView2 = b.this.c;
                                        b bVar2 = b.this;
                                        int i3 = i2;
                                        Object[] objArr6 = {Integer.valueOf(i3)};
                                        ChangeQuickRedirect changeQuickRedirect6 = b.a;
                                        if (PatchProxy.isSupport(objArr6, bVar2, changeQuickRedirect6, false, "583ed945b20df3e70d57e29b6695d122", RobustBitConfig.DEFAULT_VALUE)) {
                                            sb = (String) PatchProxy.accessDispatch(objArr6, bVar2, changeQuickRedirect6, false, "583ed945b20df3e70d57e29b6695d122");
                                        } else {
                                            StringBuilder sb2 = new StringBuilder();
                                            int i4 = i3 / DaBaiBean.DABAI_DATA_EXPIRE_TIME;
                                            if (i4 > 0) {
                                                sb2.append(String.format("%02d:", Integer.valueOf(i4)));
                                            }
                                            int i5 = i3 % DaBaiBean.DABAI_DATA_EXPIRE_TIME;
                                            int i6 = i5 / 60;
                                            if (i6 > 0) {
                                                sb2.append(String.format("%02d:", Integer.valueOf(i6)));
                                            } else {
                                                sb2.append("00:");
                                            }
                                            sb2.append(String.format("%02d", Integer.valueOf(i5 % 60)));
                                            sb = sb2.toString();
                                        }
                                        textView2.setText(sb);
                                    }
                                }
                            });
                        }
                    }
                }
                b.this.d.postDelayed(this, 300L);
            }
        };
        this.c = textView;
        this.d = new a();
    }
}
