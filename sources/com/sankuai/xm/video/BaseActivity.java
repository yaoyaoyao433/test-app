package com.sankuai.xm.video;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.SparseArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class BaseActivity extends FragmentActivity {
    public static ChangeQuickRedirect a;
    private SparseArray<a> b;
    private Handler c;

    public void b(int i) {
    }

    public BaseActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5dc9f4876c8fe228cb30f661f471efbb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5dc9f4876c8fe228cb30f661f471efbb");
            return;
        }
        this.b = new SparseArray<>();
        this.c = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    @SuppressLint({"NewApi"})
    public void onCreate(Bundle bundle) {
        char c;
        int i;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec0533e4d6aaeabde96bdf309bc46130", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec0533e4d6aaeabde96bdf309bc46130");
            return;
        }
        super.onCreate(bundle);
        String name = getClass().getName();
        Object[] objArr2 = {name};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (!PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "1453c80157b87c8ee353161360231cee", 6917529027641081856L)) {
            String str = TextUtils.isEmpty(name) ? "" : name;
            switch (str.hashCode()) {
                case -2052529130:
                    if (str.equals("com.sankuai.xm.imui.preview.PreviewImgActivity")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                case -1280465549:
                    if (str.equals("com.sankuai.xm.imui.imagepick.ImagePickActivity")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case -867265784:
                    if (str.equals("com.sankuai.xm.ui.activity.FileDownloadActivity")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -535647266:
                    if (str.equals("com.sankuai.xm.ui.activity.LinkActivity")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -214085369:
                    if (str.equals("com.sankuai.xm.imui.session.SessionActivity")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -183556237:
                    if (str.equals("com.sankuai.xm.ui.activity.WebViewActivity")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case -87558301:
                    if (str.equals("SessionListActivity")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 382981907:
                    if (str.equals("com.sankuai.xm.video.PlayVideoActivity")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case 697897122:
                    if (str.equals("com.sankuai.xm.ui.activity.CalendarActivity")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 721911671:
                    if (str.equals("com.sankuai.xm.imui.calendar.CalendarActivity")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 813258677:
                    if (str.equals("com.sankuai.xm.imui.common.activity.FileDownloadActivity")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 830804438:
                    if (str.equals("com.sankuai.xm.video.RecordVideoActivity")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case 1029532326:
                    if (str.equals("com.sankuai.xm.imui.common.activity.WebViewActivity")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case 1158341859:
                    if (str.equals("com.sankuai.xm.ui.session.SessionActivity")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1984916875:
                    if (str.equals("com.sankuai.xm.imui.common.activity.LinkActivity")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 2056645455:
                    if (str.equals("com.sankuai.xm.ui.imagepick.ImagePickActivity")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                    i = 0;
                    break;
                case 2:
                case 3:
                    i = 1;
                    break;
                case 4:
                case 5:
                    i = 2;
                    break;
                case 6:
                    i = 3;
                    break;
                case 7:
                case '\b':
                    i = 8;
                    break;
                case '\t':
                case '\n':
                    i = 5;
                    break;
                case 11:
                    i = 7;
                    break;
                case '\f':
                    i = 9;
                    break;
                case '\r':
                case 14:
                    i = 6;
                    break;
                case 15:
                    i = 4;
                    break;
                default:
                    i = -1;
                    break;
            }
        } else {
            i = ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "1453c80157b87c8ee353161360231cee")).intValue();
        }
        Object[] objArr3 = {Integer.valueOf(i), name};
        ChangeQuickRedirect changeQuickRedirect3 = e.a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "ca6d043c021b20f4258d7b5887bf56c3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "ca6d043c021b20f4258d7b5887bf56c3");
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("id", Integer.valueOf(i));
            if (i == -1) {
                hashMap.put("name", name);
            }
            com.sankuai.xm.monitor.c.a("ui_active", hashMap);
        }
        com.sankuai.xm.log.c.b("ui_active", "%s::onCreate::%s %s", name, Integer.valueOf(i), name);
        this.c = new Handler();
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c0622ff4b2974bb75d9f55d7c06c65e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c0622ff4b2974bb75d9f55d7c06c65e");
        } else {
            super.attachBaseContext(com.sankuai.xm.base.util.locale.a.a(context, com.sankuai.xm.base.util.locale.b.a(context).a()));
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b0c4abb68594a788f1239c831cbe9ef", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b0c4abb68594a788f1239c831cbe9ef");
        } else {
            super.onStart();
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bdbc84b4ea64bed628b88f5bcbda4c8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bdbc84b4ea64bed628b88f5bcbda4c8");
        } else {
            super.onResume();
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e51da579b40b2451acd0dc5a073183cb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e51da579b40b2451acd0dc5a073183cb");
        } else {
            super.onStop();
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6673e7456eb0deb3ae1968e43d7688b1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6673e7456eb0deb3ae1968e43d7688b1");
        } else {
            super.onPause();
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b5d40dda9777be0c1e3cd06dc66e194", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b5d40dda9777be0c1e3cd06dc66e194");
            return;
        }
        super.onDestroy();
        this.c.removeCallbacksAndMessages(null);
    }

    public final void a(int i, int i2, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0543ec2f7d5a7713f703857a936bbdb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0543ec2f7d5a7713f703857a936bbdb");
        } else if (this.b.get(i) != null) {
        } else {
            a aVar = new a(this, i, i2, true);
            if (this.c != null) {
                this.c.postDelayed(aVar, i2);
            }
            this.b.put(i, aVar);
        }
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d29a9f0adf8815f2bcfb24903690d55", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d29a9f0adf8815f2bcfb24903690d55");
            return;
        }
        a aVar = this.b.get(i);
        if (aVar != null) {
            aVar.cancel();
        }
        this.b.remove(i);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class a implements Runnable {
        public static ChangeQuickRedirect a;
        private BaseActivity c;
        private int d;
        private int e;
        private boolean f;
        private boolean g;

        public a(BaseActivity baseActivity, int i, int i2, boolean z) {
            Object[] objArr = {BaseActivity.this, baseActivity, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1558df03b760b2ee0b5e9ac143814836", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1558df03b760b2ee0b5e9ac143814836");
                return;
            }
            this.c = null;
            this.d = 0;
            this.e = 0;
            this.f = false;
            this.g = false;
            this.c = baseActivity;
            this.d = i;
            this.e = i2;
            this.f = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "948d8e6d87326305ec956d9fe8badaba", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "948d8e6d87326305ec956d9fe8badaba");
            } else if (this.g) {
            } else {
                this.c.b(this.d);
                if (!this.f || this.c.c == null) {
                    return;
                }
                this.c.c.postDelayed(this, this.e);
            }
        }

        public final void cancel() {
            this.g = true;
        }
    }
}
