package com.sankuai.meituan.takeoutnew.provider.screenshot;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.kit.share.b;
import com.sankuai.waimai.kit.share.bean.ShareBean;
import com.sankuai.waimai.kit.share.bean.WeixinBean;
import com.sankuai.waimai.platform.utils.e;
import com.tencent.mapsdk.internal.jw;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements com.sankuai.waimai.kit.share.listener.a {
    public static ChangeQuickRedirect a;
    @SuppressLint({"StaticFieldLeak"})
    public static a f;
    Activity b;
    AsyncTaskC0650a c;
    b d;
    public String e;
    private final short g;
    private String h;
    private Context i;
    private String[] j;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c73bf39366649fc7dea9aff16d9a514a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c73bf39366649fc7dea9aff16d9a514a");
            return;
        }
        this.g = (short) 14;
        this.j = new String[]{"com.sankuai.waimai.business.restaurant.poicontainer.WMRestaurantActivity", "com.sankuai.waimai.store.goods.list.SCSuperMarketActivity"};
        this.i = com.meituan.android.singleton.b.a;
    }

    @Override // com.sankuai.waimai.kit.share.listener.a
    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0fbfcd695ac9c6ea0b22c5ccce270a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0fbfcd695ac9c6ea0b22c5ccce270a7");
            return;
        }
        this.c = new AsyncTaskC0650a(this.h, i2);
        com.sankuai.waimai.launcher.util.aop.b.a(this.c, new Void[0]);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.meituan.takeoutnew.provider.screenshot.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    class AsyncTaskC0650a extends AsyncTask<Void, Void, Boolean> {
        public static ChangeQuickRedirect a;
        private byte[] c;
        private byte[] d;
        private String e;
        private int f;

        @Override // android.os.AsyncTask
        public final /* synthetic */ void onPostExecute(Boolean bool) {
            Boolean bool2 = bool;
            Object[] objArr = {bool2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "907625a1440bf6fa94257c19dc150f9f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "907625a1440bf6fa94257c19dc150f9f");
                return;
            }
            a.this.c = null;
            if (!bool2.booleanValue()) {
                ae.a(a.this.b, a.this.b.getString(R.string.wm_main_share_failed));
                return;
            }
            int i = this.f;
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f791b06cf5e577aa708dc8a16c8532ed", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f791b06cf5e577aa708dc8a16c8532ed");
            } else if (i == 4) {
                WeixinBean weixinBean = new WeixinBean();
                weixinBean.setType(1);
                weixinBean.setImagePath(this.e);
                this.c = null;
                a.this.d.a(weixinBean, (com.sankuai.waimai.kit.share.listener.b) null);
            } else if (i == 2) {
                WeixinBean weixinBean2 = new WeixinBean();
                weixinBean2.setType(0);
                weixinBean2.setImagePath(this.e);
                this.c = null;
                a.this.d.a(weixinBean2, (com.sankuai.waimai.kit.share.listener.b) null);
            } else if (i == 8) {
                ShareBean shareBean = new ShareBean();
                shareBean.setLocalImage(true);
                shareBean.setImagePath(this.e);
                a.this.d.a(shareBean, (com.sankuai.waimai.kit.share.listener.b) null);
            }
        }

        public AsyncTaskC0650a(String str, int i) {
            Object[] objArr = {a.this, str, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c4fa927b66f0f14d0724b25890683ef", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c4fa927b66f0f14d0724b25890683ef");
                return;
            }
            this.e = str;
            this.f = i;
        }

        @Override // android.os.AsyncTask
        public final void onPreExecute() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf972913436197c610edc95549366ba8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf972913436197c610edc95549366ba8");
            } else {
                super.onPreExecute();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public Boolean doInBackground(Void... voidArr) {
            Object[] objArr = {voidArr};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27c94b031c9be309838dcdb2bb59c6e0", RobustBitConfig.DEFAULT_VALUE)) {
                return (Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27c94b031c9be309838dcdb2bb59c6e0");
            }
            try {
                this.d = e.a(this.e, (int) jw.h, (int) jw.h);
                this.c = this.d;
                return Boolean.TRUE;
            } catch (Throwable unused) {
                return Boolean.FALSE;
            }
        }
    }
}
