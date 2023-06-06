package com.meituan.android.legwork.common.share;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import com.dianping.titans.js.JsHandlerFactory;
import com.meituan.android.legwork.common.share.PtBaseShare;
import com.meituan.android.legwork.common.share.PtShareBean;
import com.meituan.android.legwork.ui.component.orderDetail.ShareChannelDialogFragment;
import com.meituan.android.legwork.utils.ab;
import com.meituan.android.legwork.utils.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class H5ShareReceiver extends BroadcastReceiver {
    public static ChangeQuickRedirect a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;

    public H5ShareReceiver() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e6961338863f909c1f83bd0f153aa99", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e6961338863f909c1f83bd0f153aa99");
            return;
        }
        this.b = "paotui_c:";
        this.c = "paotui_c:paotui_share";
        this.d = "paotui_c:paotui_share_callback";
        this.e = "miniProgram";
        this.f = "onlyImage";
        this.g = "data";
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Bundle extras;
        H5ShareBean h5ShareBean;
        Object[] objArr = {context, intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27ea32cb9790564ca528097cb64b6dd4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27ea32cb9790564ca528097cb64b6dd4");
        } else if (com.meituan.android.legwork.a.d == null || com.meituan.android.legwork.a.d.get() == null || intent == null) {
        } else {
            try {
                FragmentActivity fragmentActivity = (FragmentActivity) com.meituan.android.legwork.a.d.get();
                if (fragmentActivity == null || (extras = intent.getExtras()) == null) {
                    return;
                }
                String string = extras.getString("data");
                x.b("H5ShareReceiver.onReceive()", "share * " + string);
                try {
                    h5ShareBean = (H5ShareBean) com.meituan.android.legwork.net.util.b.a().fromJson(string, (Class<Object>) H5ShareBean.class);
                } catch (Exception e) {
                    x.e("H5ShareReceiver.onReceive()", "处理广播消息失败，exception msg:", e);
                    x.a(e);
                    h5ShareBean = null;
                }
                if (h5ShareBean == null || h5ShareBean.channel == null || h5ShareBean.channel.isEmpty()) {
                    return;
                }
                if (!e.a(context)) {
                    ab.a((int) R.string.legwork_share_no_wx);
                    return;
                }
                PtShareBean.a aVar = new PtShareBean.a(1);
                aVar.b = h5ShareBean.miniProgramTitle;
                aVar.e = h5ShareBean.miniProgramImage;
                aVar.d = h5ShareBean.miniProgramUrl;
                aVar.g = h5ShareBean.miniProgramId;
                aVar.f = h5ShareBean.miniProgramUrl;
                aVar.h = h5ShareBean.cid;
                PtShareBean a2 = aVar.a();
                PtShareBean.a aVar2 = new PtShareBean.a(2);
                aVar2.b = "";
                aVar2.c = "";
                aVar2.e = h5ShareBean.image;
                aVar2.d = "";
                aVar2.h = h5ShareBean.cid;
                PtShareBean a3 = aVar2.a();
                if (h5ShareBean.channel.size() > 1) {
                    ShareChannelDialogFragment a4 = ShareChannelDialogFragment.a(a2, a3, "invite");
                    a4.b = new ShareChannelDialogFragment.a() { // from class: com.meituan.android.legwork.common.share.H5ShareReceiver.1
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.android.legwork.ui.component.orderDetail.ShareChannelDialogFragment.a
                        public final void a(int i) {
                        }

                        @Override // com.meituan.android.legwork.ui.component.orderDetail.ShareChannelDialogFragment.a
                        public final void b(int i) {
                        }

                        @Override // com.meituan.android.legwork.ui.component.orderDetail.ShareChannelDialogFragment.a
                        public final void a(int i, int i2) {
                            Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b2019a7aaeded751e8f229f5c82c84aa", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b2019a7aaeded751e8f229f5c82c84aa");
                            } else {
                                H5ShareReceiver.this.a(i, i2);
                            }
                        }
                    };
                    try {
                        a4.show(fragmentActivity.getSupportFragmentManager(), "ShareDialogFragment");
                    } catch (Exception e2) {
                        x.b("H5ShareReceiver.register()", "showShareDialog fail!", e2);
                    }
                } else if ("miniProgram".equals(h5ShareBean.channel.get(0))) {
                    Object[] objArr2 = {this};
                    ChangeQuickRedirect changeQuickRedirect2 = a.a;
                    e.a(fragmentActivity, "invite", a2, PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "1ca8b0647a4073f0b8cd0542f8607390", RobustBitConfig.DEFAULT_VALUE) ? (PtBaseShare.OnShareListener) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "1ca8b0647a4073f0b8cd0542f8607390") : new a(this));
                } else {
                    Object[] objArr3 = {this};
                    ChangeQuickRedirect changeQuickRedirect3 = b.a;
                    e.a(fragmentActivity, "invite", a3, PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "366c064897b5d1543e90dfba812ee84e", RobustBitConfig.DEFAULT_VALUE) ? (PtBaseShare.OnShareListener) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "366c064897b5d1543e90dfba812ee84e") : new b(this));
                }
            } catch (Exception unused) {
            }
        }
    }

    public static /* synthetic */ void b(H5ShareReceiver h5ShareReceiver, int i, int i2) {
        Object[] objArr = {h5ShareReceiver, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8e1f7f4b20cf57602e34b0b82384d2c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8e1f7f4b20cf57602e34b0b82384d2c8");
        } else {
            h5ShareReceiver.a(i, i2);
        }
    }

    public static /* synthetic */ void a(H5ShareReceiver h5ShareReceiver, int i, int i2) {
        Object[] objArr = {h5ShareReceiver, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4dff0479b26b87240db0485163346d7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4dff0479b26b87240db0485163346d7c");
        } else {
            h5ShareReceiver.a(i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d00730149bac267c7c024d79bd9ee45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d00730149bac267c7c024d79bd9ee45");
            return;
        }
        x.b("H5ShareReceiver.sendShareResultBroadcast()", String.format("分享结果为%d %d", Integer.valueOf(i), Integer.valueOf(i2)));
        boolean z = i2 == 3;
        boolean z2 = i2 == 1 || z;
        String str = i == 2 ? "onlyImage" : "miniProgram";
        H5ShareResultBean h5ShareResultBean = new H5ShareResultBean();
        h5ShareResultBean.canceled = z;
        h5ShareResultBean.success = z2;
        if (i != 0) {
            h5ShareResultBean.sharedTo = new H5ShareChannel();
            h5ShareResultBean.sharedTo.channel = str;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            String json = com.meituan.android.legwork.net.util.b.a().toJson(h5ShareResultBean);
            jSONObject.put("action", "paotui_c:paotui_share_callback");
            jSONObject.put("result", json);
            JsHandlerFactory.publish(jSONObject);
            x.b("H5ShareReceiver.sendShareResultBroadcast()", String.format("发送%s广播, 结果为:%s", "paotui_c:paotui_share_callback", jSONObject.toString()));
        } catch (JSONException e) {
            x.b("H5ShareReceiver.sendShareResultBroadcast()", String.format("发送%s广播失败 json", "paotui_c:paotui_share"), e);
            x.a(e);
        } catch (Exception e2) {
            x.b("H5ShareReceiver.sendShareResultBroadcast()", String.format("发送%s广播失败 knb", "paotui_c:paotui_share"), e2);
            x.a(e2);
        }
    }
}
