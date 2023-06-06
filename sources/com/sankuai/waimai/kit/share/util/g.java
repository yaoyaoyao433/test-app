package com.sankuai.waimai.kit.share.util;

import android.app.Activity;
import android.app.Dialog;
import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.kit.share.bean.WeixinBean;
import com.sankuai.waimai.kit.share.listener.b;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class g extends AsyncTask<Void, Void, Integer> {
    public static ChangeQuickRedirect a;
    private byte[] b;
    private byte[] c;
    private Bitmap d;
    private int e;
    private int f;
    private String g;
    private com.sankuai.waimai.kit.share.listener.b h;
    private WeakReference<Activity> i;
    private Dialog j;

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Integer num) {
        Activity activity;
        Integer num2 = num;
        Object[] objArr = {num2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e1338ec3d6e080b7763899de16fd6b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e1338ec3d6e080b7763899de16fd6b5");
        } else if (this.i == null || (activity = this.i.get()) == null || activity.isFinishing()) {
        } else {
            if (this.j != null && this.j.isShowing()) {
                this.j.dismiss();
            }
            switch (num2.intValue()) {
                case 0:
                    byte[] bArr = this.b;
                    byte[] bArr2 = this.c;
                    int i = this.e;
                    Object[] objArr2 = {activity, bArr, bArr2, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "49f6bf57152cdb9696f0dbed4f580c99", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "49f6bf57152cdb9696f0dbed4f580c99");
                        return;
                    } else if (i == 4 || i == 2) {
                        WeixinBean weixinBean = new WeixinBean();
                        weixinBean.setType(i == 4 ? 1 : 0);
                        weixinBean.setImageData(bArr, bArr2);
                        weixinBean.setSourceId(this.f);
                        new com.sankuai.waimai.kit.share.b(activity).a(weixinBean, this.h);
                        return;
                    } else {
                        return;
                    }
                case 1:
                    String str = this.g;
                    int i2 = this.e;
                    Object[] objArr3 = {activity, str, Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4e0a2441fbfecfe9332414ead1867a56", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4e0a2441fbfecfe9332414ead1867a56");
                        return;
                    } else if (i2 == 4) {
                        WeixinBean weixinBean2 = new WeixinBean();
                        weixinBean2.setType(1);
                        weixinBean2.setImagePath(str);
                        weixinBean2.setSourceId(this.f);
                        new com.sankuai.waimai.kit.share.b(activity).a(weixinBean2, this.h);
                        return;
                    } else if (i2 == 2) {
                        Intent intent = new Intent();
                        intent.setComponent(new ComponentName("com.tencent.mm", "com.tencent.mm.ui.tools.ShareImgUI"));
                        intent.setAction("android.intent.action.SEND");
                        intent.setType("image/*");
                        intent.putExtra("android.intent.extra.STREAM", Uri.parse("file:///" + str));
                        activity.startActivity(intent);
                        return;
                    } else {
                        return;
                    }
                case 2:
                    WeixinBean weixinBean3 = new WeixinBean();
                    weixinBean3.setChannel(this.e);
                    weixinBean3.setImagePath(this.g);
                    weixinBean3.setSourceId(this.f);
                    weixinBean3.setImageData(this.b, this.c);
                    if (this.h != null) {
                        this.h.a(weixinBean3, b.a.FAILED);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public g(Activity activity, int i, int i2, Bitmap bitmap, com.sankuai.waimai.kit.share.listener.b bVar) {
        Object[] objArr = {activity, Integer.valueOf(i), Integer.valueOf(i2), bitmap, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aaeb009743743dc07a1fee34ae28ef74", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aaeb009743743dc07a1fee34ae28ef74");
            return;
        }
        this.e = i;
        this.f = i2;
        this.d = bitmap;
        this.h = bVar;
        this.i = new WeakReference<>(activity);
        this.j = com.sankuai.waimai.kit.share.dialog.a.a(activity);
    }

    public g(Activity activity, int i, String str, com.sankuai.waimai.kit.share.listener.b bVar) {
        Object[] objArr = {activity, Integer.valueOf(i), str, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd6fa18741f3b095c06b736c3a776319", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd6fa18741f3b095c06b736c3a776319");
            return;
        }
        this.g = str;
        this.e = i;
        this.h = bVar;
        this.i = new WeakReference<>(activity);
        this.j = com.sankuai.waimai.kit.share.dialog.a.a(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public Integer doInBackground(Void... voidArr) {
        int i = 1;
        int i2 = 0;
        Object[] objArr = {voidArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e95b6364b3167e750fa13abfe1886d7d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e95b6364b3167e750fa13abfe1886d7d");
        }
        try {
            if (TextUtils.isEmpty(this.g) || this.d != null) {
                Bitmap a2 = a.a(this.d, 32768.0d);
                Bitmap a3 = a.a(this.d, 419430.4d);
                this.b = a.a(a3);
                this.c = a.a(a2);
                i2 = (this.b == null || this.c == null) ? 2 : 2;
                this.d = null;
                a3.recycle();
                a2.recycle();
                i = i2;
            }
            return Integer.valueOf(i);
        } catch (Throwable unused) {
            return 2;
        }
    }
}
