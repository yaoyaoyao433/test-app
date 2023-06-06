package com.sankuai.meituan.takeoutnew.wxapi;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.ui.page.boot.WelcomeActivity;
import com.sankuai.meituan.takeoutnew.util.b;
import com.sankuai.waimai.foundation.utils.log.a;
import com.sankuai.waimai.kit.share.ShareConstant;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.modelmsg.SendAuth;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX;
import com.tencent.mm.opensdk.modelmsg.ShowMessageFromWX;
import com.tencent.mm.opensdk.modelmsg.WXAppExtendObject;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.IWXAPIEventHandler;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WXEntryActivity extends AppCompatActivity implements IWXAPIEventHandler {
    public static ChangeQuickRedirect a;
    private IWXAPI b;

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd553731396c05ded9f18dc43f7364b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd553731396c05ded9f18dc43f7364b6");
            return;
        }
        super.onCreate(bundle);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.a(false);
        }
        this.b = WXAPIFactory.createWXAPI(this, ShareConstant.a, false);
        a(getIntent());
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffb8ac90f565c6566a511c1eb377f05b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffb8ac90f565c6566a511c1eb377f05b");
            return;
        }
        super.onNewIntent(intent);
        setIntent(intent);
        a(intent);
    }

    private void a(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64da145e5f6fe9a3aac849b2bfada585", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64da145e5f6fe9a3aac849b2bfada585");
            return;
        }
        try {
            String simpleName = getClass().getSimpleName();
            a.b(simpleName, "handleIntent() " + String.valueOf(intent), new Object[0]);
            if (this.b.handleIntent(intent, this)) {
                return;
            }
            a.b(getClass().getSimpleName(), "intent not handled, finish", new Object[0]);
            finish();
        } catch (Exception e) {
            String simpleName2 = getClass().getSimpleName();
            a.e(simpleName2, e.getLocalizedMessage(), new Object[0]);
        }
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
    public void onReq(BaseReq baseReq) {
        Object[] objArr = {baseReq};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da823fcb3471c90d5180e5edff0191f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da823fcb3471c90d5180e5edff0191f8");
            return;
        }
        String simpleName = getClass().getSimpleName();
        a.b(simpleName, "onReq " + String.valueOf(baseReq), new Object[0]);
        if (baseReq instanceof ShowMessageFromWX.Req) {
            ShowMessageFromWX.Req req = (ShowMessageFromWX.Req) baseReq;
            if (req.message != null) {
                String str = req.message.mediaObject instanceof WXAppExtendObject ? ((WXAppExtendObject) req.message.mediaObject).extInfo : "";
                if (TextUtils.isEmpty(str)) {
                    str = req.message.messageExt;
                }
                if (com.sankuai.waimai.foundation.router.a.a(req.message.messageExt)) {
                    if (str == null) {
                        str = "";
                    }
                    Intent intent = new Intent(this, WelcomeActivity.class);
                    intent.setData(b.a(Uri.parse(str)));
                    intent.putExtra("com.sankuai.waimai.router.from", 1);
                    intent.putExtra("extra_from_wx", true);
                    startActivity(intent);
                }
            }
        }
        finish();
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
    public void onResp(BaseResp baseResp) {
        Object[] objArr = {baseResp};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17972dd150bdaaffcf6889ee7a623e32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17972dd150bdaaffcf6889ee7a623e32");
            return;
        }
        String simpleName = getClass().getSimpleName();
        a.b(simpleName, "onResp " + String.valueOf(baseResp), new Object[0]);
        if (baseResp instanceof SendAuth.Resp) {
            SendAuth.Resp resp = (SendAuth.Resp) baseResp;
            Intent intent = new Intent();
            intent.setAction("weixinshare");
            intent.putExtra("code", resp.code);
            intent.putExtra("result", resp.errCode);
            sendBroadcast(intent);
        } else if (baseResp instanceof SendMessageToWX.Resp) {
            Intent intent2 = new Intent();
            intent2.setAction("wx_share");
            intent2.putExtra("wx_result", baseResp.errCode);
            sendBroadcast(intent2);
        }
        finish();
    }
}
