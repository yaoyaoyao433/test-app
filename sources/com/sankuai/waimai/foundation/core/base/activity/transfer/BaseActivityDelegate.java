package com.sankuai.waimai.foundation.core.base.activity.transfer;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class BaseActivityDelegate extends a {
    public static ChangeQuickRedirect g;
    public TransferActivity h;

    @Override // com.sankuai.waimai.foundation.core.base.net.a
    public final void a(int i, String str) {
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.transfer.lifecycle.a
    public void a(TransferActivity transferActivity) {
        Object[] objArr = {transferActivity};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "003f87b45b8cd87b952276d8b55cefa9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "003f87b45b8cd87b952276d8b55cefa9");
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.transfer.lifecycle.a
    public void a(TransferActivity transferActivity, int i, int i2, Intent intent) {
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.transfer.lifecycle.a
    public void a(TransferActivity transferActivity, Intent intent) {
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.transfer.lifecycle.a
    public void a(TransferActivity transferActivity, @Nullable Bundle bundle) {
        Object[] objArr = {transferActivity, bundle};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8321fd34546c9dd5e113a1508b65a57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8321fd34546c9dd5e113a1508b65a57");
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.net.a
    public final void a(JSONObject jSONObject) {
    }

    public boolean aG_() {
        return false;
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.transfer.lifecycle.a
    public void b(TransferActivity transferActivity) {
        Object[] objArr = {transferActivity};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f66063cd6286002041fcdc708e78f332", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f66063cd6286002041fcdc708e78f332");
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.transfer.lifecycle.a
    public void b(TransferActivity transferActivity, @Nullable Bundle bundle) {
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.transfer.lifecycle.a
    public void c(TransferActivity transferActivity) {
        Object[] objArr = {transferActivity};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97b6bc2bb07cb0491f677a8bc57e4f31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97b6bc2bb07cb0491f677a8bc57e4f31");
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.transfer.lifecycle.a
    public void d(TransferActivity transferActivity) {
        Object[] objArr = {transferActivity};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "616db88ba6ca17c786f8d49d7b8d41ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "616db88ba6ca17c786f8d49d7b8d41ec");
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.transfer.lifecycle.a
    public void e() {
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.transfer.lifecycle.a
    public final void e(TransferActivity transferActivity) {
        Object[] objArr = {transferActivity};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a449b4543810b19cdde42941db51f4c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a449b4543810b19cdde42941db51f4c8");
        }
    }

    public void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "978c520eca6c75ff63cd5774fead2e1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "978c520eca6c75ff63cd5774fead2e1d");
        } else {
            this.h.d();
        }
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f089ae3d5dbd3ba97fa673ead8a86c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f089ae3d5dbd3ba97fa673ead8a86c4");
        } else {
            this.h.b();
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7018929af4744287a0c612335fe01bb8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7018929af4744287a0c612335fe01bb8");
        } else {
            this.h.b_(str);
        }
    }

    public final String k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96fadc5a845527f2127d0911c3de0573", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96fadc5a845527f2127d0911c3de0573") : this.h.w();
    }
}
