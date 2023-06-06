package com.sankuai.waimai.store.im.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import com.meituan.passport.UserCenter;
import com.meituan.passport.pojo.User;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.al;
import com.sankuai.xm.im.message.bean.EventMessage;
import com.sankuai.xm.imui.IMUIManager;
import com.sankuai.xm.imui.common.adapter.IBannerAdapter;
import com.sankuai.xm.imui.common.panel.adapter.ISendPanelAdapter;
import com.sankuai.xm.imui.common.view.titlebar.TitleBarAdapter;
import com.sankuai.xm.imui.session.view.adapter.IMsgViewAdapter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class e implements com.sankuai.waimai.store.im.base.i.a {
    public static ChangeQuickRedirect a;
    public SGIMSessionFragment b;
    protected Context c;
    public final Bundle d;
    private String e;

    @Override // com.sankuai.waimai.store.im.base.i.a
    public void a(int i, String str, List<com.sankuai.xm.imui.session.entity.b> list, int i2, boolean z) {
    }

    @Override // com.sankuai.waimai.store.im.base.i.b
    public void a(@NonNull View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d4e7f210d739c75d3423761ed60c25c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d4e7f210d739c75d3423761ed60c25c");
        }
    }

    @Override // com.sankuai.waimai.store.im.base.i.a
    public void a(List<com.sankuai.xm.imui.session.entity.b> list) {
    }

    @Override // com.sankuai.waimai.store.im.base.i.b
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31914dfd91b5cb3022b1739d5862eba2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31914dfd91b5cb3022b1739d5862eba2");
        }
    }

    @Override // com.sankuai.waimai.store.im.base.i.b
    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2892cdd62020bf9ed8d2007bf7cd547", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2892cdd62020bf9ed8d2007bf7cd547");
        }
    }

    @Override // com.sankuai.waimai.store.im.base.i.b
    public void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05fd3929b962e84f46c7487d059a8334", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05fd3929b962e84f46c7487d059a8334");
        }
    }

    @Override // com.sankuai.waimai.store.im.base.i.a
    public TitleBarAdapter f() {
        return null;
    }

    @Override // com.sankuai.waimai.store.im.base.i.a
    public IBannerAdapter g() {
        return null;
    }

    @Override // com.sankuai.waimai.store.im.base.i.a
    public IMsgViewAdapter j() {
        return null;
    }

    @Override // com.sankuai.waimai.store.im.base.i.a
    public ISendPanelAdapter l() {
        return null;
    }

    public e(SGIMSessionFragment sGIMSessionFragment, Bundle bundle) {
        Object[] objArr = {sGIMSessionFragment, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4dfd2125dae83f89ad318e440cdc353", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4dfd2125dae83f89ad318e440cdc353");
            return;
        }
        this.d = new Bundle();
        this.b = sGIMSessionFragment;
        this.d.clear();
        if (bundle != null) {
            this.d.putAll(bundle);
        }
    }

    @Override // com.sankuai.waimai.store.im.base.i.b
    public void a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a834097b9788ba400f8a2ab61beb5b3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a834097b9788ba400f8a2ab61beb5b3f");
        } else if (this.b == null) {
        } else {
            this.c = this.b.getContext();
        }
    }

    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4e21d00b523fcf201a198fb9f104296", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4e21d00b523fcf201a198fb9f104296");
        }
        if (!TextUtils.isEmpty(this.e)) {
            return this.e;
        }
        this.e = getClass().getSimpleName() + System.currentTimeMillis();
        return this.e;
    }

    @Override // com.sankuai.waimai.store.im.base.i.b
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "372327dba47b89faaa973d3ab327a73d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "372327dba47b89faaa973d3ab327a73d");
            return;
        }
        al.cancel(a());
        com.sankuai.waimai.store.base.net.c.a(a());
    }

    @Override // com.sankuai.waimai.store.im.base.i.a
    public boolean a(int i, com.sankuai.xm.imui.session.entity.b bVar) {
        Object[] objArr = {Integer.valueOf(i), bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fdcbab527954ae5555df47068439b8f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fdcbab527954ae5555df47068439b8f")).booleanValue();
        }
        if (i == 988) {
            Context context = this.c;
            Object[] objArr2 = {context};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.im.util.b.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "0b7f8d76ee8378f3368ab6ee70ac96a4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "0b7f8d76ee8378f3368ab6ee70ac96a4");
            } else {
                EventMessage b = com.sankuai.xm.imui.common.util.c.b(context.getResources().getString(R.string.wm_sg_im_send_message_result_failed_tip));
                b.setChatId(com.sankuai.xm.imui.b.a().d());
                b.setCategory(com.sankuai.xm.imui.b.a().e());
                b.setPeerUid(com.sankuai.xm.imui.b.a().f().c);
                b.setToUid(com.sankuai.xm.imui.b.a().d());
                b.setToAppId(com.sankuai.xm.imui.b.a().g());
                b.setPeerAppId(com.sankuai.xm.imui.b.a().g());
                b.setMsgStatus(9);
                b.setSts(com.meituan.android.time.c.b());
                b.setChannel(com.sankuai.xm.imui.b.a().f().g);
                IMUIManager.a().a(b, false, null);
            }
        }
        return false;
    }

    @Override // com.sankuai.waimai.store.im.base.i.a
    public boolean a(com.sankuai.xm.imui.session.entity.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e8b805f912798e85ec29cfd13c214f4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e8b805f912798e85ec29cfd13c214f4")).booleanValue();
        }
        if (bVar != null && bVar.b != 0) {
            Map<String, Object> hashMap = new HashMap<>();
            Object[] objArr2 = {hashMap};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.im.util.b.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "2194770dabd712e92c37c391bc08b548", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "2194770dabd712e92c37c391bc08b548");
            } else {
                hashMap.put("version", com.sankuai.waimai.platform.b.A().i());
                hashMap.put("uuid", com.sankuai.waimai.platform.b.A().c());
                hashMap.put("cType", "android");
                if (com.sankuai.waimai.store.im.util.b.b == null) {
                    com.sankuai.waimai.store.im.util.b.b = com.sankuai.waimai.business.im.utils.b.a();
                }
                hashMap.put("finger_info", com.sankuai.waimai.store.im.util.b.b);
                User user = UserCenter.getInstance(com.meituan.android.singleton.b.a).getUser();
                if (user != null) {
                    hashMap.put("c_name", user.username);
                    hashMap.put("c_avatar_url", user.avatarurl == null ? "" : user.avatarurl);
                }
            }
            bVar.b.appendExtension(hashMap);
        }
        return false;
    }
}
