package com.meituan.android.customerservice.kit.floating;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import com.meituan.android.customerservice.kit.utils.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class DrawOverPermissionActivity extends AppCompatActivity {
    public static ChangeQuickRedirect a;
    private static c b;
    private Handler c;

    public DrawOverPermissionActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "acce92368903ced856d33137f8629ea1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "acce92368903ced856d33137f8629ea1");
        } else {
            this.c = new Handler(Looper.getMainLooper()) { // from class: com.meituan.android.customerservice.kit.floating.DrawOverPermissionActivity.1
                public static ChangeQuickRedirect a;

                @Override // android.os.Handler
                public final void handleMessage(Message message) {
                    Object[] objArr2 = {message};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bb73533cc3d0af840ca5144461526f70", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bb73533cc3d0af840ca5144461526f70");
                        return;
                    }
                    if (message.what == 17 && DrawOverPermissionActivity.b != null) {
                        if (h.a(DrawOverPermissionActivity.this)) {
                            DrawOverPermissionActivity.b.a();
                        } else {
                            DrawOverPermissionActivity.b.b();
                        }
                    }
                    DrawOverPermissionActivity.this.finish();
                }
            };
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc2ab2be72ef3e3ffd024ee02613a834", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc2ab2be72ef3e3ffd024ee02613a834");
            return;
        }
        this.c.removeMessages(17);
        this.c = null;
        super.onDestroy();
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x019c, code lost:
        if (com.meituan.android.customerservice.kit.utils.h.a(r21, r0) != false) goto L36;
     */
    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(@android.support.annotation.Nullable android.os.Bundle r22) {
        /*
            Method dump skipped, instructions count: 978
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.customerservice.kit.floating.DrawOverPermissionActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4dc0f40f772fb2db81a830a1a8ef3d59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4dc0f40f772fb2db81a830a1a8ef3d59");
            return;
        }
        com.meituan.android.privacy.aop.a.a();
        super.onActivityResult(i, i2, intent);
        if (b != null) {
            if (h.a(this)) {
                b.a();
            } else {
                this.c.sendMessageDelayed(this.c.obtainMessage(17), 500L);
                com.meituan.android.privacy.aop.a.b();
            }
        }
        finish();
        com.meituan.android.privacy.aop.a.b();
    }

    public static void a(c cVar) {
        b = cVar;
    }
}
