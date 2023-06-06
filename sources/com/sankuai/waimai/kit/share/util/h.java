package com.sankuai.waimai.kit.share.util;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.os.AsyncTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.kit.share.bean.ShareBean;
import com.sankuai.waimai.kit.share.bean.WeixinBean;
import com.sankuai.waimai.kit.share.listener.b;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class h extends AsyncTask<Void, Void, byte[]> {
    public static ChangeQuickRedirect a;
    private Bitmap b;
    private ShareBean c;
    private com.sankuai.waimai.kit.share.listener.b d;
    private WeakReference<Activity> e;
    private Dialog f;

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(byte[] bArr) {
        Activity activity;
        byte[] bArr2 = bArr;
        Object[] objArr = {bArr2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2cdba62bc45e72007bf672e5565ff4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2cdba62bc45e72007bf672e5565ff4f");
        } else if (this.e == null || (activity = this.e.get()) == null || activity.isFinishing()) {
        } else {
            if (this.f != null && this.f.isShowing()) {
                this.f.dismiss();
            }
            Object[] objArr2 = {activity, bArr2};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c49d25523792fb72f2f72d8176906acb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c49d25523792fb72f2f72d8176906acb");
                return;
            }
            if (this.c == null && this.d != null) {
                this.d.a(null, b.a.FAILED);
            }
            WeixinBean weixinBean = WeixinBean.getWeixinBean(this.c);
            weixinBean.setType(weixinBean.getChannel() != 4 ? 0 : 1);
            weixinBean.setImageData(bArr2, null);
            new com.sankuai.waimai.kit.share.b(activity).a(weixinBean, this.d);
        }
    }

    public h(Activity activity, ShareBean shareBean, Bitmap bitmap, com.sankuai.waimai.kit.share.listener.b bVar) {
        Object[] objArr = {activity, shareBean, bitmap, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89672a633e3c6e37672010b764e15bfe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89672a633e3c6e37672010b764e15bfe");
            return;
        }
        this.c = shareBean;
        this.b = bitmap;
        this.d = bVar;
        this.e = new WeakReference<>(activity);
        this.f = com.sankuai.waimai.kit.share.dialog.a.a(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public byte[] doInBackground(Void... voidArr) {
        byte[] bArr;
        Object[] objArr = {voidArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8456cec7e4b2a5fa9376aae3566ae60c", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8456cec7e4b2a5fa9376aae3566ae60c");
        }
        if (this.b != null) {
            try {
                a.a(this.b);
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    this.b.compress(Bitmap.CompressFormat.JPEG, 85, byteArrayOutputStream);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    try {
                        if (byteArray.length > 131072) {
                            byteArrayOutputStream.reset();
                            float length = (byteArray.length * 1.0f) / 40000.0f;
                            this.b = ThumbnailUtils.extractThumbnail(this.b, (int) (this.b.getWidth() / length), (int) (this.b.getHeight() / length), 2);
                            this.b.compress(Bitmap.CompressFormat.JPEG, 85, byteArrayOutputStream);
                            byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                            this.b = null;
                            return byteArray2;
                        }
                    } catch (Throwable unused) {
                    }
                    return byteArray;
                } catch (Throwable unused2) {
                    return bArr;
                }
            } catch (Throwable unused3) {
                return null;
            }
        }
        return null;
    }
}
